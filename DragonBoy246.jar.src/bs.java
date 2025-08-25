import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import main.GameMidlet;
import main.a;

public final class bs extends bb implements b {
  public static String[] a;
  
  private static String[] x;
  
  public static byte b;
  
  private static short[] y;
  
  private static int z;
  
  public static boolean c;
  
  public static byte[] d;
  
  public static byte[] e;
  
  public static af[] f;
  
  public static boolean g;
  
  private de[] A;
  
  private de B;
  
  private int C;
  
  public static byte[] h;
  
  public static byte[] i;
  
  private static String D = "Vũ trụ 1:35.229.139.197:14445:0:0:0,Vũ trụ 2:dragon2.teamobi.com:14445:0:0:0,Vũ trụ 3:dragon3.teamobi.com:14445:0:0:0,Vũ trụ 4:dragon4.teamobi.com:14445:0:0:0,Vũ trụ 5:dragon5.teamobi.com:14445:0:0:0,Vũ trụ 6:dragon6.teamobi.com:14445:0:0:0,Vũ trụ 7:dragon7.teamobi.com:14445:0:0:0,Vũ trụ 8:dragon10.teamobi.com:14446:0:0:0,Vũ trụ 9:dragon10.teamobi.com:14447:0:0:0,Vũ trụ 10:dragon10.teamobi.com:14445:0:0:0,Vũ trụ 11:dragon11.teamobi.com:14445:0:0:0,Võ đài liên vũ trụ:dragonwar.teamobi.com:20000:0:0:0,Universe 1:dragon.indonaga.com:14445:1:0:0,Naga:dragon.indonaga.com:14446:2:0:0,0,0";
  
  private static String E = "Vũ trụ 1:112.213.94.23:14445:0:0:0,Vũ trụ 2:210.211.109.199:14445:0:0:0,Vũ trụ 3:112.213.85.88:14445:0:0:0,Vũ trụ 4:27.0.12.164:14445:0:0:0,Vũ trụ 5:27.0.12.16:14445:0:0:0,Vũ trụ 6:27.0.12.173:14445:0:0:0,Vũ trụ 7:112.213.94.223:14445:0:0:0,Vũ trụ 8:27.0.14.66:14446:0:0:0,Vũ trụ 9:27.0.14.66:14447:0:0:0,Vũ trụ 10:27.0.14.66:14445:0:0:0,Vũ trụ 11:112.213.85.35:14445:0:0:0,Võ đài liên vũ trụ:27.0.12.173:20000:0:0:0,Universe 1:52.74.230.22:14445:1:0:0,Naga:52.74.230.22:14446:2:0:0,0,0";
  
  private static String F = "Naga:dragon.indonaga.com:14446:2:0:0,2,0";
  
  private static String G = "Naga:52.74.230.22:14446:2:0:0,2,0";
  
  private static String H = "Universe 1:dragon.indonaga.com:14445:1:0:0,1,0";
  
  private static String I = "Universe 1:52.74.230.22:14445:1:0:0,1,0";
  
  public static String j = E;
  
  public static boolean k;
  
  public static String l;
  
  public static boolean m;
  
  private static int J;
  
  private static long K;
  
  private static String L = "NRlink3";
  
  public static int n;
  
  public static boolean o;
  
  public static int p;
  
  public static int q;
  
  public static int r;
  
  public static boolean s = false;
  
  private static de M;
  
  public static int t = -1;
  
  public static boolean u;
  
  public static boolean v = true;
  
  public static String w = "svselect";
  
  private static String N = "NRlink_extra";
  
  public bs() {
    System.getProperty("com.sonyericsson.imei");
    n();
    if (!a.e) {
      z = 0;
      o();
    } 
    p.a(-1, -1);
    p.j = 100;
    p.k = 200;
    if (this.B == null) {
      this.B = new de("Gọi hotline", this, 13, null);
      this.B.j = a.A - 75;
      if (l.c == 1 && !a.e) {
        this.B.k = a.B - 20;
      } else {
        this.B.k = 8;
      } 
    } 
    boolean bool;
    if ((bool = false) == 2) {
      if (l.c == 1) {
        j = G;
        return;
      } 
      j = F;
      return;
    } 
    if (bool == true) {
      j = I;
      if (l.c == 1) {
        j = I;
        return;
      } 
      j = H;
      return;
    } 
    j = E;
    if (l.c == 1) {
      j = E;
      return;
    } 
    j = D;
  }
  
  private void n() {
    this.C = 0;
    String str;
    if (((str = av.c("acc")) == null) ? (av.b("userAo" + n) != null) : (!str.equals("") || av.b("userAo" + n) != null))
      this.C = 1; 
    true;
    en.b.A = new de[4 + this.C];
    int i = a.D - 15 * this.A.length + 28;
    for (byte b1 = 0; b1 < this.A.length; b1++) {
      switch (b1) {
        case 0:
          this.A[0] = new de("", this, 3, null);
          if (str == null) {
            (this.A[0]).b = aw.gg;
            if (av.b("userAo" + n) != null)
              (this.A[0]).b = aw.q; 
            break;
          } 
          if (str.equals("")) {
            (this.A[0]).b = aw.gg;
            if (av.b("userAo" + n) != null)
              (this.A[0]).b = aw.q; 
            break;
          } 
          (this.A[0]).b = String.valueOf(aw.gh) + ": " + str;
          if ((this.A[0]).b.length() > 23) {
            (this.A[0]).b = (this.A[0]).b.substring(0, 23);
            (this.A[0]).b = String.valueOf((this.A[0]).b) + "...";
          } 
          break;
        case 1:
          if (this.C == 1) {
            this.A[1] = new de("", this, 10100, null);
            (this.A[1]).b = aw.gg;
            break;
          } 
          this.A[1] = new de(aw.S, this, 7, null);
          break;
        case 2:
          if (this.C == 1) {
            this.A[2] = new de(aw.S, this, 7, null);
            break;
          } 
          this.A[2] = new de("", this, 17, null);
          break;
        case 3:
          if (this.C == 1) {
            this.A[3] = new de("", this, 17, null);
            break;
          } 
          this.A[3] = new de(aw.bT, this, 8, null);
          break;
        case 4:
          this.A[4] = new de(aw.bT, this, 8, null);
          break;
      } 
      (this.A[b1]).k = i;
      this.A[b1].b();
      (this.A[b1]).j = (a.A - (this.A[b1]).l) / 2;
      i += 30;
    } 
  }
  
  public static void a() {
    a(j);
  }
  
  public static void a(String paramString) {
    String[] arrayOfString = ds.a(paramString.trim(), ",", 0);
    ds.c(">>> getServerList= " + paramString);
    aw.a(Byte.parseByte(arrayOfString[arrayOfString.length - 2]));
    a = new String[arrayOfString.length - 2];
    x = new String[arrayOfString.length - 2];
    y = new short[arrayOfString.length - 2];
    d = new byte[arrayOfString.length - 2];
    h = new byte[arrayOfString.length - 2];
    i = new byte[arrayOfString.length - 2];
    for (byte b1 = 0; b1 < arrayOfString.length - 2; b1++) {
      String[] arrayOfString1 = ds.a(arrayOfString[b1].trim(), ":", 0);
      a[b1] = arrayOfString1[0];
      x[b1] = arrayOfString1[1];
      y[b1] = Short.parseShort(arrayOfString1[2]);
      d[b1] = Byte.parseByte(arrayOfString1[3].trim());
      try {
        h[b1] = Byte.parseByte(arrayOfString1[4].trim());
      } catch (Exception exception) {
        h[b1] = 0;
      } 
      try {
        i[b1] = Byte.parseByte(arrayOfString1[5].trim());
      } catch (Exception exception) {
        i[b1] = 0;
      } 
    } 
    b = Byte.parseByte(arrayOfString[arrayOfString.length - 1]);
    ds.c(">>> getServerList= serverPriority: " + b);
    p();
  }
  
  public final void a(en paramen) {
    if (!u) {
      paramen.a(0);
      paramen.d(0, 0, a.A, a.B);
    } else {
      a.c(paramen);
    } 
    di.s.a(paramen, "v2.4.6(" + en.b + ")", a.A - 2, 17, 1, di.o);
    try {
      String str = "";
      if (t == 0) {
        String.valueOf(str) + a[n] + " disconnect";
      } else {
        String.valueOf(str) + a[n] + " connected";
      } 
    } catch (Exception exception) {}
    if (!s || u) {
      if (l.c == 1 && !a.e) {
        di.s.a(paramen, l, a.A - 2, a.B - 15, 1, di.o);
      } else {
        di.s.a(paramen, l, a.A - 2, 2, 1, di.o);
      } 
    } else {
      di.s.a(paramen, l, a.A - 2, 2, 1, di.o);
    } 
    en en1 = paramen;
    if (!u) {
      if (!o) {
        paramen.a(x.j, a.C, a.D - 32, 3);
        if (!s) {
          di.c.a(paramen, aw.gb, a.C, a.D + 24, 2);
          if (M != null) {
            M.a(paramen);
            return;
          } 
        } else {
          if (M != null)
            M.a(paramen); 
          paramen.e(0, 0, a.A, a.B);
          di.c.a(paramen, String.valueOf(aw.aD) + p + "%", a.A / 2, a.D + 24, 2);
          p.a(p.ai, p.aj, p.ak, (a.A / 2 - 50), (a.D + 45), 100, 100.0F, paramen);
          p.a(p.af, p.ag, p.ah, (a.A / 2 - 50), (a.D + 45), 100, p, paramen);
          return;
        } 
      } 
    } else {
      int i;
      if ((i = a.D - 15 * this.A.length - 15) < 25)
        i = 25; 
      if (x.j != null)
        paramen.a(x.j, a.C, i, 3); 
      i = this.A.length;
      for (byte b1 = 0; b1 < i; b1++)
        this.A[b1].a(paramen); 
      paramen.e(0, 0, a.A, a.B);
      if (en.b == 1)
        if (t == -1) {
          if (a.w % 20 > 10) {
            paramen.a(p.ae, 0, 14, 7, 7, 0, (a.A - di.f.a((this.A[2 + this.C]).b) >> 1) - 10, (this.A[2 + this.C]).k + 10, 0);
            return;
          } 
        } else {
          paramen.a(p.ae, 0, t * 7, 7, 7, 0, (a.A - di.f.a((this.A[2 + this.C]).b) >> 1) - 10, (this.A[2 + this.C]).k + 9, 0);
        }  
    } 
  }
  
  public final void c() {
    if (m) {
      if (++J == 50) {
        a.ak.i();
        m = false;
      } 
      if (J == 100) {
        if (a.I == null)
          a.I = new x(); 
        a.I.a();
        bt.a().r();
        m = false;
      } 
    } 
    for (byte b1 = 0; b1 < this.A.length; b1++) {
      if (b1 == z) {
        (this.A[b1]).n = true;
      } else {
        (this.A[b1]).n = false;
      } 
    } 
    p.j++;
    if (!u && (o || p == 100))
      M = null; 
    super.c();
    if (af.bI)
      return; 
    if (!u)
      return; 
    if (!v)
      return; 
    if (a.E != this)
      return; 
    if (!br.a().d())
      if (l.d() > K) {
        a(n, true);
        br.a().e();
        k();
      } else {
        return;
      }  
    K = l.d() + 5000L;
  }
  
  private void o() {
    ds.c("load Screen= " + u + " select= " + z);
    if (u) {
      this.cn = new de("", this, (this.A[z]).e, null);
      return;
    } 
    this.cn = M;
  }
  
  public static void b(en paramen) {}
  
  public static void e() {}
  
  public final void d() {
    if (a.e) {
      if (this.B != null && this.B.c())
        this.B.a(); 
      if (!u) {
        if (M != null && M.c())
          M.a(); 
        super.d();
        return;
      } 
      int i = this.A.length;
      for (byte b1 = 0; b1 < i; b1++) {
        if (this.A[b1] != null && this.A[b1].c())
          this.A[b1].a(); 
      } 
    } else {
      if (l.c == 1 && a.i[13]) {
        a.i[13] = false;
        this.B.a();
      } 
      if (u) {
        if (a.i[8]) {
          int i = this.A.length - 1;
          a.i[8] = false;
          if (++z > i)
            z = 0; 
          o();
        } 
        if (a.i[2]) {
          int i = this.A.length - 1;
          a.i[2] = false;
          if (--z < 0)
            z = i; 
          o();
        } 
      } 
    } 
    super.d();
  }
  
  private static void p() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeByte(aw.fA);
      dataOutputStream.writeByte(a.length);
      for (byte b1 = 0; b1 < a.length; b1++) {
        dataOutputStream.writeUTF(a[b1]);
        dataOutputStream.writeUTF(x[b1]);
        dataOutputStream.writeShort(y[b1]);
        dataOutputStream.writeByte(d[b1]);
        try {
          dataOutputStream.writeByte(h[b1]);
        } catch (Exception exception) {
          dataOutputStream.writeByte(0);
        } 
        try {
          dataOutputStream.writeByte(i[b1]);
        } catch (Exception exception) {
          dataOutputStream.writeByte(0);
        } 
      } 
      dataOutputStream.writeByte(b);
      av.a(L, byteArrayOutputStream.toByteArray());
      dataOutputStream.close();
      em.e();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public static void f() {
    byte[] arrayOfByte;
    if ((arrayOfByte = av.b(L)) == null) {
      a(j);
      return;
    } 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
    try {
      aw.a(dataInputStream.readByte());
      byte b1;
      a = new String[b1 = dataInputStream.readByte()];
      x = new String[b1];
      y = new short[b1];
      d = new byte[b1];
      h = new byte[b1];
      i = new byte[b1];
      for (byte b2 = 0; b2 < b1; b2++) {
        a[b2] = dataInputStream.readUTF();
        x[b2] = dataInputStream.readUTF();
        y[b2] = dataInputStream.readShort();
        d[b2] = dataInputStream.readByte();
        try {
          h[b2] = dataInputStream.readByte();
        } catch (Exception exception) {
          h[b2] = 0;
        } 
        try {
          i[b2] = dataInputStream.readByte();
        } catch (Exception exception) {
          i[b2] = 0;
        } 
      } 
      b = dataInputStream.readByte();
      dataInputStream.close();
      em.e();
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  public final void b() {
    dh.b();
    p.k = 0;
    p.j = 0;
    n();
    c = false;
    a.I = null;
    String str;
    boolean bool;
    if (bool = ((str = av.c("ResVersion")) != null && str != "") ? Integer.parseInt(str) : true) {
      u = true;
      a.a(0);
    } 
    o = true;
    (this.A[2 + this.C]).b = String.valueOf(aw.aI) + ": " + a[n];
    this.cn = new de("", this, (this.A[z]).e, null);
    (this.A[1 + this.C]).b = aw.S;
    if (this.A.length == 4 + this.C)
      (this.A[3 + this.C]).b = aw.bT; 
    af.bI = false;
    l.a();
    super.b();
  }
  
  public final void g() {
    p.k = 0;
    p.j = 0;
    n();
    c = false;
    a.I = null;
    String str;
    boolean bool;
    if (bool = ((str = av.c("ResVersion")) != null && str != "") ? Integer.parseInt(str) : true) {
      u = true;
      a.a(0);
    } 
    o = true;
    (this.A[2 + this.C]).b = String.valueOf(aw.aI) + ": " + a[n];
    this.cn = new de("", this, (this.A[z]).e, null);
    (this.A[1 + this.C]).b = aw.S;
    if (this.A.length == 4 + this.C)
      (this.A[3 + this.C]).b = aw.bT; 
    super.b();
  }
  
  public final void h() {
    if (a.ak == null)
      a.ak = new bs(); 
    r = 0;
    p = 0;
    k = true;
    a.ak.j();
    s = false;
    M.n = true;
    this.cn = new de("", this, 2, null);
  }
  
  public final void i() {
    a.b(aw.aB);
    br.a().e();
    GameMidlet.a = x[n];
    GameMidlet.b = y[n];
    av.a(w, n);
    if (d[n] != aw.fA)
      aw.a(d[n]); 
    x.i = a[n];
    n();
    u = true;
    t = -1;
    v = true;
  }
  
  public final void a(int paramInt, Object paramObject) {
    ds.c("perform trong ServerListScreen" + paramInt);
    if (paramInt == 1000)
      a.b(); 
    if (paramInt == 1 || paramInt == 4) {
      br.a().e();
      v = false;
      u = true;
      t = 0;
      s = false;
      av.a();
      b();
    } 
    if (paramInt == 2) {
      k = false;
      (M = new de(aw.gc, this, 4, null)).j = a.A / 2 - bb.cq / 2;
      M.k = a.D + 65;
      this.co = null;
      if (!a.e) {
        M.j = a.A / 2 - bb.cq / 2;
        M.k = a.B - bb.cr - 1;
      } 
      this.cn = new de("", this, 4, null);
      if (!s) {
        bt.a().b((byte)1, (el)null);
        if (!a.e) {
          M.n = true;
          this.cn = new de("", this, 4, null);
        } 
        s = true;
      } 
    } 
    if (paramInt == 3)
      l(); 
    if (paramInt == 10100) {
      if (a.I == null)
        a.I = new x(); 
      a.I.b();
      a.b();
      bt.a().f("");
      ds.c("tao user ao");
      a.i();
      x.i = a[n];
    } 
    if (paramInt == 5) {
      a();
      if (a.length == 1)
        return; 
      paramObject = new el("");
      for (byte b1 = 0; b1 < a.length; b1++)
        paramObject.addElement(new de(a[b1], this, 6, null)); 
      a.F.a((el)paramObject);
      if (!a.e)
        a.F.b = n; 
    } 
    if (paramInt == 6) {
      a(a.F.b, false);
      i();
    } 
    if (paramInt == 7) {
      if (a.I == null)
        a.I = new x(); 
      a.I.b();
    } 
    if (paramInt == 8) {
      boolean bool = (av.d("lowGraphic") == 1) ? true : false;
      el el;
      (el = new el("cau hinh")).addElement(new de(aw.y, this, 9, null));
      el.addElement(new de(aw.z, this, 10, null));
      a.F.a(el);
      if (bool) {
        a.F.b = 0;
      } else {
        a.F.b = 1;
      } 
    } 
    if (paramInt == 9) {
      av.a("lowGraphic", 1);
      a.a(aw.cL, 8885, null);
    } 
    if (paramInt == 10) {
      av.a("lowGraphic", 0);
      a.a(aw.cL, 8885, null);
    } 
    if (paramInt == 11) {
      if (a.I == null)
        a.I = new x(); 
      a.I.b();
      if ((paramObject = av.c("userAo" + n)) == null || paramObject.equals("")) {
        bt.a().f("");
      } else {
        a.I.n = true;
        a.b();
        bt.a().c();
        bt.a().a((String)paramObject, "", "2.4.6", (byte)1);
      } 
      a.b(aw.aB);
      ds.c("tao user ao");
    } 
    if (paramInt == 12)
      GameMidlet.f.a(); 
    if (paramInt == 13 && (!s || u))
      switch (l.c) {
        case 1:
          l.b();
          break;
      }  
    if (paramInt == 14) {
      paramObject = new de(aw.bm, a.ak, 15, null);
      de de1 = new de(aw.bn, a.ak, 16, null);
      a.a(aw.gf, (de)paramObject, de1);
    } 
    if (paramInt == 15) {
      av.a();
      a.a(aw.cL, 8885, null);
    } 
    if (paramInt == 16) {
      bp.c();
      a.K = null;
    } 
    if (paramInt == 17) {
      if (a.al == null)
        a.al = new eu(); 
      a.al.b();
    } 
    if (paramInt == 18) {
      a.h();
      bp.c();
      if (a.al == null)
        a.al = new eu(); 
      a.al.b();
    } 
    if (paramInt == 19) {
      if (l.c == 1) {
        bp.c();
        a.K = null;
        return;
      } 
      t = 0;
      v = true;
    } 
  }
  
  public final void j() {
    p.j = 0;
    p.k = 0;
    n();
    u = false;
    p = 0;
    o = false;
    s = false;
    r = 0;
    af.bI = false;
    bs bs1 = this;
    if (!u) {
      (M = new de(aw.gd, bs1, 2, null)).n = true;
      M.j = a.A / 2 - bb.cq / 2;
      M.k = a.D + 45;
      if (M.k > a.B - 26)
        M.k = a.B - 26; 
    } 
    if (!a.e) {
      z = 0;
      bs1.o();
    } 
    super.b();
  }
  
  public static void k() {
    GameMidlet.a = x[n];
    GameMidlet.b = y[n];
    aw.a(d[n]);
    x.i = a[n];
    a.b();
  }
  
  public static void a(int paramInt, boolean paramBoolean) {
    n = paramInt;
    if (paramBoolean) {
      av.a(w, n);
      ds.b("2>>>saveRMSInt:  RMS_svselect == " + n);
    } 
  }
  
  public static void l() {
    if (a.I == null)
      a.I = new x(); 
    a.I.b();
    boolean bool1 = false;
    boolean bool2 = false;
    String str = av.c("userAo" + n);
    try {
      if (!av.c("acc").equals(""))
        bool1 = true; 
      if (!str.equals(""))
        bool2 = true; 
    } catch (Exception exception) {}
    a.b();
    bt.a().c();
    if (!bool1 && !bool2) {
      a.b();
      if (str == null || str.equals("")) {
        bt.a().f("");
      } else {
        a.I.n = true;
        bt.a().a(str, "", "2.4.6", (byte)1);
      } 
      av.a(w, n);
      if ((br.a()).d) {
        a.i();
      } else {
        a.a(aw.cL, 8884, null);
      } 
    } else {
      a.I.a();
    } 
    x.i = a[n];
  }
  
  public static void m() {
    if (e == null)
      return; 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeByte((byte)e.length);
      for (byte b1 = 0; b1 < e.length; b1++) {
        dataOutputStream.writeByte(e[b1]);
        if (e[b1] >= 0 && f != null && f[b1] != null) {
          dataOutputStream.writeShort((short)(f[b1]).bU);
          dataOutputStream.writeShort((short)(f[b1]).bW);
          dataOutputStream.writeShort((short)(f[b1]).bV);
          dataOutputStream.writeShort((short)(f[b1]).bX);
          dataOutputStream.writeUTF((f[b1]).ag);
        } 
      } 
      av.a(N, byteArrayOutputStream.toByteArray());
      dataOutputStream.close();
      em.e();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\bs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */