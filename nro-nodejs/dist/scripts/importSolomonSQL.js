"use strict";
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
const fs = __importStar(require("fs"));
const path = __importStar(require("path"));
const database_1 = require("../config/database");
const Logger_1 = require("../utils/Logger");
/**
 * Import solomon.sql into MySQL database
 */
async function importSolomonSQL() {
    try {
        Logger_1.Logger.info('🚀 Starting solomon.sql import...\n');
        // Connect to MySQL
        await database_1.DB.connect();
        const pool = database_1.DB.getPool();
        if (!pool) {
            Logger_1.Logger.error('❌ MySQL connection failed');
            process.exit(1);
        }
        Logger_1.Logger.info('✅ MySQL connected\n');
        // Read solomon.sql file
        const sqlPath = path.join(__dirname, '../../../solomon.sql');
        if (!fs.existsSync(sqlPath)) {
            Logger_1.Logger.error(`❌ solomon.sql not found at: ${sqlPath}`);
            process.exit(1);
        }
        Logger_1.Logger.info('📄 Reading solomon.sql...');
        const sqlContent = fs.readFileSync(sqlPath, 'utf8');
        // Split by delimiter and execute statements
        Logger_1.Logger.info('📊 Parsing SQL statements...\n');
        const statements = sqlContent
            .split(';')
            .map(s => s.trim())
            .filter(s => s.length > 0 && !s.startsWith('--'));
        Logger_1.Logger.info(`Found ${statements.length} SQL statements\n`);
        Logger_1.Logger.info('⏳ Executing statements (this may take a while)...\n');
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
                        Logger_1.Logger.info(`Progress: ${i + 1}/${statements.length} statements executed`);
                    }
                }
                catch (err) {
                    // Ignore some errors (like table already exists)
                    if (!err.message.includes('already exists')) {
                        errorCount++;
                        Logger_1.Logger.warn(`Statement ${i + 1} error: ${err.message.substring(0, 100)}`);
                    }
                    else {
                        successCount++;
                    }
                }
            }
        }
        Logger_1.Logger.info('\n✅ Import completed!');
        Logger_1.Logger.info(`   Success: ${successCount} statements`);
        Logger_1.Logger.info(`   Errors: ${errorCount} statements\n`);
        // Verify import
        Logger_1.Logger.info('🔍 Verifying import...\n');
        const [tables] = await pool.query('SHOW TABLES');
        Logger_1.Logger.info(`✅ Database has ${tables.length} tables`);
        const [accountCount] = await pool.query('SELECT COUNT(*) as count FROM account');
        Logger_1.Logger.info(`✅ Account table has ${accountCount[0].count} records`);
        const [playerCount] = await pool.query('SELECT COUNT(*) as count FROM player');
        Logger_1.Logger.info(`✅ Player table has ${playerCount[0].count} records\n`);
        Logger_1.Logger.info('🎉 solomon.sql imported successfully!');
        process.exit(0);
    }
    catch (error) {
        Logger_1.Logger.error('❌ Import failed:', error);
        process.exit(1);
    }
}
importSolomonSQL();
