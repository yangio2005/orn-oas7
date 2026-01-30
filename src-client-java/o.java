/*
 * Decompiled with CFR 0.152.
 */
public final class o {
    public static t a = new t("VSKILL");

    public static void a(bf bf2) {
        GameCanvas.put(new Short(bf2.IActionListener), bf2);
    }

    public static bf a(short s2) {
        return (Skill)GameCanvas.get(new Short(s2));
    }
}

