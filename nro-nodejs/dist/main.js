"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
require("dotenv/config");
const Logger_1 = require("./utils/Logger");
const database_1 = require("./config/database");
const mongodb_1 = require("./config/mongodb");
const Server_1 = require("./network/Server");
class ServerManager {
    static async main() {
        Logger_1.Logger.info('Initializing NRO Node.js Server...');
        try {
            // Initialize MySQL (critical data: accounts, transactions)
            Logger_1.Logger.info('Connecting to MySQL...');
            await database_1.DB.connect();
            // Initialize MongoDB (game data: stats, inventory, skills)
            Logger_1.Logger.info('Connecting to MongoDB...');
            await mongodb_1.MongoDB.connect();
            // Initialize Network
            const server = new Server_1.Server();
            server.start();
            // TODO: Load Game Data
            Logger_1.Logger.info('Server started successfully!');
            Logger_1.Logger.info(`MySQL: ${database_1.DB.getPool() ? 'Connected' : 'Offline'}`);
            Logger_1.Logger.info(`MongoDB: ${mongodb_1.MongoDB.isConnected() ? 'Connected' : 'Offline'}`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to start server:', error);
            process.exit(1);
        }
    }
}
ServerManager.main();
