package main;

import ac;
import ae;
import af;
import am;
import ar;
import av;
import aw;
import az;
import b;
import bb;
import bc;
import be;
import bi;
import bl;
import bo;
import bp;
import br;
import bs;
import bt;
import bu;
import bv;
import cb;
import ce;
import cj;
import cq;
import cw;
import cx;
import dc;
import de;
import dg;
import di;
import ds;
import du;
import ea;
import ed;
import ei;
import el;
import em;
import en;
import eo;
import eu;
import g;
import h;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import l;
import n;
import p;
import t;
import v;
import x;

public final class a extends dg implements b {
  public static boolean a = false;
  
  public static long b = 0L;
  
  public static boolean c = true;
  
  public static boolean d;
  
  public static boolean e = false;
  
  public static boolean f;
  
  public static boolean g;
  
  public static a h;
  
  public static boolean[] i = new boolean[15];
  
  private static boolean[] ap = new boolean[15];
  
  public static boolean[] j = new boolean[15];
  
  public static boolean k;
  
  public static boolean l;
  
  public static boolean m;
  
  public static boolean n;
  
  public static boolean o;
  
  public static int p;
  
  public static int q;
  
  public static int r;
  
  public static int s;
  
  public static int t;
  
  public static int u;
  
  public static be[] v = new be[4];
  
  public static int w;
  
  public static int x;
  
  private static int aq;
  
  public static boolean y;
  
  public static boolean z;
  
  private static long ar;
  
  private static long as;
  
  public static int A;
  
  public static int B;
  
  public static int C;
  
  public static int D;
  
  public static bb E;
  
  public static az F;
  
  public static g G;
  
  public static g H;
  
  public static x I;
  
  public static bi J;
  
  public static n K;
  
  public static bc L;
  
  public static cx M;
  
  public static Image[] N;
  
  public static int O;
  
  private static int at = 0;
  
  public static int[] P;
  
  public static int[] Q;
  
  private en au = new en();
  
  public static Image[] R = new Image[7];
  
  public static Image[] S = new Image[7];
  
  public static t T = new t("");
  
  public static el U = new el("");
  
  private static el av;
  
  private static el aw;
  
  public static el V;
  
  public static boolean W;
  
  public static int X = -1;
  
  public static long Y;
  
  private static int ax = -1;
  
  private int ay;
  
  private static boolean az;
  
  private static Image aA;
  
  private static Image aB;
  
  public static Image[] Z = new Image[3];
  
  private static Image[] aC = new Image[3];
  
  public static int[] aa;
  
  public static int[] ab;
  
  private static int aD;
  
  private static int aE;
  
  private static int aF;
  
  private static int aG;
  
  private static int[] aH;
  
  private static int[] aI;
  
  private static int[] aJ;
  
  public static boolean ac;
  
  private static boolean aK;
  
  private static int aL;
  
  public static int ad = -1;
  
  public static int ae;
  
  private static int[] aM = new int[5];
  
  public static int[] af;
  
  private static int[] aN;
  
  private static int aO = 0;
  
  private static int[] aP = new int[] { 1, 4, 11 };
  
  private static Image aQ;
  
  private static Image aR;
  
  private static boolean aS;
  
  private static long aT = 0L;
  
  public static int ag;
  
  public static Image ah;
  
  private static int aU = 0;
  
  private static int aV;
  
  private long aW = System.currentTimeMillis() + 1000L;
  
  private long aX = System.currentTimeMillis() + 1000L;
  
  private static String aY;
  
  private static int aZ = A - 60;
  
  private static el ba = new el("");
  
  private int bb = 12;
  
  public static boolean ai = false;
  
  private int[] bc;
  
  private int[] bd;
  
  private int[] be;
  
  private static int[] bf;
  
  private static Image[] bg;
  
  private static Image bh;
  
  private static Image[][] bi;
  
  public static boolean aj = true;
  
  public static bs ak;
  
  public static eu al;
  
  public static am am;
  
  public static boolean an;
  
  private boolean bj;
  
  private static long bk;
  
  private static int bl = 15;
  
  public a() {
    a a1;
    A = (a1 = this).m();
    B = a1.n();
    bb.cp = di.t.a() + 8;
    F = new az();
    G = new g();
    C = A / 2;
    D = B / 2;
    if (a1.hasPointerEvents()) {
      e = true;
      if (A >= 240)
        f = true; 
      if (A < 320)
        g = true; 
    } 
    L = new bc();
    if (B <= 160) {
      cx.a = 15;
      bb.cr = 17;
    } 
    h = a1;
    System.gc();
    M = new cx();
    a1 = a1;
    if (!a) {
      if (bi == null) {
        bi = new Image[2][5];
        for (byte b1 = 0; b1 < 2; b1++) {
          for (byte b2 = 0; b2 < 5; b2++)
            bi[b1][b2] = l.b("/e/d" + b1 + b2 + ".png"); 
        } 
      } 
      a1.bc = new int[2];
      a1.bd = new int[2];
      a1.be = new int[2];
      a1.be[1] = -1;
      a1.be[0] = -1;
    } 
    o();
    bh = l.b("/mainImage/myTexture2df.png");
    int i;
    if ((i = av.d("clienttype")) != -1)
      if (i > 7) {
        av.a("clienttype", l.c);
      } else {
        l.c = i;
      }  
    if (l.c == 7 && (av.c("fake") == null || av.c("fake") == ""))
      bh = l.b("/mainImage/wait.png"); 
    av = new el("vDebugUpdate");
    aw = new el("vDeBugPait");
    V = new el("vDebugSesion");
    for (i = 0; i < 3; i++)
      Z[i] = l.b("/mainImage/myTexture2dbd" + i + ".png"); 
    en.a(Z[0]);
    en.b(Z[0]);
    en.a(Z[1]);
    en.b(Z[1]);
    g.I = av.d("lowGraphic");
    a = (av.d("lowGraphic") == 1);
    p.bV = !(av.d("serverchat") == 1);
    af.cW = (av.d("isPaintAura") == 1);
    af.cX = (av.d("isPaintAura2") == 1);
    ds.a();
    bl.b();
    bo.a();
    if ((g.ab = 176) > A)
      g.ab = A; 
    ah = l.b("/mainImage/18+.png");
    for (i = 0; i < 7; i++) {
      R[i] = l.b("/effectdata/blue/" + i + ".png");
      S[i] = l.b("/effectdata/violet/" + i + ".png");
    } 
    ak = new bs();
    al = new eu();
    I = new x();
    am = new am();
  }
  
  public static a a() {
    return h;
  }
  
  public static void b() {
    if (!br.a().d())
      br.a().a(GameMidlet.a, GameMidlet.b); 
  }
  
  public static void c() {
    if (!br.b().d()) {
      ds.c("IP2= " + GameMidlet.c + " PORT 2= " + GameMidlet.d);
      br.b().a(GameMidlet.c, GameMidlet.d);
    } 
  }
  
  public static void a(en paramen) {
    paramen.a(-paramen.a(), -paramen.b());
    paramen.e(0, 0, A, B);
  }
  
  public static void b(en paramen) {
    paramen.a(-paramen.a(), -paramen.b());
    paramen.a(0, 0);
    paramen.e(0, 0, A, B);
    paramen.a(-p.j, -p.k);
  }
  
  public final void d() {
    // Byte code:
    //   0: getstatic main/a.X : I
    //   3: iconst_1
    //   4: if_icmpne -> 42
    //   7: getstatic main/a.Y : J
    //   10: invokestatic d : ()J
    //   13: lcmp
    //   14: ifge -> 42
    //   17: invokestatic d : ()J
    //   20: putstatic main/a.Y : J
    //   23: iconst_m1
    //   24: putstatic main/a.X : I
    //   27: iconst_0
    //   28: putstatic af.bI : Z
    //   31: aconst_null
    //   32: putstatic main/a.K : Ln;
    //   35: invokestatic c : ()V
    //   38: iconst_1
    //   39: invokestatic a : (Z)V
    //   42: getstatic main/a.X : I
    //   45: iconst_2
    //   46: if_icmpne -> 146
    //   49: getstatic main/a.Y : J
    //   52: invokestatic d : ()J
    //   55: lcmp
    //   56: ifge -> 146
    //   59: getstatic main/a.w : I
    //   62: iconst_2
    //   63: irem
    //   64: ifne -> 146
    //   67: getstatic main/a.E : Lbb;
    //   70: ifnull -> 146
    //   73: getstatic main/a.E : Lbb;
    //   76: invokestatic j : ()Lp;
    //   79: if_acmpne -> 102
    //   82: getstatic af.bI : Z
    //   85: ifeq -> 92
    //   88: iconst_0
    //   89: putstatic af.bI : Z
    //   92: getstatic bs.m : Z
    //   95: ifeq -> 102
    //   98: iconst_0
    //   99: putstatic bs.m : Z
    //   102: getstatic bl.f : Lel;
    //   105: invokevirtual size : ()I
    //   108: ifle -> 139
    //   111: getstatic bl.f : Lel;
    //   114: iconst_0
    //   115: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   118: checkcast eg
    //   121: astore_1
    //   122: invokestatic a : ()Lbt;
    //   125: aload_1
    //   126: getfield b : I
    //   129: invokevirtual p : (I)V
    //   132: getstatic bl.f : Lel;
    //   135: iconst_0
    //   136: invokevirtual removeElementAt : (I)V
    //   139: getstatic ea.n : Lel;
    //   142: invokevirtual size : ()I
    //   145: pop
    //   146: invokestatic d : ()J
    //   149: aload_0
    //   150: getfield aW : J
    //   153: lcmp
    //   154: ifle -> 173
    //   157: aload_0
    //   158: dup
    //   159: getfield aW : J
    //   162: ldc2_w 1000
    //   165: ladd
    //   166: putfield aW : J
    //   169: iconst_0
    //   170: putstatic main/a.aU : I
    //   173: getstatic main/a.aU : I
    //   176: iconst_1
    //   177: iadd
    //   178: putstatic main/a.aU : I
    //   181: getstatic main/a.U : Lel;
    //   184: invokevirtual size : ()I
    //   187: ifle -> 231
    //   190: getstatic main/a.aY : Ljava/lang/String;
    //   193: ifnonnull -> 231
    //   196: getstatic main/a.U : Lel;
    //   199: iconst_0
    //   200: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   203: checkcast java/lang/String
    //   206: dup
    //   207: astore_1
    //   208: putstatic main/a.aY : Ljava/lang/String;
    //   211: getstatic main/a.A : I
    //   214: bipush #60
    //   216: isub
    //   217: putstatic main/a.aZ : I
    //   220: iconst_m1
    //   221: putstatic main/a.ax : I
    //   224: getstatic main/a.U : Lel;
    //   227: iconst_0
    //   228: invokevirtual removeElementAt : (I)V
    //   231: getstatic main/a.w : I
    //   234: iconst_5
    //   235: irem
    //   236: ifne -> 245
    //   239: invokestatic d : ()J
    //   242: putstatic main/a.b : J
    //   245: invokestatic d : ()J
    //   248: aload_0
    //   249: getfield aX : J
    //   252: lcmp
    //   253: ifle -> 272
    //   256: aload_0
    //   257: dup
    //   258: getfield aX : J
    //   261: ldc2_w 1000
    //   264: ladd
    //   265: putfield aX : J
    //   268: iconst_0
    //   269: putstatic main/a.aV : I
    //   272: getstatic main/a.aV : I
    //   275: iconst_1
    //   276: iadd
    //   277: putstatic main/a.aV : I
    //   280: getstatic main/a.av : Lel;
    //   283: invokevirtual removeAllElements : ()V
    //   286: invokestatic currentTimeMillis : ()J
    //   289: lstore_1
    //   290: getstatic p.bP : Z
    //   293: ifeq -> 299
    //   296: invokestatic b : ()V
    //   299: lload_1
    //   300: getstatic main/a.ar : J
    //   303: lsub
    //   304: ldc2_w 780
    //   307: lcmp
    //   308: iflt -> 328
    //   311: getstatic main/a.y : Z
    //   314: ifne -> 328
    //   317: lload_1
    //   318: putstatic main/a.ar : J
    //   321: iconst_1
    //   322: putstatic main/a.y : Z
    //   325: goto -> 332
    //   328: iconst_0
    //   329: putstatic main/a.y : Z
    //   332: lload_1
    //   333: getstatic main/a.as : J
    //   336: lsub
    //   337: ldc2_w 7800
    //   340: lcmp
    //   341: iflt -> 361
    //   344: getstatic main/a.z : Z
    //   347: ifne -> 361
    //   350: lload_1
    //   351: putstatic main/a.as : J
    //   354: iconst_1
    //   355: putstatic main/a.z : Z
    //   358: goto -> 365
    //   361: iconst_0
    //   362: putstatic main/a.z : Z
    //   365: getstatic main/a.x : I
    //   368: ifle -> 379
    //   371: getstatic main/a.x : I
    //   374: iconst_1
    //   375: isub
    //   376: putstatic main/a.x : I
    //   379: getstatic main/a.w : I
    //   382: iconst_1
    //   383: iadd
    //   384: dup
    //   385: putstatic main/a.w : I
    //   388: sipush #10000
    //   391: if_icmple -> 427
    //   394: invokestatic currentTimeMillis : ()J
    //   397: getstatic main/a.aT : J
    //   400: lsub
    //   401: ldc2_w 20000
    //   404: lcmp
    //   405: ifle -> 423
    //   408: getstatic main/a.E : Lbb;
    //   411: getstatic main/a.I : Lx;
    //   414: if_acmpne -> 423
    //   417: getstatic main/GameMidlet.f : Lmain/GameMidlet;
    //   420: invokevirtual a : ()V
    //   423: iconst_0
    //   424: putstatic main/a.w : I
    //   427: getstatic main/a.E : Lbb;
    //   430: ifnull -> 2412
    //   433: getstatic ae.n : Lae;
    //   436: ifnull -> 454
    //   439: getstatic ae.n : Lae;
    //   442: invokevirtual a : ()V
    //   445: getstatic ae.n : Lae;
    //   448: invokevirtual b : ()V
    //   451: goto -> 861
    //   454: getstatic ae.m : Lae;
    //   457: ifnull -> 475
    //   460: getstatic ae.m : Lae;
    //   463: invokevirtual a : ()V
    //   466: getstatic ae.m : Lae;
    //   469: invokevirtual b : ()V
    //   472: goto -> 861
    //   475: getstatic main/a.K : Ln;
    //   478: ifnull -> 490
    //   481: getstatic main/a.K : Ln;
    //   484: invokevirtual a : ()V
    //   487: goto -> 861
    //   490: getstatic main/a.F : Laz;
    //   493: getfield a : Z
    //   496: ifeq -> 514
    //   499: getstatic main/a.F : Laz;
    //   502: invokevirtual b : ()V
    //   505: getstatic main/a.F : Laz;
    //   508: invokevirtual a : ()V
    //   511: goto -> 861
    //   514: getstatic main/a.G : Lg;
    //   517: getfield a : Z
    //   520: ifeq -> 861
    //   523: getstatic main/a.G : Lg;
    //   526: invokevirtual B : ()V
    //   529: getstatic main/a.G : Lg;
    //   532: getfield b : I
    //   535: iconst_0
    //   536: getstatic main/a.G : Lg;
    //   539: getfield d : I
    //   542: getstatic main/a.G : Lg;
    //   545: getfield e : I
    //   548: invokestatic b : (IIII)Z
    //   551: ifeq -> 558
    //   554: iconst_0
    //   555: putstatic main/a.W : Z
    //   558: getstatic main/a.H : Lg;
    //   561: ifnull -> 608
    //   564: getstatic main/a.H : Lg;
    //   567: getfield a : Z
    //   570: ifeq -> 608
    //   573: getstatic main/a.H : Lg;
    //   576: invokevirtual B : ()V
    //   579: getstatic main/a.H : Lg;
    //   582: getfield b : I
    //   585: iconst_0
    //   586: getstatic main/a.H : Lg;
    //   589: getfield d : I
    //   592: getstatic main/a.H : Lg;
    //   595: getfield e : I
    //   598: invokestatic b : (IIII)Z
    //   601: ifeq -> 608
    //   604: iconst_1
    //   605: putstatic main/a.W : Z
    //   608: getstatic main/a.H : Lg;
    //   611: ifnull -> 638
    //   614: getstatic main/a.W : Z
    //   617: ifeq -> 629
    //   620: getstatic main/a.H : Lg;
    //   623: invokevirtual u : ()V
    //   626: goto -> 644
    //   629: getstatic main/a.G : Lg;
    //   632: invokevirtual u : ()V
    //   635: goto -> 644
    //   638: getstatic main/a.G : Lg;
    //   641: invokevirtual u : ()V
    //   644: getstatic main/a.G : Lg;
    //   647: getfield o : Lcq;
    //   650: ifnull -> 674
    //   653: getstatic main/a.G : Lg;
    //   656: getfield o : Lcq;
    //   659: getfield b : Z
    //   662: ifeq -> 674
    //   665: getstatic main/a.G : Lg;
    //   668: invokevirtual t : ()V
    //   671: goto -> 802
    //   674: getstatic main/a.H : Lg;
    //   677: ifnull -> 710
    //   680: getstatic main/a.H : Lg;
    //   683: getfield o : Lcq;
    //   686: ifnull -> 710
    //   689: getstatic main/a.H : Lg;
    //   692: getfield o : Lcq;
    //   695: getfield b : Z
    //   698: ifeq -> 710
    //   701: getstatic main/a.H : Lg;
    //   704: invokevirtual t : ()V
    //   707: goto -> 802
    //   710: getstatic main/a.G : Lg;
    //   713: getfield b : I
    //   716: iconst_0
    //   717: getstatic main/a.G : Lg;
    //   720: getfield d : I
    //   723: getstatic main/a.G : Lg;
    //   726: getfield e : I
    //   729: invokestatic b : (IIII)Z
    //   732: ifeq -> 741
    //   735: getstatic main/a.H : Lg;
    //   738: ifnonnull -> 747
    //   741: getstatic main/a.H : Lg;
    //   744: ifnonnull -> 756
    //   747: getstatic main/a.G : Lg;
    //   750: invokevirtual u : ()V
    //   753: goto -> 802
    //   756: getstatic main/a.H : Lg;
    //   759: ifnull -> 802
    //   762: getstatic main/a.H : Lg;
    //   765: getfield a : Z
    //   768: ifeq -> 802
    //   771: getstatic main/a.H : Lg;
    //   774: getfield b : I
    //   777: iconst_0
    //   778: getstatic main/a.H : Lg;
    //   781: getfield d : I
    //   784: getstatic main/a.H : Lg;
    //   787: getfield e : I
    //   790: invokestatic b : (IIII)Z
    //   793: ifeq -> 802
    //   796: getstatic main/a.H : Lg;
    //   799: invokevirtual u : ()V
    //   802: getstatic main/a.G : Lg;
    //   805: getfield b : I
    //   808: getstatic main/a.G : Lg;
    //   811: getfield d : I
    //   814: iadd
    //   815: iconst_0
    //   816: getstatic main/a.A : I
    //   819: getstatic main/a.G : Lg;
    //   822: getfield d : I
    //   825: iconst_1
    //   826: ishl
    //   827: isub
    //   828: getstatic main/a.G : Lg;
    //   831: getfield e : I
    //   834: invokestatic b : (IIII)Z
    //   837: ifeq -> 861
    //   840: getstatic main/a.m : Z
    //   843: ifeq -> 861
    //   846: getstatic main/a.G : Lg;
    //   849: getfield az : Z
    //   852: ifeq -> 861
    //   855: getstatic main/a.G : Lg;
    //   858: invokevirtual A : ()V
    //   861: getstatic main/a.d : Z
    //   864: ifne -> 873
    //   867: getstatic main/a.E : Lbb;
    //   870: invokevirtual c : ()V
    //   873: getstatic main/a.G : Lg;
    //   876: getfield a : Z
    //   879: ifne -> 894
    //   882: getstatic ae.n : Lae;
    //   885: ifnonnull -> 894
    //   888: getstatic main/a.E : Lbb;
    //   891: invokevirtual d : ()V
    //   894: invokestatic e : ()Laf;
    //   897: getfield aD : Lai;
    //   900: ifnull -> 2084
    //   903: getstatic main/a.E : Lbb;
    //   906: getstatic p.c : Lp;
    //   909: if_acmpne -> 2084
    //   912: invokestatic e : ()Laf;
    //   915: getfield aD : Lai;
    //   918: getfield c : S
    //   921: istore_1
    //   922: invokestatic e : ()Laf;
    //   925: getfield aD : Lai;
    //   928: getfield a : I
    //   931: istore_2
    //   932: iconst_0
    //   933: putstatic v.j : Z
    //   936: iconst_0
    //   937: putstatic v.k : I
    //   940: iconst_0
    //   941: putstatic v.c : I
    //   944: iconst_1
    //   945: putstatic v.i : Z
    //   948: iconst_1
    //   949: putstatic v.m : Z
    //   952: getstatic main/a.F : Laz;
    //   955: getfield a : Z
    //   958: ifeq -> 969
    //   961: iload_1
    //   962: ifle -> 969
    //   965: iconst_0
    //   966: putstatic v.i : Z
    //   969: iload_1
    //   970: tableswitch default -> 1969, 0 -> 1000, 1 -> 1331, 2 -> 1412, 3 -> 1722
    //   1000: getstatic ae.m : Lae;
    //   1003: ifnonnull -> 1017
    //   1006: invokestatic e : ()Laf;
    //   1009: getfield H : I
    //   1012: bipush #14
    //   1014: if_icmpne -> 1037
    //   1017: getstatic main/a.A : I
    //   1020: iconst_2
    //   1021: idiv
    //   1022: putstatic v.a : I
    //   1025: getstatic main/a.B : I
    //   1028: bipush #15
    //   1030: isub
    //   1031: putstatic v.b : I
    //   1034: goto -> 2092
    //   1037: iload_2
    //   1038: ifne -> 1092
    //   1041: getstatic bv.t : Lel;
    //   1044: invokevirtual size : ()I
    //   1047: ifeq -> 1092
    //   1050: getstatic bv.t : Lel;
    //   1053: iconst_0
    //   1054: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1057: checkcast bw
    //   1060: getfield a : S
    //   1063: bipush #100
    //   1065: isub
    //   1066: putstatic v.a : I
    //   1069: getstatic bv.t : Lel;
    //   1072: iconst_0
    //   1073: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1076: checkcast bw
    //   1079: getfield b : S
    //   1082: bipush #40
    //   1084: iadd
    //   1085: putstatic v.b : I
    //   1088: iconst_1
    //   1089: putstatic v.j : Z
    //   1092: iload_2
    //   1093: iconst_1
    //   1094: if_icmpne -> 1101
    //   1097: iconst_0
    //   1098: invokestatic a : (I)V
    //   1101: iload_2
    //   1102: iconst_2
    //   1103: if_icmpne -> 1109
    //   1106: invokestatic a : ()V
    //   1109: iload_2
    //   1110: iconst_3
    //   1111: if_icmpne -> 1243
    //   1114: getstatic main/a.G : Lg;
    //   1117: getfield a : Z
    //   1120: ifne -> 1129
    //   1123: invokestatic a : ()V
    //   1126: goto -> 1243
    //   1129: getstatic main/a.G : Lg;
    //   1132: getfield B : I
    //   1135: ifne -> 1216
    //   1138: getstatic main/a.G : Lg;
    //   1141: getfield ai : Lae;
    //   1144: ifnonnull -> 1180
    //   1147: getstatic main/a.G : Lg;
    //   1150: getfield ae : I
    //   1153: getstatic main/a.G : Lg;
    //   1156: getfield ag : I
    //   1159: iconst_2
    //   1160: idiv
    //   1161: iadd
    //   1162: putstatic v.a : I
    //   1165: getstatic main/a.G : Lg;
    //   1168: getfield af : I
    //   1171: bipush #20
    //   1173: iadd
    //   1174: putstatic v.b : I
    //   1177: goto -> 1243
    //   1180: getstatic main/a.F : Laz;
    //   1183: getfield e : I
    //   1186: ifeq -> 1243
    //   1189: getstatic main/a.G : Lg;
    //   1192: getfield ae : I
    //   1195: bipush #25
    //   1197: iadd
    //   1198: putstatic v.a : I
    //   1201: getstatic main/a.G : Lg;
    //   1204: getfield af : I
    //   1207: bipush #60
    //   1209: iadd
    //   1210: putstatic v.b : I
    //   1213: goto -> 1243
    //   1216: getstatic main/a.G : Lg;
    //   1219: getfield B : I
    //   1222: iconst_1
    //   1223: if_icmpne -> 1243
    //   1226: getstatic main/a.G : Lg;
    //   1229: getfield C : I
    //   1232: bipush #10
    //   1234: iadd
    //   1235: putstatic v.a : I
    //   1238: bipush #65
    //   1240: putstatic v.b : I
    //   1243: iload_2
    //   1244: iconst_4
    //   1245: if_icmpne -> 1320
    //   1248: getstatic main/a.G : Lg;
    //   1251: getfield a : Z
    //   1254: ifeq -> 1288
    //   1257: getstatic main/a.G : Lg;
    //   1260: getfield aa : Lde;
    //   1263: getfield j : I
    //   1266: iconst_5
    //   1267: iadd
    //   1268: putstatic v.a : I
    //   1271: getstatic main/a.G : Lg;
    //   1274: getfield aa : Lde;
    //   1277: getfield k : I
    //   1280: iconst_5
    //   1281: iadd
    //   1282: putstatic v.b : I
    //   1285: goto -> 1320
    //   1288: getstatic main/a.F : Laz;
    //   1291: getfield a : Z
    //   1294: ifeq -> 1317
    //   1297: getstatic main/a.A : I
    //   1300: iconst_2
    //   1301: idiv
    //   1302: putstatic v.a : I
    //   1305: getstatic main/a.B : I
    //   1308: bipush #20
    //   1310: isub
    //   1311: putstatic v.b : I
    //   1314: goto -> 1320
    //   1317: invokestatic a : ()V
    //   1320: iload_2
    //   1321: iconst_5
    //   1322: if_icmpne -> 2092
    //   1325: invokestatic a : ()V
    //   1328: goto -> 2092
    //   1331: getstatic ae.m : Lae;
    //   1334: ifnonnull -> 1348
    //   1337: invokestatic e : ()Laf;
    //   1340: getfield H : I
    //   1343: bipush #14
    //   1345: if_icmpne -> 1368
    //   1348: getstatic main/a.A : I
    //   1351: iconst_2
    //   1352: idiv
    //   1353: putstatic v.a : I
    //   1356: getstatic main/a.B : I
    //   1359: bipush #15
    //   1361: isub
    //   1362: putstatic v.b : I
    //   1365: goto -> 2092
    //   1368: iload_2
    //   1369: ifne -> 1388
    //   1372: invokestatic d : ()Z
    //   1375: ifeq -> 1385
    //   1378: iconst_0
    //   1379: invokestatic a : (I)V
    //   1382: goto -> 1388
    //   1385: invokestatic b : ()V
    //   1388: iload_2
    //   1389: iconst_1
    //   1390: if_icmpne -> 2092
    //   1393: invokestatic d : ()Z
    //   1396: ifne -> 1406
    //   1399: iconst_1
    //   1400: invokestatic a : (I)V
    //   1403: goto -> 2092
    //   1406: invokestatic a : ()V
    //   1409: goto -> 2092
    //   1412: getstatic ae.m : Lae;
    //   1415: ifnonnull -> 1429
    //   1418: invokestatic e : ()Laf;
    //   1421: getfield H : I
    //   1424: bipush #14
    //   1426: if_icmpne -> 1449
    //   1429: getstatic main/a.A : I
    //   1432: iconst_2
    //   1433: idiv
    //   1434: putstatic v.a : I
    //   1437: getstatic main/a.B : I
    //   1440: bipush #15
    //   1442: isub
    //   1443: putstatic v.b : I
    //   1446: goto -> 2092
    //   1449: iload_2
    //   1450: ifne -> 1714
    //   1453: invokestatic d : ()Z
    //   1456: ifne -> 1463
    //   1459: iconst_1
    //   1460: putstatic v.f : Z
    //   1463: getstatic main/a.G : Lg;
    //   1466: getfield a : Z
    //   1469: ifne -> 1550
    //   1472: getstatic v.f : Z
    //   1475: ifne -> 1512
    //   1478: invokestatic j : ()Lp;
    //   1481: getfield aR : Lde;
    //   1484: getfield j : I
    //   1487: putstatic v.a : I
    //   1490: invokestatic j : ()Lp;
    //   1493: getfield aR : Lde;
    //   1496: getfield k : I
    //   1499: bipush #13
    //   1501: iadd
    //   1502: putstatic v.b : I
    //   1505: iconst_1
    //   1506: putstatic v.k : I
    //   1509: goto -> 1682
    //   1512: invokestatic w : ()I
    //   1515: getstatic bv.l : I
    //   1518: if_icmpne -> 1533
    //   1521: invokestatic c : ()Z
    //   1524: ifne -> 1537
    //   1527: invokestatic b : ()V
    //   1530: goto -> 1537
    //   1533: iconst_0
    //   1534: invokestatic a : (I)V
    //   1537: getstatic v.f : Z
    //   1540: ifeq -> 1682
    //   1543: iconst_1
    //   1544: putstatic v.g : Z
    //   1547: goto -> 1682
    //   1550: getstatic v.f : Z
    //   1553: ifne -> 1641
    //   1556: getstatic main/a.G : Lg;
    //   1559: getfield B : I
    //   1562: ifne -> 1621
    //   1565: getstatic main/a.B : I
    //   1568: sipush #300
    //   1571: if_icmple -> 1579
    //   1574: bipush #15
    //   1576: goto -> 1581
    //   1579: bipush #10
    //   1581: istore_1
    //   1582: getstatic main/a.G : Lg;
    //   1585: getfield ae : I
    //   1588: getstatic main/a.G : Lg;
    //   1591: getfield ag : I
    //   1594: iconst_2
    //   1595: idiv
    //   1596: iadd
    //   1597: putstatic v.a : I
    //   1600: getstatic main/a.G : Lg;
    //   1603: getfield af : I
    //   1606: getstatic main/a.G : Lg;
    //   1609: getfield ah : I
    //   1612: iadd
    //   1613: iload_1
    //   1614: isub
    //   1615: putstatic v.b : I
    //   1618: goto -> 1682
    //   1621: getstatic main/a.G : Lg;
    //   1624: getfield C : I
    //   1627: bipush #10
    //   1629: iadd
    //   1630: putstatic v.a : I
    //   1633: bipush #65
    //   1635: putstatic v.b : I
    //   1638: goto -> 1682
    //   1641: getstatic v.g : Z
    //   1644: ifne -> 1678
    //   1647: getstatic main/a.G : Lg;
    //   1650: getfield aa : Lde;
    //   1653: getfield j : I
    //   1656: iconst_5
    //   1657: iadd
    //   1658: putstatic v.a : I
    //   1661: getstatic main/a.G : Lg;
    //   1664: getfield aa : Lde;
    //   1667: getfield k : I
    //   1670: iconst_5
    //   1671: iadd
    //   1672: putstatic v.b : I
    //   1675: goto -> 1682
    //   1678: iconst_0
    //   1679: putstatic v.i : Z
    //   1682: invokestatic e : ()Laf;
    //   1685: getfield T : J
    //   1688: lconst_0
    //   1689: lcmp
    //   1690: ifgt -> 1714
    //   1693: getstatic p.bx : I
    //   1696: iconst_5
    //   1697: iadd
    //   1698: putstatic v.a : I
    //   1701: getstatic p.by : I
    //   1704: bipush #13
    //   1706: iadd
    //   1707: putstatic v.b : I
    //   1710: iconst_0
    //   1711: putstatic v.j : Z
    //   1714: iload_2
    //   1715: iconst_1
    //   1716: if_icmpne -> 2092
    //   1719: goto -> 2084
    //   1722: getstatic ae.m : Lae;
    //   1725: ifnonnull -> 1739
    //   1728: invokestatic e : ()Laf;
    //   1731: getfield H : I
    //   1734: bipush #14
    //   1736: if_icmpne -> 1759
    //   1739: getstatic main/a.A : I
    //   1742: iconst_2
    //   1743: idiv
    //   1744: putstatic v.a : I
    //   1747: getstatic main/a.B : I
    //   1750: bipush #15
    //   1752: isub
    //   1753: putstatic v.b : I
    //   1756: goto -> 2092
    //   1759: iload_2
    //   1760: ifne -> 1958
    //   1763: getstatic main/a.G : Lg;
    //   1766: getfield a : Z
    //   1769: ifne -> 1850
    //   1772: getstatic v.h : Z
    //   1775: ifne -> 1812
    //   1778: invokestatic j : ()Lp;
    //   1781: getfield aR : Lde;
    //   1784: getfield j : I
    //   1787: putstatic v.a : I
    //   1790: invokestatic j : ()Lp;
    //   1793: getfield aR : Lde;
    //   1796: getfield k : I
    //   1799: bipush #13
    //   1801: iadd
    //   1802: putstatic v.b : I
    //   1805: iconst_1
    //   1806: putstatic v.k : I
    //   1809: goto -> 1923
    //   1812: invokestatic w : ()I
    //   1815: getstatic bv.l : I
    //   1818: if_icmpne -> 1833
    //   1821: invokestatic c : ()Z
    //   1824: ifne -> 1837
    //   1827: invokestatic b : ()V
    //   1830: goto -> 1837
    //   1833: iconst_0
    //   1834: invokestatic a : (I)V
    //   1837: getstatic v.f : Z
    //   1840: ifeq -> 1923
    //   1843: iconst_1
    //   1844: putstatic v.g : Z
    //   1847: goto -> 1923
    //   1850: getstatic v.h : Z
    //   1853: ifne -> 1882
    //   1856: getstatic main/a.G : Lg;
    //   1859: getfield ae : I
    //   1862: bipush #10
    //   1864: iadd
    //   1865: bipush #108
    //   1867: iadd
    //   1868: bipush #18
    //   1870: isub
    //   1871: putstatic v.a : I
    //   1874: bipush #65
    //   1876: putstatic v.b : I
    //   1879: goto -> 1923
    //   1882: getstatic v.g : Z
    //   1885: ifne -> 1919
    //   1888: getstatic main/a.G : Lg;
    //   1891: getfield aa : Lde;
    //   1894: getfield j : I
    //   1897: iconst_5
    //   1898: iadd
    //   1899: putstatic v.a : I
    //   1902: getstatic main/a.G : Lg;
    //   1905: getfield aa : Lde;
    //   1908: getfield k : I
    //   1911: iconst_5
    //   1912: iadd
    //   1913: putstatic v.b : I
    //   1916: goto -> 1923
    //   1919: iconst_0
    //   1920: putstatic v.i : Z
    //   1923: invokestatic e : ()Laf;
    //   1926: getfield T : J
    //   1929: lconst_0
    //   1930: lcmp
    //   1931: ifgt -> 2092
    //   1934: getstatic p.bx : I
    //   1937: iconst_5
    //   1938: iadd
    //   1939: putstatic v.a : I
    //   1942: getstatic p.by : I
    //   1945: bipush #13
    //   1947: iadd
    //   1948: putstatic v.b : I
    //   1951: iconst_0
    //   1952: putstatic v.j : Z
    //   1955: goto -> 2092
    //   1958: iconst_0
    //   1959: putstatic v.i : Z
    //   1962: iconst_0
    //   1963: putstatic v.m : Z
    //   1966: goto -> 2092
    //   1969: invokestatic e : ()Laf;
    //   1972: getfield aD : Lai;
    //   1975: getfield c : S
    //   1978: bipush #9
    //   1980: if_icmpne -> 2073
    //   1983: invokestatic e : ()Laf;
    //   1986: getfield aD : Lai;
    //   1989: getfield a : I
    //   1992: iconst_2
    //   1993: if_icmpne -> 2073
    //   1996: iconst_0
    //   1997: istore_1
    //   1998: goto -> 2063
    //   2001: getstatic bo.a : Lel;
    //   2004: iload_1
    //   2005: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   2008: checkcast bo
    //   2011: dup
    //   2012: astore_2
    //   2013: getfield e : I
    //   2016: bipush #24
    //   2018: if_icmpgt -> 2060
    //   2021: aload_2
    //   2022: getfield d : I
    //   2025: aload_2
    //   2026: getfield b : I
    //   2029: iconst_2
    //   2030: idiv
    //   2031: iadd
    //   2032: putstatic v.a : I
    //   2035: aload_2
    //   2036: getfield e : I
    //   2039: bipush #30
    //   2041: iadd
    //   2042: putstatic v.b : I
    //   2045: iconst_1
    //   2046: putstatic v.j : Z
    //   2049: iconst_0
    //   2050: putstatic v.i : Z
    //   2053: iconst_1
    //   2054: putstatic v.m : Z
    //   2057: goto -> 2092
    //   2060: iinc #1, 1
    //   2063: iload_1
    //   2064: getstatic bo.a : Lel;
    //   2067: invokevirtual size : ()I
    //   2070: if_icmplt -> 2001
    //   2073: iconst_0
    //   2074: putstatic v.i : Z
    //   2077: iconst_0
    //   2078: putstatic v.m : Z
    //   2081: goto -> 2092
    //   2084: iconst_0
    //   2085: putstatic v.i : Z
    //   2088: iconst_0
    //   2089: putstatic v.m : Z
    //   2092: getstatic v.k : I
    //   2095: ifne -> 2102
    //   2098: iconst_2
    //   2099: goto -> 2104
    //   2102: bipush #-2
    //   2104: istore_1
    //   2105: getstatic v.e : Z
    //   2108: ifne -> 2140
    //   2111: iconst_0
    //   2112: putstatic v.l : Z
    //   2115: getstatic v.d : I
    //   2118: iconst_1
    //   2119: iadd
    //   2120: dup
    //   2121: putstatic v.d : I
    //   2124: bipush #50
    //   2126: if_icmpne -> 2408
    //   2129: iconst_0
    //   2130: putstatic v.d : I
    //   2133: iconst_1
    //   2134: putstatic v.e : Z
    //   2137: goto -> 2408
    //   2140: getstatic v.d : I
    //   2143: iconst_1
    //   2144: iadd
    //   2145: putstatic v.d : I
    //   2148: getstatic v.c : I
    //   2151: ifne -> 2231
    //   2154: getstatic v.d : I
    //   2157: iconst_2
    //   2158: if_icmpne -> 2183
    //   2161: getstatic v.a : I
    //   2164: iload_1
    //   2165: iconst_2
    //   2166: imul
    //   2167: iadd
    //   2168: putstatic v.a : I
    //   2171: getstatic v.b : I
    //   2174: iconst_4
    //   2175: isub
    //   2176: putstatic v.b : I
    //   2179: iconst_1
    //   2180: putstatic v.l : Z
    //   2183: getstatic v.d : I
    //   2186: iconst_4
    //   2187: if_icmpne -> 2220
    //   2190: getstatic v.a : I
    //   2193: iload_1
    //   2194: iconst_2
    //   2195: imul
    //   2196: isub
    //   2197: putstatic v.a : I
    //   2200: getstatic v.b : I
    //   2203: iconst_4
    //   2204: iadd
    //   2205: putstatic v.b : I
    //   2208: iconst_0
    //   2209: putstatic v.e : Z
    //   2212: iconst_0
    //   2213: putstatic v.l : Z
    //   2216: iconst_0
    //   2217: putstatic v.d : I
    //   2220: getstatic v.d : I
    //   2223: iconst_4
    //   2224: if_icmple -> 2231
    //   2227: iconst_0
    //   2228: putstatic v.e : Z
    //   2231: getstatic v.c : I
    //   2234: iconst_1
    //   2235: if_icmpne -> 2408
    //   2238: getstatic v.d : I
    //   2241: iconst_2
    //   2242: if_icmpne -> 2293
    //   2245: getstatic main/a.e : Z
    //   2248: ifeq -> 2271
    //   2251: getstatic aw.cH : Ljava/lang/String;
    //   2254: getstatic v.a : I
    //   2257: getstatic v.b : I
    //   2260: bipush #10
    //   2262: iadd
    //   2263: iconst_0
    //   2264: bipush #20
    //   2266: bipush #7
    //   2268: invokestatic a : (Ljava/lang/String;IIIII)V
    //   2271: iconst_1
    //   2272: putstatic v.l : Z
    //   2275: getstatic v.a : I
    //   2278: iload_1
    //   2279: iconst_2
    //   2280: imul
    //   2281: iadd
    //   2282: putstatic v.a : I
    //   2285: getstatic v.b : I
    //   2288: iconst_4
    //   2289: isub
    //   2290: putstatic v.b : I
    //   2293: getstatic v.d : I
    //   2296: iconst_4
    //   2297: if_icmpne -> 2320
    //   2300: iconst_0
    //   2301: putstatic v.l : Z
    //   2304: getstatic v.a : I
    //   2307: iload_1
    //   2308: isub
    //   2309: putstatic v.a : I
    //   2312: getstatic v.b : I
    //   2315: iconst_2
    //   2316: iadd
    //   2317: putstatic v.b : I
    //   2320: getstatic v.d : I
    //   2323: bipush #6
    //   2325: if_icmpne -> 2348
    //   2328: iconst_1
    //   2329: putstatic v.l : Z
    //   2332: getstatic v.a : I
    //   2335: iload_1
    //   2336: iadd
    //   2337: putstatic v.a : I
    //   2340: getstatic v.b : I
    //   2343: iconst_2
    //   2344: isub
    //   2345: putstatic v.b : I
    //   2348: getstatic v.d : I
    //   2351: bipush #8
    //   2353: if_icmpne -> 2376
    //   2356: iconst_0
    //   2357: putstatic v.l : Z
    //   2360: getstatic v.a : I
    //   2363: iload_1
    //   2364: isub
    //   2365: putstatic v.a : I
    //   2368: getstatic v.b : I
    //   2371: iconst_2
    //   2372: iadd
    //   2373: putstatic v.b : I
    //   2376: getstatic v.d : I
    //   2379: bipush #10
    //   2381: if_icmpne -> 2408
    //   2384: getstatic v.a : I
    //   2387: iload_1
    //   2388: isub
    //   2389: putstatic v.a : I
    //   2392: getstatic v.b : I
    //   2395: iconst_2
    //   2396: iadd
    //   2397: putstatic v.b : I
    //   2400: iconst_0
    //   2401: putstatic v.e : Z
    //   2404: iconst_0
    //   2405: putstatic v.d : I
    //   2408: invokestatic a : ()Lbu;
    //   2411: pop
    //   2412: invokestatic currentTimeMillis : ()J
    //   2415: pop2
    //   2416: invokestatic b : ()V
    //   2419: aload_0
    //   2420: getfield bj : Z
    //   2423: ifeq -> 2434
    //   2426: aload_0
    //   2427: iconst_0
    //   2428: putfield bj : Z
    //   2431: invokestatic e : ()V
    //   2434: getstatic main/a.E : Lbb;
    //   2437: ifnull -> 2507
    //   2440: getstatic main/a.E : Lbb;
    //   2443: instanceof p
    //   2446: ifeq -> 2507
    //   2449: getstatic main/a.aZ : I
    //   2452: getstatic main/a.ax : I
    //   2455: iconst_1
    //   2456: ishl
    //   2457: iadd
    //   2458: dup
    //   2459: putstatic main/a.aZ : I
    //   2462: getstatic g.v : Ljavax/microedition/lcdui/Image;
    //   2465: invokevirtual getWidth : ()I
    //   2468: isub
    //   2469: bipush #60
    //   2471: if_icmpgt -> 2507
    //   2474: iconst_0
    //   2475: putstatic main/a.ax : I
    //   2478: aload_0
    //   2479: dup
    //   2480: getfield ay : I
    //   2483: iconst_1
    //   2484: iadd
    //   2485: putfield ay : I
    //   2488: aload_0
    //   2489: getfield ay : I
    //   2492: sipush #150
    //   2495: if_icmple -> 2507
    //   2498: aload_0
    //   2499: iconst_0
    //   2500: putfield ay : I
    //   2503: aconst_null
    //   2504: putstatic main/a.aY : Ljava/lang/String;
    //   2507: getstatic main/a.E : Lbb;
    //   2510: ifnull -> 2549
    //   2513: getstatic main/a.E : Lbb;
    //   2516: invokestatic j : ()Lp;
    //   2519: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2522: ifeq -> 2549
    //   2525: getstatic p.aD : Leo;
    //   2528: ifnull -> 2537
    //   2531: getstatic p.aD : Leo;
    //   2534: invokevirtual a : ()V
    //   2537: getstatic p.aE : Leo;
    //   2540: ifnull -> 2549
    //   2543: getstatic p.aE : Leo;
    //   2546: invokevirtual a : ()V
    //   2549: iconst_0
    //   2550: putstatic main/a.o : Z
    //   2553: return
  }
  
  public static void e() {
    try {
      af.bI = false;
      af.bG = false;
      bu.a();
      x.c = false;
      bv.q = bv.p = 0;
      af.g();
      p.k();
      p.g();
      bp.c();
      eo eo;
      (eo = p.aD).b.a();
      (eo = p.aE).b.a();
      p.aE.i = null;
      ae.m = null;
      ac.b = false;
      p.a(-1, -1);
      p.bv.removeAllElements();
      p.j = 100;
      G.B = 0;
      G.ak = e ? -1 : 0;
      G.a();
      H = null;
      p.bt = true;
      cb.l.removeAllElements();
      p.A.removeAllElements();
      p.B.removeAllElements();
      p.C.removeAllElements();
      bv.v.removeAllElements();
      ed.a.removeAllElements();
      ei.a.removeAllElements();
      ea.m.removeAllElements();
      F.a = false;
      G.a = false;
      G.k.removeAllElements();
      if (G.j != null)
        G.j.k = false; 
      br.a().e();
      br.b().e();
    } catch (Exception exception) {}
    bs.v = true;
    bs.t = -1;
    bs.u = true;
    if (bs.n == -1) {
      al.b();
      return;
    } 
    if (ak == null)
      ak = new bs(); 
    ak.b();
  }
  
  private static void a(en paramen, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    paramen.a(paramInt1);
    if ((paramInt1 = p.k) > B)
      paramInt1 = B; 
    paramen.d(0, paramInt3 - ((paramInt6 != 0) ? (paramInt1 >> paramInt6) : 0), paramInt4, paramInt5 + ((paramInt6 != 0) ? (paramInt1 >> paramInt6) : 0));
  }
  
  private static void a(en paramen, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    try {
      int i;
      if ((i = paramInt1 - 1) == N.length - 1 && ((p.j()).bb || (p.j()).bR)) {
        paramen.a((p.j()).be);
        paramen.d(0, 0, A, B);
        if (ad == 2 || ad == 4 || ad == 7) {
          d(paramen);
          e(paramen);
        } 
        if ((p.j()).bR && !a)
          du.a(paramen); 
        return;
      } 
      if (N != null && N[i] != null) {
        if (aI[i] != 0)
          aI[i] = aI[i] + aJ[i]; 
        int j;
        if ((j = p.k) > B)
          j = B; 
        if (aH[i] != 0) {
          for (int m = -((p.j + aI[i] >> aH[i]) % P[i]); m < p.d; m += P[i])
            paramen.a(N[i], m, aM[i] - ((paramInt2 > 0) ? (j >> paramInt2) : 0), 0); 
        } else {
          for (int m = 0; m < p.d; m += P[i])
            paramen.a(N[i], m, aM[i] - ((paramInt2 > 0) ? (j >> paramInt2) : 0), 0); 
        } 
        if (paramInt3 != -1)
          if (i == aO - 1) {
            a(paramen, paramInt3, 0, -(j >> paramInt2), p.d, aM[i], paramInt2);
          } else {
            a(paramen, paramInt3, 0, aM[i - 1] + Q[i - 1], p.d, aM[i] - aM[i - 1] + Q[i - 1], paramInt2);
          }  
        if (paramInt4 != -1)
          if (i == 0) {
            a(paramen, paramInt4, 0, aM[i] + Q[i], p.d, p.e - aM[i] + Q[i], paramInt2);
          } else {
            a(paramen, paramInt4, 0, aM[i] + Q[i], p.d, aM[i - 1] - aM[i] + Q[i] + 80, paramInt2);
          }  
        if (E == p.c) {
          if (paramInt1 == 1 && ad == 11 && bv.p == 0)
            paramen.a(aB, -(p.j >> aH[0]) + 400, aM[0] + 30 - (j >> 2), cj.c); 
          if (paramInt1 == 1 && ad == 13) {
            paramen.a(N[1], -(p.j >> aH[0]) + bv.a * 24 / 4, aM[0] - (j >> 3) + 30, 0);
            paramen.a(N[1], 0, 0, P[1], Q[1], 2, -(p.j >> aH[0]) + bv.a * 24 / 4 + P[1], aM[0] - (j >> 3) + 30, 0);
          } 
          if (paramInt1 == 3 && bv.l == 1)
            for (byte b1 = 0; b1 < bv.d / en.b(aQ); b1++)
              paramen.a(aQ, -(p.j >> aH[2]) + 300, b1 * en.b(aQ) - (j >> 3), 0);  
        } 
        int k = -(p.j + aI[i] >> aH[i]);
        ei.a(paramen, k, aM[i] + Q[i] - (j >> paramInt2), i);
        return;
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
  }
  
  private static void d(en paramen) {
    if (aA != null)
      paramen.a(aA, aD, aE, 0); 
    if (ac) {
      if (w % 200 == 0)
        aK = true; 
      if (aK) {
        if (++aL == 10) {
          aL = 0;
          aK = false;
        } 
        if (aL % 2 == 0) {
          paramen.a(16777215);
          paramen.d(0, 0, A, B);
        } 
      } 
    } 
  }
  
  private static void e(en paramen) {
    if (aB != null)
      paramen.a(aB, aF, aG, 0); 
  }
  
  public static void c(en paramen) {
    if (!aS) {
      paramen.a(0);
      paramen.d(0, 0, A, B);
    } 
    if (af.bI)
      return; 
    int i = p.d;
    paramen.a(-paramen.a(), -paramen.b());
    paramen.a(0);
    paramen.d(0, 0, A, B);
    try {
      if (az && !a) {
        if (E == p.j()) {
          if (bv.l != 172 && (bv.l == 137 || bv.l == 115 || bv.l == 117 || bv.l == 118 || bv.l == 120 || bv.j)) {
            paramen.a(0);
            paramen.d(0, 0, A, B);
            return;
          } 
          if (bv.l == 138) {
            paramen.a(6776679);
            paramen.d(0, 0, A, B);
            return;
          } 
        } 
        if (ad == 0) {
          a(paramen, 4, 6, af[3], aN[3]);
          a(paramen, 3, 4, -1, aN[2]);
          a(paramen, 2, 3, -1, aN[1]);
          a(paramen, 1, 2, -1, aN[0]);
          return;
        } 
        if (ad == 1) {
          a(paramen, 4, 6, -1, -1);
          a(paramen, 3, 3, -1, -1);
          a(paramen, af[2], 0, -(p.k >> 5), i, aM[2], 5);
          a(paramen, aN[2], 0, aM[2] + Q[2] - (p.k >> 3), i, 70, 3);
          a(paramen, 2, 2, -1, -1);
          a(paramen, 1, 1, -1, aN[0]);
          return;
        } 
        if (ad == 2) {
          a(paramen, 5, 10, af[4], aN[4]);
          a(paramen, 4, 8, -1, af[2]);
          a(paramen, 3, 5, -1, aN[2]);
          a(paramen, 2, 2, -1, aN[1]);
          a(paramen, 1, 1, -1, aN[0]);
          return;
        } 
        if (ad == 3) {
          int j = p.k - 325 - p.g;
          paramen.a(0, -j);
          a(paramen, ((p.j()).bb || (p.j()).bR) ? (p.j()).be : af[2], 0, j - (p.k >> 3), i, aM[2] - j + (p.k >> 3) + 100, 2);
          a(paramen, 3, 2, -1, aN[2]);
          a(paramen, 2, 0, -1, -1);
          a(paramen, 1, 0, -1, aN[0]);
          paramen.a(0, -paramen.b());
          return;
        } 
        if (ad == 4) {
          a(paramen, 4, 7, af[3], -1);
          a(paramen, 3, 3, -1, ((en.b > 1)) ? aN[2] : af[1]);
          a(paramen, 2, 2, af[1], aN[1]);
          a(paramen, 1, 1, -1, aN[0]);
          return;
        } 
        if (ad == 5) {
          a(paramen, 4, 15, af[3], -1);
          d(paramen);
          paramen.a(100, 10);
          d(paramen);
          paramen.a(-100, -10);
          e(paramen);
          a(paramen, 3, 10, -1, -1);
          a(paramen, 2, 6, -1, -1);
          a(paramen, 1, 4, -1, -1);
          paramen.a(0, 27);
          a(paramen, 1, 2, -1, -1);
          paramen.a(0, 20);
          a(paramen, 1, 2, -1, aN[0]);
          paramen.a(-paramen.a(), -paramen.b());
          return;
        } 
        if (ad == 6) {
          a(paramen, 5, 10, af[4], aN[4]);
          d(paramen);
          e(paramen);
          paramen.a(60, 40);
          e(paramen);
          paramen.a(-60, -40);
          a(paramen, 4, 7, -1, aN[3]);
          ed.e(paramen);
          a(paramen, 3, 4, -1, -1);
          a(paramen, 2, 3, -1, aN[1]);
          a(paramen, 1, 2, -1, aN[0]);
          return;
        } 
        if (ad == 7) {
          a(paramen, 4, 6, af[3], aN[3]);
          a(paramen, 3, 5, -1, -1);
          a(paramen, 2, 4, -1, -1);
          a(paramen, 1, 3, -1, aN[0]);
          return;
        } 
        if (ad == 8) {
          a(paramen, 4, 8, af[3], aN[3]);
          d(paramen);
          e(paramen);
          a(paramen, 3, 4, -1, aN[2]);
          a(paramen, 2, 2, -1, aN[1]);
          if (((bv.l < 92 || bv.l > 96) && bv.l != 51 && bv.l != 52) || E == I) {
            a(paramen, 1, 1, -1, aN[0]);
            return;
          } 
        } else {
          if (ad == 9) {
            a(paramen, 4, 8, af[3], aN[3]);
            d(paramen);
            e(paramen);
            paramen.a(-80, 20);
            e(paramen);
            paramen.a(80, -20);
            ed.e(paramen);
            a(paramen, 3, 5, -1, -1);
            a(paramen, 2, 3, -1, -1);
            a(paramen, 1, 2, -1, aN[0]);
            return;
          } 
          if (ad == 10) {
            int j = p.k - 380 - p.g;
            paramen.a(0, -j);
            a(paramen, (p.j()).bb ? (p.j()).be : af[1], 0, j - (p.k >> 2), i, aM[1] - j + (p.k >> 2) + 100, 2);
            a(paramen, 2, 2, -1, aN[1]);
            d(paramen);
            e(paramen);
            a(paramen, 1, 0, -1, -1);
            paramen.a(0, -paramen.b());
            return;
          } 
          if (ad == 11) {
            a(paramen, 3, 6, af[2], aN[2]);
            d(paramen);
            a(paramen, 2, 3, -1, aN[1]);
            a(paramen, 1, 2, -1, aN[0]);
            return;
          } 
          if (ad == 12) {
            paramen.a(9161471);
            paramen.d(0, 0, A, B);
            a(paramen, 3, 4, -1, 14417919);
            a(paramen, 2, 3, -1, 14417919);
            a(paramen, 1, 2, -1, 14417919);
            return;
          } 
          if (ad == 13) {
            paramen.a(15268088);
            paramen.d(0, 0, A, B);
            a(paramen, 1, 5, -1, 15268088);
            return;
          } 
          if (ad == 15) {
            paramen.a(2631752);
            paramen.d(0, 0, A, B);
            a(paramen, 2, 3, -1, aN[1]);
            a(paramen, 1, 2, -1, aN[0]);
            return;
          } 
          if (ad == 16) {
            a(paramen, 4, 6, af[3], aN[3]);
            for (byte b1 = 0; b1 < aC.length; b1++)
              paramen.a(aC[b1], aa[b1], ab[b1], 33); 
            a(paramen, 3, 4, -1, aN[2]);
            a(paramen, 2, 3, -1, aN[1]);
            a(paramen, 1, 2, -1, aN[0]);
            return;
          } 
          if (ad == 19) {
            a(paramen, 5, 10, af[4], aN[4]);
            a(paramen, 4, 8, -1, af[2]);
            a(paramen, 3, 5, -1, aN[2]);
            a(paramen, 2, 2, -1, aN[1]);
            a(paramen, 1, 1, -1, aN[0]);
            return;
          } 
          a(paramen, aN[3], 0, aM[3] + Q[3], p.d, aM[2] + Q[2], 6);
          a(paramen, 4, 6, af[3], aN[3]);
          d(paramen);
          a(paramen, 3, 4, -1, aN[2]);
          a(paramen, 2, 3, -1, aN[1]);
          a(paramen, 1, 2, -1, aN[0]);
          return;
        } 
      } else {
        paramen.a(2315859);
        paramen.d(0, 0, A, B);
        if (aR != null) {
          for (int j = -((p.j >> 2) % en.a(aR)); j < p.d; j += en.a(aR))
            paramen.a(aR, j, (p.k >> 3) + B / 2 - 50, 0); 
          paramen.a(5084791);
          paramen.d(0, (p.k >> 3) + B / 2 - 50 + en.b(aR), i, B);
          return;
        } 
      } 
    } catch (Exception exception) {
      paramen.a(0);
      paramen.d(0, 0, A, B);
    } 
  }
  
  private static void b(int paramInt) {
    try {
      int i = p.g;
      switch (paramInt) {
        case 0:
          aM[0] = i - Q[0] + 70;
          aM[1] = aM[0] - Q[1] + 20;
          aM[2] = aM[1] - Q[2] + 30;
          aM[3] = aM[2] - Q[3] + 50;
          return;
        case 1:
          aM[0] = i - Q[0] + 120;
          aM[1] = aM[0] - Q[1] + 40;
          aM[2] = aM[1] - 90;
          aM[3] = aM[2] - 25;
          return;
        case 2:
          aM[0] = i - Q[0] + 150;
          aM[1] = aM[0] - Q[1] - 60;
          aM[2] = aM[1] - Q[2] - 40;
          aM[3] = aM[2] - Q[3] - 10;
          aM[4] = aM[3] - Q[4];
          return;
        case 3:
          aM[0] = i - Q[0] + 10;
          aM[1] = aM[0] + 80;
          aM[2] = aM[1] - Q[2] - 10;
          return;
        case 4:
          aM[0] = i - Q[0] + 130;
          aM[1] = aM[0] - Q[1];
          aM[2] = aM[1] - Q[2] - 20;
          aM[3] = aM[1] - Q[2] - 80;
          return;
        case 5:
          aM[0] = i - Q[0] + 40;
          aM[1] = aM[0] - Q[1] + 10;
          aM[2] = aM[1] - Q[2] + 15;
          aM[3] = aM[2] - Q[3] + 50;
          return;
        case 6:
          aM[0] = i - Q[0] + 100;
          aM[1] = aM[0] - Q[1] - 30;
          aM[2] = aM[1] - Q[2] + 10;
          aM[3] = aM[2] - Q[3] + 15;
          aM[4] = aM[3] - Q[4] + 15;
          return;
        case 7:
          aM[0] = i - Q[0] + 20;
          aM[1] = aM[0] - Q[1] + 15;
          aM[2] = aM[1] - Q[2] + 20;
          aM[3] = aM[1] - Q[2] - 10;
          return;
        case 8:
          aM[0] = i - 103 + 150;
          if (bv.l == 103)
            aM[0] = aM[0] - 100; 
          aM[1] = aM[0] - Q[1] - 10;
          aM[2] = aM[1] - Q[2] + 40;
          aM[3] = aM[2] - Q[3] + 10;
          return;
        case 9:
          aM[0] = i - Q[0] + 100;
          aM[1] = aM[0] - Q[1] + 22;
          aM[2] = aM[1] - Q[2] + 50;
          aM[3] = aM[2] - Q[3];
          return;
        case 10:
          aM[0] = i - Q[0] - 45;
          aM[1] = aM[0] - Q[1] - 10;
          return;
        case 11:
          aM[0] = i - Q[0] + 60;
          aM[1] = aM[0] - Q[1] + 5;
          aM[2] = aM[1] - Q[2] - 15;
          return;
        case 12:
          aM[0] = i + 40;
          aM[1] = aM[0] - 40;
          aM[2] = aM[1] - 40;
          return;
        case 13:
          aM[0] = i - 80;
          aM[1] = aM[0];
          return;
        case 15:
          aM[0] = i - 20;
          aM[1] = aM[0] - 80;
          return;
        case 16:
          aM[0] = i - Q[0] + 75;
          aM[1] = aM[0] - Q[1] + 50;
          aM[2] = aM[1] - Q[2] + 50;
          aM[3] = aM[2] - Q[3] + 90;
          return;
        case 19:
          aM[0] = i - Q[0] + 150;
          aM[1] = aM[0] - Q[1] - 60;
          aM[2] = aM[1] - Q[2] - 40;
          aM[3] = aM[2] - Q[3] - 10;
          aM[4] = aM[3] - Q[4];
          return;
      } 
      aM[0] = i - Q[0] + 75;
      aM[1] = aM[0] - Q[1] + 50;
      aM[2] = aM[1] - Q[2] + 50;
      aM[3] = aM[2] - Q[3] + 90;
      return;
    } catch (Exception exception) {
      for (paramInt = 0; paramInt < aM.length; paramInt++)
        aM[paramInt] = 1; 
      return;
    } 
  }
  
  public static void a(int paramInt) {
    try {
      aS = true;
      if (ad == 12) {
        ed.f = bv.d - 100;
      } else {
        ed.f = bv.d - 160;
      } 
      ds.c("load bg id= " + paramInt + "map ID= " + bv.l);
      ed.a();
      c(paramInt);
      if ((bv.m == paramInt && bv.q == bv.p) || paramInt == -1)
        return; 
      ae = 12;
      bv.m = (byte)paramInt;
      bv.q = (byte)bv.p;
      aH = new int[] { 1, 2, 3, 7, 8 };
      aI = new int[5];
      aJ = new int[5];
      ad = paramInt;
      ac = false;
      N = null;
      aA = null;
      aQ = null;
      switch (ad) {
        case 0:
          aQ = l.a("/bg/caycot.png");
          aH = new int[] { 1, 3, 5, 7 };
          aO = 4;
          if (bv.p == 2)
            ae = 8; 
          break;
        case 1:
          ae = 7;
          aO = 4;
          break;
        case 2:
          aI = new int[] { 0, 0, 1 };
          aJ = new int[] { 0, 0, 2 };
          aO = 5;
          break;
        case 3:
          aO = 3;
          break;
        case 4:
          ed.a(3);
          aI = new int[] { 0, 1 };
          aJ = new int[] { 0, 1 };
          aO = 4;
          break;
        case 5:
          aO = 4;
          break;
        case 6:
          aI = new int[] { 1 };
          aJ = new int[] { 2 };
          aO = 5;
          break;
        case 7:
          aO = 4;
          break;
        case 8:
          ae = 8;
          aO = 4;
          break;
        case 9:
          ed.a(9);
          aO = 4;
          break;
        case 10:
          aO = 2;
          break;
        case 11:
          ae = 7;
          aH[2] = 0;
          aO = 3;
          break;
        case 12:
          aI = new int[] { 1, 1 };
          aJ = new int[] { 2, 1 };
          aO = 3;
          break;
        case 13:
          aO = 2;
          break;
        case 15:
          ds.c("HELL");
          aO = 2;
          break;
        case 16:
          aH = new int[] { 1, 3, 5, 7 };
          aO = 4;
          break;
        case 19:
          aI = new int[] { 0, 2, 1 };
          aJ = new int[] { 0, 2, 1 };
          aO = 5;
          break;
        default:
          aH = new int[] { 1, 3, 5, 7 };
          aO = 4;
          break;
      } 
      if (paramInt <= 16) {
        O = cj.g[ad];
      } else {
        try {
          String str = "/bg/b" + ad + '\003' + ".png";
          if (bv.p != 0)
            str = "/bg/b" + ad + '\003' + "-" + bv.p + ".png"; 
          int[] arrayOfInt = new int[1];
          Image image;
          (image = l.a(str)).getRGB(arrayOfInt, 0, 1, en.c(image) / 2, 0, 1, 1);
          O = arrayOfInt[0];
        } catch (Exception exception) {
          O = cj.g[cj.g.length - 1];
        } 
      } 
      af = new int[cj.g.length];
      aN = new int[cj.g.length];
      byte b1;
      for (b1 = 0; b1 < cj.g.length; b1++) {
        af[b1] = cj.g[b1];
        aN[b1] = cj.g[b1];
      } 
      if (a) {
        aR = l.a("/bg/b63.png");
        return;
      } 
      N = new Image[aO];
      P = new int[aO];
      Q = new int[aO];
      aN = new int[aO];
      af = new int[aO];
      if (bv.p == 100) {
        N[0] = l.a("/bg/b100.png");
        N[1] = l.a("/bg/b100.png");
        N[2] = l.a("/bg/b82-1.png");
        N[3] = l.a("/bg/b93.png");
        for (b1 = 0; b1 < aO; b1++) {
          if (N[b1] != null) {
            int[] arrayOfInt = new int[1];
            N[b1].getRGB(arrayOfInt, 0, 1, en.c(N[b1]) / 2, 0, 1, 1);
            af[b1] = arrayOfInt[0];
            arrayOfInt = new int[1];
            N[b1].getRGB(arrayOfInt, 0, 1, en.c(N[b1]) / 2, en.d(N[b1]) - 1, 1, 1);
            aN[b1] = arrayOfInt[0];
            P[b1] = en.a(N[b1]);
            Q[b1] = en.b(N[b1]);
          } else if (aO > 1) {
            N[b1] = l.a("/bg/b" + ad + "0.png");
            P[b1] = en.a(N[b1]);
            Q[b1] = en.b(N[b1]);
          } 
        } 
      } else {
        for (b1 = 0; b1 < aO; b1++) {
          String str = "/bg/b" + ad + b1 + ".png";
          if (bv.p != 0)
            str = "/bg/b" + ad + b1 + "-" + bv.p + ".png"; 
          N[b1] = l.a(str);
          if (N[b1] != null) {
            int[] arrayOfInt = new int[1];
            N[b1].getRGB(arrayOfInt, 0, 1, en.c(N[b1]) / 2, 0, 1, 1);
            af[b1] = arrayOfInt[0];
            arrayOfInt = new int[1];
            N[b1].getRGB(arrayOfInt, 0, 1, en.c(N[b1]) / 2, en.d(N[b1]) - 1, 1, 1);
            aN[b1] = arrayOfInt[0];
            P[b1] = en.a(N[b1]);
            Q[b1] = en.b(N[b1]);
          } else if (aO > 1) {
            N[b1] = l.a("/bg/b" + ad + "0.png");
            P[b1] = en.a(N[b1]);
            Q[b1] = en.b(N[b1]);
          } 
        } 
      } 
      b(ad);
      ds.c("5");
      aa = new int[] { p.d / 2 - 40, p.d / 2 + 40, p.d / 2 - 100, p.d / 2 - 80, p.d / 2 - 120 };
      ab = new int[] { 130, 100, 150, 140, 80 };
      aC = null;
      if (ad != 0)
        if (ad == 2) {
          aA = l.a("/bg/sun0.png");
          aD = p.d / 2 + 50;
          aE = aM[4] - 40;
          bv.h = l.a("/tWater/wts");
        } else if (ad == 19) {
          bv.h = l.a("/tWater/water_flow_32");
        } else if (ad == 4) {
          aA = l.a("/bg/sun2.png");
          aD = p.d / 2 + 30;
          aE = aM[3];
        } else if (ad == 7) {
          aA = l.a("/bg/sun3" + ((bv.p == 0) ? "" : ("-" + bv.p)) + ".png");
          aB = l.a("/bg/sun4" + ((bv.p == 0) ? "" : ("-" + bv.p)) + ".png");
          aD = p.d - p.d / 3;
          aE = aM[3] - 80;
          aF = aD - 100;
          aG = aM[3] - 30;
        } else if (ad == 6) {
          aA = l.a("/bg/sun5" + ((bv.p == 0) ? "" : ("-" + bv.p)) + ".png");
          aB = l.a("/bg/sun6" + ((bv.p == 0) ? "" : ("-" + bv.p)) + ".png");
          aD = p.d - p.d / 3;
          aE = aM[4];
          aF = aD - 100;
          aG = aM[4] + 20;
        } else if (paramInt == 5) {
          aA = l.a("/bg/sun8" + ((bv.p == 0) ? "" : ("-" + bv.p)) + ".png");
          aB = l.a("/bg/sun7" + ((bv.p == 0) ? "" : ("-" + bv.p)) + ".png");
          aD = p.d / 2 - 50;
          aE = aM[3] + 20;
          aF = p.d / 2 + 20;
          aG = aM[3] - 30;
        } else if (ad == 8 && bv.l < 90) {
          aA = l.a("/bg/sun9" + ((bv.p == 0) ? "" : ("-" + bv.p)) + ".png");
          aB = l.a("/bg/sun10" + ((bv.p == 0) ? "" : ("-" + bv.p)) + ".png");
          aD = p.d / 2 - 30;
          aE = aM[3] + 60;
          aF = p.d / 2 + 20;
          aG = aM[3] + 10;
        } else if (paramInt == 9) {
          aA = l.a("/bg/sun11" + ((bv.p == 0) ? "" : ("-" + bv.p)) + ".png");
          aB = l.a("/bg/sun12" + ((bv.p == 0) ? "" : ("-" + bv.p)) + ".png");
          aD = p.d - p.d / 3;
          aE = aM[4] + 20;
          aF = aD - 80;
          aG = aM[4] + 40;
        } else if (paramInt == 10) {
          aA = l.a("/bg/sun13" + ((bv.p == 0) ? "" : ("-" + bv.p)) + ".png");
          aB = l.a("/bg/sun14" + ((bv.p == 0) ? "" : ("-" + bv.p)) + ".png");
          aD = p.d - p.d / 3;
          aE = aM[1] - 30;
          aF = aD - 80;
          aG = aM[1];
        } else if (paramInt == 11) {
          aA = l.a("/bg/sun15" + ((bv.p == 0) ? "" : ("-" + bv.p)) + ".png");
          aB = l.a("/bg/b113" + ((bv.p == 0) ? "" : ("-" + bv.p)) + ".png");
          aD = p.d / 2 - 30;
          aE = aM[2] - 30;
        } else if (paramInt == 12) {
          ab = new int[] { 200, 170, 220, 150, 250 };
        } else if (paramInt == 16) {
          aa = new int[] { 90, 170, 250, 320, 400, 450, 500 };
          ab = new int[] { aM[2] + 5, aM[2] - 20, aM[2] - 50, aM[2] - 30, aM[2] - 50, aM[2], aM[2] - 40 };
          aC = new Image[7];
          for (b1 = 0; b1 < aC.length; b1++) {
            char c = ' ';
            if (b1 == 1 || b1 == 3)
              c = '¡'; 
            aC[b1] = l.a("/bg/sun" + c + ".png");
          } 
        } else if (paramInt == 19) {
          aI = new int[] { 0, 2, 1 };
          aJ = new int[] { 0, 2, 1 };
          aO = 5;
        } else {
          aA = null;
          aB = null;
          aA = l.a("/bg/sun" + paramInt + ((bv.p == 0) ? "" : ("-" + bv.p)) + ".png");
          if (l.a("/tWater/water_flow_" + paramInt) != null)
            bv.h = l.a("/tWater/water_flow_" + paramInt); 
          aD = p.d - p.d / 3;
          aE = aM[2] - 30;
        }  
      if (!(az = false)) {
        az = true;
        return;
      } 
    } catch (Exception exception) {
      aS = false;
    } 
  }
  
  private static void c(int paramInt) {
    for (byte b1 = 0; b1 < aP.length; b1++) {
      int i;
      if (paramInt == aP[b1] && (i = ds.b(0, 2)) == 0) {
        ed.a(0);
        return;
      } 
    } 
  }
  
  public final void keyPressed(int paramInt) {
    aT = System.currentTimeMillis();
    if ((paramInt >= 48 && paramInt <= 57) || (paramInt >= 65 && paramInt <= 122) || paramInt == 10 || paramInt == 8 || paramInt == 13 || paramInt == 32 || paramInt == 31)
      ag = paramInt; 
    paramInt = paramInt;
    if (K != null) {
      K.a(paramInt);
      ag = 0;
      return;
    } 
    E.a(paramInt);
    switch (paramInt) {
      case 48:
        j[0] = true;
        i[0] = true;
        return;
      case 49:
        if (E == ar.a || (E == p.c && c && !(cq.b()).b)) {
          j[1] = true;
          i[1] = true;
        } 
        return;
      case 51:
        if (E == ar.a || (E == p.c && c && !(cq.b()).b)) {
          j[3] = true;
          i[3] = true;
        } 
        return;
      case 55:
        j[7] = true;
        i[7] = true;
        return;
      case 57:
        j[9] = true;
        i[9] = true;
        return;
      case 42:
        j[10] = true;
        i[10] = true;
        return;
      case 35:
        j[11] = true;
        i[11] = true;
        return;
      case -21:
      case -6:
        j[12] = true;
        i[12] = true;
        return;
      case -22:
      case -7:
        j[13] = true;
        i[13] = true;
        return;
      case -5:
      case 10:
        if (E instanceof p || E instanceof ar)
          af.e(); 
        j[5] = true;
        i[5] = true;
        return;
      case -38:
      case -1:
        if (E instanceof p || E instanceof ar)
          af.e(); 
        j[2] = true;
        i[2] = true;
        return;
      case -39:
      case -2:
        if (E instanceof p || E instanceof ar)
          af.e(); 
        j[8] = true;
        i[8] = true;
        return;
      case -3:
        if (E instanceof p || E instanceof ar)
          af.e(); 
        j[4] = true;
        i[4] = true;
        return;
      case -4:
        if (E instanceof p || E instanceof ar)
          af.e(); 
        j[6] = true;
        i[6] = true;
        return;
      case 50:
        if (E == ar.a || (E == p.c && c && !(cq.b()).b)) {
          j[2] = true;
          i[2] = true;
        } 
        return;
      case 52:
        if (E == ar.a || (E == p.c && c && !(cq.b()).b)) {
          j[4] = true;
          i[4] = true;
        } 
        return;
      case 54:
        if (E == ar.a || (E == p.c && c && !(cq.b()).b)) {
          j[6] = true;
          i[6] = true;
        } 
        return;
      case 56:
        if (E == ar.a || (E == p.c && c && !(cq.b()).b)) {
          j[8] = true;
          i[8] = true;
        } 
        return;
      case 53:
        if (E == ar.a || (E == p.c && c && !(cq.b()).b)) {
          j[5] = true;
          i[5] = true;
        } 
        break;
    } 
  }
  
  public final void keyReleased(int paramInt) {
    ag = 0;
    switch (paramInt = paramInt) {
      case 48:
        j[0] = false;
        ap[0] = true;
        return;
      case 49:
        if (E == p.c && c && !(cq.b()).b) {
          j[1] = false;
          ap[1] = true;
        } 
        return;
      case 51:
        if (E == p.c && c && !(cq.b()).b) {
          j[3] = false;
          ap[3] = true;
        } 
        return;
      case 55:
        j[7] = false;
        ap[7] = true;
        return;
      case 57:
        j[9] = false;
        ap[9] = true;
        return;
      case 42:
        j[10] = false;
        ap[10] = true;
        return;
      case 35:
        j[11] = false;
        ap[11] = true;
        return;
      case -21:
      case -6:
        j[12] = false;
        ap[12] = true;
        return;
      case -22:
      case -7:
        j[13] = false;
        ap[13] = true;
        return;
      case -5:
      case 10:
        j[5] = false;
        ap[5] = true;
        return;
      case -38:
      case -1:
        j[2] = false;
        return;
      case -39:
      case -2:
        j[8] = false;
        return;
      case -3:
        j[4] = false;
        return;
      case -4:
        j[6] = false;
        return;
      case 50:
        if (E == p.c && c && !(cq.b()).b) {
          j[2] = false;
          ap[2] = true;
        } 
        return;
      case 52:
        if (E == p.c && c && !(cq.b()).b) {
          j[4] = false;
          ap[4] = true;
        } 
        return;
      case 54:
        if (E == p.c && c && !(cq.b()).b) {
          j[6] = false;
          ap[6] = true;
        } 
        return;
      case 56:
        if (E == p.c && c && !(cq.b()).b) {
          j[8] = false;
          ap[8] = true;
        } 
        return;
      case 53:
        if (E == p.c && c && !(cq.b()).b) {
          j[5] = false;
          ap[5] = true;
        } 
        break;
    } 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    o = false;
    if (ds.g(paramInt1 - t) >= 10 || ds.g(paramInt2 - u) >= 10) {
      l = false;
      k = true;
      n = true;
    } 
    p = paramInt1;
    q = paramInt2;
    if (++at > 3)
      at = 0; 
    v[at] = new be(paramInt1, paramInt2);
  }
  
  public final void b(int paramInt1, int paramInt2) {
    o = false;
    m = false;
    ai = true;
    k = true;
    l = false;
    n = false;
    aT = System.currentTimeMillis();
    r = paramInt1;
    s = paramInt2;
    t = paramInt1;
    u = paramInt2;
    p = paramInt1;
    q = paramInt2;
  }
  
  public final void c(int paramInt1, int paramInt2) {
    if (!n)
      o = true; 
    k = false;
    m = true;
    n = false;
    l = true;
    bb.cs = -1;
    p = paramInt1;
    q = paramInt2;
  }
  
  public static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (!k && !m) ? false : ((p >= paramInt1 && p <= paramInt1 + paramInt3 && q >= paramInt2 && q <= paramInt2 + paramInt4));
  }
  
  public static void f() {
    for (byte b1 = 0; b1 < i.length; b1++)
      i[b1] = false; 
    m = false;
  }
  
  public static void g() {
    for (byte b1 = 0; b1 < j.length; b1++)
      j[b1] = false; 
  }
  
  public final void paint(Graphics paramGraphics) {
    this.au.a = paramGraphics;
    aw.removeAllElements();
    if (E != null)
      E.a(this.au); 
    this.au.a(-this.au.a(), -this.au.b());
    this.au.e(0, 0, A, B);
    if (G.a) {
      G.a(this.au);
      if (H != null && H.a)
        H.a(this.au); 
      if (G.o != null && G.o.b)
        G.o.a(this.au); 
      if (H != null && H.o != null && H.o.b)
        H.o.a(this.au); 
    } 
    if (p.bP)
      ds.a(this.au); 
    bp.a(this.au);
    if (K != null) {
      K.a(this.au);
    } else if (F.a) {
      a(this.au);
      F.a(this.au);
    } 
    p.aD.a(this.au);
    p.aE.a(this.au);
    if ((p.j()).bQ != null)
      (p.j()).bQ.a(this.au); 
    if (ae.m != null)
      ae.m.a(this.au); 
    en en1 = this.au;
    if (ae.n == null && !(af.e()).t && !(af.e()).s) {
      en en2 = en1;
      try {
        if (v.m && (v.a <= p.j || v.a >= p.j + p.d || v.b <= p.k || v.b >= p.k + p.e) && w % 10 >= 5 && ae.m == null && ae.n == null && !G.a && v.j) {
          int j = v.a - (af.e()).B;
          int k = v.b - (af.e()).C;
          int m = 0;
          int i1 = 0;
          byte b1 = 0;
          if (j > 0 && k >= 0) {
            if (ds.g(j) >= ds.g(k)) {
              m = p.d - 10;
              i1 = p.e / 2 + 30;
              if (e)
                i1 = p.e / 2 + 10; 
              b1 = 0;
            } else {
              m = p.d / 2;
              i1 = p.e - 10;
              b1 = 5;
            } 
          } else if (j >= 0 && k < 0) {
            if (ds.g(j) >= ds.g(k)) {
              m = p.d - 10;
              i1 = p.e / 2 + 30;
              if (e)
                i1 = p.e / 2 + 10; 
              b1 = 0;
            } else {
              m = p.d / 2;
              i1 = 10;
              b1 = 6;
            } 
          } 
          if (j < 0 && k >= 0) {
            if (ds.g(j) >= ds.g(k)) {
              m = 10;
              i1 = p.e / 2 + 30;
              if (e)
                i1 = p.e / 2 + 10; 
              b1 = 3;
            } else {
              m = p.d / 2;
              i1 = p.e - 10;
              b1 = 5;
            } 
          } else if (j <= 0 && k < 0) {
            if (ds.g(j) >= ds.g(k)) {
              m = 10;
              i1 = p.e / 2 + 30;
              if (e)
                i1 = p.e / 2 + 10; 
              b1 = 3;
            } else {
              m = p.d / 2;
              i1 = 10;
              b1 = 6;
            } 
          } 
          p.c(en2);
          en2.a(p.bw, 0, 0, 13, 16, b1, m, i1, cj.f);
        } 
      } catch (Exception exception) {}
      if (F.e == 0 && v.i && ae.q == null && !af.bG && E == p.j() && (!G.a || G.h == 0)) {
        if (v.j)
          en1.a(-p.j, -p.k); 
        if (v.k == 0)
          en1.a(g.i, v.a - 15, v.b, 0); 
        if (v.k == 1)
          en1.a(g.i, 0, 0, 14, 16, 2, v.a + 15, v.b, cj.b); 
        if (v.l)
          en1.a(ce.f, v.a, v.b, 3); 
        en1.a(-en1.a(), -en1.b());
      } 
    } 
    if (ae.n != null)
      ae.n.a(this.au); 
    int i;
    for (i = 0; i < dc.x.size(); i++) {
      dc dc;
      if (dc = dc.x.elementAt(i) instanceof ae && !dc.equals(ae.m) && !dc.equals(ae.n))
        dc.a(this.au); 
    } 
    if (K != null)
      K.a(this.au); 
    if (!(!af.bI && !x.c && !bs.m && !am.a)) {
      en en2 = this.au;
      String str = "";
      a(en2);
      en2.a(0);
      en2.d(0, 0, A, B);
      en2.a(x.j, A / 2, B / 2 - 24, cj.c);
      a(C, B / 2 + 24, en2);
      di.c.a(en2, String.valueOf(aw.aB) + ((x.k > 0) ? (" " + x.k + "s") : str), A / 2, B / 2, 2);
      if (bl > 0 && x.k <= 0 && l.d() - bk >= 1000L) {
        if (--bl == 0)
          bl = 15; 
        bk = l.d();
      } 
    } 
    a(this.au);
    ei.d(this.au);
    if (an && !d) {
      if (E == I || E == ak || E == al)
        this.au.a(ah, 5, 5, 0); 
      if (E == cw.a)
        this.au.a(ah, 5, 20, 0); 
    } 
    for (i = 0; i < ba.size(); i++) {
      String str = ba.elementAt(i);
      di.a.a(this.au, str, A, B - this.bb - i * this.bb, 1);
      di.c.a(this.au, str, A - 1, B - this.bb - i * this.bb - 1, 1);
    } 
    a(this.au);
    i = B / 4;
    if (E != null && E instanceof p && aY != null) {
      this.au.e(60, i, A - 120, di.s.a() + 2);
      di.o.a(this.au, aY, aZ, i + 1, 0);
      di.n.a(this.au, aY, aZ, i, 0);
      this.au.e(0, 0, A, B);
    } 
  }
  
  public static void h() {
    K = null;
    bp.c();
  }
  
  public static void a(String paramString) {
    L.a(paramString, null, new de(aw.br, h, 8882, null), null);
    K = (n)L;
  }
  
  public static void b(String paramString) {
    L.a(paramString, null, new de(aw.bu, h, 8882, null), null);
    K = (n)L;
    L.a = true;
  }
  
  public static void c(String paramString) {
    L.a(paramString, null, new de(aw.bu, h, 8882, null), null);
    K = (n)L;
    L.a = true;
  }
  
  public static void i() {
    af.bI = true;
  }
  
  public static void a(String paramString, int paramInt, Object paramObject) {
    L.a(paramString, null, new de(aw.br, h, paramInt, null), null);
    L.c();
  }
  
  public static void a(String paramString, de paramde1, de paramde2) {
    L.a(paramString, paramde1, null, paramde2);
    L.c();
  }
  
  public final void sizeChanged(int paramInt1, int paramInt2) {}
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3) {
    if (a)
      return false; 
    paramInt1 = (paramInt1 == 1) ? 0 : 1;
    if (this.be[paramInt1] != -1)
      return false; 
    this.be[paramInt1] = 0;
    this.bc[paramInt1] = paramInt2;
    this.bd[paramInt1] = paramInt3;
    return true;
  }
  
  private static void o() {
    if (a)
      return; 
    bg = new Image[3];
    for (byte b1 = 0; b1 < 3; b1++)
      bg[b1] = l.b("/e/w" + b1 + ".png"); 
    bf[1] = -1;
    (bf = new int[2])[0] = -1;
  }
  
  public final void j() {
    if (a)
      return; 
    try {
      for (byte b1 = 0; b1 < 2; b1++) {
        if (this.be[b1] != -1) {
          this.be[b1] = this.be[b1] + 1;
          if (this.be[b1] >= 5)
            this.be[b1] = -1; 
          if (b1 == 0) {
            this.bc[b1] = this.bc[b1] - 1;
          } else {
            this.bc[b1] = this.bc[b1] + 1;
          } 
          this.bd[b1] = this.bd[b1] - 1;
        } 
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static boolean d(int paramInt1, int paramInt2) {
    return (paramInt1 < p.j) ? false : ((paramInt1 > p.j + p.d) ? false : ((paramInt2 < p.k) ? false : (!(paramInt2 > p.k + p.e + 30))));
  }
  
  public static void a(int paramInt1, int paramInt2, en paramen) {
    int i = aq % ((l.c == 7) ? 8 : 9);
    if (++aq == 1000)
      aq = 0; 
    paramen.a(bh, 0, i << 4, 16, 16, 0, paramInt1, paramInt2, 3);
  }
  
  public final void k() {
    this.bj = true;
  }
  
  public static boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (!k && !m) ? false : ((p >= paramInt1 && p <= paramInt1 + paramInt3 && q >= paramInt2 && q <= paramInt2 + paramInt4));
  }
  
  public final void a(int paramInt, Object paramObject) {
    String str3;
    int j;
    String str2;
    int i;
    h[] arrayOfH;
    short s;
    String[] arrayOfString;
    String str1;
    int k;
    String str4;
    switch (paramInt) {
      case 10001:
        K = null;
        bp.c();
        return;
      case 10000:
        K = null;
        bp.c();
        return;
      case 9000:
        K = null;
        bp.c();
        em.b = null;
        bl.a();
        System.gc();
        bs.o = true;
        bs.u = true;
        p.j().l();
        if (E != I) {
          ak.g();
          return;
        } 
        break;
      case 999:
        K = null;
        bp.c();
        return;
      case 9999:
        K = null;
        bp.c();
        b();
        bt.a().c();
        I.a();
        return;
      case 8881:
        str3 = (String)paramObject;
        try {
          GameMidlet.f.platformRequest(str3);
        } catch (Exception exception) {
          (str3 = null).printStackTrace();
        } 
        K = null;
        return;
      case 8882:
        bp.c();
        K = null;
        bs.v = false;
        return;
      case 8884:
        K = null;
        bp.c();
        if (al == null)
          al = new eu(); 
        al.b();
        return;
      case 8885:
        GameMidlet.f.a();
        return;
      case 8886:
        K = null;
        bp.c();
        str3 = (String)paramObject;
        bt.a().c(str3);
        return;
      case 8887:
        K = null;
        bp.c();
        j = ((Integer)paramObject).intValue();
        bt.a().m(j);
        return;
      case 8888:
        j = ((Integer)paramObject).intValue();
        bt.a().n(j);
        K = null;
        bp.c();
        return;
      case 8889:
        str2 = (String)paramObject;
        K = null;
        bp.c();
        bt.a().d(str2);
        return;
      case 88810:
        i = ((Integer)paramObject).intValue();
        K = null;
        bp.c();
        bt.a().k(i);
        return;
      case 88811:
        K = null;
        bp.c();
        bt.a().i();
        return;
      case 88814:
        arrayOfH = (h[])paramObject;
        K = null;
        bp.c();
        bt.a().a(arrayOfH);
        return;
      case 88815:
        return;
      case 88817:
        ae.c("", 1, (af.e()).aT);
        bt.a().a((af.e()).aT.df.a, F.b, 0);
        return;
      case 88818:
        s = ((Short)paramObject).shortValue();
        bt.a().a(s, null.a.d());
        K = null;
        bp.c();
        return;
      case 88819:
        s = ((Short)paramObject).shortValue();
        bt.a().b(s);
        return;
      case 88820:
        arrayOfString = (String[])paramObject;
        if ((af.e()).aT == null)
          return; 
        paramObject = new Integer(F.b);
        if (arrayOfString.length > 1) {
          el el1 = new el("vSub");
          for (byte b1 = 0; b1 < arrayOfString.length - 1; b1++)
            el1.addElement(new de(arrayOfString[b1 + 1], h, 88821, paramObject)); 
          F.a(el1);
          return;
        } 
        ae.c("", 1, (af.e()).aT);
        bt.a().a((af.e()).aT.df.a, paramObject.intValue(), 0);
        return;
      case 88821:
        k = ((Integer)paramObject).intValue();
        ae.c("", 1, (af.e()).aT);
        bt.a().a((af.e()).aT.df.a, k, F.b);
        return;
      case 88822:
        ae.c("", 1, (af.e()).aT);
        bt.a().a((af.e()).aT.df.a, F.b, 0);
        return;
      case 88823:
        a(aw.J);
        return;
      case 88824:
        a(aw.K);
        return;
      case 88825:
        c(aw.L);
        return;
      case 88826:
        c(aw.M);
        return;
      case 88827:
        a(aw.N);
        return;
      case 88828:
        a(aw.O);
        return;
      case 88829:
        if ((str4 = null.a.d()).equals(""))
          return; 
        bt.a().b(str4, ((Integer)paramObject).intValue());
        bp.a();
        return;
      case 88836:
        null.a.b(6);
        null.a(aw.R, new de(aw.bt, h, 888361, null), 1);
        return;
      case 888361:
        str1 = null.a.d();
        K = null;
        bp.c();
        if (str1.length() < 6 || str1.equals("")) {
          a(aw.P);
          return;
        } 
        try {
          bt.a().q(Integer.parseInt(str1));
          return;
        } catch (Exception exception) {
          a(aw.Q);
          return;
        } 
      case 88837:
        str1 = null.a.d();
        K = null;
        bp.c();
        try {
          bt.a().s(Integer.parseInt(str1.trim()));
          return;
        } catch (Exception exception) {
          return;
        } 
      case 88839:
        str1 = null.a.d();
        K = null;
        bp.c();
        if (str1.length() < 6 || str1.equals("")) {
          a(aw.P);
          return;
        } 
        try {
          str1 = null;
          int m = 8882;
          paramObject = str1;
          m = 888391;
          String str = aw.ag;
          L.a(str, new de(aw.bm, h, 888391, paramObject), new de("", h, 888391, paramObject), new de(aw.bn, h, 8882, null));
          L.c();
          return;
        } catch (Exception exception) {
          a(aw.Q);
          return;
        } 
      case 888391:
        str1 = (String)paramObject;
        K = null;
        bp.c();
        bt.a().r(Integer.parseInt(str1));
        return;
      case 888392:
        bt.a().a(4, F.b, 0);
        return;
      case 888393:
        I.a();
        return;
      case 888394:
        K = null;
        bp.c();
        return;
      case 888395:
        if (E.equals(em.a) || E.equals(ak)) {
          ak.b();
        } else {
          I.b();
        } 
        K = null;
        bp.c();
        return;
      case 888396:
        K = null;
        bp.c();
        return;
      case 888397:
        K = null;
        bp.c();
        return;
      case 101024:
        K = null;
        bp.c();
        return;
      case 101025:
        K = null;
        bp.c();
        if (bs.u) {
          ak.b();
          return;
        } 
        ak.j();
        return;
      case 101026:
        l.b(true);
        return;
      case 100001:
        bt.a().b((byte)0, (byte)-1);
        bp.a();
        return;
      case 100002:
        if (I == null)
          I = new x(); 
        x.g();
        return;
      case 100003:
        return;
      case 100004:
        return;
      case 100005:
        if ((af.e()).H == 14) {
          a(aw.ew);
          return;
        } 
        bt.a().h();
        return;
      case 100006:
        l.b(true);
        return;
      case 100016:
        bs.a(17, false);
        e();
        bs.m = true;
        K = null;
        bp.c();
        break;
    } 
  }
  
  public static void l() {
    l = false;
    k = false;
    ai = false;
    m = false;
    o = false;
    (p.j()).aU = 0L;
    (p.j()).aT = false;
  }
  
  static {
    (new int[1])[0] = -1;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\main\a.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */