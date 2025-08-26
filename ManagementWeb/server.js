const express = require('express');
const mysql = require('mysql2/promise');
const path = require('path');

const app = express();
const PORT = 3001; // Using a different port to avoid conflict with the game client if it were running

// MySQL Connection Pool
const pool = mysql.createPool({
    host: '127.0.0.1',
    user: 'root',
    password: 'admin1234',
    database: 'real_acc',
    waitForConnections: true,
    connectionLimit: 10,
    queueLimit: 0
});

// Serve static files from the 'public' directory
app.use(express.static(path.join(__dirname, 'public')));

// API endpoint to get all users
app.get('/api/users', async (req, res) => {
    try {
        const [rows] = await pool.query('SELECT id, username, password, active FROM account');
        res.json(rows);
    } catch (err) {
        console.error('Error fetching users:', err);
        res.status(500).json({ message: 'Error fetching users', error: err.message });
    }
});

// Serve the main HTML page
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'public', 'index.html'));
});

app.listen(PORT, () => {
    console.log(`Management server running on http://localhost:${PORT}`);
});
