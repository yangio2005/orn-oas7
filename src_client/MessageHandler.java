/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import main.GameCanvas;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.lcdui.Image;

public final class MessageHandler
implements bd {
    private static MessageHandler e;
    private Message f;
    public static boolean LoginScreen;
    private float g;
    public static boolean b;
    public static boolean c;
    public static MyHashtable d;

    static {
        LoginScreen = false;
        c = false;
        d = new MyHashtable("frame new boss");
    }

    public static MessageHandler LoginScreen() {
        if (e == null) {
            e = new MessageHandler();
        }
        return e;
    }

    public final void methodLoginScreen(boolean bl2) {
        if (GameCanvas.currentScreen != GameCanvas.al || !GameCanvas.al.LoginScreen) {
            if (bl2) {
                System.out.println("connect 1 ok");
                ServerListScreen.MyHashtable = 2;
                GameService.LoginScreen().c();
                GameService bt2 = GameService.LoginScreen();
                return;
            }
            GameService bt3 = GameService.LoginScreen();
            if (RMS.d("clienttype") != -1) {
                Res.clientType = RMS.d("clienttype");
            }
            try {
                ds.c("setType");
                Message y2 = GameService.d((byte)2);
                y2.d().writeByte(Res.clientType);
                y2.d().writeByte(mGraphics.b);
                y2.d().writeBoolean(false);
                y2.d().writeInt(GameCanvas.A);
                y2.d().writeInt(GameCanvas.B);
                y2.d().writeBoolean(cd.g);
                y2.d().writeBoolean(GameCanvas.e);
                y2.d().writeUTF(String.valueOf(System.getProperty("microedition.platform")) + "|" + Config.VERSION);
                InputStream inputStream = bt3.getClass().getResourceAsStream("res\\info");
                if (inputStream != null) {
                    inputStream.read(null);
                    y2.d().writeShort((null).length);
                    ((OutputStream)y2.d()).write(null);
                    ds.b("write " + (null).length + "|" + Config.VERSION);
                }
                bt3.LoginScreen = Session.b();
                bt3.LoginScreen.LoginScreen(y2);
                bt3.LoginScreen = Session.LoginScreen();
                y2.e();
            }
            catch (IOException iOException) {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
            }
            bt3 = GameService.LoginScreen();
        }
    }

    public final void b(boolean bl2) {
        if (!bl2) {
            if (GameCanvas.currentScreen == GameCanvas.ak && ServerListScreen.SessionReceiver && !GameService.f) {
                ServerListScreen.MyHashtable = 0;
                GameCanvas.ak.Item();
            }
            Res.loadImageFromRMS(bl2);
            return;
        }
        Res.loadImageFromRMS(bl2);
    }

    public final void c(boolean bl2) {
        block5: {
            block4: {
                if (bl2) break block4;
                if (GameCanvas.currentScreen == GameCanvas.ak && !GameService.f) {
                    GameCanvas.ak.Item();
                }
                if (GameCanvas.currentScreen != GameCanvas.I || GameService.f) break block5;
            }
            Res.loadImage(bl2);
        }
    }

    private void c(Message y2) {
        try {
            int n2 = y2.c().readUnsignedByte();
            Item h2 = GameScreen.Q.aH[n2];
            GameScreen.Q.aH[n2].r = y2.c().readInt();
            h2.Res = y2.c().readByte();
            h2.c = new MyVector("item.options");
            try {
                while (true) {
                    ee ee2;
                    if ((ee2 = MessageHandler.b(y2)) == null) {
                        continue;
                    }
                    h2.c.addElement(ee2);
                }
            }
            catch (Exception exception) {
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void methodLoginScreen(Message var1_1) {
        /*
         * This method has failed to decompile.  When submitting GameCanvas bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [55[CASE]], but top level block is 2[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void d(Message y2) {
        int n2 = y2.c().readByte();
        ab.LoginScreen = new bg[n2];
        ds.c("[LEN] sl nguoi choi " + n2);
        int n3 = 0;
        while (n3 < n2) {
            int n4 = y2.c().readInt();
            String string = y2.c().readUTF();
            short s2 = y2.c().readShort();
            short s3 = y2.c().readShort();
            short s4 = y2.c().readShort();
            long l2 = y2.c().readLong();
            ab.LoginScreen[n3] = new bg(n4, string, s2, s3, s4, l2);
            ++n3;
        }
        ((ab)null).b();
        ((ab)null).LoginScreen((byte)n2);
    }

    private static void methodLoginScreen(DataInputStream dataInputStream) {
        GameScreen.an = dataInputStream.readByte();
        GameScreen.j().L = new ek[dataInputStream.readByte()];
        int n2 = 0;
        while (n2 < GameScreen.j().L.length) {
            GameScreen.j().L[n2] = new ek();
            GameScreen.j();
            GameScreen.j();
            dataInputStream.readUTF();
            ++n2;
        }
        GameScreen.I = new da[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < GameScreen.I.length) {
            GameScreen.I[n2] = new da();
            GameScreen.I[n2].LoginScreen = n2;
            dataInputStream.readUTF();
            GameScreen.I[n2].b = new et[dataInputStream.readByte()];
            int n3 = 0;
            while (n3 < GameScreen.I[n2].b.length) {
                GameScreen.I[n2].b[n3] = new et();
                GameScreen.I[n2].b[n3].LoginScreen = dataInputStream.readByte();
                GameScreen.I[n2].b[n3].b = dataInputStream.readUTF();
                GameScreen.I[n2].b[n3].c = dataInputStream.readByte();
                GameScreen.I[n2].b[n3].d = dataInputStream.readByte();
                GameScreen.I[n2].b[n3].e = dataInputStream.readByte();
                GameScreen.I[n2].b[n3].f = dataInputStream.readShort();
                GameScreen.I[n2].b[n3].i = dataInputStream.readUTF();
                int n4 = 130;
                if (GameCanvas.A == 128 || GameCanvas.B <= 208) {
                    n4 = 100;
                }
                GameScreen.I[n2].b[n3].g = mFont.m.LoginScreen(dataInputStream.readUTF(), n4);
                GameScreen.I[n2].b[n3].Item = new bf[dataInputStream.readByte()];
                n4 = 0;
                while (n4 < GameScreen.I[n2].b[n3].Item.length) {
                    GameScreen.I[n2].b[n3].Item[n4] = new bf();
                    GameScreen.I[n2].b[n3].Item[n4].b = dataInputStream.readShort();
                    GameScreen.I[n2].b[n3].Item[n4].LoginScreen = GameScreen.I[n2].b[n3];
                    GameScreen.I[n2].b[n3].Item[n4].c = dataInputStream.readByte();
                    GameScreen.I[n2].b[n3].Item[n4].d = dataInputStream.readLong();
                    GameScreen.I[n2].b[n3].Item[n4].i = dataInputStream.readShort();
                    GameScreen.I[n2].b[n3].Item[n4].e = dataInputStream.readInt();
                    GameScreen.I[n2].b[n3].Item[n4].g = dataInputStream.readShort();
                    GameScreen.I[n2].b[n3].Item[n4].Item = dataInputStream.readShort();
                    dataInputStream.readByte();
                    GameScreen.I[n2].b[n3].Item[n4].k = dataInputStream.readShort();
                    dataInputStream.readShort();
                    GameScreen.I[n2].b[n3].Item[n4].Res = dataInputStream.readUTF();
                    o.LoginScreen(GameScreen.I[n2].b[n3].Item[n4]);
                    ++n4;
                }
                ++n3;
            }
            ++n2;
        }
    }

    private static void b(DataInputStream dataInputStream) {
        System.out.println(">>>createMap: " + dataInputStream.available());
        GameScreen.am = dataInputStream.readByte();
        bv.w = new String[dataInputStream.readShort()];
        int n2 = 0;
        while (n2 < bv.w.length) {
            bv.w[n2] = dataInputStream.readUTF();
            ++n2;
        }
        _do.BaseCanvas = new ap[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < _do.BaseCanvas.length) {
            _do.BaseCanvas[n2] = new ap();
            _do.BaseCanvas[n2].LoginScreen = n2;
            _do.BaseCanvas[n2].b = dataInputStream.readUTF();
            _do.BaseCanvas[n2].c = dataInputStream.readShort();
            _do.BaseCanvas[n2].d = dataInputStream.readShort();
            _do.BaseCanvas[n2].e = dataInputStream.readShort();
            _do.BaseCanvas[n2].f = new String[dataInputStream.readByte()][];
            int n3 = 0;
            while (n3 < _do.BaseCanvas[n2].f.length) {
                _do.BaseCanvas[n2].f[n3] = new String[dataInputStream.readByte()];
                int n4 = 0;
                while (n4 < _do.BaseCanvas[n2].f[n3].length) {
                    _do.BaseCanvas[n2].f[n3][n4] = dataInputStream.readUTF();
                    ++n4;
                }
                ++n3;
            }
            n2 = (byte)(n2 + 1);
        }
        Mob.c = new dy[dataInputStream.readShort()];
        n2 = 0;
        while (n2 < Mob.c.length) {
            Mob.c[n2] = new dy();
            Mob.c[n2].c = dataInputStream.readByte();
            Mob.c[n2].e = dataInputStream.readUTF();
            Mob.c[n2].d = dataInputStream.readLong();
            Mob.c[n2].LoginScreen = dataInputStream.readByte();
            Mob.c[n2].b = dataInputStream.readByte();
            Mob.c[n2].g = dataInputStream.readByte();
            ++n2;
        }
    }

    private static void methodLoginScreen(DataInputStream dataInputStream, boolean bl2) {
        GameScreen.al = dataInputStream.readByte();
        ds.c("vcData= " + GameScreen.al + " vData=" + GameScreen.ap);
        RMS.LoginScreen("NR_dart", ai.LoginScreen(dataInputStream));
        RMS.LoginScreen("NR_arrow", ai.LoginScreen(dataInputStream));
        RMS.LoginScreen("NR_effect", ai.LoginScreen(dataInputStream));
        RMS.LoginScreen("NR_image", ai.LoginScreen(dataInputStream));
        RMS.LoginScreen("NR_part", ai.LoginScreen(dataInputStream));
        RMS.LoginScreen("NR_skill", ai.LoginScreen(dataInputStream));
        RMS.LoginScreen("NRdata");
    }

    private static Image LoginScreen(byte[] byArray) {
        try {
            return Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void methodLoginScreen(Message y2, int n2) {
        try {
            cb cb2 = new cb();
            byte by2 = y2.c().readByte();
            cb2.b = by2;
            cb2.LoginScreen = y2.c().readInt();
            cb2.c = y2.c().readInt();
            cb2.d = y2.c().readUTF();
            cb2.Item = y2.c().readByte();
            cb2.e = y2.c().readInt() + 1000000000;
            ds.c("type= " + cb2.b + " id= " + cb2.LoginScreen + " playID= " + cb2.c + " time= " + cb2.e);
            boolean bl2 = false;
            GameScreen.aW = false;
            if (by2 == 0) {
                String string = y2.c().readUTF();
                ds.c("str chat " + string);
                GameScreen.aW = true;
                if (mFont.k.LoginScreen(string) > g.ab - 60) {
                    cb2.f = mFont.k.LoginScreen(string, g.ab - 10);
                } else {
                    cb2.f = new String[1];
                    cb2.f[0] = string;
                }
                cb2.g = y2.c().readByte();
            } else if (by2 == 1) {
                cb2.i = y2.c().readByte();
                cb2.j = y2.c().readByte();
                bl2 = y2.c().readByte() == 1;
                if (bl2) {
                    GameScreen.aW = true;
                }
                if (cb2.c != Char.e().J) {
                    cb2.k = cb2.i < cb2.j ? new String[]{T.cG} : null;
                }
                if (GameCanvas.G.ai != null) {
                    GameCanvas.G.LoginScreen(cb2.i, cb2.j);
                }
            } else if (by2 == 2 && Char.e().aj == 0) {
                GameScreen.aW = true;
                cb2.k = new String[]{T.bv, T.cH};
            }
            if (GameCanvas.currentScreen != GameScreen.c) {
                GameScreen.aW = false;
            } else if (GameCanvas.G.LoginScreen && GameCanvas.G.A == 0 && GameCanvas.G.B == 3) {
                GameScreen.aW = false;
            }
            cb.LoginScreen(cb2, n2, bl2);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private static void methodLoginScreen(byte n2) {
        ds.c("is loading map = " + Char.bI);
        GameScreen.j().aX = 0;
        GameScreen.bl = false;
        cw.LoginScreen = null;
        GameScreen.aD.f = false;
        GameScreen.aE.f = false;
        GameScreen.z = 0;
        GameCanvas.G.LoginScreen = false;
        bu.LoginScreen();
        if (!GameScreen.b && !cw.b) {
            GameScreen.j().LoginScreen();
        }
        GameScreen.LoginScreen(n2 == 1 ? Char.e().B : -1, n2 == 0 ? -1 : 0);
        bv.Item();
        bv.c(bv.e);
        ds.c("LOAD GAMESCR 2");
        Char.e().D = 0;
        Char.e().H = 4;
        Char.e().bP = null;
        Char.e().aQ = null;
        Char.e().aU = null;
        Char.e().aT = null;
        Char.e().aV = null;
        Char.e().cf = null;
        Char.e().c(false);
        Char.e().cg = null;
        GameCanvas.Res();
        if (Char.e().C >= bv.d - 100) {
            Char.e().bq = true;
            Char.e().B += ds.g(ds.b(0, 80));
            GameService.LoginScreen().g();
        }
        GameScreen.j().Res();
        GameCanvas.isLowGraphic(bv.o);
        Char.bH = false;
        int n3 = 0;
        while (n3 < Char.e().aB.size()) {
            Char.e().aB.elementAt(n3);
            ++n3;
        }
        GameCanvas.resetKeys();
        GameCanvas.clearKeyHold();
        GameScreen.j().bC = Char.e().U;
        GameScreen.j().bz = Char.e().T;
        Char.bG = false;
        GameScreen.j().b();
        if (Char.e().C <= 10 && n2 != 0 && n2 != 2) {
            cn cn2 = new cn(Char.e().B, Char.e().C, Char.e().bU, Char.e().I, 1, true, n2 == 1 ? Char.e().K : n2);
            cn.LoginScreen(cn2);
            Char.e().SessionReceiver = true;
        }
        if (n2 == 2) {
            Char.e().r();
        }
        if (GameScreen.j().Screen) {
            if (bv.Res == GameScreen.j().bh && bv.n == GameScreen.j().bi) {
                GameScreen.j().c(GameScreen.j().bf, GameScreen.j().bg);
            }
            if (mGraphics.b > 1) {
                GameScreen.j().GameScreen();
            }
        }
        bp.c();
        bp.LoginScreen(bv.k, String.valueOf(T.cl) + " " + bv.n, 30);
        GameCanvas.instance();
        GameCanvas.d = false;
        v.b();
        v.LoginScreen();
        GameCanvas.X = 2;
        GameCanvas.Y = Res.currentTimeMillis() + 1000L;
    }

    private void e(Message y2) {
        try {
            Object object;
            ds.c("123 char= " + Char.e() == null ? "null" : "!null");
            Char af2 = Char.e();
            Char af3 = Char.e();
            Char.e();
            short s2 = y2.c().readShort();
            af3.bD = s2;
            af2.B = s2;
            Char af4 = Char.e();
            Char af5 = Char.e();
            Char.e();
            short s3 = y2.c().readShort();
            af5.bE = s3;
            af4.C = s3;
            Char.e().cl = Char.e().B;
            Char.e().cm = Char.e().C;
            ds.c("head= " + Char.e().bU + " body= " + Char.e().bW + " left= " + Char.e().bV + " x= " + Char.e().B + " Message= " + Char.e().C + " chung toc= " + Char.e().K);
            if (Char.e().B >= 0 && Char.e().B <= 100) {
                Char.e().I = 1;
            } else if (Char.e().B >= bv.LoginScreen - 100 && Char.e().B <= bv.LoginScreen) {
                Char.e().I = -1;
            }
            int n2 = y2.c().readByte();
            ds.c("vGo size= " + n2);
            if (!GameScreen.aD.e) {
                GameScreen.aD.d = Char.e().B - GameScreen.j;
                GameScreen.aD.c = Char.e().C - GameScreen.k;
            }
            int n3 = 0;
            while (n3 < n2) {
                new bw(y2.c().readShort(), y2.c().readShort(), y2.c().readShort(), y2.c().readShort(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readUTF());
                ++n3;
            }
            n2 = y2.c().readByte();
            Mob.L.removeAllElements();
            n3 = 0;
            while (n3 < n2) {
                object = new Mob(n3, y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readShort(), y2.c().readByte(), y2.c().readLong(), y2.c().readByte(), y2.c().readLong(), y2.c().readShort(), y2.c().readShort(), y2.c().readByte(), y2.c().readByte());
                new Mob(n3, y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readShort(), y2.c().readByte(), y2.c().readLong(), y2.c().readByte(), y2.c().readLong(), y2.c().readShort(), y2.c().readShort(), y2.c().readByte(), y2.c().readByte()).P = ((Mob)object).m;
                ((Mob)object).Q = ((Mob)object).n;
                ((Mob)object).I = y2.c().readBoolean();
                if (Mob.c[((Mob)object).C].c != 0) {
                    ((Mob)object).o = n3 % 3 == 0 ? -1 : 1;
                    ((Mob)object).m += 10 - n3 % 20;
                }
                ((Mob)object).J = false;
                Npc cc2 = null;
                an an2 = null;
                d d2 = null;
                cl cl2 = null;
                if (((Mob)object).C == 70) {
                    cc2 = new Npc(n3, (short)((Mob)object).m, (short)((Mob)object).n, 70, ((Mob)object).k, ((Mob)object).Res, ((Mob)object).G);
                }
                if (((Mob)object).C == 71) {
                    an2 = new an(n3, (short)((Mob)object).m, (short)((Mob)object).n, 71, ((Mob)object).k, ((Mob)object).Res);
                }
                if (((Mob)object).C == 72) {
                    d2 = new d(n3, (short)((Mob)object).m, (short)((Mob)object).n, 72, ((Mob)object).k, ((Mob)object).Res);
                }
                if (((Mob)object).I) {
                    cl2 = new cl(n3, (short)((Mob)object).m, (short)((Mob)object).n, ((Mob)object).C, ((Mob)object).k, ((Mob)object).Res);
                }
                if (cl2 != null) {
                    GameScreen.F.addElement(cl2);
                } else if (cc2 != null) {
                    GameScreen.F.addElement(cc2);
                } else if (an2 != null) {
                    GameScreen.F.addElement(an2);
                } else if (d2 != null) {
                    GameScreen.F.addElement(d2);
                } else {
                    GameScreen.F.addElement(object);
                }
                n3 = (byte)(n3 + 1);
            }
            if (Char.e().aR != null && GameScreen.c(Char.e().aR.Message) == null) {
                Char.e().aR.v();
                Char.e().aR.m = Char.e().B;
                Char.e().aR.n = Char.e().C - 40;
                GameScreen.F.addElement(Char.e().aR);
            }
            y2.c().readByte();
            n2 = y2.c().readByte();
            ds.c("NPC size= " + n2);
            n3 = 0;
            while (n3 < n2) {
                block71: {
                    short s4;
                    byte by2;
                    short s5;
                    short s6;
                    byte by3;
                    block72: {
                        by3 = y2.c().readByte();
                        s6 = y2.c().readShort();
                        s5 = y2.c().readShort();
                        by2 = y2.c().readByte();
                        ds.c("tempalte = " + by2);
                        s4 = y2.c().readShort();
                        ds.c("1");
                        if (by2 == 6) break block71;
                        ds.c("2");
                        if (Char.e().aD.c >= 7 && (Char.e().aD.c != 7 || Char.e().aD.LoginScreen > 1)) break block72;
                        if (by2 == 7 || by2 == 8 || by2 == 9) break block71;
                        ds.c("3");
                    }
                    if (Char.e().aD.c >= 6 || by2 != 16) {
                        if (by2 == 4) {
                            GameScreen.j().aM = new k(n3, by3, s6, s5, by2, s4);
                            GameService.LoginScreen().e((byte)2);
                            GameScreen.G.addElement(GameScreen.j().aM);
                            ds.c("5");
                        } else {
                            _do do_ = new _do(n3, by3, s6, s5 + 3, by2, s4);
                            GameScreen.G.addElement(do_);
                            ds.c("6");
                        }
                    }
                }
                ++n3;
            }
            n2 = y2.c().readByte();
            ds.c("item size = " + n2);
            int n4 = 0;
            while (n4 < n2) {
                short s7 = y2.c().readShort();
                short s8 = y2.c().readShort();
                short s9 = y2.c().readShort();
                short s10 = y2.c().readShort();
                int n5 = y2.c().readInt();
                int n6 = 0;
                if (n5 == -2) {
                    n6 = y2.c().readShort();
                }
                ItemMap ce2 = new ItemMap(n5, s7, s8, (int)s9, (int)s10, (short)n6);
                s8 = 0;
                n6 = 0;
                while (n6 < GameScreen.E.size()) {
                    ItemMap ce3 = (ItemMap)GameScreen.E.elementAt(n6);
                    if (ce3.d == ce2.d) {
                        s8 = 1;
                        break;
                    }
                    ++n6;
                }
                if (s8 == 0) {
                    GameScreen.E.addElement(ce2);
                }
                ++n4;
            }
            bv.v.removeAllElements();
            if (mGraphics.b == 1) {
                cz.LoginScreen();
            }
            cz.Res.removeAllElements();
            if (!GameCanvas.isLowGraphic || GameCanvas.isLowGraphic && bv.LoginScreen() || bv.Res == 45 || bv.Res == 46 || bv.Res == 47 || bv.Res == 48 || bv.Res == 120 || bv.Res == 128 || bv.Res == 170 || bv.Res == 49) {
                n4 = y2.c().readShort();
                int n7 = 0;
                while (n7 < n4) {
                    short s11 = y2.c().readShort();
                    short s12 = y2.c().readShort();
                    short s13 = y2.c().readShort();
                    if (bv.LoginScreen(s11) != null) {
                        Object object2 = bv.LoginScreen(s11);
                        cz cz2 = new cz();
                        new cz().LoginScreen = s11;
                        cz2.c = ((cz)object2).c;
                        cz2.f = ((cz)object2).f;
                        cz2.g = ((cz)object2).g;
                        cz2.d = s12 * bv.i;
                        cz2.e = s13 * bv.i;
                        cz2.Item = ((cz)object2).Item;
                        if (bv.b(cz2.LoginScreen)) {
                            int n8 = cz2.b = n7 % 2 == 0 ? 0 : 2;
                            if (bv.Res == 45) {
                                cz2.b = 0;
                            }
                        }
                        if (!cz.k.containsKey(String.valueOf(cz2.c))) {
                            if (mGraphics.b == 1) {
                                object2 = Res.clientType("/mapBackGround/" + cz2.c + ".png");
                                if (object2 == null) {
                                    object2 = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                                    Session.b().d();
                                    GameService.LoginScreen().c(cz2.c);
                                }
                                cz.k.put(String.valueOf(cz2.c), object2);
                            } else {
                                s11 = 0;
                                byte[] byArray = RMS.b(String.valueOf(mGraphics.b) + "bgItem" + cz2.c);
                                object2 = byArray;
                                if (byArray != null) {
                                    if (cz.n != null) {
                                        ds.c("Small  last= " + ((Object)object2).length % 127 + "new Version= " + cz.n[cz2.c]);
                                        if (((Object)object2).length % 127 != cz.n[cz2.c]) {
                                            s11 = 1;
                                        }
                                    }
                                    if (s11 == 0) {
                                        if ((object2 = Image.createImage((byte[])object2, (int)0, (int)((Object)object2).length)) != null) {
                                            cz.k.put(String.valueOf(cz2.c), object2);
                                        } else {
                                            s11 = 1;
                                        }
                                    }
                                } else {
                                    s11 = 1;
                                }
                                if (s11 != 0) {
                                    object2 = Res.clientType("/mapBackGround/" + cz2.c + ".png");
                                    if (object2 == null) {
                                        object2 = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                                        GameService.LoginScreen().c(cz2.c);
                                    }
                                    cz.k.put(String.valueOf(cz2.c), object2);
                                }
                            }
                            cz.m.addElement(String.valueOf(cz2.c));
                        }
                        if (!cz.LoginScreen(String.valueOf(cz2.c))) {
                            cz.Res.addElement(String.valueOf(cz2.c));
                        }
                        bv.v.addElement(cz2);
                    }
                    ++n7;
                }
                n7 = 0;
                while (n7 < cz.m.size()) {
                    object = (String)cz.m.elementAt(n7);
                    if (!cz.LoginScreen((String)object)) {
                        cz.k.remove(object);
                        if (cz.k.containsKey(String.valueOf(object) + "blend" + 1)) {
                            cz.k.remove(String.valueOf(object) + "blend" + 1);
                        }
                        if (cz.k.containsKey(String.valueOf(object) + "blend" + 3)) {
                            cz.k.remove(String.valueOf(object) + "blend" + 3);
                        }
                        cz.m.removeElementAt(n7);
                        --n7;
                    }
                    ++n7;
                }
                WeatherEffect.d = false;
                WeatherEffect.e = 0;
                ei.LoginScreen.removeAllElements();
                WeatherEffect.LoginScreen.removeAllElements();
                ea.m.removeAllElements();
                n7 = y2.c().readShort();
                System.out.println("nKey= " + n7);
                int n9 = 0;
                while (n9 < n7) {
                    Object object3 = y2.c().readUTF();
                    String string = y2.c().readUTF();
                    System.out.println("key= " + (String)object3 + " value= " + string + "--------------------------------------------------------------------");
                    String[] stringArray = object3;
                    object3 = string;
                    String[] stringArray2 = stringArray;
                    if (stringArray.equals("eff")) {
                        if (g.I <= 0) {
                            int n10;
                            stringArray2 = ds.LoginScreen((String)object3, ".", 0);
                            int n11 = Integer.parseInt(stringArray2[0]);
                            int n12 = Integer.parseInt(stringArray2[1]);
                            int n13 = Integer.parseInt(stringArray2[2]);
                            int n14 = Integer.parseInt(stringArray2[3]);
                            if (stringArray2.length <= 4) {
                                n4 = -1;
                                n10 = 1;
                            } else {
                                n4 = Integer.parseInt(stringArray2[4]);
                                n10 = Integer.parseInt(stringArray2[5]);
                            }
                            object3 = new ea(n11, n13, n14, n12, n4, n10);
                            if (stringArray2.length > 6) {
                                object3.b = Integer.parseInt(stringArray2[6]);
                                if (stringArray2.length > 7) {
                                    object3.c = Integer.parseInt(stringArray2[7]);
                                    object3.d = Integer.parseInt(stringArray2[8]);
                                }
                            }
                            ei.LoginScreen((ea)object3);
                        }
                    } else if (stringArray2.equals("beff") && g.I <= 1) {
                        WeatherEffect.LoginScreen(Integer.parseInt((String)object3));
                    }
                    ++n9;
                }
            } else {
                n4 = y2.c().readShort();
                int n15 = 0;
                while (n15 < n4) {
                    y2.c().readShort();
                    y2.c().readShort();
                    y2.c().readShort();
                    ++n15;
                }
                n15 = y2.c().readShort();
                int n16 = 0;
                while (n16 < n15) {
                    y2.c().readUTF();
                    y2.c().readUTF();
                    ++n16;
                }
            }
            bv.GameScreen = y2.c().readByte();
            byte by4 = y2.c().readByte();
            n4 = by4;
            MessageHandler.LoginScreen(by4);
        }
        catch (Exception exception) {
            ds.b(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Loadmap khong thanh cong");
            GameCanvas.e();
            ServerListScreen.m = true;
            GameCanvas.instance();
        }
        GameCanvas.d = false;
        ds.b(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Loadmap thanh cong");
    }

    private void f(Message y2) {
        try {
            try {
                int n2 = y2.c().readByte();
                Res.e("messageNotMap: cmd:" + n2);
                switch (n2) {
                    case 16: {
                        LoginScreen.LoginScreen().b();
                        break;
                    }
                    case 17: {
                        Char.e();
                        Char.N();
                        break;
                    }
                    case 18: {
                        GameCanvas.d = false;
                        GameCanvas.instance();
                        Integer n3 = new Integer(y2.c().readInt());
                        ((j)null).LoginScreen(T.RMS, new de(T.ServerListScreen, GameCanvas.instance, 88829, n3), 0);
                        break;
                    }
                    case 20: {
                        Char.e().aM = y2.c().readByte();
                        GameScreen.aD.LoginScreen(String.valueOf(T.bG) + " " + Char.e().aM, 0);
                        break;
                    }
                    case 33: {
                        break;
                    }
                    case 35: {
                        GameCanvas.instance();
                        GameScreen.j().n();
                        GameScreen.aD.LoginScreen(y2.c().readUTF(), 0);
                        break;
                    }
                    case 36: {
                        GameScreen.aC = y2.c().readByte();
                        ds.c("load Me Active: " + GameScreen.aC);
                        break;
                    }
                    case 4: {
                        GameCanvas.I.e();
                        GameScreen.bj = false;
                        GameScreen.bk = false;
                        x.d = true;
                        x.e = true;
                        x.f = true;
                        x.g = true;
                        x.Item = true;
                        GameScreen.ap = y2.c().readByte();
                        GameScreen.aq = y2.c().readByte();
                        GameScreen.ar = y2.c().readByte();
                        GameScreen.ImageCache = y2.c().readByte();
                        y2.c().readByte();
                        if (GameCanvas.I.n) {
                            RMS.LoginScreen("acc", "");
                            RMS.LoginScreen("pass", "");
                        } else {
                            RMS.LoginScreen("userAo" + ServerListScreen.n, "");
                        }
                        ds.c("****** DATA VERSION: Server " + GameScreen.ap + " Client " + GameScreen.al);
                        ds.c("****** MAP VERSION: Server " + GameScreen.aq + " Client " + GameScreen.am);
                        ds.c("****** SKILL VERSION: Server " + GameScreen.ar + " Client " + GameScreen.an);
                        ds.c("****** ITEM VERSION: Server " + GameScreen.ImageCache + " Client " + GameScreen.ao);
                        if (GameScreen.ap != GameScreen.al) {
                            ds.c("send update data");
                            GameScreen.b = false;
                            GameService.LoginScreen().Res();
                        } else {
                            try {
                                x.e = false;
                            }
                            catch (Exception exception) {
                                Exception exception2 = exception;
                                exception.printStackTrace();
                                GameScreen.al = (byte)-1;
                                GameService.LoginScreen().Res();
                            }
                        }
                        if (GameScreen.aq != GameScreen.am) {
                            GameScreen.b = false;
                            GameService.LoginScreen().m();
                        } else {
                            try {
                                if (!GameScreen.b) {
                                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(RMS.b("NRmap")));
                                    MessageHandler.b(dataInputStream);
                                }
                                x.f = false;
                            }
                            catch (Exception exception) {
                                GameScreen.am = (byte)-1;
                                GameService.LoginScreen().m();
                            }
                        }
                        if (GameScreen.ar != GameScreen.an) {
                            GameScreen.b = false;
                            GameService.LoginScreen().n();
                        } else {
                            try {
                                if (!GameScreen.b) {
                                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(RMS.b("NRskill")));
                                    MessageHandler.LoginScreen(dataInputStream);
                                }
                                x.g = false;
                            }
                            catch (Exception exception) {
                                GameScreen.an = (byte)-1;
                                GameService.LoginScreen().n();
                            }
                        }
                        if (GameScreen.ImageCache != GameScreen.ao) {
                            GameScreen.b = false;
                            GameService.LoginScreen().o();
                        } else {
                            try {
                                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(RMS.b("NRitem0")));
                                this.b(dataInputStream, false);
                                dataInputStream = new DataInputStream(new ByteArrayInputStream(RMS.b("NRitem1")));
                                this.b(dataInputStream, false);
                                dataInputStream = new DataInputStream(new ByteArrayInputStream(RMS.b("NRitem100")));
                                this.b(dataInputStream, false);
                                x.Item = false;
                            }
                            catch (Exception exception) {
                                GameScreen.ao = (byte)-1;
                                GameService.LoginScreen().o();
                            }
                            try {
                                Object object = RMS.b("NRitem101");
                                if (object != null) {
                                    object = new DataInputStream(new ByteArrayInputStream((byte[])object));
                                    this.b((DataInputStream)object, false);
                                }
                            }
                            catch (Exception exception) {}
                        }
                        System.out.println("3>>>readOk:isLoadAllData: " + GameScreen.b);
                        if (!GameScreen.b) {
                            GameScreen.j();
                            GameScreen.i();
                        } else {
                            GameService.LoginScreen().GameScreen();
                        }
                        n2 = y2.c().readByte();
                        ds.c("CAPTION LENT= " + n2);
                        GameScreen.R = new long[n2];
                        n2 = 0;
                        while (n2 < GameScreen.R.length) {
                            GameScreen.R[n2] = y2.c().readLong();
                            ++n2;
                        }
                        break;
                    }
                    case 6: {
                        ds.c("GET UPDATE_MAP " + y2.c().available() + " bytes");
                        y2.c().mark(100000);
                        MessageHandler.b(y2.c());
                        y2.c().reset();
                        byte[] byArray = new byte[y2.c().available()];
                        y2.c().readFully(byArray);
                        RMS.LoginScreen("NRmap", byArray);
                        byArray = new byte[]{GameScreen.am};
                        RMS.LoginScreen("NRmapVersion", byArray);
                        ds.c("GET UPDATE_MAP NRmapVersion:" + byArray);
                        x.f = false;
                        GameScreen.j();
                        GameScreen.i();
                        break;
                    }
                    case 7: {
                        ds.c("GET UPDATE_SKILL " + y2.c().available() + " bytes");
                        y2.c().mark(100000);
                        MessageHandler.LoginScreen(y2.c());
                        y2.c().reset();
                        byte[] byArray = new byte[y2.c().available()];
                        y2.c().readFully(byArray);
                        RMS.LoginScreen("NRskill", byArray);
                        byArray = new byte[]{GameScreen.an};
                        RMS.LoginScreen("NRskillVersion", byArray);
                        x.g = false;
                        GameScreen.j();
                        GameScreen.i();
                        break;
                    }
                    case 8: {
                        ds.c("GET UPDATE_ITEM " + y2.c().available() + " bytes");
                        DataInputStream dataInputStream = y2.c();
                        Object object = this;
                        try {
                            ((MessageHandler)object).b(dataInputStream, true);
                        }
                        catch (Exception exception) {
                            object = exception;
                            exception.printStackTrace();
                        }
                        break;
                    }
                    case 10: {
                        try {
                            Char.bI = true;
                            ds.c("REQUEST MAP TEMPLATE");
                            GameCanvas.d = true;
                            bv.f = null;
                            bv.g = null;
                            System.gc();
                            bv.LoginScreen = y2.c().readByte();
                            bv.b = y2.c().readByte();
                            bv.f = new int[bv.LoginScreen * bv.b];
                            ds.c("Cmd.REQUEST_MAPTEMPLATE=10  w|H= " + bv.LoginScreen + "|" + bv.b + "\n Dien Tich = " + bv.LoginScreen * bv.b);
                            n2 = 0;
                            while (n2 < bv.f.length) {
                                int n4 = y2.c().readByte();
                                if (n4 < 0) {
                                    n4 += 256;
                                }
                                bv.f[n2] = (char)n4;
                                ++n2;
                            }
                            bv.g = new int[bv.f.length];
                            y2 = this.f;
                            this.e(y2);
                            try {
                                byte by2 = y2.c().readByte();
                                n2 = by2;
                                bv.j = by2 != 0;
                            }
                            catch (Exception exception) {}
                        }
                        catch (Exception exception) {
                            Exception exception3 = exception;
                            exception.printStackTrace();
                        }
                        y2.e();
                        this.f.e();
                        this.f = null;
                        y2 = null;
                        break;
                    }
                }
            }
            catch (Exception exception) {
                if (y2 != null) {
                    y2.e();
                    return;
                }
            }
        }
        finally {
            if (y2 != null) {
                y2.e();
            }
        }
    }

    private static void g(Message y2) {
        try {
            try {
                byte by2 = y2.c().readByte();
                switch (by2) {
                    case 2: {
                        String string;
                        ServerListScreen.j = string = y2.c().readUTF();
                        ServerListScreen.LoginScreen(string);
                        try {
                            byte by3 = y2.c().readByte();
                            g.ad = by3 == 1;
                        }
                        catch (Exception exception) {}
                        c = true;
                    }
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                if (y2 != null) {
                    y2.e();
                    return;
                }
            }
        }
        finally {
            if (y2 != null) {
                y2.e();
            }
        }
    }

    /*
     * Exception decompiling
     */
    private void methodItem(Message var1_1) {
        /*
         * This method has failed to decompile.  When submitting GameCanvas bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [19[CASE]], but top level block is 7[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void methodLoginScreen(bf bf2) {
        if (Char.e().aC == null) {
            Char.e().aC = bf2;
        } else if (bf2.LoginScreen.equals(Char.e().aC.LoginScreen)) {
            Char.e().aC = bf2;
        }
        Char.e().az.addElement(bf2);
        if ((bf2.LoginScreen.e == 1 || bf2.LoginScreen.e == 4 || bf2.LoginScreen.e == 2 || bf2.LoginScreen.e == 3) && (bf2.LoginScreen.c == 0 || bf2.LoginScreen.c > 0 && bf2.c > 0)) {
            if (bf2.LoginScreen.LoginScreen == Char.e().aP) {
                GameService.LoginScreen().i(Char.e().aP);
            }
            Char.e().aA.addElement(bf2);
        }
    }

    private static boolean methodLoginScreen(Char object, Message y2) {
        try {
            ((Char)object).Q = y2.c().readByte();
            ((Char)object).bc = y2.c().readBoolean();
            ((Char)object).aN = y2.c().readByte();
            ds.c("ADD TYPE PK= " + ((Char)object).aN + " to player " + ((Char)object).J);
            ((Char)object).ax = GameScreen.I[y2.c().readByte()];
            ((Char)object).K = y2.c().readByte();
            ((Char)object).bU = y2.c().readShort();
            ((Char)object).ag = y2.c().readUTF();
            ((Char)object).cT = ((Char)object).U = y2.c().readLong();
            if (((Char)object).U == 0L) {
                ((Char)object).H = 14;
            }
            ((Char)object).V = y2.c().readLong();
            if (((Char)object).C >= bv.d - 100) {
                ((Char)object).bq = true;
            }
            ((Char)object).bW = y2.c().readShort();
            ((Char)object).bV = y2.c().readShort();
            ((Char)object).bX = y2.c().readShort();
            ds.c(" body= " + ((Char)object).bW + " leg= " + ((Char)object).bV + " bag=" + ((Char)object).bX + "BAG ==" + ((Char)object).bX + "*********************************");
            ((Char)object).bd = true;
            y2.c().readByte();
            if (((Char)object).bY == -1) {
                ((Char)object).MyHashtable();
            }
            if (((Char)object).bW == -1) {
                ((Char)object).u();
            }
            if (((Char)object).bV == -1) {
                ((Char)object).v();
            }
            ds.c("1");
            ((Char)object).B = y2.c().readShort();
            ((Char)object).C = y2.c().readShort();
            ((Char)object).cl = ((Char)object).B;
            ((Char)object).cm = ((Char)object).C;
            ((Char)object).R = y2.c().readShort();
            ((Char)object).S = y2.c().readShort();
            int n2 = y2.c().readByte();
            int n3 = 0;
            while (n3 < n2) {
                ec ec2 = new ec(y2.c().readByte(), y2.c().readInt(), y2.c().readInt(), y2.c().readShort());
                ((Char)object).aB.addElement(ec2);
                ++n3;
            }
            ds.c("Controller readCharInfo body: body|leg|bag " + ((Char)object).bW + ((Char)object).bV + ((Char)object).bX);
            return true;
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            return false;
        }
    }

    private void i(Message object) {
        try {
            String string = ((Message)object).c().readUTF();
            byte by2 = ((Message)object).c().readByte();
            byte[] byArray = ai.LoginScreen((Message)object);
            object = byArray;
            Image image = MessageHandler.LoginScreen(byArray);
            ImageCache.imgCache(string, image, by2);
            if (object != null) {
                ImageCache.imgCache(string, by2, (byte[])object);
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    private void b(DataInputStream dataInputStream, boolean bl2) {
        block17: {
            try {
                dataInputStream.mark(1000000);
                GameScreen.ao = dataInputStream.readByte();
                int n2 = dataInputStream.readByte();
                Res.e(">>loadItemNew:  type:" + n2);
                if (n2 == 0) {
                    GameScreen.j().K = new dn[dataInputStream.readShort()];
                    n2 = 0;
                    while (n2 < GameScreen.j().K.length) {
                        GameScreen.j().K[n2] = new dn();
                        GameScreen.j().K[n2].LoginScreen = n2;
                        GameScreen.j().K[n2].b = dataInputStream.readUTF();
                        GameScreen.j();
                        dataInputStream.readByte();
                        ++n2;
                    }
                    try {
                        n2 = dataInputStream.readShort();
                        int n3 = 0;
                        while (n3 < n2) {
                            short s2 = dataInputStream.readShort();
                            GameScreen.j().K[s2].c = dataInputStream.readUnsignedByte();
                            ++n3;
                        }
                    }
                    catch (Exception exception) {}
                    if (bl2) {
                        dataInputStream.reset();
                        byte[] byArray = new byte[dataInputStream.available()];
                        dataInputStream.readFully(byArray);
                        RMS.LoginScreen("NRitem0", byArray);
                        return;
                    }
                    break block17;
                }
                if (n2 == 1) {
                    Object object;
                    dp.LoginScreen.clear();
                    n2 = dataInputStream.readShort();
                    int n4 = 0;
                    while (n4 < n2) {
                        dd dd2 = new dd((short)n4, dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readByte(), dataInputStream.readInt(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readBoolean());
                        object = dd2;
                        dp.LoginScreen(dd2);
                        ++n4;
                    }
                    if (bl2) {
                        dataInputStream.reset();
                        byte[] byArray = new byte[dataInputStream.available()];
                        dataInputStream.readFully(byArray);
                        RMS.LoginScreen("NRitem1", byArray);
                        object = new byte[]{GameScreen.ao};
                        RMS.LoginScreen("NRitemVersion", object);
                        return;
                    }
                    break block17;
                }
                if (n2 == 2) break block17;
                if (n2 == 100) {
                    Char.cU = MessageHandler.c(dataInputStream);
                    if (bl2) {
                        dataInputStream.reset();
                        byte[] byArray = new byte[dataInputStream.available()];
                        dataInputStream.readFully(byArray);
                        RMS.LoginScreen("NRitem100", byArray);
                        return;
                    }
                    break block17;
                }
                if (n2 != 101) break block17;
                try {
                    n2 = dataInputStream.readShort();
                    Char.da = new short[n2];
                    int n5 = 0;
                    while (n5 < n2) {
                        short s3;
                        Char.da[n5] = s3 = dataInputStream.readShort();
                        ++n5;
                    }
                    if (bl2) {
                        dataInputStream.reset();
                        byte[] byArray = new byte[dataInputStream.available()];
                        dataInputStream.readFully(byArray);
                        RMS.LoginScreen("NRitem101", byArray);
                        return;
                    }
                }
                catch (Exception exception) {
                    Char.da = new short[0];
                    return;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }

    private static void b(Message y2, int n2) {
        try {
            int n3 = y2.c().readByte();
            int[][] nArrayArray = new int[n3][];
            int n4 = 0;
            while (n4 < n3) {
                int n5 = y2.c().readByte();
                nArrayArray[n4] = new int[n5];
                int n6 = 0;
                while (n6 < n5) {
                    nArrayArray[n4][n6] = y2.c().readByte();
                    ++n6;
                }
                ++n4;
            }
            d.put(String.valueOf(n2), nArrayArray);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private static int[][] c(DataInputStream dataInputStream) {
        int[][] nArrayArray = new int[][]{{542, 543}};
        try {
            int n2 = dataInputStream.readShort();
            nArrayArray = new int[n2][];
            n2 = 0;
            while (n2 < nArrayArray.length) {
                int n3 = dataInputStream.readByte();
                nArrayArray[n2] = new int[n3];
                int n4 = 0;
                while (n4 < n3) {
                    nArrayArray[n2][n4] = dataInputStream.readShort();
                    ++n4;
                }
                ++n2;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        return nArrayArray;
    }

    private void j(Message object) {
        block11: {
            try {
                block12: {
                    byte by2 = ((Message)object).c().readByte();
                    if (by2 != 0) break block11;
                    try {
                        byte s2 = ((Message)object).c().readByte();
                        if (s2 == 0) {
                            short s3 = ((Message)object).c().readShort();
                            String string = ((Message)object).c().readUTF();
                            String string2 = ((Message)object).c().readUTF();
                            int n2 = ((Message)object).c().readInt();
                            short s4 = ((Message)object).c().readShort();
                            byte by3 = ((Message)object).c().readByte();
                            GameScreen.bY = new cg(by2, s3, string, string2, n2, s4);
                            new cg(by2, s3, string, string2, n2, s4).g = by3;
                            GameScreen.bY.LoginScreen(by2, 0, 0);
                            break block11;
                        }
                        if (s2 == 1) {
                            int n3 = ((Message)object).c().readInt();
                            int n4 = ((Message)object).c().readInt();
                            if (GameScreen.bY == null) break block12;
                            int n5 = n3;
                            object = GameScreen.bY;
                            GameScreen.bY.LoginScreen = by2;
                            ((cg)object).c = n5;
                            ((cg)object).d = n4;
                            break block11;
                        }
                        if (s2 == 2) {
                            byte by3 = ((Message)object).c().readByte();
                            int n6 = 0;
                            if (by3 == 1) {
                                n6 = 1;
                            } else if (by3 == 2) {
                                n6 = 2;
                            }
                            GameScreen.bY = null;
                            GameScreen.LoginScreen(n6, -1, 0, GameCanvas.C, GameCanvas.D, 0, 0, (short)-1, null);
                            break block11;
                        }
                        if (s2 == 5) {
                            short s5 = ((Message)object).c().readShort();
                            if (GameScreen.bY == null) break block12;
                            short s6 = s5;
                            object = GameScreen.bY;
                            GameScreen.bY.LoginScreen = by2;
                            ((cg)object).m = s6;
                            ((cg)object).n = GameCanvas.b;
                            break block11;
                        }
                        if (s2 != 4) break block12;
                        byte by4 = ((Message)object).c().readByte();
                        byte by5 = ((Message)object).c().readByte();
                        if (GameScreen.bY == null) break block12;
                        GameScreen.bY.LoginScreen(by2, by4, by5);
                        break block11;
                    }
                    catch (Exception exception) {}
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    private void k(Message object) {
        try {
            int n2 = ((Message)object).c().readByte();
            if (n2 == 0) {
                short s2;
                Char.e().cZ = s2 = ((Message)object).c().readShort();
                bu.LoginScreen();
                bu.g();
                return;
            }
            if (n2 == 2) {
                int n3 = ((Message)object).c().readInt();
                byte by2 = ((Message)object).c().readByte();
                n2 = ((Message)object).c().readShort();
                String string = String.valueOf(n2) + "," + by2;
                ImageCache.imgCache("banner_" + n2, ImageCache.imgCache);
                GameCanvas.T.put(String.valueOf(n3), string);
                return;
            }
            if (n2 == 3) {
                short s3 = ((Message)object).c().readShort();
                bl.LoginScreen(s3);
                WeatherEffect.c = s3;
                return;
            }
            if (n2 == 4) {
                String string = ((Message)object).c().readUTF();
                GameCanvas.U.addElement(string);
                return;
            }
            if (n2 == 5) {
                String string = "\n|ChienTruong|Log: ";
                int n4 = ((Message)object).c().readByte();
                if (n4 == 0) {
                    GameScreen.Npc = ((Message)object).c().readUTF();
                    byte by3 = ((Message)object).c().readByte();
                    GameScreen.bZ = by3;
                    GameScreen.ca = by3;
                    GameScreen.cd = by3 << 1;
                    GameScreen.ItemMap = false;
                    string = String.valueOf(string) + "\tsub    0|  nCT_team= " + GameScreen.Npc + "|nCT_TeamA =" + GameScreen.ca + "  isPaint_CT=false \n";
                } else if (n4 == 1) {
                    n2 = ((Message)object).c().readInt();
                    GameScreen.cf = n4 = ((Message)object).c().readByte();
                    GameScreen.cb = (long)(n2 * 1000) + Res.currentTimeMillis();
                    GameScreen.ItemMap = true;
                    string = String.valueOf(string) + "\tsub    1 floor= " + n4 + "|timeBallte= " + n2 + "isPaint_CT=true \n";
                } else if (n4 == 2) {
                    GameScreen.ca = ((Message)object).c().readByte();
                    GameScreen.bZ = ((Message)object).c().readByte();
                    GameScreen.cg.removeAllElements();
                    n2 = ((Message)object).c().readByte();
                    n4 = 0;
                    while (n4 < n2) {
                        String string2 = "";
                        string2 = String.valueOf(string2) + ((Message)object).c().readByte() + "|";
                        string2 = String.valueOf(string2) + ((Message)object).c().readUTF() + "|";
                        string2 = String.valueOf(string2) + ((Message)object).c().readShort() + "|";
                        string2 = String.valueOf(string2) + ((Message)object).c().readInt();
                        GameScreen.cg.addElement(string2);
                        ++n4;
                    }
                    string = String.valueOf(string) + "\tsub   2|  A= " + GameScreen.ca + "|B =" + GameScreen.bZ + "  isPaint_CT=true \n";
                } else if (n4 == 3) {
                    block22: {
                        object = GameService.LoginScreen();
                        Message y2 = null;
                        try {
                            try {
                                y2 = new Message(24);
                                y2.d().writeByte(n2);
                                y2.d().writeByte(n4);
                                ds.b(" =====> SEND OPTION_HAT " + n2 + "_" + n4);
                                ((GameService)object).LoginScreen.LoginScreen(y2);
                            }
                            catch (Exception exception) {
                                y2.e();
                                break block22;
                            }
                        }
                        catch (Throwable throwable) {
                            y2.e();
                            throw throwable;
                        }
                        y2.e();
                    }
                    GameScreen.cf = 0;
                    GameScreen.cb = 0L;
                    GameScreen.ItemMap = false;
                    string = String.valueOf(string) + "\tsub    3|  isPaint_CT=false \n";
                } else if (n4 == 4) {
                    GameScreen.ci = ((Message)object).c().readByte();
                    GameScreen.cj = ((Message)object).c().readByte();
                }
                string = String.valueOf(string) + "END LOG CT.";
                ds.b(string);
                return;
            }
            MessageHandler.LoginScreen((byte)n2, (Message)object);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void Res(Message object) {
        try {
            int n2 = ((Message)object).c().readShort();
            int n3 = -1;
            try {
                n3 = ((Message)object).c().readByte();
            }
            catch (Exception exception) {}
            if (n3 == 0) {
                short s2 = ((Message)object).c().readShort();
                n3 = 0;
                while (n3 < Char.e().az.size()) {
                    bf bf2 = (bf)Char.e().az.elementAt(n3);
                    if (bf2.b == n2) {
                        bf2.m = s2;
                        return;
                    }
                    ++n3;
                }
                return;
            }
            if (n3 == 1) {
                byte by2 = ((Message)object).c().readByte();
                n3 = 0;
                while (n3 < Char.e().az.size()) {
                    bf bf3 = (bf)Char.e().az.elementAt(n3);
                    if (bf3.b == n2) {
                        n2 = 0;
                        while (n2 < 20) {
                            String string = "Skills_" + bf3.LoginScreen.LoginScreen + "_" + by2 + "_" + n2;
                            ImageCache.imgCache(string, ImageCache.imgCache);
                            ++n2;
                        }
                        return;
                    }
                    ++n3;
                }
                return;
            }
            if (n3 == -1) {
                bf bf4;
                object = o.LoginScreen((short)n2);
                n3 = 0;
                while (n3 < Char.e().az.size()) {
                    bf4 = (bf)Char.e().az.elementAt(n3);
                    if (bf4.LoginScreen.LoginScreen == ((bf)object).LoginScreen.LoginScreen) {
                        Char.e().az.setElementAt(object, n3);
                        break;
                    }
                    ++n3;
                }
                n3 = 0;
                while (n3 < Char.e().aA.size()) {
                    bf4 = (bf)Char.e().aA.elementAt(n3);
                    if (bf4.LoginScreen.LoginScreen == ((bf)object).LoginScreen.LoginScreen) {
                        Char.e().aA.setElementAt(object, n3);
                        break;
                    }
                    ++n3;
                }
                n3 = 0;
                while (n3 < GameScreen.aQ.length) {
                    if (GameScreen.aQ[n3] != null && GameScreen.aQ[n3].LoginScreen.LoginScreen == ((bf)object).LoginScreen.LoginScreen) {
                        GameScreen.aQ[n3] = object;
                        break;
                    }
                    ++n3;
                }
                n3 = 0;
                while (n3 < GameScreen.aP.length) {
                    if (GameScreen.aP[n3] != null && GameScreen.aP[n3].LoginScreen.LoginScreen == ((bf)object).LoginScreen.LoginScreen) {
                        GameScreen.aP[n3] = object;
                        break;
                    }
                    ++n3;
                }
                if (Char.e().aC.LoginScreen.LoginScreen == ((bf)object).LoginScreen.LoginScreen) {
                    Char.e().aC = object;
                }
                GameScreen.aD.LoginScreen(String.valueOf(T.eD) + ((bf)object).LoginScreen.b + T.eE + ((bf)object).c, 0);
                return;
            }
        }
        catch (Exception exception) {}
    }

    private static void methodLoginScreen(byte by2, Message y2) {
        block12: {
            try {
                int n2;
                String string;
                if (by2 != 127) break block12;
                GameCanvas.instance();
                ServerListScreen.j = string = y2.c().readUTF();
                ServerListScreen.LoginScreen(string);
                ds.c(">>>>read.isEXTRA_LINK " + string);
                int n3 = y2.c().readByte();
                ds.c(">>>>read.isEXTRA_LINK  numSv: " + n3);
                if (n3 > 0) {
                    ServerListScreen.e = new byte[n3];
                    ServerListScreen.f = new Char[n3];
                    n2 = 0;
                    while (n2 < n3) {
                        ServerListScreen.e[n2] = y2.c().readByte();
                        ds.c(String.valueOf(ServerListScreen.LoginScreen[n2]) + ">>>>read.isEXTRA_LINK  typeClass: " + ServerListScreen.e[n2]);
                        if (ServerListScreen.e[n2] >= 0) {
                            ServerListScreen.g = true;
                            ServerListScreen.f[n2] = new Char();
                            ServerListScreen.f[n2].K = ServerListScreen.e[n2];
                            ServerListScreen.f[n2].bU = y2.c().readShort();
                            ServerListScreen.f[n2].bW = y2.c().readShort();
                            ServerListScreen.f[n2].bV = y2.c().readShort();
                            ServerListScreen.f[n2].bX = y2.c().readShort();
                            ServerListScreen.f[n2].ag = y2.c().readUTF();
                        }
                        ++n2;
                    }
                }
                ServerListScreen.m();
                ServerListScreen.c = false;
                Char.bI = false;
                x.c = false;
                ServerListScreen.m = false;
                n2 = 0;
                n3 = 0;
                try {
                    if (!RMS.c("acc").equals("")) {
                        n2 = 1;
                    }
                    if (!RMS.c("userAo" + ServerListScreen.n).equals("")) {
                        n3 = 1;
                    }
                }
                catch (Exception exception) {}
                if (!ServerListScreen.g && n2 == 0 && n3 == 0) {
                    ServerListScreen.Res();
                    return;
                }
                if (RMS.d(ServerListScreen.w) == -1) {
                    eu.b = false;
                    GameCanvas.al.b();
                    return;
                }
                ServerListScreen.LoginScreen(RMS.d(ServerListScreen.w), false);
                if (ServerListScreen.f != null && ServerListScreen.f[ServerListScreen.n] != null) {
                    GameCanvas.am.LoginScreen(ServerListScreen.f[ServerListScreen.n]);
                    return;
                }
                ServerListScreen.Res();
                return;
            }
            catch (Exception exception) {
                ds.c(">>>>read.isEXTRA_LINK  errr:");
                GameCanvas.al.b();
            }
        }
    }

    public static ee b(Message y2) {
        ee ee2 = null;
        try {
            short s2 = y2.c().readShort();
            int n2 = y2.c().readInt();
            if (s2 != -1) {
                ee2 = new ee(s2, n2);
            }
        }
        catch (Exception exception) {
            ds.b(">>>>read.ItemOption  errr:");
        }
        return ee2;
    }

    private void m(Message y2) {
        try {
            byte by2 = y2.c().readByte();
            Res.e(">>---read_cmdExtraBig-sub:" + by2 + "  " + y2.c().available());
            if (by2 == 0) {
                this.b(y2.c(), true);
                return;
            }
        }
        catch (Exception exception) {}
    }
}

