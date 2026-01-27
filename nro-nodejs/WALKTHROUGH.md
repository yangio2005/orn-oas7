# NRO Node.js Server Migration - Initial Phase

## Overview
We have successfully initialized the Node.js project and ported the core networking and utility components from the Java source. The server is now capable of starting up and listening for TCP connections on port 14445.

## Accomplishments

### 1. Environment Setup
- Initialized `nro-nodejs` project with TypeScript.
- Installed dependencies: `typescript`, `ts-node`, `mysql2`, `dotenv`, `winston`.
- Configured `tsconfig.json` and `.env`.

### 2. Core Library Porting
- **Constants**:
    - `src/constants/Cmd.ts`: Ported all command IDs from `msg.java`.
    - `src/constants/ConstMap.ts`, `ConstPlayer.ts`, `ConstNpc.ts`: Ported game constants.
- **Utilities**:
    - `src/utils/TimeUtil.ts`: Date/time manipulation functions.
    - `src/utils/Util.ts`: General helper functions (Random, Math, String).

### 3. Networking Engine
- **Message.ts**: Implemented binary protocol reader/writer compatible with the Java client (`DataInputStream`/`DataOutputStream` equivalent).
- **Session.ts**: Implemented TCP session management and basic packet buffering.
- **Server.ts**: Created the TCP server listener.

### 4. Database Structure
- Created `src/config/database.ts` using `mysql2` connection pool.
- Configured connection settings in `.env` (Database: `mobi`).
- *Note: Server currently runs in Mock Mode if database connection fails.*

## How to Run

1.  Navigate to the project directory:
    ```bash
    cd nro-nodejs
    ```

2.  Run the server:
    ```bash
    npm start
    ```
    *(Or `npx ts-node src/main.ts` for development)*

## Next Steps (Phase 4 & 5)
- **Models**: Define `Player`, `Item`, `Map` classes in `src/models`.
- **Login Logic**: Implement `Controller` and `Service` to handle `Cmd.LOGIN`.
- **Database DAOs**: Implement `PlayerDAO` to load data from MySQL.
