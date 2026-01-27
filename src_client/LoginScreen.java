import main.GameCanvas;
import main.GameMidlet;
/*
 * Decompiled with CFR 0.152.
 */

public final class GameCanvas
extends Screen
implements b {
    public static GameCanvas LoginScreen;
    private cd b;
    private cd c;
    private int d;
    private int e;
    private int f = GameCanvas.A - 20;
    private int g;
    private String[] Item;
    private int i;

    public LoginScreen() {
        if (this.f > 320) {
            this.f = 320;
        }
        this.Item = mFont.g.LoginScreen(T.bc, this.f - 20);
        this.d = (GameCanvas.A - this.f) / 2;
        this.e = GameCanvas.B - 150 - (this.Item.length - 1) * 20;
        this.g = 110 + (this.Item.length - 1) * 20;
        this.b = new cd();
        this.b.i = T.ba;
        this.b.LoginScreen = this.d + 10;
        this.b.b = this.e + 35 + (this.Item.length - 1) * 20;
        this.b.c = this.f - 20;
        this.b.d = Screen.cp + 2;
        this.b.e = !GameCanvas.e;
        this.b.c(0);
        if (!GameCanvas.e) {
            this.co = this.b.j;
        }
        this.c = new cd();
        this.c.i = T.Screen;
        this.c.LoginScreen = this.d + 10;
        this.c.b = this.b.b + 35;
        this.c.c = this.f - 20;
        this.c.d = Screen.cp + 2;
        this.c.e = false;
        this.c.c(0);
        this.cm = new de(T.bj, this, 1, null);
        this.cn = new de(T.bd, this, 2, null);
        if (GameCanvas.e) {
            this.cn.j = GameCanvas.A / 2 + 18;
            this.cm.j = GameCanvas.A / 2 - 85;
            this.cn.k = this.cm.k = this.e + this.g + 5;
        }
    }

    public static GameCanvas LoginScreen() {
        if (LoginScreen == null) {
            LoginScreen = new GameCanvas();
        }
        return LoginScreen;
    }

    public final void b() {
        this.i = 0;
        try {
            if (T.fB == 0) {
                GameMidlet.f.platformRequest("http://ngocrongonline.com/");
            }
            if (T.fB == 2) {
                GameMidlet.f.platformRequest("http://dragonball.indonaga.com/");
            }
            if (T.fB == 1) {
                GameMidlet.f.platformRequest("http://world.teamobi.com/games-page-0.html");
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    public final void methodLoginScreen(mGraphics en2) {
        GameScreen.j().LoginScreen(en2);
        bo.LoginScreen(en2, this.d, this.e, this.f, this.g, -1, true);
        int n2 = 0;
        while (n2 < this.Item.length) {
            mFont.g.LoginScreen(en2, this.Item[n2], GameCanvas.A / 2, this.e + 15 + n2 * 20, 2);
            ++n2;
        }
        this.b.LoginScreen(en2);
        this.c.LoginScreen(en2);
        super.LoginScreen(en2);
    }

    public final void c() {
        GameScreen.j().c();
        this.b.c();
        this.c.c();
    }

    public final void methodLoginScreen(int n2) {
        if (this.b.e) {
            this.b.LoginScreen(n2);
        } else if (this.c.e) {
            this.c.LoginScreen(n2);
        }
        super.LoginScreen(n2);
    }

    public final void d() {
        if (GameCanvas.i[2]) {
            --this.i;
            if (this.i < 0) {
                this.i = 1;
            }
        } else if (GameCanvas.i[8]) {
            ++this.i;
            if (this.i > 1) {
                this.i = 1;
            }
        }
        if (GameCanvas.i[2] || GameCanvas.i[8]) {
            GameCanvas.clearKeyHold();
            if (this.i == 1) {
                this.b.e = false;
                this.c.e = true;
                if (!GameCanvas.e) {
                    this.co = this.c.j;
                }
            } else if (this.i == 0) {
                this.b.e = true;
                this.c.e = false;
                if (!GameCanvas.e) {
                    this.co = this.b.j;
                }
            } else {
                this.b.e = false;
                this.c.e = false;
            }
        }
        if (GameCanvas.m) {
            if (GameCanvas.isLowGraphic(this.b.LoginScreen, this.b.b, this.b.c, this.b.d)) {
                this.i = 0;
            } else if (GameCanvas.isLowGraphic(this.c.LoginScreen, this.c.b, this.c.c, this.c.d)) {
                this.i = 1;
            }
        }
        super.d();
        GameCanvas.clearKeyHold();
    }

    public final void methodLoginScreen(int n2, Object object) {
        if (n2 == 1) {
            GameScreen.c.b();
            LoginScreen = null;
        }
        if (n2 == 2) {
            if (this.b.d() == null || this.b.d().equals("")) {
                GameCanvas.isLowGraphic(T.be);
                return;
            }
            if (this.c.d() == null || this.c.d().equals("")) {
                GameCanvas.isLowGraphic(T.bf);
                return;
            }
            GameService.LoginScreen().LoginScreen(this.b.d(), this.c.d());
            GameScreen.c.b();
            LoginScreen = null;
        }
    }
}

