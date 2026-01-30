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
const AuthService_1 = require("../services/AuthService");
const database_1 = require("../config/database");
const Session_1 = require("../network/Session");
const TcpSocketAdapter_1 = require("../network/TcpSocketAdapter");
const Logger_1 = require("../utils/Logger");
const net = __importStar(require("net"));
// Mock DB
const mockPool = {
    query: async (sql, params) => {
        Logger_1.Logger.debug(`[MOCK DB] Query: ${sql} Params: ${JSON.stringify(params)}`);
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
};
// Override DB.getPool
database_1.DB.getPool = () => mockPool;
// Mock Socket
const mockSocket = new net.Socket();
mockSocket.write = (buffer) => {
    Logger_1.Logger.debug(`[MOCK SOCKET] Write: ${buffer.length} bytes`);
    return true;
};
// Mock Session
class MockSession extends Session_1.Session {
    constructor() {
        super(new TcpSocketAdapter_1.TcpSocketAdapter(mockSocket));
    }
    sendMessage(msg) {
        Logger_1.Logger.info(`[MOCK SESSION] sendMessage: Cmd ${msg.command}`);
    }
}
async function runTest() {
    Logger_1.Logger.info("Starting Login Unit Test...");
    const session = new MockSession();
    // Test Case: Valid Login
    Logger_1.Logger.info("\n--- Test Case 1: Valid Login (admin/123456) ---");
    const player = await AuthService_1.AuthService.getInstance().login(session, "admin", "123456");
    if (player) {
        Logger_1.Logger.info("TEST PASSED: Player logged in successfully.");
        Logger_1.Logger.info(`Player Info: Name=${player.name}, Map=${player.mapId}, Zone=${player.zoneId}`);
        if (player.mapId === 0 && player.zoneId >= 0) {
            Logger_1.Logger.info("FLOW CHECK: Player entered map/zone correctly.");
        }
        else {
            Logger_1.Logger.error("FLOW CHECK FAILED: Player map/zone invalid.");
        }
    }
    else {
        Logger_1.Logger.error("TEST FAILED: Login returned null.");
    }
    // Test Case: Invalid Login
    Logger_1.Logger.info("\n--- Test Case 2: Invalid Login (admin/wrongpass) ---");
    const playerFail = await AuthService_1.AuthService.getInstance().login(session, "admin", "wrongpass");
    if (playerFail === null) {
        Logger_1.Logger.info("TEST PASSED: Login rejected explicitly.");
    }
    else {
        Logger_1.Logger.error("TEST FAILED: Login should have failed.");
    }
}
runTest().catch(console.error);
