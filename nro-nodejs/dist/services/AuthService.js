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
exports.AuthService = void 0;
const database_1 = require("../config/database");
const Service_1 = require("./Service");
const DataGame_1 = require("./DataGame");
const Logger_1 = require("../utils/Logger");
const PlayerDAO_1 = require("./PlayerDAO");
class AuthService {
    static getInstance() {
        if (!AuthService.instance) {
            AuthService.instance = new AuthService();
        }
        return AuthService.instance;
    }
    async login(session, user, pass) {
        try {
            Logger_1.Logger.info(`Authenticating user: ${user}`);
            const pool = database_1.DB.getPool();
            if (!pool) {
                Logger_1.Logger.error("Login failed: Database pool is null");
                Service_1.Service.getInstance().sendThongBaoOK(session, "Lỗi kết nối database");
                return null;
            }
            Logger_1.Logger.debug(`Executing query: SELECT * FROM account WHERE username = '${user}'...`);
            const [rows] = await pool.query("SELECT * FROM account WHERE username = ? AND password = ?", [user, pass]);
            Logger_1.Logger.debug(`Query executed. Found ${rows.length} accounts.`);
            if (rows.length > 0) {
                const account = rows[0];
                const accountId = account.id;
                if (account.ban) {
                    Service_1.Service.getInstance().sendThongBaoOK(session, "Tài khoản của bạn đã bị khóa");
                    return null;
                }
                if (account.is_admin) {
                    session.isAdmin = true;
                }
                const player = await PlayerDAO_1.PlayerDAO.getPlayerByAccountId(accountId);
                if (!player) {
                    DataGame_1.DataGame.sendVersionGame(session);
                    DataGame_1.DataGame.sendDataItemBG(session);
                    Service_1.Service.getInstance().sendCaption(session, 0);
                    Service_1.Service.getInstance().switchToCreateChar(session);
                    session.userId = accountId;
                    return null;
                }
                else {
                    await pool.query("UPDATE account SET last_time_login = NOW() WHERE id = ?", [accountId]);
                    session.player = player;
                    player.session = session;
                    // Initialize player zone
                    const { MapService } = await Promise.resolve().then(() => __importStar(require("./MapService")));
                    const mapService = MapService.getInstance();
                    const map = mapService.getMapById(player.mapId);
                    if (map) {
                        const zone = map.getAvailableZone();
                        if (zone) {
                            zone.addPlayer(player);
                            Logger_1.Logger.info(`✅ Player ${player.name} added to Map ${map.mapId}, Zone ${zone.zoneId}`);
                        }
                    }
                    else {
                        const startMap = mapService.getStartingMap(player.gender);
                        if (startMap) {
                            const zone = startMap.getAvailableZone();
                            if (zone) {
                                zone.addPlayer(player);
                                player.mapId = startMap.mapId;
                                player.zoneId = zone.zoneId;
                                Logger_1.Logger.info(`✅ Player ${player.name} added to starting map ${startMap.mapId}`);
                            }
                        }
                    }
                    // Java logic: Controller.login (line 173-196)
                    DataGame_1.DataGame.sendSmallVersion(session);
                    Service_1.Service.getInstance().sendMessage(session, -93, "1630679752231_-93_r");
                    DataGame_1.DataGame.sendVersionGame(session);
                    DataGame_1.DataGame.sendDataItemBG(session);
                    Promise.resolve().then(() => __importStar(require("../server/Controller"))).then(({ Controller }) => {
                        Controller.getInstance().sendInfo(session);
                    });
                    return player;
                }
            }
            else {
                Service_1.Service.getInstance().sendThongBaoOK(session, "Tài khoản hoặc mật khẩu không chính xác");
                return null;
            }
        }
        catch (e) {
            Logger_1.Logger.error("Login error: " + e);
            Service_1.Service.getInstance().sendThongBaoOK(session, "Có lỗi xảy ra khi đăng nhập");
            return null;
        }
    }
    /**
     * Create new character
     */
    async createCharacter(session, name, gender, head) {
        try {
            if (!name || name.length < 3 || name.length > 20) {
                Service_1.Service.getInstance().sendThongBaoOK(session, "Tên nhân vật phải từ 3-20 ký tự");
                return;
            }
            if (gender < 0 || gender > 2) {
                Service_1.Service.getInstance().sendThongBaoOK(session, "Giới tính không hợp lệ");
                return;
            }
            if (!session.userId) {
                Service_1.Service.getInstance().sendThongBaoOK(session, "Lỗi: Chưa đăng nhập");
                return;
            }
            const pool = database_1.DB.getPool();
            if (!pool)
                return;
            const [existingPlayers] = await pool.query("SELECT id FROM player WHERE name = ?", [name]);
            if (existingPlayers.length > 0) {
                Service_1.Service.getInstance().sendThongBaoOK(session, "Tên nhân vật đã tồn tại");
                return;
            }
            const player = await PlayerDAO_1.PlayerDAO.createNewPlayer(session.userId, name, gender, head);
            if (player) {
                Logger_1.Logger.info(`✅ Created character: ${name} for account ${session.userId}`);
                session.player = player;
                player.session = session;
                await pool.query("UPDATE account SET last_time_login = NOW() WHERE id = ?", [session.userId]);
                DataGame_1.DataGame.sendVersionGame(session);
                DataGame_1.DataGame.sendDataItemBG(session);
                Service_1.Service.getInstance().sendThongBaoOK(session, "Tạo nhân vật thành công!");
                Promise.resolve().then(() => __importStar(require("../server/Controller"))).then(({ Controller }) => {
                    Controller.getInstance().sendInfo(session);
                });
            }
            else {
                Service_1.Service.getInstance().sendThongBaoOK(session, "Không thể tạo nhân vật");
            }
        }
        catch (e) {
            Logger_1.Logger.error("Create character error: " + e);
            Service_1.Service.getInstance().sendThongBaoOK(session, "Có lỗi xảy ra khi tạo nhân vật");
        }
    }
    sendInfo(session) {
        const player = session.player;
        if (!player)
            return;
        // Java: Controller.sendInfo (line 120-170 approx in decompiler or 781+ in original)
        // Order matters!
        // 1. Send tile set info (map tiles) -82
        DataGame_1.DataGame.sendTileSetInfo(session);
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
        Service_1.Service.getInstance().sendThongBao(session, "|5| Ngọc rồng Node.js\n|6| Chào mừng bạn đến với NRO Node.js\n|1| Chúc chơi game vui vẻ!");
        // 14. Clear special items (610)
        // TODO: clearVTSK(player)
        Logger_1.Logger.info(`Player ${player.name} logged in successfully`);
    }
}
exports.AuthService = AuthService;
