/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.TextBox
 */
import javax.microedition.lcdui.Command;
import main.GameMidlet;
import main.GameCanvas;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;

final class m
implements CommandListener {
    private cd LoginScreen;
    private final TextBox b;

    m(cd cd2, TextBox textBox) {
        this.LoginScreen = cd2;
        this.b = textBox;
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (command.getLabel().equals(T.ServerListScreen)) {
            this.LoginScreen.LoginScreen(this.b.getString());
        }
        BaseCanvas.LoginScreen(GameMidlet.f);
        GameCanvas.instance.setFullScreenMode(true);
        this.LoginScreen.Item = true;
    }
}

