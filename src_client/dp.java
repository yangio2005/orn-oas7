/*
 * Decompiled with CFR 0.152.
 */
public final class dp {
    public static MyHashtable LoginScreen = new MyHashtable("item template");

    public static void methodLoginScreen(dd dd2) {
        LoginScreen.put(new Short(dd2.LoginScreen), dd2);
    }

    public static dd LoginScreen(short s2) {
        return (dd)LoginScreen.get(new Short(s2));
    }
}

