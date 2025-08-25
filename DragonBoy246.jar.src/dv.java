import main.a;

public final class dv {
  public int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  private int p;
  
  private int q;
  
  public int i;
  
  public int j;
  
  public int k;
  
  public int l;
  
  private int r;
  
  private int s;
  
  private int[] t = new int[3];
  
  public boolean m;
  
  private boolean u;
  
  private int v;
  
  public int n;
  
  public int o;
  
  private int w;
  
  private boolean x = true;
  
  public final ca a() {
    if (this.x) {
      int n = 0;
      dv dv2;
      int i1 = (dv2 = this).p;
      int i2 = dv2.q;
      int i3 = dv2.i;
      int i4 = dv2.j;
      if (a.k)
        if (!dv2.m && a.b(i1, i2, i3, i4)) {
          for (i3 = 0; i3 < dv2.t.length; i3++)
            dv2.t[0] = a.q; 
          dv2.s = a.q;
          dv2.m = true;
          dv2.n = -1;
          dv2.u = (dv2.v != 0);
          dv2.v = 0;
        } else if (dv2.m) {
          dv2.r++;
          if (dv2.r > 5 && dv2.s == a.q && !dv2.u) {
            dv2.s = -1000;
            if (dv2.w > 1) {
              i3 = (dv2.b + a.q - i2) / dv2.o;
              n = (dv2.a + a.p - i1) / dv2.o;
              dv2.n = i3 * dv2.w + n;
            } else {
              dv2.n = (dv2.b + a.q - i2) / dv2.o;
            } 
          } 
          if ((i3 = a.q - dv2.t[0]) != 0 && dv2.n != -1)
            dv2.n = -1; 
          for (n = dv2.t.length - 1; n > 0; n--)
            dv2.t[n] = dv2.t[n - 1]; 
          dv2.t[0] = a.q;
          dv2.b -= i3;
          if (dv2.b < 0)
            dv2.b = 0; 
          if (dv2.b > dv2.l)
            dv2.b = dv2.l; 
          if (dv2.d < 0 || dv2.d > dv2.l)
            i3 /= 2; 
          dv2.d -= i3;
        }  
      i3 = 0;
      if (a.m && dv2.m) {
        n = a.q - dv2.t[0];
        a.m = false;
        if (ds.g(n) < 20 && ds.g(a.q - dv2.s) < 20 && !dv2.u) {
          dv2.v = 0;
          dv2.b = dv2.d;
          dv2.s = -1000;
          if (dv2.w > 1) {
            n = (dv2.b + a.q - i2) / dv2.o;
            i1 = (dv2.a + a.p - i1) / dv2.o;
            dv2.n = n * dv2.w + i1;
          } else {
            dv2.n = (dv2.b + a.q - i2) / dv2.o;
          } 
          dv2.r = 0;
          i3 = 1;
        } else if (dv2.n != -1 && dv2.r > 5) {
          dv2.r = 0;
          i3 = 1;
        } else if (dv2.n == -1 && !dv2.u) {
          if (dv2.d < 0) {
            dv2.b = 0;
          } else if (dv2.d > dv2.l) {
            dv2.b = dv2.l;
          } else {
            if ((n = a.q - dv2.t[0] + dv2.t[0] - dv2.t[1] + dv2.t[1] - dv2.t[2]) > 10) {
              n = 10;
            } else if (n < -10) {
              n = -10;
            } else {
              n = 0;
            } 
            dv2.v = -n * 100;
          } 
        } 
        dv2.m = false;
        dv2.r = 0;
        a.m = false;
      } 
      ca ca1;
      (ca1 = new ca()).b = dv2.n;
      ca1.c = i3;
      ca1.a = dv2.m;
      return ca1;
    } 
    dv dv1;
    int i = (dv1 = this).p;
    int j = dv1.q;
    int k = dv1.i;
    int m = dv1.j;
    if (a.k)
      if (!dv1.m && a.b(i, j, k, m)) {
        for (byte b = 0; b < dv1.t.length; b++)
          dv1.t[0] = a.p; 
        dv1.s = a.p;
        dv1.m = true;
        dv1.n = -1;
        dv1.u = (dv1.v != 0);
        dv1.v = 0;
      } else if (dv1.m) {
        dv1.r++;
        if (dv1.r > 5 && dv1.s == a.p && !dv1.u) {
          dv1.s = -1000;
          dv1.n = (dv1.a + a.p - i) / dv1.o;
        } 
        int n;
        if ((n = a.p - dv1.t[0]) != 0 && dv1.n != -1)
          dv1.n = -1; 
        for (m = dv1.t.length - 1; m > 0; m--)
          dv1.t[m] = dv1.t[m - 1]; 
        dv1.t[0] = a.p;
        dv1.a -= n;
        if (dv1.a < 0)
          dv1.a = 0; 
        if (dv1.a > dv1.k)
          dv1.a = dv1.k; 
        if (dv1.c < 0 || dv1.c > dv1.k)
          n /= 2; 
        dv1.c -= n;
      }  
    boolean bool = false;
    if (a.m && dv1.m) {
      m = a.p - dv1.t[0];
      a.m = false;
      if (ds.g(m) < 20 && ds.g(a.p - dv1.s) < 20 && !dv1.u) {
        dv1.v = 0;
        dv1.a = dv1.c;
        dv1.s = -1000;
        dv1.n = (dv1.a + a.p - i) / dv1.o;
        dv1.r = 0;
        bool = true;
      } else if (dv1.n != -1 && dv1.r > 5) {
        dv1.r = 0;
        bool = true;
      } else if (dv1.n == -1 && !dv1.u) {
        if (dv1.c < 0) {
          dv1.a = 0;
        } else if (dv1.c > dv1.k) {
          dv1.a = dv1.k;
        } else {
          if ((i = a.p - dv1.t[0] + dv1.t[0] - dv1.t[1] + dv1.t[1] - dv1.t[2]) > 10) {
            i = 10;
          } else if (i < -10) {
            i = -10;
          } else {
            i = 0;
          } 
          dv1.v = -i * 100;
        } 
      } 
      dv1.m = false;
      dv1.r = 0;
      a.m = false;
    } 
    ca ca;
    (ca = new ca()).b = dv1.n;
    ca.c = bool;
    ca.a = dv1.m;
    return ca;
  }
  
  public final void b() {
    if (this.v != 0 && !this.m) {
      if (this.x) {
        this.b += this.v / 100;
        if (this.b < 0) {
          this.b = 0;
        } else if (this.b > this.l) {
          this.b = this.l;
        } else {
          this.d = this.b;
        } 
      } else {
        this.a += this.v / 100;
        if (this.a < 0) {
          this.a = 0;
        } else if (this.a > this.k) {
          this.a = this.k;
        } else {
          this.c = this.a;
        } 
      } 
      this.v = this.v * 9 / 10;
      if (this.v < 100 && this.v > -100)
        this.v = 0; 
    } 
    if (this.c != this.a && !this.m) {
      this.e = this.a - this.c << 2;
      this.g += this.e;
      this.c += this.g >> 4;
      this.g &= 0xF;
    } 
    if (this.d != this.b && !this.m) {
      this.f = this.b - this.d << 2;
      this.h += this.f;
      this.d += this.h >> 4;
      this.h &= 0xF;
    } 
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, int paramInt7) {
    this.p = paramInt3;
    this.q = paramInt4;
    this.o = paramInt2;
    this.i = paramInt5;
    this.j = paramInt6;
    this.x = true;
    this.w = 1;
    paramInt3 = paramInt1;
    if (false)
      paramInt3++; 
    this.l = paramInt3 * paramInt2 - paramInt6;
    if (this.l < 0)
      this.l = 0; 
    if (this.k < 0)
      this.k = 0; 
  }
  
  public final void a(int paramInt) {
    if (this.x) {
      paramInt -= (this.j - this.o) / 2;
      this.b = paramInt;
      if (this.b < 0)
        this.b = 0; 
      if (this.b > this.l) {
        this.b = this.l;
        return;
      } 
    } else {
      paramInt -= (this.i - this.o) / 2;
      this.a = paramInt;
      if (this.a < 0)
        this.a = 0; 
      if (this.a > this.k)
        this.a = this.k; 
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\dv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */