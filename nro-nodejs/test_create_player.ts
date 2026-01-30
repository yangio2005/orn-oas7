import { DB } from "./src/config/database";
import { PlayerDAO } from "./src/services/PlayerDAO";
import { Logger } from "./src/utils/Logger";
import * as dotenv from "dotenv";

dotenv.config();

async function test() {
    try {
        await DB.connect();
        const player = await PlayerDAO.createNewPlayer(999, "testplayer_" + Date.now(), 0, 102);
        if (player) {
            console.log("SUCCESS: Created player", player.name);
        } else {
            console.log("FAILED: Could not create player");
        }
    } catch (e) {
        console.error("ERROR:", e);
    } finally {
        process.exit();
    }
}

test();
