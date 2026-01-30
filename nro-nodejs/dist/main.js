"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
require("dotenv/config");
const Logger_1 = require("./utils/Logger");
const database_1 = require("./config/database");
const Server_1 = require("./network/Server");
const GameDataLoader_1 = require("./services/GameDataLoader");
class ServerManager {
    static async main() {
        Logger_1.Logger.info('Initializing NRO Node.js Server...');
        try {
            // Initialize MySQL Database
            Logger_1.Logger.info('Connecting to MySQL...');
            await database_1.DB.connect();
            if (!database_1.DB.getPool()) {
                Logger_1.Logger.error('MySQL connection failed. Server cannot start.');
                process.exit(1);
            }
            Logger_1.Logger.info('✅ MySQL connected successfully\n');
            // Load Game Data from files
            Logger_1.Logger.info('Loading game data from files...');
            await GameDataLoader_1.GameDataLoader.getInstance().loadAll();
            // Initialize Network
            const server = new Server_1.Server();
            server.start();
            Logger_1.Logger.info('\n✅ Server started successfully!');
            Logger_1.Logger.info(`   MySQL: Connected`);
            Logger_1.Logger.info(`   Game Data: ${GameDataLoader_1.GameDataLoader.getInstance().isLoaded() ? 'Loaded' : 'Not loaded'}`);
            Logger_1.Logger.info(`   Server Port: ${process.env.SERVER_PORT || 14445}\n`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to start server:', error);
            process.exit(1);
        }
    }
}
ServerManager.main();
