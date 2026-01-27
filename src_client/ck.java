/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import main.GameCanvas;
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class ck {
    public Image LoginScreen;
    private z[] Item;
    private cs[] i;
    public short[] b;
    public short[][] c = new short[16][];
    public int d;
    public int e = 0;
    public int f;
    public int g;

    public final void methodLoginScreen(String object) {
        try {
            object = ad.LoginScreen((String)object);
            object = new DataInputStream((InputStream)object);
        }
        catch (Exception exception) {
            return;
        }
        this.b((DataInputStream)object);
    }

    public final void b(String object) {
        try {
            object = ad.LoginScreen((String)object);
            object = new DataInputStream((InputStream)object);
        }
        catch (Exception exception) {
            return;
        }
        this.LoginScreen((DataInputStream)object);
    }

    private void methodLoginScreen(DataInputStream dataInputStream) {
        short s2 = 0;
        short s3 = 0;
        int n2 = 0;
        int n3 = 0;
        try {
            int n4 = dataInputStream.readByte();
            this.Item = new z[n4];
            int n5 = 0;
            while (n5 < n4) {
                this.Item[n5] = new z();
                this.Item[n5].LoginScreen = dataInputStream.readByte();
                this.Item[n5].b = (short)dataInputStream.readUnsignedByte();
                this.Item[n5].c = (short)dataInputStream.readUnsignedByte();
                this.Item[n5].d = (short)dataInputStream.readUnsignedByte();
                this.Item[n5].e = (short)dataInputStream.readUnsignedByte();
                ++n5;
            }
            n5 = dataInputStream.readShort();
            this.i = new cs[n5];
            n4 = 0;
            while (n4 < this.i.length) {
                this.i[n4] = new cs();
                n5 = dataInputStream.readByte();
                this.i[n4].LoginScreen = new short[n5];
                this.i[n4].b = new short[n5];
                this.i[n4].c = new byte[n5];
                int n6 = 0;
                while (n6 < n5) {
                    this.i[n4].LoginScreen[n6] = dataInputStream.readShort();
                    this.i[n4].b[n6] = dataInputStream.readShort();
                    this.i[n4].c[n6] = dataInputStream.readByte();
                    if (n4 == 0) {
                        if (s2 > this.i[n4].LoginScreen[n6]) {
                            s2 = this.i[n4].LoginScreen[n6];
                        }
                        if (s3 > this.i[n4].b[n6]) {
                            s3 = this.i[n4].b[n6];
                        }
                        if (n2 < this.i[n4].LoginScreen[n6] + this.Item[this.i[n4].c[n6]].d) {
                            n2 = this.i[n4].LoginScreen[n6] + this.Item[this.i[n4].c[n6]].d;
                        }
                        if (n3 < this.i[n4].b[n6] + this.Item[this.i[n4].c[n6]].e) {
                            n3 = this.i[n4].b[n6] + this.Item[this.i[n4].c[n6]].e;
                        }
                        this.f = n2 - s2;
                        this.g = n3 - s3;
                    }
                    ++n6;
                }
                ++n4;
            }
            this.b = new short[dataInputStream.readShort()];
            n4 = 0;
            while (n4 < this.b.length) {
                this.b[n4] = dataInputStream.readShort();
                ++n4;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void b(DataInputStream dataInputStream) {
        short s2 = 0;
        short s3 = 0;
        int n2 = 0;
        int n3 = 0;
        try {
            int n4;
            int n5 = dataInputStream.readByte();
            ds.c("small num= " + n5);
            this.Item = new z[n5];
            int n6 = 0;
            while (n6 < n5) {
                this.Item[n6] = new z();
                this.Item[n6].LoginScreen = dataInputStream.readByte();
                this.Item[n6].b = (short)dataInputStream.readUnsignedByte();
                this.Item[n6].c = (short)dataInputStream.readUnsignedByte();
                this.Item[n6].d = (short)dataInputStream.readUnsignedByte();
                this.Item[n6].e = (short)dataInputStream.readUnsignedByte();
                ++n6;
            }
            n6 = dataInputStream.readShort();
            this.i = new cs[n6];
            n5 = 0;
            while (n5 < n6) {
                this.i[n5] = new cs();
                n4 = dataInputStream.readByte();
                this.i[n5].LoginScreen = new short[n4];
                this.i[n5].b = new short[n4];
                this.i[n5].c = new byte[n4];
                int n7 = 0;
                while (n7 < n4) {
                    this.i[n5].LoginScreen[n7] = dataInputStream.readShort();
                    this.i[n5].b[n7] = dataInputStream.readShort();
                    this.i[n5].c[n7] = dataInputStream.readByte();
                    if (n5 == 0) {
                        if (s2 > this.i[n5].LoginScreen[n7]) {
                            s2 = this.i[n5].LoginScreen[n7];
                        }
                        if (s3 > this.i[n5].b[n7]) {
                            s3 = this.i[n5].b[n7];
                        }
                        if (n2 < this.i[n5].LoginScreen[n7] + this.Item[this.i[n5].c[n7]].d) {
                            n2 = this.i[n5].LoginScreen[n7] + this.Item[this.i[n5].c[n7]].d;
                        }
                        if (n3 < this.i[n5].b[n7] + this.Item[this.i[n5].c[n7]].e) {
                            n3 = this.i[n5].b[n7] + this.Item[this.i[n5].c[n7]].e;
                        }
                        this.f = n2 - s2;
                        this.g = n3 - s3;
                    }
                    ++n7;
                }
                ++n5;
            }
            n5 = dataInputStream.readShort();
            this.b = new short[n5];
            if (this.d >= 201) {
                short[] sArray = new short[n5];
                s2 = 0;
                String string = "";
                n2 = 0;
                n3 = 0;
                while (n3 < n5) {
                    n6 = dataInputStream.readShort();
                    string = String.valueOf(string) + n6 + ",";
                    this.b[n3] = n6;
                    if (n6 + 500 >= 500) {
                        sArray[s2++] = n6;
                        n2 = 1;
                    } else {
                        n4 = (short)ds.g(n6 + 500);
                        this.c[n4] = new short[s2];
                        System.arraycopy(sArray, 0, this.c[n4], 0, s2);
                        s2 = 0;
                    }
                    ++n3;
                }
                if (n2 == 0) {
                    this.c[0] = new short[s2];
                    System.arraycopy(sArray, 0, this.c[0], 0, s2);
                    return;
                }
                n3 = 0;
                while (n3 < 16) {
                    if (this.c[n3] == null) {
                        this.c[n3] = this.c[2];
                    }
                    ++n3;
                }
                return;
            }
            n4 = 0;
            while (n4 < n5) {
                this.b[n4] = dataInputStream.readShort();
                ++n4;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void methodLoginScreen(byte[] object, byte by2) {
        object = new ByteArrayInputStream((byte[])object);
        object = new DataInputStream((InputStream)object);
        this.LoginScreen((DataInputStream)object, by2);
    }

    public final void methodLoginScreen(byte[] object) {
        object = new ByteArrayInputStream((byte[])object);
        object = new DataInputStream((InputStream)object);
        this.b((DataInputStream)object);
    }

    public final void methodLoginScreen(mGraphics en2, int n2, int n3, int n4, int n5, int n6) {
        if (this.i != null && this.i.length != 0) {
            cs cs2 = this.i[n2];
            int n7 = 0;
            while (n7 < cs2.LoginScreen.length) {
                z z2;
                ck ck2;
                block13: {
                    byte by2 = cs2.c[n7];
                    ck2 = this;
                    int n8 = 0;
                    while (n8 < ck2.Item.length) {
                        if (ck2.Item[n8].LoginScreen == by2) {
                            z2 = ck2.Item[n8];
                            break block13;
                        }
                        ++n8;
                    }
                    z2 = null;
                }
                ck2 = z2;
                try {
                    if (n5 == -1) {
                        en2.LoginScreen(this.LoginScreen, ((z)((Object)ck2)).b, ((z)((Object)ck2)).c, ((z)((Object)ck2)).d, ((z)((Object)ck2)).e, 0, n3 + cs2.LoginScreen[n7], n4 + cs2.b[n7], 0);
                    } else if (n5 == 0) {
                        en2.LoginScreen(this.LoginScreen, ((z)((Object)ck2)).b, ((z)((Object)ck2)).c, ((z)((Object)ck2)).d, ((z)((Object)ck2)).e, 0, n3 + cs2.LoginScreen[n7], n4 + cs2.b[n7] - (n6 < 4 && n6 > 0 ? GameCanvas.ae : 0), 0);
                    } else if (n5 == 1) {
                        en2.LoginScreen(this.LoginScreen, ((z)((Object)ck2)).b, ((z)((Object)ck2)).c, ((z)((Object)ck2)).d, ((z)((Object)ck2)).e, 2, n3 - cs2.LoginScreen[n7], n4 + cs2.b[n7] - (n6 < 4 && n6 > 0 ? GameCanvas.ae : 0), cj.b);
                    } else if (n5 == 2) {
                        en2.LoginScreen(this.LoginScreen, ((z)((Object)ck2)).b, ((z)((Object)ck2)).c, ((z)((Object)ck2)).d, ((z)((Object)ck2)).e, 7, n3 - cs2.LoginScreen[n7], n4 + cs2.b[n7] - (n6 < 4 && n6 > 0 ? GameCanvas.ae : 0), cj.f);
                    }
                }
                catch (Exception exception) {}
                ++n7;
            }
        }
    }

    private void methodLoginScreen(DataInputStream dataInputStream, byte by2) {
        short s2 = 0;
        short s3 = 0;
        int n2 = 0;
        int n3 = 0;
        try {
            int n4 = dataInputStream.readByte();
            this.Item = new z[n4];
            int n5 = 0;
            while (n5 < n4) {
                this.Item[n5] = new z();
                this.Item[n5].LoginScreen = dataInputStream.readByte();
                if (by2 == 1) {
                    this.Item[n5].b = (short)dataInputStream.readUnsignedByte();
                    this.Item[n5].c = (short)dataInputStream.readUnsignedByte();
                } else {
                    this.Item[n5].b = dataInputStream.readShort();
                    this.Item[n5].c = dataInputStream.readShort();
                }
                this.Item[n5].d = (short)dataInputStream.readUnsignedByte();
                this.Item[n5].e = (short)dataInputStream.readUnsignedByte();
                ++n5;
            }
            n5 = dataInputStream.readShort();
            this.i = new cs[n5];
            by2 = 0;
            while (by2 < this.i.length) {
                this.i[by2] = new cs();
                n4 = dataInputStream.readByte();
                this.i[by2].LoginScreen = new short[n4];
                this.i[by2].b = new short[n4];
                this.i[by2].c = new byte[n4];
                n5 = 0;
                while (n5 < n4) {
                    this.i[by2].LoginScreen[n5] = dataInputStream.readShort();
                    this.i[by2].b[n5] = dataInputStream.readShort();
                    this.i[by2].c[n5] = dataInputStream.readByte();
                    if (by2 == 0) {
                        if (s2 > this.i[by2].LoginScreen[n5]) {
                            s2 = this.i[by2].LoginScreen[n5];
                        }
                        if (s3 > this.i[by2].b[n5]) {
                            s3 = this.i[by2].b[n5];
                        }
                        if (n2 < this.i[by2].LoginScreen[n5] + this.Item[this.i[by2].c[n5]].d) {
                            n2 = this.i[by2].LoginScreen[n5] + this.Item[this.i[by2].c[n5]].d;
                        }
                        if (n3 < this.i[by2].b[n5] + this.Item[this.i[by2].c[n5]].e) {
                            n3 = this.i[by2].b[n5] + this.Item[this.i[by2].c[n5]].e;
                        }
                        this.f = n2 - s2;
                        this.g = n3 - s3;
                    }
                    ++n5;
                }
                by2 = (byte)(by2 + 1);
            }
            this.b = new short[dataInputStream.readShort()];
            by2 = 0;
            while (by2 < this.b.length) {
                this.b[by2] = dataInputStream.readShort();
                by2 = (byte)(by2 + 1);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

