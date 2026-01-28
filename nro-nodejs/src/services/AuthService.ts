import { DB } from "../config/database";
import { Player } from "../models/Player";
import { Session } from "../network/Session";
import { Service } from "./Service";
import { DataGame } from "./DataGame";
import { Logger } from "../utils/Logger";
import { RowDataPacket } from "mysql2";
import { PlayerDAO } from "./PlayerDAO";

export class AuthService {
    private static instance: AuthService;

    public static getInstance(): AuthService {
        if (!AuthService.instance) {
            AuthService.instance = new AuthService();
        }
        return AuthService.instance;
    }

    public async login(session: Session, user: string, pass: string): Promise<Player | null> {
        try {
            // Check account
            const pool = DB.getPool();
            if (!pool) {
                Service.getInstance().sendThongBaoOK(session, "Lỗi kết nối database");
                return null;
            }
            const [rows] = await pool.query<RowDataPacket[]>(
                "SELECT * FROM account WHERE username = ? AND password = ?",
                [user, pass]
            );

            if (rows.length > 0) {
                const account = rows[0];
                const accountId = account.id;

                if (account.ban) {
                    Service.getInstance().sendThongBaoOK(session, "Tài khoản của bạn đã bị khóa");
                    return null;
                }

                if (account.is_admin) {
                    session.isAdmin = true;
                }

                // Check player via DAO
                const player = await PlayerDAO.getPlayerByAccountId(accountId);

                if (!player) {
                    // Send create character message
                    Service.getInstance().switchToCreateChar(session);
                    // Also need to set session.userId to accountId so creating character knows who it is
                    session.userId = accountId;
                    return null;
                } else {
                    // Update account last login
                    await pool.query("UPDATE account SET last_time_login = NOW() WHERE id = ?", [accountId]);

                    session.player = player;
                    player.session = session;

                    // Initialize player zone
                    const { MapService } = await import("./MapService");
                    const mapService = MapService.getInstance();
                    const map = mapService.getMapById(player.location.mapId);
                    if (map) {
                        const zone = map.getAvailableZone();
                        if (zone) {
                            zone.addPlayer(player);
                            Logger.info(`✅ Player ${player.name} added to Map ${map.mapId}, Zone ${zone.zoneId}`);
                        }
                    } else {
                        // Default to starting map based on gender
                        const startMap = mapService.getStartingMap(player.gender);
                        if (startMap) {
                            const zone = startMap.getAvailableZone();
                            if (zone) {
                                zone.addPlayer(player);
                                player.location.mapId = startMap.mapId;
                                player.location.zoneId = zone.zoneId;
                                Logger.info(`✅ Player ${player.name} added to starting map ${startMap.mapId}`);
                            }
                        }
                    }

                    // Send successful login sequence (EXACT Java sequence line 173-196)
                    // Line 174: -77 max small
                    DataGame.sendSmallVersion(session);

                    // Line 176: -93 bgitem version
                    Service.getInstance().sendMessage(session, -93, "1630679752231_-93_r");

                    // Line 193: -28 -4 version data game
                    DataGame.sendVersionGame(session);

                    // Line 195: -31 data item background
                    DataGame.sendDataItemBG(session);

                    // Line 196: Send full player info
                    import("../server/Controller").then(({ Controller }) => {
                        Controller.getInstance().sendInfo(session);
                    });

                    return player;
                }
            } else {
                Service.getInstance().sendThongBaoOK(session, "Tài khoản hoặc mật khẩu không chính xác");
                return null;
            }

        } catch (e) {
            Logger.error("Login error: " + e);
            Service.getInstance().sendThongBaoOK(session, "Có lỗi xảy ra khi đăng nhập");
            return null;
        }
    }

    /**
     * Create new character
     */
    public async createCharacter(session: Session, name: string, gender: number, head: number): Promise<void> {
        try {
            // Validate input
            if (!name || name.length < 3 || name.length > 20) {
                Service.getInstance().sendThongBaoOK(session, "Tên nhân vật phải từ 3-20 ký tự");
                return;
            }

            if (gender < 0 || gender > 2) {
                Service.getInstance().sendThongBaoOK(session, "Giới tính không hợp lệ");
                return;
            }

            // Check if user has account ID
            if (!session.userId) {
                Service.getInstance().sendThongBaoOK(session, "Lỗi: Chưa đăng nhập");
                return;
            }

            // Check if name already exists
            const pool = DB.getPool();
            if (!pool) {
                Service.getInstance().sendThongBaoOK(session, "Lỗi kết nối database");
                return;
            }

            const [existingPlayers] = await pool.query<RowDataPacket[]>(
                "SELECT id FROM player WHERE name = ?",
                [name]
            );

            if (existingPlayers.length > 0) {
                Service.getInstance().sendThongBaoOK(session, "Tên nhân vật đã tồn tại");
                return;
            }

            // Create player
            const player = await PlayerDAO.createNewPlayer(session.userId, name, gender, head);

            if (player) {
                Logger.info(`✅ Created character: ${name} for account ${session.userId}`);

                // Set player to session
                session.player = player;
                player.session = session;

                // Update last login
                await pool.query("UPDATE account SET last_time_login = NOW() WHERE id = ?", [session.userId]);

                // Send success and login sequence
                DataGame.sendVersionGame(session);
                DataGame.sendDataItemBG(session);
                Service.getInstance().sendThongBaoOK(session, "Tạo nhân vật thành công!");

                // Send player info
                this.sendInfo(session);
            } else {
                Service.getInstance().sendThongBaoOK(session, "Không thể tạo nhân vật");
            }

        } catch (e) {
            Logger.error("Create character error: " + e);
            Service.getInstance().sendThongBaoOK(session, "Có lỗi xảy ra khi tạo nhân vật");
        }
    }

    public sendInfo(session: Session): void {
        const player = session.player;
        if (!player) return;

        // Send game data sequence to client
        // This replicates the Java Controller.sendInfo() method

        // 1. Send tile set info (map tiles)
        DataGame.sendTileSetInfo(session);

        // 2. Send player intrinsic info (cmd 112)
        // TODO: Service.getInstance().sendIntrinsic(player);

        // 3. Send player point (stats) (cmd -42)
        // TODO: Service.getInstance().point(player);

        // 4. Send task info (cmd 40)
        // TODO: TaskService.getInstance().sendTaskMain(player);

        // 5. Clear map (cmd -22)
        // TODO: Service.getInstance().clearMap(player);

        // 6. Send clan info (cmd -53)
        // TODO: Service.getInstance().sendClanInfo(player);

        // 7. Send stamina (cmd -69, -68)
        // TODO: Service.getInstance().sendStamina(player);

        // 8. Send pet info (cmd -107)
        // TODO: Service.getInstance().sendHavePet(player);

        // 9. Send top rank (cmd -119)
        // TODO: Service.getInstance().sendTopRank(player);

        // 10. Send notifications (cmd -50)
        // TODO: Service.getInstance().sendNotifyTab(player);

        // 11. Join map (cmd -24)
        // TODO: player.zone.load_Me_To_Another(player);
        // TODO: player.zone.mapInfo(player);

        // For now, send welcome message
        Service.getInstance().sendThongBao(session, "Chào mừng đến NRO Node.js Server!");

        Logger.info(`Player ${player.name} logged in successfully`);
    }
}
