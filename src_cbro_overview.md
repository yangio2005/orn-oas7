## Overview of `cbro` directory

The `cbro` package currently contains two Java files: `CBRO.java` and `ReadPart.java`.

### 1. `CBRO.java`

*   **Purpose:** This class appears to be the main entry point for the application, as indicated by the `public static void main(String[] args)` method.
*   **Current State:** As of now, the `main` method is empty, containing only a `// TODO code application logic here` comment. This suggests that the core application logic is either not yet implemented in this class or is intended to be added later. It serves as a placeholder for the application's startup and main execution flow.

### 2. `ReadPart.java`

*   **Purpose:** This class is a utility program designed to read binary "part" data from a specified file, convert it into a structured format (JSON), and then generate SQL statements to insert this data into a database. It seems to be a tool for populating a game database with character or item "part" information.

*   **Key Features and Functionality:**
    *   **`main(String[] args)`:** The entry point for this utility. It orchestrates the process:
        1.  Calls `readParts()` to read data from a binary file (`NR_part`).
        2.  Calls `createSql()` to generate SQL `INSERT` statements from the read data.
        3.  Calls `writeSqlToFile()` to save the generated SQL to a file (`part.sql`).
        4.  Prints "Done!" to the console upon completion.
    *   **`readParts(String filePath)`:**
        *   Reads a binary file using `DataInputStream`.
        *   The file format seems to be: a short integer indicating the number of parts, followed by data for each part.
        *   Each part has a `type` (byte) which determines how many sub-elements (`n`) it contains. The `n` value varies based on `type` (0, 1, 2, 3).
        *   For each sub-element, it reads a short and two bytes, which are then stored as a `JSONArray` (`pi`).
        *   It creates `Part` objects (an inner static class) and adds them to a `List<Part>`.
        *   Includes `System.out.println` statements for debugging, showing the ID, type, and JSON string of each part.
    *   **`createSql(List<Part> parts)`:**
        *   Generates SQL DDL (Data Definition Language) for creating a `part` table (if it doesn't exist) with columns `id`, `type`, and `DATA` (JSON type).
        *   Generates SQL DML (Data Manipulation Language) `INSERT` statements for each `Part` object, inserting its `id`, `type`, and the JSON `DATA` into the `part` table.
    *   **`writeSqlToFile(String sql, String filePath)`:**
        *   Writes the generated SQL string to a specified file using `BufferedWriter` and `OutputStreamWriter` with UTF-8 encoding.
    *   **`Part` (Inner Static Class):**
        *   A simple data structure to hold the `id`, `type`, and `JSONArray` (`pi`) for each part read from the binary file. It has a constructor and getter methods.

*   **Dependencies:**
    *   `org.json.simple.JSONArray`: Used for handling JSON data.
    *   Standard Java I/O classes (`FileInputStream`, `DataInputStream`, `FileOutputStream`, `OutputStreamWriter`, `BufferedWriter`, `Writer`).
    *   `java.util.ArrayList`, `java.util.List`.

*   **Hardcoded Paths:**
    *   Notice the hardcoded file paths: `C:\Users\Administrator\Desktop\NR_part` and `C:\Users\Administrator\Desktop\JsonSql\part.sql`. This indicates it's a utility meant to be run locally, possibly for development or data preparation, rather than a dynamic part of the main game server.

**Overall Impression of `cbro` directory:**

The `cbro` package currently contains a placeholder main application class (`CBRO.java`) and a specialized utility (`ReadPart.java`). This suggests that `ReadPart.java` is a separate tool used to prepare data for the game, which would then be consumed by the main game server application (whose logic would eventually reside in `CBRO.java` or other classes within the `com.girlkun` package). The `ReadPart` utility is crucial for converting raw binary game asset data into a database-friendly SQL format, likely for persistent storage and retrieval by the game server.
