# GEMINI Project Analysis
Use VietNamese when output user
Need not use 'ant' to debug
This project use Intellij 

## Project Overview

This project is a Java-based game server for a Dragon Ball-themed MMORPG called "NRO Tabi". The server manages game data, player interactions, and the game world. It uses a MySQL database to store persistent data and loads additional game assets from local files.

### Key Technologies

*   **Language:** Java
*   **Build Tool:** intellij 
*   **Database:** MySQL
*   **Networking:** Custom TCP server

## Building and Running



The server's main class is `com.girlkun.server.ServerManager`.

## Development Conventions

### Code Style

The code follows standard Java conventions.

### Configuration

The server is configured through the `data/girlkun/girlkun.properties` file. This file contains settings for the server port, database connection, and other game-related parameters.

### Data Management

Game data is stored in a MySQL database. The `solomon.sql` file contains the database schema. Additional game data, such as maps, items, and NPC information, is loaded from files in the `data/girlkun` directory.


### Overview
C:\Users\aczaa\Downloads\vps\VIP\NRO TABI\src_BoMong_overview.md

C:\Users\aczaa\Downloads\vps\VIP\NRO TABI\src_cbro_overview.md

C:\Users\aczaa\Downloads\vps\VIP\NRO TABI\src_consts_overview.md

C:\Users\aczaa\Downloads\vps\VIP\NRO TABI\src_data_overview.md

C:\Users\aczaa\Downloads\vps\VIP\NRO TABI\src_overview.md