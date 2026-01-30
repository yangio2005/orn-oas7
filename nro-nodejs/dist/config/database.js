"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.DB = void 0;
const promise_1 = __importDefault(require("mysql2/promise"));
const Logger_1 = require("../utils/Logger");
class DB {
    static async connect() {
        try {
            this.pool = promise_1.default.createPool({
                host: process.env.DB_HOST || 'localhost',
                user: process.env.DB_USER || 'root',
                password: process.env.DB_PASSWORD || '',
                database: process.env.DB_NAME || 'solomon',
                waitForConnections: true,
                connectionLimit: 10,
                queueLimit: 0
            });
            // Test connection
            await this.pool.getConnection();
            Logger_1.Logger.info('Connected to MySQL Database successfully.');
        }
        catch (error) {
            Logger_1.Logger.error('Database connection failed (Continuing in Offline/Mock Mode):', error);
            // throw error; // Allow server to start without DB for testing
        }
    }
    static getPool() {
        return this.pool;
    }
}
exports.DB = DB;
