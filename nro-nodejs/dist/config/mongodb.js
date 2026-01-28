"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.MongoDB = void 0;
const mongoose_1 = __importDefault(require("mongoose"));
const Logger_1 = require("../utils/Logger");
class MongoDB {
    static async connect() {
        try {
            const mongoUri = process.env.MONGO_URI || 'mongodb://localhost:27017/nro_game';
            await mongoose_1.default.connect(mongoUri);
            this.connection = mongoose_1.default;
            Logger_1.Logger.info('MongoDB connected successfully');
            // Handle connection events
            mongoose_1.default.connection.on('error', (err) => {
                Logger_1.Logger.error('MongoDB connection error:', err);
            });
            mongoose_1.default.connection.on('disconnected', () => {
                Logger_1.Logger.warn('MongoDB disconnected');
            });
        }
        catch (error) {
            Logger_1.Logger.error('Failed to connect to MongoDB:', error);
            Logger_1.Logger.warn('Continuing without MongoDB (some features may be limited)');
        }
    }
    static getConnection() {
        return this.connection;
    }
    static isConnected() {
        return mongoose_1.default.connection.readyState === 1;
    }
    static async disconnect() {
        if (this.connection) {
            await mongoose_1.default.disconnect();
            this.connection = null;
            Logger_1.Logger.info('MongoDB disconnected');
        }
    }
}
exports.MongoDB = MongoDB;
MongoDB.connection = null;
