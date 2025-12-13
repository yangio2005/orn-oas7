# Hướng Dẫn Chi Tiết Về Vật Phẩm Thần Linh

Vật phẩm Thần linh là những trang bị cực kỳ mạnh mẽ trong game NRO Tabi, mang lại chỉ số vượt trội và là nguyên liệu quan trọng cho nhiều tính năng cao cấp. Dưới đây là hướng dẫn chi tiết về cách sở hữu, cơ chế hoạt động trong game và tận dụng tối đa các vật phẩm này.

## I. Cách Sở Hữu Vật Phẩm Thần Linh

Có **hai** phương pháp chính để người chơi có thể nhận được vật phẩm Thần linh:

### 1. Nhận từ "Hộp Đồ Thần Linh" (ID: 1334)

Đây là cách trực tiếp và có tỷ lệ rõ ràng để nhận được trang bị Thần linh.

*   **Cách nhận Hộp Đồ Thần Linh:**
    "Hộp Đồ Thần Linh" (ID 1334) được nhận như một phần thưởng từ NPC **Skien_trungthu** (NPC Sự kiện Trung thu) thông qua việc đổi "Điểm sự kiện". Số lượng hộp nhận được tùy thuộc vào mốc điểm đổi:
    *   **500 Điểm sự kiện:** Nhận 50 Rương thần linh.
    *   **300 Điểm sự kiện:** Nhận 40 Rương thần linh.
    *   **200 Điểm sự kiện:** Nhận 30 Rương thần linh.
    *   **50 Điểm sự kiện:** Nhận 5 Rương thần linh.

*   **Cơ chế mở Hộp Đồ Thần Linh (trong code):**
    *   **File liên quan:** `com\girlkun\services\func\UseItem.java`
    *   **Phương thức chính:** `hopthanlinh(Player player, Item item)`
    *   Khi người chơi sử dụng "Hộp Đồ Thần Linh", phương thức `hopthanlinh` sẽ được gọi.
    *   Hệ thống sẽ chọn ngẫu nhiên một ID vật phẩm Thần linh từ mảng `Manager.itemIds_TL` (chứa danh sách các ID vật phẩm Thần linh).
    *   Phương thức `Util.randomthanlinh(short tempId)` sẽ được sử dụng để tạo ra một đối tượng `Item` mới với ID đã chọn.
    *   Trong `Util.randomthanlinh`, các chỉ số ngẫu nhiên (ví dụ: Giáp cho Áo, HP cho Quần, Tấn công cho Găng, KI cho Giày, Tỷ lệ chí mạng cho Rada) sẽ được thêm vào vật phẩm dựa trên loại của nó, với các giá trị nằm trong các khoảng đã định sẵn (ví dụ: Giáp 1000-1500, Tấn công 3500-4500).
    *   Ngoài ra, hai chỉ số cố định cũng được thêm vào:
        *   Yêu cầu sức mạnh: 15.000.000.000 (ID 21, giá trị 15)
        *   Không thể giao dịch (ID 30, giá trị 1)
    *   Vật phẩm Thần linh đã tạo sẽ được thêm vào hành trang của người chơi.
    *   "Hộp Đồ Thần Linh" sẽ bị tiêu thụ (trừ đi 1 số lượng).
    *   Một thông báo và hiệu ứng mở hộp sẽ được gửi đến người chơi.

### 2. Rơi Từ Boss và Quái

Người chơi có cơ hội nhận được vật phẩm Thần linh khi tiêu diệt một số loại Boss và quái vật mạnh.

*   **Cơ chế rơi đồ từ Boss (trong code):**
    *   **File liên quan:** `com\girlkun\models\boss\BossManager.java`, các file Boss cụ thể (ví dụ: `com\girlkun\models\boss\list_boss\BLACK\Black.java`), `com\girlkun\utils\Util.java`.
    *   Trong `BossManager.java`, có một hằng số `public static final byte ratioReward = 2;`. Đây là tỷ lệ cơ bản (2%) cho các vật phẩm đặc biệt rơi ra từ Boss.
    *   Khi một Boss bị tiêu diệt, phương thức `reward(Player plKill)` của Boss đó sẽ được gọi.
    *   Trong phương thức `reward`, có một điều kiện kiểm tra tỷ lệ rơi đặc biệt: `if (Util.isTrue(BossManager.ratioReward, 100))`. Điều này có nghĩa là có **2% cơ hội** để khối lệnh bên trong `if` này được thực thi.
    *   Nếu điều kiện 2% này đúng, hệ thống sẽ tiếp tục kiểm tra các điều kiện khác cho các vật phẩm cụ thể.
    *   Nếu các điều kiện cho các vật phẩm cụ thể đó không được đáp ứng, một vật phẩm Thần linh ngẫu nhiên sẽ được chọn từ mảng `Manager.itemIds_TL`.
    *   Phương thức `Util.ratiItem(...)` sẽ được sử dụng để tạo ra một `ItemMap` (vật phẩm rơi trên bản đồ) với ID vật phẩm Thần linh đã chọn. Phương thức này cũng sẽ thêm các chỉ số ngẫu nhiên và cố định (yêu cầu sức mạnh, không thể giao dịch) tương tự như khi mở hộp, cùng với chỉ số "đồ rơi từ boss" (ID 209, giá trị 1) và chỉ số "sức mạnh tiềm năng" (ID 107) với các giá trị ngẫu nhiên dựa trên tỷ lệ.
    *   Nếu điều kiện 2% ban đầu không đúng, một vật phẩm khác (ví dụ: Ngọc Rồng) sẽ được rơi ra thay thế.
    *   **Lưu ý:** Tài liệu game có thể ghi "`Tỷ lệ rơi đồ Thần Linh = Tỷ lệ rơi đồ đặc biệt của Boss * 50%`". Tuy nhiên, trong code, `BossManager.ratioReward` (giá trị 2) được sử dụng trực tiếp làm tỷ lệ phần trăm (2%) cho khối lệnh rơi đồ đặc biệt. Điều này cho thấy tỷ lệ thực tế để một vật phẩm Thần linh rơi ra từ Boss (nếu không rơi các vật phẩm đặc biệt khác) là **tối đa 2%**, chứ không phải là 50% của một tỷ lệ khác như tài liệu mô tả.

*   **Một số Boss/Quái có thể rơi đồ Thần linh:** Black Goku, Super Black Goku, Zamas, Cooler, Cell, Mabu, và nhiều Boss, quái khác.

## II. Chỉ Số và Tác Dụng Của Vật Phẩm Thần Linh

Vật phẩm Thần linh không chỉ khó kiếm mà còn sở hữu những chỉ số vượt trội và các công dụng đặc biệt.

### 1. Chỉ Số Cơ Bản (Options)

Khi nhận được, các vật phẩm Thần linh sẽ có chỉ số cơ bản ngẫu nhiên trong một khoảng nhất định:

| Loại Vật Phẩm | Chỉ Số Chính | Giá Trị Ngẫu Nhiên |
| :------------ | :---------- | :---------------- |
| **Áo Thần Linh** | Giáp (ID: 47) | 1000 - 1500 |
| **Quần Thần Linh**| HP (ID: 22) | 45.000 - 55.000 |
| **Găng Thần Linh**| Tấn công (ID: 0) | 3.500 - 4.500 |
| **Giày Thần Linh**| KI (ID: 23) | 35.000 - 45.000 |
| **Rada Thần Linh**| Tỷ lệ chí mạng (ID: 14)| 15% - 17% |

### 2. Chỉ Số Chung và Yêu Cầu

Tất cả các món đồ Thần linh đều có 2 dòng chỉ số cố định:

*   **Yêu cầu sức mạnh:** 15.000.000.000 (15 tỷ)
*   **Không thể giao dịch**

### 3. Công Dụng và Nâng Cấp

Vật phẩm Thần linh không chỉ là trang bị để mặc mà còn là nguyên liệu quan trọng cho các tính năng nâng cấp và chế tạo cao cấp:

*   **a. Điều Kiện Mua Đồ Hủy Diệt:**
    *   **NPC:** Thần Vũ Trụ (Whis)
    *   **Yêu cầu:** Trang bị đủ **5 món đồ Thần linh** trên người.
    *   **Kết quả:** Whis sẽ mở cửa hàng bán các vật phẩm Hủy Diệt.

*   **b. Chuyển Hóa Thành Đồ Kích Hoạt (SKH):**
    *   **NPC:** Bà Hạt Mít
    *   **Công thức:** 3 món đồ Thần linh bất kỳ.
    *   **Kết quả:** Chuyển hóa 3 món Thần linh không cần thiết để nhận lại một vật phẩm Kích Hoạt (SKH) ngẫu nhiên.

*   **c. Phân Rã Đồ Thần Linh:**
    *   **NPC:** Bà Hạt Mít
    *   **Công thức:** 1 món đồ Thần linh.
    *   **Kết quả:** Phân rã một món đồ Thần linh để nhận lại các loại nguyên liệu/mảnh vỡ (chi tiết các mảnh nhận được cần xem thêm trong game).

*   **d. Nâng Cấp Sao Trang Bị:**
    *   **NPC:** Bà Hạt Mít
    *   **Công thức:** 1 trang bị Thần linh + 1 viên Ngọc rồng 1 sao.
    *   **Kết quả:** Tính năng này có thể dùng để ép thêm sao hoặc tăng cấp sao cho trang bị Thần linh.