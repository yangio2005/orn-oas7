"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Zone = exports.Map = void 0;
class Map {
    constructor(id, name, planetId, tileId, bgId, bgType, type) {
        this.zones = [];
        this.id = id;
        this.name = name;
        this.planetId = planetId;
        this.tileId = tileId;
        this.bgId = bgId;
        this.bgType = bgType;
        this.type = type;
    }
    getZone(zoneId) {
        if (zoneId >= 0 && zoneId < this.zones.length) {
            return this.zones[zoneId];
        }
        return null;
    }
}
exports.Map = Map;
class Zone {
    // public mobs: Mob[] = [];
    // public npcs: Npc[] = [];
    constructor(map, id) {
        this.players = [];
        this.items = []; // Dropped items
        this.map = map;
        this.id = id;
    }
    addPlayer(player) {
        this.players.push(player);
    }
    removePlayer(player) {
        const index = this.players.indexOf(player);
        if (index > -1) {
            this.players.splice(index, 1);
        }
    }
}
exports.Zone = Zone;
