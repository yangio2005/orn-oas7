# Kế hoạch chuyển đổi Core Java sang Node.js (TypeScript)

## 1. Phân tích hiện trạng
Mã nguồn hiện tại là Java server cho game NRO, bao gồm:
- **Game Logic (Src)**: `src/com/girlkun` (Server, Models, Services, Consts, Utils).
- **Core Engine (Libs)**: Các file `.jar` hỗ trợ Network, DB, JSON.

Mục tiêu: Chuyển đổi toàn bộ logic sang **Node.js** sử dụng **TypeScript** để đảm bảo type-safety và dễ bảo trì.

## 2. Bản đồ chuyển đổi thư viện (Library Mapping)

| Java Library | Mục đích | Thay thế trong Node.js (TypeScript) | Ghi chú |
| :--- | :--- | :--- | :--- |
| **GirlkunNetwork.jar** | TCP Networking, Session | **net** (Native Node.js) hoặc **socket.io-tcp** | Cần viết class `Session` và `Message` để xử lý buffer/packet byte stream tương thích client. |
| **girlkundb-1.0.0.jar** | MySQL Connection | **mysql2** (Driver) + **TypeORM** / **Prisma** (ORM) | Khuyên dùng `mysql2` dạng pool connection để hiệu năng cao hoặc TypeORM nếu muốn quản lý entity. |
| **java-websocket** | WebSocket Server | **ws** hoặc **socket.io** | Node.js rất mạnh về WebSocket. |
| **json_simple** | JSON Processing | **JSON.parse / JSON.stringify** | Native của JS, không cần thư viện. |
| **Lombok** | Boilerplate code | **TypeScript Class / Interface** | TypeScript support class properties tốt, không cần getter/setter dài dòng. |
| **Threads** | Đa luồng | **Event Loop** / **Worker Threads** | Node.js đơn luồng (Event Driven), cần lưu ý không block main thread. Các tác vụ nặng dùng Worker Threads. |

## 3. Kiến trúc dự án Node.js đề xuất

```text
nro-nodejs/
├── src/
│   ├── config/             # Config Database, Server, Consts
│   ├── database/           # Connection Pool, DAO/Repositories
│   ├── network/            # Socket Server, Session, MessageHandler
│   ├── models/             # Player, Item, Map, Mob (Class definitions)
│   ├── services/           # Game Logic (Service, Manager)
│   ├── utils/              # Logger, Utilities
│   ├── constants/          # ConstCmd, GameConst
│   └── main.ts             # Entry point (ServerManager)
├── package.json
├── tsconfig.json
└── .env                    # Environment variables
```

## 4. Lộ trình chuyển đổi (Phased Migration)

### Giai đoạn 1: Môi trường & Core Engine
1.  **Init Project**: Setup Node.js + TypeScript + ESLint/Prettier.
2.  **Database**: Setup connection với `mysql2`. Tạo các model Interface/Type từ DB schema (`solomon.sql`).
3.  **Networking Core**:
    *   Viết class `Message` (Writer/Reader) để đọc ghi byte tương thích với client Java cũ.
    *   Viết `Session` class quản lý socket connection.
    *   Setup TCP Server lắng nghe port.

### Giai đoạn 2: Utils & Constants
1.  Port `com.girlkun.consts` sang `src/constants`.
2.  Port `com.girlkun.utils` (Logger, TimeUtil, Util) sang `src/utils`.

### Giai đoạn 3: Server Management & Auth
1.  Port `ServerManager` (Khởi động, load config).
2.  Port `Client` (Quản lý list players).
3.  Implement Login Flow (Controller -> Service -> DB).

### Giai đoạn 4: Game Data & Logic
1.  Port `Manager.java` (Load maps, items, skills từ DB/File).
2.  Implement các luồng xử lý chính: Di chuyển, Chat, Tương tác NPC.

## 5. Lưu ý quan trọng
- **Asynchronous**: Node.js là bất đồng bộ (non-blocking). Logic Java đang chạy blocking (hoặc Thread riêng) cần chuyển sang `async/await`.
- **Performance**: Cần chú ý khi xử lý tính toán nặng, tránh chặn Event Loop.
- **Binary Data**: Làm việc kỹ với `Buffer` trong Node.js để xử lý packet byte.

---
**Trạng thái**: Đang chờ phê duyệt kế hoạch.
