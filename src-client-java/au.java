/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameCanvas;

public final class au
extends Screen
implements IActionListener {
    private static au f;
    private static Image UIPanel;
    private static Image h;
    public byte a;
    private int i = 5;
    private int[] j = new int[this.o];
    private int[] k = new int[this.o];
    private int[] ResourceUtil;
    private int[] m;
    private int n;
    private int o = 20;
    public short IActionListener;
    public short c;
    public long d;
    public long e;
    private boolean GameScreen;
    private boolean q;
    private int r;

    static {
        UIPanel = ResourceUtil.IActionListener("/mainImage/myTexture2dfutherShip.png");
        h = ResourceUtil.IActionListener("/mainImage/taungam.png");
    }

    public au() {
        int n2 = 0;
        while (n2 < this.o) {
            this.j[n2] = MathUtil.IActionListener(0, main.GameCanvas.A);
            this.k[n2] = n2 * (main.GameCanvas.B / this.o);
            ++n2;
        }
        this.l = new int[this.o];
        this.m = new int[this.o];
        n2 = 0;
        while (n2 < this.o) {
            this.l[n2] = MathUtil.IActionListener(0, main.GameCanvas.A);
            this.m[n2] = n2 * (main.GameCanvas.B / this.o);
            ++n2;
        }
    }

    public static au a() {
        if (f == null) {
            f = new au();
        }
        return f;
    }

    public final void IActionListener() {
        this.GameScreen = false;
        this.q = false;
        this.cn = GameWorld.e().Y() > 0 && this.a == 0 ? new Command(GameStrings.ga, this, 1, null) : null;
        this.r = 0;
        super.IActionListener();
    }

    public final void a(MGraphics en2) {
        en2.a(this.a == 0 ? 0 : 3056895);
        en2.d(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        int n2 = 0;
        while (n2 < this.o) {
            en2.a(this.a == 0 ? 0xE1DEDE : 11140863);
            en2.d(this.j[n2], this.k[n2], 10, 2);
            ++n2;
        }
        if (this.a == 0) {
            en2.a(UIPanel, 0, 0, 72, 95, 7, this.n + this.r, main.GameCanvas.B / 2, 3);
        }
        if (this.a == 1) {
            en2.a(h, 0, 0, 144, 79, 2, this.n + this.r, main.GameCanvas.B / 2, 3);
        }
        n2 = 0;
        while (n2 < this.o) {
            en2.a(this.a == 0 ? 0xE3E3E3 : 7536127);
            en2.d(this.l[n2], this.m[n2], 18, 3);
            ++n2;
        }
        super.a(en2);
    }

    public final void c() {
        if (this.a == 0) {
            if (!this.GameScreen) {
                this.r = main.GameCanvas.A / 2 * this.b / this.c;
            }
        } else {
            this.r += 2;
        }
        MessageHandler.IActionListener = false;
        this.n = (((main.GameCanvas.A / 2 + this.n) / 2 + this.n) / 2 + this.n) / 2;
        if (this.a == 1) {
            this.n = 0;
        }
        int n2 = 0;
        while (n2 < this.o) {
            int n3 = n2;
            this.j[n3] = this.j[n3] - this.i / 2;
            if (this.j[n2] < -20) {
                this.j[n2] = main.GameCanvas.A;
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < this.o) {
            int n4 = n2;
            this.l[n4] = this.l[n4] - this.i;
            if (this.l[n2] < -20) {
                this.l[n2] = main.GameCanvas.A;
            }
            ++n2;
        }
        if (main.GameCanvas.w % 3 == 0) {
            this.i += this.GameScreen ? 2 : 1;
        }
        if (this.i > (this.GameScreen ? 80 : 25)) {
            this.i = this.GameScreen ? 80 : 25;
        }
        this.e = System.currentTimeMillis();
        if (this.e - this.d >= 1000L) {
            this.b = (short)(this.b + 1);
            this.d = this.e;
        }
        if (this.GameScreen) {
            this.r += 3;
        }
        if (this.r >= main.GameCanvas.A / 2 + 30 && !this.q) {
            this.q = true;
            GameService.a().u();
        }
        super.c();
    }

    public final void d() {
        super.d();
    }

    public final void a(int n2, Object object) {
        if (n2 == 1) {
            main.GameCanvas.a(GameStrings.gb, new Command(GameStrings.bn, this, 2, null), new Command(GameStrings.bo, this, 3, null));
        }
        if (n2 == 2 && GameWorld.e().Y() > 0) {
            this.GameScreen = true;
            main.GameCanvas.h();
            this.cn = null;
        }
        if (n2 == 3) {
            main.GameCanvas.h();
        }
    }
}

