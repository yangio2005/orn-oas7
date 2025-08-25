import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;
import main.a;

public final class am extends bb implements b {
  public static boolean a;
  
  private af b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f = 45;
  
  private de g;
  
  private int[] h = new int[] { 0, 4, 8 };
  
  private int[] i = new int[] { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1 };
  
  private int j = 0;
  
  private static void a(byte[] paramArrayOfbyte) {
    if (a.a)
      return; 
    try {
      for (byte b1 = 0; b1 < paramArrayOfbyte.length; b1++) {
        InputStream inputStream = ad.a("/mymap/mapTable" + paramArrayOfbyte[b1]);
        short s = (inputStream = new DataInputStream(inputStream)).readShort();
        dl.g[b1] = new el("MapTemplate.vCurrItem[a] ");
        for (byte b2 = 0; b2 < s; b2++) {
          short s1 = inputStream.readShort();
          short s2 = inputStream.readShort();
          short s3 = inputStream.readShort();
          if (bv.a(s1) != null) {
            cz cz1 = bv.a(s1);
            cz cz2;
            (cz2 = new cz()).a = s1;
            cz2.c = cz1.c;
            cz2.f = cz1.f;
            cz2.g = cz1.g;
            cz2.d = s2 * bv.i;
            cz2.e = s3 * bv.i;
            cz2.h = cz1.h;
            dl.g[b1].addElement(cz2);
            if (!cz.k.containsKey((new StringBuffer(String.valueOf(cz2.c))).toString())) {
              try {
                Image image = l.b("/mapBackGround/" + cz2.c + ".png");
                cz.k.put((new StringBuffer(String.valueOf(cz2.c))).toString(), image);
              } catch (Exception exception) {
                Image image;
                if ((image = l.c("/mapBackGround/" + cz2.c + ".png")) == null) {
                  image = Image.createRGBImage(new int[] { -2013265920 }, 1, 1, true);
                  bt.a().c(cz2.c);
                } 
                cz.k.put((new StringBuffer(String.valueOf(cz2.c))).toString(), image);
              } 
              cz.m.addElement((new StringBuffer(String.valueOf(cz2.c))).toString());
            } 
            if (!cz.a((new StringBuffer(String.valueOf(cz2.c))).toString()))
              cz.l.addElement((new StringBuffer(String.valueOf(cz2.c))).toString()); 
          } 
        } 
      } 
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public am() {
    try {
      if (!a.a) {
        byte[] arrayOfByte = { 39, 40, 41 };
        for (byte b1 = 0; b1 < arrayOfByte.length; b1++) {
          InputStream inputStream = ad.a("/mymap/" + arrayOfByte[b1]);
          inputStream = new DataInputStream(inputStream);
          dl.a[b1] = (char)inputStream.read();
          dl.b[b1] = (char)inputStream.read();
          dl.e[b1] = new int[inputStream.available()];
          for (byte b2 = 0; b2 < dl.a[b1] * dl.b[b1]; b2++)
            dl.e[b1][b2] = inputStream.read(); 
          dl.f[b1] = new int[(dl.e[b1]).length];
        } 
      } 
      a(new byte[] { 39, 40, 41 });
    } catch (Exception exception) {}
    this.d = 168;
    this.e = 350;
    bl.c = new eg[32000];
    bl.e = new byte[32000];
    bl.g = 32000;
  }
  
  public final void a(af paramaf) {
    this.b = new af();
    this.c = this.b.K = paramaf.K;
    this.b.bU = paramaf.bU;
    this.b.bT = paramaf.bT;
    this.b.bW = paramaf.bW;
    this.b.bV = paramaf.bV;
    this.b.bX = paramaf.bX;
    this.b.ag = paramaf.ag;
    b();
  }
  
  public final void b() {
    a.F.a = false;
    a.h();
    p.j().a();
    super.b();
    am am1 = this;
    bv.f = new int[(dl.e[am1.c]).length];
    for (byte b1 = 0; b1 < (dl.e[am1.c]).length; b1++)
      bv.f[b1] = dl.e[am1.c][b1]; 
    bv.g = dl.f[am1.c];
    bv.d = dl.d[am1.c];
    bv.c = dl.c[am1.c];
    bv.e = dl.c[am1.c];
    bv.a = dl.a[am1.c];
    bv.b = dl.b[am1.c];
    bv.e = am1.h[am1.c] + 1;
    bv.h();
    a.a(am1.h[am1.c]);
    p.a(am1.d, am1.e);
    af.bI = false;
    this.cn = new de(aw.bv, this, 100, null);
    this.cm = new de(aw.bz, this, 101, null);
    this.g = new de(bs.a[bs.n], this, 102, null);
    this.g.j = 1;
    this.g.k = 3;
  }
  
  public final void a(en paramen) {
    if (!ac.c)
      return; 
    if (a)
      return; 
    if (af.bI)
      return; 
    a.c(paramen);
    paramen.a(-p.j, -p.k);
    for (byte b1 = 0; b1 < dl.g[this.c].size(); b1++) {
      cz cz;
      if ((cz = dl.g[this.c].elementAt(b1)).c != -1 && cz.h == 1)
        cz.a(paramen); 
    } 
    bv.a(paramen);
    paramen.a(bv.x, p.j + a.C, this.e + this.f + 1, 3);
    if (this.b != null) {
      this.b.a(paramen, p.j + a.C, this.e + this.f, 1, this.i[this.j], true);
      di.d.a(paramen, this.b.ag, p.j + a.C, this.e - 15, 2, di.E);
    } 
    paramen.e(0, 0, a.A, a.B);
    super.a(paramen);
    this.g.a(paramen);
  }
  
  public final void c() {
    super.c();
    if (!br.a().d()) {
      a = true;
      this.j++;
      if (this.j > 50) {
        bs.k();
        this.j = 0;
      } 
      return;
    } 
    a = false;
    this.j++;
    if (this.j > this.i.length - 1)
      this.j = 0; 
    if (this.g != null && this.g.c())
      this.g.a(); 
  }
  
  public final void a(int paramInt, Object paramObject) {
    switch (paramInt) {
      case 100:
        bs.l();
        return;
      case 101:
        a.ak.b();
        return;
      case 102:
        bs.a(-1, true);
        eu.b = false;
        a.al.b();
        break;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\am.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */