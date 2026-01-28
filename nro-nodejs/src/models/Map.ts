import { Player } from "./Player";
import { Item } from "./Item";

export class Map {
    public id: number;
    public name: string;
    public planetId: number;
    public tileId: number;
    public bgId: number;
    public bgType: number;
    public type: number;
    public zones: Zone[] = [];

    constructor(id: number, name: string, planetId: number, tileId: number, bgId: number, bgType: number, type: number) {
        this.id = id;
        this.name = name;
        this.planetId = planetId;
        this.tileId = tileId;
        this.bgId = bgId;
        this.bgType = bgType;
        this.type = type;
    }

    public getZone(zoneId: number): Zone | null {
        if (zoneId >= 0 && zoneId < this.zones.length) {
            return this.zones[zoneId];
        }
        return null;
    }
}

export class Zone {
    public id: number;
    public map: Map;
    public players: Player[] = [];
    public items: Item[] = []; // Dropped items
    // public mobs: Mob[] = [];
    // public npcs: Npc[] = [];

    constructor(map: Map, id: number) {
        this.map = map;
        this.id = id;
    }

    public addPlayer(player: Player): void {
        this.players.push(player);
    }

    public removePlayer(player: Player): void {
        const index = this.players.indexOf(player);
        if (index > -1) {
            this.players.splice(index, 1);
        }
    }
}
