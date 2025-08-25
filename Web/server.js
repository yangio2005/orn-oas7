const express = require('express');
const http = require('http');
const socketIo = require('socket.io');
const path = require('path');
const net = require('net'); // Import net module

const app = express();
const server = http.createServer(app);
const io = socketIo(server);

const TCP_GAME_SERVER_PORT = 14445; // Port of our custom TCP game server
const TCP_GAME_SERVER_HOST = 'localhost'; // Host of our custom TCP game server

// Serve static files from the 'public' directory
app.use(express.static(path.join(__dirname, 'public')));

io.on('connection', (socket) => {
  console.log('A web client connected via Socket.IO');

  // Establish a TCP connection to the game server for this web client
  const tcpClient = new net.Socket();

  tcpClient.connect(TCP_GAME_SERVER_PORT, TCP_GAME_SERVER_HOST, () => {
    console.log('Proxy connected to TCP game server');
  });

  // Forward data from TCP game server to web client via Socket.IO
  tcpClient.on('data', (data) => {
    // console.log('Data from TCP game server:', data.toString('hex'));
    socket.emit('tcp_message', data.toJSON().data); // Send as array of numbers
  });

  // Forward data from web client (Socket.IO) to TCP game server
  socket.on('tcp_message', (data) => {
    // console.log('Data from web client (Socket.IO):', Buffer.from(data).toString('hex'));
    tcpClient.write(Buffer.from(data));
  });

  // Handle disconnects
  socket.on('disconnect', () => {
    console.log('Web client disconnected from Socket.IO');
    tcpClient.end(); // End TCP connection when web client disconnects
  });

  tcpClient.on('end', () => {
    console.log('TCP game server disconnected from proxy');
    socket.disconnect(true); // Disconnect Socket.IO client
  });

  tcpClient.on('error', (err) => {
    console.error('TCP proxy error:', err);
    socket.emit('error', 'Proxy connection to game server failed.');
    socket.disconnect(true); // Disconnect Socket.IO client on TCP error
  });
});

const PORT = process.env.PORT || 3000;
server.listen(PORT, () => {
  console.log(`Web server (Socket.IO proxy) running on port ${PORT}`);
});
