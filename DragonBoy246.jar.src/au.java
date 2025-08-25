import javax.microedition.lcdui.Image;
import main.a;

public final class au extends bb implements b {
  private static au f;
  
  private static Image g = l.b("/mainImage/myTexture2dfutherShip.png");
  
  private static Image h = l.b("/mainImage/taungam.png");
  
  public byte a;
  
  private int i = 5;
  
  private int[] j = new int[this.o];
  
  private int[] k = new int[this.o];
  
  private int[] l;
  
  private int[] m;
  
  private int n;
  
  private int o = 20;
  
  public short b;
  
  public short c;
  
  public long d;
  
  public long e;
  
  private boolean p;
  
  private boolean q;
  
  private int r;
  
  public au() {
    byte b1;
    for (b1 = 0; b1 < this.o; b1++) {
      this.j[b1] = ds.b(0, a.A);
      this.k[b1] = b1 * a.B / this.o;
    } 
    this.l = new int[this.o];
    this.m = new int[this.o];
    for (b1 = 0; b1 < this.o; b1++) {
      this.l[b1] = ds.b(0, a.A);
      this.m[b1] = b1 * a.B / this.o;
    } 
  }
  
  public static au a() {
    if (f == null)
      f = new au(); 
    return f;
  }
  
  public final void b() {
    this.p = false;
    this.q = false;
    if (af.e().Y() > 0 && this.a == 0) {
      this.cn = new de(aw.fZ, this, 1, null);
    } else {
      this.cn = null;
    } 
    this.r = 0;
    super.b();
  }
  
  public final void a(en paramen) {
    paramen.a((this.a == 0) ? 0 : 3056895);
    paramen.d(0, 0, a.A, a.B);
    byte b1;
    for (b1 = 0; b1 < this.o; b1++) {
      paramen.a((this.a == 0) ? 14802654 : 11140863);
      paramen.d(this.j[b1], this.k[b1], 10, 2);
    } 
    if (this.a == 0)
      paramen.a(g, 0, 0, 72, 95, 7, this.n + this.r, a.B / 2, 3); 
    if (this.a == 1)
      paramen.a(h, 0, 0, 144, 79, 2, this.n + this.r, a.B / 2, 3); 
    for (b1 = 0; b1 < this.o; b1++) {
      paramen.a((this.a == 0) ? 14935011 : 7536127);
      paramen.d(this.l[b1], this.m[b1], 18, 3);
    } 
    super.a(paramen);
  }
  
  public final void c() {
    if (this.a == 0) {
      if (!this.p)
        this.r = a.A / 2 * this.b / this.c; 
    } else {
      this.r += 2;
    } 
    ac.b = false;
    this.n = (((a.A / 2 + this.n) / 2 + this.n) / 2 + this.n) / 2;
    if (this.a == 1)
      this.n = 0; 
    byte b1;
    for (b1 = 0; b1 < this.o; b1++) {
      this.j[b1] = this.j[b1] - this.i / 2;
      if (this.j[b1] < -20)
        this.j[b1] = a.A; 
    } 
    for (b1 = 0; b1 < this.o; b1++) {
      this.l[b1] = this.l[b1] - this.i;
      if (this.l[b1] < -20)
        this.l[b1] = a.A; 
    } 
    if (a.w % 3 == 0)
      this.i += this.p ? 2 : 1; 
    if (this.i > (this.p ? 80 : 25))
      this.i = this.p ? 80 : 25; 
    this.e = System.currentTimeMillis();
    if (this.e - this.d >= 1000L) {
      this.b = (short)(this.b + 1);
      this.d = this.e;
    } 
    if (this.p)
      this.r += 3; 
    if (this.r >= a.A / 2 + 30 && !this.q) {
      this.q = true;
      bt.a().u();
    } 
    super.c();
  }
  
  public final void d() {
    super.d();
  }
  
  public final void a(int paramInt, Object paramObject) {
    if (paramInt == 1)
      a.a(aw.ga, new de(aw.bm, this, 2, null), new de(aw.bn, this, 3, null)); 
    if (paramInt == 2 && af.e().Y() > 0) {
      this.p = true;
      a.h();
      this.cn = null;
    } 
    if (paramInt == 3)
      a.h(); 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\au.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */