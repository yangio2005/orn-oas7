import { DB } from "../config/database";
import { Player } from "../models/Player";
import { Logger } from "../utils/Logger";
import { RowDataPacket } from "mysql2";

/**
 * PlayerDAO - MySQL Only Database Access
 * Schema: solomon.sql
 * 
 * Stores ALL player data in MySQL using JSON columns for complex data
 */
export class PlayerDAO {

    /**
     * Load player from MySQL database
     */
    public static async getPlayerByAccountId(accountId: number): Promise<Player | null> {
        try {
            const pool = DB.getPool();
            if (!pool) {
                Logger.error('MySQL pool not available');
                return null;
            }

            // Get player from MySQL
            const [rows] = await pool.query<RowDataPacket[]>(
                "SELECT * FROM player WHERE account_id = ? LIMIT 1",
                [accountId]
            );

            if (rows.length === 0) {
                return null;
            }

            const playerData = rows[0];
            const player = new Player();

            // Basic info from MySQL
            player.id = playerData.id;
            player.name = playerData.name;
            player.gender = playerData.gender;
            player.head = playerData.head;
            player.body = playerData.body || -1;
            player.leg = playerData.leg || -1;
            player.role = playerData.role || 0;

            // Parse JSON data from MySQL columns (if exists)
            // TODO: Parse data_inventory, data_location, data_point, etc.
            // Example:
            // if (playerData.data_inventory) {
            //     player.inventory = JSON.parse(playerData.data_inventory);
            // }

            Logger.debug(`Loaded player ${player.name} (ID: ${player.id})`);
            return player;
        } catch (e) {
            Logger.error("Error loading player by account ID:", e);
            return null;
        }
    }

    /**
     * Create new player in MySQL
     */
    public static async createNewPlayer(
        accountId: number,
        name: string,
        gender: number,
        head: number
    ): Promise<Player | null> {
        try {
            const pool = DB.getPool();
            if (!pool) return null;

            // Insert into MySQL
            const [result] = await pool.query<any>(
                `INSERT INTO player (
                    account_id, name, gender, head, body, leg, role,
                    data_inventory, data_location, data_point, data_magic
                ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)`,
                [
                    accountId, name, gender, head, -1, -1, 0,
                    '[]',  // empty inventory
                    JSON.stringify({ x: 0, y: 0, mapId: 0 }),  // starting location
                    JSON.stringify({ hp: 100, mp: 100, power: 0 }),  // starting stats
                    '[]'   // empty skills
                ]
            );

            Logger.info(`Created new player: ${name} (ID: ${result.insertId})`);

            // Return the created player
            return await this.getPlayerByAccountId(accountId);
        } catch (e) {
            Logger.error("Error creating new player:", e);
            return null;
        }
    }

    /**
     * Save player data to MySQL
     */
    public static async updatePlayer(player: Player): Promise<boolean> {
        try {
            const pool = DB.getPool();
            if (!pool) return false;

            // Update MySQL
            await pool.query(
                `UPDATE player SET 
                    name = ?, gender = ?, head = ?, body = ?, leg = ?, role = ?,
                    data_inventory = ?, data_location = ?, data_point = ?
                WHERE id = ?`,
                [
                    player.name, player.gender, player.head, player.body, player.leg, player.role,
                    JSON.stringify(player.inventory || []),
                    JSON.stringify(player.location),
                    JSON.stringify({ hp: player.hp, mp: player.mp, power: player.power }),
                    player.id
                ]
            );

            Logger.debug(`Saved player ${player.id} to MySQL`);
            return true;
        } catch (e) {
            Logger.error("Error updating player:", e);
            return false;
        }
    }
}
