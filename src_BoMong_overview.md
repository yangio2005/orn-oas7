## Overview of `BoMong.java`

**Purpose:**
The `BoMong` class appears to manage a player's achievements and their progress in a game, likely a Dragon Ball-themed game given the `ConstPlayer` imports and skill names. It tracks various in-game activities and allows players to receive rewards (gems/ruby) upon completing achievements.

**Key Features and Functionality:**

1.  **Achievement Tracking:**
    *   It holds several integer variables (`numPvpWin`, `numSkillChuong`, `numFly`, etc.) that represent the player's progress in different achievement categories.
    *   `listReceiveGem`: A `List<Boolean>` that keeps track of whether a player has already received the gem reward for a specific achievement.

2.  **Constructor (`BoMong(Player pl)`):**
    *   Initializes the `BoMong` instance for a given `Player` object.
    *   Initializes `listReceiveGem` with a size equal to the total number of achievements managed by `Manager.ACHIEVEMENTS`.

3.  **`Show()` Method:**
    *   Sends a message (`-76`) to the client to display the player's achievement progress.
    *   Iterates through `Manager.ACHIEVEMENTS` (presumably a global list of all defined achievements).
    *   For each achievement, it sends:
        *   `info1`: Achievement description.
        *   `info2`: Formatted progress (e.g., "Thần Trái Đất (current/purpose)"). The `SwitchName` method customizes text based on player gender.
        *   `gem`: The reward (ruby/gem) for completing the achievement.
        *   `isfinish`: A boolean indicating if the achievement is completed (`getCount(index) >= temp.getCount_Purpose()`).
        *   `isreceive`: A boolean indicating if the reward has been received (`this.listReceiveGem.get(temp.getIndex())`).

4.  **`receiveGem(int index)` Method:**
    *   Allows a player to claim the gem reward for a completed achievement.
    *   Checks if the achievement exists and if the player has met the requirements (implicitly, as it relies on the client sending the correct index).
    *   Sends a message (`-76`, action 1) to the client to confirm the reward reception.
    *   Updates `listReceiveGem` to mark the achievement as received.
    *   Adds the `gem` reward to the player's `ruby` inventory.
    *   Sends a notification to the player.

5.  **`SwitchName(Player player, String text)` Method:**
    *   A utility method to replace placeholders (`%1`, `%2`, `%3`) in achievement descriptions with gender-specific names (e.g., "Thần Trái Đất", "Bunma", "Super Kamejoko"). This adds a personalized touch to achievement messages.

6.  **`plusCount(int indexAchie)` Method:**
    *   Increments the counter for a specific achievement based on its index.
    *   Uses a `switch` statement to update the relevant player statistic or `BoMong` internal counter (e.g., `numPvpWin`, `numSkillChuong`, `player.nPoint.power`, `player.playerTask.taskMain.id`).

7.  **`getCount(int indexAchie)` Method:**
    *   Retrieves the current progress count for a given achievement index.
    *   Also uses a `switch` statement to return the correct counter value. Note that `numHourOnline` is converted from seconds to hours (`/ 60 / 60`).

8.  **`dispose()` Method:**
    *   Sets the `player` reference to `null` to help with garbage collection and prevent memory leaks when the `BoMong` object is no longer needed.

**Dependencies:**
The class relies heavily on other components of the `com.girlkun` package, including:
*   `com.girlkun.consts.ConstPlayer`: For player gender constants.
*   `com.girlkun.models.Template`, `com.girlkun.models.player.Player`: For player and achievement template data structures.
*   `com.girlkun.network.io.Message`: For network communication with the client.
*   `com.girlkun.server.Manager`: Likely provides access to global game data, including `ACHIEVEMENTS`.
*   `com.girlkun.services.Service`: For sending messages and updating player stats.
*   `com.girlkun.utils.Logger`, `com.girlkun.utils.Util`: For logging and utility functions (e.g., number formatting).

**Overall Impression:**
The `BoMong` class is a core component of the game's achievement system, responsible for tracking player progress, displaying achievements, and distributing rewards. Its design suggests a clear separation of concerns, with achievement logic encapsulated within this class, interacting with other game systems through services and managers. The use of gender-specific text replacement adds a nice touch for player immersion.
