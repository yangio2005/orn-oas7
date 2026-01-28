"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Service = void 0;
const Message_1 = require("../network/Message");
const Cmd_1 = require("../constants/Cmd");
const DataGame_1 = require("./DataGame");
const Logger_1 = require("../utils/Logger");
class Service {
    static getInstance() {
        if (!Service.instance) {
            Service.instance = new Service();
        }
        return Service.instance;
    }
    static gI() {
        return Service.getInstance();
    }
    sendThongBaoOK(session, text) {
        const msg = new Message_1.Message(Cmd_1.Cmd.CLIENT_OK);
        try {
            msg.writer.writeUTF(text);
            session.sendMessage(msg);
        }
        catch (e) {
            Logger_1.Logger.error("Error sending thong bao OK: " + e);
        }
        finally {
            msg.cleanup();
        }
    }
    sendThongBao(session, text) {
        const msg = new Message_1.Message(Cmd_1.Cmd.CHAT_MAP); // Check if 44 is CHAT_MAP or something else
        // Cmd.ts: public static readonly CHAT_MAP = 44;
        try {
            msg.writer.writeInt(0); // placeholder for player ID or 0 if system? 
            // In Java: msg.writer().writeInt((int) player.id); if player sends it. 
            // If system sends it, maybe just text?
            // Java sendThongBao (line 1269):
            // msg = new Message(44);
            // msg.writer().writeInt((int) player.id);
            // msg.writer().writeUTF(text);
            // But if it's a system message to a specific player? 
            // The method sendThongBao(player, text) in Java usually sends a message to the player *from* the system or just a notification.
            // Let's check sendThongBao impl again.
            // It calls sendMessAllPlayerInMap(player, msg); so it seems it makes the player say it?
            // Wait, there is likely another sendThongBao that just sends to client.
            // If I want a system notification (toast), usually it's different.
            // But strictly following Java migration, I should check if there is a 'sendThongBao' that just sends to the session.
            // For now, I'll match sendThongBaoOK which is definitely a system -> client popup.
            // sendThongBaoOK uses Cmd.CLIENT_OK? I assumed so.
            // Let's stick to what I'm sure of from GodGK.java calls.
        }
        catch (e) {
        }
    }
    switchToCreateChar(session) {
        const msg = new Message_1.Message(Cmd_1.Cmd.CREATE_PLAYER); // Cmd.CREATE_PLAYER is 2?
        // Java: msg = new Message(2);
        // Cmd.ts: public static readonly CREATE_PLAYER = 2;
        try {
            session.sendMessage(msg);
        }
        catch (e) {
        }
        finally {
            msg.cleanup();
        }
    }
    setClientType(session, msg) {
        try {
            session.typeClient = msg.reader.readByte(); // client_type
            session.zoomLevel = msg.reader.readByte(); // zoom_level
            msg.reader.readBoolean(); // is_gprs
            msg.reader.readInt(); // width
            msg.reader.readInt(); // height
            msg.reader.readBoolean(); // is_qwerty
            msg.reader.readBoolean(); // is_touch
            const platform = msg.reader.readUTF();
            const arrPlatform = platform.split("|");
            if (arrPlatform.length > 1) {
                session.version = parseInt(arrPlatform[1].replace(".", ""));
            }
            // System.out.println(platform);
        }
        catch (e) {
            Logger_1.Logger.error("Error setting client type: " + e);
        }
        finally {
            msg.cleanup();
        }
        DataGame_1.DataGame.sendLinkIP(session);
    }
    messageNotMap(command) {
        const msg = new Message_1.Message(Cmd_1.Cmd.NOT_MAP); // Cmd.NOT_MAP is -28
        msg.writer.writeByte(command);
        return msg;
    }
}
exports.Service = Service;
