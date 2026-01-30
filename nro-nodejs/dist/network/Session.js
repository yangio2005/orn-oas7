"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Session = void 0;
const Message_1 = require("./Message");
const Controller_1 = require("../server/Controller");
const Logger_1 = require("../utils/Logger");
class Session {
    constructor(socket) {
        this.id = 0;
        this.connected = false;
        this.sendKeyComplete = false;
        this.userId = 0;
        this.player = null;
        this.isAdmin = false;
        // Protocol state
        this.buffer = Buffer.alloc(0);
        this.typeClient = 0;
        this.zoomLevel = 0;
        this.version = 0;
        // Encryption
        this.keys = Buffer.alloc(0);
        this.curR = 0;
        this.curW = 0;
        this.socket = socket;
        this.connected = true;
        this.init();
    }
    init() {
        this.socket.on('data', (data) => this.onData(data));
        this.socket.on('close', () => this.onClose());
        this.socket.on('error', (err) => this.onError(err));
        // Logic: Wait for Client to send CMD -27 first, matched with Controller.ts
    }
    sendSessionKey() {
        const msg = new Message_1.Message(-27);
        // Using a simple 1-byte key {0} to match Java KEYS = {0}
        const keys = Buffer.from([0]); // Java KEYS = {0}
        msg.writer.writeByte(keys.length);
        msg.writer.writeByte(keys[0]);
        for (let i = 1; i < keys.length; i++) {
            msg.writer.writeByte(keys[i] ^ keys[i - 1]);
        }
        // Extra fields expected by SessionReceiver.java
        msg.writer.writeUTF("127.0.0.1"); // GameMidlet.c (IP) - Default to localhost for testing
        msg.writer.writeInt(14445); // GameMidlet.d (Port)
        msg.writer.writeByte(0); // GameMidlet.g (Boolean flag)
        // Handshake message is NOT encrypted
        this.doSendMessage(msg, false);
        this.keys = keys;
        this.sendKeyComplete = true;
    }
    sendMessage(msg) {
        this.doSendMessage(msg, this.sendKeyComplete);
    }
    doSendMessage(msg, encrypt) {
        if (!this.connected)
            return;
        try {
            const data = msg.getData();
            const cmd = msg.getCommand();
            let cmdByte = cmd;
            if (encrypt && this.keys.length > 0) {
                cmdByte = this.encrypt(cmd);
            }
            const cmdBuf = Buffer.alloc(1);
            cmdBuf[0] = cmdByte & 0xFF;
            let lenBuf;
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
                }
                else {
                    lenBuf[0] = s1 & 0xFF;
                    lenBuf[1] = s2 & 0xFF;
                    lenBuf[2] = s3 & 0xFF;
                }
            }
            else {
                lenBuf = Buffer.alloc(2);
                if (encrypt) {
                    lenBuf[0] = this.encrypt((size >> 8) & 0xFF);
                    lenBuf[1] = this.encrypt(size & 0xFF);
                }
                else {
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
            Logger_1.Logger.debug(`[NETWORK] Sending CMD: ${cmdByte}, Len: ${size}, Encrypted: ${encrypt}`);
            this.socket.send(packet);
        }
        catch (e) {
            Logger_1.Logger.error('Error sending message', e);
        }
    }
    encrypt(b) {
        const res = (b & 0xFF) ^ (this.keys[this.curW++] & 0xFF);
        this.curW %= this.keys.length;
        return res & 0xFF;
    }
    decrypt(b) {
        const res = (b & 0xFF) ^ (this.keys[this.curR++] & 0xFF);
        this.curR %= this.keys.length;
        return res & 0xFF;
    }
    onData(data) {
        Logger_1.Logger.debug(`[NETWORK] Received ${data.length} bytes from ${this.socket.getRemoteAddress()}`);
        this.buffer = Buffer.concat([this.buffer, data]);
        while (this.buffer.length > 0) {
            let command = this.buffer[0];
            if (this.sendKeyComplete && this.keys.length > 0) {
                const tempCurR = this.curR;
                command = this.decrypt(command);
                this.curR = tempCurR;
            }
            if (command > 127)
                command -= 256;
            Logger_1.Logger.debug(`[NETWORK] Peek CMD: ${command}, Current Buffer: ${this.buffer.length}, Hex: ${this.buffer.subarray(0, Math.min(this.buffer.length, 4)).toString('hex')}`);
            let offset = 3;
            let dataLen = 0;
            if (this.buffer.length < 3) {
                Logger_1.Logger.debug(`[NETWORK] Wait for header 3 bytes, current: ${this.buffer.length}`);
                break;
            }
            if (this.sendKeyComplete && this.keys.length > 0) {
                const tempCurR = this.curR;
                this.decrypt(this.buffer[0]); // skip cmd
                const s1 = this.decrypt(this.buffer[1]) & 0xFF;
                const s2 = this.decrypt(this.buffer[2]) & 0xFF;
                dataLen = (s1 << 8) | s2;
                this.curR = tempCurR;
            }
            else {
                dataLen = ((this.buffer[1] & 0xFF) << 8) | (this.buffer[2] & 0xFF);
            }
            if (this.buffer.length < offset + dataLen) {
                Logger_1.Logger.debug(`[NETWORK] Wait for body: buffer=${this.buffer.length}, needed=${offset + dataLen}`);
                break;
            }
            // Consume header and body
            let realCmd = (this.sendKeyComplete && this.keys.length > 0) ? this.decrypt(this.buffer[0]) : (this.buffer[0] > 127 ? this.buffer[0] - 256 : this.buffer[0]);
            if (realCmd > 127)
                realCmd -= 256;
            // Skip length bytes in decryption state
            if (offset === 4) {
                if (this.sendKeyComplete && this.keys.length > 0) {
                    this.decrypt(this.buffer[1]);
                    this.decrypt(this.buffer[2]);
                    this.decrypt(this.buffer[3]);
                }
            }
            else {
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
            Logger_1.Logger.debug(`📨 Received CMD: ${realCmd}, DataLen: ${dataLen}`);
            const msg = new Message_1.Message(realCmd, Buffer.from(dataPayload));
            Controller_1.Controller.getInstance().onMessage(this, msg);
            this.buffer = this.buffer.subarray(offset + dataLen);
        }
    }
    onClose() {
        this.connected = false;
        Logger_1.Logger.info(`Session disconnected.`);
    }
    onError(err) {
        this.connected = false;
        Logger_1.Logger.error(`Session error:`, err);
    }
}
exports.Session = Session;
