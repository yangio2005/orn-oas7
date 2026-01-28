"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Player = void 0;
class Player {
    constructor() {
        this.session = null;
        this.id = -1;
        this.name = "";
        this.gender = 0;
        this.head = -1;
        this.body = -1;
        this.leg = -1;
        this.role = 0;
        this.power = 0;
        this.tiemNang = 0;
        this.hp = 100;
        this.mp = 100;
        this.stamina = 1000;
        this.inventory = [];
        this.inventoryBody = [];
        this.inventoryBox = [];
        this.location = { x: 0, y: 0, mapId: 0, zoneId: 0 };
    }
}
exports.Player = Player;
