
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
    npcId: number; // id from npc_template? Or just npc type
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
