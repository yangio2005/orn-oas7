import javax.microedition.lcdui.Image;
import main.a;

public final class ch {
  private el d = new el("EffectEnd VecEffEnd");
  
  private df e;
  
  private byte[] f = new byte[10];
  
  private byte[] g = new byte[10];
  
  private int h = 0;
  
  private int i = 0;
  
  private int j = 0;
  
  private int k = 0;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private int t;
  
  public int a;
  
  private int u;
  
  private int v;
  
  private int w;
  
  private int x;
  
  private int y;
  
  private int z;
  
  private int A;
  
  private int B;
  
  private int C;
  
  private int D;
  
  private int E;
  
  private int F;
  
  private short G;
  
  private long H;
  
  public boolean b;
  
  private boolean I;
  
  private af J;
  
  private bk[] K;
  
  private bk L;
  
  public static short[][] c = new short[][] { 
      { 68, 264, 4 }, { 30, 120, 4 }, { 66, 280, 4 }, { 0, 0, 1 }, { 111, 68, 2 }, { 90, 68, 2 }, { 125, 68, 2 }, { 47, 282, 6 }, { 10, 40, 4 }, { 92, 525, 7 }, 
      { 62, 372, 6 }, { 80, 352, 4 }, { 80, 352, 4 }, { 80, 352, 4 }, { 72, 240, 3 }, { 20, 42, 3 }, { 65, 160, 4 }, { 50, 300, 6 }, { 84, 168, 2 }, { 90, 540, 6 }, 
      { 180, 900, 6 }, { 62, 186, 3 }, { 34, 80, 4 }, { 140, 560, 4 }, { 64, 600, 6 }, { 36, 200, 5 }, { 35, 200, 5 }, { 50, 250, 5 }, { 50, 240, 6 } };
  
  private int M;
  
  private int N;
  
  private int O;
  
  private int P;
  
  private int Q;
  
  private int[] R;
  
  private int[] S;
  
  private int[] T;
  
  private int[] U;
  
  private static int[][] V = new int[][] { { 16310304, 16298056, 16777215 }, { 7045120, 12643960, 16777215 }, { 2407423, 11987199, 16777215 } };
  
  private int[] W;
  
  private int X;
  
  private int Y;
  
  private int Z;
  
  private df[] aa;
  
  public static Image a(int paramInt) {
    if (paramInt < 0)
      return null; 
    String str = "/e/e_" + paramInt + ".png";
    Image image = null;
    try {
      image = l.b(str);
    } catch (Exception exception) {}
    return image;
  }
  
  public ch(int paramInt1, int paramInt2, int paramInt3, af paramaf, bk parambk, int paramInt4, short paramShort1, short paramShort2) {
    (new byte[24])[0] = 12;
    (new byte[24])[1] = 11;
    (new byte[24])[2] = 10;
    (new byte[24])[3] = 9;
    (new byte[24])[4] = 8;
    (new byte[24])[5] = 7;
    (new byte[24])[6] = 6;
    (new byte[24])[7] = 5;
    (new byte[24])[8] = 4;
    (new byte[24])[9] = 3;
    (new byte[24])[10] = 2;
    (new byte[24])[11] = 1;
    (new byte[24])[13] = 23;
    (new byte[24])[14] = 22;
    (new byte[24])[15] = 21;
    (new byte[24])[16] = 20;
    (new byte[24])[17] = 19;
    (new byte[24])[18] = 18;
    (new byte[24])[19] = 17;
    (new byte[24])[20] = 16;
    (new byte[24])[21] = 15;
    (new byte[24])[22] = 14;
    (new byte[24])[23] = 13;
    (new byte[24])[2] = 2;
    (new byte[24])[3] = 1;
    (new byte[24])[4] = 1;
    (new byte[24])[5] = 2;
    (new byte[24])[8] = 2;
    (new byte[24])[9] = 1;
    (new byte[24])[10] = 1;
    (new byte[24])[11] = 2;
    (new byte[24])[14] = 2;
    (new byte[24])[15] = 1;
    (new byte[24])[16] = 1;
    (new byte[24])[17] = 2;
    (new byte[24])[20] = 2;
    (new byte[24])[21] = 1;
    (new byte[24])[22] = 1;
    (new byte[24])[23] = 2;
    (new byte[24])[0] = 2;
    (new byte[24])[1] = 2;
    (new byte[24])[2] = 3;
    (new byte[24])[3] = 3;
    (new byte[24])[4] = 3;
    (new byte[24])[5] = 4;
    (new byte[24])[6] = 5;
    (new byte[24])[7] = 5;
    (new byte[24])[8] = 5;
    (new byte[24])[9] = 5;
    (new byte[24])[10] = 5;
    (new byte[24])[11] = 1;
    (new byte[24])[17] = 7;
    (new byte[24])[18] = 6;
    (new byte[24])[19] = 6;
    (new byte[24])[20] = 6;
    (new byte[24])[21] = 6;
    (new byte[24])[22] = 6;
    (new byte[24])[23] = 2;
    this.X = 0;
    this.u = 0;
    this.E = 0;
    this.i = paramInt1;
    this.j = paramInt2;
    this.h = paramInt3;
    this.J = paramaf;
    if (paramaf.b(1265))
      if (this.i == 21 || this.i == 22 || this.i == 23) {
        this.J.B += 10 * this.J.I;
      } else if (this.i == 18 || this.i == 19 || this.i == 20) {
        this.J.B += -15 * this.J.I;
      } else {
        this.J.B += 15 * this.J.I;
      }  
    this.o = this.J.B;
    this.p = this.J.C;
    this.s = this.J.I;
    this.t = (this.s == -1) ? 2 : 0;
    this.L = parambk;
    this.a = paramInt4;
    this.H = l.d();
    this.G = paramShort1;
    this.k = paramShort2;
    this.b = this.I = false;
    this.n = 4;
    f();
    b();
  }
  
  public ch(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, short paramShort, bk[] paramArrayOfbk) {
    (new byte[24])[0] = 12;
    (new byte[24])[1] = 11;
    (new byte[24])[2] = 10;
    (new byte[24])[3] = 9;
    (new byte[24])[4] = 8;
    (new byte[24])[5] = 7;
    (new byte[24])[6] = 6;
    (new byte[24])[7] = 5;
    (new byte[24])[8] = 4;
    (new byte[24])[9] = 3;
    (new byte[24])[10] = 2;
    (new byte[24])[11] = 1;
    (new byte[24])[13] = 23;
    (new byte[24])[14] = 22;
    (new byte[24])[15] = 21;
    (new byte[24])[16] = 20;
    (new byte[24])[17] = 19;
    (new byte[24])[18] = 18;
    (new byte[24])[19] = 17;
    (new byte[24])[20] = 16;
    (new byte[24])[21] = 15;
    (new byte[24])[22] = 14;
    (new byte[24])[23] = 13;
    (new byte[24])[2] = 2;
    (new byte[24])[3] = 1;
    (new byte[24])[4] = 1;
    (new byte[24])[5] = 2;
    (new byte[24])[8] = 2;
    (new byte[24])[9] = 1;
    (new byte[24])[10] = 1;
    (new byte[24])[11] = 2;
    (new byte[24])[14] = 2;
    (new byte[24])[15] = 1;
    (new byte[24])[16] = 1;
    (new byte[24])[17] = 2;
    (new byte[24])[20] = 2;
    (new byte[24])[21] = 1;
    (new byte[24])[22] = 1;
    (new byte[24])[23] = 2;
    (new byte[24])[0] = 2;
    (new byte[24])[1] = 2;
    (new byte[24])[2] = 3;
    (new byte[24])[3] = 3;
    (new byte[24])[4] = 3;
    (new byte[24])[5] = 4;
    (new byte[24])[6] = 5;
    (new byte[24])[7] = 5;
    (new byte[24])[8] = 5;
    (new byte[24])[9] = 5;
    (new byte[24])[10] = 5;
    (new byte[24])[11] = 1;
    (new byte[24])[17] = 7;
    (new byte[24])[18] = 6;
    (new byte[24])[19] = 6;
    (new byte[24])[20] = 6;
    (new byte[24])[21] = 6;
    (new byte[24])[22] = 6;
    (new byte[24])[23] = 2;
    this.X = 0;
    this.u = 0;
    this.E = 0;
    this.i = paramInt1;
    this.j = paramInt2;
    this.h = paramInt3;
    this.o = paramInt4;
    this.p = paramInt5;
    this.a = paramInt6;
    this.s = paramInt7;
    this.t = (paramInt7 == -1) ? 2 : 0;
    this.H = l.d();
    this.G = paramShort;
    this.b = this.I = false;
    this.n = 4;
    if (paramArrayOfbk != null) {
      this.K = new bk[paramArrayOfbk.length];
      for (paramInt1 = 0; paramInt1 < this.K.length; paramInt1++)
        this.K[paramInt1] = paramArrayOfbk[paramInt1]; 
    } 
    f();
    b();
  }
  
  private void b() {
    try {
      ch ch1;
      int j = this.p;
      int i = this.o;
      try {
        ds.d(3);
      } catch (Exception exception) {
        ds.b("ERR setSoundSkill_END: " + exception.toString());
      } 
      switch (this.i) {
        case 0:
        case 1:
        case 2:
          j = this.i;
          ch1 = this;
          switch (j) {
            case 0:
              ch1.e = new df(4);
              break;
            case 1:
              ch1.e = new df(5);
              break;
            case 2:
              ch1.e = new df(6);
              break;
          } 
          ch1.l = 100;
          ch1.B = a.B / 3 + 10;
          ch1.x = 10;
          ch1.z = 0;
          ch1.I = false;
          return;
        case 3:
          c();
          return;
        case 16:
        case 17:
          if ((ch1 = this).i == 17) {
            ch1.o += (ch1.s == 0) ? 0 : -(ch1.aa[0]).a;
            ch1.p -= (ch1.aa[0]).b / 2;
          } 
          return;
        case 18:
        case 19:
        case 20:
          (ch1 = this).f = null;
          ch1.n = 3;
          if (ch1.i == 18) {
            if (ch1.j == 0) {
              ch1.f = new byte[] { 0, 0, 0, 1, 1, 1, 2, 2, 2 };
            } else {
              ch1.f = new byte[] { 
                  3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 
                  6, 6 };
              return;
            } 
          } else {
            return;
          } 
          return;
        case 21:
        case 22:
        case 23:
          if ((ch1 = this).J != null) {
            if (ch1.i == 21) {
              ch1.o = ch1.J.B - 3 * ch1.J.I;
              ch1.p = ch1.J.C;
            } else if (ch1.i == 22) {
              ch1.o = ch1.J.B + 20 * ch1.J.I;
              ch1.p = ch1.J.C - 4;
            } else if (ch1.i == 23) {
              ch1.o = ch1.J.B;
              ch1.p = ch1.J.C - 50;
            } else {
              ch1.o = ch1.J.B;
              ch1.p = ch1.J.C;
              return;
            } 
          } else {
            return;
          } 
          return;
        case 24:
          (ch1 = this).q = (ch1.aa[0]).a;
          ch1.r = (ch1.aa[0]).b;
          ch1.C = ds.g(ch1.o - ch1.L.b);
          ch1.f = new byte[] { 0, 0, 0, 1, 1, 1 };
          ch1.I = false;
          return;
        case 25:
          d();
          return;
        case 26:
          (ch1 = this).f = new byte[] { 0, 0, 0, 1, 1, 1, 2, 2, 2 };
          ch1.I = false;
          ch1.m = 10;
          ch1.y = ch1.o;
          ch1.z = ch1.p + 12;
          ch1.F = 25;
          ch1.B = 19;
          if (ch1.j == 1) {
            ch1.B = 21;
          } else if (ch1.j == 2) {
            ch1.B = 31;
          } 
          ch1.r = (ch1.aa[1]).b + 50 - ch1.B;
          ch1.x = 1;
          ch1.A = 1;
          ch1.p = ch1.z - ch1.r;
          ch1.M = 90;
          ch1.C = 1;
          ch1.N = ch1.O = 25;
          ch1.Q = 1;
          if (ch1.K != null && ch1.K.length > 0)
            ch1.Q = ch1.K.length; 
          ch1.P = 360 / ch1.Q;
          ch1.R = new int[ch1.Q];
          ch1.S = new int[ch1.Q];
          ch1.T = new int[ch1.Q];
          ch1.U = new int[ch1.Q];
          p.a(16, 0, ch1.h, ch1.y, ch1.z, 1, 0, (short)-1, null);
          return;
        case 9:
          (ch1 = this).X = ch1.j;
          ch1.y = ch1.o * 1000;
          ch1.z = ch1.p * 1000;
          ch1.l = ds.b(4, 6);
          ch1.C = 5;
          ch1.Y = 10;
          ch1.Z = 20;
          ch1.a(ch1.C, ch1.Y, ch1.Z, 0);
          return;
        case 10:
        case 11:
          e();
          break;
      } 
      return;
    } catch (Exception exception) {
      ds.b("ERR create_Effect: " + exception.toString());
      ch ch1;
      (ch1 = this).b = true;
    } 
  }
  
  public final void a() {
    try {
      ch ch1;
      byte b1;
      byte b2;
      this.u++;
      switch (this.i) {
        case 0:
        case 1:
        case 2:
          (ch1 = this).o = a.C;
          ch1.p = ch1.z;
          if (ch1.u > ch1.l) {
            ch ch2;
            (ch2 = ch1).b = true;
          } 
          ch1.x++;
          if (ch1.x > 15)
            ch1.x = 15; 
          if (ch1.z + ch1.x < ch1.B) {
            ch1.z += ch1.x;
          } else {
            ch1.z = ch1.B;
            if (!ch1.I) {
              ch1.I = true;
              if (ch1.j != -1)
                p.a(ch1.j, 0, 0, ch1.o, ch1.p, ch1.a, 0, (short)-1, null); 
            } 
            return;
          } 
          return;
        case 3:
          ch1 = this;
          for (b1 = 0; b1 < ch1.d.size(); b1++) {
            bk bk1;
            (bk1 = ch1.d.elementAt(b1)).a();
            if (bk1.i - bk1.j > bk1.p.c * 3 - 1) {
              bk1.i = 0;
              if (ch1.j == 0) {
                bk1.j = ds.d(10);
                byte b = 1;
                if (b1 % 2 == 0)
                  b = -1; 
                bk1.b = ch1.o + ds.d(c[5][0] / 2) * b;
                bk1.c = ch1.p - ds.d(c[5][1] / 2);
              } 
            } 
          } 
          if (ch1.u >= ch1.l) {
            ch ch2;
            (ch2 = ch1).b = true;
          } 
          return;
        case 16:
        case 17:
          if ((ch1 = this).G > 0) {
            if (a.b - ch1.H >= ch1.G) {
              ch ch2;
              (ch2 = ch1).b = true;
            } else {
              return;
            } 
          } else {
            if (ch1.u >= (ch1.aa[0]).c * ch1.n) {
              ch ch2;
              (ch2 = ch1).b = true;
            } 
            return;
          } 
          return;
        case 18:
        case 19:
        case 20:
          if ((ch1 = this).J != null) {
            ch1.o = ch1.J.B;
            ch1.p = ch1.J.C + 13;
          } 
          if (ch1.G > 0) {
            if (a.b - ch1.H >= ch1.G) {
              ch ch2;
              (ch2 = ch1).b = true;
            } else {
              return;
            } 
          } else if (ch1.f != null) {
            if (ch1.u > ch1.f.length) {
              ch ch2;
              (ch2 = ch1).b = true;
            } else {
              return;
            } 
          } else {
            if (ch1.u >= (ch1.aa[0]).c * ch1.n) {
              ch ch2;
              (ch2 = ch1).b = true;
            } 
            return;
          } 
          return;
        case 21:
        case 22:
        case 23:
          if ((ch1 = this).J != null)
            if (ch1.i == 21) {
              ch1.o = ch1.J.B - 3 * ch1.J.I;
              ch1.p = ch1.J.C;
            } else if (ch1.i == 22) {
              ch1.o = ch1.J.B + 20 * ch1.J.I;
              ch1.p = ch1.J.C - 4;
            } else if (ch1.i == 23) {
              ch1.o = ch1.J.B;
              ch1.p = ch1.J.C - 50;
            } else {
              ch1.o = ch1.J.B;
              ch1.p = ch1.J.C;
            }  
          if (ch1.G > 0) {
            if (a.b - ch1.H >= ch1.G) {
              ch ch2;
              (ch2 = ch1).b = true;
            } else {
              return;
            } 
          } else {
            if (ch1.u >= (ch1.aa[0]).c * ch1.n) {
              ch ch2;
              (ch2 = ch1).b = true;
            } 
            return;
          } 
          return;
        case 24:
          (ch1 = this).w++;
          ch1.q += 20;
          if (ch1.q > ch1.C)
            ch1.q = ch1.C; 
          ch1.o = ch1.J.B + 10;
          ch1.p = ch1.J.C - 3;
          if (ch1.s == -1)
            ch1.o = ch1.J.B - ch1.q - 10; 
          if (!ch1.I && a.b - ch1.H >= ch1.G) {
            ch1.u = 0;
            ch1.f = new byte[] { 2, 2, 2, 3, 3, 3 };
            ch1.I = true;
          } 
          if (ch1.u > ch1.f.length - 1) {
            if (ch1.I) {
              ch ch2;
              (ch2 = ch1).b = true;
            } else {
              ch1.u = 0;
              return;
            } 
          } else {
            return;
          } 
          return;
        case 25:
          ch1 = this;
          b1 = 0;
          for (b2 = 0; b2 < ch1.d.size(); b2++) {
            bk bk1;
            if (!(bk1 = ch1.d.elementAt(b2)).n && a.b - ch1.H >= (b2 * ch1.m)) {
              bk1.n = true;
              p.a(17, 0, ch1.h, ch1.J.B, ch1.J.C - 3, 2, ch1.t, (short)-1, null);
              ch1.d.size();
            } 
            if (bk1.n && !bk1.m) {
              bk1.i++;
              if (!bk1.o) {
                if (bk1.i < 10 && b2 == ch1.d.size() - 1 && ch1.J != null && !bv.a(ch1.J.B - (ch1.J.am + 1) * ch1.J.I, ch1.J.C, (ch1.J.I == 1) ? 8 : 4))
                  ch1.J.B -= ch1.J.I; 
                int j = bk1.h;
                int i = bk1.g;
                bk bk2 = bk1;
                int k = i - bk2.b;
                int m = j - bk2.c;
                if (k > 1) {
                  k = ds.a(k, m);
                  bk2.k = bk2.a(k);
                } 
                if (ds.g(bk2.e) > 0 && ds.g(bk2.b - i) >= ds.g(bk2.e)) {
                  bk2.b += bk2.e;
                } else {
                  bk2.b = i;
                  bk2.e = 0;
                } 
                if (ds.g(bk2.f) > 0 && ds.g(bk2.c - j) >= ds.g(bk2.f)) {
                  bk2.c += bk2.f;
                } else {
                  bk2.c = j;
                  bk2.f = 0;
                } 
                if (bk1.b == bk1.g) {
                  bk1.o = true;
                  bk1.i = 0;
                } 
              } 
              if (bk1.o && bk1.i >= ch1.n * bk1.q.c)
                bk1.m = true; 
            } 
            if (bk1.m)
              b1++; 
          } 
          if (b1 == ch1.d.size()) {
            ch ch2;
            (ch2 = ch1).b = true;
          } 
          return;
        case 26:
          if ((ch1 = this).E == 0) {
            ch1.v++;
            if (ch1.v > ch1.f.length - 1)
              ch1.v = ch1.f.length - 1; 
            if (ch1.u == ch1.m + 4)
              p.a(16, 1, ch1.h, ch1.o, ch1.p, 3, 0, (short)2945, null); 
            if (ch1.u > ch1.m + 4) {
              ch1.M--;
              if (ch1.M < 0) {
                ch1.M = 0;
                ch1.u = 0;
                ch1.w = 0;
                ch1.g = new byte[] { 
                    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                    1, 1, 2 };
                b2 = 1;
                ch ch2;
                if ((ch2 = ch1).K != null)
                  for (byte b = 0; b < ch2.K.length; b++) {
                    if (ch2.K[b] != null)
                      if ((ch2.K[b]).a == 0) {
                        aa aa;
                        if ((aa = p.c((ch2.K[b]).l)) != null)
                          aa.Y = true; 
                      } else {
                        af af1;
                        if ((af.e()).J == (ch2.K[b]).l) {
                          af1 = af.e();
                        } else {
                          af1 = p.b((ch2.K[b]).l);
                        } 
                        if (af1 != null)
                          af1.bR = true; 
                      }  
                  }  
                ch1.E = 1;
              } else {
                ch ch2;
                if ((ch2 = ch1).C < 40)
                  ch2.C += 2; 
                ch2.N = ch2.O;
                ch2.N -= ch2.C;
                if (ch2.N >= 360)
                  ch2.N -= 360; 
                if (ch2.N < 0)
                  ch2.N += 360; 
                ch2.O = ch2.N;
                ch2 = ch1;
                for (b2 = 0; b2 < ch2.S.length; b2++) {
                  if (ch2.N >= 360)
                    ch2.N -= 360; 
                  if (ch2.N < 0)
                    ch2.N += 360; 
                  ch2.S[b2] = ds.g(ch2.M * ds.a(ch2.N) / 1024);
                  ch2.R[b2] = ds.g(ch2.M * ds.b(ch2.N) / 1024);
                  if (ch2.N < 90) {
                    ch2.T[b2] = ch2.o + ch2.R[b2];
                    ch2.U[b2] = ch2.p - ch2.S[b2];
                  } else if (ch2.N >= 90 && ch2.N < 180) {
                    ch2.T[b2] = ch2.o - ch2.R[b2];
                    ch2.U[b2] = ch2.p - ch2.S[b2];
                  } else if (ch2.N >= 180 && ch2.N < 270) {
                    ch2.T[b2] = ch2.o - ch2.R[b2];
                    ch2.U[b2] = ch2.p + ch2.S[b2];
                  } else {
                    ch2.T[b2] = ch2.o + ch2.R[b2];
                    ch2.U[b2] = ch2.p + ch2.S[b2];
                  } 
                  ch2.N -= ch2.P;
                } 
                ch1.a(true);
              } 
            } else {
              return;
            } 
          } else if (ch1.E == 1) {
            ch1.w++;
            if (ch1.w > ch1.g.length - 1) {
              ch1.w = ch1.g.length - 1;
              if (a.w % 2 == 0)
                ch1.A++; 
              ch1.x += ch1.A;
              if (ch1.x >= ch1.r - (ch1.aa[0]).b - ch1.F + ch1.B) {
                ch1.x = ch1.r - (ch1.aa[0]).b - ch1.F + ch1.B;
                ch1.u = 0;
                ch1.w = 0;
                ch1.E = 2;
                ch1.g = new byte[] { 
                    3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 
                    5 };
              } else {
                return;
              } 
            } else {
              return;
            } 
          } else if (ch1.E == 2) {
            ch1.w++;
            if (ch1.w > ch1.g.length - 1) {
              ch1.E = 3;
              ch1.v = 0;
              ch1.f = new byte[] { 2, 2, 1, 1, 3, 3, 3, 4, 4, 4 };
            } else {
              return;
            } 
          } else if (ch1.E == 3) {
            ch1.v++;
            if (ch1.v > ch1.f.length - 1) {
              ch1.v = 0;
              ch1.E = 4;
              ch1.f = new byte[] { 
                  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                  0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 
                  4, 4, 4, 3, 3, 4, 4 };
            } else {
              return;
            } 
          } else {
            ch1.v++;
            if (ch1.v > ch1.f.length - 1)
              ch1.v = 0; 
            if (a.b - ch1.H >= ch1.G) {
              p.a(16, 0, ch1.h, ch1.y, ch1.z, 1, 0, (short)-1, null);
              ch1.a(false);
              ch ch2;
              (ch2 = ch1).b = true;
            } 
            return;
          } 
          return;
        case 9:
          ch1 = this;
          for (b1 = 0; b1 < ch1.d.size(); b1++) {
            cm cm1;
            cm cm2;
            (cm2 = cm1 = ch1.d.elementAt(b1)).a += cm2.e;
            cm2.c += cm2.e;
            cm2.b += cm2.f;
            cm2.d += cm2.f;
            cm2.g++;
            if (ch1.u >= ch1.l) {
              ch1.d.removeElement(cm1);
              b1--;
            } 
          } 
          if (ch1.u >= ch1.l) {
            if (a.b - ch1.H >= ch1.G) {
              ch1.d.removeAllElements();
              ch ch2;
              (ch2 = ch1).b = true;
            } else {
              ch1.l = ds.b(4, 6);
              ch1.u = 0;
              ch1.a(ch1.C, ch1.Y, ch1.Z, 0);
              return;
            } 
          } else {
            return;
          } 
          return;
        case 10:
        case 11:
          ch1 = this;
          for (b1 = 0; b1 < ch1.d.size(); b1++) {
            bk bk1;
            (bk1 = ch1.d.elementAt(b1)).a();
            if (bk1.c < ch1.D) {
              ch1.d.removeElementAt(b1);
              b1--;
            } 
          } 
          if (ch1.u >= ch1.l) {
            ch ch2;
            (ch2 = ch1).b = true;
          } 
          break;
      } 
      return;
    } catch (Exception exception) {
      ds.b("ERR update: " + exception.toString());
      ch ch1;
      (ch1 = this).b = true;
    } 
  }
  
  public final void a(en paramen) {
    try {
      ch ch1;
      en en1;
      ch ch2;
      byte b;
      if (this.b || this.u < 0)
        return; 
      switch (this.i) {
        case 0:
        case 1:
        case 2:
          en1 = paramen;
          if ((ch1 = this).e != null)
            ch1.e.a(ch1.u / 5 % ch1.e.c, ch1.o, ch1.p, 0, 33, en1); 
          return;
        case 3:
          ch2 = ch1;
          ch1 = this;
          for (b = 0; b < ch1.d.size(); b++) {
            bk bk1;
            if ((bk1 = ch1.d.elementAt(b)).i - bk1.j >= 0 && bk1.p != null)
              bk1.p.a((bk1.i - bk1.j) / 3 % bk1.p.c, bk1.b, bk1.c, 0, 3, (en)ch2); 
          } 
          return;
        case 17:
          a((en)ch1, 0);
          return;
        case 16:
          if (this.j == 0) {
            a((en)ch1, 33);
            return;
          } 
          a((en)ch1, 3);
          return;
        case 18:
        case 19:
        case 20:
          b = 33;
          ch2 = ch1;
          if ((ch1 = this).aa[0] != null) {
            if (ch1.f != null) {
              ch1.aa[0].a(ch1.f[ch1.u % ch1.f.length], ch1.o, ch1.p, ch1.t, 33, (en)ch2);
            } else {
              ch1.aa[0].a(ch1.u / ch1.n % (ch1.aa[0]).c, ch1.o, ch1.p, ch1.t, 33, (en)ch2);
              return;
            } 
          } else {
            return;
          } 
          return;
        case 21:
        case 22:
        case 23:
          b = 3;
          ch2 = ch1;
          if ((ch1 = this).aa[0] != null)
            ch1.aa[0].a(ch1.u / ch1.n % (ch1.aa[0]).c, ch1.o, ch1.p, ch1.t, 3, (en)ch2); 
          return;
        case 24:
          ch2 = ch1;
          if ((ch1 = this).aa != null) {
            ch2.e(ch1.o, ch1.p - ch1.r / 2, ch1.q, ch1.r);
            int k = ch1.C;
            int j = ch1.p;
            int i = ch1.o;
            byte b1 = ch1.f[ch1.u];
            df df3 = ch1.aa[2];
            df df2 = ch1.aa[1];
            df df1 = ch1.aa[0];
            ch ch4 = ch2;
            ch ch3 = ch1;
            int m = k;
            boolean bool = false;
            if (df1 != null && df3 != null) {
              bool = true;
              m = k - df1.a + df3.a;
            } 
            if (m > 0) {
              int n = m / df2.a;
              if (m % df2.a > 0)
                n++; 
              if (ch3.s == -1) {
                for (m = 0; m < n; m++) {
                  int i1;
                  if (m == n - 1) {
                    if (bool) {
                      i1 = i + df3.a;
                    } else {
                      i1 = i + k - df2.a;
                    } 
                  } else if (bool) {
                    i1 = i + df3.a + df2.a + m * df2.a;
                  } else {
                    i1 = i + m * df2.a;
                  } 
                  df2.a(b1, i1, j - df2.b / 2, 2, 0, (en)ch4);
                } 
              } else {
                for (m = 0; m < n; m++) {
                  int i1;
                  if (m == n - 1) {
                    if (bool) {
                      i1 = i + k - df2.a + df3.a;
                    } else {
                      i1 = i + k - df2.a;
                    } 
                  } else if (bool) {
                    i1 = i + m * df2.a + df1.a;
                  } else {
                    i1 = i + m * df2.a;
                  } 
                  df2.a(b1, i1, j - df2.b / 2, 0, 0, (en)ch4);
                } 
              } 
            } 
            if (ch3.s == -1) {
              if (df1 != null)
                df1.a(b1, i + k - df1.a, j - df1.b / 2, 2, 0, (en)ch4); 
              if (df3 != null)
                df3.a(b1, i, j - df3.b / 2, 2, 0, (en)ch4); 
            } else {
              if (df1 != null)
                df1.a(b1, i, j - df1.b / 2, 0, 0, (en)ch4); 
              if (df3 != null)
                df3.a(b1, i + k - df3.a - 1, j - df3.b / 2, 0, 0, (en)ch4); 
            } 
            a.b((en)ch2);
            if (ch1.s == -1 && ch1.aa[0] != null)
              ch1.aa[0].a(ch1.f[ch1.u], ch1.o + ch1.q - (ch1.aa[0]).a, ch1.p - (ch1.aa[0]).b / 2 - 1, 2, 0, (en)ch2); 
          } 
          return;
        case 25:
          ch2 = ch1;
          ch1 = this;
          for (b = 0; b < ch1.d.size(); b++) {
            bk bk1;
            if ((bk1 = ch1.d.elementAt(b)).n && !bk1.m) {
              if (!bk1.o)
                bk1.a((en)ch2, bk1.p, 3, false); 
              if (bk1.o)
                bk1.q.a(bk1.i / ch1.n % bk1.q.c, bk1.b, bk1.c, ch1.t, 3, (en)ch2); 
            } 
          } 
          return;
        case 26:
          ch2 = ch1;
          if ((ch1 = this).aa != null) {
            if (ch1.f != null)
              ch1.aa[0].a(ch1.f[ch1.v], ch1.y, ch1.z, 0, 33, (en)ch2); 
            if (ch1.E == 1 || ch1.E == 2) {
              b = 33;
              int i = ch1.F;
              if (ch1.g[ch1.w] == 0 || ch1.g[ch1.w] == 1) {
                b = 3;
                i = 0;
              } 
              ch1.aa[1].a(ch1.g[ch1.w], ch1.o, ch1.p + i + ch1.x, 0, b, (en)ch2);
            } 
          } 
          return;
        case 9:
          ch2 = ch1;
          ch1 = this;
          for (b = 0; b < ch1.d.size(); b++) {
            cm cm;
            if ((cm = ch1.d.elementAt(b)) != null) {
              int i = 0;
              if (b / 2 < ch1.W.length)
                i = ch1.W[b / 2]; 
              ch2.a(i);
              ch2.a(cm.a / 1000, cm.b / 1000, cm.c / 1000, cm.d / 1000);
              if (cm.h)
                ch2.a(cm.a / 1000 + 1, cm.b / 1000, cm.c / 1000 + 1, cm.d / 1000); 
            } 
          } 
          return;
        case 10:
        case 11:
          ch2 = ch1;
          ch1 = this;
          for (b = 0; b < ch1.d.size(); b++) {
            bk bk1 = ch1.d.elementAt(b);
            if (ch1.e != null)
              ch1.e.a(bk1.k, bk1.b, bk1.c, 0, 3, (en)ch2); 
          } 
          break;
      } 
      return;
    } catch (Exception exception) {
      ds.b((paramen = null).toString());
      ch ch1;
      (ch1 = this).b = true;
    } 
  }
  
  private void c() {
    int i = ds.b(3, 5);
    this.l = 90;
    for (byte b = 0; b < i; b++) {
      bk bk1;
      (bk1 = new bk()).b = this.o + ds.e(4);
      bk1.c = this.p + ds.e(5);
      if (this.j == 0) {
        bk1.j = ds.d(10);
        byte b1 = 1;
        if (b % 2 == 0)
          b1 = -1; 
        bk1.b = this.o + ds.d(c[5][0] / 2) * b1;
        bk1.c = this.p - ds.d(c[5][1] / 2);
        bk1.p = new df(7);
      } 
      this.d.addElement(bk1);
    } 
  }
  
  private void d() {
    this.o = this.J.B + 20 * this.J.I;
    this.m = this.G / 15;
    if (this.L != null) {
      for (byte b = 0; b < 15; b++) {
        bk bk1;
        (bk1 = new bk()).p = this.aa[0];
        bk1.q = this.aa[2];
        bk1.b = this.o;
        bk1.c = this.p;
        if (this.L != null) {
          bk1.g = this.L.b;
          bk1.h = this.L.c;
          if (this.k > 0) {
            bk1.g += ds.c(0, this.k);
            bk1.h += ds.c(0, this.k);
          } 
        } 
        this.C = ds.b(9, 12);
        if (b == 14) {
          bk1.p = this.aa[1];
          bk1.q = this.aa[3];
          bk1.g = this.L.b;
          bk1.h = this.L.c;
          this.C = 9;
        } 
        bk1.n = false;
        bk1.o = false;
        bk1.m = false;
        int i = this.C;
        bk bk2;
        (bk2 = bk1).d = i;
        i = bk2.g - bk2.b;
        int j = bk2.h - bk2.c;
        j = j;
        i = i;
        bk2 = bk2;
        int k = ds.a(i, j);
        bk2.k = bk2.a(k);
        int n;
        if ((n = ds.d(i, j) / bk2.d) == 0)
          n = 1; 
        k = i / n;
        int m = j / n;
        if (k == 0 && i < n)
          k = (i < 0) ? -1 : 1; 
        if (m == 0 && j < n)
          m = (j < 0) ? -1 : 1; 
        if (ds.g(k) > ds.g(i))
          k = i; 
        if (ds.g(m) > ds.g(j))
          m = j; 
        bk2.e = k;
        bk2.f = m;
        this.d.addElement(bk1);
      } 
      return;
    } 
    ch ch1;
    (ch1 = this).b = true;
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.u == -1)
      this.d.removeAllElements(); 
    this.W = new int[4];
    if (paramInt3 <= paramInt2)
      paramInt3 = paramInt2 + 1; 
    for (paramInt4 = 0; paramInt4 < 4; paramInt4++) {
      if (ds.d(2) == 0) {
        this.W[paramInt4] = V[this.X][ds.d(3)];
      } else {
        this.W[paramInt4] = V[this.X][2];
      } 
    } 
    for (paramInt4 = 0; paramInt4 < 4; paramInt4++) {
      cm cm = new cm();
      int i = 5 + paramInt4 * 45;
      int j;
      if ((j = 45 + paramInt4 * 45 - 5) <= i)
        j = i + 1; 
      int k = ds.b(paramInt2, paramInt3);
      int m = ds.b(paramInt1, paramInt1 + 3);
      i = ds.b(i, j);
      j = ds.b(13, 23);
      boolean bool = (ds.d(4) == 0) ? true : false;
      i = ds.c(i % 360);
      cm.a(this.y - ds.a(i) * (k + j), this.z - ds.b(i) * (k + j), this.y - ds.a(i) * j, this.z - ds.b(i) * j, ds.a(i) * m, ds.b(i) * m, bool);
      this.d.addElement(cm);
      cm = new cm();
      i = ds.c((i += 180 + ds.c(2, 5)) % 360);
      cm.a(this.y - ds.a(i) * (k + j), this.z - ds.b(i) * (k + j), this.y - ds.a(i) * j, this.z - ds.b(i) * j, ds.a(i) * m, ds.b(i) * m, bool);
      this.d.addElement(cm);
    } 
  }
  
  private void e() {
    this.e = new df(8);
    this.l = ds.b(23, 27);
    int i = ds.b(1, 3);
    this.D = this.p - 40;
    for (byte b = 0; b < i; b++) {
      bk bk1;
      (bk1 = new bk()).b = this.o + ds.c(0, 20);
      bk1.c = this.p + ds.e(7);
      if (this.i == 10) {
        bk1.k = ds.b(0, this.e.c - 2);
      } else if (this.i == 11) {
        bk1.k = ds.b(2, this.e.c);
      } else {
        bk1.k = ds.b(0, this.e.c);
      } 
      ds.d(2);
      bk1.f = -ds.b(1, 4);
      this.d.addElement(bk1);
    } 
  }
  
  private void a(boolean paramBoolean) {
    if (this.K == null)
      return; 
    for (byte b = 0; b < this.K.length; b++) {
      if (this.K[b] != null)
        if ((this.K[b]).a == 0) {
          aa aa;
          if ((aa = p.c((this.K[b]).l)) != null) {
            aa.M = paramBoolean;
            aa.Y = false;
            aa.N = this.T[b];
            aa.O = this.U[b];
          } 
        } else {
          af af1;
          if ((af.e()).J == (this.K[b]).l) {
            af1 = af.e();
          } else {
            af1 = p.b((this.K[b]).l);
          } 
          if (af1 != null) {
            af1.dc = paramBoolean;
            af1.bR = false;
            af1.dd = this.T[b];
            af1.de = this.U[b];
          } 
        }  
    } 
  }
  
  private void f() {
    byte b2;
    byte b3;
    byte b1 = 0;
    int[] arrayOfInt1 = null;
    int[] arrayOfInt2 = null;
    switch (this.i) {
      case 18:
        b1 = 24;
        arrayOfInt1 = new int[1];
        arrayOfInt2 = new int[] { 9 };
        break;
      case 21:
        b1 = 24;
        arrayOfInt1 = new int[] { 1 };
        arrayOfInt2 = new int[] { 10 };
        break;
      case 24:
        b1 = 24;
        arrayOfInt1 = new int[] { 2, 3, 4 };
        arrayOfInt2 = new int[] { 11, 12, 13 };
        break;
      case 19:
        b1 = 25;
        arrayOfInt1 = new int[1];
        arrayOfInt2 = new int[] { 14 };
        break;
      case 22:
        b1 = 25;
        arrayOfInt1 = new int[] { 1 };
        arrayOfInt2 = new int[] { 15 };
        break;
      case 17:
        b1 = 25;
        arrayOfInt1 = new int[] { 2 };
        arrayOfInt2 = new int[] { 16 };
        break;
      case 25:
        b1 = 25;
        arrayOfInt1 = new int[] { 3, 4, 5, 6 };
        arrayOfInt2 = new int[] { 17, 18, 19, 20 };
        break;
      case 20:
        b1 = 26;
        arrayOfInt1 = new int[1];
        arrayOfInt2 = new int[] { 21 };
        break;
      case 23:
        b1 = 26;
        arrayOfInt1 = new int[] { 1 };
        arrayOfInt2 = new int[] { 22 };
        break;
      case 16:
        b1 = 26;
        if (this.j == 0) {
          arrayOfInt1 = new int[] { 7 };
          arrayOfInt2 = new int[] { 28 };
        } 
        if (this.j == 1) {
          arrayOfInt1 = new int[] { 2 };
          arrayOfInt2 = new int[] { 23 };
        } 
        break;
      case 26:
        b1 = 26;
        b2 = 0;
        b3 = 0;
        if (this.j == 0) {
          b2 = 4;
          b3 = 25;
        } else if (this.j == 1) {
          b2 = 5;
          b3 = 26;
        } else if (this.j == 2) {
          b2 = 6;
          b3 = 27;
        } 
        arrayOfInt1 = new int[] { b2, 3 };
        arrayOfInt2 = new int[] { b3, 24 };
        break;
    } 
    if (arrayOfInt1 != null && arrayOfInt2 != null) {
      this.aa = new df[arrayOfInt1.length];
      for (b2 = 0; b2 < arrayOfInt1.length; b2++) {
        df df1;
        String str;
        if ((df1 = l.d(str = "Skills_" + b1 + "_" + this.h + "_" + arrayOfInt1[b2])) == null)
          df1 = new df(arrayOfInt2[b2]); 
        if (df1 != null)
          this.aa[b2] = df1; 
      } 
    } 
  }
  
  private void a(en paramen, int paramInt) {
    this.aa[0].a(this.u / this.n % (this.aa[0]).c, this.o, this.p, this.s, paramInt, paramen);
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ch.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */