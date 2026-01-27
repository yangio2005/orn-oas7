/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

import main.GameMidlet;
import main.GameCanvas;
public class aj {
    int LoginScreen;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int Item;
    int i;
    int j;
    float k;
    long Res;
    long m;
    boolean n;
    int[] o;
    int[] GameScreen;

    public aj(int n2, int n3, int n4, int n5, int n6) {
        this.i = 0;
        this.j = 0xFF0000;
        this.Res = 0L;
        this.m = 150L;
        this.n = true;
        this.o = new int[2];
        this.GameScreen = new int[2];
        this.g = n3;
        this.d = n2;
        this.k = 1.0f;
        this.c = n4;
        this.Item = n5;
        this.LoginScreen = GameCanvas.A;
        this.b = GameCanvas.B;
        this.Res = System.currentTimeMillis();
        n4 = 0;
        while (n4 < 2) {
            this.o[n4] = n2;
            this.GameScreen[n4] = n3;
            ++n4;
        }
        this.j = n6;
    }

    public static void methodLoginScreen(mGraphics en2, int n2, int n3, int n4) {
        en2.LoginScreen(n4);
        en2.d(n2, n3, 1, 2);
    }

    public aj() {
    }

    /*
     * WARNING - void declaration
     */
    public static void methodLoginScreen(Message object) {
        try {
            switch (((Message)object).LoginScreen) {
                case -128: {
                    Object y2 = object;
                    try {
                        byte by2 = ((Message)y2).c().readByte();
                        int n2 = ((Message)y2).c().readInt();
                        Char af2 = n2 == Char.e().J ? Char.e() : GameScreen.b(n2);
                        if (by2 == 0) {
                            short s2 = ((Message)y2).c().readShort();
                            byte by3 = ((Message)y2).c().readByte();
                            byte by4 = ((Message)y2).c().readByte();
                            short s3 = ((Message)y2).c().readShort();
                            byte by5 = ((Message)y2).c().readByte();
                            if (af2 != null) {
                                af2.LoginScreen(new ea((int)s2, af2, (int)by3, (int)by4, (int)s3, by5));
                            }
                            break;
                        }
                        if (by2 == 1) {
                            short s4 = ((Message)y2).c().readShort();
                            if (af2 != null) {
                                af2.b(0, (int)s4);
                            }
                            break;
                        }
                        if (by2 == 2) {
                            if (af2 != null) {
                                af2.b(-1, 0);
                            }
                            break;
                        }
                    }
                    catch (Exception exception) {
                        Exception exception2 = exception;
                        exception.printStackTrace();
                    }
                    return;
                }
                case 127: {
                    Object y3 = object;
                    try {
                        byte by6 = ((Message)y3).c().readByte();
                        if (by6 == 0) {
                            aq.LoginScreen();
                            MyVector el2 = new MyVector("");
                            int n3 = ((Message)y3).c().readShort();
                            int n4 = 0;
                            int n5 = 0;
                            while (n5 < n3) {
                                short s5;
                                int n6;
                                byte by7;
                                byte by8;
                                byte by9;
                                ef ef2 = new ef();
                                short s6 = ((Message)y3).c().readShort();
                                int n7 = n5 + 1;
                                byte by10 = ((Message)y3).c().readShort();
                                byte by11 = ((Message)y3).c().readByte();
                                byte by12 = ((Message)y3).c().readByte();
                                byte by13 = ((Message)y3).c().readByte();
                                int n8 = -1;
                                Char af3 = null;
                                byte by14 = ((Message)y3).c().readByte();
                                if (by14 == 0) {
                                    n8 = ((Message)y3).c().readShort();
                                } else {
                                    short s7 = ((Message)y3).c().readShort();
                                    short s8 = ((Message)y3).c().readShort();
                                    by9 = ((Message)y3).c().readShort();
                                    by7 = by8 = ((Message)y3).c().readShort();
                                    n6 = by9;
                                    s5 = s8;
                                    short s9 = s7;
                                    Char af4 = new Char();
                                    new Char().bU = s9;
                                    af4.bW = s5;
                                    af4.bV = n6;
                                    af4.bX = by7;
                                    af3 = af4;
                                }
                                String string = ((Message)y3).c().readUTF();
                                String string2 = ((Message)y3).c().readUTF();
                                by9 = ((Message)y3).c().readByte();
                                by8 = ((Message)y3).c().readByte();
                                byte by15 = ((Message)y3).c().readByte();
                                ee[] eeArray = null;
                                if (by15 != 0) {
                                    eeArray = new ee[by15];
                                    int n9 = 0;
                                    while (n9 < eeArray.length) {
                                        MessageHandler.LoginScreen();
                                        ee ee2 = MessageHandler.b((Message)y3);
                                        byte by16 = ((Message)y3).c().readByte();
                                        if (ee2 != null) {
                                            eeArray[n9] = ee2;
                                            eeArray[n9].b = by16;
                                        }
                                        ++n9;
                                    }
                                }
                                ee[] eeArray2 = eeArray;
                                Char af5 = af3;
                                String string3 = string2;
                                String string4 = string;
                                int n10 = n8;
                                byte by17 = by14;
                                byte by18 = by11;
                                by7 = by10;
                                n6 = n7;
                                s5 = s6;
                                ef ef3 = ef2;
                                ef2.e = s5;
                                ef3.f = n6;
                                ef3.g = by7;
                                ef3.LoginScreen = by18;
                                ef3.d = by17;
                                if (n10 != -1) {
                                    ef3.m = new Mob();
                                    ef3.m.C = n10;
                                }
                                ef3.Item = string4;
                                ef3.i = string3;
                                ef3.Res = af5;
                                ef3.n = eeArray2;
                                ef3.LoginScreen();
                                ef2.LoginScreen(by9);
                                ef2.b(by8);
                                ef2.LoginScreen(by12, by13);
                                el2.addElement(ef2);
                                if (by9 > 0) {
                                    ++n4;
                                }
                                ++n5;
                            }
                            aq.LoginScreen().LoginScreen(el2, n4, n3);
                            break;
                        }
                        if (by6 == 1) {
                            short s10 = ((Message)y3).c().readShort();
                            byte by19 = ((Message)y3).c().readByte();
                            if (ef.LoginScreen(aq.f, s10) != null) {
                                ef.LoginScreen(aq.f, s10).b(by19);
                            }
                            aq.e();
                            break;
                        }
                        if (by6 == 2) {
                            short s11 = ((Message)y3).c().readShort();
                            byte by20 = ((Message)y3).c().readByte();
                            int n11 = 0;
                            int n12 = 0;
                            while (n12 < aq.f.size()) {
                                ef ef4 = (ef)aq.f.elementAt(n12);
                                if (ef4 != null) {
                                    if (ef4.e == s11) {
                                        ef4.LoginScreen(by20);
                                    }
                                    if (ef4.j > 0) {
                                        ++n11;
                                    }
                                }
                                ++n12;
                            }
                            aq.LoginScreen(n11, aq.f.size());
                            if (ef.LoginScreen(aq.g, s11) != null) {
                                ef.LoginScreen(aq.g, s11).LoginScreen(by20);
                                break;
                            }
                        } else if (by6 == 3) {
                            short s12 = ((Message)y3).c().readShort();
                            byte by21 = ((Message)y3).c().readByte();
                            byte by22 = ((Message)y3).c().readByte();
                            if (ef.LoginScreen(aq.f, s12) != null) {
                                ef.LoginScreen(aq.f, s12).LoginScreen(by21, by22);
                            }
                            if (ef.LoginScreen(aq.g, s12) != null) {
                                ef.LoginScreen(aq.g, s12).LoginScreen(by21, by22);
                                break;
                            }
                        } else if (by6 == 4) {
                            int n13 = ((Message)y3).c().readInt();
                            short s13 = ((Message)y3).c().readShort();
                            Char af6 = n13 == Char.e().J ? Char.e() : GameScreen.b(n13);
                            if (af6 != null) {
                                af6.cV = s13;
                                af6.cY = ((Message)y3).c().readByte();
                                break;
                            }
                        }
                    }
                    catch (Exception exception) {
                        Exception exception3 = exception;
                        exception.printStackTrace();
                    }
                    return;
                }
                case 114: {
                    try {
                        ((Message)object).c().readUTF();
                        Res.e = ((Message)object).c().readByte();
                        Res.f = ((Message)object).c().readByte();
                        return;
                    }
                    catch (Exception exception) {
                        return;
                    }
                }
                case 113: {
                    short nArray;
                    byte by23 = 0;
                    byte by24 = 0;
                    int n14 = 0;
                    boolean n15 = false;
                    int n2 = 0;
                    int n3 = -1;
                    try {
                        by23 = ((Message)object).c().readByte();
                        by24 = ((Message)object).c().readByte();
                        n14 = ((Message)object).c().readShort();
                        nArray = ((Message)object).c().readShort();
                        n2 = ((Message)object).c().readShort();
                        n3 = ((Message)object).c().readShort();
                    }
                    catch (Exception exception) {}
                    ei.LoginScreen(new ea(n14, nArray, n2, (int)by24, (int)by23, n3));
                    return;
                }
                case 48: {
                    byte by25 = ((Message)object).c().readByte();
                    ServerListScreen.LoginScreen(by25, false);
                    GameCanvas.e();
                    Session.LoginScreen().e();
                    GameCanvas.instance();
                    ServerListScreen.m = true;
                    return;
                }
                case 31: {
                    int n18 = ((Message)object).c().readInt();
                    short s14 = ((Message)object).c().readByte();
                    if (s14 == 1) {

                        s14 = ((Message)object).c().readShort();
                        int n19 = -1;
                        Object n23 = null;
                        short s2 = 0;
                        int n4 = 0;
                        try {
                            byte by2 = ((Message)object).c().readByte();
                            n19 = by2;
                            if (by2 > 0) {
                                int n5 = ((Message)object).c().readByte();
                                int[] n25 = new int[n5];
                                int n6 = 0;
                                while (n6 < n5) {
                                    n25[n6] = ((Message)object).c().readByte();
                                    ++n6;
                                }
                                s2 = ((Message)object).c().readShort();
                                n4 = ((Message)object).c().readShort();
                            }
                        }
                        catch (Exception exception) {}
                        if (n18 == Char.e().J) {
                            Char.e().v = new dk();
                            Char.e().v.LoginScreen = s14;
                            if (n19 > 0) {
                                Char.e().v.LoginScreen(n19, (int[])by31, s2, n4);
                                return;
                            }
                        } else {
                            Char af2 = GameScreen.b(n18);
                            GameScreen.b(n18).v = new dk();
                            af2.v.LoginScreen = s14;
                            if (n19 > 0) {
                                af2.v.LoginScreen(n19, (int[])by31, s2, n4);
                                return;
                            }
                        }
                        break;
                    }
                    if (n18 == Char.e().J) {
                        Char.e().v.LoginScreen();
                        Char.e().v = null;
                        return;
                    }
                    Char af8 = GameScreen.b(n18);
                    af8.v.LoginScreen();
                    af8.v = null;
                    return;
                }
                case -89: {
                    GameCanvas.an = ((Message)object).c().readByte() == 1;
                    return;
                }
                case 42: {
                    GameCanvas.instance();
                    x.c = false;
                    Char.bI = false;
                    byte by27 = ((Message)object).c().readByte();
                    if (GameCanvas.J == null) {
                        GameCanvas.J = new bi(by27);
                    }
                    GameCanvas.J.b();
                    return;
                }
                case 52: {
                    Char af3;
                    byte by28 = ((Message)object).c().readByte();
                    if (by28 == 1) {
                        int by36 = ((Message)object).c().readInt();
                        if (by36 == Char.e().J) {
                            Char.e().c(true);
                            Char.e().B = ((Message)object).c().readShort();
                            Char.e().C = ((Message)object).c().readShort();
                        } else {
                            af3 = GameScreen.b(by36);
                            if (af3 != null) {
                                af3.c(true);
                                af3.B = ((Message)object).c().readShort();
                                af3.C = ((Message)object).c().readShort();
                            }
                        }
                    }
                    if (by28 == 0) {
                        int s21 = ((Message)object).c().readInt();
                        if (s21 == Char.e().J) {
                            Char.e().c(false);
                        } else {
                            af3 = GameScreen.b(s21);
                            if (af3 != null) {
                                af3.c(false);
                            }
                        }
                    }
                    if (by28 == 2) {
                        int af10 = ((Message)object).c().readInt();
                        int n7 = ((Message)object).c().readInt();
                        al al2 = (al)GameScreen.b(af10);
                        al2.c(n7);
                    }
                    if (by28 == 3) {
                        GameScreen.bW = ((Message)object).c().readByte();
                        return;
                    }
                    break;
                }
                case 51: {

                    int by39 = ((Message)object).c().readInt();
                    al al3 = (al)GameScreen.b(by39);
                    byte by3 = ((Message)object).c().readByte();
                    short s3 = ((Message)object).c().readShort();
                    short s4 = ((Message)object).c().readShort();
                    byte by30 = ((Message)object).c().readByte();
                    Char[] afArray = new Char[by30];
                    long[] lArray = new long[by30];
                    boolean n44 = false;
                    while (s28 < by30) {
                        int n8 = ((Message)object).c().readInt();
                        ds.c("char ID=" + n8);
                        afArray[s28] = null;
                        afArray[s28] = n8 != Char.e().J ? GameScreen.b(n8) : Char.e();
                        lArray[s28] = ((Message)object).c().readLong();
                        ++s28;
                    }
                    al3.LoginScreen(by3, s3, s4, afArray, lArray);
                    return;
                }
                case -127: {
                    aj.b((Message)object);
                    return;
                }
                case -126: {
                    byte n50 = ((Message)object).c().readByte();
                    ds.c("type quay= " + n50);
                    if (n50 == 1) {
                        ((Message)object).c().readByte();
                        String string = ((Message)object).c().readUTF();
                        String string5 = ((Message)object).c().readUTF();
                        GameScreen.j().b(string, string5);
                    }
                    if (n50 == 0) {
                        GameScreen.j().b(((Message)object).c().readUTF());
                        return;
                    }
                    break;
                }
                case -122: {
                    short s5 = ((Message)object).c().readShort();
                    _do do_ = GameScreen.LoginScreen(s5);
                    int n27 = ((Message)object).c().readByte();
                    do_.dj = new int[n27];
                    int n28 = 0;
                    while (n28 < n27) {
                        do_.dj[n28] = ((Message)object).c().readShort();
                        ++n28;
                    }
                    do_.LoginScreen(((Message)object).c().readByte(), ((Message)object).c().readInt());
                    return;
                }
                case 102: {
                    int n9;
                    int n10;
                    long[] lArray;
                    Char[] afArray;
                    int n31;
                    Mob aa2;
                    byte by32 = ((Message)object).c().readByte();
                    if (by32 == 0 || by32 == 1 || by32 == 2 || by32 == 6) {
                        aa2 = Mob.x();
                        if (aa2 == null) {
                            return;
                        }
                        if (by32 == 6) {
                            aa2.u = -1000;
                            aa2.MyHashtable = -1000;
                            ((d)aa2).b = -1000;
                            ((d)aa2).LoginScreen = -1000;
                            aa2.n = -1000;
                            aa2.m = -1000;
                            return;
                        }
                        n31 = ((Message)object).c().readByte();
                        afArray = new Char[n31];
                        lArray = new long[n31];
                        n10 = 0;
                        while (n10 < n31) {
                            n9 = ((Message)object).c().readInt();
                            afArray[n10] = null;
                            afArray[n10] = n9 != Char.e().J ? GameScreen.b(n9) : Char.e();
                            lArray[n10] = ((Message)object).c().readLong();
                            ++n10;
                        }
                        ((d)aa2).LoginScreen(afArray, lArray, by32);
                    }
                    if (by32 == 3 || by32 == 4 || by32 == 5 || by32 == 7) {
                        aa2 = Mob.Message();
                        if (aa2 == null) {
                            return;
                        }
                        if (by32 == 7) {
                            aa2.u = -1000;
                            aa2.MyHashtable = -1000;
                            ((an)aa2).b = -1000;
                            ((an)aa2).LoginScreen = -1000;
                            aa2.n = -1000;
                            aa2.m = -1000;
                            return;
                        }
                        if (by32 == 3 || by32 == 4) {
                            n31 = ((Message)object).c().readByte();
                            afArray = new Char[n31];
                            lArray = new long[n31];
                            n10 = 0;
                            while (n10 < n31) {
                                n9 = ((Message)object).c().readInt();
                                afArray[n10] = null;
                                afArray[n10] = n9 != Char.e().J ? GameScreen.b(n9) : Char.e();
                                lArray[n10] = ((Message)object).c().readLong();
                                ++n10;
                            }
                            ((an)aa2).LoginScreen(afArray, lArray, by32);
                        }
                        if (by32 == 5) {
                            n31 = ((Message)object).c().readShort();
                            ((an)aa2).b((short)n31);
                        }
                    }
                    if (by32 > 9 && by32 < 30) {
                        aj.LoginScreen((Message)object, by32);
                        return;
                    }
                    break;
                }
                case 101: {
                    ds.c("big boss--------------------------------------------------");
                    Npc cc2 = Mob.w();
                    if (cc2 == null) {
                        return;
                    }
                    byte by33 = ((Message)object).c().readByte();
                    if (by33 == 0 || by33 == 1 || by33 == 2 || by33 == 4 || by33 == 3) {
                        if (by33 == 3) {
                            short s6 = ((Message)object).c().readShort();
                            cc2.MyHashtable = s6;
                            cc2.LoginScreen = s6;
                            cc2.u = ((Message)object).c().readShort();
                            cc2.D();
                        } else {
                            int n11 = ((Message)object).c().readByte();
                            ds.c("CHUONG nChar= " + n11);
                            Char[] afArray = new Char[n11];
                            long[] lArray = new long[n11];
                            int n12 = 0;
                            while (n12 < n11) {
                                int n34 = ((Message)object).c().readInt();
                                ds.c("char ID=" + n34);
                                afArray[n12] = null;
                                afArray[n12] = n34 != Char.e().J ? GameScreen.b(n34) : Char.e();
                                lArray[n12] = ((Message)object).c().readLong();
                                ++n12;
                            }
                            cc2.LoginScreen(afArray, lArray, by33);
                        }
                    }
                    if (by33 == 5) {
                        cc2.b = true;
                        cc2.GameScreen = 2;
                    }
                    if (by33 == 6) {
                        cc2.C();
                        cc2.m = ((Message)object).c().readShort();
                        cc2.n = ((Message)object).c().readShort();
                    }
                    if (by33 == 7) {
                        cc2.LoginScreen(null, null, by33);
                    }
                    if (by33 == 8) {
                        short s7 = ((Message)object).c().readShort();
                        cc2.MyHashtable = s7;
                        cc2.LoginScreen = s7;
                        cc2.u = ((Message)object).c().readShort();
                        cc2.GameScreen = 2;
                    }
                    if (by33 == 9) {
                        cc2.u = -1000;
                        cc2.MyHashtable = -1000;
                        cc2.LoginScreen = -1000;
                        cc2.n = -1000;
                        cc2.m = -1000;
                        return;
                    }
                    break;
                }
                case -120: {
                    long l2 = Res.currentTimeMillis();
                    GameService.d = l2 - GameService.b;
                    GameService.LoginScreen().d();
                    return;
                }
                case -121: {
                    long l3 = Res.currentTimeMillis();
                    GameService.e = l3 - GameService.c;
                    GameService.LoginScreen().e();
                    return;
                }
                case 100: {
                    byte by34 = ((Message)object).c().readByte();
                    int n35 = ((Message)object).c().readByte();
                    Item h2 = null;
                    if (by34 == 0) {
                        h2 = Char.e().aH[n35];
                    }
                    if (by34 == 1) {
                        h2 = Char.e().aF[n35];
                    }
                    if ((n35 = ((Message)object).c().readShort()) != -1) {
                        h2.b = dp.LoginScreen((short)n35);
                        h2.Item = ((Message)object).c().readInt();
                        ((Message)object).c().readUTF();
                        ((Message)object).c().readUTF();
                        byte by4 = ((Message)object).c().readByte();
                        n35 = by4;
                        if (by4 != 0) {
                            h2.LoginScreen = new ee[n35];
                            n35 = 0;
                            while (n35 < h2.LoginScreen.length) {
                                MessageHandler.LoginScreen();
                                ee ee3 = MessageHandler.b((Message)object);
                                if (ee3 != null) {
                                    h2.LoginScreen[n35] = ee3;
                                }
                                ++n35;
                            }
                        }
                        if (h2.Item <= 0) {
                            return;
                        }
                    }
                    break;
                }
                case -123: {
                    int n36 = ((Message)object).c().readInt();
                    if (GameScreen.b(n36) != null) {
                        GameScreen.b((int)n36).cS = ((Message)object).c().readByte();
                        return;
                    }
                    break;
                }
                case -119: {
                    Char.e().w = ((Message)object).c().readInt();
                    return;
                }
                case -117: {
                    GameScreen.j().bU = 0;
                    GameScreen.j().bS = ((Message)object).c().readByte();
                    if (GameScreen.j().bS == 100) {
                        GameScreen.j().bT = true;
                    }
                    if (GameScreen.j().bS == 101) {
                        _do.mFont = true;
                        return;
                    }
                    break;
                }
                case -116: {
                    GameScreen.bk = ((Message)object).c().readByte() == 1;
                    return;
                }
                case -115: {
                    Char.e().LoginScreen(((Message)object).c().readUTF(), ((Message)object).c().readShort(), ((Message)object).c().readShort(), ((Message)object).c().readShort());
                    return;
                }
                case -113: {
                    byte[] byArray = new byte[10];
                    int n37 = 0;
                    while (n37 < 10) {
                        byArray[n37] = ((Message)object).c().readByte();
                        ++n37;
                    }
                    GameScreen.j().b(byArray);
                    GameScreen.j().LoginScreen(byArray);
                    GameScreen.j().c(byArray);
                    return;
                }
                case -111: {
                    int n38 = ((Message)object).c().readShort();
                    u.b = new MyVector("");
                    int n39 = 0;
                    while (n39 < n38) {
                        String string = ((Message)object).c().readUTF();
                        byte by47 = ((Message)object).c().readByte();
                        u.b.addElement(new u(string, by47));
                        ++n39;
                    }
                    u.LoginScreen();
                    u.b();
                    return;
                }
                case 125: {
                    byte by37 = ((Message)object).c().readByte();
                    int n40 = ((Message)object).c().readInt();
                    if (n40 == Char.e().J) {
                        Char.e().b(by37);
                        return;
                    }
                    if (GameScreen.b(n40) != null) {
                        GameScreen.b(n40).b(by37);
                        return;
                    }
                    break;
                }
                case 124: {
                    short s8 = ((Message)object).c().readShort();
                    object = ((Message)object).c().readUTF();
                    ds.c("noi chuyen = " + (String)object + "npc ID= " + s8);
                    _do do_ = GameScreen.LoginScreen(s8);
                    if (do_ != null) {
                        do_.LoginScreen((String)object);
                        return;
                    }
                    break;
                }
                case 123: {

                    int n41 = ((Message)object).c().readInt();
                    short s22 = ((Message)object).c().readShort();
                    short s23 = ((Message)object).c().readShort();
                    byte by38 = ((Message)object).c().readByte();
                    ds.c("SET POSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSss x= " + s22 + " Message= " + s23 + "chaPos= " + n41 + "type Pos= " + by38);
                    Object var4_144 = null;
                    if (n41 == Char.e().J) {
                        Char af4 = Char.e();
                    } else if (GameScreen.b(n41) != null) {
                        Char af5 = GameScreen.b(n41);
                    }
                    if (var4_147 != null) {
                        at.LoginScreen(by38 == 0 ? 60 : 173, (Char)var4_147, 1);
                        var4_147.LoginScreen(s22, s23, by38);
                        return;
                    }
                    break;
                }
                case 122: {
                    short s24 = ((Message)object).c().readShort();
                    ds.c("second login = " + s24);
                    x.k = s24;
                    x.m = x.Res = System.currentTimeMillis();
                    GameCanvas.instance();
                    return;
                }
                case 121: {
                    Res.g = ((Message)object).c().readUTF();
                    ((Message)object).c().readUTF();
                    ds.c("SHOW AD public ID= " + Res.g);
                    return;
                }
                case -124: {
                    int n13;
                    int n43;
                    byte by40 = ((Message)object).c().readByte();
                    byte by41 = ((Message)object).c().readByte();
                    if (by41 == 0) {
                        if (by40 == 2) {
                            n43 = ((Message)object).c().readInt();
                            if (n43 == Char.e().J) {
                                Char.e().S();
                            } else if (GameScreen.b(n43) != null) {
                                GameScreen.b(n43).S();
                            }
                        }
                        n43 = ((Message)object).c().readUnsignedByte();
                        int n14 = ((Message)object).c().readInt();
                        ds.c("playerID= " + n14 + " skillID= " + n43);
                        if (n43 == 32) {
                            if (by40 == 1) {
                                n13 = ((Message)object).c().readInt();
                                if (n14 == Char.e().J) {
                                    Char.e().cI = n43;
                                    GameScreen.b(n13).b(Char.e());
                                } else if (GameScreen.b(n14) != null && n13 != Char.e().J) {
                                    GameScreen.b((int)n14).cI = n43;
                                    GameScreen.b(n13).b(GameScreen.b(n14));
                                } else if (GameScreen.b(n14) != null && n13 == Char.e().J) {
                                    GameScreen.b((int)n14).cI = n43;
                                    Char.e().b(GameScreen.b(n14));
                                }
                            } else if (n14 == Char.e().J) {
                                Char.e().P();
                            } else if (GameScreen.b(n14) != null) {
                                GameScreen.b(n14).P();
                            }
                        }
                        if (n43 == 33) {
                            if (by40 == 1) {
                                if (n14 == Char.e().J) {
                                    Char.e().cK = true;
                                } else if (GameScreen.b(n14) != null) {
                                    GameScreen.b((int)n14).cK = true;
                                }
                            } else if (n14 == Char.e().J) {
                                Char.e().Q();
                            } else if (GameScreen.b(n14) != null) {
                                GameScreen.b(n14).Q();
                            }
                        }
                        if (n43 == 39) {
                            if (by40 == 1) {
                                if (n14 == Char.e().J) {
                                    Char.e().cN = true;
                                } else if (GameScreen.b(n14) != null) {
                                    GameScreen.b((int)n14).cN = true;
                                }
                            } else if (n14 == Char.e().J) {
                                Char.e().T();
                            } else if (GameScreen.b(n14) != null) {
                                GameScreen.b(n14).T();
                            }
                        }
                        if (n43 == 40) {
                            if (by40 == 1) {
                                if (n14 == Char.e().J) {
                                    Char.e().cO = true;
                                } else if (GameScreen.b(n14) != null) {
                                    GameScreen.b((int)n14).cO = true;
                                }
                            } else if (n14 == Char.e().J) {
                                Char.e().R();
                            } else if (GameScreen.b(n14) != null) {
                                GameScreen.b(n14).R();
                            }
                        }
                        if (n43 == 41) {
                            if (by40 == 1) {
                                if (n14 == Char.e().J) {
                                    Char.e().cQ = true;
                                } else if (GameScreen.b(n14) != null) {
                                    GameScreen.b((int)n14).cQ = true;
                                }
                            } else if (n14 == Char.e().J) {
                                Char.e().V();
                            } else if (GameScreen.b(n14) != null) {
                                GameScreen.b(n14).V();
                            }
                        }
                        if (n43 == 42) {
                            if (by40 == 1) {
                                if (n14 == Char.e().J) {
                                    Char.e().cR = true;
                                }
                            } else if (n14 == Char.e().J) {
                                Char.e().cR = false;
                                ds.c("tra ve huy chieu 2");
                            }
                        }
                    }
                    if (by41 == 1) {
                        n43 = ((Message)object).c().readUnsignedByte();
                        byte by5 = ((Message)object).c().readByte();
                        ds.c("modbHoldID= " + by5 + " skillID= " + n43 + "eff ID= " + by40);
                        if (n43 == 32) {
                            if (by40 == 1) {
                                n13 = ((Message)object).c().readInt();
                                if (n13 == Char.e().J) {
                                    GameScreen.LoginScreen((byte)by5).j = n43;
                                    Char.e().LoginScreen(GameScreen.LoginScreen(by5));
                                } else if (GameScreen.b(n13) != null) {
                                    GameScreen.LoginScreen((byte)by5).j = n43;
                                    GameScreen.b(n13).LoginScreen(GameScreen.LoginScreen(by5));
                                }
                            } else {
                                GameScreen.LoginScreen(by5).r();
                            }
                        }
                        if (n43 == 40) {
                            if (by40 == 1) {
                                GameScreen.LoginScreen((byte)by5).ab = true;
                            } else {
                                GameScreen.LoginScreen(by5).SessionReceiver();
                            }
                        }
                        if (n43 == 41) {
                            if (by40 == 1) {
                                GameScreen.LoginScreen((byte)by5).MessageHandler = true;
                                return;
                            }
                            GameScreen.LoginScreen(by5).MyHashtable();
                            return;
                        }
                    }
                    break;
                }
                case -125: {
                    cq.b().b = false;
                    String string = ((Message)object).c().readUTF();
                    ds.c("titile= " + string);
                    int n15 = ((Message)object).c().readByte();
                    er.LoginScreen().LoginScreen(n15, string);
                    int n16 = 0;
                    while (n16 < n15) {
                        er.LoginScreen().LoginScreen[n16].i = ((Message)object).c().readUTF();
                        byte by42 = ((Message)object).c().readByte();
                        if (by42 == 0) {
                            er.LoginScreen().LoginScreen[n16].c(1);
                        }
                        if (by42 == 1) {
                            er.LoginScreen().LoginScreen[n16].c(0);
                        }
                        if (by42 == 2) {
                            er.LoginScreen().LoginScreen[n16].c(2);
                        }
                        ++n16;
                    }
                    return;
                }
                case -110: {
                    int n46;
                    byte by6 = ((Message)object).c().readByte();
                    if (by6 == 1) {
                        n46 = ((Message)object).c().readInt();
                        byte[] byArray = RMS.b(String.valueOf(n46));
                        if (byArray == null) {
                            GameService.LoginScreen().LoginScreen((byte)1, -1, (byte[])null);
                        } else {
                            GameService.LoginScreen().LoginScreen((byte)1, n46, byArray);
                        }
                    }
                    if (by6 == 0) {
                        n46 = ((Message)object).c().readInt();
                        short s25 = ((Message)object).c().readShort();
                        byte[] byArray = new byte[s25];
                        ((Message)object).c().read(byArray, 0, s25);
                        RMS.LoginScreen(String.valueOf(n46), byArray);
                        return;
                    }
                    break;
                }
                case 93: {
                    String string = ((Message)object).c().readUTF();
                    string = ds.LoginScreen(string);
                    GameScreen.j().LoginScreen(string);
                    return;
                }
                case -106: {
                    short s26 = ((Message)object).c().readShort();
                    short s27 = ((Message)object).c().readShort();
                    if (cy.LoginScreen(s26)) {
                        cy.c(s26).LoginScreen(s27, false);
                        return;
                    }
                    cy cy2 = new cy(s26, s27);
                    Char.Session.addElement(cy2);
                    return;
                }
                case -105: {
                    au.LoginScreen().b = 0;
                    au.LoginScreen().c = ((Message)object).c().readShort();
                    au.LoginScreen().d = au.LoginScreen().e = System.currentTimeMillis();
                    au.LoginScreen().LoginScreen = ((Message)object).c().readByte();
                    au.LoginScreen().b();
                    return;
                }
                case -103: {
                    int n47 = ((Message)object).c().readByte();
                    ds.c("server gui ve actionFlag = " + n47);
                    if (n47 == 0) {
                        GameCanvas.G.Y.removeAllElements();
                        n47 = ((Message)object).c().readByte();
                        int n48 = 0;
                        while (n48 < n47) {
                            Item h3 = new Item();
                            short s9 = ((Message)object).c().readShort();
                            if (s9 != -1) {
                                h3.b = dp.LoginScreen(s9);
                                byte by7 = ((Message)object).c().readByte();
                                if (by7 != -1) {
                                    h3.LoginScreen = new ee[by7];
                                    int n17 = 0;
                                    while (n17 < h3.LoginScreen.length) {
                                        MessageHandler.LoginScreen();
                                        ee ee2 = MessageHandler.b((Message)object);
                                        if (ee2 != null) {
                                            h3.LoginScreen[n17] = ee2;
                                        }
                                        ++n17;
                                    }
                                }
                            }
                            GameCanvas.G.Y.addElement(h3);
                            ++n48;
                        }
                        GameCanvas.G.Item();
                        GameCanvas.G.SessionReceiver();
                        return;
                    }
                    if (n47 == 1) {
                        n47 = ((Message)object).c().readInt();
                        byte by45 = ((Message)object).c().readByte();
                        ds.c("---------------actionFlag1:  " + n47 + " : " + by45);
                        if (n47 == Char.e().J) {
                            Char.e().by = by45;
                        } else if (GameScreen.b(n47) != null) {
                            GameScreen.b((int)n47).by = by45;
                        }
                        GameScreen.j();
                        GameScreen.LoginScreen(n47, by45);
                        return;
                    }
                    if (n47 == 2) {

                        Object object2;

                        n47 = ((Message)object).c().readByte();
                        short s29 = ((Message)object).c().readShort();
                        ep ep2 = new ep();
                        new ep().LoginScreen = (byte)n47;
                        ep2.b = s29;
                        GameScreen.H.addElement(ep2);
                        boolean bl2 = false;
                        while (var4_153 < GameScreen.H.size()) {
                            object2 = (ep)GameScreen.H.elementAt((int)var4_153);
                            ds.c("i: " + (int)var4_153 + "  cflag: " + ((ep)object2).LoginScreen + "   IDimageFlag: " + ((ep)object2).b);
                            ++var4_153;
                        }
                        boolean bl3 = false;
                        while (var4_155 < GameScreen.D.size()) {
                            object2 = (Char)GameScreen.D.elementAt((int)var4_155);
                            if (object2 != null && ((Char)object2).by == n47) {
                                ((Char)object2).bz = s29;
                            }
                            ++var4_155;
                        }
                        if (Char.e().by == n47) {
                            Char.e().bz = s29;
                            return;
                        }
                    }
                    break;
                }
                case -102: {
                    byte by46 = ((Message)object).c().readByte();
                    if (by46 != 0 && by46 == 1) {
                        GameCanvas.I.n = false;
                        GameService.LoginScreen().LoginScreen(RMS.c("acc"), RMS.c("pass"), Config.VERSION, (byte)0);
                        return;
                    }
                    break;
                }
                case -101: {
                    if (GameCanvas.I == null) {
                        GameCanvas.I = new x();
                    }
                    GameCanvas.I.n = true;
                    GameCanvas.b();
                    String string = ((Message)object).c().readUTF();
                    RMS.LoginScreen("userAo" + ServerListScreen.n, string);
                    GameService.LoginScreen().c();
                    GameService.LoginScreen().LoginScreen(string, "", Config.VERSION, (byte)1);
                    return;
                }
                case -100: {
                    byte by8;
                    bp.c();
                    boolean bl2 = false;
                    if (GameCanvas.A > 2 * g.ab) {
                        bl2 = true;
                    }
                    if ((by8 = ((Message)object).c().readByte()) < 0) break;
                    ds.c("MyHashtable Indxe= " + by8);
                    GameCanvas.G.K[by8] = ((Message)object).c().readByte();
                    GameCanvas.G.L[by8] = ((Message)object).c().readByte();
                    ds.c("max page= " + GameCanvas.G.K[by8] + " curr page= " + GameCanvas.G.L[by8]);
                    int n18 = ((Message)object).c().readUnsignedByte();
                    Char.e().aJ[by8] = new Item[n18];
                    g.ar = T.es;
                    int n19 = 0;
                    while (n19 < n18) {
                        short s10 = ((Message)object).c().readShort();
                        if (s10 != -1) {
                            int n20;
                            Char.e().aJ[by8][n19] = new Item();
                            Char.e().aJ[by8][n19].b = dp.LoginScreen(s10);
                            Char.e().aJ[by8][n19].d = ((Message)object).c().readShort();
                            Char.e().aJ[by8][n19].n = ((Message)object).c().readInt();
                            Char.e().aJ[by8][n19].GameScreen = ((Message)object).c().readInt();
                            Char.e().aJ[by8][n19].v = ((Message)object).c().readByte();
                            Char.e().aJ[by8][n19].Item = ((Message)object).c().readInt();
                            Char.e().aJ[by8][n19].B = ((Message)object).c().readByte();
                            byte by9 = ((Message)object).c().readByte();
                            if (by9 != -1) {
                                Char.e().aJ[by8][n19].LoginScreen = new ee[by9];
                                n20 = 0;
                                while (n20 < Char.e().aJ[by8][n19].LoginScreen.length) {
                                    MessageHandler.LoginScreen();
                                    ee ee3 = MessageHandler.b((Message)object);
                                    if (ee3 != null) {
                                        Char.e().aJ[by8][n19].LoginScreen[n20] = ee3;
                                        Char.e().aJ[by8][n19].A = GameCanvas.G.LoginScreen(Char.e().aJ[by8][n19]);
                                    }
                                    ++n20;
                                }
                            }
                            if ((n20 = ((Message)object).c().readByte()) == 1) {
                                short s11 = ((Message)object).c().readShort();
                                short s12 = ((Message)object).c().readShort();
                                short s13 = ((Message)object).c().readShort();
                                short s14 = ((Message)object).c().readShort();
                                Char.e().aJ[by8][n19].LoginScreen(s11, s12, s13, s14);
                            }
                            if (GameMidlet.e >= 237) {
                                Char.e().aJ[by8][n19].H = ((Message)object).c().readUTF();
                                ds.b("nguoi ki gui  " + Char.e().aJ[by8][n19].H);
                            }
                        }
                        ++n19;
                    }
                    if (bl2) {
                        GameCanvas.H.e();
                    }
                    GameCanvas.G.Message();
                    GameCanvas.G.f = 0;
                    GameCanvas.G.g = 0;
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    private static void b(Message y2) {
        try {
            byte by2 = y2.c().readByte();
            if (by2 == 0) {
                by2 = y2.c().readByte();
                short[] sArray = new short[by2];
                byte by3 = 0;
                while (by3 < by2) {
                    sArray[by3] = y2.c().readShort();
                    ++by3;
                }
                by3 = y2.c().readByte();
                by2 = y2.c().readInt();
                short s2 = y2.c().readShort();
                ar.LoginScreen().LoginScreen(sArray, by3, by2, s2);
                return;
            }
            if (by2 == 1) {
                by2 = y2.c().readByte();
                short[] sArray = new short[by2];
                byte by4 = 0;
                while (by4 < by2) {
                    sArray[by4] = y2.c().readShort();
                    ++by4;
                }
                ar.LoginScreen().LoginScreen(sArray);
                return;
            }
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
    }

    private static void methodLoginScreen(Message y2, int n2) {
        try {
            int n3;
            byte by2 = y2.c().readByte();
            cl cl2 = Mob.LoginScreen(by2);
            if (cl2 == null) {
                return;
            }
            if (n2 == 10) {
                n3 = y2.c().readShort();
                short s2 = y2.c().readShort();
                cl2.LoginScreen((short)n3, s2);
            }
            if (n2 >= 11 && n2 <= 20) {
                byte by3 = y2.c().readByte();
                n3 = by3;
                Char[] afArray = new Char[by3];
                long[] lArray = new long[n3];
                int n4 = 0;
                while (n4 < n3) {
                    int n5 = y2.c().readInt();
                    afArray[n4] = null;
                    afArray[n4] = n5 != Char.e().J ? GameScreen.b(n5) : Char.e();
                    lArray[n4] = y2.c().readLong();
                    ++n4;
                }
                n4 = y2.c().readByte();
                cl2.LoginScreen(afArray, lArray, (byte)(n2 - 10), (byte)n4);
            }
            if (n2 == 21) {
                cl2.LoginScreen = y2.c().readShort();
                cl2.b = y2.c().readShort();
                cl2.C();
            }
            if (n2 == 23) {
                cl2.D();
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }
}

