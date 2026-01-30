/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public final class UIGame
implements IActionListener {
    int a;
    private int GameScreen;
    int IActionListener;
    private int q;
    Command c;
    Command d;
    private int r = 24;
    public int e = 0;
    private int s = 50;
    public static dv f;
    public int UIPanel;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean ResourceUtil;
    public String m;
    private LoggingList t = new LoggingList("vItems");
    int n;
    int o;

    public final void a(boolean bl2) {
        GameWorld.e();
        this.k = true;
        this.l = false;
        dr dr2 = this;
        if (dr2.ResourceUtil) {
            dr2.IActionListener = 170;
            dr2.q = 118;
            dr2.a = main.GameCanvas.A / 2 - dr2.IActionListener / 2;
            dr2.GameScreen = main.GameCanvas.B / 2 - dr2.q / 2;
        } else {
            dr2.IActionListener = 170;
            dr2.q = 170;
            dr2.a = main.GameCanvas.A / 2 - dr2.IActionListener / 2;
            dr2.GameScreen = main.GameCanvas.B / 2 - dr2.q / 2;
            if (main.GameCanvas.B < 240) {
                dr2.GameScreen -= 10;
            }
        }
        dr2.h = dr2.a;
        dr2.UIPanel = 0;
        dr2.e = ak.f.size();
        if (main.GameCanvas.e) {
            dr2.c.j = dr2.a;
            dr2.c.k = dr2.GameScreen + dr2.q + 5;
            dr2.d.j = dr2.a + dr2.IActionListener - 68;
            dr2.d.k = dr2.GameScreen + dr2.q + 5;
        }
        f = new dv();
        f.a(dr2.e, dr2.r, dr2.a, dr2.GameScreen + dr2.s, dr2.IActionListener, dr2.q - dr2.s, true, 1);
    }

    private void a() {
        this.g = this.a + this.b;
    }

    public UIGame() {
        this.c = new Command(GameStrings.bw, this, 1, null);
        this.d = new Command(GameStrings.bj, this, 2, null);
    }

    public final void a(MGraphics en2) {
        en2.a(-this.h, 0);
        bo.a(en2, this.a, this.GameScreen - 17, this.b, this.q + 17, -1, true);
        mFont.f.a(en2, GameStrings.dz, this.a + this.b / 2, this.GameScreen - 7, 2);
        if (this.o >= 0 && this.o <= ak.f.size() - 1) {
            ak ak2 = (ak)ak.f.elementAt(this.o);
            if (ak2.c != null) {
                GameWorld.e().a(en2, ak2.c, main.GameCanvas.A / 2, this.GameScreen + 45, 1, false);
            }
        }
        GameWorld.e().a(en2, main.GameCanvas.A / 2, this.GameScreen + 45, 1, GameWorld.e().as, false);
        en2.e(this.a, this.GameScreen + this.s, this.b, this.q - this.s - 10);
        if (f != null) {
            en2.a(0, -dr.f.d);
        }
        int n2 = 0;
        while (n2 < this.e) {
            int n3 = this.a + 10;
            int n4 = this.GameScreen + n2 * this.r + this.s;
            if (n4 + this.r - (f != null ? dr.f.d : 0) >= this.GameScreen + this.s && n4 - (f != null ? dr.f.d : 0) <= this.GameScreen + this.s + this.q) {
                ak ak3 = (ak)ak.f.elementAt(n2);
                mFont di2 = mFont.o;
                if (n2 == this.o) {
                    di2 = mFont.q;
                }
                if (ak3.IActionListener != null) {
                    di2.a(en2, ak3.IActionListener, n3 + 20, n4, 0);
                }
                if (ak3.d > 0) {
                    di2.a(en2, String.valueOf(ak3.d) + " " + GameStrings.bD, n3 + this.b - 20, n4, 1);
                } else if (ak3.e > 0) {
                    di2.a(en2, String.valueOf(ak3.e) + " " + GameStrings.bE, n3 + this.b - 20, n4, 1);
                }
                if (ak3.c != null) {
                    bl.IActionListener(en2, ak3.c[0], n3, n4, 0, 0);
                }
            }
            ++n2;
        }
        en2.a(0, -en2.IActionListener());
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        cx.a(en2, this.c, null, this.d);
    }

    public final void a(int n2, Object object) {
        if (n2 == 2) {
            this.a();
        }
        if (n2 == 1 && !this.l && this.o >= 0) {
            this.a();
            if (GameWorld.e().ai == null) {
                GameService.a().a((byte)2, ((ak)ak.f.elementAt((int)this.o)).a, this.m);
                return;
            }
            GameService.a().a((byte)4, ((ak)ak.f.elementAt((int)this.o)).a, "");
        }
    }
}

