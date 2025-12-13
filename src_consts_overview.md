## Overview of `com.girlkun.consts` package

**Purpose:**
The `com.girlkun.consts` package serves as a central repository for various static constants used throughout the game server. These constants define fundamental game elements, rules, and identifiers, ensuring consistency and ease of management across the codebase.

**Key Classes and Their Roles:**
*   **`ConstAccount.java`**: Defines constants related to player account statuses (e.g., `IS_INGAME`, `CAN_LOGIN`, `IS_BAN`). These are used to manage account states and permissions.
*   **`ConstIgnoreName.java`**: Contains an array (`IGNORE_NAME`) for blacklisting or ignoring specific names, likely for filtering inappropriate content or managing system-reserved names.
*   **`ConstMap.java`**: Defines constants for different map types (e.g., `MAP_NORMAL`, `MAP_OFFLINE`, `MAP_DOANH_TRAI`) and map change mechanisms (`CHANGE_CAPSULE`). This centralizes map-related identifiers.
*   **`ConstMob.java`**: A comprehensive list of constants, each representing a unique ID for a specific monster or creature (`MOB`) in the game. These are used to identify and manage in-game enemies.
*   **`ConstNpc.java`**: Defines constants for Non-Player Characters (NPCs), including their unique IDs, pre-defined dialogue strings, and various menu option IDs associated with NPC interactions. This is crucial for managing game quests, shops, and interactive elements.
*   **`ConstPlayer.java`**: Contains constants related to player attributes, such as player races/genders (`TRAI_DAT`, `NAMEC`, `XAYDA`), player-kill (PK) types (`NON_PK`, `PK_PVP`), and different fusion transformation types (`HOP_THE_PORATA`).
*   **`ConstRatio.java`**: Defines constants for common ratios or percentages (e.g., `PER100`, `PER1000`), likely used in game mechanics for calculations involving probabilities, rates, or scaling.
*   **`ConstTask.java`**: A very extensive class defining constants for the game's task/quest system. This includes difficulty levels (`EASY`, `NORMAL`), gold rewards, map and NPC IDs relevant to tasks, and a vast number of `TASK_X_Y` constants representing individual tasks or stages. The presence of a `main` method for generating these `TASK_X_Y` constants suggests a programmatic approach to task management.
*   **`Test.java`**: (A temporary file for testing purposes, not part of the core constant definitions).

**Overall Significance:** The `consts` package is fundamental to the game server's operation. By centralizing these constants, the developers ensure data consistency, reduce magic numbers in the code, and make it easier to modify game parameters without extensive code changes. It acts as a dictionary of game-specific identifiers and values.

### Information about adding mapping tables / How constants are used for mapping:

The `consts` package itself doesn't contain "mapping tables" in the database sense. Instead, it provides the *keys* (the constant integer or byte IDs) that are used to *map* to actual game data, which is typically loaded from external files (like those in the `data` directory) or from the database (via JDBC DAOs).

For example:
*   `ConstMob.java` defines `MOC_NHAN = 0`, `KHUNG_LONG = 1`, etc. These integer IDs (0, 1, ...) are then used to retrieve the full `MobTemplate` (which contains name, HP, etc.) from `Manager.MOB_TEMPLATES` (as seen in `DataGame.java`). So, the mapping happens in memory when the game loads `MobTemplate` objects and associates them with these constant IDs.
*   Similarly, `ConstNpc.java` defines `ONG_GOHAN = 0`, `BUNMA = 7`, etc. These IDs are used to look up `NpcTemplate` objects.
*   `ConstTask.java` defines `TASK_X_Y` IDs. These IDs are used to retrieve `TaskMain` or `SideTaskTemplate` objects from `TaskService.gI().getTaskMainById()` or `TaskService.gI().getSideTaskTemplateById()`.

### Sơ đồ luồng (Flow Diagram):

```mermaid
graph TD
    subgraph "Khởi tạo Server"
        A[Đọc các hằng số từ package consts] --> B{Tải dữ liệu game từ file/DB};
        B --> C{Ánh xạ dữ liệu với các hằng số ID};
        C --> D[Lưu trữ dữ liệu đã ánh xạ vào các Manager/Collection];
    end

    subgraph "Trong quá trình chạy Game"
        E[Logic Game] --> F{Sử dụng các hằng số ID};
        F --> G{Truy xuất dữ liệu tương ứng từ Manager/Collection};
        G --> H[Thực hiện hành động (ví dụ: hiển thị NPC, tạo quái vật, tính toán sát thương)];
    end

    style A fill:#f9f,stroke:#333,stroke-width:2px
    style B fill:#f9f,stroke:#333,stroke-width:2px
    style C fill:#f9f,stroke:#333,stroke-width:2px
    style D fill:#f9f,stroke:#333,stroke-width:2px
    style E fill:#f9f,stroke:#333,stroke-width:2px
    style F fill:#f9f,stroke:#333,stroke-width:2px
    style G fill:#f9f,stroke:#333,stroke-width:2px
    style H fill:#f9f,stroke:#333,stroke-width:2px
```
