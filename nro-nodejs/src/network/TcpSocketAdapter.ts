import * as net from 'net';
import { ISocket } from './ISocket';

export class TcpSocketAdapter implements ISocket {
    constructor(private socket: net.Socket) { }

    send(data: Buffer): void {
        if (this.isConnected()) {
            this.socket.write(data);
        }
    }

    on(event: 'data' | 'close' | 'error', listener: (...args: any[]) => void): void {
        this.socket.on(event, listener);
    }

    close(): void {
        this.socket.end();
        this.socket.destroy();
    }

    getRemoteAddress(): string {
        return this.socket.remoteAddress || '';
    }

    getRemotePort(): number {
        return this.socket.remotePort || 0;
    }

    isConnected(): boolean {
        return !this.socket.destroyed && this.socket.writable;
    }
}
