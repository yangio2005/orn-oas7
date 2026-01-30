/*
 * Decompiled with CFR 0.152.
 */
import main.GameMidlet;
import main.GameCanvas;

final class s
implements Runnable {
    private NetworkService a;

    s(NetworkService br2) {
        this.a = br2;
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
                        try lbl-1000:
                        // 3 sources

                        {
                            while (this.a.d()) {
                                block21: {
                                    var1_1 = this;
                                    var2_2 = var1_1.GameCanvas.GameCanvas.readByte();
                                    if (var1_1.GameCanvas.j) {
                                        var2_2 = NetworkService.a(var1_1.a, var2_2);
                                    }
                                    if (var2_2 != -32 && var2_2 != -66 && var2_2 != 11 && var2_2 != -67 && var2_2 != -74 && var2_2 != -87 && var2_2 != 66 && var2_2 != 12) break block21;
                                    var3_3 = NetworkService.a(var1_1.a, var1_1.GameCanvas.GameCanvas.readByte()) + 128;
                                    var4_5 = NetworkService.a(var1_1.a, var1_1.GameCanvas.GameCanvas.readByte()) + 128;
                                    var5_7 = NetworkService.a(var1_1.a, var1_1.GameCanvas.GameCanvas.readByte()) + 128;
                                    var3_3 = ((var5_7 << 8) + var4_5 << 8) + var3_3;
                                    var4_4 = new byte[var3_3];
                                    var5_7 = 0;
                                    var6_8 = 0;
                                    if (true) ** GOTO lbl47
                                }
                                if (var1_1.GameCanvas.j) {
                                    var4_6 = var1_1.GameCanvas.GameCanvas.readByte();
                                    var5_7 = var1_1.GameCanvas.GameCanvas.readByte();
                                    var3_3 = (NetworkService.a(var1_1.a, var4_6) & 255) << 8 | NetworkService.a(var1_1.a, (byte)var5_7) & 255;
                                } else {
                                    var3_3 = var1_1.GameCanvas.GameCanvas.readUnsignedShort();
                                }
                                var4_4 = new byte[var3_3];
                                var5_7 = 0;
                                var6_8 = 0;
                                while (true) {
                                    block22: {
                                        if (var5_7 != -1 && var6_8 < var3_3) break block22;
                                        if (!var1_1.GameCanvas.j) break block19;
                                        var7_12 = 0;
                                        if (true) ** GOTO lbl59
                                    }
                                    var5_7 = var1_1.GameCanvas.GameCanvas.read(var4_4, var6_8, var3_3 - var6_8);
                                    if (var5_7 <= 0) continue;
                                    var1_1.GameCanvas.i += (var6_8 += var5_7) + 5;
                                    var7_11 = NetworkService.a().i + NetworkService.a().h;
                                    var1_1.GameCanvas.m = String.valueOf(var7_11 / 1024) + "." + var7_11 % 1024 / 102 + "Kb";
                                }
                            }
                            break block20;
                        }
                        catch (Exception v0) {}
                        break block20;
                        do {
                            if ((var5_7 = var1_1.GameCanvas.GameCanvas.read(var4_4, var6_8, var3_3 - var6_8)) <= 0) continue;
                            var1_1.GameCanvas.i += (var6_8 += var5_7) + 5;
                            var7_10 = NetworkService.a().i + NetworkService.a().h;
                            var1_1.GameCanvas.m = String.valueOf(var7_10 / 1024) + "." + var7_10 % 1024 / 102 + "Kb";
lbl47:
                            // 3 sources

                        } while (var5_7 != -1 && var6_8 < var3_3);
                        if (var1_1.GameCanvas.j) {
                            var7_10 = 0;
                            while (var7_10 < var4_4.length) {
                                var4_4[var7_10] = NetworkService.a(var1_1.a, var4_4[var7_10]);
                                ++var7_10;
                            }
                        }
                        v1 = new Message(var2_2, var4_4);
                        break block23;
                        do {
                            var4_4[var7_12] = NetworkService.a(var1_1.a, var4_4[var7_12]);
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
                        if (var1_1.a != -27) break block24;
                        this.a((Message)var1_1);
                        ** GOTO lbl-1000
                    }
                    this.a.IActionListener.a((Message)var1_1);
                }
                catch (Exception v2) {
                    var1_1 = v2;
                    v2.printStackTrace();
                    break;
                }
            }
            ** GOTO lbl-1000
        }
        if (this.a.d) {
            if (this.a.IActionListener != null) {
                if (System.currentTimeMillis() - this.a.ResourceUtil > 500L) {
                    this.a.IActionListener.c(this.a.c);
                } else {
                    this.a.IActionListener.IActionListener(this.a.c);
                }
            }
            if (NetworkService.a(this.a) != null) {
                NetworkService.c(this.a);
            }
        }
    }

    private void a(Message y2) {
        int n2 = y2.c().readByte();
        this.a.k = new byte[n2];
        int n3 = 0;
        while (n3 < n2) {
            this.a.k[n3] = y2.c().readByte();
            ++n3;
        }
        n3 = 0;
        while (n3 < this.a.k.length - 1) {
            int n4 = n3 + 1;
            this.a.k[n4] = (byte)(this.a.k[n4] ^ this.a.k[n3]);
            ++n3;
        }
        this.a.j = true;
        GameMidlet.c = y2.c().readUTF();
        GameMidlet.d = y2.c().readInt();
        GameMidlet.UIPanel = y2.c().readByte() != 0;
        System.out.println("====> getKey " + this.a.j + " co nect 2 is " + GameMidlet.UIPanel);
        if (this.a.c && GameMidlet.UIPanel) {
            main.GameCanvas.c();
        }
    }
}

