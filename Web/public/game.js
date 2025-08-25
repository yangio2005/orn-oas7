const KEY = "boys"; // The encryption key from C# server

class ClientProtocol {
    constructor(socket) {
        this.socket = socket;
        this.curR = 0; // Read cursor for KEY
        this.curW = 0; // Write cursor for KEY
        this.isGetKeyComplete = false; // Handshake status

        this.socket.on('tcp_message', (data) => {
            console.log('Received raw message from server:', data);
            // Convert array of numbers back to Uint8Array
            const receivedBuffer = new Uint8Array(data);
            this.handleIncomingData(receivedBuffer);
        });
    }

    readKey(b) {
        const keyBytes = new TextEncoder().encode(KEY);
        const i = (keyBytes[this.curR++] ^ (b & 0xFF));
        if (this.curR >= keyBytes.length) {
            this.curR %= keyBytes.length;
        }
        return i;
    }

    writeKey(b) {
        const keyBytes = new TextEncoder().encode(KEY);
        const i = (keyBytes[this.curW++] ^ (b & 0xFF));
        if (this.curW >= keyBytes.length) {
            this.curW %= keyBytes.length;
        }
        return i;
    }

    handleIncomingData(data) {
        // This is a simplified version for now, assuming full messages arrive
        // In a real scenario, you'd need a buffer similar to the server-side
        // to handle fragmented messages.
        console.log('Received parsed message from server:', data);
        // For now, just log. Later, parse and dispatch.
        const command = data[0]; // Assuming command is the first byte after decryption
        const decodedCommand = this.readKey(command); // Assuming it's already decrypted by proxy

        if (decodedCommand === -29) { // Login response
            const result = data[1]; // Assuming result is the second byte after decryption
            if (result === 1) {
                loginFeedbackText.setText('Login successful!').setColor('#00ff00');
                console.log('Login successful!');
            } else {
                loginFeedbackText.setText('Login failed. Please check credentials.').setColor('#ff0000');
                console.log('Login failed.');
            }
        }
    }

    sendHandshake() {
        const keyBytes = new TextEncoder().encode(KEY);
        // Calculate transformed key bytes as per C# server logic
        const transformedKeyBytes = new Uint8Array(keyBytes.length);
        transformedKeyBytes[0] = keyBytes[0];
        for (let i = 1; i < keyBytes.length; i++) {
            transformedKeyBytes[i] = keyBytes[i] ^ keyBytes[i - 1];
        }

        // cmd (-27) + len + xored_key + utf_len (2) + int (4) + byte (1)
        const messageBuffer = new ArrayBuffer(1 + 1 + transformedKeyBytes.length + 2 + 4 + 1);
        const view = new DataView(messageBuffer);
        let offset = 0;

        // Command -27
        view.setInt8(offset++, -27);

        // Length of KEY
        view.setUint8(offset++, transformedKeyBytes.length);

        // Transformed key bytes
        for (let i = 0; i < transformedKeyBytes.length; i++) {
            view.setUint8(offset++, transformedKeyBytes[i]);
        }

        // Empty UTF string (length 0)
        view.setUint16(offset, 0, false); // Big-endian
        offset += 2;

        // Int 0
        view.setInt32(offset, 0, false); // Big-endian
        offset += 4;

        // Byte 0
        view.setUint8(offset++, 0);

        // Send the ArrayBuffer as a Uint8Array
        this.socket.emit('tcp_message', Array.from(new Uint8Array(messageBuffer))); // Convert to array of numbers
        console.log('Sent handshake request from client');
    }

    sendMessage(command, data) {
        // Data is expected to be a Uint8Array or similar
        const dataLength = data ? data.byteLength : 0;

        // Calculate message size based on C# server protocol
        // For now, assuming 2-byte size and always encrypted after handshake
        // This needs to be refined for special 3-byte commands if they are sent from client
        const sizeBytes = new Uint8Array(2);
        const sizeView = new DataView(sizeBytes.buffer);
        sizeView.setUint16(0, dataLength, false); // Big-endian

        let offset = 0;
        const messageBuffer = new ArrayBuffer(1 + 2 + dataLength); // cmd + size + data
        const view = new DataView(messageBuffer);

        // Command
        view.setInt8(offset++, this.writeKey(command));

        // Size
        view.setUint8(offset++, this.writeKey(sizeBytes[0]));
        view.setUint8(offset++, this.writeKey(sizeBytes[1]));

        // Data
        if (dataLength > 0) {
            for (let i = 0; i < dataLength; i++) {
                view.setUint8(offset++, this.writeKey(data[i]));
            }
        }

        this.socket.emit('tcp_message', Array.from(new Uint8Array(messageBuffer)));
        console.log(`Sent command ${command} with data:`, data);
    }
}

// Phaser Game Configuration
const config = {
    type: Phaser.AUTO,
    width: 800,
    height: 600,
    scene: {
        preload: preload,
        create: create,
        update: update
    }
};

const game = new Phaser.Game(config);
let clientProtocol;
let loginFeedbackText;

function preload() {
    // Load assets here
}

function create() {
    // Set background color
    this.cameras.main.setBackgroundColor('#2c3e50');

    // Initialize Socket.IO connection
    const socket = io();
    clientProtocol = new ClientProtocol(socket);

    socket.on('connect', () => {
        console.log('Connected to Socket.IO server');
        // Send handshake request to TCP server via Socket.IO proxy
        clientProtocol.sendHandshake();
    });

    socket.on('disconnect', () => {
        console.log('Disconnected from Socket.IO server');
    });

    // Game Title
    this.add.text(this.cameras.main.width / 2, 100, 'NRO Web Client', {
        fontSize: '48px',
        fill: '#ecf0f1',
        fontFamily: 'Arial, sans-serif'
    }).setOrigin(0.5);

    // Instruction text
    this.add.text(this.cameras.main.width / 2, 250, 'Please provide username and password in the chat.', {
        fontSize: '24px',
        fill: '#ecf0f1',
        fontFamily: 'Arial, sans-serif',
        align: 'center'
    }).setOrigin(0.5);

    // Login feedback text
    loginFeedbackText = this.add.text(this.cameras.main.width / 2, 350, '', {
        fontSize: '20px',
        fill: '#fff',
        fontFamily: 'Arial, sans-serif'
    }).setOrigin(0.5);
}

function update() {
    // Game logic updates
}

// This function will now be called by the agent
function handleLogin(username, password) {
    const clientVersion = "2.4.6"; // Example version, from Java client analysis
    const clientType = 0; // Example type, from Java client analysis
    const extraByte = 0; // Example extra byte, from Java client analysis (aw.fA)

    console.log(`Attempting to login with Username: ${username}, Password: ${password}`);
    loginFeedbackText.setText('Logging in...').setColor('#f1c40f');

    // Construct the message data for command 0
    const encoder = new TextEncoder();
    const usernameBytes = encoder.encode(username);
    const passwordBytes = encoder.encode(password);
    const versionBytes = encoder.encode(clientVersion);

    // Calculate total data length
    // UTF strings are prefixed with 2 bytes for length
    const dataLength = (2 + usernameBytes.byteLength) + 
                       (2 + passwordBytes.byteLength) + 
                       (2 + versionBytes.byteLength) + 
                       1 + // clientType
                       1;   // extraByte

    const loginDataBuffer = new ArrayBuffer(dataLength);
    const loginDataView = new DataView(loginDataBuffer);
    let offset = 0;

    // Write username
    loginDataView.setUint16(offset, usernameBytes.byteLength, false); // Big-endian
    offset += 2;
    new Uint8Array(loginDataBuffer).set(usernameBytes, offset);
    offset += usernameBytes.byteLength;

    // Write password
    loginDataView.setUint16(offset, passwordBytes.byteLength, false); // Big-endian
    offset += 2;
    new Uint8Array(loginDataBuffer).set(passwordBytes, offset);
    offset += passwordBytes.byteLength;

    // Write version
    loginDataView.setUint16(offset, versionBytes.byteLength, false); // Big-endian
    offset += 2;
    new Uint8Array(loginDataBuffer).set(versionBytes, offset);
    offset += versionBytes.byteLength;

    // Write clientType
    loginDataView.setUint8(offset++, clientType);

    // Write extraByte
    loginDataView.setUint8(offset++, extraByte);

    clientProtocol.sendMessage(0, new Uint8Array(loginDataBuffer));
}
