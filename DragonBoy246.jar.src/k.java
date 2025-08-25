import javax.microedition.lcdui.Image;
import main.a;

public final class k extends do implements b {
  private static Image dl = l.b("/mainImage/myTexture2dhatdau.png");
  
  public int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public String e;
  
  public boolean f;
  
  public int[] g;
  
  public int[] h;
  
  private bo dm = new bo("", 0, 0);
  
  public boolean i;
  
  public static boolean j = true;
  
  public boolean k;
  
  public int l;
  
  public long m;
  
  public long n;
  
  private boolean dn;
  
  private int do = 0;
  
  public k(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    this.dm.i = new de(null, this, 1, null);
    bo.a(this.dm);
  }
  
  public final void a(en paramen) {
    if (this.a == 0)
      return; 
    bl.b(paramen, this.a, this.B, this.C, 0, cj.c);
    if ((af.e()).aT != null && (af.e()).aT.equals(this)) {
      paramen.a(aa.R, 0, 0, 9, 6, 0, this.B, this.C - bl.a[this.a][4] - 1, 33);
      if (this.e != null)
        di.n.a(paramen, this.e, this.B, this.C - bl.a[this.a][4] - 20, 2, di.o); 
    } else if (this.e != null) {
      di.n.a(paramen, this.e, this.B, this.C - bl.a[this.a][4] - 17, 2, di.o);
    } 
    try {
      for (byte b1 = 0; b1 < this.b; b1++)
        paramen.a(dl, this.B + this.g[b1] - bl.a[this.a][3] / 2, this.C + this.h[b1] - bl.a[this.a][4], 0); 
    } catch (Exception exception) {}
    if (this.bZ >= 0 && this.ca != null && this.aN == 0) {
      bl.b(paramen, (this.ca.a[this.bZ]).c, this.B + (this.ca.a[this.bZ]).a, this.C - 15 + (this.ca.a[this.bZ]).b, 0, 3);
      if (a.w % 2 == 0) {
        this.bZ++;
        if (this.bZ >= this.ca.a.length)
          this.bZ = 0; 
      } 
    } 
  }
  
  public final void a() {
    this.dm.j = j;
    this.n = System.currentTimeMillis();
    if (this.n - this.m >= 1000L) {
      this.l--;
      this.m = this.n;
      if (this.l < 0)
        this.l = 0; 
    } 
    if (!this.f) {
      if (this.b < this.d && this.l == 0)
        this.dn = true; 
    } else if (this.l == 0) {
      this.f = false;
      this.dn = true;
    } 
    if (this.dn) {
      this.do++;
      if (this.do == 20) {
        this.do = 0;
        this.dn = false;
        bt.a().f((byte)2);
      } 
    } 
    if (this.i) {
      this.i = false;
      if ((this.l >= 0 && this.b < this.d) || (this.l >= 0 && this.f) || this.k) {
        this.dm.a(new String[] { !this.f ? (String.valueOf(this.b) + "/" + this.d) : aw.cy, ai.b(this.l) }, this.B, this.C - 20 - bl.a[this.a][4]);
      } else if (this.b == this.d && !this.f) {
        this.dm.a(new String[] { aw.cI, String.valueOf(this.b) + "/" + this.d }, this.B, this.C - 20 - bl.a[this.a][4]);
      } 
    } 
    if ((this.l >= 0 && this.b < this.d) || (this.l >= 0 && this.f))
      this.dm.c[this.dm.c.length - 1] = ai.b(this.l); 
    if (this.k) {
      this.dm.j = false;
      at.a(98, this.B + this.g[this.b - 1] - bl.a[this.a][3] / 2, this.C + this.h[this.b - 1] - bl.a[this.a][4], 1);
      this.b--;
      if (a.w % 2 == 0)
        bu.a(); 
      if (this.b == this.c) {
        this.dm.j = true;
        this.i = true;
        this.k = false;
      } 
    } 
    super.a();
  }
  
  public final void a(int paramInt, Object paramObject) {
    if (paramInt == 1)
      bt.a().e((byte)1); 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\k.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */