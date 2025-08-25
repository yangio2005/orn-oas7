import javax.microedition.lcdui.Image;
import main.a;

public final class bo {
  public static el a = new el("vPopups");
  
  public int b = 100;
  
  private int l;
  
  public String[] c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public boolean h = false;
  
  private int m = 0;
  
  private int n;
  
  public de i;
  
  public boolean j = true;
  
  public boolean k = false;
  
  private static Image o;
  
  private static Image p;
  
  private static Image q;
  
  private static Image r;
  
  public static void a() {
    if (o == null)
      o = l.b("/mainImage/myTexture2dbd3.png"); 
    if (q == null)
      q = l.b("/mainImage/myTexture2dimgPopup.png"); 
    if (r == null)
      r = l.b("/mainImage/myTexture2dimgPopup2.png"); 
    if (p == null && l.c == 1)
      p = l.b("/mainImage/portal.png"); 
  }
  
  public bo(String paramString, int paramInt1, int paramInt2) {
    if (paramString.length() < 10)
      this.b = 60; 
    if (a.A == 128)
      this.b = 128; 
    this.c = di.f.a(paramString, this.b - 10);
    this.l = 7;
    this.d = paramInt1 - this.b / 2 - 1;
    this.e = paramInt2 - 15 + this.l - this.c.length * 12 - 10;
    this.f = this.b + 2;
    this.g = (this.c.length + 1) * 12 + 1;
    while (this.f % 10 != 0)
      this.f++; 
    while (this.g % 10 != 0)
      this.g++; 
    if (paramInt1 >= 0 && paramInt1 <= 24)
      this.d += this.f / 2 + 30; 
    if (paramInt1 <= bv.a * 24 && paramInt1 >= bv.a * 24 - 24)
      this.d -= this.f / 2 + 6; 
    while (this.d <= 30)
      this.d += 2; 
    while (this.d + this.f >= bv.a * 24 - 30)
      this.d -= 2; 
  }
  
  public final void a(String[] paramArrayOfString, int paramInt1, int paramInt2) {
    this.b = 0;
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (this.b < di.f.a(paramArrayOfString[b]))
        this.b = di.f.a(paramArrayOfString[b]); 
    } 
    this.b += 20;
    this.c = paramArrayOfString;
    this.l = 7;
    this.d = paramInt1 - this.b / 2 - 1;
    this.e = paramInt2 - 15 + this.l - this.c.length * 12 - 10;
    this.f = this.b + 2;
    this.g = (this.c.length + 1) * 12 + 1;
    while (this.f % 10 != 0)
      this.f++; 
    while (this.g % 10 != 0)
      this.g++; 
    if (paramInt1 >= 0 && paramInt1 <= 24)
      this.d += this.f / 2 + 30; 
    if (paramInt1 <= bv.a * 24 && paramInt1 >= bv.a * 24 - 24)
      this.d -= this.f / 2 + 6; 
    while (this.d <= 30)
      this.d += 2; 
    while (this.d + this.f >= bv.a * 24 - 30)
      this.d -= 2; 
  }
  
  public static void a(bo parambo) {
    a.addElement(parambo);
  }
  
  public static void a(en paramen, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean) {
    if (!paramBoolean) {
      paramen.a(0);
      paramen.d(paramInt1 + 6, paramInt2, paramInt3 - 14 + 1, paramInt4);
      paramen.d(paramInt1, paramInt2 + 6, paramInt3, paramInt4 - 12 + 1);
      paramen.a(paramInt5);
      paramen.d(paramInt1 + 6, paramInt2 + 1, paramInt3 - 12, paramInt4 - 2);
      paramen.d(paramInt1 + 1, paramInt2 + 6, paramInt3 - 2, paramInt4 - 12);
      paramen.a(o, 0, 0, 7, 6, 0, paramInt1, paramInt2, 0);
      paramen.a(o, 0, 0, 7, 6, 2, paramInt1 + paramInt3 - 7, paramInt2, 0);
      paramen.a(o, 0, 0, 7, 6, 6, paramInt1, paramInt2 + paramInt4 - 7, 0);
      paramen.a(o, 0, 0, 7, 6, 3, paramInt1 + paramInt3 - 7, paramInt2 + paramInt4 - 6, 0);
      return;
    } 
    Image image = (paramInt5 == 1) ? r : q;
    paramen.a(image, 0, 0, 10, 10, 0, paramInt1, paramInt2, 0);
    paramen.a(image, 0, 20, 10, 10, 0, paramInt1 + paramInt3 - 10, paramInt2, 0);
    paramen.a(image, 0, 50, 10, 10, 0, paramInt1, paramInt2 + paramInt4 - 10, 0);
    paramen.a(image, 0, 70, 10, 10, 0, paramInt1 + paramInt3 - 10, paramInt2 + paramInt4 - 10, 0);
    int i = ((paramInt3 - 20) % 10 == 0) ? ((paramInt3 - 20) / 10) : ((paramInt3 - 20) / 10 + 1);
    int j = ((paramInt4 - 20) % 10 == 0) ? ((paramInt4 - 20) / 10) : ((paramInt4 - 20) / 10 + 1);
    byte b;
    for (b = 0; b < i; b++)
      paramen.a(image, 0, 10, 10, 10, 0, paramInt1 + 10 + b * 10, paramInt2, 0); 
    for (b = 0; b < j; b++)
      paramen.a(image, 0, 30, 10, 10, 0, paramInt1, paramInt2 + 10 + b * 10, 0); 
    for (b = 0; b < i; b++)
      paramen.a(image, 0, 60, 10, 10, 0, paramInt1 + 10 + b * 10, paramInt2 + paramInt4 - 10, 0); 
    for (b = 0; b < j; b++)
      paramen.a(image, 0, 40, 10, 10, 0, paramInt1 + paramInt3 - 10, paramInt2 + 10 + b * 10, 0); 
    paramen.a((paramInt5 == 1) ? 12052656 : 16770503);
    paramen.d(paramInt1 + 10, paramInt2 + 10, paramInt3 - 20, paramInt4 - 20);
  }
  
  public final void a(int paramInt) {
    this.n = 10;
  }
  
  public static void a(en paramen) {
    for (byte b = 0; b < a.size(); b++) {
      en en1 = paramen;
      bo bo1;
      if ((bo1 = a.elementAt(b)).j && bo1.c != null && ae.m == null && !bo1.k) {
        if (l.c == 1) {
          int i = bo1.d;
          int j = bo1.e - a.ae;
          en1.e(i, j, bo1.f, bo1.g);
          en1.a(p, i, j, 0);
          if (bo1.f > 70)
            en1.a(p, i + 70, j, 0); 
          if (bo1.g > 30) {
            en1.a(p, i, j + 30, 0);
            if (bo1.f > 70)
              en1.a(p, i + 70, j + 30, 0); 
          } 
          en1.e(p.j, p.k, a.A, a.B);
        } else {
          boolean bool = (bo1.n == 0) ? false : true;
          int m = bo1.g;
          int k = bo1.f;
          int j = bo1.e - a.ae;
          int i = bo1.d;
          en en2 = en1;
          if (bool == true) {
            en2.a(i, j, k, m, 16777215);
          } else {
            en2.a(i, j, k, m, 0);
          } 
        } 
        for (byte b1 = 0; b1 < bo1.c.length; b1++)
          ((bo1.n == 0) ? di.c : di.g).a(en1, bo1.c[b1], bo1.d + bo1.f / 2, bo1.e + bo1.g / 2 - bo1.c.length * 12 / 2 + b1 * 12 - a.ae, 2); 
      } 
    } 
  }
  
  public static void b() {
    for (byte b = 0; b < a.size(); b++) {
      bo bo1 = a.elementAt(b);
      if ((af.e()).aD != null && (af.e()).aD.c == 0)
        if (bo1.d + bo1.f >= p.j && bo1.d <= a.A + p.j && bo1.e + bo1.g >= p.k && bo1.e <= a.B + p.k) {
          bo1.k = false;
        } else {
          bo1.k = true;
        }  
      if ((af.e()).aD == null || ((af.e()).aD != null && (af.e()).aD.c != 0))
        if (bo1.d + bo1.f / 2 >= (af.e()).B - 100 && bo1.d + bo1.f / 2 <= (af.e()).B + 100 && bo1.e + bo1.g >= p.k && bo1.e <= a.B + p.k) {
          bo1.k = false;
        } else {
          bo1.k = true;
        }  
      if (bo1.n > 0) {
        bo1.n--;
        if (bo1.n == 0 && bo1.i != null)
          bo1.i.a(); 
      } 
      if (bo1.h)
        if ((af.e()).aD != null) {
          if ((af.e()).aD.c == 0) {
            if ((af.e()).aD.a == 0)
              bo1.j = false; 
            if ((af.e()).aD.a == 1)
              bo1.j = true; 
            if ((af.e()).aD.a > 1 && (af.e()).aD.a < 6)
              bo1.j = false; 
          } else if (!bo1.j) {
            bo1.m++;
            if (bo1.m == 50)
              bo1.j = true; 
          } 
        } else if (!bo1.j) {
          v.i = false;
          bo1.m++;
          if (bo1.m == 50) {
            bo1.j = true;
            v.i = true;
          } 
        }  
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\bo.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */