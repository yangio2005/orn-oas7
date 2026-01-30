/*
 * Decompiled with CFR 0.152.
 */
import main.GameMidlet;

public final class a
extends Screen
implements IActionListener {
    public static a a;
    private cd IActionListener;
    private cd c;
    private int d;
    private int e;
    private int f = main.GameCanvas.A - 20;
    private int UIPanel;
    private String[] h;
    private int i;

    public a() {
        if (this.f > 320) {
            this.f = 320;
        }
        this.h = mFont.UIPanel.a(GameStrings.bc, this.f - 20);
        this.d = (main.GameCanvas.A - this.f) / 2;
        this.e = main.GameCanvas.B - 150 - (this.h.length - 1) * 20;
        this.g = 110 + (this.h.length - 1) * 20;
        this.b = new cd();
        this.b.i = GameStrings.ba;
        this.b.a = this.d + 10;
        this.b.IActionListener = this.e + 35 + (this.h.length - 1) * 20;
        this.b.c = this.f - 20;
        this.b.d = Screen.cp + 2;
        this.b.e = !main.GameCanvas.e;
        this.b.c(0);
        if (!main.GameCanvas.e) {
            this.co = this.b.j;
        }
        this.c = new cd();
        this.c.i = GameStrings.Screen;
        this.c.a = this.d + 10;
        this.c.IActionListener = this.b.IActionListener + 35;
        this.c.c = this.f - 20;
        this.c.d = Screen.cp + 2;
        this.c.e = false;
        this.c.c(0);
        this.cm = new Command(GameStrings.bj, this, 1, null);
        this.cn = new Command(GameStrings.IConnectionListener, this, 2, null);
        if (main.GameCanvas.e) {
            this.cn.j = main.GameCanvas.A / 2 + 18;
            this.cm.j = main.GameCanvas.A / 2 - 85;
            this.cn.k = this.cm.k = this.e + this.g + 5;
        }
    }

    public static a a() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public final void IActionListener() {
        this.i = 0;
        try {
            if (GameStrings.fB == 0) {
                GameMidlet.f.platformRequest("http://ngocrongonline.com/");
            }
            if (GameStrings.fB == 2) {
                GameMidlet.f.platformRequest("http://dragonball.indonaga.com/");
            }
            if (GameStrings.fB == 1) {
                GameMidlet.f.platformRequest("http://world.teamobi.com/games-page-0.html");
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    public final void a(MGraphics en2) {
        GameScreen.j().a(en2);
        bo.a(en2, this.d, this.e, this.f, this.g, -1, true);
        int n2 = 0;
        while (n2 < this.h.length) {
            mFont.UIPanel.a(en2, this.h[n2], main.GameCanvas.A / 2, this.e + 15 + n2 * 20, 2);
            ++n2;
        }
        this.b.a(en2);
        this.c.a(en2);
        super.a(en2);
    }

    public final void c() {
        GameScreen.j().c();
        this.b.c();
        this.c.c();
    }

    public final void a(int n2) {
        if (this.b.e) {
            this.b.a(n2);
        } else if (this.c.e) {
            this.c.a(n2);
        }
        super.a(n2);
    }

    public final void d() {
        if (main.GameCanvas.i[2]) {
            --this.i;
            if (this.i < 0) {
                this.i = 1;
            }
        } else if (main.GameCanvas.i[8]) {
            ++this.i;
            if (this.i > 1) {
                this.i = 1;
            }
        }
        if (main.GameCanvas.i[2] || main.GameCanvas.i[8]) {
            main.GameCanvas.f();
            if (this.i == 1) {
                this.b.e = false;
                this.c.e = true;
                if (!main.GameCanvas.e) {
                    this.co = this.c.j;
                }
            } else if (this.i == 0) {
                this.b.e = true;
                this.c.e = false;
                if (!main.GameCanvas.e) {
                    this.co = this.b.j;
                }
            } else {
                this.b.e = false;
                this.c.e = false;
            }
        }
        if (main.GameCanvas.m) {
            if (main.GameCanvas.a(this.b.a, this.b.IActionListener, this.b.c, this.b.d)) {
                this.i = 0;
            } else if (main.GameCanvas.a(this.c.a, this.c.IActionListener, this.c.c, this.c.d)) {
                this.i = 1;
            }
        }
        super.d();
        main.GameCanvas.f();
    }

    public final void a(int n2, Object object) {
        if (n2 == 1) {
            GameScreen.c.IActionListener();
            a = null;
        }
        if (n2 == 2) {
            if (this.b.d() == null || this.b.d().equals("")) {
                main.GameCanvas.a(GameStrings.be);
                return;
            }
            if (this.c.d() == null || this.c.d().equals("")) {
                main.GameCanvas.a(GameStrings.bf);
                return;
            }
            GameService.a().a(this.b.d(), this.c.d());
            GameScreen.c.IActionListener();
            a = null;
        }
    }
}

