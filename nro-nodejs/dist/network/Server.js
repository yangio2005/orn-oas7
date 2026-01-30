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
const ws_1 = require("ws");
const Logger_1 = require("../utils/Logger");
const Session_1 = require("./Session");
const TcpSocketAdapter_1 = require("./TcpSocketAdapter");
const WebSocketAdapter_1 = require("./WebSocketAdapter");
class Server {
    constructor() {
        this.port = parseInt(process.env.SERVER_PORT || '14445');
        // TCP
        this.server = net.createServer((socket) => this.handleConnection(socket));
        // WebSocket on port + 1
        this.wss = new ws_1.WebSocketServer({ port: this.port + 1 });
    }
    start() {
        this.server.listen(this.port, () => {
            Logger_1.Logger.info(`TCP Server is listening on port ${this.port}`);
        });
        this.wss.on('listening', () => {
            Logger_1.Logger.info(`WebSocket Server is listening on port ${this.port + 1}`);
        });
        this.wss.on('connection', (ws, req) => {
            this.handleWSConnection(ws, req);
        });
        this.server.on('error', (err) => {
            Logger_1.Logger.error('TCP Server error:', err);
        });
        this.wss.on('error', (err) => {
            Logger_1.Logger.error('WebSocket Server error:', err);
        });
    }
    handleConnection(socket) {
        Logger_1.Logger.info(`New TCP connection from ${socket.remoteAddress}:${socket.remotePort}`);
        const session = new Session_1.Session(new TcpSocketAdapter_1.TcpSocketAdapter(socket));
    }
    handleWSConnection(ws, req) {
        const ip = req.socket.remoteAddress;
        Logger_1.Logger.info(`New WS connection from ${ip}`);
        const session = new Session_1.Session(new WebSocketAdapter_1.WebSocketAdapter(ws, req));
    }
}
exports.Server = Server;
