import main.a;

public final class eo {
  public int[][] a = new int[3][];
  
  public ej b = new ej();
  
  private int j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  public int c;
  
  private int n;
  
  private int o;
  
  private int p;
  
  public int d;
  
  private int q;
  
  private int r;
  
  public boolean e;
  
  public boolean f = true;
  
  public int g;
  
  public int h;
  
  public de i;
  
  public eo() {
    for (byte b = 0; b < this.a.length; b++)
      this.a[b] = new int[3]; 
  }
  
  public final void a(en paramen) {
    if (equals(p.aE) && p.j().u())
      return; 
    if (equals(p.aE) && (p.j()).bQ != null)
      return; 
    if (!p.bt)
      return; 
    if (a.E != p.j() && a.E != ar.a())
      return; 
    if (ae.n != null)
      return; 
    if (!this.f)
      return; 
    if (af.bG)
      return; 
    if (a.G.a && equals(p.aE))
      return; 
    paramen.a(-paramen.a(), -paramen.b());
    paramen.e(0, 0, a.A, a.B);
    if (this.b != null)
      this.b.a(paramen, this.d, this.c, this.j); 
    if (this.b.b != null && this.b.b.c == null && this.a != null)
      bl.b(paramen, this.a[(af.e()).K][this.k], this.d, this.c + 3 + ((a.w % 10 > 5) ? 1 : 0), (this.j == 1) ? 0 : 2, cj.f); 
    paramen.a(-paramen.a(), -paramen.b());
  }
  
  public final void a() {
    if (this.b != null && this.b.a != null && this.b.a.size() == 0 && this.c != -40) {
      this.b.f--;
      if (this.b.f <= 0) {
        this.c = -40;
        this.b.e = 0;
        this.b.a.removeAllElements();
        this.b.d = null;
        this.b.f = 200;
      } 
    } 
    if (equals(p.aE) && (p.j()).bQ != null)
      return; 
    if (!this.f)
      return; 
    eo eo1;
    if ((eo1 = this).c != eo1.m) {
      eo1.o = eo1.m - eo1.c << 2;
      eo1.n += eo1.o;
      eo1.c += eo1.n >> 4;
      eo1.n &= 0xF;
    } 
    if (eo1.d != eo1.p) {
      eo1.r = eo1.p - eo1.d << 2;
      eo1.q += eo1.r;
      eo1.d += eo1.q >> 4;
      eo1.q &= 0xF;
    } 
    eo1.l++;
    if (eo1.l == 5) {
      eo1.l = 0;
      if (eo1.k == 0) {
        eo1.k = 1;
      } else {
        eo1.k = 0;
      } 
    } 
    if (this.b == null)
      return; 
    if (this.b != null && this.b.b == null)
      return; 
    if (!this.e) {
      if (this.g > 0) {
        this.g--;
        if (this.g == 0) {
          a.G.l();
          a.G.s();
        } 
      } 
      if (a.w % 3 == 0) {
        if ((af.e()).I == 1)
          this.p = (af.e()).B - 20 - p.j; 
        if ((af.e()).I == -1)
          this.p = (af.e()).B + 20 - p.j; 
        if (this.p <= 24)
          this.p += this.b.c / 2; 
        if (this.p >= a.A - 24)
          this.p -= this.b.c / 2; 
        this.m = (af.e()).C - 40 - p.k;
        if (this.b.d != null && this.m < (this.b.d.length + 1) * 12 + 10)
          this.m = (this.b.d.length + 1) * 12 + 10; 
        if (this.b.b.c != null)
          if (a.A - 50 > 155 + this.b.i) {
            this.p = a.A - 60 - this.b.i / 2;
            this.m = this.b.j + 10;
          } else {
            this.p = a.A - 20 - this.b.i / 2;
            this.m = 45 + this.b.j;
            if (a.A > a.B || a.A < 220) {
              this.p = a.A - 20 - this.b.i / 2;
              this.m = this.b.j + 10;
            } 
          }  
      } 
      if (this.d > (af.e()).B - p.j) {
        this.j = -1;
      } else {
        this.j = 1;
      } 
    } 
    if (this.b.b != null)
      if (this.b.a.size() > 1) {
        if (this.b.b.f == 0) {
          this.b.e++;
          if (this.b.e >= this.b.b.b) {
            this.b.e = 0;
            this.b.a.removeElementAt(0);
            r r = this.b.a.firstElement();
            this.b.b = r;
            this.b.c();
            return;
          } 
        } else {
          this.b.b.i = System.currentTimeMillis();
          if (this.b.b.i - this.b.b.h >= 1000L) {
            this.b.b.h = System.currentTimeMillis();
            this.b.b.f--;
          } 
          if (this.b.b.f == 0) {
            this.b.a.removeElementAt(0);
            if (this.b.a.size() == 0)
              return; 
            r r = this.b.a.firstElement();
            this.b.b = r;
            this.b.c();
            return;
          } 
        } 
      } else if (this.b.a.size() == 1) {
        if (this.b.b.f == 0) {
          this.b.e++;
          if (this.b.e >= this.b.b.b)
            this.e = true; 
          if (this.b.e == this.b.b.b) {
            this.m = -40;
            this.p = (af.e()).B - p.j + (((af.e()).I == 1) ? -20 : 20);
          } 
          if (this.b.e >= this.b.b.b + 20) {
            this.b.e = 0;
            this.b.a.removeAllElements();
            this.b.d = null;
            this.b.f = 200;
            return;
          } 
        } else {
          this.b.b.i = System.currentTimeMillis();
          if (this.b.b.i - this.b.b.h >= 1000L) {
            this.b.b.h = System.currentTimeMillis();
            this.b.b.f--;
          } 
          if (this.b.b.f == 0) {
            this.e = true;
            this.m = -40;
            this.p = (af.e()).B - p.j + (((af.e()).I == 1) ? -20 : 20);
            this.b.e = 0;
            this.b.a.removeAllElements();
            this.b.d = null;
            this.i = null;
          } 
        } 
      }  
  }
  
  public final void a(String paramString, af paramaf, boolean paramBoolean) {
    this.h = paramaf.J;
    this.b.a(paramString, 3, paramaf, paramBoolean);
    this.e = false;
  }
  
  public final void a(String paramString, int paramInt) {
    paramString = ds.a(paramString);
    if (this.b.a.size() > 0 && paramString.equals(((r)this.b.a.lastElement()).a))
      return; 
    if (this.b.a.size() > 10)
      for (byte b = 0; b < 5; b++)
        this.b.a.removeElementAt(0);  
    this.b.a(paramString, paramInt, (af)null, false);
    if (this.b.a.size() == 1) {
      this.c = 0;
      this.d = (af.e()).B - p.j + (((af.e()).I == 1) ? -20 : 20);
    } 
    this.e = false;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\eo.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */