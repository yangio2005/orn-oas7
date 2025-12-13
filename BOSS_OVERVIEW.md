# Android Bosses Overview

This document provides an overview of the Android boss classes found in the `com.girlkun.models.boss.list_boss.android` package.

---

## Android13.java

The `Android13` class defines the behavior of the Android 13 boss in the game. It handles item drops upon defeat, interacts with its "parent boss" and specifically with "Android 15" if they appear together. A key game mechanic implemented here is that Android 13 cannot be defeated if Android 15 is still active within the same boss group.

### Mapping:

*   **Class:** `Android13`
    *   **Inherits from:** `Boss`
    *   **Constructor:** `Android13()`: Initializes the boss with `BossID.ANDROID_13` and data from `BossesData.ANDROID_13`.
    *   **Methods:**
        *   `reward(Player plKill)`:
            *   **Purpose:** Handles dropping items when Android 13 is killed.
            *   **Logic:** Randomly selects an item from `itemRan` array (currently hardcoded to index 2, which is `382`). Has a 15% chance to drop the item.
            *   **Dependencies:** `Util.isTrue`, `ItemMap`, `Service.getInstance().dropItemMap`.
        *   `doneChatS()`:
            *   **Purpose:** Executed after a specific chat sequence (likely when the boss appears or a phase changes).
            *   **Logic:** If part of a parent boss group and Android 15 is alive and not dead, Android 15 changes to PK (Player Kill) type. The parent boss also changes to PK type.
            *   **Dependencies:** `parentBoss`, `bossAppearTogether`, `BossID.ANDROID_15`, `boss.isDie()`, `boss.changeToTypePK()`, `parentBoss.changeToTypePK()`.
        *   `injured(Player plAtt, double damage, boolean piercing, boolean isMobAttack)`:
            *   **Purpose:** Determines how Android 13 takes damage.
            *   **Logic:** If the incoming `damage` is greater than or equal to its current `hp`, it checks if Android 15 (if part of the same boss group) is still alive. If Android 15 is alive, Android 13 takes no damage (returns 0). Otherwise, it calls the superclass's `injured` method.
            *   **Dependencies:** `nPoint.hp`, `parentBoss`, `bossAppearTogether`, `BossID.ANDROID_15`, `boss.isDie()`, `parentBoss.isDie()`, `super.injured()`.
*   **Dependencies (Classes/Enums):**
    *   `Boss`: Base class for bosses.
    *   `BossID`: Enum for boss identifiers.
    *   `BossesData`: Contains data for various bosses.
    *   `ItemMap`: Represents an item on the map.
    *   `Player`: Represents a player character.
    *   `Service`: Provides game services (e.g., dropping items).
    *   `Util`: Utility class for common functions (e.g., random chance).

### Flow Diagram (Text-based):

```
[Android13 Constructor]
    |
    V
    Initialize Boss with ANDROID_13 ID and data.

[Player Kills Android13] -> Calls reward(plKill)
    |
    V
    Check if random condition (15% chance) is met.
    |--- (True) ---|
    V              V
    Select item ID (currently 382).
    |
    V
    Create ItemMap object at boss's location.
    |
    V
    Drop item on map using Service.getInstance().dropItemMap.
    |--- (False) ---|
    V
    No item dropped.

[doneChatS() called] (e.g., after boss appears or phase change)
    |
    V
    Check if parentBoss exists.
    |--- (False) ---|
    V
    Return (do nothing).
    |--- (True) ---|
    V
    Check if parentBoss has bossAppearTogether and currentLevel is valid.
    |--- (False) ---|
    V
    Return (do nothing).
    |--- (True) ---|
    V
    Iterate through bosses in parentBoss.bossAppearTogether[currentLevel].
    |
    V
    For each boss:
        Check if boss ID is ANDROID_15 AND boss is not dead.
        |--- (True) ---|
        V
        Call boss.changeToTypePK() for Android 15.
        Break loop.
        |--- (False) ---|
        V
        Continue to next boss.
    |
    V
    Call parentBoss.changeToTypePK().

[injured(plAtt, damage, piercing, isMobAttack) called]
    |
    V
    Check if damage >= current HP (nPoint.hp).
    |--- (False) ---|
    V
    Call super.injured() and return its result.
    |--- (True) ---|
    V
    Set flag = true.
    |
    V
    Check if parentBoss exists.
    |--- (True) ---|
    V
    Check if parentBoss has bossAppearTogether and currentLevel is valid.
    |--- (True) ---|
    V
    Iterate through bosses in parentBoss.bossAppearTogether[currentLevel].
    |
    V
    For each boss:
        Check if boss ID is ANDROID_15 AND boss is not dead.
        |--- (True) ---|
        V
        Set flag = false.
        Break loop.
        |--- (False) ---|
        V
        Continue to next boss.
    |
    V
    Check if flag is true AND parentBoss is not dead.
    |--- (True) ---|
    V
    Set flag = false.
    |--- (False) ---|
    V
    (No change to flag)
    |--- (False) ---|
    V
    (No parentBoss or bossAppearTogether)
    |
    V
    Check if flag is true.
    |--- (True) ---|
    V
    Call super.injured() and return its result.
    |--- (False) ---|
    V
    Return 0 (Android 13 takes no damage).
```

---

## Android14.java

The `Android14` class defines the behavior of the Android 14 boss. It features a unique "call" mechanic: when Android 14 is about to be defeated, it can trigger a special ability (`callApk13()`) that interacts with Android 13 and Android 15, potentially resetting its own health and altering the state of its allies. This suggests a multi-boss encounter where Android 14 acts as a pivotal element, initiating a new phase or a recovery strategy.

### Mapping:

*   **Class:** `Android14`
    *   **Inherits from:** `Boss`
    *   **Fields:**
        *   `callApk13`: `boolean` - A flag indicating whether Android 13 has been "called" (triggered its special ability).
    *   **Constructor:** `Android14()`: Initializes the boss with `BossID.ANDROID_14` and data from `BossesData.ANDROID_14`.
    *   **Methods:**
        *   `reward(Player plKill)`:
            *   **Purpose:** Handles dropping items when Android 14 is killed.
            *   **Logic:** Similar to Android 13, it randomly selects an item (currently hardcoded to index 2, which is `382`) and has a 15% chance to drop it.
            *   **Dependencies:** `Util.isTrue`, `ItemMap`, `Service.getInstance().dropItemMap`.
        *   `resetBase()`:
            *   **Purpose:** Resets the boss's base state.
            *   **Logic:** Calls the superclass's `resetBase()` and sets `callApk13` to `false`.
        *   `active()`:
            *   **Purpose:** Defines the boss's active behavior.
            *   **Logic:** If the boss is not in PK mode (`ConstPlayer.NON_PK`) and `callApk13` is `false`, it changes to PK mode. It then performs its attack (`this.attack()`).
            *   **Dependencies:** `ConstPlayer.NON_PK`, `changeToTypePK()`, `attack()`.
        *   `injured(Player plAtt, double damage, boolean piercing, boolean isMobAttack)`:
            *   **Purpose:** Determines how Android 14 takes damage.
            *   **Logic:** If `callApk13` is `false` and the incoming `damage` is greater than or equal to its current `hp`, it calls `callApk13()` and returns 0 (meaning it takes no damage from this hit, as it's triggering its special ability). Otherwise, it calls the superclass's `injured` method.
            *   **Dependencies:** `nPoint.hp`, `callApk13()`, `super.injured()`.
        *   `callApk13()`:
            *   **Purpose:** Triggers the special ability to interact with Android 13 and Android 15.
            *   **Logic:** Iterates through bosses in its `bossAppearTogether` group.
                *   If it finds `ANDROID_13`, it changes its status to `RESPAWN`.
                *   If it finds `ANDROID_15`, it changes to non-PK type, sets `((Android15) boss).callApk13 = true;` and calls `((Android15) boss).recoverHP()`.
            *   Android 14 itself changes to non-PK type, recovers its HP, and sets `callApk13` to `true`.
            *   **Dependencies:** `bossAppearTogether`, `BossID.ANDROID_13`, `BossID.ANDROID_15`, `BossStatus.RESPAWN`, `changeToTypeNonPK()`, `recoverHP()`.
        *   `recoverHP()`:
            *   **Purpose:** Recovers Android 14's HP.
            *   **Logic:** Uses `PlayerService.gI().hoiPhuc()` to restore its HP to `nPoint.hpMax`.
            *   **Dependencies:** `PlayerService.gI().hoiPhuc()`, `nPoint.hpMax`.
        *   `doneChatS()`:
            *   **Purpose:** Executed after a specific chat sequence.
            *   **Logic:** If part of a boss group, it finds Android 15 and changes it to PK type.
            *   **Dependencies:** `bossAppearTogether`, `BossID.ANDROID_15`, `boss.changeToTypePK()`.

*   **Dependencies (Classes/Enums):**
    *   `ConstPlayer`: Constants related to players (e.g., PK status).
    *   `Boss`: Base class for bosses.
    *   `BossID`: Enum for boss identifiers.
    *   `BossStatus`: Enum for boss statuses.
    *   `BossesData`: Contains data for various bosses.
    *   `ItemMap`: Represents an item on the map.
    *   `Player`: Represents a player character.
    *   `PlayerService`: Service for player-related actions (e.g., healing).
    *   `Service`: Provides game services (e.g., dropping items).
    *   `Util`: Utility class for common functions (e.g., random chance).

### Flow Diagram (Text-based):

```
[Android14 Constructor]
    |
    V
    Initialize Boss with ANDROID_14 ID and data.
    Initialize callApk13 = false.

[resetBase() called]
    |
    V
    Call super.resetBase().
    Set callApk13 = false.

[active() called]
    |
    V
    If typePk is NON_PK AND callApk13 is false:
        |
        V
        Call changeToTypePK().
    |
    V
    Call attack().

[Player Kills Android14] -> Calls reward(plKill)
    |
    V
    Check if random condition (15% chance) is met.
    |--- (True) ---|
    V              V
    Select item ID (currently 382).
    |
    V
    Create ItemMap object at boss's location.
    |
    V
    Drop item on map using Service.getInstance().dropItemMap.
    |--- (False) ---|
    V
    No item dropped.

[injured(plAtt, damage, piercing, isMobAttack) called]
    |
    V
    If callApk13 is false AND damage >= current HP (nPoint.hp):
        |
        V
        Call callApk13().
        Return 0 (takes no damage from this hit).
    |
    V
    Else:
        Call super.injured() and return its result.

[callApk13() called]
    |
    V
    If bossAppearTogether is null or currentLevel group is null:
        |
        V
        Return.
    |
    V
    For each boss in bossAppearTogether[currentLevel]:
        |
        V
        If boss.id is ANDROID_13:
            |
            V
            Call boss.changeStatus(BossStatus.RESPAWN).
        |
        V
        Else if boss.id is ANDROID_15:
            |
            V
            Call boss.changeToTypeNonPK().
            Cast boss to Android15.
            Set ((Android15) boss).callApk13 = true.
            Call ((Android15) boss).recoverHP().
    |
    V
    Call this.changeToTypeNonPK().
    Call this.recoverHP().
    Set this.callApk13 = true.

[recoverHP() called]
    |
    V
    Call PlayerService.gI().hoiPhuc(this, this.nPoint.hpMax, 0).

[doneChatS() called]
    |
    V
    If bossAppearTogether is null or currentLevel group is null:
        |
        V
        Return.
    |
    V
    For each boss in bossAppearTogether[currentLevel]:
        |
        V
        If boss.id is ANDROID_15:
            |
            V
            Call boss.changeToTypePK().
            Break loop.
```

---

## Android15.java

The `Android15` class defines the behavior of the Android 15 boss. It plays a crucial role in a multi-boss encounter, particularly in its interaction with Android 14. When Android 15 is about to be defeated and a specific flag (`callApk13`) is not set, it triggers Android 14's special `callApk13()` ability, effectively making Android 14 intervene and potentially alter the battle state.

### Mapping:

*   **Class:** `Android15`
    *   **Inherits from:** `Boss`
    *   **Fields:**
        *   `callApk13`: `boolean` - A flag indicating whether Android 13 (or rather, the `callApk13` mechanism from Android 14) has been triggered. This flag is set by Android 14.
    *   **Constructor:** `Android15()`: Initializes the boss with `BossID.ANDROID_15` and data from `BossesData.ANDROID_15`.
    *   **Methods:**
        *   `reward(Player plKill)`:
            *   **Purpose:** Handles dropping items when Android 15 is killed.
            *   **Logic:** Similar to Android 13 and 14, it randomly selects an item (currently hardcoded to index 2, which is `382`) and has a 15% chance to drop it.
            *   **Dependencies:** `Util.isTrue`, `ItemMap`, `Service.getInstance().dropItemMap`.
        *   `resetBase()`:
            *   **Purpose:** Resets the boss's base state.
            *   **Logic:** Calls the superclass's `resetBase()` and sets `callApk13` to `false`.
        *   `active()`:
            *   **Purpose:** Defines the boss's active behavior.
            *   **Logic:** Simply calls its `attack()` method.
            *   **Dependencies:** `attack()`.
        *   `injured(Player plAtt, double damage, boolean piercing, boolean isMobAttack)`:
            *   **Purpose:** Determines how Android 15 takes damage.
            *   **Logic:** If `callApk13` is `false` and the incoming `damage` is greater than or equal to its current `hp`, it checks if it has a `parentBoss`. If it does, it casts the `parentBoss` to `Android14` and calls `((Android14) this.parentBoss).callApk13()`. It then returns 0, meaning Android 15 takes no damage from this hit as it triggers Android 14's ability. Otherwise, it calls the superclass's `injured` method.
            *   **Dependencies:** `nPoint.hp`, `parentBoss`, `Android14.callApk13()`, `super.injured()`.
        *   `recoverHP()`:
            *   **Purpose:** Recovers Android 15's HP.
            *   **Logic:** Uses `PlayerService.gI().hoiPhuc()` to restore its HP to `nPoint.hpMax`.
            *   **Dependencies:** `PlayerService.gI().hoiPhuc()`, `nPoint.hpMax`.

*   **Dependencies (Classes/Enums):**
    *   `ConstPlayer`: Constants related to players (though not directly used in this file, it's imported).
    *   `Boss`: Base class for bosses.
    *   `BossID`: Enum for boss identifiers.
    *   `BossStatus`: Enum for boss statuses (though not directly used in this file, it's imported).
    *   `BossesData`: Contains data for various bosses.
    *   `ItemMap`: Represents an item on the map.
    *   `Player`: Represents a player character.
    *   `PlayerService`: Service for player-related actions (e.g., healing).
    *   `Service`: Provides game services (e.g., dropping items).
    *   `Util`: Utility class for common functions (e.g., random chance).
    *   `Android14`: Explicitly cast to and used for its `callApk13()` method.

### Flow Diagram (Text-based):

```
[Android15 Constructor]
    |
    V
    Initialize Boss with ANDROID_15 ID and data.
    Initialize callApk13 = false.

[resetBase() called]
    |
    V
    Call super.resetBase().
    Set callApk13 = false.

[active() called]
    |
    V
    Call attack().

[Player Kills Android15] -> Calls reward(plKill)
    |
    V
    Check if random condition (15% chance) is met.
    |--- (True) ---|
    V              V
    Select item ID (currently 382).
    |
    V
    Create ItemMap object at boss's location.
    |
    V
    Drop item on map using Service.getInstance().dropItemMap.
    |--- (False) ---|
    V
    No item dropped.

[injured(plAtt, damage, piercing, isMobAttack) called]
    |
    V
    If callApk13 is false AND damage >= current HP (nPoint.hp):
        |
        V
        If parentBoss is not null:
            |
            V
            Cast parentBoss to Android14.
            Call ((Android14) parentBoss).callApk13().
        |
        V
        Return 0 (takes no damage from this hit).
    |
    V
    Else:
        Call super.injured() and return its result.

[recoverHP() called]
    |
    V
    Call PlayerService.gI().hoiPhuc(this, this.nPoint.hpMax, 0).
```

---

## Android19.java

The `Android19` class represents the Android 19 boss, featuring a unique damage absorption mechanic. It can absorb damage from specific player skills (Kamejoko, Masenko, Antomic), converting a portion of that damage into health recovery. The boss also has a time-based disappearance mechanism and can trigger its parent boss to change to PK (Player Kill) mode upon its disappearance.

### Mapping:

*   **Class:** `Android19`
    *   **Inherits from:** `Boss`
    *   **Fields:**
        *   `st`: `long` - Stores the system time when the boss joins the map, used for its time-based disappearance.
    *   **Constructor:** `Android19()`: Initializes the boss with `BossID.ANDROID_19` and data from `BossesData.ANDROID_19`.
    *   **Methods:**
        *   `reward(Player plKill)`:
            *   **Purpose:** Handles dropping items when Android 19 is killed and updates player tasks.
            *   **Logic:** Similar to other Android bosses, it randomly selects an item (currently hardcoded to index 2, which is `382`) and has a 15% chance to drop it. It also calls `TaskService.gI().checkDoneTaskKillBoss()` to update the killing player's tasks.
            *   **Dependencies:** `Util.isTrue`, `ItemMap`, `Service.getInstance().dropItemMap`, `TaskService.gI().checkDoneTaskKillBoss`.
        *   `active()`:
            *   **Purpose:** Defines the boss's active behavior.
            *   **Logic:** Calls the superclass's `active()` method. Additionally, if 1,500,000 milliseconds (25 minutes) have passed since `st` (when it joined the map), it changes its status to `BossStatus.LEAVE_MAP`.
            *   **Dependencies:** `super.active()`, `Util.canDoWithTime`, `BossStatus.LEAVE_MAP`.
        *   `joinMap()`:
            *   **Purpose:** Executed when the boss joins a map.
            *   **Logic:** Calls the superclass's `joinMap()` method and records the current system time in `st`.
            *   **Dependencies:** `super.joinMap()`, `System.currentTimeMillis()`.
        *   `injured(Player plAtt, double damage, boolean piercing, boolean isMobAttack)`:
            *   **Purpose:** Determines how Android 19 takes damage, including its absorption mechanic.
            *   **Logic:** If the attacking player (`plAtt`) is not null, it checks the ID of the player's currently selected skill:
                *   If the skill is `Skill.KAMEJOKO`, `Skill.MASENKO`, or `Skill.ANTOMIC`:
                    *   It calculates `hpHoi` (HP recovery) as 80% of the incoming `damage`.
                    *   It calls `PlayerService.gI().hoiPhuc()` to recover its own HP by `hpHoi`.
                    *   There's a 20% chance (`1` in `5`) for it to chat "Hấp thụ.. các ngươi nghĩ sao vậy?".
                    *   It returns 0, meaning it takes no damage from these specific skills.
                *   For any other skill, or if `plAtt` is null, it calls the superclass's `injured` method.
            *   **Dependencies:** `Skill.KAMEJOKO`, `Skill.MASENKO`, `Skill.ANTOMIC`, `Util.DoubleGioihan`, `PlayerService.gI().hoiPhuc`, `Util.isTrue`, `this.chat()`, `super.injured()`.
        *   `wakeupAnotherBossWhenDisappear()`:
            *   **Purpose:** Triggered when Android 19 disappears (e.g., due to time limit).
            *   **Logic:** If it has a `parentBoss`, it changes the `parentBoss` to PK mode.
            *   **Dependencies:** `parentBoss`, `parentBoss.changeToTypePK()`.

*   **Dependencies (Classes/Enums):**
    *   `ConstPlayer`: Constants related to players (though not directly used in this file, it's imported).
    *   `Boss`: Base class for bosses.
    *   `BossID`: Enum for boss identifiers.
    *   `BossStatus`: Enum for boss statuses.
    *   `BossesData`: Contains data for various bosses.
    *   `ItemMap`: Represents an item on the map.
    *   `Player`: Represents a player character.
    *   `Skill`: Contains skill IDs.
    *   `PlayerService`: Service for player-related actions (e.g., healing).
    *   `Service`: Provides game services (e.g., dropping items).
    *   `TaskService`: Service for managing player tasks.
    *   `Util`: Utility class for common functions (e.g., random chance, time checks, double limits).

### Flow Diagram (Text-based):

```
[Android19 Constructor]
    |
    V
    Initialize Boss with ANDROID_19 ID and data.

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
    If 1,500,000 milliseconds (25 minutes) have passed since st:
        |
        V
        Change status to BossStatus.LEAVE_MAP.

[Player Kills Android19] -> Calls reward(plKill)
    |
    V
    Check if random condition (15% chance) is met.
    |--- (True) ---|
    V              V
    Select item ID (currently 382).
    |
    V
    Create ItemMap object at boss's location.
    |
    V
    Drop item on map using Service.getInstance().dropItemMap.
    |--- (False) ---|
    V
    No item dropped.
    |
    V
    Call TaskService.gI().checkDoneTaskKillBoss(plKill, this).

[injured(plAtt, damage, piercing, isMobAttack) called]
    |
    V
    If plAtt is not null:
        |
        V
        Switch (plAtt.playerSkill.skillSelect.template.id):
            |
            V
            Case Skill.KAMEJOKO, Skill.MASENKO, Skill.ANTOMIC:
                |
                V
                Calculate hpHoi = damage * 80 / 100.
                Call PlayerService.gI().hoiPhuc(this, hpHoi, 0).
                |
                V
                If random condition (1 in 5) is true:
                    |
                    V
                    Chat "Hấp thụ.. các ngươi nghĩ sao vậy?".
                |
                V
                Return 0 (no damage taken).
            |
            V
            Default:
                |
                V
                Call super.injured() and return its result.
    |
    V
    Else (plAtt is null):
        |
        V
        Call super.injured() and return its result.

[wakeupAnotherBossWhenDisappear() called]
    |
    V
    If parentBoss is not null:
        |
        V
        Call parentBoss.changeToTypePK().
```

---

## DrKore.java

The `DrKore` class represents Dr. Gero (referred to as Dr. Kore), a boss character with a damage absorption mechanic similar to Android 19. He can absorb damage from specific player skills, converting it into health recovery. Dr. Kore also has a time-based disappearance and can interact with Android 19, commanding it to absorb energy. Additionally, he has a unique chat message when he changes to PK (Player Kill) mode.

### Mapping:

*   **Class:** `DrKore`
    *   **Inherits from:** `Boss`
    *   **Fields:**
        *   `st`: `long` - Stores the system time when the boss joins the map, used for its time-based disappearance.
    *   **Constructor:** `DrKore()`: Initializes the boss with `BossID.DR_KORE` and data from `BossesData.DR_KORE`.
    *   **Methods:**
        *   `reward(Player plKill)`:
            *   **Purpose:** Handles dropping items when Dr. Kore is killed and updates player tasks.
            *   **Logic:** Similar to other Android bosses, it randomly selects an item (currently hardcoded to index 2, which is `382`) and has a 15% chance to drop it. It also calls `TaskService.gI().checkDoneTaskKillBoss()` to update the killing player's tasks.
            *   **Dependencies:** `Util.isTrue`, `ItemMap`, `Service.getInstance().dropItemMap`, `TaskService.gI().checkDoneTaskKillBoss`.
        *   `chatM()`:
            *   **Purpose:** Defines Dr. Kore's mid-battle chat behavior.
            *   **Logic:** Has a high chance (60/61) to call `super.chatM()`. Otherwise, if part of a boss group and Android 19 is alive, Dr. Kore chats "Hút năng lượng của nó, mau lên" (Absorb its energy, quickly) and Android 19 replies "Tuân lệnh đại ca, hê hê hê" (Understood, big brother, hehehe).
            *   **Dependencies:** `Util.isTrue`, `super.chatM()`, `bossAppearTogether`, `BossID.ANDROID_19`, `boss.isDie()`, `this.chat()`, `boss.chat()`.
        *   `active()`:
            *   **Purpose:** Defines the boss's active behavior.
            *   **Logic:** Calls the superclass's `active()` method. Additionally, if 1,500,000 milliseconds (25 minutes) have passed since `st` (when it joined the map), it changes its status to `BossStatus.LEAVE_MAP`.
            *   **Dependencies:** `super.active()`, `Util.canDoWithTime`, `BossStatus.LEAVE_MAP`.
        *   `joinMap()`:
            *   **Purpose:** Executed when the boss joins a map.
            *   **Logic:** Calls the superclass's `joinMap()` method and records the current system time in `st`.
            *   **Dependencies:** `super.joinMap()`, `System.currentTimeMillis()`.
        *   `injured(Player plAtt, double damage, boolean piercing, boolean isMobAttack)`:
            *   **Purpose:** Determines how Dr. Kore takes damage, including his absorption mechanic.
            *   **Logic:** If the attacking player (`plAtt`) is not null, it checks the ID of the player's currently selected skill:
                *   If the skill is `Skill.KAMEJOKO`, `Skill.MASENKO`, or `Skill.ANTOMIC`:
                    *   It calls `PlayerService.gI().hoiPhuc()` to recover its own HP by the full `damage` amount.
                    *   There's a 20% chance (`1` in `5`) for it to chat "Hấp thụ.. các ngươi nghĩ sao vậy?".
                    *   It returns 0, meaning it takes no damage from these specific skills.
                *   For any other skill, or if `plAtt` is null, it calls the superclass's `injured` method.
            *   **Dependencies:** `Skill.KAMEJOKO`, `Skill.MASENKO`, `Skill.ANTOMIC`, `PlayerService.gI().hoiPhuc`, `Util.DoubleGioihan`, `Util.isTrue`, `this.chat()`, `super.injured()`.
        *   `doneChatS()`:
            *   **Purpose:** Executed after a specific chat sequence.
            *   **Logic:** If Android 19 is in the boss group, it changes Android 19 to PK mode.
            *   **Dependencies:** `bossAppearTogether`, `BossID.ANDROID_19`, `boss.changeToTypePK()`.
        *   `changeToTypePK()`:
            *   **Purpose:** Overrides the default behavior when changing to PK type.
            *   **Logic:** Calls the superclass's `changeToTypePK()` and then makes Dr. Kore chat "Mau đền mạng cho thằng em trai ta" (Go avenge my little brother).
            *   **Dependencies:** `super.changeToTypePK()`, `this.chat()`.

*   **Dependencies (Classes/Enums):**
    *   `ConstPlayer`: Constants related to players (though not directly used in this file, it's imported).
    *   `Boss`: Base class for bosses.
    *   `BossID`: Enum for boss identifiers.
    *   `BossStatus`: Enum for boss statuses.
    *   `BossesData`: Contains data for various bosses.
    *   `ItemMap`: Represents an item on the map.
    *   `Player`: Represents a player character.
    *   `Skill`: Contains skill IDs.
    *   `PlayerService`: Service for player-related actions (e.g., healing).
    *   `Service`: Provides game services (e.g., dropping items).
    *   `TaskService`: Service for managing player tasks.
    *   `Util`: Utility class for common functions (e.g., random chance, time checks, double limits).

### Flow Diagram (Text-based):

```
[DrKore Constructor]
    |
    V
    Initialize Boss with DR_KORE ID and data.

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
    If 1,500,000 milliseconds (25 minutes) have passed since st:
        |
        V
        Change status to BossStatus.LEAVE_MAP.

[Player Kills DrKore] -> Calls reward(plKill)
    |
    V
    Check if random condition (15% chance) is met.
    |--- (True) ---|
    V              V
    Select item ID (currently 382).
    |
    V
    Create ItemMap object at boss's location.
    |
    V
    Drop item on map using Service.getInstance().dropItemMap.
    |--- (False) ---|
    V
    No item dropped.
    |
    V
    Call TaskService.gI().checkDoneTaskKillBoss(plKill, this).

[chatM() called]
    |
    V
    If random condition (60 in 61) is true:
        |
        V
        Call super.chatM().
        Return.
    |
    V
    If bossAppearTogether is null or currentLevel group is null:
        |
        V
        Return.
    |
    V
    For each boss in bossAppearTogether[currentLevel]:
        |
        V
        If boss.id is ANDROID_19 AND boss is not dead:
            |
            V
            DrKore chats "Hút năng lượng của nó, mau lên".
            Android 19 chats "Tuân lệnh đại ca, hê hê hê".
            Break loop.

[injured(plAtt, damage, piercing, isMobAttack) called]
    |
    V
    If plAtt is not null:
        |
        V
        Switch (plAtt.playerSkill.skillSelect.template.id):
            |
            V
            Case Skill.KAMEJOKO, Skill.MASENKO, Skill.ANTOMIC:
                |
                V
                Call PlayerService.gI().hoiPhuc(this, damage, 0).
                |
                V
                If random condition (1 in 5) is true:
                    |
                    V
                    Chat "Hấp thụ.. các ngươi nghĩ sao vậy?".
                |
                V
                Return 0 (no damage taken).
            |
            V
            Default:
                |
                V
                Call super.injured() and return its result.
    |
    V
    Else (plAtt is null):
        |
        V
        Call super.injured() and return its result.

[doneChatS() called]
    |
    V
    For each boss in bossAppearTogether[currentLevel]:
        |
        V
        If boss.id is ANDROID_19:
            |
            V
            Call boss.changeToTypePK().
            Break loop.

[changeToTypePK() called]
    |
    V
    Call super.changeToTypePK().
    DrKore chats "Mau đền mạng cho thằng em trai ta".
```

---

## DrMyuu.java

The `DrMyuu` class is currently an empty placeholder. It does not contain any functional code, methods, or fields.

### Mapping:
*   **Class:** `DrMyuu`
    *   No inheritance.
    *   No fields.
    *   No methods.

### Flow Diagram (Text-based):
There is no functional flow to diagram for this empty class.

---

## KingKong.java

The `KingKong` class defines the behavior of the King Kong boss. It handles item drops upon defeat and has a time-based disappearance mechanism. The presence of commented-out code suggests a potential interaction with a "Poc" boss, where King Kong might trigger Poc to change to PK (Player Kill) mode.

### Mapping:

*   **Class:** `KingKong`
    *   **Inherits from:** `Boss`
    *   **Fields:**
        *   `st`: `long` - Stores the system time when the boss joins the map, used for its time-based disappearance.
    *   **Constructor:** `KingKong()`: Initializes the boss with `BossID.KING_KONG` and data from `BossesData.KING_KONG`.
    *   **Methods:**
        *   `reward(Player plKill)`:
            *   **Purpose:** Handles dropping items when King Kong is killed and updates player tasks.
            *   **Logic:** Similar to other bosses, it randomly selects an item (currently hardcoded to index 2, which is `382`) and has a 15% chance to drop it. It also calls `TaskService.gI().checkDoneTaskKillBoss()` to update the killing player's tasks.
            *   **Dependencies:** `Util.isTrue`, `ItemMap`, `Service.getInstance().dropItemMap`, `TaskService.gI().checkDoneTaskKillBoss`.
        *   `active()`:
            *   **Purpose:** Defines the boss's active behavior.
            *   **Logic:** Calls the superclass's `active()` method. Additionally, if 1,500,000 milliseconds (25 minutes) have passed since `st` (when it joined the map), it changes its status to `BossStatus.LEAVE_MAP`.
            *   **Dependencies:** `super.active()`, `Util.canDoWithTime`, `BossStatus.LEAVE_MAP`.
        *   `joinMap()`:
            *   **Purpose:** Executed when the boss joins a map.
            *   **Logic:** Calls the superclass's `joinMap()` method and records the current system time in `st`.
            *   **Dependencies:** `super.joinMap()`, `System.currentTimeMillis()`.
        *   **Commented-out `doneChatS()` method:** This method, if uncommented, would iterate through bosses in its `bossAppearTogether` group and, if it finds `BossID.POC` and Poc is not dead, it would change Poc to PK mode. This suggests a potential interaction with another boss.

*   **Dependencies (Classes/Enums):**
    *   `Boss`: Base class for bosses.
    *   `BossID`: Enum for boss identifiers.
    *   `BossStatus`: Enum for boss statuses.
    *   `BossesData`: Contains data for various bosses.
    *   `ItemMap`: Represents an item on the map.
    *   `Player`: Represents a player character.
    *   `Service`: Provides game services (e.g., dropping items).
    *   `TaskService`: Service for managing player tasks.
    *   `Util`: Utility class for common functions (e.g., random chance, time checks).

### Flow Diagram (Text-based):

```
[KingKong Constructor]
    |
    V
    Initialize Boss with KING_KONG ID and data.

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
    If 1,500,000 milliseconds (25 minutes) have passed since st:
        |
        V
        Change status to BossStatus.LEAVE_MAP.

[Player Kills KingKong] -> Calls reward(plKill)
    |
    V
    Check if random condition (15% chance) is met.
    |--- (True) ---|
    V              V
    Select item ID (currently 382).
    |
    V
    Create ItemMap object at boss's location.
    |
    V
    Drop item on map using Service.getInstance().dropItemMap.
    |--- (False) ---|
    V
    No item dropped.
    |
    V
    Call TaskService.gI().checkDoneTaskKillBoss(plKill, this).

[doneChatS() - Commented Out]
    |
    V
    If bossAppearTogether is not null and currentLevel group is not null:
        |
        V
        For each boss in bossAppearTogether[currentLevel]:
            |
            V
            If boss.id is POC AND boss is not dead:
                |
                V
                Call boss.changeToTypePK().
                Break loop.
```

---

## Pic.java

The `Pic` class represents the boss "Pic" (likely Piccolo). It defines its reward behavior upon defeat, a time-based disappearance mechanism, and a specific interaction with a "Poc" boss. When a certain chat event (`doneChatE()`) occurs, Pic can trigger Poc to change to PK (Player Kill) mode if Poc is alive and part of the same boss group.

### Mapping:

*   **Class:** `Pic`
    *   **Inherits from:** `Boss`
    *   **Fields:**
        *   `st`: `long` - Stores the system time when the boss joins the map, used for its time-based disappearance.
    *   **Constructor:** `Pic()`: Initializes the boss with `BossID.PIC` and data from `BossesData.PIC`.
    *   **Methods:**
        *   `reward(Player plKill)`:
            *   **Purpose:** Handles dropping items when Pic is killed and updates player tasks.
            *   **Logic:** Similar to other bosses, it randomly selects an item (currently hardcoded to index 2, which is `382`) and has a 15% chance to drop it. It also calls `TaskService.gI().checkDoneTaskKillBoss()` to update the killing player's tasks.
            *   **Dependencies:** `Util.isTrue`, `ItemMap`, `Service.getInstance().dropItemMap`, `TaskService.gI().checkDoneTaskKillBoss`.
        *   `doneChatE()`:
            *   **Purpose:** Executed after a specific chat event (likely "end chat" or a phase transition).
            *   **Logic:** If Pic has a `parentBoss` and a `bossAppearTogether` group, it iterates through the bosses in that group. If it finds `BossID.POC` and Poc is not dead, it changes Poc to PK mode.
            *   **Dependencies:** `parentBoss`, `bossAppearTogether`, `BossID.POC`, `boss.isDie()`, `boss.changeToTypePK()`.
        *   `active()`:
            *   **Purpose:** Defines the boss's active behavior.
            *   **Logic:** Calls the superclass's `active()` method. Additionally, if 1,500,000 milliseconds (25 minutes) have passed since `st` (when it joined the map), it changes its status to `BossStatus.LEAVE_MAP`.
            *   **Dependencies:** `super.active()`, `Util.canDoWithTime`, `BossStatus.LEAVE_MAP`.
        *   `joinMap()`:
            *   **Purpose:** Executed when the boss joins a map.
            *   **Logic:** Calls the superclass's `joinMap()` method and records the current system time in `st`.
            *   **Dependencies:** `super.joinMap()`, `System.currentTimeMillis()`.

*   **Dependencies (Classes/Enums):**
    *   `Boss`: Base class for bosses.
    *   `BossID`: Enum for boss identifiers.
    *   `BossStatus`: Enum for boss statuses.
    *   `BossesData`: Contains data for various bosses.
    *   `ItemMap`: Represents an item on the map.
    *   `Player`: Represents a player character.
    *   `Service`: Provides game services (e.g., dropping items).
    *   `TaskService`: Service for managing player tasks.
    *   `Util`: Utility class for common functions (e.g., random chance, time checks).

### Flow Diagram (Text-based):

```
[Pic Constructor]
    |
    V
    Initialize Boss with PIC ID and data.

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
    If 1,500,000 milliseconds (25 minutes) have passed since st:
        |
        V
        Change status to BossStatus.LEAVE_MAP.

[Player Kills Pic] -> Calls reward(plKill)
    |
    V
    Check if random condition (15% chance) is met.
    |--- (True) ---|
    V              V
    Select item ID (currently 382).
    |
    V
    Create ItemMap object at boss's location.
    |
    V
    Drop item on map using Service.getInstance().dropItemMap.
    |--- (False) ---|
    V
    No item dropped.
    |
    V
    Call TaskService.gI().checkDoneTaskKillBoss(plKill, this).

[doneChatE() called]
    |
    V
    If parentBoss is null OR parentBoss.bossAppearTogether is null OR parentBoss.bossAppearTogether[currentLevel] is null:
        |
        V
        Return.
    |
    V
    For each boss in parentBoss.bossAppearTogether[currentLevel]:
        |
        V
        If boss.id is POC AND boss is not dead:
            |
            V
            Call boss.changeToTypePK().
            Break loop.
```

---

## Poc.java

The `Poc` class represents the boss "Poc". It defines its reward behavior upon defeat, a time-based disappearance mechanism, and a specific interaction with its `parentBoss`. When Poc disappears, it can trigger its `parentBoss` to change to PK (Player Kill) mode, provided the `parentBoss` is not already dead.

### Mapping:

*   **Class:** `Poc`
    *   **Inherits from:** `Boss`
    *   **Fields:**
        *   `st`: `long` - Stores the system time when the boss joins the map, used for its time-based disappearance.
    *   **Constructor:** `Poc()`: Initializes the boss with `BossID.POC` and data from `BossesData.POC`.
    *   **Methods:**
        *   `reward(Player plKill)`:
            *   **Purpose:** Handles dropping items when Poc is killed and updates player tasks.
            *   **Logic:** Similar to other bosses, it randomly selects an item (currently hardcoded to index 2, which is `382`) and has a 15% chance to drop it. It also calls `TaskService.gI().checkDoneTaskKillBoss()` to update the killing player's tasks.
            *   **Dependencies:** `Util.isTrue`, `ItemMap`, `Service.getInstance().dropItemMap`, `TaskService.gI().checkDoneTaskKillBoss`.
        *   `active()`:
            *   **Purpose:** Defines the boss's active behavior.
            *   **Logic:** Calls the superclass's `active()` method. Additionally, if 1,500,000 milliseconds (25 minutes) have passed since `st` (when it joined the map), it changes its status to `BossStatus.LEAVE_MAP`.
            *   **Dependencies:** `super.active()`, `Util.canDoWithTime`, `BossStatus.LEAVE_MAP`.
        *   `joinMap()`:
            *   **Purpose:** Executed when the boss joins a map.
            *   **Logic:** Calls the superclass's `joinMap()` method and records the current system time in `st`.
            *   **Dependencies:** `super.joinMap()`, `System.currentTimeMillis()`.
        *   `wakeupAnotherBossWhenDisappear()`:
            *   **Purpose:** Triggered when Poc disappears (e.g., due to time limit).
            *   **Logic:** If it has a `parentBoss` and the `parentBoss` is not dead, it changes the `parentBoss` to PK mode.
            *   **Dependencies:** `parentBoss`, `parentBoss.isDie()`, `parentBoss.changeToTypePK()`.

*   **Dependencies (Classes/Enums):**
    *   `ConstPlayer`: Constants related to players (though not directly used in this file, it's imported).
    *   `Boss`: Base class for bosses.
    *   `BossID`: Enum for boss identifiers.
    *   `BossStatus`: Enum for boss statuses.
    *   `BossesData`: Contains data for various bosses.
    *   `ItemMap`: Represents an item on the map.
    *   `Player`: Represents a player character.
    *   `Service`: Provides game services (e.g., dropping items).
    *   `TaskService`: Service for managing player tasks.
    *   `Util`: Utility class for common functions (e.g., random chance, time checks).

### Flow Diagram (Text-based):

```
[Poc Constructor]
    |
    V
    Initialize Boss with POC ID and data.

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
    If 1,500,000 milliseconds (25 minutes) have passed since st:
        |
        V
        Change status to BossStatus.LEAVE_MAP.

[Player Kills Poc] -> Calls reward(plKill)
    |
    V
    Check if random condition (15% chance) is met.
    |--- (True) ---|
    V              V
    Select item ID (currently 382).
    |
    V
    Create ItemMap object at boss's location.
    |
    V
    Drop item on map using Service.getInstance().dropItemMap.
    |--- (False) ---|
    V
    No item dropped.
    |
    V
    Call TaskService.gI().checkDoneTaskKillBoss(plKill, this).

[wakeupAnotherBossWhenDisappear() called]
    |
    V
    If parentBoss is not null AND parentBoss is not dead:
        |
        V
        Call parentBoss.changeToTypePK().
```

---

## SuperAndroid17.java

The `SuperAndroid17` class is entirely commented out, indicating it's currently inactive in the game. If active, it would represent the Super Android 17 boss, featuring a complex reward system, a time-based disappearance, and a custom `injured` method that incorporates dodge mechanics and a shield ability.

### Mapping (based on commented-out code):

*   **Class:** `SuperAndroid17`
    *   **Inherits from:** `Boss`
    *   **Fields:**
        *   `st`: `long` - Stores the system time when the boss joins the map, used for its time-based disappearance.
    *   **Constructor:** `SuperAndroid17()`: Initializes the boss with `BossID.SUPER_ANDROID_17` and data from `BossesData.SUPER_ANDROID_17`.
    *   **Methods:**
        *   `reward(Player plKill)`:
            *   **Purpose:** Handles rewards when Super Android 17 is killed.
            *   **Logic:** Awards achievement points, increments player event count, sends a notification. Drops items, including a chance for a specific item (561) or other random items from `itemDos` or `NRs` arrays. Also drops item 2030.
            *   **Dependencies:** `plKill.achievement.plusCount`, `plKill.inventory.event`, `Service.getInstance().sendThongBao`, `Util.isTrue`, `Util.ratiItem`, `ItemMap`, `Service.getInstance().dropItemMap`.
        *   `active()`:
            *   **Purpose:** Defines the boss's active behavior.
            *   **Logic:** Calls the superclass's `active()` method. If 1,000,000 milliseconds (approx. 16.6 minutes) have passed since `st`, it changes its status to `BossStatus.LEAVE_MAP`.
            *   **Dependencies:** `super.active()`, `Util.canDoWithTime`, `BossStatus.LEAVE_MAP`.
        *   `joinMap()`:
            *   **Purpose:** Executed when the boss joins a map.
            *   **Logic:** Calls the superclass's `joinMap()` method and records the current system time in `st`.
            *   **Dependencies:** `super.joinMap()`, `System.currentTimeMillis()`.
        *   `injured(Player plAtt, double damage, boolean piercing, boolean isMobAttack)`:
            *   **Purpose:** Determines how Super Android 17 takes damage, including dodge and shield mechanics.
            *   **Logic:**
                *   If not already dead:
                    *   If not `piercing` and a random check based on `tlNeDon` (dodge rate) and `tlchinhxac` (accuracy) is true, it chats "Xí hụt" (Missed) and returns 0 damage.
                    *   Calculates `damage` after applying defense (`this.nPoint.subDameInjureWithDeff`).
                    *   If not `piercing` and `effectSkill.isShielding` is true:
                        *   If `damage` is greater than `nPoint.hpMax`, it breaks the shield (`EffectSkillService.gI().breakShield`).
                        *   Sets `damage` to 1 (shield absorbs most damage).
                    *   Subtracts `damage` from its HP (`this.nPoint.subHP`).
                    *   If it dies, it calls `this.setDie(plAtt)` and `die(plAtt)`.
                    *   Returns the final `damage` taken.
                *   If already dead, returns 0.
            *   **Dependencies:** `this.isDie()`, `Util.isTrue`, `this.nPoint.tlNeDon`, `plAtt.nPoint.tlchinhxac`, `this.chat()`, `this.nPoint.subDameInjureWithDeff`, `effectSkill.isShielding`, `nPoint.hpMax`, `EffectSkillService.gI().breakShield`, `this.nPoint.subHP`, `this.setDie()`, `die()`.

### Flow Diagram (Text-based - based on commented-out code):

```
[SuperAndroid17 Constructor]
    |
    V
    Initialize Boss with SUPER_ANDROID_17 ID and data.

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
    If 1,000,000 milliseconds (approx. 16.6 minutes) have passed since st:
        |
        V
        Change status to BossStatus.LEAVE_MAP.

[Player Kills SuperAndroid17] -> Calls reward(plKill)
    |
    V
    Increment plKill.achievement count.
    Increment plKill.inventory.event.
    Send notification to plKill.
    |
    V
    Check if random condition (15 in 100) is met:
        |--- (True) ---|
        V
        Check if random condition (1 in 5) is met:
            |--- (True) ---|
            V
            Drop item 561.
            Return.
            |--- (False) ---|
            V
            Drop random item from itemDos array.
        |--- (False) ---|
        V
        Drop random item from NRs array.
    |
    V
    Drop item 2030.

[injured(plAtt, damage, piercing, isMobAttack) called]
    |
    V
    If boss is not dead:
        |
        V
        If not piercing AND random dodge check is true:
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
