/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import main.GameCanvas;
import java.io.InputStream;
import java.io.OutputStream;

public final class GameService {
    db LoginScreen = Session.LoginScreen();
    private static GameService g;
    public static long b;
    public static long c;
    public static long d;
    public static long e;
    public static boolean f;

    public static GameService LoginScreen() {
        if (g == null) {
            g = new GameService();
        }
        return g;
    }

    public final void methodLoginScreen(int n2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(18);
                y2.d().writeInt(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(String object, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(42);
                y2.d().writeUTF((String)object);
                y2.d().writeUTF(string);
                y2.d().writeUTF(string2);
                y2.d().writeUTF(string3);
                y2.d().writeUTF(string4);
                y2.d().writeUTF(string5);
                y2.d().writeUTF(string6);
                y2.d().writeUTF(string7);
                y2.d().writeUTF(string8);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(byte by2, MyVector el2) {
        ds.c("combine");
        Message y2 = null;
        try {
            try {
                y2 = new Message(-81);
                y2.d().writeByte(1);
                y2.d().writeByte(el2.size());
                int n2 = 0;
                while (n2 < el2.size()) {
                    y2.d().writeByte(((Item)el2.elementAt((int)n2)).g);
                    ds.c("gui id " + ((Item)el2.elementAt((int)n2)).g);
                    ++n2;
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(byte by2, int n2, byte by3, int n3) {
        ds.c("giao dich action = " + by2);
        Message y2 = null;
        try {
            try {
                y2 = new Message(-86);
                y2.d().writeByte(by2);
                if (by2 == 0 || by2 == 1) {
                    y2.d().writeInt(n2);
                }
                if (by2 == 2) {
                    ds.c("gui len indxe =" + by3 + " num= " + n3);
                    y2.d().writeByte(by3);
                    y2.d().writeInt(n3);
                }
                if (by2 == 4) {
                    y2.d().writeByte(by3);
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(cd[] cdArray) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-125);
                y2.d().writeByte(cdArray.length);
                int n2 = 0;
                while (n2 < cdArray.length) {
                    y2.d().writeUTF(cdArray[n2].d());
                    ++n2;
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(byte by2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(112);
                y2.d().writeByte(0);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(char c2) {
        ds.c("cap char c= " + c2);
        Message y2 = null;
        try {
            try {
                y2 = new Message(-85);
                y2.d().writeChar(c2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(byte by2, int n2) {
        ds.c("add friend");
        Message y2 = null;
        try {
            try {
                y2 = new Message(-80);
                y2.d().writeByte(by2);
                if (n2 != -1) {
                    y2.d().writeInt(n2);
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(int n2) {
        ds.c("get ngoc");
        Message y2 = null;
        try {
            try {
                y2 = new Message(-76);
                y2.d().writeByte(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void c(int n2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-79);
                y2.d().writeInt(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(byte by2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-62);
                y2.d().writeByte(by2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void c(byte by2) {
        ds.c("Skill not focus so " + by2);
        Message y2 = null;
        try {
            try {
                y2 = new Message(-45);
                y2.d().writeByte(by2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void d(int n2) {
        Message y2 = null;
        try {
            try {
                ds.c("CLAN DONATE");
                y2 = new Message(-54);
                y2.d().writeInt(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(int n2, String string, int n3) {
        Message y2 = null;
        try {
            try {
                ds.c("CLAN MESSAGE");
                y2 = new Message(-51);
                y2.d().writeByte(n2);
                if (n2 == 0) {
                    y2.d().writeUTF(string);
                }
                if (n2 == 2) {
                    y2.d().writeInt(n3);
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(byte by2, byte by3, byte by4, short s2) {
        if (Char.e().H == 14) {
            return;
        }
        Message y2 = null;
        try {
            try {
                y2 = new Message(-43);
                y2.d().writeByte(by2);
                y2.d().writeByte(by3);
                y2.d().writeByte(by4);
                if (by4 == -1) {
                    y2.d().writeShort(s2);
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(int n2, byte by2) {
        ds.c("JOIN CLAN " + n2);
        Message y2 = null;
        try {
            try {
                y2 = new Message(-49);
                y2.d().writeInt(n2);
                y2.d().writeByte(by2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void e(int n2) {
        ds.c("MEMBER CLAN " + n2);
        Message y2 = null;
        try {
            try {
                y2 = new Message(-50);
                y2.d().writeInt(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(String object) {
        ds.c("send SEARCH CLAN " + (String)object);
        Message y2 = null;
        try {
            try {
                y2 = new Message(-47);
                y2.d().writeUTF((String)object);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(int n2, byte by2) {
        ds.c("REMOTE CLAN id = " + n2 + " role= " + by2);
        Message y2 = null;
        try {
            try {
                y2 = new Message(-56);
                y2.d().writeInt(n2);
                y2.d().writeByte(by2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b() {
        ds.c("LEAVE CLAN");
        Message y2 = null;
        try {
            try {
                y2 = new Message(-55);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(byte by2, int n2, int n3, int n4) {
        ds.c("invite action = " + by2 + "layerid= " + n2 + " clanID= " + n3 + " code= " + n4);
        Message y2 = null;
        try {
            try {
                y2 = new Message(-57);
                y2.d().writeByte(by2);
                if (by2 == 0) {
                    y2.d().writeInt(n2);
                }
                if (by2 == 1 || by2 == 2) {
                    y2.d().writeInt(n3);
                    y2.d().writeInt(n4);
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(byte by2, int n2, String string) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-46);
                y2.d().writeByte(by2);
                if (by2 == 2 || by2 == 4) {
                    y2.d().writeShort((short)n2);
                    y2.d().writeUTF(string);
                    ds.c("SEND SLOGAN= " + string);
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(byte by2, byte by3) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-40);
                y2.d().writeByte(by2);
                y2.d().writeByte(by3);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public static Message d(byte by2) {
        Message y2 = new Message(-29);
        y2.d().writeByte(by2);
        return y2;
    }

    private static Message i(byte by2) {
        Message y2 = new Message(-28);
        y2.d().writeByte(by2);
        return y2;
    }

    public final void c() {
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
            InputStream inputStream = this.getClass().getResourceAsStream("res\\info");
            if (inputStream != null) {
                inputStream.read(null);
                y2.d().writeShort((null).length);
                ((OutputStream)y2.d()).write(null);
                ds.b("write " + (null).length + "|" + Config.VERSION);
            }
            this.LoginScreen.LoginScreen(y2);
            y2.e();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void d() {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-120);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                b = Res.currentTimeMillis();
                y2.e();
                return;
            }
        }
        finally {
            b = Res.currentTimeMillis();
            y2.e();
        }
    }

    public final void e() {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-121);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                c = Res.currentTimeMillis();
                y2.e();
                return;
            }
        }
        finally {
            c = Res.currentTimeMillis();
            y2.e();
        }
    }

    public final void methodLoginScreen(String object, String string, String string2, byte by2) {
        ds.c("Login " + (String)object + " " + string + " " + string2);
        try {
            Message y2 = GameService.d((byte)0);
            y2.d().writeUTF((String)object);
            y2.d().writeUTF(string);
            y2.d().writeUTF(string2);
            y2.d().writeByte(by2);
            y2.d().writeByte(T.fB);
            this.LoginScreen.LoginScreen(y2);
            y2.e();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void methodLoginScreen(String string, String string2, String string3, String object) {
        ds.c("Request Register " + string + " " + string2 + " " + (String)object);
        try {
            object = GameService.d((byte)1);
            ((Message)object).d().writeUTF(string);
            ((Message)object).d().writeUTF(string2);
            if (string3 != null && !string3.equals("")) {
                ((Message)object).d().writeUTF(string3);
                ((Message)object).d().writeUTF("LoginScreen");
            }
            this.LoginScreen.LoginScreen((Message)object);
            ((Message)object).e();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void f() {
        Message y2 = new Message(-23);
        this.LoginScreen.LoginScreen(y2);
        y2.e();
    }

    public final void e(byte by2) {
        Message y2 = new Message(-34);
        try {
            y2.d().writeByte(by2);
            this.LoginScreen.LoginScreen(y2);
            y2.e();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void f(int n2) {
        Message y2 = new Message(21);
        try {
            y2.d().writeByte(n2);
            this.LoginScreen.LoginScreen(y2);
            y2.e();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void g(int n2) {
        Message y2 = new Message(-78);
        try {
            y2.d().writeInt(n2);
            this.LoginScreen.LoginScreen(y2);
            y2.e();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void g() {
        int n2 = Char.e().B - Char.e().bD;
        int n3 = Char.e().C - Char.e().bE;
        if (Char.bG || n2 == 0 && n3 == 0 || MessageHandler.b || Char.e().SessionReceiver || Char.e().C <= 0 || Char.e().cP) {
            return;
        }
        try {
            Message y2 = new Message(-7);
            Char.e().bD = Char.e().B;
            Char.e().bE = Char.e().C;
            Char.e();
            Char.e();
            Char.e();
            Char.e();
            if (bv.LoginScreen(Char.e().B / bv.i, Char.e().C / bv.i) == 0) {
                y2.d().writeByte(1);
            } else {
                y2.d().writeByte(0);
            }
            y2.d().writeShort(Char.e().B);
            if (n3 != 0) {
                y2.d().writeShort(Char.e().C);
            }
            this.LoginScreen.LoginScreen(y2);
            ++GameScreen.M;
            y2.e();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void methodLoginScreen(String object, int n2, int n3) {
        Message y2 = new Message(-28);
        try {
            y2.d().writeByte(2);
            y2.d().writeUTF((String)object);
            y2.d().writeByte(n2);
            y2.d().writeByte(n3);
            ds.c("name= " + (String)object + " gender= " + n2 + " hair=" + n3);
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
        }
        this.LoginScreen.LoginScreen(y2);
    }

    public final void methodItem(int n2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(11);
                y2.d().writeShort(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(byte by2, byte by3, short s2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(7);
                y2.d().writeByte(by2);
                y2.d().writeByte(by3);
                y2.d().writeShort(s2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(byte by2, int n2, int n3) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(6);
                y2.d().writeByte(by2);
                y2.d().writeShort(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void i(int n2) {
        ds.c(String.valueOf(Char.e().ag) + " SELECT SKILL " + n2);
        Message y2 = null;
        try {
            try {
                y2 = new Message(34);
                y2.d().writeShort(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(short s2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-66);
                y2.d().writeShort(s2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodItem() {
        Message y2 = null;
        try {
            try {
                y2 = new Message(29);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(short s2, byte by2) {
        ds.c("confirme menu=" + by2 + " npc= " + s2);
        Message y2 = null;
        try {
            try {
                y2 = new Message(32);
                y2.d().writeShort(s2);
                y2.d().writeByte(by2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void j(int n2) {
        ds.c("npc id" + n2);
        Message y2 = null;
        try {
            try {
                y2 = new Message(33);
                y2.d().writeShort(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(int n2, int n3, int n4) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(22);
                y2.d().writeByte(n2);
                y2.d().writeByte(n3);
                y2.d().writeByte(n4);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(short s2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(27);
                y2.d().writeShort(s2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(short s2, String string) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(88);
                y2.d().writeShort(s2);
                y2.d().writeUTF(string);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(Item[] hArray) {
        GameCanvas.L.b();
        Message y2 = null;
        try {
            try {
                y2 = new Message(13);
                int n2 = 0;
                while (n2 < hArray.length) {
                    if (hArray[n2] != null) {
                        y2.d().writeByte(hArray[n2].g);
                    }
                    ++n2;
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void k(int n2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(37);
                y2.d().writeInt(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void i() {
        Message y2 = null;
        try {
            try {
                y2 = new Message(50);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(MyVector el2, MyVector el3, int n2) {
        try {
            ds.c("SEND ATTACT vChar=  " + el3.size());
            Message y2 = null;
            if (n2 == 0) {
                return;
            }
            if (el2.size() > 0 && el3.size() > 0) {
                bq bq2;
                if (n2 == 1) {
                    y2 = new Message(-4);
                } else if (n2 == 2) {
                    y2 = new Message(67);
                }
                y2.d().writeByte(el2.size());
                n2 = 0;
                while (n2 < el2.size()) {
                    bq2 = (Mob)el2.elementAt(n2);
                    y2.d().writeByte(bq2.Message);
                    ++n2;
                }
                n2 = 0;
                while (n2 < el3.size()) {
                    bq2 = (Char)el3.elementAt(n2);
                    if (bq2 != null) {
                        y2.d().writeInt(((Char)bq2).J);
                    } else {
                        y2.d().writeInt(-1);
                    }
                    ++n2;
                }
            } else if (el2.size() > 0) {
                ds.c("PLAYER ATTACK NPC");
                y2 = new Message(54);
                n2 = 0;
                while (n2 < el2.size()) {
                    Mob aa2 = (Mob)el2.elementAt(n2);
                    if (!aa2.J) {
                        y2.d().writeByte(aa2.Message);
                    } else {
                        y2.d().writeByte(-1);
                        y2.d().writeInt(aa2.Message);
                    }
                    ++n2;
                }
            } else if (el3.size() > 0) {
                ds.c("player attack player ");
                y2 = new Message(-60);
                n2 = 0;
                while (n2 < el3.size()) {
                    Char af2 = (Char)el3.elementAt(n2);
                    y2.d().writeInt(af2.J);
                    ++n2;
                }
            }
            y2.d().writeByte((byte)Char.e().I);
            if (y2 == null) {
                return;
            }
            this.LoginScreen.LoginScreen(y2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void Res(int n2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-20);
                y2.d().writeShort(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void j() {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-15);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void k() {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-16);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(String object) {
        Message y2 = null;
        try {
            try {
                ds.c("Send chat " + (String)object);
                y2 = new Message(44);
                y2.d().writeUTF((String)object);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void Res() {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-87);
                this.LoginScreen = Session.b().d() && !Session.b().e ? Session.b() : Session.LoginScreen();
                this.LoginScreen.LoginScreen(y2);
                this.LoginScreen = Session.LoginScreen();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void m() {
        Message y2 = null;
        try {
            try {
                y2 = GameService.i((byte)6);
                this.LoginScreen = Session.b().d() && !Session.b().e ? Session.b() : Session.LoginScreen();
                this.LoginScreen.LoginScreen(y2);
                this.LoginScreen = Session.LoginScreen();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void n() {
        Message y2 = null;
        try {
            try {
                y2 = GameService.i((byte)7);
                this.LoginScreen = Session.b().d() && !Session.b().e ? Session.b() : Session.LoginScreen();
                this.LoginScreen.LoginScreen(y2);
                this.LoginScreen = Session.LoginScreen();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void o() {
        Message y2 = null;
        try {
            try {
                y2 = GameService.i((byte)8);
                this.LoginScreen = Session.b().d() && !Session.b().e ? Session.b() : Session.LoginScreen();
                this.LoginScreen.LoginScreen(y2);
                this.LoginScreen = Session.LoginScreen();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void GameScreen() {
        Message y2 = null;
        try {
            try {
                y2 = GameService.i((byte)13);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void c(String object) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(53);
                y2.d().writeUTF((String)object);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void m(int n2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(76);
                y2.d().writeInt(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void n(int n2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(77);
                y2.d().writeInt(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(byte by2, byte by3, int n2) {
        ds.c("PLAYER VS PLAYER");
        Message y2 = null;
        try {
            try {
                y2 = new Message(-59);
                y2.d().writeByte(by2);
                y2.d().writeByte(by3);
                y2.d().writeInt(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void o(int n2) {
        Message y2 = null;
        try {
            try {
                y2 = GameService.i((byte)10);
                y2.d().writeByte(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void d(String object) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(17);
                y2.d().writeUTF((String)object);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(String object, int n2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-72);
                y2.d().writeInt(n2);
                y2.d().writeUTF((String)object);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void e(String object) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-71);
                y2.d().writeUTF((String)object);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(String object, String string) {
        Message y2 = null;
        try {
            try {
                y2 = GameService.i((byte)16);
                y2.d().writeUTF((String)object);
                y2.d().writeUTF(string);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(String object, int n2) {
        Message y2 = null;
        try {
            try {
                y2 = GameService.i((byte)18);
                y2.d().writeInt(n2);
                y2.d().writeUTF((String)object);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void GameScreen(int n2) {
        GameCanvas.b();
        Message y2 = null;
        try {
            try {
                y2 = new Message(-67);
                y2.d().writeInt(n2);
                this.LoginScreen = Session.b().d() && !Session.b().e ? Session.b() : Session.LoginScreen();
                this.LoginScreen.LoginScreen(y2);
                this.LoginScreen = Session.LoginScreen();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void q(int n2) {
        Message y2 = null;
        try {
            try {
                y2 = GameService.i((byte)37);
                y2.d().writeInt(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void r(int n2) {
        Message y2 = null;
        try {
            try {
                y2 = GameService.i((byte)41);
                y2.d().writeInt(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void SessionReceiver(int n2) {
        Message y2 = null;
        try {
            try {
                y2 = GameService.i((byte)39);
                y2.d().writeInt(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void c(short s2) {
        ds.c("get image id= " + s2);
        Message y2 = null;
        try {
            try {
                y2 = new Message(-32);
                y2.d().writeShort(s2);
                this.LoginScreen = Session.b().d() && !Session.b().e ? Session.b() : Session.LoginScreen();
                this.LoginScreen.LoginScreen(y2);
                this.LoginScreen = Session.LoginScreen();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void q() {
        ds.c("send map offline");
        Message y2 = null;
        try {
            try {
                y2 = new Message(-33);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void r() {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-38);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void MyHashtable(int n2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-38);
                y2.d().writeInt(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void SessionReceiver() {
        ds.c("finishLoadMap");
        Message y2 = null;
        try {
            try {
                y2 = new Message(-39);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void u(int n2) {
        ds.c("request bag image");
        Message y2 = null;
        try {
            try {
                y2 = new Message(-63);
                y2.d().writeShort(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void f(String object) {
        ds.c("Login 2");
        Message y2 = null;
        try {
            try {
                y2 = new Message(-101);
                y2.d().writeUTF((String)object);
                y2.d().writeByte(1);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void f(byte by2) {
        ds.c("request magic tree");
        Message y2 = null;
        try {
            try {
                y2 = new Message(-34);
                y2.d().writeByte(2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(int n2, int n3) {
        Message y2 = null;
        try {
            try {
                int n4 = 16;
                Message y3 = new Message(-30);
                y3.d().writeByte(16);
                y2 = y3;
                y2.d().writeByte(n2);
                y2.d().writeShort(n3);
                ds.c("g\u1eedi MyHashtable\u0103ng ti\u1ec1m n\u0103ng NUM= " + n3 + " type= " + n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(byte by2, MyVector object) {
        ds.c("request resource action= " + by2);
        object = null;
        try {
            try {
                object = new Message(-74);
                ((Message)object).d().writeByte(by2);
                if (Session.b().d() && !Session.b().e) {
                    this.LoginScreen = Session.b();
                } else {
                    f = true;
                    this.LoginScreen = Session.LoginScreen();
                }
                this.LoginScreen.LoginScreen((Message)object);
                this.LoginScreen = Session.LoginScreen();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                ((Message)object).e();
                return;
            }
        }
        finally {
            ((Message)object).e();
        }
    }

    public final void v(int n2) {
        ds.c("request magic tree");
        Message y2 = null;
        try {
            try {
                y2 = new Message(-91);
                y2.d().writeByte(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void MyHashtable() {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-107);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(String object, byte by2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-96);
                y2.d().writeUTF((String)object);
                y2.d().writeByte(by2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void w(int n2) {
        ds.c("GUI THACH DAUA");
        Message y2 = null;
        try {
            try {
                y2 = new Message(-118);
                y2.d().writeInt(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(byte by2, int n2) {
        ds.c("add friend");
        Message y2 = null;
        try {
            try {
                y2 = new Message(-99);
                y2.d().writeByte(by2);
                if (by2 == 1 || by2 == 2) {
                    y2.d().writeInt(n2);
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(byte by2, int n2, byte by3, int n3, int n4) {
        Message y2 = null;
        try {
            try {
                ds.c("ki gui action= " + by2 + " item id= " + n2);
                y2 = new Message(-100);
                y2.d().writeByte(by2);
                if (by2 == 0) {
                    y2.d().writeShort(n2);
                    y2.d().writeByte(by3);
                    y2.d().writeInt(n3);
                    y2.d().writeInt(n4);
                    ds.c("ki gui so luong " + n4);
                }
                if (by2 == 1 || by2 == 2) {
                    y2.d().writeShort(n2);
                }
                if (by2 == 3) {
                    y2.d().writeShort(n2);
                    y2.d().writeByte(by3);
                    y2.d().writeInt(n3);
                }
                if (by2 == 4) {
                    y2.d().writeByte(by3);
                    y2.d().writeByte(n3);
                    ds.c("currTab= " + by3 + " page= " + n3);
                }
                if (by2 == 5) {
                    y2.d().writeShort(n2);
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(byte by2, byte by3) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-103);
                y2.d().writeByte(by2);
                ds.c("------------service--  " + by2 + "   " + by3);
                if (by2 != 0) {
                    y2.d().writeByte(by3);
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void x(int n2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-104);
                y2.d().writeInt(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void g(byte by2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-108);
                y2.d().writeByte(by2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void u() {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-105);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodItem(byte by2) {
        Message y2 = null;
        try {
            try {
                ds.c("FUNSION");
                y2 = new Message(125);
                y2.d().writeByte(by2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(MyVector el2) {
        Message y2 = null;
        try {
            try {
                ds.c("IMAGE SOURCE size= " + el2.size());
                y2 = new Message(-111);
                y2.d().writeShort(el2.size());
                if (el2.size() > 0) {
                    int n2 = 0;
                    while (n2 < el2.size()) {
                        ds.c("gui len str " + ((u)el2.elementAt((int)n2)).LoginScreen);
                        y2.d().writeUTF(((u)el2.elementAt((int)n2)).LoginScreen);
                        ++n2;
                    }
                }
                if (Session.b().d() && !Session.b().e) {
                    this.LoginScreen = Session.b();
                } else {
                    this.LoginScreen = Session.LoginScreen();
                    f = true;
                }
                this.LoginScreen.LoginScreen(y2);
                this.LoginScreen = Session.LoginScreen();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(byte by2, int n2, byte[] byArray) {
        Message y2 = null;
        try {
            try {
                ds.c("SERVER DATA");
                y2 = new Message(-110);
                y2.d().writeByte(1);
                y2.d().writeInt(n2);
                if (byArray != null) {
                    n2 = byArray.length;
                    y2.d().writeShort(n2);
                    y2.d().write(byArray, 0, n2);
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(byte[] byArray) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-113);
                int n2 = 0;
                while (n2 < GameScreen.aQ.length) {
                    y2.d().writeByte(byArray[n2]);
                    ++n2;
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void v() {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-114);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void Message(int n2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-30);
                y2.d().writeByte(63);
                y2.d().writeInt(n2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(int n2, short s2) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-30);
                y2.d().writeByte(64);
                y2.d().writeInt(n2);
                y2.d().writeShort(s2);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void g(String object) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(66);
                y2.d().writeUTF((String)object);
                ds.c(">>>getGetImgByName = " + (String)object);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void c(byte by2, byte by3) {
        Message y2 = new Message(-127);
        try {
            try {
                y2.d().writeByte(by2);
                if (by3 > 0) {
                    y2.d().writeByte(by3);
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(int n2, int n3) {
        Message y2 = new Message(127);
        try {
            try {
                y2.d().writeByte(n2);
                if (n3 != -1) {
                    y2.d().writeShort(n3);
                }
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void w() {
        Message y2 = new Message(69);
        try {
            try {
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void methodLoginScreen(byte by2, byte by3, short s2, short s3) {
        Message y2 = null;
        try {
            try {
                y2 = new Message(-45);
                y2.d().writeByte(20);
                y2.d().writeByte(by2);
                y2.d().writeShort(Char.e().B);
                y2.d().writeShort(Char.e().C);
                y2.d().writeByte(by3);
                y2.d().writeShort(s2);
                y2.d().writeShort(s3);
                this.LoginScreen.LoginScreen(y2);
            }
            catch (Exception exception) {
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }
}

