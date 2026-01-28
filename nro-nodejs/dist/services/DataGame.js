"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DataGame = void 0;
const Message_1 = require("../network/Message");
const Cmd_1 = require("../constants/Cmd");
const Service_1 = require("./Service");
const Logger_1 = require("../utils/Logger");
class DataGame {
    static sendLinkIP(session) {
        const msg = new Message_1.Message(Cmd_1.Cmd.NOT_LOGIN); // -29
        try {
            msg.writer.writeByte(2);
            msg.writer.writeUTF(DataGame.LINK_IP_PORT + ",0,0");
            msg.writer.writeByte(1);
            session.sendMessage(msg);
        }
        catch (e) {
            Logger_1.Logger.error("Error sending Link IP: " + e);
        }
        finally {
            msg.cleanup();
        }
    }
    static sendVersionGame(session) {
        const msg = Service_1.Service.getInstance().messageNotMap(4);
        try {
            msg.writer.writeByte(DataGame.vsData);
            msg.writer.writeByte(DataGame.vsMap);
            msg.writer.writeByte(DataGame.vsSkill);
            msg.writer.writeByte(DataGame.vsItem);
            msg.writer.writeByte(0);
            const smtieuchuan = [
                1000, 3000, 15000, 40000, 90000, 170000, 340000, 700000,
                1500000, 15000000, 150000000, 1500000000, 5000000000, 10000000000, 40000000000,
                50010000000, 60010000000, 70010000000, 80010000000, 100010000000
            ];
            msg.writer.writeByte(smtieuchuan.length);
            for (let i = 0; i < smtieuchuan.length; i++) {
                msg.writer.writeLong(smtieuchuan[i]);
            }
            session.sendMessage(msg);
        }
        catch (e) {
            Logger_1.Logger.error("Error sending version game: " + e);
        }
        finally {
            msg.cleanup();
        }
    }
    static sendDataItemBG(session) {
        const msg = new Message_1.Message(Cmd_1.Cmd.ITEM_BACKGROUND); // -31
        try {
            // Need to read file "data/girlkun/item_bg_temp/item_bg_data"
            // For now, I'll send an empty byte array or mock it, as I haven't ported the file reading yet.
            // But the client might hang if it expects data.
            // I'll leave it as TODO or try to implement FileIO logic later.
            // Since this is migration, I should probably fail gracefully or send mock data.
            // Java reads a file.
            // byte[] item_bg = FileIO.readFile("data/girlkun/item_bg_temp/item_bg_data");
            // msg.writer().write(item_bg);
            // For now, let's just log that we are skipping this
            Logger_1.Logger.info("TODO: sendDataItemBG implementation pending file IO");
            // Mock empty
            // msg.writer.writeBytes(Buffer.alloc(0));
            // session.sendMessage(msg);
        }
        catch (e) {
            Logger_1.Logger.error("Error sending item bg: " + e);
        }
        finally {
            msg.cleanup();
        }
    }
}
exports.DataGame = DataGame;
DataGame.vsData = 80;
DataGame.vsMap = 80;
DataGame.vsSkill = 6;
DataGame.vsItem = 80;
DataGame.vsRes = 752011;
DataGame.LINK_IP_PORT = "Girlkun75-1:14.225.209.71:14445:0";
