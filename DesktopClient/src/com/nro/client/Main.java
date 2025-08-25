package com.nro.client;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {

    private static final String KEY = "boys";
    private static final byte[] KEY_BYTES = KEY.getBytes(StandardCharsets.US_ASCII);

    private static int curR = 0;
    private static int curW = 0;

    private static byte readKey(byte b) {
        byte i = (byte) ((KEY_BYTES[curR++] & 0xFF) ^ (b & 0xFF));
        if (curR >= KEY_BYTES.length) {
            curR %= KEY_BYTES.length;
        }
        return i;
    }

    private static byte writeKey(byte b) {
        byte i = (byte) ((KEY_BYTES[curW++] & 0xFF) ^ (b & 0xFF));
        if (curW >= KEY_BYTES.length) {
            curW %= KEY_BYTES.length;
        }
        return i;
    }

    // --- MyReader Equivalent ---
    static class MyReader {
        private byte[] buffer;
        private int posRead;

        public MyReader(byte[] data) {
            this.buffer = data;
            this.posRead = 0;
        }

        public byte readByte() throws IOException {
            if (posRead < buffer.length) {
                return buffer[posRead++];
            }
            throw new IOException("End of buffer reached");
        }

        public short readShort() throws IOException {
            short num = 0;
            for (int i = 0; i < 2; i++) {
                num = (short) (num << 8);
                num = (short) (num | (short) (0xFF & readByte()));
            }
            return num;
        }

        public int readInt() throws IOException {
            int num = 0;
            for (int i = 0; i < 4; i++) {
                num <<= 8;
                num |= (0xFF & readByte());
            }
            return num;
        }

        public boolean readBoolean() throws IOException {
            return readByte() > 0;
        }

        public String readUTF() throws IOException {
            short length = readShort();
            byte[] bytes = new byte[length];
            for (int i = 0; i < length; i++) {
                bytes[i] = readByte();
            }
            return new String(bytes, StandardCharsets.UTF_8);
        }

        public byte[] readBytes(int length) throws IOException {
            byte[] bytes = new byte[length];
            for (int i = 0; i < length; i++) {
                bytes[i] = readByte();
            }
            return bytes;
        }
    }

    // --- MyWriter Equivalent ---
    static class MyWriter {
        private ByteArrayOutputStream baos;
        private DataOutputStream dos;

        public MyWriter() {
            baos = new ByteArrayOutputStream();
            dos = new DataOutputStream(baos);
        }

        public void writeByte(byte value) throws IOException {
            dos.writeByte(value);
        }

        public void writeShort(short value) throws IOException {
            dos.writeShort(value);
        }

        public void writeInt(int value) throws IOException {
            dos.writeInt(value);
        }

        public void writeBoolean(boolean value) throws IOException {
            dos.writeBoolean(value);
        }

        public void writeUTF(String value) throws IOException {
            byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
            writeShort((short) bytes.length);
            dos.write(bytes);
        }

        public void writeBytes(byte[] data) throws IOException {
            dos.write(data);
        }

        public byte[] getData() {
            return baos.toByteArray();
        }
    }

    // --- Message Class Equivalent ---
    static class Message {
        public byte command;
        public MyReader reader;
        public MyWriter writer;

        public Message(byte command) {
            this.command = command;
            this.writer = new MyWriter();
        }

        public Message(byte command, byte[] data) {
            this.command = command;
            this.reader = new MyReader(data);
        }

        public byte[] getData() {
            return writer.getData();
        }
    }

    public static void main(String[] args) {
        String host = "localhost";
        int port = 14445;

        try {
            System.out.println("Attempting to connect to " + host + ":" + port + "...");
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(host, port), 5000); // 5 second timeout
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            System.out.println("Connected to server: " + host + ":" + port);

            // --- Handshake --- (Client sends CMD -27)
            System.out.println("Performing handshake...");
            Message handshakeMsg = new Message((byte) -27);
            handshakeMsg.writer.writeByte((byte) KEY_BYTES.length);
            handshakeMsg.writer.writeByte(KEY_BYTES[0]);
            for (int i = 1; i < KEY_BYTES.length; i++) {
                handshakeMsg.writer.writeByte((byte) (KEY_BYTES[i] ^ KEY_BYTES[i - 1]));
            }
            handshakeMsg.writer.writeUTF(""); // Empty string
            handshakeMsg.writer.writeInt(0);
            handshakeMsg.writer.writeByte((byte) 0);
            
            doSendMessage(handshakeMsg, dos, true); // isGetKeyComplete = true after handshake

            // --- Receive Handshake Response --- (Server sends CMD -27)
            byte cmd = readMessage(dis, true); // isGetKeyComplete = true
            if (cmd == -27) {
                System.out.println("Handshake successful!");
            } else {
                System.out.println("Handshake failed. Received command: " + cmd);
            }

            // --- Send a test message (e.g., login) ---
            // This is a placeholder. You'll need to know the actual login command and data structure.
            // For demonstration, let's send a dummy message with command 1 and some data.
            System.out.println("Sending test message...");
            Message testMsg = new Message((byte) 1); // Example command
            testMsg.writer.writeUTF("testuser");
            testMsg.writer.writeUTF("testpass");
            doSendMessage(testMsg, dos, true);

            // --- Receive response ---
            System.out.println("Waiting for server response...");
            byte responseCmd = readMessage(dis, true);
            System.out.println("Received response command: " + responseCmd);

        } catch (IOException e) {
            System.err.println("Client error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void doSendMessage(Message message, DataOutputStream dos, boolean isGetKeyComplete) throws IOException {
        byte cmd = message.command;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream tempDos = new DataOutputStream(baos);

        tempDos.writeByte(isGetKeyComplete ? writeKey(cmd) : cmd);

        byte[] data = message.getData();
        if (data != null && data.length > 0) {
            int size = data.length;

            // Custom 3-byte length encoding for specific commands (simplified for client test)
            // This part needs to match server's logic precisely if used.
            if (Arrays.asList((byte)-32, (byte)-66, (byte)11, (byte)-67, (byte)-74, (byte)-87, (byte)66).contains(cmd)) {
                // Simplified for client test, actual logic from C# server is complex
                // For a full implementation, replicate C# Server's DoSendMessage logic here.
                // For now, we'll just use the standard 2-byte length for simplicity in client test.
                tempDos.writeByte(isGetKeyComplete ? writeKey((byte)(size >> 8)) : (byte)(size >> 8));
                tempDos.writeByte(isGetKeyComplete ? writeKey((byte)(size & 0xFF)) : (byte)(size & 0xFF));
            } else if (isGetKeyComplete) {
                tempDos.writeByte(writeKey((byte)(size >> 8)));
                tempDos.writeByte(writeKey((byte)(size & 0xFF)));
            } else {
                tempDos.writeByte((byte)(size >> 8));
                tempDos.writeByte((byte)(size & 0xFF));
            }

            byte[] finalData = data;
            if (isGetKeyComplete) {
                finalData = new byte[data.length];
                for (int i = 0; i < data.length; i++) {
                    finalData[i] = writeKey(data[i]);
                }
            }
            tempDos.write(finalData);
        }
        dos.write(baos.toByteArray());
        dos.flush();
    }

    private static byte readMessage(DataInputStream dis, boolean isGetKeyComplete) throws IOException {
        byte cmd = dis.readByte();
        if (isGetKeyComplete && cmd != -27) {
            cmd = readKey(cmd);
        }

        int size = 0;
        if (cmd != -27) {
            byte b1 = dis.readByte();
            byte b2 = dis.readByte();
            if (isGetKeyComplete) {
                size = (readKey(b1) & 0xFF) << 8 | (readKey(b2) & 0xFF);
            } else {
                size = (b1 & 0xFF) << 8 | (b2 & 0xFF);
            }
        } else {
            size = dis.readUnsignedShort(); // For handshake, size is unsigned short
        }

        byte[] data = new byte[size];
        dis.readFully(data);

        if (isGetKeyComplete && cmd != -27) {
            for (int i = 0; i < data.length; i++) {
                data[i] = readKey(data[i]);
            }
        }
        // For now, we just return the command. A full client would parse the data.
        return cmd;
    }
}
