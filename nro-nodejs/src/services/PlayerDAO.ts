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
            // Removed non-existent body, leg, role columns

            // Parse location from inventory or separate field?
            // Assuming data_location is stored as { x, y, mapId }
            try {
                const locationData = playerData.data_location ? JSON.parse(playerData.data_location) : {};
                player.x = locationData.x || 0;
                player.y = locationData.y || 0;
                player.mapId = locationData.mapId || 0;
            } catch (e) {
                Logger.error("Error parsing location data", e);
            }

            // Parse JSON data from MySQL columns
            if (playerData.data_inventory) {
                try {
                    player.inventory = JSON.parse(playerData.data_inventory);
                } catch (e) {
                    Logger.error("Error parsing inventory data", e);
                }
            }

            // Parse point
            if (playerData.data_point) {
                try {
                    const point = JSON.parse(playerData.data_point);
                    // Merge point data into nPoint
                    // TODO: Implement cleaner merge
                    player.nPoint.hp = point.hp;
                    player.nPoint.mp = point.mp;
                    player.nPoint.power = point.power;
                } catch (e) {
                    Logger.error("Error parsing point data", e);
                }
            }

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
                    account_id, name, gender, head, 
                    data_inventory, data_location, data_point, 
                    data_magic_tree, items_body, items_bag, items_box, 
                    items_box_lucky_round, friends, enemies, data_intrinsic, 
                    data_item_time, data_item_time_sieucap, data_task, 
                    data_mabu_egg, data_dua, Tai_xiu, data_charm, 
                    skills, skills_shortcut, pet, data_black_ball, 
                    data_side_task, violate, info_phoban, info_achievement, 
                    nhiemvu_chienthan
                ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)`,
                [
                    accountId, name, gender, head,
                    '[]', // data_inventory
                    JSON.stringify({ x: 0, y: 0, mapId: 0 }), // data_location
                    JSON.stringify({ hp: 100, mp: 100, power: 0 }), // data_point
                    '[]', // data_magic_tree
                    '[]', // items_body
                    '[]', // items_bag
                    '[]', // items_box
                    '[]', // items_box_lucky_round
                    '[]', // friends
                    '[]', // enemies
                    '[]', // data_intrinsic
                    '[]', // data_item_time
                    '[]', // data_item_time_sieucap
                    '[]', // data_task
                    '[]', // data_mabu_egg
                    '[]', // data_dua
                    '[]', // Tai_xiu
                    '[]', // data_charm
                    '[]', // skills
                    '[]', // skills_shortcut
                    '[]', // pet
                    '[]', // data_black_ball
                    '[]', // data_side_task
                    0,    // violate
                    '[]', // info_phoban
                    '{}', // info_achievement
                    '[]'  // nhiemvu_chienthan
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
                    name = ?, gender = ?, head = ?, 
                    data_inventory = ?, data_location = ?, data_point = ?
                WHERE id = ?`,
                [
                    player.name, player.gender, player.head,
                    JSON.stringify(player.inventory || {}),
                    JSON.stringify({ x: player.x, y: player.y, mapId: player.mapId }),
                    JSON.stringify({ hp: player.nPoint.hp, mp: player.nPoint.mp, power: player.nPoint.power }),
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
