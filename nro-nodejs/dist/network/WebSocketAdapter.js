"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.WebSocketAdapter = void 0;
const ws_1 = require("ws");
class WebSocketAdapter {
    constructor(ws, req) {
        this.ws = ws;
        this.req = req;
    }
    send(data) {
        if (this.isConnected()) {
            this.ws.send(data);
        }
    }
    on(event, listener) {
        if (event === 'data') {
            this.ws.on('message', (data, isBinary) => {
                let buf;
                if (Buffer.isBuffer(data)) {
                    buf = data;
                }
                else if (data instanceof ArrayBuffer) {
                    buf = Buffer.from(data);
                }
                else if (Array.isArray(data)) {
                    buf = Buffer.concat(data);
                }
                else {
                    buf = Buffer.from(data);
                }
                listener(buf);
            });
        }
        else if (event === 'close') {
            this.ws.on('close', listener);
        }
        else if (event === 'error') {
            this.ws.on('error', listener);
        }
    }
    close() {
        this.ws.close();
    }
    getRemoteAddress() {
        return this.req.socket.remoteAddress || '';
    }
    getRemotePort() {
        return this.req.socket.remotePort || 0;
    }
    isConnected() {
        return this.ws.readyState === ws_1.WebSocket.OPEN;
    }
}
exports.WebSocketAdapter = WebSocketAdapter;
