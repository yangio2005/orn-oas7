"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.TcpSocketAdapter = void 0;
class TcpSocketAdapter {
    constructor(socket) {
        this.socket = socket;
    }
    send(data) {
        if (this.isConnected()) {
            this.socket.write(data);
        }
    }
    on(event, listener) {
        this.socket.on(event, listener);
    }
    close() {
        this.socket.end();
        this.socket.destroy();
    }
    getRemoteAddress() {
        return this.socket.remoteAddress || '';
    }
    getRemotePort() {
        return this.socket.remotePort || 0;
    }
    isConnected() {
        return !this.socket.destroyed && this.socket.writable;
    }
}
exports.TcpSocketAdapter = TcpSocketAdapter;
