import main.a;

public final class dr implements b {
  int a;
  
  private int p;
  
  int b;
  
  private int q;
  
  de c = new de(aw.bv, this, 1, null);
  
  de d = new de(aw.bi, this, 2, null);
  
  private int r = 24;
  
  public int e = 0;
  
  private int s = 50;
  
  public static dv f;
  
  public int g;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public boolean k;
  
  public boolean l;
  
  public String m;
  
  private el t = new el("vItems");
  
  int n;
  
  int o;
  
  public final void a(boolean paramBoolean) {
    af.e();
    this.k = true;
    this.l = false;
    dr dr1;
    if ((dr1 = this).l) {
      dr1.b = 170;
      dr1.q = 118;
      dr1.a = a.A / 2 - dr1.b / 2;
      dr1.p = a.B / 2 - dr1.q / 2;
    } else {
      dr1.b = 170;
      dr1.q = 170;
      dr1.a = a.A / 2 - dr1.b / 2;
      dr1.p = a.B / 2 - dr1.q / 2;
      if (a.B < 240)
        dr1.p -= 10; 
    } 
    dr1.h = dr1.a;
    dr1.g = 0;
    dr1.e = ak.f.size();
    if (a.e) {
      dr1.c.j = dr1.a;
      dr1.c.k = dr1.p + dr1.q + 5;
      dr1.d.j = dr1.a + dr1.b - 68;
      dr1.d.k = dr1.p + dr1.q + 5;
    } 
    (f = new dv()).a(dr1.e, dr1.r, dr1.a, dr1.p + dr1.s, dr1.b, dr1.q - dr1.s, true, 1);
  }
  
  private void a() {
    this.g = this.a + this.b;
  }
  
  public final void a(en paramen) {
    paramen.a(-this.h, 0);
    bo.a(paramen, this.a, this.p - 17, this.b, this.q + 17, -1, true);
    di.f.a(paramen, aw.dy, this.a + this.b / 2, this.p - 7, 2);
    ak ak;
    if (this.o >= 0 && this.o <= ak.f.size() - 1 && (ak = ak.f.elementAt(this.o)).c != null)
      af.e().a(paramen, ak.c, a.A / 2, this.p + 45, 1, false); 
    af.e().a(paramen, a.A / 2, this.p + 45, 1, (af.e()).as, false);
    paramen.e(this.a, this.p + this.s, this.b, this.q - this.s - 10);
    if (f != null)
      paramen.a(0, -f.d); 
    for (byte b1 = 0; b1 < this.e; b1++) {
      int i = this.a + 10;
      int j;
      if ((j = this.p + b1 * this.r + this.s) + this.r - ((f != null) ? f.d : 0) >= this.p + this.s && j - ((f != null) ? f.d : 0) <= this.p + this.s + this.q) {
        ak ak1 = ak.f.elementAt(b1);
        di di = di.o;
        if (b1 == this.o)
          di = di.q; 
        if (ak1.b != null)
          di.a(paramen, ak1.b, i + 20, j, 0); 
        if (ak1.d > 0) {
          di.a(paramen, String.valueOf(ak1.d) + " " + aw.bC, i + this.b - 20, j, 1);
        } else if (ak1.e > 0) {
          di.a(paramen, String.valueOf(ak1.e) + " " + aw.bD, i + this.b - 20, j, 1);
        } 
        if (ak1.c != null)
          bl.b(paramen, ak1.c[0], i, j, 0, 0); 
      } 
    } 
    paramen.a(0, -paramen.b());
    paramen.e(0, 0, a.A, a.B);
    cx.a(paramen, this.c, null, this.d);
  }
  
  public final void a(int paramInt, Object paramObject) {
    if (paramInt == 2)
      a(); 
    if (paramInt == 1 && !this.l && this.o >= 0) {
      a();
      if ((af.e()).ai == null) {
        bt.a().a((byte)2, ((ak)ak.f.elementAt(this.o)).a, this.m);
        return;
      } 
      bt.a().a((byte)4, ((ak)ak.f.elementAt(this.o)).a, "");
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\dr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */