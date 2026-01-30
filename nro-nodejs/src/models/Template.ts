
export interface ItemTemplate {
    id: number;
    type: number;
    gender: number;
    name: string;
    description: string;
    iconID: number;
    part: number;
    isUpToUp: boolean;
    strRequire: number;
    gold: number;
    gem: number;
    head: number;
    body: number;
    leg: number;
    level?: number;
}

export interface ItemOptionTemplate {
    id: number;
    name: string;
    type: number; // Added based on typical NRO structure, checks if needed
}

export interface Skill {
    skillId: number;
    template: SkillTemplate;
    point: number;
    powRequire: number;
    manaUse: number;
    coolDown: number;
    dx: number;
    dy: number;
    maxFight: number;
    damage: number;
    price: number;
    moreInfo: string;
}

export interface SkillTemplate {
    id: number;
    classId: number;
    name: string;
    maxPoint: number;
    manaUseType: number;
    type: number;
    iconId: number;
    damInfo: string;
    skills: Skill[];
}

export interface NClass {
    classId: number;
    name: string;
    skillTemplates: SkillTemplate[];
}

export interface SubTaskMain {
    name: string;
    maxCount: number;
    notify: string;
    npcId: number;
    mapId: number;
}

export interface TaskMain {
    id: number;
    name: string;
    detail: string;
    subTasks: SubTaskMain[];
}

export interface SideTaskTemplate {
    id: number;
    name: string;
    count: number[][]; // [level][0=param1, 1=param2]
}

export interface Intrinsic {
    id: number;
    name: string;
    paramFrom1: number;
    paramTo1: number;
    paramFrom2: number;
    paramTo2: number;
    icon: number;
    gender: number;
}

export interface HeadAvatar {
    headId: number;
    avatarId: number;
}

export interface FlagBag {
    id: number;
    name: string;
    gold: number;
    gem: number;
    iconId: number;
    iconEffect: number[];
}

export interface MapTemplate {
    id: number;
    name: string;
    // Add other map properties if needed from database
}

export interface NpcTemplate {
    id: number;
    name: string;
    head: number;
    body: number;
    leg: number;
    menu: string[][];
}

export interface MobTemplate {
    id: number;
    type: number;
    name: string;
    hp: number;
    rangeMove: number;
    speed: number;
    dartType: number;
}
