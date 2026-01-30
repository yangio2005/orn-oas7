/*
 * Decompiled with CFR 0.152.
 */
public final class ei {
    public static LoggingList a = new LoggingList("vEff");

    public static void a(ea ea2) {
        GameCanvas.addElement(ea2);
    }

    public static void a(int n2) {
        if (ei.IActionListener(n2) != null) {
            GameCanvas.removeElement(ei.IActionListener(n2));
        }
    }

    private static ea IActionListener(int n2) {
        int n3 = 0;
        while (n3 < GameCanvas.size()) {
            ea ea2 = (ea)GameCanvas.elementAt(n3);
            if (ea2.a == n2) {
                return ea2;
            }
            ++n3;
        }
        return null;
    }

    public static void a(MGraphics en2, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < GameCanvas.size()) {
            if (((ea)ei.GameCanvas.elementAt((int)n5)).h == -n4) {
                ((ea)GameCanvas.elementAt(n5)).a(en2, n2, n3);
            }
            ++n5;
        }
    }

    public static void a(MGraphics en2) {
        int n2 = 0;
        while (n2 < GameCanvas.size()) {
            if (((ea)ei.GameCanvas.elementAt((int)n2)).h == 1) {
                ((ea)GameCanvas.elementAt(n2)).a(en2);
            }
            ++n2;
        }
    }

    public static void IActionListener(MGraphics en2) {
        int n2 = 0;
        while (n2 < GameCanvas.size()) {
            if (((ea)ei.GameCanvas.elementAt((int)n2)).h == 2) {
                ((ea)GameCanvas.elementAt(n2)).a(en2);
            }
            ++n2;
        }
    }

    public static void c(MGraphics en2) {
        int n2 = 0;
        while (n2 < GameCanvas.size()) {
            if (((ea)ei.GameCanvas.elementAt((int)n2)).h == 3) {
                ((ea)GameCanvas.elementAt(n2)).a(en2);
            }
            ++n2;
        }
    }

    public static void d(MGraphics en2) {
        int n2 = 0;
        while (n2 < GameCanvas.size()) {
            if (((ea)ei.GameCanvas.elementAt((int)n2)).h == 4) {
                ((ea)GameCanvas.elementAt(n2)).a(en2);
            }
            ++n2;
        }
    }

    public static void a() {
        int n2 = 0;
        while (n2 < GameCanvas.size()) {
            ((ea)GameCanvas.elementAt(n2)).a();
            ++n2;
        }
    }
}

