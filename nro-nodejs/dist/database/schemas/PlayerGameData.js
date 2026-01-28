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
exports.PlayerGameDataModel = void 0;
const mongoose_1 = __importStar(require("mongoose"));
const PlayerGameDataSchema = new mongoose_1.Schema({
    playerId: { type: Number, required: true, unique: true, index: true },
    accountId: { type: Number, required: true, index: true },
    // Stats
    power: { type: Number, default: 0 },
    tiemNang: { type: Number, default: 0 },
    hp: { type: Number, default: 100 },
    hpMax: { type: Number, default: 100 },
    mp: { type: Number, default: 100 },
    mpMax: { type: Number, default: 100 },
    stamina: { type: Number, default: 1000 },
    staminaMax: { type: Number, default: 1000 },
    // Inventory (flexible JSON - use Mixed type)
    inventory: { type: mongoose_1.Schema.Types.Mixed, default: [] },
    inventoryBody: { type: mongoose_1.Schema.Types.Mixed, default: [] },
    inventoryBox: { type: mongoose_1.Schema.Types.Mixed, default: [] },
    // Skills
    skills: { type: mongoose_1.Schema.Types.Mixed, default: [] },
    // Location
    location: {
        type: {
            x: { type: Number, default: 0 },
            y: { type: Number, default: 0 },
            mapId: { type: Number, default: 0 },
            zoneId: { type: Number, default: 0 }
        },
        default: { x: 0, y: 0, mapId: 0, zoneId: 0 }
    },
    // Tasks
    tasks: { type: mongoose_1.Schema.Types.Mixed, default: [] },
    // Clan
    clanId: { type: Number, default: null },
    // Timestamps
    lastLogin: { type: Date, default: Date.now },
    lastSave: { type: Date, default: Date.now }
}, {
    timestamps: true,
    collection: 'player_game_data'
});
exports.PlayerGameDataModel = mongoose_1.default.model('PlayerGameData', PlayerGameDataSchema);
