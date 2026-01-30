"use strict";
var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    var desc = Object.getOwnPropertyDescriptor(m, k);
    if (!desc || ("get" in desc ? !m.__esModule : desc.writable || desc.configurable)) {
      desc = { enumerable: true, get: function() { return m[k]; } };
    }
    Object.defineProperty(o, k2, desc);
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __setModuleDefault = (this && this.__setModuleDefault) || (Object.create ? (function(o, v) {
    Object.defineProperty(o, "default", { enumerable: true, value: v });
}) : function(o, v) {
    o["default"] = v;
});
var __importStar = (this && this.__importStar) || (function () {
    var ownKeys = function(o) {
        ownKeys = Object.getOwnPropertyNames || function (o) {
            var ar = [];
            for (var k in o) if (Object.prototype.hasOwnProperty.call(o, k)) ar[ar.length] = k;
            return ar;
        };
        return ownKeys(o);
    };
    return function (mod) {
        if (mod && mod.__esModule) return mod;
        var result = {};
        if (mod != null) for (var k = ownKeys(mod), i = 0; i < k.length; i++) if (k[i] !== "default") __createBinding(result, mod, k[i]);
        __setModuleDefault(result, mod);
        return result;
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.GameDataLoader = void 0;
const fs = __importStar(require("fs"));
const path = __importStar(require("path"));
const Logger_1 = require("../utils/Logger");
const database_1 = require("../config/database");
/**
 * GameDataLoader - Load all game data from database and files
 * Data location: data/girlkun/ AND MySQL Database
 */
class GameDataLoader {
    constructor() {
        // Game data storage
        this.maps = [];
        this.items = []; // Deprecated?
        this.npcs = [];
        this.mobs = [];
        // Loaded from DB
        this.itemTemplates = [];
        this.itemOptionTemplates = [];
        this.nClasses = [];
        this.skills = []; // All skills flat list if needed? Or accessed via nClasses
        this.tasks = [];
        this.sideTaskTemplates = [];
        this.intrinsics = [];
        this.headAvatars = [];
        this.flagBags = [];
        this.tileSetInfo = null;
        this.itemBgData = null;
        this.captions = [];
        // Path to data folder (relative to project root)
        this.dataPath = path.join(__dirname, '../../../data/girlkun');
    }
    static getInstance() {
        if (!GameDataLoader.instance) {
            GameDataLoader.instance = new GameDataLoader();
        }
        return GameDataLoader.instance;
    }
    /**
     * Load all game data
     */
    async loadAll() {
        Logger_1.Logger.info('📦 Loading game data...\n');
        try {
            // File based loading
            await this.loadTileSetInfo();
            await this.loadItemBgData();
            await this.loadMaps();
            await this.loadNPCs();
            await this.loadMobs();
            // DB based loading
            if (database_1.DB.getPool()) {
                await this.loadItemTemplates();
                await this.loadItemOptionTemplates();
                await this.loadSkills();
                await this.loadHeadAvatars();
                await this.loadFlagBags();
                await this.loadIntrinsics();
                await this.loadTasks();
                await this.loadSideTasks();
                await this.loadCaptions();
            }
            else {
                Logger_1.Logger.warn('⚠️ Database not connected. Skipping DB data loading.');
            }
            Logger_1.Logger.info('\n✅ All game data loaded successfully!');
            this.printSummary();
        }
        catch (error) {
            Logger_1.Logger.error('❌ Failed to load game data:', error);
            throw error;
        }
    }
    /**
     * Load Item Templates from DB
     */
    async loadItemTemplates() {
        try {
            const [rows] = await database_1.DB.getPool().query('SELECT * FROM item_template');
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
            }));
            Logger_1.Logger.info(`✅ Loaded ${this.itemTemplates.length} Item Templates from DB`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to load Item Templates:', error);
        }
    }
    /**
     * Load Item Option Templates from DB
     */
    async loadItemOptionTemplates() {
        try {
            const [rows] = await database_1.DB.getPool().query('SELECT id, name FROM item_option_template');
            this.itemOptionTemplates = rows.map(row => ({
                id: row.id,
                name: row.name,
                type: 0 // Default or load if exists
            }));
            Logger_1.Logger.info(`✅ Loaded ${this.itemOptionTemplates.length} Item Option Templates from DB`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to load Item Option Templates:', error);
        }
    }
    /**
     * Load Skills and NClasses from DB
     */
    async loadSkills() {
        try {
            const [resTemplate] = await database_1.DB.getPool().query('SELECT * FROM skill_template ORDER BY nclass_id, slot');
            let currentNClassId = -1;
            let currentNClass = null;
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
                    const skillTemplate = {
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
                            skillTemplate.skills = skillsData.map((dts) => ({
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
                    }
                    catch (parseErr) {
                        Logger_1.Logger.error(`Failed to parse skills json for template ${skillTemplate.id}:`, parseErr);
                    }
                    currentNClass.skillTemplates.push(skillTemplate);
                }
            }
            Logger_1.Logger.info(`✅ Loaded Skills for ${this.nClasses.length} Classes from DB`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to load Skills:', error);
        }
    }
    /**
     * Load Head Avatars from DB
     */
    async loadHeadAvatars() {
        try {
            const [rows] = await database_1.DB.getPool().query('SELECT * FROM head_avatar');
            this.headAvatars = rows.map(row => ({
                headId: row.head_id,
                avatarId: row.avatar_id
            }));
            Logger_1.Logger.info(`✅ Loaded ${this.headAvatars.length} Head Avatars from DB`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to load Head Avatars:', error);
        }
    }
    /**
     * Load Flag Bags from DB
     */
    async loadFlagBags() {
        try {
            const [rows] = await database_1.DB.getPool().query('SELECT * FROM flag_bag');
            this.flagBags = rows.map(row => {
                const iconString = row.icon_data || "";
                const iconEffect = iconString.split(',').map((s) => parseInt(s.trim()));
                return {
                    id: row.id,
                    name: row.name,
                    gold: row.gold,
                    gem: row.gem,
                    iconId: row.icon_id,
                    iconEffect: iconEffect
                };
            });
            Logger_1.Logger.info(`✅ Loaded ${this.flagBags.length} Flag Bags from DB`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to load Flag Bags:', error);
        }
    }
    /**
     * Load Intrinsics from DB
     */
    async loadIntrinsics() {
        try {
            const [rows] = await database_1.DB.getPool().query('SELECT * FROM intrinsic');
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
            Logger_1.Logger.info(`✅ Loaded ${this.intrinsics.length} Intrinsics from DB`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to load Intrinsics:', error);
        }
    }
    /**
     * Load Tasks from DB
     */
    async loadTasks() {
        try {
            const query = `
                SELECT id, task_main_template.name, detail, 
                       task_sub_template.name AS sub_name, max_count, notify, npc_id, map 
                FROM task_main_template 
                JOIN task_sub_template ON task_main_template.id = task_sub_template.task_main_id
            `;
            const [rows] = await database_1.DB.getPool().query(query);
            const taskMap = new Map();
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
            Logger_1.Logger.info(`✅ Loaded ${this.tasks.length} Main Tasks from DB`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to load Tasks:', error);
        }
    }
    /**
     * Load Side Tasks from DB
     */
    async loadSideTasks() {
        try {
            const [rows] = await database_1.DB.getPool().query('SELECT * FROM side_task_template');
            this.sideTaskTemplates = rows.map(row => {
                // Parse counts like "10-2"
                const parseCount = (str) => {
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
            Logger_1.Logger.info(`✅ Loaded ${this.sideTaskTemplates.length} Side Tasks from DB`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to load Side Tasks:', error);
        }
    }
    /**
     * Load Captions from DB
     */
    async loadCaptions() {
        try {
            const [rows] = await database_1.DB.getPool().query('SELECT name FROM caption');
            this.captions = rows.map(row => row.name);
            Logger_1.Logger.info(`✅ Loaded ${this.captions.length} Captions from DB`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to load Captions:', error);
        }
    }
    /**
     * Load tile set info (map tiles)
     */
    async loadTileSetInfo() {
        try {
            const filePath = path.join(this.dataPath, 'map', 'tile_set_info');
            if (!fs.existsSync(filePath)) {
                Logger_1.Logger.warn('⚠️  tile_set_info not found, skipping...');
                return;
            }
            const data = fs.readFileSync(filePath);
            this.tileSetInfo = data;
            Logger_1.Logger.info(`✅ Loaded tile_set_info (${data.length} bytes)`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to load tile_set_info:', error);
        }
    }
    /**
     * Load item background data
     */
    async loadItemBgData() {
        try {
            const filePath = path.join(this.dataPath, 'item_bg_temp', 'item_bg_data');
            if (!fs.existsSync(filePath)) {
                Logger_1.Logger.warn('⚠️  item_bg_data not found, skipping...');
                return;
            }
            const data = fs.readFileSync(filePath);
            this.itemBgData = data;
            Logger_1.Logger.info(`✅ Loaded item_bg_data (${data.length} bytes)`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to load item_bg_data:', error);
        }
    }
    /**
     * Load maps from map folder
     */
    async loadMaps() {
        try {
            const mapDataPath = path.join(this.dataPath, 'map');
            // Read girlkun75.txt (map list)
            const mapListFile = path.join(mapDataPath, 'girlkun75.txt');
            if (!fs.existsSync(mapListFile)) {
                Logger_1.Logger.warn('⚠️  girlkun75.txt not found, skipping maps...');
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
            Logger_1.Logger.info(`✅ Loaded ${this.maps.length} maps`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to load maps:', error);
        }
    }
    /**
     * Load NPCs from menunpc.txt
     */
    async loadNPCs() {
        try {
            const npcFile = path.join(this.dataPath, 'menunpc.txt');
            if (!fs.existsSync(npcFile)) {
                Logger_1.Logger.warn('⚠️  menunpc.txt not found, skipping NPCs...');
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
            Logger_1.Logger.info(`✅ Loaded ${this.npcs.length} NPCs`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to load NPCs:', error);
        }
    }
    /**
     * Load mobs from mobtemplate folder
     */
    async loadMobs() {
        try {
            const mobPath = path.join(this.dataPath, 'mobtemplate', 'x1');
            if (!fs.existsSync(mobPath)) {
                Logger_1.Logger.warn('⚠️  mobtemplate/x1 not found, skipping mobs...');
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
            Logger_1.Logger.info(`✅ Loaded ${this.mobs.length} mob templates`);
        }
        catch (error) {
            Logger_1.Logger.error('Failed to load mobs:', error);
        }
    }
    /**
     * Print summary of loaded data
     */
    printSummary() {
        Logger_1.Logger.info('\n📊 Game Data Summary:');
        Logger_1.Logger.info(`   Maps: ${this.maps.length}`);
        Logger_1.Logger.info(`   NPCs: ${this.npcs.length}`);
        Logger_1.Logger.info(`   Mobs: ${this.mobs.length}`);
        Logger_1.Logger.info(`   Items: ${this.itemTemplates.length}`);
        Logger_1.Logger.info(`   Classes: ${this.nClasses.length}`);
        Logger_1.Logger.info(`   Tasks: ${this.tasks.length}`);
        Logger_1.Logger.info(`   TileSetInfo: ${this.tileSetInfo ? 'Loaded' : 'Not loaded'}`);
        Logger_1.Logger.info(`   ItemBgData: ${this.itemBgData ? 'Loaded' : 'Not loaded'}`);
    }
    /**
     * Get map by ID
     */
    getMap(mapId) {
        return this.maps.find(m => m.id === mapId);
    }
    /**
     * Get NPC by ID
     */
    getNPC(npcId) {
        return this.npcs.find(n => n.id === npcId);
    }
    /**
     * Get mob by ID
     */
    getMob(mobId) {
        return this.mobs.find(m => m.id === mobId);
    }
    /**
     * Check if data is loaded
     */
    isLoaded() {
        return this.maps.length > 0 || this.npcs.length > 0;
    }
}
exports.GameDataLoader = GameDataLoader;
