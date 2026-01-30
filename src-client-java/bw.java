/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public final class bw
implements IActionListener {
    public short a;
    public short IActionListener;
    public short c;
    public short d;
    public boolean e;
    public boolean f;
    public bo UIPanel;

    public bw(short s2, short s3, short s4, short s5, boolean bl2, boolean bl3, String string) {
        this.a = s2;
        this.b = s3;
        this.c = s4;
        this.d = s5;
        string = MathUtil.a(string);
        this.e = bl2;
        this.f = bl3;
        if ((bv.ResourceUtil == 21 || bv.ResourceUtil == 22 || bv.ResourceUtil == 23) && this.a >= 0 && this.a <= 24) {
            return;
        }
        if ((bv.ResourceUtil == 0 && GameWorld.e().K != 0 || bv.ResourceUtil == 7 && GameWorld.e().K != 1 || bv.ResourceUtil == 14 && GameWorld.e().K != 2) && bl3) {
            return;
        }
        if (bv.f() || bv.ResourceUtil == 47) {
            if (s3 > 150 && bv.f()) {
                return;
            }
            this.g = new bo(string, s2 + (s4 - s2) / 2, s5 - (s2 > 100 ? 24 : 48));
            this.g.i = new Command(null, this, 1, this);
            this.g.h = true;
            this.g.j = false;
            bo.a(this.g);
            bv.t.addElement(this);
            return;
        }
        if (!bl2 && !bl3) {
            this.g = new bo(string, s2, s3 - 24);
            this.g.i = new Command(null, this, 1, this);
            this.g.h = true;
            this.g.j = false;
            bo.a(this.g);
        } else {
            if (bv.IActionListener()) {
                this.g = new bo(string, s2, s3 - 16);
            } else {
                s2 = (short)(s2 + (s4 - s2) / 2);
                this.g = new bo(string, s2, s3 - (s3 != 0 ? 16 : -32));
            }
            this.g.i = new Command(null, this, 2, this);
            this.g.h = true;
            this.g.j = false;
            bo.a(this.g);
        }
        bv.t.addElement(this);
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 1: {
                n2 = (this.a + this.c) / 2;
                int n3 = this.d;
                if (this.d > this.b + 24) {
                    n3 = (this.b + this.d) / 2;
                }
                GameScreen.j().aX = 0;
                GameWorld.e().bP = new Menu(n2, n3);
                GameWorld.e().I = GameWorld.e().B - GameWorld.e().bP.a > 0 ? -1 : 1;
                GameService.a().UIPanel();
                return;
            }
            case 2: {
                GameScreen.j().aX = 0;
                if (GameWorld.e().i() != null) {
                    GameService.a().UIPanel();
                    bp.a();
                    GameService.a().q();
                    GameWorld.bG = true;
                    return;
                }
                if (GameWorld.e().j() != null) {
                    GameService.a().UIPanel();
                    GameService.a().f();
                    GameWorld.bH = true;
                    GameWorld.bG = true;
                    main.GameCanvas.UIPanel();
                    main.GameCanvas.f();
                    bp.a();
                    return;
                }
                n2 = (this.a + this.c) / 2;
                short s2 = this.d;
                GameWorld.e().bP = new Menu(n2, s2);
                GameWorld.e().I = GameWorld.e().B - GameWorld.e().bP.a > 0 ? -1 : 1;
                GameWorld.e().ay = new Command(null, this, 2, null);
            }
        }
    }
}

