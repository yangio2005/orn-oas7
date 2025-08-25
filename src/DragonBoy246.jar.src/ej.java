import javax.microedition.lcdui.Image;
import main.a;

public final class ej implements b {
  public el a = new el("infoWaitToShow");
  
  public r b;
  
  public int c = 100;
  
  private int k;
  
  public String[] d;
  
  private int l;
  
  private int m;
  
  private boolean n = false;
  
  private static Image o = l.b("/mainImage/myTexture2dgocnhon.png");
  
  public int e;
  
  public int f;
  
  private int p;
  
  public int g;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public final void a() {
    this.d = null;
    this.a.removeAllElements();
  }
  
  public final void a(en paramen, int paramInt1, int paramInt2, int paramInt3) {
    if (this.a.size() != 0) {
      paramen.a(paramInt1, paramInt2);
      if (this.d != null && this.d.length != 0 && this.p != 1) {
        byte b1 = (en.b == 1) ? 0 : 10;
        if (this.b.c == null) {
          bo.a(paramen, this.g, this.h, this.i, this.j, 16777215, false);
        } else {
          l.a(paramen, this.g - 23, this.h - b1 / 2, this.i + 15);
        } 
        if (this.b.c == null)
          paramen.a(o, 0, 0, 9, 8, (paramInt3 == 1) ? 0 : 2, this.l - 3 + ((paramInt3 == 1) ? -15 : 20), this.m - 20 + this.k + 2, 17); 
        paramInt3 = -1;
        for (byte b2 = 0; b2 < this.d.length; b2++) {
          int i;
          di di = di.k;
          String str = this.d[b2];
          if (this.d[b2].startsWith("|")) {
            String[] arrayOfString;
            if ((arrayOfString = ds.a(this.d[b2], "|", 0)).length == 3)
              str = arrayOfString[2]; 
            if (arrayOfString.length == 4) {
              str = arrayOfString[3];
              Integer.parseInt(arrayOfString[2]);
            } 
            paramInt3 = i = Integer.parseInt(arrayOfString[1]);
          } else {
            i = paramInt3;
          } 
          switch (i) {
            case -1:
              di = di.k;
              break;
            case 0:
              di = di.f;
              break;
            case 1:
              di = di.h;
              break;
            case 2:
              di = di.b;
              break;
            case 3:
              di = di.p;
              break;
            case 4:
              di = di.r;
              break;
            case 5:
              di = di.q;
              break;
            case 7:
              di = di.a;
              break;
          } 
          if (this.b.c == null) {
            di.a(paramen, str, this.l, this.m - 15 + this.k + b2 * 12 - this.d.length * 12 - 9, 2);
          } else {
            i = this.g - 23;
            int j = this.h - b1 / 2;
            int k = (l.c == 1) ? (this.i + 28) : (this.i + 25);
            int m = this.j + (a.e ? 0 : 14) + b1;
            paramen.a(4465169);
            paramen.d(i, j + m, k, 2);
            if ((k = this.b.f * k / this.b.g) < 0)
              k = 0; 
            paramen.a(43758);
            paramen.d(i, j + m, k, 2);
            if (this.b.f == 0)
              return; 
            this.b.c.a(paramen, this.g + 5, this.h + this.j / 2, 0);
            if (en.b == 1) {
              (this.b.d ? di.F : di.I).a(paramen, this.b.c.ag, this.g + 12, this.h + 3, 0);
            } else {
              (this.b.d ? di.F : di.I).a(paramen, this.b.c.ag, this.g + 12, this.h - 3, 0);
            } 
            if (!a.e)
              if (!cd.g) {
                di.G.a(paramen, "Nhấn # để chat", this.g + this.i / 2 + 10, this.h + this.j, 2);
              } else {
                di.G.a(paramen, "Nhấn Y để chat", this.g + this.i / 2 + 10, this.h + this.j, 2);
              }  
            if (en.b == 1) {
              ag.a(paramen, str, this.g + 14, this.h + this.j / 2 + 2, this.i - 16, this.j, di.H);
            } else {
              String[] arrayOfString = di.H.a(str, 120);
              for (byte b3 = 0; b3 < arrayOfString.length; b3++)
                di.H.a(paramen, arrayOfString[b3], this.g + 12, this.h + 12 + b3 * 12 - 3, 0); 
              a.a(paramen);
            } 
          } 
        } 
      } 
      paramen.a(-paramInt1, -paramInt2);
    } 
  }
  
  public final void b() {
    if (this.a.size() != 0 && this.b.f == 0) {
      this.e++;
      if (this.e >= this.b.b) {
        this.e = 0;
        this.a.removeElementAt(0);
        if (this.a.size() == 0)
          return; 
        r r1 = this.a.firstElement();
        this.b = r1;
        c();
      } 
    } 
  }
  
  public final void c() {
    int i;
    this.c = 100;
    if (a.A == 128)
      this.c = 128; 
    if (this.b.c != null) {
      this.d = new String[] { this.b.a };
      if (en.b == 1) {
        i = this.d.length;
      } else {
        String[] arrayOfString;
        i = (arrayOfString = di.H.a(this.b.a, 120)).length;
      } 
    } else {
      this.d = di.k.a(this.b.a, this.c - 10);
      i = this.d.length;
    } 
    this.k = 7;
    this.g = this.l - this.c / 2 - 1;
    this.h = this.m - 15 + this.k - i * 12 - 15;
    this.i = this.c + 2 + ((this.b.c != null) ? 30 : 0);
    this.j = (i + 1) * 12 + 1 + ((this.b.c != null) ? 5 : 0);
  }
  
  public final void a(String paramString, int paramInt, af paramaf, boolean paramBoolean) {
    this.p = paramInt;
    if (this.a.size() > 10)
      this.a.removeElementAt(0); 
    if (this.a.size() > 0)
      paramString.equals(((r)this.a.lastElement()).a); 
    r r1 = new r(paramString);
    if (this.p == 0)
      r1.b = paramString.length(); 
    if (r1.b < 70)
      r1.b = 70; 
    if (this.p == 1)
      r1.b = 10000000; 
    if (this.p == 3) {
      r1.b = 300;
      r1.h = l.d();
      r1.f = paramString.length();
      if (r1.f < 15)
        r1.f = 15; 
      if (r1.f > 100)
        r1.f = 100; 
      r1.g = r1.f;
    } 
    if (paramaf != null) {
      r1.c = paramaf;
      r1.d = paramBoolean;
      a.G.a(r1);
      if (a.e && a.G.au)
        p.aE.i = new de(aw.bp, this, 1000, r1); 
    } 
    if ((paramaf != null && a.G.au) || paramaf == null)
      this.a.addElement(r1); 
    if (this.a.size() == 1) {
      this.b = this.a.firstElement();
      c();
    } 
    if (a.e && paramaf != null && a.G.au && a.A - 50 > 155 + this.i) {
      p.aE.i.j = a.A - this.i - 50;
      p.aE.i.k = 35;
    } 
  }
  
  public final void a(int paramInt, Object paramObject) {
    if (paramInt == 1000) {
      p.j();
      cq.b().a(aw.cP);
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ej.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */