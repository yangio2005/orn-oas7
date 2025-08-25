import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;

public final class bv {
  public static int a;
  
  public static int b;
  
  public static int c;
  
  public static int d;
  
  public static int e;
  
  private static int I = -1;
  
  public static int[] f;
  
  public static int[] g;
  
  private static Image[] J;
  
  private static Image K;
  
  private static Image L;
  
  public static Image h;
  
  private static Image M;
  
  private static Image N;
  
  public static byte i = 24;
  
  private static int O;
  
  private static int P;
  
  private static int Q;
  
  private static int R;
  
  public static boolean j = false;
  
  public static String k = "";
  
  public static int l;
  
  public static int m = -1;
  
  public static int n;
  
  public static int o;
  
  public static int p;
  
  public static int q = -1;
  
  public static byte r;
  
  public static byte s = -1;
  
  public static el t = new el("vGO");
  
  public static el u = new el("vItemBg");
  
  public static el v = new el("vCurrItem");
  
  public static String[] w;
  
  public static Image x = l.b("/mainImage/myTexture2dbong.png");
  
  private static int[] S = new int[] { 21, 22, 23, 39, 40, 41 };
  
  public static int[][] y;
  
  public static int[][][] z;
  
  public static Image A = l.b("/bg/light.png");
  
  public static int B;
  
  public static int C;
  
  public static int D;
  
  public static int E;
  
  public static int F;
  
  public static int G;
  
  public static int H = 0;
  
  public static boolean a() {
    return (l == 51 || l == 103 || l == 112 || l == 113 || l == 129 || l == 130);
  }
  
  public static boolean b() {
    return (l == 39 || l == 40 || l == 41);
  }
  
  public static boolean c() {
    return (p.bY != null && l == p.bY.l);
  }
  
  public static cz a(int paramInt) {
    for (byte b = 0; b < u.size(); b++) {
      cz cz;
      if ((cz = u.elementAt(b)).a == paramInt)
        return cz; 
    } 
    return null;
  }
  
  public static boolean d() {
    for (byte b = 0; b < S.length; b++) {
      if (l == S[b])
        return true; 
    } 
    return false;
  }
  
  public static boolean b(int paramInt) {
    if (paramInt == 156 || paramInt == 330 || paramInt == 345 || paramInt == 334)
      return false; 
    if (l == 54 || l == 55 || l == 56 || l == 57 || l == 58 || l == 59 || l == 103)
      return false; 
    byte b1 = 0;
    for (byte b2 = 0; b2 < v.size(); b2++) {
      cz cz;
      if ((cz = v.elementAt(b2)).a == paramInt)
        b1++; 
    } 
    return (b1 > 2);
  }
  
  public static final void e() {
    if (K == null)
      K = l.a("/tWater/wtf.png"); 
    if (L == null)
      L = l.a("/tWater/twtf.png"); 
    if (h == null)
      h = l.a("/tWater/wts.png"); 
    if (M == null)
      M = l.a("/tWater/wtsN.png"); 
    if (N == null)
      N = l.a("/tWater/wtsN2.png"); 
    System.gc();
  }
  
  public static void c(int paramInt) {
    d = b * i;
    c = a * i;
    paramInt--;
    try {
      for (byte b = 0; b < a * b; b++) {
        for (byte b1 = 0; b1 < (y[paramInt]).length; b1++) {
          int i = y[paramInt][b1];
          int[] arrayOfInt = z[paramInt][b1];
          byte b2 = b;
          for (byte b3 = 0; b3 < arrayOfInt.length; b3++) {
            if (f[b2] == arrayOfInt[b3]) {
              g[b2] = g[b2] | i;
              break;
            } 
          } 
        } 
      } 
      return;
    } catch (Exception exception) {
      System.out.println("Error Load Map");
      exception.printStackTrace();
      GameMidlet.f.a();
      return;
    } 
  }
  
  public static boolean f() {
    return (l == 45 || l == 46 || l == 48);
  }
  
  public static boolean g() {
    return (j || l == 45 || l == 46 || l == 48 || l == 51 || l == 52 || l == 103 || l == 112 || l == 113 || l == 115 || l == 117 || l == 118 || l == 119 || l == 120 || l == 121 || l == 125 || l == 129 || l == 130);
  }
  
  private static void a(en paramen, int paramInt1, int paramInt2, int paramInt3) {
    try {
      if (J == null)
        return; 
      if (J.length == 1) {
        paramen.a(J[0], 0, paramInt1 * i, i, i, 0, paramInt2 * i, paramInt3 * i, 0);
      } else {
        paramen.a(J[paramInt1], paramInt2 * i, paramInt3 * i, 0);
        return;
      } 
    } catch (Exception exception) {}
  }
  
  private static void a(en paramen, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    try {
      if (J == null)
        return; 
      if (J.length == 1) {
        paramen.a(J[0], 0, paramInt1 * 24, 24, 24, 0, paramInt2, paramInt3, 0);
        return;
      } 
      paramen.a(J[paramInt1], paramInt2, paramInt3, 0);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static final void a(en paramen) {
    try {
      if (af.bI)
        return; 
      p.j();
      p.a(paramen, 1);
      int i;
      for (i = p.o; i < p.q; i++) {
        for (int j = p.p; j < p.r; j++) {
          if (i != 0 && i != a - 1) {
            int k = f[j * a + i] - 1;
            if ((a(i, j) & 0x100) != 256)
              if ((a(i, j) & 0x20) == 32) {
                paramen.a(K, 0, 24 * (a.w % 8 >> 1), 24, 24, 0, i * i, j * i, 0);
              } else if ((a(i, j) & 0x80) == 128) {
                paramen.a(L, 0, 24 * (a.w % 8 >> 1), 24, 24, 0, i * i, j * i, 0);
              } else if (e != 13 || k == -1) {
                if (e == 2 && (a(i, j) & 0x200) == 512 && k != -1) {
                  a(paramen, k, i * i, j * i, 24);
                  a(paramen, k, i * i, j * i + 1, 24);
                } 
                if ((a(i, j) & 0x10) == 16) {
                  P = (O = i * i - p.j) - p.f;
                  Q = (R = (i - 2) * P / i) + p.f;
                  a(paramen, k, Q + p.j, j * i, 24);
                } else if ((a(i, j) & 0x200) == 512) {
                  if (k != -1) {
                    a(paramen, k, i * i, j * i, 24);
                    a(paramen, k, i * i, j * i + 1, 24);
                  } 
                } else if (k != -1) {
                  a(paramen, k, i, j);
                } 
              }  
          } 
        } 
      } 
      if (p.j < 24)
        for (i = p.p; i < p.r; i++) {
          int j;
          if ((j = f[i * a + 1] - 1) != -1)
            a(paramen, j, 0, i); 
        }  
      if (p.j > p.n) {
        i = a - 2;
        for (int j = p.p; j < p.r; j++) {
          int k;
          if ((k = f[j * a + i] - 1) != -1)
            a(paramen, k, i + 1, j); 
        } 
        return;
      } 
    } catch (Exception exception) {}
  }
  
  private static boolean i() {
    return !(l == 54 || l == 55 || l == 56 || l == 57 || l == 138 || l == 167);
  }
  
  public static final void b(en paramen) {
    if (a.a)
      return; 
    try {
      for (int i = p.o; i < p.q; i++) {
        for (int j = p.p; j < p.r; j++) {
          if ((a(i, j) & 0x40) == 64) {
            Image image;
            if (e == 5) {
              image = M;
            } else if (e == 8) {
              image = N;
            } else {
              image = h;
            } 
            if (!i()) {
              paramen.a(image, 0, 0, 24, 24, 0, i * i, j * i - 1, 0);
              paramen.a(image, 0, 0, 24, 24, 0, i * i, j * i - 3, 0);
            } 
            paramen.a(image, 0, (a.w % 8 >> 2) * 24, 24, 24, 0, i * i, j * i - 12, 0);
            if (H == 0 && i()) {
              H = j * i - 12;
              int k = 16777215;
              if (a.ad == 2) {
                k = 10871287;
              } else if (a.ad == 4) {
                k = 8111470;
              } else if (a.ad == 7) {
                k = 5693125;
              } else if (a.ad == 19) {
                k = 16711680;
              } 
              ed.a(k, H + 15);
            } 
          } 
        } 
      } 
      ed.b(paramen);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static void d(int paramInt) {
    InputStream inputStream = ad.a("/mymap/" + paramInt);
    a = (char)(inputStream = new DataInputStream(inputStream)).read();
    b = (char)inputStream.read();
    f = new int[inputStream.available()];
    for (byte b = 0; b < a * b; b++)
      f[b] = (char)inputStream.read(); 
    g = new int[f.length];
  }
  
  public static final int a(int paramInt1, int paramInt2) {
    try {
      return g[paramInt2 * a + paramInt1];
    } catch (Exception exception) {
      return 1000;
    } 
  }
  
  public static final int b(int paramInt1, int paramInt2) {
    try {
      return g[paramInt2 / i * a + paramInt1 / i];
    } catch (Exception exception) {
      return 1000;
    } 
  }
  
  public static final boolean a(int paramInt1, int paramInt2, int paramInt3) {
    try {
      return ((g[paramInt2 / i * a + paramInt1 / i] & paramInt3) == paramInt3);
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public static final void b(int paramInt1, int paramInt2, int paramInt3) {
    g[paramInt2 / i * a + paramInt1 / i] = g[paramInt2 / i * a + paramInt1 / i] | 0x200;
  }
  
  public static final void c(int paramInt1, int paramInt2, int paramInt3) {
    g[paramInt2 / i * a + paramInt1 / i] = g[paramInt2 / i * a + paramInt1 / i] & 0xFFFFFDFF;
  }
  
  public static final int e(int paramInt) {
    return paramInt / i * i;
  }
  
  public static final int f(int paramInt) {
    return paramInt / i * i;
  }
  
  public static void h() {
    System.gc();
    if (I != e) {
      if (l.c == 5 || l.c == 3 || l.c == 8) {
        if (en.b == 1) {
          (J = new Image[1])[0] = l.c("/t/" + e + ".png");
        } else {
          J = new Image[100];
          for (byte b = 0; b < J.length; b++)
            J[b] = l.c("/t/" + e + "/" + (b + 1) + ".png"); 
        } 
      } else {
        Image image;
        if ((image = l.a("/t/" + e + "$1.png")) != null) {
          av.a("x" + en.b + "t" + e);
          J = new Image[100];
          for (byte b = 0; b < J.length; b++)
            J[b] = l.a("/t/" + e + "$" + (b + 1) + ".png"); 
        } else if ((image = l.a("/t/" + e + ".png")) != null) {
          (J = new Image[1])[0] = image;
        } 
      } 
      I = e;
    } 
  }
  
  static {
    (new int[6])[0] = 21;
    (new int[6])[1] = 22;
    (new int[6])[2] = 23;
    (new int[6])[3] = 24;
    (new int[6])[4] = 25;
    (new int[6])[5] = 26;
    (new int[3])[1] = 7;
    (new int[3])[2] = 14;
  }
  
  static {
    (new int[2])[0] = 5257738;
    (new int[2])[1] = 8807192;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\bv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */