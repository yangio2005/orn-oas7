import javax.microedition.lcdui.Image;
import main.a;

public final class cx {
  private static int b = 15787715;
  
  private static Image[] c = new Image[6];
  
  public static int a = 24;
  
  private static int d = 0;
  
  static {
    l.b("/mainImage/myTexture2dcheck.png");
  }
  
  public cx() {
    (new int[7])[0] = 15970400;
    (new int[7])[1] = -844109861;
    (new int[7])[2] = 2250052;
    (new int[7])[3] = 16374659;
    (new int[7])[4] = 15906669;
    (new int[7])[5] = 12931125;
    (new int[7])[6] = 3108954;
  }
  
  public static void a(en paramen, de paramde1, de paramde2, de paramde3) {
    di di = di.f;
    if (paramde1 != null && (d = di.a(paramde1.b)) > 0)
      if (paramde1.j >= 0 && paramde1.k > 0) {
        paramde1.a(paramen);
      } else {
        paramen.a((bb.cs == 0) ? p.ax : p.aw, 1, a.B - bb.cr - 1, 0);
        di.a(paramen, paramde1.b, 35, a.B - bb.cr + 3 + 3, 2);
      }  
    if (paramde2 != null && (d = di.a(paramde2.b)) > 0)
      if (paramde2.j > 0 && paramde2.k > 0) {
        paramde2.a(paramen);
      } else {
        paramen.a((bb.cs == 1) ? p.ax : p.aw, a.C - 35, a.B - bb.cr - 1, 0);
        di.a(paramen, paramde2.b, a.C, a.B - bb.cr + 3 + 3, 2);
      }  
    if (paramde3 != null && (d = di.a(paramde3.b)) > 0) {
      if (paramde3.j > 0 && paramde3.k > 0) {
        paramde3.a(paramen);
        return;
      } 
      paramen.a((bb.cs == 2) ? p.ax : p.aw, a.A - 71, a.B - bb.cr - 1, 0);
      di.a(paramen, paramde3.b, a.A - 35, a.B - bb.cr + 3 + 3, 2);
    } 
  }
  
  public final void a(en paramen, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String[] paramArrayOfString) {
    b(paramInt1, paramInt2, paramInt3, 69, paramen);
    paramInt2 = paramInt2 + 20 - di.t.a();
    paramInt4 = 0;
    for (paramInt2 = paramInt2; paramInt4 < paramArrayOfString.length; paramInt2 += di.t.a()) {
      di.t.a(paramen, paramArrayOfString[paramInt4], paramInt1 + paramInt3 / 2, paramInt2, 2);
      paramInt4++;
    } 
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, en paramen) {
    paramen.a(9340251);
    paramen.c(paramInt1 + 18, paramInt2, (paramInt3 - 36) / 2 - 32, paramInt4);
    paramen.c(paramInt1 + 18 + (paramInt3 - 36) / 2 + 32, paramInt2, (paramInt3 - 36) / 2 - 22, paramInt4);
    paramen.c(paramInt1, paramInt2 + 8, paramInt3, paramInt4 - 17);
    paramen.a(b);
    paramen.d(paramInt1 + 18, paramInt2 + 3, (paramInt3 - 36) / 2 - 32, paramInt4 - 4);
    paramen.d(paramInt1 + 18 + (paramInt3 - 36) / 2 + 31, paramInt2 + 3, (paramInt3 - 38) / 2 - 22, paramInt4 - 4);
    paramen.d(paramInt1 + 1, paramInt2 + 6, paramInt3 - 1, paramInt4 - 11);
    paramen.a(14667919);
    paramen.d(paramInt1 + 18, paramInt2 + 1, (paramInt3 - 36) / 2 - 32, 2);
    paramen.d(paramInt1 + 18 + (paramInt3 - 36) / 2 + 32, paramInt2 + 1, (paramInt3 - 36) / 2 - 12, 2);
    paramen.d(paramInt1 + 18, paramInt2 + paramInt4 - 2, (paramInt3 - 36) / 2 - 31, 2);
    paramen.d(paramInt1 + 18 + (paramInt3 - 36) / 2 + 32, paramInt2 + paramInt4 - 2, (paramInt3 - 36) / 2 - 31, 2);
    paramen.d(paramInt1 + 1, paramInt2 + 11, 2, paramInt4 - 18);
    paramen.d(paramInt1 + paramInt3 - 2, paramInt2 + 11, 2, paramInt4 - 18);
    paramen.a(c[0], paramInt1 - 3, paramInt2 - 2, 20);
    paramen.a(c[2], paramInt1 + paramInt3 + 3, paramInt2 - 2, cj.b);
    paramen.a(c[1], paramInt1 - 3, paramInt2 + paramInt4 + 3, cj.d);
    paramen.a(c[3], paramInt1 + paramInt3 + 4, paramInt2 + paramInt4 + 2, cj.e);
    paramen.a(c[4], paramInt1 + paramInt3 / 2, paramInt2, cj.a);
    paramen.a(c[5], paramInt1 + paramInt3 / 2, paramInt2 + paramInt4 + 1, cj.c);
  }
  
  public static void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, en paramen) {
    paramen.a(13524492);
    paramen.c(paramInt1 + 6, paramInt2, paramInt3 - 12, paramInt4);
    paramen.c(paramInt1, paramInt2 + 6, paramInt3, paramInt4 - 12);
    paramen.c(paramInt1 + 7, paramInt2 + 1, paramInt3 - 14, paramInt4 - 2);
    paramen.c(paramInt1 + 1, paramInt2 + 7, paramInt3 - 2, paramInt4 - 14);
    paramen.a(14338484);
    paramen.d(paramInt1 + 8, paramInt2 + 2, paramInt3 - 16, paramInt4 - 3);
    paramen.d(paramInt1 + 2, paramInt2 + 8, paramInt3 - 3, paramInt4 - 14);
    paramen.a(a.Z[2], paramInt1, paramInt2, 20);
    paramen.a(a.Z[2], 0, 0, 16, 16, 2, paramInt1 + paramInt3 + 1, paramInt2, cj.b);
    paramen.a(a.Z[2], 0, 0, 16, 16, 1, paramInt1, paramInt2 + paramInt4 + 1, cj.d);
    paramen.a(a.Z[2], 0, 0, 16, 16, 3, paramInt1 + paramInt3 + 1, paramInt2 + paramInt4 + 1, cj.e);
  }
  
  public static void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, en paramen) {
    paramen.a(6702080);
    paramen.d(paramInt1, paramInt2, paramInt3, paramInt4);
    paramen.a(14338484);
    paramen.d(paramInt1 + 1, paramInt2 + 1, paramInt3 - 2, paramInt4 - 2);
  }
  
  static {
    for (byte b = 0; b < c.length; b++)
      c[b] = l.b("/mainImage/myTexture2dgoc" + (b + 1) + ".png"); 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\cx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */