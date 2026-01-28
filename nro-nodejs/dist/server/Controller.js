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
exports.Controller = void 0;
const Cmd_1 = require("../constants/Cmd");
const AuthService_1 = require("../services/AuthService");
const Logger_1 = require("../utils/Logger");
class Controller {
    static getInstance() {
        if (!Controller.instance) {
            Controller.instance = new Controller();
        }
        return Controller.instance;
    }
    static gI() {
        return Controller.getInstance();
    }
    onMessage(session, msg) {
        const cmd = msg.getCommand();
        try {
            switch (cmd) {
                case Cmd_1.Cmd.NOT_LOGIN: // -29
                    this.messageNotLogin(session, msg);
                    break;
                case 122: // LOGIN_DE or forcing login?
                    // Java: Controller.onMessage 122 -> ?
                    // Just handling NOT_LOGIN for now
                    break;
                case Cmd_1.Cmd.CLIENT_INFO: // 2 ?
                    // Session handled this? In Java messageNotLogin case 2 calls setClientType
                    break;
                default:
                    // Logger.debug(`CMD receive: ${cmd}`);
                    break;
            }
        }
        catch (e) {
            Logger_1.Logger.error(`Error handling message ${cmd}: ${e}`);
        }
        finally {
            msg.cleanup();
        }
    }
    messageNotLogin(session, msg) {
        try {
            const cmd = msg.reader.readByte();
            switch (cmd) {
                case 0: // LOGIN
                    const username = msg.reader.readString();
                    const password = msg.reader.readString();
                    AuthService_1.AuthService.getInstance().login(session, username, password);
                    break;
                case 2: // CLIENT_TYPE
                    Promise.resolve().then(() => __importStar(require("../services/Service"))).then(({ Service }) => {
                        Service.getInstance().setClientType(session, msg);
                    });
                    break;
                default:
                    break;
            }
        }
        catch (e) {
            Logger_1.Logger.error("Error in messageNotLogin: " + e);
        }
    }
}
exports.Controller = Controller;
