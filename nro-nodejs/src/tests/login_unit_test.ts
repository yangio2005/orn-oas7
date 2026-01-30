
import { AuthService } from "../services/AuthService";
import { DB } from "../config/database";
import { Session } from "../network/Session";
import { TcpSocketAdapter } from "../network/TcpSocketAdapter";
import { Player } from "../models/Player";
import { Logger } from "../utils/Logger";
import { Service } from "../services/Service";
import * as net from 'net';

// Mock DB
const mockPool = {
    query: async (sql: string, params: any[]) => {
        Logger.debug(`[MOCK DB] Query: ${sql} Params: ${JSON.stringify(params)}`);

        if (sql.includes("SELECT * FROM account")) {
            // Check credentials
            const user = params[0];
            const pass = params[1];
            if (user === 'admin' && pass === '123456') {
                return [[{ id: 1, username: 'admin', password: '123456', ban: 0, is_admin: 1 }]];
            }
            return [[]]; // No user found
        }

        if (sql.includes("SELECT * FROM player")) {
            // Mock player data
            return [[{
                id: 100,
                account_id: 1,
                name: 'admin',
                gender: 0,
                head: 100,
                body: -1,
                leg: -1,
                role: 99,
                data_inventory: '[]',
                data_location: '{"mapId":0, "zoneId":0, "x":100, "y":100}',
                data_point: '{"hp":1000,"mp":1000,"power":2000}',
                data_magic: '[]'
            }]];
        }

        if (sql.includes("UPDATE account")) {
            return [{ affectedRows: 1 }];
        }

        return [[]];
    }
} as any;

// Override DB.getPool
(DB as any).getPool = () => mockPool;

// Mock Socket
const mockSocket = new net.Socket();
(mockSocket as any).write = (buffer: Buffer) => {
    Logger.debug(`[MOCK SOCKET] Write: ${buffer.length} bytes`);
    return true;
};

// Mock Session
class MockSession extends Session {
    constructor() {
        super(new TcpSocketAdapter(mockSocket));
    }

    public sendMessage(msg: any): void {
        Logger.info(`[MOCK SESSION] sendMessage: Cmd ${msg.command}`);
    }
}

async function runTest() {
    Logger.info("Starting Login Unit Test...");

    const session = new MockSession();

    // Test Case: Valid Login
    Logger.info("\n--- Test Case 1: Valid Login (admin/123456) ---");
    const player = await AuthService.getInstance().login(session, "admin", "123456");

    if (player) {
        Logger.info("TEST PASSED: Player logged in successfully.");
        Logger.info(`Player Info: Name=${player.name}, Map=${player.mapId}, Zone=${player.zoneId}`);

        if (player.mapId === 0 && player.zoneId >= 0) {
            Logger.info("FLOW CHECK: Player entered map/zone correctly.");
        } else {
            Logger.error("FLOW CHECK FAILED: Player map/zone invalid.");
        }
    } else {
        Logger.error("TEST FAILED: Login returned null.");
    }

    // Test Case: Invalid Login
    Logger.info("\n--- Test Case 2: Invalid Login (admin/wrongpass) ---");
    const playerFail = await AuthService.getInstance().login(session, "admin", "wrongpass");

    if (playerFail === null) {
        Logger.info("TEST PASSED: Login rejected explicitly.");
    } else {
        Logger.error("TEST FAILED: Login should have failed.");
    }
}

runTest().catch(console.error);
