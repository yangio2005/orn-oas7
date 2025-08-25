import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;
import main.a;

public final class cw extends bb implements b {
  public static cw a;
  
  public static boolean b = false;
  
  private de c;
  
  private static cd d;
  
  private static int e;
  
  private static int f;
  
  private static int g;
  
  private static int[][] h = new int[][] { { 64, 30, 31 }, { 9, 29, 32 }, { 6, 27, 28 } };
  
  private static int[] i = new int[] { 2, 13, 8 };
  
  private static int[] j = new int[] { 1, 12, 7 };
  
  private int[] k = new int[] { 0, 4, 8 };
  
  private int l = 168;
  
  private int m = 350;
  
  private int n = 45;
  
  private int o;
  
  private int p;
  
  public static cw a() {
    if (a == null)
      a = new cw(); 
    return a;
  }
  
  private static void a(byte[] paramArrayOfbyte) {
    for (byte b1 = 0; b1 < paramArrayOfbyte.length; b1++) {
      InputStream inputStream = ad.a("/mymap/" + paramArrayOfbyte[b1]);
      inputStream = new DataInputStream(inputStream);
      dl.a[b1] = (char)inputStream.read();
      dl.b[b1] = (char)inputStream.read();
      dl.e[b1] = new int[inputStream.available()];
      for (byte b2 = 0; b2 < dl.a[b1] * dl.b[b1]; b2++)
        dl.e[b1][b2] = inputStream.read(); 
      dl.f[b1] = new int[(dl.e[b1]).length];
    } 
  }
  
  public final void b() {
    x.c = false;
    a.F.a = false;
    a.h();
    super.b();
    e = ds.b(0, 3);
    f = ds.b(0, 3);
    e();
    af.bI = false;
    if (d != null)
      d.i = aw.av; 
    if (a.e) {
      this.c = new de(bs.a[bs.n], this, 10018, null);
      this.c.j = 1;
      this.c.k = 3;
    } 
  }
  
  private void e() {
    bv.f = new int[(dl.e[e]).length];
    for (byte b1 = 0; b1 < (dl.e[e]).length; b1++)
      bv.f[b1] = dl.e[e][b1]; 
    bv.g = dl.f[e];
    bv.d = dl.d[e];
    bv.c = dl.c[e];
    bv.e = dl.c[e];
    bv.a = dl.a[e];
    bv.b = dl.b[e];
    bv.e = this.k[e] + 1;
    bv.h();
    a.a(this.k[e]);
    p.a(this.l, this.m);
  }
  
  public cw() {
    if (a.I == null)
      a.I = new x(); 
    try {
      if (!a.a) {
        byte[] arrayOfByte = { 39, 40, 41 };
        if (!a.a)
          try {
            for (byte b1 = 0; b1 < arrayOfByte.length; b1++) {
              InputStream inputStream = ad.a("/mymap/mapTable" + arrayOfByte[b1]);
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
          } catch (Exception exception2) {
            Exception exception1;
            (exception1 = null).printStackTrace();
          }  
      } 
      a(new byte[] { 39, 40, 41 });
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    if (a.A <= 200) {
      p.d(128, 100);
      p.bL = (a.A - 128) / 2;
      p.bK = 10;
      this.m += 15;
      this.n -= 15;
    } 
    e = 1;
    (d = new cd()).c = a.I.a.c;
    if (a.A < 200)
      d.c = 60; 
    d.d = 26;
    if (a.A < 200) {
      d.a = p.bL + 45;
      d.b = p.bK + 12;
    } else {
      d.a = a.A / 2 - d.c / 2;
      d.b = 35;
    } 
    if (!a.e)
      d.e = true; 
    d.c(0);
    d.i = aw.av;
    if (d.d().equals("@"))
      d.a(a.I.a.d().substring(0, a.I.a.d().indexOf("@"))); 
    e = 1;
    f = 0;
    this.cn = new de(aw.by, this, 8000, null);
    this.cm = new de(aw.bz, this, 8001, null);
    if (!a.e)
      this.co = d.j; 
  }
  
  public final void a(int paramInt) {
    d.a(paramInt);
  }
  
  public final void c() {
    this.o++;
    if (this.o > 30)
      this.o = 0; 
    if (this.o % 15 < 5) {
      this.p = 0;
    } else {
      this.p = 1;
    } 
    d.c();
    if (this.c != null && this.c.c())
      this.c.a(); 
    if (g != 0)
      d.e = false; 
  }
  
  public final void d() {
    if (a.i[2] && --g < 0)
      g = aw.aJ.length - 1; 
    if (a.i[8] && ++g >= aw.aJ.length)
      g = 0; 
    if (g == 0) {
      if (!a.e)
        this.co = d.j; 
      d.c();
    } 
    if (g == 1) {
      if (a.i[4]) {
        if (--e < 0)
          e = aw.aK.length - 1; 
        e();
      } 
      if (a.i[6]) {
        if (++e > aw.aK.length - 1)
          e = 0; 
        e();
      } 
      this.co = null;
    } 
    if (g == 2) {
      if (a.i[4] && --f < 0)
        f = (aw.fo[0]).length - 1; 
      if (a.i[6] && ++f > (aw.fo[0]).length - 1)
        f = 0; 
      this.co = null;
    } 
    if (a.m) {
      byte b1 = 110;
      byte b2 = 60;
      if (a.A > a.B) {
        b1 = 100;
        b2 = 40;
      } 
      if (a.a(a.A / 2 - 117, 15, 234, 80)) {
        g = 0;
        d.e = true;
      } 
      if (a.a(a.A / 2 - 117, b1 - 30, 234, b2 + 5)) {
        g = 1;
        int i = e;
        if ((e = (a.p - a.A / 2 - 117) / 78) < 0)
          e = 0; 
        if (e > aw.aK.length - 1)
          e = aw.aK.length - 1; 
        if (i != e)
          e(); 
      } 
      if (a.a(a.A / 2 - 117, b1 - 30 + b2 + 5, 234, 65)) {
        g = 2;
        int i = f;
        if ((f = (a.p - a.A / 2 - 117) / 78) < 0)
          f = 0; 
        if (f > (aw.fo[0]).length - 1)
          f = (aw.fo[0]).length - 1; 
        if (i != g)
          e(); 
      } 
    } 
    super.d();
    a.g();
    a.f();
  }
  
  public final void a(en paramen) {
    if (af.bI)
      return; 
    a.c(paramen);
    paramen.a(-p.j, -p.k);
    if (!a.a)
      for (byte b2 = 0; b2 < dl.g[e].size(); b2++) {
        cz cz;
        if ((cz = dl.g[e].elementAt(b2)).c != -1 && cz.h == 1)
          cz.a(paramen); 
      }  
    bv.a(paramen);
    byte b1 = 30;
    if (a.A == 128)
      b1 = 20; 
    int i = h[e][f];
    int j = i[e];
    int k = j[e];
    paramen.a(bv.x, this.l, this.m + this.n, 3);
    av av1 = p.x[i];
    av av2 = p.x[j];
    av av3 = p.x[k];
    bl.b(paramen, (av1.a[af.bC[this.p][0][0]]).a, this.l + af.bC[this.p][0][1] + (av1.a[af.bC[this.p][0][0]]).b, this.m - af.bC[this.p][0][2] + (av1.a[af.bC[this.p][0][0]]).c + this.n, 0, 0);
    bl.b(paramen, (av2.a[af.bC[this.p][1][0]]).a, this.l + af.bC[this.p][1][1] + (av2.a[af.bC[this.p][1][0]]).b, this.m - af.bC[this.p][1][2] + (av2.a[af.bC[this.p][1][0]]).c + this.n, 0, 0);
    bl.b(paramen, (av3.a[af.bC[this.p][2][0]]).a, this.l + af.bC[this.p][2][1] + (av3.a[af.bC[this.p][2][0]]).b, this.m - af.bC[this.p][2][2] + (av3.a[af.bC[this.p][2][0]]).c + this.n, 0, 0);
    if (!a.a)
      for (byte b2 = 0; b2 < dl.g[e].size(); b2++) {
        cz cz;
        if ((cz = dl.g[e].elementAt(b2)).c != -1 && cz.h == 3)
          cz.a(paramen); 
      }  
    paramen.a(-paramen.a(), -paramen.b());
    if (a.A < 200) {
      cx.b(p.bL, p.bK, p.bM, p.bN, paramen);
      bl.b(paramen, (av1.a[af.bC[0][0][0]]).a, a.A / 2 + af.bC[0][0][1] + (av1.a[af.bC[0][0][0]]).b, p.bK + 30 + b1 * 3 - af.bC[0][0][2] + (av1.a[af.bC[0][0][0]]).c + this.n, 0, 0);
      bl.b(paramen, (av2.a[af.bC[0][1][0]]).a, a.A / 2 + af.bC[0][1][1] + (av2.a[af.bC[0][1][0]]).b, p.bK + 30 + b1 * 3 - af.bC[0][1][2] + (av2.a[af.bC[0][1][0]]).c + this.n, 0, 0);
      bl.b(paramen, (av3.a[af.bC[0][2][0]]).a, a.A / 2 + af.bC[0][2][1] + (av3.a[af.bC[0][2][0]]).b, p.bK + 30 + b1 * 3 - af.bC[0][2][2] + (av3.a[af.bC[0][2][0]]).c + this.n, 0, 0);
      for (byte b2 = 0; b2 < aw.aJ.length; b2++) {
        if (g == b2) {
          paramen.a(p.bw, 0, 0, 13, 16, 2, p.bL + 10 + ((a.w % 7 > 3) ? 1 : 0), p.bK + 35 + b2 * b1, cj.f);
          paramen.a(p.bw, 0, 0, 13, 16, 0, p.bL + p.bM - 10 - ((a.w % 7 > 3) ? 1 : 0), p.bK + 35 + b2 * b1, cj.f);
        } 
        di.f.a(paramen, aw.aJ[b2], p.bL + 20, p.bK + 30 + b2 * b1, 0);
      } 
      di.f.a(paramen, aw.aK[e], p.bL + 70, p.bK + 30 + b1 * 1, 0);
      di.f.a(paramen, aw.fo[e][f], p.bL + 55, p.bK + 30 + b1 * 2, 0);
    } else {
      byte b2 = 110;
      byte b3 = 60;
      if (a.A > a.B) {
        b2 = 100;
        b3 = 45;
      } 
      for (b1 = 0; b1 < 3; b1++) {
        if (b1 != e) {
          paramen.a(p.aw, a.A / 2 - 78 + b1 * 78, b2, 3);
        } else {
          if (g == 1)
            paramen.a(p.bw, 0, 0, 13, 16, 4, a.A / 2 - 78 + b1 * 78, b2 - 20 + ((a.w % 7 > 3) ? 1 : 0), cj.f); 
          paramen.a(p.ax, a.A / 2 - 78 + b1 * 78, b2, 3);
        } 
        di.f.a(paramen, aw.aK[b1], a.A / 2 - 78 + b1 * 78, b2 - 5, 2);
      } 
      for (b1 = 0; b1 < 3; b1++) {
        if (b1 != f) {
          paramen.a(p.aw, a.A / 2 - 78 + b1 * 78, b2 + b3, 3);
        } else {
          if (g == 2)
            paramen.a(p.bw, 0, 0, 13, 16, 4, a.A / 2 - 78 + b1 * 78, b2 + b3 - 20 + ((a.w % 7 > 3) ? 1 : 0), cj.f); 
          paramen.a(p.ax, a.A / 2 - 78 + b1 * 78, b2 + b3, 3);
        } 
        di.f.a(paramen, aw.fo[e][b1], a.A / 2 - 78 + b1 * 78, b2 + b3 - 5, 2);
      } 
      if (g == 0)
        paramen.a(p.bw, 0, 0, 13, 16, 4, a.A / 2, 20 + ((a.w % 7 > 3) ? 1 : 0), cj.f); 
    } 
    d.a(paramen);
    paramen.e(0, 0, a.A, a.B);
    if (this.c != null)
      this.c.a(paramen); 
    super.a(paramen);
  }
  
  public final void a(int paramInt, Object paramObject) {
    switch (paramInt) {
      case 8000:
        if (d.d().equals("")) {
          a.a(aw.ar);
          return;
        } 
        if (d.d().length() < 5) {
          a.a(aw.as);
          return;
        } 
        if (d.d().length() > 15) {
          a.a(aw.at);
          return;
        } 
        bp.a();
        bt.a().a(d.d(), e, h[e][f]);
        return;
      case 8001:
        if (a.I.n) {
          a.a(aw.fU, new de(aw.bm, this, 10019, null), new de(aw.bn, this, 10020, null));
          return;
        } 
        br.a().e();
        a.ak.b();
        return;
      case 10020:
        a.h();
        return;
      case 10019:
        br.a().e();
        a.h();
        a.ak.b();
        return;
      case 10018:
        bs.a(-1, true);
        eu.b = false;
        a.al.b();
        break;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\cw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */