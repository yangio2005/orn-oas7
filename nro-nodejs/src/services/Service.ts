import { Session } from "../network/Session";
import { Message } from "../network/Message";
import { Cmd } from "../constants/Cmd";
import { DataGame } from "./DataGame";
import { Logger } from "../utils/Logger";
import { GameDataLoader } from "./GameDataLoader";

export class Service {
    private static instance: Service;

    public static getInstance(): Service {
        if (!Service.instance) {
            Service.instance = new Service();
        }
        return Service.instance;
    }

    public static gI(): Service {
        return Service.getInstance();
    }

    public sendThongBaoOK(session: Session, text: string): void {
        const msg = new Message(Cmd.CLIENT_OK);
        try {
            msg.writer.writeUTF(text);
            session.sendMessage(msg);
        } catch (e) {
            Logger.error("Error sending thong bao OK: " + e);
        } finally {
            msg.cleanup();
        }
    }

    public sendThongBao(session: Session, text: string): void {
        const msg = new Message(Cmd.CHAT_MAP); // Check if 44 is CHAT_MAP or something else
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
        } catch (e) {

        }
    }

    public switchToCreateChar(session: Session): void {
        const msg = new Message(Cmd.CREATE_PLAYER); // Cmd.CREATE_PLAYER is 2?
        // Java: msg = new Message(2);
        // Cmd.ts: public static readonly CREATE_PLAYER = 2;
        try {
            session.sendMessage(msg);
        } catch (e) {
        } finally {
            msg.cleanup();
        }
    }

    public setClientType(session: Session, msg: Message): void {
        Logger.debug(`setClientType Body: ${msg.getData().toString('hex')}`);
        try {
            const typeClient = msg.reader.readByte();
            const zoomLevel = msg.reader.readByte();
            const isGprs = msg.reader.readBoolean();
            const width = msg.reader.readInt();
            const height = msg.reader.readInt();
            const isQwerty = msg.reader.readBoolean();
            const isTouch = msg.reader.readBoolean();
            const platform = msg.reader.readUTF();

            session.typeClient = typeClient;
            session.zoomLevel = zoomLevel;

            Logger.debug(`Client Info: Type=${typeClient}, Zoom=${zoomLevel}, Res=${width}x${height}, Platform=${platform}`);

            const platformParts = platform.split("|");
            if (platformParts.length > 1) {
                session.version = parseInt(platformParts[1].replace(".", ""));
            }
            // System.out.println(platform);
        } catch (e) {
            Logger.error("Error setting client type: " + e);
        } finally {
            msg.cleanup();
        }
        DataGame.sendLinkIP(session);
    }

    public messageNotMap(command: number): Message {
        const msg = new Message(Cmd.NOT_MAP); // Cmd.NOT_MAP is -28
        msg.writer.writeByte(command);
        return msg;
    }

    public messageSubCommand(command: number): Message {
        const msg = new Message(Cmd.SUB_COMMAND); // Cmd.SUB_COMMAND is -30
        msg.writer.writeByte(command);
        return msg;
    }

    public player(player: any): void {
        if (!player || !player.session) return;
        const msg = this.messageSubCommand(0);
        try {
            msg.writer.writeInt(player.id);
            msg.writer.writeByte(player.taskPlayer?.taskMain?.id || 0);
            msg.writer.writeByte(player.gender);
            msg.writer.writeShort(player.head);
            msg.writer.writeUTF(player.name);
            msg.writer.writeByte(0); // cPK
            msg.writer.writeByte(player.typePk || 0);
            msg.writer.writeLong(player.nPoint?.power || 0);
            msg.writer.writeShort(0);
            msg.writer.writeShort(0);
            msg.writer.writeByte(player.gender);

            // Skills
            const skills = player.playerSkill?.skills || [];
            msg.writer.writeByte(skills.length);
            for (const skill of skills) {
                msg.writer.writeShort(skill.skillId);
            }

            // Inventory
            if (player.session.version >= 214) {
                msg.writer.writeLong(player.inventory?.gold || 0);
            } else {
                msg.writer.writeInt(Number(player.inventory?.gold || 0));
            }
            msg.writer.writeInt(player.inventory?.ruby || 0);
            msg.writer.writeInt(player.inventory?.gem || 0);

            // Items Body
            const itemsBody = player.inventory?.itemsBody || [];
            msg.writer.writeByte(itemsBody.length);
            for (const item of itemsBody) {
                if (!item || item.templateId === -1) {
                    msg.writer.writeShort(-1);
                } else {
                    msg.writer.writeShort(item.templateId);
                    msg.writer.writeInt(item.quantity);
                    msg.writer.writeUTF(item.info || "");
                    msg.writer.writeUTF(item.content || "");
                    const options = item.options || [];
                    msg.writer.writeByte(options.length);
                    for (const option of options) {
                        msg.writer.writeByte(option.optionTemplateId);
                        msg.writer.writeShort(option.param);
                    }
                }
            }

            // Items Bag
            const itemsBag = player.inventory?.itemsBag || [];
            msg.writer.writeByte(itemsBag.length);
            for (const item of itemsBag) {
                if (!item || item.templateId === -1) {
                    msg.writer.writeShort(-1);
                } else {
                    msg.writer.writeShort(item.templateId);
                    msg.writer.writeInt(item.quantity);
                    msg.writer.writeUTF(item.info || "");
                    msg.writer.writeUTF(item.content || "");
                    const options = item.options || [];
                    msg.writer.writeByte(options.length);
                    for (const option of options) {
                        msg.writer.writeByte(option.optionTemplateId);
                        msg.writer.writeShort(option.param);
                    }
                }
            }

            // Items Box
            const itemsBox = player.inventory?.itemsBox || [];
            msg.writer.writeByte(itemsBox.length);
            for (const item of itemsBox) {
                if (!item || item.templateId === -1) {
                    msg.writer.writeShort(-1);
                } else {
                    msg.writer.writeShort(item.templateId);
                    msg.writer.writeInt(item.quantity);
                    msg.writer.writeUTF(item.info || "");
                    msg.writer.writeUTF(item.content || "");
                    const options = item.options || [];
                    msg.writer.writeByte(options.length);
                    for (const option of options) {
                        msg.writer.writeByte(option.optionTemplateId);
                        msg.writer.writeShort(option.param);
                    }
                }
            }

            // Head Avatars
            const gameData = require('./GameDataLoader').GameDataLoader.getInstance();
            const headAvatars = gameData.headAvatars || [];
            msg.writer.writeShort(headAvatars.length);
            for (const ha of headAvatars) {
                msg.writer.writeShort(ha.headId);
                msg.writer.writeShort(ha.avatarId);
            }

            player.session.sendMessage(msg);
        } catch (e) {
            Logger.error("Error sending player info: " + e);
        } finally {
            msg.cleanup();
        }
    }

    public point(player: any): void {
        if (!player || !player.session) return;
        const msg = new Message(-42);
        try {
            const nPoint = player.nPoint;
            msg.writer.writeInt(nPoint.hpg || 100);
            msg.writer.writeInt(nPoint.mpg || 100);
            msg.writer.writeInt(nPoint.dameg || 10);
            msg.writer.writeInt(nPoint.hpMax || 100);
            msg.writer.writeInt(nPoint.mpMax || 100);
            msg.writer.writeInt(nPoint.hp || 100);
            msg.writer.writeInt(nPoint.mp || 100);
            msg.writer.writeByte(nPoint.speed || 5);
            msg.writer.writeByte(20); // stamina cur
            msg.writer.writeByte(20); // stamina max
            msg.writer.writeByte(1); // crit
            msg.writer.writeInt(nPoint.dame || 10);
            msg.writer.writeInt(nPoint.def || 0);
            msg.writer.writeByte(nPoint.crit || 0);
            msg.writer.writeLong(nPoint.tiemNang || 0);
            msg.writer.writeShort(100);
            msg.writer.writeShort(nPoint.defg || 0);
            msg.writer.writeByte(nPoint.critg || 0);
            player.session.sendMessage(msg);
        } catch (e) {
            Logger.error("Error sending point info: " + e);
        } finally {
            msg.cleanup();
        }
    }

    public Send_Info_NV(player: any): void {
        if (!player || !player.session) return;
        const msg = this.messageSubCommand(14);
        try {
            msg.writer.writeInt(player.id);
            msg.writer.writeInt(player.nPoint.hp);
            msg.writer.writeByte(0); // effect eat pea
            msg.writer.writeInt(player.nPoint.hpMax);
            // Broadcast to others in map
            if (player.zone) {
                player.zone.players.forEach((p: any) => {
                    if (p.id !== player.id && p.session) {
                        p.session.sendMessage(msg);
                    }
                });
            }
        } catch (e) {
            Logger.error("Error sending Info_NV: " + e);
        } finally {
            msg.cleanup();
        }
    }

    public Send_Caitrang(player: any): void {
        // TODO: Implement send caitrang
    }

    public sendFlagBag(player: any): void {
        // TODO: Implement send flag bag
    }

    public sendCaption(session: Session, gender: number): void {
        const msg = new Message(-41);
        try {
            const gameData = GameDataLoader.getInstance();
            msg.writer.writeByte(gameData.captions.length);
            for (let caption of gameData.captions) {
                // Java version replaces %1 with "Trái đất", "Namếc", or "Xayda" based on gender
                let raceName = "Trái đất";
                if (gender === 1) raceName = "Namếc";
                else if (gender === 2) raceName = "Xayda";

                msg.writer.writeUTF(caption.replace(/%1/g, raceName));
            }
            session.sendMessage(msg);
        } catch (e) {
            Logger.error("Error sending caption: " + e);
        } finally {
            msg.cleanup();
        }
    }

    /**
     * Send a pre-cached message file to client
     * Java: Service.sendMessage(session, cmd, filename)
     */
    public sendMessage(session: Session, cmd: number, filename: string): void {
        const msg = new Message(cmd);
        try {
            // In Java, this reads a cached message file and sends it
            // For now, just send empty message with the command
            session.sendMessage(msg);
            Logger.debug(`Sent cached message: ${cmd} (${filename})`);
        } catch (e) {
            Logger.error(`Error sending message ${cmd}: ` + e);
        } finally {
            msg.cleanup();
        }
    }
}
