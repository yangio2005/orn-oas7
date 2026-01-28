# NRO Node.js - MySQL Only Setup

## 📋 Tổng quan

Server NRO Node.js sử dụng **MySQL only** để lưu trữ toàn bộ dữ liệu game.

### Kiến trúc Database

```
NRO Server
└── MySQL (solomon database)
    ├── account (tài khoản, mật khẩu, VIP)
    ├── player (nhân vật, stats, inventory)
    ├── item (vật phẩm)
    ├── map (bản đồ)
    └── ... (các bảng khác từ solomon.sql)
```

## 🚀 Cài đặt MySQL

### Option 1: XAMPP (Dễ nhất)

1. **Download XAMPP**: https://www.apachefriends.org/
2. **Install** và chọn MySQL
3. **Start** MySQL từ XAMPP Control Panel
4. **Credentials mặc định**:
   - Host: `localhost`
   - User: `root`
   - Password: (để trống)
   - Port: `3306`

### Option 2: MySQL Installer

1. **Download**: https://dev.mysql.com/downloads/installer/
2. **Install** MySQL Server
3. **Nhớ password** bạn đặt cho root user
4. **Update** `.env` file với password của bạn

### Option 3: Docker

```bash
docker run --name nro-mysql \
  -e MYSQL_ROOT_PASSWORD=yourpassword \
  -e MYSQL_DATABASE=solomon \
  -p 3306:3306 \
  -d mysql:8.0
```

## 📦 Import Database

### Bước 1: Cấu hình `.env`

```env
# MySQL Database Configuration
DB_HOST=localhost
DB_USER=root
DB_PASSWORD=        # Điền password nếu có
DB_NAME=solomon

SERVER_PORT=14445
```

### Bước 2: Import solomon.sql

**Tự động** (Khuyến nghị):
```bash
npx ts-node src/scripts/importSolomonSQL.ts
```

**Thủ công** (qua phpMyAdmin):
1. Mở http://localhost/phpmyadmin
2. Tạo database `solomon`
3. Import file `solomon.sql`

**Thủ công** (qua MySQL CLI):
```bash
mysql -u root -p solomon < solomon.sql
```

## ✅ Kiểm tra

### 1. Kiểm tra Database

```bash
npx ts-node src/scripts/testConnection.ts
```

### 2. Kiểm tra Tables

```sql
USE solomon;
SHOW TABLES;

-- Kiểm tra số lượng records
SELECT COUNT(*) FROM account;
SELECT COUNT(*) FROM player;
```

### 3. Test Login

```bash
# Server sẽ tự động kết nối MySQL khi start
npm run dev
```

**Test account** (từ solomon.sql):
- Username: `admin`
- Password: `vietng570154`

## 📊 Database Schema

### Table: `account`

```sql
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(100) NOT NULL,
  `create_time` timestamp DEFAULT current_timestamp(),
  `ban` smallint(6) DEFAULT 0,
  `is_admin` tinyint(1) DEFAULT 0,
  `vnd` int(11) DEFAULT 0,
  PRIMARY KEY (`id`)
);
```

### Table: `player`

```sql
CREATE TABLE `player` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `gender` tinyint(1) NOT NULL,
  `head` int(11) NOT NULL,
  `body` int(11) DEFAULT -1,
  `leg` int(11) DEFAULT -1,
  `role` int(11) DEFAULT 0,
  `data_inventory` longtext,
  `data_location` text,
  `data_point` text,
  `data_magic` longtext,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`account_id`) REFERENCES `account`(`id`)
);
```

## 🔧 Troubleshooting

### Lỗi: "Can't connect to MySQL server"

**Nguyên nhân**: MySQL chưa chạy

**Giải pháp**:
- XAMPP: Start MySQL từ Control Panel
- Windows Service: `net start MySQL80`
- Docker: `docker start nro-mysql`

### Lỗi: "Access denied for user 'root'@'localhost'"

**Nguyên nhân**: Password sai

**Giải pháp**:
1. Kiểm tra password trong `.env`
2. Reset password MySQL nếu quên

### Lỗi: "Table 'solomon.player' doesn't exist"

**Nguyên nhân**: Chưa import solomon.sql

**Giải pháp**:
```bash
npx ts-node src/scripts/importSolomonSQL.ts
```

### Lỗi: "Too many connections"

**Nguyên nhân**: Connection pool đầy

**Giải pháp**:
1. Restart MySQL
2. Tăng `max_connections` trong MySQL config

## 📝 Notes

### JSON Columns

Player data phức tạp được lưu dưới dạng JSON trong MySQL:

```javascript
// data_inventory
{
  "items": [
    { "id": 1, "quantity": 10 },
    { "id": 2, "quantity": 5 }
  ]
}

// data_location
{
  "x": 100,
  "y": 200,
  "mapId": 0
}

// data_point
{
  "hp": 1000,
  "mp": 500,
  "power": 5000
}
```

### Backup & Restore

**Backup**:
```bash
mysqldump -u root -p solomon > backup_$(date +%Y%m%d).sql
```

**Restore**:
```bash
mysql -u root -p solomon < backup_20240128.sql
```

## 🎯 Next Steps

1. ✅ Import solomon.sql
2. ✅ Test connection
3. ✅ Test login
4. 🔄 Implement game logic
5. 🔄 Load game data from files

## 📚 References

- MySQL Documentation: https://dev.mysql.com/doc/
- XAMPP: https://www.apachefriends.org/
- phpMyAdmin: https://www.phpmyadmin.net/
