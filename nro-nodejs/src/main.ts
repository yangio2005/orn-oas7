
import 'dotenv/config';
import { Logger } from './utils/Logger';
import { DB } from './config/database';
import { Server } from './network/Server';
import { GameDataLoader } from './services/GameDataLoader';

class ServerManager {
    public static async main(): Promise<void> {
        Logger.info('Initializing NRO Node.js Server...');

        try {
            // Initialize MySQL Database
            Logger.info('Connecting to MySQL...');
            await DB.connect();

            if (!DB.getPool()) {
                Logger.error('MySQL connection failed. Server cannot start.');
                process.exit(1);
            }

            Logger.info('✅ MySQL connected successfully\n');

            // Load Game Data from files
            Logger.info('Loading game data from files...');
            await GameDataLoader.getInstance().loadAll();

            // Initialize Network
            const server = new Server();
            server.start();

            Logger.info('\n✅ Server started successfully!');
            Logger.info(`   MySQL: Connected`);
            Logger.info(`   Game Data: ${GameDataLoader.getInstance().isLoaded() ? 'Loaded' : 'Not loaded'}`);
            Logger.info(`   Server Port: ${process.env.SERVER_PORT || 14445}\n`);
        } catch (error) {
            Logger.error('Failed to start server:', error);
            process.exit(1);
        }
    }
}

ServerManager.main();
