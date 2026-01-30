/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import main.GameMidlet;
import main.GameCanvas;

public final class bs
extends Screen
implements IActionListener {
    public static String[] a;
    private static String[] x;
    public static byte IActionListener;
    private static short[] Message;
    private static int z;
    public static boolean c;
    public static byte[] d;
    public static byte[] e;
    public static GameWorld[] f;
    public static boolean UIPanel;
    private Command[] A;
    private Command B;
    private int C;
    public static byte[] h;
    public static byte[] i;
    private static String D;
    private static String E;
    private static String F;
    private static String G;
    private static String H;
    private static String I;
    public static String j;
    public static boolean k;
    public static String ResourceUtil;
    public static boolean m;
    private static int J;
    private static long K;
    private static String L;
    public static int n;
    public static boolean o;
    public static int GameScreen;
    public static int q;
    public static int r;
    public static boolean s;
    private static Command M;
    public static int t;
    public static boolean u;
    public static boolean v;
    public static String w;
    private static String N;

    static {
        D = "V\u0169 tr\u1ee5 1:dragon1.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 2:dragon2.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 3:dragon3.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 4:dragon4.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 5:dragon5.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 6:dragon6.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 7:dragon7.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 8:dragon10.teamobi.com:14446:0:0:0,V\u0169 tr\u1ee5 9:dragon10.teamobi.com:14447:0:0:0,V\u0169 tr\u1ee5 10:dragon10.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 11:dragon11.teamobi.com:14445:0:0:0,V\u00f5 \u0111\u00e0i li\u00ean v\u0169 tr\u1ee5:dragonwar.teamobi.com:20000:0:0:0,Universe 1:dragon.indonaga.com:14445:1:0:0,Naga:dragon.indonaga.com:14446:2:0:0,0,0";
        E = "V\u0169 tr\u1ee5 1:112.213.94.23:14445:0:0:0,V\u0169 tr\u1ee5 2:210.211.109.199:14445:0:0:0,V\u0169 tr\u1ee5 3:112.213.85.88:14445:0:0:0,V\u0169 tr\u1ee5 4:27.0.12.164:14445:0:0:0,V\u0169 tr\u1ee5 5:27.0.12.16:14445:0:0:0,V\u0169 tr\u1ee5 6:27.0.12.173:14445:0:0:0,V\u0169 tr\u1ee5 7:112.213.94.223:14445:0:0:0,V\u0169 tr\u1ee5 8:27.0.14.66:14446:0:0:0,V\u0169 tr\u1ee5 9:27.0.14.66:14447:0:0:0,V\u0169 tr\u1ee5 10:27.0.14.66:14445:0:0:0,V\u0169 tr\u1ee5 11:112.213.85.35:14445:0:0:0,V\u00f5 \u0111\u00e0i li\u00ean v\u0169 tr\u1ee5:27.0.12.173:20000:0:0:0,Universe 1:52.74.230.22:14445:1:0:0,Naga:52.74.230.22:14446:2:0:0,0,0";
        F = "Naga:dragon.indonaga.com:14446:2:0:0,2,0";
        G = "Naga:52.74.230.22:14446:2:0:0,2,0";
        H = "Universe 1:dragon.indonaga.com:14445:1:0:0,1,0";
        I = "Universe 1:52.74.230.22:14445:1:0:0,1,0";
        j = E;
        L = "NRlink3";
        s = false;
        t = -1;
        v = true;
        w = "svselect";
        N = "NRlink_extra";
    }

    public bs() {
        System.getProperty("com.sonyericsson.imei");
        this.n();
        if (!main.GameCanvas.e) {
            z = 0;
            this.o();
        }
        GameScreen.a(-1, -1);
        GameScreen.j = 100;
        GameScreen.k = 200;
        if (this.B == null) {
            this.B = new Command("G\u1ecdi hotline", this, 13, null);
            this.B.j = main.GameCanvas.A - 75;
            this.B.k = ResourceUtil.c == 1 && !main.GameCanvas.e ? main.GameCanvas.B - 20 : 8;
        }
        int n2 = 0;
        if (0 == 2) {
            if (ResourceUtil.c == 1) {
                j = G;
                return;
            }
            j = F;
            return;
        }
        if (n2 == 1) {
            j = I;
            if (ResourceUtil.c == 1) {
                j = I;
                return;
            }
            j = H;
            return;
        }
        j = E;
        if (ResourceUtil.c == 1) {
            j = E;
            return;
        }
        j = D;
    }

    private void n() {
        this.C = 0;
        String string = RMSManager.c("acc");
        if (string == null ? RMSManager.IActionListener("userAo" + n) != null : !string.equals("") || RMSManager.IActionListener("userAo" + n) != null) {
            this.C = 1;
        }
        this.A = new Command[4 + this.C];
        int n2 = main.GameCanvas.D - 15 * this.A.length + 28;
        int n3 = 0;
        while (n3 < this.A.length) {
            switch (n3) {
                case 0: {
                    this.A[0] = new Command("", this, 3, null);
                    if (string == null) {
                        this.A[0].IActionListener = GameStrings.gh;
                        if (RMSManager.IActionListener("userAo" + n) == null) break;
                        this.A[0].IActionListener = GameStrings.q;
                        break;
                    }
                    if (string.equals("")) {
                        this.A[0].IActionListener = GameStrings.gh;
                        if (RMSManager.IActionListener("userAo" + n) == null) break;
                        this.A[0].IActionListener = GameStrings.q;
                        break;
                    }
                    this.A[0].IActionListener = String.valueOf(GameStrings.gi) + ": " + string;
                    if (this.A[0].IActionListener.length() <= 23) break;
                    this.A[0].IActionListener = this.A[0].IActionListener.substring(0, 23);
                    this.A[0].IActionListener = String.valueOf(this.A[0].IActionListener) + "...";
                    break;
                }
                case 1: {
                    if (this.C == 1) {
                        this.A[1] = new Command("", this, 10100, null);
                        this.A[1].IActionListener = GameStrings.gh;
                        break;
                    }
                    this.A[1] = new Command(GameStrings.T, this, 7, null);
                    break;
                }
                case 2: {
                    if (this.C == 1) {
                        this.A[2] = new Command(GameStrings.T, this, 7, null);
                        break;
                    }
                    this.A[2] = new Command("", this, 17, null);
                    break;
                }
                case 3: {
                    if (this.C == 1) {
                        this.A[3] = new Command("", this, 17, null);
                        break;
                    }
                    this.A[3] = new Command(GameStrings.bU, this, 8, null);
                    break;
                }
                case 4: {
                    this.A[4] = new Command(GameStrings.bU, this, 8, null);
                }
            }
            this.A[n3].k = n2;
            this.A[n3].IActionListener();
            this.A[n3].j = (main.GameCanvas.A - this.A[n3].ResourceUtil) / 2;
            n2 += 30;
            ++n3;
        }
    }

    public static void a() {
        bs.a(j);
    }

    public static void a(String string) {
        String[] stringArray = MathUtil.a(string.trim(), ",", 0);
        MathUtil.c(">>> getServerList= " + string);
        GameStrings.a(Byte.parseByte(stringArray[stringArray.length - 2]));
        a = new String[stringArray.length - 2];
        x = new String[stringArray.length - 2];
        Message = new short[stringArray.length - 2];
        d = new byte[stringArray.length - 2];
        h = new byte[stringArray.length - 2];
        i = new byte[stringArray.length - 2];
        int n2 = 0;
        while (n2 < stringArray.length - 2) {
            String[] stringArray2 = MathUtil.a(stringArray[n2].trim(), ":", 0);
            bs.a[n2] = stringArray2[0];
            bs.x[n2] = stringArray2[1];
            bs.Message[n2] = Short.parseShort(stringArray2[2]);
            bs.d[n2] = Byte.parseByte(stringArray2[3].trim());
            try {
                bs.h[n2] = Byte.parseByte(stringArray2[4].trim());
            }
            catch (Exception exception) {
                bs.h[n2] = 0;
            }
            try {
                bs.i[n2] = Byte.parseByte(stringArray2[5].trim());
            }
            catch (Exception exception) {
                bs.i[n2] = 0;
            }
            ++n2;
        }
        IActionListener = Byte.parseByte(stringArray[stringArray.length - 1]);
        MathUtil.c(">>> getServerList= serverPriority: " + IActionListener);
        bs.GameScreen();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(MGraphics en2) {
        Object object;
        if (!u) {
            en2.a(0);
            en2.d(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        } else {
            main.GameCanvas.c(en2);
        }
        mFont.s.a(en2, "v2.4.6(" + MGraphics.IActionListener + ")", main.GameCanvas.A - 2, 17, 1, mFont.o);
        try {
            object = "";
            if (t == 0) {
                String cfr_ignored_0 = String.valueOf(object) + a[n] + " disconnect";
            } else {
                String cfr_ignored_1 = String.valueOf(object) + a[n] + " connected";
            }
        }
        catch (Exception exception) {}
        if (!s || u) {
            if (ResourceUtil.c == 1 && !main.GameCanvas.e) {
                mFont.s.a(en2, ResourceUtil, main.GameCanvas.A - 2, main.GameCanvas.B - 15, 1, mFont.o);
            } else {
                mFont.s.a(en2, ResourceUtil, main.GameCanvas.A - 2, 2, 1, mFont.o);
            }
        } else {
            mFont.s.a(en2, ResourceUtil, main.GameCanvas.A - 2, 2, 1, mFont.o);
        }
        object = en2;
        if (!u) {
            if (o) return;
            en2.a(x.j, main.GameCanvas.C, main.GameCanvas.D - 32, 3);
            if (!s) {
                mFont.c.a(en2, GameStrings.gc, main.GameCanvas.C, main.GameCanvas.D + 24, 2);
                if (M == null) return;
                M.a(en2);
                return;
            }
            if (M != null) {
                M.a(en2);
            }
            en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
            mFont.c.a(en2, String.valueOf(GameStrings.aE) + GameScreen + "%", main.GameCanvas.A / 2, main.GameCanvas.D + 24, 2);
            GameScreen.a(GameScreen.ai, GameScreen.aj, GameScreen.ak, main.GameCanvas.A / 2 - 50, main.GameCanvas.D + 45, 100, 100.0f, en2);
            GameScreen.a(GameScreen.GameWorld, GameScreen.ag, GameScreen.ah, main.GameCanvas.A / 2 - 50, main.GameCanvas.D + 45, 100, GameScreen, en2);
            return;
        }
        int n2 = main.GameCanvas.D - 15 * this.A.length - 15;
        if (n2 < 25) {
            n2 = 25;
        }
        if (x.j != null) {
            en2.a(x.j, main.GameCanvas.C, n2, 3);
        }
        n2 = this.A.length;
        int n3 = 0;
        while (n3 < n2) {
            this.A[n3].a(en2);
            ++n3;
        }
        en2.e(0, 0, main.GameCanvas.A, main.GameCanvas.B);
        if (MGraphics.IActionListener != 1) return;
        if (t == -1) {
            if (main.GameCanvas.w % 20 <= 10) return;
            en2.a(GameScreen.ae, 0, 14, 7, 7, 0, (main.GameCanvas.A - mFont.f.a(this.A[2 + this.C].IActionListener) >> 1) - 10, this.A[2 + this.C].k + 10, 0);
            return;
        }
        en2.a(GameScreen.ae, 0, t * 7, 7, 7, 0, (main.GameCanvas.A - mFont.f.a(this.A[2 + this.C].IActionListener) >> 1) - 10, this.A[2 + this.C].k + 9, 0);
    }

    public final void c() {
        block14: {
            block13: {
                if (m) {
                    if (++J == 50) {
                        main.GameCanvas.ak.i();
                        m = false;
                    }
                    if (J == 100) {
                        if (main.GameCanvas.I == null) {
                            main.GameCanvas.I = new LoginScreen();
                        }
                        main.GameCanvas.I.a();
                        GameService.a().r();
                        m = false;
                    }
                }
                int n2 = 0;
                while (n2 < this.A.length) {
                    this.A[n2].n = n2 == z;
                    ++n2;
                }
                ++GameScreen.j;
                if (!u && (o || GameScreen == 100)) {
                    M = null;
                }
                super.c();
                if (GameWorld.bI) {
                    return;
                }
                if (!u) {
                    return;
                }
                if (!v) {
                    return;
                }
                if (main.GameCanvas.E != this) {
                    return;
                }
                if (NetworkService.a().d()) break block13;
                if (ResourceUtil.d() <= K) break block14;
                bs.a(n, true);
                NetworkService.a().e();
                bs.k();
            }
            K = ResourceUtil.d() + 5000L;
        }
    }

    private void o() {
        MathUtil.c("load Screen= " + u + " select= " + z);
        if (u) {
            this.cn = new Command("", this, this.A[bs.z].e, null);
            return;
        }
        this.cn = M;
    }

    public static void IActionListener(MGraphics en2) {
    }

    public static void e() {
    }

    public final void d() {
        if (main.GameCanvas.e) {
            if (this.B != null && this.B.c()) {
                this.B.a();
            }
            if (!u) {
                if (M != null && M.c()) {
                    M.a();
                }
                super.d();
                return;
            }
            int n2 = this.A.length;
            int n3 = 0;
            while (n3 < n2) {
                if (this.A[n3] != null && this.A[n3].c()) {
                    this.A[n3].a();
                }
                ++n3;
            }
        } else {
            if (ResourceUtil.c == 1 && main.GameCanvas.i[13]) {
                main.GameCanvas.i[13] = false;
                this.B.a();
            }
            if (u) {
                int n4;
                if (main.GameCanvas.i[8]) {
                    n4 = this.A.length - 1;
                    main.GameCanvas.i[8] = false;
                    if (++z > n4) {
                        z = 0;
                    }
                    this.o();
                }
                if (main.GameCanvas.i[2]) {
                    n4 = this.A.length - 1;
                    main.GameCanvas.i[2] = false;
                    if (--z < 0) {
                        z = n4;
                    }
                    this.o();
                }
            }
        }
        super.d();
    }

    private static void GameScreen() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(GameStrings.fB);
            dataOutputStream.writeByte(GameCanvas.length);
            int n2 = 0;
            while (n2 < GameCanvas.length) {
                dataOutputStream.writeUTF(a[n2]);
                dataOutputStream.writeUTF(x[n2]);
                dataOutputStream.writeShort(Message[n2]);
                dataOutputStream.writeByte(d[n2]);
                try {
                    dataOutputStream.writeByte(h[n2]);
                }
                catch (Exception exception) {
                    dataOutputStream.writeByte(0);
                }
                try {
                    dataOutputStream.writeByte(i[n2]);
                }
                catch (Exception exception) {
                    dataOutputStream.writeByte(0);
                }
                ++n2;
            }
            dataOutputStream.writeByte(IActionListener);
            RMSManager.a(L, byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            em.e();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static void f() {
        Object object = RMSManager.IActionListener(L);
        if (object == null) {
            bs.a(j);
            return;
        }
        object = new ByteArrayInputStream((byte[])object);
        object = new DataInputStream((InputStream)object);
        try {
            GameStrings.a(object.readByte());
            int n2 = object.readByte();
            a = new String[n2];
            x = new String[n2];
            Message = new short[n2];
            d = new byte[n2];
            h = new byte[n2];
            i = new byte[n2];
            int n3 = 0;
            while (n3 < n2) {
                bs.a[n3] = object.readUTF();
                bs.x[n3] = object.readUTF();
                bs.Message[n3] = object.readShort();
                bs.d[n3] = object.readByte();
                try {
                    bs.h[n3] = object.readByte();
                }
                catch (Exception exception) {
                    bs.h[n3] = 0;
                }
                try {
                    bs.i[n3] = object.readByte();
                }
                catch (Exception exception) {
                    bs.i[n3] = 0;
                }
                ++n3;
            }
            IActionListener = object.readByte();
            object.close();
            em.e();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final void IActionListener() {
        dh.IActionListener();
        GameScreen.k = 0;
        GameScreen.j = 0;
        this.n();
        c = false;
        main.GameCanvas.I = null;
        String string = RMSManager.c("ResVersion");
        int n2 = string != null && string != "" ? Integer.parseInt(string) : -1;
        if (n2 > 0) {
            u = true;
            main.GameCanvas.a(0);
        }
        o = true;
        this.A[2 + this.C].IActionListener = String.valueOf(GameStrings.aJ) + ": " + a[n];
        this.cn = new Command("", this, this.A[bs.z].e, null);
        this.A[1 + this.C].IActionListener = GameStrings.T;
        if (this.A.length == 4 + this.C) {
            this.A[3 + this.C].IActionListener = GameStrings.bU;
        }
        GameWorld.bI = false;
        ResourceUtil.a();
        super.IActionListener();
    }

    public final void UIPanel() {
        GameScreen.k = 0;
        GameScreen.j = 0;
        this.n();
        c = false;
        main.GameCanvas.I = null;
        String string = RMSManager.c("ResVersion");
        int n2 = string != null && string != "" ? Integer.parseInt(string) : -1;
        if (n2 > 0) {
            u = true;
            main.GameCanvas.a(0);
        }
        o = true;
        this.A[2 + this.C].IActionListener = String.valueOf(GameStrings.aJ) + ": " + a[n];
        this.cn = new Command("", this, this.A[bs.z].e, null);
        this.A[1 + this.C].IActionListener = GameStrings.T;
        if (this.A.length == 4 + this.C) {
            this.A[3 + this.C].IActionListener = GameStrings.bU;
        }
        super.IActionListener();
    }

    public final void h() {
        if (main.GameCanvas.ak == null) {
            main.GameCanvas.ak = new bs();
        }
        r = 0;
        GameScreen = 0;
        k = true;
        main.GameCanvas.ak.j();
        s = false;
        bs.M.n = true;
        this.cn = new Command("", this, 2, null);
    }

    public final void i() {
        main.GameCanvas.IActionListener(GameStrings.aC);
        NetworkService.a().e();
        GameMidlet.a = x[n];
        GameMidlet.IActionListener = Message[n];
        RMSManager.a(w, n);
        if (d[n] != GameStrings.fB) {
            GameStrings.a(d[n]);
        }
        x.i = a[n];
        this.n();
        u = true;
        t = -1;
        v = true;
    }

    public final void a(int n2, Object object) {
        MathUtil.c("perform trong ServerListScreen" + n2);
        if (n2 == 1000) {
            main.GameCanvas.IActionListener();
        }
        if (n2 == 1 || n2 == 4) {
            NetworkService.a().e();
            v = false;
            u = true;
            t = 0;
            s = false;
            RMSManager.a();
            this.b();
        }
        if (n2 == 2) {
            k = false;
            M = new Command(GameStrings.gd, this, 4, null);
            new Command(GameStrings.gd, this, 4, null).j = main.GameCanvas.A / 2 - Screen.cq / 2;
            bs.M.k = main.GameCanvas.D + 65;
            this.co = null;
            if (!main.GameCanvas.e) {
                bs.M.j = main.GameCanvas.A / 2 - Screen.cq / 2;
                bs.M.k = main.GameCanvas.B - Screen.cr - 1;
            }
            this.cn = new Command("", this, 4, null);
            if (!s) {
                GameService.a().IActionListener((byte)1, null);
                if (!main.GameCanvas.e) {
                    bs.M.n = true;
                    this.cn = new Command("", this, 4, null);
                }
                s = true;
            }
        }
        if (n2 == 3) {
            bs.ResourceUtil();
        }
        if (n2 == 10100) {
            if (main.GameCanvas.I == null) {
                main.GameCanvas.I = new LoginScreen();
            }
            main.GameCanvas.I.IActionListener();
            main.GameCanvas.IActionListener();
            GameService.a().f("");
            MathUtil.c("tao user ao");
            main.GameCanvas.i();
            x.i = a[n];
        }
        if (n2 == 5) {
            bs.a();
            if (GameCanvas.length == 1) {
                return;
            }
            object = new LoggingList("");
            int n3 = 0;
            while (n3 < GameCanvas.length) {
                ((LoggingList)object).addElement(new Command(a[n3], this, 6, null));
                ++n3;
            }
            main.GameCanvas.F.a((LoggingList)object);
            if (!main.GameCanvas.e) {
                main.GameCanvas.F.IActionListener = n;
            }
        }
        if (n2 == 6) {
            bs.a(main.GameCanvas.F.IActionListener, false);
            this.i();
        }
        if (n2 == 7) {
            if (main.GameCanvas.I == null) {
                main.GameCanvas.I = new LoginScreen();
            }
            main.GameCanvas.I.IActionListener();
        }
        if (n2 == 8) {
            boolean bl2 = RMSManager.d("lowGraphic") == 1;
            LoggingList el2 = new LoggingList("cau hinh");
            el2.addElement(new Command(GameStrings.Message, this, 9, null));
            el2.addElement(new Command(GameStrings.z, this, 10, null));
            el2.addElement(new Command(GameStrings.A, this, 14, null));
            main.GameCanvas.F.a(el2);
            main.GameCanvas.F.IActionListener = bl2 ? 0 : 1;
        }
        if (n2 == 9) {
            RMSManager.a("lowGraphic", 1);
            main.GameCanvas.a(GameStrings.cM, 8885, null);
        }
        if (n2 == 10) {
            RMSManager.a("lowGraphic", 0);
            main.GameCanvas.a(GameStrings.cM, 8885, null);
        }
        if (n2 == 11) {
            if (main.GameCanvas.I == null) {
                main.GameCanvas.I = new LoginScreen();
            }
            main.GameCanvas.I.IActionListener();
            String string = RMSManager.c("userAo" + n);
            if (string == null || string.equals("")) {
                GameService.a().f("");
            } else {
                main.GameCanvas.I.n = true;
                main.GameCanvas.IActionListener();
                GameService.a().c();
                GameService.a().a(string, "", "2.4.6", (byte)1);
            }
            main.GameCanvas.IActionListener(GameStrings.aC);
            MathUtil.c("tao user ao");
        }
        if (n2 == 12) {
            GameMidlet.f.a();
        }
        if (n2 == 13 && (!s || u)) {
            switch (ResourceUtil.c) {
                case 1: {
                    ResourceUtil.IActionListener();
                }
            }
        }
        if (n2 == 14) {
            Command de2 = new Command(GameStrings.bn, main.GameCanvas.ak, 15, null);
            Command de3 = new Command(GameStrings.bo, main.GameCanvas.ak, 16, null);
            main.GameCanvas.a(GameStrings.gg, de2, de3);
        }
        if (n2 == 15) {
            RMSManager.a();
            main.GameCanvas.a(GameStrings.cM, 8885, null);
        }
        if (n2 == 16) {
            bp.c();
            main.GameCanvas.K = null;
        }
        if (n2 == 17) {
            if (main.GameCanvas.al == null) {
                main.GameCanvas.al = new eu();
            }
            main.GameCanvas.al.IActionListener();
        }
        if (n2 == 18) {
            main.GameCanvas.h();
            bp.c();
            if (main.GameCanvas.al == null) {
                main.GameCanvas.al = new eu();
            }
            main.GameCanvas.al.IActionListener();
        }
        if (n2 == 19) {
            if (ResourceUtil.c == 1) {
                bp.c();
                main.GameCanvas.K = null;
                return;
            }
            t = 0;
            v = true;
        }
    }

    public final void j() {
        GameScreen.j = 0;
        GameScreen.k = 0;
        this.n();
        u = false;
        GameScreen = 0;
        o = false;
        s = false;
        r = 0;
        GameWorld.bI = false;
        bs bs2 = this;
        if (!u) {
            M = new Command(GameStrings.ge, bs2, 2, null);
            new Command(GameStrings.ge, bs2, 2, null).n = true;
            bs.M.j = main.GameCanvas.A / 2 - Screen.cq / 2;
            bs.M.k = main.GameCanvas.D + 45;
            if (bs.M.k > main.GameCanvas.B - 26) {
                bs.M.k = main.GameCanvas.B - 26;
            }
        }
        if (!main.GameCanvas.e) {
            z = 0;
            bs2.o();
        }
        super.IActionListener();
    }

    public static void k() {
        GameMidlet.a = x[n];
        GameMidlet.IActionListener = Message[n];
        GameStrings.a(d[n]);
        x.i = a[n];
        main.GameCanvas.IActionListener();
    }

    public static void a(int n2, boolean bl2) {
        n = n2;
        if (bl2) {
            RMSManager.a(w, n);
            MathUtil.IActionListener("2>>>saveRMSInt:  RMS_svselect == " + n);
        }
    }

    public static void ResourceUtil() {
        if (main.GameCanvas.I == null) {
            main.GameCanvas.I = new LoginScreen();
        }
        main.GameCanvas.I.IActionListener();
        boolean bl2 = false;
        boolean bl3 = false;
        String string = RMSManager.c("userAo" + n);
        try {
            if (!RMSManager.c("acc").equals("")) {
                bl2 = true;
            }
            if (!string.equals("")) {
                bl3 = true;
            }
        }
        catch (Exception exception) {}
        main.GameCanvas.IActionListener();
        GameService.a().c();
        if (!bl2 && !bl3) {
            main.GameCanvas.IActionListener();
            if (string == null || string.equals("")) {
                GameService.a().f("");
            } else {
                main.GameCanvas.I.n = true;
                GameService.a().a(string, "", "2.4.6", (byte)1);
            }
            RMSManager.a(w, n);
            if (NetworkService.a().d) {
                main.GameCanvas.i();
            } else {
                main.GameCanvas.a(GameStrings.cM, 8884, null);
            }
        } else {
            main.GameCanvas.I.a();
        }
        x.i = a[n];
    }

    public static void m() {
        if (e == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte((byte)e.length);
            int n2 = 0;
            while (n2 < e.length) {
                dataOutputStream.writeByte(e[n2]);
                if (e[n2] >= 0 && f != null && f[n2] != null) {
                    dataOutputStream.writeShort((short)bs.f[n2].bU);
                    dataOutputStream.writeShort((short)bs.f[n2].bW);
                    dataOutputStream.writeShort((short)bs.f[n2].bV);
                    dataOutputStream.writeShort((short)bs.f[n2].bX);
                    dataOutputStream.writeUTF(bs.f[n2].ag);
                }
                ++n2;
            }
            RMSManager.a(N, byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            em.e();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

