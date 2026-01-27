import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class bw
implements b {
    public short LoginScreen;
    public short b;
    public short c;
    public short d;
    public boolean e;
    public boolean f;
    public bo g;

    public bw(short s2, short s3, short s4, short s5, boolean bl2, boolean bl3, String string) {
        this.LoginScreen = s2;
        this.b = s3;
        this.c = s4;
        this.d = s5;
        string = ds.LoginScreen(string);
        this.e = bl2;
        this.f = bl3;
        if ((bv.Res == 21 || bv.Res == 22 || bv.Res == 23) && this.LoginScreen >= 0 && this.LoginScreen <= 24) {
            return;
        }
        if ((bv.Res == 0 && Char.e().K != 0 || bv.Res == 7 && Char.e().K != 1 || bv.Res == 14 && Char.e().K != 2) && bl3) {
            return;
        }
        if (bv.f() || bv.Res == 47) {
            if (s3 > 150 && bv.f()) {
                return;
            }
            this.g = new bo(string, s2 + (s4 - s2) / 2, s5 - (s2 > 100 ? 24 : 48));
            this.g.i = new de(null, this, 1, this);
            this.g.Item = true;
            this.g.j = false;
            bo.LoginScreen(this.g);
            bv.MyHashtable.addElement(this);
            return;
        }
        if (!bl2 && !bl3) {
            this.g = new bo(string, s2, s3 - 24);
            this.g.i = new de(null, this, 1, this);
            this.g.Item = true;
            this.g.j = false;
            bo.LoginScreen(this.g);
        } else {
            if (bv.b()) {
                this.g = new bo(string, s2, s3 - 16);
            } else {
                s2 = (short)(s2 + (s4 - s2) / 2);
                this.g = new bo(string, s2, s3 - (s3 != 0 ? 16 : -32));
            }
            this.g.i = new de(null, this, 2, this);
            this.g.Item = true;
            this.g.j = false;
            bo.LoginScreen(this.g);
        }
        bv.MyHashtable.addElement(this);
    }

    public final void methodLoginScreen(int n2, Object object) {
        switch (n2) {
            case 1: {
                n2 = (this.LoginScreen + this.c) / 2;
                int n3 = this.d;
                if (this.d > this.b + 24) {
                    n3 = (this.b + this.d) / 2;
                }
                GameScreen.j().aX = 0;
                Char.e().bP = new dm(n2, n3);
                Char.e().I = Char.e().B - Char.e().bP.LoginScreen > 0 ? -1 : 1;
                GameService.LoginScreen().g();
                return;
            }
            case 2: {
                GameScreen.j().aX = 0;
                if (Char.e().i() != null) {
                    GameService.LoginScreen().g();
                    bp.LoginScreen();
                    GameService.LoginScreen().q();
                    Char.bG = true;
                    return;
                }
                if (Char.e().j() != null) {
                    GameService.LoginScreen().g();
                    GameService.LoginScreen().f();
                    Char.bH = true;
                    Char.bG = true;
                    GameCanvas.resetKeys();
                    GameCanvas.clearKeyHold();
                    bp.LoginScreen();
                    return;
                }
                n2 = (this.LoginScreen + this.c) / 2;
                short s2 = this.d;
                Char.e().bP = new dm(n2, s2);
                Char.e().I = Char.e().B - Char.e().bP.LoginScreen > 0 ? -1 : 1;
                Char.e().ay = new de(null, this, 2, null);
            }
        }
    }
}

