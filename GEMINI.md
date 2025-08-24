# Tổng quan dự án

Đây là một dự án game server được viết bằng C#, có vẻ như là một game online đa người chơi (MMORPG) dựa trên cấu trúc file và tên các lớp (class).

## Công nghệ chính

*   **Ngôn ngữ:** C#
*   **Cơ sở dữ liệu:** MySQL (dựa trên file `DbContext.cs` và các file `.sql`)
*   **Kiến trúc:** Client-Server

## Cấu trúc dự án

*   `SERVER/Sources`: Chứa mã nguồn chính của game server.
    *   `Application`: Chứa logic chính của ứng dụng, bao gồm xử lý các hành động của người chơi, quản lý nhân vật, vật phẩm, bản đồ, v.v.
    *   `DatabaseManager`: Quản lý kết nối và truy vấn cơ sở dữ liệu.
    *   `Model`: Định nghĩa các đối tượng dữ liệu trong game (Nhân vật, Vật phẩm, Quái vật, v.v.).
*   `SERVER/database`: Chứa các file script SQL để khởi tạo cơ sở dữ liệu.
*   `index.html`, `README.md`: Có vẻ như là file mặc định hoặc không còn phù hợp với dự án C# hiện tại.

## Xây dựng và Chạy dự án

*   **TODO:** Cần xác định cách build và chạy dự án C# này. Thông thường sẽ sử dụng Visual Studio hoặc .NET Core CLI. Cần tìm file project (`.csproj`) hoặc solution (`.sln`) để có thông tin chi tiết.

## Quy ước phát triển

*   **Ngôn ngữ:** Mã nguồn sử dụng tiếng Anh và tiếng Việt (trong các chuỗi string và comment).
*   **Testing:** Không tìm thấy các file test trong dự án.
