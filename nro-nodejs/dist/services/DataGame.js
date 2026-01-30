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
exports.DataGame = void 0;
const Message_1 = require("../network/Message");
const Logger_1 = require("../utils/Logger");
const GameDataLoader_1 = require("./GameDataLoader");
const fs = __importStar(require("fs"));
const path = __importStar(require("path"));
/**
 * DataGame - Complete port from Java DataGame.java
 * Handles all game data sending to client
 */
class DataGame {
    /**
     * Send version game info to client
     * Java: line 61-83
     */
    static sendVersionGame(session) {
        try {
            const msg = new Message_1.Message(-28); // messageNotMap
            msg.writer.writeByte(4); // sub command
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
            msg.cleanup();
        }
        catch (e) {
            Logger_1.Logger.error("Error sending version game: " + e);
        }
    }
    /**
     * Send data item background to client
     * Java: line 324-335
     */
    static sendDataItemBG(session) {
        const msg = new Message_1.Message(-31); // ITEM_BACKGROUND
        try {
            const gameData = GameDataLoader_1.GameDataLoader.getInstance();
            if (gameData.itemBgData) {
                msg.writer.writeBytes(gameData.itemBgData);
                session.sendMessage(msg);
                Logger_1.Logger.debug("Sent item_bg_data to client");
            }
            else {
                Logger_1.Logger.warn("item_bg_data not loaded, skipping...");
            }
        }
        catch (e) {
            Logger_1.Logger.error("Error sending item bg: " + e);
        }
        finally {
            msg.cleanup();
        }
    }
    /**
     * Send tile set info (map tiles) to client
     * Java: line 420-430
     */
    static sendTileSetInfo(session) {
        const msg = new Message_1.Message(-82); // TILE_SET_INFO
        try {
            const gameData = GameDataLoader_1.GameDataLoader.getInstance();
            if (gameData.tileSetInfo) {
                msg.writer.writeBytes(gameData.tileSetInfo);
                session.sendMessage(msg);
                Logger_1.Logger.debug("Sent tile_set_info to client");
            }
            else {
                Logger_1.Logger.warn("tile_set_info not loaded, skipping...");
            }
        }
        catch (e) {
            Logger_1.Logger.error("Error sending tile set info: " + e);
        }
        finally {
            msg.cleanup();
        }
    }
    /**
     * Send resource version to client
     * Java: line 534-545
     * Called when client sends CMD -27
     */
    static sendVersionRes(session) {
        const msg = new Message_1.Message(-74);
        try {
            msg.writer.writeByte(0);
            msg.writer.writeInt(DataGame.vsRes); // 752011
            session.sendMessage(msg);
            Logger_1.Logger.debug("Sent version res to client");
        }
        catch (e) {
            Logger_1.Logger.error("Error sending version res: " + e);
        }
        finally {
            msg.cleanup();
        }
    }
    /**
     * Send link IP to client
     * Java: line 588-600
     */
    static sendLinkIP(session) {
        const msg = new Message_1.Message(-29);
        try {
            msg.writer.writeByte(2);
            msg.writer.writeUTF(DataGame.LINK_IP_PORT + ",0,0");
            msg.writer.writeByte(1);
            session.sendMessage(msg);
            msg.cleanup();
        }
        catch (e) {
            Logger_1.Logger.error("Error sending Link IP: " + e);
        }
    }
    /**
     * Send small version (image version)
     * Java: line 378-391
     */
    static sendSmallVersion(session) {
        const msg = new Message_1.Message(-77);
        try {
            const zoomLevel = session.zoomLevel || 1;
            const filePath = path.join(DataGame.DATA_PATH, `data_img_version/x${zoomLevel}/img_version`);
            if (fs.existsSync(filePath)) {
                const data = fs.readFileSync(filePath);
                msg.writer.writeBytes(data);
                session.sendMessage(msg);
            }
            msg.cleanup();
        }
        catch (e) {
            Logger_1.Logger.error("Error sending small version: " + e);
        }
    }
    /**
     * Send map template data
     * Java: line 487-501
     */
    static sendMapTemp(session, id) {
        const msg = new Message_1.Message(-28);
        try {
            const filePath = path.join(DataGame.DATA_PATH, `map/tile_map_data/${id}`);
            if (fs.existsSync(filePath)) {
                if (id !== 167 && id !== 168) {
                    msg.writer.writeByte(10);
                }
                const data = fs.readFileSync(filePath);
                msg.writer.writeBytes(data);
                session.sendMessage(msg);
            }
            msg.cleanup();
        }
        catch (e) {
            Logger_1.Logger.error(`Error sending map temp ${id}: ` + e);
        }
    }
    /**
     * Request mob template
     * Java: line 395-418
     */
    static requestMobTemplate(session, id) {
        const msg = new Message_1.Message(11);
        try {
            const zoomLevel = session.zoomLevel || 1;
            const filePath = path.join(DataGame.DATA_PATH, `mob/x${zoomLevel}/${id}`);
            if (fs.existsSync(filePath)) {
                if (id !== 88 && id !== 89 && id !== 85 && id !== 94) {
                    msg.writer.writeByte(id);
                }
                if (id === 95) {
                    msg.writer.writeByte(0);
                }
                const data = fs.readFileSync(filePath);
                msg.writer.writeBytes(data);
                session.sendMessage(msg);
            }
            msg.cleanup();
        }
        catch (e) {
            Logger_1.Logger.error(`Error sending mob template ${id}: ` + e);
        }
    }
    /**
     * Send icon to client
     * Java: line 360-376
     */
    static sendIcon(session, id) {
        const msg = new Message_1.Message(-67);
        try {
            const zoomLevel = session.zoomLevel || 1;
            const filePath = path.join(DataGame.DATA_PATH, `icon/x${zoomLevel}/${id}.png`);
            if (fs.existsSync(filePath)) {
                const icon = fs.readFileSync(filePath);
                msg.writer.writeInt(id);
                msg.writer.writeInt(icon.length);
                msg.writer.writeBytes(icon);
                session.sendMessage(msg);
            }
            msg.cleanup();
        }
        catch (e) {
            Logger_1.Logger.error(`Error sending icon ${id}: ` + e);
        }
    }
    /**
     * Send effect data
     * Java: line 277-306
     */
    static effData(session, id, idTemp) {
        const msg = new Message_1.Message(-66);
        try {
            const zoomLevel = session.zoomLevel || 1;
            const idT = idTemp || id;
            const effDataPath = path.join(DataGame.DATA_PATH, `effect/x${zoomLevel}/data/DataEffect_${idT}`);
            const effImgPath = path.join(DataGame.DATA_PATH, `effect/x${zoomLevel}/img/ImgEffect_${idT}.png`);
            if (fs.existsSync(effDataPath) && fs.existsSync(effImgPath)) {
                const effData = fs.readFileSync(effDataPath);
                const effImg = fs.readFileSync(effImgPath);
                msg.writer.writeShort(id);
                msg.writer.writeInt(effData.length);
                msg.writer.writeBytes(effData);
                msg.writer.writeByte(0);
                msg.writer.writeInt(effImg.length);
                msg.writer.writeBytes(effImg);
            }
            session.sendMessage(msg);
            msg.cleanup();
        }
        catch (e) {
            Logger_1.Logger.error(`Error sending effect ${id}: ` + e);
        }
    }
    /**
     * Send item background template
     * Java: line 308-322
     */
    static sendItemBGTemplate(session, id) {
        const msg = new Message_1.Message(-32);
        try {
            const zoomLevel = session.zoomLevel || 1;
            const filePath = path.join(DataGame.DATA_PATH, `item_bg_temp/x${zoomLevel}/${id}.png`);
            if (fs.existsSync(filePath)) {
                const bgTemp = fs.readFileSync(filePath);
                msg.writer.writeShort(id);
                msg.writer.writeInt(bgTemp.length);
                msg.writer.writeBytes(bgTemp);
                session.sendMessage(msg);
            }
            msg.cleanup();
        }
        catch (e) {
            Logger_1.Logger.error(`Error sending item bg template ${id}: ` + e);
        }
    }
    /**
     * Send image by name
     * Java: line 516-531
     */
    static sendImageByName(session, imgName) {
        const msg = new Message_1.Message(66);
        try {
            const zoomLevel = session.zoomLevel || 1;
            const filePath = path.join(DataGame.DATA_PATH, `img_by_name/x${zoomLevel}/${imgName}.png`);
            if (fs.existsSync(filePath)) {
                msg.writer.writeUTF(imgName);
                msg.writer.writeByte(1); // nFrame - default 1
                const data = fs.readFileSync(filePath);
                msg.writer.writeInt(data.length);
                msg.writer.writeBytes(data);
                session.sendMessage(msg);
            }
            else {
                // For img_by_name, if missing maybe better to ignore or send empty? 
                // Java writes: ds.writeUTF(imgName); ds.writeByte(nFrame); ds.writeInt(data.length); ds.write(data);
                // If not found, it doesn't send.
            }
            msg.cleanup();
        }
        catch (e) {
            Logger_1.Logger.error(`Error sending image by name ${imgName}: ` + e);
        }
    }
    /**
     * Send data image version
     * Java: line 234-245
     */
    static sendDataImageVersion(session) {
        const msg = new Message_1.Message(-111);
        try {
            const zoomLevel = session.zoomLevel || 1;
            const filePath = path.join(DataGame.DATA_PATH, `data_img_version/x${zoomLevel}/img_version`);
            if (fs.existsSync(filePath)) {
                const data = fs.readFileSync(filePath);
                msg.writer.writeBytes(data);
                session.sendMessage(msg);
            }
            msg.cleanup();
        }
        catch (e) {
            Logger_1.Logger.error("Error sending data image version: " + e);
        }
    }
    /**
     * Send size res
     * Java: line 547-558
     */
    static sendSizeRes(session) {
        const msg = new Message_1.Message(-74);
        try {
            const zoomLevel = session.zoomLevel || 1;
            const dirPath = path.join(DataGame.DATA_PATH, `res/x${zoomLevel}`);
            msg.writer.writeByte(1);
            if (fs.existsSync(dirPath)) {
                const files = fs.readdirSync(dirPath);
                msg.writer.writeShort(files.length);
            }
            else {
                msg.writer.writeShort(0);
            }
            session.sendMessage(msg);
            msg.cleanup();
        }
        catch (e) {
            Logger_1.Logger.error("Error sending size res: " + e);
        }
    }
    /**
     * Send res files
     * Java: line 560-586
     */
    static async sendRes(session) {
        try {
            const zoomLevel = session.zoomLevel || 1;
            const dirPath = path.join(DataGame.DATA_PATH, `res/x${zoomLevel}`);
            if (!fs.existsSync(dirPath)) {
                Logger_1.Logger.warn(`Res directory not found: ${dirPath}`);
                return;
            }
            const files = fs.readdirSync(dirPath);
            for (const fileName of files) {
                const filePath = path.join(dirPath, fileName);
                const data = fs.readFileSync(filePath);
                const msg = new Message_1.Message(-74);
                msg.writer.writeByte(2);
                msg.writer.writeUTF(fileName);
                msg.writer.writeInt(data.length);
                msg.writer.writeBytes(data);
                session.sendMessage(msg);
                msg.cleanup();
                // Sleep 10ms like Java
                await new Promise(resolve => setTimeout(resolve, 10));
            }
            // Send complete message
            const msgComplete = new Message_1.Message(-74);
            msgComplete.writer.writeByte(3);
            msgComplete.writer.writeInt(DataGame.vsRes);
            session.sendMessage(msgComplete);
            msgComplete.cleanup();
        }
        catch (e) {
            Logger_1.Logger.error("Error sending res: " + e);
        }
    }
    /**
     * Update map data
     * Java: line 120-152
     */
    static updateMap(session) {
        const msg = new Message_1.Message(-28);
        try {
            msg.writer.writeByte(6); // sub command UPDATE_MAP
            msg.writer.writeByte(DataGame.vsMap);
            const gameData = GameDataLoader_1.GameDataLoader.getInstance();
            const maps = gameData.maps;
            msg.writer.writeByte(maps.length);
            for (const map of maps) {
                msg.writer.writeUTF(map.name || "");
            }
            const npcs = gameData.npcs;
            msg.writer.writeByte(npcs.length);
            for (const npc of npcs) {
                // Parse NPC data from menunpc.txt line: name \t head \t body \t leg
                const parts = (npc.data || "").split('\t');
                msg.writer.writeUTF(parts[0] || "NPC");
                msg.writer.writeShort(parseInt(parts[1]) || 0);
                msg.writer.writeShort(parseInt(parts[2]) || 0);
                msg.writer.writeShort(parseInt(parts[3]) || 0);
                msg.writer.writeByte(0); // unknown
            }
            const mobs = gameData.mobs;
            msg.writer.writeByte(mobs.length);
            for (const mob of mobs) {
                // For mobs, we might need more data from a mob_template table in DB
                // but for now send what we have
                msg.writer.writeByte(mob.type || 0);
                msg.writer.writeUTF(mob.name || "Mob");
                msg.writer.writeInt(mob.hp || 100);
                msg.writer.writeByte(mob.rangeMove || 5);
                msg.writer.writeByte(mob.speed || 5);
                msg.writer.writeByte(mob.dartType || 0);
            }
            session.sendMessage(msg);
            msg.cleanup();
        }
        catch (e) {
            Logger_1.Logger.error("Error updating map: " + e);
        }
    }
    /**
     * Update skill data
     * Java: line 155-232
     * TODO: Implement when skill data is available
     */
    static updateSkill(session) {
        const msg = new Message_1.Message(-28);
        try {
            msg.writer.writeByte(7); // Sub command UPDATE_SKILL
            msg.writer.writeByte(DataGame.vsSkill);
            msg.writer.writeByte(0); // count skill option
            const gameData = GameDataLoader_1.GameDataLoader.getInstance();
            // Java iterates NCLASS
            msg.writer.writeByte(gameData.nClasses.length);
            for (const nClass of gameData.nClasses) {
                msg.writer.writeUTF(nClass.name);
                msg.writer.writeByte(nClass.skillTemplates.length);
                for (const temp of nClass.skillTemplates) {
                    msg.writer.writeByte(temp.id);
                    msg.writer.writeUTF(temp.name);
                    msg.writer.writeByte(temp.maxPoint);
                    msg.writer.writeByte(temp.manaUseType);
                    msg.writer.writeByte(temp.type);
                    msg.writer.writeShort(temp.iconId);
                    msg.writer.writeUTF(temp.damInfo || "");
                    msg.writer.writeUTF("Tabi"); // "Tabi" as seen in Java
                    const skills = temp.skills || [];
                    if (temp.id !== 0) {
                        msg.writer.writeByte(skills.length);
                        for (const skill of skills) {
                            msg.writer.writeShort(skill.skillId);
                            msg.writer.writeByte(skill.point);
                            msg.writer.writeLong(skill.powRequire);
                            msg.writer.writeShort(skill.manaUse);
                            msg.writer.writeInt(skill.coolDown);
                            msg.writer.writeShort(skill.dx);
                            msg.writer.writeShort(skill.dy);
                            msg.writer.writeShort(skill.maxFight);
                            msg.writer.writeShort(skill.damage);
                            msg.writer.writeShort(skill.price);
                            msg.writer.writeUTF(skill.moreInfo || "");
                        }
                    }
                    else {
                        // Special case for id 0: Add 2 extra empty skills (105, 106)
                        msg.writer.writeByte(skills.length + 2);
                        for (const skill of skills) {
                            msg.writer.writeShort(skill.skillId);
                            msg.writer.writeByte(skill.point);
                            msg.writer.writeLong(skill.powRequire);
                            msg.writer.writeShort(skill.manaUse);
                            msg.writer.writeInt(skill.coolDown);
                            msg.writer.writeShort(skill.dx);
                            msg.writer.writeShort(skill.dy);
                            msg.writer.writeShort(skill.maxFight);
                            msg.writer.writeShort(skill.damage);
                            msg.writer.writeShort(skill.price);
                            msg.writer.writeUTF(skill.moreInfo || "");
                        }
                        // Add skill 105 and 106
                        for (let i = 105; i <= 106; i++) {
                            msg.writer.writeShort(i);
                            msg.writer.writeByte(0);
                            msg.writer.writeLong(0);
                            msg.writer.writeShort(0);
                            msg.writer.writeInt(0);
                            msg.writer.writeShort(0);
                            msg.writer.writeShort(0);
                            msg.writer.writeByte(0);
                            msg.writer.writeShort(0);
                            msg.writer.writeShort(0);
                            msg.writer.writeUTF("");
                        }
                    }
                }
            }
            session.sendMessage(msg);
            msg.cleanup();
            Logger_1.Logger.debug("Sent updateSkill");
        }
        catch (e) {
            Logger_1.Logger.error("Error updating skill: " + e);
        }
    }
    /**
     * Update data (game resources)
     * Java: line 86-117
     * TODO: Implement when update data files are available
     */
    static updateData(session) {
        const msg = new Message_1.Message(-87);
        try {
            msg.writer.writeByte(DataGame.vsData);
            // Read files from data/girlkun/update_data
            const updateDataPath = path.join(DataGame.DATA_PATH, 'update_data');
            const readFile = (filename) => {
                try {
                    return fs.readFileSync(path.join(updateDataPath, filename));
                }
                catch (e) {
                    Logger_1.Logger.error(`Error reading ${filename}: ` + e);
                    return Buffer.alloc(0);
                }
            };
            const dart = readFile('dart');
            const arrow = readFile('arrow');
            const effect = readFile('effect');
            const image = readFile('image');
            const part = readFile('part');
            const skill = readFile('skill');
            // Write length (int) + data (bytes)
            msg.writer.writeInt(dart.length);
            msg.writer.writeBytes(dart);
            msg.writer.writeInt(arrow.length);
            msg.writer.writeBytes(arrow);
            msg.writer.writeInt(effect.length);
            msg.writer.writeBytes(effect);
            msg.writer.writeInt(image.length);
            msg.writer.writeBytes(image);
            msg.writer.writeInt(part.length);
            msg.writer.writeBytes(part);
            msg.writer.writeInt(skill.length);
            msg.writer.writeBytes(skill);
            session.sendMessage(msg);
            msg.cleanup();
            Logger_1.Logger.debug("Sent updateData (loaded from files)");
        }
        catch (e) {
            Logger_1.Logger.error("Error updating data: " + e);
        }
    }
    /**
     * Update item data
     * Java: DataGame.updateItem
     */
    static updateItem(session) {
        const msg = new Message_1.Message(-28);
        try {
            msg.writer.writeByte(8); // Sub command UPDATE_ITEM
            msg.writer.writeByte(DataGame.vsItem);
            const gameData = GameDataLoader_1.GameDataLoader.getInstance();
            const items = gameData.itemTemplates;
            msg.writer.writeShort(items.length);
            for (const item of items) {
                msg.writer.writeShort(item.id);
                msg.writer.writeByte(item.type);
                msg.writer.writeByte(item.gender);
                msg.writer.writeUTF(item.name);
                msg.writer.writeUTF(item.description);
                msg.writer.writeByte(item.level || 0); // Level
                msg.writer.writeInt(item.strRequire); // Power require in code is long, but here int? 
                // Java code: ds.writeInt((int) itemTemplate.strRequire);
                msg.writer.writeShort(item.iconID);
                msg.writer.writeShort(item.part);
                msg.writer.writeBoolean(item.isUpToUp);
            }
            session.sendMessage(msg);
            msg.cleanup();
            Logger_1.Logger.debug(`Sent updateItem (${items.length} items)`);
        }
        catch (e) {
            Logger_1.Logger.error("Error updating item: " + e);
        }
    }
    /**
     * Get map info by ID
     */
    static getMapInfo(mapId) {
        return GameDataLoader_1.GameDataLoader.getInstance().getMap(mapId);
    }
    /**
     * Get NPC info by ID
     */
    static getNPCInfo(npcId) {
        return GameDataLoader_1.GameDataLoader.getInstance().getNPC(npcId);
    }
    /**
     * Get mob info by ID
     */
    static getMobInfo(mobId) {
        return GameDataLoader_1.GameDataLoader.getInstance().getMob(mobId);
    }
}
exports.DataGame = DataGame;
// Version constants (from Java line 38-42)
DataGame.vsData = 80;
DataGame.vsMap = 80;
DataGame.vsSkill = 6;
DataGame.vsItem = 80;
DataGame.vsRes = 752011;
DataGame.DATA_PATH = path.join(process.cwd(), '../data/girlkun');
DataGame.LINK_IP_PORT = "NRO-NodeJS:127.0.0.1:14445:0";
