import * as net from 'net';

// --- Utility Functions for sbyte/byte conversion ---
function convertSbyteToByte(sbyteValue: number): number {
    return sbyteValue >= 0 ? sbyteValue : sbyteValue + 256;
}

function convertByteToSbyte(byteValue: number): number {
    return byteValue <= 127 ? byteValue : byteValue - 256;
}

// --- XOR Encryption/Decryption Logic ---
const KEY = "boys";
const KEY_BYTES = Buffer.from(KEY, 'ascii');

function readKey(b: number, curR: number[]): number {
    const i = (KEY_BYTES[curR[0]++] ^ b) & 0xFF;
    if (curR[0] >= KEY_BYTES.length) {
        curR[0] %= KEY_BYTES.length;
    }
    return i;
}

function writeKey(b: number, curW: number[]): number {
    const i = (KEY_BYTES[curW[0]++] ^ b) & 0xFF;
    if (curW[0] >= KEY_BYTES.length) {
        curW[0] %= KEY_BYTES.length;
    }
    return i;
}

// --- MyReader Equivalent ---
class MyReader {
    private buffer: Buffer;
    private posRead: number;

    constructor(data: Buffer) {
        this.buffer = data;
        this.posRead = 0;
    }

    readSByte(): number {
        if (this.posRead < this.buffer.length) {
            return convertByteToSbyte(this.buffer.readUInt8(this.posRead++));
        }
        throw new Error("End of buffer reached while reading sbyte");
    }

    readByte(): number {
        return this.readSByte(); // In C#, sbyte is used for byte operations
    }

    readUnsignedByte(): number {
        if (this.posRead < this.buffer.length) {
            return this.buffer.readUInt8(this.posRead++);
        }
        throw new Error("End of buffer reached while reading unsigned byte");
    }

    readShort(): number {
        if (this.posRead + 2 <= this.buffer.length) {
            const value = this.buffer.readInt16BE(this.posRead);
            this.posRead += 2;
            return value;
        }
        throw new Error("End of buffer reached while reading short");
    }

    readUnsignedShort(): number {
        if (this.posRead + 2 <= this.buffer.length) {
            const value = this.buffer.readUInt16BE(this.posRead);
            this.posRead += 2;
            return value;
        }
        throw new Error("End of buffer reached while reading unsigned short");
    }

    readInt(): number {
        if (this.posRead + 4 <= this.buffer.length) {
            const value = this.buffer.readInt32BE(this.posRead);
            this.posRead += 4;
            return value;
        }
        throw new Error("End of buffer reached while reading int");
    }

    readLong(): bigint { // Node.js BigInt for 64-bit integers
        if (this.posRead + 8 <= this.buffer.length) {
            const value = this.buffer.readBigInt64BE(this.posRead);
            this.posRead += 8;
            return value;
        }
        throw new Error("End of buffer reached while reading long");
    }

    readBoolean(): boolean {
        return this.readSByte() > 0;
    }

    readUTF(): string {
        const length = this.readShort(); // Length is a signed short
        if (this.posRead + length <= this.buffer.length) {
            const value = this.buffer.toString('utf8', this.posRead, this.posRead + length);
            this.posRead += length;
            return value;
        }
        throw new Error("End of buffer reached while reading UTF string");
    }

    readBytes(length: number): Buffer {
        if (this.posRead + length <= this.buffer.length) {
            const value = this.buffer.slice(this.posRead, this.posRead + length);
            this.posRead += length;
            return value;
        }
        throw new Error("End of buffer reached while reading bytes");
    }

    available(): number {
        return this.buffer.length - this.posRead;
    }
}

// --- MyWriter Equivalent ---
class MyWriter {
    private buffer: Buffer;
    private posWrite: number;
    private initialCapacity: number = 2048;

    constructor() {
        this.buffer = Buffer.alloc(this.initialCapacity);
        this.posWrite = 0;
    }

    private checkLength(ltemp: number): void {
        if (this.posWrite + ltemp >= this.buffer.length) {
            const newCapacity = this.buffer.length + 1024 + ltemp;
            const newBuffer = Buffer.alloc(newCapacity);
            this.buffer.copy(newBuffer, 0, 0, this.posWrite);
            this.buffer = newBuffer;
        }
    }

    writeSByte(value: number): void {
        this.checkLength(1);
        this.buffer.writeInt8(value, this.posWrite++);
    }

    writeByte(value: number): void {
        this.writeSByte(value); // In C#, sbyte is used for byte operations
    }

    writeUnsignedByte(value: number): void {
        this.checkLength(1);
        this.buffer.writeUInt8(value, this.posWrite++);
    }

    writeShort(value: number): void {
        this.checkLength(2);
        this.buffer.writeInt16BE(value, this.posWrite);
        this.posWrite += 2;
    }

    writeUnsignedShort(value: number): void {
        this.checkLength(2);
        this.buffer.writeUInt16BE(value, this.posWrite);
        this.posWrite += 2;
    }

    writeInt(value: number): void {
        this.checkLength(4);
        this.buffer.writeInt32BE(value, this.posWrite);
        this.posWrite += 4;
    }

    writeLong(value: bigint): void { // Node.js BigInt for 64-bit integers
        this.checkLength(8);
        this.buffer.writeBigInt64BE(value, this.posWrite);
        this.posWrite += 8;
    }

    writeBoolean(value: boolean): void {
        this.writeSByte(value ? 1 : 0);
    }

    writeUTF(value: string): void {
        const utf8Bytes = Buffer.from(value, 'utf8');
        this.writeShort(utf8Bytes.length); // Length is a signed short
        this.checkLength(utf8Bytes.length);
        utf8Bytes.copy(this.buffer, this.posWrite);
        this.posWrite += utf8Bytes.length;
    }

    writeBytes(data: Buffer): void {
        this.checkLength(data.length);
        data.copy(this.buffer, this.posWrite);
        this.posWrite += data.length;
    }

    getData(): Buffer {
        return this.buffer.slice(0, this.posWrite);
    }
}

// --- Message Class Equivalent ---
class Message {
    command: number;
    reader?: MyReader;
    writer: MyWriter;

    constructor(command: number, data?: Buffer) {
        this.command = command;
        this.writer = new MyWriter();
        if (data) {
            this.reader = new MyReader(data);
        }
    }

    getData(): Buffer {
        return this.writer.getData();
    }
}

// --- Session_ME Equivalent (Simplified for now) ---
class Session {
    private socket: net.Socket;
    private ipV4: string;
    private isGetKeyComplete: boolean = false;
    private curR: number[] = [0]; // Using array to pass by reference
    private curW: number[] = [0]; // Using array to pass by reference

    constructor(socket: net.Socket, ipV4: string) {
        this.socket = socket;
        this.ipV4 = ipV4;

        this.socket.on('data', this.handleData.bind(this));
        this.socket.on('close', this.handleClose.bind(this));
        this.socket.on('error', this.handleError.bind(this));
    }

    private handleData(data: Buffer): void {
        // This is where we'll parse incoming messages
        // For now, let's just log the raw data
        console.log(`Received data from ${this.ipV4}:`, data.toString('hex'));

        // Example: If it's the handshake message (-27)
        if (data.length > 0 && convertByteToSbyte(data.readUInt8(0)) === -27) {
            this.hansakeMessage();
        }
    }

    private handleClose(): void {
        console.log(`Client ${this.ipV4} disconnected.`);
    }

    private handleError(err: Error): void {
        console.error(`Socket error for ${this.ipV4}:`, err);
    }

    // Replicate HansakeMessage from C#
    hansakeMessage(): void {
        try {
            const m = new Message(-27);
            m.writer.writeUnsignedByte(KEY_BYTES.length);
            m.writer.writeUnsignedByte(KEY_BYTES[0]);
            for (let i = 1; i < KEY_BYTES.length; i++) {
                m.writer.writeUnsignedByte(KEY_BYTES[i] ^ KEY_BYTES[i - 1]);
            }
            m.writer.writeUTF(""); // Empty string
            m.writer.writeInt(0);
            m.writer.writeUnsignedByte(0);
            this.doSendMessage(m);
            this.isGetKeyComplete = true;
            console.log("Handshake complete. Encryption enabled.");
        } catch (e) {
            console.error("Error in hansakeMessage:", e);
        }
    }

    // Replicate DoSendMessage from C#
    doSendMessage(message: Message): void {
        try {
            let cmd = message.command;
            const writer = new MyWriter();

            writer.writeSByte(this.isGetKeyComplete ? writeKey(cmd, this.curW) : cmd);

            const data = message.getData();
            if (data && data.length > 0) {
                const size = data.length;

                // Custom 3-byte length encoding for specific commands
                if ([-32, -66, 11, -67, -74, -87, 66].includes(cmd)) {
                    let sizeTemp = 0;
                    let a = size;
                    let b = 0;
                    let c = 0;

                    if (size > 256) {
                        a = size % 256;
                        sizeTemp = (size - a) / 256;
                        if (sizeTemp <= 256) {
                            b = sizeTemp;
                            c = 0;
                        } else {
                            b = sizeTemp % 256;
                            c = (sizeTemp - b) / 256;
                        }
                    }
                    writer.writeSByte(writeKey(a - 128, this.curW));
                    writer.writeSByte(writeKey(b - 128, this.curW));
                    writer.writeSByte(writeKey(c - 128, this.curW));
                } else if (this.isGetKeyComplete) {
                    writer.writeSByte(writeKey(size >> 8, this.curW));
                    writer.writeSByte(writeKey(size & 0xFF, this.curW));
                } else {
                    // No encryption, standard 2-byte length
                    writer.writeSByte((size >> 8) & 0xFF);
                    writer.writeSByte(size & 0xFF);
                }

                let finalData = data;
                if (this.isGetKeyComplete) {
                    finalData = Buffer.alloc(data.length);
                    for (let i = 0; i < data.length; i++) {
                        finalData.writeUInt8(writeKey(data.readUInt8(i), this.curW), i);
                    }
                }
                writer.writeBytes(finalData);
            }
            this.socket.write(writer.getData());
        } catch (e) {
            console.error("Error in doSendMessage:", e);
            this.socket.destroy();
        }
    }
}

// --- TCP Server ---
const PORT = 14445; // Default port for the game server
const HOST = '0.0.0.0'; // Listen on all available network interfaces

const server = net.createServer((socket) => {
    const clientIp = socket.remoteAddress || 'unknown';
    console.log(`Client connected from ${clientIp}`);

    // Create a new session for each client
    new Session(socket, clientIp);
});

server.listen(PORT, HOST, () => {
    console.log(`Node.js Game Server listening on ${HOST}:${PORT}`);
});

server.on('error', (err: Error) => {
    console.error('Server error:', err);
});
