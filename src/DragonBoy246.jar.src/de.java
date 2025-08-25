import javax.microedition.lcdui.Image;
import main.a;

public final class de {
  public boolean a = false;
  
  public String b;
  
  public String[] c;
  
  public b d;
  
  public int e;
  
  public boolean f = true;
  
  public Image g;
  
  public Image h;
  
  public Image i;
  
  public int j = 0;
  
  public int k = 0;
  
  public int l = bb.cq;
  
  public int m = bb.cr;
  
  public boolean n = false;
  
  public Object o;
  
  public String p = "";
  
  private static Image s = l.b("/mainImage/btn0left.png");
  
  private static Image t = l.b("/mainImage/btn0mid.png");
  
  private static Image u = l.b("/mainImage/btn0right.png");
  
  private static Image v = l.b("/mainImage/btn1left.png");
  
  private static Image w = l.b("/mainImage/btn1mid.png");
  
  private static Image x = l.b("/mainImage/btn1right.png");
  
  public boolean q;
  
  public boolean r;
  
  public de(String paramString, b paramb, int paramInt1, Object paramObject, int paramInt2, int paramInt3) {
    this.b = paramString;
    this.e = paramInt1;
    this.d = paramb;
    this.o = null;
    this.j = paramInt2;
    this.k = paramInt3;
  }
  
  public de(String paramString, b paramb, int paramInt, Object paramObject) {
    this.b = paramString;
    this.e = paramInt;
    this.d = paramb;
    this.o = paramObject;
  }
  
  public de(String paramString, int paramInt, Object paramObject) {
    this.b = paramString;
    this.e = paramInt;
    this.o = paramObject;
  }
  
  public de(String paramString, int paramInt) {
    this.b = paramString;
    this.e = paramInt;
  }
  
  public de(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    this.b = paramString;
    this.e = 0;
    this.j = paramInt2;
    this.k = paramInt3;
  }
  
  public final void a() {
    a.l();
    if (this.f && ((this.b != null && !this.b.equals("") && !this.b.equals(aw.cD)) || this.g != null))
      bu.a(); 
    if (this.e > 0) {
      if (this.d != null) {
        this.d.a(this.e, this.o);
        return;
      } 
      p.j().a(this.e, this.o);
    } 
  }
  
  public final void b() {
    this.l = 160;
  }
  
  public final void a(en paramen) {
    if (this.g != null) {
      paramen.a(this.g, this.j, this.k, 0);
      if (this.n)
        if (this.h == null) {
          if (this.q) {
            paramen.a(ce.f, this.j + 8, this.k + 8, 3);
          } else {
            paramen.a(ce.f, this.j - (this.g.equals(p.at) ? 10 : 0), this.k, 0);
          } 
        } else {
          paramen.a(this.h, this.j, this.k, 0);
        }  
      if (this.b != "" && this.b != null) {
        if (!this.n) {
          di.f.a(paramen, this.b, this.j + en.a(this.g) / 2, this.k + en.b(this.g) / 2 - 5, 2);
          return;
        } 
        di.g.a(paramen, this.b, this.j + en.a(this.g) / 2, this.k + en.b(this.g) / 2 - 5, 2);
      } 
      return;
    } 
    if (this.b != "")
      if (!this.n) {
        a(s, t, u, this.j, this.k, this.l, paramen);
      } else {
        a(v, w, x, this.j, this.k, this.l, paramen);
      }  
    int i = 0;
    int j = this.j + this.l / 2;
    if (this.i != null) {
      i = this.i.getWidth();
      j = this.j + i;
      if (!this.n) {
        paramen.a(this.i, this.j, this.k, 0);
      } else {
        paramen.a(this.i, this.j, this.k + 1, 0);
      } 
    } 
    if (!this.n) {
      di.f.a(paramen, this.b, j, this.k + 7, (i == 0) ? 2 : 0);
      return;
    } 
    di.g.a(paramen, this.b, j, this.k + 7, (i == 0) ? 2 : 0);
  }
  
  private static void a(Image paramImage1, Image paramImage2, Image paramImage3, int paramInt1, int paramInt2, int paramInt3, en paramen) {
    int i;
    for (i = 10; i <= paramInt3 - 20; i += 10)
      paramen.a(paramImage2, paramInt1 + i, paramInt2, 0); 
    if ((i = paramInt3 % 10) > 0)
      paramen.a(paramImage2, 0, 0, i, 24, 0, paramInt1 + paramInt3 - 10 - i, paramInt2, 0); 
    paramen.a(paramImage1, paramInt1, paramInt2, 0);
    paramen.a(paramImage3, paramInt1 + paramInt3 - 10, paramInt2, 0);
  }
  
  public final boolean c() {
    this.n = false;
    if (a.a(this.j, this.k, this.l, this.m)) {
      if (a.k)
        this.n = true; 
      if (a.m)
        return true; 
    } 
    return false;
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    this.n = false;
    if (a.a(this.j, this.k - paramInt2, this.l, this.m)) {
      if (a.k)
        this.n = true; 
      if (a.m)
        return true; 
    } 
    return false;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\de.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */