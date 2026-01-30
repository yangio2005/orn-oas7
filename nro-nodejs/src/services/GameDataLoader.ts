import * as fs from 'fs';
import * as path from 'path';
import { Logger } from '../utils/Logger';
import { DB } from '../config/database';
import {
    ItemTemplate, ItemOptionTemplate, SkillTemplate, NClass, Skill,
    TaskMain, SubTaskMain, SideTaskTemplate, Intrinsic, HeadAvatar, FlagBag
} from '../models/Template';
import { RowDataPacket } from 'mysql2';

/**
 * GameDataLoader - Load all game data from database and files
 * Data location: data/girlkun/ AND MySQL Database
 */
export class GameDataLoader {
    private static instance: GameDataLoader;
    private dataPath: string;

    // Game data storage
    public maps: any[] = [];
    public items: any[] = []; // Deprecated?
    public npcs: any[] = [];
    public mobs: any[] = [];

    // Loaded from DB
    public itemTemplates: ItemTemplate[] = [];
    public itemOptionTemplates: ItemOptionTemplate[] = [];
    public nClasses: NClass[] = [];
    public skills: Skill[] = []; // All skills flat list if needed? Or accessed via nClasses
    public tasks: TaskMain[] = [];
    public sideTaskTemplates: SideTaskTemplate[] = [];
    public intrinsics: Intrinsic[] = [];
    public headAvatars: HeadAvatar[] = [];
    public flagBags: FlagBag[] = [];

    public tileSetInfo: any = null;
    public itemBgData: any = null;
    public captions: string[] = [];

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
        Logger.info('📦 Loading game data...\n');

        try {
            // File based loading
            await this.loadTileSetInfo();
            await this.loadItemBgData();
            await this.loadMaps();
            await this.loadNPCs();
            await this.loadMobs();

            // DB based loading
            if (DB.getPool()) {
                await this.loadItemTemplates();
                await this.loadItemOptionTemplates();
                await this.loadSkills();
                await this.loadHeadAvatars();
                await this.loadFlagBags();
                await this.loadIntrinsics();
                await this.loadTasks();
                await this.loadSideTasks();
                await this.loadCaptions();
            } else {
                Logger.warn('⚠️ Database not connected. Skipping DB data loading.');
            }

            Logger.info('\n✅ All game data loaded successfully!');
            this.printSummary();
        } catch (error) {
            Logger.error('❌ Failed to load game data:', error);
            throw error;
        }
    }

    /**
     * Load Item Templates from DB
     */
    private async loadItemTemplates(): Promise<void> {
        try {
            const [rows] = await DB.getPool().query<RowDataPacket[]>('SELECT * FROM item_template');
            this.itemTemplates = rows.map(row => ({
                id: row.id,
                type: row.type,
                gender: row.gender,
                name: row.name,
                description: row.description,
                iconID: row.icon_id,
                part: row.part,
                isUpToUp: !!row.is_up_to_up,
                strRequire: row.power_require,
                gold: row.gold,
                gem: row.gem,
                head: row.head,
                body: row.body,
                leg: row.leg
            } as ItemTemplate));
            Logger.info(`✅ Loaded ${this.itemTemplates.length} Item Templates from DB`);
        } catch (error) {
            Logger.error('Failed to load Item Templates:', error);
        }
    }

    /**
     * Load Item Option Templates from DB
     */
    private async loadItemOptionTemplates(): Promise<void> {
        try {
            const [rows] = await DB.getPool().query<RowDataPacket[]>('SELECT id, name FROM item_option_template');
            this.itemOptionTemplates = rows.map(row => ({
                id: row.id,
                name: row.name,
                type: 0 // Default or load if exists
            } as ItemOptionTemplate));
            Logger.info(`✅ Loaded ${this.itemOptionTemplates.length} Item Option Templates from DB`);
        } catch (error) {
            Logger.error('Failed to load Item Option Templates:', error);
        }
    }

    /**
     * Load Skills and NClasses from DB
     */
    private async loadSkills(): Promise<void> {
        try {
            const [resTemplate] = await DB.getPool().query<RowDataPacket[]>('SELECT * FROM skill_template ORDER BY nclass_id, slot');

            let currentNClassId = -1;
            let currentNClass: NClass | null = null;

            for (const row of resTemplate) {
                const nClassId = row.nclass_id;

                if (nClassId !== currentNClassId) {
                    currentNClassId = nClassId;
                    currentNClass = {
                        classId: nClassId,
                        name: nClassId === 0 ? "Trái Đất" : (nClassId === 1 ? "Namếc" : "Xayda"),
                        skillTemplates: []
                    };
                    this.nClasses.push(currentNClass);
                }

                if (currentNClass) {
                    const skillTemplate: SkillTemplate = {
                        id: row.id,
                        classId: nClassId,
                        name: row.name,
                        maxPoint: row.max_point,
                        manaUseType: row.mana_use_type,
                        type: row.type,
                        iconId: row.icon_id,
                        damInfo: row.dam_info,
                        skills: []
                    };

                    // Load specific skill levels info from JSON string in 'skills' column
                    // Java: JSONArray dataArray = (JSONArray) jv.parse(rs.getString("skills")...)
                    try {
                        let rawSkills = row.skills;
                        // Normalize JSON string if needed (Java code did some replacements)
                        rawSkills = rawSkills.replace(/\["/g, "[").replace(/"\[/g, "[").replace(/"\]/g, "]").replace(/\]"/g, "]").replace(/\}","\{/g, "},{");

                        const skillsData = JSON.parse(rawSkills);

                        if (Array.isArray(skillsData)) {
                            skillTemplate.skills = skillsData.map((dts: any) => ({
                                skillId: Number(dts.id),
                                template: skillTemplate,
                                point: Number(dts.point),
                                powRequire: Number(dts.power_require),
                                manaUse: Number(dts.mana_use),
                                coolDown: Number(dts.cool_down),
                                dx: Number(dts.dx),
                                dy: Number(dts.dy),
                                maxFight: Number(dts.max_fight),
                                damage: Number(dts.damage),
                                price: Number(dts.price),
                                moreInfo: dts.info
                            }));
                        }
                    } catch (parseErr) {
                        Logger.error(`Failed to parse skills json for template ${skillTemplate.id}:`, parseErr);
                    }

                    currentNClass.skillTemplates.push(skillTemplate);
                }
            }
            Logger.info(`✅ Loaded Skills for ${this.nClasses.length} Classes from DB`);
        } catch (error) {
            Logger.error('Failed to load Skills:', error);
        }
    }

    /**
     * Load Head Avatars from DB
     */
    private async loadHeadAvatars(): Promise<void> {
        try {
            const [rows] = await DB.getPool().query<RowDataPacket[]>('SELECT * FROM head_avatar');
            this.headAvatars = rows.map(row => ({
                headId: row.head_id,
                avatarId: row.avatar_id
            }));
            Logger.info(`✅ Loaded ${this.headAvatars.length} Head Avatars from DB`);
        } catch (error) {
            Logger.error('Failed to load Head Avatars:', error);
        }
    }

    /**
     * Load Flag Bags from DB
     */
    private async loadFlagBags(): Promise<void> {
        try {
            const [rows] = await DB.getPool().query<RowDataPacket[]>('SELECT * FROM flag_bag');
            this.flagBags = rows.map(row => {
                const iconString = row.icon_data || "";
                const iconEffect = iconString.split(',').map((s: string) => parseInt(s.trim()));
                return {
                    id: row.id,
                    name: row.name,
                    gold: row.gold,
                    gem: row.gem,
                    iconId: row.icon_id,
                    iconEffect: iconEffect
                };
            });
            Logger.info(`✅ Loaded ${this.flagBags.length} Flag Bags from DB`);
        } catch (error) {
            Logger.error('Failed to load Flag Bags:', error);
        }
    }

    /**
     * Load Intrinsics from DB
     */
    private async loadIntrinsics(): Promise<void> {
        try {
            const [rows] = await DB.getPool().query<RowDataPacket[]>('SELECT * FROM intrinsic');
            this.intrinsics = rows.map(row => ({
                id: row.id,
                name: row.name,
                paramFrom1: row.param_from_1,
                paramTo1: row.param_to_1,
                paramFrom2: row.param_from_2,
                paramTo2: row.param_to_2,
                icon: row.icon,
                gender: row.gender
            }));
            Logger.info(`✅ Loaded ${this.intrinsics.length} Intrinsics from DB`);
        } catch (error) {
            Logger.error('Failed to load Intrinsics:', error);
        }
    }

    /**
     * Load Tasks from DB
     */
    private async loadTasks(): Promise<void> {
        try {
            const query = `
                SELECT id, task_main_template.name, detail, 
                       task_sub_template.name AS sub_name, max_count, notify, npc_id, map 
                FROM task_main_template 
                JOIN task_sub_template ON task_main_template.id = task_sub_template.task_main_id
            `;
            const [rows] = await DB.getPool().query<RowDataPacket[]>(query);

            const taskMap = new Map<number, TaskMain>();

            for (const row of rows) {
                const taskId = row.id;
                let task = taskMap.get(taskId);

                if (!task) {
                    task = {
                        id: taskId,
                        name: row.name,
                        detail: row.detail,
                        subTasks: []
                    };
                    taskMap.set(taskId, task);
                    this.tasks.push(task);
                }

                task.subTasks.push({
                    name: row.sub_name,
                    maxCount: row.max_count,
                    notify: row.notify,
                    npcId: row.npc_id,
                    mapId: row.map
                });
            }
            Logger.info(`✅ Loaded ${this.tasks.length} Main Tasks from DB`);
        } catch (error) {
            Logger.error('Failed to load Tasks:', error);
        }
    }

    /**
     * Load Side Tasks from DB
     */
    private async loadSideTasks(): Promise<void> {
        try {
            const [rows] = await DB.getPool().query<RowDataPacket[]>('SELECT * FROM side_task_template');
            this.sideTaskTemplates = rows.map(row => {
                // Parse counts like "10-2"
                const parseCount = (str: string) => {
                    const parts = str.split('-');
                    return [parseInt(parts[0]), parseInt(parts[1] || '0')];
                };

                const counts = [
                    parseCount(row.max_count_lv1),
                    parseCount(row.max_count_lv2),
                    parseCount(row.max_count_lv3),
                    parseCount(row.max_count_lv4),
                    parseCount(row.max_count_lv5)
                ];

                return {
                    id: row.id,
                    name: row.name,
                    count: counts
                };
            });
            Logger.info(`✅ Loaded ${this.sideTaskTemplates.length} Side Tasks from DB`);
        } catch (error) {
            Logger.error('Failed to load Side Tasks:', error);
        }
    }

    /**
     * Load Captions from DB
     */
    private async loadCaptions(): Promise<void> {
        try {
            const [rows] = await DB.getPool().query<RowDataPacket[]>('SELECT name FROM caption');
            this.captions = rows.map(row => row.name);
            Logger.info(`✅ Loaded ${this.captions.length} Captions from DB`);
        } catch (error) {
            Logger.error('Failed to load Captions:', error);
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
        Logger.info(`   Items: ${this.itemTemplates.length}`);
        Logger.info(`   Classes: ${this.nClasses.length}`);
        Logger.info(`   Tasks: ${this.tasks.length}`);
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
