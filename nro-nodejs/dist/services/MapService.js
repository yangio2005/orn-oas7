"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MapService = void 0;
const Map_1 = require("../models/map/Map");
const Logger_1 = require("../utils/Logger");
/**
 * MapService - Minimal implementation
 * Manages all game maps
 */
class MapService {
    static getInstance() {
        if (!MapService.instance) {
            MapService.instance = new MapService();
        }
        return MapService.instance;
    }
    static gI() {
        return MapService.getInstance();
    }
    constructor() {
        this.maps = [];
        this.initializeMaps();
    }
    /**
     * Initialize default maps
     * TODO: Load from database or files
     */
    initializeMaps() {
        // Create basic maps (Trái Đất starting maps)
        this.maps.push(new Map_1.Map(0, "Làng Aru", 0, 0, 0, 0, 0));
        this.maps.push(new Map_1.Map(1, "Rừng Aru", 0, 1, 1, 0, 0));
        this.maps.push(new Map_1.Map(2, "Núi Aru", 0, 2, 2, 0, 0));
        // Namek starting maps
        this.maps.push(new Map_1.Map(7, "Làng Moori", 1, 7, 7, 0, 0));
        this.maps.push(new Map_1.Map(8, "Rừng Moori", 1, 8, 8, 0, 0));
        this.maps.push(new Map_1.Map(9, "Núi Moori", 1, 9, 9, 0, 0));
        // Xayda starting maps
        this.maps.push(new Map_1.Map(14, "Làng Kakarot", 2, 14, 14, 0, 0));
        this.maps.push(new Map_1.Map(15, "Rừng Kakarot", 2, 15, 15, 0, 0));
        this.maps.push(new Map_1.Map(16, "Núi Kakarot", 2, 16, 16, 0, 0));
        Logger_1.Logger.info(`✅ Initialized ${this.maps.length} maps`);
    }
    /**
     * Get map by ID
     */
    getMapById(mapId) {
        return this.maps.find(m => m.mapId === mapId) || null;
    }
    /**
     * Get starting map by gender
     */
    getStartingMap(gender) {
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
    getAllMaps() {
        return this.maps;
    }
}
exports.MapService = MapService;
