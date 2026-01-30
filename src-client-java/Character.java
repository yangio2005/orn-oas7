/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public abstract class n {
    public Command IActionListener;
    public Command c;
    public Command d;

    public void a(MGraphics en2) {
        en2.a(-en2.a(), -en2.IActionListener());
        en2.e(0, 0, a.A, a.B);
        cx.a(en2, this.b, this.c, this.d);
    }

    public void a(int n2) {
        switch (n2) {
            case -38: 
            case -1: {
                GameCanvas.j[2] = true;
                GameCanvas.i[2] = true;
                return;
            }
            case -39: 
            case -2: {
                GameCanvas.j[8] = true;
                GameCanvas.i[8] = true;
                return;
            }
            case -21: 
            case -6: {
                GameCanvas.j[12] = true;
                GameCanvas.i[12] = true;
                return;
            }
            case -22: 
            case -7: {
                GameCanvas.j[13] = true;
                GameCanvas.i[13] = true;
                return;
            }
            case -5: 
            case 10: {
                GameCanvas.j[5] = true;
                GameCanvas.i[5] = true;
                return;
            }
            case -27: {
                return;
            }
        }
    }

    public void a() {
        if (this.c != null && (GameCanvas.i[5] || Screen.a(this.c))) {
            GameCanvas.i[5] = false;
            a.ResourceUtil = false;
            Screen.cs = -1;
            GameCanvas.m = false;
            if (this.c != null) {
                this.c.a();
            }
            Screen.cs = -1;
        }
        if (this.b != null && (GameCanvas.i[12] || Screen.a(this.b))) {
            GameCanvas.i[12] = false;
            a.ResourceUtil = false;
            Screen.cs = -1;
            GameCanvas.m = false;
            if (this.b != null) {
                this.b.a();
            }
            Screen.cs = -1;
        }
        if (this.d != null && (GameCanvas.i[13] || Screen.a(this.d))) {
            GameCanvas.i[13] = false;
            a.ResourceUtil = false;
            GameCanvas.m = false;
            Screen.cs = -1;
            if (this.d != null) {
                this.d.a();
            }
            Screen.cs = -1;
        }
        GameCanvas.f();
        a.UIPanel();
    }
}

