import { Session } from "../network/Session";
import { Message } from "../network/Message";
import { Logger } from "../utils/Logger";
import { GameDataLoader } from "./GameDataLoader";
import * as fs from "fs";
import * as path from "path";

/**
 * DataGame - Complete port from Java DataGame.java
 * Handles all game data sending to client
 */
export class DataGame {
    // Version constants (from Java line 38-42)
    public static vsData = 80;
    public static vsMap = 80;
    public static vsSkill = 6;
    public static vsItem = 80;
    public static vsRes = 752011;

    public static LINK_IP_PORT = "Girlkun75-1:14.225.209.71:14445:0";

    /**
     * Send version game info to client
     * Java: line 61-83
     */
    public static sendVersionGame(session: Session): void {
        try {
            const msg = new Message(-28); // messageNotMap
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
        } catch (e) {
            Logger.error("Error sending version game: " + e);
        }
    }

    /**
     * Send data item background to client
     * Java: line 324-335
     */
    public static sendDataItemBG(session: Session): void {
        const msg = new Message(-31); // ITEM_BACKGROUND
        try {
            const gameData = GameDataLoader.getInstance();

            if (gameData.itemBgData) {
                msg.writer.writeBytes(gameData.itemBgData);
                session.sendMessage(msg);
                Logger.debug("Sent item_bg_data to client");
            } else {
                Logger.warn("item_bg_data not loaded, skipping...");
            }
        } catch (e) {
            Logger.error("Error sending item bg: " + e);
        } finally {
            msg.cleanup();
        }
    }

    /**
     * Send tile set info (map tiles) to client
     * Java: line 420-430
     */
    public static sendTileSetInfo(session: Session): void {
        const msg = new Message(-82); // TILE_SET_INFO
        try {
            const gameData = GameDataLoader.getInstance();

            if (gameData.tileSetInfo) {
                msg.writer.writeBytes(gameData.tileSetInfo);
                session.sendMessage(msg);
                Logger.debug("Sent tile_set_info to client");
            } else {
                Logger.warn("tile_set_info not loaded, skipping...");
            }
        } catch (e) {
            Logger.error("Error sending tile set info: " + e);
        } finally {
            msg.cleanup();
        }
    }

    /**
     * Send resource version to client
     * Java: line 534-545
     * Called when client sends CMD -27
     */
    public static sendVersionRes(session: Session): void {
        const msg = new Message(-74);
        try {
            msg.writer.writeByte(0);
            msg.writer.writeInt(DataGame.vsRes); // 752011
            session.sendMessage(msg);
            Logger.debug("Sent version res to client");
        } catch (e) {
            Logger.error("Error sending version res: " + e);
        } finally {
            msg.cleanup();
        }
    }

    /**
     * Send link IP to client
     * Java: line 588-600
     */
    public static sendLinkIP(session: Session): void {
        const msg = new Message(-29);
        try {
            msg.writer.writeByte(2);
            msg.writer.writeUTF(DataGame.LINK_IP_PORT + ",0,0");
            msg.writer.writeByte(1);
            session.sendMessage(msg);
            msg.cleanup();
        } catch (e) {
            Logger.error("Error sending Link IP: " + e);
        }
    }

    /**
     * Send small version (image version)
     * Java: line 378-391
     */
    public static sendSmallVersion(session: Session): void {
        const msg = new Message(-77);
        try {
            const zoomLevel = (session as any).zoomLevel || 1;
            const filePath = path.join(process.cwd(), `data/girlkun/data_img_version/x${zoomLevel}/img_version`);

            if (fs.existsSync(filePath)) {
                const data = fs.readFileSync(filePath);
                msg.writer.writeBytes(data);
            }

            session.sendMessage(msg);
            msg.cleanup();
        } catch (e) {
            Logger.error("Error sending small version: " + e);
        }
    }

    /**
     * Send map template data
     * Java: line 487-501
     */
    public static sendMapTemp(session: Session, id: number): void {
        const msg = new Message(-28);
        try {
            if (id !== 167 && id !== 168) {
                msg.writer.writeByte(10);
            }

            const filePath = path.join(process.cwd(), `data/girlkun/map/tile_map_data/${id}`);
            if (fs.existsSync(filePath)) {
                const data = fs.readFileSync(filePath);
                msg.writer.writeBytes(data);
            }

            session.sendMessage(msg);
            msg.cleanup();
        } catch (e) {
            Logger.error(`Error sending map temp ${id}: ` + e);
        }
    }

    /**
     * Request mob template
     * Java: line 395-418
     */
    public static requestMobTemplate(session: Session, id: number): void {
        const msg = new Message(11);
        try {
            const zoomLevel = (session as any).zoomLevel || 1;
            const filePath = path.join(process.cwd(), `data/girlkun/mob/x${zoomLevel}/${id}`);

            if (id !== 88 && id !== 89 && id !== 85 && id !== 94) {
                msg.writer.writeByte(id);
            }

            if (id === 95) {
                msg.writer.writeByte(0);
            }

            if (fs.existsSync(filePath)) {
                const data = fs.readFileSync(filePath);
                msg.writer.writeBytes(data);
            }

            session.sendMessage(msg);
            msg.cleanup();
        } catch (e) {
            Logger.error(`Error sending mob template ${id}: ` + e);
        }
    }

    /**
     * Send icon to client
     * Java: line 360-376
     */
    public static sendIcon(session: Session, id: number): void {
        const msg = new Message(-67);
        try {
            const zoomLevel = (session as any).zoomLevel || 1;
            const filePath = path.join(process.cwd(), `data/girlkun/icon/x${zoomLevel}/${id}.png`);

            if (fs.existsSync(filePath)) {
                const icon = fs.readFileSync(filePath);
                msg.writer.writeInt(id);
                msg.writer.writeInt(icon.length);
                msg.writer.writeBytes(icon);
            }

            session.sendMessage(msg);
            msg.cleanup();
        } catch (e) {
            Logger.error(`Error sending icon ${id}: ` + e);
        }
    }

    /**
     * Send effect data
     * Java: line 277-306
     */
    public static effData(session: Session, id: number, idTemp?: number): void {
        const msg = new Message(-66);
        try {
            const zoomLevel = (session as any).zoomLevel || 1;
            const idT = idTemp || id;

            const effDataPath = path.join(process.cwd(), `data/girlkun/effect/x${zoomLevel}/data/DataEffect_${idT}`);
            const effImgPath = path.join(process.cwd(), `data/girlkun/effect/x${zoomLevel}/img/ImgEffect_${idT}.png`);

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
        } catch (e) {
            Logger.error(`Error sending effect ${id}: ` + e);
        }
    }

    /**
     * Send item background template
     * Java: line 308-322
     */
    public static sendItemBGTemplate(session: Session, id: number): void {
        const msg = new Message(-32);
        try {
            const zoomLevel = (session as any).zoomLevel || 1;
            const filePath = path.join(process.cwd(), `data/girlkun/item_bg_temp/x${zoomLevel}/${id}.png`);

            if (fs.existsSync(filePath)) {
                const bgTemp = fs.readFileSync(filePath);
                msg.writer.writeShort(id);
                msg.writer.writeInt(bgTemp.length);
                msg.writer.writeBytes(bgTemp);
            }

            session.sendMessage(msg);
            msg.cleanup();
        } catch (e) {
            Logger.error(`Error sending item bg template ${id}: ` + e);
        }
    }

    /**
     * Send image by name
     * Java: line 516-531
     */
    public static sendImageByName(session: Session, imgName: string): void {
        const msg = new Message(66);
        try {
            const zoomLevel = (session as any).zoomLevel || 1;
            const filePath = path.join(process.cwd(), `data/girlkun/img_by_name/x${zoomLevel}/${imgName}.png`);

            msg.writer.writeUTF(imgName);
            msg.writer.writeByte(1); // nFrame - default 1

            if (fs.existsSync(filePath)) {
                const data = fs.readFileSync(filePath);
                msg.writer.writeInt(data.length);
                msg.writer.writeBytes(data);
            } else {
                msg.writer.writeInt(0);
            }

            session.sendMessage(msg);
            msg.cleanup();
        } catch (e) {
            Logger.error(`Error sending image by name ${imgName}: ` + e);
        }
    }

    /**
     * Send data image version
     * Java: line 234-245
     */
    public static sendDataImageVersion(session: Session): void {
        const msg = new Message(-111);
        try {
            const zoomLevel = (session as any).zoomLevel || 1;
            const filePath = path.join(process.cwd(), `data/girlkun/data_img_version/x${zoomLevel}/img_version`);

            if (fs.existsSync(filePath)) {
                const data = fs.readFileSync(filePath);
                msg.writer.writeBytes(data);
            }

            session.sendMessage(msg);
            msg.cleanup();
        } catch (e) {
            Logger.error("Error sending data image version: " + e);
        }
    }

    /**
     * Send size res
     * Java: line 547-558
     */
    public static sendSizeRes(session: Session): void {
        const msg = new Message(-74);
        try {
            const zoomLevel = (session as any).zoomLevel || 1;
            const dirPath = path.join(process.cwd(), `data/girlkun/res/x${zoomLevel}`);

            msg.writer.writeByte(1);

            if (fs.existsSync(dirPath)) {
                const files = fs.readdirSync(dirPath);
                msg.writer.writeShort(files.length);
            } else {
                msg.writer.writeShort(0);
            }

            session.sendMessage(msg);
            msg.cleanup();
        } catch (e) {
            Logger.error("Error sending size res: " + e);
        }
    }

    /**
     * Send res files
     * Java: line 560-586
     */
    public static async sendRes(session: Session): Promise<void> {
        try {
            const zoomLevel = (session as any).zoomLevel || 1;
            const dirPath = path.join(process.cwd(), `data/girlkun/res/x${zoomLevel}`);

            if (!fs.existsSync(dirPath)) {
                Logger.warn(`Res directory not found: ${dirPath}`);
                return;
            }

            const files = fs.readdirSync(dirPath);

            for (const fileName of files) {
                const filePath = path.join(dirPath, fileName);
                const data = fs.readFileSync(filePath);

                const msg = new Message(-74);
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
            const msgComplete = new Message(-74);
            msgComplete.writer.writeByte(3);
            msgComplete.writer.writeInt(DataGame.vsRes);
            session.sendMessage(msgComplete);
            msgComplete.cleanup();
        } catch (e) {
            Logger.error("Error sending res: " + e);
        }
    }

    /**
     * Update map data
     * Java: line 120-152
     */
    public static updateMap(session: Session): void {
        const msg = new Message(-28);
        try {
            msg.writer.writeByte(6); // sub command UPDATE_MAP
            msg.writer.writeByte(DataGame.vsMap);

            const gameData = GameDataLoader.getInstance();

            // Send map templates
            // TODO: Implement when GameDataLoader has getAllMaps
            // const maps = gameData.getAllMaps();
            const maps: any[] = [];
            msg.writer.writeByte(maps.length);
            for (const map of maps) {
                msg.writer.writeUTF(map.name || "");
            }

            // Send NPC templates
            // TODO: Implement when GameDataLoader has getAllNPCs
            // const npcs = gameData.getAllNPCs();
            const npcs: any[] = [];
            msg.writer.writeByte(npcs.length);
            for (const npc of npcs) {
                msg.writer.writeUTF(npc.name || "");
                msg.writer.writeShort(npc.head || 0);
                msg.writer.writeShort(npc.body || 0);
                msg.writer.writeShort(npc.leg || 0);
                msg.writer.writeByte(0);
            }

            // Send mob templates
            // TODO: Implement when GameDataLoader has getAllMobs
            // const mobs = gameData.getAllMobs();
            const mobs: any[] = [];
            msg.writer.writeByte(mobs.length);
            for (const mob of mobs) {
                msg.writer.writeByte(mob.type || 0);
                msg.writer.writeUTF(mob.name || "");
                msg.writer.writeInt(mob.hp || 0);
                msg.writer.writeByte(mob.rangeMove || 0);
                msg.writer.writeByte(mob.speed || 0);
                msg.writer.writeByte(mob.dartType || 0);
            }

            session.sendMessage(msg);
            msg.cleanup();
        } catch (e) {
            Logger.error("Error updating map: " + e);
        }
    }

    /**
     * Update skill data
     * Java: line 155-232
     * TODO: Implement when skill data is available
     */
    public static updateSkill(session: Session): void {
        Logger.warn("updateSkill not implemented yet");
    }

    /**
     * Update data (game resources)
     * Java: line 86-117
     * TODO: Implement when update data files are available
     */
    public static updateData(session: Session): void {
        Logger.warn("updateData not implemented yet");
    }

    /**
     * Get map info by ID
     */
    public static getMapInfo(mapId: number): any {
        return GameDataLoader.getInstance().getMap(mapId);
    }

    /**
     * Get NPC info by ID
     */
    public static getNPCInfo(npcId: number): any {
        return GameDataLoader.getInstance().getNPC(npcId);
    }

    /**
     * Get mob info by ID
     */
    public static getMobInfo(mobId: number): any {
        return GameDataLoader.getInstance().getMob(mobId);
    }
}
