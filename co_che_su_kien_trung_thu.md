# Cơ Chế Sự Kiện Trung Thu

Sự kiện Trung thu là một trong những sự kiện lớn trong game, nơi người chơi có thể tham gia chế tạo bánh, tích lũy điểm sự kiện và đổi lấy nhiều phần thưởng giá trị, bao gồm cả "Hộp Đồ Thần Linh".

## 1. NPC Sự Kiện

*   **Tên NPC:** Skien_trungthu
*   **Chức năng chính:** Hướng dẫn sự kiện, chế tạo bánh Trung thu, và đổi điểm sự kiện lấy phần thưởng.

## 2. Cách Thức Tham Gia và Tích Lũy Điểm

Người chơi sẽ thu thập các nguyên liệu để chế tạo bánh Trung thu, sau đó ăn bánh để nhận "Điểm sự kiện".

### a. Thu thập Nguyên liệu

Các nguyên liệu cần thiết để chế tạo bánh có thể tìm thấy bằng cách tiêu diệt quái vật hoặc Boss:

*   **Hạt sen (ID: 1340):** Rơi từ các quái vật bay trên không.
*   **Đậu xanh (ID: 1339):** Rơi từ các quái vật dưới đất.
*   **Bột nếp (ID: 1338):** Rơi từ quái Sên ở khu vực Tương lai.
*   **Mồi lửa (ID: 1341):** Rơi từ Boss Thỏ trắng (xuất hiện mỗi 5 phút).

### b. Chế tạo Bánh Trung thu

Người chơi có thể chế tạo 3 loại bánh khác nhau tại NPC Skien_trungthu:

*   **Bánh Hạt sen (ID: 1336):**
    *   **Nguyên liệu:** 99 Hạt sen + 50 Bột nếp + 2 Mồi lửa
    *   **Chi phí:** 2 Tỷ Vàng
    *   **Điểm sự kiện nhận được khi ăn:** 2 Điểm

*   **Bánh Đậu xanh (ID: 1335):**
    *   **Nguyên liệu:** 99 Đậu xanh + 50 Bột nếp + 2 Mồi lửa
    *   **Chi phí:** 2 Tỷ Vàng
    *   **Điểm sự kiện nhận được khi ăn:** 2 Điểm

*   **Bánh Thập cẩm (ID: 1337):**
    *   **Nguyên liệu:** 99 Hạt sen + 99 Đậu xanh + 99 Bột nếp + 5 Mồi lửa
    *   **Chi phí:** 2 Tỷ Vàng
    *   **Điểm sự kiện nhận được khi ăn:** 5 Điểm

### c. Quy đổi VNĐ lấy Điểm sự kiện

Ngoài việc chế tạo bánh, người chơi có thể nhận thêm điểm sự kiện bằng cách quy đổi VNĐ thành Hồng ngọc thông qua NPC **Quy lão Kamê (Master Roshi)**.

*   **Cách thực hiện:**
    1.  Nói chuyện với NPC **Quy lão Kamê (Master Roshi)**.
    2.  Chọn tùy chọn **"Đổi Hồng ngọc"** trong menu của ông ấy.
    3.  Nhập số tiền VNĐ bạn muốn quy đổi.
*   **Cơ chế:** Nếu sự kiện Trung thu đang diễn ra, bạn sẽ nhận được **1 Điểm sự kiện cho mỗi 1.000 VNĐ** quy đổi thành Hồng ngọc.

## 3. Đổi Điểm Sự Kiện Lấy Phần Thưởng

Điểm sự kiện tích lũy được có thể dùng để đổi lấy các phần thưởng hấp dẫn tại NPC Skien_trungthu, bao gồm "Hộp Đồ Thần Linh":

*   **Mốc 500 Điểm:**
    *   200 Mảnh thiên sứ ngẫu nhiên
    *   **50 Rương thần linh (ID: 1334)**
    *   30 Hộp quà Trung thu
    *   30 Thẻ gia hạn
    *   1 Phiếu giảm giá
    *   250.000 Hồng ngọc

*   **Mốc 300 Điểm:**
    *   100 Mảnh thiên sứ ngẫu nhiên
    *   **40 Rương thần linh (ID: 1334)**
    *   15 Hộp Trung thu
    *   10 Thẻ gia hạn
    *   150.000 Hồng ngọc

*   **Mốc 200 Điểm:**
    *   50 Mảnh thiên sứ ngẫu nhiên
    *   **30 Rương thần linh (ID: 1334)**
    *   10 Hộp Trung thu
    *   5 Thẻ gia hạn
    *   100.000 Hồng ngọc

*   **Mốc 50 Điểm:**
    *   10 Mảnh thiên sứ ngẫu nhiên
    *   **5 Rương thần linh (ID: 1334)**
    *   25.000 Hồng ngọc

## 4. Các Sự Kiện Khác Cung Cấp "Hộp Đồ Thần Linh"?

Dựa trên phân tích code hiện tại, NPC **Skien_trungthu** trong sự kiện Trung thu là nguồn duy nhất được xác định để nhận trực tiếp "Hộp Đồ Thần Linh" (ID 1334). Các sự kiện khác trong game có thể cung cấp các loại phần thưởng khác nhau, nhưng không có sự kiện nào khác được tìm thấy trực tiếp tạo ra hoặc trao "Hộp Đồ Thần Linh" này.