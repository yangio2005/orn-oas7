import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class cg {
    public int LoginScreen;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g = 1;
    public int Item;
    public int i;
    public String j;
    public String k;
    public short Res;
    public short m;
    public long n;

    public cg(int n2, short s2, String string, String string2, int n3, short s3) {
        new MyVector("vecInfo chientruong");
        this.LoginScreen = n2;
        this.Res = s2;
        this.j = string;
        this.k = string2;
        this.m = s3;
        this.n = GameCanvas.b;
        this.b = n3;
        if (this.b <= 0) {
            this.b = 1;
        }
        this.c = 0;
        this.d = 0;
        this.e = 4;
        this.f = 6;
    }

    public final void methodLoginScreen(int n2, int n3, int n4) {
        this.LoginScreen = n2;
        this.Item = n3;
        this.i = n4;
    }
}

