import 'dotenv/config';
import { DB } from '../config/database';
import { Logger } from '../utils/Logger';

/**
 * Test MySQL connection
 */
async function testConnection() {
    try {
        Logger.info('🔌 Testing MySQL connection...\n');

        // Connect to MySQL
        await DB.connect();
        const pool = DB.getPool();

        if (!pool) {
            Logger.error('❌ MySQL connection failed');
            process.exit(1);
        }

        Logger.info('✅ MySQL connected successfully!\n');

        // Test query
        Logger.info('📊 Running test queries...\n');

        // Check database
        const [dbResult] = await pool.query<any>('SELECT DATABASE() as db');
        Logger.info(`Database: ${dbResult[0].db}`);

        // Check tables
        const [tables] = await pool.query<any>('SHOW TABLES');
        Logger.info(`Tables: ${tables.length} tables found`);

        // Check accounts
        const [accountCount] = await pool.query<any>('SELECT COUNT(*) as count FROM account');
        Logger.info(`Accounts: ${accountCount[0].count} records`);

        // Check players
        const [playerCount] = await pool.query<any>('SELECT COUNT(*) as count FROM player');
        Logger.info(`Players: ${playerCount[0].count} records\n`);

        // Show sample account
        const [sampleAccount] = await pool.query<any>('SELECT id, username, is_admin FROM account LIMIT 1');
        if (sampleAccount.length > 0) {
            Logger.info('Sample Account:');
            Logger.info(`  ID: ${sampleAccount[0].id}`);
            Logger.info(`  Username: ${sampleAccount[0].username}`);
            Logger.info(`  Admin: ${sampleAccount[0].is_admin ? 'Yes' : 'No'}\n`);
        }

        Logger.info('🎉 All tests passed!');

        process.exit(0);
    } catch (error) {
        Logger.error('❌ Connection test failed:', error);
        process.exit(1);
    }
}

testConnection();
