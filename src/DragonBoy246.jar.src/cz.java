import javax.microedition.lcdui.Image;
import main.a;

public final class cz {
  public int a;
  
  public int b;
  
  public short c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public byte h;
  
  public int[] i;
  
  public int[] j;
  
  public static t k = new t("imgNew BgItem");
  
  public static el l = new el("vKeyNews");
  
  public static el m = new el("vKeyLast");
  
  public static byte[] n;
  
  private int o = 0;
  
  private int p = 0;
  
  private static int[] q = new int[] { 
      79, 80, 81, 85, 86, 90, 91, 92, 99, 100, 
      101, 102, 103, 104, 105, 106, 107, 108 };
  
  public static void a() {
    k.clear();
    l.removeAllElements();
    m.removeAllElements();
  }
  
  public static boolean a(String paramString) {
    for (byte b = 0; b < l.size(); b++) {
      String str;
      if ((str = l.elementAt(b)).equals(paramString))
        return true; 
    } 
    return false;
  }
  
  private boolean b() {
    for (byte b = 0; b < q.length; b++) {
      if (this.c == q[b])
        return true; 
    } 
    return false;
  }
  
  public final void a(en paramen) {
    if (af.bI)
      return; 
    if (this.c == 279 && (p.j()).bU >= 110)
      return; 
    int i = p.j;
    int j = p.k;
    Image image;
    if ((image = (Image)k.get((new StringBuffer(String.valueOf(this.c))).toString())) != null) {
      if (this.c == 96)
        return; 
      if (this.h == 4)
        this.o = -i / 2 + 100; 
      if (this.c == 28 && this.h == 3)
        this.o = -i / 3 + 200; 
      if ((this.c == 67 || this.c == 68 || this.c == 69 || this.c == 70) && this.h == 3)
        this.o = -i / 3 + 200; 
      if (b() && this.h < 4) {
        this.o = -(i >> 4) + 50;
        this.p = (j >> 5) - 15;
      } 
      int k = this.d + this.f + this.o;
      int m = this.e + this.g + this.p;
      if (this.d + this.f + image.getWidth() + this.o >= i && this.d + this.f + this.o <= i + a.A && this.e + this.g + this.p + image.getHeight() >= j && this.e + this.g + this.p <= j + a.B) {
        paramen.a(image, 0, 0, en.a(image), en.b(image), this.b, this.d + this.f + this.o, this.e + this.g + this.p, 0);
        if (this.c == 11 && bv.l != 122) {
          paramen.e(k, m + 24, 48, 14);
          for (byte b = 0; b < 2; b++)
            paramen.a(bv.h, 0, (a.w % 8 >> 2) * 24, 24, 24, 0, k + b * 24, m + 24, 0); 
          paramen.e(p.j, p.k, p.d, p.e);
        } 
      } 
      if (bv.g() && this.c > 137 && this.c != 156 && this.c != 159 && this.c != 157 && this.c != 165 && this.c != 167 && this.c != 168 && this.c != 169 && this.c != 170 && this.c != 238 && bv.c - this.d + this.f + this.o >= i && bv.c - this.d + this.f + this.o + image.getWidth() <= i + a.A && this.e + this.g + this.p + image.getHeight() >= j && this.e + this.g + this.p <= j + a.B && (this.c < 241 || this.c >= 266))
        paramen.a(image, 0, 0, en.a(image), en.b(image), 2, bv.c - this.d + this.f + this.o - en.a(image), this.e + this.g + this.p, 0); 
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\cz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */