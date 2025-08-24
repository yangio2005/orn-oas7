
const express = require('express');
const http = require('http');
const { Server } = require("socket.io");

const app = express();
const server = http.createServer(app);
const io = new Server(server);

const PORT = 3000;

// Serve các file tĩnh từ thư mục 'public'
app.use(express.static('public'));

app.get('/', (req, res) => {
  res.sendFile(__dirname + '/public/index.html');
});

io.on('connection', (socket) => {
  console.log('Một người chơi đã kết nối:', socket.id);

  socket.on('disconnect', () => {
    console.log('Người chơi đã ngắt kết nối:', socket.id);
  });
});

server.listen(PORT, () => {
  console.log(`Server đang chạy tại http://localhost:${PORT}`);
});
