import { Session } from "../network/Session";
import { Item } from "./Item";
import { Zone } from "./map/Zone";

/**
 * Player class
 * Ported from com.girlkun.models.player.Player
 */

export interface Inventory {
    gold: number;
    gem: number;
    ruby: number;
    itemsBody: Item[];
    itemsBag: Item[];
    itemsBox: Item[];
}

export interface PlayerSkill {
    skills: any[]; // will be Skill[]
    skillShortCut: number[];
    sendSkillShortCut(): void;
}

export interface NPoint {
    hp: number;
    hpMax: number;
    mp: number;
    mpMax: number;
    dame: number;
    def: number;
    crit: number;
    hpg: number;
    mpg: number;
    dameg: number;
    defg: number;
    critg: number;
    stamina: number;
    maxStamina: number;
    power: number;
    tiemNang: number;
}

export interface TaskPlayer {
    taskMain: any;
    sideTask: any;
}

export class Player {
    public session: Session | null = null;
    public id: number = -1;
    public name: string = "";
    public gender: number = 0;
    public role: number = 0;
    public isBoss: boolean = false;
    public isNewPet: boolean = false;

    // Appearance
    public head: number = -1;
    public body: number = -1;
    public leg: number = -1;
    public flagBag: number = -1;

    // Location
    public x: number = 0;
    public y: number = 0;
    public mapId: number = 21 + 7; // Default
    public zoneId: number = 0;
    public zone: Zone | null = null;

    // Components
    public inventory: Inventory;
    public playerSkill: PlayerSkill;
    public nPoint: NPoint;
    public taskPlayer: TaskPlayer;

    // Relationships
    public clan: any = null; // Clan
    public pet: Player | null = null;
    public newPet: any = null;

    // Flags & State
    public typePk: number = 0;
    public cFlag: number = 0;
    public status: number = 0; // 0: alive, 1: die
    public isDie: boolean = false;

    // Special
    public idMark: any = {};
    public effectSkill: any = null;
    public combineNew: any = null;
    public magicTree: any = null;
    public intrinsic: any = null;

    // Temporary flags (similar to Java's fields)
    public isDrop: boolean = false;
    public beforeDispose: boolean = false;

    // Time fields
    public lastTimeTargetPlayer: number = 0;
    public lastTimeTitle1: number = 0;
    public lastTimeTitle2: number = 0;
    public lastTimeTitle3: number = 0;

    constructor() {
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

    public dispose(): void {
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

    public isPl(): boolean {
        return !this.isBoss && !this.isNewPet;
    }

    public getRole(): number {
        // Mock implementation
        return 0;
    }
}
