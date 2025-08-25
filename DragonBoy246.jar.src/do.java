import main.a;

public class do extends af {
  public ap df;
  
  public static ap[] dg;
  
  public boolean dh;
  
  private int a;
  
  private int b;
  
  public static boolean di;
  
  private static int c;
  
  public int[] dj;
  
  private int d;
  
  private long e;
  
  private long f;
  
  public int dk;
  
  static {
    (new int[4])[0] = 1;
    (new int[4])[1] = -1;
    (new int[4])[2] = 1;
    (new int[4])[3] = -1;
    (new int[4])[0] = 1;
    (new int[4])[1] = -1;
    (new int[4])[2] = -1;
    (new int[4])[3] = 1;
  }
  
  public do(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.bd = true;
    this.aO = paramInt6;
    ds.c("npc avatar= " + this.aO);
    this.B = paramInt3;
    this.C = paramInt4;
    this.cl = paramInt3;
    this.cm = paramInt4;
    this.H = paramInt2;
    if (paramInt1 != -1)
      this.df = dg[paramInt5]; 
    if (paramInt5 == 23 || paramInt5 == 42)
      this.al = 45; 
    if (paramInt5 == 51) {
      this.bd = false;
      this.a = paramInt2;
      ds.c("duaHau = " + paramInt2);
    } 
    if (this.df != null) {
      if (this.df.b == null)
        this.df.b = ""; 
      this.df.b = ds.a(this.df.b);
    } 
  }
  
  public final void a(byte paramByte, int paramInt) {
    this.a = paramByte;
    this.e = this.f = System.currentTimeMillis();
    this.d = paramInt;
    ds.c("in ra second= " + this.d);
  }
  
  public static void aa() {
    for (byte b = 0; b < p.G.size(); b++) {
      do do1;
      (do1 = p.G.elementAt(b)).ca = null;
      do1.bZ = -1;
    } 
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield df : Lap;
    //   4: getfield a : I
    //   7: bipush #51
    //   9: if_icmpne -> 65
    //   12: aload_0
    //   13: invokestatic currentTimeMillis : ()J
    //   16: putfield f : J
    //   19: aload_0
    //   20: getfield f : J
    //   23: aload_0
    //   24: getfield e : J
    //   27: lsub
    //   28: ldc2_w 1000
    //   31: lcmp
    //   32: iflt -> 65
    //   35: aload_0
    //   36: dup
    //   37: getfield d : I
    //   40: iconst_1
    //   41: isub
    //   42: putfield d : I
    //   45: aload_0
    //   46: aload_0
    //   47: getfield f : J
    //   50: putfield e : J
    //   53: aload_0
    //   54: getfield d : I
    //   57: ifge -> 65
    //   60: aload_0
    //   61: iconst_0
    //   62: putfield d : I
    //   65: aload_0
    //   66: getfield bd : Z
    //   69: ifeq -> 76
    //   72: aload_0
    //   73: invokevirtual H : ()V
    //   76: aload_0
    //   77: getfield ca : Lcp;
    //   80: ifnonnull -> 331
    //   83: bipush #7
    //   85: newarray byte
    //   87: dup
    //   88: iconst_0
    //   89: iconst_m1
    //   90: bastore
    //   91: dup
    //   92: iconst_1
    //   93: bipush #9
    //   95: bastore
    //   96: dup
    //   97: iconst_2
    //   98: bipush #9
    //   100: bastore
    //   101: dup
    //   102: iconst_3
    //   103: bipush #10
    //   105: bastore
    //   106: dup
    //   107: iconst_4
    //   108: bipush #10
    //   110: bastore
    //   111: dup
    //   112: iconst_5
    //   113: bipush #11
    //   115: bastore
    //   116: dup
    //   117: bipush #6
    //   119: bipush #11
    //   121: bastore
    //   122: astore_1
    //   123: invokestatic e : ()Laf;
    //   126: getfield L : I
    //   129: bipush #9
    //   131: if_icmplt -> 246
    //   134: invokestatic e : ()Laf;
    //   137: getfield L : I
    //   140: bipush #10
    //   142: if_icmpgt -> 246
    //   145: invokestatic e : ()Laf;
    //   148: getfield ax : Lda;
    //   151: getfield a : I
    //   154: ifle -> 246
    //   157: aload_1
    //   158: invokestatic e : ()Laf;
    //   161: getfield ax : Lda;
    //   164: getfield a : I
    //   167: baload
    //   168: aload_0
    //   169: getfield df : Lap;
    //   172: getfield a : I
    //   175: if_icmpne -> 246
    //   178: invokestatic e : ()Laf;
    //   181: getfield aD : Lai;
    //   184: ifnonnull -> 200
    //   187: aload_0
    //   188: getstatic p.y : [Lcp;
    //   191: bipush #57
    //   193: aaload
    //   194: putfield ca : Lcp;
    //   197: goto -> 326
    //   200: invokestatic e : ()Laf;
    //   203: getfield aD : Lai;
    //   206: ifnull -> 331
    //   209: invokestatic e : ()Laf;
    //   212: getfield aD : Lai;
    //   215: getfield a : I
    //   218: iconst_1
    //   219: iadd
    //   220: invokestatic e : ()Laf;
    //   223: getfield aD : Lai;
    //   226: getfield f : [Ljava/lang/String;
    //   229: arraylength
    //   230: if_icmpne -> 331
    //   233: aload_0
    //   234: getstatic p.y : [Lcp;
    //   237: bipush #62
    //   239: aaload
    //   240: putfield ca : Lcp;
    //   243: goto -> 326
    //   246: invokestatic j : ()Lp;
    //   249: pop
    //   250: invokestatic x : ()B
    //   253: istore_1
    //   254: invokestatic e : ()Laf;
    //   257: getfield aD : Lai;
    //   260: ifnonnull -> 274
    //   263: iload_1
    //   264: aload_0
    //   265: getfield df : Lap;
    //   268: getfield a : I
    //   271: if_icmpeq -> 326
    //   274: invokestatic e : ()Laf;
    //   277: getfield aD : Lai;
    //   280: ifnull -> 331
    //   283: iload_1
    //   284: aload_0
    //   285: getfield df : Lap;
    //   288: getfield a : I
    //   291: if_icmpne -> 331
    //   294: invokestatic e : ()Laf;
    //   297: getfield aD : Lai;
    //   300: getfield a : I
    //   303: iconst_1
    //   304: iadd
    //   305: invokestatic e : ()Laf;
    //   308: getfield aD : Lai;
    //   311: getfield f : [Ljava/lang/String;
    //   314: arraylength
    //   315: pop2
    //   316: aload_0
    //   317: getstatic p.y : [Lcp;
    //   320: bipush #98
    //   322: aaload
    //   323: putfield ca : Lcp;
    //   326: aload_0
    //   327: iconst_0
    //   328: putfield bZ : I
    //   331: aload_0
    //   332: invokespecial a : ()V
    //   335: getstatic bv.l : I
    //   338: bipush #51
    //   340: if_icmpne -> 400
    //   343: aload_0
    //   344: getfield B : I
    //   347: invokestatic e : ()Laf;
    //   350: getfield B : I
    //   353: if_icmple -> 364
    //   356: aload_0
    //   357: iconst_m1
    //   358: putfield I : I
    //   361: goto -> 369
    //   364: aload_0
    //   365: iconst_1
    //   366: putfield I : I
    //   369: aload_0
    //   370: getfield df : Lap;
    //   373: getfield a : I
    //   376: iconst_2
    //   377: irem
    //   378: ifne -> 400
    //   381: aload_0
    //   382: getfield as : I
    //   385: iconst_1
    //   386: if_icmpne -> 395
    //   389: aload_0
    //   390: iconst_0
    //   391: putfield as : I
    //   394: return
    //   395: aload_0
    //   396: iconst_1
    //   397: putfield as : I
    //   400: return
  }
  
  public void a(en paramen) {
    if (af.bI)
      return; 
    if (this.dh)
      return; 
    if (!G())
      return; 
    if (this.H == 15)
      return; 
    if (this.aN != 0) {
      super.a(paramen);
      return;
    } 
    if (this.df == null)
      return; 
    if (this.df.a != 4 && this.df.a != 51 && this.df.a != 50)
      paramen.a(bv.x, this.B, this.C, 3); 
    if (this.df.a == 3) {
      bl.b(paramen, 265, this.B, this.C, 0, 33);
      if ((af.e()).aT != null && (af.e()).aT.equals(this) && ae.m == null)
        paramen.a(aa.R, 0, 0, 9, 6, 0, this.B, this.C - this.al + 4, 33); 
      this.b = 60;
    } else if (this.df.a != 4) {
      if (this.df.a == 50 || this.df.a == 51) {
        if (this.dj != null) {
          if (this.df.a == 50 && di) {
            c++;
            if (a.w % 3 == 0) {
              ea ea;
              ei.a(ea = new ea(19, this.B + ds.b(-50, 50), this.C, 2, 1, -1));
            } 
            if (a.w % 15 == 0) {
              ea ea;
              ei.a(ea = new ea(18, this.B + ds.b(-5, 5), this.C + ds.b(-90, 0), 2, 1, -1));
            } 
            if (c == 100)
              p.j().b(this.B, this.C); 
            if (c == 110) {
              di = false;
              this.df.a = 4;
            } 
          } 
          int i = 0;
          if (bl.c[this.dj[this.a]] != null && (bl.c[this.dj[this.a]]).a != null)
            i = en.b((bl.c[this.dj[this.a]]).a); 
          bl.b(paramen, this.dj[this.a], this.B + ds.b(-1, 1), this.C, 0, 33);
          if ((af.e()).aT != null && (af.e()).aT.equals(this)) {
            if (ae.m == null)
              paramen.a(aa.R, 0, 0, 9, 6, 0, this.B, this.C - this.al - 9 + 16 - i, 33); 
            di.c.a(paramen, ai.b(this.d), this.B, this.C - this.al - 16 - di.k.a() - 20 - i + 16, 2, di.f);
          } else {
            di.c.a(paramen, ai.b(this.d), this.B, this.C - this.al - 8 - di.k.a() - 20 - i + 16, 2, di.f);
          } 
        } 
      } else if (this.df.a == 6) {
        bl.b(paramen, 545, this.B, this.C + 5, 0, 33);
        if ((af.e()).aT != null && (af.e()).aT.equals(this) && ae.m == null)
          paramen.a(aa.R, 0, 0, 9, 6, 0, this.B, this.C - this.al - 9, 33); 
        di.c.a(paramen, (new StringBuffer(String.valueOf(bv.n))).toString(), this.B, this.C - this.al + 19 - di.k.a(), 2);
      } else {
        int i = this.df.c;
        int j = this.df.e;
        int k = this.df.d;
        av av1 = p.x[i];
        av av2 = p.x[j];
        av av3 = p.x[k];
        if (this.I == 1) {
          bl.b(paramen, (av1.a[af.bC[this.as][0][0]]).a, this.B + af.bC[this.as][0][1] + (av1.a[af.bC[this.as][0][0]]).b, this.C - af.bC[this.as][0][2] + (av1.a[af.bC[this.as][0][0]]).c, 0, 0);
          bl.b(paramen, (av2.a[af.bC[this.as][1][0]]).a, this.B + af.bC[this.as][1][1] + (av2.a[af.bC[this.as][1][0]]).b, this.C - af.bC[this.as][1][2] + (av2.a[af.bC[this.as][1][0]]).c, 0, 0);
          bl.b(paramen, (av3.a[af.bC[this.as][2][0]]).a, this.B + af.bC[this.as][2][1] + (av3.a[af.bC[this.as][2][0]]).b, this.C - af.bC[this.as][2][2] + (av3.a[af.bC[this.as][2][0]]).c, 0, 0);
        } else {
          bl.b(paramen, (av1.a[af.bC[this.as][0][0]]).a, this.B - af.bC[this.as][0][1] - (av1.a[af.bC[this.as][0][0]]).b, this.C - af.bC[this.as][0][2] + (av1.a[af.bC[this.as][0][0]]).c, 2, 24);
          bl.b(paramen, (av2.a[af.bC[this.as][1][0]]).a, this.B - af.bC[this.as][1][1] - (av2.a[af.bC[this.as][1][0]]).b, this.C - af.bC[this.as][1][2] + (av2.a[af.bC[this.as][1][0]]).c, 2, 24);
          bl.b(paramen, (av3.a[af.bC[this.as][2][0]]).a, this.B - af.bC[this.as][2][1] - (av3.a[af.bC[this.as][2][0]]).b, this.C - af.bC[this.as][2][2] + (av3.a[af.bC[this.as][2][0]]).c, 2, 24);
        } 
        if (bv.l != 51) {
          byte b = 15;
          if (this.df.a == 47)
            b = 47; 
          if ((af.e()).aT != null && (af.e()).aT.equals(this) && ae.m == null) {
            byte b1 = 0;
            byte b2 = 0;
            if ((af.e()).aT.df.a == 28 || (af.e()).aT.df.a == 41) {
              b1 = 3;
              b2 = -12;
            } 
            paramen.a(aa.R, 0, 0, 9, 6, 0, this.B + b1, this.C - this.al - b - 8 + b2, 33);
          } 
        } 
        this.b = 65;
      } 
    } 
    if (this.bZ >= 0 && this.ca != null && this.aN == 0) {
      bl.b(paramen, (this.ca.a[this.bZ]).c, this.B + (this.ca.a[this.bZ]).a, this.C + (this.ca.a[this.bZ]).b - this.b, 0, 3);
      if (a.w % 2 == 0) {
        this.bZ++;
        if (this.bZ >= this.ca.a.length)
          this.bZ = 0; 
      } 
    } 
  }
  
  public final void e(en paramen) {
    if (af.bI)
      return; 
    if (this.dh)
      return; 
    if (!G())
      return; 
    if (this.H == 15)
      return; 
    if (this.df == null)
      return; 
    if (this.df.a == 3) {
      if ((af.e()).aT != null && (af.e()).aT.equals(this)) {
        di.n.a(paramen, this.df.b, this.B, this.C - this.al - di.k.a() - 5, 2, di.o);
      } else {
        di.n.a(paramen, this.df.b, this.B, this.C - this.al - 3 - di.k.a(), 2, di.o);
      } 
      this.b = 60;
      return;
    } 
    if (this.df.a != 4)
      if (this.df.a == 50 || this.df.a == 51) {
        if (this.dj != null) {
          int i = 0;
          if (bl.c[this.dj[this.a]] != null && (bl.c[this.dj[this.a]]).a != null)
            i = en.b((bl.c[this.dj[this.a]]).a); 
          if ((af.e()).aT != null && (af.e()).aT.equals(this)) {
            di.n.a(paramen, this.df.b, this.B, this.C - this.al - di.k.a() - i, 2, di.o);
            return;
          } 
          di.n.a(paramen, this.df.b, this.B, this.C - this.al - 8 - di.k.a() - i + 16, 2, di.o);
          return;
        } 
      } else {
        if (this.df.a == 6) {
          if ((af.e()).aT != null && (af.e()).aT.equals(this)) {
            di.n.a(paramen, this.df.b, this.B, this.C - this.al - di.k.a() - 16, 2, di.o);
            return;
          } 
          di.n.a(paramen, this.df.b, this.B, this.C - this.al - 8 - di.k.a(), 2, di.o);
          return;
        } 
        if (bv.l != 51) {
          byte b = 15;
          if (this.df.a == 47)
            b = 47; 
          if ((af.e()).aT != null && (af.e()).aT.equals(this)) {
            if (bv.l != 113) {
              byte b1 = 0;
              byte b2 = 0;
              if ((af.e()).aT.df.a == 28 || (af.e()).aT.df.a == 41) {
                b1 = 3;
                b2 = -12;
              } 
              di.n.a(paramen, this.df.b, this.B + b1, this.C - this.al - di.k.a() - b + b2, 2, di.o);
            } 
          } else {
            b = 8;
            if (this.df.a == 47)
              b = 40; 
            if (bv.l != 113) {
              byte b1 = 0;
              byte b2 = 0;
              if (this.df.a == 28 || this.df.a == 41) {
                b1 = 3;
                b2 = -12;
              } 
              di.n.a(paramen, this.df.b, this.B + b1, this.C - this.al - b - di.k.a() + b2, 2, di.o);
            } 
          } 
        } 
        this.b = 65;
      }  
  }
  
  public final void k() {
    this.H = 15;
    af.x = null;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\do.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */