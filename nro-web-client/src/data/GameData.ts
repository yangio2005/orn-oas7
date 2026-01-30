import { MapTemplate, MobTemplate } from "../model/Interfaces";

export const MAP_TEMPLATES: MapTemplate[] = [
    {
        id: 0,
        name: 'Làng Aru',
        zones: 12,
        maxPlayer: 12,
        type: 0,
        planetId: 0,
        bgType: 0,
        tileId: 1,
        bgId: 0,
        waypoints: [
            { name: "Đồi hoa cúc", minX: 1224, minY: 408, maxX: 1248, maxY: 432, isEnter: false, isOffline: false, nextMapId: 1, goX: 60, goY: 384 },
            { name: "Nhà Gôhan", minX: 288, minY: 408, maxX: 360, maxY: 432, isEnter: true, isOffline: true, nextMapId: 21, goX: 489, goY: 336 },
            { name: "Vách núi Aru", minX: 0, minY: 408, maxX: 24, maxY: 432, isEnter: false, isOffline: false, nextMapId: 42, goX: 1380, goY: 432 }
        ],
        mobs: [
            { mobId: 0, level: 1, hp: 100, x: 780, y: 432, status: 5, levelBoss: 0, isBoss: false },
            { mobId: 0, level: 1, hp: 100, x: 900, y: 432, status: 5, levelBoss: 0, isBoss: false },
            { mobId: 0, level: 1, hp: 100, x: 1020, y: 432, status: 5, levelBoss: 0, isBoss: false },
            { mobId: 0, level: 1, hp: 100, x: 660, y: 432, status: 5, levelBoss: 0, isBoss: false }
        ],
        npcs: [
            { status: 7, x: 228, y: 432, npcId: 7 }, // Ba hat mit?
            { status: 6, x: 492, y: 432, npcId: 6 },
            { status: 67, x: 407, y: 432, npcId: 67 },
            { status: 49, x: 605, y: 432, npcId: 49 },
            { status: 63, x: 517, y: 432, npcId: 63 },
            { status: 82, x: 714, y: 432, npcId: 82 },
            { status: 41, x: 802, y: 432, npcId: 41 }
        ]
    },
    // Add more maps as needed from solomon.sql
    {
        id: 7,
        name: 'Làng Mori',
        zones: 12,
        maxPlayer: 12,
        type: 0,
        planetId: 1,
        bgType: 4,
        tileId: 5,
        bgId: 0,
        waypoints: [
            { name: "Đồi nấm tím", minX: 1224, minY: 408, maxX: 1248, maxY: 432, isEnter: false, isOffline: false, nextMapId: 8, goX: 60, goY: 432 },
            { name: "Nhà Moori", minX: 384, minY: 408, maxX: 456, maxY: 432, isEnter: true, isOffline: true, nextMapId: 22, goX: 207, goY: 336 },
            { name: "Vách núi Moori", minX: 0, minY: 384, maxX: 24, maxY: 408, isEnter: false, isOffline: false, nextMapId: 43, goX: 1380, goY: 432 }
        ],
        mobs: [
            { mobId: 0, level: 1, hp: 100, x: 708, y: 410, status: 5, levelBoss: 0, isBoss: false },
            { mobId: 0, level: 1, hp: 100, x: 804, y: 410, status: 5, levelBoss: 0, isBoss: false },
            { mobId: 0, level: 1, hp: 100, x: 900, y: 410, status: 5, levelBoss: 0, isBoss: false },
            { mobId: 0, level: 1, hp: 100, x: 996, y: 410, status: 5, levelBoss: 0, isBoss: false }
        ],
        npcs: [
            { status: 6, x: 564, y: 432, npcId: 6 },
            { status: 8, x: 300, y: 432, npcId: 8 },
            { status: 64, x: 550, y: 432, npcId: 64 }
        ]
    },
    {
        id: 14,
        name: 'Làng Kakarot',
        zones: 12,
        maxPlayer: 12,
        type: 0,
        planetId: 2,
        bgType: 0,
        tileId: 9,
        bgId: 8,
        waypoints: [
            { name: "Đồi hoang", minX: 1224, minY: 384, maxX: 1248, maxY: 408, isEnter: false, isOffline: false, nextMapId: 15, goX: 60, goY: 408 },
            { name: "Nhà Broly", minX: 504, minY: 384, maxX: 576, maxY: 408, isEnter: true, isOffline: true, nextMapId: 23, goX: 475, goY: 336 },
            { name: "Vách núi Kakarot", minX: 0, minY: 384, maxX: 24, maxY: 408, isEnter: false, isOffline: false, nextMapId: 44, goX: 1380, goY: 432 }
        ],
        mobs: [
            { mobId: 0, level: 1, hp: 100, x: 708, y: 385, status: 5, levelBoss: 0, isBoss: false },
            { mobId: 0, level: 1, hp: 100, x: 804, y: 385, status: 5, levelBoss: 0, isBoss: false },
            { mobId: 0, level: 1, hp: 100, x: 900, y: 385, status: 5, levelBoss: 0, isBoss: false },
            { mobId: 0, level: 1, hp: 100, x: 996, y: 385, status: 5, levelBoss: 0, isBoss: false }
        ],
        npcs: [
            { status: 9, x: 396, y: 408, npcId: 9 }, // Ông Gohan?
            { status: 6, x: 252, y: 408, npcId: 6 }
        ]
    }
];

export const MOB_TEMPLATES: MobTemplate[] = [
    { id: 0, type: 0, name: 'Mộc nhân', hp: 20, rangeMove: 0, speed: 1, dartType: 25, percentDame: 5, percentTiemNang: 50 },
    { id: 1, type: 1, name: 'Khủng long', hp: 200, rangeMove: 33, speed: 1, dartType: 25, percentDame: 5, percentTiemNang: 50 },
    // Add more...
];
