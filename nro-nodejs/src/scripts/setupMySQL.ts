/**
 * Script to setup MySQL database
 * Run: npx ts-node src/scripts/setupMySQL.ts
 */

import 'dotenv/config';
import { DB } from '../config/database';
import { Logger } from '../utils/Logger';
import * as fs from 'fs';
import * as path from 'path';

async function setupMySQL() {
    try {
        Logger.info('🔧 Setting up MySQL database...\n');

        // Connect to MySQL
        await DB.connect();
        const pool = DB.getPool();

        if (!pool) {
            Logger.error('❌ MySQL connection failed');
            Logger.info('\n📝 To setup MySQL:');
            Logger.info('1. Install MySQL: https://dev.mysql.com/downloads/installer/');
            Logger.info('2. Or install XAMPP: https://www.apachefriends.org/');
            Logger.info('3. Start MySQL service');
            Logger.info('4. Update .env with correct credentials');
            Logger.info('5. Run this script again');
            process.exit(1);
        }

        Logger.info('✅ MySQL connected successfully\n');

        // Read and execute schema
        const schemaPath = path.join(__dirname, '../../database/schema.sql');

        if (!fs.existsSync(schemaPath)) {
            Logger.error(`❌ Schema file not found: ${schemaPath}`);
            process.exit(1);
        }

        Logger.info('📄 Reading schema file...');
        const schema = fs.readFileSync(schemaPath, 'utf8');

        // Split by delimiter and execute statements
        const statements = schema
            .split(';')
            .map(s => s.trim())
            .filter(s => s.length > 0 && !s.startsWith('--'));

        Logger.info(`📊 Executing ${statements.length} SQL statements...\n`);

        for (let i = 0; i < statements.length; i++) {
            const stmt = statements[i];
            if (stmt.length > 0) {
                try {
                    await pool.query(stmt);
                    // Logger.debug(`✓ Statement ${i + 1}/${statements.length}`);
                } catch (err: any) {
                    // Ignore some errors (like table already exists)
                    if (!err.message.includes('already exists')) {
                        Logger.warn(`Statement ${i + 1} warning: ${err.message}`);
                    }
                }
            }
        }

        Logger.info('✅ Schema executed successfully\n');

        // Verify tables
        Logger.info('🔍 Verifying tables...');
        const [tables] = await pool.query('SHOW TABLES');
        Logger.info(`Found ${(tables as any[]).length} tables:`);
        (tables as any[]).forEach((table: any) => {
            const tableName = Object.values(table)[0];
            Logger.info(`  - ${tableName}`);
        });

        // Check data
        Logger.info('\n📊 Checking sample data...');
        const [accounts] = await pool.query('SELECT COUNT(*) as count FROM account');
        const [players] = await pool.query('SELECT COUNT(*) as count FROM player');
        const [transactions] = await pool.query('SELECT COUNT(*) as count FROM transaction');

        Logger.info(`  Accounts: ${(accounts as any[])[0].count}`);
        Logger.info(`  Players: ${(players as any[])[0].count}`);
        Logger.info(`  Transactions: ${(transactions as any[])[0].count}`);

        // Show sample accounts
        Logger.info('\n👤 Sample accounts:');
        const [sampleAccounts] = await pool.query(
            'SELECT id, username, email, is_admin, vip_level FROM account LIMIT 5'
        );
        (sampleAccounts as any[]).forEach((acc: any) => {
            Logger.info(`  - ${acc.username} (ID: ${acc.id}, Admin: ${acc.is_admin}, VIP: ${acc.vip_level})`);
        });

        Logger.info('\n✅ MySQL setup completed successfully!');
        Logger.info('\n📝 Next steps:');
        Logger.info('1. Test login with: username=testuser, password=test123');
        Logger.info('2. Or create new account via API');
        Logger.info('3. Player game data will be stored in MongoDB');

        process.exit(0);

    } catch (error) {
        Logger.error('❌ Error setting up MySQL:', error);
        process.exit(1);
    }
}

setupMySQL();
