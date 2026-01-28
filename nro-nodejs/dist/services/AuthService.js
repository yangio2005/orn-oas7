"use strict";
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
            // Check account
            const pool = database_1.DB.getPool();
            if (!pool) {
                Service_1.Service.getInstance().sendThongBaoOK(session, "Lỗi kết nối database");
                return null;
            }
            const [rows] = await pool.query("SELECT * FROM account WHERE username = ? AND password = ?", [user, pass]);
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
                // Check player via DAO
                const player = await PlayerDAO_1.PlayerDAO.getPlayerByAccountId(accountId);
                if (!player) {
                    // Send create character message
                    Service_1.Service.getInstance().switchToCreateChar(session);
                    // Also need to set session.userId to accountId so creating character knows who it is
                    session.userId = accountId;
                    return null;
                }
                else {
                    // Update account last login
                    await pool.query("UPDATE account SET last_time_login = NOW() WHERE id = ?", [accountId]);
                    session.player = player;
                    player.session = session;
                    // Send successful login sequence
                    DataGame_1.DataGame.sendVersionGame(session);
                    DataGame_1.DataGame.sendDataItemBG(session); // if needed
                    Service_1.Service.getInstance().sendThongBaoOK(session, "Đăng nhập thành công!"); // Standard msg
                    // Send player info (Controller.sendInfo in Java)
                    // I'll implement sendInfo in Service or PlayerService
                    // For now, let's just assume we return the player and the caller handles sendInfo, 
                    // OR we handle it here.
                    // In Java, session.login calls Controller.sendInfo(this).
                    this.sendInfo(session);
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
    sendInfo(session) {
        const player = session.player;
        if (!player)
            return;
        // Java: -82 set tile map -> DataGame.sendTileSetInfo(session);
        // Java: 112 my info intrinsic
        // Java: -42 my point -> Service.getInstance().point(player);
        // Java: 40 task -> TaskService.gI().sendTaskMain(player);
        // Java: -22 reset all -> Service.getInstance().clearMap(player);
        // Java: -53 my clan
        // Java: -69 max stamina
        // Java: -68 cur stamina
        // Java: -107 have pet -> Service.getInstance().sendHavePet(player);
        // Java: -119 top rank
        // Java: -50 notify tab
        // Java: -24 join map -> player.zone.load_Me_To_Another(player); player.zone.mapInfo(player);
        // This is a lot. For Phase 4, I just want the client to receive enough to enter the world or at least see the character.
        // I will implement basic sendInfo in Service and call it.
        // Service.getInstance().player(player); // This sends char info msg -30 cmd 0
        // But Controller.sendInfo calls specific services.
        // Let's call a new method in Service that sends basic player info.
        // Replicating basic sequence to get in game:
        Service_1.Service.getInstance().sendThongBao(session, "Welcome to NRO Node.js");
        // Important: Logic to send map and character rendering.
        // I'll add TODOs for the full sequence.
    }
}
exports.AuthService = AuthService;
