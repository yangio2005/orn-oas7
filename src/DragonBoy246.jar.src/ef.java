import main.a;

public final class ef {
  public byte a;
  
  public byte b;
  
  public byte c;
  
  public byte d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public String h;
  
  public String i;
  
  public byte j;
  
  public byte k;
  
  public af l;
  
  public aa m;
  
  public ee[] n;
  
  int[] o = new int[] { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1 };
  
  int p = 0;
  
  long q;
  
  public ae r;
  
  private el s = new el("");
  
  public final void a(byte paramByte1, byte paramByte2) {
    this.b = paramByte1;
    this.c = paramByte2;
  }
  
  public final void a(byte paramByte) {
    this.j = paramByte;
    a();
  }
  
  public final void b(byte paramByte) {
    this.k = paramByte;
    a();
  }
  
  public static ef a(el paramel, int paramInt) {
    if (paramel != null)
      for (byte b = 0; b < paramel.size(); b++) {
        ef ef1;
        if ((ef1 = paramel.elementAt(b)) != null && ef1.e == paramInt)
          return ef1; 
      }  
    return null;
  }
  
  public final void a() {
    this.r = new ae();
    String str = "";
    str = String.valueOf(str) + "\n|6|" + this.i;
    str = String.valueOf(str) + "\n--";
    if (this.n != null) {
      byte b = 0;
      while (true) {
        byte b1 = 0;
        byte b2;
        for (b2 = 0; b2 < this.n.length; b2++) {
          String str1;
          if (!(str1 = this.n[b2].a()).equals("") && b == (this.n[b2]).b) {
            b1++;
            break;
          } 
        } 
        if (b1 != 0) {
          if (!b) {
            str = String.valueOf(str) + "\n|6|2|--" + aw.h + "--";
          } else {
            str = String.valueOf(str) + "\n|6|2|--" + aw.g + " Lv." + b + "--";
          } 
          for (b2 = 0; b2 < this.n.length; b2++) {
            String str1;
            if (!(str1 = this.n[b2].a()).equals("") && b == (this.n[b2]).b) {
              String str2 = "1";
              if (this.j == 0) {
                str2 = "2";
              } else if ((this.n[b2]).b != 0) {
                if (this.k == 0) {
                  str2 = "2";
                } else if (this.j < (this.n[b2]).b) {
                  str2 = "2";
                } 
              } 
              str = String.valueOf(str) + "\n|" + str2 + "|1|" + str1;
            } 
          } 
          if (b1 != 0)
            b++; 
          continue;
        } 
        break;
      } 
    } 
    str = str;
    ae ae1;
    (ae1 = this.r).a = aq.d;
    ae1.e = aq.b;
    ae1.d = di.k.a(str, ae1.a - 8);
    ae1.b = 10000000;
    ae1.i = null;
    ae1.g = ae1.d.length * 12;
    ae1.f = aq.c;
    ae1.t = 10;
    ae1.h = ae1.g - aq.e;
    if (ae1.h < 0)
      ae1.h = 0; 
  }
  
  public final void a(en paramen, int paramInt1, int paramInt2) {
    ef ef1;
    if ((ef1 = this).b == ef1.c && ef1.s.size() == 0) {
      int i = ds.b(1, 5);
      for (byte b1 = 0; b1 < i; b1++) {
        be be;
        (be = new be()).a = ds.b(5, 25);
        be.b = ds.b(5, 25);
        be.d = b1 * ds.b(0, 8);
        be.e = 0;
        be.c = -1;
        ef1.s.addElement(be);
      } 
    } 
    for (byte b = 0; b < this.s.size(); b++) {
      be be;
      if ((be = this.s.elementAt(b)) != null) {
        if (be.e < be.d)
          be.e++; 
        if (be.e >= be.d) {
          be.c = a.w / 3 % (aq.a.c + 1);
          if (be.c >= aq.a.c) {
            this.s.removeElementAt(b);
            b--;
          } else {
            aq.a.a(be.c, paramInt1 + be.a, paramInt2 + be.b, 0, 3, paramen);
          } 
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ef.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */