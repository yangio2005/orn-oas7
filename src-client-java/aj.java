/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import main.GameMidlet;
import main.GameCanvas;

public class aj {
    int a;
    int IActionListener;
    int c;
    int d;
    int e;
    int f;
    int UIPanel;
    int h;
    int i;
    int j;
    float k;
    long ResourceUtil;
    long m;
    boolean n;
    int[] o;
    int[] GameScreen;

    public aj(int n2, int n3, int n4, int n5, int n6) {
        this.i = 0;
        this.j = 0xFF0000;
        this.l = 0L;
        this.m = 150L;
        this.n = true;
        this.o = new int[2];
        this.GameScreen = new int[2];
        this.g = n3;
        this.d = n2;
        this.k = 1.0f;
        this.c = n4;
        this.h = n5;
        this.a = main.GameCanvas.A;
        this.b = main.GameCanvas.B;
        this.l = System.currentTimeMillis();
        n4 = 0;
        while (n4 < 2) {
            this.o[n4] = n2;
            this.GameScreen[n4] = n3;
            ++n4;
        }
        this.j = n6;
    }

    public static void a(MGraphics en2, int n2, int n3, int n4) {
        en2.a(n4);
        en2.d(n2, n3, 1, 2);
    }

    public aj() {
    }

    /*
     * WARNING - void declaration
     */
    public static void a(Message object) {
        try {
            switch (((Message)object).a) {
                case -128: {
                    Object y2 = object;
                    try {
                        byte by2 = ((Message)y2).c().readByte();
                        int n2 = ((Message)y2).c().readInt();
                        GameWorld af2 = n2 == GameWorld.e().J ? GameWorld.e() : GameScreen.IActionListener(n2);
                        if (by2 == 0) {
                            short s2 = ((Message)y2).c().readShort();
                            byte by3 = ((Message)y2).c().readByte();
                            byte by4 = ((Message)y2).c().readByte();
                            short s3 = ((Message)y2).c().readShort();
                            byte by5 = ((Message)y2).c().readByte();
                            if (af2 != null) {
                                af2.a(new ea((int)s2, af2, (int)by3, (int)by4, (int)s3, by5));
                            }
                            break;
                        }
                        if (by2 == 1) {
                            short s4 = ((Message)y2).c().readShort();
                            if (af2 != null) {
                                af2.IActionListener(0, (int)s4);
                            }
                            break;
                        }
                        if (by2 == 2) {
                            if (af2 != null) {
                                af2.IActionListener(-1, 0);
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
                            aq.a();
                            LoggingList el2 = new LoggingList("");
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
                                GameWorld af3 = null;
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
                                    GameWorld af4 = new GameWorld();
                                    new GameWorld().bU = s9;
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
                                        MessageHandler.a();
                                        ee ee2 = MessageHandler.IActionListener((Message)y3);
                                        byte by16 = ((Message)y3).c().readByte();
                                        if (ee2 != null) {
                                            eeArray[n9] = ee2;
                                            eeArray[n9].IActionListener = by16;
                                        }
                                        ++n9;
                                    }
                                }
                                ee[] eeArray2 = eeArray;
                                GameWorld af5 = af3;
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
                                ef3.UIPanel = by7;
                                ef3.a = by18;
                                ef3.d = by17;
                                if (n10 != -1) {
                                    ef3.m = new aa();
                                    ef3.m.C = n10;
                                }
                                ef3.h = string4;
                                ef3.i = string3;
                                ef3.ResourceUtil = af5;
                                ef3.n = eeArray2;
                                ef3.a();
                                ef2.a(by9);
                                ef2.IActionListener(by8);
                                ef2.a(by12, by13);
                                el2.addElement(ef2);
                                if (by9 > 0) {
                                    ++n4;
                                }
                                ++n5;
                            }
                            aq.a().a(el2, n4, n3);
                            break;
                        }
                        if (by6 == 1) {
                            short s10 = ((Message)y3).c().readShort();
                            byte by19 = ((Message)y3).c().readByte();
                            if (ef.a(aq.f, s10) != null) {
                                ef.a(aq.f, s10).IActionListener(by19);
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
                                        ef4.a(by20);
                                    }
                                    if (ef4.j > 0) {
                                        ++n11;
                                    }
                                }
                                ++n12;
                            }
                            aq.a(n11, aq.f.size());
                            if (ef.a(aq.UIPanel, s11) != null) {
                                ef.a(aq.UIPanel, s11).a(by20);
                                break;
                            }
                        } else if (by6 == 3) {
                            short s12 = ((Message)y3).c().readShort();
                            byte by21 = ((Message)y3).c().readByte();
                            byte by22 = ((Message)y3).c().readByte();
                            if (ef.a(aq.f, s12) != null) {
                                ef.a(aq.f, s12).a(by21, by22);
                            }
                            if (ef.a(aq.UIPanel, s12) != null) {
                                ef.a(aq.UIPanel, s12).a(by21, by22);
                                break;
                            }
                        } else if (by6 == 4) {
                            int n13 = ((Message)y3).c().readInt();
                            short s13 = ((Message)y3).c().readShort();
                            GameWorld af6 = n13 == GameWorld.e().J ? GameWorld.e() : GameScreen.IActionListener(n13);
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
                        ResourceUtil.e = ((Message)object).c().readByte();
                        ResourceUtil.f = ((Message)object).c().readByte();
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
                    ei.a(new ea(n14, nArray, n2, (int)by24, (int)by23, n3));
                    return;
                }
                case 48: {
                    byte by25 = ((Message)object).c().readByte();
                    bs.a(by25, false);
                    main.GameCanvas.e();
                    NetworkService.a().e();
                    main.GameCanvas.h();
                    bs.m = true;
                    return;
                }
                case 31: {
                    int n18 = ((Message)object).c().readInt();
                    short s14 = ((Message)object).c().readByte();
                    if (s14 == 1) {
                        void by31;
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
                        if (n18 == GameWorld.e().J) {
                            GameWorld.e().v = new Dialog();
                            GameWorld.e().v.a = s14;
                            if (n19 > 0) {
                                GameWorld.e().v.a(n19, (int[])by31, s2, n4);
                                return;
                            }
                        } else {
                            GameWorld af2 = GameScreen.IActionListener(n18);
                            GameScreen.IActionListener(n18).v = new Dialog();
                            af2.v.a = s14;
                            if (n19 > 0) {
                                af2.v.a(n19, (int[])by31, s2, n4);
                                return;
                            }
                        }
                        break;
                    }
                    if (n18 == GameWorld.e().J) {
                        GameWorld.e().v.a();
                        GameWorld.e().v = null;
                        return;
                    }
                    GameWorld af8 = GameScreen.IActionListener(n18);
                    af8.v.a();
                    af8.v = null;
                    return;
                }
                case -89: {
                    main.GameCanvas.an = ((Message)object).c().readByte() == 1;
                    return;
                }
                case 42: {
                    main.GameCanvas.h();
                    x.c = false;
                    GameWorld.bI = false;
                    byte by27 = ((Message)object).c().readByte();
                    if (main.GameCanvas.J == null) {
                        main.GameCanvas.J = new bi(by27);
                    }
                    main.GameCanvas.J.IActionListener();
                    return;
                }
                case 52: {
                    GameWorld af3;
                    byte by28 = ((Message)object).c().readByte();
                    if (by28 == 1) {
                        int by36 = ((Message)object).c().readInt();
                        if (by36 == GameWorld.e().J) {
                            GameWorld.e().c(true);
                            GameWorld.e().B = ((Message)object).c().readShort();
                            GameWorld.e().C = ((Message)object).c().readShort();
                        } else {
                            af3 = GameScreen.IActionListener(by36);
                            if (af3 != null) {
                                af3.c(true);
                                af3.B = ((Message)object).c().readShort();
                                af3.C = ((Message)object).c().readShort();
                            }
                        }
                    }
                    if (by28 == 0) {
                        int s21 = ((Message)object).c().readInt();
                        if (s21 == GameWorld.e().J) {
                            GameWorld.e().c(false);
                        } else {
                            af3 = GameScreen.IActionListener(s21);
                            if (af3 != null) {
                                af3.c(false);
                            }
                        }
                    }
                    if (by28 == 2) {
                        int af10 = ((Message)object).c().readInt();
                        int n7 = ((Message)object).c().readInt();
                        al al2 = (al)GameScreen.IActionListener(af10);
                        al2.c(n7);
                    }
                    if (by28 == 3) {
                        GameScreen.bW = ((Message)object).c().readByte();
                        return;
                    }
                    break;
                }
                case 51: {
                    void s28;
                    int by39 = ((Message)object).c().readInt();
                    al al3 = (al)GameScreen.IActionListener(by39);
                    byte by3 = ((Message)object).c().readByte();
                    short s3 = ((Message)object).c().readShort();
                    short s4 = ((Message)object).c().readShort();
                    byte by30 = ((Message)object).c().readByte();
                    GameWorld[] afArray = new GameWorld[by30];
                    long[] lArray = new long[by30];
                    boolean n44 = false;
                    while (s28 < by30) {
                        int n8 = ((Message)object).c().readInt();
                        MathUtil.c("char ID=" + n8);
                        afArray[s28] = null;
                        afArray[s28] = n8 != GameWorld.e().J ? GameScreen.IActionListener(n8) : GameWorld.e();
                        lArray[s28] = ((Message)object).c().readLong();
                        ++s28;
                    }
                    al3.a(by3, s3, s4, afArray, lArray);
                    return;
                }
                case -127: {
                    aj.IActionListener((Message)object);
                    return;
                }
                case -126: {
                    byte n50 = ((Message)object).c().readByte();
                    MathUtil.c("type quay= " + n50);
                    if (n50 == 1) {
                        ((Message)object).c().readByte();
                        String string = ((Message)object).c().readUTF();
                        String string5 = ((Message)object).c().readUTF();
                        GameScreen.j().IActionListener(string, string5);
                    }
                    if (n50 == 0) {
                        GameScreen.j().IActionListener(((Message)object).c().readUTF());
                        return;
                    }
                    break;
                }
                case -122: {
                    short s5 = ((Message)object).c().readShort();
                    do do_ = GameScreen.a(s5);
                    int n27 = ((Message)object).c().readByte();
                    do_.dj = new int[n27];
                    int n28 = 0;
                    while (n28 < n27) {
                        do_.dj[n28] = ((Message)object).c().readShort();
                        ++n28;
                    }
                    do_.a(((Message)object).c().readByte(), ((Message)object).c().readInt());
                    return;
                }
                case 102: {
                    int n9;
                    int n10;
                    long[] lArray;
                    GameWorld[] afArray;
                    int n31;
                    aa aa2;
                    byte by32 = ((Message)object).c().readByte();
                    if (by32 == 0 || by32 == 1 || by32 == 2 || by32 == 6) {
                        aa2 = aa.x();
                        if (aa2 == null) {
                            return;
                        }
                        if (by32 == 6) {
                            aa2.u = -1000;
                            aa2.t = -1000;
                            ((d)aa2).IActionListener = -1000;
                            ((d)aa2).a = -1000;
                            aa2.n = -1000;
                            aa2.m = -1000;
                            return;
                        }
                        n31 = ((Message)object).c().readByte();
                        afArray = new GameWorld[n31];
                        lArray = new long[n31];
                        n10 = 0;
                        while (n10 < n31) {
                            n9 = ((Message)object).c().readInt();
                            afArray[n10] = null;
                            afArray[n10] = n9 != GameWorld.e().J ? GameScreen.IActionListener(n9) : GameWorld.e();
                            lArray[n10] = ((Message)object).c().readLong();
                            ++n10;
                        }
                        ((d)aa2).a(afArray, lArray, by32);
                    }
                    if (by32 == 3 || by32 == 4 || by32 == 5 || by32 == 7) {
                        aa2 = aa.Message();
                        if (aa2 == null) {
                            return;
                        }
                        if (by32 == 7) {
                            aa2.u = -1000;
                            aa2.t = -1000;
                            ((an)aa2).IActionListener = -1000;
                            ((an)aa2).a = -1000;
                            aa2.n = -1000;
                            aa2.m = -1000;
                            return;
                        }
                        if (by32 == 3 || by32 == 4) {
                            n31 = ((Message)object).c().readByte();
                            afArray = new GameWorld[n31];
                            lArray = new long[n31];
                            n10 = 0;
                            while (n10 < n31) {
                                n9 = ((Message)object).c().readInt();
                                afArray[n10] = null;
                                afArray[n10] = n9 != GameWorld.e().J ? GameScreen.IActionListener(n9) : GameWorld.e();
                                lArray[n10] = ((Message)object).c().readLong();
                                ++n10;
                            }
                            ((an)aa2).a(afArray, lArray, by32);
                        }
                        if (by32 == 5) {
                            n31 = ((Message)object).c().readShort();
                            ((an)aa2).IActionListener((short)n31);
                        }
                    }
                    if (by32 > 9 && by32 < 30) {
                        aj.a((Message)object, by32);
                        return;
                    }
                    break;
                }
                case 101: {
                    MathUtil.c("big boss--------------------------------------------------");
                    cc cc2 = aa.w();
                    if (cc2 == null) {
                        return;
                    }
                    byte by33 = ((Message)object).c().readByte();
                    if (by33 == 0 || by33 == 1 || by33 == 2 || by33 == 4 || by33 == 3) {
                        if (by33 == 3) {
                            short s6 = ((Message)object).c().readShort();
                            cc2.t = s6;
                            cc2.a = s6;
                            cc2.u = ((Message)object).c().readShort();
                            cc2.D();
                        } else {
                            int n11 = ((Message)object).c().readByte();
                            MathUtil.c("CHUONG nChar= " + n11);
                            GameWorld[] afArray = new GameWorld[n11];
                            long[] lArray = new long[n11];
                            int n12 = 0;
                            while (n12 < n11) {
                                int n34 = ((Message)object).c().readInt();
                                MathUtil.c("char ID=" + n34);
                                afArray[n12] = null;
                                afArray[n12] = n34 != GameWorld.e().J ? GameScreen.IActionListener(n34) : GameWorld.e();
                                lArray[n12] = ((Message)object).c().readLong();
                                ++n12;
                            }
                            cc2.a(afArray, lArray, by33);
                        }
                    }
                    if (by33 == 5) {
                        cc2.IActionListener = true;
                        cc2.GameScreen = 2;
                    }
                    if (by33 == 6) {
                        cc2.C();
                        cc2.m = ((Message)object).c().readShort();
                        cc2.n = ((Message)object).c().readShort();
                    }
                    if (by33 == 7) {
                        cc2.a(null, null, by33);
                    }
                    if (by33 == 8) {
                        short s7 = ((Message)object).c().readShort();
                        cc2.t = s7;
                        cc2.a = s7;
                        cc2.u = ((Message)object).c().readShort();
                        cc2.GameScreen = 2;
                    }
                    if (by33 == 9) {
                        cc2.u = -1000;
                        cc2.t = -1000;
                        cc2.a = -1000;
                        cc2.n = -1000;
                        cc2.m = -1000;
                        return;
                    }
                    break;
                }
                case -120: {
                    long l2 = ResourceUtil.d();
                    GameService.d = l2 - GameService.IActionListener;
                    GameService.a().d();
                    return;
                }
                case -121: {
                    long l3 = ResourceUtil.d();
                    GameService.e = l3 - GameService.c;
                    GameService.a().e();
                    return;
                }
                case 100: {
                    byte by34 = ((Message)object).c().readByte();
                    int n35 = ((Message)object).c().readByte();
                    h h2 = null;
                    if (by34 == 0) {
                        h2 = GameWorld.e().aH[n35];
                    }
                    if (by34 == 1) {
                        h2 = GameWorld.e().aF[n35];
                    }
                    if ((n35 = ((Message)object).c().readShort()) != -1) {
                        h2.IActionListener = dp.a((short)n35);
                        h2.h = ((Message)object).c().readInt();
                        ((Message)object).c().readUTF();
                        ((Message)object).c().readUTF();
                        byte by4 = ((Message)object).c().readByte();
                        n35 = by4;
                        if (by4 != 0) {
                            h2.a = new ee[n35];
                            n35 = 0;
                            while (n35 < h2.GameCanvas.length) {
                                MessageHandler.a();
                                ee ee3 = MessageHandler.IActionListener((Message)object);
                                if (ee3 != null) {
                                    h2.a[n35] = ee3;
                                }
                                ++n35;
                            }
                        }
                        if (h2.h <= 0) {
                            return;
                        }
                    }
                    break;
                }
                case -123: {
                    int n36 = ((Message)object).c().readInt();
                    if (GameScreen.IActionListener(n36) != null) {
                        GameScreen.IActionListener((int)n36).cS = ((Message)object).c().readByte();
                        return;
                    }
                    break;
                }
                case -119: {
                    GameWorld.e().w = ((Message)object).c().readInt();
                    return;
                }
                case -117: {
                    GameScreen.j().bU = 0;
                    GameScreen.j().bS = ((Message)object).c().readByte();
                    if (GameScreen.j().bS == 100) {
                        GameScreen.j().bT = true;
                    }
                    if (GameScreen.j().bS == 101) {
                        do.mFont = true;
                        return;
                    }
                    break;
                }
                case -116: {
                    GameScreen.bk = ((Message)object).c().readByte() == 1;
                    return;
                }
                case -115: {
                    GameWorld.e().a(((Message)object).c().readUTF(), ((Message)object).c().readShort(), ((Message)object).c().readShort(), ((Message)object).c().readShort());
                    return;
                }
                case -113: {
                    byte[] byArray = new byte[10];
                    int n37 = 0;
                    while (n37 < 10) {
                        byArray[n37] = ((Message)object).c().readByte();
                        ++n37;
                    }
                    GameScreen.j().IActionListener(byArray);
                    GameScreen.j().a(byArray);
                    GameScreen.j().c(byArray);
                    return;
                }
                case -111: {
                    int n38 = ((Message)object).c().readShort();
                    u.IActionListener = new LoggingList("");
                    int n39 = 0;
                    while (n39 < n38) {
                        String string = ((Message)object).c().readUTF();
                        byte by47 = ((Message)object).c().readByte();
                        u.IActionListener.addElement(new u(string, by47));
                        ++n39;
                    }
                    u.a();
                    u.IActionListener();
                    return;
                }
                case 125: {
                    byte by37 = ((Message)object).c().readByte();
                    int n40 = ((Message)object).c().readInt();
                    if (n40 == GameWorld.e().J) {
                        GameWorld.e().IActionListener(by37);
                        return;
                    }
                    if (GameScreen.IActionListener(n40) != null) {
                        GameScreen.IActionListener(n40).IActionListener(by37);
                        return;
                    }
                    break;
                }
                case 124: {
                    short s8 = ((Message)object).c().readShort();
                    object = ((Message)object).c().readUTF();
                    MathUtil.c("noi chuyen = " + (String)object + "npc ID= " + s8);
                    do do_ = GameScreen.a(s8);
                    if (do_ != null) {
                        do_.a((String)object);
                        return;
                    }
                    break;
                }
                case 123: {
                    void var4_147;
                    int n41 = ((Message)object).c().readInt();
                    short s22 = ((Message)object).c().readShort();
                    short s23 = ((Message)object).c().readShort();
                    byte by38 = ((Message)object).c().readByte();
                    MathUtil.c("SET POSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSss x= " + s22 + " Message= " + s23 + "chaPos= " + n41 + "type Pos= " + by38);
                    Object var4_144 = null;
                    if (n41 == GameWorld.e().J) {
                        GameWorld af4 = GameWorld.e();
                    } else if (GameScreen.IActionListener(n41) != null) {
                        GameWorld af5 = GameScreen.IActionListener(n41);
                    }
                    if (var4_147 != null) {
                        at.a(by38 == 0 ? 60 : 173, (GameWorld)var4_147, 1);
                        var4_147.a(s22, s23, by38);
                        return;
                    }
                    break;
                }
                case 122: {
                    short s24 = ((Message)object).c().readShort();
                    MathUtil.c("second login = " + s24);
                    x.k = s24;
                    x.m = LoginScreen.ResourceUtil = System.currentTimeMillis();
                    main.GameCanvas.h();
                    return;
                }
                case 121: {
                    ResourceUtil.UIPanel = ((Message)object).c().readUTF();
                    ((Message)object).c().readUTF();
                    MathUtil.c("SHOW AD public ID= " + ResourceUtil.UIPanel);
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
                            if (n43 == GameWorld.e().J) {
                                GameWorld.e().S();
                            } else if (GameScreen.IActionListener(n43) != null) {
                                GameScreen.IActionListener(n43).S();
                            }
                        }
                        n43 = ((Message)object).c().readUnsignedByte();
                        int n14 = ((Message)object).c().readInt();
                        MathUtil.c("playerID= " + n14 + " skillID= " + n43);
                        if (n43 == 32) {
                            if (by40 == 1) {
                                n13 = ((Message)object).c().readInt();
                                if (n14 == GameWorld.e().J) {
                                    GameWorld.e().cI = n43;
                                    GameScreen.IActionListener(n13).IActionListener(GameWorld.e());
                                } else if (GameScreen.IActionListener(n14) != null && n13 != GameWorld.e().J) {
                                    GameScreen.IActionListener((int)n14).cI = n43;
                                    GameScreen.IActionListener(n13).IActionListener(GameScreen.IActionListener(n14));
                                } else if (GameScreen.IActionListener(n14) != null && n13 == GameWorld.e().J) {
                                    GameScreen.IActionListener((int)n14).cI = n43;
                                    GameWorld.e().IActionListener(GameScreen.IActionListener(n14));
                                }
                            } else if (n14 == GameWorld.e().J) {
                                GameWorld.e().P();
                            } else if (GameScreen.IActionListener(n14) != null) {
                                GameScreen.IActionListener(n14).P();
                            }
                        }
                        if (n43 == 33) {
                            if (by40 == 1) {
                                if (n14 == GameWorld.e().J) {
                                    GameWorld.e().cK = true;
                                } else if (GameScreen.IActionListener(n14) != null) {
                                    GameScreen.IActionListener((int)n14).cK = true;
                                }
                            } else if (n14 == GameWorld.e().J) {
                                GameWorld.e().Q();
                            } else if (GameScreen.IActionListener(n14) != null) {
                                GameScreen.IActionListener(n14).Q();
                            }
                        }
                        if (n43 == 39) {
                            if (by40 == 1) {
                                if (n14 == GameWorld.e().J) {
                                    GameWorld.e().cN = true;
                                } else if (GameScreen.IActionListener(n14) != null) {
                                    GameScreen.IActionListener((int)n14).cN = true;
                                }
                            } else if (n14 == GameWorld.e().J) {
                                GameWorld.e().T();
                            } else if (GameScreen.IActionListener(n14) != null) {
                                GameScreen.IActionListener(n14).T();
                            }
                        }
                        if (n43 == 40) {
                            if (by40 == 1) {
                                if (n14 == GameWorld.e().J) {
                                    GameWorld.e().cO = true;
                                } else if (GameScreen.IActionListener(n14) != null) {
                                    GameScreen.IActionListener((int)n14).cO = true;
                                }
                            } else if (n14 == GameWorld.e().J) {
                                GameWorld.e().R();
                            } else if (GameScreen.IActionListener(n14) != null) {
                                GameScreen.IActionListener(n14).R();
                            }
                        }
                        if (n43 == 41) {
                            if (by40 == 1) {
                                if (n14 == GameWorld.e().J) {
                                    GameWorld.e().cQ = true;
                                } else if (GameScreen.IActionListener(n14) != null) {
                                    GameScreen.IActionListener((int)n14).cQ = true;
                                }
                            } else if (n14 == GameWorld.e().J) {
                                GameWorld.e().V();
                            } else if (GameScreen.IActionListener(n14) != null) {
                                GameScreen.IActionListener(n14).V();
                            }
                        }
                        if (n43 == 42) {
                            if (by40 == 1) {
                                if (n14 == GameWorld.e().J) {
                                    GameWorld.e().cR = true;
                                }
                            } else if (n14 == GameWorld.e().J) {
                                GameWorld.e().cR = false;
                                MathUtil.c("tra ve huy chieu 2");
                            }
                        }
                    }
                    if (by41 == 1) {
                        n43 = ((Message)object).c().readUnsignedByte();
                        byte by5 = ((Message)object).c().readByte();
                        MathUtil.c("modbHoldID= " + by5 + " skillID= " + n43 + "eff ID= " + by40);
                        if (n43 == 32) {
                            if (by40 == 1) {
                                n13 = ((Message)object).c().readInt();
                                if (n13 == GameWorld.e().J) {
                                    GameScreen.a((byte)by5).j = n43;
                                    GameWorld.e().a(GameScreen.a(by5));
                                } else if (GameScreen.IActionListener(n13) != null) {
                                    GameScreen.a((byte)by5).j = n43;
                                    GameScreen.IActionListener(n13).a(GameScreen.a(by5));
                                }
                            } else {
                                GameScreen.a(by5).r();
                            }
                        }
                        if (n43 == 40) {
                            if (by40 == 1) {
                                GameScreen.a((byte)by5).ab = true;
                            } else {
                                GameScreen.a(by5).s();
                            }
                        }
                        if (n43 == 41) {
                            if (by40 == 1) {
                                GameScreen.a((byte)by5).MessageHandler = true;
                                return;
                            }
                            GameScreen.a(by5).t();
                            return;
                        }
                    }
                    break;
                }
                case -125: {
                    cq.IActionListener().IActionListener = false;
                    String string = ((Message)object).c().readUTF();
                    MathUtil.c("titile= " + string);
                    int n15 = ((Message)object).c().readByte();
                    er.a().a(n15, string);
                    int n16 = 0;
                    while (n16 < n15) {
                        er.a().a[n16].i = ((Message)object).c().readUTF();
                        byte by42 = ((Message)object).c().readByte();
                        if (by42 == 0) {
                            er.a().a[n16].c(1);
                        }
                        if (by42 == 1) {
                            er.a().a[n16].c(0);
                        }
                        if (by42 == 2) {
                            er.a().a[n16].c(2);
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
                        byte[] byArray = RMSManager.IActionListener(String.valueOf(n46));
                        if (byArray == null) {
                            GameService.a().a((byte)1, -1, (byte[])null);
                        } else {
                            GameService.a().a((byte)1, n46, byArray);
                        }
                    }
                    if (by6 == 0) {
                        n46 = ((Message)object).c().readInt();
                        short s25 = ((Message)object).c().readShort();
                        byte[] byArray = new byte[s25];
                        ((Message)object).c().read(byArray, 0, s25);
                        RMSManager.a(String.valueOf(n46), byArray);
                        return;
                    }
                    break;
                }
                case 93: {
                    String string = ((Message)object).c().readUTF();
                    string = MathUtil.a(string);
                    GameScreen.j().a(string);
                    return;
                }
                case -106: {
                    short s26 = ((Message)object).c().readShort();
                    short s27 = ((Message)object).c().readShort();
                    if (cy.a(s26)) {
                        cy.c(s26).a(s27, false);
                        return;
                    }
                    cy cy2 = new cy(s26, s27);
                    GameWorld.NetworkService.addElement(cy2);
                    return;
                }
                case -105: {
                    au.a().IActionListener = 0;
                    au.a().c = ((Message)object).c().readShort();
                    au.a().d = au.a().e = System.currentTimeMillis();
                    au.a().a = ((Message)object).c().readByte();
                    au.a().IActionListener();
                    return;
                }
                case -103: {
                    int n47 = ((Message)object).c().readByte();
                    MathUtil.c("server gui ve actionFlag = " + n47);
                    if (n47 == 0) {
                        main.GameCanvas.G.Y.removeAllElements();
                        n47 = ((Message)object).c().readByte();
                        int n48 = 0;
                        while (n48 < n47) {
                            h h3 = new h();
                            short s9 = ((Message)object).c().readShort();
                            if (s9 != -1) {
                                h3.IActionListener = dp.a(s9);
                                byte by7 = ((Message)object).c().readByte();
                                if (by7 != -1) {
                                    h3.a = new ee[by7];
                                    int n17 = 0;
                                    while (n17 < h3.GameCanvas.length) {
                                        MessageHandler.a();
                                        ee ee2 = MessageHandler.IActionListener((Message)object);
                                        if (ee2 != null) {
                                            h3.a[n17] = ee2;
                                        }
                                        ++n17;
                                    }
                                }
                            }
                            main.GameCanvas.G.Y.addElement(h3);
                            ++n48;
                        }
                        main.GameCanvas.G.h();
                        main.GameCanvas.G.s();
                        return;
                    }
                    if (n47 == 1) {
                        n47 = ((Message)object).c().readInt();
                        byte by45 = ((Message)object).c().readByte();
                        MathUtil.c("---------------actionFlag1:  " + n47 + " : " + by45);
                        if (n47 == GameWorld.e().J) {
                            GameWorld.e().by = by45;
                        } else if (GameScreen.IActionListener(n47) != null) {
                            GameScreen.IActionListener((int)n47).by = by45;
                        }
                        GameScreen.j();
                        GameScreen.a(n47, by45);
                        return;
                    }
                    if (n47 == 2) {
                        void var4_155;
                        Object object2;
                        void var4_153;
                        n47 = ((Message)object).c().readByte();
                        short s29 = ((Message)object).c().readShort();
                        ep ep2 = new ep();
                        new ep().a = (byte)n47;
                        ep2.IActionListener = s29;
                        GameScreen.H.addElement(ep2);
                        boolean bl2 = false;
                        while (var4_153 < GameScreen.H.size()) {
                            object2 = (ep)GameScreen.H.elementAt((int)var4_153);
                            MathUtil.c("i: " + (int)var4_153 + "  cflag: " + ((ep)object2).a + "   IDimageFlag: " + ((ep)object2).IActionListener);
                            ++var4_153;
                        }
                        boolean bl3 = false;
                        while (var4_155 < GameScreen.D.size()) {
                            object2 = (GameWorld)GameScreen.D.elementAt((int)var4_155);
                            if (object2 != null && ((GameWorld)object2).by == n47) {
                                ((GameWorld)object2).bz = s29;
                            }
                            ++var4_155;
                        }
                        if (GameWorld.e().by == n47) {
                            GameWorld.e().bz = s29;
                            return;
                        }
                    }
                    break;
                }
                case -102: {
                    byte by46 = ((Message)object).c().readByte();
                    if (by46 != 0 && by46 == 1) {
                        main.GameCanvas.I.n = false;
                        GameService.a().a(RMSManager.c("acc"), RMSManager.c("pass"), "2.4.6", (byte)0);
                        return;
                    }
                    break;
                }
                case -101: {
                    if (main.GameCanvas.I == null) {
                        main.GameCanvas.I = new LoginScreen();
                    }
                    main.GameCanvas.I.n = true;
                    main.GameCanvas.IActionListener();
                    String string = ((Message)object).c().readUTF();
                    RMSManager.a("userAo" + bs.n, string);
                    GameService.a().c();
                    GameService.a().a(string, "", "2.4.6", (byte)1);
                    return;
                }
                case -100: {
                    byte by8;
                    bp.c();
                    boolean bl2 = false;
                    if (main.GameCanvas.A > 2 * UIPanel.ab) {
                        bl2 = true;
                    }
                    if ((by8 = ((Message)object).c().readByte()) < 0) break;
                    MathUtil.c("t Indxe= " + by8);
                    main.GameCanvas.G.K[by8] = ((Message)object).c().readByte();
                    main.GameCanvas.G.L[by8] = ((Message)object).c().readByte();
                    MathUtil.c("max page= " + main.GameCanvas.G.K[by8] + " curr page= " + main.GameCanvas.G.L[by8]);
                    int n18 = ((Message)object).c().readUnsignedByte();
                    GameWorld.e().aJ[by8] = new h[n18];
                    UIPanel.ar = GameStrings.es;
                    int n19 = 0;
                    while (n19 < n18) {
                        short s10 = ((Message)object).c().readShort();
                        if (s10 != -1) {
                            int n20;
                            GameWorld.e().aJ[by8][n19] = new h();
                            GameWorld.e().aJ[by8][n19].IActionListener = dp.a(s10);
                            GameWorld.e().aJ[by8][n19].d = ((Message)object).c().readShort();
                            GameWorld.e().aJ[by8][n19].n = ((Message)object).c().readInt();
                            GameWorld.e().aJ[by8][n19].GameScreen = ((Message)object).c().readInt();
                            GameWorld.e().aJ[by8][n19].v = ((Message)object).c().readByte();
                            GameWorld.e().aJ[by8][n19].h = ((Message)object).c().readInt();
                            GameWorld.e().aJ[by8][n19].B = ((Message)object).c().readByte();
                            byte by9 = ((Message)object).c().readByte();
                            if (by9 != -1) {
                                GameWorld.e().aJ[by8][n19].a = new ee[by9];
                                n20 = 0;
                                while (n20 < GameWorld.e().aJ[by8][n19].GameCanvas.length) {
                                    MessageHandler.a();
                                    ee ee3 = MessageHandler.IActionListener((Message)object);
                                    if (ee3 != null) {
                                        GameWorld.e().aJ[by8][n19].a[n20] = ee3;
                                        GameWorld.e().aJ[by8][n19].A = main.GameCanvas.G.a(GameWorld.e().aJ[by8][n19]);
                                    }
                                    ++n20;
                                }
                            }
                            if ((n20 = ((Message)object).c().readByte()) == 1) {
                                short s11 = ((Message)object).c().readShort();
                                short s12 = ((Message)object).c().readShort();
                                short s13 = ((Message)object).c().readShort();
                                short s14 = ((Message)object).c().readShort();
                                GameWorld.e().aJ[by8][n19].a(s11, s12, s13, s14);
                            }
                            if (GameMidlet.e >= 237) {
                                GameWorld.e().aJ[by8][n19].H = ((Message)object).c().readUTF();
                                MathUtil.IActionListener("nguoi ki gui  " + GameWorld.e().aJ[by8][n19].H);
                            }
                        }
                        ++n19;
                    }
                    if (bl2) {
                        main.GameCanvas.H.e();
                    }
                    main.GameCanvas.G.Message();
                    main.GameCanvas.G.f = 0;
                    main.GameCanvas.G.UIPanel = 0;
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    private static void IActionListener(Message y2) {
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
                ar.a().a(sArray, by3, by2, s2);
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
                ar.a().a(sArray);
                return;
            }
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
    }

    private static void a(Message y2, int n2) {
        try {
            int n3;
            byte by2 = y2.c().readByte();
            cl cl2 = aa.a(by2);
            if (cl2 == null) {
                return;
            }
            if (n2 == 10) {
                n3 = y2.c().readShort();
                short s2 = y2.c().readShort();
                cl2.a((short)n3, s2);
            }
            if (n2 >= 11 && n2 <= 20) {
                byte by3 = y2.c().readByte();
                n3 = by3;
                GameWorld[] afArray = new GameWorld[by3];
                long[] lArray = new long[n3];
                int n4 = 0;
                while (n4 < n3) {
                    int n5 = y2.c().readInt();
                    afArray[n4] = null;
                    afArray[n4] = n5 != GameWorld.e().J ? GameScreen.IActionListener(n5) : GameWorld.e();
                    lArray[n4] = y2.c().readLong();
                    ++n4;
                }
                n4 = y2.c().readByte();
                cl2.a(afArray, lArray, (byte)(n2 - 10), (byte)n4);
            }
            if (n2 == 21) {
                cl2.a = y2.c().readShort();
                cl2.IActionListener = y2.c().readShort();
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

