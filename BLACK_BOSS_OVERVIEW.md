# Black Bosses Overview

This document provides an overview of the Black boss classes found in the `com.girlkun.models.boss.list_boss.BLACK` package.

---

## Black.java

The `Black` class represents the Black Goku boss. It extends the `Boss` class and defines its reward behavior upon defeat, a time-based disappearance mechanism, and a custom `injured` method that includes a dodge chance and shield mechanics. It also has commented-out code for level-specific behavior, suggesting it might have been intended for a multi-stage boss fight.

### Mapping:

*   **Class:** `Black`
    *   **Inherits from:** `Boss`
    *   **Fields:**
        *   `st`: `long` - Stores the system time when the boss joins the map, used for its time-based disappearance.
    *   **Constructor:** `Black()`: Initializes the boss with `BossID.BLACK`, `BossesData.BLACK_GOKU`, and `BossesData.SP_BL`. This suggests it might have multiple forms or data sets.
    *   **Methods:**
        *   `reward(Player plKill)`:
            *   **Purpose:** Handles rewards when Black is killed.
            *   **Logic:** Awards achievement points, increments player event count, sends a notification.
            *   Drops items based on `BossManager.ratioReward`:
                *   If `BossManager.ratioReward` is true (100% chance):
                    *   If `Util.isTrue(10, 20)` (50% chance) and player's task is `ConstTask.TASK_31_0`, drops item 992.
                    *   Else if `Util.isTrue(10, 20)` (50% chance), drops item 457 (10 units).
                    *   Else, drops a random item from `Manager.itemIds_TL`.
                *   Else (if `BossManager.ratioReward` is false), drops a random item from `Manager.itemIds_NR_SB`.
            *   **Dependencies:** `plKill.achievement.plusCount`, `plKill.inventory.event`, `Service.getInstance().sendThongBao`, `Random`, `Manager.itemIds_TL`, `Manager.itemIds_NR_SB`, `BossManager.ratioReward`, `Util.isTrue`, `TaskService.gI().getIdTask`, `ConstTask.TASK_31_0`, `Service.getInstance().dropItemMap`, `ItemMap`, `Util.ratiItem`.
        *   `active()`:
            *   **Purpose:** Defines the boss's active behavior.
            *   **Logic:** Calls the superclass's `active()` method. If 9,000,000 milliseconds (150 minutes or 2.5 hours) have passed since `st`, it changes its status to `BossStatus.LEAVE_MAP`.
            *   **Dependencies:** `super.active()`, `Util.canDoWithTime`, `BossStatus.LEAVE_MAP`.
        *   `injured(Player plAtt, double damage, boolean piercing, boolean isMobAttack)`:
            *   **Purpose:** Determines how Black takes damage, including dodge and shield mechanics.
            *   **Logic:**
                *   If not already dead:
                    *   If not `piercing` and a random check based on `tlNeDon` (dodge rate) and `tlchinhxac` (accuracy) is true (1 in 1000 chance), it chats "Xí hụt" (Missed) and returns 0 damage.
                    *   Calculates `damage` after applying defense (`this.nPoint.subDameInjureWithDeff`).
                    *   If not `piercing` and `effectSkill.isShielding` is true:
                        *   If `damage` is greater than `nPoint.hpMax`, it breaks the shield (`EffectSkillService.gI().breakShield`).
                        *   Sets `damage` to 1 (shield absorbs most damage).
                    *   Subtracts `damage` from its HP (`this.nPoint.subHP`).
                    *   If it dies, it calls `this.setDie(plAtt)` and `die(plAtt)`.
                    *   Returns the final `damage` taken.
                *   If already dead, returns 0.
            *   **Dependencies:** `this.isDie()`, `Util.isTrue`, `this.nPoint.tlNeDon`, `plAtt.nPoint.tlchinhxac`, `this.chat()`, `this.nPoint.subDameInjureWithDeff`, `effectSkill.isShielding`, `nPoint.hpMax`, `EffectSkillService.gI().breakShield`, `this.nPoint.subHP`, `this.setDie()`, `die()`.
        *   `joinMap()`:
            *   **Purpose:** Executed when the boss joins a map.
            *   **Logic:** Calls the superclass's `joinMap()` method and records the current system time in `st`.
            *   **Dependencies:** `super.joinMap()`, `System.currentTimeMillis()`.
        *   **Commented-out methods (`moveTo`, `reward`, `notifyJoinMap`):** These methods suggest that the boss might have had level-specific behaviors that were later removed or are not currently in use.

*   **Dependencies (Classes/Enums):**
    *   `ConstTask`: Constants related to tasks.
    *   `Boss`: Base class for bosses.
    *   `BossID`: Enum for boss identifiers.
    *   `BossStatus`: Enum for boss statuses.
    *   `BossesData`: Contains data for various bosses.
    *   `ItemMap`: Represents an item on the map.
    *   `Player`: Represents a player character.
    *   `Manager`: Likely a central manager class for game data (e.g., item IDs).
    *   `EffectSkillService`: Service for skill effects (e.g., shield).
    *   `Service`: Provides game services (e.g., sending notifications, dropping items).
    *   `Util`: Utility class for common functions (e.g., random chance, time checks).
    *   `Random`: For generating random numbers.

### Flow Diagram (Text-based):

```
[Black Constructor]
    |
    V
    Initialize Boss with BLACK ID and data (BLACK_GOKU, SP_BL).

[joinMap() called]
    |
    V
    Call super.joinMap().
    Set st = current system time.

[active() called]
    |
    V
    Call super.active().
    |
    V
    If 9,000,000 milliseconds (150 minutes) have passed since st:
        |
        V
        Change status to BossStatus.LEAVE_MAP.

[Player Kills Black] -> Calls reward(plKill)
    |
    V
    Increment plKill.achievement count.
    Increment plKill.inventory.event.
    Send notification to plKill.
    |
    V
    If BossManager.ratioReward is true (100% chance):
        |
        V
        If Util.isTrue(10, 20) (50% chance) AND player's task is ConstTask.TASK_31_0:
            |
            V
            Drop item 992.
        |
        V
        Else if Util.isTrue(10, 20) (50% chance):
            |
            V
            Drop item 457 (10 units).
        |
        V
        Else:
            |
            V
            Drop random item from Manager.itemIds_TL.
    |
    V
    Else (BossManager.ratioReward is false):
        |
        V
        Drop random item from Manager.itemIds_NR_SB.

[injured(plAtt, damage, piercing, isMobAttack) called]
    |
    V
    If boss is not dead:
        |
        V
        If not piercing AND random dodge check (1 in 1000) is true:
            |
            V
            Chat "Xí hụt".
            Return 0.
        |
        V
        Calculate damage after defense.
        |
        V
        If not piercing AND effectSkill.isShielding is true:
            |
            V
            If damage > nPoint.hpMax:
                |
                V
                Break shield.
            |
            V
            Set damage = 1.
        |
        V
        Subtract damage from HP.
        |
        V
        If boss is dead:
            |
            V
            Set boss as dead (setDie).
            Call die(plAtt).
        |
        V
        Return final damage.
    |
    V
    Else (boss is dead):
        |
        V
        Return 0.
```

---

## BlackGokuBase.java

The `BlackGokuBase` class represents the Super Black Goku boss (base form). It extends the `Boss` class and defines its reward behavior upon defeat, a time-based disappearance mechanism, and a custom `injured` method that includes a dodge chance and shield mechanics, similar to the `Black` class.

### Mapping:

*   **Class:** `BlackGokuBase`
    *   **Inherits from:** `Boss`
    *   **Fields:**
        *   `st`: `long` - Stores the system time when the boss joins the map, used for its time-based disappearance.
    *   **Constructor:** `BlackGokuBase()`: Initializes the boss with `BossID.SUPER_BLACK_GOKU` and `BossesData.SUPER_BLACK_GOKU`.
    *   **Methods:**
        *   `reward(Player plKill)`:
            *   **Purpose:** Handles rewards when Black Goku Base is killed.
            *   **Logic:** Awards achievement points, increments player event count, sends a notification.
            *   Drops items based on `BossManager.ratioReward`:
                *   If `BossManager.ratioReward` is true (100% chance):
                    *   If `Util.isTrue(1, 20)` (5% chance), drops item 865.
                    *   Else if `Util.isTrue(10, 20)` (50% chance), drops item 14.
                    *   Else, drops a random item from `Manager.itemIds_TL`.
                *   Else (if `BossManager.ratioReward` is false), drops item 14.
            *   Always drops item 2030 (2 units).
            *   **Dependencies:** `plKill.achievement.plusCount`, `plKill.inventory.event`, `Service.getInstance().sendThongBao`, `Random`, `Manager.itemIds_TL`, `Manager.itemIds_NR_SB`, `BossManager.ratioReward`, `Util.isTrue`, `Service.getInstance().dropItemMap`, `ItemMap`, `Util.ratiItem`.
        *   `injured(Player plAtt, double damage, boolean piercing, boolean isMobAttack)`:
            *   **Purpose:** Determines how Black Goku Base takes damage, including dodge and shield mechanics.
            *   **Logic:**
                *   If not already dead:
                    *   If not `piercing` and a random check based on `tlNeDon` (dodge rate) and `tlchinhxac` (accuracy) is true (1 in 1000 chance), it chats "Xí hụt" (Missed) and returns 0 damage.
                    *   Calculates `damage` after applying defense (`this.nPoint.subDameInjureWithDeff`).
                    *   If not `piercing` and `effectSkill.isShielding` is true:
                        *   If `damage` is greater than `nPoint.hpMax`, it breaks the shield (`EffectSkillService.gI().breakShield`).
                        *   Sets `damage` to 1 (shield absorbs most damage).
                    *   Subtracts `damage` from its HP (`this.nPoint.subHP`).
                    *   If it dies, it calls `this.setDie(plAtt)` and `die(plAtt)`.
                    *   Returns the final `damage` taken.
                *   If already dead, returns 0.
            *   **Dependencies:** `this.isDie()`, `Util.isTrue`, `this.nPoint.tlNeDon`, `plAtt.nPoint.tlchinhxac`, `this.chat()`, `this.nPoint.subDameInjureWithDeff`, `effectSkill.isShielding`, `nPoint.hpMax`, `EffectSkillService.gI().breakShield`, `this.nPoint.subHP`, `this.setDie()`, `die()`.
        *   `active()`:
            *   **Purpose:** Defines the boss's active behavior.
            *   **Logic:** Calls the superclass's `active()` method. If 9,000,000 milliseconds (150 minutes or 2.5 hours) have passed since `st`, it changes its status to `BossStatus.LEAVE_MAP`.
            *   **Dependencies:** `super.active()`, `Util.canDoWithTime`, `BossStatus.LEAVE_MAP`.
        *   `joinMap()`:
            *   **Purpose:** Executed when the boss joins a map.
            *   **Logic:** Calls the superclass's `joinMap()` method and records the current system time in `st`.
            *   **Dependencies:** `super.joinMap()`, `System.currentTimeMillis()`.
        *   **Commented-out methods (`moveTo`, `reward`, `notifyJoinMap`):** These methods suggest that the boss might have had level-specific behaviors that were later removed or are not currently in use.

*   **Dependencies (Classes/Enums):**
    *   `Boss`: Base class for bosses.
    *   `BossID`: Enum for boss identifiers.
    *   `BossStatus`: Enum for boss statuses.
    *   `BossesData`: Contains data for various bosses.
    *   `ItemMap`: Represents an item on the map.
    *   `Player`: Represents a player character.
    *   `Manager`: Likely a central manager class for game data (e.g., item IDs).
    *   `EffectSkillService`: Service for skill effects (e.g., shield).
    *   `Service`: Provides game services (e.g., sending notifications, dropping items).
    *   `Util`: Utility class for common functions (e.g., random chance, time checks).
    *   `Random`: For generating random numbers.

### Flow Diagram (Text-based):

```
[BlackGokuBase Constructor]
    |
    V
    Initialize Boss with SUPER_BLACK_GOKU ID and data.

[joinMap() called]
    |
    V
    Call super.joinMap().
    Set st = current system time.

[active() called]
    |
    V
    Call super.active().
    |
    V
    If 9,000,000 milliseconds (150 minutes) have passed since st:
        |
        V
        Change status to BossStatus.LEAVE_MAP.

[Player Kills BlackGokuBase] -> Calls reward(plKill)
    |
    V
    Increment plKill.achievement count.
    Increment plKill.inventory.event.
    Send notification to plKill.
    |
    V
    If BossManager.ratioReward is true (100% chance):
        |
        V
        If Util.isTrue(1, 20) (5% chance):
            |
            V
            Drop item 865.
        |
        V
        Else if Util.isTrue(10, 20) (50% chance):
            |
            V
            Drop item 14.
        |
        V
        Else:
            |
            V
            Drop random item from Manager.itemIds_TL.
    |
    V
    Else (BossManager.ratioReward is false):
        |
        V
        Drop item 14.
    |
    V
    Always drop item 2030 (2 units).

[injured(plAtt, damage, boolean piercing, boolean isMobAttack) called]
    |
    V
    If boss is not dead:
        |
        V
        If not piercing AND random dodge check (1 in 1000) is true:
            |
            V
            Chat "Xí hụt".
            Return 0.
        |
        V
        Calculate damage after defense.
        |
        V
        If not piercing AND effectSkill.isShielding is true:
            |
            V
            If damage > nPoint.hpMax:
                |
                V
                Break shield.
            |
            V
            Set damage = 1.
        |
        V
        Subtract damage from HP.
        |
        V
        If boss is dead:
            |
            V
            Set boss as dead (setDie).
            Call die(plAtt).
        |
        V
        Return final damage.
    |
    V
    Else (boss is dead):
        |
        V
        Return 0.
```

---

## BlackGokuTl.java

The `BlackGokuTl` class represents a form of Black Goku (likely "Super Saiyan Rose" or a similar transformation, given the "Tl" in the name, possibly short for "Tóc Long" meaning "long hair" or "Super Saiyan"). It extends the `Boss` class and defines its reward behavior upon defeat, a time-based disappearance mechanism, and a custom `injured` method that includes a dodge chance and shield mechanics. Its reward system is more complex, offering a chance for items with special options.

### Mapping:

*   **Class:** `BlackGokuTl`
    *   **Inherits from:** `Boss`
    *   **Fields:**
        *   `st`: `long` - Stores the system time when the boss joins the map, used for its time-based disappearance.
    *   **Constructor:** `BlackGokuTl()`: Initializes the boss with `BossID.BLACK1`, `BossesData.BLACK_GOKU`, and `BossesData.SUPER_BLACK_GOKU`. This suggests it might be a specific form or a progression.
    *   **Methods:**
        *   `reward(Player plKill)`:
            *   **Purpose:** Handles rewards when Black Goku Tl is killed.
            *   **Logic:** Awards achievement points, increments player event count, sends a notification.
            *   Drops items based on `BossManager.ratioReward`:
                *   If `BossManager.ratioReward` is true (100% chance):
                    *   If `Util.isTrue(1, 20)` (5% chance), drops item 561.
                    *   Else if `Util.isTrue(10, 20)` (50% chance), drops item 457 (5 units).
                    *   Else if `Util.isTrue(2, 20)` (10% chance), drops item 16.
                    *   Always drops a random item from `Manager.itemIds_TL`. This item has a 10% chance to gain `Item.ItemOption(87, 1)` and a notification is sent.
                *   Else (if `BossManager.ratioReward` is false), drops item 15.
            *   Always drops item 2030 (2 units).
            *   **Dependencies:** `plKill.achievement.plusCount`, `plKill.inventory.event`, `Service.getInstance().sendThongBao`, `Random`, `Manager.itemIds_TL`, `Manager.itemIds_NR_SB`, `BossManager.ratioReward`, `Util.isTrue`, `Service.getInstance().dropItemMap`, `ItemMap`, `Util.ratiItem`, `Item.ItemOption`.
        *   `injured(Player plAtt, double damage, boolean piercing, boolean isMobAttack)`:
            *   **Purpose:** Determines how Black Goku Tl takes damage, including dodge and shield mechanics.
            *   **Logic:**
                *   If not already dead:
                    *   If not `piercing` and a random check based on `tlNeDon` (dodge rate) and `tlchinhxac` (accuracy) is true (1 in 1000 chance), it chats "Xí hụt" (Missed) and returns 0 damage.
                    *   Calculates `damage` after applying defense (`this.nPoint.subDameInjureWithDeff`).
                    *   If not `piercing` and `effectSkill.isShielding` is true:
                        *   If `damage` is greater than `nPoint.hpMax`, it breaks the shield (`EffectSkillService.gI().breakShield`).
                        *   Sets `damage` to 1 (shield absorbs most damage).
                    *   Subtracts `damage` from its HP (`this.nPoint.subHP`).
                    *   If it dies, it calls `this.setDie(plAtt)` and `die(plAtt)`.
                    *   Returns the final `damage` taken.
                *   If already dead, returns 0.
            *   **Dependencies:** `this.isDie()`, `Util.isTrue`, `this.nPoint.tlNeDon`, `plAtt.nPoint.tlchinhxac`, `this.chat()`, `this.nPoint.subDameInjureWithDeff`, `effectSkill.isShielding`, `nPoint.hpMax`, `EffectSkillService.gI().breakShield`, `this.nPoint.subHP`, `this.setDie()`, `die()`.
        *   `active()`:
            *   **Purpose:** Defines the boss's active behavior.
            *   **Logic:** Calls the superclass's `active()` method. If 9,000,000 milliseconds (150 minutes or 2.5 hours) have passed since `st`, it changes its status to `BossStatus.LEAVE_MAP`.
            *   **Dependencies:** `super.active()`, `Util.canDoWithTime`, `BossStatus.LEAVE_MAP`.
        *   `joinMap()`:
            *   **Purpose:** Executed when the boss joins a map.
            *   **Logic:** Calls the superclass's `joinMap()` method and records the current system time in `st`.
            *   **Dependencies:** `super.joinMap()`, `System.currentTimeMillis()`.
        *   **Commented-out methods (`moveTo`, `reward`, `notifyJoinMap`):** These methods suggest that the boss might have had level-specific behaviors that were later removed or are not currently in use.

*   **Dependencies (Classes/Enums):**
    *   `Boss`: Base class for bosses.
    *   `BossID`: Enum for boss identifiers.
    *   `BossStatus`: Enum for boss statuses.
    *   `BossesData`: Contains data for various bosses.
    *   `Item`: Represents an item, used for `Item.ItemOption`.
    *   `ItemMap`: Represents an item on the map.
    *   `Player`: Represents a player character.
    *   `Manager`: Likely a central manager class for game data (e.g., item IDs).
    *   `EffectSkillService`: Service for skill effects (e.g., shield).
    *   `Service`: Provides game services (e.g., sending notifications, dropping items).
    *   `Util`: Utility class for common functions (e.g., random chance, time checks).
    *   `Random`: For generating random numbers.

### Flow Diagram (Text-based):

```
[BlackGokuTl Constructor]
    |
    V
    Initialize Boss with BLACK1 ID and data (BLACK_GOKU, SUPER_BLACK_GOKU).

[joinMap() called]
    |
    V
    Call super.joinMap().
    Set st = current system time.

[active() called]
    |
    V
    Call super.active().
    |
    V
    If 9,000,000 milliseconds (150 minutes) have passed since st:
        |
        V
        Change status to BossStatus.LEAVE_MAP.

[Player Kills BlackGokuTl] -> Calls reward(plKill)
    |
    V
    Increment plKill.achievement count.
    Increment plKill.inventory.event.
    Send notification to plKill.
    |
    V
    If BossManager.ratioReward is true (100% chance):
        |
        V
        If Util.isTrue(1, 20) (5% chance):
            |
            V
            Drop item 561.
        |
        V
        Else if Util.isTrue(10, 20) (50% chance):
            |
            V
            Drop item 457 (5 units).
        |
        V
        Else if Util.isTrue(2, 20) (10% chance):
            |
            V
            Drop item 16.
        |
        V
        Drop random item from Manager.itemIds_TL.
        |
        V
        If Util.isTrue(10, 100) (10% chance):
            |
            V
            Add Item.ItemOption(87, 1) to the dropped item.
            Send notification about the item with option.
    |
    V
    Else (BossManager.ratioReward is false):
        |
        V
        Drop item 15.
    |
    V
    Always drop item 2030 (2 units).

[injured(plAtt, damage, boolean piercing, boolean isMobAttack) called]
    |
    V
    If boss is not dead:
        |
        V
        If not piercing AND random dodge check (1 in 1000) is true:
            |
            V
            Chat "Xí hụt".
            Return 0.
        |
        V
        Calculate damage after defense.
        |
        V
        If not piercing AND effectSkill.isShielding is true:
            |
            V
            If damage > nPoint.hpMax:
                |
                V
                Break shield.
            |
            V
            Set damage = 1.
        |
        V
        Subtract damage from HP.
        |
        V
        If boss is dead:
            |
            V
            Set boss as dead (setDie).
            Call die(plAtt).
        |
        V
        Return final damage.
    |
    V
    Else (boss is dead):
        |
        V
        Return 0.
```

---

## SuperBlack2.java

The `SuperBlack2` class represents a powerful form of Black Goku, likely Super Saiyan Rosé 2. It extends the `Boss` class and defines its reward behavior upon defeat, a time-based disappearance mechanism, and a custom `injured` method that includes a dodge chance and shield mechanics. Its reward system is quite varied, offering different types of items based on probabilities.

### Mapping:

*   **Class:** `SuperBlack2`
    *   **Inherits from:** `Boss`
    *   **Fields:**
        *   `st`: `long` - Stores the system time when the boss joins the map, used for its time-based disappearance.
    *   **Constructor:** `SuperBlack2()`: Initializes the boss with a random `BossID` (using `Util.randomBossId()`) and `BossesData.SUPER_BLACK_GOKU_2`.
    *   **Methods:**
        *   `reward(Player plKill)`:
            *   **Purpose:** Handles rewards when Super Black 2 is killed.
            *   **Logic:** Awards achievement points, increments player event count, sends a notification.
            *   Drops items based on `BossManager.ratioReward`:
                *   If `Util.isTrue(BossManager.ratioReward, 100)` (100% chance):
                    *   If `Util.isTrue(1, 5)` (20% chance), drops item 561.
                    *   Else, drops a random item from `Manager.itemIds_TL`.
                *   Else if `Util.isTrue(2, 5)` (40% chance):
                    *   Drops a random item from `itemDos` array (which contains various item IDs like 233, 237, etc.).
                *   Else (remaining 40% chance):
                    *   Drops a random item from `Manager.itemIds_NR_SB`.
            *   Always drops item 2030 (2 units).
            *   **Dependencies:** `plKill.achievement.plusCount`, `plKill.inventory.event`, `Service.getInstance().sendThongBao`, `Random`, `Manager.itemIds_TL`, `Manager.itemIds_NR_SB`, `BossManager.ratioReward`, `Util.isTrue`, `Service.getInstance().dropItemMap`, `ItemMap`, `Util.ratiItem`, `Util.RaitiDoc12`.
        *   `active()`:
            *   **Purpose:** Defines the boss's active behavior.
            *   **Logic:** Calls the superclass's `active()` method. If 9,000,000 milliseconds (150 minutes or 2.5 hours) have passed since `st`, it changes its status to `BossStatus.LEAVE_MAP`.
            *   **Dependencies:** `super.active()`, `Util.canDoWithTime`, `BossStatus.LEAVE_MAP`.
        *   `joinMap()`:
            *   **Purpose:** Executed when the boss joins a map.
            *   **Logic:** Calls the superclass's `joinMap()` method and records the current system time in `st`.
            *   **Dependencies:** `super.joinMap()`, `System.currentTimeMillis()`.
        *   `injured(Player plAtt, double damage, boolean piercing, boolean isMobAttack)`:
            *   **Purpose:** Determines how Super Black 2 takes damage, including dodge and shield mechanics.
            *   **Logic:**
                *   If not already dead:
                    *   If not `piercing` and a random check based on `tlNeDon` (dodge rate) and `tlchinhxac` (accuracy) is true (1 in 1000 chance), it chats "Xí hụt" (Missed) and returns 0 damage.
                    *   Calculates `damage` after applying defense (`this.nPoint.subDameInjureWithDeff`).
                    *   If not `piercing` and `effectSkill.isShielding` is true:
                        *   If `damage` is greater than `nPoint.hpMax`, it breaks the shield (`EffectSkillService.gI().breakShield`).
                        *   Sets `damage` to 1 (shield absorbs most damage).
                    *   Subtracts `damage` from its HP (`this.nPoint.subHP`).
                    *   If it dies, it calls `this.setDie(plAtt)` and `die(plAtt)`.
                    *   Returns the final `damage` taken.
                *   If already dead, returns 0.
            *   **Dependencies:** `this.isDie()`, `Util.isTrue`, `this.nPoint.tlNeDon`, `plAtt.nPoint.tlchinhxac`, `this.chat()`, `this.nPoint.subDameInjureWithDeff`, `effectSkill.isShielding`, `nPoint.hpMax`, `EffectSkillService.gI().breakShield`, `this.nPoint.subHP`, `this.setDie()`, `die()`.
        *   **Commented-out methods (`moveTo`, `reward`, `notifyJoinMap`):** These methods suggest that the boss might have had level-specific behaviors that were later removed or are not currently in use.

*   **Dependencies (Classes/Enums):**
    *   `Boss`: Base class for bosses.
    *   `BossID`: Enum for boss identifiers (used by `Util.randomBossId()`).
    *   `BossStatus`: Enum for boss statuses.
    *   `BossesData`: Contains data for various bosses.
    *   `ItemMap`: Represents an item on the map.
    *   `Player`: Represents a player character.
    *   `Manager`: Likely a central manager class for game data (e.g., item IDs).
    *   `EffectSkillService`: Service for skill effects (e.g., shield).
    *   `Service`: Provides game services (e.g., sending notifications, dropping items).
    *   `Util`: Utility class for common functions (e.g., random chance, time checks, random boss ID, item rarity).
    *   `Random`: For generating random numbers.

### Flow Diagram (Text-based):

```
[SuperBlack2 Constructor]
    |
    V
    Initialize Boss with a random BossID and SUPER_BLACK_GOKU_2 data.

[joinMap() called]
    |
    V
    Call super.joinMap().
    Set st = current system time.

[active() called]
    |
    V
    Call super.active().
    |
    V
    If 9,000,000 milliseconds (150 minutes) have passed since st:
        |
        V
        Change status to BossStatus.LEAVE_MAP.

[Player Kills SuperBlack2] -> Calls reward(plKill)
    |
    V
    Increment plKill.achievement count.
    Increment plKill.inventory.event.
    Send notification to plKill.
    |
    V
    If BossManager.ratioReward is true (100% chance):
        |
        V
        If Util.isTrue(1, 5) (20% chance):
            |
            V
            Drop item 561.
            Return.
        |
        V
        Else:
            |
            V
            Drop random item from Manager.itemIds_TL.
    |
    V
    Else if Util.isTrue(2, 5) (40% chance):
        |
        V
        Drop random item from itemDos array.
        Return.
    |
    V
    Else (remaining 40% chance):
        |
        V
        Drop random item from Manager.itemIds_NR_SB.
    |
    V
    Always drop item 2030 (2 units).

[injured(plAtt, damage, boolean piercing, boolean isMobAttack) called]
    |
    V
    If boss is not dead:
        |
        V
        If not piercing AND random dodge check (1 in 1000) is true:
            |
            V
            Chat "Xí hụt".
            Return 0.
        |
        V
        Calculate damage after defense.
        |
        V
        If not piercing AND effectSkill.isShielding is true:
            |
            V
            If damage > nPoint.hpMax:
                |
                V
                Break shield.
            |
            V
            Set damage = 1.
        |
        V
        Subtract damage from HP.
        |
        V
        If boss is dead:
            |
            V
            Set boss as dead (setDie).
            Call die(plAtt).
        |
        V
        Return final damage.
    |
    V
    Else (boss is dead):
        |
        V
        Return 0.
```

---

## ZamasKaio.java

The `ZamasKaio` class represents Zamasu (likely in his Kaioshin form). It extends the `Boss` class and defines its reward behavior upon defeat, a time-based disappearance mechanism, and a custom `injured` method that includes a dodge chance and shield mechanics. Its reward system is varied, offering different types of items based on probabilities.

### Mapping:

*   **Class:** `ZamasKaio`
    *   **Inherits from:** `Boss`
    *   **Fields:**
        *   `st`: `long` - Stores the system time when the boss joins the map, used for its time-based disappearance.
    *   **Constructor:** `ZamasKaio()`: Initializes the boss with `BossID.ZAMASZIN` and `BossesData.ZAMAS`.
    *   **Methods:**
        *   `reward(Player plKill)`:
            *   **Purpose:** Handles rewards when Zamas Kaio is killed.
            *   **Logic:** Awards achievement points, increments player event count, sends a notification.
            *   Drops items based on `BossManager.ratioReward`:
                *   If `Util.isTrue(BossManager.ratioReward, 100)` (100% chance):
                    *   If `Util.isTrue(1, 5)` (20% chance), drops item 2031 (5 units).
                    *   Else, drops a random item from `Manager.itemIds_TL`.
                *   Else if `Util.isTrue(2, 5)` (40% chance):
                    *   Drops a random item from `itemDos` array (which contains various item IDs like 233, 237, etc.).
                *   Else (remaining 40% chance):
                    *   Drops item 457 (5 units).
            *   Always drops item 2030 (2 units).
            *   **Dependencies:** `plKill.achievement.plusCount`, `plKill.inventory.event`, `Service.getInstance().sendThongBao`, `Random`, `Manager.itemIds_TL`, `Manager.itemIds_NR_SB`, `BossManager.ratioReward`, `Util.isTrue`, `Service.getInstance().dropItemMap`, `ItemMap`, `Util.ratiItem`, `Util.RaitiDoc12`.
        *   `active()`:
            *   **Purpose:** Defines the boss's active behavior.
            *   **Logic:** Calls the superclass's `active()` method. If 9,000,000 milliseconds (150 minutes or 2.5 hours) have passed since `st`, it changes its status to `BossStatus.LEAVE_MAP`.
            *   **Dependencies:** `super.active()`, `Util.canDoWithTime`, `BossStatus.LEAVE_MAP`.
        *   `joinMap()`:
            *   **Purpose:** Executed when the boss joins a map.
            *   **Logic:** Calls the superclass's `joinMap()` method and records the current system time in `st`.
            *   **Dependencies:** `super.joinMap()`, `System.currentTimeMillis()`.
        *   `injured(Player plAtt, double damage, boolean piercing, boolean isMobAttack)`:
            *   **Purpose:** Determines how Zamas Kaio takes damage, including dodge and shield mechanics.
            *   **Logic:**
                *   If not already dead:
                    *   If not `piercing` and a random check based on `tlNeDon` (dodge rate) and `tlchinhxac` (accuracy) is true (1 in 1000 chance), it chats "Xí hụt" (Missed) and returns 0 damage.
                    *   Calculates `damage` after applying defense (`this.nPoint.subDameInjureWithDeff`).
                    *   If not `piercing` and `effectSkill.isShielding` is true:
                        *   If `damage` is greater than `nPoint.hpMax`, it breaks the shield (`EffectSkillService.gI().breakShield`).
                        *   Sets `damage` to 1 (shield absorbs most damage).
                    *   Subtracts `damage` from its HP (`this.nPoint.subHP`).
                    *   If it dies, it calls `this.setDie(plAtt)` and `die(plAtt)`.
                    *   Returns the final `damage` taken.
                *   If already dead, returns 0.
            *   **Dependencies:** `this.isDie()`, `Util.isTrue`, `this.nPoint.tlNeDon`, `plAtt.nPoint.tlchinhxac`, `this.chat()`, `this.nPoint.subDameInjureWithDeff`, `effectSkill.isShielding`, `nPoint.hpMax`, `EffectSkillService.gI().breakShield`, `this.nPoint.subHP`, `this.setDie()`, `die()`.
        *   **Commented-out methods (`moveTo`, `reward`, `notifyJoinMap`):** These methods suggest that the boss might have had level-specific behaviors that were later removed or are not currently in use.

*   **Dependencies (Classes/Enums):**
    *   `Boss`: Base class for bosses.
    *   `BossID`: Enum for boss identifiers.
    *   `BossStatus`: Enum for boss statuses.
    *   `BossesData`: Contains data for various bosses.
    *   `ItemMap`: Represents an item on the map.
    *   `Player`: Represents a player character.
    *   `Manager`: Likely a central manager class for game data (e.g., item IDs).
    *   `EffectSkillService`: Service for skill effects (e.g., shield).
    *   `Service`: Provides game services (e.g., sending notifications, dropping items).
    *   `Util`: Utility class for common functions (e.g., random chance, time checks, item rarity).
    *   `Random`: For generating random numbers.

### Flow Diagram (Text-based):

```
[ZamasKaio Constructor]
    |
    V
    Initialize Boss with ZAMASZIN ID and ZAMAS data.

[joinMap() called]
    |
    V
    Call super.joinMap().
    Set st = current system time.

[active() called]
    |
    V
    Call super.active().
    |
    V
    If 9,000,000 milliseconds (150 minutes) have passed since st:
        |
        V
        Change status to BossStatus.LEAVE_MAP.

[Player Kills ZamasKaio] -> Calls reward(plKill)
    |
    V
    Increment plKill.achievement count.
    Increment plKill.inventory.event.
    Send notification to plKill.
    |
    V
    If BossManager.ratioReward is true (100% chance):
        |
        V
        If Util.isTrue(1, 5) (20% chance):
            |
            V
            Drop item 2031 (5 units).
            Return.
        |
        V
        Else:
            |
            V
            Drop random item from Manager.itemIds_TL.
    |
    V
    Else if Util.isTrue(2, 5) (40% chance):
        |
        V
        Drop random item from itemDos array.
        Return.
    |
    V
    Else (remaining 40% chance):
        |
        V
        Drop item 457 (5 units).
    |
    V
    Always drop item 2030 (2 units).

[injured(plAtt, damage, boolean piercing, boolean isMobAttack) called]
    |
    V
    If boss is not dead:
        |
        V
        If not piercing AND random dodge check (1 in 1000) is true:
            |
            V
            Chat "Xí hụt".
            Return 0.
        |
        V
        Calculate damage after defense.
        |
        V
        If not piercing AND effectSkill.isShielding is true:
            |
            V
            If damage > nPoint.hpMax:
                |
                V
                Break shield.
            |
            V
            Set damage = 1.
        |
        V
        Subtract damage from HP.
        |
        V
        If boss is dead:
            |
            V
            Set boss as dead (setDie).
            Call die(plAtt).
        |
        V
        Return final damage.
    |
    V
    Else (boss is dead):
        |
        V
        Return 0.
```

---

## ZamasMax.java

The `ZamasMax` class is entirely commented out. This means it's currently not active in the game. However, if it were active, it would represent a powerful form of Zamasu (likely Fused Zamasu or a similar "Max" form). Based on the commented-out code, it would have a reward system that includes achievement points and specific item drops, a time-based disappearance, and a custom `injured` method that includes a dodge chance and shield mechanics.

### Mapping (based on commented-out code):

*   **Class:** `ZamasMax`
    *   **Inherits from:** `Boss`
    *   **Fields:**
        *   `st`: `long` - Stores the system time when the boss joins the map, used for its time-based disappearance.
    *   **Constructor:** `ZamasMax()`: Initializes the boss with `BossID.ZAMASMAX` and `BossesData.THANZM2`.
    *   **Methods:**
        *   `reward(Player plKill)`:
            *   **Purpose:** Handles rewards when Zamas Max is killed.
            *   **Logic:** Awards achievement points, increments player event count, sends a notification.
            *   Drops items based on `BossManager.ratioReward`:
                *   If `Util.isTrue(BossManager.ratioReward, 100)` (100% chance):
                    *   If `Util.isTrue(1, 20)` (5% chance), drops item 2031 (5 units).
                    *   Else, drops a random item from `Manager.itemIds_TL`.
                *   Else if `Util.isTrue(70, 100)` (70% chance):
                    *   Drops item 457 (5 units).
                *   Else (remaining 30% chance):
                    *   Drops a random item from `itemDos` array (which contains various item IDs like 233, 237, etc.).
            *   Always drops item 2030 (2 units).
            *   **Dependencies:** `plKill.achievement.plusCount`, `plKill.inventory.event`, `Service.getInstance().sendThongBao`, `Random`, `Manager.itemIds_TL`, `Manager.itemIds_NR_SB`, `BossManager.ratioReward`, `Util.isTrue`, `Service.getInstance().dropItemMap`, `ItemMap`, `Util.ratiItem`, `Util.RaitiDoc12`.
        *   `active()`:
            *   **Purpose:** Defines the boss's active behavior.
            *   **Logic:** Calls the superclass's `active()` method. If 9,000,000 milliseconds (150 minutes or 2.5 hours) have passed since `st`, it changes its status to `BossStatus.LEAVE_MAP`.
            *   **Dependencies:** `super.active()`, `Util.canDoWithTime`, `BossStatus.LEAVE_MAP`.
        *   `joinMap()`:
            *   **Purpose:** Executed when the boss joins a map.
            *   **Logic:** Calls the superclass's `joinMap()` method and records the current system time in `st`.
            *   **Dependencies:** `super.joinMap()`, `System.currentTimeMillis()`.
        *   `injured(Player plAtt, double damage, boolean piercing, boolean isMobAttack)`:
            *   **Purpose:** Determines how Zamas Max takes damage, including dodge and shield mechanics.
            *   **Logic:**
                *   If not already dead:
                    *   If not `piercing` and a random check based on `tlNeDon` (dodge rate) and `tlchinhxac` (accuracy) is true (1 in 1000 chance), it chats "Xí hụt" (Missed) and returns 0 damage.
                    *   Calculates `damage` after applying defense (`this.nPoint.subDameInjureWithDeff`).
                    *   If not `piercing` and `effectSkill.isShielding` is true:
                        *   If `damage` is greater than `nPoint.hpMax`, it breaks the shield (`EffectSkillService.gI().breakShield`).
                        *   Sets `damage` to 1 (shield absorbs most damage).
                    *   Subtracts `damage` from its HP (`this.nPoint.subHP`).
                    *   If it dies, it calls `this.setDie(plAtt)` and `die(plAtt)`.
                    *   Returns the final `damage` taken.
                *   If already dead, returns 0.
            *   **Dependencies:** `this.isDie()`, `Util.isTrue`, `this.nPoint.tlNeDon`, `plAtt.nPoint.tlchinhxac`, `this.chat()`, `this.nPoint.subDameInjureWithDeff`, `effectSkill.isShielding`, `nPoint.hpMax`, `EffectSkillService.gI().breakShield`, `this.nPoint.subHP`, `this.setDie()`, `die()`.
        *   **Commented-out methods (`moveTo`, `reward`, `notifyJoinMap`):** These methods suggest that the boss might have had level-specific behaviors that were later removed or are not currently in use.

*   **Dependencies (Classes/Enums):**
    *   `Boss`: Base class for bosses.
    *   `BossID`: Enum for boss identifiers.
    *   `BossStatus`: Enum for boss statuses.
    *   `BossesData`: Contains data for various bosses.
    *   `ItemMap`: Represents an item on the map.
    *   `Player`: Represents a player character.
    *   `Manager`: Likely a central manager class for game data (e.g., item IDs).
    *   `EffectSkillService`: Service for skill effects (e.g., shield).
    *   `Service`: Provides game services (e.g., sending notifications, dropping items).
    *   `Util`: Utility class for common functions (e.g., random chance, time checks, item rarity).
    *   `Random`: For generating random numbers.

### Flow Diagram (Text-based - based on commented-out code):

```
[ZamasMax Constructor]
    |
    V
    Initialize Boss with ZAMASMAX ID and THANZM2 data.

[joinMap() called]
    |
    V
    Call super.joinMap().
    Set st = current system time.

[active() called]
    |
    V
    Call super.active().
    |
    V
    If 9,000,000 milliseconds (150 minutes) have passed since st:
        |
        V
        Change status to BossStatus.LEAVE_MAP.

[Player Kills ZamasMax] -> Calls reward(plKill)
    |
    V
    Increment plKill.achievement count.
    Increment plKill.inventory.event.
    Send notification to plKill.
    |
    V
    If BossManager.ratioReward is true (100% chance):
        |
        V
        If Util.isTrue(1, 20) (5% chance):
            |
            V
            Drop item 2031 (5 units).
        |
        V
        Else:
            |
            V
            Drop random item from Manager.itemIds_TL.
    |
    V
    Else if Util.isTrue(70, 100) (70% chance):
        |
        V
        Drop item 457 (5 units).
    |
    V
    Else (remaining 30% chance):
        |
        V
        Drop random item from itemDos array.
    |
    V
    Always drop item 2030 (2 units).

[injured(plAtt, damage, boolean piercing, boolean isMobAttack) called]
    |
    V
    If boss is not dead:
        |
        V
        If not piercing AND random dodge check (1 in 1000) is true:
            |
            V
            Chat "Xí hụt".
            Return 0.
        |
        V
        Calculate damage after defense.
        |
        V
        If not piercing AND effectSkill.isShielding is true:
            |
            V
            If damage > nPoint.hpMax:
                |
                V
                Break shield.
            |
            V
            Set damage = 1.
        |
        V
        Subtract damage from HP.
        |
        V
        If boss is dead:
            |
            V
            Set boss as dead (setDie).
            Call die(plAtt).
        |
        V
        Return final damage.
    |
    V
    Else (boss is dead):
        |
        V
        Return 0.
```