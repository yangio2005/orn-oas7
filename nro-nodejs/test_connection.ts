import * as net from 'net';

const client = new net.Socket();
client.connect(14445, '127.0.0.1', () => {
    console.log('CONNECTED TO SERVER');
    client.destroy();
});

client.on('error', (err) => {
    console.error('CONNECTION FAILED:', err.message);
});
