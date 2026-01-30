
import mysql from 'mysql2/promise';
import { Logger } from '../utils/Logger';

export class DB {
    private static pool: mysql.Pool;

    public static async connect(): Promise<void> {
        try {
            this.pool = mysql.createPool({
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
            Logger.info('Connected to MySQL Database successfully.');
        } catch (error) {
            Logger.error('Database connection failed (Continuing in Offline/Mock Mode):', error);
            // throw error; // Allow server to start without DB for testing
        }
    }

    public static getPool(): mysql.Pool {
        return this.pool;
    }
}
