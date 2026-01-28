# NRO Node.js Server - MySQL Only

## 📋 Tổng quan

Server NRO (Ngọc Rồng Online) được viết lại bằng Node.js + TypeScript, sử dụng **MySQL only** để lưu trữ toàn bộ dữ liệu.

### Thay đổi từ phiên bản trước

- ❌ **Bỏ MongoDB** - Không cần thiết
- ✅ **Dùng MySQL only** - Đơn giản hơn, dễ quản lý
- ✅ **Sử dụng schema từ `solomon.sql`** - Database sẵn có

## 🚀 Quick Start

### 1. Cài đặt Dependencies

```bash
npm install
```

### 2. Cấu hình `.env`

```env
# MySQL Database Configuration
DB_HOST=localhost
DB_USER=root
DB_PASSWORD=        # Điền password nếu có
DB_NAME=solomon

SERVER_PORT=14445
```

### 3. Cài đặt MySQL

**Option A: XAMPP** (Dễ nhất)
- Download: https://www.apachefriends.org/
- Install và start MySQL

**Option B: MySQL Installer**
- Download: https://dev.mysql.com/downloads/installer/

**Option C: Docker**
```bash
docker run --name nro-mysql -e MYSQL_ROOT_PASSWORD=yourpassword -e MYSQL_DATABASE=solomon -p 3306:3306 -d mysql:8.0
```

### 4. Import Database

```bash
# Tự động import solomon.sql
npx ts-node src/scripts/importSolomonSQL.ts
```

### 5. Test Connection

```bash
# Kiểm tra kết nối MySQL
npx ts-node src/scripts/testConnection.ts
```

### 6. Start Server

```bash
# Development mode
npm run dev

# Production mode
npm run build
npm start
```

## 📁 Project Structure

```
nro-nodejs/
├── src/
│   ├── config/
│   │   └── database.ts          # MySQL connection
│   ├── models/
│   │   ├── Player.ts            # Player model
│   │   └── Account.ts           # Account model
│   ├── services/
│   │   ├── PlayerDAO.ts         # Player data access (MySQL only)
│   │   └── AccountDAO.ts        # Account data access
│   ├── network/
│   │   ├── Server.ts            # TCP server
│   │   └── Session.ts           # Client session
│   ├── scripts/
│   │   ├── importSolomonSQL.ts  # Import solomon.sql
│   │   └── testConnection.ts    # Test MySQL connection
│   └── main.ts                  # Entry point
├── solomon.sql                  # Database schema
├── .env                         # Environment variables
└── package.json
```

## 🗄️ Database Schema

### MySQL Tables

```
solomon database
├── account          # Tài khoản (username, password, VIP)
├── player           # Nhân vật (name, gender, stats)
├── item             # Vật phẩm
├── map              # Bản đồ
└── ... (các bảng khác)
```

### Player Data Structure

```sql
CREATE TABLE `player` (
  `id` int(11) PRIMARY KEY AUTO_INCREMENT,
  `account_id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `gender` tinyint(1) NOT NULL,
  `head` int(11) NOT NULL,
  `body` int(11) DEFAULT -1,
  `leg` int(11) DEFAULT -1,
  `role` int(11) DEFAULT 0,
  `data_inventory` longtext,      # JSON: Inventory data
  `data_location` text,            # JSON: Location (x, y, mapId)
  `data_point` text,               # JSON: Stats (hp, mp, power)
  `data_magic` longtext,           # JSON: Skills
  FOREIGN KEY (`account_id`) REFERENCES `account`(`id`)
);
```

## 🔧 Development

### Available Scripts

```bash
# Development
npm run dev              # Start dev server with hot reload

# Build
npm run build            # Compile TypeScript to JavaScript

# Production
npm start                # Run compiled JavaScript

# Database
npx ts-node src/scripts/importSolomonSQL.ts   # Import solomon.sql
npx ts-node src/scripts/testConnection.ts     # Test MySQL connection
```

### Test Accounts

Từ `solomon.sql`:

| Username | Password | Admin |
|----------|----------|-------|
| admin | vietng570154 | Yes |
| admin1 | vietng570154 | Yes |
| testuser | test123 | No |

## 📚 Documentation

- [MySQL Setup Guide](./MYSQL_SETUP.md) - Chi tiết cài đặt MySQL
- [Database Schema](./solomon.sql) - SQL schema đầy đủ

## 🐛 Troubleshooting

### Lỗi: "Can't connect to MySQL server"

**Giải pháp**:
1. Kiểm tra MySQL đã chạy chưa
2. XAMPP: Start MySQL từ Control Panel
3. Kiểm tra port 3306 có bị chiếm không

### Lỗi: "Access denied for user 'root'"

**Giải pháp**:
1. Kiểm tra password trong `.env`
2. Thử để trống password (XAMPP mặc định)

### Lỗi: "Table 'solomon.player' doesn't exist"

**Giải pháp**:
```bash
npx ts-node src/scripts/importSolomonSQL.ts
```

## 📝 Notes

### Tại sao bỏ MongoDB?

1. **Đơn giản hơn** - Chỉ cần quản lý 1 database
2. **Dễ backup** - 1 file SQL dump
3. **Schema sẵn có** - `solomon.sql` đã có đầy đủ
4. **MySQL đủ mạnh** - JSON columns hỗ trợ data linh hoạt

### JSON Columns

MySQL hỗ trợ lưu JSON data:

```javascript
// data_inventory
{
  "items": [
    { "id": 1, "quantity": 10 },
    { "id": 2, "quantity": 5 }
  ]
}

// data_location
{ "x": 100, "y": 200, "mapId": 0 }

// data_point
{ "hp": 1000, "mp": 500, "power": 5000 }
```

## 🎯 Roadmap

- [x] MySQL connection
- [x] Import solomon.sql
- [x] PlayerDAO (MySQL only)
- [x] AccountDAO
- [ ] TCP Server
- [ ] Login flow
- [ ] Game logic
- [ ] Load game data from files

## 📄 License

MIT

## 👥 Contributors

- Original Java version: GirlKun
- Node.js port: Your Team
