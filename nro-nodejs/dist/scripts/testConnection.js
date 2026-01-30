"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
require("dotenv/config");
const database_1 = require("../config/database");
const Logger_1 = require("../utils/Logger");
/**
 * Test MySQL connection
 */
async function testConnection() {
    try {
        Logger_1.Logger.info('🔌 Testing MySQL connection...\n');
        // Connect to MySQL
        await database_1.DB.connect();
        const pool = database_1.DB.getPool();
        if (!pool) {
            Logger_1.Logger.error('❌ MySQL connection failed');
            process.exit(1);
        }
        Logger_1.Logger.info('✅ MySQL connected successfully!\n');
        // Test query
        Logger_1.Logger.info('📊 Running test queries...\n');
        // Check database
        const [dbResult] = await pool.query('SELECT DATABASE() as db');
        Logger_1.Logger.info(`Database: ${dbResult[0].db}`);
        // Check tables
        const [tables] = await pool.query('SHOW TABLES');
        Logger_1.Logger.info(`Tables: ${tables.length} tables found`);
        // Check accounts
        const [accountCount] = await pool.query('SELECT COUNT(*) as count FROM account');
        Logger_1.Logger.info(`Accounts: ${accountCount[0].count} records`);
        // Check players
        const [playerCount] = await pool.query('SELECT COUNT(*) as count FROM player');
        Logger_1.Logger.info(`Players: ${playerCount[0].count} records\n`);
        // Show sample account
        const [sampleAccount] = await pool.query('SELECT id, username, is_admin FROM account LIMIT 1');
        if (sampleAccount.length > 0) {
            Logger_1.Logger.info('Sample Account:');
            Logger_1.Logger.info(`  ID: ${sampleAccount[0].id}`);
            Logger_1.Logger.info(`  Username: ${sampleAccount[0].username}`);
            Logger_1.Logger.info(`  Admin: ${sampleAccount[0].is_admin ? 'Yes' : 'No'}\n`);
        }
        Logger_1.Logger.info('🎉 All tests passed!');
        process.exit(0);
    }
    catch (error) {
        Logger_1.Logger.error('❌ Connection test failed:', error);
        process.exit(1);
    }
}
testConnection();
