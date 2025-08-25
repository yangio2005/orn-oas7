import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;
import main.a;

public final class bl {
  public static int[][] a;
  
  public static Image[] b;
  
  public static eg[] c;
  
  public static el d = new el("vKeys");
  
  private static Image h = null;
  
  public static byte[] e;
  
  public static el f = new el("");
  
  private static int i;
  
  public static short g;
  
  public static void a() {
    if (b == null) {
      b = new Image[] { l.a("/img/Big0.png"), l.a("/img/Big1.png"), l.a("/img/Big2.png"), l.a("/img/Big3.png") };
      System.gc();
    } 
  }
  
  public static void b() {
    System.gc();
    h = Image.createRGBImage(new int[] { -2013265920 }, 1, 1, true);
  }
  
  public bl() {
    e();
  }
  
  public static void c() {}
  
  private static void e() {
    try {
      DataInputStream dataInputStream;
      short s;
      a = new int[s = (dataInputStream = new DataInputStream(new ByteArrayInputStream(av.b("NR_image")))).readShort()][5];
      for (byte b = 0; b < s; b++) {
        a[b][0] = dataInputStream.readUnsignedByte();
        a[b][1] = dataInputStream.readShort();
        a[b][2] = dataInputStream.readShort();
        a[b][3] = dataInputStream.readShort();
        a[b][4] = dataInputStream.readShort();
        if ((b < 84 || b > 90) && (b < 'Ŵ' || b > 'ƀ') && (b < 'ų' || b > 'Ź') && (a[b][1] >= 256 || a[b][3] >= 256 || a[b][2] >= 256 || a[b][4] >= 256))
          a[b] = null; 
      } 
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public static void a(int paramInt) {
    if (en.b == 1) {
      Image image1;
      if ((image1 = l.b("/SmallImage/Small" + paramInt + ".png")) != null) {
        c[paramInt] = new eg(image1, paramInt);
        return;
      } 
      c[paramInt] = new eg(h, paramInt);
      if (a.E == a.am) {
        bt.a().p(paramInt);
        return;
      } 
      f.addElement(c[paramInt]);
      return;
    } 
    Image image;
    if ((image = l.b("/SmallImage/Small" + paramInt + ".png")) != null) {
      c[paramInt] = new eg(image, paramInt);
      return;
    } 
    boolean bool = false;
    byte[] arrayOfByte;
    if ((arrayOfByte = av.b(String.valueOf(en.b) + "Small" + paramInt)) != null) {
      if (e != null && arrayOfByte.length % 127 != e[paramInt])
        bool = true; 
      if (!bool) {
        Image image1;
        if ((image1 = Image.createImage(arrayOfByte, 0, arrayOfByte.length)) != null) {
          c[paramInt] = new eg(image1, paramInt);
        } else {
          bool = true;
        } 
      } 
    } else {
      bool = true;
    } 
    if (bool) {
      c[paramInt] = new eg(h, paramInt);
      if (a.E == a.am) {
        bt.a().p(paramInt);
        return;
      } 
      f.addElement(c[paramInt]);
    } 
  }
  
  public static void a(en paramen, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    b(paramen, paramInt1, paramInt2, paramInt3, 0, paramInt5);
  }
  
  public static void b(en paramen, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    try {
      if (b == null) {
        eg eg1;
        if ((eg1 = c[paramInt1]) == null) {
          a(paramInt1);
          return;
        } 
        paramen.a(eg1.a, 0, 0, en.a(eg1.a), en.b(eg1.a), paramInt4, paramInt2, paramInt3, paramInt5);
        return;
      } 
      if (a != null) {
        if (paramInt1 >= a.length || a[paramInt1] == null || a[paramInt1][1] >= 256 || a[paramInt1][3] >= 256 || a[paramInt1][2] >= 256 || a[paramInt1][4] >= 256) {
          eg eg2;
          if ((eg2 = c[paramInt1]) == null) {
            a(paramInt1);
            return;
          } 
          eg2.a(paramen, paramInt4, paramInt2, paramInt3, paramInt5);
          return;
        } 
        if (a[paramInt1][0] != 4 && b[a[paramInt1][0]] != null) {
          paramen.a(b[a[paramInt1][0]], a[paramInt1][1], a[paramInt1][2], a[paramInt1][3], a[paramInt1][4], paramInt4, paramInt2, paramInt3, paramInt5);
          return;
        } 
        eg eg1;
        if ((eg1 = c[paramInt1]) == null) {
          a(paramInt1);
          return;
        } 
        eg1.a(paramen, paramInt4, paramInt2, paramInt3, paramInt5);
        return;
      } 
      if (a.E != p.j()) {
        eg eg1;
        if ((eg1 = c[paramInt1]) == null) {
          a(paramInt1);
          return;
        } 
        eg1.a(paramen, paramInt4, paramInt2, paramInt3, paramInt5);
        return;
      } 
    } catch (Exception exception) {}
  }
  
  public static void a(en paramen, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    try {
      if (b == null) {
        eg eg1;
        if ((eg1 = c[paramInt1]) == null) {
          a(paramInt1);
          return;
        } 
        paramen.a(eg1.a, 0, paramInt2 * paramInt5, paramInt5, paramInt6, paramInt7, paramInt3, paramInt4, paramInt8);
        return;
      } 
      if (a != null) {
        if (paramInt1 >= a.length || a[paramInt1] == null || a[paramInt1][1] >= 256 || a[paramInt1][3] >= 256 || a[paramInt1][2] >= 256 || a[paramInt1][4] >= 256) {
          eg eg2;
          if ((eg2 = c[paramInt1]) == null) {
            a(paramInt1);
            return;
          } 
          eg2.a(paramen, paramInt7, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt8);
          return;
        } 
        if (a[paramInt1][0] != 4 && b[a[paramInt1][0]] != null) {
          paramen.a(b[a[paramInt1][0]], 0, paramInt2 * paramInt5, paramInt5, paramInt6, paramInt7, paramInt3, paramInt4, paramInt8);
          return;
        } 
        eg eg1;
        if ((eg1 = c[paramInt1]) == null) {
          a(paramInt1);
          return;
        } 
        eg1.a(paramen, paramInt7, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt8);
        return;
      } 
      if (a.E != p.j()) {
        eg eg1;
        if ((eg1 = c[paramInt1]) == null) {
          a(paramInt1);
          return;
        } 
        eg1.a(paramen, paramInt7, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt8);
        return;
      } 
    } catch (Exception exception) {}
  }
  
  public static void d() {
    byte b = 0;
    if (a.w % 1000 == 0) {
      for (byte b1 = 0; b1 < c.length; b1++) {
        if (c[b1] != null) {
          b++;
          eg eg1;
          (eg1 = c[b1]).d++;
          if (eg1.d - eg1.c > 1 && !af.e().a(eg1.b))
            c[eg1.b] = null; 
          i++;
        } 
      } 
      if (b > 'È' && a.a)
        c = new eg[g]; 
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\bl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */