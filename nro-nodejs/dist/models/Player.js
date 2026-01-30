"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Player = void 0;
class Player {
    constructor() {
        this.session = null;
        this.id = -1;
        this.name = "";
        this.gender = 0;
        this.role = 0;
        this.isBoss = false;
        this.isNewPet = false;
        // Appearance
        this.head = -1;
        this.body = -1;
        this.leg = -1;
        this.flagBag = -1;
        // Location
        this.x = 0;
        this.y = 0;
        this.mapId = 21 + 7; // Default
        this.zoneId = 0;
        this.zone = null;
        // Relationships
        this.clan = null; // Clan
        this.pet = null;
        this.newPet = null;
        // Flags & State
        this.typePk = 0;
        this.cFlag = 0;
        this.status = 0; // 0: alive, 1: die
        this.isDie = false;
        // Special
        this.idMark = {};
        this.effectSkill = null;
        this.combineNew = null;
        this.magicTree = null;
        this.intrinsic = null;
        // Temporary flags (similar to Java's fields)
        this.isDrop = false;
        this.beforeDispose = false;
        // Time fields
        this.lastTimeTargetPlayer = 0;
        this.lastTimeTitle1 = 0;
        this.lastTimeTitle2 = 0;
        this.lastTimeTitle3 = 0;
        this.inventory = {
            gold: 0,
            gem: 0,
            ruby: 0,
            itemsBody: [],
            itemsBag: [],
            itemsBox: []
        };
        this.playerSkill = {
            skills: [],
            skillShortCut: [],
            sendSkillShortCut: () => {
                // TODO: Implement send skill shortcut
            }
        };
        this.nPoint = {
            hp: 100, hpMax: 100,
            mp: 100, mpMax: 100,
            dame: 10, def: 0, crit: 0,
            hpg: 100, mpg: 100, dameg: 10, defg: 0, critg: 0,
            stamina: 1000, maxStamina: 1000,
            power: 0, tiemNang: 0
        };
        this.taskPlayer = {
            taskMain: null,
            sideTask: null
        };
    }
    dispose() {
        if (this.session) {
            this.session = null;
        }
        this.zone = null;
        this.pet = null;
        this.newPet = null;
        this.clan = null;
        this.inventory.itemsBody = [];
        this.inventory.itemsBag = [];
        this.inventory.itemsBox = [];
        this.playerSkill.skills = [];
        this.mapId = 0;
        this.zoneId = 0;
    }
    isPl() {
        return !this.isBoss && !this.isNewPet;
    }
    getRole() {
        // Mock implementation
        return 0;
    }
}
exports.Player = Player;
