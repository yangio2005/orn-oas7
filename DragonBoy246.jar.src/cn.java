import javax.microedition.lcdui.Image;
import main.a;

public final class cn {
  public static el a = new el("vTeleport");
  
  public int b;
  
  public int c;
  
  private int f;
  
  private int g;
  
  private boolean h;
  
  private int i;
  
  public int d;
  
  private int j;
  
  private int k;
  
  private static Image[] l = new Image[5];
  
  private static Image m;
  
  private boolean n;
  
  private boolean o;
  
  private boolean p = false;
  
  public boolean e;
  
  private boolean q;
  
  private int r;
  
  private int s = 1;
  
  private int t;
  
  private int u;
  
  private boolean v;
  
  private boolean w;
  
  public cn(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6) {
    this.b = paramInt1;
    this.c = 5;
    this.i = paramInt2;
    ds.c("TELEPORT x= " + paramInt1 + " y= " + paramInt2 + " type= " + paramInt5);
    this.f = paramInt3;
    this.g = paramInt5;
    this.h = paramBoolean;
    this.j = paramInt4;
    this.k = paramInt6;
    this.r = 0;
    paramInt2 = 0;
    while (paramInt2 < 100) {
      paramInt2++;
      this.i += 12;
      if (bv.a(paramInt1, this.i, 2)) {
        if (this.i % 24 != 0)
          this.i -= this.i % 24; 
        break;
      } 
    } 
    ds.c("Y2= " + this.i + "--------------------------------------------------------------");
    this.o = true;
    this.n = false;
    if (this.k > 2) {
      this.i += 4;
      if (l[3] == null)
        l[3] = l.c("/mainImage/myTexture2dmaybay4a.png"); 
      if (l[4] == null)
        l[4] = l.c("/mainImage/myTexture2dmaybay4b.png"); 
      if (m == null)
        m = l.c("/mainImage/hole.png"); 
    } else if (l[paramInt6] == null) {
      l[paramInt6] = l.b("/mainImage/myTexture2dmaybay" + (paramInt6 + 1) + ".png");
    } 
    if (paramInt1 > p.j && paramInt1 < p.j + a.A && this.i > 100) {
      bu.a();
      bu.a();
      this.p = true;
      bu.a();
    } 
  }
  
  public static void a(cn paramcn) {
    a.addElement(paramcn);
  }
  
  public final void a(en paramen) {
    if (this.k > 2 && this.v)
      paramen.a(m, this.b, this.i + 20, cj.c); 
  }
  
  public final void b(en paramen) {
    if (af.bI)
      return; 
    if (this.b < p.j || this.b > p.j + a.A)
      return; 
    av av = p.x[this.f];
    byte b1 = 0;
    byte b2 = 0;
    if (this.k == 0) {
      b1 = 15;
      b2 = 40;
    } 
    if (this.k == 1) {
      b1 = 7;
      b2 = 55;
    } 
    if (this.k == 2) {
      b1 = 18;
      b2 = 52;
    } 
    if (this.q && this.k < 3)
      bl.b(paramen, (av.a[af.bC[0][0][0]]).a, this.b + ((this.j == 1) ? b1 : -b1), this.c - b2, (this.j == 1) ? 0 : 2, cj.a); 
    if (this.k < 3) {
      paramen.a(l[this.k], 0, 0, en.a(l[this.k]), en.b(l[this.k]), (this.j == 1) ? 2 : 0, this.b, this.c, cj.c);
      return;
    } 
    if (this.o) {
      if (this.r > 10) {
        paramen.a(l[4], 0, 0, en.a(l[4]), en.b(l[4]), (this.j == 1) ? 2 : 0, (this.j == 1) ? (this.b - 11) : (this.b + 11), this.c + 2, cj.c);
        return;
      } 
      paramen.a(l[3], 0, 0, en.a(l[3]), en.b(l[3]), (this.j == 1) ? 2 : 0, this.b, this.c, cj.c);
      return;
    } 
    if (this.r < 20) {
      paramen.a(l[4], 0, 0, en.a(l[4]), en.b(l[4]), (this.j == 1) ? 2 : 0, (this.j == 1) ? (this.b - 11) : (this.b + 11), this.c + 2, cj.c);
      return;
    } 
    paramen.a(l[3], 0, 0, en.a(l[3]), en.b(l[3]), (this.j == 1) ? 2 : 0, this.b, this.c, cj.c);
  }
  
  public final void a() {
    if (this.k > 2 && this.e && this.c != -80)
      if (this.o && this.r == 0) {
        if (a.w % 3 == 0)
          at.a(1, this.b, this.c, 1, 0); 
      } else if (this.n && a.w % 3 == 0) {
        at.a(1, this.b, this.c + 16, 1, 1);
      }  
    this.t++;
    if (this.t > 3)
      this.t = 0; 
    if (this.o) {
      this.e = true;
      this.q = !(this.g == 0);
      if (this.k < 3) {
        int i;
        if ((i = this.i - this.c >> 3) <= 0) {
          i = 1;
          this.e = false;
        } 
        this.c += i;
      } else {
        if (a.w % 2 == 0)
          this.s++; 
        if (this.i - this.c < this.s) {
          this.c = this.i;
          this.e = false;
        } else {
          this.c += this.s;
        } 
      } 
      if (this.h && this.g == 1 && (af.e()).s) {
        (af.e()).B = this.b;
        (af.e()).C = this.c - 30;
        (af.e()).H = 4;
        p.l = this.b - p.f;
        p.m = this.c - p.g - 1;
        p.aD.f = false;
      } 
      if (p.b(this.d) != null && !this.h && this.g == 1 && (p.b(this.d)).s) {
        (p.b(this.d)).B = this.b;
        (p.b(this.d)).C = this.c - 30;
        (p.b(this.d)).H = 4;
      } 
      if (ds.g(this.c - this.i) < 50 && bv.a(this.b, this.c, 2)) {
        this.v = true;
        if (this.k < 3) {
          bu.a();
          if (this.c % 24 != 0)
            this.c -= this.c % 24; 
          this.r++;
          if (this.r > 10) {
            this.r = 0;
            this.o = false;
            this.n = true;
            this.e = false;
          } 
          if (this.g == 1) {
            if (this.h) {
              (af.e()).s = false;
            } else if (p.b(this.d) != null) {
              (p.b(this.d)).s = false;
            } 
            this.q = false;
          } 
        } else {
          this.c = this.i;
          if (!this.w) {
            at.a(92, this.b + 4, this.c + 14, 1, 0);
            p.bu = 10;
            this.w = true;
          } 
          this.r++;
          if (this.r > 30) {
            this.r = 0;
            this.o = false;
            this.n = true;
            this.e = false;
          } 
          if (this.g == 1) {
            if (this.h) {
              (af.e()).s = false;
            } else if (p.b(this.d) != null) {
              (p.b(this.d)).s = false;
            } 
            this.q = false;
          } 
        } 
      } 
    } else if (this.n) {
      this.r++;
      if (this.r > 30) {
        int i;
        if ((i = this.i + 24 - this.c >> 3) > 30)
          i = 30; 
        this.c -= i;
        this.e = true;
      } else {
        if (this.r == 14 && this.p)
          bu.a(); 
        if (this.r > 0 && this.g == 0) {
          if (this.h) {
            (af.e()).s = false;
            if ((af.e()).H != 14)
              (af.e()).H = 3; 
            (af.e()).E = -3;
          } else if (p.b(this.d) != null) {
            (p.b(this.d)).s = false;
            if ((p.b(this.d)).H != 14)
              (p.b(this.d)).H = 3; 
            (p.b(this.d)).E = -3;
          } 
          this.q = false;
        } 
        if (this.r > 12 && this.g == 0) {
          if (this.h) {
            (af.e()).s = true;
          } else if (p.b(this.d) != null) {
            (p.b(this.d)).B = this.b;
            (p.b(this.d)).C = this.c;
            (p.b(this.d)).s = true;
          } 
          this.q = true;
        } 
      } 
      if (this.h) {
        if (this.g == 0) {
          p.l = this.b - p.f;
          p.m = this.c - p.g - 1;
        } 
        if (this.g == 1)
          p.aD.f = true; 
      } 
      if (this.c <= -80) {
        if (this.h && this.g == 0) {
          ac.b = false;
          af.bG = true;
        } 
        if (!this.h && p.b(this.d) != null && this.g == 0)
          p.D.removeElement(p.b(this.d)); 
        if (this.k < 3) {
          a.removeElement(this);
        } else {
          this.c = -80;
          this.u++;
          if (this.u > 80) {
            this.u = 0;
            a.removeElement(this);
          } 
        } 
      } 
    } 
    if (this.e && this.k < 3 && ds.g(this.c - this.i) <= 50 && a.w % 5 == 0) {
      ea ea;
      ei.a(ea = new ea(19, this.b, this.i + 20, 2, 1, -1));
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\cn.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */