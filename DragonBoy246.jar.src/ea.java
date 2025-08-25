import java.io.InputStream;

public final class ea {
  public int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  private boolean o;
  
  private af p;
  
  public int e;
  
  private int q;
  
  public int f;
  
  public int g;
  
  private int r;
  
  private int s;
  
  private int t;
  
  private boolean u = true;
  
  public int h;
  
  public int i = 0;
  
  public static el j = new el("vEffData");
  
  public int k = 0;
  
  public long l = 0L;
  
  private static el v = new el("vLastEff");
  
  public static el m = new el("vNewEff");
  
  public static el n = new el("vdowloadEff");
  
  private int[] w = new int[] { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1 };
  
  private int[] x = new int[] { 2, 2, 2, 2, 2, 3, 3, 3, 3, 3 };
  
  private int[] y = new int[] { 4, 4, 4, 4, 4, 5, 5, 5, 5, 5 };
  
  private int[] z = new int[] { 6, 6, 6, 6, 6, 7, 7, 7, 7, 7 };
  
  private int[] A = new int[] { 8, 8, 8, 8, 8, 9, 9, 9, 9, 9 };
  
  private boolean B = false;
  
  private short[] C;
  
  private static void b(int paramInt) {
    for (byte b = 0; b < j.size(); b++) {
      ck ck;
      if ((ck = j.elementAt(b)).d == paramInt) {
        j.removeElement(ck);
        return;
      } 
    } 
  }
  
  public static ck a(int paramInt) {
    for (byte b = 0; b < j.size(); b++) {
      ck ck;
      if ((ck = j.elementAt(b)).d == paramInt)
        return ck; 
    } 
    return null;
  }
  
  public ea() {}
  
  public ea(int paramInt1, af paramaf, int paramInt2, int paramInt3, int paramInt4, byte paramByte) {
    this.p = paramaf;
    this.a = paramInt1;
    this.h = paramInt2;
    this.r = paramInt3;
    this.s = paramInt4;
    this.i = paramByte;
    if (a(paramInt1) == null) {
      ck ck;
      (ck = new ck()).d = paramInt1;
      if (paramInt1 >= 42 && paramInt1 <= 46)
        paramInt1 = 106; 
      String str = "/x" + en.b + "/effectdata/" + paramInt1 + "/data";
      InputStream inputStream = null;
      try {
        inputStream = ad.a(str);
      } catch (Exception exception) {}
      if (inputStream != null) {
        if (paramInt1 > 100 && paramInt1 < 200) {
          ck.b(str);
        } else {
          ck.a(str);
        } 
        ck.a = l.b("/effectdata/" + paramInt1 + "/img.png");
      } else {
        bt.a().a((short)paramInt1);
      } 
      ck = ck;
      j.addElement(ck);
    } 
    this.c = -1;
    this.d = -1;
    this.k = -1;
    this.b = 4;
    if (paramInt1 == 78)
      this.b = 5; 
  }
  
  public ea(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.f = paramInt2;
    this.g = paramInt3;
    this.a = paramInt1;
    this.h = paramInt4;
    this.r = paramInt5;
    this.s = paramInt6;
    if (a(paramInt1) == null) {
      ck ck;
      (ck = new ck()).d = paramInt1;
      if (paramInt1 >= 42 && paramInt1 <= 46)
        paramInt1 = 106; 
      String str = "/x" + en.b + "/effectdata/" + paramInt1 + "/data";
      InputStream inputStream = null;
      try {
        inputStream = ad.a(str);
      } catch (Exception exception) {}
      if (inputStream != null) {
        if (paramInt1 > 100 && paramInt1 < 200) {
          ck.b(str);
        } else {
          ck.a(str);
        } 
        ck.a = l.b("/effectdata/" + paramInt1 + "/img.png");
      } else {
        bt.a().a((short)paramInt1);
      } 
      ck = ck;
      j.addElement(ck);
      if (v.size() > 20) {
        b(Integer.parseInt(v.elementAt(0)));
        v.removeElementAt(0);
      } 
      v.addElement((new StringBuffer(String.valueOf(this.a))).toString());
    } 
    this.c = -1;
    this.d = -1;
    if (paramInt1 == 78) {
      this.b = 5;
    } else {
      this.b = 1;
    } 
    if (!a((new StringBuffer(String.valueOf(this.a))).toString()))
      m.addElement((new StringBuffer(String.valueOf(this.a))).toString()); 
  }
  
  private static boolean a(String paramString) {
    for (byte b = 0; b < m.size(); b++) {
      String str;
      if ((str = m.elementAt(b)).equals(paramString))
        return true; 
    } 
    return false;
  }
  
  private boolean b() {
    return !!this.u;
  }
  
  public final void a(en paramen, int paramInt1, int paramInt2) {
    if (!b())
      return; 
    if ((a(this.a)).a != null)
      a(this.a).a(paramen, this.q, this.f + paramInt1, this.g + paramInt2, this.k, this.h); 
  }
  
  public final void a(en paramen) {
    if (!b())
      return; 
    if (a(this.a) == null)
      return; 
    if ((a(this.a)).a != null)
      try {
        a(this.a).a(paramen, this.q, this.f, this.g, this.k, this.h);
        return;
      } catch (Exception exception) {
        ds.c("Effect " + this.a + " err at frame " + this.q + " vitri " + this.f + "_" + this.g + "   " + this.h);
        exception.printStackTrace();
      }  
  }
  
  public final void a() {
    try {
      if (this.a >= 42 && this.a <= 46) {
        ea ea1;
        if ((ea1 = this).a == 42)
          ea1.q = ea1.w[ea1.e]; 
        if (ea1.a == 43)
          ea1.q = ea1.x[ea1.e]; 
        if (ea1.a == 44)
          ea1.q = ea1.y[ea1.e]; 
        if (ea1.a == 45)
          ea1.q = ea1.z[ea1.e]; 
        if (ea1.a == 46)
          ea1.q = ea1.A[ea1.e]; 
        ea1.e++;
        if (ea1.e > ea1.w.length - 1)
          ea1.e = 0; 
        return;
      } 
      if (a(this.a) == null)
        return; 
      if ((a(this.a)).a == null)
        return; 
      if (this.b == 5) {
        int i = this.p.H;
        ck ck = a(this.a);
        if (i >= ck.c.length)
          i = 0; 
        this.C = (ck.c[i] == null) ? new short[1] : ck.c[i];
      } else {
        ck ck;
        this.C = (ck = a(this.a)).b;
      } 
      if (this.C != null) {
        if (!this.B) {
          this.B = true;
          int i;
          if ((i = this.C.length - 1) > 0 && this.b != 1)
            this.e = ds.b(0, i); 
          if (this.b == 0)
            this.e = ds.b(this.c, this.d); 
        } 
        switch (this.b) {
          case 4:
            this.f = this.p.B;
            this.g = this.p.C;
            if (this.e < this.C.length)
              this.e++; 
            break;
          case 5:
            this.k = (this.p.I == 1) ? 0 : 1;
            if (this.p.I == 1) {
              this.f = this.p.B - 15;
            } else {
              this.f = this.p.B + 15;
            } 
            if (this.p.cE == 0) {
              this.g = this.p.C - 25;
            } else {
              this.g = this.p.C - 35;
            } 
            if (this.e < this.C.length)
              this.e++; 
            break;
          case 1:
          case 3:
            if (this.e < this.C.length)
              this.e++; 
            break;
          case 0:
            if (ds.a(this.f - 50, this.g - 50, 100, 100, (af.e()).B, (af.e()).C) && this.e > this.c && this.e < this.d) {
              if (this.e < this.d)
                this.e = this.d; 
              this.o = true;
            } 
            if (!this.o) {
              this.e++;
              if (this.e == this.d)
                this.e = this.c; 
              break;
            } 
            if (this.e < this.C.length)
              this.e++; 
            break;
          case 2:
            if (this.e < this.C.length)
              this.e++; 
            this.t++;
            if (this.t == this.s) {
              this.t = 0;
              this.k = ds.b(0, 2);
            } 
            break;
        } 
        if (this.e <= this.C.length - 1)
          this.q = this.C[this.e]; 
      } 
      if (this.e >= this.C.length - 1) {
        if (this.b == 0 || this.b == 3)
          this.u = false; 
        if (this.s == -1)
          ei.a.removeElement(this); 
        if (this.b == 2) {
          this.e = 0;
          return;
        } 
        if (this.b == 1 && this.r == 1)
          this.u = false; 
        if (this.b == 4 || this.b == 5) {
          if (this.r == -1) {
            this.e = 0;
            return;
          } 
          this.t++;
          if (this.t == this.s) {
            this.t = 0;
            this.r--;
            this.e = 0;
            if (this.r == 0)
              this.p.b(0, this.a); 
          } 
          return;
        } 
        this.o = false;
        if (this.r == -1) {
          this.t++;
          this.e = 0;
          if (this.t == this.s) {
            this.t = 0;
            if (this.s > 1) {
              this.k = ds.b(0, 2);
              return;
            } 
          } 
        } else {
          this.t++;
          this.e = 0;
          if (this.t == this.s) {
            this.t = 0;
            this.r--;
            if (this.r == 0) {
              ei.a.removeElement(this);
              return;
            } 
          } 
        } 
      } else {
        this.u = true;
        return;
      } 
    } catch (Exception exception) {
      System.out.println("err  Effect.update: " + this.a + "  " + this.b);
      exception.printStackTrace();
      ei.a.removeElement(this);
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ea.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */