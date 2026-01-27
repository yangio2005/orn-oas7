import main.GameCanvas;
import main.GameMidlet;
/*
 * Decompiled with CFR 0.152.
 */

final class SessionReceiver
implements Runnable {
    private Session LoginScreen;

    SessionReceiver(Session br2) {
        this.LoginScreen = br2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block20: {
            while (true) {
                block23: {
                    block19: {
                        try // LABEL:
                        // 3 sources

                        {
                            while (this.LoginScreen.d()) {
                                block21: {
                                    var1_1 = this;
                                    var2_2 = var1_1.LoginScreen.LoginScreen.readByte();
                                    if (var1_1.LoginScreen.j) {
                                        var2_2 = Session.LoginScreen(var1_1.LoginScreen, var2_2);
                                    }
                                    if (var2_2 != -32 && var2_2 != -66 && var2_2 != 11 && var2_2 != -67 && var2_2 != -74 && var2_2 != -87 && var2_2 != 66 && var2_2 != 12) break block21;
                                    var3_3 = Session.LoginScreen(var1_1.LoginScreen, var1_1.LoginScreen.LoginScreen.readByte()) + 128;
                                    var4_5 = Session.LoginScreen(var1_1.LoginScreen, var1_1.LoginScreen.LoginScreen.readByte()) + 128;
                                    var5_7 = Session.LoginScreen(var1_1.LoginScreen, var1_1.LoginScreen.LoginScreen.readByte()) + 128;
                                    var3_3 = ((var5_7 << 8) + var4_5 << 8) + var3_3;
                                    var4_4 = new byte[var3_3];
                                    var5_7 = 0;
                                    var6_8 = 0;
                                    if (true) break; // GOTO lbl47
                                }
                                if (var1_1.LoginScreen.j) {
                                    var4_6 = var1_1.LoginScreen.LoginScreen.readByte();
                                    var5_7 = var1_1.LoginScreen.LoginScreen.readByte();
                                    var3_3 = (Session.LoginScreen(var1_1.LoginScreen, var4_6) & 255) << 8 | Session.LoginScreen(var1_1.LoginScreen, (byte)var5_7) & 255;
                                } else {
                                    var3_3 = var1_1.LoginScreen.LoginScreen.readUnsignedShort();
                                }
                                var4_4 = new byte[var3_3];
                                var5_7 = 0;
                                var6_8 = 0;
                                while (true) {
                                    block22: {
                                        if (var5_7 != -1 && var6_8 < var3_3) break block22;
                                        if (!var1_1.LoginScreen.j) break block19;
                                        var7_12 = 0;
                                        if (true) break; // GOTO lbl59
                                    }
                                    var5_7 = var1_1.LoginScreen.LoginScreen.read(var4_4, var6_8, var3_3 - var6_8);
                                    if (var5_7 <= 0) continue;
                                    var1_1.LoginScreen.i += (var6_8 += var5_7) + 5;
                                    var7_11 = Session.LoginScreen().i + Session.LoginScreen().Item;
                                    var1_1.LoginScreen.m = String.valueOf(var7_11 / 1024) + "." + var7_11 % 1024 / 102 + "Kb";
                                }
                            }
                            break block20;
                        }
                        catch (Exception v0) {}
                        break block20;
                        do {
                            if ((var5_7 = var1_1.LoginScreen.LoginScreen.read(var4_4, var6_8, var3_3 - var6_8)) <= 0) continue;
                            var1_1.LoginScreen.i += (var6_8 += var5_7) + 5;
                            var7_10 = Session.LoginScreen().i + Session.LoginScreen().Item;
                            var1_1.LoginScreen.m = String.valueOf(var7_10 / 1024) + "." + var7_10 % 1024 / 102 + "Kb";
lbl47:
                            // 3 sources

                        } while (var5_7 != -1 && var6_8 < var3_3);
                        if (var1_1.LoginScreen.j) {
                            var7_10 = 0;
                            while (var7_10 < var4_4.length) {
                                var4_4[var7_10] = Session.LoginScreen(var1_1.LoginScreen, var4_4[var7_10]);
                                ++var7_10;
                            }
                        }
                        v1 = new Message(var2_2, var4_4);
                        break block23;
                        do {
                            var4_4[var7_12] = Session.LoginScreen(var1_1.LoginScreen, var4_4[var7_12]);
                            ++var7_12;
lbl59:
                            // 2 sources

                        } while (var7_12 < var4_4.length);
                    }
                    v1 = var1_1 = new Message(var2_2, var4_4);
                }
                if (v1 == null) break block20;
                try {
                    block24: {
                        if (var1_1.LoginScreen != -27) break block24;
                        this.LoginScreen((Message)var1_1);
                        break; // GOTO lbl-1000
                    }
                    this.LoginScreen.b.LoginScreen((Message)var1_1);
                }
                catch (Exception v2) {
                    var1_1 = v2;
                    v2.printStackTrace();
                    break;
                }
            }
            break; // GOTO lbl-1000
        }
        if (this.LoginScreen.d) {
            if (this.LoginScreen.b != null) {
                if (System.currentTimeMillis() - this.LoginScreen.Res > 500L) {
                    this.LoginScreen.b.c(this.LoginScreen.c);
                } else {
                    this.LoginScreen.b.b(this.LoginScreen.c);
                }
            }
            if (Session.LoginScreen(this.LoginScreen) != null) {
                Session.c(this.LoginScreen);
            }
        }
    }

    private void methodLoginScreen(Message y2) {
        int n2 = y2.c().readByte();
        this.LoginScreen.k = new byte[n2];
        int n3 = 0;
        while (n3 < n2) {
            this.LoginScreen.k[n3] = y2.c().readByte();
            ++n3;
        }
        n3 = 0;
        while (n3 < this.LoginScreen.k.length - 1) {
            int n4 = n3 + 1;
            this.LoginScreen.k[n4] = (byte)(this.LoginScreen.k[n4] ^ this.LoginScreen.k[n3]);
            ++n3;
        }
        this.LoginScreen.j = true;
        GameMidlet.c = y2.c().readUTF();
        GameMidlet.d = y2.c().readInt();
        GameMidlet.g = y2.c().readByte() != 0;
        System.out.println("====> getKey " + this.LoginScreen.j + " co nect 2 is " + GameMidlet.g);
        if (this.LoginScreen.c && GameMidlet.g) {
            GameCanvas.c();
        }
    }
}

