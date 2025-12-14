# Kế hoạch chuyển đổi Core Java sang C# (NRO Tabi)

## 1. Phân tích hiện trạng
Mã nguồn hiện tại được chia thành 2 phần:
- **Game Logic (Src)**: Nằm trong thư mục `src/com/girlkun`.
- **Core Engine (Libs)**: Được đóng gói trong các file `.jar` tại thư mục `lib`:
    - `GirlkunNetwork.jar`: Xử lý kết nối mạng (TCP/IP).
    - `girlkundb-1.0.0.jar`: Xử lý kết nối cơ sở dữ liệu (MySQL).


Do đó, khi chuyển sang C#, chúng ta không chỉ dịch code trong `src` mà còn phải **viết lại hoàn toàn** phần Core Engine mà Java đang dùng thư viện và tìm các thư viện C# tương đương.

## 2. Bản đồ chuyển đổi thư viện (Library Mapping)

Dựa trên các file `.jar` trong thư mục `lib`, dưới đây là các thư viện C# thay thế đề xuất:

| Java Library | Mục đích sử dụng | Thay thế trong C# (.NET Core/6+) | Ghi chú |
| :--- | :--- | :--- | :--- |
| **GirlkunNetwork.jar** | Xử lý networking (TCP/IP), Session, Message | **DotNetty** hoặc **NetCoreServer** | Cần viết lại logic đóng gói/giải mã packet (Message.java). |
| **girlkundb-1.0.0.jar** | Wrapper kết nối MySQL | **MySql.Data** hoặc **Dapper** | Dùng ADO.NET hoặc ORM nhẹ như Dapper để truy vấn DB. |
| **java-websocket-1.5.3.jar** | Server WebSocket (cho Boss Notification) | **WebSocketSharp** hoặc **Fleck** | Cần thiết cho `BossNotificationWebSocketServer`. |
| **json_simple-1.1.jar** | Xử lý JSON (lưu trữ data nhân vật, config) | **Newtonsoft.Json** (Json.NET) | C# có `System.Text.Json` nhưng `Newtonsoft` linh hoạt hơn với cấu trúc cũ. |
| **okhttp-3.0.0.jar** | HTTP Client (gọi API ngoài nếu có) | **System.Net.Http.HttpClient** | Native của .NET, rất mạnh mẽ. |
| **apache-commons-lang.jar** | Tiện ích xử lý chuỗi, toán học | **System** (Native) | C# có sẵn hầu hết các hàm này, không cần lib ngoài. |
| **lombok.jar** | Giảm boilerplate code (Getter/Setter) | **Auto-Properties** | C# hỗ trợ sẵn `public int Id { get; set; }`, không cần lib. |

## 3. Các file Core trong `src` cần chuyển đổi

Dưới đây là danh sách các file cốt lõi trong `src` đóng vai trò khung xương cho Server, cần được ưu tiên chuyển đổi trước:

### A. Quản lý Server & Khởi động
*   `src/com/girlkun/server/ServerManager.java`
    *   **Vai trò**: Entry point (Main), quản lý vòng đời server, khởi tạo các luồng background, load config.
    *   **Lưu ý**: Cần thay thế `ServerSocket` của Java bằng `TcpListener` hoặc thư viện mạng của C# (như DotNetty/NetCoreServer).

*   `src/com/girlkun/server/Manager.java`
    *   **Vai trò**: Load dữ liệu tĩnh (Map, Item, Skill, Data game) từ file hoặc DB vào RAM khi server bật.

*   `src/com/girlkun/server/Maintenance.java`
    *   **Vai trò**: Quản lý bảo trì server.

### B. Quản lý Client & Session
*   `src/com/girlkun/server/Client.java`
    *   **Vai trò**: Quản lý danh sách người chơi online (`players`), xử lý kick, disconnect.

*   `src/com/girlkun/server/io/MySession.java`
    *   **Vai trò**: Đại diện cho phiên kết nối của một người chơi.
    *   **Migration**: Class này hiện tại kế thừa từ `ISession` (của lib `GirlkunNetwork`). Bên C# cần tạo class `Session` tương ứng quản lý Socket.

*   `src/com/girlkun/server/Controller.java`
    *   **Vai trò**: "Bộ não" xử lý tin nhắn (Message Handler). Nhận packet từ client và điều hướng đến các Service xử lý.

### C. Utils & Hằng số (Cần làm đầu tiên)
*   `src/com/girlkun/utils/*`
    *   `Logger.java`: Ghi log. (Thay bằng `NLog` hoặc `Serilog`).
    *   `Util.java`: Các hàm tiện ích chung.
    *   `TimeUtil.java`: Xử lý thời gian.
*   `src/com/girlkun/consts/*`
    *   Chứa các hằng số game (Cmd, ConstMap, etc.).

## 4. Lộ trình chuyển đổi đề xuất

### Giai đoạn 1: Xây dựng nền móng (Core Engine C#)
Chúng ta cần dựng lại khung sườn project C# (.NET 6 hoặc 8) và cài đặt các thư viện NuGet tương ứng:
1.  **Project Setup**: Tạo Console App (.NET 8).
2.  **Dependencies**: Cài đặt `MySql.Data`, `Newtonsoft.Json`, `WebSocketSharp` (hoặc Fleck).
3.  **Database Wrapper**: Tạo class quản lý kết nối MySQL (thay `GirlkunDB`).
4.  **Network Engine**: Viết lớp `Session`, `Message` để xử lý đọc/ghi byte stream tương thích với Client cũ.

### Giai đoạn 2: Chuyển đổi Utils & Data Structures
1.  Chuyển đổi package `com.girlkun.consts`.
2.  Chuyển đổi package `com.girlkun.utils`.
3.  Chuyển đổi `src/com/girlkun/msg.java` (Quản lý đọc/ghi byte message).

### Giai đoạn 3: Chuyển đổi Server Management
1.  `ServerManager.java` -> `ServerManager.cs`
2.  `Client.java` -> `Client.cs`
3.  `MySession.java` -> `Session.cs`

### Giai đoạn 4: Chuyển đổi Data Loading & Logic
1.  `Manager.java` (Load dữ liệu).
2.  `Controller.java` và các `Service` (Game logic).
