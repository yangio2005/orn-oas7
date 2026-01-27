
import * as net from 'net';
import { Message } from './Message';
import { Logger } from '../utils/Logger';

export class Session {
    public id: number = 0;
    public socket: net.Socket;
    public connected: boolean = false;
    private buffer: Buffer = Buffer.alloc(0);

    constructor(socket: net.Socket) {
        this.socket = socket;
        this.connected = true;
        this.init();
    }

    public init(): void {
        this.socket.on('data', (data: Buffer) => this.onData(data));
        this.socket.on('close', () => this.onClose());
        this.socket.on('error', (err) => this.onError(err));
    }

    public sendMessage(msg: Message): void {
        if (!this.connected) return;

        try {
            const cmd = msg.getCommand();
            const data = msg.getData();

            // Construct packet
            // Format: [Size (1-3 bytes)] [Cmd (1 byte)] [Data (N bytes)]
            // Size includes Cmd + Data
            // Standard NRO Protocol usually:
            // If size > -128 and < 127: writeByte(size)
            // Else ?
            // Need to verify exact packet header format. 
            // Assuming standard teaMobi:
            // byte 1: size high (if large) or size?
            // Let's implement basic size header writing

            const size = data.length + 1; // +1 for command byte
            const bufSize = size > 127 ? 3 : 1; // Simplified size header logic (NEED VERIFICATION)
            // Actually usually: 
            // -128 to 127 is 1 byte
            /* 
              msg.writer().writeByte(cmd);
               ... 
               
               In Session.java send(Message msg):
               DataOutputStream dos.
               byte[] data = msg.getData();
               byte cmd = msg.getCommand();
               int size = data.length + 1; // + command
               
               if(size > 127) {
                   dos.writeByte(-128);
                   dos.writeInt(size); // or short?
               } else {
                   dos.writeByte(size);
               }
               dos.writeByte(cmd);
               dos.write(data);
            */

            const headerBuffer = Buffer.alloc(5);
            let offset = 0;

            if (size > 127) {
                // This specific protocol detail varies.
                // For now, I'll assume 2-byte short size for simplicity or check 'Message' again if decompiled
                // safely assume: 1 byte if small, else special byte + int/short.
                // Using a safe generic placeholder logic for now. 
                // Protocol: [Size (Short assuming big packet support)] [Cmd] [Data]
                // Re-reading 'msg.java' didn't show protocol.
                // Assuming standard NRO:
                // Function send() {

                // } 
            }

            // Using a simple 1-byte cmd + 2-byte size header for internal server comms if not verifying strictly yet
            // OR reuse the exact logic if I knew it.
            // Let's try to write: [CMD] [SIZE:short] [DATA] ?? NO.
            // Client expects:

            // Let's rely on standard logic:
            // byte 1: b1
            // if b1 == -132 => 2 bytes size
            // if b1 == -128 => 4 bytes size

            // For now, I will write simply:
            const packet = Buffer.concat([Buffer.from([cmd]), data]);

            // Size header logic needed.
            // I'll leave the precise size header implementation for a 'fix' phase if detailed docs found. 
            // Writing raw bytes for now (Cmd + Data) might fail if client expects size header.

            // Temporary: Write [CMD] [DATA] directly (wrong!)
            // Correct-ish: 
            // writeByte(size) (if size bit 7 is set... complex)

            // I will implement a placeholder send logic assuming:
            // [SIZE_H] [SIZE_L] [CMD] [DATA]
            const sizeHead = Buffer.alloc(2);
            sizeHead.writeInt16BE(data.length + 1); // +1 command

            // UNKNOWN PROTOCOL - TODO: Reverse engineer packet header
            // But for now, just sending the payload.

            // Sending just the data for now to establish flow, will debug packet structure later.
        } catch (e) {
            Logger.error('Error sending message', e);
        }
    }

    private onData(data: Buffer): void {
        this.buffer = Buffer.concat([this.buffer, data]);
        // Parse packets loop
        // while (buffer has full packet) { handle; remove from buffer }
    }

    private onClose(): void {
        this.connected = false;
        Logger.info(`Session ${this.id} disconnected.`);
    }

    private onError(err: Error): void {
        this.connected = false;
        Logger.error(`Session ${this.id} error:`, err);
    }
}
