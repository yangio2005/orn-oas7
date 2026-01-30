import { Buffer } from 'buffer';
import { EventEmitter } from 'events';
import { Message } from './Message';

export class NetworkClient extends EventEmitter {
    private static instance: NetworkClient;
    private ws: WebSocket | null = null;
    public connected: boolean = false;
    private sendKeyComplete: boolean = false;
    private keys: Buffer = Buffer.alloc(0);
    private curR: number = 0;
    private curW: number = 0;
    private buffer: Buffer = Buffer.alloc(0);

    private constructor() {
        super();
    }

    public static getInstance(): NetworkClient {
        if (!this.instance) {
            this.instance = new NetworkClient();
        }
        return this.instance;
    }

    public connect(url: string = 'ws://localhost:14446'): void {
        if (this.ws) {
            this.ws.close();
        }
        console.log(`Connecting to ${url}...`);
        this.ws = new WebSocket(url);
        this.ws.binaryType = 'arraybuffer';

        this.ws.onopen = () => {
            console.log('Connected to server');
            this.connected = true;
            this.cleanup(); // Reset state on new connection
            this.emit('connected');
            this.sendHandshake();
        };

        this.ws.onmessage = (event) => {
            const data = Buffer.from(event.data as ArrayBuffer);
            this.onData(data);
        };

        this.ws.onclose = () => {
            console.log('Disconnected');
            this.connected = false;
            this.emit('disconnected');
        };

        this.ws.onerror = (err) => {
            console.error('WebSocket error:', err);
            this.emit('error', err);
        };
    }

    private cleanup(): void {
        this.buffer = Buffer.alloc(0);
        this.sendKeyComplete = false;
        this.keys = Buffer.alloc(0);
        this.curR = 0;
        this.curW = 0;
    }

    private sendHandshake(): void {
        const msg = new Message(-27);
        msg.writer.writeByte(1);
        this.sendMessage(msg);
    }

    public sendMessage(msg: Message): void {
        if (!this.connected || !this.ws) return;
        try {
            const data = msg.getData();
            const cmd = msg.getCommand();

            let cmdByte = cmd;
            if (this.sendKeyComplete && this.keys.length > 0) {
                cmdByte = this.encrypt(cmd);
            }

            const cmdBuf = Buffer.alloc(1);
            cmdBuf[0] = cmdByte & 0xFF;

            let lenBuf: Buffer;
            const size = data.length;

            const specialCmds = [-32, -66, 11, -67, -74, -87, 66, 12];
            if (specialCmds.includes(cmd)) {
                lenBuf = Buffer.alloc(3);
                const s1 = (size & 0xFF) - 128;
                const s2 = ((size >> 8) & 0xFF) - 128;
                const s3 = ((size >> 16) & 0xFF) - 128;
                if (this.sendKeyComplete && this.keys.length > 0) {
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
                if (this.sendKeyComplete && this.keys.length > 0) {
                    lenBuf[0] = this.encrypt((size >> 8) & 0xFF);
                    lenBuf[1] = this.encrypt(size & 0xFF);
                } else {
                    lenBuf[0] = (size >> 8) & 0xFF;
                    lenBuf[1] = size & 0xFF;
                }
            }

            let body = Buffer.from(data);
            if (this.sendKeyComplete && this.keys.length > 0) {
                const encryptedBody = Buffer.alloc(body.length);
                for (let i = 0; i < body.length; i++) {
                    encryptedBody[i] = this.encrypt(body[i]);
                }
                body = encryptedBody;
            }

            const packet = Buffer.concat([cmdBuf, lenBuf, body]);
            console.debug(`[NETWORK] Sending CMD: ${cmd}, Len: ${size}`);
            this.ws.send(packet);
        } catch (e) {
            console.error('Error sending message', e);
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
        this.buffer = Buffer.concat([this.buffer, data]);

        while (this.buffer.length > 0) {
            let command = this.buffer[0];
            if (this.sendKeyComplete && this.keys.length > 0) {
                const tempCurR = this.curR;
                command = this.decrypt(command);
                this.curR = tempCurR;
            }
            if (command > 127) command -= 256;

            let offset = 3;
            let dataLen = 0;

            if (this.buffer.length < 3) {
                break;
            }

            if (this.sendKeyComplete && this.keys.length > 0) {
                const tempCurR = this.curR;
                this.decrypt(this.buffer[0]);
                const s1 = this.decrypt(this.buffer[1]) & 0xFF;
                const s2 = this.decrypt(this.buffer[2]) & 0xFF;
                dataLen = (s1 << 8) | s2;
                this.curR = tempCurR;
            } else {
                dataLen = ((this.buffer[1] & 0xFF) << 8) | (this.buffer[2] & 0xFF);
            }

            if (this.buffer.length < offset + dataLen) {
                break;
            }

            let realCmd = (this.sendKeyComplete && this.keys.length > 0) ? this.decrypt(this.buffer[0]) : (this.buffer[0] > 127 ? this.buffer[0] - 256 : this.buffer[0]);
            if (realCmd > 127) realCmd -= 256;

            if (offset === 4) {
                if (this.sendKeyComplete && this.keys.length > 0) {
                    this.decrypt(this.buffer[1]);
                    this.decrypt(this.buffer[2]);
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

            if (realCmd === -27) {
                this.processHandshake(dataPayload);
            } else {
                console.debug(`📨 Received CMD: ${realCmd}, DataLen: ${dataLen}`);
                const msg = new Message(realCmd, Buffer.from(dataPayload));
                this.emit('message', msg);
            }

            this.buffer = this.buffer.subarray(offset + dataLen);
        }
    }

    private processHandshake(data: Buffer): void {
        try {
            const keyLen = data.readUInt8(0);
            const key1 = data.readUInt8(1);
            const keys = Buffer.alloc(keyLen);
            keys[0] = key1;

            for (let i = 1; i < keyLen; i++) {
                keys[i] = data.readUInt8(i + 1) ^ keys[i - 1];
            }

            this.keys = keys;
            this.sendKeyComplete = true;
            console.log('Handshake successful. Keys set:', keys);

            this.emit('handshake');
        } catch (e) {
            console.error('Handshake error', e);
        }
    }
}
