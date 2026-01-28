import { Map } from "../models/map/Map";
import { Logger } from "../utils/Logger";

/**
 * MapService - Minimal implementation
 * Manages all game maps
 */
export class MapService {
    private static instance: MapService;
    private maps: Map[] = [];

    public static getInstance(): MapService {
        if (!MapService.instance) {
            MapService.instance = new MapService();
        }
        return MapService.instance;
    }

    public static gI(): MapService {
        return MapService.getInstance();
    }

    constructor() {
        this.initializeMaps();
    }

    /**
     * Initialize default maps
     * TODO: Load from database or files
     */
    private initializeMaps(): void {
        // Create basic maps (Trái Đất starting maps)
        this.maps.push(new Map(0, "Làng Aru", 0, 0, 0, 0, 0));
        this.maps.push(new Map(1, "Rừng Aru", 0, 1, 1, 0, 0));
        this.maps.push(new Map(2, "Núi Aru", 0, 2, 2, 0, 0));

        // Namek starting maps
        this.maps.push(new Map(7, "Làng Moori", 1, 7, 7, 0, 0));
        this.maps.push(new Map(8, "Rừng Moori", 1, 8, 8, 0, 0));
        this.maps.push(new Map(9, "Núi Moori", 1, 9, 9, 0, 0));

        // Xayda starting maps
        this.maps.push(new Map(14, "Làng Kakarot", 2, 14, 14, 0, 0));
        this.maps.push(new Map(15, "Rừng Kakarot", 2, 15, 15, 0, 0));
        this.maps.push(new Map(16, "Núi Kakarot", 2, 16, 16, 0, 0));

        Logger.info(`✅ Initialized ${this.maps.length} maps`);
    }

    /**
     * Get map by ID
     */
    public getMapById(mapId: number): Map | null {
        return this.maps.find(m => m.mapId === mapId) || null;
    }

    /**
     * Get starting map by gender
     */
    public getStartingMap(gender: number): Map | null {
        switch (gender) {
            case 0: // Trái Đất
                return this.getMapById(0);
            case 1: // Namek
                return this.getMapById(7);
            case 2: // Xayda
                return this.getMapById(14);
            default:
                return this.getMapById(0);
        }
    }

    /**
     * Get all maps
     */
    public getAllMaps(): Map[] {
        return this.maps;
    }
}
