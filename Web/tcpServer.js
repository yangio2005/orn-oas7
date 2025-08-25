const net = require('net');

const TCP_PORT = 14445; // As per user's provided server list
const KEY = "boys"; // The encryption key from C# server

class Session {
  constructor(socket) {
    this.socket = socket;
    this.curR = 0; // Read cursor for KEY
    this.curW = 0; // Write cursor for KEY
    this.isGetKeyComplete = false; // Handshake status
    this.buffer = Buffer.alloc(0); // Buffer to accumulate incoming data

    this.socket.on('data', (data) => {
      this.buffer = Buffer.concat([this.buffer, data]);
      this.handleData();
    });

    this.socket.on('end', () => {
      console.log('Client disconnected from TCP server');
    });

    this.socket.on('error', (err) => {
      console.error('TCP server error:', err);
    });
  }

  readKey(b) {
    const keyBytes = Buffer.from(KEY, 'ascii');
    const i = (keyBytes[this.curR++] ^ (b & 0xFF));
    if (this.curR >= keyBytes.length) {
      this.curR %= keyBytes.length;
    }
    return i;
  }

  writeKey(b) {
    const keyBytes = Buffer.from(KEY, 'ascii');
    const i = (keyBytes[this.curW++] ^ (b & 0xFF));
    if (this.curW >= keyBytes.length) {
      this.curW %= keyBytes.length;
    }
    return i;
  }

  handleData() {
    while (this.buffer.length > 0) {
      try {
        const message = this.readMessage();
        if (message) {
          console.log('Parsed message:', message);
          // Process the message based on its command
          if (message.command === -27) {
            // Handshake message
            if (!this.isGetKeyComplete) {
              this.sendHandshake();
              this.isGetKeyComplete = true;
            }
          } else if (message.command === 0) {
            // Login command
            this.handleLogin(message.data);
          } else {
            console.log(`Unhandled command: ${message.command}`);
          }
        } else {
          // Not enough data for a full message yet, wait for more
          break;
        }
      } catch (e) {
        console.error('Error parsing message:', e);
        this.socket.end(); // Close connection on error
        break;
      }
    }
  }

  readMessage() {
    // Need at least 1 byte for command
    if (this.buffer.length < 1) return null;

    let offset = 0;
    let cmd = this.buffer.readInt8(offset++);

    let isHandshake = (cmd === -27);

    if (!isHandshake) {
      cmd = this.readKey(cmd);
    }

    // Need at least 2 bytes for size (or 3 for special commands)
    if (this.buffer.length < offset + 2) return null; // Minimum 2 bytes for size

    let size = 0;
    const specialCommands = [-32, -66, 11, -67, -74, -87, 66];

    if (!isHandshake) {
      if (specialCommands.includes(cmd)) {
        // Special 3-byte size
        if (this.buffer.length < offset + 3) return null;
        const b1 = this.readKey(this.buffer.readInt8(offset++));
        const b2 = this.readKey(this.buffer.readInt8(offset++));
        const b3 = this.readKey(this.buffer.readInt8(offset++));
        // Reconstruct size from 3 bytes (C# logic: a, b, c)
        // This part needs careful translation from C# to JS
        // For now, let's assume a simple reconstruction or skip if too complex
        // The C# code for 3-byte size is complex and involves modulo and division
        // For initial implementation, we might need to simplify or assume 2-byte size first
        // Let's simplify for now and assume 2-byte size for all non -27 commands
        // This will need to be revisited for full compatibility
        console.warn('Special 3-byte size commands detected, but using 2-byte size for now.');
        const val1 = this.readKey(this.buffer.readInt8(offset++));
        const val2 = this.readKey(this.buffer.readInt8(offset++));
        size = (val1 & 0xFF) << 8 | (val2 & 0xFF);
      } else {
        // Standard 2-byte size
        const val1 = this.readKey(this.buffer.readInt8(offset++));
        const val2 = this.readKey(this.buffer.readInt8(offset++));
        size = (val1 & 0xFF) << 8 | (val2 & 0xFF);
      }
    } else {
      // Command -27 uses UInt16 directly for size
      size = this.buffer.readUInt16BE(offset);
      offset += 2;
    }

    // Check if enough data for the message body
    if (this.buffer.length < offset + size) return null;

    let data = this.buffer.slice(offset, offset + size);
    offset += size;

    if (!isHandshake) {
      for (let i = 0; i < data.length; i++) {
        data[i] = this.readKey(data[i]);
      }
    }

    // Consume the read bytes from the buffer
    this.buffer = this.buffer.slice(offset);

    return { command: cmd, data: data };
  }

  sendMessage(command, data) {
    const dataLength = data ? data.length : 0;

    // Calculate message size based on C# server protocol
    // For now, assuming 2-byte size and always encrypted after handshake
    // This needs to be refined for special 3-byte commands if they are sent from client
    const sizeBytes = Buffer.alloc(2);
    sizeBytes.writeUInt16BE(dataLength, 0); // Big-endian

    let offset = 0;
    const messageBuffer = Buffer.alloc(1 + 2 + dataLength); // cmd + size + data

    // Command
    messageBuffer.writeInt8(this.writeKey(command), offset++);

    // Size
    messageBuffer.writeUInt8(this.writeKey(sizeBytes[0]), offset++);
    messageBuffer.writeUInt8(this.writeKey(sizeBytes[1]), offset++);

    // Data
    if (dataLength > 0) {
        for (let i = 0; i < dataLength; i++) {
            messageBuffer.writeUInt8(this.writeKey(data[i]), offset++);
        }
    }

    this.socket.write(messageBuffer);
  }

  sendHandshake() {
    const keyBytes = Buffer.from(KEY, 'ascii');
    // Calculate transformed key bytes as per C# server logic
    const transformedKeyBytes = Buffer.alloc(keyBytes.length);
    transformedKeyBytes[0] = keyBytes[0];
    for (let i = 1; i < keyBytes.length; i++) {
      transformedKeyBytes[i] = keyBytes[i] ^ keyBytes[i - 1];
    }

    // cmd (-27) + len + xored_key + utf_len (2) + int (4) + byte (1)
    const message = Buffer.alloc(1 + 1 + transformedKeyBytes.length + 2 + 4 + 1);
    let offset = 0;

    // Command -27
    message.writeInt8(-27, offset++);

    // Length of KEY
    message.writeUInt8(transformedKeyBytes.length, offset++);

    // Transformed key bytes
    transformedKeyBytes.copy(message, offset);
    offset += transformedKeyBytes.length;

    // Empty UTF string (length 0)
    message.writeUInt16BE(0, offset);
    offset += 2;

    // Int 0
    message.writeInt32BE(0, offset);
    offset += 4;

    // Byte 0
    message.writeUInt8(0, offset++);

    this.socket.write(message);
    console.log('Sent handshake response');
  }

  handleLogin(data) {
    const reader = {
      buffer: data,
      offset: 0,
      readUTF: function() {
        const len = this.buffer.readUInt16BE(this.offset);
        this.offset += 2;
        const str = this.buffer.toString('utf8', this.offset, this.offset + len);
        this.offset += len;
        return str;
      },
      readByte: function() {
        const byte = this.buffer.readInt8(this.offset);
        this.offset += 1;
        return byte;
      },
      readInt: function() {
        const int = this.buffer.readInt32BE(this.offset);
        this.offset += 4;
        return int;
      }
    };

    const username = reader.readUTF();
    const password = reader.readUTF();
    const clientVersion = reader.readUTF();
    const clientType = reader.readByte();
    const extraByte = reader.readByte();

    console.log(`Login attempt: Username: ${username}, Password: ${password}, Version: ${clientVersion}, Type: ${clientType}, Extra: ${extraByte}`);

    // Dummy response: Command -29 (Login success/failure)
    // C# server sends: byte result (1 for success, 0 for failure)
    const loginResult = (username === "test" && password === "test") ? 1 : 0; // Simple check
    const responseData = Buffer.alloc(1);
    responseData.writeInt8(loginResult, 0);

    this.sendMessage(-29, responseData);
    console.log(`Sent login response: ${loginResult === 1 ? 'Success' : 'Failure'}`);
  }
}

const server = net.createServer((socket) => {
  console.log('Client connected to TCP server');
  new Session(socket); // Create a new session for each client
});

server.listen(TCP_PORT, () => {
  console.log(`TCP server listening on port ${TCP_PORT}`);
});
