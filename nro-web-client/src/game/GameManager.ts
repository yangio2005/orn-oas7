import { NetworkClient } from '../network/NetworkClient';
import { Message } from '../network/Message';

export class GameManager {
    private static instance: GameManager;

    public static getInstance(): GameManager {
        if (!this.instance) {
            this.instance = new GameManager();
        }
        return this.instance;
    }

    public connect(host: string, port: number): void {
        NetworkClient.getInstance().connect(`ws://${host}:${port}`);
    }

    public login(username: string, pass: string): void {
        const msg = new Message(-29); // NOT_LOGIN
        msg.writer.writeByte(0); // LOGIN
        msg.writer.writeUTF(username);
        msg.writer.writeUTF(pass);
        msg.writer.writeUTF("1.0.0");
        msg.writer.writeUTF("1");
        NetworkClient.getInstance().sendMessage(msg);
    }

    public createCharacter(name: string, gender: number, hair: number): void {
        const msg = new Message(-28); // NOT_MAP
        msg.writer.writeByte(2); // CREATE_CHAR (Sub-command of NOT_MAP in Server logic? Wait)
        // Check Controller.ts: case Cmd.NOT_MAP (-28) -> case 2 (CREATE_CHAR)
        // Yes, it's NOT_MAP (-28) with sub-command 2.

        msg.writer.writeUTF(name);
        msg.writer.writeByte(gender);
        msg.writer.writeByte(hair);
        NetworkClient.getInstance().sendMessage(msg);
    }
}
