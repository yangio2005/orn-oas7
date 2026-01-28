import 'dotenv/config';
import * as fs from 'fs';
import * as path from 'path';
import { DB } from '../config/database';
import { Logger } from '../utils/Logger';

/**
 * Import solomon.sql into MySQL database
 */
async function importSolomonSQL() {
    try {
        Logger.info('🚀 Starting solomon.sql import...\n');

        // Connect to MySQL
        await DB.connect();
        const pool = DB.getPool();

        if (!pool) {
            Logger.error('❌ MySQL connection failed');
            process.exit(1);
        }

        Logger.info('✅ MySQL connected\n');

        // Read solomon.sql file
        const sqlPath = path.join(__dirname, '../../../solomon.sql');

        if (!fs.existsSync(sqlPath)) {
            Logger.error(`❌ solomon.sql not found at: ${sqlPath}`);
            process.exit(1);
        }

        Logger.info('📄 Reading solomon.sql...');
        const sqlContent = fs.readFileSync(sqlPath, 'utf8');

        // Split by delimiter and execute statements
        Logger.info('📊 Parsing SQL statements...\n');
        const statements = sqlContent
            .split(';')
            .map(s => s.trim())
            .filter(s => s.length > 0 && !s.startsWith('--'));

        Logger.info(`Found ${statements.length} SQL statements\n`);
        Logger.info('⏳ Executing statements (this may take a while)...\n');

        let successCount = 0;
        let errorCount = 0;

        for (let i = 0; i < statements.length; i++) {
            const stmt = statements[i];
            if (stmt.length > 0) {
                try {
                    await pool.query(stmt);
                    successCount++;

                    // Log progress every 100 statements
                    if ((i + 1) % 100 === 0) {
                        Logger.info(`Progress: ${i + 1}/${statements.length} statements executed`);
                    }
                } catch (err: any) {
                    // Ignore some errors (like table already exists)
                    if (!err.message.includes('already exists')) {
                        errorCount++;
                        Logger.warn(`Statement ${i + 1} error: ${err.message.substring(0, 100)}`);
                    } else {
                        successCount++;
                    }
                }
            }
        }

        Logger.info('\n✅ Import completed!');
        Logger.info(`   Success: ${successCount} statements`);
        Logger.info(`   Errors: ${errorCount} statements\n`);

        // Verify import
        Logger.info('🔍 Verifying import...\n');

        const [tables] = await pool.query<any>('SHOW TABLES');
        Logger.info(`✅ Database has ${tables.length} tables`);

        const [accountCount] = await pool.query<any>('SELECT COUNT(*) as count FROM account');
        Logger.info(`✅ Account table has ${accountCount[0].count} records`);

        const [playerCount] = await pool.query<any>('SELECT COUNT(*) as count FROM player');
        Logger.info(`✅ Player table has ${playerCount[0].count} records\n`);

        Logger.info('🎉 solomon.sql imported successfully!');

        process.exit(0);
    } catch (error) {
        Logger.error('❌ Import failed:', error);
        process.exit(1);
    }
}

importSolomonSQL();
