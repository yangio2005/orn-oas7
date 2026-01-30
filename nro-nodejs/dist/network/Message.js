"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MessageWriter = exports.MessageReader = exports.Message = void 0;
class Message {
    constructor(command, data) {
        this.readIndex = 0;
        this.writeBuffer = [];
        this._reader = null;
        this._writer = null;
        if (command instanceof Buffer) {
            this.command = -1; // Unknown when created from raw buffer alone, usually set later or parsed
            this.data = command;
        }
        else if (typeof command === 'number') {
            this.command = command;
            this.writeBuffer = [];
            this.data = data || Buffer.alloc(0);
        }
        else {
            this.command = -1;
            this.data = data || Buffer.alloc(0);
        }
    }
    getCommand() {
        return this.command;
    }
    setCommand(cmd) {
        this.command = cmd;
    }
    getData() {
        if (this.writeBuffer.length > 0) {
            return Buffer.concat(this.writeBuffer);
        }
        return this.data;
    }
    get reader() {
        if (!this._reader) {
            this._reader = new MessageReader(this.data);
        }
        return this._reader;
    }
    get writer() {
        if (!this._writer) {
            this._writer = new MessageWriter(this);
        }
        return this._writer;
    }
    cleanup() {
        this.data = Buffer.alloc(0);
        this.readIndex = 0;
        this.writeBuffer = [];
    }
}
exports.Message = Message;
class MessageReader {
    constructor(buffer) {
        this.offset = 0;
        this.buffer = buffer;
    }
    readByte() {
        const val = this.buffer.readInt8(this.offset);
        this.offset += 1;
        return val;
    }
    readUnsignedByte() {
        const val = this.buffer.readUInt8(this.offset);
        this.offset += 1;
        return val;
    }
    readShort() {
        const val = this.buffer.readInt16BE(this.offset);
        this.offset += 2;
        return val;
    }
    readUnsignedShort() {
        const val = this.buffer.readUInt16BE(this.offset);
        this.offset += 2;
        return val;
    }
    readInt() {
        const val = this.buffer.readInt32BE(this.offset);
        this.offset += 4;
        return val;
    }
    readLong() {
        const val = this.buffer.readBigInt64BE(this.offset);
        this.offset += 8;
        return val;
    }
    readBoolean() {
        return this.readByte() !== 0;
    }
    readString() {
        try {
            const len = this.readUnsignedShort();
            const str = this.buffer.toString('utf8', this.offset, this.offset + len);
            this.offset += len;
            return str;
        }
        catch (e) {
            return "";
        }
    }
    readUTF() {
        return this.readString();
    }
    available() {
        return this.buffer.length - this.offset;
    }
}
exports.MessageReader = MessageReader;
class MessageWriter {
    constructor(message) {
        this.chunks = [];
        this.message = message;
        // In this implementation, we write to local chunks and flush to message on get
        // But for compatibility with the 'Message' class pattern where writer updates the message internal state:
        // We will push directly to message's writeBuffer?
        // Let's keep it simple: Writer methods return void, push to a list.
        this.chunks = message.writeBuffer;
    }
    writeByte(val) {
        const buf = Buffer.alloc(1);
        buf.writeUInt8(val & 0xFF);
        this.chunks.push(buf);
    }
    writeBytes(val) {
        this.chunks.push(val);
    }
    writeShort(val) {
        const buf = Buffer.alloc(2);
        buf.writeInt16BE(val);
        this.chunks.push(buf);
    }
    writeInt(val) {
        const buf = Buffer.alloc(4);
        buf.writeInt32BE(val);
        this.chunks.push(buf);
    }
    writeLong(val) {
        const buf = Buffer.alloc(8);
        buf.writeBigInt64BE(BigInt(val));
        this.chunks.push(buf);
    }
    writeBoolean(val) {
        this.writeByte(val ? 1 : 0);
    }
    writeString(val) {
        const strBuf = Buffer.from(val, 'utf8');
        this.writeShort(strBuf.length);
        this.chunks.push(strBuf);
    }
    writeUTF(val) {
        this.writeString(val);
    }
    flush() {
        // intended mostly for interface compatibility
    }
}
exports.MessageWriter = MessageWriter;
