/**
 * Test script to verify Login flow and Database connection
 * Run with: npx ts-node src/test/testLogin.ts
 */

import 'dotenv/config';
import { DB } from '../config/database';
import { PlayerDAO } from '../services/PlayerDAO';
import { Logger } from '../utils/Logger';

async function testDatabaseConnection() {
    Logger.info('=== Testing Database Connection ===');
    try {
        await DB.connect();
        const pool = DB.getPool();
        if (pool) {
            const [rows] = await pool.query('SELECT 1 as test');
            Logger.info('✓ Database connection successful');
            return true;
        } else {
            Logger.error('✗ Database pool is null');
            return false;
        }
    } catch (e) {
        Logger.error('✗ Database connection failed:', e);
        return false;
    }
}

async function testAccountQuery() {
    Logger.info('\n=== Testing Account Query ===');
    try {
        const pool = DB.getPool();
        if (!pool) {
            Logger.error('✗ No database pool available');
            return false;
        }

        // Check if account table exists and has data
        const [accounts] = await pool.query('SELECT * FROM account LIMIT 1');
        if (Array.isArray(accounts) && accounts.length > 0) {
            Logger.info('✓ Account table exists and has data');
            Logger.info(`  Sample account ID: ${(accounts[0] as any).id}`);
            return true;
        } else {
            Logger.warn('⚠ Account table exists but is empty');
            return false;
        }
    } catch (e) {
        Logger.error('✗ Account query failed:', e);
        return false;
    }
}

async function testPlayerDAO() {
    Logger.info('\n=== Testing PlayerDAO ===');
    try {
        const pool = DB.getPool();
        if (!pool) {
            Logger.error('✗ No database pool available');
            return false;
        }

        // Get first account
        const [accounts] = await pool.query('SELECT * FROM account LIMIT 1');
        if (!Array.isArray(accounts) || accounts.length === 0) {
            Logger.warn('⚠ No accounts to test with');
            return false;
        }

        const accountId = (accounts[0] as any).id;
        Logger.info(`  Testing with account ID: ${accountId}`);

        const player = await PlayerDAO.getPlayerByAccountId(accountId);
        if (player) {
            Logger.info('✓ PlayerDAO.getPlayerByAccountId works');
            Logger.info(`  Player: ${player.name} (ID: ${player.id})`);
            return true;
        } else {
            Logger.info('⚠ No player found for this account (may need to create character)');
            return true; // This is OK, account might not have character yet
        }
    } catch (e) {
        Logger.error('✗ PlayerDAO test failed:', e);
        return false;
    }
}

async function runAllTests() {
    Logger.info('Starting NRO Node.js Server Tests\n');

    const results = {
        dbConnection: await testDatabaseConnection(),
        accountQuery: await testAccountQuery(),
        playerDAO: await testPlayerDAO()
    };

    Logger.info('\n=== Test Results Summary ===');
    Logger.info(`Database Connection: ${results.dbConnection ? '✓ PASS' : '✗ FAIL'}`);
    Logger.info(`Account Query: ${results.accountQuery ? '✓ PASS' : '✗ FAIL'}`);
    Logger.info(`PlayerDAO: ${results.playerDAO ? '✓ PASS' : '✗ FAIL'}`);

    const allPassed = Object.values(results).every(r => r === true);
    Logger.info(`\nOverall: ${allPassed ? '✓ ALL TESTS PASSED' : '✗ SOME TESTS FAILED'}`);

    process.exit(allPassed ? 0 : 1);
}

runAllTests();
