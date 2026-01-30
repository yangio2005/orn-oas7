
export interface MapTemplate {
    id: number;
    name: string;
    zones: number;
    maxPlayer: number;
    type: number;
    planetId: number;
    bgType: number;
    tileId: number;
    bgId: number;
    waypoints: WaypointTemplate[];
    mobs: MobPosition[];
    npcs: NpcPosition[];
}

export interface WaypointTemplate {
    name: string;
    minX: number;
    minY: number;
    maxX: number;
    maxY: number;
    isEnter: boolean;
    isOffline: boolean;
    nextMapId: number;
    goX: number;
    goY: number;
}

export interface MobPosition {
    mobId: number; // id from mob_template
    level: number;
    hp: number;
    x: number;
    y: number;
    status: number; // e.g. 5
    levelBoss: number;
    isBoss: boolean;
}

export interface NpcPosition {
    status: number;
    x: number;
    y: number;
    npcId: number;
}

export interface MobTemplate {
    id: number;
    type: number;
    name: string;
    hp: number;
    rangeMove: number;
    speed: number;
    dartType: number;
    percentDame: number;
    percentTiemNang: number;
}

// Player related interfaces
export interface Player {
    id: number;
    name: string;
    gender: number;
    head: number;
    body: number;
    leg: number;
    flagBag: number;
    x: number;
    y: number;
    mapId: number;
    zoneId: number;
    typePk: number;
    status: number; // 0: alive, 1: die
    nPoint: NPoint;
    inventory: Inventory;
    skills: Skill[];
    taskId: number;
    clan?: Clan;
}

export interface NPoint {
    hp: number;
    hpMax: number;
    mp: number;
    mpMax: number;
    dame: number;
    def: number;
    crit: number;
    speed: number;
    power: number;
    tiemNang: number;
    stamina: number;
    maxStamina: number;
}

export interface Inventory {
    gold: number;
    gem: number;
    ruby: number;
    itemsBody: Item[];
    itemsBag: Item[];
    itemsBox: Item[];
}

export interface Item {
    id: number;
    templateId: number;
    quantity: number;
    info: string;
    content: string;
    options: ItemOption[];
}

export interface ItemOption {
    optionTemplateId: number;
    param: number;
}

export interface Skill {
    templateId: number;
    point: number;
    level: number;
    coolDown: number;
    lastTimeUseThisSkill: number;
}

export interface Clan {
    id: number;
    name: string;
    imgId: number;
    slogan: string;
}
