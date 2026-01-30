"use strict";
/**
 * Script to setup MySQL database
 * Run: npx ts-node src/scripts/setupMySQL.ts
 */
var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    var desc = Object.getOwnPropertyDescriptor(m, k);
    if (!desc || ("get" in desc ? !m.__esModule : desc.writable || desc.configurable)) {
      desc = { enumerable: true, get: function() { return m[k]; } };
    }
    Object.defineProperty(o, k2, desc);
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __setModuleDefault = (this && this.__setModuleDefault) || (Object.create ? (function(o, v) {
    Object.defineProperty(o, "default", { enumerable: true, value: v });
}) : function(o, v) {
    o["default"] = v;
});
var __importStar = (this && this.__importStar) || (function () {
    var ownKeys = function(o) {
        ownKeys = Object.getOwnPropertyNames || function (o) {
            var ar = [];
            for (var k in o) if (Object.prototype.hasOwnProperty.call(o, k)) ar[ar.length] = k;
            return ar;
        };
        return ownKeys(o);
    };
    return function (mod) {
        if (mod && mod.__esModule) return mod;
        var result = {};
        if (mod != null) for (var k = ownKeys(mod), i = 0; i < k.length; i++) if (k[i] !== "default") __createBinding(result, mod, k[i]);
        __setModuleDefault(result, mod);
        return result;
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
require("dotenv/config");
const database_1 = require("../config/database");
const Logger_1 = require("../utils/Logger");
const fs = __importStar(require("fs"));
const path = __importStar(require("path"));
async function setupMySQL() {
    try {
        Logger_1.Logger.info('🔧 Setting up MySQL database...\n');
        // Connect to MySQL
        await database_1.DB.connect();
        const pool = database_1.DB.getPool();
        if (!pool) {
            Logger_1.Logger.error('❌ MySQL connection failed');
            Logger_1.Logger.info('\n📝 To setup MySQL:');
            Logger_1.Logger.info('1. Install MySQL: https://dev.mysql.com/downloads/installer/');
            Logger_1.Logger.info('2. Or install XAMPP: https://www.apachefriends.org/');
            Logger_1.Logger.info('3. Start MySQL service');
            Logger_1.Logger.info('4. Update .env with correct credentials');
            Logger_1.Logger.info('5. Run this script again');
            process.exit(1);
        }
        Logger_1.Logger.info('✅ MySQL connected successfully\n');
        // Read and execute schema
        const schemaPath = path.join(__dirname, '../../database/schema.sql');
        if (!fs.existsSync(schemaPath)) {
            Logger_1.Logger.error(`❌ Schema file not found: ${schemaPath}`);
            process.exit(1);
        }
        Logger_1.Logger.info('📄 Reading schema file...');
        const schema = fs.readFileSync(schemaPath, 'utf8');
        // Split by delimiter and execute statements
        const statements = schema
            .split(';')
            .map(s => s.trim())
            .filter(s => s.length > 0 && !s.startsWith('--'));
        Logger_1.Logger.info(`📊 Executing ${statements.length} SQL statements...\n`);
        for (let i = 0; i < statements.length; i++) {
            const stmt = statements[i];
            if (stmt.length > 0) {
                try {
                    await pool.query(stmt);
                    // Logger.debug(`✓ Statement ${i + 1}/${statements.length}`);
                }
                catch (err) {
                    // Ignore some errors (like table already exists)
                    if (!err.message.includes('already exists')) {
                        Logger_1.Logger.warn(`Statement ${i + 1} warning: ${err.message}`);
                    }
                }
            }
        }
        Logger_1.Logger.info('✅ Schema executed successfully\n');
        // Verify tables
        Logger_1.Logger.info('🔍 Verifying tables...');
        const [tables] = await pool.query('SHOW TABLES');
        Logger_1.Logger.info(`Found ${tables.length} tables:`);
        tables.forEach((table) => {
            const tableName = Object.values(table)[0];
            Logger_1.Logger.info(`  - ${tableName}`);
        });
        // Check data
        Logger_1.Logger.info('\n📊 Checking sample data...');
        const [accounts] = await pool.query('SELECT COUNT(*) as count FROM account');
        const [players] = await pool.query('SELECT COUNT(*) as count FROM player');
        const [transactions] = await pool.query('SELECT COUNT(*) as count FROM transaction');
        Logger_1.Logger.info(`  Accounts: ${accounts[0].count}`);
        Logger_1.Logger.info(`  Players: ${players[0].count}`);
        Logger_1.Logger.info(`  Transactions: ${transactions[0].count}`);
        // Show sample accounts
        Logger_1.Logger.info('\n👤 Sample accounts:');
        const [sampleAccounts] = await pool.query('SELECT id, username, email, is_admin, vip_level FROM account LIMIT 5');
        sampleAccounts.forEach((acc) => {
            Logger_1.Logger.info(`  - ${acc.username} (ID: ${acc.id}, Admin: ${acc.is_admin}, VIP: ${acc.vip_level})`);
        });
        Logger_1.Logger.info('\n✅ MySQL setup completed successfully!');
        Logger_1.Logger.info('\n📝 Next steps:');
        Logger_1.Logger.info('1. Test login with: username=testuser, password=test123');
        Logger_1.Logger.info('2. Or create new account via API');
        Logger_1.Logger.info('3. Player game data will be stored in MongoDB');
        process.exit(0);
    }
    catch (error) {
        Logger_1.Logger.error('❌ Error setting up MySQL:', error);
        process.exit(1);
    }
}
setupMySQL();
