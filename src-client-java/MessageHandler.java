/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.lcdui.Image;

public final class MessageHandler
implements IConnectionListener {
    private static MessageHandler e;
    private Message f;
    public static boolean a;
    private float UIPanel;
    public static boolean IActionListener;
    public static boolean c;
    public static t d;

    static {
        a = false;
        c = false;
        d = new t("frame new boss");
    }

    public static MessageHandler a() {
        if (e == null) {
            e = new MessageHandler();
        }
        return e;
    }

    public final void a(boolean bl2) {
        if (main.GameCanvas.E != main.GameCanvas.al || !main.GameCanvas.al.a) {
            if (bl2) {
                System.out.println("connect 1 ok");
                bs.t = 2;
                GameService.a().c();
                GameService bt2 = GameService.a();
                return;
            }
            GameService bt3 = GameService.a();
            if (RMSManager.d("clienttype") != -1) {
                ResourceUtil.c = RMSManager.d("clienttype");
            }
            try {
                MathUtil.c("setType");
                Message y2 = GameService.d((byte)2);
                y2.d().writeByte(ResourceUtil.c);
                y2.d().writeByte(MGraphics.IActionListener);
                y2.d().writeBoolean(false);
                y2.d().writeInt(main.GameCanvas.A);
                y2.d().writeInt(main.GameCanvas.B);
                y2.d().writeBoolean(cd.UIPanel);
                y2.d().writeBoolean(main.GameCanvas.e);
                y2.d().writeUTF(String.valueOf(System.getProperty("microedition.platform")) + "|" + "2.4.6");
                InputStream inputStream = bt3.getClass().getResourceAsStream("res\\info");
                if (inputStream != null) {
                    inputStream.read(null);
                    y2.d().writeShort((null).length);
                    ((OutputStream)y2.d()).write(null);
                    MathUtil.IActionListener("write " + (null).length + "|" + "2.4.6");
                }
                bt3.a = NetworkService.IActionListener();
                bt3.GameCanvas.a(y2);
                bt3.a = NetworkService.a();
                y2.e();
            }
            catch (IOException iOException) {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
            }
            bt3 = GameService.a();
        }
    }

    public final void IActionListener(boolean bl2) {
        if (!bl2) {
            if (main.GameCanvas.E == main.GameCanvas.ak && bs.s && !GameService.f) {
                bs.t = 0;
                main.GameCanvas.ak.h();
            }
            ResourceUtil.a(bl2);
            return;
        }
        ResourceUtil.a(bl2);
    }

    public final void c(boolean bl2) {
        block5: {
            block4: {
                if (bl2) break block4;
                if (main.GameCanvas.E == main.GameCanvas.ak && !GameService.f) {
                    main.GameCanvas.ak.h();
                }
                if (main.GameCanvas.E != main.GameCanvas.I || GameService.f) break block5;
            }
            ResourceUtil.IActionListener(bl2);
        }
    }

    private void c(Message y2) {
        try {
            int n2 = y2.c().readUnsignedByte();
            h h2 = GameScreen.Q.aH[n2];
            GameScreen.Q.aH[n2].r = y2.c().readInt();
            h2.ResourceUtil = y2.c().readByte();
            h2.c = new LoggingList("item.options");
            try {
                while (true) {
                    ee ee2;
                    if ((ee2 = MessageHandler.IActionListener(y2)) == null) {
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
    public final void a(Message var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
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
        ab.a = new bg[n2];
        MathUtil.c("[LEN] sl nguoi choi " + n2);
        int n3 = 0;
        while (n3 < n2) {
            int n4 = y2.c().readInt();
            String string = y2.c().readUTF();
            short s2 = y2.c().readShort();
            short s3 = y2.c().readShort();
            short s4 = y2.c().readShort();
            long l2 = y2.c().readLong();
            ab.a[n3] = new bg(n4, string, s2, s3, s4, l2);
            ++n3;
        }
        ((ab)null).IActionListener();
        ((ab)null).a((byte)n2);
    }

    private static void a(DataInputStream dataInputStream) {
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
        GameScreen.I = new Dart[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < GameScreen.I.length) {
            GameScreen.I[n2] = new Dart();
            GameScreen.I[n2].a = n2;
            dataInputStream.readUTF();
            GameScreen.I[n2].IActionListener = new et[dataInputStream.readByte()];
            int n3 = 0;
            while (n3 < GameScreen.I[n2].IActionListener.length) {
                GameScreen.I[n2].IActionListener[n3] = new et();
                GameScreen.I[n2].IActionListener[n3].a = dataInputStream.readByte();
                GameScreen.I[n2].IActionListener[n3].IActionListener = dataInputStream.readUTF();
                GameScreen.I[n2].IActionListener[n3].c = dataInputStream.readByte();
                GameScreen.I[n2].IActionListener[n3].d = dataInputStream.readByte();
                GameScreen.I[n2].IActionListener[n3].e = dataInputStream.readByte();
                GameScreen.I[n2].IActionListener[n3].f = dataInputStream.readShort();
                GameScreen.I[n2].IActionListener[n3].i = dataInputStream.readUTF();
                int n4 = 130;
                if (main.GameCanvas.A == 128 || main.GameCanvas.B <= 208) {
                    n4 = 100;
                }
                GameScreen.I[n2].IActionListener[n3].UIPanel = mFont.m.a(dataInputStream.readUTF(), n4);
                GameScreen.I[n2].IActionListener[n3].h = new Skill[dataInputStream.readByte()];
                n4 = 0;
                while (n4 < GameScreen.I[n2].IActionListener[n3].h.length) {
                    GameScreen.I[n2].IActionListener[n3].h[n4] = new Skill();
                    GameScreen.I[n2].IActionListener[n3].h[n4].IActionListener = dataInputStream.readShort();
                    GameScreen.I[n2].IActionListener[n3].h[n4].a = GameScreen.I[n2].IActionListener[n3];
                    GameScreen.I[n2].IActionListener[n3].h[n4].c = dataInputStream.readByte();
                    GameScreen.I[n2].IActionListener[n3].h[n4].d = dataInputStream.readLong();
                    GameScreen.I[n2].IActionListener[n3].h[n4].i = dataInputStream.readShort();
                    GameScreen.I[n2].IActionListener[n3].h[n4].e = dataInputStream.readInt();
                    GameScreen.I[n2].IActionListener[n3].h[n4].UIPanel = dataInputStream.readShort();
                    GameScreen.I[n2].IActionListener[n3].h[n4].h = dataInputStream.readShort();
                    dataInputStream.readByte();
                    GameScreen.I[n2].IActionListener[n3].h[n4].k = dataInputStream.readShort();
                    dataInputStream.readShort();
                    GameScreen.I[n2].IActionListener[n3].h[n4].ResourceUtil = dataInputStream.readUTF();
                    o.a(GameScreen.I[n2].IActionListener[n3].h[n4]);
                    ++n4;
                }
                ++n3;
            }
            ++n2;
        }
    }

    private static void IActionListener(DataInputStream dataInputStream) {
        System.out.println(">>>createMap: " + dataInputStream.available());
        GameScreen.am = dataInputStream.readByte();
        bv.w = new String[dataInputStream.readShort()];
        int n2 = 0;
        while (n2 < bv.w.length) {
            bv.w[n2] = dataInputStream.readUTF();
            ++n2;
        }
        TextBox.BaseCanvas = new ap[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < TextBox.BaseCanvas.length) {
            TextBox.BaseCanvas[n2] = new ap();
            TextBox.BaseCanvas[n2].a = n2;
            TextBox.BaseCanvas[n2].IActionListener = dataInputStream.readUTF();
            TextBox.BaseCanvas[n2].c = dataInputStream.readShort();
            TextBox.BaseCanvas[n2].d = dataInputStream.readShort();
            TextBox.BaseCanvas[n2].e = dataInputStream.readShort();
            TextBox.BaseCanvas[n2].f = new String[dataInputStream.readByte()][];
            int n3 = 0;
            while (n3 < TextBox.BaseCanvas[n2].f.length) {
                TextBox.BaseCanvas[n2].f[n3] = new String[dataInputStream.readByte()];
                int n4 = 0;
                while (n4 < TextBox.BaseCanvas[n2].f[n3].length) {
                    TextBox.BaseCanvas[n2].f[n3][n4] = dataInputStream.readUTF();
                    ++n4;
                }
                ++n3;
            }
            n2 = (byte)(n2 + 1);
        }
        aa.c = new dy[dataInputStream.readShort()];
        n2 = 0;
        while (n2 < aa.c.length) {
            aa.c[n2] = new dy();
            aa.c[n2].c = dataInputStream.readByte();
            aa.c[n2].e = dataInputStream.readUTF();
            aa.c[n2].d = dataInputStream.readLong();
            aa.c[n2].a = dataInputStream.readByte();
            aa.c[n2].IActionListener = dataInputStream.readByte();
            aa.c[n2].UIPanel = dataInputStream.readByte();
            ++n2;
        }
    }

    private static void a(DataInputStream dataInputStream, boolean bl2) {
        GameScreen.al = dataInputStream.readByte();
        MathUtil.c("vcData= " + GameScreen.al + " vData=" + GameScreen.ap);
        RMSManager.a("NR_dart", ai.a(dataInputStream));
        RMSManager.a("NR_arrow", ai.a(dataInputStream));
        RMSManager.a("NR_effect", ai.a(dataInputStream));
        RMSManager.a("NR_image", ai.a(dataInputStream));
        RMSManager.a("NR_part", ai.a(dataInputStream));
        RMSManager.a("NR_skill", ai.a(dataInputStream));
        RMSManager.a("NRdata");
    }

    private static Image a(byte[] byArray) {
        try {
            return Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void a(Message y2, int n2) {
        try {
            cb cb2 = new cb();
            byte by2 = y2.c().readByte();
            cb2.IActionListener = by2;
            cb2.a = y2.c().readInt();
            cb2.c = y2.c().readInt();
            cb2.d = y2.c().readUTF();
            cb2.h = y2.c().readByte();
            cb2.e = y2.c().readInt() + 1000000000;
            MathUtil.c("type= " + cb2.IActionListener + " id= " + cb2.a + " playID= " + cb2.c + " time= " + cb2.e);
            boolean bl2 = false;
            GameScreen.aW = false;
            if (by2 == 0) {
                String string = y2.c().readUTF();
                MathUtil.c("str chat " + string);
                GameScreen.aW = true;
                if (mFont.k.a(string) > UIPanel.ab - 60) {
                    cb2.f = mFont.k.a(string, UIPanel.ab - 10);
                } else {
                    cb2.f = new String[1];
                    cb2.f[0] = string;
                }
                cb2.UIPanel = y2.c().readByte();
            } else if (by2 == 1) {
                cb2.i = y2.c().readByte();
                cb2.j = y2.c().readByte();
                bl2 = y2.c().readByte() == 1;
                if (bl2) {
                    GameScreen.aW = true;
                }
                if (cb2.c != GameWorld.e().J) {
                    cb2.k = cb2.i < cb2.j ? new String[]{GameStrings.cG} : null;
                }
                if (main.GameCanvas.G.ai != null) {
                    main.GameCanvas.G.a(cb2.i, cb2.j);
                }
            } else if (by2 == 2 && GameWorld.e().aj == 0) {
                GameScreen.aW = true;
                cb2.k = new String[]{GameStrings.bv, GameStrings.cH};
            }
            if (main.GameCanvas.E != GameScreen.c) {
                GameScreen.aW = false;
            } else if (main.GameCanvas.G.a && main.GameCanvas.G.A == 0 && main.GameCanvas.G.B == 3) {
                GameScreen.aW = false;
            }
            cb.a(cb2, n2, bl2);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private static void a(byte n2) {
        MathUtil.c("is loading map = " + GameWorld.bI);
        GameScreen.j().aX = 0;
        GameScreen.bl = false;
        cw.a = null;
        GameScreen.aD.f = false;
        GameScreen.aE.f = false;
        GameScreen.z = 0;
        main.GameCanvas.G.a = false;
        SettingsManager.a();
        if (!GameScreen.IActionListener && !cw.IActionListener) {
            GameScreen.j().a();
        }
        GameScreen.a(n2 == 1 ? GameWorld.e().B : -1, n2 == 0 ? -1 : 0);
        bv.h();
        bv.c(bv.e);
        MathUtil.c("LOAD GAMESCR 2");
        GameWorld.e().D = 0;
        GameWorld.e().H = 4;
        GameWorld.e().bP = null;
        GameWorld.e().aQ = null;
        GameWorld.e().aU = null;
        GameWorld.e().aT = null;
        GameWorld.e().aV = null;
        GameWorld.e().cf = null;
        GameWorld.e().c(false);
        GameWorld.e().cg = null;
        main.GameCanvas.ResourceUtil();
        if (GameWorld.e().C >= bv.d - 100) {
            GameWorld.e().bq = true;
            GameWorld.e().B += MathUtil.UIPanel(MathUtil.IActionListener(0, 80));
            GameService.a().UIPanel();
        }
        GameScreen.j().ResourceUtil();
        main.GameCanvas.a(bv.o);
        GameWorld.bH = false;
        int n3 = 0;
        while (n3 < GameWorld.e().aB.size()) {
            GameWorld.e().aB.elementAt(n3);
            ++n3;
        }
        main.GameCanvas.UIPanel();
        main.GameCanvas.f();
        GameScreen.j().bC = GameWorld.e().U;
        GameScreen.j().bz = GameWorld.e().T;
        GameWorld.bG = false;
        GameScreen.j().IActionListener();
        if (GameWorld.e().C <= 10 && n2 != 0 && n2 != 2) {
            cn cn2 = new TileMap(GameWorld.e().B, GameWorld.e().C, GameWorld.e().bU, GameWorld.e().I, 1, true, n2 == 1 ? GameWorld.e().K : n2);
            cn.a(cn2);
            GameWorld.e().s = true;
        }
        if (n2 == 2) {
            GameWorld.e().r();
        }
        if (GameScreen.j().Screen) {
            if (bv.ResourceUtil == GameScreen.j().bh && bv.n == GameScreen.j().bi) {
                GameScreen.j().c(GameScreen.j().bf, GameScreen.j().bg);
            }
            if (MGraphics.IActionListener > 1) {
                GameScreen.j().GameScreen();
            }
        }
        bp.c();
        bp.a(bv.k, String.valueOf(GameStrings.cl) + " " + bv.n, 30);
        main.GameCanvas.h();
        main.GameCanvas.d = false;
        v.IActionListener();
        v.a();
        main.GameCanvas.X = 2;
        main.GameCanvas.Y = ResourceUtil.d() + 1000L;
    }

    private void e(Message y2) {
        try {
            Object object;
            MathUtil.c("123 char= " + GameWorld.e() == null ? "null" : "!null");
            GameWorld af2 = GameWorld.e();
            GameWorld af3 = GameWorld.e();
            GameWorld.e();
            short s2 = y2.c().readShort();
            af3.bD = s2;
            af2.B = s2;
            GameWorld af4 = GameWorld.e();
            GameWorld af5 = GameWorld.e();
            GameWorld.e();
            short s3 = y2.c().readShort();
            af5.bE = s3;
            af4.C = s3;
            GameWorld.e().cl = GameWorld.e().B;
            GameWorld.e().cm = GameWorld.e().C;
            MathUtil.c("head= " + GameWorld.e().bU + " body= " + GameWorld.e().bW + " left= " + GameWorld.e().bV + " x= " + GameWorld.e().B + " Message= " + GameWorld.e().C + " chung toc= " + GameWorld.e().K);
            if (GameWorld.e().B >= 0 && GameWorld.e().B <= 100) {
                GameWorld.e().I = 1;
            } else if (GameWorld.e().B >= bv.a - 100 && GameWorld.e().B <= bv.a) {
                GameWorld.e().I = -1;
            }
            int n2 = y2.c().readByte();
            MathUtil.c("vGo size= " + n2);
            if (!GameScreen.aD.e) {
                GameScreen.aD.d = GameWorld.e().B - GameScreen.j;
                GameScreen.aD.c = GameWorld.e().C - GameScreen.k;
            }
            int n3 = 0;
            while (n3 < n2) {
                new bw(y2.c().readShort(), y2.c().readShort(), y2.c().readShort(), y2.c().readShort(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readUTF());
                ++n3;
            }
            n2 = y2.c().readByte();
            aa.L.removeAllElements();
            n3 = 0;
            while (n3 < n2) {
                object = new aa(n3, y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readShort(), y2.c().readByte(), y2.c().readLong(), y2.c().readByte(), y2.c().readLong(), y2.c().readShort(), y2.c().readShort(), y2.c().readByte(), y2.c().readByte());
                new aa(n3, y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readShort(), y2.c().readByte(), y2.c().readLong(), y2.c().readByte(), y2.c().readLong(), y2.c().readShort(), y2.c().readShort(), y2.c().readByte(), y2.c().readByte()).P = ((aa)object).m;
                ((aa)object).Q = ((aa)object).n;
                ((aa)object).I = y2.c().readBoolean();
                if (aa.c[((aa)object).C].c != 0) {
                    ((aa)object).o = n3 % 3 == 0 ? -1 : 1;
                    ((aa)object).m += 10 - n3 % 20;
                }
                ((aa)object).J = false;
                cc cc2 = null;
                an an2 = null;
                d d2 = null;
                cl cl2 = null;
                if (((aa)object).C == 70) {
                    cc2 = new Item(n3, (short)((aa)object).m, (short)((aa)object).n, 70, ((aa)object).k, ((aa)object).ResourceUtil, ((aa)object).G);
                }
                if (((aa)object).C == 71) {
                    an2 = new an(n3, (short)((aa)object).m, (short)((aa)object).n, 71, ((aa)object).k, ((aa)object).ResourceUtil);
                }
                if (((aa)object).C == 72) {
                    d2 = new d(n3, (short)((aa)object).m, (short)((aa)object).n, 72, ((aa)object).k, ((aa)object).ResourceUtil);
                }
                if (((aa)object).I) {
                    cl2 = new cl(n3, (short)((aa)object).m, (short)((aa)object).n, ((aa)object).C, ((aa)object).k, ((aa)object).ResourceUtil);
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
            if (GameWorld.e().aR != null && GameScreen.c(GameWorld.e().aR.Message) == null) {
                GameWorld.e().aR.v();
                GameWorld.e().aR.m = GameWorld.e().B;
                GameWorld.e().aR.n = GameWorld.e().C - 40;
                GameScreen.F.addElement(GameWorld.e().aR);
            }
            y2.c().readByte();
            n2 = y2.c().readByte();
            MathUtil.c("NPC size= " + n2);
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
                        MathUtil.c("tempalte = " + by2);
                        s4 = y2.c().readShort();
                        MathUtil.c("1");
                        if (by2 == 6) break block71;
                        MathUtil.c("2");
                        if (GameWorld.e().aD.c >= 7 && (GameWorld.e().aD.c != 7 || GameWorld.e().aD.a > 1)) break block72;
                        if (by2 == 7 || by2 == 8 || by2 == 9) break block71;
                        MathUtil.c("3");
                    }
                    if (GameWorld.e().aD.c >= 6 || by2 != 16) {
                        if (by2 == 4) {
                            GameScreen.j().aM = new k(n3, by3, s6, s5, by2, s4);
                            GameService.a().e((byte)2);
                            GameScreen.G.addElement(GameScreen.j().aM);
                            MathUtil.c("5");
                        } else {
                            do do_ = new TextBox(n3, by3, s6, s5 + 3, by2, s4);
                            GameScreen.G.addElement(do_);
                            MathUtil.c("6");
                        }
                    }
                }
                ++n3;
            }
            n2 = y2.c().readByte();
            MathUtil.c("item size = " + n2);
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
                ce ce2 = new ce(n5, s7, s8, (int)s9, (int)s10, (short)n6);
                s8 = 0;
                n6 = 0;
                while (n6 < GameScreen.E.size()) {
                    ce ce3 = (ce)GameScreen.E.elementAt(n6);
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
            if (MGraphics.IActionListener == 1) {
                cz.a();
            }
            cz.ResourceUtil.removeAllElements();
            if (!main.GameCanvas.a || main.GameCanvas.a && bv.a() || bv.ResourceUtil == 45 || bv.ResourceUtil == 46 || bv.ResourceUtil == 47 || bv.ResourceUtil == 48 || bv.ResourceUtil == 120 || bv.ResourceUtil == 128 || bv.ResourceUtil == 170 || bv.ResourceUtil == 49) {
                n4 = y2.c().readShort();
                int n7 = 0;
                while (n7 < n4) {
                    short s11 = y2.c().readShort();
                    short s12 = y2.c().readShort();
                    short s13 = y2.c().readShort();
                    if (bv.a(s11) != null) {
                        Object object2 = bv.a(s11);
                        cz cz2 = new cz();
                        new cz().a = s11;
                        cz2.c = ((cz)object2).c;
                        cz2.f = ((cz)object2).f;
                        cz2.UIPanel = ((cz)object2).UIPanel;
                        cz2.d = s12 * bv.i;
                        cz2.e = s13 * bv.i;
                        cz2.h = ((cz)object2).h;
                        if (bv.IActionListener(cz2.a)) {
                            int n8 = cz2.IActionListener = n7 % 2 == 0 ? 0 : 2;
                            if (bv.ResourceUtil == 45) {
                                cz2.IActionListener = 0;
                            }
                        }
                        if (!cz.k.containsKey(String.valueOf(cz2.c))) {
                            if (MGraphics.IActionListener == 1) {
                                object2 = ResourceUtil.c("/mapBackGround/" + cz2.c + ".png");
                                if (object2 == null) {
                                    object2 = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                                    NetworkService.IActionListener().d();
                                    GameService.a().c(cz2.c);
                                }
                                cz.k.put(String.valueOf(cz2.c), object2);
                            } else {
                                s11 = 0;
                                byte[] byArray = RMSManager.IActionListener(String.valueOf(MGraphics.IActionListener) + "bgItem" + cz2.c);
                                object2 = byArray;
                                if (byArray != null) {
                                    if (cz.n != null) {
                                        MathUtil.c("Small  last= " + ((Object)object2).length % 127 + "new Version= " + cz.n[cz2.c]);
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
                                    object2 = ResourceUtil.c("/mapBackGround/" + cz2.c + ".png");
                                    if (object2 == null) {
                                        object2 = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                                        GameService.a().c(cz2.c);
                                    }
                                    cz.k.put(String.valueOf(cz2.c), object2);
                                }
                            }
                            cz.m.addElement(String.valueOf(cz2.c));
                        }
                        if (!cz.a(String.valueOf(cz2.c))) {
                            cz.ResourceUtil.addElement(String.valueOf(cz2.c));
                        }
                        bv.v.addElement(cz2);
                    }
                    ++n7;
                }
                n7 = 0;
                while (n7 < cz.m.size()) {
                    object = (String)cz.m.elementAt(n7);
                    if (!cz.a((String)object)) {
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
                ed.d = false;
                ed.e = 0;
                ei.GameCanvas.removeAllElements();
                ed.GameCanvas.removeAllElements();
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
                        if (UIPanel.I <= 0) {
                            int n10;
                            stringArray2 = MathUtil.a((String)object3, ".", 0);
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
                                object3.IActionListener = Integer.parseInt(stringArray2[6]);
                                if (stringArray2.length > 7) {
                                    object3.c = Integer.parseInt(stringArray2[7]);
                                    object3.d = Integer.parseInt(stringArray2[8]);
                                }
                            }
                            ei.a((ea)object3);
                        }
                    } else if (stringArray2.equals("beff") && UIPanel.I <= 1) {
                        ed.a(Integer.parseInt((String)object3));
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
            MessageHandler.a(by4);
        }
        catch (Exception exception) {
            MathUtil.IActionListener(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Loadmap khong thanh cong");
            main.GameCanvas.e();
            bs.m = true;
            main.GameCanvas.h();
        }
        main.GameCanvas.d = false;
        MathUtil.IActionListener(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Loadmap thanh cong");
    }

    private void f(Message y2) {
        try {
            try {
                int n2 = y2.c().readByte();
                ResourceUtil.e("messageNotMap: cmd:" + n2);
                switch (n2) {
                    case 16: {
                        GameCanvas.a().IActionListener();
                        break;
                    }
                    case 17: {
                        GameWorld.e();
                        GameWorld.N();
                        break;
                    }
                    case 18: {
                        main.GameCanvas.d = false;
                        main.GameCanvas.h();
                        Integer n3 = new Integer(y2.c().readInt());
                        ((j)null).a(GameStrings.RMSManager, new Command(GameStrings.bs, main.GameCanvas.h, 88829, n3), 0);
                        break;
                    }
                    case 20: {
                        GameWorld.e().aM = y2.c().readByte();
                        GameScreen.aD.a(String.valueOf(GameStrings.bG) + " " + GameWorld.e().aM, 0);
                        break;
                    }
                    case 33: {
                        break;
                    }
                    case 35: {
                        main.GameCanvas.h();
                        GameScreen.j().n();
                        GameScreen.aD.a(y2.c().readUTF(), 0);
                        break;
                    }
                    case 36: {
                        GameScreen.aC = y2.c().readByte();
                        MathUtil.c("load Me Active: " + GameScreen.aC);
                        break;
                    }
                    case 4: {
                        main.GameCanvas.I.e();
                        GameScreen.bj = false;
                        GameScreen.bk = false;
                        x.d = true;
                        x.e = true;
                        x.f = true;
                        LoginScreen.UIPanel = true;
                        x.h = true;
                        GameScreen.ap = y2.c().readByte();
                        GameScreen.aq = y2.c().readByte();
                        GameScreen.ar = y2.c().readByte();
                        GameScreen.as = y2.c().readByte();
                        y2.c().readByte();
                        if (main.GameCanvas.I.n) {
                            RMSManager.a("acc", "");
                            RMSManager.a("pass", "");
                        } else {
                            RMSManager.a("userAo" + bs.n, "");
                        }
                        MathUtil.c("****** DATA VERSION: Server " + GameScreen.ap + " Client " + GameScreen.al);
                        MathUtil.c("****** MAP VERSION: Server " + GameScreen.aq + " Client " + GameScreen.am);
                        MathUtil.c("****** SKILL VERSION: Server " + GameScreen.ar + " Client " + GameScreen.an);
                        MathUtil.c("****** ITEM VERSION: Server " + GameScreen.as + " Client " + GameScreen.ao);
                        if (GameScreen.ap != GameScreen.al) {
                            MathUtil.c("send update data");
                            GameScreen.IActionListener = false;
                            GameService.a().ResourceUtil();
                        } else {
                            try {
                                x.e = false;
                            }
                            catch (Exception exception) {
                                Exception exception2 = exception;
                                exception.printStackTrace();
                                GameScreen.al = (byte)-1;
                                GameService.a().ResourceUtil();
                            }
                        }
                        if (GameScreen.aq != GameScreen.am) {
                            GameScreen.IActionListener = false;
                            GameService.a().m();
                        } else {
                            try {
                                if (!GameScreen.IActionListener) {
                                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(RMSManager.IActionListener("NRmap")));
                                    MessageHandler.IActionListener(dataInputStream);
                                }
                                x.f = false;
                            }
                            catch (Exception exception) {
                                GameScreen.am = (byte)-1;
                                GameService.a().m();
                            }
                        }
                        if (GameScreen.ar != GameScreen.an) {
                            GameScreen.IActionListener = false;
                            GameService.a().n();
                        } else {
                            try {
                                if (!GameScreen.IActionListener) {
                                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(RMSManager.IActionListener("NRskill")));
                                    MessageHandler.a(dataInputStream);
                                }
                                LoginScreen.UIPanel = false;
                            }
                            catch (Exception exception) {
                                GameScreen.an = (byte)-1;
                                GameService.a().n();
                            }
                        }
                        if (GameScreen.as != GameScreen.ao) {
                            GameScreen.IActionListener = false;
                            GameService.a().o();
                        } else {
                            try {
                                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(RMSManager.IActionListener("NRitem0")));
                                this.b(dataInputStream, false);
                                dataInputStream = new DataInputStream(new ByteArrayInputStream(RMSManager.IActionListener("NRitem1")));
                                this.b(dataInputStream, false);
                                dataInputStream = new DataInputStream(new ByteArrayInputStream(RMSManager.IActionListener("NRitem100")));
                                this.b(dataInputStream, false);
                                x.h = false;
                            }
                            catch (Exception exception) {
                                GameScreen.ao = (byte)-1;
                                GameService.a().o();
                            }
                            try {
                                Object object = RMSManager.IActionListener("NRitem101");
                                if (object != null) {
                                    object = new DataInputStream(new ByteArrayInputStream((byte[])object));
                                    this.b((DataInputStream)object, false);
                                }
                            }
                            catch (Exception exception) {}
                        }
                        System.out.println("3>>>readOk:isLoadAllData: " + GameScreen.IActionListener);
                        if (!GameScreen.IActionListener) {
                            GameScreen.j();
                            GameScreen.i();
                        } else {
                            GameService.a().GameScreen();
                        }
                        n2 = y2.c().readByte();
                        MathUtil.c("CAPTION LENT= " + n2);
                        GameScreen.R = new long[n2];
                        n2 = 0;
                        while (n2 < GameScreen.R.length) {
                            GameScreen.R[n2] = y2.c().readLong();
                            ++n2;
                        }
                        break;
                    }
                    case 6: {
                        MathUtil.c("GET UPDATE_MAP " + y2.c().available() + " bytes");
                        y2.c().mark(100000);
                        MessageHandler.IActionListener(y2.c());
                        y2.c().reset();
                        byte[] byArray = new byte[y2.c().available()];
                        y2.c().readFully(byArray);
                        RMSManager.a("NRmap", byArray);
                        byArray = new byte[]{GameScreen.am};
                        RMSManager.a("NRmapVersion", byArray);
                        MathUtil.c("GET UPDATE_MAP NRmapVersion:" + byArray);
                        x.f = false;
                        GameScreen.j();
                        GameScreen.i();
                        break;
                    }
                    case 7: {
                        MathUtil.c("GET UPDATE_SKILL " + y2.c().available() + " bytes");
                        y2.c().mark(100000);
                        MessageHandler.a(y2.c());
                        y2.c().reset();
                        byte[] byArray = new byte[y2.c().available()];
                        y2.c().readFully(byArray);
                        RMSManager.a("NRskill", byArray);
                        byArray = new byte[]{GameScreen.an};
                        RMSManager.a("NRskillVersion", byArray);
                        LoginScreen.UIPanel = false;
                        GameScreen.j();
                        GameScreen.i();
                        break;
                    }
                    case 8: {
                        MathUtil.c("GET UPDATE_ITEM " + y2.c().available() + " bytes");
                        DataInputStream dataInputStream = y2.c();
                        Object object = this;
                        try {
                            ((MessageHandler)object).IActionListener(dataInputStream, true);
                        }
                        catch (Exception exception) {
                            object = exception;
                            exception.printStackTrace();
                        }
                        break;
                    }
                    case 10: {
                        try {
                            GameWorld.bI = true;
                            MathUtil.c("REQUEST MAP TEMPLATE");
                            main.GameCanvas.d = true;
                            bv.f = null;
                            bv.UIPanel = null;
                            System.gc();
                            bv.a = y2.c().readByte();
                            bv.IActionListener = y2.c().readByte();
                            bv.f = new int[bv.a * bv.IActionListener];
                            MathUtil.c("Cmd.REQUEST_MAPTEMPLATE=10  w|H= " + bv.a + "|" + bv.IActionListener + "\n Dien Tich = " + bv.a * bv.IActionListener);
                            n2 = 0;
                            while (n2 < bv.f.length) {
                                int n4 = y2.c().readByte();
                                if (n4 < 0) {
                                    n4 += 256;
                                }
                                bv.f[n2] = (char)n4;
                                ++n2;
                            }
                            bv.UIPanel = new int[bv.f.length];
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

    private static void UIPanel(Message y2) {
        try {
            try {
                byte by2 = y2.c().readByte();
                switch (by2) {
                    case 2: {
                        String string;
                        bs.j = string = y2.c().readUTF();
                        bs.a(string);
                        try {
                            byte by3 = y2.c().readByte();
                            UIPanel.ad = by3 == 1;
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
    private void h(Message var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
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

    private static void a(bf bf2) {
        if (GameWorld.e().aC == null) {
            GameWorld.e().aC = bf2;
        } else if (bf2.GameCanvas.equals(GameWorld.e().aC.a)) {
            GameWorld.e().aC = bf2;
        }
        GameWorld.e().az.addElement(bf2);
        if ((bf2.GameCanvas.e == 1 || bf2.GameCanvas.e == 4 || bf2.GameCanvas.e == 2 || bf2.GameCanvas.e == 3) && (bf2.GameCanvas.c == 0 || bf2.GameCanvas.c > 0 && bf2.c > 0)) {
            if (bf2.GameCanvas.a == GameWorld.e().aP) {
                GameService.a().i(GameWorld.e().aP);
            }
            GameWorld.e().aA.addElement(bf2);
        }
    }

    private static boolean a(GameWorld object, Message y2) {
        try {
            ((GameWorld)object).Q = y2.c().readByte();
            ((GameWorld)object).bc = y2.c().readBoolean();
            ((GameWorld)object).aN = y2.c().readByte();
            MathUtil.c("ADD TYPE PK= " + ((GameWorld)object).aN + " to player " + ((GameWorld)object).J);
            ((GameWorld)object).ax = GameScreen.I[y2.c().readByte()];
            ((GameWorld)object).K = y2.c().readByte();
            ((GameWorld)object).bU = y2.c().readShort();
            ((GameWorld)object).ag = y2.c().readUTF();
            ((GameWorld)object).cT = ((GameWorld)object).U = y2.c().readLong();
            if (((GameWorld)object).U == 0L) {
                ((GameWorld)object).H = 14;
            }
            ((GameWorld)object).V = y2.c().readLong();
            if (((GameWorld)object).C >= bv.d - 100) {
                ((GameWorld)object).bq = true;
            }
            ((GameWorld)object).bW = y2.c().readShort();
            ((GameWorld)object).bV = y2.c().readShort();
            ((GameWorld)object).bX = y2.c().readShort();
            MathUtil.c(" body= " + ((GameWorld)object).bW + " leg= " + ((GameWorld)object).bV + " bag=" + ((GameWorld)object).bX + "BAG ==" + ((GameWorld)object).bX + "*********************************");
            ((GameWorld)object).IConnectionListener = true;
            y2.c().readByte();
            if (((GameWorld)object).bY == -1) {
                ((GameWorld)object).t();
            }
            if (((GameWorld)object).bW == -1) {
                ((GameWorld)object).u();
            }
            if (((GameWorld)object).bV == -1) {
                ((GameWorld)object).v();
            }
            MathUtil.c("1");
            ((GameWorld)object).B = y2.c().readShort();
            ((GameWorld)object).C = y2.c().readShort();
            ((GameWorld)object).cl = ((GameWorld)object).B;
            ((GameWorld)object).cm = ((GameWorld)object).C;
            ((GameWorld)object).R = y2.c().readShort();
            ((GameWorld)object).S = y2.c().readShort();
            int n2 = y2.c().readByte();
            int n3 = 0;
            while (n3 < n2) {
                ec ec2 = new ec(y2.c().readByte(), y2.c().readInt(), y2.c().readInt(), y2.c().readShort());
                ((GameWorld)object).aB.addElement(ec2);
                ++n3;
            }
            MathUtil.c("Controller readCharInfo body: body|leg|bag " + ((GameWorld)object).bW + ((GameWorld)object).bV + ((GameWorld)object).bX);
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
            byte[] byArray = ai.a((Message)object);
            object = byArray;
            Image image = MessageHandler.a(byArray);
            as.a(string, image, by2);
            if (object != null) {
                as.a(string, by2, (byte[])object);
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    private void IActionListener(DataInputStream dataInputStream, boolean bl2) {
        block17: {
            try {
                dataInputStream.mark(1000000);
                GameScreen.ao = dataInputStream.readByte();
                int n2 = dataInputStream.readByte();
                ResourceUtil.e(">>loadItemNew:  type:" + n2);
                if (n2 == 0) {
                    GameScreen.j().K = new dn[dataInputStream.readShort()];
                    n2 = 0;
                    while (n2 < GameScreen.j().K.length) {
                        GameScreen.j().K[n2] = new dn();
                        GameScreen.j().K[n2].a = n2;
                        GameScreen.j().K[n2].IActionListener = dataInputStream.readUTF();
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
                        RMSManager.a("NRitem0", byArray);
                        return;
                    }
                    break block17;
                }
                if (n2 == 1) {
                    Object object;
                    Scroll.GameCanvas.clear();
                    n2 = dataInputStream.readShort();
                    int n4 = 0;
                    while (n4 < n2) {
                        dd dd2 = new dd((short)n4, dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readByte(), dataInputStream.readInt(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readBoolean());
                        object = dd2;
                        dp.a(dd2);
                        ++n4;
                    }
                    if (bl2) {
                        dataInputStream.reset();
                        byte[] byArray = new byte[dataInputStream.available()];
                        dataInputStream.readFully(byArray);
                        RMSManager.a("NRitem1", byArray);
                        object = new byte[]{GameScreen.ao};
                        RMSManager.a("NRitemVersion", object);
                        return;
                    }
                    break block17;
                }
                if (n2 == 2) break block17;
                if (n2 == 100) {
                    GameWorld.cU = MessageHandler.c(dataInputStream);
                    if (bl2) {
                        dataInputStream.reset();
                        byte[] byArray = new byte[dataInputStream.available()];
                        dataInputStream.readFully(byArray);
                        RMSManager.a("NRitem100", byArray);
                        return;
                    }
                    break block17;
                }
                if (n2 != 101) break block17;
                try {
                    n2 = dataInputStream.readShort();
                    GameWorld.da = new short[n2];
                    int n5 = 0;
                    while (n5 < n2) {
                        short s3;
                        GameWorld.da[n5] = s3 = dataInputStream.readShort();
                        ++n5;
                    }
                    if (bl2) {
                        dataInputStream.reset();
                        byte[] byArray = new byte[dataInputStream.available()];
                        dataInputStream.readFully(byArray);
                        RMSManager.a("NRitem101", byArray);
                        return;
                    }
                }
                catch (Exception exception) {
                    GameWorld.da = new short[0];
                    return;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }

    private static void IActionListener(Message y2, int n2) {
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
                            new cg(by2, s3, string, string2, n2, s4).UIPanel = by3;
                            GameScreen.bY.a(by2, 0, 0);
                            break block11;
                        }
                        if (s2 == 1) {
                            int n3 = ((Message)object).c().readInt();
                            int n4 = ((Message)object).c().readInt();
                            if (GameScreen.bY == null) break block12;
                            int n5 = n3;
                            object = GameScreen.bY;
                            GameScreen.bY.a = by2;
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
                            GameScreen.a(n6, -1, 0, main.GameCanvas.C, main.GameCanvas.D, 0, 0, (short)-1, null);
                            break block11;
                        }
                        if (s2 == 5) {
                            short s5 = ((Message)object).c().readShort();
                            if (GameScreen.bY == null) break block12;
                            short s6 = s5;
                            object = GameScreen.bY;
                            GameScreen.bY.a = by2;
                            ((cg)object).m = s6;
                            ((cg)object).n = main.GameCanvas.IActionListener;
                            break block11;
                        }
                        if (s2 != 4) break block12;
                        byte by4 = ((Message)object).c().readByte();
                        byte by5 = ((Message)object).c().readByte();
                        if (GameScreen.bY == null) break block12;
                        GameScreen.bY.a(by2, by4, by5);
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
                GameWorld.e().cZ = s2 = ((Message)object).c().readShort();
                SettingsManager.a();
                SettingsManager.UIPanel();
                return;
            }
            if (n2 == 2) {
                int n3 = ((Message)object).c().readInt();
                byte by2 = ((Message)object).c().readByte();
                n2 = ((Message)object).c().readShort();
                String string = String.valueOf(n2) + "," + by2;
                as.a("banner_" + n2, as.a);
                main.GameCanvas.T.put(String.valueOf(n3), string);
                return;
            }
            if (n2 == 3) {
                short s3 = ((Message)object).c().readShort();
                bl.a(s3);
                ed.c = s3;
                return;
            }
            if (n2 == 4) {
                String string = ((Message)object).c().readUTF();
                main.GameCanvas.U.addElement(string);
                return;
            }
            if (n2 == 5) {
                String string = "\n|ChienTruong|Log: ";
                int n4 = ((Message)object).c().readByte();
                if (n4 == 0) {
                    GameScreen.cc = ((Message)object).c().readUTF();
                    byte by3 = ((Message)object).c().readByte();
                    GameScreen.bZ = by3;
                    GameScreen.ca = by3;
                    GameScreen.cd = by3 << 1;
                    GameScreen.ce = false;
                    string = String.valueOf(string) + "\tsub    0|  nCT_team= " + GameScreen.cc + "|nCT_TeamA =" + GameScreen.ca + "  isPaint_CT=false \n";
                } else if (n4 == 1) {
                    n2 = ((Message)object).c().readInt();
                    GameScreen.cf = n4 = ((Message)object).c().readByte();
                    GameScreen.cb = (long)(n2 * 1000) + ResourceUtil.d();
                    GameScreen.ce = true;
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
                        object = GameService.a();
                        Message y2 = null;
                        try {
                            try {
                                y2 = new Message(24);
                                y2.d().writeByte(n2);
                                y2.d().writeByte(n4);
                                MathUtil.IActionListener(" =====> SEND OPTION_HAT " + n2 + "_" + n4);
                                ((GameService)object).GameCanvas.a(y2);
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
                    GameScreen.ce = false;
                    string = String.valueOf(string) + "\tsub    3|  isPaint_CT=false \n";
                } else if (n4 == 4) {
                    GameScreen.ci = ((Message)object).c().readByte();
                    GameScreen.cj = ((Message)object).c().readByte();
                }
                string = String.valueOf(string) + "END LOG CT.";
                MathUtil.IActionListener(string);
                return;
            }
            MessageHandler.a((byte)n2, (Message)object);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void ResourceUtil(Message object) {
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
                while (n3 < GameWorld.e().az.size()) {
                    bf bf2 = (Skill)GameWorld.e().az.elementAt(n3);
                    if (bf2.IActionListener == n2) {
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
                while (n3 < GameWorld.e().az.size()) {
                    bf bf3 = (Skill)GameWorld.e().az.elementAt(n3);
                    if (bf3.IActionListener == n2) {
                        n2 = 0;
                        while (n2 < 20) {
                            String string = "Skills_" + bf3.GameCanvas.a + "_" + by2 + "_" + n2;
                            as.a(string, as.a);
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
                object = o.a((short)n2);
                n3 = 0;
                while (n3 < GameWorld.e().az.size()) {
                    bf4 = (Skill)GameWorld.e().az.elementAt(n3);
                    if (bf4.GameCanvas.a == ((Skill)object).GameCanvas.a) {
                        GameWorld.e().az.setElementAt(object, n3);
                        break;
                    }
                    ++n3;
                }
                n3 = 0;
                while (n3 < GameWorld.e().aA.size()) {
                    bf4 = (Skill)GameWorld.e().aA.elementAt(n3);
                    if (bf4.GameCanvas.a == ((Skill)object).GameCanvas.a) {
                        GameWorld.e().aA.setElementAt(object, n3);
                        break;
                    }
                    ++n3;
                }
                n3 = 0;
                while (n3 < GameScreen.aQ.length) {
                    if (GameScreen.aQ[n3] != null && GameScreen.aQ[n3].GameCanvas.a == ((Skill)object).GameCanvas.a) {
                        GameScreen.aQ[n3] = object;
                        break;
                    }
                    ++n3;
                }
                n3 = 0;
                while (n3 < GameScreen.aP.length) {
                    if (GameScreen.aP[n3] != null && GameScreen.aP[n3].GameCanvas.a == ((Skill)object).GameCanvas.a) {
                        GameScreen.aP[n3] = object;
                        break;
                    }
                    ++n3;
                }
                if (GameWorld.e().aC.GameCanvas.a == ((Skill)object).GameCanvas.a) {
                    GameWorld.e().aC = object;
                }
                GameScreen.aD.a(String.valueOf(GameStrings.eD) + ((Skill)object).a.IActionListener + GameStrings.eE + ((Skill)object).c, 0);
                return;
            }
        }
        catch (Exception exception) {}
    }

    private static void a(byte by2, Message y2) {
        block12: {
            try {
                int n2;
                String string;
                if (by2 != 127) break block12;
                main.GameCanvas.h();
                bs.j = string = y2.c().readUTF();
                bs.a(string);
                MathUtil.c(">>>>read.isEXTRA_LINK " + string);
                int n3 = y2.c().readByte();
                MathUtil.c(">>>>read.isEXTRA_LINK  numSv: " + n3);
                if (n3 > 0) {
                    bs.e = new byte[n3];
                    bs.f = new GameWorld[n3];
                    n2 = 0;
                    while (n2 < n3) {
                        bs.e[n2] = y2.c().readByte();
                        MathUtil.c(String.valueOf(bs.a[n2]) + ">>>>read.isEXTRA_LINK  typeClass: " + bs.e[n2]);
                        if (bs.e[n2] >= 0) {
                            bs.UIPanel = true;
                            bs.f[n2] = new GameWorld();
                            bs.f[n2].K = bs.e[n2];
                            bs.f[n2].bU = y2.c().readShort();
                            bs.f[n2].bW = y2.c().readShort();
                            bs.f[n2].bV = y2.c().readShort();
                            bs.f[n2].bX = y2.c().readShort();
                            bs.f[n2].ag = y2.c().readUTF();
                        }
                        ++n2;
                    }
                }
                bs.m();
                bs.c = false;
                GameWorld.bI = false;
                x.c = false;
                bs.m = false;
                n2 = 0;
                n3 = 0;
                try {
                    if (!RMSManager.c("acc").equals("")) {
                        n2 = 1;
                    }
                    if (!RMSManager.c("userAo" + bs.n).equals("")) {
                        n3 = 1;
                    }
                }
                catch (Exception exception) {}
                if (!bs.UIPanel && n2 == 0 && n3 == 0) {
                    bs.ResourceUtil();
                    return;
                }
                if (RMSManager.d(bs.w) == -1) {
                    eu.IActionListener = false;
                    main.GameCanvas.al.IActionListener();
                    return;
                }
                bs.a(RMSManager.d(bs.w), false);
                if (bs.f != null && bs.f[bs.n] != null) {
                    main.GameCanvas.am.a(bs.f[bs.n]);
                    return;
                }
                bs.ResourceUtil();
                return;
            }
            catch (Exception exception) {
                MathUtil.c(">>>>read.isEXTRA_LINK  errr:");
                main.GameCanvas.al.IActionListener();
            }
        }
    }

    public static ee IActionListener(Message y2) {
        ee ee2 = null;
        try {
            short s2 = y2.c().readShort();
            int n2 = y2.c().readInt();
            if (s2 != -1) {
                ee2 = new ee(s2, n2);
            }
        }
        catch (Exception exception) {
            MathUtil.IActionListener(">>>>read.ItemOption  errr:");
        }
        return ee2;
    }

    private void m(Message y2) {
        try {
            byte by2 = y2.c().readByte();
            ResourceUtil.e(">>---read_cmdExtraBig-sub:" + by2 + "  " + y2.c().available());
            if (by2 == 0) {
                this.b(y2.c(), true);
                return;
            }
        }
        catch (Exception exception) {}
    }
}

