import { useState, useEffect } from 'react';
import { GameManager } from './game/GameManager';
import { NetworkClient } from './network/NetworkClient';
import { Message } from './network/Message';
import CreateChar from './game/CreateChar';
import GameScreen from './game/GameScreen';
import './App.css';

function App() {
    const [status, setStatus] = useState('Disconnected');
    const [isHandshakeDone, setIsHandshakeDone] = useState(false);
    const [logs, setLogs] = useState<string[]>([]);
    const [showCreateChar, setShowCreateChar] = useState(false);
    const [isInGame, setIsInGame] = useState(false);

    // Game state
    const [username, setUsername] = useState('admin');
    const [password, setPassword] = useState('123456');

    useEffect(() => {
        const client = NetworkClient.getInstance();

        const onConnected = () => setStatus('Connected');
        const onDisconnected = () => {
            setStatus('Disconnected');
            setIsHandshakeDone(false);
            setShowCreateChar(false);
            setIsInGame(false);
        };
        const onHandshake = () => setIsHandshakeDone(true);

        // Message handler
        const onMessage = (msg: Message) => {
            const cmd = msg.getCommand();
            // Reduce log spam for game loop messages
            if (cmd !== -28) {
                setLogs(prev => [`CMD: ${cmd} Size: ${msg.getData().length} `, ...prev.slice(0, 19)]);
            }

            switch (cmd) {
                case -28: // NOT_MAP
                    // This command usually contains map info or data updates.
                    // Assuming receives map info -> Enter Game
                    // Check buffer data to be sure if simpler? 
                    // For now, if we get -28 (and not sub 2 CREATE_CHAR), we assume game data load started.
                    // Actually server sends -28 sub 4 (VersionGame) -> Login Success sequence starts.
                    if (!isInGame && !showCreateChar) {
                        // Very naive check: If we receive data not_map, we are likely logging in.
                        setIsInGame(true);
                    }
                    break;
                case 2: // CREATE_PLAYER (sub command of NOT_MAP passed as separate CMD by my logic? No, check logic)
                    // Wait, NetworkClient emits '2' ? 
                    // NetworkClient.ts line 207: const msg = new Message(realCmd, ...);
                    // If realCmd is 2, it emits 2.
                    // Server sends CMD 2 for create player?
                    // Service.ts: switchToCreateChar -> msg = new Message(Cmd.CREATE_PLAYER); (Cmd.CREATE_PLAYER = 2)
                    // YES.
                    setShowCreateChar(true);
                    break;
            }
        };

        const onError = (err: Event) => setLogs(prev => [`Error: ${err} `, ...prev.slice(0, 19)]);

        client.on('connected', onConnected);
        client.on('disconnected', onDisconnected);
        client.on('handshake', onHandshake);
        client.on('message', onMessage);
        client.on('error', onError);

        return () => {
            client.off('connected', onConnected);
            client.off('disconnected', onDisconnected);
            client.off('handshake', onHandshake);
            client.off('message', onMessage);
            client.off('error', onError);
        };
    }, [isInGame, showCreateChar]); // Add dependencies

    const handleConnect = () => {
        GameManager.getInstance().connect('localhost', 14446);
    };

    const handleLogin = () => {
        GameManager.getInstance().login(username, password);
    };

    if (isInGame) {
        return <GameScreen />;
    }

    return (
        <div className="container">
            <h1>NRO Web Client</h1>

            <div className="status-bar">
                Status: <span className={status === 'Connected' ? 'success' : 'error'}>{status}</span>
                {isHandshakeDone && <span className="success"> (Handshake OK)</span>}
            </div>

            <div className="controls">
                {status === 'Disconnected' ? (
                    <button onClick={handleConnect}>Connect to Server</button>
                ) : (
                    <>
                        {!isHandshakeDone ? (
                            <div>Handshaking...</div>
                        ) : (
                            <>
                                {showCreateChar ? (
                                    <CreateChar onCancel={() => setShowCreateChar(false)} />
                                ) : (
                                    <div className="login-form">
                                        <input
                                            type="text"
                                            value={username}
                                            onChange={(e) => setUsername(e.target.value)}
                                            placeholder="Username"
                                        />
                                        <input
                                            type="password"
                                            value={password}
                                            onChange={(e) => setPassword(e.target.value)}
                                            placeholder="Password"
                                        />
                                        <button onClick={handleLogin}>Login</button>
                                    </div>
                                )}
                            </>
                        )}
                    </>
                )}
            </div>

            <div className="logs">
                <h3>Logs</h3>
                {logs.map((log, index) => (
                    <div key={index} className="log-entry">{log}</div>
                ))}
            </div>
        </div>
    );
}

export default App;
