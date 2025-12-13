package com.girlkun.server.websocket;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BossNotificationWebSocketServer extends WebSocketServer {

    private static BossNotificationWebSocketServer instance;
    private final Set<WebSocket> connections;

    private BossNotificationWebSocketServer(int port) {
        super(new InetSocketAddress(port));
        this.connections = Collections.synchronizedSet(new HashSet<>());
        System.out.println("WebSocket Server started on port: " + port);
    }

    public static BossNotificationWebSocketServer getInstance(int port) {
        if (instance == null) {
            instance = new BossNotificationWebSocketServer(port);
        }
        return instance;
    }

    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake) {
        connections.add(conn);
        System.out.println("New WebSocket connection from " + conn.getRemoteSocketAddress().getAddress().getHostAddress());
        conn.send("Chào mừng bạn đến với kênh thông báo Boss!");
    }

    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {
        connections.remove(conn);
        System.out.println("Closed WebSocket connection from " + conn.getRemoteSocketAddress().getAddress().getHostAddress() + " with exit code " + code + " reason: " + reason);
    }

    @Override
    public void onMessage(WebSocket conn, String message) {
        System.out.println("Received message from " + conn.getRemoteSocketAddress().getAddress().getHostAddress() + ": " + message);
        // We don't expect messages from clients for this notification system
    }

    @Override
    public void onError(WebSocket conn, Exception ex) {
        System.err.println("WebSocket error on conn " + (conn != null ? conn.getRemoteSocketAddress().getAddress().getHostAddress() : "null") + ": " + ex.getMessage());
        ex.printStackTrace();
    }

    @Override
    public void onStart() {
        System.out.println("WebSocket server started successfully!");
        setConnectionLostTimeout(0); // Disable connection lost timeout for testing
        setConnectionLostTimeout(100); // Set a timeout for production
    }

    /**
     * Gửi thông báo đến tất cả các client WebSocket đã kết nối.
     * @param message Thông báo cần gửi.
     */
    public void broadcast(String message) {
        for (WebSocket conn : connections) {
            if (conn.isOpen()) {
                conn.send(message);
            }
        }
        System.out.println("Broadcasted to " + connections.size() + " WebSocket clients: " + message);
    }
}
