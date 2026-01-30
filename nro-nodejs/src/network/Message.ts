
export class Message {
    private command: number;
    private data: Buffer;
    private readIndex: number = 0;
    private writeBuffer: Buffer[] = [];

    constructor(command?: number | Buffer | null, data?: Buffer) {
        if (command instanceof Buffer) {
            this.command = -1; // Unknown when created from raw buffer alone, usually set later or parsed
            this.data = command;
        } else if (typeof command === 'number') {
            this.command = command;
            this.writeBuffer = [];
            this.data = data || Buffer.alloc(0);
        } else {
            this.command = -1;
            this.data = data || Buffer.alloc(0);
        }
    }

    public getCommand(): number {
        return this.command;
    }

    public setCommand(cmd: number): void {
        this.command = cmd;
    }

    public getData(): Buffer {
        if (this.writeBuffer.length > 0) {
            return Buffer.concat(this.writeBuffer);
        }
        return this.data;
    }

    private _reader: MessageReader | null = null;
    private _writer: MessageWriter | null = null;

    public get reader(): MessageReader {
        if (!this._reader) {
            this._reader = new MessageReader(this.data);
        }
        return this._reader;
    }

    public get writer(): MessageWriter {
        if (!this._writer) {
            this._writer = new MessageWriter(this);
        }
        return this._writer;
    }

    public cleanup(): void {
        this.data = Buffer.alloc(0);
        this.readIndex = 0;
        this.writeBuffer = [];
    }
}

export class MessageReader {
    private buffer: Buffer;
    private offset: number = 0;

    constructor(buffer: Buffer) {
        this.buffer = buffer;
    }

    public readByte(): number {
        const val = this.buffer.readInt8(this.offset);
        this.offset += 1;
        return val;
    }

    public readUnsignedByte(): number {
        const val = this.buffer.readUInt8(this.offset);
        this.offset += 1;
        return val;
    }

    public readShort(): number {
        const val = this.buffer.readInt16BE(this.offset);
        this.offset += 2;
        return val;
    }

    public readUnsignedShort(): number {
        const val = this.buffer.readUInt16BE(this.offset);
        this.offset += 2;
        return val;
    }

    public readInt(): number {
        const val = this.buffer.readInt32BE(this.offset);
        this.offset += 4;
        return val;
    }

    public readLong(): bigint {
        const val = this.buffer.readBigInt64BE(this.offset);
        this.offset += 8;
        return val;
    }

    public readBoolean(): boolean {
        return this.readByte() !== 0;
    }

    public readString(): string {
        try {
            const len = this.readUnsignedShort();
            const str = this.buffer.toString('utf8', this.offset, this.offset + len);
            this.offset += len;
            return str;
        } catch (e) {
            return "";
        }
    }

    public readUTF(): string {
        return this.readString();
    }

    public available(): number {
        return this.buffer.length - this.offset;
    }
}

export class MessageWriter {
    private message: Message;
    private chunks: Buffer[] = [];

    constructor(message: Message) {
        this.message = message;
        // In this implementation, we write to local chunks and flush to message on get
        // But for compatibility with the 'Message' class pattern where writer updates the message internal state:
        // We will push directly to message's writeBuffer?
        // Let's keep it simple: Writer methods return void, push to a list.
        this.chunks = (message as any).writeBuffer;
    }

    public writeByte(val: number): void {
        const buf = Buffer.alloc(1);
        buf.writeUInt8(val & 0xFF);
        this.chunks.push(buf);
    }

    public writeBytes(val: Buffer): void {
        this.chunks.push(val);
    }

    public writeShort(val: number): void {
        const buf = Buffer.alloc(2);
        buf.writeInt16BE(val);
        this.chunks.push(buf);
    }

    public writeInt(val: number): void {
        const buf = Buffer.alloc(4);
        buf.writeInt32BE(val);
        this.chunks.push(buf);
    }

    public writeLong(val: bigint | number): void {
        const buf = Buffer.alloc(8);
        buf.writeBigInt64BE(BigInt(val));
        this.chunks.push(buf);
    }

    public writeBoolean(val: boolean): void {
        this.writeByte(val ? 1 : 0);
    }

    public writeString(val: string): void {
        const strBuf = Buffer.from(val, 'utf8');
        this.writeShort(strBuf.length);
        this.chunks.push(strBuf);
    }

    public writeUTF(val: string): void {
        this.writeString(val);
    }

    public flush(): void {
        // intended mostly for interface compatibility
    }
}
