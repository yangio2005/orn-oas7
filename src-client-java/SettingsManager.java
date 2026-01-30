/*
 * Decompiled with CFR 0.152.
 */
import main.GameCanvas;

public final class SettingsManager {
    public static boolean a = false;
    private static SettingsManager ResourceUtil;
    public static float IActionListener;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int UIPanel;
    public static int h;
    public static int i;
    public static int j;
    public static int k;

    static {
        IActionListener = 0.5f;
        c = 30;
        d = 31;
        e = 32;
        f = 33;
        UIPanel = 34;
        h = 35;
        i = 36;
        j = 37;
        k = 38;
    }

    public static SettingsManager a() {
        if (ResourceUtil == null) {
            ResourceUtil = new SettingsManager();
        }
        return ResourceUtil;
    }

    public final void IActionListener() {
        if (GameWorld.cW) {
            RMSManager.a("isPaintAura", 0);
            GameWorld.cW = false;
        } else {
            RMSManager.a("isPaintAura", 1);
            GameWorld.cW = true;
        }
        SettingsManager.UIPanel();
    }

    public final void c() {
        if (!main.GameCanvas.e) {
            SettingsManager bu2 = this;
            if (GameScreen.bV = !GameScreen.bV) {
                RMSManager.a("serverchat", 0);
            } else {
                RMSManager.a("serverchat", 1);
            }
            SettingsManager.UIPanel();
            return;
        }
        SettingsManager bu3 = this;
        if (GameScreen.aO == 0) {
            GameScreen.aO = 1;
            RMSManager.a("analog", GameScreen.aO);
            GameScreen.m();
        } else {
            GameScreen.aO = 0;
            RMSManager.a("analog", GameScreen.aO);
            GameScreen.m();
        }
        SettingsManager.UIPanel();
    }

    public final void d() {
        if (main.GameCanvas.a) {
            RMSManager.a("lowGraphic", 0);
            main.GameCanvas.a(GameStrings.cM, 8885, null);
        } else {
            RMSManager.a("lowGraphic", 1);
            main.GameCanvas.a(GameStrings.cM, 8885, null);
        }
        SettingsManager.UIPanel();
    }

    public final void e() {
        if (GameWorld.cX) {
            RMSManager.a("isPaintAura2", 0);
            GameWorld.cX = false;
        } else {
            RMSManager.a("isPaintAura2", 1);
            GameWorld.cX = true;
        }
        SettingsManager.UIPanel();
    }

    public static void f() {
        if (main.GameCanvas.I.n && GameWorld.e().aD != null && GameWorld.e().aD.c >= 2) {
            UIPanel.G = new String[]{GameStrings.i, GameStrings.bT, GameStrings.bS, GameStrings.bR, GameStrings.aG, GameStrings.bQ, GameStrings.aq, GameStrings.bU, GameStrings.T, GameStrings.I};
            if (GameWorld.e().bO) {
                UIPanel.G = new String[]{GameStrings.i, GameStrings.bT, GameStrings.bS, GameStrings.w, GameStrings.bR, GameStrings.aG, GameStrings.bQ, GameStrings.aq, GameStrings.bU, GameStrings.T, GameStrings.I};
            }
        } else {
            UIPanel.G = new String[]{GameStrings.i, GameStrings.bT, GameStrings.bS, GameStrings.bR, GameStrings.aG, GameStrings.bQ, GameStrings.aq, GameStrings.bU, GameStrings.T};
            if (GameWorld.e().bO) {
                UIPanel.G = new String[]{GameStrings.i, GameStrings.bT, GameStrings.bS, GameStrings.w, GameStrings.bR, GameStrings.aG, GameStrings.bQ, GameStrings.aq, GameStrings.bU, GameStrings.T};
            }
        }
        if (a) {
            String[] stringArray = new String[UIPanel.G.length + 1];
            int n2 = 0;
            while (n2 < UIPanel.G.length) {
                stringArray[n2] = UIPanel.G[n2];
                ++n2;
            }
            stringArray[UIPanel.G.length] = GameStrings.d;
            UIPanel.G = stringArray;
        }
    }

    public static void UIPanel() {
        String string;
        String string2 = "[x]   ";
        String string3 = "[  ]   ";
        String string4 = string = GameScreen.aO == 0 ? String.valueOf(string3) + GameStrings.F : String.valueOf(string2) + GameStrings.G;
        if (!main.GameCanvas.e) {
            string = !GameScreen.bV ? String.valueOf(string3) + GameStrings.bX : String.valueOf(string2) + GameStrings.bX;
        }
        UIPanel.H = new String[]{GameWorld.cW ? String.valueOf(string2) + GameStrings.cb.trim() : String.valueOf(string3) + GameStrings.cb.trim(), GameWorld.cX ? String.valueOf(string2) + GameStrings.cc.trim() : String.valueOf(string3) + GameStrings.cc.trim(), main.GameCanvas.aj ? String.valueOf(string2) + GameStrings.fC.trim() : String.valueOf(string3) + GameStrings.fC.trim(), main.GameCanvas.a ? String.valueOf(string2) + GameStrings.Message.trim() : String.valueOf(string3) + GameStrings.Message.trim(), string};
    }

    public static void h() {
        NetworkService.a().e();
        main.GameCanvas.G.A();
        main.GameCanvas.I.f();
        main.GameCanvas.I.IActionListener();
    }
}

