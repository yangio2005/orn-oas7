import javax.microedition.lcdui.Image;
import main.a;

public final class es {
  private static Image c = l.b("/mainImage/myTexture2dmobCapcha.png");
  
  private static int d;
  
  private static int e;
  
  private static int f;
  
  private static int g;
  
  private static int h;
  
  private static int i;
  
  private static int j;
  
  private static int k;
  
  public static boolean a;
  
  private static int l = 0;
  
  private static int m;
  
  private static int n;
  
  private static int o;
  
  public static boolean b;
  
  public static void a(en paramen, int paramInt1, int paramInt2) {
    if (!b) {
      if (a.w % 3 == 0) {
        if ((af.e()).I == 1)
          h = paramInt1 - 20 - p.j; 
        if ((af.e()).I == -1)
          h = paramInt1 + 20 - p.j; 
      } 
      d = (af.e()).C - 40 - p.k;
    } else {
      if (++l == 5) {
        b = false;
        l = 0;
      } 
      h = paramInt1 - p.j;
      d = paramInt2 - p.k;
    } 
    if (i > paramInt1 - p.j) {
      o = -1;
    } else {
      o = 1;
    } 
    paramen.a(p.br, i, e - 40, 3);
    bo.a(paramen, i - 25, e - 70, 50, 20, 16777215, false);
    di.f.a(paramen, (p.j()).bs, i, e - 65, 2);
    if (a) {
      a = false;
      ei.a(new ea(18, i + p.j, e + p.k, 2, 10, -1));
      (p.j()).aL = null;
      h = -p.j;
      d = -p.k;
    } 
    paramen.a(c, 0, n * 40, 40, 40, (o == 1) ? 0 : 2, i, e + 3 + ((a.w % 10 > 5) ? 1 : 0), 3);
    if (e != d) {
      g = d - e << 2;
      f += g;
      e += f >> 4;
      f &= 0xF;
    } 
    if (i != h) {
      k = h - i << 2;
      j += k;
      i += j >> 4;
      j &= 0xF;
    } 
    m = 0;
    if (++m == 5 && ++n > 2)
      n = 0; 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\es.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */