# Test Guide - NRO Node.js Server

## 🎮 Hướng dẫn Test với Client

### ✅ Bước 1: Chuẩn bị

#### 1.1. Start MySQL (XAMPP)
- Mở XAMPP Control Panel
- Click "Start" ở dòng MySQL
- Đảm bảo status màu xanh

#### 1.2. Import Database
- Mở phpMyAdmin: http://localhost/phpmyadmin
- Tạo database `solomon`
- Import file `solomon.sql`

#### 1.3. Start Server
```bash
cd nro-nodejs
npm run dev
```

Kết quả mong đợi:
```
✅ MySQL connected successfully
✅ All game data loaded successfully!
📊 Game Data Summary:
   Maps: 10
   NPCs: 31
   Mobs: 80
   TileSetInfo: Loaded
   ItemBgData: Loaded
✅ Server started successfully!
Server is listening on port 14445
```

---

### ✅ Bước 2: Test Login

#### 2.1. Mở Client NRO
- Chạy file `NRO.jar` hoặc `NRO.exe`
- Hoặc client Android/iOS

#### 2.2. Cấu hình Server
Trong client, set server:
- **IP**: `localhost` hoặc `127.0.0.1`
- **Port**: `14445`

#### 2.3. Login
Sử dụng account từ `solomon.sql`:

| Username | Password | Có Player? |
|----------|----------|------------|
| admin | vietng570154 | ✅ Yes |
| admin1 | vietng570154 | ✅ Yes |
| testuser | test123 | ❌ No (cần tạo) |

**Kết quả mong đợi**:
- ✅ Nếu có player: Vào game thành công
- ✅ Nếu chưa có player: Chuyển sang màn hình tạo nhân vật

---

### ✅ Bước 3: Test Tạo Nhân Vật

#### 3.1. Điều kiện
- Login với account chưa có player (ví dụ: `testuser`)
- Hoặc tạo account mới trong database

#### 3.2. Tạo nhân vật
- **Tên**: 3-20 ký tự
- **Giới tính**: 
  - 0 = Trái Đất
  - 1 = Namek
  - 2 = Xayda
- **Đầu**: Chọn kiểu đầu

**Server sẽ**:
1. Validate tên (3-20 ký tự)
2. Kiểm tra tên đã tồn tại chưa
3. Tạo player trong MySQL
4. Load player vào game

**Kết quả mong đợi**:
```
[INFO]: Creating character: TestPlayer, gender: 0, head: 1
[INFO]: ✅ Created character: TestPlayer for account 3
[INFO]: Player TestPlayer logged in successfully
```

---

### ✅ Bước 4: Kiểm tra Database

#### 4.1. Xem Player vừa tạo
```sql
SELECT * FROM player WHERE name = 'TestPlayer';
```

#### 4.2. Xem Account
```sql
SELECT a.*, p.name as player_name 
FROM account a 
LEFT JOIN player p ON p.account_id = a.id 
WHERE a.username = 'testuser';
```

---

## 🔍 Troubleshooting

### Lỗi: "Can't connect to server"

**Nguyên nhân**: Server chưa chạy hoặc port sai

**Giải pháp**:
1. Kiểm tra server đang chạy: `npm run dev`
2. Kiểm tra port trong client: `14445`
3. Kiểm tra firewall

### Lỗi: "Tài khoản hoặc mật khẩu không chính xác"

**Nguyên nhân**: Account không tồn tại trong database

**Giải pháp**:
```sql
-- Tạo account mới
INSERT INTO account (username, password, is_admin) 
VALUES ('newuser', 'password123', 0);
```

### Lỗi: "Tên nhân vật đã tồn tại"

**Nguyên nhân**: Tên đã được sử dụng

**Giải pháp**:
- Chọn tên khác
- Hoặc xóa player cũ:
```sql
DELETE FROM player WHERE name = 'OldName';
```

### Client disconnect ngay sau khi kết nối

**Nguyên nhân**: 
- Client version không khớp
- Server chưa gửi đủ data

**Giải pháp**:
1. Kiểm tra log server xem có lỗi không
2. Đảm bảo game data đã load:
   ```
   TileSetInfo: Loaded
   ItemBgData: Loaded
   ```

---

## 📊 Server Logs

### Log thành công

**Kết nối**:
```
[INFO]: New connection from ::ffff:127.0.0.1:52161
```

**Login thành công**:
```
[INFO]: Player admin logged in successfully
[DEBUG]: Sent tile_set_info to client
[DEBUG]: Sent item_bg_data to client
```

**Tạo nhân vật thành công**:
```
[INFO]: Creating character: TestPlayer, gender: 0, head: 1
[INFO]: ✅ Created character: TestPlayer for account 3
[INFO]: Player TestPlayer logged in successfully
```

### Log lỗi

**MySQL không kết nối**:
```
[ERROR]: MySQL connection failed. Server cannot start.
```

**Game data không load được**:
```
[WARN]: ⚠️  tile_set_info not found, skipping...
[WARN]: ⚠️  item_bg_data not found, skipping...
```

---

## 🎯 Next Steps

Sau khi test thành công:

1. ✅ **Login** - DONE
2. ✅ **Create Character** - DONE
3. 🔄 **Load vào Map** - TODO
4. 🔄 **Di chuyển** - TODO
5. 🔄 **Chat** - TODO
6. 🔄 **Combat** - TODO

---

## 📝 Test Checklist

- [ ] MySQL đã start
- [ ] Database `solomon` đã import
- [ ] Server chạy thành công (port 14445)
- [ ] Game data loaded (Maps, NPCs, Mobs)
- [ ] Client kết nối được
- [ ] Login thành công với account có player
- [ ] Tạo nhân vật thành công với account mới
- [ ] Player hiển thị trong database
- [ ] Không có error trong server log

---

## 🆘 Cần Hỗ Trợ?

Nếu gặp vấn đề:
1. Check server log trong terminal
2. Check MySQL log trong XAMPP
3. Check client log (nếu có)
4. Gửi screenshot lỗi để được hỗ trợ
