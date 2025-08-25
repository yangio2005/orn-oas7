import java.util.Random;
import java.util.Vector;
import main.a;

public final class du {
  private static Random a = new Random();
  
  private static Vector b = new Vector();
  
  private static int c;
  
  private static int d;
  
  private static int e;
  
  private static int f;
  
  private static int g;
  
  private static int h;
  
  private static int i;
  
  private static float j;
  
  private static int[] k = new int[3];
  
  private static int[] l = new int[3];
  
  private static boolean m = false;
  
  private static long n = 0L;
  
  private static long o = 150L;
  
  public static void a(en paramen) {
    if (m) {
      l[2] = l[1];
      k[2] = k[1];
      l[1] = l[0];
      k[1] = k[0];
      l[0] = d;
      k[0] = c;
      c = (int)(Math.cos(e * Math.PI / 180.0D) * i * h) + f;
      d = (int)(i * Math.sin(e * Math.PI / 180.0D) * h - (0.0F * h * h / 2.0F));
      if (System.currentTimeMillis() - n >= o) {
        h++;
        n = System.currentTimeMillis();
      } 
    } 
    if (h > 32 && m) {
      m = false;
      b.removeAllElements();
      b.addElement(new ad(ds.b(50, a.A - 50), ds.b(a.B - 100, a.B), 5, 72));
    } 
    paramen.a(0);
    paramen.d(0, 0, 0, 0);
    paramen.a(16711680);
    for (byte b = 0; b < b.size(); b++) {
      en en1 = paramen;
      ad ad = b.elementAt(b);
      for (byte b1 = 0; b1 < ad.a.size(); b1++) {
        aj aj;
        if ((aj = ad.a.elementAt(b1)).f < -200)
          ad.a.removeElementAt(b1); 
        en en2 = en1;
        aj = aj;
        aj.a(en2, aj.a - aj.e, aj.b - aj.f, aj.j);
        for (byte b2 = 0; b2 < 2; b2++)
          aj.a(en2, aj.a - aj.o[b2], aj.b - aj.p[b2], aj.j); 
        if (aj.n) {
          aj = aj;
          if (System.currentTimeMillis() - aj.l >= aj.m) {
            aj.i++;
            aj.l = System.currentTimeMillis();
            aj.o[1] = aj.o[0];
            aj.p[1] = aj.p[0];
            aj.o[0] = aj.e;
            aj.p[0] = aj.f;
            aj.e = (int)(Math.cos(aj.h * Math.PI / 180.0D) * aj.c * aj.i) + aj.d;
            aj.f = (int)(aj.c * Math.sin(aj.h * Math.PI / 180.0D) * aj.i - (aj.k * aj.i * aj.i / 2.0F)) + aj.g;
          } 
        } 
      } 
    } 
    if (!m) {
      int i;
      if ((i = -(Math.abs(a.nextInt() % 3) + 5)) == -5 && !m) {
        f = 0;
        e = 80;
        m = true;
        a();
        return;
      } 
      if (i == -7 && !m) {
        e = 60;
        f = 0;
        m = true;
        a();
        return;
      } 
      if (i == -6 && !m) {
        e = 120;
        f = 0;
        m = true;
        a();
      } 
    } 
  }
  
  private static void a() {
    g = 0;
    i = 16;
    h = 0;
    j = 0.0F;
    for (byte b = 0; b < 3; b++) {
      l[b] = 0;
      k[b] = f;
    } 
    m = true;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\du.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */