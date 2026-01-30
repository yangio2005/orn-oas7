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
            Logger.info(`Authenticating user: ${user}`);
            const pool = DB.getPool();
            if (!pool) {
                Logger.error("Login failed: Database pool is null");
                Service.getInstance().sendThongBaoOK(session, "Lỗi kết nối database");
                return null;
            }

            Logger.debug(`Executing query: SELECT * FROM account WHERE username = '${user}'...`);
            const [rows] = await pool.query<RowDataPacket[]>(
                "SELECT * FROM account WHERE username = ? AND password = ?",
                [user, pass]
            );
            Logger.debug(`Query executed. Found ${rows.length} accounts.`);

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

                const player = await PlayerDAO.getPlayerByAccountId(accountId);

                if (!player) {
                    DataGame.sendVersionGame(session);
                    DataGame.sendDataItemBG(session);
                    Service.getInstance().sendCaption(session, 0);
                    Service.getInstance().switchToCreateChar(session);
                    session.userId = accountId;
                    return null;
                } else {
                    await pool.query("UPDATE account SET last_time_login = NOW() WHERE id = ?", [accountId]);

                    session.player = player;
                    player.session = session;

                    // Initialize player zone
                    const { MapService } = await import("./MapService");
                    const mapService = MapService.getInstance();
                    const map = mapService.getMapById(player.mapId);
                    if (map) {
                        const zone = map.getAvailableZone();
                        if (zone) {
                            zone.addPlayer(player);
                            Logger.info(`✅ Player ${player.name} added to Map ${map.mapId}, Zone ${zone.zoneId}`);
                        }
                    } else {
                        const startMap = mapService.getStartingMap(player.gender);
                        if (startMap) {
                            const zone = startMap.getAvailableZone();
                            if (zone) {
                                zone.addPlayer(player);
                                player.mapId = startMap.mapId;
                                player.zoneId = zone.zoneId;
                                Logger.info(`✅ Player ${player.name} added to starting map ${startMap.mapId}`);
                            }
                        }
                    }

                    // Java logic: Controller.login (line 173-196)
                    DataGame.sendSmallVersion(session);
                    Service.getInstance().sendMessage(session, -93, "1630679752231_-93_r");
                    DataGame.sendVersionGame(session);
                    DataGame.sendDataItemBG(session);

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
            if (!name || name.length < 3 || name.length > 20) {
                Service.getInstance().sendThongBaoOK(session, "Tên nhân vật phải từ 3-20 ký tự");
                return;
            }
            if (gender < 0 || gender > 2) {
                Service.getInstance().sendThongBaoOK(session, "Giới tính không hợp lệ");
                return;
            }
            if (!session.userId) {
                Service.getInstance().sendThongBaoOK(session, "Lỗi: Chưa đăng nhập");
                return;
            }
            const pool = DB.getPool();
            if (!pool) return;

            const [existingPlayers] = await pool.query<RowDataPacket[]>(
                "SELECT id FROM player WHERE name = ?",
                [name]
            );

            if (existingPlayers.length > 0) {
                Service.getInstance().sendThongBaoOK(session, "Tên nhân vật đã tồn tại");
                return;
            }

            const player = await PlayerDAO.createNewPlayer(session.userId, name, gender, head);

            if (player) {
                Logger.info(`✅ Created character: ${name} for account ${session.userId}`);
                session.player = player;
                player.session = session;

                await pool.query("UPDATE account SET last_time_login = NOW() WHERE id = ?", [session.userId]);

                DataGame.sendVersionGame(session);
                DataGame.sendDataItemBG(session);
                Service.getInstance().sendThongBaoOK(session, "Tạo nhân vật thành công!");

                import("../server/Controller").then(({ Controller }) => {
                    Controller.getInstance().sendInfo(session);
                });
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

        // Java: Controller.sendInfo (line 120-170 approx in decompiler or 781+ in original)
        // Order matters!

        // 1. Send tile set info (map tiles) -82
        DataGame.sendTileSetInfo(session);

        // 2. Send player intrinsic info (112)
        // TODO: Service.getInstance().sendIntrinsic(player);

        // 3. Send player point (stats) (-42)
        // TODO: Service.getInstance().point(player);

        // 4. Send task info (40)
        // TODO: TaskService.getInstance().sendTaskMain(player);

        // 5. Clear map (-22)
        // TODO: Service.getInstance().clearMap(player);

        // 6. Send clan info (-53)
        // TODO: Service.getInstance().sendClanInfo(player);

        // 7. Send stamina (-69, -68)
        // TODO: Service.getInstance().sendStamina(player);

        // 8. Send pet info (-107)
        // TODO: Service.getInstance().sendHavePet(player);

        // 9. Send top rank (-119)
        // TODO: Service.getInstance().sendTopRank(player);

        // 10. Send notifications (-50)
        // TODO: Service.getInstance().sendNotifyTab(player);

        // 11. Join map (-24)
        if (player.zone) {
            player.zone.load_Me_To_Another(player);
            player.zone.mapInfo(player);
        }

        // 12. Send time (-127/127 lucky round?)
        // TODO: LuckyRound.gI().sendTime(player);

        // 13. Send global server message
        Service.getInstance().sendThongBao(session, "|5| Ngọc rồng Node.js\n|6| Chào mừng bạn đến với NRO Node.js\n|1| Chúc chơi game vui vẻ!");

        // 14. Clear special items (610)
        // TODO: clearVTSK(player)

        Logger.info(`Player ${player.name} logged in successfully`);
    }
}
