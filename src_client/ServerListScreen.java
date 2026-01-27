/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import main.GameMidlet;
import main.GameCanvas;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ServerListScreen
extends Screen
implements b {
    public static String[] LoginScreen;
    private static String[] x;
    public static byte b;
    private static short[] Message;
    private static int z;
    public static boolean c;
    public static byte[] d;
    public static byte[] e;
    public static Char[] f;
    public static boolean g;
    private de[] A;
    private de B;
    private int C;
    public static byte[] Item;
    public static byte[] i;
    private static String D;
    private static String E;
    private static String F;
    private static String G;
    private static String H;
    private static String I;
    public static String j;
    public static boolean k;
    public static String Res;
    public static boolean m;
    private static int J;
    private static long K;
    private static String L;
    public static int n;
    public static boolean o;
    public static int GameScreen;
    public static int q;
    public static int r;
    public static boolean SessionReceiver;
    private static de M;
    public static int MyHashtable;
    public static boolean u;
    public static boolean v;
    public static String w;
    private static String N;

    static {
        D = "V\u0169 tr\u1ee5 1:dragon1.teamobi.com:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 2:dragon2.teamobi.com:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 3:dragon3.teamobi.com:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 4:dragon4.teamobi.com:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 5:dragon5.teamobi.com:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 6:dragon6.teamobi.com:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 7:dragon7.teamobi.com:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 8:dragon10.teamobi.com:14446:0:0:0,V\u0169 tr\u1ee5 9:dragon10.teamobi.com:14447:0:0:0,V\u0169 tr\u1ee5 10:dragon10.teamobi.com:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 11:dragon11.teamobi.com:Config.SERVER_PORT:0:0:0,V\u00f5 \u0111\u00e0i li\u00ean v\u0169 tr\u1ee5:dragonwar.teamobi.com:20000:0:0:0,Universe 1:dragon.indonaga.com:Config.SERVER_PORT:1:0:0,Naga:dragon.indonaga.com:14446:2:0:0,0,0";
        E = "V\u0169 tr\u1ee5 1:112.213.94.23:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 2:210.211.109.199:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 3:112.213.85.88:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 4:27.0.12.164:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 5:27.0.12.16:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 6:27.0.12.173:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 7:112.213.94.223:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 8:27.0.14.66:14446:0:0:0,V\u0169 tr\u1ee5 9:27.0.14.66:14447:0:0:0,V\u0169 tr\u1ee5 10:27.0.14.66:Config.SERVER_PORT:0:0:0,V\u0169 tr\u1ee5 11:112.213.85.35:Config.SERVER_PORT:0:0:0,V\u00f5 \u0111\u00e0i li\u00ean v\u0169 tr\u1ee5:27.0.12.173:20000:0:0:0,Universe 1:52.74.230.22:Config.SERVER_PORT:1:0:0,Naga:52.74.230.22:14446:2:0:0,0,0";
        F = "Naga:dragon.indonaga.com:14446:2:0:0,2,0";
        G = "Naga:52.74.230.22:14446:2:0:0,2,0";
        H = "Universe 1:dragon.indonaga.com:Config.SERVER_PORT:1:0:0,1,0";
        I = "Universe 1:52.74.230.22:Config.SERVER_PORT:1:0:0,1,0";
        j = E;
        L = "NRlink3";
        SessionReceiver = false;
        MyHashtable = -1;
        v = true;
        w = "svselect";
        N = "NRlink_extra";
    }

    public ServerListScreen() {
        System.getProperty("com.sonyericsson.imei");
        this.n();
        if (!GameCanvas.e) {
            z = 0;
            this.o();
        }
        GameScreen.LoginScreen(-1, -1);
        GameScreen.j = 100;
        GameScreen.k = 200;
        if (this.B == null) {
            this.B = new de("G\u1ecdi hotline", this, 13, null);
            this.B.j = GameCanvas.A - 75;
            this.B.k = Res.clientType == 1 && !GameCanvas.e ? GameCanvas.B - 20 : 8;
        }
        int n2 = 0;
        if (0 == 2) {
            if (Res.clientType == 1) {
                j = G;
                return;
            }
            j = F;
            return;
        }
        if (n2 == 1) {
            j = I;
            if (Res.clientType == 1) {
                j = I;
                return;
            }
            j = H;
            return;
        }
        j = E;
        if (Res.clientType == 1) {
            j = E;
            return;
        }
        j = D;
    }

    private void n() {
        this.C = 0;
        String string = RMS.c("acc");
        if (string == null ? RMS.b("userAo" + n) != null : !string.equals("") || RMS.b("userAo" + n) != null) {
            this.C = 1;
        }
        this.A = new de[4 + this.C];
        int n2 = GameCanvas.D - 15 * this.A.length + 28;
        int n3 = 0;
        while (n3 < this.A.length) {
            switch (n3) {
                case 0: {
                    this.A[0] = new de("", this, 3, null);
                    if (string == null) {
                        this.A[0].b = T.gh;
                        if (RMS.b("userAo" + n) == null) break;
                        this.A[0].b = T.q;
                        break;
                    }
                    if (string.equals("")) {
                        this.A[0].b = T.gh;
                        if (RMS.b("userAo" + n) == null) break;
                        this.A[0].b = T.q;
                        break;
                    }
                    this.A[0].b = String.valueOf(T.gi) + ": " + string;
                    if (this.A[0].b.length() <= 23) break;
                    this.A[0].b = this.A[0].b.substring(0, 23);
                    this.A[0].b = String.valueOf(this.A[0].b) + "...";
                    break;
                }
                case 1: {
                    if (this.C == 1) {
                        this.A[1] = new de("", this, 10100, null);
                        this.A[1].b = T.gh;
                        break;
                    }
                    this.A[1] = new de(T.T, this, 7, null);
                    break;
                }
                case 2: {
                    if (this.C == 1) {
                        this.A[2] = new de(T.T, this, 7, null);
                        break;
                    }
                    this.A[2] = new de("", this, 17, null);
                    break;
                }
                case 3: {
                    if (this.C == 1) {
                        this.A[3] = new de("", this, 17, null);
                        break;
                    }
                    this.A[3] = new de(T.bU, this, 8, null);
                    break;
                }
                case 4: {
                    this.A[4] = new de(T.bU, this, 8, null);
                }
            }
            this.A[n3].k = n2;
            this.A[n3].b();
            this.A[n3].j = (GameCanvas.A - this.A[n3].Res) / 2;
            n2 += 30;
            ++n3;
        }
    }

    public static void methodLoginScreen() {
        ServerListScreen.LoginScreen(j);
    }

    public static void methodLoginScreen(String string) {
        String[] stringArray = ds.LoginScreen(string.trim(), ",", 0);
        ds.c(">>> getServerList= " + string);
        T.LoginScreen(Byte.parseByte(stringArray[stringArray.length - 2]));
        LoginScreen = new String[stringArray.length - 2];
        x = new String[stringArray.length - 2];
        Message = new short[stringArray.length - 2];
        d = new byte[stringArray.length - 2];
        Item = new byte[stringArray.length - 2];
        i = new byte[stringArray.length - 2];
        int n2 = 0;
        while (n2 < stringArray.length - 2) {
            String[] stringArray2 = ds.LoginScreen(stringArray[n2].trim(), ":", 0);
            ServerListScreen.LoginScreen[n2] = stringArray2[0];
            ServerListScreen.x[n2] = stringArray2[1];
            ServerListScreen.Message[n2] = Short.parseShort(stringArray2[2]);
            ServerListScreen.d[n2] = Byte.parseByte(stringArray2[3].trim());
            try {
                ServerListScreen.Item[n2] = Byte.parseByte(stringArray2[4].trim());
            }
            catch (Exception exception) {
                ServerListScreen.Item[n2] = 0;
            }
            try {
                ServerListScreen.i[n2] = Byte.parseByte(stringArray2[5].trim());
            }
            catch (Exception exception) {
                ServerListScreen.i[n2] = 0;
            }
            ++n2;
        }
        b = Byte.parseByte(stringArray[stringArray.length - 1]);
        ds.c(">>> getServerList= serverPriority: " + b);
        ServerListScreen.GameScreen();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void methodLoginScreen(mGraphics en2) {
        Object object;
        if (!u) {
            en2.LoginScreen(0);
            en2.d(0, 0, GameCanvas.A, GameCanvas.B);
        } else {
            GameCanvas.c(en2);
        }
        mFont.SessionReceiver.LoginScreen(en2, "v2.4.6(" + mGraphics.b + ")", GameCanvas.A - 2, 17, 1, mFont.o);
        try {
            object = "";
            if (MyHashtable == 0) {
                String cfr_ignored_0 = String.valueOf(object) + LoginScreen[n] + " disconnect";
            } else {
                String cfr_ignored_1 = String.valueOf(object) + LoginScreen[n] + " connected";
            }
        }
        catch (Exception exception) {}
        if (!SessionReceiver || u) {
            if (Res.clientType == 1 && !GameCanvas.e) {
                mFont.SessionReceiver.LoginScreen(en2, Res, GameCanvas.A - 2, GameCanvas.B - 15, 1, mFont.o);
            } else {
                mFont.SessionReceiver.LoginScreen(en2, Res, GameCanvas.A - 2, 2, 1, mFont.o);
            }
        } else {
            mFont.SessionReceiver.LoginScreen(en2, Res, GameCanvas.A - 2, 2, 1, mFont.o);
        }
        object = en2;
        if (!u) {
            if (o) return;
            en2.LoginScreen(x.j, GameCanvas.C, GameCanvas.D - 32, 3);
            if (!SessionReceiver) {
                mFont.c.LoginScreen(en2, T.gc, GameCanvas.C, GameCanvas.D + 24, 2);
                if (M == null) return;
                M.LoginScreen(en2);
                return;
            }
            if (M != null) {
                M.LoginScreen(en2);
            }
            en2.e(0, 0, GameCanvas.A, GameCanvas.B);
            mFont.c.LoginScreen(en2, String.valueOf(T.aE) + GameScreen + "%", GameCanvas.A / 2, GameCanvas.D + 24, 2);
            GameScreen.LoginScreen(GameScreen.ai, GameScreen.aj, GameScreen.ak, GameCanvas.A / 2 - 50, GameCanvas.D + 45, 100, 100.0f, en2);
            GameScreen.LoginScreen(GameScreen.Char, GameScreen.ag, GameScreen.ah, GameCanvas.A / 2 - 50, GameCanvas.D + 45, 100, GameScreen, en2);
            return;
        }
        int n2 = GameCanvas.D - 15 * this.A.length - 15;
        if (n2 < 25) {
            n2 = 25;
        }
        if (x.j != null) {
            en2.LoginScreen(x.j, GameCanvas.C, n2, 3);
        }
        n2 = this.A.length;
        int n3 = 0;
        while (n3 < n2) {
            this.A[n3].LoginScreen(en2);
            ++n3;
        }
        en2.e(0, 0, GameCanvas.A, GameCanvas.B);
        if (mGraphics.b != 1) return;
        if (MyHashtable == -1) {
            if (GameCanvas.w % 20 <= 10) return;
            en2.LoginScreen(GameScreen.ae, 0, 14, 7, 7, 0, (GameCanvas.A - mFont.f.LoginScreen(this.A[2 + this.C].b) >> 1) - 10, this.A[2 + this.C].k + 10, 0);
            return;
        }
        en2.LoginScreen(GameScreen.ae, 0, MyHashtable * 7, 7, 7, 0, (GameCanvas.A - mFont.f.LoginScreen(this.A[2 + this.C].b) >> 1) - 10, this.A[2 + this.C].k + 9, 0);
    }

    public final void c() {
        block14: {
            block13: {
                if (m) {
                    if (++J == 50) {
                        GameCanvas.ak.i();
                        m = false;
                    }
                    if (J == 100) {
                        if (GameCanvas.I == null) {
                            GameCanvas.I = new x();
                        }
                        GameCanvas.I.LoginScreen();
                        GameService.LoginScreen().r();
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
                if (Char.bI) {
                    return;
                }
                if (!u) {
                    return;
                }
                if (!v) {
                    return;
                }
                if (GameCanvas.currentScreen != this) {
                    return;
                }
                if (Session.LoginScreen().d()) break block13;
                if (Res.currentTimeMillis() <= K) break block14;
                ServerListScreen.LoginScreen(n, true);
                Session.LoginScreen().e();
                ServerListScreen.k();
            }
            K = Res.currentTimeMillis() + 5000L;
        }
    }

    private void o() {
        ds.c("load Screen= " + u + " select= " + z);
        if (u) {
            this.cn = new de("", this, this.A[ServerListScreen.z].e, null);
            return;
        }
        this.cn = M;
    }

    public static void b(mGraphics en2) {
    }

    public static void e() {
    }

    public final void d() {
        if (GameCanvas.e) {
            if (this.B != null && this.B.c()) {
                this.B.LoginScreen();
            }
            if (!u) {
                if (M != null && M.c()) {
                    M.LoginScreen();
                }
                super.d();
                return;
            }
            int n2 = this.A.length;
            int n3 = 0;
            while (n3 < n2) {
                if (this.A[n3] != null && this.A[n3].c()) {
                    this.A[n3].LoginScreen();
                }
                ++n3;
            }
        } else {
            if (Res.clientType == 1 && GameCanvas.i[13]) {
                GameCanvas.i[13] = false;
                this.B.LoginScreen();
            }
            if (u) {
                int n4;
                if (GameCanvas.i[8]) {
                    n4 = this.A.length - 1;
                    GameCanvas.i[8] = false;
                    if (++z > n4) {
                        z = 0;
                    }
                    this.o();
                }
                if (GameCanvas.i[2]) {
                    n4 = this.A.length - 1;
                    GameCanvas.i[2] = false;
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
            dataOutputStream.writeByte(T.fB);
            dataOutputStream.writeByte(LoginScreen.length);
            int n2 = 0;
            while (n2 < LoginScreen.length) {
                dataOutputStream.writeUTF(LoginScreen[n2]);
                dataOutputStream.writeUTF(x[n2]);
                dataOutputStream.writeShort(Message[n2]);
                dataOutputStream.writeByte(d[n2]);
                try {
                    dataOutputStream.writeByte(Item[n2]);
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
            dataOutputStream.writeByte(b);
            RMS.LoginScreen(L, byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            SplashScreen.e();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static void f() {
        Object object = RMS.b(L);
        if (object == null) {
            ServerListScreen.LoginScreen(j);
            return;
        }
        object = new ByteArrayInputStream((byte[])object);
        object = new DataInputStream((InputStream)object);
        try {
            T.LoginScreen(object.readByte());
            int n2 = object.readByte();
            LoginScreen = new String[n2];
            x = new String[n2];
            Message = new short[n2];
            d = new byte[n2];
            Item = new byte[n2];
            i = new byte[n2];
            int n3 = 0;
            while (n3 < n2) {
                ServerListScreen.LoginScreen[n3] = object.readUTF();
                ServerListScreen.x[n3] = object.readUTF();
                ServerListScreen.Message[n3] = object.readShort();
                ServerListScreen.d[n3] = object.readByte();
                try {
                    ServerListScreen.Item[n3] = object.readByte();
                }
                catch (Exception exception) {
                    ServerListScreen.Item[n3] = 0;
                }
                try {
                    ServerListScreen.i[n3] = object.readByte();
                }
                catch (Exception exception) {
                    ServerListScreen.i[n3] = 0;
                }
                ++n3;
            }
            b = object.readByte();
            object.close();
            SplashScreen.e();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final void b() {
        dh.b();
        GameScreen.k = 0;
        GameScreen.j = 0;
        this.n();
        c = false;
        GameCanvas.I = null;
        String string = RMS.c("ResVersion");
        int n2 = string != null && string != "" ? Integer.parseInt(string) : -1;
        if (n2 > 0) {
            u = true;
            GameCanvas.isLowGraphic(0);
        }
        o = true;
        this.A[2 + this.C].b = String.valueOf(T.aJ) + ": " + LoginScreen[n];
        this.cn = new de("", this, this.A[ServerListScreen.z].e, null);
        this.A[1 + this.C].b = T.T;
        if (this.A.length == 4 + this.C) {
            this.A[3 + this.C].b = T.bU;
        }
        Char.bI = false;
        Res.loadImageFromRMS();
        super.b();
    }

    public final void g() {
        GameScreen.k = 0;
        GameScreen.j = 0;
        this.n();
        c = false;
        GameCanvas.I = null;
        String string = RMS.c("ResVersion");
        int n2 = string != null && string != "" ? Integer.parseInt(string) : -1;
        if (n2 > 0) {
            u = true;
            GameCanvas.isLowGraphic(0);
        }
        o = true;
        this.A[2 + this.C].b = String.valueOf(T.aJ) + ": " + LoginScreen[n];
        this.cn = new de("", this, this.A[ServerListScreen.z].e, null);
        this.A[1 + this.C].b = T.T;
        if (this.A.length == 4 + this.C) {
            this.A[3 + this.C].b = T.bU;
        }
        super.b();
    }

    public final void methodItem() {
        if (GameCanvas.ak == null) {
            GameCanvas.ak = new ServerListScreen();
        }
        r = 0;
        GameScreen = 0;
        k = true;
        GameCanvas.ak.j();
        SessionReceiver = false;
        ServerListScreen.M.n = true;
        this.cn = new de("", this, 2, null);
    }

    public final void i() {
        GameCanvas.b(T.aC);
        Session.LoginScreen().e();
        GameMidlet.SERVER_IP = x[n];
        GameMidlet.SERVER_PORT = Message[n];
        RMS.LoginScreen(w, n);
        if (d[n] != T.fB) {
            T.LoginScreen(d[n]);
        }
        x.i = LoginScreen[n];
        this.n();
        u = true;
        MyHashtable = -1;
        v = true;
    }

    public final void methodLoginScreen(int n2, Object object) {
        ds.c("perform trong ServerListScreen" + n2);
        if (n2 == 1000) {
            GameCanvas.b();
        }
        if (n2 == 1 || n2 == 4) {
            Session.LoginScreen().e();
            v = false;
            u = true;
            MyHashtable = 0;
            SessionReceiver = false;
            RMS.LoginScreen();
            this.b();
        }
        if (n2 == 2) {
            k = false;
            M = new de(T.gd, this, 4, null);
            new de(T.gd, this, 4, null).j = GameCanvas.A / 2 - Screen.cq / 2;
            ServerListScreen.M.k = GameCanvas.D + 65;
            this.co = null;
            if (!GameCanvas.e) {
                ServerListScreen.M.j = GameCanvas.A / 2 - Screen.cq / 2;
                ServerListScreen.M.k = GameCanvas.B - Screen.cr - 1;
            }
            this.cn = new de("", this, 4, null);
            if (!SessionReceiver) {
                GameService.LoginScreen().b((byte)1, null);
                if (!GameCanvas.e) {
                    ServerListScreen.M.n = true;
                    this.cn = new de("", this, 4, null);
                }
                SessionReceiver = true;
            }
        }
        if (n2 == 3) {
            ServerListScreen.Res();
        }
        if (n2 == 10100) {
            if (GameCanvas.I == null) {
                GameCanvas.I = new x();
            }
            GameCanvas.I.b();
            GameCanvas.b();
            GameService.LoginScreen().f("");
            ds.c("tao user ao");
            GameCanvas.i();
            x.i = LoginScreen[n];
        }
        if (n2 == 5) {
            ServerListScreen.LoginScreen();
            if (LoginScreen.length == 1) {
                return;
            }
            object = new MyVector("");
            int n3 = 0;
            while (n3 < LoginScreen.length) {
                ((MyVector)object).addElement(new de(LoginScreen[n3], this, 6, null));
                ++n3;
            }
            GameCanvas.F.LoginScreen((MyVector)object);
            if (!GameCanvas.e) {
                GameCanvas.F.b = n;
            }
        }
        if (n2 == 6) {
            ServerListScreen.LoginScreen(GameCanvas.F.b, false);
            this.i();
        }
        if (n2 == 7) {
            if (GameCanvas.I == null) {
                GameCanvas.I = new x();
            }
            GameCanvas.I.b();
        }
        if (n2 == 8) {
            boolean bl2 = RMS.d("lowGraphic") == 1;
            MyVector el2 = new MyVector("cau hinh");
            el2.addElement(new de(T.Message, this, 9, null));
            el2.addElement(new de(T.z, this, 10, null));
            el2.addElement(new de(T.A, this, 14, null));
            GameCanvas.F.LoginScreen(el2);
            GameCanvas.F.b = bl2 ? 0 : 1;
        }
        if (n2 == 9) {
            RMS.LoginScreen("lowGraphic", 1);
            GameCanvas.isLowGraphic(T.cM, 8885, null);
        }
        if (n2 == 10) {
            RMS.LoginScreen("lowGraphic", 0);
            GameCanvas.isLowGraphic(T.cM, 8885, null);
        }
        if (n2 == 11) {
            if (GameCanvas.I == null) {
                GameCanvas.I = new x();
            }
            GameCanvas.I.b();
            String string = RMS.c("userAo" + n);
            if (string == null || string.equals("")) {
                GameService.LoginScreen().f("");
            } else {
                GameCanvas.I.n = true;
                GameCanvas.b();
                GameService.LoginScreen().c();
                GameService.LoginScreen().LoginScreen(string, "", Config.VERSION, (byte)1);
            }
            GameCanvas.b(T.aC);
            ds.c("tao user ao");
        }
        if (n2 == 12) {
            GameMidlet.f.LoginScreen();
        }
        if (n2 == 13 && (!SessionReceiver || u)) {
            switch (Res.clientType) {
                case 1: {
                    Res.loadImage();
                }
            }
        }
        if (n2 == 14) {
            de de2 = new de(T.ImageLoader, GameCanvas.ak, 15, null);
            de de3 = new de(T.bo, GameCanvas.ak, 16, null);
            GameCanvas.isLowGraphic(T.gg, de2, de3);
        }
        if (n2 == 15) {
            RMS.LoginScreen();
            GameCanvas.isLowGraphic(T.cM, 8885, null);
        }
        if (n2 == 16) {
            bp.c();
            GameCanvas.K = null;
        }
        if (n2 == 17) {
            if (GameCanvas.al == null) {
                GameCanvas.al = new eu();
            }
            GameCanvas.al.b();
        }
        if (n2 == 18) {
            GameCanvas.instance();
            bp.c();
            if (GameCanvas.al == null) {
                GameCanvas.al = new eu();
            }
            GameCanvas.al.b();
        }
        if (n2 == 19) {
            if (Res.clientType == 1) {
                bp.c();
                GameCanvas.K = null;
                return;
            }
            MyHashtable = 0;
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
        SessionReceiver = false;
        r = 0;
        Char.bI = false;
        ServerListScreen bs2 = this;
        if (!u) {
            M = new de(T.ge, bs2, 2, null);
            new de(T.ge, bs2, 2, null).n = true;
            ServerListScreen.M.j = GameCanvas.A / 2 - Screen.cq / 2;
            ServerListScreen.M.k = GameCanvas.D + 45;
            if (ServerListScreen.M.k > GameCanvas.B - 26) {
                ServerListScreen.M.k = GameCanvas.B - 26;
            }
        }
        if (!GameCanvas.e) {
            z = 0;
            bs2.o();
        }
        super.b();
    }

    public static void k() {
        GameMidlet.SERVER_IP = x[n];
        GameMidlet.SERVER_PORT = Message[n];
        T.LoginScreen(d[n]);
        x.i = LoginScreen[n];
        GameCanvas.b();
    }

    public static void methodLoginScreen(int n2, boolean bl2) {
        n = n2;
        if (bl2) {
            RMS.LoginScreen(w, n);
            ds.b("2>>>saveRMSInt:  RMS_svselect == " + n);
        }
    }

    public static void Res() {
        if (GameCanvas.I == null) {
            GameCanvas.I = new x();
        }
        GameCanvas.I.b();
        boolean bl2 = false;
        boolean bl3 = false;
        String string = RMS.c("userAo" + n);
        try {
            if (!RMS.c("acc").equals("")) {
                bl2 = true;
            }
            if (!string.equals("")) {
                bl3 = true;
            }
        }
        catch (Exception exception) {}
        GameCanvas.b();
        GameService.LoginScreen().c();
        if (!bl2 && !bl3) {
            GameCanvas.b();
            if (string == null || string.equals("")) {
                GameService.LoginScreen().f("");
            } else {
                GameCanvas.I.n = true;
                GameService.LoginScreen().LoginScreen(string, "", Config.VERSION, (byte)1);
            }
            RMS.LoginScreen(w, n);
            if (Session.LoginScreen().d) {
                GameCanvas.i();
            } else {
                GameCanvas.isLowGraphic(T.cM, 8884, null);
            }
        } else {
            GameCanvas.I.LoginScreen();
        }
        x.i = LoginScreen[n];
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
                    dataOutputStream.writeShort((short)ServerListScreen.f[n2].bU);
                    dataOutputStream.writeShort((short)ServerListScreen.f[n2].bW);
                    dataOutputStream.writeShort((short)ServerListScreen.f[n2].bV);
                    dataOutputStream.writeShort((short)ServerListScreen.f[n2].bX);
                    dataOutputStream.writeUTF(ServerListScreen.f[n2].ag);
                }
                ++n2;
            }
            RMS.LoginScreen(N, byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            SplashScreen.e();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

