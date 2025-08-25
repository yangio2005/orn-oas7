package main;

import en;
import l;
import p;

public final class b {
  private int e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k = 28;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private int t;
  
  public int a;
  
  private int u;
  
  private boolean v = false;
  
  public boolean b;
  
  public boolean c;
  
  public boolean d;
  
  public b() {
    if (a.A < 300) {
      this.b = true;
      this.c = false;
      this.d = false;
    } 
    if (a.A >= 300 && a.A <= 380) {
      this.b = false;
      this.c = true;
      this.d = false;
    } 
    if (a.A > 380) {
      this.b = false;
      this.c = false;
      this.d = true;
    } 
    if (!this.d) {
      this.s = 0;
      this.a = a.C;
      this.t = a.D >> 1;
      this.u = a.B - 80;
      return;
    } 
    this.s = 0;
    this.a = a.C / 4 * 3 - 20;
    this.t = a.D >> 1;
    this.u = a.B;
    if (l.c == 2) {
      this.s = 0;
      this.t = (a.B >> 1) + 40;
      this.a = a.C / 4 * 3 - 40;
      this.u = a.B;
    } 
  }
  
  public final void a() {
    // Byte code:
    //   0: getstatic p.aO : I
    //   3: ifne -> 7
    //   6: return
    //   7: getstatic main/a.k : Z
    //   10: ifeq -> 838
    //   13: getstatic main/a.m : Z
    //   16: ifne -> 838
    //   19: aload_0
    //   20: getstatic main/a.r : I
    //   23: putfield m : I
    //   26: aload_0
    //   27: getstatic main/a.s : I
    //   30: putfield n : I
    //   33: aload_0
    //   34: getfield m : I
    //   37: iflt -> 899
    //   40: aload_0
    //   41: getfield m : I
    //   44: aload_0
    //   45: getfield a : I
    //   48: if_icmpgt -> 899
    //   51: aload_0
    //   52: getfield n : I
    //   55: aload_0
    //   56: getfield t : I
    //   59: if_icmplt -> 899
    //   62: aload_0
    //   63: getfield n : I
    //   66: aload_0
    //   67: getfield u : I
    //   70: if_icmpgt -> 899
    //   73: aload_0
    //   74: getfield v : Z
    //   77: ifne -> 106
    //   80: aload_0
    //   81: aload_0
    //   82: aload_0
    //   83: getfield m : I
    //   86: dup_x1
    //   87: putfield g : I
    //   90: putfield e : I
    //   93: aload_0
    //   94: aload_0
    //   95: aload_0
    //   96: getfield n : I
    //   99: dup_x1
    //   100: putfield h : I
    //   103: putfield f : I
    //   106: aload_0
    //   107: iconst_1
    //   108: putfield v : Z
    //   111: aload_0
    //   112: getstatic main/a.p : I
    //   115: aload_0
    //   116: getfield e : I
    //   119: isub
    //   120: putfield o : I
    //   123: aload_0
    //   124: getstatic main/a.q : I
    //   127: aload_0
    //   128: getfield f : I
    //   131: isub
    //   132: putfield p : I
    //   135: aload_0
    //   136: aload_0
    //   137: getfield o : I
    //   140: iconst_2
    //   141: invokestatic e : (II)I
    //   144: aload_0
    //   145: getfield p : I
    //   148: iconst_2
    //   149: invokestatic e : (II)I
    //   152: iadd
    //   153: putfield q : I
    //   156: aload_0
    //   157: aload_0
    //   158: getfield q : I
    //   161: invokestatic f : (I)I
    //   164: putfield l : I
    //   167: aload_0
    //   168: getfield o : I
    //   171: invokestatic g : (I)I
    //   174: iconst_4
    //   175: if_icmpgt -> 189
    //   178: aload_0
    //   179: getfield p : I
    //   182: invokestatic g : (I)I
    //   185: iconst_4
    //   186: if_icmple -> 899
    //   189: aload_0
    //   190: aload_0
    //   191: getfield o : I
    //   194: aload_0
    //   195: getfield p : I
    //   198: invokestatic a : (II)I
    //   201: putfield r : I
    //   204: aload_0
    //   205: getfield e : I
    //   208: aload_0
    //   209: getfield k : I
    //   212: isub
    //   213: aload_0
    //   214: getfield f : I
    //   217: aload_0
    //   218: getfield k : I
    //   221: isub
    //   222: iconst_2
    //   223: aload_0
    //   224: getfield k : I
    //   227: imul
    //   228: iconst_2
    //   229: aload_0
    //   230: getfield k : I
    //   233: imul
    //   234: invokestatic a : (IIII)Z
    //   237: ifne -> 410
    //   240: aload_0
    //   241: getfield l : I
    //   244: ifeq -> 391
    //   247: aload_0
    //   248: aload_0
    //   249: getfield p : I
    //   252: aload_0
    //   253: getfield k : I
    //   256: imul
    //   257: aload_0
    //   258: getfield l : I
    //   261: idiv
    //   262: putfield h : I
    //   265: aload_0
    //   266: aload_0
    //   267: getfield o : I
    //   270: aload_0
    //   271: getfield k : I
    //   274: imul
    //   275: aload_0
    //   276: getfield l : I
    //   279: idiv
    //   280: putfield g : I
    //   283: aload_0
    //   284: dup
    //   285: getfield g : I
    //   288: aload_0
    //   289: getfield e : I
    //   292: iadd
    //   293: putfield g : I
    //   296: aload_0
    //   297: dup
    //   298: getfield h : I
    //   301: aload_0
    //   302: getfield f : I
    //   305: iadd
    //   306: putfield h : I
    //   309: aload_0
    //   310: getfield e : I
    //   313: aload_0
    //   314: getfield k : I
    //   317: isub
    //   318: aload_0
    //   319: getfield f : I
    //   322: aload_0
    //   323: getfield k : I
    //   326: isub
    //   327: iconst_2
    //   328: aload_0
    //   329: getfield k : I
    //   332: imul
    //   333: iconst_2
    //   334: aload_0
    //   335: getfield k : I
    //   338: imul
    //   339: aload_0
    //   340: getfield g : I
    //   343: aload_0
    //   344: getfield h : I
    //   347: invokestatic a : (IIIIII)Z
    //   350: ifne -> 372
    //   353: aload_0
    //   354: aload_0
    //   355: getfield i : I
    //   358: putfield g : I
    //   361: aload_0
    //   362: aload_0
    //   363: getfield j : I
    //   366: putfield h : I
    //   369: goto -> 424
    //   372: aload_0
    //   373: aload_0
    //   374: getfield g : I
    //   377: putfield i : I
    //   380: aload_0
    //   381: aload_0
    //   382: getfield h : I
    //   385: putfield j : I
    //   388: goto -> 424
    //   391: aload_0
    //   392: aload_0
    //   393: getfield i : I
    //   396: putfield g : I
    //   399: aload_0
    //   400: aload_0
    //   401: getfield j : I
    //   404: putfield h : I
    //   407: goto -> 424
    //   410: aload_0
    //   411: getstatic main/a.p : I
    //   414: putfield g : I
    //   417: aload_0
    //   418: getstatic main/a.q : I
    //   421: putfield h : I
    //   424: invokestatic g : ()V
    //   427: iconst_2
    //   428: istore_1
    //   429: getstatic p.aO : I
    //   432: ifne -> 439
    //   435: iconst_0
    //   436: goto -> 526
    //   439: invokestatic e : ()Laf;
    //   442: getfield H : I
    //   445: iconst_3
    //   446: if_icmpne -> 453
    //   449: iconst_1
    //   450: goto -> 526
    //   453: iconst_2
    //   454: istore_1
    //   455: goto -> 521
    //   458: getstatic main/a.v : [Lbe;
    //   461: iload_1
    //   462: aaload
    //   463: getfield a : I
    //   466: getstatic main/a.v : [Lbe;
    //   469: iload_1
    //   470: iconst_1
    //   471: isub
    //   472: aaload
    //   473: getfield a : I
    //   476: isub
    //   477: istore_2
    //   478: getstatic main/a.v : [Lbe;
    //   481: iload_1
    //   482: aaload
    //   483: getfield b : I
    //   486: getstatic main/a.v : [Lbe;
    //   489: iload_1
    //   490: iconst_1
    //   491: isub
    //   492: aaload
    //   493: getfield b : I
    //   496: isub
    //   497: istore_3
    //   498: iload_2
    //   499: invokestatic g : (I)I
    //   502: iconst_2
    //   503: if_icmple -> 518
    //   506: iload_3
    //   507: invokestatic g : (I)I
    //   510: iconst_2
    //   511: if_icmple -> 518
    //   514: iconst_0
    //   515: goto -> 526
    //   518: iinc #1, -1
    //   521: iload_1
    //   522: ifgt -> 458
    //   525: iconst_1
    //   526: ifeq -> 834
    //   529: aload_0
    //   530: getfield r : I
    //   533: sipush #360
    //   536: if_icmpgt -> 549
    //   539: aload_0
    //   540: getfield r : I
    //   543: sipush #340
    //   546: if_icmpge -> 565
    //   549: aload_0
    //   550: getfield r : I
    //   553: iflt -> 580
    //   556: aload_0
    //   557: getfield r : I
    //   560: bipush #20
    //   562: if_icmpgt -> 580
    //   565: getstatic main/a.j : [Z
    //   568: bipush #6
    //   570: iconst_1
    //   571: bastore
    //   572: getstatic main/a.i : [Z
    //   575: bipush #6
    //   577: iconst_1
    //   578: bastore
    //   579: return
    //   580: aload_0
    //   581: getfield r : I
    //   584: bipush #40
    //   586: if_icmple -> 613
    //   589: aload_0
    //   590: getfield r : I
    //   593: bipush #70
    //   595: if_icmpge -> 613
    //   598: getstatic main/a.j : [Z
    //   601: bipush #6
    //   603: iconst_1
    //   604: bastore
    //   605: getstatic main/a.i : [Z
    //   608: bipush #6
    //   610: iconst_1
    //   611: bastore
    //   612: return
    //   613: aload_0
    //   614: getfield r : I
    //   617: bipush #70
    //   619: if_icmplt -> 646
    //   622: aload_0
    //   623: getfield r : I
    //   626: bipush #110
    //   628: if_icmpgt -> 646
    //   631: getstatic main/a.j : [Z
    //   634: bipush #8
    //   636: iconst_1
    //   637: bastore
    //   638: getstatic main/a.i : [Z
    //   641: bipush #8
    //   643: iconst_1
    //   644: bastore
    //   645: return
    //   646: aload_0
    //   647: getfield r : I
    //   650: bipush #110
    //   652: if_icmple -> 677
    //   655: aload_0
    //   656: getfield r : I
    //   659: bipush #120
    //   661: if_icmpge -> 677
    //   664: getstatic main/a.j : [Z
    //   667: iconst_4
    //   668: iconst_1
    //   669: bastore
    //   670: getstatic main/a.i : [Z
    //   673: iconst_4
    //   674: iconst_1
    //   675: bastore
    //   676: return
    //   677: aload_0
    //   678: getfield r : I
    //   681: bipush #120
    //   683: if_icmplt -> 709
    //   686: aload_0
    //   687: getfield r : I
    //   690: sipush #200
    //   693: if_icmpgt -> 709
    //   696: getstatic main/a.j : [Z
    //   699: iconst_4
    //   700: iconst_1
    //   701: bastore
    //   702: getstatic main/a.i : [Z
    //   705: iconst_4
    //   706: iconst_1
    //   707: bastore
    //   708: return
    //   709: aload_0
    //   710: getfield r : I
    //   713: sipush #200
    //   716: if_icmple -> 754
    //   719: aload_0
    //   720: getfield r : I
    //   723: sipush #250
    //   726: if_icmpge -> 754
    //   729: getstatic main/a.j : [Z
    //   732: iconst_2
    //   733: iconst_1
    //   734: bastore
    //   735: getstatic main/a.i : [Z
    //   738: iconst_2
    //   739: iconst_1
    //   740: bastore
    //   741: getstatic main/a.j : [Z
    //   744: iconst_4
    //   745: iconst_1
    //   746: bastore
    //   747: getstatic main/a.i : [Z
    //   750: iconst_4
    //   751: iconst_1
    //   752: bastore
    //   753: return
    //   754: aload_0
    //   755: getfield r : I
    //   758: sipush #250
    //   761: if_icmplt -> 787
    //   764: aload_0
    //   765: getfield r : I
    //   768: sipush #290
    //   771: if_icmpgt -> 787
    //   774: getstatic main/a.j : [Z
    //   777: iconst_2
    //   778: iconst_1
    //   779: bastore
    //   780: getstatic main/a.i : [Z
    //   783: iconst_2
    //   784: iconst_1
    //   785: bastore
    //   786: return
    //   787: aload_0
    //   788: getfield r : I
    //   791: sipush #290
    //   794: if_icmple -> 899
    //   797: aload_0
    //   798: getfield r : I
    //   801: sipush #340
    //   804: if_icmpge -> 899
    //   807: getstatic main/a.j : [Z
    //   810: iconst_2
    //   811: iconst_1
    //   812: bastore
    //   813: getstatic main/a.i : [Z
    //   816: iconst_2
    //   817: iconst_1
    //   818: bastore
    //   819: getstatic main/a.j : [Z
    //   822: bipush #6
    //   824: iconst_1
    //   825: bastore
    //   826: getstatic main/a.i : [Z
    //   829: bipush #6
    //   831: iconst_1
    //   832: bastore
    //   833: return
    //   834: invokestatic g : ()V
    //   837: return
    //   838: aload_0
    //   839: aload_0
    //   840: bipush #45
    //   842: dup_x1
    //   843: putfield e : I
    //   846: putfield g : I
    //   849: aload_0
    //   850: getfield d : Z
    //   853: ifne -> 874
    //   856: aload_0
    //   857: aload_0
    //   858: getstatic main/a.B : I
    //   861: bipush #90
    //   863: isub
    //   864: dup_x1
    //   865: putfield f : I
    //   868: putfield h : I
    //   871: goto -> 889
    //   874: aload_0
    //   875: aload_0
    //   876: getstatic main/a.B : I
    //   879: bipush #45
    //   881: isub
    //   882: dup_x1
    //   883: putfield f : I
    //   886: putfield h : I
    //   889: aload_0
    //   890: iconst_0
    //   891: putfield v : Z
    //   894: invokestatic g : ()V
    //   897: return
    //   898: pop
    //   899: return
    // Exception table:
    //   from	to	target	type
    //   0	6	898	java/lang/Exception
    //   7	897	898	java/lang/Exception
  }
  
  public final void a(en paramen) {
    if (p.aO == 0)
      return; 
    this.s = 0;
    this.t = (a.B >> 1) + 40;
    this.a = a.C / 4 * 3 - 40;
    this.u = a.B;
    paramen.a(p.aA, this.e, this.f, 3);
    paramen.a(p.aB, this.g, this.h, 3);
  }
  
  public final boolean b() {
    return (p.aO == 0) ? false : this.v;
  }
  
  public final boolean c() {
    try {
      boolean bool;
      if (p.aO == 0)
        return false; 
      if ((a.p >= 0 && a.p <= 0 + this.a && a.q >= this.t && a.q <= this.t + this.u) || (a.p >= 0 && a.p <= a.A && a.q >= this.t && a.q <= this.t + this.u) || a.p >= a.A - 50) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } catch (Exception exception) {
      return false;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\main\b.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */