
import * as net from 'net';
import { Logger } from '../utils/Logger';
import { Session } from './Session';

export class Server {
    private server: net.Server;
    private port: number;

    constructor() {
        this.port = parseInt(process.env.SERVER_PORT || '14445');
        this.server = net.createServer((socket) => this.handleConnection(socket));
    }

    public start(): void {
        this.server.listen(this.port, () => {
            Logger.info(`Server is listening on port ${this.port}`);
        });

        this.server.on('error', (err) => {
            Logger.error('Server error:', err);
        });
    }

    private handleConnection(socket: net.Socket): void {
        Logger.info(`New connection from ${socket.remoteAddress}:${socket.remotePort}`);
        const session = new Session(socket);
        // Manage session list...
    }
}
