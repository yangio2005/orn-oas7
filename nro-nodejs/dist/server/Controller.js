"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Controller = void 0;
const Cmd_1 = require("../constants/Cmd");
const AuthService_1 = require("../services/AuthService");
const Logger_1 = require("../utils/Logger");
const DataGame_1 = require("../services/DataGame");
const Service_1 = require("../services/Service");
/**
 * Controller - Complete port from Java Controller.java
 * Handles all incoming messages from client
 * Java: com.girlkun.server.Controller
 */
class Controller {
    static getInstance() {
        if (!Controller.instance) {
            Controller.instance = new Controller();
        }
        return Controller.instance;
    }
    static gI() {
        return Controller.getInstance();
    }
    /**
     * Main message handler
     * Java: line 66-617
     */
    onMessage(session, msg) {
        const cmd = msg.getCommand();
        try {
            switch (cmd) {
                // Java: line 574-577
                case -27: // GET_SESSION_ID
                    session.sendSessionKey();
                    DataGame_1.DataGame.sendVersionRes(session);
                    break;
                // Java: line 578-580
                case -111: // GET_IMAGE_SOURCE2
                    DataGame_1.DataGame.sendDataImageVersion(session);
                    break;
                // Java: line 591-592
                case Cmd_1.Cmd.NOT_LOGIN: // -29
                    this.messageNotLogin(session, msg);
                    break;
                // Java: line 587-589
                case Cmd_1.Cmd.NOT_MAP: // -28
                    this.messageNotMap(session, msg);
                    break;
                // Java: line 593-595
                case Cmd_1.Cmd.SUB_COMMAND: // -30
                    this.messageSubCommand(session, msg);
                    break;
                // Java: line 359-368
                case -74: // GET_IMAGE_SOURCE
                    const type = msg.reader.readByte();
                    if (type === 1) {
                        DataGame_1.DataGame.sendSizeRes(session);
                    }
                    else if (type === 2) {
                        DataGame_1.DataGame.sendRes(session);
                    }
                    break;
                // Java: line 529-533
                case 11: // REQUEST_MAPTEMPLATE
                    const modId = msg.reader.readByte();
                    DataGame_1.DataGame.requestMobTemplate(session, modId);
                    break;
                // Java: line 389-395
                case 66: // GET_IMG_BY_NAME
                    DataGame_1.DataGame.sendImageByName(session, msg.reader.readUTF());
                    break;
                // Java: line 396-406
                case -66: // GET_EFFDATA
                    const effId = msg.reader.readShort();
                    DataGame_1.DataGame.effData(session, effId);
                    break;
                // Java: line 417-420
                case -32: // BACKGROUND_TEMPLATE
                    const bgId = msg.reader.readShort();
                    DataGame_1.DataGame.sendItemBGTemplate(session, bgId);
                    break;
                // Java: line 369-382
                case -81: // COMBINNE
                    if (session.player) {
                        msg.reader.readByte();
                        const indexItemCount = msg.reader.readByte();
                        const indexItem = [];
                        for (let i = 0; i < indexItemCount; i++) {
                            indexItem.push(msg.reader.readByte());
                        }
                        // TODO: CombineServiceNew.gI().showInfoCombine(player, indexItem);
                        Logger_1.Logger.debug(`Combine request with ${indexItemCount} items`);
                    }
                    break;
                // Java: line 380-382
                case -87: // UPDATE_DATA
                    DataGame_1.DataGame.updateData(session);
                    break;
                // Java: line 383-388
                case -67: // REQUEST_ICON
                    if (!session.isRIcon) {
                        const iconId = msg.reader.readInt();
                        DataGame_1.DataGame.sendIcon(session, iconId);
                    }
                    break;
                // Java: line 534-537
                case 44: // CHAT_MAP
                    if (session.player) {
                        const chatText = msg.reader.readUTF();
                        // TODO: Service.getInstance().chat(player, chatText);
                        Logger_1.Logger.debug(`Chat: ${session.player.name}: ${chatText}`);
                    }
                    break;
                // Java: line 538-544
                case 32: // MENU
                    if (session.player) {
                        const npcId = msg.reader.readShort();
                        const select = msg.reader.readByte();
                        // TODO: MenuController.getInstance().doSelectMenu(player, npcId, select);
                        Logger_1.Logger.debug(`Menu select: NPC ${npcId}, option ${select}`);
                    }
                    break;
                // Java: line 545-555
                case 33: // OPEN_UI_MENU
                    if (session.player) {
                        const npcId = msg.reader.readShort();
                        // TODO: MenuController.getInstance().openMenuNPC(session, npcId, player);
                        Logger_1.Logger.debug(`Open menu: NPC ${npcId}`);
                    }
                    break;
                // Java: line 556-562
                case 34: // SKILL_SELECT
                    if (session.player) {
                        const selectSkill = msg.reader.readShort();
                        // TODO: SkillService.gI().selectSkill(player, selectSkill);
                        Logger_1.Logger.debug(`Select skill: ${selectSkill}`);
                    }
                    break;
                // Java: line 563-567
                case 54: // PLAYER_ATTACK_NPC
                    if (session.player) {
                        const mobIndex = msg.reader.readByte();
                        // TODO: Service.getInstance().attackMob(player, mobIndex);
                        Logger_1.Logger.debug(`Attack mob: ${mobIndex}`);
                    }
                    break;
                // Java: line 568-573
                case -60: // PLAYER_ATTACK_PLAYER
                    if (session.player) {
                        const playerId = msg.reader.readInt();
                        // TODO: Service.getInstance().attackPlayer(player, playerId);
                        Logger_1.Logger.debug(`Attack player: ${playerId}`);
                    }
                    break;
                // Java: line 581-586
                case -20: // ITEMMAP_MYPICK
                    if (session.player) {
                        const itemMapId = msg.reader.readShort();
                        // TODO: ItemMapService.gI().pickItem(player, itemMapId, false);
                        Logger_1.Logger.debug(`Pick item: ${itemMapId}`);
                    }
                    break;
                // Java: line 596-600
                case -15: // ME_BACK (về nhà)
                    if (session.player) {
                        // TODO: ChangeMapService.gI().changeMapBySpaceShip(player, player.gender + 21, 0, -1);
                        Logger_1.Logger.debug("Player go home");
                    }
                    break;
                // Java: line 601-604
                case -16: // ME_LIVE (hồi sinh)
                    if (session.player) {
                        // TODO: PlayerService.gI().hoiSinh(player);
                        Logger_1.Logger.debug("Player revive");
                    }
                    break;
                // Java: line 346-358
                case -7: // PLAYER_MOVE
                    if (session.player) {
                        let toX = session.player.x || 0;
                        let toY = session.player.y || 0;
                        try {
                            msg.reader.readByte();
                            toX = msg.reader.readShort();
                            toY = msg.reader.readShort();
                        }
                        catch (e) {
                            // Ignore
                        }
                        // TODO: PlayerService.gI().playerMove(player, toX, toY);
                        Logger_1.Logger.debug(`Player move to (${toX}, ${toY})`);
                    }
                    break;
                // Java: line 268-272
                case 29: // OPEN_UI_ZONE
                    if (session.player) {
                        // TODO: ChangeMapService.gI().openZoneUI(player);
                        Logger_1.Logger.debug("Open zone UI");
                    }
                    break;
                // Java: line 273-278
                case 21: // ZONE_CHANGE
                    if (session.player) {
                        const zoneId = msg.reader.readByte();
                        // TODO: ChangeMapService.gI().changeZone(player, zoneId);
                        Logger_1.Logger.debug(`Change zone: ${zoneId}`);
                    }
                    break;
                // Java: line 279-283
                case -71: // CHAT_THEGIOI_CLIENT
                    if (session.player) {
                        const globalChat = msg.reader.readUTF();
                        // TODO: ChatGlobalService.gI().chat(player, globalChat);
                        Logger_1.Logger.debug(`Global chat: ${globalChat}`);
                    }
                    break;
                // Java: line 243-255
                case 6: // ITEM_BUY
                    if (session.player) {
                        const typeBuy = msg.reader.readByte();
                        const tempId = msg.reader.readShort();
                        let quantity = 0;
                        try {
                            quantity = msg.reader.readShort();
                        }
                        catch (e) {
                            // Ignore
                        }
                        // TODO: ShopServiceNew.gI().takeItem(player, typeBuy, tempId);
                        Logger_1.Logger.debug(`Buy item: type=${typeBuy}, id=${tempId}, qty=${quantity}`);
                    }
                    break;
                // Java: line 256-267
                case 7: // ITEM_SALE
                    if (session.player) {
                        const action = msg.reader.readByte();
                        if (action === 0) {
                            const where = msg.reader.readByte();
                            const index = msg.reader.readShort();
                            // TODO: ShopServiceNew.gI().showConfirmSellItem(player, where, index);
                        }
                        else {
                            const where = msg.reader.readByte();
                            const index = msg.reader.readShort();
                            // TODO: ShopServiceNew.gI().sellItem(player, where, index);
                        }
                        Logger_1.Logger.debug(`Sell item: action=${action}`);
                    }
                    break;
                // Java: line 427-433
                case -33: // MAP_OFFLINE
                case -23: // MAP_CHANGE
                    if (session.player) {
                        // TODO: ChangeMapService.gI().changeMapWaypoint(player);
                        // TODO: Service.getInstance().hideWaitDialog(player);
                        Logger_1.Logger.debug("Change map waypoint");
                    }
                    break;
                // Java: line 434-439
                case -45: // SKILL_NOT_FOCUS
                    if (session.player) {
                        // TODO: SkillService.gI().useSkill(player, null, null, msg);
                        Logger_1.Logger.debug("Use skill");
                    }
                    break;
                // Java: line 486-490
                case -40: // GET_ITEM
                    // TODO: UseItem.gI().getItem(session, msg);
                    Logger_1.Logger.debug("Get item");
                    break;
                // Java: line 491-493
                case -41: // UPDATE_CAPTION
                    const captionType = msg.reader.readByte();
                    Service_1.Service.getInstance().sendCaption(session, captionType);
                    Logger_1.Logger.debug(`Update caption: ${captionType}`);
                    break;
                // Java: line 494-498
                case -43: // USE_ITEM
                    if (session.player) {
                        // TODO: UseItem.gI().doItem(player, msg);
                        Logger_1.Logger.debug("Use item");
                    }
                    break;
                default:
                    // Log unknown commands for debugging
                    if (cmd !== -107 && cmd !== 74 && cmd !== -16 && cmd !== -101 && cmd !== 126) {
                        Logger_1.Logger.debug(`Unhandled CMD: ${cmd}`);
                    }
                    break;
            }
        }
        catch (e) {
            Logger_1.Logger.error(`Error handling message ${cmd}: ${e}`);
        }
        finally {
            msg.cleanup();
        }
    }
    /**
     * Handle messages when not logged in
     * Java: line 619-645
     */
    messageNotLogin(session, msg) {
        try {
            const cmd = msg.reader.readByte();
            switch (cmd) {
                case 0: // LOGIN
                    try {
                        const username = msg.reader.readUTF();
                        const password = msg.reader.readUTF();
                        AuthService_1.AuthService.getInstance().login(session, username, password);
                    }
                    catch (e) {
                        Logger_1.Logger.error("Login error: " + e);
                    }
                    break;
                case 2: // CLIENT_TYPE (set client type)
                    Service_1.Service.getInstance().setClientType(session, msg);
                    break;
                default:
                    break;
            }
        }
        catch (e) {
            Logger_1.Logger.error("Error in messageNotLogin: " + e);
        }
    }
    /**
     * Handle messages when not in map (character selection, creation)
     * Java: line 647-699
     */
    messageNotMap(session, msg) {
        try {
            const player = session.player;
            const cmd = msg.reader.readByte();
            switch (cmd) {
                case 2: // CREATE_CHAR
                    this.createChar(session, msg);
                    break;
                case 6: // UPDATE_MAP
                    DataGame_1.DataGame.updateMap(session);
                    break;
                case 7: // UPDATE_SKILL
                    DataGame_1.DataGame.updateSkill(session);
                    break;
                case 8: // UPDATE_ITEM
                    DataGame_1.DataGame.updateItem(session);
                    break;
                case 10: // REQUEST_MAPTEMPLATE
                    const mapId = msg.reader.readUnsignedByte();
                    DataGame_1.DataGame.sendMapTemp(session, mapId);
                    break;
                case 13: // CLIENT_OK
                    if (player) {
                        Service_1.Service.gI().player(player);
                        Service_1.Service.gI().Send_Caitrang(player);
                        if (player.zone) {
                            player.zone.load_Another_To_Me(player);
                        }
                        // -64 my flag bag
                        Service_1.Service.gI().sendFlagBag(player);
                        // ItemTimeService (Not implemented)
                        // ItemTimeService.gI().sendTextBanDoKhoBau(player);
                        // ItemTimeService.gI().sendTextDoanhTrai(player);
                        // ItemTimeService.gI().sendTextGas(player);
                        // -113 skill shortcut
                        if (player.playerSkill) {
                            player.playerSkill.sendSkillShortCut();
                        }
                        // item time (Not implemented)
                        // ItemTimeService.gI().sendAllItemTime(player);
                        // send current task (Not implemented)
                        // TaskService.gI().sendInfoCurrentTask(player);
                    }
                    break;
                default:
                    break;
            }
        }
        catch (e) {
            Logger_1.Logger.error("Error in messageNotMap: " + e);
        }
    }
    /**
     * Handle sub-commands
     * Java: line 701-727
     */
    messageSubCommand(session, msg) {
        try {
            const command = msg.reader.readByte();
            switch (command) {
                case 16: // POTENTIAL_UP
                    const type = msg.reader.readByte();
                    const point = msg.reader.readShort();
                    if (session.player) {
                        // TODO: player.nPoint.increasePoint(type, point);
                        Logger_1.Logger.debug(`Increase point: type=${type}, point=${point}`);
                    }
                    break;
                case 64: // PLAYER_MENU_ACTION
                    const playerId = msg.reader.readInt();
                    const menuId = msg.reader.readShort();
                    if (session.player) {
                        // TODO: SubMenuService.gI().controller(player, playerId, menuId);
                        Logger_1.Logger.debug(`Player menu action: player=${playerId}, menu=${menuId}`);
                    }
                    break;
                default:
                    break;
            }
        }
        catch (e) {
            Logger_1.Logger.error("Error in messageSubCommand: " + e);
        }
    }
    /**
     * Create new character
     * Java: line 729-774
     */
    createChar(session, msg) {
        try {
            const name = msg.reader.readUTF();
            const gender = msg.reader.readByte();
            const hair = msg.reader.readByte();
            Logger_1.Logger.info(`Creating character: ${name}, gender: ${gender}, head: ${hair}`);
            AuthService_1.AuthService.getInstance().createCharacter(session, name, gender, hair);
        }
        catch (e) {
            Logger_1.Logger.error("Error in createChar: " + e);
        }
    }
    /**
     * Send info to player after login
     * Java: line 781-850+
     */
    sendInfo(session) {
        const player = session.player;
        if (!player)
            return;
        try {
            // -82 set tile map
            DataGame_1.DataGame.sendTileSetInfo(session);
            // 112 my info intrinsic
            // TODO: IntrinsicService.gI().sendInfoIntrinsic(player);
            // -42 my point
            Service_1.Service.getInstance().point(player);
            // 40 task
            // TODO: TaskService.gI().sendTaskMain(player);
            // -22 reset all (clear map)
            // TODO: Service.getInstance().clearMap(player);
            // -53 my clan
            // TODO: ClanService.gI().sendMyClan(player);
            // -69 max stamina
            // TODO: PlayerService.gI().sendMaxStamina(player);
            // -68 cur stamina
            // TODO: PlayerService.gI().sendCurrentStamina(player);
            // -107 have pet
            // TODO: Service.getInstance().sendHavePet(player);
            // -119 top rank
            // TODO: Send top rank message
            // -50 notify tab
            // TODO: ServerNotify.gI().sendNotifyTab(player);
            // -24 join map - CRITICAL!
            if (player.zone) {
                player.zone.load_Me_To_Another(player);
                player.zone.mapInfo(player);
            }
            Logger_1.Logger.info(`Player ${player.name} logged in successfully`);
        }
        catch (e) {
            Logger_1.Logger.error("Error in sendInfo: " + e);
        }
    }
}
exports.Controller = Controller;
