import main.GameCanvas;
/*
 * Decompiled with CFR 0.152.
 */

public final class bu {
    public static boolean LoginScreen = false;
    private static bu Res;
    public static float b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int Item;
    public static int i;
    public static int j;
    public static int k;

    static {
        b = 0.5f;
        c = 30;
        d = 31;
        e = 32;
        f = 33;
        g = 34;
        Item = 35;
        i = 36;
        j = 37;
        k = 38;
    }

    public static bu LoginScreen() {
        if (Res == null) {
            Res = new bu();
        }
        return Res;
    }

    public final void b() {
        if (Char.cW) {
            RMS.LoginScreen("isPaintAura", 0);
            Char.cW = false;
        } else {
            RMS.LoginScreen("isPaintAura", 1);
            Char.cW = true;
        }
        bu.g();
    }

    public final void c() {
        if (!GameCanvas.e) {
            bu bu2 = this;
            if (GameScreen.bV = !GameScreen.bV) {
                RMS.LoginScreen("serverchat", 0);
            } else {
                RMS.LoginScreen("serverchat", 1);
            }
            bu.g();
            return;
        }
        bu bu3 = this;
        if (GameScreen.aO == 0) {
            GameScreen.aO = 1;
            RMS.LoginScreen("analog", GameScreen.aO);
            GameScreen.m();
        } else {
            GameScreen.aO = 0;
            RMS.LoginScreen("analog", GameScreen.aO);
            GameScreen.m();
        }
        bu.g();
    }

    public final void d() {
        if (GameCanvas.isLowGraphic) {
            RMS.LoginScreen("lowGraphic", 0);
            GameCanvas.isLowGraphic(T.cM, 8885, null);
        } else {
            RMS.LoginScreen("lowGraphic", 1);
            GameCanvas.isLowGraphic(T.cM, 8885, null);
        }
        bu.g();
    }

    public final void e() {
        if (Char.cX) {
            RMS.LoginScreen("isPaintAura2", 0);
            Char.cX = false;
        } else {
            RMS.LoginScreen("isPaintAura2", 1);
            Char.cX = true;
        }
        bu.g();
    }

    public static void f() {
        if (GameCanvas.I.n && Char.e().aD != null && Char.e().aD.c >= 2) {
            g.G = new String[]{T.i, T.bT, T.bS, T.bR, T.aG, T.bQ, T.aq, T.bU, T.T, T.I};
            if (Char.e().bO) {
                g.G = new String[]{T.i, T.bT, T.bS, T.w, T.bR, T.aG, T.bQ, T.aq, T.bU, T.T, T.I};
            }
        } else {
            g.G = new String[]{T.i, T.bT, T.bS, T.bR, T.aG, T.bQ, T.aq, T.bU, T.T};
            if (Char.e().bO) {
                g.G = new String[]{T.i, T.bT, T.bS, T.w, T.bR, T.aG, T.bQ, T.aq, T.bU, T.T};
            }
        }
        if (LoginScreen) {
            String[] stringArray = new String[g.G.length + 1];
            int n2 = 0;
            while (n2 < g.G.length) {
                stringArray[n2] = g.G[n2];
                ++n2;
            }
            stringArray[g.G.length] = T.d;
            g.G = stringArray;
        }
    }

    public static void g() {
        String string;
        String string2 = "[x]   ";
        String string3 = "[  ]   ";
        String string4 = string = GameScreen.aO == 0 ? String.valueOf(string3) + T.F : String.valueOf(string2) + T.G;
        if (!GameCanvas.e) {
            string = !GameScreen.bV ? String.valueOf(string3) + T.bX : String.valueOf(string2) + T.bX;
        }
        g.H = new String[]{Char.cW ? String.valueOf(string2) + T.cb.trim() : String.valueOf(string3) + T.cb.trim(), Char.cX ? String.valueOf(string2) + T.Npc.trim() : String.valueOf(string3) + T.Npc.trim(), GameCanvas.aj ? String.valueOf(string2) + T.fC.trim() : String.valueOf(string3) + T.fC.trim(), GameCanvas.isLowGraphic ? String.valueOf(string2) + T.Message.trim() : String.valueOf(string3) + T.Message.trim(), string};
    }

    public static void methodItem() {
        Session.LoginScreen().e();
        GameCanvas.G.A();
        GameCanvas.I.f();
        GameCanvas.I.b();
    }
}

