import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;

public final class l {
  public static boolean a = false;
  
  public static boolean b = false;
  
  private static Image i = b("/mainImage/black.png");
  
  public static int c = 1;
  
  public static byte d = 0;
  
  public static byte e = 0;
  
  public static byte f = 5;
  
  public static String g;
  
  public static boolean h = false;
  
  public static void a() {
    e = 0;
  }
  
  public static int a(Image paramImage) {
    return (c == 5) ? paramImage.getWidth() : paramImage.getWidth();
  }
  
  public static int b(Image paramImage) {
    return (c == 5) ? paramImage.getHeight() : paramImage.getWidth();
  }
  
  public static String a(long paramLong, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    long l1;
    return ((l1 = (paramLong + (paramInt * 1000) - System.currentTimeMillis()) / 1000L) <= 0L) ? "" : (new StringBuffer(String.valueOf(l1))).toString();
  }
  
  public static String a(long paramLong) {
    // Byte code:
    //   0: new java/lang/StringBuffer
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: lload_0
    //   8: invokevirtual append : (J)Ljava/lang/StringBuffer;
    //   11: invokevirtual toString : ()Ljava/lang/String;
    //   14: astore_2
    //   15: iconst_0
    //   16: istore_3
    //   17: lload_0
    //   18: lconst_0
    //   19: lcmp
    //   20: ifge -> 43
    //   23: iconst_1
    //   24: istore_3
    //   25: lload_0
    //   26: lneg
    //   27: lstore_0
    //   28: new java/lang/StringBuffer
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: lload_0
    //   36: invokevirtual append : (J)Ljava/lang/StringBuffer;
    //   39: invokevirtual toString : ()Ljava/lang/String;
    //   42: astore_2
    //   43: lload_0
    //   44: ldc2_w 1000000000
    //   47: lcmp
    //   48: iflt -> 82
    //   51: ldc 'b'
    //   53: astore #4
    //   55: lload_0
    //   56: ldc2_w 1000000000
    //   59: ldiv
    //   60: lstore_0
    //   61: new java/lang/StringBuffer
    //   64: dup
    //   65: invokespecial <init> : ()V
    //   68: lload_0
    //   69: invokevirtual append : (J)Ljava/lang/StringBuffer;
    //   72: invokevirtual toString : ()Ljava/lang/String;
    //   75: invokevirtual length : ()I
    //   78: istore_0
    //   79: goto -> 183
    //   82: lload_0
    //   83: ldc2_w 1000000
    //   86: lcmp
    //   87: iflt -> 121
    //   90: ldc 'm'
    //   92: astore #4
    //   94: lload_0
    //   95: ldc2_w 1000000
    //   98: ldiv
    //   99: lstore_0
    //   100: new java/lang/StringBuffer
    //   103: dup
    //   104: invokespecial <init> : ()V
    //   107: lload_0
    //   108: invokevirtual append : (J)Ljava/lang/StringBuffer;
    //   111: invokevirtual toString : ()Ljava/lang/String;
    //   114: invokevirtual length : ()I
    //   117: istore_0
    //   118: goto -> 183
    //   121: lload_0
    //   122: ldc2_w 1000
    //   125: lcmp
    //   126: iflt -> 160
    //   129: ldc 'k'
    //   131: astore #4
    //   133: lload_0
    //   134: ldc2_w 1000
    //   137: ldiv
    //   138: lstore_0
    //   139: new java/lang/StringBuffer
    //   142: dup
    //   143: invokespecial <init> : ()V
    //   146: lload_0
    //   147: invokevirtual append : (J)Ljava/lang/StringBuffer;
    //   150: invokevirtual toString : ()Ljava/lang/String;
    //   153: invokevirtual length : ()I
    //   156: istore_0
    //   157: goto -> 183
    //   160: iload_3
    //   161: ifeq -> 181
    //   164: new java/lang/StringBuffer
    //   167: dup
    //   168: ldc '-'
    //   170: invokespecial <init> : (Ljava/lang/String;)V
    //   173: aload_2
    //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   177: invokevirtual toString : ()Ljava/lang/String;
    //   180: areturn
    //   181: aload_2
    //   182: areturn
    //   183: aload_2
    //   184: iload_0
    //   185: iconst_2
    //   186: invokevirtual substring : (II)Ljava/lang/String;
    //   189: invokestatic parseInt : (Ljava/lang/String;)I
    //   192: dup
    //   193: istore_1
    //   194: ifne -> 225
    //   197: new java/lang/StringBuffer
    //   200: dup
    //   201: aload_2
    //   202: iconst_0
    //   203: iload_0
    //   204: invokevirtual substring : (II)Ljava/lang/String;
    //   207: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   210: invokespecial <init> : (Ljava/lang/String;)V
    //   213: aload #4
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   218: invokevirtual toString : ()Ljava/lang/String;
    //   221: astore_2
    //   222: goto -> 317
    //   225: iload_1
    //   226: bipush #10
    //   228: irem
    //   229: ifne -> 274
    //   232: new java/lang/StringBuffer
    //   235: dup
    //   236: aload_2
    //   237: iconst_0
    //   238: iload_0
    //   239: invokevirtual substring : (II)Ljava/lang/String;
    //   242: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   245: invokespecial <init> : (Ljava/lang/String;)V
    //   248: ldc ','
    //   250: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   253: aload_2
    //   254: iload_0
    //   255: iconst_1
    //   256: invokevirtual substring : (II)Ljava/lang/String;
    //   259: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   262: aload #4
    //   264: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   267: invokevirtual toString : ()Ljava/lang/String;
    //   270: astore_2
    //   271: goto -> 317
    //   274: new java/lang/StringBuffer
    //   277: dup
    //   278: aload_2
    //   279: iconst_0
    //   280: iload_0
    //   281: invokevirtual substring : (II)Ljava/lang/String;
    //   284: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   287: invokespecial <init> : (Ljava/lang/String;)V
    //   290: ldc ','
    //   292: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   295: aload_2
    //   296: iload_0
    //   297: iconst_2
    //   298: invokevirtual substring : (II)Ljava/lang/String;
    //   301: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   304: aload #4
    //   306: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   309: invokevirtual toString : ()Ljava/lang/String;
    //   312: astore_2
    //   313: goto -> 317
    //   316: pop
    //   317: iload_3
    //   318: ifeq -> 338
    //   321: new java/lang/StringBuffer
    //   324: dup
    //   325: ldc '-'
    //   327: invokespecial <init> : (Ljava/lang/String;)V
    //   330: aload_2
    //   331: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   334: invokevirtual toString : ()Ljava/lang/String;
    //   337: areturn
    //   338: aload_2
    //   339: areturn
    // Exception table:
    //   from	to	target	type
    //   17	180	316	java/lang/Exception
    //   183	313	316	java/lang/Exception
  }
  
  public static void b() {
    try {
      GameMidlet.f.platformRequest(bs.l);
      return;
    } catch (ConnectionNotFoundException connectionNotFoundException2) {
      ConnectionNotFoundException connectionNotFoundException1;
      (connectionNotFoundException1 = null).printStackTrace();
      return;
    } 
  }
  
  public static void a(en paramen, int paramInt1, int paramInt2, int paramInt3) {
    paramInt3 = paramInt3 / en.a(i) + 1;
    for (byte b = 0; b < paramInt3; b++)
      paramen.a(i, paramInt1 + b * en.a(i), paramInt2, 0); 
  }
  
  public static void c() {
    while (ac.b) {
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException2) {
        InterruptedException interruptedException1;
        (interruptedException1 = null).printStackTrace();
      } 
    } 
  }
  
  public static void a(boolean paramBoolean) {
    if (a.E.equals(em.a)) {
      a.a(String.valueOf(aw.x) + " [1]", 8884, null);
      return;
    } 
    br.a().c();
    br.b().c();
    bs.c = false;
    if (ac.a) {
      a.a(aw.x, 8885, null);
      return;
    } 
    x.c = false;
    x.i = bs.a[bs.n];
    if (a.E != a.ak) {
      ds.c("===========> 2 vào OnconnectFail");
    } else {
      a.h();
      bs.u = true;
      a.ak.b();
    } 
    af.bI = false;
    if (paramBoolean)
      bs.t = 0; 
  }
  
  public static void b(boolean paramBoolean) {
    br.a().c();
    br.b().c();
    if (ac.a) {
      a.h.k();
      a.a(aw.aE, 8885, null);
      return;
    } 
    if (a.E != a.ak) {
      a.a(String.valueOf(aw.x) + " [2]", 8884, null);
    } else {
      a.h();
    } 
    af.bI = false;
    if (paramBoolean)
      bs.t = 0; 
    a.h.k();
  }
  
  public static Image a(String paramString) {
    String str2 = "/x" + en.b + paramString;
    ds.c("path load rms= " + paramString);
    String[] arrayOfString = ds.a((arrayOfString = ds.a(str2, ".", 0))[0], "/", 0);
    Image image;
    byte[] arrayOfByte;
    String str1;
    if ((image = bn.a(paramString)) == null && (arrayOfByte = av.b(str1 = "x" + en.b + arrayOfString[arrayOfString.length - 1])) != null)
      image = Image.createImage(arrayOfByte, 0, arrayOfByte.length); 
    return image;
  }
  
  public static Image b(String paramString) {
    Image image = null;
    try {
      image = bn.a(paramString);
    } catch (Exception exception) {}
    return image;
  }
  
  public static Image c(String paramString) {
    paramString = "/x" + en.b + paramString;
    Image image = null;
    try {
      image = Image.createImage(paramString);
    } catch (Exception exception) {}
    return image;
  }
  
  public static void a(en paramen) {
    for (byte b = 0; b < 5; b++) {
      if (p.bI[b] != -1 && a.d(p.bG[b], p.bH[b]))
        if (p.bJ[b] == 0) {
          di.v.b(paramen, p.bF[b], p.bG[b], p.bH[b], 2);
        } else if (p.bJ[b] == 1) {
          di.x.b(paramen, p.bF[b], p.bG[b], p.bH[b], 2);
        } else if (p.bJ[b] == 2) {
          di.y.b(paramen, p.bF[b], p.bG[b], p.bH[b], 2);
        } else if (p.bJ[b] == 3) {
          di.x.b(paramen, p.bF[b], p.bG[b], p.bH[b], 2, di.y);
        } else if (p.bJ[b] == 8) {
          di.r.b(paramen, p.bF[b], p.bG[b], p.bH[b], 2, di.f);
        } else if (p.bJ[b] == 4) {
          di.s.b(paramen, p.bF[b], p.bG[b], p.bH[b], 2, di.o);
        } else if (p.bJ[b] == 5) {
          di.z.b(paramen, p.bF[b], p.bG[b], p.bH[b], 2);
        } else if (p.bJ[b] == 6) {
          di.x.b(paramen, p.bF[b], p.bG[b], p.bH[b], 2, di.v);
        } else if (p.bJ[b] == 7) {
          di.c.b(paramen, p.bF[b], p.bG[b], p.bH[b], 2, di.f);
        } else if (p.bJ[b] == 9) {
          di.p.b(paramen, p.bF[b], p.bG[b], p.bH[b], 2, di.f);
        } else if (p.bJ[b] == 10) {
          di.l.b(paramen, p.bF[b], p.bG[b], p.bH[b], 2, di.f);
        }  
    } 
  }
  
  public static long d() {
    return System.currentTimeMillis();
  }
  
  public static df d(String paramString) {
    df df = null;
    bm bm = null;
    if ((bm = as.a(paramString, as.a)).a != null) {
      int i;
      if ((i = bm.a.getHeight() / bm.d) <= 0)
        i = 1; 
      df = new df(bm.a, bm.a.getWidth(), i);
    } 
    return df;
  }
  
  public static void e(String paramString) {
    System.out.println(paramString);
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\l.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */