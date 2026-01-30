
import { ISocket } from './ISocket';
import { Message } from './Message';
import { Controller } from '../server/Controller';
import { Logger } from '../utils/Logger';
import { Player } from '../models/Player';

export class Session {
    public id: number = 0;
    public socket: ISocket;
    public connected: boolean = false;
    public sendKeyComplete: boolean = false;
    public userId: number = 0;
    public player: Player | null = null;
    public isAdmin: boolean = false;

    // Protocol state
    private buffer: Buffer = Buffer.alloc(0);
    public typeClient: number = 0;
    public zoomLevel: number = 0;
    public version: number = 0;

    // Encryption
    private keys: Buffer = Buffer.alloc(0);
    private curR: number = 0;
    private curW: number = 0;

    constructor(socket: ISocket) {
        this.socket = socket;
        this.connected = true;
        this.init();
    }

    public init(): void {
        this.socket.on('data', (data: Buffer) => this.onData(data));
        this.socket.on('close', () => this.onClose());
        this.socket.on('error', (err) => this.onError(err));

        // Logic: Wait for Client to send CMD -27 first, matched with Controller.ts
    }

    public sendSessionKey(): void {
        const msg = new Message(-27);
        // Using a simple 1-byte key {0} to match Java KEYS = {0}
        const keys = Buffer.from([0]); // Java KEYS = {0}
        msg.writer.writeByte(keys.length);
        msg.writer.writeByte(keys[0]);
        for (let i = 1; i < keys.length; i++) {
            msg.writer.writeByte(keys[i] ^ keys[i - 1]);
        }

        // Extra fields expected by SessionReceiver.java
        msg.writer.writeUTF("127.0.0.1"); // GameMidlet.c (IP) - Default to localhost for testing
        msg.writer.writeInt(14445);       // GameMidlet.d (Port)
        msg.writer.writeByte(0);          // GameMidlet.g (Boolean flag)

        // Handshake message is NOT encrypted
        this.doSendMessage(msg, false);

        this.keys = keys;
        this.sendKeyComplete = true;
    }

    public sendMessage(msg: Message): void {
        this.doSendMessage(msg, this.sendKeyComplete);
    }

    private doSendMessage(msg: Message, encrypt: boolean): void {
        if (!this.connected) return;
        try {
            const data = msg.getData();
            const cmd = msg.getCommand();

            let cmdByte = cmd;
            if (encrypt && this.keys.length > 0) {
                cmdByte = this.encrypt(cmd);
            }

            const cmdBuf = Buffer.alloc(1);
            cmdBuf[0] = cmdByte & 0xFF;

            let lenBuf: Buffer;
            const size = data.length;

            // Special 3-byte size commands from SessionReceiver.java
            const specialCmds = [-32, -66, 11, -67, -74, -87, 66, 12];
            if (specialCmds.includes(cmd)) {
                lenBuf = Buffer.alloc(3);
                const s1 = (size & 0xFF) - 128;
                const s2 = ((size >> 8) & 0xFF) - 128;
                const s3 = ((size >> 16) & 0xFF) - 128;
                if (encrypt) {
                    lenBuf[0] = this.encrypt(s1);
                    lenBuf[1] = this.encrypt(s2);
                    lenBuf[2] = this.encrypt(s3);
                } else {
                    lenBuf[0] = s1 & 0xFF;
                    lenBuf[1] = s2 & 0xFF;
                    lenBuf[2] = s3 & 0xFF;
                }
            } else {
                lenBuf = Buffer.alloc(2);
                if (encrypt) {
                    lenBuf[0] = this.encrypt((size >> 8) & 0xFF);
                    lenBuf[1] = this.encrypt(size & 0xFF);
                } else {
                    lenBuf[0] = (size >> 8) & 0xFF;
                    lenBuf[1] = size & 0xFF;
                }
            }

            let body = Buffer.from(data);
            if (encrypt && this.keys.length > 0) {
                for (let i = 0; i < body.length; i++) {
                    body[i] = this.encrypt(body[i]);
                }
            }

            const packet = Buffer.concat([cmdBuf, lenBuf, body]);
            Logger.debug(`[NETWORK] Sending CMD: ${cmdByte}, Len: ${size}, Encrypted: ${encrypt}`);
            this.socket.send(packet);
        } catch (e) {
            Logger.error('Error sending message', e);
        }
    }

    private encrypt(b: number): number {
        const res = (b & 0xFF) ^ (this.keys[this.curW++] & 0xFF);
        this.curW %= this.keys.length;
        return res & 0xFF;
    }

    private decrypt(b: number): number {
        const res = (b & 0xFF) ^ (this.keys[this.curR++] & 0xFF);
        this.curR %= this.keys.length;
        return res & 0xFF;
    }

    private onData(data: Buffer): void {
        Logger.debug(`[NETWORK] Received ${data.length} bytes from ${this.socket.getRemoteAddress()}`);
        this.buffer = Buffer.concat([this.buffer, data]);

        while (this.buffer.length > 0) {
            let command = this.buffer[0];
            if (this.sendKeyComplete && this.keys.length > 0) {
                const tempCurR = this.curR;
                command = this.decrypt(command);
                this.curR = tempCurR;
            }
            if (command > 127) command -= 256;

            Logger.debug(`[NETWORK] Peek CMD: ${command}, Current Buffer: ${this.buffer.length}, Hex: ${this.buffer.subarray(0, Math.min(this.buffer.length, 4)).toString('hex')}`);

            let offset = 3;
            let dataLen = 0;

            if (this.buffer.length < 3) {
                Logger.debug(`[NETWORK] Wait for header 3 bytes, current: ${this.buffer.length}`);
                break;
            }

            if (this.sendKeyComplete && this.keys.length > 0) {
                const tempCurR = this.curR;
                this.decrypt(this.buffer[0]); // skip cmd
                const s1 = this.decrypt(this.buffer[1]) & 0xFF;
                const s2 = this.decrypt(this.buffer[2]) & 0xFF;
                dataLen = (s1 << 8) | s2;
                this.curR = tempCurR;
            } else {
                dataLen = ((this.buffer[1] & 0xFF) << 8) | (this.buffer[2] & 0xFF);
            }

            if (this.buffer.length < offset + dataLen) {
                Logger.debug(`[NETWORK] Wait for body: buffer=${this.buffer.length}, needed=${offset + dataLen}`);
                break;
            }

            // Consume header and body
            let realCmd = (this.sendKeyComplete && this.keys.length > 0) ? this.decrypt(this.buffer[0]) : (this.buffer[0] > 127 ? this.buffer[0] - 256 : this.buffer[0]);
            if (realCmd > 127) realCmd -= 256;

            // Skip length bytes in decryption state
            if (offset === 4) {
                if (this.sendKeyComplete && this.keys.length > 0) {
                    this.decrypt(this.buffer[1]);
                    this.decrypt(this.buffer[2]);
                    this.decrypt(this.buffer[3]);
                }
            } else {
                if (this.sendKeyComplete && this.keys.length > 0) {
                    this.decrypt(this.buffer[1]);
                    this.decrypt(this.buffer[2]);
                }
            }

            let dataPayload = this.buffer.subarray(offset, offset + dataLen);
            if (this.sendKeyComplete && this.keys.length > 0) {
                const decryptedData = Buffer.alloc(dataLen);
                for (let i = 0; i < dataLen; i++) {
                    decryptedData[i] = this.decrypt(dataPayload[i]);
                }
                dataPayload = decryptedData;
            }

            Logger.debug(`📨 Received CMD: ${realCmd}, DataLen: ${dataLen}`);
            const msg = new Message(realCmd, Buffer.from(dataPayload));
            Controller.getInstance().onMessage(this, msg);

            this.buffer = this.buffer.subarray(offset + dataLen);
        }
    }

    private onClose(): void {
        this.connected = false;
        Logger.info(`Session disconnected.`);
    }

    private onError(err: Error): void {
        this.connected = false;
        Logger.error(`Session error:`, err);
    }
}
