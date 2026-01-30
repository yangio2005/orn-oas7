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

    // Appearance Calculation
    public getHead(): number {
        if (this.effectSkill && this.effectSkill.isMonkey) {
            return 192; // Placeholder for monkey head
        }
        // TODO: Handle Fusion

        // Safe check for item existence and templateId
        const headItem = this.inventory.itemsBody[5];
        if (headItem && headItem.templateId !== -1) {
            // TODO: We need a way to look up the ItemTemplate to get the specific head ID.
            // For now, if an item exists, we might need to return a specific head logic
            // or we just return this.head if we can't look up template.
            return this.head;
        }
        return this.head;
    }

    public getBody(): number {
        if (this.effectSkill && this.effectSkill.isMonkey) {
            return 193;
        }
        // TODO: Handle Fusion

        const bodyItem = this.inventory.itemsBody[0]; // Shirt
        if (bodyItem && bodyItem.templateId !== -1) {
            // In Java: return item.template.body
            // We need template lookup here.
            return -1;
        }

        const outfitItem = this.inventory.itemsBody[5]; // Outfit/Fusion
        if (outfitItem && outfitItem.templateId !== -1) {
            return -1;
        }

        // Default body based on gender
        if (this.gender === 0) return 57;
        if (this.gender === 1) return 59;
        return 57;
    }

    public getLeg(): number {
        if (this.effectSkill && this.effectSkill.isMonkey) {
            return 194;
        }
        // TODO: Handle Fusion

        const legItem = this.inventory.itemsBody[1]; // Pants
        if (legItem && legItem.templateId !== -1) {
            return -1; // Need template lookup
        }

        const outfitItem = this.inventory.itemsBody[5];
        if (outfitItem && outfitItem.templateId !== -1) {
            return -1;
        }

        // Default leg
        if (this.gender === 0) return 58;
        if (this.gender === 1) return 60;
        return 58;
    }

    public getFlagBag(): number {
        if (this.clan && this.clan.imgId) return this.clan.imgId;
        // Check inventory for flag item
        const flagItem = this.inventory.itemsBody[8];
        if (flagItem && flagItem.templateId !== -1) {
            return -1; // Need template lookup
        }
        return -1;
    }

    public isDie(): boolean {
        return this.nPoint.hp <= 0;
    }

    public dispose(): void {
        if (this.session) {
            this.session = null;
        }
        this.zone = null;
        this.pet = null;
        this.newPet = null;
        this.clan = null;
        this.inventory = {
            gold: 0, gem: 0, ruby: 0, itemsBody: [], itemsBag: [], itemsBox: []
        };
        this.playerSkill.skills = [];
        this.mapId = 0;
        this.zoneId = 0;
    }

    public isPl(): boolean {
        return !this.isBoss && !this.isNewPet;
    }

    public getRole(): number {
        return 0;
    }
}
