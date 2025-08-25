import main.a;

public final class ab extends bb implements b {
  private de[] b;
  
  public static bg[] a;
  
  private int c;
  
  private int[] d = new int[] { a.A / 2 - 100, a.A / 2 - 100 };
  
  private int e = 0;
  
  private int[] f = new int[2];
  
  private int[] g = new int[] { a.A / 2 - 150, a.B / 2 - 100, 300, 200 };
  
  private int h = -35;
  
  private int i = -35;
  
  public final void b() {
    bs.c = false;
    af.bI = false;
    x.c = false;
    bs.m = false;
    p.j().a();
    super.b();
  }
  
  public final void c() {
    if (a.w % 10 > 2) {
      this.c = 1;
    } else {
      this.c = 0;
    } 
    byte b1;
    for (b1 = 0; b1 < this.b.length; b1++) {
      if (this.b[b1].c())
        this.b[b1].a(); 
    } 
    for (b1 = 0; b1 < this.d.length; b1++) {
      if (a.a(this.d[b1] + this.i, this.f[b1] + this.h, this.g[2], 60) && a.k) {
        this.e = b1;
        break;
      } 
    } 
    super.c();
  }
  
  public final void a(en paramen) {
    a.c(paramen);
    try {
      bo.a(paramen, this.g[0] - 10, this.g[1], this.g[2] + 20, this.g[3], 16777215, true);
      if (this.b != null)
        for (byte b1 = 0; b1 < this.b.length; b1++)
          this.b[b1].a(paramen);  
      if (a != null)
        for (byte b1 = 0; b1 < a.length; b1++) {
          bo.a(paramen, this.d[b1] - 20, this.f[b1] + this.h, this.g[2], 60, 16777215, false);
          av av1 = p.x[(a[b1]).c];
          av av2 = p.x[(a[b1]).e];
          av av3 = p.x[(a[b1]).d];
          bl.b(paramen, (av1.a[af.bC[this.c][0][0]]).a, this.d[b1] + af.bC[this.c][0][1] + (av1.a[af.bC[this.c][0][0]]).b, this.f[b1] - af.bC[this.c][0][2] + (av1.a[af.bC[this.c][0][0]]).c, 0, 0);
          bl.b(paramen, (av2.a[af.bC[this.c][1][0]]).a, this.d[b1] + af.bC[this.c][1][1] + (av2.a[af.bC[this.c][1][0]]).b, this.f[b1] - af.bC[this.c][1][2] + (av2.a[af.bC[this.c][1][0]]).c, 0, 0);
          bl.b(paramen, (av3.a[af.bC[this.c][2][0]]).a, this.d[b1] + af.bC[this.c][2][1] + (av3.a[af.bC[this.c][2][0]]).b, this.f[b1] - af.bC[this.c][2][2] + (av3.a[af.bC[this.c][2][0]]).c, 0, 0);
          if (this.e == b1) {
            di.d.a(paramen, (a[b1]).b, this.d[b1] + this.g[2] - 25, this.f[b1] + this.h, 1);
            di.d.a(paramen, String.valueOf(aw.dd) + " " + ds.b((a[b1]).f), this.d[b1] + this.g[2] - 25, this.f[b1] + this.h + di.d.a(), 1);
          } else {
            di.f.a(paramen, (a[b1]).b, this.d[b1] + this.g[2] - 25, this.f[b1] + this.h, 1);
            di.f.a(paramen, String.valueOf(aw.dd) + " " + ds.b((a[b1]).f), this.d[b1] + this.g[2] - 25, this.f[b1] + this.h + di.f.a(), 1);
          } 
        }  
    } catch (Exception exception) {}
    super.a(paramen);
  }
  
  public final void a(byte paramByte) {
    this.d = new int[paramByte];
    this.f = new int[paramByte];
    for (byte b1 = 0; b1 < paramByte; b1++) {
      this.d[b1] = this.g[0] + 20;
      this.f[b1] = b1 * 70 + this.g[1] + 50;
    } 
    this.b = new de[2];
    this.b[1] = new de("Vào game", this, 1, null, this.g[0] + this.g[2] - 80 - 80, this.g[1] + this.g[3] - 30);
    this.b[0] = new de("Trờ ra", this, 2, null, this.g[0] + this.g[2] - 80, this.g[1] + this.g[3] - 30);
  }
  
  public final void a(int paramInt, Object paramObject) {
    switch (paramInt) {
      case 1:
        if (this.e != -1) {
          a.i();
          bt.a().t((a[this.e]).a);
          return;
        } 
        break;
      case 2:
        a.e();
        break;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ab.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */