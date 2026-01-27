/*
 * Decompiled with CFR 0.152.
 */
public final class ak {
    public int LoginScreen;
    public String b;
    public short[] c;
    public int d;
    public int e;
    public static MyVector f = new MyVector("vClanImage");
    public static MyHashtable g = new MyHashtable("Item id images");

    public static void methodLoginScreen(ak ak2) {
        GameService.LoginScreen().b((byte)ak2.LoginScreen);
        f.addElement(ak2);
    }

    public static ak LoginScreen(short s2) {
        int n2 = 0;
        while (n2 < f.size()) {
            ak ak2 = (ak)f.elementAt(n2);
            if (ak2.LoginScreen == s2) {
                return ak2;
            }
            ++n2;
        }
        return null;
    }

    public static boolean methodLoginScreen(int n2) {
        int n3 = 0;
        while (n3 < f.size()) {
            ak ak2 = (ak)f.elementAt(n3);
            if (ak2.LoginScreen == n2) {
                return true;
            }
            ++n3;
        }
        return false;
    }
}

