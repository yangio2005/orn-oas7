import { WebSocket } from 'ws';
import { ISocket } from './ISocket';

export class WebSocketAdapter implements ISocket {
    constructor(private ws: WebSocket, private req: any) { }

    send(data: Buffer): void {
        if (this.isConnected()) {
            this.ws.send(data);
        }
    }

    on(event: 'data' | 'close' | 'error', listener: (...args: any[]) => void): void {
        if (event === 'data') {
            this.ws.on('message', (data, isBinary) => {
                let buf: Buffer;
                if (Buffer.isBuffer(data)) {
                    buf = data;
                } else if (data instanceof ArrayBuffer) {
                    buf = Buffer.from(data);
                } else if (Array.isArray(data)) {
                    buf = Buffer.concat(data);
                } else {
                    buf = Buffer.from(data as any);
                }
                listener(buf);
            });
        } else if (event === 'close') {
            this.ws.on('close', listener);
        } else if (event === 'error') {
            this.ws.on('error', listener);
        }
    }

    close(): void {
        this.ws.close();
    }

    getRemoteAddress(): string {
        return this.req.socket.remoteAddress || '';
    }

    getRemotePort(): number {
        return this.req.socket.remotePort || 0;
    }

    isConnected(): boolean {
        return this.ws.readyState === WebSocket.OPEN;
    }
}
