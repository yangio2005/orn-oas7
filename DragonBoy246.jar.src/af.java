import java.io.InputStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.a;

public class af implements bq {
  public String o;
  
  public String p;
  
  public String q;
  
  public boolean r;
  
  public boolean s;
  
  public boolean t;
  
  private int a;
  
  private int b;
  
  private int c;
  
  public boolean u;
  
  public dk v;
  
  public int w = 0;
  
  public static ae x;
  
  public long y;
  
  public ej z;
  
  public byte A;
  
  public int B = 24;
  
  public int C = 24;
  
  public int D;
  
  public int E;
  
  public int F;
  
  private int d;
  
  public int G;
  
  public int H = 5;
  
  public int I = 1;
  
  public int J;
  
  public int K;
  
  public int L;
  
  public int M;
  
  public int N;
  
  public int O = 4;
  
  public int P;
  
  public int Q;
  
  private int e;
  
  public int R;
  
  public int S;
  
  public long T;
  
  public long U;
  
  public long V;
  
  public long W;
  
  public long X;
  
  public long Y;
  
  public long Z;
  
  public long aa;
  
  public long ab;
  
  public long ac;
  
  public boolean ad;
  
  public boolean ae;
  
  public boolean af;
  
  public String ag = "";
  
  public int ah;
  
  public eh ai;
  
  public byte aj;
  
  public int ak = 22;
  
  public int al = 32;
  
  public int am = 11;
  
  private int f = 16;
  
  public de an;
  
  public boolean ao = true;
  
  public boolean ap;
  
  public boolean aq;
  
  public boolean ar;
  
  private boolean g;
  
  public int as;
  
  private int h;
  
  public long at;
  
  public int au;
  
  public int av;
  
  public int aw;
  
  public da ax;
  
  public de ay;
  
  public el az = new el("vSkill");
  
  public el aA = new el("vSkillFight");
  
  public el aB = new el("vEff char");
  
  public bf aC;
  
  public ai aD;
  
  private boolean i = true;
  
  public ao[] aE;
  
  public h[] aF;
  
  public h[] aG;
  
  public h[] aH;
  
  public bf[] aI;
  
  public h[][] aJ;
  
  public String[][] aK;
  
  public short[][] aL;
  
  public byte aM;
  
  public byte aN;
  
  public int aO;
  
  public int aP;
  
  public aa aQ;
  
  public aa aR;
  
  public int aS;
  
  public do aT;
  
  public af aU;
  
  public ce aV;
  
  public el aW = new el("focus");
  
  public aa[] aX;
  
  public af[] aY;
  
  public short[] aZ;
  
  public int ba = -9999;
  
  public int bb = -9999;
  
  private byte j;
  
  public boolean bc;
  
  public boolean bd = true;
  
  public el be = new el("taskOrders");
  
  public int bf;
  
  public static short[] bg;
  
  public static short[] bh;
  
  public String[] bi;
  
  public String bj;
  
  private static Image k = l.b("/mainImage/myTexture2dat-trai-dat.png");
  
  private static Image l = l.b("/mainImage/myTexture2dmat-namek.png");
  
  public boolean bk = false;
  
  public boolean bl;
  
  public int bm;
  
  public int bn;
  
  public long bo;
  
  private long m;
  
  public long bp;
  
  public boolean bq;
  
  public static Vector br = new Vector();
  
  public static short bs = 30000;
  
  public short bt = 0;
  
  public boolean bu;
  
  public boolean bv;
  
  public boolean bw;
  
  public boolean bx;
  
  private static Image n = l.b("/mainImage/myTexture2dthucuoi10.png");
  
  private static Image df = l.b("/mainImage/myTexture2dthucuoi20.png");
  
  private static Image dg = l.b("/mainImage/myTexture2dthucuoi21.png");
  
  private static Image dh = l.b("/mainImage/myTexture2dthucuoi30.png");
  
  private static Image di = l.b("/mainImage/myTexture2dthucuoi11.png");
  
  private static Image dj = l.b("/mainImage/myTexture2dthucuoi22.png");
  
  private static Image dk = l.b("/mainImage/myTexture2dthucuoi23.png");
  
  private static Image dl = l.b("/mainImage/myTexture2dthucuoi31.png");
  
  private static Image dm = l.b("/mainImage/myTexture2drong.png");
  
  private static Image dn = l.b("/mainImage/myTexture2dcanhrong.png");
  
  private byte[] do = new byte[] { 0, 0, 1, 1, 2, 2, 1, 1 };
  
  private int dp;
  
  private int dq;
  
  private int dr;
  
  private int ds;
  
  private int dt;
  
  private int du;
  
  private int dv;
  
  private int dw;
  
  private int dx;
  
  private int dy;
  
  private int dz;
  
  private boolean dA;
  
  private boolean dB;
  
  private boolean dC;
  
  public byte by;
  
  public int bz;
  
  public short bA;
  
  public short bB;
  
  public static final int[][][] bC = new int[][][] { 
      { { 0, -13, 34 }, { 1, -8, 10 }, { 1, -9, 16 }, { 1, -9, 45 } }, { { 0, -13, 35 }, { 1, -8, 10 }, { 1, -9, 17 }, { 1, -9, 46 } }, { { 1, -10, 33 }, { 2, -10, 11 }, { 2, -8, 16 }, { 1, -12, 49 } }, { { 1, -10, 32 }, { 3, -12, 10 }, { 3, -11, 15 }, { 1, -13, 47 } }, { { 1, -10, 34 }, { 4, -8, 11 }, { 4, -7, 17 }, { 1, -12, 47 } }, { { 1, -10, 34 }, { 5, -12, 11 }, { 5, -9, 17 }, { 1, -13, 49 } }, { { 1, -10, 33 }, { 6, -10, 10 }, { 6, -8, 16 }, { 1, -12, 47 } }, { { 0, -9, 36 }, { 7, -5, 17 }, { 7, -11, 25 }, { 1, -8, 49 } }, { { 0, -7, 35 }, { 0, -18, 22 }, { 7, -10, 25 }, { 1, -7, 48 } }, { { 1, -11, 35 }, { 10, -3, 25 }, { 12, -10, 26 }, new int[3] }, 
      { { 1, -11, 37 }, { 11, -3, 25 }, { 12, -11, 27 }, new int[3] }, { { 0, -14, 34 }, { 12, -8, 21 }, { 9, -7, 31 }, new int[3] }, { { 0, -12, 35 }, { 8, -5, 14 }, { 8, -15, 29 }, { 1, -9, 49 } }, { { 1, -9, 34 }, { 9, -12, 9 }, { 10, -7, 19 }, new int[3] }, { { 1, -13, 34 }, { 9, -12, 9 }, { 11, -10, 19 }, new int[3] }, { { 1, -8, 32 }, { 9, -12, 9 }, { 2, -6, 15 }, new int[3] }, { { 1, -8, 32 }, { 9, -12, 9 }, { 13, -12, 16 }, new int[3] }, { { 0, -10, 31 }, { 9, -12, 9 }, { 7, -13, 20 }, new int[3] }, { { 0, -11, 32 }, { 9, -12, 9 }, { 8, -15, 26 }, new int[3] }, { { 0, -9, 33 }, { 9, -12, 9 }, { 14, -8, 18 }, new int[3] }, 
      { { 0, -11, 33 }, { 9, -12, 9 }, { 15, -6, 19 }, new int[3] }, { { 0, -16, 31 }, { 9, -12, 9 }, { 9, -8, 28 }, new int[3] }, { { 0, -14, 34 }, { 1, -8, 10 }, { 8, -16, 28 }, new int[3] }, { { 0, -8, 36 }, { 7, -5, 17 }, { 0, -5, 25 }, new int[3] }, { { 0, -9, 31 }, { 9, -12, 9 }, { 0, -6, 20 }, new int[3] }, { { 2, -9, 36 }, { 13, -5, 17 }, { 16, -11, 25 }, new int[3] }, { { 1, -9, 34 }, { 8, -5, 13 }, { 10, -7, 19 }, new int[3] }, { { 1, -13, 34 }, { 8, -5, 13 }, { 11, -10, 19 }, new int[3] }, { { 1, -8, 32 }, { 8, -5, 13 }, { 2, -6, 15 }, new int[3] }, { { 1, -8, 32 }, { 8, -5, 13 }, { 13, -12, 16 }, new int[3] }, 
      { { 0, -9, 33 }, { 8, -5, 13 }, { 14, -8, 18 }, new int[3] }, { { 0, -11, 33 }, { 8, -5, 13 }, { 15, -6, 19 }, new int[3] }, { { 0, -16, 32 }, { 8, -5, 13 }, { 9, -8, 29 }, new int[3] } };
  
  private static af dD;
  
  private static af dE;
  
  private int dF;
  
  public int bD;
  
  public int bE;
  
  public el bF = new el("vMovePoints");
  
  public static boolean bG;
  
  public static boolean bH;
  
  public static boolean bI;
  
  public boolean bJ;
  
  String bK;
  
  short bL;
  
  short bM;
  
  short bN;
  
  private long dG;
  
  private long dH;
  
  public boolean bO = true;
  
  public dm bP;
  
  public int bQ;
  
  private ea dI = null;
  
  private ea dJ = null;
  
  private int dK;
  
  private boolean dL;
  
  private boolean dM;
  
  public boolean bR;
  
  private boolean dN;
  
  private int dO;
  
  int bS;
  
  private int dP;
  
  private int dQ;
  
  private int dR;
  
  private int[] dS = new int[] { 
      1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 
      3, 3, 2, 2, 2 };
  
  private String dT = "mount_";
  
  public int bT = -1;
  
  public int bU;
  
  public int bV;
  
  public int bW;
  
  public int bX;
  
  public int bY;
  
  private int dU = -1;
  
  public int bZ = -1;
  
  private cp dV;
  
  public cp ca;
  
  public int cb;
  
  private int dW;
  
  private int dX;
  
  private int dY;
  
  private int dZ;
  
  private int ea;
  
  private int eb;
  
  private int ec;
  
  private int ed;
  
  private int ee;
  
  private cp ef = null;
  
  private cp eg = null;
  
  private cp eh = null;
  
  public dq cc = null;
  
  public bj cd = null;
  
  public boolean ce = false;
  
  public ci cf;
  
  public ci cg;
  
  private cu[] ei;
  
  private int ej;
  
  private byte ek;
  
  public boolean ch = false;
  
  public boolean ci = false;
  
  public boolean cj = false;
  
  private int el;
  
  private int em = 0;
  
  private boolean en;
  
  boolean ck;
  
  private long eo = 0L;
  
  private int ep;
  
  private boolean eq;
  
  private boolean er;
  
  private int es = 24;
  
  private int et = 24;
  
  private Image eu;
  
  private boolean ev;
  
  private boolean ew;
  
  public int cl;
  
  public int cm;
  
  private int ex = 0;
  
  private av ey;
  
  private av ez;
  
  private av eA;
  
  private int eB = 32;
  
  private int eC;
  
  private int eD = 0;
  
  public static boolean cn = false;
  
  private af eE;
  
  private aa eF;
  
  public short co;
  
  public short cp;
  
  public int cq;
  
  public int cr;
  
  public int cs;
  
  public int ct;
  
  public int cu;
  
  public int cv;
  
  public int cw;
  
  public byte cx;
  
  public byte cy;
  
  public byte cz;
  
  public byte cA = 1;
  
  public byte cB = 1;
  
  public short cC;
  
  public short cD;
  
  public byte cE;
  
  public boolean cF;
  
  public boolean cG = false;
  
  public boolean cH;
  
  public int cI;
  
  public boolean cJ;
  
  public boolean cK;
  
  private boolean eG = true;
  
  private boolean eH = false;
  
  private int eI = 0;
  
  private short eJ;
  
  private short eK;
  
  private byte eL;
  
  boolean cL;
  
  int cM;
  
  public boolean cN;
  
  public boolean cO;
  
  public boolean cP;
  
  public boolean cQ;
  
  public boolean cR;
  
  public int cS = 100;
  
  public long cT;
  
  private int eM = -1;
  
  private int eN = -1;
  
  private int eO = -1;
  
  private int eP = -1;
  
  private el eQ = new el("vEff");
  
  private static df eR;
  
  private int eS = 0;
  
  private long eT;
  
  private int[] eU = new int[] { 
      -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 
      1, 1, 1, 1, 1, 1, -1, -1, -1, -1 };
  
  private int[] eV = new int[] { 
      -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 
      1, 1, 1, -1, -1, -1, -1 };
  
  private int[] eW = new int[] { 
      -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 
      1, 1, 1, 1, -1, -1 };
  
  public static int[][] cU = new int[][] { { 542, 543 } };
  
  private int eX = 0;
  
  private String eY = "aura_";
  
  public short cV = -1;
  
  public static boolean cW = true;
  
  public static boolean cX = true;
  
  private df eZ;
  
  private df fa;
  
  private String fb = "set_eff_";
  
  public short cY = -1;
  
  private df fc;
  
  private df fd;
  
  private df fe;
  
  private df ff;
  
  private String fg = "hat_sau_";
  
  private String fh = "hat_truoc_";
  
  private String fi = "ngang_";
  
  public short cZ = -1;
  
  private static int[][] fj = new int[][] { 
      { 5, -7 }, { 5, -7 }, { 5, -8 }, { 5, -7 }, { 5, -6 }, { 5, -8 }, { 5, -7 }, { 9 }, { 11, 1 }, { 4 }, 
      { 4, -1 }, { 4, 8 }, { 6, 5 }, { 6, -6 }, { 2, -5 }, { 7, -8 }, { 7, -6 }, { 8 }, { 7, 5 }, { 9, -7 }, 
      { 7, -3 }, { 2, 8 }, { 4, 5 }, { 10, -5 }, { 9, -5 }, { 9, -5 }, { 6, -6 }, { 2, -5 }, { 7, -8 }, { 7, -6 }, 
      { 9, -7 }, { 7, -3 } };
  
  public static short[] da = new short[0];
  
  public boolean db;
  
  private boolean fk;
  
  private long fl;
  
  private byte fm = 0;
  
  private short fn;
  
  private byte[] fo;
  
  private byte[] fp;
  
  private byte[] fq;
  
  private int fr = 0;
  
  private int fs = 0;
  
  private bk ft;
  
  private long fu;
  
  public boolean dc = false;
  
  private short fv;
  
  public int dd;
  
  public int de;
  
  private df fw = null;
  
  public final void b() {
    try {
      long l1 = 1L;
      long l2 = 0L;
      int i = 0;
      for (int j = p.R.length - 1; j >= 0; j--) {
        if (this.y >= p.R[j]) {
          if (j == p.R.length - 1) {
            l1 = 1L;
          } else {
            l1 = p.R[j + 1] - p.R[j];
          } 
          l2 = this.y - p.R[j];
          i = j;
          break;
        } 
      } 
      this.Q = i;
      this.Z = (int)(l2 * 10000L / l1);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private int aa() {
    return (this.aC != null) ? this.aC.g : 0;
  }
  
  private int ab() {
    return (this.aC != null) ? this.aC.h : 0;
  }
  
  public static void a(boolean paramBoolean) {
    ai ai1;
    String str;
    if ((str = (ai1 = (e()).aD).g[ai1.a]) != null && !str.equals(""))
      if (str.startsWith("#")) {
        str = ai.a(str, "#", "");
        do do1;
        (do1 = new do(5, 0, -100, -100, 5, p.aD.a[(e()).K][2])).B = do1.C = -100;
        do1.aO = p.aD.a[(e()).K][2];
        do1.J = 5;
        if (a.E == p.c)
          ae.a(str, do1); 
      } else {
        p.aD.a(str, 0);
      }  
    p.O = true;
    ds.c("TASKx " + (e()).aD.c);
    if ((e()).aD.c <= 2) {
      (e()).ao = false;
    } else {
      (e()).ao = true;
    } 
    (p.j()).cm = null;
    if (ai1.c == 0) {
      v.f = false;
      v.h = false;
      (p.j()).co = null;
      p.O = false;
      (p.j()).cm = null;
      if (ai1.a < 4) {
        k.j = false;
        p.bn = -1;
      } 
      if (ai1.a == 4) {
        p.bn = 1;
        k.j = true;
      } 
      if (ai1.a >= 5)
        (p.j()).co = (p.j()).s; 
    } 
    if (ai1.c == 1)
      p.O = true; 
    if (ai1.c > 0) {
      (p.j()).co = (p.j()).s;
      (p.j()).cm = (p.j()).aR;
    } 
    if (ai1.c >= 0) {
      g.as = true;
    } else {
      g.as = false;
    } 
    if (ai1.c < 12) {
      a.G.D = aw.aM;
    } else {
      a.G.D = aw.aN;
    } 
    a.G.M[0] = a.G.D;
    if (dD.aD.c > 10)
      av.a("fake", "aa"); 
  }
  
  public final String c() {
    String str;
    if ((str = String.valueOf(this.bi[this.Q]) + "+" + (this.Z / 100L) + "." + (this.Z % 100L) + "%").length() > 23 && str.indexOf("cấp ") >= 0)
      str = ds.a(str, "cấp ", "c"); 
    return str;
  }
  
  public final int d() {
    int i = this.bU;
    for (byte b = 0; b < bg.length; b++) {
      if (i == bg[b])
        return bh[b]; 
    } 
    return -1;
  }
  
  public final void a(String paramString, short paramShort1, short paramShort2, short paramShort3) {
    this.bL = paramShort1;
    this.bK = paramString;
    this.bM = paramShort2;
    this.bN = paramShort3;
    ds.c("sc= " + paramShort3 + " max= " + paramShort2);
    this.dG = this.dH = System.currentTimeMillis();
  }
  
  public final void a(String paramString) {
    if (this.z == null)
      this.z = new ej(); 
    this.z.a(paramString, 0, (af)null, false);
  }
  
  public af() {
    this.H = 6;
  }
  
  public static af e() {
    if (dD == null) {
      (dD = new af()).aq = true;
      dD.ap = true;
    } 
    return dD;
  }
  
  public static af f() {
    if (dE == null)
      (dE = new af()).aq = false; 
    return dE;
  }
  
  public static void g() {
    dD = null;
  }
  
  public final void h() {
    try {
      el el1 = new el("items");
      byte b;
      for (b = 0; b < this.aG.length; b++) {
        h h1;
        if ((h1 = this.aG[b]) != null && h1.b.h && !h1.x)
          el1.addElement(h1); 
      } 
      for (b = 0; b < el1.size(); b++) {
        h h1;
        if ((h1 = el1.elementAt(b)) != null)
          for (int i = b + 1; i < el1.size(); i++) {
            h h2;
            if ((h2 = el1.elementAt(i)) != null && h1.b.equals(h2.b) && h1.k == h2.k) {
              h1.h += h2.h;
              this.aG[h2.g] = null;
              el1.setElementAt(null, i);
            } 
          }  
      } 
      for (b = 0; b < this.aG.length; b++) {
        if (this.aG[b] != null)
          for (byte b1 = 0; b1 <= b; b1++) {
            if (this.aG[b1] == null) {
              this.aG[b1] = this.aG[b];
              (this.aG[b1]).g = b1;
              this.aG[b] = null;
              break;
            } 
          }  
      } 
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      ds.c("Char.boxSort()");
      return;
    } 
  }
  
  public final bf a(et paramet) {
    for (byte b = 0; b < this.az.size(); b++) {
      if (((bf)this.az.elementAt(b)).a.a == paramet.a)
        return this.az.elementAt(b); 
    } 
    return null;
  }
  
  public final bw i() {
    ai ai1;
    if ((ai1 = dD.aD) != null && ai1.c == 0 && ai1.a < 6)
      return null; 
    int i = bv.t.size();
    for (byte b = 0; b < i; b = (byte)(b + 1)) {
      bw bw = bv.t.elementAt(b);
      bo bo;
      if (bo.a.size() >= i && !(bo = bo.a.elementAt(b)).j)
        return null; 
      if (this.B >= bw.a && this.B <= bw.c && this.C >= bw.b && this.C <= bw.d && bw.e && bw.f)
        return bw; 
    } 
    return null;
  }
  
  public final bw j() {
    ai ai1;
    if ((ai1 = dD.aD) != null && ai1.c == 0 && ai1.a < 6)
      return null; 
    int i = bv.t.size();
    for (byte b = 0; b < i; b = (byte)(b + 1)) {
      bw bw = bv.t.elementAt(b);
      bo bo;
      if (bo.a.size() >= i && !(bo = bo.a.elementAt(b)).j)
        return null; 
      if (this.B >= bw.a && this.B <= bw.c && this.C >= bw.b && this.C <= bw.d && bw.e && !bw.f)
        return bw; 
    } 
    return null;
  }
  
  private boolean ac() {
    if (bv.f() && this.C >= bv.d - 48)
      return true; 
    if (this.s || this.t)
      return false; 
    int i = bv.t.size();
    for (byte b = 0; b < i; b = (byte)(b + 1)) {
      bw bw = bv.t.elementAt(b);
      if ((bv.l == 47 || bv.f()) && this.C <= bw.b + bw.d && this.B > bw.a && this.B < bw.c)
        return !(bv.f() && this.aN != 0); 
      if (this.B >= bw.a && this.B <= bw.c && this.C >= bw.b && this.C <= bw.d && !bw.e)
        return true; 
    } 
    return false;
  }
  
  private void ad() {
    // Byte code:
    //   0: aload_0
    //   1: getfield aq : Z
    //   4: ifeq -> 47
    //   7: aload_0
    //   8: getfield H : I
    //   11: bipush #10
    //   13: if_icmpne -> 47
    //   16: aload_0
    //   17: getfield as : I
    //   20: bipush #8
    //   22: if_icmpne -> 47
    //   25: aload_0
    //   26: getfield dP : I
    //   29: bipush #20
    //   31: if_icmple -> 47
    //   34: getstatic main/a.w : I
    //   37: bipush #20
    //   39: irem
    //   40: ifne -> 47
    //   43: invokestatic a : ()Lbu;
    //   46: pop
    //   47: aload_0
    //   48: getfield cf : Lci;
    //   51: ifnull -> 278
    //   54: aload_0
    //   55: invokevirtual D : ()[Lf;
    //   58: ifnull -> 278
    //   61: aload_0
    //   62: getfield cb : I
    //   65: aload_0
    //   66: invokevirtual D : ()[Lf;
    //   69: arraylength
    //   70: if_icmpge -> 278
    //   73: aload_0
    //   74: dup
    //   75: astore_1
    //   76: getfield cf : Lci;
    //   79: ifnull -> 192
    //   82: aload_1
    //   83: getfield cf : Lci;
    //   86: getfield a : I
    //   89: iflt -> 108
    //   92: aload_1
    //   93: getfield cf : Lci;
    //   96: getfield a : I
    //   99: bipush #6
    //   101: if_icmpgt -> 108
    //   104: iconst_1
    //   105: goto -> 193
    //   108: aload_1
    //   109: getfield cf : Lci;
    //   112: getfield a : I
    //   115: bipush #14
    //   117: if_icmplt -> 136
    //   120: aload_1
    //   121: getfield cf : Lci;
    //   124: getfield a : I
    //   127: bipush #20
    //   129: if_icmpgt -> 136
    //   132: iconst_1
    //   133: goto -> 193
    //   136: aload_1
    //   137: getfield cf : Lci;
    //   140: getfield a : I
    //   143: bipush #28
    //   145: if_icmplt -> 164
    //   148: aload_1
    //   149: getfield cf : Lci;
    //   152: getfield a : I
    //   155: bipush #34
    //   157: if_icmpgt -> 164
    //   160: iconst_1
    //   161: goto -> 193
    //   164: aload_1
    //   165: getfield cf : Lci;
    //   168: getfield a : I
    //   171: bipush #63
    //   173: if_icmplt -> 192
    //   176: aload_1
    //   177: getfield cf : Lci;
    //   180: getfield a : I
    //   183: bipush #69
    //   185: if_icmpgt -> 192
    //   188: iconst_1
    //   189: goto -> 193
    //   192: iconst_0
    //   193: ifeq -> 278
    //   196: aload_0
    //   197: getfield aq : Z
    //   200: ifne -> 234
    //   203: aload_0
    //   204: getfield aq : Z
    //   207: ifne -> 278
    //   210: aload_0
    //   211: getfield B : I
    //   214: getstatic p.j : I
    //   217: if_icmplt -> 278
    //   220: aload_0
    //   221: getfield B : I
    //   224: getstatic p.j : I
    //   227: getstatic main/a.A : I
    //   230: iadd
    //   231: if_icmpgt -> 278
    //   234: getstatic main/a.w : I
    //   237: iconst_5
    //   238: irem
    //   239: ifne -> 278
    //   242: aload_0
    //   243: getfield as : I
    //   246: bipush #9
    //   248: if_icmpeq -> 269
    //   251: aload_0
    //   252: getfield as : I
    //   255: bipush #10
    //   257: if_icmpeq -> 269
    //   260: aload_0
    //   261: getfield as : I
    //   264: bipush #11
    //   266: if_icmpne -> 274
    //   269: invokestatic a : ()Lbu;
    //   272: pop
    //   273: return
    //   274: invokestatic a : ()Lbu;
    //   277: pop
    //   278: return
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield dc : Z
    //   4: ifeq -> 40
    //   7: aload_0
    //   8: bipush #23
    //   10: putfield as : I
    //   13: aload_0
    //   14: dup
    //   15: getfield fv : S
    //   18: iconst_1
    //   19: iadd
    //   20: i2s
    //   21: putfield fv : S
    //   24: aload_0
    //   25: getfield fv : S
    //   28: sipush #150
    //   31: if_icmple -> 39
    //   34: aload_0
    //   35: iconst_0
    //   36: putfield dc : Z
    //   39: return
    //   40: aload_0
    //   41: iconst_0
    //   42: putfield fv : S
    //   45: aload_0
    //   46: getfield bR : Z
    //   49: ifeq -> 53
    //   52: return
    //   53: aload_0
    //   54: getfield ck : Z
    //   57: ifeq -> 61
    //   60: return
    //   61: aload_0
    //   62: getfield v : Ldk;
    //   65: ifnull -> 406
    //   68: getstatic main/a.w : I
    //   71: iconst_3
    //   72: irem
    //   73: ifne -> 221
    //   76: invokestatic e : ()Laf;
    //   79: getfield I : I
    //   82: iconst_1
    //   83: if_icmpne -> 100
    //   86: aload_0
    //   87: getfield v : Ldk;
    //   90: aload_0
    //   91: getfield B : I
    //   94: bipush #20
    //   96: isub
    //   97: putfield h : I
    //   100: invokestatic e : ()Laf;
    //   103: getfield I : I
    //   106: iconst_m1
    //   107: if_icmpne -> 124
    //   110: aload_0
    //   111: getfield v : Ldk;
    //   114: aload_0
    //   115: getfield B : I
    //   118: bipush #20
    //   120: iadd
    //   121: putfield h : I
    //   124: aload_0
    //   125: getfield v : Ldk;
    //   128: aload_0
    //   129: getfield C : I
    //   132: bipush #40
    //   134: isub
    //   135: putfield d : I
    //   138: aload_0
    //   139: getfield v : Ldk;
    //   142: getfield i : I
    //   145: aload_0
    //   146: getfield B : I
    //   149: if_icmple -> 163
    //   152: aload_0
    //   153: getfield v : Ldk;
    //   156: iconst_m1
    //   157: putfield b : I
    //   160: goto -> 171
    //   163: aload_0
    //   164: getfield v : Ldk;
    //   167: iconst_1
    //   168: putfield b : I
    //   171: aload_0
    //   172: getfield v : Ldk;
    //   175: getfield h : I
    //   178: bipush #100
    //   180: if_icmpge -> 192
    //   183: aload_0
    //   184: getfield v : Ldk;
    //   187: bipush #100
    //   189: putfield h : I
    //   192: aload_0
    //   193: getfield v : Ldk;
    //   196: getfield h : I
    //   199: getstatic bv.c : I
    //   202: bipush #100
    //   204: isub
    //   205: if_icmple -> 221
    //   208: aload_0
    //   209: getfield v : Ldk;
    //   212: getstatic bv.c : I
    //   215: bipush #100
    //   217: isub
    //   218: putfield h : I
    //   221: aload_0
    //   222: getfield v : Ldk;
    //   225: dup
    //   226: astore_1
    //   227: dup
    //   228: astore_2
    //   229: getfield e : I
    //   232: aload_2
    //   233: getfield d : I
    //   236: if_icmpeq -> 293
    //   239: aload_2
    //   240: aload_2
    //   241: getfield d : I
    //   244: aload_2
    //   245: getfield e : I
    //   248: isub
    //   249: iconst_2
    //   250: ishl
    //   251: putfield g : I
    //   254: aload_2
    //   255: dup
    //   256: getfield f : I
    //   259: aload_2
    //   260: getfield g : I
    //   263: iadd
    //   264: putfield f : I
    //   267: aload_2
    //   268: dup
    //   269: getfield e : I
    //   272: aload_2
    //   273: getfield f : I
    //   276: iconst_4
    //   277: ishr
    //   278: iadd
    //   279: putfield e : I
    //   282: aload_2
    //   283: dup
    //   284: getfield f : I
    //   287: bipush #15
    //   289: iand
    //   290: putfield f : I
    //   293: aload_2
    //   294: getfield i : I
    //   297: aload_2
    //   298: getfield h : I
    //   301: if_icmpeq -> 358
    //   304: aload_2
    //   305: aload_2
    //   306: getfield h : I
    //   309: aload_2
    //   310: getfield i : I
    //   313: isub
    //   314: iconst_2
    //   315: ishl
    //   316: putfield k : I
    //   319: aload_2
    //   320: dup
    //   321: getfield j : I
    //   324: aload_2
    //   325: getfield k : I
    //   328: iadd
    //   329: putfield j : I
    //   332: aload_2
    //   333: dup
    //   334: getfield i : I
    //   337: aload_2
    //   338: getfield j : I
    //   341: iconst_4
    //   342: ishr
    //   343: iadd
    //   344: putfield i : I
    //   347: aload_2
    //   348: dup
    //   349: getfield j : I
    //   352: bipush #15
    //   354: iand
    //   355: putfield j : I
    //   358: getstatic main/a.w : I
    //   361: iconst_3
    //   362: irem
    //   363: ifne -> 389
    //   366: aload_1
    //   367: aload_1
    //   368: getfield o : [I
    //   371: aload_1
    //   372: getfield p : I
    //   375: iaload
    //   376: putfield c : I
    //   379: aload_1
    //   380: dup
    //   381: getfield p : I
    //   384: iconst_1
    //   385: iadd
    //   386: putfield p : I
    //   389: aload_1
    //   390: getfield p : I
    //   393: aload_1
    //   394: getfield o : [I
    //   397: arraylength
    //   398: if_icmplt -> 406
    //   401: aload_1
    //   402: iconst_0
    //   403: putfield p : I
    //   406: aload_0
    //   407: getfield aq : Z
    //   410: ifne -> 462
    //   413: aload_0
    //   414: getfield U : J
    //   417: lconst_0
    //   418: lcmp
    //   419: ifgt -> 462
    //   422: aload_0
    //   423: getfield ah : I
    //   426: bipush #-100
    //   428: if_icmpeq -> 462
    //   431: aload_0
    //   432: getfield H : I
    //   435: bipush #14
    //   437: if_icmpeq -> 462
    //   440: aload_0
    //   441: getfield H : I
    //   444: iconst_5
    //   445: if_icmpeq -> 462
    //   448: aload_0
    //   449: aload_0
    //   450: getfield B : I
    //   453: i2s
    //   454: aload_0
    //   455: getfield C : I
    //   458: i2s
    //   459: invokevirtual a : (SS)V
    //   462: aload_0
    //   463: getfield dL : Z
    //   466: ifeq -> 501
    //   469: aload_0
    //   470: dup
    //   471: getfield dK : I
    //   474: iconst_1
    //   475: iadd
    //   476: putfield dK : I
    //   479: aload_0
    //   480: getfield dK : I
    //   483: bipush #20
    //   485: if_icmpne -> 554
    //   488: aload_0
    //   489: iconst_0
    //   490: putfield dK : I
    //   493: aload_0
    //   494: iconst_0
    //   495: putfield dL : Z
    //   498: goto -> 554
    //   501: aload_0
    //   502: getfield cT : J
    //   505: aload_0
    //   506: getfield U : J
    //   509: lcmp
    //   510: ifle -> 546
    //   513: aload_0
    //   514: getfield cT : J
    //   517: aload_0
    //   518: getfield U : J
    //   521: lsub
    //   522: iconst_1
    //   523: lshr
    //   524: dup2
    //   525: lstore_1
    //   526: lconst_1
    //   527: lcmp
    //   528: ifge -> 533
    //   531: lconst_1
    //   532: lstore_1
    //   533: aload_0
    //   534: dup
    //   535: getfield cT : J
    //   538: lload_1
    //   539: lsub
    //   540: putfield cT : J
    //   543: goto -> 554
    //   546: aload_0
    //   547: aload_0
    //   548: getfield U : J
    //   551: putfield cT : J
    //   554: aload_0
    //   555: getfield bN : S
    //   558: ifeq -> 602
    //   561: aload_0
    //   562: invokestatic currentTimeMillis : ()J
    //   565: putfield dH : J
    //   568: aload_0
    //   569: getfield dH : J
    //   572: aload_0
    //   573: getfield dG : J
    //   576: lsub
    //   577: ldc2_w 1000
    //   580: lcmp
    //   581: iflt -> 602
    //   584: aload_0
    //   585: invokestatic currentTimeMillis : ()J
    //   588: putfield dG : J
    //   591: aload_0
    //   592: dup
    //   593: getfield bN : S
    //   596: iconst_1
    //   597: isub
    //   598: i2s
    //   599: putfield bN : S
    //   602: aload_0
    //   603: getfield db : Z
    //   606: ifeq -> 1025
    //   609: getstatic main/a.b : J
    //   612: aload_0
    //   613: getfield fl : J
    //   616: lcmp
    //   617: ifgt -> 637
    //   620: aload_0
    //   621: getfield H : I
    //   624: bipush #14
    //   626: if_icmpeq -> 637
    //   629: aload_0
    //   630: getfield H : I
    //   633: iconst_5
    //   634: if_icmpne -> 647
    //   637: aload_0
    //   638: lconst_0
    //   639: putfield fl : J
    //   642: aload_0
    //   643: iconst_0
    //   644: putfield db : Z
    //   647: aload_0
    //   648: dup
    //   649: astore_1
    //   650: getfield fs : I
    //   653: ifne -> 762
    //   656: aload_1
    //   657: getfield fk : Z
    //   660: ifeq -> 691
    //   663: aload_1
    //   664: getfield fr : I
    //   667: bipush #20
    //   669: if_icmpge -> 691
    //   672: aload_1
    //   673: bipush #-3
    //   675: putfield E : I
    //   678: aload_1
    //   679: dup
    //   680: getfield C : I
    //   683: aload_1
    //   684: getfield E : I
    //   687: iadd
    //   688: putfield C : I
    //   691: aload_1
    //   692: getfield fo : [B
    //   695: arraylength
    //   696: iconst_1
    //   697: if_icmpne -> 713
    //   700: aload_1
    //   701: aload_1
    //   702: getfield fo : [B
    //   705: iconst_0
    //   706: baload
    //   707: putfield as : I
    //   710: goto -> 1003
    //   713: aload_1
    //   714: getfield fr : I
    //   717: aload_1
    //   718: getfield fo : [B
    //   721: arraylength
    //   722: iconst_1
    //   723: isub
    //   724: if_icmple -> 746
    //   727: aload_1
    //   728: aload_1
    //   729: getfield fo : [B
    //   732: aload_1
    //   733: getfield fo : [B
    //   736: arraylength
    //   737: iconst_1
    //   738: isub
    //   739: baload
    //   740: putfield as : I
    //   743: goto -> 1003
    //   746: aload_1
    //   747: aload_1
    //   748: getfield fo : [B
    //   751: aload_1
    //   752: getfield fr : I
    //   755: baload
    //   756: putfield as : I
    //   759: goto -> 1003
    //   762: aload_1
    //   763: getfield fs : I
    //   766: iconst_1
    //   767: if_icmpne -> 900
    //   770: aload_1
    //   771: aload_1
    //   772: getfield fp : [B
    //   775: aload_1
    //   776: getfield fr : I
    //   779: aload_1
    //   780: getfield fp : [B
    //   783: arraylength
    //   784: irem
    //   785: baload
    //   786: putfield as : I
    //   789: invokestatic d : ()J
    //   792: aload_1
    //   793: getfield fu : J
    //   796: lsub
    //   797: lconst_0
    //   798: lcmp
    //   799: ifle -> 814
    //   802: aload_1
    //   803: iconst_2
    //   804: iconst_0
    //   805: aconst_null
    //   806: iconst_0
    //   807: iconst_0
    //   808: iconst_0
    //   809: aconst_null
    //   810: iconst_0
    //   811: invokevirtual a : (ISLbk;SSB[Lbk;B)V
    //   814: aload_1
    //   815: getfield fr : I
    //   818: iconst_5
    //   819: irem
    //   820: ifne -> 827
    //   823: iconst_5
    //   824: putstatic p.bu : I
    //   827: aload_1
    //   828: getfield fm : B
    //   831: iconst_1
    //   832: if_icmpne -> 1003
    //   835: aload_1
    //   836: getfield fr : I
    //   839: bipush #10
    //   841: if_icmpge -> 1003
    //   844: aload_1
    //   845: getfield B : I
    //   848: aload_1
    //   849: getfield am : I
    //   852: iconst_1
    //   853: iadd
    //   854: aload_1
    //   855: getfield I : I
    //   858: imul
    //   859: isub
    //   860: aload_1
    //   861: getfield C : I
    //   864: aload_1
    //   865: getfield I : I
    //   868: iconst_1
    //   869: if_icmpne -> 877
    //   872: bipush #8
    //   874: goto -> 878
    //   877: iconst_4
    //   878: invokestatic a : (III)Z
    //   881: ifne -> 1003
    //   884: aload_1
    //   885: dup
    //   886: getfield B : I
    //   889: aload_1
    //   890: getfield I : I
    //   893: isub
    //   894: putfield B : I
    //   897: goto -> 1003
    //   900: aload_1
    //   901: getfield fs : I
    //   904: iconst_2
    //   905: if_icmpne -> 1003
    //   908: aload_1
    //   909: getfield fq : [B
    //   912: arraylength
    //   913: iconst_1
    //   914: if_icmpne -> 930
    //   917: aload_1
    //   918: aload_1
    //   919: getfield fq : [B
    //   922: iconst_0
    //   923: baload
    //   924: putfield as : I
    //   927: goto -> 976
    //   930: aload_1
    //   931: getfield fr : I
    //   934: aload_1
    //   935: getfield fq : [B
    //   938: arraylength
    //   939: iconst_1
    //   940: isub
    //   941: if_icmple -> 963
    //   944: aload_1
    //   945: aload_1
    //   946: getfield fq : [B
    //   949: aload_1
    //   950: getfield fq : [B
    //   953: arraylength
    //   954: iconst_1
    //   955: isub
    //   956: baload
    //   957: putfield as : I
    //   960: goto -> 976
    //   963: aload_1
    //   964: aload_1
    //   965: getfield fq : [B
    //   968: aload_1
    //   969: getfield fr : I
    //   972: baload
    //   973: putfield as : I
    //   976: aload_1
    //   977: getfield fk : Z
    //   980: ifeq -> 998
    //   983: aload_1
    //   984: aload_1
    //   985: iconst_0
    //   986: dup_x1
    //   987: putfield E : I
    //   990: putfield D : I
    //   993: aload_1
    //   994: iconst_4
    //   995: putfield H : I
    //   998: aload_1
    //   999: iconst_0
    //   1000: putfield db : Z
    //   1003: aload_1
    //   1004: dup
    //   1005: getfield fr : I
    //   1008: iconst_1
    //   1009: iadd
    //   1010: putfield fr : I
    //   1013: aload_0
    //   1014: getfield bd : Z
    //   1017: ifeq -> 1024
    //   1020: aload_0
    //   1021: invokevirtual H : ()V
    //   1024: return
    //   1025: aload_0
    //   1026: getfield cQ : Z
    //   1029: ifeq -> 1064
    //   1032: getstatic main/a.w : I
    //   1035: bipush #10
    //   1037: irem
    //   1038: ifne -> 1064
    //   1041: new ea
    //   1044: dup
    //   1045: bipush #41
    //   1047: aload_0
    //   1048: getfield B : I
    //   1051: aload_0
    //   1052: getfield C : I
    //   1055: iconst_3
    //   1056: iconst_1
    //   1057: iconst_1
    //   1058: invokespecial <init> : (IIIIII)V
    //   1061: invokestatic a : (Lea;)V
    //   1064: aload_0
    //   1065: getfield cN : Z
    //   1068: ifeq -> 1099
    //   1071: aload_0
    //   1072: iconst_0
    //   1073: putfield cN : Z
    //   1076: new ea
    //   1079: dup
    //   1080: bipush #39
    //   1082: aload_0
    //   1083: getfield B : I
    //   1086: aload_0
    //   1087: getfield C : I
    //   1090: iconst_3
    //   1091: iconst_3
    //   1092: iconst_1
    //   1093: invokespecial <init> : (IIIIII)V
    //   1096: invokestatic a : (Lea;)V
    //   1099: aload_0
    //   1100: getfield cO : Z
    //   1103: ifeq -> 1121
    //   1106: getstatic main/a.w : I
    //   1109: iconst_5
    //   1110: irem
    //   1111: ifne -> 1121
    //   1114: bipush #113
    //   1116: aload_0
    //   1117: iconst_1
    //   1118: invokestatic a : (ILaf;I)V
    //   1121: aload_0
    //   1122: getfield cK : Z
    //   1125: ifeq -> 1198
    //   1128: aload_0
    //   1129: getfield eB : I
    //   1132: bipush #73
    //   1134: iadd
    //   1135: istore_1
    //   1136: getstatic main/a.w : I
    //   1139: iconst_5
    //   1140: irem
    //   1141: ifne -> 1165
    //   1144: aload_0
    //   1145: new ea
    //   1148: dup
    //   1149: bipush #33
    //   1151: aload_0
    //   1152: getfield B : I
    //   1155: iload_1
    //   1156: iconst_3
    //   1157: iconst_3
    //   1158: iconst_1
    //   1159: invokespecial <init> : (IIIIII)V
    //   1162: putfield dI : Lea;
    //   1165: aload_0
    //   1166: getfield dI : Lea;
    //   1169: ifnull -> 1198
    //   1172: aload_0
    //   1173: getfield dI : Lea;
    //   1176: invokevirtual a : ()V
    //   1179: aload_0
    //   1180: getfield dI : Lea;
    //   1183: aload_0
    //   1184: getfield B : I
    //   1187: putfield f : I
    //   1190: aload_0
    //   1191: getfield dI : Lea;
    //   1194: iload_1
    //   1195: putfield g : I
    //   1198: aload_0
    //   1199: getfield eG : Z
    //   1202: ifeq -> 1390
    //   1205: aload_0
    //   1206: getfield dJ : Lea;
    //   1209: ifnonnull -> 1311
    //   1212: getstatic main/a.T : Lt;
    //   1215: new java/lang/StringBuffer
    //   1218: dup
    //   1219: aload_0
    //   1220: getfield J : I
    //   1223: invokestatic valueOf : (I)Ljava/lang/String;
    //   1226: invokespecial <init> : (Ljava/lang/String;)V
    //   1229: invokevirtual toString : ()Ljava/lang/String;
    //   1232: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1235: checkcast java/lang/String
    //   1238: dup
    //   1239: astore_1
    //   1240: ifnull -> 1311
    //   1243: aload_1
    //   1244: invokevirtual trim : ()Ljava/lang/String;
    //   1247: ldc ','
    //   1249: iconst_0
    //   1250: invokestatic a : (Ljava/lang/String;Ljava/lang/String;I)[Ljava/lang/String;
    //   1253: dup
    //   1254: astore_2
    //   1255: iconst_0
    //   1256: aaload
    //   1257: invokestatic parseShort : (Ljava/lang/String;)S
    //   1260: istore_3
    //   1261: aload_2
    //   1262: iconst_1
    //   1263: aaload
    //   1264: invokestatic parseShort : (Ljava/lang/String;)S
    //   1267: istore_1
    //   1268: aload_0
    //   1269: new ea
    //   1272: dup
    //   1273: iload_3
    //   1274: aload_0
    //   1275: getfield B : I
    //   1278: aload_0
    //   1279: getfield eB : I
    //   1282: bipush #73
    //   1284: iadd
    //   1285: iconst_1
    //   1286: iconst_m1
    //   1287: iconst_m1
    //   1288: invokespecial <init> : (IIIIII)V
    //   1291: putfield dJ : Lea;
    //   1294: aload_0
    //   1295: getfield dJ : Lea;
    //   1298: iload_1
    //   1299: sipush #1000
    //   1302: imul
    //   1303: i2l
    //   1304: invokestatic d : ()J
    //   1307: ladd
    //   1308: putfield l : J
    //   1311: aload_0
    //   1312: getfield dJ : Lea;
    //   1315: ifnull -> 1390
    //   1318: aload_0
    //   1319: getfield dJ : Lea;
    //   1322: invokevirtual a : ()V
    //   1325: aload_0
    //   1326: getfield dJ : Lea;
    //   1329: aload_0
    //   1330: getfield B : I
    //   1333: putfield f : I
    //   1336: aload_0
    //   1337: getfield dJ : Lea;
    //   1340: aload_0
    //   1341: getfield eB : I
    //   1344: putfield g : I
    //   1347: aload_0
    //   1348: getfield dJ : Lea;
    //   1351: getfield l : J
    //   1354: invokestatic d : ()J
    //   1357: lcmp
    //   1358: ifgt -> 1390
    //   1361: aload_0
    //   1362: aconst_null
    //   1363: putfield dJ : Lea;
    //   1366: getstatic main/a.T : Lt;
    //   1369: new java/lang/StringBuffer
    //   1372: dup
    //   1373: aload_0
    //   1374: getfield J : I
    //   1377: invokestatic valueOf : (I)Ljava/lang/String;
    //   1380: invokespecial <init> : (Ljava/lang/String;)V
    //   1383: invokevirtual toString : ()Ljava/lang/String;
    //   1386: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1389: pop
    //   1390: aload_0
    //   1391: getfield aU : Laf;
    //   1394: ifnull -> 1412
    //   1397: aload_0
    //   1398: getfield aU : Laf;
    //   1401: getfield C : I
    //   1404: ifge -> 1412
    //   1407: aload_0
    //   1408: aconst_null
    //   1409: putfield aU : Laf;
    //   1412: aload_0
    //   1413: getfield cL : Z
    //   1416: ifeq -> 1429
    //   1419: aload_0
    //   1420: dup
    //   1421: getfield cM : I
    //   1424: iconst_1
    //   1425: iadd
    //   1426: putfield cM : I
    //   1429: aload_0
    //   1430: getfield u : Z
    //   1433: ifeq -> 1452
    //   1436: getstatic main/a.w : I
    //   1439: bipush #25
    //   1441: irem
    //   1442: ifne -> 1452
    //   1445: bipush #114
    //   1447: aload_0
    //   1448: iconst_1
    //   1449: invokestatic a : (ILaf;I)V
    //   1452: aload_0
    //   1453: getfield eH : Z
    //   1456: ifeq -> 1654
    //   1459: aload_0
    //   1460: dup
    //   1461: getfield eI : I
    //   1464: iconst_1
    //   1465: iadd
    //   1466: putfield eI : I
    //   1469: aload_0
    //   1470: getfield eI : I
    //   1473: iconst_1
    //   1474: if_icmpne -> 1653
    //   1477: aload_0
    //   1478: iconst_0
    //   1479: putfield eI : I
    //   1482: aload_0
    //   1483: iconst_0
    //   1484: putfield eH : Z
    //   1487: aload_0
    //   1488: aload_0
    //   1489: getfield eJ : S
    //   1492: putfield B : I
    //   1495: aload_0
    //   1496: aload_0
    //   1497: getfield eK : S
    //   1500: putfield C : I
    //   1503: aload_0
    //   1504: aload_0
    //   1505: aload_0
    //   1506: iconst_0
    //   1507: dup_x1
    //   1508: putfield G : I
    //   1511: dup_x1
    //   1512: putfield d : I
    //   1515: putfield F : I
    //   1518: new java/lang/StringBuffer
    //   1521: dup
    //   1522: ldc 'set pox x= '
    //   1524: invokespecial <init> : (Ljava/lang/String;)V
    //   1527: aload_0
    //   1528: getfield eJ : S
    //   1531: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1534: ldc ' y= '
    //   1536: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1539: aload_0
    //   1540: getfield eK : S
    //   1543: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1546: invokevirtual toString : ()Ljava/lang/String;
    //   1549: invokestatic c : (Ljava/lang/String;)V
    //   1552: aload_0
    //   1553: getfield eL : B
    //   1556: iconst_1
    //   1557: if_icmpne -> 1611
    //   1560: aload_0
    //   1561: getfield aq : Z
    //   1564: ifeq -> 1583
    //   1567: aload_0
    //   1568: aload_0
    //   1569: getfield B : I
    //   1572: putfield bD : I
    //   1575: aload_0
    //   1576: aload_0
    //   1577: getfield C : I
    //   1580: putfield bE : I
    //   1583: aload_0
    //   1584: aconst_null
    //   1585: putfield bP : Ldm;
    //   1588: aload_0
    //   1589: iconst_0
    //   1590: putfield cP : Z
    //   1593: sipush #173
    //   1596: aload_0
    //   1597: getfield B : I
    //   1600: aload_0
    //   1601: getfield C : I
    //   1604: iconst_1
    //   1605: invokestatic a : (IIII)V
    //   1608: goto -> 1625
    //   1611: bipush #60
    //   1613: aload_0
    //   1614: getfield B : I
    //   1617: aload_0
    //   1618: getfield C : I
    //   1621: iconst_1
    //   1622: invokestatic a : (IIII)V
    //   1625: aload_0
    //   1626: getfield B : I
    //   1629: aload_0
    //   1630: getfield C : I
    //   1633: invokestatic b : (II)I
    //   1636: iconst_2
    //   1637: iand
    //   1638: iconst_2
    //   1639: if_icmpne -> 1648
    //   1642: aload_0
    //   1643: iconst_1
    //   1644: putfield H : I
    //   1647: return
    //   1648: aload_0
    //   1649: iconst_4
    //   1650: putfield H : I
    //   1653: return
    //   1654: aload_0
    //   1655: invokespecial ad : ()V
    //   1658: aload_0
    //   1659: getfield cR : Z
    //   1662: ifeq -> 1666
    //   1665: return
    //   1666: aload_0
    //   1667: getfield bk : Z
    //   1670: ifeq -> 1872
    //   1673: getstatic main/a.w : I
    //   1676: iconst_5
    //   1677: irem
    //   1678: ifne -> 1695
    //   1681: bipush #113
    //   1683: aload_0
    //   1684: getfield B : I
    //   1687: aload_0
    //   1688: getfield C : I
    //   1691: iconst_1
    //   1692: invokestatic a : (IIII)V
    //   1695: aload_0
    //   1696: bipush #23
    //   1698: putfield as : I
    //   1701: invokestatic currentTimeMillis : ()J
    //   1704: dup2
    //   1705: lstore_1
    //   1706: aload_0
    //   1707: getfield bp : J
    //   1710: lsub
    //   1711: ldc2_w 1000
    //   1714: lcmp
    //   1715: iflt -> 1778
    //   1718: aload_0
    //   1719: dup
    //   1720: getfield bn : I
    //   1723: iconst_1
    //   1724: isub
    //   1725: putfield bn : I
    //   1728: aload_0
    //   1729: lload_1
    //   1730: putfield bp : J
    //   1733: aload_0
    //   1734: getfield bn : I
    //   1737: ifge -> 1778
    //   1740: aload_0
    //   1741: iconst_0
    //   1742: putfield bk : Z
    //   1745: aload_0
    //   1746: iconst_0
    //   1747: putfield bm : I
    //   1750: aload_0
    //   1751: getfield aq : Z
    //   1754: ifeq -> 1778
    //   1757: invokestatic e : ()Laf;
    //   1760: iconst_0
    //   1761: putfield bJ : Z
    //   1764: invokestatic j : ()Lp;
    //   1767: iconst_0
    //   1768: putfield aY : I
    //   1771: invokestatic j : ()Lp;
    //   1774: iconst_0
    //   1775: putfield aZ : Z
    //   1778: aload_0
    //   1779: getfield B : I
    //   1782: getstatic bv.i : B
    //   1785: idiv
    //   1786: aload_0
    //   1787: getfield C : I
    //   1790: getstatic bv.i : B
    //   1793: idiv
    //   1794: invokestatic a : (II)I
    //   1797: ifne -> 1871
    //   1800: aload_0
    //   1801: dup
    //   1802: getfield dP : I
    //   1805: iconst_1
    //   1806: iadd
    //   1807: putfield dP : I
    //   1810: aload_0
    //   1811: dup
    //   1812: getfield dO : I
    //   1815: iconst_1
    //   1816: iadd
    //   1817: putfield dO : I
    //   1820: aload_0
    //   1821: dup
    //   1822: getfield bS : I
    //   1825: aload_0
    //   1826: getfield dN : Z
    //   1829: ifne -> 1836
    //   1832: iconst_1
    //   1833: goto -> 1837
    //   1836: iconst_m1
    //   1837: iadd
    //   1838: putfield bS : I
    //   1841: aload_0
    //   1842: getfield dO : I
    //   1845: bipush #10
    //   1847: if_icmpne -> 1871
    //   1850: aload_0
    //   1851: iconst_0
    //   1852: putfield dO : I
    //   1855: aload_0
    //   1856: aload_0
    //   1857: getfield dN : Z
    //   1860: ifeq -> 1867
    //   1863: iconst_0
    //   1864: goto -> 1868
    //   1867: iconst_1
    //   1868: putfield dN : Z
    //   1871: return
    //   1872: aload_0
    //   1873: getfield cG : Z
    //   1876: ifeq -> 1971
    //   1879: aload_0
    //   1880: iconst_1
    //   1881: putfield bJ : Z
    //   1884: aload_0
    //   1885: bipush #17
    //   1887: putfield as : I
    //   1890: getstatic main/a.w : I
    //   1893: iconst_5
    //   1894: irem
    //   1895: ifne -> 1916
    //   1898: sipush #154
    //   1901: aload_0
    //   1902: getfield B : I
    //   1905: aload_0
    //   1906: getfield C : I
    //   1909: bipush #10
    //   1911: isub
    //   1912: iconst_2
    //   1913: invokestatic a : (IIII)V
    //   1916: getstatic main/a.w : I
    //   1919: iconst_5
    //   1920: irem
    //   1921: ifne -> 1940
    //   1924: iconst_1
    //   1925: aload_0
    //   1926: getfield B : I
    //   1929: aload_0
    //   1930: getfield C : I
    //   1933: bipush #10
    //   1935: iadd
    //   1936: iconst_1
    //   1937: invokestatic a : (IIII)V
    //   1940: aload_0
    //   1941: dup
    //   1942: getfield em : I
    //   1945: iconst_1
    //   1946: iadd
    //   1947: putfield em : I
    //   1950: aload_0
    //   1951: getfield em : I
    //   1954: sipush #500
    //   1957: if_icmpne -> 1970
    //   1960: aload_0
    //   1961: iconst_0
    //   1962: putfield cG : Z
    //   1965: aload_0
    //   1966: iconst_0
    //   1967: putfield bJ : Z
    //   1970: return
    //   1971: aload_0
    //   1972: getfield cj : Z
    //   1975: ifeq -> 3134
    //   1978: aload_0
    //   1979: dup
    //   1980: getfield em : I
    //   1983: iconst_1
    //   1984: iadd
    //   1985: putfield em : I
    //   1988: invokestatic e : ()Laf;
    //   1991: getfield B : I
    //   1994: invokestatic e : ()Laf;
    //   1997: getfield C : I
    //   2000: iconst_2
    //   2001: invokestatic a : (III)Z
    //   2004: ifeq -> 2011
    //   2007: iconst_0
    //   2008: goto -> 2012
    //   2011: iconst_1
    //   2012: istore_1
    //   2013: aload_0
    //   2014: invokespecial ae : ()V
    //   2017: aload_0
    //   2018: invokespecial ah : ()V
    //   2021: aload_0
    //   2022: aconst_null
    //   2023: putfield aZ : [S
    //   2026: aload_0
    //   2027: aconst_null
    //   2028: putfield bP : Ldm;
    //   2031: aload_0
    //   2032: bipush #17
    //   2034: putfield as : I
    //   2037: iload_1
    //   2038: ifeq -> 2055
    //   2041: aload_0
    //   2042: getfield K : I
    //   2045: iconst_2
    //   2046: if_icmpeq -> 2055
    //   2049: aload_0
    //   2050: bipush #12
    //   2052: putfield as : I
    //   2055: aload_0
    //   2056: getfield K : I
    //   2059: iconst_2
    //   2060: if_icmpne -> 2273
    //   2063: getstatic bv.l : I
    //   2066: sipush #170
    //   2069: if_icmpne -> 2202
    //   2072: getstatic main/a.w : I
    //   2075: iconst_2
    //   2076: irem
    //   2077: ifne -> 2273
    //   2080: aload_0
    //   2081: getfield I : I
    //   2084: iconst_1
    //   2085: if_icmpne -> 2145
    //   2088: bipush #70
    //   2090: aload_0
    //   2091: getfield B : I
    //   2094: bipush #18
    //   2096: isub
    //   2097: aload_0
    //   2098: getfield C : I
    //   2101: aload_0
    //   2102: getfield al : I
    //   2105: iconst_2
    //   2106: idiv
    //   2107: isub
    //   2108: bipush #8
    //   2110: iadd
    //   2111: iconst_1
    //   2112: invokestatic a : (IIII)V
    //   2115: bipush #70
    //   2117: aload_0
    //   2118: getfield B : I
    //   2121: bipush #23
    //   2123: iadd
    //   2124: aload_0
    //   2125: getfield C : I
    //   2128: aload_0
    //   2129: getfield al : I
    //   2132: iconst_2
    //   2133: idiv
    //   2134: isub
    //   2135: bipush #15
    //   2137: iadd
    //   2138: iconst_1
    //   2139: invokestatic a : (IIII)V
    //   2142: goto -> 2273
    //   2145: bipush #70
    //   2147: aload_0
    //   2148: getfield B : I
    //   2151: bipush #18
    //   2153: iadd
    //   2154: aload_0
    //   2155: getfield C : I
    //   2158: aload_0
    //   2159: getfield al : I
    //   2162: iconst_2
    //   2163: idiv
    //   2164: isub
    //   2165: bipush #8
    //   2167: iadd
    //   2168: iconst_1
    //   2169: invokestatic a : (IIII)V
    //   2172: bipush #70
    //   2174: aload_0
    //   2175: getfield B : I
    //   2178: bipush #23
    //   2180: isub
    //   2181: aload_0
    //   2182: getfield C : I
    //   2185: aload_0
    //   2186: getfield al : I
    //   2189: iconst_2
    //   2190: idiv
    //   2191: isub
    //   2192: bipush #15
    //   2194: iadd
    //   2195: iconst_1
    //   2196: invokestatic a : (IIII)V
    //   2199: goto -> 2273
    //   2202: getstatic main/a.w : I
    //   2205: iconst_3
    //   2206: irem
    //   2207: ifne -> 2235
    //   2210: sipush #154
    //   2213: aload_0
    //   2214: getfield B : I
    //   2217: aload_0
    //   2218: getfield C : I
    //   2221: aload_0
    //   2222: getfield al : I
    //   2225: iconst_2
    //   2226: idiv
    //   2227: isub
    //   2228: bipush #10
    //   2230: iadd
    //   2231: iconst_1
    //   2232: invokestatic a : (IIII)V
    //   2235: getstatic main/a.w : I
    //   2238: iconst_5
    //   2239: irem
    //   2240: ifne -> 2273
    //   2243: bipush #114
    //   2245: aload_0
    //   2246: getfield B : I
    //   2249: bipush #-20
    //   2251: bipush #20
    //   2253: invokestatic b : (II)I
    //   2256: iadd
    //   2257: aload_0
    //   2258: getfield C : I
    //   2261: bipush #-20
    //   2263: bipush #20
    //   2265: invokestatic b : (II)I
    //   2268: iadd
    //   2269: iconst_1
    //   2270: invokestatic a : (IIII)V
    //   2273: aload_0
    //   2274: getfield K : I
    //   2277: iconst_1
    //   2278: if_icmpne -> 2408
    //   2281: getstatic main/a.w : I
    //   2284: iconst_2
    //   2285: irem
    //   2286: ifne -> 2408
    //   2289: aload_0
    //   2290: getfield I : I
    //   2293: iconst_1
    //   2294: if_icmpne -> 2354
    //   2297: bipush #70
    //   2299: aload_0
    //   2300: getfield B : I
    //   2303: bipush #18
    //   2305: isub
    //   2306: aload_0
    //   2307: getfield C : I
    //   2310: aload_0
    //   2311: getfield al : I
    //   2314: iconst_2
    //   2315: idiv
    //   2316: isub
    //   2317: bipush #8
    //   2319: iadd
    //   2320: iconst_1
    //   2321: invokestatic a : (IIII)V
    //   2324: bipush #70
    //   2326: aload_0
    //   2327: getfield B : I
    //   2330: bipush #23
    //   2332: iadd
    //   2333: aload_0
    //   2334: getfield C : I
    //   2337: aload_0
    //   2338: getfield al : I
    //   2341: iconst_2
    //   2342: idiv
    //   2343: isub
    //   2344: bipush #15
    //   2346: iadd
    //   2347: iconst_1
    //   2348: invokestatic a : (IIII)V
    //   2351: goto -> 2408
    //   2354: bipush #70
    //   2356: aload_0
    //   2357: getfield B : I
    //   2360: bipush #18
    //   2362: iadd
    //   2363: aload_0
    //   2364: getfield C : I
    //   2367: aload_0
    //   2368: getfield al : I
    //   2371: iconst_2
    //   2372: idiv
    //   2373: isub
    //   2374: bipush #8
    //   2376: iadd
    //   2377: iconst_1
    //   2378: invokestatic a : (IIII)V
    //   2381: bipush #70
    //   2383: aload_0
    //   2384: getfield B : I
    //   2387: bipush #23
    //   2389: isub
    //   2390: aload_0
    //   2391: getfield C : I
    //   2394: aload_0
    //   2395: getfield al : I
    //   2398: iconst_2
    //   2399: idiv
    //   2400: isub
    //   2401: bipush #15
    //   2403: iadd
    //   2404: iconst_1
    //   2405: invokestatic a : (IIII)V
    //   2408: aload_0
    //   2409: getfield K : I
    //   2412: ifne -> 2542
    //   2415: getstatic main/a.w : I
    //   2418: iconst_2
    //   2419: irem
    //   2420: ifne -> 2542
    //   2423: aload_0
    //   2424: getfield I : I
    //   2427: iconst_1
    //   2428: if_icmpne -> 2488
    //   2431: bipush #70
    //   2433: aload_0
    //   2434: getfield B : I
    //   2437: bipush #18
    //   2439: isub
    //   2440: aload_0
    //   2441: getfield C : I
    //   2444: aload_0
    //   2445: getfield al : I
    //   2448: iconst_2
    //   2449: idiv
    //   2450: isub
    //   2451: bipush #8
    //   2453: iadd
    //   2454: iconst_1
    //   2455: invokestatic a : (IIII)V
    //   2458: bipush #70
    //   2460: aload_0
    //   2461: getfield B : I
    //   2464: bipush #23
    //   2466: iadd
    //   2467: aload_0
    //   2468: getfield C : I
    //   2471: aload_0
    //   2472: getfield al : I
    //   2475: iconst_2
    //   2476: idiv
    //   2477: isub
    //   2478: bipush #15
    //   2480: iadd
    //   2481: iconst_1
    //   2482: invokestatic a : (IIII)V
    //   2485: goto -> 2542
    //   2488: bipush #70
    //   2490: aload_0
    //   2491: getfield B : I
    //   2494: bipush #18
    //   2496: iadd
    //   2497: aload_0
    //   2498: getfield C : I
    //   2501: aload_0
    //   2502: getfield al : I
    //   2505: iconst_2
    //   2506: idiv
    //   2507: isub
    //   2508: bipush #8
    //   2510: iadd
    //   2511: iconst_1
    //   2512: invokestatic a : (IIII)V
    //   2515: bipush #70
    //   2517: aload_0
    //   2518: getfield B : I
    //   2521: bipush #23
    //   2523: isub
    //   2524: aload_0
    //   2525: getfield C : I
    //   2528: aload_0
    //   2529: getfield al : I
    //   2532: iconst_2
    //   2533: idiv
    //   2534: isub
    //   2535: bipush #15
    //   2537: iadd
    //   2538: iconst_1
    //   2539: invokestatic a : (IIII)V
    //   2542: aload_0
    //   2543: invokestatic currentTimeMillis : ()J
    //   2546: putfield m : J
    //   2549: new java/lang/StringBuffer
    //   2552: dup
    //   2553: ldc '  7.5 gong namekLazer '
    //   2555: invokespecial <init> : (Ljava/lang/String;)V
    //   2558: aload_0
    //   2559: getfield ag : Ljava/lang/String;
    //   2562: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2565: ldc '_'
    //   2567: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2570: aload_0
    //   2571: getfield K : I
    //   2574: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2577: invokevirtual toString : ()Ljava/lang/String;
    //   2580: invokestatic c : (Ljava/lang/String;)V
    //   2583: aload_0
    //   2584: getfield m : J
    //   2587: aload_0
    //   2588: getfield bo : J
    //   2591: lsub
    //   2592: aload_0
    //   2593: getfield bm : I
    //   2596: i2l
    //   2597: lcmp
    //   2598: ifgt -> 2617
    //   2601: aload_0
    //   2602: getfield m : J
    //   2605: aload_0
    //   2606: getfield bo : J
    //   2609: lsub
    //   2610: ldc2_w 10000
    //   2613: lcmp
    //   2614: ifle -> 3109
    //   2617: new java/lang/StringBuffer
    //   2620: dup
    //   2621: ldc '<*> 8  namekLazer gong xong '
    //   2623: invokespecial <init> : (Ljava/lang/String;)V
    //   2626: aload_0
    //   2627: getfield ag : Ljava/lang/String;
    //   2630: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2633: invokevirtual toString : ()Ljava/lang/String;
    //   2636: invokestatic c : (Ljava/lang/String;)V
    //   2639: aload_0
    //   2640: invokevirtual C : ()V
    //   2643: aload_0
    //   2644: iconst_0
    //   2645: putfield cj : Z
    //   2648: aload_0
    //   2649: getfield aq : Z
    //   2652: ifeq -> 2896
    //   2655: aload_0
    //   2656: getfield K : I
    //   2659: iconst_2
    //   2660: if_icmpne -> 2718
    //   2663: new java/lang/StringBuffer
    //   2666: dup
    //   2667: ldc '<*> 9 [me] xay da xong  '
    //   2669: invokespecial <init> : (Ljava/lang/String;)V
    //   2672: invokestatic e : ()Laf;
    //   2675: getfield aC : Lbf;
    //   2678: getfield b : S
    //   2681: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2684: invokevirtual toString : ()Ljava/lang/String;
    //   2687: invokestatic c : (Ljava/lang/String;)V
    //   2690: invokestatic e : ()Laf;
    //   2693: getstatic p.u : [Lci;
    //   2696: invokestatic e : ()Laf;
    //   2699: getfield aC : Lbf;
    //   2702: getfield b : S
    //   2705: aaload
    //   2706: iload_1
    //   2707: ifne -> 2714
    //   2710: iconst_0
    //   2711: goto -> 2715
    //   2714: iconst_1
    //   2715: invokevirtual a : (Lci;I)V
    //   2718: aload_0
    //   2719: getfield K : I
    //   2722: iconst_1
    //   2723: if_icmpne -> 2786
    //   2726: new java/lang/StringBuffer
    //   2729: dup
    //   2730: ldc '<*> 9 [me] namec xong '
    //   2732: invokespecial <init> : (Ljava/lang/String;)V
    //   2735: invokestatic e : ()Laf;
    //   2738: getfield aC : Lbf;
    //   2741: getfield b : S
    //   2744: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2747: invokevirtual toString : ()Ljava/lang/String;
    //   2750: invokestatic c : (Ljava/lang/String;)V
    //   2753: aload_0
    //   2754: iconst_1
    //   2755: putfield ce : Z
    //   2758: invokestatic e : ()Laf;
    //   2761: getstatic p.u : [Lci;
    //   2764: invokestatic e : ()Laf;
    //   2767: getfield aC : Lbf;
    //   2770: getfield b : S
    //   2773: aaload
    //   2774: iload_1
    //   2775: ifne -> 2782
    //   2778: iconst_0
    //   2779: goto -> 2783
    //   2782: iconst_1
    //   2783: invokevirtual a : (Lci;I)V
    //   2786: aload_0
    //   2787: getfield K : I
    //   2790: ifne -> 2848
    //   2793: new java/lang/StringBuffer
    //   2796: dup
    //   2797: ldc '<*> 9 [me] namec xong '
    //   2799: invokespecial <init> : (Ljava/lang/String;)V
    //   2802: invokestatic e : ()Laf;
    //   2805: getfield aC : Lbf;
    //   2808: getfield b : S
    //   2811: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2814: invokevirtual toString : ()Ljava/lang/String;
    //   2817: invokestatic c : (Ljava/lang/String;)V
    //   2820: invokestatic e : ()Laf;
    //   2823: getstatic p.u : [Lci;
    //   2826: invokestatic e : ()Laf;
    //   2829: getfield aC : Lbf;
    //   2832: getfield b : S
    //   2835: aaload
    //   2836: iload_1
    //   2837: ifne -> 2844
    //   2840: iconst_0
    //   2841: goto -> 2845
    //   2844: iconst_1
    //   2845: invokevirtual a : (Lci;I)V
    //   2848: invokestatic e : ()Laf;
    //   2851: getfield aC : Lbf;
    //   2854: getfield b : S
    //   2857: bipush #77
    //   2859: if_icmplt -> 2883
    //   2862: invokestatic e : ()Laf;
    //   2865: getfield aC : Lbf;
    //   2868: getfield b : S
    //   2871: bipush #83
    //   2873: if_icmpgt -> 2883
    //   2876: invokestatic a : ()Lbt;
    //   2879: iconst_4
    //   2880: invokevirtual c : (B)V
    //   2883: invokestatic e : ()Laf;
    //   2886: getfield aC : Lbf;
    //   2889: getfield b : S
    //   2892: istore_2
    //   2893: goto -> 3053
    //   2896: aload_0
    //   2897: getfield K : I
    //   2900: iconst_2
    //   2901: if_icmpne -> 2947
    //   2904: aload_0
    //   2905: getstatic p.u : [Lci;
    //   2908: aload_0
    //   2909: getfield aP : I
    //   2912: aaload
    //   2913: iload_1
    //   2914: ifne -> 2921
    //   2917: iconst_0
    //   2918: goto -> 2922
    //   2921: iconst_1
    //   2922: invokevirtual a : (Lci;I)V
    //   2925: new java/lang/StringBuffer
    //   2928: dup
    //   2929: ldc '<*> 10 xay da xong 111   '
    //   2931: invokespecial <init> : (Ljava/lang/String;)V
    //   2934: aload_0
    //   2935: getfield aP : I
    //   2938: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2941: invokevirtual toString : ()Ljava/lang/String;
    //   2944: invokestatic c : (Ljava/lang/String;)V
    //   2947: aload_0
    //   2948: getfield K : I
    //   2951: iconst_1
    //   2952: if_icmpne -> 2998
    //   2955: aload_0
    //   2956: getstatic p.u : [Lci;
    //   2959: aload_0
    //   2960: getfield aP : I
    //   2963: aaload
    //   2964: iload_1
    //   2965: ifne -> 2972
    //   2968: iconst_0
    //   2969: goto -> 2973
    //   2972: iconst_1
    //   2973: invokevirtual a : (Lci;I)V
    //   2976: new java/lang/StringBuffer
    //   2979: dup
    //   2980: ldc '<*> 10 C_NAMEC xong 222   '
    //   2982: invokespecial <init> : (Ljava/lang/String;)V
    //   2985: aload_0
    //   2986: getfield aP : I
    //   2989: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2992: invokevirtual toString : ()Ljava/lang/String;
    //   2995: invokestatic c : (Ljava/lang/String;)V
    //   2998: aload_0
    //   2999: getfield K : I
    //   3002: ifne -> 3048
    //   3005: aload_0
    //   3006: getstatic p.u : [Lci;
    //   3009: aload_0
    //   3010: getfield aP : I
    //   3013: aaload
    //   3014: iload_1
    //   3015: ifne -> 3022
    //   3018: iconst_0
    //   3019: goto -> 3023
    //   3022: iconst_1
    //   3023: invokevirtual a : (Lci;I)V
    //   3026: new java/lang/StringBuffer
    //   3029: dup
    //   3030: ldc '<*> 10  C_TRAIDAT xong 333   '
    //   3032: invokespecial <init> : (Ljava/lang/String;)V
    //   3035: aload_0
    //   3036: getfield aP : I
    //   3039: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   3042: invokevirtual toString : ()Ljava/lang/String;
    //   3045: invokestatic c : (Ljava/lang/String;)V
    //   3048: aload_0
    //   3049: getfield aP : I
    //   3052: istore_2
    //   3053: aload_0
    //   3054: getfield K : I
    //   3057: iconst_2
    //   3058: if_icmpne -> 3104
    //   3061: aload_0
    //   3062: getfield H : I
    //   3065: bipush #14
    //   3067: if_icmpeq -> 3104
    //   3070: aload_0
    //   3071: getfield H : I
    //   3074: iconst_5
    //   3075: if_icmpeq -> 3104
    //   3078: iload_2
    //   3079: bipush #77
    //   3081: if_icmplt -> 3090
    //   3084: iload_2
    //   3085: bipush #83
    //   3087: if_icmple -> 3104
    //   3090: invokestatic j : ()Lp;
    //   3093: aload_0
    //   3094: getfield B : I
    //   3097: aload_0
    //   3098: getfield C : I
    //   3101: invokevirtual b : (II)V
    //   3104: ldc '<*> 11 Hoàn thành skill not focus -  STAND'
    //   3106: invokestatic c : (Ljava/lang/String;)V
    //   3109: aload_0
    //   3110: dup
    //   3111: getfield em : I
    //   3114: iconst_1
    //   3115: iadd
    //   3116: putfield em : I
    //   3119: aload_0
    //   3120: getfield em : I
    //   3123: sipush #500
    //   3126: if_icmpne -> 3133
    //   3129: aload_0
    //   3130: invokevirtual C : ()V
    //   3133: return
    //   3134: aload_0
    //   3135: getfield ci : Z
    //   3138: ifeq -> 3585
    //   3141: aload_0
    //   3142: invokespecial ae : ()V
    //   3145: aload_0
    //   3146: invokespecial ah : ()V
    //   3149: aload_0
    //   3150: aconst_null
    //   3151: putfield aZ : [S
    //   3154: aload_0
    //   3155: aconst_null
    //   3156: putfield bP : Ldm;
    //   3159: aload_0
    //   3160: dup
    //   3161: getfield el : I
    //   3164: iconst_1
    //   3165: iadd
    //   3166: putfield el : I
    //   3169: aload_0
    //   3170: getfield B : I
    //   3173: aload_0
    //   3174: getfield C : I
    //   3177: aload_0
    //   3178: getfield al : I
    //   3181: isub
    //   3182: sipush #8192
    //   3185: invokestatic a : (III)Z
    //   3188: ifeq -> 3196
    //   3191: aload_0
    //   3192: invokevirtual C : ()V
    //   3195: return
    //   3196: aload_0
    //   3197: getfield el : I
    //   3200: bipush #20
    //   3202: if_icmpne -> 3212
    //   3205: aload_0
    //   3206: invokestatic currentTimeMillis : ()J
    //   3209: putfield bo : J
    //   3212: new java/lang/StringBuffer
    //   3215: dup
    //   3216: ldc '<*> 11 gồng qua cau kinh khi  '
    //   3218: invokespecial <init> : (Ljava/lang/String;)V
    //   3221: aload_0
    //   3222: getfield ag : Ljava/lang/String;
    //   3225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3228: invokevirtual toString : ()Ljava/lang/String;
    //   3231: invokestatic c : (Ljava/lang/String;)V
    //   3234: aload_0
    //   3235: getfield el : I
    //   3238: bipush #20
    //   3240: if_icmple -> 3545
    //   3243: aload_0
    //   3244: invokestatic currentTimeMillis : ()J
    //   3247: putfield m : J
    //   3250: aload_0
    //   3251: getfield m : J
    //   3254: aload_0
    //   3255: getfield bo : J
    //   3258: lsub
    //   3259: aload_0
    //   3260: getfield bm : I
    //   3263: i2l
    //   3264: lcmp
    //   3265: ifgt -> 3284
    //   3268: aload_0
    //   3269: getfield m : J
    //   3272: aload_0
    //   3273: getfield bo : J
    //   3276: lsub
    //   3277: ldc2_w 10000
    //   3280: lcmp
    //   3281: ifle -> 3426
    //   3284: new java/lang/StringBuffer
    //   3287: dup
    //   3288: ldc '<*> 12 kết thúc skill  qua cau kinh khi \\tFLY '
    //   3290: invokespecial <init> : (Ljava/lang/String;)V
    //   3293: aload_0
    //   3294: getfield ag : Ljava/lang/String;
    //   3297: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3300: invokevirtual toString : ()Ljava/lang/String;
    //   3303: invokestatic c : (Ljava/lang/String;)V
    //   3306: aload_0
    //   3307: iconst_0
    //   3308: putfield ci : Z
    //   3311: aload_0
    //   3312: getfield aq : Z
    //   3315: ifeq -> 3372
    //   3318: aload_0
    //   3319: iconst_1
    //   3320: putfield ce : Z
    //   3323: invokestatic e : ()Laf;
    //   3326: getfield B : I
    //   3329: invokestatic e : ()Laf;
    //   3332: getfield C : I
    //   3335: iconst_2
    //   3336: invokestatic a : (III)Z
    //   3339: istore_1
    //   3340: aload_0
    //   3341: iconst_1
    //   3342: putfield ch : Z
    //   3345: aload_0
    //   3346: getstatic p.u : [Lci;
    //   3349: invokestatic e : ()Laf;
    //   3352: getfield aC : Lbf;
    //   3355: getfield b : S
    //   3358: aaload
    //   3359: iload_1
    //   3360: ifeq -> 3367
    //   3363: iconst_0
    //   3364: goto -> 3368
    //   3367: iconst_1
    //   3368: invokevirtual a : (Lci;I)V
    //   3371: return
    //   3372: getstatic bv.l : I
    //   3375: sipush #170
    //   3378: if_icmpne -> 3425
    //   3381: aload_0
    //   3382: iconst_1
    //   3383: putfield ce : Z
    //   3386: aload_0
    //   3387: iconst_1
    //   3388: putfield ch : Z
    //   3391: aload_0
    //   3392: getfield B : I
    //   3395: aload_0
    //   3396: getfield C : I
    //   3399: iconst_2
    //   3400: invokestatic a : (III)Z
    //   3403: istore_1
    //   3404: aload_0
    //   3405: getstatic p.u : [Lci;
    //   3408: aload_0
    //   3409: getfield aP : I
    //   3412: aaload
    //   3413: iload_1
    //   3414: ifeq -> 3421
    //   3417: iconst_0
    //   3418: goto -> 3422
    //   3421: iconst_1
    //   3422: invokevirtual a : (Lci;I)V
    //   3425: return
    //   3426: aload_0
    //   3427: bipush #32
    //   3429: putfield as : I
    //   3432: aload_0
    //   3433: getfield K : I
    //   3436: ifne -> 3467
    //   3439: getstatic main/a.w : I
    //   3442: iconst_3
    //   3443: irem
    //   3444: ifne -> 3467
    //   3447: sipush #153
    //   3450: aload_0
    //   3451: getfield B : I
    //   3454: aload_0
    //   3455: getfield C : I
    //   3458: aload_0
    //   3459: getfield al : I
    //   3462: isub
    //   3463: iconst_2
    //   3464: invokestatic a : (IIII)V
    //   3467: getstatic bv.l : I
    //   3470: sipush #170
    //   3473: if_icmpne -> 3520
    //   3476: aload_0
    //   3477: getfield K : I
    //   3480: iconst_2
    //   3481: if_icmpeq -> 3492
    //   3484: aload_0
    //   3485: getfield K : I
    //   3488: iconst_1
    //   3489: if_icmpne -> 3520
    //   3492: getstatic main/a.w : I
    //   3495: iconst_3
    //   3496: irem
    //   3497: ifne -> 3520
    //   3500: sipush #153
    //   3503: aload_0
    //   3504: getfield B : I
    //   3507: aload_0
    //   3508: getfield C : I
    //   3511: aload_0
    //   3512: getfield al : I
    //   3515: isub
    //   3516: iconst_2
    //   3517: invokestatic a : (IIII)V
    //   3520: aload_0
    //   3521: dup
    //   3522: getfield em : I
    //   3525: iconst_1
    //   3526: iadd
    //   3527: putfield em : I
    //   3530: aload_0
    //   3531: getfield em : I
    //   3534: sipush #500
    //   3537: if_icmpne -> 3544
    //   3540: aload_0
    //   3541: invokevirtual C : ()V
    //   3544: return
    //   3545: aload_0
    //   3546: getfield H : I
    //   3549: bipush #14
    //   3551: if_icmpeq -> 3559
    //   3554: aload_0
    //   3555: iconst_3
    //   3556: putfield H : I
    //   3559: aload_0
    //   3560: bipush #-3
    //   3562: putfield E : I
    //   3565: aload_0
    //   3566: dup
    //   3567: getfield C : I
    //   3570: aload_0
    //   3571: getfield E : I
    //   3574: iadd
    //   3575: putfield C : I
    //   3578: aload_0
    //   3579: bipush #7
    //   3581: putfield as : I
    //   3584: return
    //   3585: aload_0
    //   3586: getfield aq : Z
    //   3589: ifeq -> 3840
    //   3592: getstatic main/a.e : Z
    //   3595: ifeq -> 3840
    //   3598: aload_0
    //   3599: getfield aU : Laf;
    //   3602: ifnull -> 3835
    //   3605: aload_0
    //   3606: getfield aU : Laf;
    //   3609: getfield J : I
    //   3612: iflt -> 3835
    //   3615: aload_0
    //   3616: getfield aU : Laf;
    //   3619: getfield B : I
    //   3622: bipush #100
    //   3624: if_icmple -> 3835
    //   3627: aload_0
    //   3628: getfield aU : Laf;
    //   3631: getfield B : I
    //   3634: getstatic bv.c : I
    //   3637: bipush #100
    //   3639: isub
    //   3640: if_icmpge -> 3835
    //   3643: aload_0
    //   3644: invokevirtual j : ()Lbw;
    //   3647: ifnonnull -> 3835
    //   3650: aload_0
    //   3651: invokevirtual i : ()Lbw;
    //   3654: ifnonnull -> 3835
    //   3657: aload_0
    //   3658: invokevirtual I : ()Z
    //   3661: ifne -> 3835
    //   3664: getstatic bv.l : I
    //   3667: bipush #51
    //   3669: if_icmpeq -> 3835
    //   3672: getstatic bv.l : I
    //   3675: bipush #52
    //   3677: if_icmpeq -> 3835
    //   3680: getstatic main/a.G : Lg;
    //   3683: getfield S : Lel;
    //   3686: invokevirtual size : ()I
    //   3689: ifle -> 3835
    //   3692: invokestatic j : ()Lp;
    //   3695: getfield bQ : Ldz;
    //   3698: ifnonnull -> 3835
    //   3701: aload_0
    //   3702: getfield B : I
    //   3705: aload_0
    //   3706: getfield aU : Laf;
    //   3709: getfield B : I
    //   3712: isub
    //   3713: invokestatic abs : (I)I
    //   3716: istore_1
    //   3717: aload_0
    //   3718: getfield C : I
    //   3721: aload_0
    //   3722: getfield aU : Laf;
    //   3725: getfield C : I
    //   3728: isub
    //   3729: invokestatic abs : (I)I
    //   3732: istore_2
    //   3733: iload_1
    //   3734: bipush #60
    //   3736: if_icmpge -> 3827
    //   3739: iload_2
    //   3740: bipush #40
    //   3742: if_icmpge -> 3827
    //   3745: aload_0
    //   3746: getfield an : Lde;
    //   3749: ifnonnull -> 3777
    //   3752: aload_0
    //   3753: new de
    //   3756: dup
    //   3757: getstatic aw.bh : Ljava/lang/String;
    //   3760: sipush #11111
    //   3763: invokespecial <init> : (Ljava/lang/String;I)V
    //   3766: putfield an : Lde;
    //   3769: aload_0
    //   3770: getfield an : Lde;
    //   3773: iconst_0
    //   3774: putfield f : Z
    //   3777: aload_0
    //   3778: getfield an : Lde;
    //   3781: aload_0
    //   3782: getfield aU : Laf;
    //   3785: getfield B : I
    //   3788: getstatic p.j : I
    //   3791: isub
    //   3792: putfield j : I
    //   3795: aload_0
    //   3796: getfield an : Lde;
    //   3799: aload_0
    //   3800: getfield aU : Laf;
    //   3803: getfield C : I
    //   3806: aload_0
    //   3807: getfield aU : Laf;
    //   3810: getfield al : I
    //   3813: isub
    //   3814: bipush #30
    //   3816: isub
    //   3817: getstatic p.k : I
    //   3820: isub
    //   3821: putfield k : I
    //   3824: goto -> 3840
    //   3827: aload_0
    //   3828: aconst_null
    //   3829: putfield an : Lde;
    //   3832: goto -> 3840
    //   3835: aload_0
    //   3836: aconst_null
    //   3837: putfield an : Lde;
    //   3840: aload_0
    //   3841: getfield bd : Z
    //   3844: ifeq -> 3851
    //   3847: aload_0
    //   3848: invokevirtual H : ()V
    //   3851: aload_0
    //   3852: getfield s : Z
    //   3855: ifeq -> 3859
    //   3858: return
    //   3859: aload_0
    //   3860: getfield z : Lej;
    //   3863: ifnull -> 3873
    //   3866: aload_0
    //   3867: getfield z : Lej;
    //   3870: invokevirtual b : ()V
    //   3873: aload_0
    //   3874: getfield c : I
    //   3877: ifle -> 3890
    //   3880: aload_0
    //   3881: dup
    //   3882: getfield c : I
    //   3885: iconst_1
    //   3886: isub
    //   3887: putfield c : I
    //   3890: aload_0
    //   3891: getfield j : B
    //   3894: ifle -> 3939
    //   3897: getstatic main/a.w : I
    //   3900: iconst_2
    //   3901: irem
    //   3902: ifne -> 3939
    //   3905: aload_0
    //   3906: dup
    //   3907: getfield j : B
    //   3910: iconst_1
    //   3911: isub
    //   3912: i2b
    //   3913: putfield j : B
    //   3916: aload_0
    //   3917: getfield j : B
    //   3920: bipush #30
    //   3922: if_icmpeq -> 3934
    //   3925: aload_0
    //   3926: getfield j : B
    //   3929: bipush #60
    //   3931: if_icmpne -> 3939
    //   3934: aload_0
    //   3935: iconst_0
    //   3936: putfield j : B
    //   3939: aload_0
    //   3940: invokespecial ah : ()V
    //   3943: aload_0
    //   3944: getfield aR : Laa;
    //   3947: ifnull -> 4095
    //   3950: aload_0
    //   3951: dup
    //   3952: astore_1
    //   3953: getfield aS : I
    //   3956: ifeq -> 3969
    //   3959: aload_1
    //   3960: dup
    //   3961: getfield aS : I
    //   3964: iconst_1
    //   3965: isub
    //   3966: putfield aS : I
    //   3969: aload_1
    //   3970: getfield aS : I
    //   3973: ifne -> 4095
    //   3976: aload_1
    //   3977: getfield aR : Laa;
    //   3980: aload_1
    //   3981: getfield I : I
    //   3984: iconst_1
    //   3985: if_icmpne -> 3998
    //   3988: aload_1
    //   3989: getfield B : I
    //   3992: bipush #30
    //   3994: isub
    //   3995: goto -> 4005
    //   3998: aload_1
    //   3999: getfield B : I
    //   4002: bipush #30
    //   4004: iadd
    //   4005: putfield t : I
    //   4008: aload_1
    //   4009: getfield aR : Laa;
    //   4012: aload_1
    //   4013: getfield C : I
    //   4016: bipush #60
    //   4018: isub
    //   4019: putfield u : I
    //   4022: aload_1
    //   4023: getfield aR : Laa;
    //   4026: getfield t : I
    //   4029: aload_1
    //   4030: getfield aR : Laa;
    //   4033: getfield m : I
    //   4036: isub
    //   4037: istore_2
    //   4038: aload_1
    //   4039: getfield aR : Laa;
    //   4042: getfield u : I
    //   4045: aload_1
    //   4046: getfield aR : Laa;
    //   4049: getfield n : I
    //   4052: isub
    //   4053: istore_3
    //   4054: aload_1
    //   4055: getfield aR : Laa;
    //   4058: dup
    //   4059: getfield m : I
    //   4062: iload_2
    //   4063: iconst_4
    //   4064: idiv
    //   4065: iadd
    //   4066: putfield m : I
    //   4069: aload_1
    //   4070: getfield aR : Laa;
    //   4073: dup
    //   4074: getfield n : I
    //   4077: iload_3
    //   4078: iconst_4
    //   4079: idiv
    //   4080: iadd
    //   4081: putfield n : I
    //   4084: aload_1
    //   4085: getfield aR : Laa;
    //   4088: aload_1
    //   4089: getfield I : I
    //   4092: putfield o : I
    //   4095: aload_0
    //   4096: getfield cc : Ldq;
    //   4099: ifnull -> 4109
    //   4102: aload_0
    //   4103: getfield cc : Ldq;
    //   4106: invokevirtual a : ()V
    //   4109: aload_0
    //   4110: getfield cd : Lbj;
    //   4113: ifnull -> 4123
    //   4116: aload_0
    //   4117: getfield cd : Lbj;
    //   4120: invokevirtual a : ()V
    //   4123: aload_0
    //   4124: invokespecial ae : ()V
    //   4127: aload_0
    //   4128: getfield cI : I
    //   4131: ifeq -> 4169
    //   4134: getstatic main/a.w : I
    //   4137: iconst_5
    //   4138: irem
    //   4139: ifne -> 4168
    //   4142: new ea
    //   4145: dup
    //   4146: bipush #32
    //   4148: aload_0
    //   4149: getfield B : I
    //   4152: aload_0
    //   4153: getfield C : I
    //   4156: bipush #24
    //   4158: iadd
    //   4159: iconst_3
    //   4160: iconst_5
    //   4161: iconst_1
    //   4162: invokespecial <init> : (IIIIII)V
    //   4165: invokestatic a : (Lea;)V
    //   4168: return
    //   4169: aload_0
    //   4170: getfield cO : Z
    //   4173: ifeq -> 4177
    //   4176: return
    //   4177: aload_0
    //   4178: getfield cQ : Z
    //   4181: ifeq -> 4185
    //   4184: return
    //   4185: aload_0
    //   4186: getfield cJ : Z
    //   4189: ifeq -> 4314
    //   4192: aload_0
    //   4193: getfield eE : Laf;
    //   4196: ifnull -> 4226
    //   4199: aload_0
    //   4200: getfield eE : Laf;
    //   4203: getfield H : I
    //   4206: bipush #14
    //   4208: if_icmpeq -> 4222
    //   4211: aload_0
    //   4212: getfield eE : Laf;
    //   4215: getfield H : I
    //   4218: iconst_5
    //   4219: if_icmpne -> 4226
    //   4222: aload_0
    //   4223: invokevirtual P : ()V
    //   4226: aload_0
    //   4227: getfield eF : Laa;
    //   4230: ifnull -> 4248
    //   4233: aload_0
    //   4234: getfield eF : Laa;
    //   4237: getfield p : I
    //   4240: iconst_1
    //   4241: if_icmpne -> 4248
    //   4244: aload_0
    //   4245: invokevirtual P : ()V
    //   4248: aload_0
    //   4249: getfield aq : Z
    //   4252: ifeq -> 4285
    //   4255: aload_0
    //   4256: getfield H : I
    //   4259: iconst_2
    //   4260: if_icmpne -> 4285
    //   4263: aload_0
    //   4264: getfield bP : Ldm;
    //   4267: ifnull -> 4285
    //   4270: aload_0
    //   4271: iconst_0
    //   4272: putfield cJ : Z
    //   4275: aload_0
    //   4276: aconst_null
    //   4277: putfield eE : Laf;
    //   4280: aload_0
    //   4281: aconst_null
    //   4282: putfield eF : Laa;
    //   4285: aload_0
    //   4286: getfield B : I
    //   4289: aload_0
    //   4290: getfield C : I
    //   4293: iconst_2
    //   4294: invokestatic a : (III)Z
    //   4297: ifeq -> 4307
    //   4300: aload_0
    //   4301: bipush #16
    //   4303: putfield as : I
    //   4306: return
    //   4307: aload_0
    //   4308: bipush #31
    //   4310: putfield as : I
    //   4313: return
    //   4314: aload_0
    //   4315: getfield U : J
    //   4318: lconst_0
    //   4319: lcmp
    //   4320: ifle -> 4482
    //   4323: iconst_0
    //   4324: istore_1
    //   4325: goto -> 4377
    //   4328: aload_0
    //   4329: getfield aB : Lel;
    //   4332: iload_1
    //   4333: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   4336: checkcast ec
    //   4339: astore_2
    //   4340: getstatic main/a.y : Z
    //   4343: ifeq -> 4374
    //   4346: aload_0
    //   4347: dup
    //   4348: getfield U : J
    //   4351: aload_2
    //   4352: getfield a : S
    //   4355: i2l
    //   4356: ladd
    //   4357: putfield U : J
    //   4360: aload_0
    //   4361: dup
    //   4362: getfield T : J
    //   4365: aload_2
    //   4366: getfield a : S
    //   4369: i2l
    //   4370: ladd
    //   4371: putfield T : J
    //   4374: iinc #1, 1
    //   4377: iload_1
    //   4378: aload_0
    //   4379: getfield aB : Lel;
    //   4382: invokevirtual size : ()I
    //   4385: if_icmplt -> 4328
    //   4388: aload_0
    //   4389: getfield R : I
    //   4392: ifle -> 4415
    //   4395: getstatic main/a.z : Z
    //   4398: ifeq -> 4415
    //   4401: aload_0
    //   4402: dup
    //   4403: getfield U : J
    //   4406: aload_0
    //   4407: getfield R : I
    //   4410: i2l
    //   4411: ladd
    //   4412: putfield U : J
    //   4415: aload_0
    //   4416: getfield S : I
    //   4419: ifle -> 4442
    //   4422: getstatic main/a.z : Z
    //   4425: ifeq -> 4442
    //   4428: aload_0
    //   4429: dup
    //   4430: getfield T : J
    //   4433: aload_0
    //   4434: getfield S : I
    //   4437: i2l
    //   4438: ladd
    //   4439: putfield T : J
    //   4442: aload_0
    //   4443: getfield U : J
    //   4446: aload_0
    //   4447: getfield V : J
    //   4450: lcmp
    //   4451: ifle -> 4462
    //   4454: aload_0
    //   4455: aload_0
    //   4456: getfield V : J
    //   4459: putfield U : J
    //   4462: aload_0
    //   4463: getfield T : J
    //   4466: aload_0
    //   4467: getfield W : J
    //   4470: lcmp
    //   4471: ifle -> 4482
    //   4474: aload_0
    //   4475: aload_0
    //   4476: getfield W : J
    //   4479: putfield T : J
    //   4482: aload_0
    //   4483: getfield ap : Z
    //   4486: ifeq -> 4534
    //   4489: aload_0
    //   4490: getfield B : I
    //   4493: getstatic p.f : I
    //   4496: isub
    //   4497: putstatic p.l : I
    //   4500: aload_0
    //   4501: getfield C : I
    //   4504: getstatic p.g : I
    //   4507: isub
    //   4508: iconst_1
    //   4509: isub
    //   4510: putstatic p.m : I
    //   4513: getstatic main/a.f : Z
    //   4516: ifne -> 4534
    //   4519: getstatic p.l : I
    //   4522: getstatic p.i : I
    //   4525: aload_0
    //   4526: getfield I : I
    //   4529: imul
    //   4530: iadd
    //   4531: putstatic p.l : I
    //   4534: aload_0
    //   4535: aload_0
    //   4536: getfield h : I
    //   4539: iconst_1
    //   4540: iadd
    //   4541: bipush #100
    //   4543: irem
    //   4544: putfield h : I
    //   4547: aload_0
    //   4548: getfield aq : Z
    //   4551: ifeq -> 5653
    //   4554: aload_0
    //   4555: getfield aU : Laf;
    //   4558: ifnull -> 4579
    //   4561: getstatic p.D : Lel;
    //   4564: aload_0
    //   4565: getfield aU : Laf;
    //   4568: invokevirtual contains : (Ljava/lang/Object;)Z
    //   4571: ifne -> 4579
    //   4574: aload_0
    //   4575: aconst_null
    //   4576: putfield aU : Laf;
    //   4579: aload_0
    //   4580: getfield B : I
    //   4583: bipush #10
    //   4585: if_icmpge -> 4602
    //   4588: aload_0
    //   4589: iconst_0
    //   4590: putfield D : I
    //   4593: aload_0
    //   4594: bipush #10
    //   4596: putfield B : I
    //   4599: goto -> 4630
    //   4602: aload_0
    //   4603: getfield B : I
    //   4606: getstatic bv.c : I
    //   4609: bipush #10
    //   4611: isub
    //   4612: if_icmple -> 4630
    //   4615: aload_0
    //   4616: getstatic bv.c : I
    //   4619: bipush #10
    //   4621: isub
    //   4622: putfield B : I
    //   4625: aload_0
    //   4626: iconst_0
    //   4627: putfield D : I
    //   4630: getstatic af.bG : Z
    //   4633: ifne -> 4692
    //   4636: aload_0
    //   4637: invokespecial ac : ()Z
    //   4640: ifeq -> 4692
    //   4643: invokestatic a : ()Lbt;
    //   4646: invokevirtual g : ()V
    //   4649: invokestatic b : ()Z
    //   4652: ifeq -> 4668
    //   4655: invokestatic a : ()Lbt;
    //   4658: invokevirtual q : ()V
    //   4661: iconst_1
    //   4662: putstatic af.bG : Z
    //   4665: goto -> 4674
    //   4668: invokestatic a : ()Lbt;
    //   4671: invokevirtual f : ()V
    //   4674: iconst_1
    //   4675: putstatic af.bH : Z
    //   4678: iconst_1
    //   4679: putstatic af.bG : Z
    //   4682: invokestatic g : ()V
    //   4685: invokestatic f : ()V
    //   4688: invokestatic a : ()V
    //   4691: return
    //   4692: aload_0
    //   4693: getfield H : I
    //   4696: iconst_4
    //   4697: if_icmpeq -> 4755
    //   4700: aload_0
    //   4701: getfield B : I
    //   4704: aload_0
    //   4705: getfield bD : I
    //   4708: isub
    //   4709: invokestatic g : (I)I
    //   4712: aload_0
    //   4713: getfield C : I
    //   4716: aload_0
    //   4717: getfield bE : I
    //   4720: isub
    //   4721: invokestatic g : (I)I
    //   4724: iadd
    //   4725: bipush #70
    //   4727: if_icmplt -> 4755
    //   4730: aload_0
    //   4731: getfield C : I
    //   4734: aload_0
    //   4735: getfield bE : I
    //   4738: isub
    //   4739: ifgt -> 4755
    //   4742: aload_0
    //   4743: getfield aq : Z
    //   4746: ifeq -> 4755
    //   4749: invokestatic a : ()Lbt;
    //   4752: invokevirtual g : ()V
    //   4755: aload_0
    //   4756: getfield bJ : Z
    //   4759: ifeq -> 4767
    //   4762: aload_0
    //   4763: aconst_null
    //   4764: putfield bP : Ldm;
    //   4767: aload_0
    //   4768: getfield bP : Ldm;
    //   4771: ifnull -> 5646
    //   4774: aload_0
    //   4775: getfield B : I
    //   4778: aload_0
    //   4779: getfield bP : Ldm;
    //   4782: getfield a : I
    //   4785: isub
    //   4786: invokestatic c : (I)I
    //   4789: bipush #16
    //   4791: if_icmpgt -> 4911
    //   4794: aload_0
    //   4795: getfield C : I
    //   4798: aload_0
    //   4799: getfield bP : Ldm;
    //   4802: getfield b : I
    //   4805: isub
    //   4806: invokestatic c : (I)I
    //   4809: bipush #16
    //   4811: if_icmpgt -> 4911
    //   4814: aload_0
    //   4815: aload_0
    //   4816: getfield bP : Ldm;
    //   4819: getfield a : I
    //   4822: aload_0
    //   4823: getfield B : I
    //   4826: iadd
    //   4827: iconst_2
    //   4828: idiv
    //   4829: putfield B : I
    //   4832: aload_0
    //   4833: aload_0
    //   4834: getfield bP : Ldm;
    //   4837: getfield b : I
    //   4840: putfield C : I
    //   4843: aload_0
    //   4844: aconst_null
    //   4845: putfield bP : Ldm;
    //   4848: getstatic p.c : Lp;
    //   4851: iconst_0
    //   4852: putfield aV : Z
    //   4855: aload_0
    //   4856: invokespecial af : ()V
    //   4859: aload_0
    //   4860: aload_0
    //   4861: iconst_0
    //   4862: dup_x1
    //   4863: putfield E : I
    //   4866: putfield D : I
    //   4869: aload_0
    //   4870: getfield B : I
    //   4873: aload_0
    //   4874: getfield C : I
    //   4877: invokestatic b : (II)I
    //   4880: iconst_2
    //   4881: iand
    //   4882: iconst_2
    //   4883: if_icmpne -> 4894
    //   4886: aload_0
    //   4887: iconst_1
    //   4888: putfield H : I
    //   4891: goto -> 4902
    //   4894: aload_0
    //   4895: invokespecial ar : ()V
    //   4898: aload_0
    //   4899: invokespecial ax : ()V
    //   4902: invokestatic a : ()Lbt;
    //   4905: invokevirtual g : ()V
    //   4908: goto -> 5646
    //   4911: aload_0
    //   4912: aload_0
    //   4913: getfield bP : Ldm;
    //   4916: getfield a : I
    //   4919: aload_0
    //   4920: getfield B : I
    //   4923: if_icmple -> 4930
    //   4926: iconst_1
    //   4927: goto -> 4931
    //   4930: iconst_m1
    //   4931: putfield I : I
    //   4934: aload_0
    //   4935: getfield B : I
    //   4938: aload_0
    //   4939: getfield C : I
    //   4942: iconst_2
    //   4943: invokestatic a : (III)Z
    //   4946: ifeq -> 5321
    //   4949: aload_0
    //   4950: iconst_2
    //   4951: putfield H : I
    //   4954: aload_0
    //   4955: getfield bP : Ldm;
    //   4958: ifnull -> 4979
    //   4961: aload_0
    //   4962: aload_0
    //   4963: getfield O : I
    //   4966: aload_0
    //   4967: getfield I : I
    //   4970: imul
    //   4971: putfield D : I
    //   4974: aload_0
    //   4975: iconst_0
    //   4976: putfield E : I
    //   4979: aload_0
    //   4980: getfield B : I
    //   4983: aload_0
    //   4984: getfield bP : Ldm;
    //   4987: getfield a : I
    //   4990: isub
    //   4991: invokestatic c : (I)I
    //   4994: bipush #10
    //   4996: if_icmpgt -> 5204
    //   4999: aload_0
    //   5000: getfield bP : Ldm;
    //   5003: getfield b : I
    //   5006: aload_0
    //   5007: getfield C : I
    //   5010: if_icmple -> 5172
    //   5013: aload_0
    //   5014: getfield bP : Ldm;
    //   5017: getfield b : I
    //   5020: aload_0
    //   5021: getfield C : I
    //   5024: if_icmple -> 5204
    //   5027: iconst_0
    //   5028: istore_1
    //   5029: aload_0
    //   5030: getfield I : I
    //   5033: iconst_1
    //   5034: if_icmpne -> 5042
    //   5037: iconst_1
    //   5038: istore_2
    //   5039: goto -> 5044
    //   5042: iconst_m1
    //   5043: istore_2
    //   5044: iconst_0
    //   5045: istore_3
    //   5046: goto -> 5089
    //   5049: aload_0
    //   5050: getfield bP : Ldm;
    //   5053: getfield a : I
    //   5056: aload_0
    //   5057: getfield am : I
    //   5060: iload_2
    //   5061: imul
    //   5062: iadd
    //   5063: aload_0
    //   5064: getfield C : I
    //   5067: aload_0
    //   5068: getfield f : I
    //   5071: iload_3
    //   5072: imul
    //   5073: iadd
    //   5074: iconst_2
    //   5075: invokestatic a : (III)Z
    //   5078: ifeq -> 5086
    //   5081: iconst_1
    //   5082: istore_1
    //   5083: goto -> 5094
    //   5086: iinc #3, 1
    //   5089: iload_3
    //   5090: iconst_2
    //   5091: if_icmplt -> 5049
    //   5094: iload_1
    //   5095: ifeq -> 5132
    //   5098: aload_0
    //   5099: aconst_null
    //   5100: putfield bP : Ldm;
    //   5103: getstatic p.c : Lp;
    //   5106: iconst_0
    //   5107: putfield aV : Z
    //   5110: aload_0
    //   5111: iconst_1
    //   5112: putfield H : I
    //   5115: aload_0
    //   5116: aload_0
    //   5117: iconst_0
    //   5118: dup_x1
    //   5119: putfield E : I
    //   5122: putfield D : I
    //   5125: aload_0
    //   5126: invokespecial af : ()V
    //   5129: goto -> 5204
    //   5132: invokestatic a : ()Lbu;
    //   5135: pop
    //   5136: aload_0
    //   5137: aload_0
    //   5138: getfield bP : Ldm;
    //   5141: getfield a : I
    //   5144: putfield B : I
    //   5147: aload_0
    //   5148: bipush #10
    //   5150: putfield H : I
    //   5153: aload_0
    //   5154: bipush #-5
    //   5156: putfield E : I
    //   5159: aload_0
    //   5160: iconst_0
    //   5161: putfield D : I
    //   5164: ldc 'Jum lun'
    //   5166: invokestatic c : (Ljava/lang/String;)V
    //   5169: goto -> 5204
    //   5172: invokestatic a : ()Lbu;
    //   5175: pop
    //   5176: aload_0
    //   5177: aload_0
    //   5178: getfield bP : Ldm;
    //   5181: getfield a : I
    //   5184: putfield B : I
    //   5187: aload_0
    //   5188: bipush #10
    //   5190: putfield H : I
    //   5193: aload_0
    //   5194: bipush #-5
    //   5196: putfield E : I
    //   5199: aload_0
    //   5200: iconst_0
    //   5201: putfield D : I
    //   5204: aload_0
    //   5205: getfield I : I
    //   5208: iconst_1
    //   5209: if_icmpne -> 5265
    //   5212: aload_0
    //   5213: getfield B : I
    //   5216: aload_0
    //   5217: getfield am : I
    //   5220: iadd
    //   5221: aload_0
    //   5222: getfield C : I
    //   5225: aload_0
    //   5226: getfield f : I
    //   5229: isub
    //   5230: iconst_4
    //   5231: invokestatic a : (III)Z
    //   5234: ifeq -> 5646
    //   5237: aload_0
    //   5238: aload_0
    //   5239: getfield O : I
    //   5242: aload_0
    //   5243: getfield I : I
    //   5246: imul
    //   5247: putfield D : I
    //   5250: aload_0
    //   5251: bipush #10
    //   5253: putfield H : I
    //   5256: aload_0
    //   5257: bipush #-5
    //   5259: putfield E : I
    //   5262: goto -> 5646
    //   5265: aload_0
    //   5266: getfield B : I
    //   5269: aload_0
    //   5270: getfield am : I
    //   5273: isub
    //   5274: iconst_1
    //   5275: isub
    //   5276: aload_0
    //   5277: getfield C : I
    //   5280: aload_0
    //   5281: getfield f : I
    //   5284: isub
    //   5285: bipush #8
    //   5287: invokestatic a : (III)Z
    //   5290: ifeq -> 5646
    //   5293: aload_0
    //   5294: aload_0
    //   5295: getfield O : I
    //   5298: aload_0
    //   5299: getfield I : I
    //   5302: imul
    //   5303: putfield D : I
    //   5306: aload_0
    //   5307: bipush #10
    //   5309: putfield H : I
    //   5312: aload_0
    //   5313: bipush #-5
    //   5315: putfield E : I
    //   5318: goto -> 5646
    //   5321: aload_0
    //   5322: getfield bP : Ldm;
    //   5325: getfield b : I
    //   5328: aload_0
    //   5329: getfield C : I
    //   5332: bipush #10
    //   5334: iadd
    //   5335: if_icmpge -> 5430
    //   5338: aload_0
    //   5339: bipush #10
    //   5341: putfield H : I
    //   5344: aload_0
    //   5345: bipush #-5
    //   5347: putfield E : I
    //   5350: aload_0
    //   5351: getfield C : I
    //   5354: aload_0
    //   5355: getfield bP : Ldm;
    //   5358: getfield b : I
    //   5361: isub
    //   5362: invokestatic c : (I)I
    //   5365: bipush #10
    //   5367: if_icmpgt -> 5386
    //   5370: aload_0
    //   5371: aload_0
    //   5372: getfield bP : Ldm;
    //   5375: getfield b : I
    //   5378: putfield C : I
    //   5381: aload_0
    //   5382: iconst_0
    //   5383: putfield E : I
    //   5386: aload_0
    //   5387: getfield B : I
    //   5390: aload_0
    //   5391: getfield bP : Ldm;
    //   5394: getfield a : I
    //   5397: isub
    //   5398: invokestatic c : (I)I
    //   5401: bipush #10
    //   5403: if_icmpgt -> 5414
    //   5406: aload_0
    //   5407: iconst_0
    //   5408: putfield D : I
    //   5411: goto -> 5506
    //   5414: aload_0
    //   5415: aload_0
    //   5416: getfield O : I
    //   5419: aload_0
    //   5420: getfield I : I
    //   5423: imul
    //   5424: putfield D : I
    //   5427: goto -> 5506
    //   5430: aload_0
    //   5431: getfield B : I
    //   5434: aload_0
    //   5435: getfield C : I
    //   5438: iconst_2
    //   5439: invokestatic a : (III)Z
    //   5442: ifeq -> 5479
    //   5445: aload_0
    //   5446: aconst_null
    //   5447: putfield bP : Ldm;
    //   5450: getstatic p.c : Lp;
    //   5453: iconst_0
    //   5454: putfield aV : Z
    //   5457: aload_0
    //   5458: iconst_1
    //   5459: putfield H : I
    //   5462: aload_0
    //   5463: aload_0
    //   5464: iconst_0
    //   5465: dup_x1
    //   5466: putfield E : I
    //   5469: putfield D : I
    //   5472: aload_0
    //   5473: invokespecial af : ()V
    //   5476: goto -> 5506
    //   5479: aload_0
    //   5480: getfield H : I
    //   5483: bipush #10
    //   5485: if_icmpeq -> 5496
    //   5488: aload_0
    //   5489: getfield H : I
    //   5492: iconst_2
    //   5493: if_icmpne -> 5501
    //   5496: aload_0
    //   5497: iconst_0
    //   5498: putfield E : I
    //   5501: aload_0
    //   5502: iconst_4
    //   5503: putfield H : I
    //   5506: aload_0
    //   5507: getfield bP : Ldm;
    //   5510: getfield b : I
    //   5513: aload_0
    //   5514: getfield C : I
    //   5517: if_icmple -> 5646
    //   5520: aload_0
    //   5521: getfield I : I
    //   5524: iconst_1
    //   5525: if_icmpne -> 5587
    //   5528: aload_0
    //   5529: getfield B : I
    //   5532: aload_0
    //   5533: getfield am : I
    //   5536: iadd
    //   5537: aload_0
    //   5538: getfield C : I
    //   5541: aload_0
    //   5542: getfield f : I
    //   5545: isub
    //   5546: iconst_4
    //   5547: invokestatic a : (III)Z
    //   5550: ifeq -> 5646
    //   5553: aload_0
    //   5554: aload_0
    //   5555: iconst_0
    //   5556: dup_x1
    //   5557: putfield E : I
    //   5560: putfield D : I
    //   5563: aload_0
    //   5564: iconst_4
    //   5565: putfield H : I
    //   5568: aload_0
    //   5569: aconst_null
    //   5570: putfield bP : Ldm;
    //   5573: getstatic p.c : Lp;
    //   5576: iconst_0
    //   5577: putfield aV : Z
    //   5580: aload_0
    //   5581: invokespecial af : ()V
    //   5584: goto -> 5646
    //   5587: aload_0
    //   5588: getfield B : I
    //   5591: aload_0
    //   5592: getfield am : I
    //   5595: isub
    //   5596: iconst_1
    //   5597: isub
    //   5598: aload_0
    //   5599: getfield C : I
    //   5602: aload_0
    //   5603: getfield f : I
    //   5606: isub
    //   5607: bipush #8
    //   5609: invokestatic a : (III)Z
    //   5612: ifeq -> 5646
    //   5615: aload_0
    //   5616: aload_0
    //   5617: iconst_0
    //   5618: dup_x1
    //   5619: putfield E : I
    //   5622: putfield D : I
    //   5625: aload_0
    //   5626: iconst_4
    //   5627: putfield H : I
    //   5630: aload_0
    //   5631: aconst_null
    //   5632: putfield bP : Ldm;
    //   5635: getstatic p.c : Lp;
    //   5638: iconst_0
    //   5639: putfield aV : Z
    //   5642: aload_0
    //   5643: invokespecial af : ()V
    //   5646: aload_0
    //   5647: invokespecial ay : ()V
    //   5650: goto -> 6745
    //   5653: aload_0
    //   5654: invokespecial ag : ()V
    //   5657: aload_0
    //   5658: getfield H : I
    //   5661: iconst_1
    //   5662: if_icmpeq -> 5674
    //   5665: aload_0
    //   5666: getfield H : I
    //   5669: bipush #6
    //   5671: if_icmpne -> 6745
    //   5674: iconst_0
    //   5675: istore_1
    //   5676: aload_0
    //   5677: getfield bP : Ldm;
    //   5680: ifnull -> 6129
    //   5683: aload_0
    //   5684: getfield bP : Ldm;
    //   5687: getfield a : I
    //   5690: aload_0
    //   5691: getfield B : I
    //   5694: isub
    //   5695: invokestatic c : (I)I
    //   5698: bipush #17
    //   5700: if_icmpge -> 5838
    //   5703: aload_0
    //   5704: getfield bP : Ldm;
    //   5707: getfield b : I
    //   5710: aload_0
    //   5711: getfield C : I
    //   5714: isub
    //   5715: invokestatic c : (I)I
    //   5718: bipush #25
    //   5720: if_icmpge -> 5838
    //   5723: aload_0
    //   5724: aload_0
    //   5725: getfield bP : Ldm;
    //   5728: getfield a : I
    //   5731: putfield B : I
    //   5734: aload_0
    //   5735: aload_0
    //   5736: getfield bP : Ldm;
    //   5739: getfield b : I
    //   5742: putfield C : I
    //   5745: aload_0
    //   5746: aconst_null
    //   5747: putfield bP : Ldm;
    //   5750: aload_0
    //   5751: getfield B : I
    //   5754: aload_0
    //   5755: getfield C : I
    //   5758: invokestatic b : (II)I
    //   5761: iconst_2
    //   5762: iand
    //   5763: iconst_2
    //   5764: if_icmpne -> 5818
    //   5767: aload_0
    //   5768: iconst_1
    //   5769: putfield H : I
    //   5772: aload_0
    //   5773: iconst_0
    //   5774: putfield G : I
    //   5777: invokestatic a : ()Lmain/a;
    //   5780: iconst_m1
    //   5781: aload_0
    //   5782: getfield B : I
    //   5785: bipush #-8
    //   5787: isub
    //   5788: aload_0
    //   5789: getfield C : I
    //   5792: invokevirtual a : (III)Z
    //   5795: pop
    //   5796: invokestatic a : ()Lmain/a;
    //   5799: iconst_1
    //   5800: aload_0
    //   5801: getfield B : I
    //   5804: bipush #8
    //   5806: isub
    //   5807: aload_0
    //   5808: getfield C : I
    //   5811: invokevirtual a : (III)Z
    //   5814: pop
    //   5815: goto -> 5833
    //   5818: aload_0
    //   5819: iconst_4
    //   5820: putfield H : I
    //   5823: aload_0
    //   5824: iconst_0
    //   5825: putfield E : I
    //   5828: aload_0
    //   5829: iconst_0
    //   5830: putfield F : I
    //   5833: iconst_1
    //   5834: istore_1
    //   5835: goto -> 6131
    //   5838: aload_0
    //   5839: getfield eC : I
    //   5842: bipush #10
    //   5844: if_icmpeq -> 5856
    //   5847: aload_0
    //   5848: getfield as : I
    //   5851: bipush #8
    //   5853: if_icmpne -> 5866
    //   5856: aload_0
    //   5857: getfield bF : Lel;
    //   5860: invokevirtual size : ()I
    //   5863: ifgt -> 6129
    //   5866: aload_0
    //   5867: getfield C : I
    //   5870: aload_0
    //   5871: getfield bP : Ldm;
    //   5874: getfield b : I
    //   5877: if_icmpne -> 5926
    //   5880: aload_0
    //   5881: getfield B : I
    //   5884: aload_0
    //   5885: getfield bP : Ldm;
    //   5888: getfield a : I
    //   5891: if_icmpeq -> 6131
    //   5894: aload_0
    //   5895: aload_0
    //   5896: getfield B : I
    //   5899: aload_0
    //   5900: getfield bP : Ldm;
    //   5903: getfield a : I
    //   5906: iadd
    //   5907: iconst_2
    //   5908: idiv
    //   5909: putfield B : I
    //   5912: aload_0
    //   5913: getstatic main/a.w : I
    //   5916: iconst_5
    //   5917: irem
    //   5918: iconst_2
    //   5919: iadd
    //   5920: putfield as : I
    //   5923: goto -> 6131
    //   5926: aload_0
    //   5927: getfield C : I
    //   5930: aload_0
    //   5931: getfield bP : Ldm;
    //   5934: getfield b : I
    //   5937: if_icmpge -> 6084
    //   5940: aload_0
    //   5941: bipush #12
    //   5943: putfield as : I
    //   5946: aload_0
    //   5947: aload_0
    //   5948: getfield B : I
    //   5951: aload_0
    //   5952: getfield bP : Ldm;
    //   5955: getfield a : I
    //   5958: iadd
    //   5959: iconst_2
    //   5960: idiv
    //   5961: putfield B : I
    //   5964: aload_0
    //   5965: getfield E : I
    //   5968: ifge -> 5976
    //   5971: aload_0
    //   5972: iconst_0
    //   5973: putfield E : I
    //   5976: aload_0
    //   5977: dup
    //   5978: getfield C : I
    //   5981: aload_0
    //   5982: getfield E : I
    //   5985: iadd
    //   5986: putfield C : I
    //   5989: aload_0
    //   5990: getfield B : I
    //   5993: aload_0
    //   5994: getfield C : I
    //   5997: invokestatic b : (II)I
    //   6000: iconst_2
    //   6001: iand
    //   6002: iconst_2
    //   6003: if_icmpne -> 6044
    //   6006: invokestatic a : ()Lmain/a;
    //   6009: iconst_m1
    //   6010: aload_0
    //   6011: getfield B : I
    //   6014: bipush #-8
    //   6016: isub
    //   6017: aload_0
    //   6018: getfield C : I
    //   6021: invokevirtual a : (III)Z
    //   6024: pop
    //   6025: invokestatic a : ()Lmain/a;
    //   6028: iconst_1
    //   6029: aload_0
    //   6030: getfield B : I
    //   6033: bipush #8
    //   6035: isub
    //   6036: aload_0
    //   6037: getfield C : I
    //   6040: invokevirtual a : (III)Z
    //   6043: pop
    //   6044: aload_0
    //   6045: dup
    //   6046: getfield E : I
    //   6049: iconst_1
    //   6050: iadd
    //   6051: putfield E : I
    //   6054: aload_0
    //   6055: getfield E : I
    //   6058: bipush #16
    //   6060: if_icmple -> 6131
    //   6063: aload_0
    //   6064: aload_0
    //   6065: getfield C : I
    //   6068: aload_0
    //   6069: getfield bP : Ldm;
    //   6072: getfield b : I
    //   6075: iadd
    //   6076: iconst_2
    //   6077: idiv
    //   6078: putfield C : I
    //   6081: goto -> 6131
    //   6084: aload_0
    //   6085: bipush #7
    //   6087: putfield as : I
    //   6090: aload_0
    //   6091: aload_0
    //   6092: getfield B : I
    //   6095: aload_0
    //   6096: getfield bP : Ldm;
    //   6099: getfield a : I
    //   6102: iadd
    //   6103: iconst_2
    //   6104: idiv
    //   6105: putfield B : I
    //   6108: aload_0
    //   6109: aload_0
    //   6110: getfield C : I
    //   6113: aload_0
    //   6114: getfield bP : Ldm;
    //   6117: getfield b : I
    //   6120: iadd
    //   6121: iconst_2
    //   6122: idiv
    //   6123: putfield C : I
    //   6126: goto -> 6131
    //   6129: iconst_1
    //   6130: istore_1
    //   6131: iload_1
    //   6132: ifeq -> 6745
    //   6135: aload_0
    //   6136: getfield bF : Lel;
    //   6139: invokevirtual size : ()I
    //   6142: ifle -> 6745
    //   6145: aload_0
    //   6146: aload_0
    //   6147: getfield bF : Lel;
    //   6150: invokevirtual firstElement : ()Ljava/lang/Object;
    //   6153: checkcast dm
    //   6156: putfield bP : Ldm;
    //   6159: aload_0
    //   6160: getfield bF : Lel;
    //   6163: iconst_0
    //   6164: invokevirtual removeElementAt : (I)V
    //   6167: aload_0
    //   6168: getfield bP : Ldm;
    //   6171: getfield c : I
    //   6174: iconst_2
    //   6175: if_icmpne -> 6369
    //   6178: aload_0
    //   6179: getfield B : I
    //   6182: aload_0
    //   6183: getfield C : I
    //   6186: bipush #12
    //   6188: iadd
    //   6189: invokestatic b : (II)I
    //   6192: iconst_2
    //   6193: iand
    //   6194: iconst_2
    //   6195: if_icmpeq -> 6300
    //   6198: aload_0
    //   6199: bipush #10
    //   6201: putfield H : I
    //   6204: aload_0
    //   6205: iconst_0
    //   6206: putfield F : I
    //   6209: aload_0
    //   6210: iconst_0
    //   6211: putfield d : I
    //   6214: aload_0
    //   6215: aload_0
    //   6216: getfield B : I
    //   6219: aload_0
    //   6220: getfield bP : Ldm;
    //   6223: getfield a : I
    //   6226: isub
    //   6227: ineg
    //   6228: bipush #10
    //   6230: idiv
    //   6231: putfield D : I
    //   6234: aload_0
    //   6235: aload_0
    //   6236: getfield C : I
    //   6239: aload_0
    //   6240: getfield bP : Ldm;
    //   6243: getfield b : I
    //   6246: isub
    //   6247: ineg
    //   6248: bipush #10
    //   6250: idiv
    //   6251: putfield E : I
    //   6254: aload_0
    //   6255: getfield B : I
    //   6258: aload_0
    //   6259: getfield bP : Ldm;
    //   6262: getfield a : I
    //   6265: isub
    //   6266: ifle -> 6277
    //   6269: aload_0
    //   6270: iconst_m1
    //   6271: putfield I : I
    //   6274: goto -> 6745
    //   6277: aload_0
    //   6278: getfield B : I
    //   6281: aload_0
    //   6282: getfield bP : Ldm;
    //   6285: getfield a : I
    //   6288: isub
    //   6289: ifge -> 6745
    //   6292: aload_0
    //   6293: iconst_1
    //   6294: putfield I : I
    //   6297: goto -> 6745
    //   6300: aload_0
    //   6301: iconst_2
    //   6302: putfield H : I
    //   6305: aload_0
    //   6306: getfield B : I
    //   6309: aload_0
    //   6310: getfield bP : Ldm;
    //   6313: getfield a : I
    //   6316: isub
    //   6317: ifle -> 6328
    //   6320: aload_0
    //   6321: iconst_m1
    //   6322: putfield I : I
    //   6325: goto -> 6348
    //   6328: aload_0
    //   6329: getfield B : I
    //   6332: aload_0
    //   6333: getfield bP : Ldm;
    //   6336: getfield a : I
    //   6339: isub
    //   6340: ifge -> 6348
    //   6343: aload_0
    //   6344: iconst_1
    //   6345: putfield I : I
    //   6348: aload_0
    //   6349: aload_0
    //   6350: getfield O : I
    //   6353: aload_0
    //   6354: getfield I : I
    //   6357: imul
    //   6358: putfield D : I
    //   6361: aload_0
    //   6362: iconst_0
    //   6363: putfield E : I
    //   6366: goto -> 6745
    //   6369: aload_0
    //   6370: getfield bP : Ldm;
    //   6373: getfield c : I
    //   6376: iconst_3
    //   6377: if_icmpne -> 6624
    //   6380: aload_0
    //   6381: getfield B : I
    //   6384: aload_0
    //   6385: getfield C : I
    //   6388: bipush #23
    //   6390: iadd
    //   6391: invokestatic b : (II)I
    //   6394: iconst_2
    //   6395: iand
    //   6396: iconst_2
    //   6397: if_icmpeq -> 6502
    //   6400: aload_0
    //   6401: bipush #10
    //   6403: putfield H : I
    //   6406: aload_0
    //   6407: iconst_0
    //   6408: putfield F : I
    //   6411: aload_0
    //   6412: iconst_0
    //   6413: putfield d : I
    //   6416: aload_0
    //   6417: aload_0
    //   6418: getfield B : I
    //   6421: aload_0
    //   6422: getfield bP : Ldm;
    //   6425: getfield a : I
    //   6428: isub
    //   6429: ineg
    //   6430: bipush #10
    //   6432: idiv
    //   6433: putfield D : I
    //   6436: aload_0
    //   6437: aload_0
    //   6438: getfield C : I
    //   6441: aload_0
    //   6442: getfield bP : Ldm;
    //   6445: getfield b : I
    //   6448: isub
    //   6449: ineg
    //   6450: bipush #10
    //   6452: idiv
    //   6453: putfield E : I
    //   6456: aload_0
    //   6457: getfield B : I
    //   6460: aload_0
    //   6461: getfield bP : Ldm;
    //   6464: getfield a : I
    //   6467: isub
    //   6468: ifle -> 6479
    //   6471: aload_0
    //   6472: iconst_m1
    //   6473: putfield I : I
    //   6476: goto -> 6745
    //   6479: aload_0
    //   6480: getfield B : I
    //   6483: aload_0
    //   6484: getfield bP : Ldm;
    //   6487: getfield a : I
    //   6490: isub
    //   6491: ifge -> 6745
    //   6494: aload_0
    //   6495: iconst_1
    //   6496: putfield I : I
    //   6499: goto -> 6745
    //   6502: aload_0
    //   6503: iconst_3
    //   6504: putfield H : I
    //   6507: invokestatic a : ()Lmain/a;
    //   6510: iconst_m1
    //   6511: aload_0
    //   6512: getfield B : I
    //   6515: bipush #-8
    //   6517: isub
    //   6518: aload_0
    //   6519: getfield C : I
    //   6522: invokevirtual a : (III)Z
    //   6525: pop
    //   6526: invokestatic a : ()Lmain/a;
    //   6529: iconst_1
    //   6530: aload_0
    //   6531: getfield B : I
    //   6534: bipush #8
    //   6536: isub
    //   6537: aload_0
    //   6538: getfield C : I
    //   6541: invokevirtual a : (III)Z
    //   6544: pop
    //   6545: aload_0
    //   6546: getfield B : I
    //   6549: aload_0
    //   6550: getfield bP : Ldm;
    //   6553: getfield a : I
    //   6556: isub
    //   6557: ifle -> 6568
    //   6560: aload_0
    //   6561: iconst_m1
    //   6562: putfield I : I
    //   6565: goto -> 6588
    //   6568: aload_0
    //   6569: getfield B : I
    //   6572: aload_0
    //   6573: getfield bP : Ldm;
    //   6576: getfield a : I
    //   6579: isub
    //   6580: ifge -> 6588
    //   6583: aload_0
    //   6584: iconst_1
    //   6585: putfield I : I
    //   6588: aload_0
    //   6589: aload_0
    //   6590: getfield B : I
    //   6593: aload_0
    //   6594: getfield bP : Ldm;
    //   6597: getfield a : I
    //   6600: isub
    //   6601: invokestatic c : (I)I
    //   6604: bipush #10
    //   6606: idiv
    //   6607: aload_0
    //   6608: getfield I : I
    //   6611: imul
    //   6612: putfield D : I
    //   6615: aload_0
    //   6616: bipush #-10
    //   6618: putfield E : I
    //   6621: goto -> 6745
    //   6624: aload_0
    //   6625: getfield bP : Ldm;
    //   6628: getfield c : I
    //   6631: iconst_4
    //   6632: if_icmpne -> 6718
    //   6635: aload_0
    //   6636: iconst_4
    //   6637: putfield H : I
    //   6640: aload_0
    //   6641: getfield B : I
    //   6644: aload_0
    //   6645: getfield bP : Ldm;
    //   6648: getfield a : I
    //   6651: isub
    //   6652: ifle -> 6663
    //   6655: aload_0
    //   6656: iconst_m1
    //   6657: putfield I : I
    //   6660: goto -> 6683
    //   6663: aload_0
    //   6664: getfield B : I
    //   6667: aload_0
    //   6668: getfield bP : Ldm;
    //   6671: getfield a : I
    //   6674: isub
    //   6675: ifge -> 6683
    //   6678: aload_0
    //   6679: iconst_1
    //   6680: putfield I : I
    //   6683: aload_0
    //   6684: aload_0
    //   6685: getfield B : I
    //   6688: aload_0
    //   6689: getfield bP : Ldm;
    //   6692: getfield a : I
    //   6695: isub
    //   6696: invokestatic c : (I)I
    //   6699: bipush #9
    //   6701: idiv
    //   6702: aload_0
    //   6703: getfield I : I
    //   6706: imul
    //   6707: putfield D : I
    //   6710: aload_0
    //   6711: iconst_0
    //   6712: putfield E : I
    //   6715: goto -> 6745
    //   6718: aload_0
    //   6719: aload_0
    //   6720: getfield bP : Ldm;
    //   6723: getfield a : I
    //   6726: putfield B : I
    //   6729: aload_0
    //   6730: aload_0
    //   6731: getfield bP : Ldm;
    //   6734: getfield b : I
    //   6737: putfield C : I
    //   6740: aload_0
    //   6741: aconst_null
    //   6742: putfield bP : Ldm;
    //   6745: aload_0
    //   6746: getfield H : I
    //   6749: tableswitch default -> 7179, 1 -> 6828, 2 -> 6835, 3 -> 6842, 4 -> 6849, 5 -> 6856, 6 -> 6945, 7 -> 7179, 8 -> 7179, 9 -> 6870, 10 -> 6877, 11 -> 7179, 12 -> 6884, 13 -> 6891, 14 -> 6894, 15 -> 7179, 16 -> 6863
    //   6828: aload_0
    //   6829: invokespecial am : ()V
    //   6832: goto -> 7179
    //   6835: aload_0
    //   6836: invokespecial ao : ()V
    //   6839: goto -> 7179
    //   6842: aload_0
    //   6843: invokespecial aq : ()V
    //   6846: goto -> 7179
    //   6849: aload_0
    //   6850: invokespecial as : ()V
    //   6853: goto -> 7179
    //   6856: aload_0
    //   6857: invokespecial ai : ()V
    //   6860: goto -> 7179
    //   6863: aload_0
    //   6864: invokespecial aj : ()V
    //   6867: goto -> 7179
    //   6870: aload_0
    //   6871: invokespecial al : ()V
    //   6874: goto -> 7179
    //   6877: aload_0
    //   6878: invokespecial at : ()V
    //   6881: goto -> 7179
    //   6884: aload_0
    //   6885: invokespecial ak : ()V
    //   6888: goto -> 7179
    //   6891: goto -> 7179
    //   6894: aload_0
    //   6895: dup
    //   6896: getfield F : I
    //   6899: iconst_1
    //   6900: iadd
    //   6901: putfield F : I
    //   6904: aload_0
    //   6905: getfield F : I
    //   6908: bipush #30
    //   6910: if_icmple -> 6918
    //   6913: aload_0
    //   6914: iconst_0
    //   6915: putfield F : I
    //   6918: aload_0
    //   6919: getfield F : I
    //   6922: bipush #15
    //   6924: irem
    //   6925: iconst_5
    //   6926: if_icmpge -> 6937
    //   6929: aload_0
    //   6930: iconst_0
    //   6931: putfield as : I
    //   6934: goto -> 7179
    //   6937: aload_0
    //   6938: iconst_1
    //   6939: putfield as : I
    //   6942: goto -> 7179
    //   6945: aload_0
    //   6946: getfield ek : B
    //   6949: ifgt -> 6960
    //   6952: aload_0
    //   6953: iconst_0
    //   6954: putfield as : I
    //   6957: goto -> 7039
    //   6960: aload_0
    //   6961: getfield eC : I
    //   6964: bipush #10
    //   6966: if_icmpne -> 6985
    //   6969: aload_0
    //   6970: dup
    //   6971: getfield B : I
    //   6974: aload_0
    //   6975: getfield D : I
    //   6978: iadd
    //   6979: putfield B : I
    //   6982: goto -> 7039
    //   6985: aload_0
    //   6986: getfield as : I
    //   6989: iconst_1
    //   6990: if_icmpgt -> 7039
    //   6993: aload_0
    //   6994: dup
    //   6995: getfield F : I
    //   6998: iconst_1
    //   6999: iadd
    //   7000: putfield F : I
    //   7003: aload_0
    //   7004: getfield F : I
    //   7007: bipush #6
    //   7009: if_icmple -> 7020
    //   7012: aload_0
    //   7013: iconst_0
    //   7014: putfield as : I
    //   7017: goto -> 7025
    //   7020: aload_0
    //   7021: iconst_1
    //   7022: putfield as : I
    //   7025: aload_0
    //   7026: getfield F : I
    //   7029: bipush #10
    //   7031: if_icmple -> 7039
    //   7034: aload_0
    //   7035: iconst_0
    //   7036: putfield F : I
    //   7039: aload_0
    //   7040: getfield as : I
    //   7043: bipush #7
    //   7045: if_icmpeq -> 7097
    //   7048: aload_0
    //   7049: getfield as : I
    //   7052: bipush #12
    //   7054: if_icmpeq -> 7097
    //   7057: aload_0
    //   7058: getfield B : I
    //   7061: aload_0
    //   7062: getfield C : I
    //   7065: iconst_1
    //   7066: iadd
    //   7067: invokestatic b : (II)I
    //   7070: iconst_2
    //   7071: iand
    //   7072: iconst_2
    //   7073: if_icmpeq -> 7097
    //   7076: aload_0
    //   7077: iconst_0
    //   7078: putfield D : I
    //   7081: aload_0
    //   7082: iconst_0
    //   7083: putfield E : I
    //   7086: aload_0
    //   7087: iconst_4
    //   7088: putfield H : I
    //   7091: aload_0
    //   7092: bipush #7
    //   7094: putfield as : I
    //   7097: aload_0
    //   7098: getfield aq : Z
    //   7101: ifne -> 7179
    //   7104: aload_0
    //   7105: dup
    //   7106: getfield G : I
    //   7109: iconst_1
    //   7110: iadd
    //   7111: putfield G : I
    //   7114: aload_0
    //   7115: getfield G : I
    //   7118: bipush #10
    //   7120: if_icmple -> 7160
    //   7123: aload_0
    //   7124: getfield B : I
    //   7127: aload_0
    //   7128: getfield C : I
    //   7131: iconst_1
    //   7132: iadd
    //   7133: invokestatic b : (II)I
    //   7136: iconst_2
    //   7137: iand
    //   7138: iconst_2
    //   7139: if_icmpeq -> 7155
    //   7142: aload_0
    //   7143: dup
    //   7144: getfield C : I
    //   7147: iconst_5
    //   7148: iadd
    //   7149: putfield C : I
    //   7152: goto -> 7160
    //   7155: aload_0
    //   7156: iconst_0
    //   7157: putfield as : I
    //   7160: aload_0
    //   7161: getfield G : I
    //   7164: bipush #50
    //   7166: if_icmple -> 7179
    //   7169: aload_0
    //   7170: iconst_0
    //   7171: putfield G : I
    //   7174: aload_0
    //   7175: aconst_null
    //   7176: putfield bP : Ldm;
    //   7179: aload_0
    //   7180: getfield ek : B
    //   7183: ifle -> 7203
    //   7186: aload_0
    //   7187: bipush #23
    //   7189: putfield as : I
    //   7192: aload_0
    //   7193: dup
    //   7194: getfield ek : B
    //   7197: iconst_1
    //   7198: isub
    //   7199: i2b
    //   7200: putfield ek : B
    //   7203: aload_0
    //   7204: getfield co : S
    //   7207: ifne -> 7217
    //   7210: aload_0
    //   7211: getfield cp : S
    //   7214: ifeq -> 7239
    //   7217: aload_0
    //   7218: aload_0
    //   7219: getfield co : S
    //   7222: aload_0
    //   7223: getfield cp : S
    //   7226: invokevirtual a : (SS)V
    //   7229: aload_0
    //   7230: iconst_0
    //   7231: putfield co : S
    //   7234: aload_0
    //   7235: iconst_0
    //   7236: putfield cp : S
    //   7239: aload_0
    //   7240: getfield aZ : [S
    //   7243: ifnull -> 7397
    //   7246: aload_0
    //   7247: getfield aZ : [S
    //   7250: iconst_0
    //   7251: saload
    //   7252: ifne -> 7276
    //   7255: aload_0
    //   7256: getfield aZ : [S
    //   7259: iconst_0
    //   7260: dup2
    //   7261: saload
    //   7262: iconst_1
    //   7263: iadd
    //   7264: i2s
    //   7265: sastore
    //   7266: bipush #60
    //   7268: aload_0
    //   7269: iconst_1
    //   7270: invokestatic a : (ILaf;I)V
    //   7273: goto -> 7397
    //   7276: aload_0
    //   7277: getfield aZ : [S
    //   7280: iconst_0
    //   7281: saload
    //   7282: bipush #10
    //   7284: if_icmpge -> 7301
    //   7287: aload_0
    //   7288: getfield aZ : [S
    //   7291: iconst_0
    //   7292: dup2
    //   7293: saload
    //   7294: iconst_1
    //   7295: iadd
    //   7296: i2s
    //   7297: sastore
    //   7298: goto -> 7397
    //   7301: aload_0
    //   7302: aload_0
    //   7303: getfield aZ : [S
    //   7306: iconst_1
    //   7307: saload
    //   7308: putfield B : I
    //   7311: aload_0
    //   7312: aload_0
    //   7313: getfield aZ : [S
    //   7316: iconst_2
    //   7317: saload
    //   7318: putfield C : I
    //   7321: aload_0
    //   7322: aconst_null
    //   7323: putfield aZ : [S
    //   7326: bipush #60
    //   7328: aload_0
    //   7329: iconst_1
    //   7330: invokestatic a : (ILaf;I)V
    //   7333: aload_0
    //   7334: getfield aq : Z
    //   7337: ifeq -> 7397
    //   7340: aload_0
    //   7341: getfield B : I
    //   7344: aload_0
    //   7345: getfield C : I
    //   7348: invokestatic b : (II)I
    //   7351: iconst_2
    //   7352: iand
    //   7353: iconst_2
    //   7354: if_icmpeq -> 7378
    //   7357: aload_0
    //   7358: iconst_4
    //   7359: putfield H : I
    //   7362: invokestatic e : ()Laf;
    //   7365: getstatic p.u : [Lci;
    //   7368: bipush #38
    //   7370: aaload
    //   7371: iconst_1
    //   7372: invokevirtual b : (Lci;I)V
    //   7375: goto -> 7397
    //   7378: invokestatic a : ()Lbt;
    //   7381: invokevirtual g : ()V
    //   7384: invokestatic e : ()Laf;
    //   7387: getstatic p.u : [Lci;
    //   7390: bipush #38
    //   7392: aaload
    //   7393: iconst_0
    //   7394: invokevirtual b : (Lci;I)V
    //   7397: aload_0
    //   7398: getfield H : I
    //   7401: bipush #10
    //   7403: if_icmpeq -> 7411
    //   7406: aload_0
    //   7407: iconst_0
    //   7408: putfield bS : I
    //   7411: aload_0
    //   7412: getfield bl : Z
    //   7415: ifeq -> 7719
    //   7418: aload_0
    //   7419: bipush #17
    //   7421: putfield as : I
    //   7424: getstatic main/a.w : I
    //   7427: iconst_4
    //   7428: irem
    //   7429: ifne -> 7449
    //   7432: iconst_1
    //   7433: aload_0
    //   7434: getfield B : I
    //   7437: aload_0
    //   7438: getfield C : I
    //   7441: getstatic main/a.ae : I
    //   7444: iadd
    //   7445: iconst_1
    //   7446: invokestatic a : (IIII)V
    //   7449: aload_0
    //   7450: getfield aq : Z
    //   7453: ifeq -> 7719
    //   7456: invokestatic currentTimeMillis : ()J
    //   7459: dup2
    //   7460: lstore_1
    //   7461: aload_0
    //   7462: getfield bo : J
    //   7465: lsub
    //   7466: ldc2_w 1000
    //   7469: lcmp
    //   7470: iflt -> 7719
    //   7473: new java/lang/StringBuffer
    //   7476: dup
    //   7477: ldc '%= '
    //   7479: invokespecial <init> : (Ljava/lang/String;)V
    //   7482: aload_0
    //   7483: getfield aC : Lbf;
    //   7486: getfield k : S
    //   7489: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   7492: invokevirtual toString : ()Ljava/lang/String;
    //   7495: invokestatic c : (Ljava/lang/String;)V
    //   7498: aload_0
    //   7499: lload_1
    //   7500: putfield bo : J
    //   7503: aload_0
    //   7504: dup
    //   7505: getfield U : J
    //   7508: aload_0
    //   7509: getfield V : J
    //   7512: aload_0
    //   7513: getfield aC : Lbf;
    //   7516: getfield k : S
    //   7519: i2l
    //   7520: lmul
    //   7521: ldc2_w 100
    //   7524: ldiv
    //   7525: ladd
    //   7526: putfield U : J
    //   7529: aload_0
    //   7530: dup
    //   7531: getfield T : J
    //   7534: aload_0
    //   7535: getfield W : J
    //   7538: aload_0
    //   7539: getfield aC : Lbf;
    //   7542: getfield k : S
    //   7545: i2l
    //   7546: lmul
    //   7547: ldc2_w 100
    //   7550: ldiv
    //   7551: ladd
    //   7552: putfield T : J
    //   7555: aload_0
    //   7556: getfield U : J
    //   7559: aload_0
    //   7560: getfield V : J
    //   7563: lcmp
    //   7564: ifge -> 7633
    //   7567: new java/lang/StringBuffer
    //   7570: dup
    //   7571: ldc '+'
    //   7573: invokespecial <init> : (Ljava/lang/String;)V
    //   7576: aload_0
    //   7577: getfield V : J
    //   7580: aload_0
    //   7581: getfield aC : Lbf;
    //   7584: getfield k : S
    //   7587: i2l
    //   7588: lmul
    //   7589: ldc2_w 100
    //   7592: ldiv
    //   7593: invokevirtual append : (J)Ljava/lang/StringBuffer;
    //   7596: ldc ' '
    //   7598: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   7601: getstatic aw.eW : Ljava/lang/String;
    //   7604: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   7607: invokevirtual toString : ()Ljava/lang/String;
    //   7610: aload_0
    //   7611: getfield B : I
    //   7614: aload_0
    //   7615: getfield C : I
    //   7618: aload_0
    //   7619: getfield al : I
    //   7622: isub
    //   7623: bipush #20
    //   7625: isub
    //   7626: iconst_0
    //   7627: iconst_m1
    //   7628: bipush #9
    //   7630: invokestatic a : (Ljava/lang/String;IIIII)V
    //   7633: aload_0
    //   7634: getfield T : J
    //   7637: aload_0
    //   7638: getfield W : J
    //   7641: lcmp
    //   7642: ifge -> 7712
    //   7645: new java/lang/StringBuffer
    //   7648: dup
    //   7649: ldc '+'
    //   7651: invokespecial <init> : (Ljava/lang/String;)V
    //   7654: aload_0
    //   7655: getfield W : J
    //   7658: aload_0
    //   7659: getfield aC : Lbf;
    //   7662: getfield k : S
    //   7665: i2l
    //   7666: lmul
    //   7667: ldc2_w 100
    //   7670: ldiv
    //   7671: invokevirtual append : (J)Ljava/lang/StringBuffer;
    //   7674: ldc ' '
    //   7676: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   7679: getstatic aw.eX : Ljava/lang/String;
    //   7682: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   7685: invokevirtual toString : ()Ljava/lang/String;
    //   7688: aload_0
    //   7689: getfield B : I
    //   7692: aload_0
    //   7693: getfield C : I
    //   7696: aload_0
    //   7697: getfield al : I
    //   7700: isub
    //   7701: bipush #20
    //   7703: isub
    //   7704: iconst_0
    //   7705: bipush #-2
    //   7707: bipush #10
    //   7709: invokestatic a : (Ljava/lang/String;IIIII)V
    //   7712: invokestatic a : ()Lbt;
    //   7715: iconst_2
    //   7716: invokevirtual c : (B)V
    //   7719: aload_0
    //   7720: getfield bq : Z
    //   7723: ifeq -> 7824
    //   7726: aload_0
    //   7727: getfield aq : Z
    //   7730: ifeq -> 7779
    //   7733: iconst_1
    //   7734: putstatic af.bH : Z
    //   7737: aload_0
    //   7738: iconst_3
    //   7739: putfield H : I
    //   7742: aload_0
    //   7743: bipush #-8
    //   7745: putfield E : I
    //   7748: aload_0
    //   7749: getfield C : I
    //   7752: getstatic bv.d : I
    //   7755: sipush #240
    //   7758: isub
    //   7759: if_icmpgt -> 7824
    //   7762: aload_0
    //   7763: iconst_0
    //   7764: putfield bq : Z
    //   7767: iconst_0
    //   7768: putstatic af.bH : Z
    //   7771: aload_0
    //   7772: iconst_4
    //   7773: putfield H : I
    //   7776: goto -> 7824
    //   7779: aload_0
    //   7780: iconst_3
    //   7781: putfield H : I
    //   7784: aload_0
    //   7785: bipush #-8
    //   7787: putfield E : I
    //   7790: aload_0
    //   7791: getfield C : I
    //   7794: getstatic bv.d : I
    //   7797: sipush #240
    //   7800: isub
    //   7801: if_icmpgt -> 7824
    //   7804: aload_0
    //   7805: iconst_0
    //   7806: putfield E : I
    //   7809: aload_0
    //   7810: iconst_0
    //   7811: putfield bq : Z
    //   7814: aload_0
    //   7815: iconst_0
    //   7816: putfield E : I
    //   7819: aload_0
    //   7820: iconst_1
    //   7821: putfield H : I
    //   7824: aload_0
    //   7825: invokespecial au : ()V
    //   7828: aload_0
    //   7829: invokespecial aC : ()V
    //   7832: aload_0
    //   7833: dup
    //   7834: astore_1
    //   7835: getfield bU : I
    //   7838: sipush #934
    //   7841: if_icmpne -> 7935
    //   7844: getstatic main/a.b : J
    //   7847: aload_1
    //   7848: getfield eT : J
    //   7851: lsub
    //   7852: lconst_0
    //   7853: lcmp
    //   7854: ifle -> 7930
    //   7857: aload_1
    //   7858: dup
    //   7859: getfield eS : I
    //   7862: iconst_1
    //   7863: iadd
    //   7864: putfield eS : I
    //   7867: aload_1
    //   7868: getfield eS : I
    //   7871: aload_1
    //   7872: getfield eW : [I
    //   7875: arraylength
    //   7876: iconst_1
    //   7877: isub
    //   7878: if_icmple -> 7935
    //   7881: aload_1
    //   7882: iconst_0
    //   7883: putfield eS : I
    //   7886: aload_1
    //   7887: getstatic main/a.b : J
    //   7890: sipush #2000
    //   7893: sipush #3500
    //   7896: invokestatic b : (II)I
    //   7899: i2l
    //   7900: ladd
    //   7901: putfield eT : J
    //   7904: aload_1
    //   7905: aload_1
    //   7906: getfield eV : [I
    //   7909: putfield eW : [I
    //   7912: iconst_2
    //   7913: invokestatic d : (I)I
    //   7916: ifne -> 7935
    //   7919: aload_1
    //   7920: aload_1
    //   7921: getfield eU : [I
    //   7924: putfield eW : [I
    //   7927: goto -> 7935
    //   7930: aload_1
    //   7931: iconst_0
    //   7932: putfield eS : I
    //   7935: aload_0
    //   7936: invokespecial aD : ()V
    //   7939: return
  }
  
  private void ae() {
    if (this.ei != null)
      for (byte b = 0; b < this.ei.length; b++) {
        if (this.ei[b] != null) {
          if ((this.ei[b]).b != null) {
            if (!(this.ei[b]).e) {
              (this.ei[b]).b.d();
              (this.ei[b]).b.Z = this;
              if (this.aq) {
                e();
                e();
                byte b1 = 11;
                Random random;
                (random = new Random()).nextInt(11);
              } 
              int i = (this.ei[b]).b.w >> 1;
              if ((this.ei[b]).b.u())
                i = (this.ei[b]).b.m() + 20; 
              p.a((this.ei[b]).b.m, (this.ei[b]).b.n - i, this.I);
              (this.ei[b]).e = true;
            } 
          } else if ((this.ei[b]).c != null && !(this.ei[b]).e) {
            if ((this.ei[b]).c.J >= 0)
              (this.ei[b]).c.K(); 
            p.a((this.ei[b]).c.B, (this.ei[b]).c.C - ((this.ei[b]).c.al >> 1), this.I);
            (this.ei[b]).e = true;
          } 
          (this.ei[b]).a++;
          if ((this.ei[b]).a >= (this.ei[b]).d.a.length)
            this.ei[b] = null; 
        } 
      }  
    if (this.bZ >= 0 && this.ca != null && a.w % 2 == 0) {
      this.bZ++;
      if (this.bZ >= this.ca.a.length) {
        this.bZ = -1;
        this.ca = null;
      } 
    } 
  }
  
  private void af() {
    if (this.ay != null) {
      de de1 = this.ay;
      this.ay = null;
      de1.a();
    } 
  }
  
  private void ag() {
    if (a.w % 20 == 0 && this.J >= 0) {
      this.i = true;
      byte b;
      for (b = 0; b < p.D.size(); b++) {
        af af1 = null;
        try {
          af1 = p.D.elementAt(b);
        } catch (Exception exception) {}
        if (af1 != null && !af1.equals(this) && ((af1.C == this.C && ds.g(af1.B - this.B) < 35) || (this.C - af1.C < 32 && this.C - af1.C > 0 && ds.g(af1.B - this.B) < 24)))
          this.i = false; 
      } 
      for (b = 0; b < p.G.size(); b++) {
        do do1 = null;
        try {
          do1 = p.G.elementAt(b);
        } catch (Exception exception) {}
        if (do1 != null && do1.C == this.C && ds.g(do1.B - this.B) < 24)
          this.i = false; 
      } 
    } 
  }
  
  private void ah() {
    if (this.H == 14 || this.H == 5)
      return; 
    if (this.cf != null && ((this.aU != null && c(this.aU) && this.aU.H == 14) || (this.aQ != null && this.aQ.p == 0))) {
      if (!this.aq) {
        if ((bv.b(this.B, this.C) & 0x2) == 2) {
          this.H = 1;
        } else {
          this.H = 6;
        } 
        this.G = 0;
      } 
      this.cb = 0;
      this.cf = null;
      this.cg = null;
      this.ef = this.eg = this.eh = null;
      this.dW = this.dX = this.dY = 0;
      this.aQ = null;
      this.aU = null;
      this.ei = null;
      this.bP = null;
      this.cc = null;
      if ((bv.b(this.B, this.C) & 0x2) != 2)
        this.bQ = 5; 
    } 
    if (this.cf != null && this.cc == null && D() != null && this.cb >= (D()).length) {
      if (!this.aq) {
        if ((bv.b(this.B, this.C) & 0x2) == 2) {
          this.H = 1;
        } else {
          this.H = 6;
        } 
        this.G = 0;
      } 
      this.cb = 0;
      this.cf = null;
      this.cg = null;
      this.ef = this.eg = this.eh = null;
      this.dW = this.dX = this.dY = 0;
      this.cc = null;
      if ((bv.b(this.B, this.C) & 0x2) != 2)
        this.bQ = 5; 
    } 
    f[] arrayOfF;
    if ((arrayOfF = D()) != null && this.cb >= 0 && this.cb <= arrayOfF.length - 1) {
      if ((arrayOfF[this.cb]).b != 0) {
        this.ef = p.y[(arrayOfF[this.cb]).b - 1];
        this.dW = this.dZ = this.ec = 0;
      } 
      if ((arrayOfF[this.cb]).e != 0) {
        this.eg = p.y[(arrayOfF[this.cb]).e - 1];
        this.dX = this.ea = this.ed = 0;
      } 
      if ((arrayOfF[this.cb]).h != 0) {
        this.eh = p.y[(arrayOfF[this.cb]).h - 1];
        this.dY = this.eb = this.ee = 0;
      } 
      f[] arrayOfF1 = arrayOfF;
      int i = this.cb;
      if (arrayOfF1 != null && arrayOfF1[i] != null && i >= 0 && i <= arrayOfF1.length - 1 && (arrayOfF1[i]).k != 0) {
        int j;
        if ((j = (arrayOfF1[i]).k) >= 100) {
          bq bq1;
          if ((bq1 = (bq)((this.aQ == null) ? this.aU : this.aQ)) != null) {
            int k = ds.g(bq1.l() - this.B);
            int m = ds.g(bq1.m() - this.C);
            if (k > m * 4) {
              k = 0;
            } else {
              if (bq1.m() < this.C) {
                k = -3;
              } else {
                k = 3;
              } 
              if (bq1 instanceof cc && ((cc)(bq1 = bq1)).b)
                k = -20; 
            } 
            this.cd = new bj(this, j - 100, this.cg, this.B + ((arrayOfF1[i]).l - 10) * this.I, this.C + (arrayOfF1[i]).m + k);
            if (this.aC != null)
              if (this.aC.a.a == 1) {
                bu.a();
              } else if (this.aC.a.a == 3) {
                bu.a();
              } else if (this.aC.a.a == 5) {
                bu.a();
              } else if (this.aC.a.a == 11) {
                bu.a();
              }  
          } else if (this.ci || this.ch) {
            C();
          } 
        } else {
          this.cc = new dq(this, p.v[j - 1]);
          this.cc.a = 10;
          this.cc.b = this.B + (arrayOfF1[i]).l;
          this.cc.c = this.C + (arrayOfF1[i]).m;
        } 
      } 
      if ((this.aQ != null || (!this.aq && this.aU != null) || (this.aq && this.aU != null && (c(this.aU) || y()) && this.cc == null && this.cd == null)) && this.cb == arrayOfF.length - 1)
        E(); 
      if (!this.aq) {
        af af1;
        aa aa1 = null;
        if (this.aQ != null) {
          aa1 = this.aQ;
        } else if (this.aU != null) {
          af1 = this.aU;
        } 
        if (af1 != null) {
          if (ds.g(af1.l() - this.B) < 10)
            if (af1.l() > this.B) {
              this.B -= 10;
            } else {
              this.B += 10;
            }  
          if (af1.l() > this.B) {
            this.I = 1;
            return;
          } 
          this.I = -1;
        } 
      } 
    } 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    bp.c();
    ds.c("REST POINT x= " + paramInt1 + " y= " + paramInt2);
    this.bP = null;
    int i;
    if ((i = this.C - paramInt2) == 0) {
      this.B = paramInt1;
      bG = false;
      bH = false;
      return;
    } 
    this.H = 16;
    this.d = paramInt1;
    this.G = paramInt2;
    this.F = 0;
    (e()).bD = paramInt1;
    (e()).bE = paramInt2;
  }
  
  private void ai() {
    this.bk = false;
    if (this.bl) {
      this.bl = false;
      bu.a();
      bt.a().c((byte)3);
    } 
    this.F++;
    this.B += (this.d - this.B) / 4;
    if (this.F > 7) {
      this.C += (this.G - this.C) / 4;
    } else {
      this.C += this.F - 10;
    } 
    if (ds.g(this.d - this.B) < 4 && ds.g(this.G - this.C) < 10) {
      this.B = this.d;
      this.C = this.G;
      this.H = 14;
      if (this.aq) {
        p.j().n();
        bt.a().g();
      } 
    } 
    this.as = 23;
  }
  
  private void aj() {
    bp.c();
    a.l();
    this.bP = null;
    this.F++;
    this.B += (this.d - this.B) / 4;
    if (this.F > 7) {
      this.C += (this.G - this.C) / 4;
    } else {
      this.C += this.F - 10;
    } 
    if (ds.g(this.d - this.B) < 4 && ds.g(this.G - this.C) < 10) {
      this.B = this.d;
      this.C = this.G;
      this.H = 1;
      this.G = 0;
      bG = false;
      bt.a().g();
    } 
    this.as = 23;
  }
  
  private void ak() {
    this.dP = 0;
    this.F++;
    if (this.I == 1) {
      if ((bv.b(this.B + this.am, this.C - this.f) & 0x4) == 4)
        this.D = 0; 
    } else if ((bv.b(this.B - this.am, this.C - this.f) & 0x8) == 8) {
      this.D = 0;
    } 
    if (this.C > this.al && bv.a(this.B, this.C - this.al + 24, 8192))
      if (!bv.a(this.B, this.C, 2)) {
        this.H = 4;
        this.F = 0;
        this.d = 0;
        this.E = 1;
      } else {
        this.C = bv.e(this.C);
      }  
    this.B += this.D;
    this.C += this.E;
    if (this.C < 0)
      this.C = this.E = 0; 
    if (this.E == 0) {
      if ((bv.b(this.B, this.C) & 0x2) != 2) {
        this.H = 4;
        this.D = (this.O >> 1) * this.I;
        this.F = this.d = 0;
      } 
    } else if (this.E < 0) {
      this.E++;
      if (this.E == 0)
        this.E = 1; 
    } else {
      if (this.E < 20 && this.F % 5 == 0)
        this.E++; 
      if (this.E > 3)
        this.E = 3; 
      if ((bv.b(this.B, this.C + 3) & 0x2) == 2 && this.C <= bv.f(this.C + 3)) {
        this.D = this.E = 0;
        this.C = bv.f(this.C + 3);
      } 
    } 
    if (this.D > 0) {
      this.D--;
      return;
    } 
    if (this.D < 0)
      this.D++; 
  }
  
  private void al() {
    this.bk = false;
    if (this.bl) {
      this.bl = false;
      bu.a();
      bt.a().c((byte)3);
    } 
    this.B += this.D * this.I;
    this.C += this.dF;
    this.dF++;
    if (this.F == 0) {
      this.as = 7;
    } else {
      this.as = 23;
    } 
    if (this.dF == -3) {
      this.as = 8;
    } else if (this.dF == -2) {
      this.as = 9;
    } else if (this.dF == -1) {
      this.as = 10;
    } else if (this.dF == 0) {
      this.as = 11;
    } 
    if (this.dF == 0) {
      this.H = 6;
      this.G = 0;
      ((dm)this.bF.firstElement()).c = 4;
      this.F = 0;
      this.E = 1;
    } 
  }
  
  public void k() {
    this.bR = true;
    ei.a(new ea(107, this.B, this.C + 25, 3, 15, 1));
  }
  
  public final void r() {
    this.bR = false;
    ei.a(new ea(107, this.B, this.C + 25, 3, 10, 1));
  }
  
  private void am() {
    this.ar = false;
    this.g = false;
    this.D = 0;
    this.E = 0;
    this.F++;
    if (this.F > 30)
      this.F = 0; 
    if (this.F % 15 < 5) {
      this.as = 0;
    } else {
      this.as = 1;
    } 
    aA();
    if (!this.aq) {
      this.G++;
      if (this.G > 50) {
        this.G = 0;
        this.bP = null;
      } 
    } 
    an();
    if (this.aq && p.D.size() != 0 && bv.l == 50) {
      af af1;
      if (!(af1 = p.D.elementAt(0)).dM) {
        if (af1.H != 2)
          af1.b(this.B - 45, this.C, 0); 
        System.currentTimeMillis();
        if (ds.g(this.B - 45 - af1.B) <= 10)
          af1.dM = true; 
      } else {
        if (af1.H != 2)
          af1.b(this.B + 45, this.C, 0); 
        System.currentTimeMillis();
        if (ds.g(this.B + 45 - af1.B) <= 10)
          af1.dM = false; 
      } 
      if (a.w % 100 == 0)
        af1.a("Cắc cùm cum"); 
    } 
  }
  
  private void an() {
    if (this.cF)
      return; 
    if (this.cL)
      return; 
    if (this.eH)
      return; 
    if (this.ev || this.ew)
      return; 
    if (a.a)
      return; 
    if (this.cE == 1)
      return; 
    if (this.aq) {
      if (!cX && this.cV >= 0)
        return; 
    } else if (this.cV >= 0) {
      return;
    } 
    this.dP++;
    if (this.Q < 14) {
      if (this.Q >= 9 && !a.a && (this.dP == 40 || this.dP == 50)) {
        a.a().a(-1, this.B - -8, this.C);
        a.a().a(1, this.B - 8, this.C);
        e(1);
      } 
      if (this.dP > 50 && this.Q >= 9) {
        if (this.K == 0)
          if (this.Q >= 13) {
            if (a.w % 25 == 0)
              at.a(114, this, 1); 
            if (a.w % 4 == 0)
              at.a(132, this, 1); 
          } else if (a.w % 25 == 0) {
            int i;
            at.a(i = 173 + this.Q - 10, this, 1);
          }  
        if (this.K == 1) {
          if (a.w % 4 == 0)
            at.a(132, this, 1); 
          if (this.Q >= 13 && a.w % 7 == 0)
            at.a(131, this, 1); 
        } 
        if (this.K == 2) {
          if (a.w % 7 == 0)
            at.a(131, this, 1); 
          if (this.Q >= 13 && a.w % 25 == 0)
            at.a(114, this, 1); 
        } 
      } 
    } 
  }
  
  private void ao() {
    if (this.B >= p.j && this.B <= p.j + a.A)
      if (this.cE == 0) {
        bu.a();
      } else {
        bu.a();
      }  
    this.dP = 0;
    this.bk = false;
    if (this.bl) {
      this.bl = false;
      bu.a();
      bt.a().c((byte)3);
    } 
    int i = 0;
    if (!this.aq && this.bP != null)
      i = c(this.B - this.bP.a); 
    this.F++;
    if (this.F >= 10) {
      this.F = 0;
      this.N = 0;
    } 
    this.as = (this.F >> 1) + 2;
    if ((bv.b(this.B, this.C - 1) & 0x40) == 64) {
      this.B += this.D >> 1;
    } else {
      this.B += this.D;
    } 
    if (this.I == 1) {
      if (bv.a(this.B + this.am, this.C - this.f, 4))
        if (this.aq) {
          this.D = 0;
          this.B = bv.f(this.B + this.am) - this.am;
        } else {
          ap();
        }  
    } else if (bv.a(this.B - this.am - 1, this.C - this.f, 8)) {
      if (this.aq) {
        this.D = 0;
        this.B = bv.f(this.B - this.am - 1) + bv.i + this.am;
      } else {
        ap();
      } 
    } 
    if (this.aq)
      if (this.D > 0) {
        this.D--;
      } else if (this.D < 0) {
        this.D++;
      } else {
        if (this.B - this.bD != 0 && this.aq)
          bt.a().g(); 
        this.H = 1;
        this.N = 0;
      }  
    if ((bv.b(this.B, this.C) & 0x2) != 2)
      if (this.aq) {
        if (this.B - this.bD != 0 || this.C - this.bE != 0)
          bt.a().g(); 
        this.as = 7;
        this.H = 4;
        this.bQ = 0;
        this.D = 3 * this.I;
        this.d = 0;
      } else {
        ap();
      }  
    int j;
    if (!this.aq && this.bP != null && (j = c(this.B - this.bP.a)) > i)
      ap(); 
    a.a().a(this.I, this.B - (this.I << 3), this.C);
    aA();
    e(2);
  }
  
  private void ap() {
    this.H = 6;
    this.G = 0;
    this.D = 0;
    this.E = 0;
    this.F = this.d = 0;
  }
  
  private static int c(int paramInt) {
    return (paramInt > 0) ? paramInt : -paramInt;
  }
  
  private void aq() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial aw : ()V
    //   4: aload_0
    //   5: iconst_3
    //   6: invokespecial e : (I)V
    //   9: aload_0
    //   10: iconst_0
    //   11: putfield dP : I
    //   14: aload_0
    //   15: iconst_0
    //   16: putfield bk : Z
    //   19: aload_0
    //   20: getfield bl : Z
    //   23: ifeq -> 42
    //   26: aload_0
    //   27: iconst_0
    //   28: putfield bl : Z
    //   31: invokestatic a : ()Lbu;
    //   34: pop
    //   35: invokestatic a : ()Lbt;
    //   38: iconst_3
    //   39: invokevirtual c : (B)V
    //   42: aload_0
    //   43: dup
    //   44: getfield B : I
    //   47: aload_0
    //   48: getfield D : I
    //   51: iadd
    //   52: putfield B : I
    //   55: aload_0
    //   56: dup
    //   57: getfield C : I
    //   60: aload_0
    //   61: getfield E : I
    //   64: iadd
    //   65: putfield C : I
    //   68: aload_0
    //   69: getfield C : I
    //   72: ifge -> 85
    //   75: aload_0
    //   76: iconst_0
    //   77: putfield C : I
    //   80: aload_0
    //   81: iconst_m1
    //   82: putfield E : I
    //   85: aload_0
    //   86: dup
    //   87: getfield E : I
    //   90: iconst_1
    //   91: iadd
    //   92: putfield E : I
    //   95: aload_0
    //   96: getfield E : I
    //   99: ifle -> 107
    //   102: aload_0
    //   103: iconst_0
    //   104: putfield E : I
    //   107: aload_0
    //   108: getfield aq : Z
    //   111: ifne -> 190
    //   114: aload_0
    //   115: getfield bP : Ldm;
    //   118: ifnull -> 190
    //   121: aload_0
    //   122: getfield bP : Ldm;
    //   125: getfield a : I
    //   128: aload_0
    //   129: getfield B : I
    //   132: isub
    //   133: dup
    //   134: istore_1
    //   135: ifle -> 161
    //   138: aload_0
    //   139: getfield D : I
    //   142: iload_1
    //   143: if_icmple -> 151
    //   146: aload_0
    //   147: iload_1
    //   148: putfield D : I
    //   151: aload_0
    //   152: getfield D : I
    //   155: ifge -> 190
    //   158: goto -> 185
    //   161: iload_1
    //   162: ifge -> 185
    //   165: aload_0
    //   166: getfield D : I
    //   169: iload_1
    //   170: if_icmpge -> 178
    //   173: aload_0
    //   174: iload_1
    //   175: putfield D : I
    //   178: aload_0
    //   179: getfield D : I
    //   182: ifle -> 190
    //   185: aload_0
    //   186: iload_1
    //   187: putfield D : I
    //   190: aload_0
    //   191: getfield I : I
    //   194: iconst_1
    //   195: if_icmpne -> 273
    //   198: aload_0
    //   199: getfield B : I
    //   202: aload_0
    //   203: getfield am : I
    //   206: iadd
    //   207: aload_0
    //   208: getfield C : I
    //   211: iconst_1
    //   212: isub
    //   213: invokestatic b : (II)I
    //   216: iconst_4
    //   217: iand
    //   218: iconst_4
    //   219: if_icmpne -> 350
    //   222: aload_0
    //   223: getfield B : I
    //   226: aload_0
    //   227: getfield B : I
    //   230: aload_0
    //   231: getfield am : I
    //   234: iadd
    //   235: invokestatic f : (I)I
    //   238: bipush #12
    //   240: iadd
    //   241: if_icmpgt -> 350
    //   244: aload_0
    //   245: aload_0
    //   246: getfield B : I
    //   249: aload_0
    //   250: getfield am : I
    //   253: iadd
    //   254: invokestatic f : (I)I
    //   257: aload_0
    //   258: getfield am : I
    //   261: isub
    //   262: putfield B : I
    //   265: aload_0
    //   266: iconst_0
    //   267: putfield D : I
    //   270: goto -> 350
    //   273: aload_0
    //   274: getfield B : I
    //   277: aload_0
    //   278: getfield am : I
    //   281: isub
    //   282: aload_0
    //   283: getfield C : I
    //   286: iconst_1
    //   287: isub
    //   288: invokestatic b : (II)I
    //   291: bipush #8
    //   293: iand
    //   294: bipush #8
    //   296: if_icmpne -> 350
    //   299: aload_0
    //   300: getfield B : I
    //   303: aload_0
    //   304: getfield B : I
    //   307: aload_0
    //   308: getfield am : I
    //   311: isub
    //   312: invokestatic f : (I)I
    //   315: bipush #12
    //   317: iadd
    //   318: if_icmplt -> 350
    //   321: aload_0
    //   322: aload_0
    //   323: getfield B : I
    //   326: bipush #24
    //   328: iadd
    //   329: aload_0
    //   330: getfield am : I
    //   333: isub
    //   334: invokestatic f : (I)I
    //   337: aload_0
    //   338: getfield am : I
    //   341: iadd
    //   342: putfield B : I
    //   345: aload_0
    //   346: iconst_0
    //   347: putfield D : I
    //   350: aload_0
    //   351: getfield E : I
    //   354: ifne -> 375
    //   357: aload_0
    //   358: getfield aq : Z
    //   361: ifeq -> 371
    //   364: aload_0
    //   365: invokespecial ar : ()V
    //   368: goto -> 375
    //   371: aload_0
    //   372: invokespecial ap : ()V
    //   375: aload_0
    //   376: getfield aq : Z
    //   379: ifeq -> 444
    //   382: getstatic af.bG : Z
    //   385: ifne -> 444
    //   388: aload_0
    //   389: invokespecial ac : ()Z
    //   392: ifeq -> 444
    //   395: invokestatic a : ()Lbt;
    //   398: invokevirtual g : ()V
    //   401: invokestatic b : ()Z
    //   404: ifeq -> 420
    //   407: iconst_1
    //   408: putstatic af.bG : Z
    //   411: invokestatic a : ()Lbt;
    //   414: invokevirtual q : ()V
    //   417: goto -> 426
    //   420: invokestatic a : ()Lbt;
    //   423: invokevirtual f : ()V
    //   426: iconst_1
    //   427: putstatic af.bH : Z
    //   430: iconst_1
    //   431: putstatic af.bG : Z
    //   434: invokestatic g : ()V
    //   437: invokestatic f : ()V
    //   440: invokestatic a : ()V
    //   443: return
    //   444: aload_0
    //   445: getfield H : I
    //   448: bipush #16
    //   450: if_icmpeq -> 539
    //   453: aload_0
    //   454: getfield B : I
    //   457: aload_0
    //   458: getfield C : I
    //   461: aload_0
    //   462: getfield al : I
    //   465: isub
    //   466: bipush #24
    //   468: iadd
    //   469: sipush #8192
    //   472: invokestatic a : (III)Z
    //   475: ifne -> 485
    //   478: aload_0
    //   479: getfield C : I
    //   482: ifge -> 539
    //   485: aload_0
    //   486: iconst_4
    //   487: putfield H : I
    //   490: aload_0
    //   491: iconst_0
    //   492: putfield F : I
    //   495: aload_0
    //   496: iconst_0
    //   497: putfield d : I
    //   500: aload_0
    //   501: iconst_1
    //   502: putfield E : I
    //   505: aload_0
    //   506: iconst_0
    //   507: putfield bQ : I
    //   510: aload_0
    //   511: getfield C : I
    //   514: ifge -> 522
    //   517: aload_0
    //   518: iconst_0
    //   519: putfield C : I
    //   522: aload_0
    //   523: aload_0
    //   524: getfield C : I
    //   527: bipush #25
    //   529: iadd
    //   530: invokestatic e : (I)I
    //   533: putfield C : I
    //   536: invokestatic g : ()V
    //   539: aload_0
    //   540: getfield G : I
    //   543: ifge -> 556
    //   546: aload_0
    //   547: dup
    //   548: getfield G : I
    //   551: iconst_1
    //   552: iadd
    //   553: putfield G : I
    //   556: aload_0
    //   557: bipush #7
    //   559: putfield as : I
    //   562: aload_0
    //   563: getfield aq : Z
    //   566: ifne -> 594
    //   569: aload_0
    //   570: getfield bP : Ldm;
    //   573: ifnull -> 594
    //   576: aload_0
    //   577: getfield C : I
    //   580: aload_0
    //   581: getfield bP : Ldm;
    //   584: getfield b : I
    //   587: if_icmpge -> 594
    //   590: aload_0
    //   591: invokespecial ap : ()V
    //   594: return
  }
  
  private void ar() {
    this.e = this.C;
    this.F = 0;
    this.d = 0;
    this.H = 10;
    this.D = this.I << 2;
    this.E = 0;
    this.C = bv.e(this.C) + 12;
    if (this.aq && (this.B - this.bD != 0 || this.C - this.bE != 0) && (ds.g((e()).B - (e()).bD) > 96 || ds.g((e()).C - (e()).bE) > 24))
      bt.a().g(); 
  }
  
  private void as() {
    // Byte code:
    //   0: aload_0
    //   1: getfield cJ : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aload_0
    //   9: iconst_0
    //   10: putfield dP : I
    //   13: aload_0
    //   14: getfield C : I
    //   17: iconst_4
    //   18: iadd
    //   19: getstatic bv.d : I
    //   22: if_icmplt -> 57
    //   25: aload_0
    //   26: iconst_1
    //   27: putfield H : I
    //   30: aload_0
    //   31: getfield aq : Z
    //   34: ifeq -> 41
    //   37: invokestatic a : ()Lbu;
    //   40: pop
    //   41: aload_0
    //   42: aload_0
    //   43: iconst_0
    //   44: dup_x1
    //   45: putfield E : I
    //   48: putfield D : I
    //   51: aload_0
    //   52: iconst_0
    //   53: putfield G : I
    //   56: return
    //   57: aload_0
    //   58: getfield C : I
    //   61: bipush #24
    //   63: irem
    //   64: ifne -> 221
    //   67: aload_0
    //   68: getfield B : I
    //   71: aload_0
    //   72: getfield C : I
    //   75: invokestatic b : (II)I
    //   78: iconst_2
    //   79: iand
    //   80: iconst_2
    //   81: if_icmpne -> 221
    //   84: aload_0
    //   85: iconst_0
    //   86: putfield bQ : I
    //   89: aload_0
    //   90: getfield aq : Z
    //   93: ifeq -> 169
    //   96: aload_0
    //   97: getfield C : I
    //   100: aload_0
    //   101: getfield bE : I
    //   104: isub
    //   105: ifgt -> 132
    //   108: aload_0
    //   109: getfield B : I
    //   112: aload_0
    //   113: getfield bD : I
    //   116: isub
    //   117: ifne -> 132
    //   120: aload_0
    //   121: getfield C : I
    //   124: aload_0
    //   125: getfield bE : I
    //   128: isub
    //   129: ifge -> 138
    //   132: invokestatic a : ()Lbt;
    //   135: invokevirtual g : ()V
    //   138: aload_0
    //   139: aload_0
    //   140: iconst_0
    //   141: dup_x1
    //   142: putfield E : I
    //   145: putfield D : I
    //   148: aload_0
    //   149: aload_0
    //   150: iconst_0
    //   151: dup_x1
    //   152: putfield d : I
    //   155: putfield F : I
    //   158: aload_0
    //   159: iconst_1
    //   160: putfield H : I
    //   163: aload_0
    //   164: iconst_0
    //   165: putfield G : I
    //   168: return
    //   169: aload_0
    //   170: invokespecial ap : ()V
    //   173: aload_0
    //   174: iconst_0
    //   175: putfield as : I
    //   178: invokestatic a : ()Lmain/a;
    //   181: iconst_m1
    //   182: aload_0
    //   183: getfield B : I
    //   186: bipush #-8
    //   188: isub
    //   189: aload_0
    //   190: getfield C : I
    //   193: invokevirtual a : (III)Z
    //   196: pop
    //   197: invokestatic a : ()Lmain/a;
    //   200: iconst_1
    //   201: aload_0
    //   202: getfield B : I
    //   205: bipush #8
    //   207: isub
    //   208: aload_0
    //   209: getfield C : I
    //   212: invokevirtual a : (III)Z
    //   215: pop
    //   216: aload_0
    //   217: iconst_1
    //   218: invokespecial e : (I)V
    //   221: aload_0
    //   222: getfield bQ : I
    //   225: ifle -> 271
    //   228: aload_0
    //   229: dup
    //   230: getfield bQ : I
    //   233: iconst_1
    //   234: isub
    //   235: putfield bQ : I
    //   238: aload_0
    //   239: getfield bQ : I
    //   242: bipush #10
    //   244: irem
    //   245: iconst_5
    //   246: if_icmple -> 260
    //   249: aload_0
    //   250: dup
    //   251: getfield C : I
    //   254: iconst_1
    //   255: iadd
    //   256: putfield C : I
    //   259: return
    //   260: aload_0
    //   261: dup
    //   262: getfield C : I
    //   265: iconst_1
    //   266: isub
    //   267: putfield C : I
    //   270: return
    //   271: aload_0
    //   272: getfield E : I
    //   275: bipush #-4
    //   277: if_icmpge -> 289
    //   280: aload_0
    //   281: bipush #7
    //   283: putfield as : I
    //   286: goto -> 295
    //   289: aload_0
    //   290: bipush #12
    //   292: putfield as : I
    //   295: aload_0
    //   296: dup
    //   297: getfield B : I
    //   300: aload_0
    //   301: getfield D : I
    //   304: iadd
    //   305: putfield B : I
    //   308: aload_0
    //   309: getfield aq : Z
    //   312: ifne -> 391
    //   315: aload_0
    //   316: getfield bP : Ldm;
    //   319: ifnull -> 391
    //   322: aload_0
    //   323: getfield bP : Ldm;
    //   326: getfield a : I
    //   329: aload_0
    //   330: getfield B : I
    //   333: isub
    //   334: dup
    //   335: istore_1
    //   336: ifle -> 362
    //   339: aload_0
    //   340: getfield D : I
    //   343: iload_1
    //   344: if_icmple -> 352
    //   347: aload_0
    //   348: iload_1
    //   349: putfield D : I
    //   352: aload_0
    //   353: getfield D : I
    //   356: ifge -> 391
    //   359: goto -> 386
    //   362: iload_1
    //   363: ifge -> 386
    //   366: aload_0
    //   367: getfield D : I
    //   370: iload_1
    //   371: if_icmpge -> 379
    //   374: aload_0
    //   375: iload_1
    //   376: putfield D : I
    //   379: aload_0
    //   380: getfield D : I
    //   383: ifle -> 391
    //   386: aload_0
    //   387: iload_1
    //   388: putfield D : I
    //   391: aload_0
    //   392: dup
    //   393: getfield E : I
    //   396: iconst_1
    //   397: iadd
    //   398: putfield E : I
    //   401: aload_0
    //   402: getfield E : I
    //   405: bipush #8
    //   407: if_icmple -> 416
    //   410: aload_0
    //   411: bipush #8
    //   413: putfield E : I
    //   416: aload_0
    //   417: getfield cg : Lci;
    //   420: ifnonnull -> 436
    //   423: aload_0
    //   424: dup
    //   425: getfield C : I
    //   428: aload_0
    //   429: getfield E : I
    //   432: iadd
    //   433: putfield C : I
    //   436: aload_0
    //   437: getfield I : I
    //   440: iconst_1
    //   441: if_icmpne -> 519
    //   444: aload_0
    //   445: getfield B : I
    //   448: aload_0
    //   449: getfield am : I
    //   452: iadd
    //   453: aload_0
    //   454: getfield C : I
    //   457: iconst_1
    //   458: isub
    //   459: invokestatic b : (II)I
    //   462: iconst_4
    //   463: iand
    //   464: iconst_4
    //   465: if_icmpne -> 596
    //   468: aload_0
    //   469: getfield B : I
    //   472: aload_0
    //   473: getfield B : I
    //   476: aload_0
    //   477: getfield am : I
    //   480: iadd
    //   481: invokestatic f : (I)I
    //   484: bipush #12
    //   486: iadd
    //   487: if_icmpgt -> 596
    //   490: aload_0
    //   491: aload_0
    //   492: getfield B : I
    //   495: aload_0
    //   496: getfield am : I
    //   499: iadd
    //   500: invokestatic f : (I)I
    //   503: aload_0
    //   504: getfield am : I
    //   507: isub
    //   508: putfield B : I
    //   511: aload_0
    //   512: iconst_0
    //   513: putfield D : I
    //   516: goto -> 596
    //   519: aload_0
    //   520: getfield B : I
    //   523: aload_0
    //   524: getfield am : I
    //   527: isub
    //   528: aload_0
    //   529: getfield C : I
    //   532: iconst_1
    //   533: isub
    //   534: invokestatic b : (II)I
    //   537: bipush #8
    //   539: iand
    //   540: bipush #8
    //   542: if_icmpne -> 596
    //   545: aload_0
    //   546: getfield B : I
    //   549: aload_0
    //   550: getfield B : I
    //   553: aload_0
    //   554: getfield am : I
    //   557: isub
    //   558: invokestatic f : (I)I
    //   561: bipush #12
    //   563: iadd
    //   564: if_icmplt -> 596
    //   567: aload_0
    //   568: aload_0
    //   569: getfield B : I
    //   572: bipush #24
    //   574: iadd
    //   575: aload_0
    //   576: getfield am : I
    //   579: isub
    //   580: invokestatic f : (I)I
    //   583: aload_0
    //   584: getfield am : I
    //   587: iadd
    //   588: putfield B : I
    //   591: aload_0
    //   592: iconst_0
    //   593: putfield D : I
    //   596: aload_0
    //   597: getfield E : I
    //   600: iconst_3
    //   601: if_icmple -> 890
    //   604: aload_0
    //   605: getfield e : I
    //   608: ifeq -> 627
    //   611: aload_0
    //   612: getfield e : I
    //   615: aload_0
    //   616: getfield C : I
    //   619: iconst_3
    //   620: iadd
    //   621: invokestatic e : (I)I
    //   624: if_icmpgt -> 890
    //   627: aload_0
    //   628: getfield B : I
    //   631: aload_0
    //   632: getfield C : I
    //   635: iconst_3
    //   636: iadd
    //   637: invokestatic b : (II)I
    //   640: iconst_2
    //   641: iand
    //   642: iconst_2
    //   643: if_icmpne -> 890
    //   646: aload_0
    //   647: getfield aq : Z
    //   650: ifeq -> 819
    //   653: aload_0
    //   654: iconst_0
    //   655: putfield e : I
    //   658: aload_0
    //   659: aload_0
    //   660: iconst_0
    //   661: dup_x1
    //   662: putfield E : I
    //   665: putfield D : I
    //   668: aload_0
    //   669: aload_0
    //   670: iconst_0
    //   671: dup_x1
    //   672: putfield d : I
    //   675: putfield F : I
    //   678: aload_0
    //   679: aload_0
    //   680: getfield C : I
    //   683: iconst_3
    //   684: iadd
    //   685: invokestatic f : (I)I
    //   688: putfield C : I
    //   691: aload_0
    //   692: iconst_1
    //   693: putfield H : I
    //   696: aload_0
    //   697: getfield aq : Z
    //   700: ifeq -> 707
    //   703: invokestatic a : ()Lbu;
    //   706: pop
    //   707: aload_0
    //   708: iconst_0
    //   709: putfield G : I
    //   712: invokestatic a : ()Lmain/a;
    //   715: iconst_m1
    //   716: aload_0
    //   717: getfield B : I
    //   720: bipush #-8
    //   722: isub
    //   723: aload_0
    //   724: getfield C : I
    //   727: invokevirtual a : (III)Z
    //   730: pop
    //   731: invokestatic a : ()Lmain/a;
    //   734: iconst_1
    //   735: aload_0
    //   736: getfield B : I
    //   739: bipush #8
    //   741: isub
    //   742: aload_0
    //   743: getfield C : I
    //   746: invokevirtual a : (III)Z
    //   749: pop
    //   750: aload_0
    //   751: iconst_1
    //   752: invokespecial e : (I)V
    //   755: aload_0
    //   756: getfield C : I
    //   759: aload_0
    //   760: getfield bE : I
    //   763: isub
    //   764: ifle -> 781
    //   767: aload_0
    //   768: getfield aq : Z
    //   771: ifeq -> 889
    //   774: invokestatic a : ()Lbt;
    //   777: invokevirtual g : ()V
    //   780: return
    //   781: aload_0
    //   782: getfield B : I
    //   785: aload_0
    //   786: getfield bD : I
    //   789: isub
    //   790: ifne -> 805
    //   793: aload_0
    //   794: getfield C : I
    //   797: aload_0
    //   798: getfield bE : I
    //   801: isub
    //   802: ifge -> 889
    //   805: aload_0
    //   806: getfield aq : Z
    //   809: ifeq -> 889
    //   812: invokestatic a : ()Lbt;
    //   815: invokevirtual g : ()V
    //   818: return
    //   819: aload_0
    //   820: invokespecial ap : ()V
    //   823: aload_0
    //   824: aload_0
    //   825: getfield C : I
    //   828: iconst_3
    //   829: iadd
    //   830: invokestatic f : (I)I
    //   833: putfield C : I
    //   836: aload_0
    //   837: iconst_0
    //   838: putfield as : I
    //   841: invokestatic a : ()Lmain/a;
    //   844: iconst_m1
    //   845: aload_0
    //   846: getfield B : I
    //   849: bipush #-8
    //   851: isub
    //   852: aload_0
    //   853: getfield C : I
    //   856: invokevirtual a : (III)Z
    //   859: pop
    //   860: invokestatic a : ()Lmain/a;
    //   863: iconst_1
    //   864: aload_0
    //   865: getfield B : I
    //   868: bipush #8
    //   870: isub
    //   871: aload_0
    //   872: getfield C : I
    //   875: invokevirtual a : (III)Z
    //   878: pop
    //   879: aload_0
    //   880: iconst_1
    //   881: invokespecial e : (I)V
    //   884: aload_0
    //   885: aconst_null
    //   886: putfield bP : Ldm;
    //   889: return
    //   890: aload_0
    //   891: bipush #12
    //   893: putfield as : I
    //   896: aload_0
    //   897: getfield aq : Z
    //   900: ifne -> 970
    //   903: aload_0
    //   904: getfield B : I
    //   907: aload_0
    //   908: getfield C : I
    //   911: iconst_1
    //   912: iadd
    //   913: invokestatic b : (II)I
    //   916: iconst_2
    //   917: iand
    //   918: iconst_2
    //   919: if_icmpne -> 927
    //   922: aload_0
    //   923: iconst_0
    //   924: putfield as : I
    //   927: aload_0
    //   928: getfield bP : Ldm;
    //   931: ifnull -> 970
    //   934: aload_0
    //   935: getfield C : I
    //   938: aload_0
    //   939: getfield bP : Ldm;
    //   942: getfield b : I
    //   945: if_icmple -> 970
    //   948: aload_0
    //   949: invokespecial ap : ()V
    //   952: aload_0
    //   953: aload_0
    //   954: getfield C : I
    //   957: iconst_3
    //   958: iadd
    //   959: invokestatic f : (I)I
    //   962: putfield C : I
    //   965: aload_0
    //   966: aconst_null
    //   967: putfield bP : Ldm;
    //   970: return
  }
  
  private void at() {
    // Byte code:
    //   0: aload_0
    //   1: getfield cE : B
    //   4: iconst_1
    //   5: if_icmpne -> 19
    //   8: aload_0
    //   9: getfield aq : Z
    //   12: ifne -> 19
    //   15: iconst_2
    //   16: goto -> 20
    //   19: iconst_1
    //   20: istore_1
    //   21: aload_0
    //   22: invokespecial aw : ()V
    //   25: aload_0
    //   26: getfield H : I
    //   29: bipush #16
    //   31: if_icmpeq -> 113
    //   34: aload_0
    //   35: getfield B : I
    //   38: aload_0
    //   39: getfield C : I
    //   42: aload_0
    //   43: getfield al : I
    //   46: isub
    //   47: bipush #24
    //   49: iadd
    //   50: sipush #8192
    //   53: invokestatic a : (III)Z
    //   56: ifne -> 66
    //   59: aload_0
    //   60: getfield C : I
    //   63: ifge -> 113
    //   66: aload_0
    //   67: getfield C : I
    //   70: aload_0
    //   71: getfield al : I
    //   74: isub
    //   75: ifge -> 86
    //   78: aload_0
    //   79: aload_0
    //   80: getfield al : I
    //   83: putfield C : I
    //   86: aload_0
    //   87: bipush #7
    //   89: putfield as : I
    //   92: aload_0
    //   93: iconst_4
    //   94: putfield H : I
    //   97: aload_0
    //   98: iconst_0
    //   99: putfield D : I
    //   102: aload_0
    //   103: iconst_0
    //   104: putfield d : I
    //   107: aload_0
    //   108: aconst_null
    //   109: putfield bP : Ldm;
    //   112: return
    //   113: aload_0
    //   114: getfield C : I
    //   117: istore_2
    //   118: aload_0
    //   119: getfield bU : I
    //   122: istore_3
    //   123: getstatic af.da : [S
    //   126: arraylength
    //   127: ifle -> 162
    //   130: iconst_0
    //   131: istore #4
    //   133: goto -> 153
    //   136: getstatic af.da : [S
    //   139: iload #4
    //   141: saload
    //   142: iload_3
    //   143: if_icmpne -> 150
    //   146: iconst_1
    //   147: goto -> 163
    //   150: iinc #4, 1
    //   153: iload #4
    //   155: getstatic af.da : [S
    //   158: arraylength
    //   159: if_icmplt -> 136
    //   162: iconst_0
    //   163: ifeq -> 210
    //   166: getstatic main/a.w : I
    //   169: iconst_3
    //   170: irem
    //   171: ifne -> 184
    //   174: aload_0
    //   175: dup
    //   176: getfield F : I
    //   179: iconst_1
    //   180: iadd
    //   181: putfield F : I
    //   184: aload_0
    //   185: getfield F : I
    //   188: iconst_4
    //   189: if_icmple -> 197
    //   192: aload_0
    //   193: iconst_0
    //   194: putfield F : I
    //   197: aload_0
    //   198: aload_0
    //   199: getfield F : I
    //   202: iconst_2
    //   203: iadd
    //   204: putfield as : I
    //   207: goto -> 496
    //   210: aload_0
    //   211: dup
    //   212: getfield F : I
    //   215: iconst_1
    //   216: iadd
    //   217: putfield F : I
    //   220: aload_0
    //   221: getfield F : I
    //   224: bipush #9
    //   226: if_icmplt -> 256
    //   229: aload_0
    //   230: iconst_0
    //   231: putfield F : I
    //   234: aload_0
    //   235: getfield aq : Z
    //   238: ifne -> 251
    //   241: aload_0
    //   242: aload_0
    //   243: iconst_0
    //   244: dup_x1
    //   245: putfield E : I
    //   248: putfield D : I
    //   251: aload_0
    //   252: iconst_0
    //   253: putfield N : I
    //   256: aload_0
    //   257: bipush #8
    //   259: putfield as : I
    //   262: aload_0
    //   263: getfield D : I
    //   266: invokestatic g : (I)I
    //   269: iconst_4
    //   270: if_icmpgt -> 408
    //   273: aload_0
    //   274: getfield aq : Z
    //   277: ifeq -> 408
    //   280: aload_0
    //   281: getfield bP : Ldm;
    //   284: ifnull -> 375
    //   287: aload_0
    //   288: getfield B : I
    //   291: aload_0
    //   292: getfield bP : Ldm;
    //   295: getfield a : I
    //   298: isub
    //   299: invokestatic c : (I)I
    //   302: istore_3
    //   303: aload_0
    //   304: getfield C : I
    //   307: aload_0
    //   308: getfield bP : Ldm;
    //   311: getfield b : I
    //   314: isub
    //   315: invokestatic c : (I)I
    //   318: istore #4
    //   320: iload_3
    //   321: iload #4
    //   323: bipush #10
    //   325: imul
    //   326: if_icmple -> 338
    //   329: aload_0
    //   330: bipush #8
    //   332: putfield as : I
    //   335: goto -> 408
    //   338: iload_3
    //   339: iload #4
    //   341: if_icmple -> 366
    //   344: iload_3
    //   345: bipush #48
    //   347: if_icmple -> 366
    //   350: iload #4
    //   352: bipush #32
    //   354: if_icmple -> 366
    //   357: aload_0
    //   358: bipush #8
    //   360: putfield as : I
    //   363: goto -> 408
    //   366: aload_0
    //   367: bipush #7
    //   369: putfield as : I
    //   372: goto -> 408
    //   375: aload_0
    //   376: getfield E : I
    //   379: ifge -> 387
    //   382: aload_0
    //   383: iconst_0
    //   384: putfield E : I
    //   387: aload_0
    //   388: getfield E : I
    //   391: bipush #16
    //   393: if_icmple -> 402
    //   396: aload_0
    //   397: bipush #16
    //   399: putfield E : I
    //   402: aload_0
    //   403: bipush #7
    //   405: putfield as : I
    //   408: aload_0
    //   409: getfield aq : Z
    //   412: ifne -> 496
    //   415: aload_0
    //   416: getfield D : I
    //   419: invokestatic c : (I)I
    //   422: iconst_2
    //   423: if_icmpge -> 438
    //   426: aload_0
    //   427: aload_0
    //   428: getfield I : I
    //   431: iconst_1
    //   432: ishl
    //   433: iload_1
    //   434: imul
    //   435: putfield D : I
    //   438: aload_0
    //   439: getfield E : I
    //   442: ifeq -> 451
    //   445: aload_0
    //   446: bipush #7
    //   448: putfield as : I
    //   451: aload_0
    //   452: getfield D : I
    //   455: invokestatic c : (I)I
    //   458: iconst_2
    //   459: if_icmpgt -> 496
    //   462: aload_0
    //   463: dup
    //   464: getfield d : I
    //   467: iconst_1
    //   468: iadd
    //   469: putfield d : I
    //   472: aload_0
    //   473: getfield d : I
    //   476: bipush #32
    //   478: if_icmple -> 496
    //   481: aload_0
    //   482: iconst_4
    //   483: putfield H : I
    //   486: aload_0
    //   487: iconst_0
    //   488: putfield D : I
    //   491: aload_0
    //   492: iconst_0
    //   493: putfield E : I
    //   496: aload_0
    //   497: getfield I : I
    //   500: iconst_1
    //   501: if_icmpne -> 567
    //   504: aload_0
    //   505: getfield B : I
    //   508: aload_0
    //   509: getfield am : I
    //   512: iadd
    //   513: aload_0
    //   514: getfield C : I
    //   517: iconst_1
    //   518: isub
    //   519: iconst_4
    //   520: invokestatic a : (III)Z
    //   523: ifeq -> 636
    //   526: aload_0
    //   527: iconst_0
    //   528: putfield D : I
    //   531: aload_0
    //   532: aload_0
    //   533: getfield B : I
    //   536: aload_0
    //   537: getfield am : I
    //   540: iadd
    //   541: invokestatic f : (I)I
    //   544: aload_0
    //   545: getfield am : I
    //   548: isub
    //   549: putfield B : I
    //   552: aload_0
    //   553: getfield E : I
    //   556: ifne -> 636
    //   559: aload_0
    //   560: aconst_null
    //   561: putfield bP : Ldm;
    //   564: goto -> 636
    //   567: aload_0
    //   568: getfield B : I
    //   571: aload_0
    //   572: getfield am : I
    //   575: isub
    //   576: iconst_1
    //   577: isub
    //   578: aload_0
    //   579: getfield C : I
    //   582: iconst_1
    //   583: isub
    //   584: bipush #8
    //   586: invokestatic a : (III)Z
    //   589: ifeq -> 636
    //   592: aload_0
    //   593: iconst_0
    //   594: putfield D : I
    //   597: aload_0
    //   598: aload_0
    //   599: getfield B : I
    //   602: aload_0
    //   603: getfield am : I
    //   606: isub
    //   607: iconst_1
    //   608: isub
    //   609: invokestatic f : (I)I
    //   612: getstatic bv.i : B
    //   615: iadd
    //   616: aload_0
    //   617: getfield am : I
    //   620: iadd
    //   621: putfield B : I
    //   624: aload_0
    //   625: getfield E : I
    //   628: ifne -> 636
    //   631: aload_0
    //   632: aconst_null
    //   633: putfield bP : Ldm;
    //   636: aload_0
    //   637: dup
    //   638: getfield B : I
    //   641: aload_0
    //   642: getfield D : I
    //   645: iload_1
    //   646: imul
    //   647: iadd
    //   648: putfield B : I
    //   651: aload_0
    //   652: dup
    //   653: getfield C : I
    //   656: aload_0
    //   657: getfield E : I
    //   660: iload_1
    //   661: imul
    //   662: iadd
    //   663: putfield C : I
    //   666: aload_0
    //   667: getfield dB : Z
    //   670: ifne -> 829
    //   673: iload_2
    //   674: aload_0
    //   675: getfield C : I
    //   678: isub
    //   679: dup
    //   680: istore_3
    //   681: ifne -> 829
    //   684: aload_0
    //   685: dup
    //   686: getfield dP : I
    //   689: iconst_1
    //   690: iadd
    //   691: putfield dP : I
    //   694: aload_0
    //   695: dup
    //   696: getfield dO : I
    //   699: iconst_1
    //   700: iadd
    //   701: putfield dO : I
    //   704: aload_0
    //   705: dup
    //   706: getfield bS : I
    //   709: aload_0
    //   710: getfield dN : Z
    //   713: ifne -> 720
    //   716: iconst_1
    //   717: goto -> 721
    //   720: iconst_m1
    //   721: iadd
    //   722: putfield bS : I
    //   725: aload_0
    //   726: getfield dO : I
    //   729: bipush #10
    //   731: if_icmpne -> 755
    //   734: aload_0
    //   735: iconst_0
    //   736: putfield dO : I
    //   739: aload_0
    //   740: aload_0
    //   741: getfield dN : Z
    //   744: ifeq -> 751
    //   747: iconst_0
    //   748: goto -> 752
    //   751: iconst_1
    //   752: putfield dN : Z
    //   755: aload_0
    //   756: getfield dP : I
    //   759: bipush #20
    //   761: if_icmple -> 829
    //   764: aload_0
    //   765: bipush #10
    //   767: putfield bQ : I
    //   770: getstatic main/a.w : I
    //   773: iconst_3
    //   774: irem
    //   775: ifne -> 829
    //   778: bipush #111
    //   780: aload_0
    //   781: getfield B : I
    //   784: aload_0
    //   785: getfield I : I
    //   788: iconst_1
    //   789: if_icmpne -> 797
    //   792: bipush #-17
    //   794: goto -> 799
    //   797: bipush #27
    //   799: iadd
    //   800: aload_0
    //   801: getfield C : I
    //   804: aload_0
    //   805: getfield bS : I
    //   808: iadd
    //   809: bipush #13
    //   811: iadd
    //   812: iconst_1
    //   813: aload_0
    //   814: getfield I : I
    //   817: iconst_1
    //   818: if_icmpeq -> 825
    //   821: iconst_2
    //   822: goto -> 826
    //   825: iconst_0
    //   826: invokestatic a : (IIIII)V
    //   829: aload_0
    //   830: getfield aq : Z
    //   833: ifeq -> 1025
    //   836: aload_0
    //   837: getfield D : I
    //   840: ifle -> 856
    //   843: aload_0
    //   844: dup
    //   845: getfield D : I
    //   848: iconst_1
    //   849: isub
    //   850: putfield D : I
    //   853: goto -> 898
    //   856: aload_0
    //   857: getfield D : I
    //   860: ifge -> 876
    //   863: aload_0
    //   864: dup
    //   865: getfield D : I
    //   868: iconst_1
    //   869: iadd
    //   870: putfield D : I
    //   873: goto -> 898
    //   876: aload_0
    //   877: getfield E : I
    //   880: ifne -> 898
    //   883: aload_0
    //   884: iconst_4
    //   885: putfield H : I
    //   888: aload_0
    //   889: invokespecial ax : ()V
    //   892: invokestatic a : ()Lbt;
    //   895: invokevirtual g : ()V
    //   898: aload_0
    //   899: getfield B : I
    //   902: aload_0
    //   903: getfield C : I
    //   906: bipush #20
    //   908: iadd
    //   909: invokestatic b : (II)I
    //   912: iconst_2
    //   913: iand
    //   914: iconst_2
    //   915: if_icmpeq -> 938
    //   918: aload_0
    //   919: getfield B : I
    //   922: aload_0
    //   923: getfield C : I
    //   926: bipush #40
    //   928: iadd
    //   929: invokestatic b : (II)I
    //   932: iconst_2
    //   933: iand
    //   934: iconst_2
    //   935: if_icmpne -> 985
    //   938: aload_0
    //   939: getfield E : I
    //   942: ifne -> 950
    //   945: aload_0
    //   946: iconst_0
    //   947: putfield bQ : I
    //   950: aload_0
    //   951: iconst_0
    //   952: putfield e : I
    //   955: aload_0
    //   956: aload_0
    //   957: iconst_0
    //   958: dup_x1
    //   959: putfield E : I
    //   962: putfield D : I
    //   965: aload_0
    //   966: aload_0
    //   967: iconst_0
    //   968: dup_x1
    //   969: putfield d : I
    //   972: putfield F : I
    //   975: aload_0
    //   976: iconst_4
    //   977: putfield H : I
    //   980: aload_0
    //   981: iconst_3
    //   982: invokespecial e : (I)V
    //   985: aload_0
    //   986: getfield B : I
    //   989: aload_0
    //   990: getfield bD : I
    //   993: isub
    //   994: invokestatic c : (I)I
    //   997: bipush #96
    //   999: if_icmpgt -> 1019
    //   1002: aload_0
    //   1003: getfield C : I
    //   1006: aload_0
    //   1007: getfield bE : I
    //   1010: isub
    //   1011: invokestatic c : (I)I
    //   1014: bipush #24
    //   1016: if_icmple -> 1025
    //   1019: invokestatic a : ()Lbt;
    //   1022: invokevirtual g : ()V
    //   1025: return
  }
  
  private void au() {
    this.dp++;
    if (this.dp > this.do.length - 1)
      this.dp = 0; 
    this.dq++;
    if (this.dq > 1000)
      this.dq = 0; 
    if (this.dA && !this.dB) {
      this.du = this.C;
      if (this.dr == 0) {
        if (this.dt - this.B >= this.dz) {
          this.dt -= this.dz;
          return;
        } 
        this.dt = this.B;
        this.dB = true;
        this.dC = false;
        return;
      } 
      if (this.dr == 2) {
        if (this.B - this.dt >= this.dz) {
          this.dt += this.dz;
          return;
        } 
        this.dt = this.B;
        this.dB = true;
        this.dC = false;
        return;
      } 
    } else {
      if (this.dB) {
        af af1;
        if ((this.H == 14 || this.cm - this.C < 24) && (af1 = this).cm - af1.C < 24 && !af1.dC) {
          af1.dA = false;
          af1.dB = false;
          af1.dC = true;
          af1.dy = 0;
        } 
        if (this.F % 15 < 5) {
          this.as = 0;
        } else {
          this.as = 1;
        } 
        this.dr = this.I;
        an();
        if (this.dr < 0) {
          this.dr = 0;
          this.dv = -19;
        } else if (this.dr == 1) {
          this.dr = 2;
          this.dv = -31;
          if (this.bw)
            this.dv = -38; 
        } 
        if (D() != null) {
          this.dw = -15;
        } else {
          this.dw = -17;
        } 
        this.du = this.C;
        this.dt = this.B;
        return;
      } 
      if (this.dC) {
        if (this.dr == 0) {
          if (this.dt > p.j - 100) {
            this.dt -= 20;
            return;
          } 
          this.dA = false;
          this.dB = false;
          this.dC = false;
          return;
        } 
        if (this.dr == 2) {
          if (this.dt < p.j + a.A + 50) {
            this.dt += 20;
            return;
          } 
          this.dA = false;
          this.dB = false;
          this.dC = false;
          return;
        } 
      } else if (!this.dA || !this.dB || !this.dC) {
        this.dt = p.j - 100;
        this.du = p.k - 100;
      } 
    } 
  }
  
  private static void av() {
    if ((aa.c[50]).f == null) {
      (aa.c[50]).f = new ck();
      String str = "/Mob/50";
      InputStream inputStream;
      if ((inputStream = "".getClass().getResourceAsStream(str)) != null) {
        (aa.c[50]).f.a(String.valueOf(str) + "/data");
        (aa.c[50]).f.a = l.b(String.valueOf(str) + "/img.png");
      } else {
        bt.a().h(50);
      } 
      aa.K.addElement("50");
    } 
  }
  
  public void a(int[] paramArrayOfint) {
    this.dQ++;
    if (this.dQ > paramArrayOfint.length - 1)
      this.dQ = 0; 
    this.dR = paramArrayOfint[this.dQ];
  }
  
  public final void b(en paramen) {
    if (this.dt > p.j && this.dt < p.j + a.A)
      if (this.aq) {
        if (this.dC || this.dA || this.dB) {
          if (this.bt >= bs) {
            String str;
            df df1;
            if ((df1 = l.d(str = String.valueOf(this.dT) + (this.bt - bs) + "_1")) != null)
              df1.a(this.dq / 2 % df1.c, this.dt, this.du + this.bS, this.dr, 3, paramen); 
            return;
          } 
          if (this.bx) {
            a(this.dS);
            if (aa.c[50] != null && (aa.c[50]).f != null) {
              (aa.c[50]).f.a(paramen, this.dR, this.dt + ((this.I == 1) ? -8 : 8), this.du + 35, (this.I == 1) ? 0 : 1, 0);
              return;
            } 
            av();
            return;
          } 
          if (this.bw) {
            paramen.a(dm, 0, this.do[this.dp] * 60, 60, 60, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
            return;
          } 
          if (this.ds == 0) {
            if (!this.bv) {
              paramen.a(n, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
              return;
            } 
            paramen.a(di, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
            return;
          } 
          if (this.ds == 1) {
            if (!this.bv) {
              paramen.a(dg, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
              return;
            } 
            paramen.a(dk, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
            return;
          } 
        } 
      } else if (!this.aq) {
        if (this.bt >= bs) {
          String str;
          df df1;
          if ((df1 = l.d(str = String.valueOf(this.dT) + (this.bt - bs) + "_1")) != null)
            df1.a(this.dq / 2 % df1.c, this.dt, this.du + this.bS, this.dr, 3, paramen); 
          return;
        } 
        if (this.bx) {
          a(this.dS);
          if (aa.c[50] != null && (aa.c[50]).f != null) {
            (aa.c[50]).f.a(paramen, this.dR, this.dt + ((this.I == 1) ? -8 : 8), this.du + 35, (this.I == 1) ? 0 : 1, 0);
            return;
          } 
          av();
          return;
        } 
        if (this.bw) {
          paramen.a(dm, 0, this.do[this.dp] * 60, 60, 60, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
          return;
        } 
        if (this.dB) {
          if (this.ds == 0) {
            if (!this.bv) {
              paramen.a(n, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
              return;
            } 
            paramen.a(di, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
            return;
          } 
          if (this.ds == 1) {
            if (!this.bv) {
              paramen.a(dg, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
              return;
            } 
            paramen.a(dk, 0, this.do[this.dp] * 40, 50, 40, this.dr, this.dt + this.dv, this.du + this.dw + this.bS, 0);
          } 
        } 
      }  
  }
  
  private void aw() {
    if (this.aq) {
      af af1 = this;
      boolean bool1 = false;
      byte b = -1;
      h[] arrayOfH = af1.aH;
      boolean bool2 = false;
    } 
    if (this.bu) {
      if (this.cm - this.C <= 20)
        this.dx = this.B; 
      if (this.dy < 100)
        this.dy = ds.g(this.dx - this.B); 
      if (this.dy >= 70 && this.cm - this.C > 30 && !this.dA && !this.dC) {
        int k = this.K;
        int j = this.I;
        int i = this.J;
        af af1;
        (af1 = this).dr = j;
        af1.ds = k;
        af1.dz = 30;
        if (af1.dr < 0) {
          af1.dr = 0;
          af1.dt = p.j + a.A + 50;
          af1.dv = -19;
        } else if (af1.dr == 1) {
          af1.dr = 2;
          af1.dt = p.j - 100;
          af1.dv = -33;
        } 
        af1.dw = -17;
        af1.du = af1.C;
        af1.dp = 0;
        af1.dq = 0;
        af1.dB = false;
        af1.dC = false;
        this.dA = true;
      } 
    } 
  }
  
  private void ax() {
    boolean bool = true;
    for (byte b = 0; b < ''; b += 24) {
      if ((bv.b(this.B, this.C + b) & 0x2) == 2 || this.C + b > bv.b * bv.i - 24) {
        bool = false;
        break;
      } 
    } 
    if (bool)
      this.bQ = 40; 
  }
  
  public final void s() {
    t();
    u();
    v();
  }
  
  public final void t() {
    if (this.K == 0)
      this.bY = 0; 
  }
  
  public final void u() {
    if (this.K == 0) {
      this.bW = 57;
      return;
    } 
    if (this.K == 1) {
      this.bW = 59;
      return;
    } 
    if (this.K == 2)
      this.bW = 57; 
  }
  
  public final void v() {
    if (this.K == 0) {
      this.bV = 58;
      return;
    } 
    if (this.K == 1) {
      this.bV = 60;
      return;
    } 
    if (this.K == 2)
      this.bV = 58; 
  }
  
  public final boolean w() {
    return (this.aC != null && this.aC.a.b());
  }
  
  public final boolean x() {
    return (this.aC != null && this.aC.a.c());
  }
  
  public final boolean y() {
    return (this.aC != null && this.aC.a.a());
  }
  
  public final boolean z() {
    return (!this.ch && this.aC != null && (this.aC.a.a == 10 || this.aC.a.a == 11));
  }
  
  public final void a(ci paramci, int paramInt) {
    this.en = false;
    if (this.cR)
      return; 
    if (this.aq && this.aC.a.a == 9 && this.U <= this.V / 10L)
      return; 
    if (this.aq) {
      if (this.aQ == null && this.aU == null)
        C(); 
      if (this.aQ != null && (this.aQ.p == 1 || this.aQ.p == 0))
        C(); 
      if (this.aU != null && (this.aU.H == 14 || this.aU.H == 5))
        C(); 
      if (this.aC.a.a == 23) {
        if (this.aU != null && this.aU.cI != 0)
          return; 
        if (this.aQ != null && this.aQ.j != 0)
          return; 
        if (this.cI != 0)
          return; 
      } 
      if (this.cQ || this.cO)
        return; 
    } 
    if (this.aq && this.cd != null)
      return; 
    if (bv.d())
      return; 
    long l = System.currentTimeMillis();
    if (this.aq) {
      if (y() && this.aU == null)
        return; 
      if (l - this.aC.f < this.aC.e) {
        this.aC.j = true;
        return;
      } 
      this.aC.f = l;
      if (this.aC.a.d == 2) {
        this.T = 1L;
      } else if (this.aC.a.d != 1) {
        this.T -= this.aC.i;
      } else {
        this.T -= this.aC.i * this.W / 100L;
      } 
      (e()).bf--;
      (p.j()).bB = true;
      (p.j()).bA = 0L;
      if (this.T < 0L)
        this.T = 0L; 
    } 
    if (this.aq) {
      if (this.aC.a.a == 10)
        bt.a().c((byte)4); 
      if (this.aC.a.a == 11)
        bt.a().c((byte)4); 
      if (this.aC.a.a == 7)
        bu.a(); 
      if (this.aC.a.a == 6) {
        bt.a().c((byte)0);
        (p.j()).ba = true;
        bu.a();
      } 
      if (this.aC.a.a == 8) {
        bu.a();
        bt.a().c((byte)1);
        this.bl = true;
        this.bo = this.m = System.currentTimeMillis();
        bt.a().c((byte)3);
        this.bl = false;
        bu.a();
      } 
      if (this.aC.a.a == 13) {
        if (this.cE != 0) {
          (p.j()).aX = 0;
          return;
        } 
        if (this.ce)
          return; 
        bu.a();
        bt.a().c((byte)6);
        this.em = 0;
        this.cG = true;
        return;
      } 
      if (this.aC.a.a == 14) {
        bu.a();
        bt.a().c((byte)7);
        b(true);
      } 
      if (this.aC.a.a == 21) {
        bt.a().c((byte)10);
        return;
      } 
      if (this.aC.a.a == 12)
        bt.a().c((byte)8); 
      if (this.aC.a.a == 19) {
        bt.a().c((byte)9);
        return;
      } 
    } 
    if (this.cE == 1 && paramci.a >= 35 && paramci.a <= 41)
      paramci = p.u[106]; 
    if (paramci.a >= 128 && paramci.a <= 134) {
      paramci = p.u[paramci.a - 65];
      if (this.aU != null) {
        this.B = this.aU.B;
        this.C = this.aU.C;
        this.bP = null;
      } 
      if (this.aQ != null) {
        this.B = this.aQ.m;
        this.C = this.aQ.n;
        this.bP = null;
      } 
      at.a(60, this.B, this.C, 1);
      this.cP = true;
    } 
    if (paramci.a >= 107 && paramci.a <= 113) {
      paramci = p.u[paramci.a - 44];
      ei.a(new ea(23, this.B, this.C + this.al / 2, 3, 2, 1));
    } 
    b(paramci, paramInt);
  }
  
  public static void A() {
    (p.j()).aX = 0;
    e().a(p.u[(e()).aC.b], bv.a((e()).B, (e()).C, 2) ? 0 : 1);
  }
  
  public final void B() {
    if (this.aq && (this.bk || this.t)) {
      (p.j()).aX = 0;
      return;
    } 
    long l = System.currentTimeMillis();
    if (this.aq && l - this.aC.f < this.aC.e) {
      this.aC.j = true;
      return;
    } 
    if (this.aC.a.a == 10)
      b(false); 
    if (this.aC.a.a == 11)
      b(true); 
  }
  
  public final void C() {
    this.ci = false;
    this.cj = false;
    this.ch = false;
    this.ce = false;
    if (this.aq && this.H != 14 && this.H != 5)
      this.bJ = false; 
    (p.j()).aX = 0;
  }
  
  public final void b(boolean paramBoolean) {
    if (this.ce)
      return; 
    (p.j()).aX = 0;
    if (paramBoolean) {
      if (!this.cj) {
        this.em = 0;
        this.bm = 50000;
        this.el = 0;
        this.bo = System.currentTimeMillis();
        if (this.aq) {
          this.bJ = true;
          if (this.K == 1)
            bt.a().c((byte)4); 
          if (bv.l == 170 && this.K != 1)
            bt.a().c((byte)4); 
        } 
        if (this.K == 1)
          bu.a(); 
        if (bv.l == 170 && this.K != 1)
          bu.a(); 
        this.cj = true;
        return;
      } 
    } else if (!this.ci) {
      if (this.aq) {
        (p.j()).aX = 0;
        this.bJ = true;
        bt.a().c((byte)4);
      } 
      this.ch = false;
      this.em = 0;
      this.ci = true;
      this.el = 0;
      this.bm = 50000;
    } 
  }
  
  public final void b(ci paramci, int paramInt) {
    int i;
    this.cf = paramci;
    if (paramci.a >= 0 && paramci.a <= 6) {
      if ((i = ds.b(0, paramci.a + 4) - 1) < 0)
        i = 0; 
      if (i > 6)
        i = 6; 
      this.cg = p.u[i];
    } else if (i.a >= 14 && i.a <= 20) {
      if ((i = ds.b(0, i.a - 14 + 4) - 1) < 0)
        i = 0; 
      if (i > 6)
        i = 6; 
      this.cg = p.u[i + 14];
    } else if (i.a >= 28 && i.a <= 34) {
      if ((i = ds.b(0, ((this.cE == 1) ? 105 : i.a) - ((this.cE == 1) ? 105 : 28) + 4) - 1) < 0)
        i = 0; 
      if (i > 6)
        i = 6; 
      if (this.cE == 1)
        i = 0; 
      this.cg = p.u[i + ((this.cE == 1) ? 105 : 28)];
    } else if (i.a >= 63 && i.a <= 69) {
      if ((i = ds.b(0, i.a - 63 + 4) - 1) < 0)
        i = 0; 
      if (i > 6)
        i = 6; 
      this.cg = p.u[i + 63];
    } else if (i.a >= 107 && i.a <= 109) {
      if ((i = ds.b(0, i.a - 107 + 4) - 1) < 0)
        i = 0; 
      if (i > 6)
        i = 6; 
      this.cg = p.u[i + 107];
    } else {
      this.cg = i;
    } 
    this.ej = paramInt;
    this.cb = 0;
    this.dW = this.dX = this.dY = this.dZ = this.ea = this.eb = this.ec = this.ed = this.ee = 0;
    this.ef = null;
    this.eg = null;
    this.eh = null;
    this.E = 0;
  }
  
  public final f[] D() {
    return (this.cf == null) ? null : ((this.cg == null) ? null : ((this.ej == 0) ? this.cg.c : this.cg.d));
  }
  
  public final void E() {
    if (this.aq) {
      ci ci1 = this.cg;
      if (this.cd != null)
        ci1 = this.cd.a; 
      if (ci1 != null) {
        el el1 = new el("vMob");
        el el2 = new el("vChar");
        if (this.aU != null) {
          el2.addElement(this.aU);
        } else if (this.aQ != null) {
          el1.addElement(this.aQ);
        } 
        this.ei = new cu[el1.size() + el2.size()];
        byte b;
        for (b = 0; b < el1.size(); b++) {
          this.ei[b] = new cu();
          (this.ei[b]).d = p.y[ci1.b - 1];
          if (!w())
            (this.ei[b]).b = el1.elementAt(b); 
        } 
        for (b = 0; b < el2.size(); b++) {
          this.ei[b + el1.size()] = new cu();
          (this.ei[b + el1.size()]).d = p.y[ci1.b - 1];
          (this.ei[b + el1.size()]).c = el2.elementAt(b);
        } 
        b = 0;
        if (this.aQ != null) {
          b = 1;
        } else if (this.aU != null) {
          b = 2;
        } 
        if (el1.size() == 0 && el2.size() == 0)
          C(); 
        if (this.aq && !w() && !this.en) {
          bt.a().a(el1, el2, b);
          this.en = true;
          return;
        } 
      } 
    } else {
      ci ci1 = this.cg;
      if (this.cd != null)
        ci1 = this.cd.a; 
      if (ci1 != null) {
        if (this.aX != null) {
          this.ei = new cu[this.aX.length];
          for (byte b = 0; b < this.aX.length; b++) {
            this.ei[b] = new cu();
            (this.ei[b]).d = p.y[ci1.b - 1];
            (this.ei[b]).b = this.aX[b];
          } 
          this.aX = null;
          return;
        } 
        if (this.aY != null) {
          this.ei = new cu[this.aY.length];
          for (byte b = 0; b < this.aY.length; b++) {
            this.ei[b] = new cu();
            (this.ei[b]).d = p.y[ci1.b - 1];
            (this.ei[b]).c = this.aY[b];
          } 
          this.aY = null;
        } 
      } 
    } 
  }
  
  public final boolean F() {
    return (this.B < p.j) ? true : ((this.B > p.j + p.d));
  }
  
  public final boolean G() {
    return (this.C < p.k) ? false : ((this.C > p.k + p.e + 30) ? false : (F() ? false : (this.eH ? false : (!this.cL))));
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = 10;
  }
  
  public final void c(boolean paramBoolean) {
    this.ck = paramBoolean;
  }
  
  public void a(en paramen) {
    if (this.bR)
      return; 
    if (this.dc) {
      g(paramen);
      return;
    } 
    if (this.ck) {
      if (this.ap) {
        p.l = this.B - p.f;
        p.m = this.C - p.g - 1;
        if (!a.f)
          p.l += p.i * this.I; 
      } 
      return;
    } 
    if (!G())
      return; 
    if (this.v != null) {
      en en2 = paramen;
      dk dk1 = this.v;
      int j = 32;
      int k = 32;
      byte b = (a.w % 10 > 5) ? 1 : 0;
      if (dk1.l > 0) {
        j = dk1.m;
        k = dk1.n;
        b = 0;
      } 
      bl.a(en2, dk1.a, dk1.c, dk1.i, dk1.e + 3 + b, j, k, (dk1.b == 1) ? 0 : 2, cj.f);
    } 
    en en1 = paramen;
    af af1;
    if ((af1 = this).dt > p.j && af1.dt < p.j + a.A)
      if (af1.aq) {
        if (af1.dC || af1.dA || af1.dB)
          if (af1.bt >= bs) {
            String str1;
            df df2;
            if ((df2 = l.d(str1 = String.valueOf(af1.dT) + (af1.bt - bs) + "_0")) != null)
              df2.a(af1.dq / 2 % df2.c, af1.dt, af1.du + af1.bS, af1.dr, 3, en1); 
          } else if (!af1.bx) {
            if (af1.bw) {
              en1.a(dn, 0, af1.do[af1.dp] * 60, 60, 60, af1.dr, af1.dt + af1.dv, af1.du + af1.dw + af1.bS, 0);
            } else if (af1.ds == 2) {
              if (!af1.bv) {
                en1.a(dh, 0, af1.do[af1.dp] * 40, 50, 40, af1.dr, af1.dt + af1.dv, af1.du + af1.dw + af1.bS, 0);
              } else {
                en1.a(dl, 0, af1.do[af1.dp] * 40, 50, 40, af1.dr, af1.dt + af1.dv, af1.du + af1.dw + af1.bS, 0);
              } 
            } else if (af1.ds == 1) {
              if (!af1.bv) {
                en1.a(df, 0, af1.do[af1.dp] * 40, 50, 40, af1.dr, af1.dt + af1.dv, af1.du + af1.dw + af1.bS, 0);
              } else {
                en1.a(dj, 0, af1.do[af1.dp] * 40, 50, 40, af1.dr, af1.dt + af1.dv, af1.du + af1.dw + af1.bS, 0);
              } 
            } 
          }  
      } else if (!af1.aq) {
        if (af1.bt >= bs) {
          String str1;
          df df2;
          if ((df2 = l.d(str1 = String.valueOf(af1.dT) + (af1.bt - bs) + "_0")) != null)
            df2.a(af1.dq / 2 % df2.c, af1.dt, af1.du + af1.bS, af1.dr, 3, en1); 
        } else if (!af1.bx) {
          if (af1.bw) {
            en1.a(dn, 0, af1.do[af1.dp] * 60, 60, 60, af1.dr, af1.dt + af1.dv, af1.du + af1.dw + af1.bS, 0);
          } else if (af1.dB) {
            if (af1.ds == 2) {
              if (!af1.bv) {
                en1.a(dh, 0, af1.do[af1.dp] * 40, 50, 40, af1.dr, af1.dt + af1.dv, af1.du + af1.dw + af1.bS, 0);
              } else {
                en1.a(dl, 0, af1.do[af1.dp] * 40, 50, 40, af1.dr, af1.dt + af1.dv, af1.du + af1.dw + af1.bS, 0);
              } 
            } else if (af1.ds == 1) {
              if (!af1.bv) {
                en1.a(df, 0, af1.do[af1.dp] * 40, 50, 40, af1.dr, af1.dt + af1.dv, af1.du + af1.dw + af1.bS, 0);
              } else {
                en1.a(dj, 0, af1.do[af1.dp] * 40, 50, 40, af1.dr, af1.dt + af1.dv, af1.du + af1.dw + af1.bS, 0);
              } 
            } 
          } 
        } 
      }  
    if (bv.f() && this.C >= bv.d - 48)
      return; 
    if (this.s)
      return; 
    if (this.cJ && a.w % 2 == 0) {
      paramen.a(16185600);
      if (this.eE != null)
        paramen.a(this.B, this.C - this.al / 2, this.eE.B, this.eE.C - this.eE.al / 2); 
      if (this.eF != null)
        paramen.a(this.B, this.C - this.al / 2, this.eF.m, this.eF.n - this.eF.w / 2); 
    } 
    en1 = paramen;
    if ((!(af1 = this).aq || cX) && af1.cV < 0 && (af1.H == 1 || af1.H == 6) && l.d() - af1.eo > 0L && !af1.cF && af1.Q >= 16) {
      int j = 7598;
      if (af1.Q >= 19)
        j = 7676; 
      if (af1.Q >= 22)
        j = 7677; 
      if (af1.Q >= 25)
        j = 7678; 
      if (j != -1) {
        eg eg;
        if ((eg = bl.c[j]) == null) {
          bl.a(j);
        } else {
          j = a.w / 4 % 4 * en.b(eg.a) / 4;
          en1.a(eg.a, 0, j, en.a(eg.a), en.b(eg.a) / 4, 0, af1.B, af1.C + 2, 33);
        } 
      } 
    } 
    en1 = paramen;
    String str;
    df df1;
    if ((!(af1 = this).aq || cW) && af1.cV >= 0 && (af1.H == 1 || af1.H == 6) && !a.G.a && l.d() - af1.eo > 0L && (df1 = l.d(str = String.valueOf(af1.eY) + af1.cV + "_0")) != null)
      df1.a(a.w / 4 % df1.c, af1.B, af1.C, (af1.I == 1) ? 0 : 2, 33, en1); 
    h(paramen);
    en1 = paramen;
    if ((af1 = this).cY != -1)
      if (af1.eZ != null) {
        af1.eZ.a(a.w / 4 % af1.eZ.c, af1.B, af1.C + 3, (af1.I == 1) ? 0 : 2, 33, en1);
      } else {
        af1.eZ = l.d(String.valueOf(af1.fb) + af1.cY + "_0");
      }  
    e(paramen);
    if (this.c > 0)
      if (a.w % 2 == 0) {
        a(paramen, this.a, this.b, this.I, 25, true);
      } else if (this.c > 5) {
        a(paramen, this.a, this.b, this.I, 7, true);
      }  
    if (!G() && this.cf != null && (this.cf.a < 70 || this.cf.a > 76) && (this.cf.a < 77 || this.cf.a > 83)) {
      if (this.cf != null) {
        this.cb = (D()).length;
        this.cf = null;
      } 
      this.ei = null;
      this.dV = null;
      this.ca = null;
      this.dU = -1;
      this.bZ = -1;
      return;
    } 
    if (this.H == 15 || (this.aZ != null && this.aZ[0] > 0))
      return; 
    en1 = paramen;
    af1 = this;
    av av1 = p.x[af1.h(af1.bU)];
    int i = bC[af1.as][0][2] - (av1.a[bC[af1.as][0][0]]).c + 5;
    if ((!af1.bc || af1.aq) && (af1.aq || bv.l != 113 || af1.C < 360))
      if (af1.aq) {
        i += 5;
        af1.a(en1, af1.B, af1.C - i + 3);
      } else {
        boolean bool2 = (dD.ai != null && af1.ah == dD.ai.a) ? true : false;
        boolean bool1 = (af1.aN != 3 && af1.aN != 5) ? false : true;
        boolean bool3 = (af1.aN == 4) ? true : false;
        if (af1.ag.startsWith("$")) {
          af1.ag = af1.ag.substring(1);
          af1.ev = true;
        } 
        if (af1.ag.startsWith("#")) {
          af1.ag = af1.ag.substring(1);
          af1.ew = true;
        } 
        if ((e()).aU != null && (e()).aU.equals(af1)) {
          i += 5;
          af1.a(en1, af1.B, af1.C - i + 3);
        } 
        i += di.k.a();
        di di = di.H;
        if (af1.ev || af1.ew) {
          di = di.J;
        } else if (bool1) {
          di = di.B;
        } else if (bool3) {
          di = di.C;
        } else if (bool2) {
          di = di.D;
        } 
        if (bv.l == 170)
          if (af1.bz == 2325) {
            di = di.q;
          } else if (af1.bz == 2323) {
            di = di.p;
          }  
        if ((af1.i || bool1 || bool3) && !bool2) {
          if (l.c == 1) {
            di.a(en1, af1.ag, af1.B, af1.C - i, 2, di.E);
          } else {
            di.a(en1, af1.ag, af1.B, af1.C - i, 2);
          } 
          i += di.k.a();
        } 
        if (bool2)
          if ((e()).aU != null && (e()).aU.equals(af1)) {
            di.a(en1, af1.ag, af1.B, af1.C - i, 2, di.E);
          } else if (af1.aU == null) {
            di.a(en1, af1.ag, af1.B - 10, af1.C - i + 3, 0, di.o);
            af1.a(en1, af1.B - 16, af1.C - i + 10);
          }  
      }  
    if (this.cf == null || D() == null || this.cb >= (D()).length)
      g(paramen); 
    if (this.cc != null)
      this.cc.a(paramen); 
    if (this.cd != null)
      this.cd.a(paramen); 
    f(paramen);
    b(paramen);
    en1 = paramen;
    if ((af1 = this).cY != -1)
      if (af1.fa != null) {
        af1.fa.a(a.w / 4 % af1.fa.c, af1.B, af1.C + 8, (af1.I == 1) ? 0 : 2, 33, en1);
      } else {
        af1.fa = l.d(String.valueOf(af1.fb) + af1.cY + "_1");
      }  
    en1 = paramen;
    af1 = this;
    if (cX)
      if (af1.H == 1 || af1.H == 6) {
        if (l.d() - af1.eo > 0L)
          if (af1.cF) {
            if (a.w % 2 == 0)
              af1.ep++; 
            if (af1.ep > 6)
              af1.ep = 0; 
            en1.a(a.S[af1.ep], af1.B, af1.C + 9, 33);
          } else {
            if (af1.Q >= 14 && !a.a) {
              boolean bool = false;
              if (l.d() - af1.eo > -1000L && af1.eq) {
                bool = true;
                af1.eq = false;
              } 
              if (l.d() - af1.eo > -500L && af1.er) {
                bool = true;
                af1.er = false;
              } 
              if (bool) {
                a.a().a(-1, af1.B - -8, af1.C);
                a.a().a(1, af1.B - 8, af1.C);
                af1.e(1);
              } 
            } 
            if (af1.Q == 14) {
              if (a.w % 2 == 0)
                af1.ep++; 
              if (af1.ep > 6)
                af1.ep = 0; 
              en1.a(a.R[af1.ep], af1.B, af1.C + 9, 33);
            } else if (af1.Q == 15) {
              if (a.w % 2 == 0)
                af1.ep++; 
              if (af1.ep > 6)
                af1.ep = 0; 
              en1.a(a.S[af1.ep], af1.B, af1.C + 9, 33);
            } else if (af1.Q >= 16) {
              int j = -1;
              if (af1.Q >= 16 && af1.Q < 22)
                j = 7599; 
              if (j != -1) {
                eg eg;
                if ((eg = bl.c[7599]) == null) {
                  bl.a(7599);
                } else {
                  j = a.w / 4 % 4 * en.b(eg.a) / 4;
                  en1.a(eg.a, 0, j, en.a(eg.a), en.b(eg.a) / 4, 0, af1.B, af1.C + 2, 33);
                } 
              } 
            } 
          }  
      } else {
        af1.eo = l.d() + 1500L;
        af1.eq = true;
        af1.er = true;
      }  
    en1 = paramen;
    if ((!(af1 = this).aq || cW) && af1.cV >= 0)
      if (af1.H == 1 || af1.H == 6) {
        if (!a.G.a && !a.a) {
          boolean bool = false;
          if (l.d() - af1.eo > -1000L && af1.eq) {
            bool = true;
            af1.eq = false;
          } 
          if (l.d() - af1.eo > -500L && af1.er) {
            bool = true;
            af1.er = false;
          } 
          if (bool) {
            a.a().a(-1, af1.B - -8, af1.C);
            a.a().a(1, af1.B - 8, af1.C);
            af1.e(1);
          } 
          String str1;
          df df2;
          if (l.d() - af1.eo > 0L && (df2 = l.d(str1 = String.valueOf(af1.eY) + af1.cV + "_1")) != null)
            df2.a(a.w / 4 % df2.c, af1.B, af1.C + 2, (af1.I == 1) ? 0 : 2, 33, en1); 
        } 
      } else {
        af1.eo = l.d() + 1500L;
        af1.eq = true;
        af1.er = true;
      }  
    i(paramen);
    en1 = paramen;
    if (!(af1 = this).db && af1.bA != 0 && af1.bB != 0 && af1.H != 14) {
      byte b = 0;
      i = af1.B - 30;
      int j = af1.C - 15;
      if (ds.g(af1.C - af1.bB) > 150) {
        if (af1.C > af1.bB) {
          b = 7;
          i = af1.B;
          j = af1.C - 15 - 60;
        } else {
          b = 5;
          i = af1.B;
          j = af1.C - 15 + 60;
        } 
      } else if (af1.B > af1.bA) {
        b = 2;
      } else if (af1.B <= af1.bA) {
        i = af1.B + 30;
      } 
      if (a.w % 10 >= 5) {
        if (ds.g(af1.B - af1.bA) > 100) {
          en1.a(p.bw, 0, 0, 13, 16, b, i, j, cj.f);
          return;
        } 
        if (ds.g(af1.B - af1.bA) < 50)
          en1.a(g.i, af1.bA + -30, af1.bB - 60 + 5, 0); 
      } 
    } 
  }
  
  private void e(en paramen) {
    for (byte b = 0; b < this.eQ.size(); b++) {
      ea ea1;
      if ((ea1 = this.eQ.elementAt(b)).a >= 201)
        ea1.a(paramen); 
    } 
  }
  
  private void f(en paramen) {
    if (this.ei != null)
      for (byte b = 0; b < this.ei.length; b++) {
        if (this.ei[b] != null)
          if ((this.ei[b]).b != null) {
            int i = (this.ei[b]).b.n;
            if ((this.ei[b]).b instanceof cc)
              i = (this.ei[b]).b.n - 60; 
            if ((this.ei[b]).b instanceof d)
              i = (this.ei[b]).b.n - 50; 
            if ((this.ei[b]).b instanceof an)
              i = (this.ei[b]).b.n - 40; 
            bl.b(paramen, this.ei[b].a(), (this.ei[b]).b.m, i, 0, 33);
          } else if ((this.ei[b]).c != null) {
            bl.b(paramen, this.ei[b].a(), (this.ei[b]).c.B, (this.ei[b]).c.C, 0, 33);
          }  
      }  
    if (this.bZ >= 0 && this.ca != null)
      bl.b(paramen, (this.ca.a[this.bZ]).c, this.B + (this.ca.a[this.bZ]).a, this.C + (this.ca.a[this.bZ]).b, 0, 3); 
  }
  
  public final void a(en paramen, int paramInt1, int paramInt2) {
    int i;
    if ((i = (int)(((int)this.U * 100) / this.V) / 10 - 1) < 0)
      i = 0; 
    if (i > 9)
      i = 9; 
    if (!this.aq)
      paramen.a(aa.R, 0, 6 * (9 - i), 9, 6, 0, paramInt1, paramInt2 - di.k.a() - 6, 3); 
    if (this.aN != 0 || ((e()).by != 0 && this.by != 0 && (this.by == 8 || (e()).by == 8 || this.by != (e()).by))) {
      this.es = (int)(this.U * 100L / this.V * this.et) / 100;
      if ((i = (int)(this.U * 100L / this.V)) < 30) {
        this.eu = p.aH;
      } else if (i < 60) {
        this.eu = p.aI;
      } else {
        this.eu = p.aK;
      } 
      int j = en.a(p.aJ);
      int k = en.b(p.aJ);
      i = j * i / 100;
      paramen.a(p.aJ, paramInt1 - (j >> 1), paramInt2 - 1, 20);
      if (this.es >= 5 || a.w % 6 < 3)
        paramen.a(this.eu, 0, 0, i, k, 0, paramInt1 - (j >> 1), paramInt2 - 1, 20); 
    } 
  }
  
  public final void c(en paramen) {
    if (this.ck)
      return; 
    if (this.bU == 377)
      return; 
    if (this.bV == 471)
      return; 
    if (this.s)
      return; 
    if (this.bq)
      return; 
    byte b = bv.i;
    if ((bv.l < 114 || bv.l > 120) && bv.l != 127 && bv.l != 128 && !bv.a(this.cl + b / 2, this.cm + 1, 4))
      if (bv.a((this.cl - b / 2) / b, (this.cm + 1) / b) == 0) {
        paramen.e(this.cl / b * b, (this.cm - 30) / b * b, 100, 100);
      } else if (bv.a((this.cl + b / 2) / b, (this.cm + 1) / b) == 0) {
        paramen.e(this.cl / b * b, (this.cm - 30) / b * b, b, 100);
      } else if (bv.a(this.cl - b / 2, this.cm + 1, 8)) {
        paramen.e(this.cl / 24 * b, (this.cm - 30) / b * b, b, 100);
      }  
    paramen.a(bv.x, this.cl, this.cm, 3);
    paramen.e(p.j, p.k - a.ae, p.d, p.e + 2 * a.ae);
  }
  
  public final void H() {
    byte b = 0;
    this.cl = this.B;
    if (bv.a(this.B, this.C, 2)) {
      this.cm = this.C;
      return;
    } 
    this.cm = this.C;
    while (b < 30) {
      b++;
      this.cm += 24;
      if (bv.a(this.cl, this.cm, 2)) {
        if (this.cm % 24 != 0) {
          this.cm -= this.cm % 24;
          return;
        } 
        break;
      } 
    } 
  }
  
  private void g(en paramen) {
    try {
      if (this.dc) {
        a(paramen, this.dd, this.de, this.I, this.as, false);
        return;
      } 
      if (this.bc) {
        if (this.aq) {
          if (a.w % 50 == 48 || a.w % 50 == 90) {
            bl.b(paramen, 1196, this.B, this.C - 18, 0, 3);
          } else {
            bl.b(paramen, 1195, this.B, this.C - 18, 0, 3);
          } 
        } else {
          return;
        } 
      } else {
        a(paramen, this.B, this.C + this.bS, this.I, this.as, true);
        return;
      } 
    } catch (Exception exception) {}
  }
  
  public final void a(en paramen, short[] paramArrayOfshort, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    byte b = 0;
    byte b1 = 0;
    if (this.H == 6) {
      b = 8;
      b1 = 17;
    } 
    if (this.H == 1)
      if (this.F % 15 < 5) {
        b = 8;
        b1 = 17;
      } else {
        b = 8;
        b1 = 18;
      }  
    if (this.H == 2)
      if (this.as <= 3) {
        b = 7;
        b1 = 17;
      } else {
        b = 7;
        b1 = 18;
      }  
    if (this.H == 3 || this.H == 9) {
      b = 5;
      b1 = 20;
    } 
    if (this.H == 4)
      if (this.as == 8) {
        b = 5;
        b1 = 16;
      } else {
        b = 5;
        b1 = 20;
      }  
    if (this.H == 10)
      if (this.as == 8) {
        b = 0;
        b1 = 23;
      } else {
        b = 5;
        b1 = 22;
      }  
    if (this.ek > 0) {
      b = 5;
      b1 = 18;
    } 
    if (this.cf != null && D() != null && this.cb < (D()).length) {
      b = -1;
      b1 = 17;
    } 
    this.ex++;
    if (this.ex > 10000)
      this.ex = 0; 
    byte b2 = (byte)(this.ex / 4 % paramArrayOfshort.length);
    if (!paramBoolean) {
      if (paramArrayOfshort.length == 2)
        b2 = 1; 
      if (paramArrayOfshort.length == 3)
        if (paramArrayOfshort[2] >= 0) {
          b2 = 2;
          if (a.w % 10 > 5)
            b2 = 1; 
        } else {
          b2 = 1;
        }  
    } else if (paramArrayOfshort.length > 1 && (b2 == 0 || b2 == 1) && this.H != 1 && this.H != 6) {
      this.ex = 0;
      b2 = 0;
      if (a.w % 10 > 5)
        b2 = 1; 
    } 
    bl.b(paramen, paramArrayOfshort[b2], paramInt1 + ((paramInt3 == 1) ? -b : b), paramInt2 - b1, (paramInt3 == 1) ? 0 : 2, cj.f);
  }
  
  public final boolean a(int paramInt) {
    av av1 = p.x[this.bU];
    av av2 = p.x[this.bV];
    av av3 = p.x[this.bW];
    for (byte b = 0; b < bC.length; b++) {
      if (paramInt == (av1.a[bC[b][0][0]]).a)
        return true; 
      if (paramInt == (av2.a[bC[b][1][0]]).a)
        return true; 
      if (paramInt == (av3.a[bC[b][2][0]]).a)
        return true; 
    } 
    return false;
  }
  
  public final void a(en paramen, int paramInt1, int paramInt2, int paramInt3) {
    av av1 = p.x[this.bU];
    bl.b(paramen, (av1.a[bC[0][0][0]]).a, paramInt1, paramInt2, 0, 10);
  }
  
  public final void b(en paramen, int paramInt1, int paramInt2, int paramInt3) {
    av av1 = p.x[this.bU];
    bl.b(paramen, (av1.a[bC[0][0][0]]).a, paramInt1 + bC[0][0][1] + (av1.a[bC[0][0][0]]).b - 3, paramInt2 + 3, paramInt3, 36);
  }
  
  public final void a(en paramen, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    this.ey = p.x[this.bU];
    this.ez = p.x[this.bV];
    this.eA = p.x[this.bW];
    if (this.bX >= 0 && this.H != 14)
      if (!ak.g.containsKey((new StringBuffer(String.valueOf(this.bX))).toString())) {
        ak.g.put((new StringBuffer(String.valueOf(this.bX))).toString(), new ak());
        bt.a().u(this.bX);
      } else {
        ak ak;
        if ((ak = (ak)ak.g.get((new StringBuffer(String.valueOf(this.bX))).toString())).c != null && paramBoolean)
          a(paramen, ak.c, paramInt1, paramInt2, paramInt3, true); 
      }  
    byte b2 = 2;
    byte b1 = 24;
    int i = cj.b;
    byte b = -1;
    if (paramInt3 == 1) {
      b2 = 0;
      b1 = 0;
      i = 0;
      b = 1;
    } 
    if (this.H == 14) {
      if (a.w % 4 > 0)
        paramen.a(ce.f, paramInt1, paramInt2 - this.al - 11, 3); 
      paramInt3 = 0;
      if (this.bU == 89 || this.bU == 457 || this.bU == 460 || this.bU == 461 || this.bU == 462 || this.bU == 463 || this.bU == 464 || this.bU == 465 || this.bU == 466)
        paramInt3 = 15; 
      if (this.bU == 1291)
        paramInt3 = 23; 
      bl.b(paramen, 834, paramInt1, paramInt2 - bC[paramInt4][2][2] + (this.eA.a[bC[paramInt4][2][0]]).c - 2 + paramInt3, b2, cj.a);
      bl.b(paramen, 79, paramInt1, paramInt2 - this.al - 8, 0, 33);
      bl.b(paramen, (this.ey.a[bC[paramInt4][0][0]]).a, paramInt1 + (bC[paramInt4][0][1] + (this.ey.a[bC[paramInt4][0][0]]).b) * b, paramInt2 - bC[paramInt4][0][2] + (this.ey.a[bC[paramInt4][0][0]]).c, b2, b1);
      b(paramen, paramInt4, paramInt2 - bC[paramInt4][2][2] + (this.eA.a[bC[paramInt4][2][0]]).c);
      if (g(this.bU)) {
        av av1 = p.x[h(this.bU)];
        bl.b(paramen, (av1.a[bC[paramInt4][0][0]]).a, paramInt1 + (bC[paramInt4][0][1] + (av1.a[bC[paramInt4][0][0]]).b) * b, paramInt2 - bC[paramInt4][0][2] + (av1.a[bC[paramInt4][0][0]]).c, b2, b1);
      } else {
        bl.b(paramen, (this.ey.a[bC[paramInt4][0][0]]).a, paramInt1 + (bC[paramInt4][0][1] + (this.ey.a[bC[paramInt4][0][0]]).b) * b, paramInt2 - bC[paramInt4][0][2] + (this.ey.a[bC[paramInt4][0][0]]).c, b2, b1);
      } 
      int k = paramInt2 - bC[paramInt4][2][2] + (this.eA.a[bC[paramInt4][2][0]]).c;
      int j = paramInt4;
      en en2 = paramen;
      af af2 = this;
      try {
        if (af2.cZ != -1)
          if (i(j)) {
            if (af2.ff != null) {
              af2.ff.a(a.w / 4 % af2.ff.c, af2.B + fj[j][0] * ((af2.I == 1) ? 1 : -1), k + fj[j][1], (af2.I == 1) ? 0 : 2, 33, en2);
            } else {
              af2.ff = l.d(String.valueOf(af2.fh) + af2.fi + af2.cZ);
            } 
          } else if (af2.fd != null) {
            af2.fd.a(a.w / 4 % af2.fd.c, af2.B + fj[j][0] * ((af2.I == 1) ? 1 : -1), k + fj[j][1], (af2.I == 1) ? 0 : 2, 33, en2);
          } else {
            af2.fd = l.d(String.valueOf(af2.fh) + af2.cZ);
          }  
      } catch (Exception exception) {}
      a(paramen, paramInt1 + (bC[paramInt4][0][1] + (this.ey.a[bC[paramInt4][0][0]]).b) * b, paramInt2 - bC[paramInt4][0][2] + (this.ey.a[bC[paramInt4][0][0]]).c, b2, b1);
    } else {
      b(paramen, paramInt4, paramInt2 - bC[paramInt4][2][2] + (this.eA.a[bC[paramInt4][2][0]]).c);
      try {
        if (g(this.bU)) {
          av av1 = p.x[h(this.bU)];
          bl.b(paramen, (av1.a[bC[paramInt4][0][0]]).a, paramInt1 + (bC[paramInt4][0][1] + (av1.a[bC[paramInt4][0][0]]).b) * b, paramInt2 - bC[paramInt4][0][2] + (av1.a[bC[paramInt4][0][0]]).c, b2, b1);
        } else {
          bl.b(paramen, (this.ey.a[bC[paramInt4][0][0]]).a, paramInt1 + (bC[paramInt4][0][1] + (this.ey.a[bC[paramInt4][0][0]]).b) * b, paramInt2 - bC[paramInt4][0][2] + (this.ey.a[bC[paramInt4][0][0]]).c, b2, b1);
        } 
        bl.b(paramen, (this.ez.a[bC[paramInt4][1][0]]).a, paramInt1 + (bC[paramInt4][1][1] + (this.ez.a[bC[paramInt4][1][0]]).b) * b, paramInt2 - bC[paramInt4][1][2] + (this.ez.a[bC[paramInt4][1][0]]).c, b2, b1);
        bl.b(paramen, (this.eA.a[bC[paramInt4][2][0]]).a, paramInt1 + (bC[paramInt4][2][1] + (this.eA.a[bC[paramInt4][2][0]]).b) * b, paramInt2 - bC[paramInt4][2][2] + (this.eA.a[bC[paramInt4][2][0]]).c, b2, b1);
        a(paramen, paramInt1 + (bC[paramInt4][0][1] + (this.ey.a[bC[paramInt4][0][0]]).b) * b, paramInt2 - bC[paramInt4][0][2] + (this.ey.a[bC[paramInt4][0][0]]).c, b2, b1);
      } catch (Exception exception) {}
    } 
    this.al = (this.cE == 1 || this.cL) ? 60 : (bC[0][0][2] + (this.ey.a[bC[0][0][0]]).c + 10);
    paramInt3 = (ds.g((this.ey.a[bC[paramInt4][0][0]]).c) >= 22) ? (((this.ey.a[bC[paramInt4][0][0]]).c < 0) ? ((this.ey.a[bC[paramInt4][0][0]]).c + 5) : ((this.ey.a[bC[paramInt4][0][0]]).c - 5)) : (this.ey.a[bC[paramInt4][0][0]]).c;
    this.eB = paramInt2 - bC[paramInt4][0][2] + paramInt3;
    if (this.H == 1 && this.J > 0 && !this.r && !z() && !this.cG && this.cf == null && paramInt4 != 23 && this.bX < 0 && ((a.w + this.J) % 30 == 0 || this.bk))
      paramen.a((this.K == 1) ? l : k, paramInt1 + b * -2, paramInt2 - 32 + ((this.K == 1) ? 10 : 11) - paramInt4, i); 
    if (this.dI != null)
      this.dI.a(paramen); 
    if (this.dJ != null)
      this.dJ.a(paramen); 
    en en1 = paramen;
    af af1;
    if ((af1 = this).I == 1) {
      if (af1.by != 0 && af1.by != -1) {
        bl.b(en1, af1.bz, af1.B - 10, af1.C - af1.al - 30 + ((a.w % 20 > 10) ? (a.w % 4 / 2) : 0), 2, 0);
        return;
      } 
    } else if (af1.by != 0 && af1.by != -1) {
      bl.b(en1, af1.bz, af1.B, af1.C - af1.al - 30 + ((a.w % 20 > 10) ? (a.w % 4 / 2) : 0), 0, 0);
    } 
  }
  
  public final void d(en paramen) {
    this.dP = 0;
    f[] arrayOfF = D();
    this.as = (arrayOfF[this.cb]).a;
    g(paramen);
    if (this.I == 1) {
      if (this.ef != null) {
        if (this.dZ == 0)
          this.dZ = (arrayOfF[this.cb]).c; 
        if (this.ec == 0)
          this.ec = (arrayOfF[this.cb]).d; 
        bl.b(paramen, (this.ef.a[this.dW]).c, this.B + this.dZ + (this.ef.a[this.dW]).a, this.C + this.ec + (this.ef.a[this.dW]).b, 0, 3);
        this.dW++;
        if (this.dW >= this.ef.a.length) {
          this.ef = null;
          this.dW = this.dZ = this.ec = 0;
        } 
      } 
      if (this.eg != null) {
        if (this.ea == 0)
          this.ea = (arrayOfF[this.cb]).f; 
        if (this.ed == 0)
          this.ed = (arrayOfF[this.cb]).g; 
        bl.b(paramen, (this.eg.a[this.dX]).c, this.B + this.ea + (this.eg.a[this.dX]).a, this.C + this.ed + (this.eg.a[this.dX]).b, 0, 3);
        this.dX++;
        if (this.dX >= this.eg.a.length) {
          this.eg = null;
          this.dX = this.ea = this.ed = 0;
        } 
      } 
      if (this.eh != null) {
        if (this.eb == 0)
          this.eb = (arrayOfF[this.cb]).i; 
        if (this.ee == 0)
          this.ee = (arrayOfF[this.cb]).j; 
        bl.b(paramen, (this.eh.a[this.dY]).c, this.B + this.eb + (this.eh.a[this.dY]).a, this.C + this.ee + (this.eh.a[this.dY]).b, 0, 3);
        this.dY++;
        if (this.dY >= this.eh.a.length) {
          this.eh = null;
          this.dY = this.eb = this.ee = 0;
        } 
      } 
    } else {
      if (this.ef != null) {
        if (this.dZ == 0)
          this.dZ = (arrayOfF[this.cb]).c; 
        if (this.ec == 0)
          this.ec = (arrayOfF[this.cb]).d; 
        bl.b(paramen, (this.ef.a[this.dW]).c, this.B - this.dZ - (this.ef.a[this.dW]).a, this.C + this.ec + (this.ef.a[this.dW]).b, 2, 3);
        this.dW++;
        if (this.dW >= this.ef.a.length) {
          this.ef = null;
          this.dW = 0;
          this.dZ = 0;
          this.ec = 0;
        } 
      } 
      if (this.eg != null) {
        if (this.ea == 0)
          this.ea = (arrayOfF[this.cb]).f; 
        if (this.ed == 0)
          this.ed = (arrayOfF[this.cb]).g; 
        bl.b(paramen, (this.eg.a[this.dX]).c, this.B - this.ea - (this.eg.a[this.dX]).a, this.C + this.ed + (this.eg.a[this.dX]).b, 2, 3);
        this.dX++;
        if (this.dX >= this.eg.a.length) {
          this.eg = null;
          this.dX = 0;
          this.ea = 0;
          this.ed = 0;
        } 
      } 
      if (this.eh != null) {
        if (this.eb == 0)
          this.eb = (arrayOfF[this.cb]).i; 
        if (this.ee == 0)
          this.ee = (arrayOfF[this.cb]).j; 
        bl.b(paramen, (this.eh.a[this.dY]).c, this.B - this.eb - (this.eh.a[this.dY]).a, this.C + this.ee + (this.eh.a[this.dY]).b, 2, 3);
        this.dY++;
        if (this.dY >= this.eh.a.length) {
          this.eh = null;
          this.dY = 0;
          this.eb = 0;
          this.ee = 0;
        } 
      } 
    } 
    this.cb++;
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt3 == 1 || ds.g(paramInt1 - this.B) > 100 || ds.g(paramInt2 - this.C) > 300) {
      a(this.B, this.C, 10);
      this.B = paramInt1;
      this.C = paramInt2;
      this.bF.removeAllElements();
      this.H = 6;
      this.G = 0;
      this.bP = null;
      this.as = 25;
      return;
    } 
    paramInt3 = 0;
    byte b = 0;
    int i = paramInt1 - this.B;
    int j = paramInt2 - this.C;
    if (i == 0 && j == 0) {
      b = 1;
      this.G = 0;
    } else if (j == 0) {
      b = 2;
      if (i > 0)
        paramInt3 = 1; 
      if (i < 0)
        paramInt3 = -1; 
    } else if (j != 0) {
      if (j < 0)
        b = 3; 
      if (j > 0)
        b = 4; 
      if (i < 0)
        paramInt3 = -1; 
      if (i > 0)
        paramInt3 = 1; 
    } 
    this.bF.addElement(new dm(paramInt1, paramInt2, b, paramInt3));
    if (this.H != 6)
      this.eC = this.H; 
    this.H = 6;
    this.G = 0;
  }
  
  private void ay() {
    // Byte code:
    //   0: invokestatic e : ()Laf;
    //   3: getfield cf : Lci;
    //   6: ifnonnull -> 27
    //   9: invokestatic e : ()Laf;
    //   12: getfield cc : Ldq;
    //   15: ifnonnull -> 27
    //   18: invokestatic e : ()Laf;
    //   21: getfield cd : Lbj;
    //   24: ifnull -> 35
    //   27: aload_0
    //   28: sipush #200
    //   31: putfield eD : I
    //   34: return
    //   35: aload_0
    //   36: getfield eD : I
    //   39: ifle -> 53
    //   42: aload_0
    //   43: dup
    //   44: getfield eD : I
    //   47: iconst_1
    //   48: isub
    //   49: putfield eD : I
    //   52: return
    //   53: getstatic af.cn : Z
    //   56: ifeq -> 93
    //   59: aload_0
    //   60: getfield aU : Laf;
    //   63: ifnull -> 93
    //   66: aload_0
    //   67: getfield aU : Laf;
    //   70: getfield H : I
    //   73: bipush #15
    //   75: if_icmpeq -> 88
    //   78: aload_0
    //   79: getfield aU : Laf;
    //   82: getfield bc : Z
    //   85: ifeq -> 93
    //   88: aload_0
    //   89: aconst_null
    //   90: putfield aU : Laf;
    //   93: getstatic main/a.w : I
    //   96: iconst_2
    //   97: irem
    //   98: ifne -> 102
    //   101: return
    //   102: aload_0
    //   103: aload_0
    //   104: getfield aU : Laf;
    //   107: invokevirtual c : (Laf;)Z
    //   110: ifeq -> 114
    //   113: return
    //   114: iconst_0
    //   115: istore_1
    //   116: aload_0
    //   117: getfield ax : Lda;
    //   120: ifnull -> 169
    //   123: aload_0
    //   124: getfield ax : Lda;
    //   127: getfield a : I
    //   130: ifeq -> 166
    //   133: aload_0
    //   134: getfield ax : Lda;
    //   137: getfield a : I
    //   140: iconst_1
    //   141: if_icmpeq -> 166
    //   144: aload_0
    //   145: getfield ax : Lda;
    //   148: getfield a : I
    //   151: iconst_3
    //   152: if_icmpeq -> 166
    //   155: aload_0
    //   156: getfield ax : Lda;
    //   159: getfield a : I
    //   162: iconst_5
    //   163: if_icmpne -> 169
    //   166: bipush #40
    //   168: istore_1
    //   169: iconst_4
    //   170: newarray int
    //   172: dup
    //   173: iconst_0
    //   174: iconst_m1
    //   175: iastore
    //   176: dup
    //   177: iconst_1
    //   178: iconst_m1
    //   179: iastore
    //   180: dup
    //   181: iconst_2
    //   182: iconst_m1
    //   183: iastore
    //   184: dup
    //   185: iconst_3
    //   186: iconst_m1
    //   187: iastore
    //   188: astore_2
    //   189: getstatic p.j : I
    //   192: bipush #10
    //   194: isub
    //   195: istore_3
    //   196: getstatic p.j : I
    //   199: getstatic main/a.A : I
    //   202: iadd
    //   203: bipush #10
    //   205: iadd
    //   206: istore #4
    //   208: getstatic p.k : I
    //   211: istore #5
    //   213: getstatic p.k : I
    //   216: getstatic main/a.B : I
    //   219: iadd
    //   220: getstatic p.h : I
    //   223: isub
    //   224: bipush #10
    //   226: iadd
    //   227: istore #6
    //   229: getstatic af.cn : Z
    //   232: ifeq -> 477
    //   235: aload_0
    //   236: getfield aQ : Laa;
    //   239: ifnull -> 310
    //   242: aload_0
    //   243: getfield aQ : Laa;
    //   246: getfield p : I
    //   249: iconst_1
    //   250: if_icmpeq -> 310
    //   253: aload_0
    //   254: getfield aQ : Laa;
    //   257: getfield p : I
    //   260: ifeq -> 310
    //   263: iload_3
    //   264: aload_0
    //   265: getfield aQ : Laa;
    //   268: getfield m : I
    //   271: if_icmpgt -> 310
    //   274: aload_0
    //   275: getfield aQ : Laa;
    //   278: getfield m : I
    //   281: iload #4
    //   283: if_icmpgt -> 310
    //   286: iload #5
    //   288: aload_0
    //   289: getfield aQ : Laa;
    //   292: getfield n : I
    //   295: if_icmpgt -> 310
    //   298: aload_0
    //   299: getfield aQ : Laa;
    //   302: getfield n : I
    //   305: iload #6
    //   307: if_icmple -> 472
    //   310: aload_0
    //   311: getfield aT : Ldo;
    //   314: ifnull -> 364
    //   317: iload_3
    //   318: aload_0
    //   319: getfield aT : Ldo;
    //   322: getfield B : I
    //   325: if_icmpgt -> 364
    //   328: aload_0
    //   329: getfield aT : Ldo;
    //   332: getfield B : I
    //   335: iload #4
    //   337: if_icmpgt -> 364
    //   340: iload #5
    //   342: aload_0
    //   343: getfield aT : Ldo;
    //   346: getfield C : I
    //   349: if_icmpgt -> 364
    //   352: aload_0
    //   353: getfield aT : Ldo;
    //   356: getfield C : I
    //   359: iload #6
    //   361: if_icmple -> 472
    //   364: aload_0
    //   365: getfield aU : Laf;
    //   368: ifnull -> 418
    //   371: iload_3
    //   372: aload_0
    //   373: getfield aU : Laf;
    //   376: getfield B : I
    //   379: if_icmpgt -> 418
    //   382: aload_0
    //   383: getfield aU : Laf;
    //   386: getfield B : I
    //   389: iload #4
    //   391: if_icmpgt -> 418
    //   394: iload #5
    //   396: aload_0
    //   397: getfield aU : Laf;
    //   400: getfield C : I
    //   403: if_icmpgt -> 418
    //   406: aload_0
    //   407: getfield aU : Laf;
    //   410: getfield C : I
    //   413: iload #6
    //   415: if_icmple -> 472
    //   418: aload_0
    //   419: getfield aV : Lce;
    //   422: ifnull -> 473
    //   425: iload_3
    //   426: aload_0
    //   427: getfield aV : Lce;
    //   430: getfield a : I
    //   433: if_icmpgt -> 473
    //   436: aload_0
    //   437: getfield aV : Lce;
    //   440: getfield a : I
    //   443: iload #4
    //   445: if_icmpgt -> 473
    //   448: iload #5
    //   450: aload_0
    //   451: getfield aV : Lce;
    //   454: getfield b : I
    //   457: if_icmpgt -> 473
    //   460: aload_0
    //   461: getfield aV : Lce;
    //   464: getfield b : I
    //   467: iload #6
    //   469: if_icmpgt -> 473
    //   472: return
    //   473: iconst_0
    //   474: putstatic af.cn : Z
    //   477: invokestatic e : ()Laf;
    //   480: getfield B : I
    //   483: bipush #80
    //   485: isub
    //   486: istore_3
    //   487: invokestatic e : ()Laf;
    //   490: getfield B : I
    //   493: bipush #80
    //   495: iadd
    //   496: istore #4
    //   498: invokestatic e : ()Laf;
    //   501: getfield C : I
    //   504: bipush #30
    //   506: isub
    //   507: istore #5
    //   509: invokestatic e : ()Laf;
    //   512: getfield C : I
    //   515: bipush #30
    //   517: iadd
    //   518: istore #6
    //   520: aload_0
    //   521: getfield aT : Ldo;
    //   524: ifnull -> 585
    //   527: aload_0
    //   528: getfield aT : Ldo;
    //   531: getfield df : Lap;
    //   534: getfield a : I
    //   537: bipush #6
    //   539: if_icmpne -> 585
    //   542: invokestatic e : ()Laf;
    //   545: getfield B : I
    //   548: bipush #20
    //   550: isub
    //   551: istore_3
    //   552: invokestatic e : ()Laf;
    //   555: getfield B : I
    //   558: bipush #20
    //   560: iadd
    //   561: istore #4
    //   563: invokestatic e : ()Laf;
    //   566: getfield C : I
    //   569: bipush #10
    //   571: isub
    //   572: istore #5
    //   574: invokestatic e : ()Laf;
    //   577: getfield C : I
    //   580: bipush #10
    //   582: iadd
    //   583: istore #6
    //   585: aload_0
    //   586: getfield aT : Ldo;
    //   589: ifnonnull -> 851
    //   592: iconst_0
    //   593: istore #7
    //   595: goto -> 837
    //   598: getstatic p.G : Lel;
    //   601: iload #7
    //   603: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   606: checkcast do
    //   609: dup
    //   610: astore #8
    //   612: getfield H : I
    //   615: bipush #15
    //   617: if_icmpeq -> 834
    //   620: invokestatic e : ()Laf;
    //   623: getfield B : I
    //   626: aload #8
    //   628: getfield B : I
    //   631: isub
    //   632: invokestatic abs : (I)I
    //   635: istore #9
    //   637: invokestatic e : ()Laf;
    //   640: getfield C : I
    //   643: aload #8
    //   645: getfield C : I
    //   648: isub
    //   649: invokestatic abs : (I)I
    //   652: istore #10
    //   654: iload #9
    //   656: iload #10
    //   658: if_icmple -> 666
    //   661: iload #9
    //   663: goto -> 668
    //   666: iload #10
    //   668: istore #11
    //   670: invokestatic e : ()Laf;
    //   673: getfield B : I
    //   676: bipush #80
    //   678: isub
    //   679: istore_3
    //   680: invokestatic e : ()Laf;
    //   683: getfield B : I
    //   686: bipush #80
    //   688: iadd
    //   689: istore #4
    //   691: invokestatic e : ()Laf;
    //   694: getfield C : I
    //   697: bipush #30
    //   699: isub
    //   700: istore #5
    //   702: invokestatic e : ()Laf;
    //   705: getfield C : I
    //   708: bipush #30
    //   710: iadd
    //   711: istore #6
    //   713: aload #8
    //   715: getfield df : Lap;
    //   718: getfield a : I
    //   721: bipush #6
    //   723: if_icmpne -> 769
    //   726: invokestatic e : ()Laf;
    //   729: getfield B : I
    //   732: bipush #20
    //   734: isub
    //   735: istore_3
    //   736: invokestatic e : ()Laf;
    //   739: getfield B : I
    //   742: bipush #20
    //   744: iadd
    //   745: istore #4
    //   747: invokestatic e : ()Laf;
    //   750: getfield C : I
    //   753: bipush #10
    //   755: isub
    //   756: istore #5
    //   758: invokestatic e : ()Laf;
    //   761: getfield C : I
    //   764: bipush #10
    //   766: iadd
    //   767: istore #6
    //   769: iload_3
    //   770: aload #8
    //   772: getfield B : I
    //   775: if_icmpgt -> 834
    //   778: aload #8
    //   780: getfield B : I
    //   783: iload #4
    //   785: if_icmpgt -> 834
    //   788: iload #5
    //   790: aload #8
    //   792: getfield C : I
    //   795: if_icmpgt -> 834
    //   798: aload #8
    //   800: getfield C : I
    //   803: iload #6
    //   805: if_icmpgt -> 834
    //   808: aload_0
    //   809: getfield aT : Ldo;
    //   812: ifnull -> 823
    //   815: iload #11
    //   817: aload_2
    //   818: iconst_1
    //   819: iaload
    //   820: if_icmpge -> 834
    //   823: aload_0
    //   824: aload #8
    //   826: putfield aT : Ldo;
    //   829: aload_2
    //   830: iconst_1
    //   831: iload #11
    //   833: iastore
    //   834: iinc #7, 1
    //   837: iload #7
    //   839: getstatic p.G : Lel;
    //   842: invokevirtual size : ()I
    //   845: if_icmplt -> 598
    //   848: goto -> 1167
    //   851: iload_3
    //   852: aload_0
    //   853: getfield aT : Ldo;
    //   856: getfield B : I
    //   859: if_icmpgt -> 898
    //   862: aload_0
    //   863: getfield aT : Ldo;
    //   866: getfield B : I
    //   869: iload #4
    //   871: if_icmpgt -> 898
    //   874: iload #5
    //   876: aload_0
    //   877: getfield aT : Ldo;
    //   880: getfield C : I
    //   883: if_icmpgt -> 898
    //   886: aload_0
    //   887: getfield aT : Ldo;
    //   890: getfield C : I
    //   893: iload #6
    //   895: if_icmple -> 1161
    //   898: aload_0
    //   899: invokespecial az : ()V
    //   902: iconst_0
    //   903: istore #7
    //   905: goto -> 1147
    //   908: getstatic p.G : Lel;
    //   911: iload #7
    //   913: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   916: checkcast do
    //   919: dup
    //   920: astore #8
    //   922: getfield H : I
    //   925: bipush #15
    //   927: if_icmpeq -> 1144
    //   930: invokestatic e : ()Laf;
    //   933: getfield B : I
    //   936: aload #8
    //   938: getfield B : I
    //   941: isub
    //   942: invokestatic abs : (I)I
    //   945: istore #9
    //   947: invokestatic e : ()Laf;
    //   950: getfield C : I
    //   953: aload #8
    //   955: getfield C : I
    //   958: isub
    //   959: invokestatic abs : (I)I
    //   962: istore #10
    //   964: iload #9
    //   966: iload #10
    //   968: if_icmple -> 976
    //   971: iload #9
    //   973: goto -> 978
    //   976: iload #10
    //   978: istore #11
    //   980: invokestatic e : ()Laf;
    //   983: getfield B : I
    //   986: bipush #80
    //   988: isub
    //   989: istore_3
    //   990: invokestatic e : ()Laf;
    //   993: getfield B : I
    //   996: bipush #80
    //   998: iadd
    //   999: istore #4
    //   1001: invokestatic e : ()Laf;
    //   1004: getfield C : I
    //   1007: bipush #30
    //   1009: isub
    //   1010: istore #5
    //   1012: invokestatic e : ()Laf;
    //   1015: getfield C : I
    //   1018: bipush #30
    //   1020: iadd
    //   1021: istore #6
    //   1023: aload #8
    //   1025: getfield df : Lap;
    //   1028: getfield a : I
    //   1031: bipush #6
    //   1033: if_icmpne -> 1079
    //   1036: invokestatic e : ()Laf;
    //   1039: getfield B : I
    //   1042: bipush #20
    //   1044: isub
    //   1045: istore_3
    //   1046: invokestatic e : ()Laf;
    //   1049: getfield B : I
    //   1052: bipush #20
    //   1054: iadd
    //   1055: istore #4
    //   1057: invokestatic e : ()Laf;
    //   1060: getfield C : I
    //   1063: bipush #10
    //   1065: isub
    //   1066: istore #5
    //   1068: invokestatic e : ()Laf;
    //   1071: getfield C : I
    //   1074: bipush #10
    //   1076: iadd
    //   1077: istore #6
    //   1079: iload_3
    //   1080: aload #8
    //   1082: getfield B : I
    //   1085: if_icmpgt -> 1144
    //   1088: aload #8
    //   1090: getfield B : I
    //   1093: iload #4
    //   1095: if_icmpgt -> 1144
    //   1098: iload #5
    //   1100: aload #8
    //   1102: getfield C : I
    //   1105: if_icmpgt -> 1144
    //   1108: aload #8
    //   1110: getfield C : I
    //   1113: iload #6
    //   1115: if_icmpgt -> 1144
    //   1118: aload_0
    //   1119: getfield aT : Ldo;
    //   1122: ifnull -> 1133
    //   1125: iload #11
    //   1127: aload_2
    //   1128: iconst_1
    //   1129: iaload
    //   1130: if_icmpge -> 1144
    //   1133: aload_0
    //   1134: aload #8
    //   1136: putfield aT : Ldo;
    //   1139: aload_2
    //   1140: iconst_1
    //   1141: iload #11
    //   1143: iastore
    //   1144: iinc #7, 1
    //   1147: iload #7
    //   1149: getstatic p.G : Lel;
    //   1152: invokevirtual size : ()I
    //   1155: if_icmplt -> 908
    //   1158: goto -> 1167
    //   1161: aload_0
    //   1162: iconst_1
    //   1163: invokespecial d : (I)V
    //   1166: return
    //   1167: aload_0
    //   1168: getfield aV : Lce;
    //   1171: ifnonnull -> 1332
    //   1174: iconst_0
    //   1175: istore #7
    //   1177: goto -> 1318
    //   1180: getstatic p.E : Lel;
    //   1183: iload #7
    //   1185: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1188: checkcast ce
    //   1191: astore #8
    //   1193: invokestatic e : ()Laf;
    //   1196: getfield B : I
    //   1199: aload #8
    //   1201: getfield a : I
    //   1204: isub
    //   1205: invokestatic abs : (I)I
    //   1208: istore #9
    //   1210: invokestatic e : ()Laf;
    //   1213: getfield C : I
    //   1216: aload #8
    //   1218: getfield b : I
    //   1221: isub
    //   1222: invokestatic abs : (I)I
    //   1225: istore #10
    //   1227: iload #9
    //   1229: iload #10
    //   1231: if_icmple -> 1239
    //   1234: iload #9
    //   1236: goto -> 1241
    //   1239: iload #10
    //   1241: istore #11
    //   1243: iload #9
    //   1245: bipush #48
    //   1247: if_icmpgt -> 1315
    //   1250: iload #10
    //   1252: bipush #48
    //   1254: if_icmpgt -> 1315
    //   1257: aload_0
    //   1258: getfield aV : Lce;
    //   1261: ifnull -> 1272
    //   1264: iload #11
    //   1266: aload_2
    //   1267: iconst_3
    //   1268: iaload
    //   1269: if_icmpge -> 1315
    //   1272: invokestatic j : ()Lp;
    //   1275: getfield aX : I
    //   1278: ifeq -> 1304
    //   1281: invokestatic j : ()Lp;
    //   1284: pop
    //   1285: invokestatic h : ()Z
    //   1288: ifeq -> 1304
    //   1291: aload #8
    //   1293: getfield e : Ldd;
    //   1296: getfield b : B
    //   1299: bipush #9
    //   1301: if_icmpne -> 1315
    //   1304: aload_0
    //   1305: aload #8
    //   1307: putfield aV : Lce;
    //   1310: aload_2
    //   1311: iconst_3
    //   1312: iload #11
    //   1314: iastore
    //   1315: iinc #7, 1
    //   1318: iload #7
    //   1320: getstatic p.E : Lel;
    //   1323: invokevirtual size : ()I
    //   1326: if_icmplt -> 1180
    //   1329: goto -> 1573
    //   1332: iload_3
    //   1333: aload_0
    //   1334: getfield aV : Lce;
    //   1337: getfield a : I
    //   1340: if_icmpgt -> 1379
    //   1343: aload_0
    //   1344: getfield aV : Lce;
    //   1347: getfield a : I
    //   1350: iload #4
    //   1352: if_icmpgt -> 1379
    //   1355: iload #5
    //   1357: aload_0
    //   1358: getfield aV : Lce;
    //   1361: getfield b : I
    //   1364: if_icmpgt -> 1379
    //   1367: aload_0
    //   1368: getfield aV : Lce;
    //   1371: getfield b : I
    //   1374: iload #6
    //   1376: if_icmple -> 1567
    //   1379: aload_0
    //   1380: aconst_null
    //   1381: putfield aV : Lce;
    //   1384: iconst_0
    //   1385: istore #7
    //   1387: goto -> 1553
    //   1390: getstatic p.E : Lel;
    //   1393: iload #7
    //   1395: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1398: checkcast ce
    //   1401: astore #8
    //   1403: invokestatic e : ()Laf;
    //   1406: getfield B : I
    //   1409: aload #8
    //   1411: getfield a : I
    //   1414: isub
    //   1415: invokestatic abs : (I)I
    //   1418: istore #9
    //   1420: invokestatic e : ()Laf;
    //   1423: getfield C : I
    //   1426: aload #8
    //   1428: getfield b : I
    //   1431: isub
    //   1432: invokestatic abs : (I)I
    //   1435: istore #10
    //   1437: iload #9
    //   1439: iload #10
    //   1441: if_icmple -> 1449
    //   1444: iload #9
    //   1446: goto -> 1451
    //   1449: iload #10
    //   1451: istore #11
    //   1453: iload_3
    //   1454: aload #8
    //   1456: getfield a : I
    //   1459: if_icmpgt -> 1550
    //   1462: aload #8
    //   1464: getfield a : I
    //   1467: iload #4
    //   1469: if_icmpgt -> 1550
    //   1472: iload #5
    //   1474: aload #8
    //   1476: getfield b : I
    //   1479: if_icmpgt -> 1550
    //   1482: aload #8
    //   1484: getfield b : I
    //   1487: iload #6
    //   1489: if_icmpgt -> 1550
    //   1492: aload_0
    //   1493: getfield aV : Lce;
    //   1496: ifnull -> 1507
    //   1499: iload #11
    //   1501: aload_2
    //   1502: iconst_3
    //   1503: iaload
    //   1504: if_icmpge -> 1550
    //   1507: invokestatic j : ()Lp;
    //   1510: getfield aX : I
    //   1513: ifeq -> 1539
    //   1516: invokestatic j : ()Lp;
    //   1519: pop
    //   1520: invokestatic h : ()Z
    //   1523: ifeq -> 1539
    //   1526: aload #8
    //   1528: getfield e : Ldd;
    //   1531: getfield b : B
    //   1534: bipush #9
    //   1536: if_icmpne -> 1550
    //   1539: aload_0
    //   1540: aload #8
    //   1542: putfield aV : Lce;
    //   1545: aload_2
    //   1546: iconst_3
    //   1547: iload #11
    //   1549: iastore
    //   1550: iinc #7, 1
    //   1553: iload #7
    //   1555: getstatic p.E : Lel;
    //   1558: invokevirtual size : ()I
    //   1561: if_icmplt -> 1390
    //   1564: goto -> 1573
    //   1567: aload_0
    //   1568: iconst_3
    //   1569: invokespecial d : (I)V
    //   1572: return
    //   1573: invokestatic e : ()Laf;
    //   1576: getfield B : I
    //   1579: invokestatic e : ()Laf;
    //   1582: invokespecial aa : ()I
    //   1585: isub
    //   1586: bipush #10
    //   1588: isub
    //   1589: istore_3
    //   1590: invokestatic e : ()Laf;
    //   1593: getfield B : I
    //   1596: invokestatic e : ()Laf;
    //   1599: invokespecial aa : ()I
    //   1602: iadd
    //   1603: bipush #10
    //   1605: iadd
    //   1606: istore #4
    //   1608: invokestatic e : ()Laf;
    //   1611: getfield C : I
    //   1614: invokestatic e : ()Laf;
    //   1617: invokespecial ab : ()I
    //   1620: isub
    //   1621: iload_1
    //   1622: isub
    //   1623: bipush #20
    //   1625: isub
    //   1626: istore #5
    //   1628: invokestatic e : ()Laf;
    //   1631: getfield C : I
    //   1634: invokestatic e : ()Laf;
    //   1637: invokespecial ab : ()I
    //   1640: iadd
    //   1641: bipush #20
    //   1643: iadd
    //   1644: dup
    //   1645: istore #6
    //   1647: invokestatic e : ()Laf;
    //   1650: getfield C : I
    //   1653: bipush #30
    //   1655: iadd
    //   1656: if_icmple -> 1670
    //   1659: invokestatic e : ()Laf;
    //   1662: getfield C : I
    //   1665: bipush #30
    //   1667: iadd
    //   1668: istore #6
    //   1670: aload_0
    //   1671: getfield aQ : Laa;
    //   1674: ifnonnull -> 1828
    //   1677: iconst_0
    //   1678: istore #7
    //   1680: goto -> 1814
    //   1683: getstatic p.F : Lel;
    //   1686: iload #7
    //   1688: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1691: checkcast aa
    //   1694: astore #8
    //   1696: invokestatic e : ()Laf;
    //   1699: getfield B : I
    //   1702: aload #8
    //   1704: getfield m : I
    //   1707: isub
    //   1708: invokestatic abs : (I)I
    //   1711: istore #9
    //   1713: invokestatic e : ()Laf;
    //   1716: getfield C : I
    //   1719: aload #8
    //   1721: getfield n : I
    //   1724: isub
    //   1725: invokestatic abs : (I)I
    //   1728: istore #10
    //   1730: iload #9
    //   1732: iload #10
    //   1734: if_icmple -> 1742
    //   1737: iload #9
    //   1739: goto -> 1744
    //   1742: iload #10
    //   1744: istore #11
    //   1746: iload_3
    //   1747: aload #8
    //   1749: getfield m : I
    //   1752: if_icmpgt -> 1811
    //   1755: aload #8
    //   1757: getfield m : I
    //   1760: iload #4
    //   1762: if_icmpgt -> 1811
    //   1765: iload #5
    //   1767: aload #8
    //   1769: getfield n : I
    //   1772: if_icmpgt -> 1811
    //   1775: aload #8
    //   1777: getfield n : I
    //   1780: iload #6
    //   1782: if_icmpgt -> 1811
    //   1785: aload_0
    //   1786: getfield aQ : Laa;
    //   1789: ifnull -> 1800
    //   1792: iload #11
    //   1794: aload_2
    //   1795: iconst_0
    //   1796: iaload
    //   1797: if_icmpge -> 1811
    //   1800: aload_0
    //   1801: aload #8
    //   1803: putfield aQ : Laa;
    //   1806: aload_2
    //   1807: iconst_0
    //   1808: iload #11
    //   1810: iastore
    //   1811: iinc #7, 1
    //   1814: iload #7
    //   1816: getstatic p.F : Lel;
    //   1819: invokevirtual size : ()I
    //   1822: if_icmplt -> 1683
    //   1825: goto -> 2058
    //   1828: aload_0
    //   1829: getfield aQ : Laa;
    //   1832: getfield p : I
    //   1835: iconst_1
    //   1836: if_icmpeq -> 1896
    //   1839: aload_0
    //   1840: getfield aQ : Laa;
    //   1843: getfield p : I
    //   1846: ifeq -> 1896
    //   1849: iload_3
    //   1850: aload_0
    //   1851: getfield aQ : Laa;
    //   1854: getfield m : I
    //   1857: if_icmpgt -> 1896
    //   1860: aload_0
    //   1861: getfield aQ : Laa;
    //   1864: getfield m : I
    //   1867: iload #4
    //   1869: if_icmpgt -> 1896
    //   1872: iload #5
    //   1874: aload_0
    //   1875: getfield aQ : Laa;
    //   1878: getfield n : I
    //   1881: if_icmpgt -> 1896
    //   1884: aload_0
    //   1885: getfield aQ : Laa;
    //   1888: getfield n : I
    //   1891: iload #6
    //   1893: if_icmple -> 2052
    //   1896: aload_0
    //   1897: aconst_null
    //   1898: putfield aQ : Laa;
    //   1901: iconst_0
    //   1902: istore #7
    //   1904: goto -> 2038
    //   1907: getstatic p.F : Lel;
    //   1910: iload #7
    //   1912: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1915: checkcast aa
    //   1918: astore #8
    //   1920: invokestatic e : ()Laf;
    //   1923: getfield B : I
    //   1926: aload #8
    //   1928: getfield m : I
    //   1931: isub
    //   1932: invokestatic abs : (I)I
    //   1935: istore #9
    //   1937: invokestatic e : ()Laf;
    //   1940: getfield C : I
    //   1943: aload #8
    //   1945: getfield n : I
    //   1948: isub
    //   1949: invokestatic abs : (I)I
    //   1952: istore #10
    //   1954: iload #9
    //   1956: iload #10
    //   1958: if_icmple -> 1966
    //   1961: iload #9
    //   1963: goto -> 1968
    //   1966: iload #10
    //   1968: istore #11
    //   1970: iload_3
    //   1971: aload #8
    //   1973: getfield m : I
    //   1976: if_icmpgt -> 2035
    //   1979: aload #8
    //   1981: getfield m : I
    //   1984: iload #4
    //   1986: if_icmpgt -> 2035
    //   1989: iload #5
    //   1991: aload #8
    //   1993: getfield n : I
    //   1996: if_icmpgt -> 2035
    //   1999: aload #8
    //   2001: getfield n : I
    //   2004: iload #6
    //   2006: if_icmpgt -> 2035
    //   2009: aload_0
    //   2010: getfield aQ : Laa;
    //   2013: ifnull -> 2024
    //   2016: iload #11
    //   2018: aload_2
    //   2019: iconst_0
    //   2020: iaload
    //   2021: if_icmpge -> 2035
    //   2024: aload_0
    //   2025: aload #8
    //   2027: putfield aQ : Laa;
    //   2030: aload_2
    //   2031: iconst_0
    //   2032: iload #11
    //   2034: iastore
    //   2035: iinc #7, 1
    //   2038: iload #7
    //   2040: getstatic p.F : Lel;
    //   2043: invokevirtual size : ()I
    //   2046: if_icmplt -> 1907
    //   2049: goto -> 2058
    //   2052: aload_0
    //   2053: iconst_0
    //   2054: invokespecial d : (I)V
    //   2057: return
    //   2058: aload_0
    //   2059: getfield aU : Laf;
    //   2062: ifnonnull -> 2247
    //   2065: iconst_0
    //   2066: istore #7
    //   2068: goto -> 2233
    //   2071: getstatic p.D : Lel;
    //   2074: iload #7
    //   2076: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   2079: checkcast af
    //   2082: dup
    //   2083: astore #8
    //   2085: getfield H : I
    //   2088: bipush #15
    //   2090: if_icmpeq -> 2230
    //   2093: aload #8
    //   2095: getfield bc : Z
    //   2098: ifne -> 2230
    //   2101: aload_0
    //   2102: getfield co : S
    //   2105: ifne -> 2230
    //   2108: aload_0
    //   2109: getfield cp : S
    //   2112: ifne -> 2230
    //   2115: invokestatic e : ()Laf;
    //   2118: getfield B : I
    //   2121: aload #8
    //   2123: getfield B : I
    //   2126: isub
    //   2127: invokestatic abs : (I)I
    //   2130: istore #9
    //   2132: invokestatic e : ()Laf;
    //   2135: getfield C : I
    //   2138: aload #8
    //   2140: getfield C : I
    //   2143: isub
    //   2144: invokestatic abs : (I)I
    //   2147: istore #10
    //   2149: iload #9
    //   2151: iload #10
    //   2153: if_icmple -> 2161
    //   2156: iload #9
    //   2158: goto -> 2163
    //   2161: iload #10
    //   2163: istore #11
    //   2165: iload_3
    //   2166: aload #8
    //   2168: getfield B : I
    //   2171: if_icmpgt -> 2230
    //   2174: aload #8
    //   2176: getfield B : I
    //   2179: iload #4
    //   2181: if_icmpgt -> 2230
    //   2184: iload #5
    //   2186: aload #8
    //   2188: getfield C : I
    //   2191: if_icmpgt -> 2230
    //   2194: aload #8
    //   2196: getfield C : I
    //   2199: iload #6
    //   2201: if_icmpgt -> 2230
    //   2204: aload_0
    //   2205: getfield aU : Laf;
    //   2208: ifnull -> 2219
    //   2211: iload #11
    //   2213: aload_2
    //   2214: iconst_2
    //   2215: iaload
    //   2216: if_icmpge -> 2230
    //   2219: aload_0
    //   2220: aload #8
    //   2222: putfield aU : Laf;
    //   2225: aload_2
    //   2226: iconst_2
    //   2227: iload #11
    //   2229: iastore
    //   2230: iinc #7, 1
    //   2233: iload #7
    //   2235: getstatic p.D : Lel;
    //   2238: invokevirtual size : ()I
    //   2241: if_icmplt -> 2071
    //   2244: goto -> 2509
    //   2247: iload_3
    //   2248: aload_0
    //   2249: getfield aU : Laf;
    //   2252: getfield B : I
    //   2255: if_icmpgt -> 2316
    //   2258: aload_0
    //   2259: getfield aU : Laf;
    //   2262: getfield B : I
    //   2265: iload #4
    //   2267: if_icmpgt -> 2316
    //   2270: iload #5
    //   2272: aload_0
    //   2273: getfield aU : Laf;
    //   2276: getfield C : I
    //   2279: if_icmpgt -> 2316
    //   2282: aload_0
    //   2283: getfield aU : Laf;
    //   2286: getfield C : I
    //   2289: iload #6
    //   2291: if_icmpgt -> 2316
    //   2294: aload_0
    //   2295: getfield aU : Laf;
    //   2298: getfield H : I
    //   2301: bipush #15
    //   2303: if_icmpeq -> 2316
    //   2306: aload_0
    //   2307: getfield aU : Laf;
    //   2310: getfield bc : Z
    //   2313: ifeq -> 2503
    //   2316: aload_0
    //   2317: aconst_null
    //   2318: putfield aU : Laf;
    //   2321: iconst_0
    //   2322: istore #7
    //   2324: goto -> 2489
    //   2327: getstatic p.D : Lel;
    //   2330: iload #7
    //   2332: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   2335: checkcast af
    //   2338: dup
    //   2339: astore #8
    //   2341: getfield H : I
    //   2344: bipush #15
    //   2346: if_icmpeq -> 2486
    //   2349: aload #8
    //   2351: getfield bc : Z
    //   2354: ifne -> 2486
    //   2357: aload_0
    //   2358: getfield co : S
    //   2361: ifne -> 2486
    //   2364: aload_0
    //   2365: getfield cp : S
    //   2368: ifne -> 2486
    //   2371: invokestatic e : ()Laf;
    //   2374: getfield B : I
    //   2377: aload #8
    //   2379: getfield B : I
    //   2382: isub
    //   2383: invokestatic abs : (I)I
    //   2386: istore #9
    //   2388: invokestatic e : ()Laf;
    //   2391: getfield C : I
    //   2394: aload #8
    //   2396: getfield C : I
    //   2399: isub
    //   2400: invokestatic abs : (I)I
    //   2403: istore #10
    //   2405: iload #9
    //   2407: iload #10
    //   2409: if_icmple -> 2417
    //   2412: iload #9
    //   2414: goto -> 2419
    //   2417: iload #10
    //   2419: istore #11
    //   2421: iload_3
    //   2422: aload #8
    //   2424: getfield B : I
    //   2427: if_icmpgt -> 2486
    //   2430: aload #8
    //   2432: getfield B : I
    //   2435: iload #4
    //   2437: if_icmpgt -> 2486
    //   2440: iload #5
    //   2442: aload #8
    //   2444: getfield C : I
    //   2447: if_icmpgt -> 2486
    //   2450: aload #8
    //   2452: getfield C : I
    //   2455: iload #6
    //   2457: if_icmpgt -> 2486
    //   2460: aload_0
    //   2461: getfield aU : Laf;
    //   2464: ifnull -> 2475
    //   2467: iload #11
    //   2469: aload_2
    //   2470: iconst_2
    //   2471: iaload
    //   2472: if_icmpge -> 2486
    //   2475: aload_0
    //   2476: aload #8
    //   2478: putfield aU : Laf;
    //   2481: aload_2
    //   2482: iconst_2
    //   2483: iload #11
    //   2485: iastore
    //   2486: iinc #7, 1
    //   2489: iload #7
    //   2491: getstatic p.D : Lel;
    //   2494: invokevirtual size : ()I
    //   2497: if_icmplt -> 2327
    //   2500: goto -> 2509
    //   2503: aload_0
    //   2504: iconst_2
    //   2505: invokespecial d : (I)V
    //   2508: return
    //   2509: iconst_m1
    //   2510: istore #7
    //   2512: iconst_0
    //   2513: istore #8
    //   2515: goto -> 2565
    //   2518: iload #7
    //   2520: iconst_m1
    //   2521: if_icmpne -> 2539
    //   2524: aload_2
    //   2525: iload #8
    //   2527: iaload
    //   2528: iconst_m1
    //   2529: if_icmpeq -> 2562
    //   2532: iload #8
    //   2534: istore #7
    //   2536: goto -> 2562
    //   2539: aload_2
    //   2540: iload #8
    //   2542: iaload
    //   2543: aload_2
    //   2544: iload #7
    //   2546: iaload
    //   2547: if_icmpge -> 2562
    //   2550: aload_2
    //   2551: iload #8
    //   2553: iaload
    //   2554: iconst_m1
    //   2555: if_icmpeq -> 2562
    //   2558: iload #8
    //   2560: istore #7
    //   2562: iinc #8, 1
    //   2565: iload #8
    //   2567: aload_2
    //   2568: arraylength
    //   2569: if_icmplt -> 2518
    //   2572: aload_0
    //   2573: iload #7
    //   2575: invokespecial d : (I)V
    //   2578: aload_0
    //   2579: getfield aq : Z
    //   2582: ifeq -> 2624
    //   2585: aload_0
    //   2586: invokevirtual I : ()Z
    //   2589: ifeq -> 2624
    //   2592: aload_0
    //   2593: getfield aQ : Laa;
    //   2596: ifnull -> 2614
    //   2599: aload_0
    //   2600: getfield aQ : Laa;
    //   2603: getfield J : Z
    //   2606: ifne -> 2614
    //   2609: aload_0
    //   2610: aconst_null
    //   2611: putfield aQ : Laa;
    //   2614: aload_0
    //   2615: aconst_null
    //   2616: putfield aT : Ldo;
    //   2619: aload_0
    //   2620: aconst_null
    //   2621: putfield aV : Lce;
    //   2624: return
  }
  
  private void d(int paramInt) {
    if (paramInt == 0) {
      az();
      this.aU = null;
      this.aV = null;
      return;
    } 
    if (paramInt == 1) {
      this.aQ = null;
      this.aU = null;
      this.aV = null;
      return;
    } 
    if (paramInt == 2) {
      this.aQ = null;
      az();
      this.aV = null;
      return;
    } 
    if (paramInt == 3) {
      this.aQ = null;
      az();
      this.aU = null;
    } 
  }
  
  public static boolean a(af paramaf) {
    int i = p.j;
    int j = p.j + a.A;
    int k = p.k + 10;
    int m = p.k + p.e;
    return (paramaf.H != 15 && !paramaf.bc && i <= paramaf.B && paramaf.B <= j && k <= paramaf.C && paramaf.C <= m);
  }
  
  public final boolean I() {
    return !(this.aN != 4 && this.aN != 3);
  }
  
  public final void b(af paramaf) {
    if (this.B < paramaf.B) {
      this.I = 1;
    } else {
      this.I = -1;
    } 
    this.eE = paramaf;
    this.cJ = true;
  }
  
  public final void a(aa paramaa) {
    if (this.B < paramaa.m) {
      this.I = 1;
    } else {
      this.I = -1;
    } 
    this.eF = paramaa;
    this.cJ = true;
  }
  
  public final void J() {
    if (((e()).cf != null || (e()).cc != null || (e()).cd != null || e().D() != null) && this.aW.size() == 0)
      return; 
    this.aW.removeAllElements();
    int i = 0;
    int j = p.j + 10;
    int k = p.j + a.A - 10;
    int m = p.k + 10;
    int n = p.k + p.e;
    byte b;
    for (b = 0; b < p.D.size(); b++) {
      af af1;
      if ((af1 = p.D.elementAt(b)).H != 15 && !af1.bc && j <= af1.B && af1.B <= k && m <= af1.C && af1.C <= n && af1.J != -114 && (bv.l != 129 || (bv.l == 129 && (e()).C > 264))) {
        this.aW.addElement(af1);
        if (this.aU != null && af1.equals(this.aU))
          i = this.aW.size(); 
      } 
    } 
    if (this.aq && I()) {
      ds.c("co the tan cong nguoi");
      for (b = 0; b < p.F.size(); b++) {
        aa aa1 = p.F.elementAt(b);
        p.j();
        if (!p.a(aa1)) {
          ds.c("khong the tan cong quai");
          this.aQ = null;
        } else {
          ds.c("co the tan ong quai");
          this.aW.addElement(aa1);
          if (this.aQ != null)
            i = this.aW.size(); 
        } 
      } 
      this.aT = null;
      this.aV = null;
      if (this.aW.size() > 0) {
        if (i >= this.aW.size())
          i = 0; 
        a(this.aW.elementAt(i));
        return;
      } 
      this.aQ = null;
      az();
      this.aU = null;
      this.aV = null;
      cn = false;
      return;
    } 
    for (b = 0; b < p.E.size(); b++) {
      ce ce1 = p.E.elementAt(b);
      if (j <= ce1.a && ce1.a <= k && m <= ce1.b && ce1.b <= n) {
        this.aW.addElement(ce1);
        if (this.aV != null && ce1.equals(this.aV))
          i = this.aW.size(); 
      } 
    } 
    for (b = 0; b < p.F.size(); b++) {
      aa aa1;
      if ((aa1 = p.F.elementAt(b)).p != 1 && aa1.p != 0 && j <= aa1.m && aa1.m <= k && m <= aa1.n && aa1.n <= n) {
        this.aW.addElement(aa1);
        if (this.aQ != null && aa1.equals(this.aQ))
          i = this.aW.size(); 
      } 
    } 
    for (b = 0; b < p.G.size(); b++) {
      do do1;
      if ((do1 = p.G.elementAt(b)).H != 15 && j <= do1.B && do1.B <= k && m <= do1.C && do1.C <= n) {
        this.aW.addElement(do1);
        if (this.aT != null && do1.equals(this.aT))
          i = this.aW.size(); 
      } 
    } 
    if (this.aW.size() > 0) {
      if (i >= this.aW.size())
        i = 0; 
      a(this.aW.elementAt(i));
      return;
    } 
    this.aQ = null;
    az();
    this.aU = null;
    this.aV = null;
    cn = false;
  }
  
  private void az() {
    if (this.aq && this.aT != null) {
      if (!a.F.a)
        x = null; 
      this.aT = null;
    } 
  }
  
  private void aA() {
    if (a.a)
      return; 
    if (bv.a(this.B, this.C + 1, 1024)) {
      bv.b(this.B, this.C + 1, 512);
      bv.b(this.B, this.C - 2, 512);
    } 
    if (bv.a(this.B - bv.i, this.C + 1, 512)) {
      bv.c(this.B - bv.i, this.C + 1, 512);
      bv.c(this.B - bv.i, this.C - 2, 512);
    } 
    if (bv.a(this.B + bv.i, this.C + 1, 512)) {
      bv.c(this.B + bv.i, this.C + 1, 512);
      bv.c(this.B + bv.i, this.C - 2, 512);
    } 
  }
  
  public final void a(long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2) {
    this.ae = paramBoolean1;
    this.ad = paramBoolean2;
    this.U -= paramLong1;
    this.T -= paramLong2;
    (p.j()).bE = true;
    (p.j()).bD = 0L;
    (p.j()).bB = true;
    (p.j()).bA = 0L;
    if (this.U < 0L)
      this.U = 0L; 
    if (this.T < 0L)
      this.T = 0L; 
    if (paramBoolean2 || (!paramBoolean2 && this.aN != 4 && 0L != -100L))
      p.a("-" + paramLong1, this.B, this.C - this.al, 0, -2, (paramLong1 <= 0L) ? (this.aq ? 7 : 4) : (!paramBoolean1 ? 0 : 3)); 
    if (paramLong1 > 0L)
      this.ek = 6; 
    at.a(80, this, 1);
    if (this.af) {
      this.af = false;
      bH = false;
      a((short)this.cl, (short)this.cm);
    } 
  }
  
  public final void K() {
    (p.j()).bE = true;
    (p.j()).bD = 0L;
    (p.j()).bB = true;
    (p.j()).bA = 0L;
    this.ek = 6;
    at.a(8, this, 1);
    this.dL = true;
    this.dK = 0;
  }
  
  public final void a(short paramShort1, short paramShort2) {
    this.cE = 0;
    this.cG = false;
    if (this.aq && this.af)
      return; 
    if (this.aq) {
      this.bJ = true;
      for (byte b = 0; b < p.D.size(); b++) {
        af af1;
        (af1 = p.D.elementAt(b)).bb = -9999;
      } 
      if (a.G != null && a.G.ai != null)
        a.G.ai = null; 
      if (a.H != null && a.H.ai != null)
        a.H.ai = null; 
    } 
    this.H = 5;
    this.d = paramShort1;
    this.G = paramShort2;
    this.F = 0;
    this.U = 0L;
    this.ba = -9999;
    this.bb = -9999;
    if (this.aq && this.aC != null && this.aC.a.a != 14)
      C(); 
    this.aN = 0;
  }
  
  public final void b(short paramShort1, short paramShort2) {
    this.co = paramShort1;
    this.cp = paramShort2;
  }
  
  public final void L() {
    this.U = this.V;
    this.T = this.W;
    this.H = 1;
    this.F = this.d = this.G = 0;
    at.a(109, this, 2);
    (p.j()).cn = null;
    p.O = true;
  }
  
  public final boolean M() {
    if (this.aF == null)
      return false; 
    for (byte b = 0; b < this.aF.length; b++) {
      if (this.aF[b] != null && (this.aF[b]).b.b == 6) {
        bt.a().a((byte)0, (byte)1, (byte)-1, (this.aF[b]).b.a);
        return true;
      } 
    } 
    return false;
  }
  
  private static boolean aB() {
    return (bv.l == 1 || bv.l == 27 || bv.l == 72 || bv.l == 10 || bv.l == 17 || bv.l == 22 || bv.l == 32 || bv.l == 38 || bv.l == 43 || bv.l == 48);
  }
  
  public final boolean c(af paramaf) {
    return (paramaf == null || (e()).aC == null || (e()).aC.a.e == 2 || ((e()).aC.a.e == 4 && paramaf.H != 14 && paramaf.H != 5)) ? false : ((((paramaf.aN == 3 && (e()).aN == 3) || (e()).aN == 5 || paramaf.aN == 5 || ((e()).aN == 1 && paramaf.aN == 1) || ((e()).aN == 4 && paramaf.aN == 4) || ((e()).ba >= 0 && (e()).ba == paramaf.J) || ((e()).bb >= 0 && (e()).bb == paramaf.J && !aB()) || (paramaf.bb >= 0 && paramaf.bb == (e()).J && !aB()) || ((e()).by == 8 && paramaf.by != 0) || ((e()).by != 0 && paramaf.by == 8) || ((e()).by != paramaf.by && (e()).by != 0 && paramaf.by != 0)) && paramaf.H != 14 && paramaf.H != 5));
  }
  
  public static void N() {
    (e()).aD = null;
    for (byte b = 0; b < (e()).aF.length; b++) {
      if ((e()).aF[b] != null && ((e()).aF[b]).b.b == 8)
        (e()).aF[b] = null; 
    } 
    do.aa();
  }
  
  public final int l() {
    return this.B;
  }
  
  public final int m() {
    return this.C;
  }
  
  public final int n() {
    return 32;
  }
  
  public final int o() {
    return 24;
  }
  
  public final void a(Object paramObject) {
    if (paramObject instanceof aa) {
      this.aQ = (aa)paramObject;
      az();
      this.aU = null;
      this.aV = null;
    } else if (paramObject instanceof do) {
      (e()).aQ = null;
      e().az();
      (e()).aT = (do)paramObject;
      (e()).aU = null;
      (e()).aV = null;
    } else if (paramObject instanceof af) {
      (e()).aQ = null;
      e().az();
      (e()).aU = (af)paramObject;
      (e()).aV = null;
    } else if (paramObject instanceof ce) {
      (e()).aQ = null;
      e().az();
      (e()).aU = null;
      (e()).aV = (ce)paramObject;
    } 
    cn = true;
  }
  
  public final void p() {}
  
  public final boolean q() {
    return false;
  }
  
  public final boolean O() {
    return !(this.aQ == null && (this.aU == null || !c(this.aU)));
  }
  
  private void e(int paramInt) {
    if (!a.a) {
      ea ea1;
      if (paramInt == 1) {
        ei.a(ea1 = new ea(19, this.B - 5, this.C + 20, 2, 1, -1));
        return;
      } 
      if (ea1 == 2) {
        if (this.aq && this.cE == 1)
          return; 
        if (this.u && a.w % 5 == 0) {
          ei.a(ea1 = new ea(22, this.B - 5, this.C + 35, 2, 1, -1));
          return;
        } 
      } else if (ea1 == 3 && this.cm - this.C <= 5) {
        ei.a(ea1 = new ea(19, this.B - 5, this.cm + 20, 2, 1, -1));
      } 
    } 
  }
  
  public static boolean a(byte paramByte) {
    boolean bool = true;
    for (byte b = 0; b < p.H.size(); b++) {
      ep ep;
      if ((ep = p.H.elementAt(b)) != null) {
        if (ep.a == paramByte)
          return true; 
        bool = false;
      } 
    } 
    return bool;
  }
  
  public final void P() {
    if (this.cJ) {
      this.cJ = false;
      this.eE = null;
      this.eF = null;
      return;
    } 
    this.cI = 0;
    this.eE = null;
    this.eF = null;
  }
  
  public final void Q() {
    this.cK = false;
    this.dI = null;
  }
  
  public final void R() {
    this.cO = false;
  }
  
  public final void S() {
    if (this.cI != 0)
      this.cI = 0; 
    if (this.cJ)
      this.cJ = false; 
    if (this.cK)
      this.cK = false; 
    this.dI = null;
    this.eE = null;
    this.eF = null;
    this.cO = false;
    this.cQ = false;
  }
  
  public final void a(short paramShort1, short paramShort2, byte paramByte) {
    this.eH = true;
    this.eJ = paramShort1;
    this.eK = paramShort2;
    this.eL = paramByte;
    this.eI = 0;
    if (this.aq) {
      if (a.G != null)
        a.G.A(); 
      if (a.H != null)
        a.H.A(); 
    } 
  }
  
  public final void T() {
    this.cN = false;
  }
  
  public final void U() {
    this.cL = false;
    bH = false;
    this.cM = 0;
  }
  
  public final void b(byte paramByte) {
    this.cM = 0;
    if (paramByte == 4 || paramByte == 5) {
      if (this.aq)
        bt.a().h(paramByte); 
      ei.a(new ea(34, this.B, this.C + 12, 2, 1, -1));
    } 
    if (paramByte == 6)
      ei.a(new ea(38, this.B, this.C + 12, 2, 1, -1)); 
    if (this.aq) {
      a.G.z();
      bH = true;
    } 
    this.cL = true;
    if (paramByte == 1) {
      this.u = false;
      return;
    } 
    this.u = true;
  }
  
  public final void V() {
    this.cQ = false;
  }
  
  public final void W() {
    this.eM = this.bU;
    this.eN = this.bW;
    this.eO = this.bV;
    this.eP = this.bX;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt1 != -1)
      this.bU = paramInt1; 
    if (paramInt2 != -1)
      this.bW = paramInt2; 
    if (paramInt3 != -1)
      this.bV = paramInt3; 
    if (paramInt4 != -1)
      this.bX = paramInt4; 
  }
  
  public final void X() {
    if (this.eM != -1) {
      this.bU = this.eM;
      this.eM = -1;
    } 
    if (this.eN != -1) {
      this.bW = this.eN;
      this.eN = -1;
    } 
    if (this.eO != -1) {
      this.bV = this.eO;
      this.eO = -1;
    } 
    if (this.eP != -1) {
      this.bX = this.eP;
      this.eP = -1;
    } 
  }
  
  private ea f(int paramInt) {
    for (byte b = 0; b < this.eQ.size(); b++) {
      ea ea1;
      if ((ea1 = this.eQ.elementAt(b)).a == paramInt)
        return ea1; 
    } 
    return null;
  }
  
  public final void a(ea paramea) {
    b(0, paramea.a);
    this.eQ.addElement(paramea);
  }
  
  public final void b(int paramInt1, int paramInt2) {
    if (paramInt1 == -1) {
      this.eQ.removeAllElements();
      return;
    } 
    if (f(paramInt2) != null)
      this.eQ.removeElement(f(paramInt2)); 
  }
  
  private void h(en paramen) {
    for (byte b = 0; b < this.eQ.size(); b++) {
      ea ea1;
      if ((ea1 = this.eQ.elementAt(b)).h == 0) {
        boolean bool = true;
        if (ea1.i == 0)
          if (this.H == 1 || this.H == 6) {
            bool = true;
          } else {
            bool = false;
          }  
        if (bool)
          ea1.a(paramen); 
      } 
    } 
  }
  
  private void i(en paramen) {
    for (byte b = 0; b < this.eQ.size(); b++) {
      ea ea1;
      if ((ea1 = this.eQ.elementAt(b)).h == 1) {
        boolean bool = true;
        if (ea1.i == 0)
          if (this.H == 1 || this.H == 6) {
            bool = true;
          } else {
            bool = false;
          }  
        if (bool)
          ea1.a(paramen); 
      } 
    } 
  }
  
  private void aC() {
    for (byte b = 0; b < this.eQ.size(); b++)
      ((ea)this.eQ.elementAt(b)).a(); 
  }
  
  public final int Y() {
    return this.av + this.aw;
  }
  
  private void a(en paramen, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.bU == 934 && (this.H == 1 || this.H == 6)) {
      if (eR == null || eR.d == null) {
        Image image = l.b("/redeye.png");
        eR = new df(image, 14, 10);
        return;
      } 
      if (this.eW[this.eS] != -1) {
        byte b = 8;
        if (paramInt3 == 2)
          b = -8; 
        eR.a(this.eW[this.eS], paramInt1 + b, paramInt2 + 15, paramInt3, paramInt4, paramen);
      } 
    } 
  }
  
  private static boolean g(int paramInt) {
    for (byte b = 0; b < cU.length; b++) {
      if (cU[b][0] == paramInt)
        return true; 
    } 
    return false;
  }
  
  private void aD() {
    if (g(this.bU)) {
      this.eX++;
      if (this.eX > 10000) {
        this.eX = 0;
        return;
      } 
      return;
    } 
    this.eX = 0;
  }
  
  private int h(int paramInt) {
    for (byte b = 0; b < cU.length; b++) {
      if (cU[b][0] == paramInt)
        return paramInt = cU[b][this.eX / 4 % (cU[b]).length]; 
    } 
    return paramInt;
  }
  
  private void b(en paramen, int paramInt1, int paramInt2) {
    try {
      if (this.cZ == -1)
        return; 
      if (i(paramInt1)) {
        if (this.fe != null) {
          this.fe.a(a.w / 4 % this.fe.c, this.B + fj[paramInt1][0] * ((this.I == 1) ? 1 : -1), paramInt2 + fj[paramInt1][1], (this.I == 1) ? 0 : 2, 33, paramen);
          return;
        } 
        this.fe = l.d(String.valueOf(this.fg) + this.fi + this.cZ);
        return;
      } 
      if (this.fc != null) {
        this.fc.a(a.w / 4 % this.fc.c, this.B + fj[paramInt1][0] * ((this.I == 1) ? 1 : -1), paramInt2 + fj[paramInt1][1], (this.I == 1) ? 0 : 2, 33, paramen);
        return;
      } 
      this.fc = l.d(String.valueOf(this.fg) + this.cZ);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private static boolean i(int paramInt) {
    return (paramInt == 2 || paramInt == 3 || paramInt == 4 || paramInt == 5 || paramInt == 6 || paramInt == 9 || paramInt == 10 || paramInt == 13 || paramInt == 14 || paramInt == 15 || paramInt == 16 || paramInt == 26 || paramInt == 27 || paramInt == 28 || paramInt == 29);
  }
  
  public final void a(short paramShort) {
    short s1 = -1;
    short s2 = -1;
    if (this.aQ != null) {
      s1 = (short)this.aQ.m;
      s2 = (short)this.aQ.n;
    } 
    if (this.aU != null && !this.aU.ev && !this.aU.ew) {
      s1 = (short)this.aU.B;
      s2 = (short)this.aU.C;
    } 
    bt.a().a((byte)paramShort, (byte)this.I, s1, s2);
  }
  
  public final void a(short paramShort1, boolean paramBoolean, byte paramByte1, byte paramByte2, byte paramByte3, short paramShort2, byte paramByte4) {
    this.db = true;
    this.fl = a.b + 10000L;
    this.fn = paramShort1;
    this.fk = paramBoolean;
    this.fm = paramByte1;
    this.I = paramByte3;
    this.fr = 0;
    this.fs = 0;
    long l = l.d();
    if (this.aq) {
      this.aC.f = l;
      if (this.aC.a.d == 2) {
        this.T = 1L;
      } else if (this.aC.a.d != 1) {
        this.T -= this.aC.i;
      } else {
        this.T -= this.aC.i * this.W / 100L;
      } 
      (e()).bf--;
      (p.j()).bB = true;
      (p.j()).bA = 0L;
      if (this.T < 0L)
        this.T = 0L; 
    } 
    if (paramShort1 == 24) {
      p.a(18, 0, paramByte2, Z(), (bk)null, 3, paramShort2, (short)0);
      p.a(21, 0, paramByte2, Z(), (bk)null, 1, paramShort2, (short)0);
    } else if (paramShort1 == 25) {
      p.a(19, 0, paramByte2, Z(), (bk)null, 3, paramShort2, (short)0);
      p.a(22, 0, paramByte2, Z(), (bk)null, 1, paramShort2, (short)0);
    } else if (paramShort1 == 26) {
      p.a(20, 0, paramByte2, Z(), (bk)null, 3, paramShort2, (short)0);
      p.a(23, 0, paramByte2, Z(), (bk)null, 1, paramShort2, (short)0);
    } 
    if (this.fm == 1)
      if (!this.fk) {
        this.fo = new byte[] { 20, 20, 20, 20, 20, 20, 19 };
        this.fp = new byte[] { 20 };
        this.fq = new byte[1];
      } else {
        this.fo = new byte[] { 31, 31, 31, 31, 31, 31, 30 };
        this.fp = new byte[] { 31 };
        this.fq = new byte[] { 12 };
      }  
    if (this.fm == 2)
      if (!this.fk) {
        this.fo = new byte[] { 20 };
        this.fp = new byte[] { 13, 13, 13, 14, 14, 14 };
        this.fq = new byte[1];
      } else {
        this.fo = new byte[] { 31 };
        this.fp = new byte[] { 26, 26, 26, 27, 27, 27 };
        this.fq = new byte[] { 12 };
      }  
    if (this.fm == 4)
      if (!this.fk) {
        this.fo = new byte[] { 17, 17, 17, 18, 18, 18 };
        this.fp = new byte[] { 18 };
        this.fq = new byte[1];
      } else {
        this.fo = new byte[] { 7, 7, 7, 12, 12, 12, 12 };
        this.fp = new byte[] { 12 };
        this.fq = new byte[] { 12 };
      }  
    if (this.fm == 3) {
      if (!this.fk) {
        this.fo = new byte[] { 24, 24, 24, 17, 17, 17, 18, 18, 18 };
        this.fp = new byte[] { 20 };
        this.fq = new byte[1];
        return;
      } 
      this.fo = new byte[] { 23, 23, 23, 7, 7, 7, 12, 12, 12, 12 };
      this.fp = new byte[] { 31 };
      this.fq = new byte[] { 12 };
    } 
  }
  
  public final void a(int paramInt, short paramShort1, bk parambk, short paramShort2, short paramShort3, byte paramByte1, bk[] paramArrayOfbk, byte paramByte2) {
    this.fs = paramInt;
    this.fn = paramShort1;
    this.fr = 0;
    this.ft = parambk;
    this.fu = l.d() + paramShort2;
    if (this.fs != 1)
      return; 
    if (this.fn == 24) {
      p.a(18, 1, paramByte1, this, (bk)null, 3, paramShort2, (short)0);
      p.a(24, 0, paramByte1, this, this.ft, 1, paramShort2, paramShort3);
    } 
    if (this.fn == 25) {
      p.a(19, 0, paramByte1, this, (bk)null, 3, paramShort2, (short)0);
      p.a(25, 0, paramByte1, this, this.ft, 1, paramShort2, paramShort3);
    } 
    if (this.fn == 26) {
      p.a(20, 0, paramByte1, this, (bk)null, 3, paramShort2, (short)0);
      p.a(26, paramByte2, paramByte1, parambk.b, parambk.c, 1, 0, paramShort2, paramArrayOfbk);
    } 
  }
  
  public final af Z() {
    af af1;
    (af1 = new af()).J = this.J;
    af1.B = this.B;
    af1.C = this.C;
    af1.I = this.I;
    if (this.aH != null) {
      af1.aH = new h[this.aH.length];
      for (byte b = 0; b < this.aH.length; b++) {
        if (this.aH[b] == null) {
          af1.aH[b] = null;
        } else {
          h h1 = this.aH[b];
          h h2;
          (h2 = new h()).b = h1.b;
          if (h1.c != null) {
            h2.c = new el("item.options");
            for (byte b1 = 0; b1 < h1.c.size(); b1++) {
              ee ee;
              (ee = new ee()).c = ((ee)h1.c.elementAt(b1)).c;
              ee.a = ((ee)h1.c.elementAt(b1)).a;
              h2.c.addElement(ee);
            } 
          } 
          h2.d = h1.d;
          h2.e = h1.e;
          h2.g = h1.g;
          h2.h = h1.h;
          h2.k = h1.k;
          h2.l = h1.l;
          h2.m = h1.m;
          h2.n = h1.n;
          h2.o = h1.o;
          h2.p = h1.p;
          h2.q = h1.q;
          h2.r = h1.r;
          h2.w = h1.w;
          h2.x = h1.x;
          af1.aH[b] = h2;
        } 
      } 
    } 
    return af1;
  }
  
  public final boolean b(int paramInt) {
    if (this.aH != null)
      for (paramInt = 0; paramInt < this.aH.length; paramInt++) {
        if (this.aH[paramInt] != null && (this.aH[paramInt]).b != null && (this.aH[paramInt]).b.a == 1265)
          return true; 
      }  
    ds.b("tim kiem id cai trang " + 'ӱ' + " ko tim thay");
    return false;
  }
  
  static {
    l.c("/mainImage/glass0.png");
    l.c("/mainImage/glass1.png");
  }
  
  static {
    (new int[11])[0] = -2;
    (new int[11])[1] = -6;
    (new int[11])[2] = 22;
    (new int[11])[3] = 21;
    (new int[11])[4] = 19;
    (new int[11])[5] = 22;
    (new int[11])[6] = 10;
    (new int[11])[7] = -2;
    (new int[11])[8] = -2;
    (new int[11])[9] = 5;
    (new int[11])[10] = 19;
    (new int[11])[0] = 9;
    (new int[11])[1] = 22;
    (new int[11])[2] = 25;
    (new int[11])[3] = 17;
    (new int[11])[4] = 26;
    (new int[11])[5] = 37;
    (new int[11])[6] = 36;
    (new int[11])[7] = 49;
    (new int[11])[8] = 50;
    (new int[11])[9] = 52;
    (new int[11])[10] = 36;
    (new String[4])[0] = "1";
    (new String[4])[1] = "1";
    (new String[4])[2] = "chiêu 1";
    (new String[4])[3] = "0";
    (new String[2][])[0] = new String[4];
    (new String[4])[0] = "2";
    (new String[4])[1] = "2";
    (new String[4])[2] = "chiêu 2";
    (new String[4])[3] = "5";
    (new String[2][])[1] = new String[4];
    (new int[12])[0] = 1;
    (new int[12])[2] = 1;
    (new int[12])[3] = 1000;
    (new int[12])[4] = 40;
    (new int[12])[5] = 1;
    (new int[12])[7] = 20;
    (new int[10][])[0] = new int[12];
    (new int[12])[0] = 2;
    (new int[12])[1] = 1;
    (new int[12])[2] = 10;
    (new int[12])[3] = 1000;
    (new int[12])[4] = 100;
    (new int[12])[5] = 1;
    (new int[12])[7] = 40;
    (new int[10][])[1] = new int[12];
    (new int[12])[0] = 2;
    (new int[12])[1] = 2;
    (new int[12])[2] = 11;
    (new int[12])[3] = 800;
    (new int[12])[4] = 100;
    (new int[12])[5] = 1;
    (new int[12])[7] = 45;
    (new int[10][])[2] = new int[12];
    (new int[12])[0] = 2;
    (new int[12])[1] = 3;
    (new int[12])[2] = 12;
    (new int[12])[3] = 600;
    (new int[12])[4] = 100;
    (new int[12])[5] = 1;
    (new int[12])[7] = 50;
    (new int[10][])[3] = new int[12];
    (new int[12])[0] = 2;
    (new int[12])[1] = 4;
    (new int[12])[2] = 13;
    (new int[12])[3] = 500;
    (new int[12])[4] = 100;
    (new int[12])[5] = 1;
    (new int[12])[7] = 55;
    (new int[10][])[4] = new int[12];
    (new int[12])[0] = 3;
    (new int[12])[1] = 1;
    (new int[12])[2] = 14;
    (new int[12])[3] = 500;
    (new int[12])[4] = 100;
    (new int[12])[5] = 1;
    (new int[12])[7] = 60;
    (new int[10][])[5] = new int[12];
    (new int[12])[0] = 3;
    (new int[12])[1] = 2;
    (new int[12])[2] = 14;
    (new int[12])[3] = 500;
    (new int[12])[4] = 100;
    (new int[12])[5] = 1;
    (new int[12])[7] = 60;
    (new int[10][])[6] = new int[12];
    (new int[12])[0] = 3;
    (new int[12])[1] = 3;
    (new int[12])[2] = 14;
    (new int[12])[3] = 500;
    (new int[12])[4] = 100;
    (new int[12])[5] = 1;
    (new int[12])[7] = 60;
    (new int[10][])[7] = new int[12];
    (new int[12])[0] = 3;
    (new int[12])[1] = 4;
    (new int[12])[2] = 14;
    (new int[12])[3] = 500;
    (new int[12])[4] = 100;
    (new int[12])[5] = 1;
    (new int[12])[7] = 60;
    (new int[10][])[8] = new int[12];
    (new int[12])[0] = 3;
    (new int[12])[1] = 5;
    (new int[12])[2] = 14;
    (new int[12])[3] = 500;
    (new int[12])[4] = 100;
    (new int[12])[5] = 1;
    (new int[12])[7] = 60;
    (new int[10][])[9] = new int[12];
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\af.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */