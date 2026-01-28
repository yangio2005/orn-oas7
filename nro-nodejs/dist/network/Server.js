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
exports.Server = void 0;
const net = __importStar(require("net"));
const Logger_1 = require("../utils/Logger");
const Session_1 = require("./Session");
class Server {
    constructor() {
        this.port = parseInt(process.env.SERVER_PORT || '14445');
        this.server = net.createServer((socket) => this.handleConnection(socket));
    }
    start() {
        this.server.listen(this.port, () => {
            Logger_1.Logger.info(`Server is listening on port ${this.port}`);
        });
        this.server.on('error', (err) => {
            Logger_1.Logger.error('Server error:', err);
        });
    }
    handleConnection(socket) {
        Logger_1.Logger.info(`New connection from ${socket.remoteAddress}:${socket.remotePort}`);
        const session = new Session_1.Session(socket);
        // Manage session list...
    }
}
exports.Server = Server;
