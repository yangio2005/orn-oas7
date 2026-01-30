export interface ISocket {
    send(data: Buffer): void;
    on(event: 'data', listener: (data: Buffer) => void): void;
    on(event: 'close', listener: () => void): void;
    on(event: 'error', listener: (err: Error) => void): void;
    close(): void;
    getRemoteAddress(): string;
    getRemotePort(): number;
    isConnected(): boolean;
}
