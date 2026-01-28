import * as fs from 'fs';
import * as path from 'path';
import { Logger } from '../utils/Logger';

/**
 * GameDataLoader - Load all game data from files
 * Data location: data/girlkun/
 */
export class GameDataLoader {
    private static instance: GameDataLoader;
    private dataPath: string;

    // Game data storage
    public maps: any[] = [];
    public items: any[] = [];
    public npcs: any[] = [];
    public mobs: any[] = [];
    public skills: any[] = [];
    public tileSetInfo: any = null;
    public itemBgData: any = null;

    private constructor() {
        // Path to data folder (relative to project root)
        this.dataPath = path.join(__dirname, '../../../data/girlkun');
    }

    public static getInstance(): GameDataLoader {
        if (!GameDataLoader.instance) {
            GameDataLoader.instance = new GameDataLoader();
        }
        return GameDataLoader.instance;
    }

    /**
     * Load all game data
     */
    public async loadAll(): Promise<void> {
        Logger.info('📦 Loading game data from files...\n');

        try {
            await this.loadTileSetInfo();
            await this.loadItemBgData();
            await this.loadMaps();
            await this.loadNPCs();
            await this.loadMobs();

            Logger.info('\n✅ All game data loaded successfully!');
            this.printSummary();
        } catch (error) {
            Logger.error('❌ Failed to load game data:', error);
            throw error;
        }
    }

    /**
     * Load tile set info (map tiles)
     */
    private async loadTileSetInfo(): Promise<void> {
        try {
            const filePath = path.join(this.dataPath, 'map', 'tile_set_info');

            if (!fs.existsSync(filePath)) {
                Logger.warn('⚠️  tile_set_info not found, skipping...');
                return;
            }

            const data = fs.readFileSync(filePath);
            this.tileSetInfo = data;

            Logger.info(`✅ Loaded tile_set_info (${data.length} bytes)`);
        } catch (error) {
            Logger.error('Failed to load tile_set_info:', error);
        }
    }

    /**
     * Load item background data
     */
    private async loadItemBgData(): Promise<void> {
        try {
            const filePath = path.join(this.dataPath, 'item_bg_temp', 'item_bg_data');

            if (!fs.existsSync(filePath)) {
                Logger.warn('⚠️  item_bg_data not found, skipping...');
                return;
            }

            const data = fs.readFileSync(filePath);
            this.itemBgData = data;

            Logger.info(`✅ Loaded item_bg_data (${data.length} bytes)`);
        } catch (error) {
            Logger.error('Failed to load item_bg_data:', error);
        }
    }

    /**
     * Load maps from map folder
     */
    private async loadMaps(): Promise<void> {
        try {
            const mapDataPath = path.join(this.dataPath, 'map');

            // Read girlkun75.txt (map list)
            const mapListFile = path.join(mapDataPath, 'girlkun75.txt');

            if (!fs.existsSync(mapListFile)) {
                Logger.warn('⚠️  girlkun75.txt not found, skipping maps...');
                return;
            }

            const mapListContent = fs.readFileSync(mapListFile, 'utf8');
            const mapLines = mapListContent.split('\n').filter(line => line.trim());

            this.maps = mapLines.map((line, index) => {
                const parts = line.trim().split('\t');
                return {
                    id: index,
                    name: parts[0] || `Map ${index}`,
                    // Add more map properties as needed
                };
            });

            Logger.info(`✅ Loaded ${this.maps.length} maps`);
        } catch (error) {
            Logger.error('Failed to load maps:', error);
        }
    }

    /**
     * Load NPCs from menunpc.txt
     */
    private async loadNPCs(): Promise<void> {
        try {
            const npcFile = path.join(this.dataPath, 'menunpc.txt');

            if (!fs.existsSync(npcFile)) {
                Logger.warn('⚠️  menunpc.txt not found, skipping NPCs...');
                return;
            }

            const npcContent = fs.readFileSync(npcFile, 'utf8');
            const npcLines = npcContent.split('\n').filter(line => line.trim());

            // Parse NPC data (format may vary)
            this.npcs = npcLines.map((line, index) => {
                return {
                    id: index,
                    data: line.trim()
                };
            });

            Logger.info(`✅ Loaded ${this.npcs.length} NPCs`);
        } catch (error) {
            Logger.error('Failed to load NPCs:', error);
        }
    }

    /**
     * Load mobs from mobtemplate folder
     */
    private async loadMobs(): Promise<void> {
        try {
            const mobPath = path.join(this.dataPath, 'mobtemplate', 'x1');

            if (!fs.existsSync(mobPath)) {
                Logger.warn('⚠️  mobtemplate/x1 not found, skipping mobs...');
                return;
            }

            const mobFiles = fs.readdirSync(mobPath);

            this.mobs = mobFiles.map((file, index) => {
                const filePath = path.join(mobPath, file);
                const data = fs.readFileSync(filePath);

                return {
                    id: index,
                    fileName: file,
                    data: data
                };
            });

            Logger.info(`✅ Loaded ${this.mobs.length} mob templates`);
        } catch (error) {
            Logger.error('Failed to load mobs:', error);
        }
    }

    /**
     * Print summary of loaded data
     */
    private printSummary(): void {
        Logger.info('\n📊 Game Data Summary:');
        Logger.info(`   Maps: ${this.maps.length}`);
        Logger.info(`   NPCs: ${this.npcs.length}`);
        Logger.info(`   Mobs: ${this.mobs.length}`);
        Logger.info(`   TileSetInfo: ${this.tileSetInfo ? 'Loaded' : 'Not loaded'}`);
        Logger.info(`   ItemBgData: ${this.itemBgData ? 'Loaded' : 'Not loaded'}`);
    }

    /**
     * Get map by ID
     */
    public getMap(mapId: number): any {
        return this.maps.find(m => m.id === mapId);
    }

    /**
     * Get NPC by ID
     */
    public getNPC(npcId: number): any {
        return this.npcs.find(n => n.id === npcId);
    }

    /**
     * Get mob by ID
     */
    public getMob(mobId: number): any {
        return this.mobs.find(m => m.id === mobId);
    }

    /**
     * Check if data is loaded
     */
    public isLoaded(): boolean {
        return this.maps.length > 0 || this.npcs.length > 0;
    }
}
