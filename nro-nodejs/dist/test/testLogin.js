"use strict";
/**
 * Test script to verify Login flow and Database connection
 * Run with: npx ts-node src/test/testLogin.ts
 */
Object.defineProperty(exports, "__esModule", { value: true });
require("dotenv/config");
const database_1 = require("../config/database");
const PlayerDAO_1 = require("../services/PlayerDAO");
const Logger_1 = require("../utils/Logger");
async function testDatabaseConnection() {
    Logger_1.Logger.info('=== Testing Database Connection ===');
    try {
        await database_1.DB.connect();
        const pool = database_1.DB.getPool();
        if (pool) {
            const [rows] = await pool.query('SELECT 1 as test');
            Logger_1.Logger.info('✓ Database connection successful');
            return true;
        }
        else {
            Logger_1.Logger.error('✗ Database pool is null');
            return false;
        }
    }
    catch (e) {
        Logger_1.Logger.error('✗ Database connection failed:', e);
        return false;
    }
}
async function testAccountQuery() {
    Logger_1.Logger.info('\n=== Testing Account Query ===');
    try {
        const pool = database_1.DB.getPool();
        if (!pool) {
            Logger_1.Logger.error('✗ No database pool available');
            return false;
        }
        // Check if account table exists and has data
        const [accounts] = await pool.query('SELECT * FROM account LIMIT 1');
        if (Array.isArray(accounts) && accounts.length > 0) {
            Logger_1.Logger.info('✓ Account table exists and has data');
            Logger_1.Logger.info(`  Sample account ID: ${accounts[0].id}`);
            return true;
        }
        else {
            Logger_1.Logger.warn('⚠ Account table exists but is empty');
            return false;
        }
    }
    catch (e) {
        Logger_1.Logger.error('✗ Account query failed:', e);
        return false;
    }
}
async function testPlayerDAO() {
    Logger_1.Logger.info('\n=== Testing PlayerDAO ===');
    try {
        const pool = database_1.DB.getPool();
        if (!pool) {
            Logger_1.Logger.error('✗ No database pool available');
            return false;
        }
        // Get first account
        const [accounts] = await pool.query('SELECT * FROM account LIMIT 1');
        if (!Array.isArray(accounts) || accounts.length === 0) {
            Logger_1.Logger.warn('⚠ No accounts to test with');
            return false;
        }
        const accountId = accounts[0].id;
        Logger_1.Logger.info(`  Testing with account ID: ${accountId}`);
        const player = await PlayerDAO_1.PlayerDAO.getPlayerByAccountId(accountId);
        if (player) {
            Logger_1.Logger.info('✓ PlayerDAO.getPlayerByAccountId works');
            Logger_1.Logger.info(`  Player: ${player.name} (ID: ${player.id})`);
            return true;
        }
        else {
            Logger_1.Logger.info('⚠ No player found for this account (may need to create character)');
            return true; // This is OK, account might not have character yet
        }
    }
    catch (e) {
        Logger_1.Logger.error('✗ PlayerDAO test failed:', e);
        return false;
    }
}
async function runAllTests() {
    Logger_1.Logger.info('Starting NRO Node.js Server Tests\n');
    const results = {
        dbConnection: await testDatabaseConnection(),
        accountQuery: await testAccountQuery(),
        playerDAO: await testPlayerDAO()
    };
    Logger_1.Logger.info('\n=== Test Results Summary ===');
    Logger_1.Logger.info(`Database Connection: ${results.dbConnection ? '✓ PASS' : '✗ FAIL'}`);
    Logger_1.Logger.info(`Account Query: ${results.accountQuery ? '✓ PASS' : '✗ FAIL'}`);
    Logger_1.Logger.info(`PlayerDAO: ${results.playerDAO ? '✓ PASS' : '✗ FAIL'}`);
    const allPassed = Object.values(results).every(r => r === true);
    Logger_1.Logger.info(`\nOverall: ${allPassed ? '✓ ALL TESTS PASSED' : '✗ SOME TESTS FAILED'}`);
    process.exit(allPassed ? 0 : 1);
}
runAllTests();
