"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PlayerDAO = void 0;
const database_1 = require("../config/database");
const mongodb_1 = require("../config/mongodb");
const Player_1 = require("../models/Player");
const Logger_1 = require("../utils/Logger");
const PlayerGameData_1 = require("../database/schemas/PlayerGameData");
/**
 * PlayerDAO - Hybrid Database Access
 * - MySQL: account, player metadata (id, name, gender, head)
 * - MongoDB: game data (stats, inventory, skills, location)
 */
class PlayerDAO {
    /**
     * Load player from both MySQL (meta) and MongoDB (game data)
     */
    static async getPlayerByAccountId(accountId) {
        try {
            const pool = database_1.DB.getPool();
            if (!pool) {
                Logger_1.Logger.error('MySQL pool not available');
                return null;
            }
            // Step 1: Get player metadata from MySQL
            const [rows] = await pool.query("SELECT * FROM player WHERE account_id = ? LIMIT 1", [accountId]);
            if (rows.length === 0) {
                return null;
            }
            const playerMeta = rows[0];
            const player = new Player_1.Player();
            // Basic info from MySQL
            player.id = playerMeta.id;
            player.name = playerMeta.name;
            player.gender = playerMeta.gender;
            player.head = playerMeta.head;
            player.body = playerMeta.body || -1;
            player.leg = playerMeta.leg || -1;
            player.role = playerMeta.role || 0;
            // Step 2: Get game data from MongoDB (if connected)
            if (mongodb_1.MongoDB.isConnected()) {
                try {
                    const gameData = await PlayerGameData_1.PlayerGameDataModel.findOne({ playerId: player.id });
                    if (gameData) {
                        // Load stats from MongoDB
                        player.power = gameData.power;
                        player.tiemNang = gameData.tiemNang;
                        player.hp = gameData.hp;
                        player.mp = gameData.mp;
                        player.stamina = gameData.stamina;
                        // Load location
                        player.location = gameData.location;
                        // Load inventory (convert from MongoDB format to Player model)
                        // player.inventory = gameData.inventory.map(...);
                        Logger_1.Logger.debug(`Loaded game data for player ${player.name} from MongoDB`);
                    }
                    else {
                        Logger_1.Logger.warn(`No MongoDB game data found for player ${player.id}, using defaults`);
                    }
                }
                catch (mongoErr) {
                    Logger_1.Logger.error('Error loading from MongoDB:', mongoErr);
                    // Continue with MySQL data only
                }
            }
            else {
                Logger_1.Logger.warn('MongoDB not connected, using MySQL data only');
            }
            return player;
        }
        catch (e) {
            Logger_1.Logger.error("Error loading player by account ID:", e);
            return null;
        }
    }
    /**
     * Create new player in both databases
     */
    static async createNewPlayer(accountId, name, gender, head) {
        try {
            const pool = database_1.DB.getPool();
            if (!pool)
                return null;
            // Step 1: Insert into MySQL (metadata)
            const [result] = await pool.query("INSERT INTO player (account_id, name, gender, head, body, leg, role) VALUES (?, ?, ?, ?, ?, ?, ?)", [accountId, name, gender, head, -1, -1, 0]);
            const playerId = result.insertId;
            // Step 2: Create game data in MongoDB
            if (mongodb_1.MongoDB.isConnected()) {
                await PlayerGameData_1.PlayerGameDataModel.create({
                    playerId: playerId,
                    accountId: accountId,
                    power: 0,
                    tiemNang: 0,
                    hp: 100,
                    hpMax: 100,
                    mp: 100,
                    mpMax: 100,
                    stamina: 1000,
                    staminaMax: 1000,
                    inventory: [],
                    inventoryBody: [],
                    inventoryBox: [],
                    skills: [],
                    location: { x: 0, y: 0, mapId: 0, zoneId: 0 },
                    tasks: [],
                    lastLogin: new Date(),
                    lastSave: new Date()
                });
                Logger_1.Logger.info(`Created MongoDB game data for player ${playerId}`);
            }
            // Return the created player
            return await this.getPlayerByAccountId(accountId);
        }
        catch (e) {
            Logger_1.Logger.error("Error creating new player:", e);
            return null;
        }
    }
    /**
     * Save player data to both databases
     */
    static async updatePlayer(player) {
        try {
            const pool = database_1.DB.getPool();
            if (!pool)
                return false;
            // Step 1: Update MySQL metadata (if needed)
            await pool.query("UPDATE player SET name = ?, gender = ?, head = ?, body = ?, leg = ?, role = ? WHERE id = ?", [player.name, player.gender, player.head, player.body, player.leg, player.role, player.id]);
            // Step 2: Update MongoDB game data
            if (mongodb_1.MongoDB.isConnected()) {
                await PlayerGameData_1.PlayerGameDataModel.findOneAndUpdate({ playerId: player.id }, {
                    power: player.power,
                    tiemNang: player.tiemNang,
                    hp: player.hp,
                    mp: player.mp,
                    stamina: player.stamina,
                    location: player.location,
                    // inventory: player.inventory,
                    lastSave: new Date()
                }, { upsert: true });
                Logger_1.Logger.debug(`Saved game data for player ${player.id} to MongoDB`);
            }
            return true;
        }
        catch (e) {
            Logger_1.Logger.error("Error updating player:", e);
            return false;
        }
    }
}
exports.PlayerDAO = PlayerDAO;
