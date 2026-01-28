import { Zone } from "./Zone";

/**
 * Map - Minimal implementation
 * Represents a game map
 */
export class Map {
    public mapId: number;
    public mapName: string;
    public planetId: number;
    public tileId: number;
    public bgId: number;
    public type: number;
    public bgType: number;
    public zones: Zone[] = [];

    constructor(
        mapId: number,
        mapName: string,
        planetId: number = 0,
        tileId: number = 0,
        bgId: number = 0,
        type: number = 0,
        bgType: number = 0
    ) {
        this.mapId = mapId;
        this.mapName = mapName;
        this.planetId = planetId;
        this.tileId = tileId;
        this.bgId = bgId;
        this.type = type;
        this.bgType = bgType;

        // Create default zones (3 zones per map)
        for (let i = 0; i < 3; i++) {
            this.zones.push(new Zone(this, i, 30));
        }
    }

    /**
     * Get available zone (not full)
     */
    public getAvailableZone(): Zone | null {
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
    public getZone(zoneId: number): Zone | null {
        if (zoneId >= 0 && zoneId < this.zones.length) {
            return this.zones[zoneId];
        }
        return null;
    }
}
