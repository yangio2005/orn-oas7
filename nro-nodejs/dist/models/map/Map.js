"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Map = void 0;
const Zone_1 = require("./Zone");
/**
 * Map - Minimal implementation
 * Represents a game map
 */
class Map {
    constructor(mapId, mapName, planetId = 0, tileId = 0, bgId = 0, type = 0, bgType = 0) {
        this.zones = [];
        this.mapId = mapId;
        this.mapName = mapName;
        this.planetId = planetId;
        this.tileId = tileId;
        this.bgId = bgId;
        this.type = type;
        this.bgType = bgType;
        // Create default zones (3 zones per map)
        for (let i = 0; i < 3; i++) {
            this.zones.push(new Zone_1.Zone(this, i, 30));
        }
    }
    /**
     * Get available zone (not full)
     */
    getAvailableZone() {
        for (const zone of this.zones) {
            if (!zone.isFullPlayer()) {
                return zone;
            }
        }
        return null;
    }
    /**
     * Get zone by ID
     */
    getZone(zoneId) {
        if (zoneId >= 0 && zoneId < this.zones.length) {
            return this.zones[zoneId];
        }
        return null;
    }
}
exports.Map = Map;
