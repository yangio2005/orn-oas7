import javax.microedition.lcdui.Image;
import main.a;

public final class az {
  public boolean a;
  
  private el f;
  
  public int b;
  
  public int c;
  
  public int d;
  
  private int g;
  
  private int h;
  
  private static int[] i;
  
  private static int j;
  
  private static int k;
  
  private static int l;
  
  private static int m;
  
  private de n = new de(aw.bv, 0);
  
  private de o = new de(aw.bi, 0, a.A - 71, a.B - bb.cr + 1);
  
  private de p = null;
  
  private static Image q = l.b("/mainImage/myTexture2dbtMenu1.png");
  
  private static Image r = l.b("/mainImage/myTexture2dbtMenu2.png");
  
  private boolean s;
  
  public int e;
  
  private int t;
  
  private int u;
  
  private int v;
  
  private int[] w = new int[3];
  
  private boolean x;
  
  private boolean y;
  
  private int z;
  
  private int A;
  
  private boolean B;
  
  private boolean C;
  
  private int D;
  
  private int E;
  
  private boolean F;
  
  private boolean[] G;
  
  public final void a(el paramel, int paramInt) {
    a(paramel);
    this.s = true;
  }
  
  public final void a(el paramel, int paramInt1, int paramInt2) {
    a(paramel);
    this.c = paramInt1;
    this.d = paramInt2;
    while (this.d + this.h > a.B)
      this.d -= 2; 
  }
  
  public final void a(el paramel) {
    if (this.a)
      return; 
    this.F = false;
    this.B = false;
    this.C = false;
    this.e = 0;
    this.b = 0;
    de de1;
    if (paramel.size() == 1 && (de1 = paramel.elementAt(0)) != null && de1.b.equals(aw.cD)) {
      de1.a();
      this.a = false;
      bp.a();
      return;
    } 
    bu.a();
    this.G = new boolean[paramel.size()];
    byte b;
    for (b = 0; b < this.G.length; b++)
      this.G[b] = false; 
    this.s = false;
    ae.m = null;
    dc.x.removeAllElements();
    dc.z.removeAllElements();
    bp.c();
    if (paramel.size() == 0)
      return; 
    this.f = paramel;
    this.g = 60;
    this.h = 60;
    for (b = 0; b < paramel.size(); b++) {
      de de2;
      (de2 = paramel.elementAt(b)).f = false;
      di.n.a(de2.b);
      de2.c = di.n.a(de2.b, this.g - 10);
    } 
    i = new int[paramel.size()];
    this.c = (a.A - paramel.size() * this.g) / 2;
    if (this.c <= 0)
      this.c = 1; 
    this.d = a.B - this.h - cx.a + 1 - 1;
    if (a.e)
      this.d -= 3; 
    this.d += 27;
    for (b = 0; b < i.length; b++)
      i[b] = a.B; 
    this.a = true;
    this.b = 0;
    if ((l = this.f.size() * this.g - a.A) < 0)
      l = 0; 
    j = 0;
    k = 0;
    m = 50;
    this.t = paramel.size() * this.g - 1;
    if (this.t > a.A - 2)
      this.t = a.A - 2; 
    if (a.e)
      this.b = -1; 
  }
  
  private boolean c() {
    return ((!this.F && i[i.length - 1] > this.d) || (this.F && i[i.length - 1] < a.B));
  }
  
  public final void a() {
    if ((p.j()).bd && (p.j()).ba)
      return; 
    if (!this.a)
      return; 
    if (c())
      return; 
    int i = 0;
    if (a.i[2] || a.i[4]) {
      i = 1;
      this.b--;
      if (this.b < 0)
        this.b = this.f.size() - 1; 
    } else if (a.i[8] || a.i[6]) {
      i = 1;
      this.b++;
      if (this.b > this.f.size() - 1)
        this.b = 0; 
    } else if (a.i[5]) {
      this.z = 2;
    } else if (a.i[12] && !p.j().r()) {
      if (c())
        return; 
      if (this.n.e <= 0)
        this.z = 2; 
      bu.a();
    } else if (!p.j().r() && !this.s && (a.i[13] || bb.a(this.o))) {
      if (c())
        return; 
      if (!this.C)
        this.C = true; 
      this.F = true;
      bu.a();
    } 
    if (i) {
      if ((j = this.b * this.g + this.g - a.A / 2) > l)
        j = l; 
      if (j < 0)
        j = 0; 
      if (this.b == this.f.size() - 1 || this.b == 0)
        k = j; 
    } 
    i = 1;
    if (a.G.ai != null && a.G.ai.u)
      if (!a.a(a.G.ai.e, 0, a.G.ai.a + 2, a.G.ai.g)) {
        i = 1;
      } else {
        i = 0;
        a.G.ai.b();
      }  
    if (!this.s && a.m && !a.b(this.c, this.d, this.t, this.h) && !this.x && !p.j().r() && i) {
      if (c())
        return; 
      this.u = this.v = 0;
      this.x = false;
      a.l();
      this.F = true;
      this.C = true;
      bu.a();
      return;
    } 
    if (a.k)
      if (!this.x && a.b(this.c, this.d, this.t, this.h)) {
        for (i = 0; i < this.w.length; i++)
          this.w[0] = a.p; 
        this.v = a.p;
        this.x = true;
        this.y = (this.A != 0);
        this.A = 0;
      } else if (this.x) {
        this.u++;
        if (this.u > 5 && this.v == a.p && !this.y) {
          this.v = -1000;
          this.b = (j + a.p - this.c) / this.g;
        } 
        if ((i = a.p - this.w[0]) != 0 && this.b != -1)
          this.b = -1; 
        for (int j = this.w.length - 1; j > 0; j--)
          this.w[j] = this.w[j - 1]; 
        this.w[0] = a.p;
        if ((j -= i) < 0)
          j = 0; 
        if (j > l)
          j = l; 
        if (k < 0 || k > l)
          i /= 2; 
        k -= i;
      }  
    if (a.m && this.x) {
      i = a.p - this.w[0];
      a.m = false;
      if (ds.g(i) < 20 && ds.g(a.p - this.v) < 20 && !this.y) {
        this.A = 0;
        j = k;
        this.v = -1000;
        this.b = (j + a.p - this.c) / this.g;
        this.u = 0;
        this.z = 10;
      } else if (this.b != -1 && this.u > 5) {
        this.u = 0;
        this.z = 1;
      } else if (this.b == -1 && !this.y) {
        if (k < 0) {
          j = 0;
        } else if (k > l) {
          j = l;
        } else {
          int j;
          if ((j = a.p - this.w[0] + this.w[0] - this.w[1] + this.w[1] - this.w[2]) > 10) {
            j = 10;
          } else if (j < -10) {
            j = -10;
          } else {
            j = 0;
          } 
          this.A = -j * 100;
        } 
      } 
      this.x = false;
      this.u = 0;
      a.m = false;
    } 
    a.f();
    a.g();
  }
  
  public final void a(en paramen) {
    if ((p.j()).bd && (p.j()).ba)
      return; 
    paramen.a(-paramen.a(), -paramen.b());
    paramen.a(-k, 0);
    for (byte b = 0; b < this.f.size(); b++) {
      if (b == this.b) {
        paramen.a(r, this.c + b * this.g + 1, i[b] + 1, 0);
      } else {
        paramen.a(q, this.c + b * this.g + 1, i[b] + 1, 0);
      } 
      de de1;
      String[] arrayOfString;
      if ((arrayOfString = (de1 = this.f.elementAt(b)).c) == null)
        arrayOfString = new String[] { ((de)this.f.elementAt(b)).b }; 
      int i = i[b] + (this.h - arrayOfString.length * 14) / 2 + 1;
      for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
        if (b == this.b) {
          di.g.a(paramen, arrayOfString[b1], this.c + b * this.g + this.g / 2, i + b1 * 14, 2);
        } else if (de1.a) {
          di.a.a(paramen, arrayOfString[b1], this.c + b * this.g + this.g / 2, i + b1 * 14, 2);
        } else {
          di.f.a(paramen, arrayOfString[b1], this.c + b * this.g + this.g / 2, i + b1 * 14, 2);
        } 
      } 
    } 
    paramen.a(-paramen.a(), -paramen.b());
  }
  
  public final void b() {
    az az1;
    if ((az1 = this).A != 0 && !az1.x) {
      if ((j += az1.A / 100) < 0) {
        j = 0;
      } else if (j > l) {
        j = l;
      } else {
        k = j;
      } 
      az1.A = az1.A * 9 / 10;
      if (az1.A < 100 && az1.A > -100)
        az1.A = 0; 
    } 
    if (k != j && !az1.x) {
      az1.D = j - k << 2;
      az1.E += az1.D;
      k += az1.E >> 4;
      az1.E &= 0xF;
    } 
    if (!this.F) {
      this.e++;
      for (byte b = 0; b < i.length; b++) {
        if (i[b] > this.d) {
          int i;
          if ((i = i[b] - this.d >> 1) <= 0)
            i = 1; 
          if (this.e > b)
            i[b] = i[b] - i; 
        } 
      } 
      if (i[i.length - 1] <= this.d)
        this.e = 0; 
    } else {
      this.e++;
      for (byte b = 0; b < i.length; b++) {
        if (i[b] < a.B) {
          int i;
          if ((i = (a.B - i[b] >> 1) + 2) <= 0)
            i = 1; 
          if (this.e > b)
            i[b] = i[b] + i; 
        } 
      } 
      if (i[i.length - 1] >= a.B) {
        this.e = 0;
        az az2;
        (az2 = this).F = false;
        az2.a = false;
        bp.c();
        if (az2.C) {
          a.G.ai = null;
          af.x = null;
          if (a.H != null && a.H.ai != null)
            a.H.ai = null; 
        } else if (az2.B) {
          a.G.ai = null;
          if (a.H != null && a.H.ai != null)
            a.H.ai = null; 
          de de1;
          if (az2.b >= 0 && (de1 = az2.f.elementAt(az2.b)) != null) {
            bu.a();
            de1.a();
          } 
        } 
      } 
    } 
    if (m != 0 && (m >>= 1) < 0)
      m = 0; 
    if (c())
      return; 
    if (this.z > 0) {
      this.z--;
      if (this.z == 0) {
        if (this.b >= 0 && !this.G[this.b]) {
          this.F = true;
          this.B = true;
          a.G.ai = null;
          return;
        } 
        az1 = this;
        bp.c();
        de de1;
        if (az1.b >= 0 && (de1 = az1.f.elementAt(az1.b)) != null)
          de1.a(); 
      } 
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\az.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */