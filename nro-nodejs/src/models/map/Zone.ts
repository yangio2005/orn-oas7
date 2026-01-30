import { Message } from "../../network/Message";
import { Logger } from "../../utils/Logger";
import { Player } from "../Player";

/**
 * Zone - Minimal implementation
 * Represents a zone (khu) within a map
 */
export class Zone {
    public map: any; // Map reference
    public zoneId: number;
    public maxPlayer: number = 30;
    public players: Player[] = [];
    public mobs: any[] = [];
    public items: any[] = [];

    constructor(map: any, zoneId: number, maxPlayer: number = 30) {
        this.map = map;
        this.zoneId = zoneId;
        this.maxPlayer = maxPlayer;
    }

    public isFullPlayer(): boolean {
        return this.players.length >= this.maxPlayer;
    }

    public addPlayer(player: any): void {
        if (!this.players.includes(player)) {
            this.players.push(player);
            player.zone = this;
        }
    }

    public removePlayer(player: any): void {
        const index = this.players.indexOf(player);
        if (index > -1) {
            this.players.splice(index, 1);
        }
    }



    /**
     * Send map info to player
     * Java: Zone.mapInfo() line 588-691
     * This is CRITICAL for player to enter map!
     */
    public mapInfo(player: any): void {
        const msg = new Message(-24); // MAP_INFO
        try {
            // Map basic info
            msg.writer.writeByte(this.map.mapId);
            msg.writer.writeByte(this.map.planetId || 0);
            msg.writer.writeByte(this.map.tileId || 0);
            msg.writer.writeByte(this.map.bgId || 0);
            msg.writer.writeByte(this.map.type || 0);
            msg.writer.writeUTF(this.map.mapName || "Unknown Map");
            msg.writer.writeByte(this.zoneId);

            // Player position
            msg.writer.writeShort(player.x || 100);
            msg.writer.writeShort(player.y || 100);

            // Waypoints (empty for now)
            msg.writer.writeByte(0);

            // Mobs (empty for now)
            msg.writer.writeByte(0);
            msg.writer.writeByte(0);

            // NPCs (empty for now)
            msg.writer.writeByte(0);

            // Items on map (empty for now)
            msg.writer.writeByte(0);

            // BG item data (empty)
            msg.writer.writeShort(0);

            // Eff item data (empty)
            msg.writer.writeShort(0);

            // BG type
            msg.writer.writeByte(this.map.bgType || 0);

            // Space ship ID
            msg.writer.writeByte(0);

            // Unknown byte
            msg.writer.writeByte(0);

            player.session.sendMessage(msg);
            msg.cleanup();

            Logger.info(`✅ Sent mapInfo to player ${player.name}: Map ${this.map.mapId}, Zone ${this.zoneId}`);
        } catch (e) {
            Logger.error("Error sending mapInfo: " + e);
            msg.cleanup();
        }
    }

    public getNumOfPlayers(): number {
        return this.players.length;
    }

    /**
     * Load player info to other players in zone
     * Java: Zone.load_Me_To_Another() line 431-454
     */
    public load_Me_To_Another(player: any): void {
        try {
            this.players.forEach(pl => {
                if (pl !== player) {
                    this.infoPlayer(pl, player);
                }
            });
        } catch (e) {
            Logger.error("Error in load_Me_To_Another: " + e);
        }
    }

    /**
     * Load other players to this player
     * Java: Zone.load_Another_To_Me() line 456-476
     */
    public load_Another_To_Me(player: any): void {
        try {
            this.players.forEach(pl => {
                if (pl !== player) {
                    this.infoPlayer(player, pl);
                }
            });
        } catch (e) {
            Logger.error("Error in load_Another_To_Me: " + e);
        }
    }

    /**
     * Send player info (Message -5)
     * Java: Zone.infoPlayer() line 501
     */
    public infoPlayer(plReceive: any, plInfo: any): void {
        if (!plReceive.session) return;

        const msg = new Message(-5);
        try {
            msg.writer.writeInt(plInfo.id);

            // Clan (not implemented yet)
            msg.writer.writeInt(-1);

            // Level (not implemented yet, default 0?)
            msg.writer.writeByte(0); // Service.getCurrLevel(plInfo)

            msg.writer.writeBoolean(false); // java: false
            msg.writer.writeByte(plInfo.typePk || 0); // typePk
            msg.writer.writeByte(plInfo.gender);
            msg.writer.writeByte(plInfo.gender);
            msg.writer.writeShort(plInfo.head);
            msg.writer.writeUTF(plInfo.name);
            msg.writer.writeInt(plInfo.hp);
            msg.writer.writeInt(plInfo.hpMax || plInfo.hp); // hpMax
            msg.writer.writeShort(plInfo.body);
            msg.writer.writeShort(plInfo.leg);
            msg.writer.writeByte(plInfo.flagBag || 0); // flagBag
            msg.writer.writeByte(-1); // java: -1
            msg.writer.writeShort(plInfo.x);
            msg.writer.writeShort(plInfo.y);
            msg.writer.writeShort(0); // java: 0
            msg.writer.writeShort(0); // java: 0

            msg.writer.writeByte(0); // java: 0

            msg.writer.writeByte(0); // iDMark.getIdSpaceShip() (default 0)

            msg.writer.writeByte(0); // effectSkill.isMonkey (default 0)
            msg.writer.writeShort(-1); // mount (default -1)
            msg.writer.writeByte(0); // cFlag (default 0)
            msg.writer.writeByte(0); // java: 0

            // Aura/Eff (java: if !pet && !boss && admin -> writeShort(-1), writeByte(-1))
            // We'll write defaults for now
            msg.writer.writeShort(-1);
            msg.writer.writeByte(-1);

            plReceive.session.sendMessage(msg);
        } catch (e) {
            Logger.error("Error in infoPlayer: " + e);
        } finally {
            msg.cleanup();
        }
    }
}

