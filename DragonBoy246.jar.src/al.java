import main.a;

public final class al extends af {
  private static ck a;
  
  private static ck b;
  
  private int c = 0;
  
  private int d;
  
  private boolean e;
  
  private ea f;
  
  private af g;
  
  private int h;
  
  private int i;
  
  private af[] j;
  
  private long[] k;
  
  private int l;
  
  private int[] m = new int[] { 
      0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 
      5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 
      5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
  
  private int[] n = new int[] { 
      0, 0, 6, 6, 7, 7, 8, 8, 9, 9, 
      9, 9, 9, 10, 10 };
  
  private int[] df = new int[] { 
      0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 
      5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 
      10, 10, 11, 11, 12, 12 };
  
  private int[] dg = new int[] { 13, 13, 14, 14, 15, 15, 16, 16 };
  
  private int[][] dh = new int[][] { this.m, this.n, this.df, this.dg };
  
  private byte di = -1;
  
  private int dj;
  
  private int dk;
  
  public final void c(int paramInt) {
    this.f = new ea(105, this.B, this.C + 20, 2, 1, -1);
    ei.a(this.f);
    if (paramInt == (af.e()).J) {
      this.g = af.e();
      return;
    } 
    this.g = p.b(paramInt);
  }
  
  public final void a(int[] paramArrayOfint) {
    if (this.di == 0) {
      if (this.c == 11) {
        this.e = true;
        ea ea1;
        ei.a(ea1 = new ea(19, this.B, this.C + 20, 2, 1, -1));
      } 
      if (this.c >= paramArrayOfint.length - 1) {
        this.di = 2;
        return;
      } 
    } 
    if (this.di == 1 && this.c == paramArrayOfint.length - 1) {
      this.di = 3;
      this.C -= 15;
      return;
    } 
    this.c++;
    if (this.c > paramArrayOfint.length - 1)
      this.c = 0; 
    this.dj = paramArrayOfint[this.c];
  }
  
  public al() {
    a = null;
    a = new ck();
    String str = "/x" + en.b + "/effectdata/" + 'f' + "/data";
    try {
      a.b(str);
      a.a = l.c("/effectdata/102/img.png");
    } catch (Exception exception) {}
    b = null;
    b = new ck();
    str = "/x" + en.b + "/effectdata/" + 'g' + "/data";
    try {
      b.b(str);
      b.a = l.c("/effectdata/103/img.png");
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void a(byte paramByte, short paramShort1, short paramShort2, af[] paramArrayOfaf, long[] paramArrayOflong) {
    this.di = paramByte;
    this.h = paramShort1;
    this.i = paramShort2;
    this.d = this.I;
    this.I = (this.h > this.B) ? 1 : -1;
    this.j = paramArrayOfaf;
    this.k = paramArrayOflong;
  }
  
  public final void a() {
    if (this.g != null)
      if (this.f.e >= 30) {
        this.f.f += (this.B - this.f.f) / 4;
        this.f.g += (this.C - this.f.g) / 4;
        this.g.B = this.f.f;
        this.g.C = this.f.g;
        this.g.ck = true;
      } else {
        this.f.k = (this.f.f > this.g.B) ? 1 : 0;
        this.f.f += (this.g.B - this.f.f) / 3;
        this.f.g += (this.g.C - this.f.g) / 3;
      }  
    if (this.di != -1) {
      if (this.di == 0 && this.e && a.w % 2 == 0) {
        this.l += (this.h > this.B) ? 30 : -30;
        ea ea1;
        (ea1 = new ea(103, this.B + this.l, this.C + 20, 2, 1, -1)).k = (this.h > this.B) ? 0 : 1;
        ei.a(ea1);
        if ((this.I == 1 && this.B + this.l >= this.h) || (this.I == -1 && this.B + this.l <= this.h)) {
          this.e = false;
          this.di = -1;
          this.l = 0;
          this.c = 0;
          this.I = this.d;
          for (byte b = 0; b < this.j.length; b++)
            this.j[b].a(this.k[b], 0L, false, false); 
        } 
      } 
      if (this.di == 3) {
        this.h = (this.j[this.dk]).B;
        this.i = (this.j[this.dk]).C;
        this.B += (this.h - this.B) / 3;
        this.C += (this.i - this.C) / 3;
        if (a.w % 5 == 0) {
          ea ea1;
          ei.a(ea1 = new ea(19, this.B, this.C, 2, 1, -1));
        } 
        if (ds.g(this.B - this.h) <= 20 && ds.g(this.C - this.i) <= 20) {
          this.B = this.h;
          this.C = this.i;
          this.j[this.dk].a(this.k[this.dk], 0L, false, false);
          this.dk++;
          if (this.dk == this.j.length) {
            this.di = -1;
            this.dk = 0;
          } 
        } 
      } 
      return;
    } 
    super.a();
  }
  
  public final void a(en paramen) {
    if (this.di != -1) {
      c(paramen);
      paramen.a(0, a.ae);
      a(this.dh[this.di]);
      if (this.di == 0 || this.di == 1) {
        a.a(paramen, this.dj, this.B, this.C + this.bS, (this.I == 1) ? 0 : 1, 2);
      } else {
        b.a(paramen, this.dj, this.B, this.C + this.bS, (this.I == 1) ? 0 : 1, 2);
      } 
      paramen.a(0, -a.ae);
      return;
    } 
    super.a(paramen);
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\al.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */