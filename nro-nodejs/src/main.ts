
import 'dotenv/config';
import { Logger } from './utils/Logger';
import { DB } from './config/database';
import { Server } from './network/Server';

class ServerManager {
    public static async main(): Promise<void> {
        Logger.info('Initializing NRO Node.js Server...');

        try {
            // Initialize Database
            await DB.connect();

            // Initialize Network
            const server = new Server();
            server.start();

            // TODO: Load Game Data

            Logger.info('Server started successfully!');
        } catch (error) {
            Logger.error('Failed to start server:', error);
            process.exit(1);
        }
    }
}

ServerManager.main();
