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
        this.socket = socket;
        this.connected = true;
        this.init();
    }
    init() {
        this.socket.on('data', (data) => this.onData(data));
        this.socket.on('close', () => this.onClose());
        this.socket.on('error', (err) => this.onError(err));
        // Java MySession sends session key on connect (sendSessionKey)
        // We should implement this if the client expects it immediately.
        // MySession.java: sendSessionKey() -> msg -27
        this.sendSessionKey();
    }
    sendSessionKey() {
        const msg = new Message_1.Message(-27);
        // Keys: public static final byte[] KEYS = {0};
        const keys = Buffer.from([0]);
        msg.writer.writeByte(keys.length);
        msg.writer.writeByte(keys[0]);
        for (let i = 1; i < keys.length; i++) {
            msg.writer.writeByte(keys[i] ^ keys[i - 1]);
        }
        this.sendMessage(msg);
        this.sendKeyComplete = true; // In Java: sentKey = true;
    }
    sendMessage(msg) {
        if (!this.connected)
            return;
        try {
            const data = msg.getData();
            const cmd = msg.getCommand();
            // Construct packet with standard teaMobi header roughly inferred:
            // If strict protocol is needed, we need exact header.
            // Using a simple header [Command] [Data] or [Size] [Command] [Data]
            // Java Session.java send(Message msg):
            // if (size > 127) writes -128 then int size.
            // else writes byte size.
            // Then cmd.
            // Then data.
            const size = data.length + 1; // +1 for command byte
            let header;
            if (size > 127) {
                header = Buffer.alloc(5);
                header.writeInt8(-128, 0);
                header.writeInt32BE(size, 1);
            }
            else {
                header = Buffer.alloc(1);
                header.writeInt8(size, 0);
            }
            // Packet: [Header Size] [Command] [Data]
            // Write Cmd
            const cmdBuf = Buffer.alloc(1);
            cmdBuf.writeInt8(cmd);
            const packet = Buffer.concat([header, cmdBuf, data]);
            this.socket.write(packet);
        }
        catch (e) {
            Logger_1.Logger.error('Error sending message', e);
        }
    }
    onData(data) {
        this.buffer = Buffer.concat([this.buffer, data]);
        // Packet loop
        while (this.buffer.length > 0) {
            // Need at least 1 byte for size
            if (this.buffer.length < 1)
                break;
            // Read size (unsigned)
            let size = this.buffer.readUInt8(0);
            let offset = 1;
            // Handle large packet header (0x80)
            if (size === 128) {
                if (this.buffer.length < 5)
                    break;
                size = this.buffer.readInt32BE(1);
                offset = 5;
            }
            // If size is 0, it implies empty command? Or keep alive?
            // If size includes Cmd, 0 is invalid.
            // Discard to avoid infinite loop or crash if client sends 0s
            if (size === 0) {
                this.buffer = this.buffer.subarray(1);
                continue;
            }
            // Check full packet
            // size includes Command (1 byte) + Data
            if (this.buffer.length < offset + size)
                break;
            // Parse Command
            const command = this.buffer.readInt8(offset);
            // Data payload
            const dataLen = size - 1;
            let dataPayload = Buffer.alloc(0);
            if (dataLen > 0) {
                // Fix type mismatch by creating a new Buffer from the subarray
                dataPayload = Buffer.from(this.buffer.subarray(offset + 1, offset + size));
            }
            const msg = new Message_1.Message(command, dataPayload);
            Controller_1.Controller.getInstance().onMessage(this, msg);
            // Remove processed packet
            this.buffer = this.buffer.subarray(offset + size);
        }
    }
    onClose() {
        this.connected = false;
        Logger_1.Logger.info(`Session disconnected.`);
        // clean up player
    }
    onError(err) {
        this.connected = false;
        Logger_1.Logger.error(`Session error:`, err);
    }
}
exports.Session = Session;
