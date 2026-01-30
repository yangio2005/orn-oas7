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
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import main.GameMidlet;
import main.GameCanvas;

final class m
implements CommandListener {
    private cd a;
    private final TextBox IActionListener;

    m(cd cd2, TextBox textBox) {
        this.a = cd2;
        this.b = textBox;
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (command.getLabel().equals(GameStrings.bs)) {
            this.a.a(this.b.getString());
        }
        BaseCanvas.a(GameMidlet.f);
        main.GameCanvas.h.setFullScreenMode(true);
        this.a.h = true;
    }
}

