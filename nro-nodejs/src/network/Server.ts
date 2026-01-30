import * as net from 'net';
import { WebSocketServer, WebSocket } from 'ws';
import { Logger } from '../utils/Logger';
import { Session } from './Session';
import { TcpSocketAdapter } from './TcpSocketAdapter';
import { WebSocketAdapter } from './WebSocketAdapter';

export class Server {
    private server: net.Server;
    private wss: WebSocketServer;
    private port: number;

    constructor() {
        this.port = parseInt(process.env.SERVER_PORT || '14445');
        // TCP
        this.server = net.createServer((socket) => this.handleConnection(socket));
        // WebSocket on port + 1
        this.wss = new WebSocketServer({ port: this.port + 1 });
    }

    public start(): void {
        this.server.listen(this.port, () => {
            Logger.info(`TCP Server is listening on port ${this.port}`);
        });

        this.wss.on('listening', () => {
            Logger.info(`WebSocket Server is listening on port ${this.port + 1}`);
        });

        this.wss.on('connection', (ws, req) => {
            this.handleWSConnection(ws, req);
        });

        this.server.on('error', (err) => {
            Logger.error('TCP Server error:', err);
        });

        this.wss.on('error', (err) => {
            Logger.error('WebSocket Server error:', err);
        });
    }

    private handleConnection(socket: net.Socket): void {
        Logger.info(`New TCP connection from ${socket.remoteAddress}:${socket.remotePort}`);
        const session = new Session(new TcpSocketAdapter(socket));
    }

    private handleWSConnection(ws: WebSocket, req: any): void {
        const ip = req.socket.remoteAddress;
        Logger.info(`New WS connection from ${ip}`);
        const session = new Session(new WebSocketAdapter(ws, req));
    }
}
