import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class dk {
    public short LoginScreen;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int Item;
    public int i;
    public int j;
    public int k;
    public int Res;
    public int m;
    public int n;
    int[] o;
    int GameScreen;

    public final void methodLoginScreen(int n2, int[] nArray, int n3, int n4) {
        if (n2 <= 0) {
            return;
        }
        this.Res = n2;
        this.o = nArray;
        this.m = n3;
        this.n = n4;
    }

    public dk() {
        new ej();
        this.Res = -1;
        this.m = 0;
        this.n = 0;
        int[] nArray = new int[4];
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 1;
        this.o = nArray;
        this.c = ds.b(0, 3);
    }

    public final void methodLoginScreen() {
        at.LoginScreen(60, this.i, this.e + 3 + (GameCanvas.w % 10 > 5 ? 1 : 0), 1);
    }
}

