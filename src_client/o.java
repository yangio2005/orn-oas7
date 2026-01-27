/*
 * Decompiled with CFR 0.152.
 */
public final class o {
    public static MyHashtable LoginScreen = new MyHashtable("VSKILL");

    public static void methodLoginScreen(bf bf2) {
        LoginScreen.put(new Short(bf2.b), bf2);
    }

    public static bf LoginScreen(short s2) {
        return (bf)LoginScreen.get(new Short(s2));
    }
}

