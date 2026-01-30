# NRO Web Client

This is a web client for NRO Node.js server.
It uses WebSockets to communicate with the server.

## Setup

1. Install dependencies:
   ```bash
   npm install
   ```

2. Start the connection server:
   Ensure `nro-nodejs` server is running. It now supports WebSockets on port `14446` (Server Port + 1).

3. Run the client:
   ```bash
   npm run dev
   ```

## Structure
- `src/network/`: Handles WebSocket connection and custom binary protocol (Message/Session).
- `src/game/`: Game logic managers.
- `src/App.tsx`: Main UI.
