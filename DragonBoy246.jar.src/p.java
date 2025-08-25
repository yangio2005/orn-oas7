import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;
import main.b;

public final class p extends bb implements bx {
  private boolean ct;
  
  private long cu;
  
  private long cv;
  
  public static boolean a = false;
  
  public static boolean b = false;
  
  public static p c;
  
  public static int d;
  
  public static int e;
  
  public static int f;
  
  private static int cw;
  
  private static int cx;
  
  public static int g;
  
  private static int cy;
  
  private static int cz;
  
  private static int cA;
  
  public static int h;
  
  public static int i;
  
  public static int j;
  
  public static int k;
  
  private static int cB;
  
  private static int cC;
  
  private static int cD;
  
  private static int cE;
  
  public static int l;
  
  public static int m;
  
  public static int n;
  
  private static int cF;
  
  public static int o;
  
  public static int p;
  
  public static int q;
  
  public static int r;
  
  public de s;
  
  public static int t;
  
  public static ci[] u;
  
  public static cv[] v;
  
  public static by[] w;
  
  public static av[] x;
  
  public static cp[] y;
  
  public static int z;
  
  public static el A = new el("vClan");
  
  public static el B = new el("vFriend");
  
  public static el C = new el("vEnemies");
  
  public static el D = new el("vCharInMap");
  
  public static el E = new el("vItemMap");
  
  private static el cG = new el("vMobAttack");
  
  public static el F = new el("vMob");
  
  public static el G = new el("vNpc");
  
  public static el H = new el("vFlag");
  
  public static da[] I;
  
  private static int cH = 0;
  
  public static int J = -1;
  
  private static int cI = 0;
  
  public dn[] K;
  
  public ek[] L;
  
  private static dv cJ = new dv();
  
  private static dv cK = new dv();
  
  public static int M;
  
  public static boolean N = false;
  
  private static boolean cL = false;
  
  private static boolean cM = false;
  
  private static boolean cN = false;
  
  private static boolean cO = false;
  
  private static boolean cP = false;
  
  private static boolean cQ = false;
  
  public static boolean O = false;
  
  public static boolean P = false;
  
  private static boolean cR = false;
  
  private static boolean cS = false;
  
  private static boolean cT = false;
  
  private static boolean cU = false;
  
  private static boolean cV = false;
  
  private static boolean cW = false;
  
  private static boolean cX = false;
  
  private static boolean cY = false;
  
  private static boolean cZ = false;
  
  private static boolean da = false;
  
  private static boolean db = false;
  
  private static boolean dc = false;
  
  private static boolean dd = false;
  
  private static boolean de = false;
  
  private static boolean df = false;
  
  private static boolean dg = false;
  
  private static boolean dh = false;
  
  private static boolean di = false;
  
  private static boolean dj = false;
  
  private static boolean dk = false;
  
  private static boolean dl = false;
  
  private static boolean dm = false;
  
  private static boolean dn = false;
  
  private static boolean do = false;
  
  private static boolean dp = false;
  
  private static boolean dq = false;
  
  private static boolean dr = false;
  
  private static boolean ds = false;
  
  private static boolean dt = false;
  
  private static boolean du = false;
  
  public static af Q;
  
  public static long[] R;
  
  private int dv = 0;
  
  public int[] S;
  
  public int[] T;
  
  public int[] U;
  
  public int[] V;
  
  public int[] W;
  
  public int[] X;
  
  public String[] Y;
  
  public String[] Z;
  
  public int aa = 0;
  
  public int ab = 0;
  
  private int dw = -1;
  
  private boolean dx;
  
  public static int[] ac;
  
  public static int[] ad;
  
  public static Image ae = l.b("/mainImage/myTexture2dstat.png");
  
  public static Image af = l.b("/mainImage/myTexture2dlineColor20.png");
  
  public static Image ag = l.b("/mainImage/myTexture2dlineColor21.png");
  
  public static Image ah = l.b("/mainImage/myTexture2dlineColor22.png");
  
  public static Image ai = l.b("/mainImage/myTexture2dlineColor00.png");
  
  public static Image aj = l.b("/mainImage/myTexture2dlineColor01.png");
  
  public static Image ak = l.b("/mainImage/myTexture2dlineColor02.png");
  
  public static byte al;
  
  public static byte am;
  
  public static byte an;
  
  public static byte ao;
  
  public static byte ap;
  
  public static byte aq;
  
  public static byte ar;
  
  public static byte as;
  
  private static Image dy;
  
  private static Image dz;
  
  public static Image at;
  
  private static Image dA;
  
  private static Image dB;
  
  public static Image au;
  
  public static Image av;
  
  private static Image dC;
  
  private static Image dD;
  
  private static Image dE;
  
  private static Image dF;
  
  private static Image dG;
  
  private static Image dH;
  
  private static Image dI;
  
  private static Image dJ;
  
  private static Image dK;
  
  private static Image dL;
  
  public static Image aw;
  
  public static Image ax;
  
  public static Image ay;
  
  public static Image az;
  
  public static Image aA;
  
  public static Image aB;
  
  public static byte aC = 0;
  
  public static eo aD = new eo();
  
  public static eo aE = new eo();
  
  private static Image dM;
  
  private static Image dN;
  
  private static Image dO;
  
  public static Image aF;
  
  private static Image dP;
  
  private static Image dQ;
  
  public static Image aG;
  
  public static Image aH;
  
  public static Image aI;
  
  public static Image aJ;
  
  public static Image aK;
  
  public aa aL;
  
  public k aM;
  
  private int dR;
  
  public static int aN;
  
  private static b dS = new b();
  
  public static int aO = 0;
  
  private static Image dT = l.b("/mainImage/i_pve_bar_0.png");
  
  private de dU;
  
  private de dV;
  
  private de dW;
  
  private de dX;
  
  public static bf[] aP;
  
  public static bf[] aQ;
  
  public de aR;
  
  private static int dY;
  
  public static long aS;
  
  public boolean aT;
  
  private boolean dZ;
  
  private int ea;
  
  private int eb;
  
  private int ec;
  
  private int ed;
  
  private int ee;
  
  private boolean ef;
  
  public long aU;
  
  boolean aV;
  
  private boolean eg;
  
  private int eh;
  
  private int ei;
  
  private int ej;
  
  private int ek;
  
  public static boolean aW;
  
  private long el;
  
  private long em;
  
  public int aX;
  
  int aY;
  
  public boolean aZ;
  
  public boolean ba;
  
  private static Image en;
  
  public boolean bb = false;
  
  public boolean bc = false;
  
  private boolean eo = false;
  
  private int ep;
  
  private int eq;
  
  private int er;
  
  private int es;
  
  public boolean bd;
  
  private boolean et;
  
  public int be;
  
  public int bf;
  
  public int bg;
  
  public int bh;
  
  public int bi;
  
  private static int eu;
  
  public static boolean bj;
  
  public static boolean bk;
  
  public static boolean bl;
  
  private int ev;
  
  private int ew = 0;
  
  private int ex = -1;
  
  private bf ey;
  
  public String bm;
  
  private boolean ez;
  
  private int eA;
  
  private int eB = -1;
  
  private static long eC;
  
  private static long eD;
  
  private static long eE;
  
  private static long eF;
  
  private static int eG;
  
  private int eH = 0;
  
  public static int bn;
  
  public static Image bo;
  
  public static Image bp;
  
  public int[] bq;
  
  public static Image br;
  
  public String bs;
  
  private static int eI;
  
  public static boolean bt;
  
  public static int bu;
  
  private static int[] eJ;
  
  private static int[] eK;
  
  public static el bv;
  
  private int eL = 0;
  
  public static Image bw;
  
  private static int eM;
  
  private static int eN;
  
  private static int eO;
  
  private static int eP;
  
  private static int eQ;
  
  public static int bx;
  
  public static int by;
  
  private static int eR;
  
  private static int eS;
  
  private static int[] eT;
  
  private static int[] eU;
  
  private static int eV;
  
  private static int eW;
  
  public long bz;
  
  public long bA;
  
  public boolean bB;
  
  public long bC;
  
  public long bD;
  
  public boolean bE;
  
  private long eX;
  
  private long eY;
  
  private int eZ;
  
  public static String[] bF;
  
  public static int[] bG;
  
  public static int[] bH;
  
  private static int[] fa;
  
  private static int[] fb;
  
  private static int[] fc;
  
  public static int[] bI;
  
  public static int[] bJ;
  
  private static int[] fd;
  
  private static int[] fe;
  
  private static int[] ff;
  
  private static int[] fg;
  
  private static int[] fh;
  
  private static int[] fi;
  
  private static Image[] fj;
  
  private static int fk;
  
  private static int fl;
  
  private static long fm;
  
  private int fn;
  
  public static int bK;
  
  public static int bL;
  
  public static int bM;
  
  public static int bN;
  
  private static int fo;
  
  private static int fp;
  
  private static int fq;
  
  private static int fr;
  
  private de fs;
  
  public static boolean bO;
  
  public static boolean bP;
  
  public dz bQ;
  
  private static Vector ft;
  
  public boolean bR;
  
  private int[] fu;
  
  private int[] fv;
  
  private int[] fw;
  
  private int[] fx;
  
  private int[] fy;
  
  private int fz;
  
  private String fA;
  
  private int fB;
  
  private int fC;
  
  private int fD;
  
  private boolean fE;
  
  public byte bS;
  
  public boolean bT;
  
  public int bU;
  
  public static boolean bV;
  
  public static byte bW;
  
  public static byte bX;
  
  private String fF;
  
  private String[] fG;
  
  private static Image fH;
  
  public static cg bY;
  
  private static df fI = new df(l.b("/mainImage/i_pve_bar_0.png"), 6, 15);
  
  private static df fJ = new df(l.b("/mainImage/i_pve_bar_1.png"), 38, 21);
  
  private static Image fK = l.b("/mainImage/i_vs.png");
  
  private static Image fL = l.b("/mainImage/i_charlife.png");
  
  private static Image fM;
  
  private static Image fN;
  
  public static int bZ;
  
  public static int ca;
  
  public static long cb;
  
  public static String cc;
  
  public static int cd;
  
  public static boolean ce;
  
  public static byte cf;
  
  public static el cg;
  
  private static int fO;
  
  public static boolean ch;
  
  public static int ci;
  
  public static int cj;
  
  public static boolean ck;
  
  public static boolean cl;
  
  static {
    fH = l.b("/mainImage/i_hp.png");
    fM = l.b("/mainImage/i_khung.png");
    aw = l.b("/mainImage/myTexture2dbtnl.png");
    ax = l.b("/mainImage/myTexture2dbtnlf.png");
    ay = l.b("/mainImage/myTexture2dbtnl2.png");
    az = l.b("/mainImage/myTexture2dbtnlf2.png");
    dM = l.b("/mainImage/myTexture2dpanel.png");
    dN = l.b("/mainImage/panel2.png");
    dO = l.b("/mainImage/myTexture2dHP.png");
    dP = l.b("/mainImage/SP.png");
    dQ = l.b("/mainImage/myTexture2dhpLost.png");
    aG = l.b("/mainImage/myTexture2dmpLost.png");
    aF = l.b("/mainImage/myTexture2dMP.png");
    au = l.b("/mainImage/myTexture2dskill.png");
    av = l.b("/mainImage/myTexture2dskill2.png");
    at = l.b("/mainImage/myTexture2dmenu.png");
    dA = l.b("/mainImage/myTexture2dfocus.png");
    aH = l.b("/mainImage/tm-do.png");
    aI = l.b("/mainImage/tm-vang.png");
    aJ = l.b("/mainImage/tm-xam.png");
    aK = l.b("/mainImage/tm-xanh.png");
    if (a.e) {
      l.b("/mainImage/myTexture2darrow.png");
      l.b("/mainImage/myTexture2darrow2.png");
      dy = l.b("/mainImage/myTexture2dchat.png");
      dz = l.b("/mainImage/myTexture2dchat2.png");
      dB = l.b("/mainImage/myTexture2dfocus2.png");
      dC = l.b("/mainImage/myTexture2dPea0.png");
      dD = l.b("/mainImage/myTexture2dPea1.png");
      aA = l.b("/mainImage/myTexture2danalog1.png");
      aB = l.b("/mainImage/myTexture2danalog2.png");
      dE = l.b("/mainImage/myTexture2dPea2.png");
      dF = l.b("/mainImage/myTexture2dPea3.png");
      dG = l.b("/mainImage/myTexture2dfirebtn0.png");
      dH = l.b("/mainImage/myTexture2dfirebtn1.png");
    } 
    dI = l.b("/mainImage/myTexture2dPea_0.png");
    dJ = l.b("/mainImage/myTexture2dPea_1.png");
    dK = l.b("/mainImage/myTexture2dPea_2.png");
    dL = l.b("/mainImage/myTexture2dPea_3.png");
    aO = (av.d("analog") == 1) ? 1 : 0;
    dS = new b();
    byte[] arrayOfByte1 = av.b("NRdataVersion");
    byte[] arrayOfByte2 = av.b("NRmapVersion");
    byte[] arrayOfByte3 = av.b("NRskillVersion");
    byte[] arrayOfByte4 = av.b("NRitemVersion");
    if (arrayOfByte1 != null)
      al = arrayOfByte1[0]; 
    if (arrayOfByte2 != null)
      am = arrayOfByte2[0]; 
    if (arrayOfByte3 != null)
      an = arrayOfByte3[0]; 
    if (arrayOfByte4 != null)
      ao = arrayOfByte4[0]; 
    aP = new bf[10];
    aQ = new bf[10];
    en = l.b("/bg/trans.png");
    eu = 0;
    bo = l.b("/mainImage/myTexture2dnut.png");
    bp = l.b("/mainImage/myTexture2dnutF.png");
    bt = true;
    eJ = new int[] { 1, -1, 1, -1 };
    eK = new int[] { 1, -1, -1, 1 };
    bv = new el("");
    bw = l.b("/mainImage/myTexture2darrow3.png");
    bG = new int[5];
    bH = new int[5];
    fb = new int[5];
    fc = new int[5];
    bI = new int[5];
    bF = new String[5];
    fa = new int[5];
    fd = new int[5];
    bJ = new int[8];
    for (byte b1 = 0; b1 < 5; b1++)
      bI[b1] = -1; 
    bM = 140;
    bN = 160;
    bO = false;
    bP = false;
    ft = new Vector();
    bZ = 50;
    ca = 50;
    cd = 100;
    cg = new el("");
    fO = 1;
    ch = false;
  }
  
  public final void a() {
    DataInputStream dataInputStream = null;
    try {
      short s;
      x = new av[s = (dataInputStream = new DataInputStream(new ByteArrayInputStream(av.b("NR_part")))).readShort()];
      for (byte b1 = 0; b1 < s; b1++) {
        byte b2 = dataInputStream.readByte();
        x[b1] = new av(b2);
        for (b2 = 0; b2 < (x[b1]).a.length; b2++) {
          (x[b1]).a[b2] = new w();
          ((x[b1]).a[b2]).a = dataInputStream.readShort();
          ((x[b1]).a[b2]).b = dataInputStream.readByte();
          ((x[b1]).a[b2]).c = dataInputStream.readByte();
        } 
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } finally {
      try {
        dataInputStream.close();
      } catch (IOException iOException) {
        (dataInputStream = null).printStackTrace();
      } 
    } 
    bl.c();
  }
  
  public static void a(Image paramImage1, Image paramImage2, Image paramImage3, float paramFloat1, float paramFloat2, int paramInt, float paramFloat3, en paramen) {
    paramInt = paramen.c();
    int i = paramen.d();
    int j = paramen.e();
    int m = paramen.f();
    paramen.e((int)paramFloat1, (int)paramFloat2, (int)paramFloat3, 13);
    for (byte b1 = 0; b1 < 4; b1++)
      paramen.a(paramImage2, paramFloat1 + ((b1 + 1) * 15), paramFloat2, 0); 
    paramen.a(paramImage1, paramFloat1, paramFloat2, 0);
    paramen.a(paramImage2, paramFloat1 + 100.0F - 30.0F, paramFloat2, 0);
    paramen.a(paramImage3, paramFloat1 + 100.0F - 15.0F, paramFloat2, 0);
    paramen.e(paramInt, i, j, m);
  }
  
  public static boolean e() {
    return (bv.l >= 53 && bv.l <= 62);
  }
  
  public static boolean f() {
    return (bv.l >= 63);
  }
  
  public final void b() {
    bs.c = false;
    if (ed.b())
      bu.a(); 
    x.c = false;
    af.bI = false;
    if (!a)
      bt.a().s(); 
    if (bv.b()) {
      p p1 = this;
      if (cw.b) {
        cw.b = false;
        p1.co = null;
      } 
    } 
    aD.f = true;
    aE.f = true;
    b = true;
    this.dR = 0;
    a = false;
    super.b();
  }
  
  public static void g() {
    cn.a.removeAllElements();
    D.removeAllElements();
    E.removeAllElements();
    dc.x.removeAllElements();
    dc.A.removeAllElements();
    dc.z.removeAllElements();
    dc.B.removeAllElements();
    dc.w.removeAllElements();
    cG.removeAllElements();
    F.removeAllElements();
    G.removeAllElements();
    (af.e()).bF.removeAllElements();
  }
  
  public final void a(byte[] paramArrayOfbyte) {
    byte b1;
    ds.c("GET ONSCREENSKILL!");
    aQ = new bf[10];
    if (paramArrayOfbyte == null) {
      ds.c("null");
      p p1 = this;
      ds.c("LOAD DEFAULT ONSCREEN SKILL");
      for (b1 = 0; b1 < aQ.length && b1 < (af.e()).aA.size(); b1++) {
        bf bf1 = (af.e()).aA.elementAt(b1);
        aQ[b1] = bf1;
      } 
      y();
      return;
    } 
    for (byte b2 = 0; b2 < b1.length; b2++) {
      for (byte b3 = 0; b3 < (af.e()).aA.size(); b3++) {
        bf bf1;
        if ((bf1 = (af.e()).aA.elementAt(b3)).a.a == b1[b2]) {
          aQ[b2] = bf1;
          break;
        } 
      } 
    } 
  }
  
  public final void b(byte[] paramArrayOfbyte) {
    byte b1;
    ds.c("GET KEYSKILL!");
    aP = new bf[10];
    if (paramArrayOfbyte == null) {
      p p1 = this;
      ds.c("LOAD DEFAULT KEY SKILL");
      for (b1 = 0; b1 < aP.length && b1 < (af.e()).aA.size(); b1++) {
        bf bf1 = (af.e()).aA.elementAt(b1);
        aP[b1] = bf1;
      } 
      z();
      return;
    } 
    for (byte b2 = 0; b2 < b1.length; b2++) {
      for (byte b3 = 0; b3 < (af.e()).aA.size(); b3++) {
        bf bf1;
        if ((bf1 = (af.e()).aA.elementAt(b3)).a.a == b1[b2]) {
          aP[b2] = bf1;
          break;
        } 
      } 
    } 
  }
  
  public final void c(byte[] paramArrayOfbyte) {
    ds.c("GET CURRENTSKILL!");
    if (paramArrayOfbyte == null || paramArrayOfbyte.length == 0) {
      if ((af.e()).aA.size() > 0)
        (af.e()).aC = (af.e()).aA.elementAt(0); 
    } else {
      for (byte b1 = 0; b1 < (af.e()).aA.size(); b1++) {
        bf bf1;
        if ((bf1 = (af.e()).aA.elementAt(b1)).a.a == paramArrayOfbyte[0]) {
          (af.e()).aC = bf1;
          break;
        } 
      } 
    } 
    if ((af.e()).aC != null) {
      bt.a().i((af.e()).aC.a.a);
      af.e();
    } 
  }
  
  protected static void a(et paramet) {
    ds.c("DO SET ONSCREEN SKILL");
    bf bf1 = af.e().a(paramet);
    el el1 = new el("");
    for (byte b1 = 0;; b1++) {
      if (b1 >= (a.e ? 10 : 5)) {
        a.F.a(el1);
        return;
      } 
      Object[] arrayOfObject;
      (arrayOfObject = new Object[2])[0] = bf1;
      arrayOfObject[1] = (new StringBuffer(String.valueOf(b1))).toString();
      de de1 = new de(String.valueOf(aw.cA) + (b1 + 1), 11120, arrayOfObject);
      bf bf2;
      if ((bf2 = aQ[b1]) != null)
        de1.a = true; 
      el1.addElement(de1);
    } 
  }
  
  protected static void b(et paramet) {
    ds.c("DO SET KEY SKILL");
    bf bf1 = af.e().a(paramet);
    String[] arrayOfString = cd.g ? aw.aQ : aw.aR;
    el el1 = new el("");
    for (byte b1 = 0;; b1++) {
      if (b1 >= (a.e ? 10 : 5)) {
        a.F.a(el1);
        return;
      } 
      Object[] arrayOfObject;
      (arrayOfObject = new Object[2])[0] = bf1;
      arrayOfObject[1] = (new StringBuffer(String.valueOf(b1))).toString();
      el1.addElement(new de(arrayOfString[b1], 11121, arrayOfObject));
    } 
  }
  
  private static void y() {
    byte[] arrayOfByte = new byte[aQ.length];
    for (byte b1 = 0; b1 < aQ.length; b1++) {
      if (aQ[b1] == null) {
        arrayOfByte[b1] = -1;
      } else {
        arrayOfByte[b1] = (aQ[b1]).a.a;
      } 
    } 
    bt.a().a(arrayOfByte);
  }
  
  private static void z() {
    byte[] arrayOfByte = new byte[aP.length];
    for (byte b1 = 0; b1 < aP.length; b1++) {
      if (aP[b1] == null) {
        arrayOfByte[b1] = -1;
      } else {
        arrayOfByte[b1] = (aP[b1]).a.a;
      } 
    } 
    bt.a().a(arrayOfByte);
  }
  
  public static boolean h() {
    for (int i = (af.e()).aF.length - 1; i >= 0; i--) {
      if ((af.e()).aF[i] == null)
        return false; 
    } 
    return true;
  }
  
  public static void a(String[] paramArrayOfString, do paramdo) {
    el el1 = new el("");
    for (byte b1 = 0; b1 < paramArrayOfString.length; b1++)
      el1.addElement(new de(paramArrayOfString[b1], 11057, paramdo)); 
    a.F.a(el1);
  }
  
  private static void A() {
    DataInputStream dataInputStream = null;
    try {
      short s;
      y = new cp[s = (dataInputStream = new DataInputStream(new ByteArrayInputStream(av.b("NR_effect")))).readShort()];
      for (byte b1 = 0; b1 < s; b1++) {
        y[b1] = new cp();
        dataInputStream.readShort();
        (y[b1]).a = new eq[dataInputStream.readByte()];
        for (byte b2 = 0; b2 < (y[b1]).a.length; b2++) {
          (y[b1]).a[b2] = new eq();
          ((y[b1]).a[b2]).c = dataInputStream.readShort();
          ((y[b1]).a[b2]).a = dataInputStream.readByte();
          ((y[b1]).a[b2]).b = dataInputStream.readByte();
        } 
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } finally {
      try {
        dataInputStream.close();
      } catch (IOException iOException) {
        (dataInputStream = null).printStackTrace();
      } 
    } 
  }
  
  private static void B() {
    DataInputStream dataInputStream = null;
    try {
      short s;
      v = new cv[s = (dataInputStream = new DataInputStream(new ByteArrayInputStream(av.b("NR_arrow")))).readShort()];
      for (byte b1 = 0; b1 < s; b1++) {
        v[b1] = new cv();
        dataInputStream.readShort();
        (v[b1]).a[0] = dataInputStream.readShort();
        (v[b1]).a[1] = dataInputStream.readShort();
        (v[b1]).a[2] = dataInputStream.readShort();
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } finally {
      try {
        dataInputStream.close();
      } catch (IOException iOException) {
        (dataInputStream = null).printStackTrace();
      } 
    } 
  }
  
  private static void C() {
    DataInputStream dataInputStream = null;
    try {
      short s;
      w = new by[s = (dataInputStream = new DataInputStream(new ByteArrayInputStream(av.b("NR_dart")))).readShort()];
      for (byte b1 = 0; b1 < s; b1++) {
        w[b1] = new by();
        dataInputStream.readShort();
        (w[b1]).h = dataInputStream.readShort();
        (w[b1]).i = dataInputStream.readShort() << 8;
        (w[b1]).g = dataInputStream.readShort();
        short s1 = dataInputStream.readShort();
        (w[b1]).c = new short[s1];
        byte b2;
        for (b2 = 0; b2 < s1; b2++)
          (w[b1]).c[b2] = dataInputStream.readShort(); 
        s1 = dataInputStream.readShort();
        (w[b1]).d = new short[s1];
        for (b2 = 0; b2 < s1; b2++)
          (w[b1]).d[b2] = dataInputStream.readShort(); 
        s1 = dataInputStream.readShort();
        (w[b1]).e = new short[s1];
        for (b2 = 0; b2 < s1; b2++)
          (w[b1]).e[b2] = dataInputStream.readShort(); 
        s1 = dataInputStream.readShort();
        (w[b1]).f = new short[s1];
        for (b2 = 0; b2 < s1; b2++)
          (w[b1]).f[b2] = dataInputStream.readShort(); 
        s1 = dataInputStream.readShort();
        (w[b1]).a = new short[s1][];
        for (b2 = 0; b2 < s1; b2++) {
          short s2 = dataInputStream.readShort();
          (w[b1]).a[b2] = new short[s2];
          for (byte b3 = 0; b3 < s2; b3++)
            (w[b1]).a[b2][b3] = dataInputStream.readShort(); 
        } 
        s1 = dataInputStream.readShort();
        (w[b1]).b = new short[s1][];
        for (b2 = 0; b2 < s1; b2++) {
          short s2 = dataInputStream.readShort();
          (w[b1]).b[b2] = new short[s2];
          for (byte b3 = 0; b3 < s2; b3++)
            (w[b1]).b[b2][b3] = dataInputStream.readShort(); 
        } 
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } finally {
      try {
        dataInputStream.close();
      } catch (IOException iOException) {
        (dataInputStream = null).printStackTrace();
      } 
    } 
  }
  
  private static void E() {
    DataInputStream dataInputStream = null;
    try {
      short s = (dataInputStream = new DataInputStream(new ByteArrayInputStream(av.b("NR_skill")))).readShort();
      int i;
      u = new ci[i = o.a.size()];
      for (i = 0; i < s; i++) {
        short s1;
        if ((s1 = dataInputStream.readShort()) == 1111)
          s1 = (short)(s - 1); 
        u[s1] = new ci();
        (u[s1]).a = s1;
        (u[s1]).b = dataInputStream.readShort();
        if ((u[s1]).b <= 0)
          (u[s1]).b = 80; 
        dataInputStream.readByte();
        (u[s1]).c = new f[dataInputStream.readByte()];
        byte b1;
        for (b1 = 0; b1 < (u[s1]).c.length; b1++) {
          (u[s1]).c[b1] = new f();
          ((u[s1]).c[b1]).a = dataInputStream.readByte();
          ((u[s1]).c[b1]).b = dataInputStream.readShort();
          ((u[s1]).c[b1]).c = dataInputStream.readShort();
          ((u[s1]).c[b1]).d = dataInputStream.readShort();
          ((u[s1]).c[b1]).e = dataInputStream.readShort();
          ((u[s1]).c[b1]).f = dataInputStream.readShort();
          ((u[s1]).c[b1]).g = dataInputStream.readShort();
          ((u[s1]).c[b1]).h = dataInputStream.readShort();
          ((u[s1]).c[b1]).i = dataInputStream.readShort();
          ((u[s1]).c[b1]).j = dataInputStream.readShort();
          ((u[s1]).c[b1]).k = dataInputStream.readShort();
          ((u[s1]).c[b1]).l = dataInputStream.readShort();
          ((u[s1]).c[b1]).m = dataInputStream.readShort();
        } 
        (u[s1]).d = new f[dataInputStream.readByte()];
        for (b1 = 0; b1 < (u[s1]).d.length; b1++) {
          (u[s1]).d[b1] = new f();
          ((u[s1]).d[b1]).a = dataInputStream.readByte();
          ((u[s1]).d[b1]).b = dataInputStream.readShort();
          ((u[s1]).d[b1]).c = dataInputStream.readShort();
          ((u[s1]).d[b1]).d = dataInputStream.readShort();
          ((u[s1]).d[b1]).e = dataInputStream.readShort();
          ((u[s1]).d[b1]).f = dataInputStream.readShort();
          ((u[s1]).d[b1]).g = dataInputStream.readShort();
          ((u[s1]).d[b1]).h = dataInputStream.readShort();
          ((u[s1]).d[b1]).i = dataInputStream.readShort();
          ((u[s1]).d[b1]).j = dataInputStream.readShort();
          ((u[s1]).d[b1]).k = dataInputStream.readShort();
          ((u[s1]).d[b1]).l = dataInputStream.readShort();
          ((u[s1]).d[b1]).m = dataInputStream.readShort();
        } 
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } finally {
      try {
        dataInputStream.close();
      } catch (IOException iOException) {
        (dataInputStream = null).printStackTrace();
      } 
    } 
    ds.c("READ SKILL DONE");
  }
  
  public static void i() {
    try {
      ds.c("<readOk><vsData<" + ap + "==" + al);
      ds.c("<readOk><vsMap<" + aq + "==" + am);
      ds.c("<readOk><vsSkill<" + ar + "==" + an);
      ds.c("<readOk><vsItem<" + as + "==" + ao);
      if (ap == al && aq == am && ar == an && as == ao) {
        ds.c(String.valueOf(ap) + "," + aq + "," + ar + "," + as);
        j();
        C();
        j();
        A();
        j();
        B();
        j();
        E();
        bt.a().p();
        return;
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
  }
  
  public static p j() {
    if (c == null)
      c = new p(); 
    return c;
  }
  
  public static void k() {
    c = null;
  }
  
  public final void l() {
    if (fj == null) {
      fj = new Image[3];
      for (byte b1 = 0; b1 < 3; b1++)
        fj[b1] = l.b("/e/sp" + b1 + ".png"); 
    } 
    fe = new int[2];
    ff = new int[2];
    fg = new int[2];
    fh = new int[2];
    fi = new int[2];
    fg[1] = -1;
    fg[0] = -1;
    p p1;
    (p1 = this).fn = 84;
    fm = 66L;
    fl = 59;
    fk = 61;
  }
  
  public p() {
    (new int[2])[0] = -1;
    (new int[2])[1] = -1;
    this.bR = false;
    this.fF = "";
    this.aR = new de("  ", 11000);
    this.s = new de("", 11001);
    this.aR.g = at;
    this.aR.l = en.a(this.aR.g) + 20;
    this.aR.f = false;
    this.s.g = dA;
    if (a.e) {
      this.aR.j = 0;
      this.aR.k = 50;
      this.s = null;
    } else {
      this.aR.j = 0;
      this.aR.k = e - 30;
      this.s.j = d - 32;
      this.s.k = e - 32;
    } 
    this.co = this.s;
    bn = 1;
    if (a.e)
      O = true; 
    this.dU = new de("Đổi cờ", (b)a.a(), 100001, null);
    this.dV = new de("Logout", (b)a.a(), 100002, null);
    this.dW = new de("chat world", (b)a.a(), 100003, null);
    this.dX = new de("InfoLog", (b)a.a(), 100004, null);
    this.dU.b();
    this.dV.b();
    this.dW.b();
    this.dX.b();
    this.dW.j = a.A - this.dW.l;
    this.dX.j = a.A - this.dX.l;
    this.dV.j = a.A - this.dV.l;
    this.dU.j = a.A - this.dU.l;
    this.dW.k = this.dW.m + di.s.a();
    this.dX.k = (this.dW.m << 1) + di.s.a();
    this.dV.k = this.dW.m * 3 + di.s.a();
    this.dU.k = (this.dW.m << 2) + di.s.a();
  }
  
  public static final void a(int paramInt1, int paramInt2) {
    d = a.A;
    h = 39;
    e = a.B;
    if ((cA = a.B / 6) < 48)
      cA = 48; 
    f = d >> 1;
    cz = e >> 1;
    cy = e - 120;
    g = (e << 1) / 3;
    i = d / 6;
    cw = d / bv.i + 2;
    cx = e / bv.i + 2;
    if (d % 24 != 0)
      cw++; 
    n = (bv.a - 1) * bv.i - d;
    cF = (bv.b - 1) * bv.i - e;
    if (paramInt1 == -1 && paramInt2 == -1) {
      j = l = (af.e()).B - f + i * (af.e()).I;
      k = m = (af.e()).C - g - 1;
    } else {
      j = l = paramInt1 - cy + i * (af.e()).I;
      k = m = paramInt2 - g - 1;
    } 
    if (j < 24)
      j = l = 24; 
    if (j > n)
      j = l = n; 
    if (k < 0)
      k = m = 0; 
    if (k > cF)
      k = m = cF; 
    if ((o = j / bv.i - 1) < 0)
      o = 0; 
    p = k / bv.i;
    q = o + cw;
    r = p + cx;
    if (p < 0)
      p = 0; 
    if (r > bv.b - 1)
      r = bv.b - 1; 
    if ((bv.F = q - o << 2) > bv.a)
      bv.F = bv.a; 
    if ((bv.G = r - p << 2) > bv.b)
      bv.G = bv.b; 
    if ((bv.B = ((af.e()).B - 2 * d) / bv.i) < 0)
      bv.B = 0; 
    if ((bv.C = bv.B + bv.F) > bv.a)
      bv.C = bv.a; 
    if ((bv.D = ((af.e()).C - 2 * e) / bv.i) < 0)
      bv.D = 0; 
    if ((bv.E = bv.D + bv.G) > bv.b)
      bv.E = bv.b; 
    (cq.b()).c = c;
    (cq.b()).a.b = a.B - 35 - (cq.b()).a.d;
    cq.b().a();
    if (a.e) {
      eM = e - 88;
      eN = d - 40;
      eO = 2;
      if (a.A <= 240) {
        eN = d - 35;
        eO = 5;
      } 
      eP = d - 55;
      eQ = eM + 35;
      eR = d - 37;
      eS = eM - 1;
      if (a.A >= 450) {
        eS -= 12;
        by -= 7;
        eP -= 10;
        eQ -= 5;
        eR -= 10;
      } 
    } 
    m();
    eI = (a.A > 200) ? 40 : 30;
    a.G.au = (av.d("viewchat") == -1) ? true : ((av.d("viewchat") == 1));
  }
  
  public static void m() {
    bf[] arrayOfBf;
    eT = new int[(arrayOfBf = a.e ? aQ : aP).length];
    eU = new int[arrayOfBf.length];
    dY = 30;
    if (a.A <= 320) {
      eW = e - dY - 6;
      eV = f - arrayOfBf.length * dY / 2 - 25;
    } else {
      dY = 40;
      eV = 10;
      eW = a.B - dY + 7;
    } 
    byte b1;
    for (b1 = 0; b1 < eT.length; b1++) {
      eT[b1] = b1 * dY;
      eU[b1] = eW;
      if (eT.length > 5 && b1 >= eT.length / 2) {
        eT[b1] = (b1 - eT.length / 2) * dY;
        eU[b1] = eW - 32;
      } 
    } 
    bx = arrayOfBf.length * dY;
    by = eW;
    if (a.e) {
      eV = 17;
      eW = a.B - 40;
      if (dS.b && aO == 1) {
        bx = arrayOfBf.length * dY;
        by = eW;
      } else {
        bx = a.A - 45;
        by = a.B - 45;
      } 
      if (aO != 0) {
        eR = eP = a.A - 45;
        if (dS.d) {
          eV = dS.a + 20;
          dY = 35;
          bx = eP - 45;
        } else if (dS.c) {
          bx = eP - 45;
        } 
        eS = (eQ = a.B - 45) - 45;
      } 
      for (b1 = 0; b1 < eT.length; b1++) {
        eT[b1] = b1 * dY;
        eU[b1] = eW;
        if (eT.length > 5 && b1 >= eT.length / 2) {
          eT[b1] = (b1 - eT.length / 2) * dY;
          eU[b1] = eW - 32;
        } 
      } 
    } 
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2) {
    i i;
    (i = new i()).b = paramInt2;
    i.a = paramInt1;
    a(paramString, new de(aw.bm, 12002, i), new de(aw.bn, 12003, i));
  }
  
  private void F() {
    this.aX = 0;
    a.g();
    if ((af.e()).aU.J < 0)
      return; 
    if ((af.e()).J < 0)
      return; 
    el el1;
    if ((el1 = a.G.S).size() > 0)
      return; 
    if ((af.e()).aD != null && (af.e()).aD.c > 1) {
      el1.addElement(new de(aw.cO, 11112, (af.e()).aU));
      el1.addElement(new de(aw.dK, 11113, (af.e()).aU));
    } 
    if ((af.e()).ai != null && (af.e()).aj < 2 && (af.e()).aU.ah == -1)
      el1.addElement(new de(aw.aL[4], 110391)); 
    if ((af.e()).aU.H != 14 && (af.e()).aU.H != 5) {
      if ((af.e()).aD != null && (af.e()).aD.c >= 14)
        el1.addElement(new de(aw.aL[0], 2003)); 
    } else {
      af.e();
    } 
    if ((af.e()).ai != null && (af.e()).ai.a == (af.e()).aU.ah && (af.e()).aU.H != 14 && (af.e()).aD != null && (af.e()).aD.c >= 14)
      el1.addElement(new de(aw.aL[1], 2004)); 
    int i = (af.e()).ax.b.length;
    for (byte b1 = 0; b1 < i; b1++) {
      et et = (af.e()).ax.b[b1];
      bf bf1;
      if ((bf1 = af.e().a(et)) != null && et.a() && bf1.c > 0)
        el1.addElement(new de(et.b, 12004, bf1)); 
    } 
  }
  
  public static boolean a(aa paramaa) {
    af af1;
    return (paramaa == null) ? false : (((af.e()).aN == 5) ? true : ((af.e().I() && !paramaa.J) ? false : (((af.e()).aR != null && paramaa.equals((af.e()).aR)) ? false : (((af1 = b(paramaa.y)) == null) ? true : ((af1.aN == 5) ? true : (af.e().c(af1)))))));
  }
  
  private boolean G() {
    if ((af.e()).aC != null && (((af.e()).aC.a.d != 1 && (af.e()).T < (af.e()).aC.i) || ((af.e()).aC.a.d == 1 && (af.e()).T < (af.e()).W * (af.e()).aC.i / 100L))) {
      aD.a(aw.bH, 0);
      this.aX = 0;
      return false;
    } 
    if ((af.e()).aC == null || ((af.e()).aC.a.c > 0 && (af.e()).aC.c == 0)) {
      a.a(aw.aS);
      return false;
    } 
    return true;
  }
  
  public final void n() {
    a.F.a = false;
    cq cq;
    (cq = cq.b()).a.a("");
    cq.b = false;
    (cq.b()).f = null;
    this.dx = false;
    this.aa = 0;
    cI = 0;
    cH = 0;
    this.dw = -1;
    J = -1;
    this.aa = this.ab = 0;
    if ((af.e()).U <= 0L || (af.e()).H == 14 || (af.e()).H == 5) {
      if ((af.e()).cH) {
        this.fs = new de(aw.aW[0], 11038);
        this.cn = this.fs;
        (af.e()).U = 0L;
      } 
      O = false;
    } else {
      O = true;
    } 
    dv dv1;
    (dv1 = cK).a = 0;
    dv1.b = 0;
    dv1.c = 0;
    dv1.d = 0;
    dv1.e = 0;
    dv1.f = 0;
    dv1.g = 0;
    dv1.h = 0;
    dv1.k = 0;
    dv1.l = 0;
    dv1.i = 0;
    dv1.j = 0;
  }
  
  public final void a(int paramInt) {
    super.a(paramInt);
  }
  
  public final void d() {
    // Byte code:
    //   0: getstatic ac.b : Z
    //   3: ifne -> 24
    //   6: invokestatic e : ()Laf;
    //   9: getfield s : Z
    //   12: ifne -> 24
    //   15: invokestatic e : ()Laf;
    //   18: getfield db : Z
    //   21: ifeq -> 25
    //   24: return
    //   25: getstatic bp.b : Z
    //   28: ifeq -> 32
    //   31: return
    //   32: getstatic main/a.e : Z
    //   35: ifeq -> 1455
    //   38: invokestatic b : ()Lcq;
    //   41: getfield b : Z
    //   44: ifne -> 1455
    //   47: getstatic main/a.F : Laz;
    //   50: getfield a : Z
    //   53: ifne -> 1455
    //   56: aload_0
    //   57: dup
    //   58: astore_1
    //   59: invokespecial N : ()Z
    //   62: ifne -> 1455
    //   65: iconst_m1
    //   66: putstatic bb.cs : I
    //   69: getstatic main/a.f : Z
    //   72: ifeq -> 995
    //   75: iconst_0
    //   76: iconst_0
    //   77: bipush #60
    //   79: bipush #50
    //   81: invokestatic a : (IIII)Z
    //   84: ifeq -> 140
    //   87: getstatic main/a.l : Z
    //   90: ifeq -> 140
    //   93: getstatic main/a.m : Z
    //   96: ifeq -> 140
    //   99: invokestatic e : ()Laf;
    //   102: getfield an : Lde;
    //   105: ifnull -> 117
    //   108: invokestatic e : ()Laf;
    //   111: getfield an : Lde;
    //   114: invokevirtual a : ()V
    //   117: invokestatic e : ()Laf;
    //   120: aconst_null
    //   121: putfield bP : Ldm;
    //   124: invokestatic l : ()V
    //   127: aload_1
    //   128: iconst_1
    //   129: putfield ez : Z
    //   132: aload_1
    //   133: iconst_5
    //   134: putfield eA : I
    //   137: goto -> 1455
    //   140: invokestatic d : ()Z
    //   143: ifne -> 222
    //   146: getstatic p.eN : I
    //   149: getstatic p.eO : I
    //   152: bipush #34
    //   154: bipush #34
    //   156: invokestatic a : (IIII)Z
    //   159: ifeq -> 222
    //   162: bipush #15
    //   164: putstatic bb.cs : I
    //   167: iconst_0
    //   168: putstatic main/a.ai : Z
    //   171: aload_1
    //   172: iconst_0
    //   173: putfield aT : Z
    //   176: invokestatic b : ()Lcq;
    //   179: getstatic aw.bp : Ljava/lang/String;
    //   182: putfield h : Ljava/lang/String;
    //   185: getstatic main/a.l : Z
    //   188: ifeq -> 222
    //   191: getstatic main/a.m : Z
    //   194: ifeq -> 222
    //   197: invokestatic b : ()Lcq;
    //   200: ldc ''
    //   202: invokevirtual a : (Ljava/lang/String;)V
    //   205: invokestatic a : ()Lbu;
    //   208: pop
    //   209: invokestatic e : ()Laf;
    //   212: aconst_null
    //   213: putfield bP : Ldm;
    //   216: invokestatic l : ()V
    //   219: goto -> 1455
    //   222: invokestatic e : ()Laf;
    //   225: getfield an : Lde;
    //   228: ifnull -> 306
    //   231: invokestatic e : ()Laf;
    //   234: getfield an : Lde;
    //   237: getfield j : I
    //   240: bipush #17
    //   242: isub
    //   243: invokestatic e : ()Laf;
    //   246: getfield an : Lde;
    //   249: getfield k : I
    //   252: bipush #17
    //   254: isub
    //   255: bipush #34
    //   257: bipush #34
    //   259: invokestatic a : (IIII)Z
    //   262: ifeq -> 306
    //   265: bipush #20
    //   267: putstatic bb.cs : I
    //   270: iconst_0
    //   271: putstatic main/a.ai : Z
    //   274: aload_1
    //   275: iconst_0
    //   276: putfield aT : Z
    //   279: getstatic main/a.l : Z
    //   282: ifeq -> 306
    //   285: getstatic main/a.m : Z
    //   288: ifeq -> 306
    //   291: invokestatic l : ()V
    //   294: invokestatic e : ()Laf;
    //   297: getfield an : Lde;
    //   300: invokevirtual a : ()V
    //   303: goto -> 1455
    //   306: aload_1
    //   307: astore_3
    //   308: getstatic p.aO : I
    //   311: ifeq -> 435
    //   314: invokestatic e : ()Laf;
    //   317: getfield H : I
    //   320: bipush #14
    //   322: if_icmpeq -> 435
    //   325: getstatic p.eP : I
    //   328: getstatic p.eQ : I
    //   331: bipush #40
    //   333: bipush #40
    //   335: invokestatic a : (IIII)Z
    //   338: ifeq -> 369
    //   341: iconst_5
    //   342: putstatic bb.cs : I
    //   345: getstatic main/a.m : Z
    //   348: ifeq -> 369
    //   351: getstatic main/a.i : [Z
    //   354: iconst_5
    //   355: iconst_1
    //   356: bastore
    //   357: iconst_0
    //   358: dup
    //   359: putstatic main/a.m : Z
    //   362: dup
    //   363: putstatic main/a.ai : Z
    //   366: putstatic main/a.l : Z
    //   369: getstatic p.dS : Lmain/b;
    //   372: invokevirtual a : ()V
    //   375: getstatic p.eR : I
    //   378: getstatic p.eS : I
    //   381: bipush #34
    //   383: bipush #34
    //   385: invokestatic a : (IIII)Z
    //   388: ifeq -> 435
    //   391: bipush #13
    //   393: putstatic bb.cs : I
    //   396: iconst_0
    //   397: putstatic main/a.ai : Z
    //   400: aload_3
    //   401: iconst_0
    //   402: putfield aT : Z
    //   405: getstatic main/a.l : Z
    //   408: ifeq -> 435
    //   411: getstatic main/a.m : Z
    //   414: ifeq -> 435
    //   417: invokestatic e : ()Laf;
    //   420: invokevirtual J : ()V
    //   423: iconst_0
    //   424: dup
    //   425: putstatic main/a.m : Z
    //   428: dup
    //   429: putstatic main/a.ai : Z
    //   432: putstatic main/a.l : Z
    //   435: getstatic p.aO : I
    //   438: ifne -> 463
    //   441: getstatic p.bx : I
    //   444: getstatic p.by : I
    //   447: bipush #10
    //   449: iadd
    //   450: bipush #40
    //   452: bipush #40
    //   454: invokestatic a : (IIII)Z
    //   457: ifeq -> 545
    //   460: goto -> 482
    //   463: getstatic p.bx : I
    //   466: getstatic p.by : I
    //   469: bipush #10
    //   471: iadd
    //   472: bipush #34
    //   474: bipush #34
    //   476: invokestatic a : (IIII)Z
    //   479: ifeq -> 545
    //   482: invokestatic e : ()Laf;
    //   485: getfield H : I
    //   488: bipush #14
    //   490: if_icmpeq -> 545
    //   493: aload_1
    //   494: getfield aL : Laa;
    //   497: ifnonnull -> 545
    //   500: bipush #10
    //   502: putstatic bb.cs : I
    //   505: iconst_0
    //   506: putstatic main/a.ai : Z
    //   509: aload_1
    //   510: iconst_0
    //   511: putfield aT : Z
    //   514: getstatic main/a.l : Z
    //   517: ifeq -> 545
    //   520: getstatic main/a.m : Z
    //   523: ifeq -> 545
    //   526: getstatic main/a.i : [Z
    //   529: bipush #10
    //   531: iconst_1
    //   532: bastore
    //   533: iconst_0
    //   534: dup
    //   535: putstatic main/a.m : Z
    //   538: dup
    //   539: putstatic main/a.ai : Z
    //   542: putstatic main/a.l : Z
    //   545: getstatic p.aO : I
    //   548: ifne -> 581
    //   551: getstatic p.bx : I
    //   554: iconst_5
    //   555: iadd
    //   556: getstatic p.by : I
    //   559: bipush #6
    //   561: isub
    //   562: bipush #40
    //   564: isub
    //   565: bipush #10
    //   567: iadd
    //   568: bipush #40
    //   570: bipush #40
    //   572: invokestatic a : (IIII)Z
    //   575: ifeq -> 995
    //   578: goto -> 608
    //   581: getstatic p.bx : I
    //   584: iconst_5
    //   585: iadd
    //   586: getstatic p.by : I
    //   589: bipush #6
    //   591: isub
    //   592: bipush #34
    //   594: isub
    //   595: bipush #10
    //   597: iadd
    //   598: bipush #34
    //   600: bipush #34
    //   602: invokestatic a : (IIII)Z
    //   605: ifeq -> 995
    //   608: invokestatic e : ()Laf;
    //   611: getfield H : I
    //   614: bipush #14
    //   616: if_icmpeq -> 995
    //   619: aload_1
    //   620: getfield aL : Laa;
    //   623: ifnonnull -> 995
    //   626: getstatic p.ch : Z
    //   629: ifeq -> 694
    //   632: bipush #14
    //   634: putstatic bb.cs : I
    //   637: iconst_0
    //   638: putstatic main/a.ai : Z
    //   641: aload_1
    //   642: iconst_0
    //   643: putfield aT : Z
    //   646: getstatic main/a.l : Z
    //   649: ifeq -> 995
    //   652: getstatic main/a.m : Z
    //   655: ifeq -> 995
    //   658: getstatic main/a.i : [Z
    //   661: bipush #14
    //   663: iconst_1
    //   664: bastore
    //   665: iconst_0
    //   666: dup
    //   667: putstatic main/a.m : Z
    //   670: dup
    //   671: putstatic main/a.ai : Z
    //   674: putstatic main/a.l : Z
    //   677: iconst_0
    //   678: putstatic p.ch : Z
    //   681: invokestatic a : ()Lbt;
    //   684: iconst_m1
    //   685: iconst_m1
    //   686: iconst_m1
    //   687: iconst_m1
    //   688: invokevirtual a : (BBBS)V
    //   691: goto -> 995
    //   694: getstatic p.ck : Z
    //   697: ifeq -> 859
    //   700: bipush #14
    //   702: putstatic bb.cs : I
    //   705: iconst_0
    //   706: putstatic main/a.ai : Z
    //   709: aload_1
    //   710: iconst_0
    //   711: putfield aT : Z
    //   714: getstatic main/a.l : Z
    //   717: ifeq -> 995
    //   720: getstatic main/a.m : Z
    //   723: ifeq -> 995
    //   726: getstatic main/a.i : [Z
    //   729: bipush #14
    //   731: iconst_1
    //   732: bastore
    //   733: iconst_0
    //   734: dup
    //   735: putstatic main/a.m : Z
    //   738: dup
    //   739: putstatic main/a.ai : Z
    //   742: putstatic main/a.l : Z
    //   745: iconst_0
    //   746: istore #6
    //   748: goto -> 844
    //   751: invokestatic e : ()Laf;
    //   754: getfield aF : [Lh;
    //   757: iload #6
    //   759: aaload
    //   760: dup
    //   761: astore #7
    //   763: ifnull -> 841
    //   766: new java/lang/StringBuffer
    //   769: dup
    //   770: ldc 'find '
    //   772: invokespecial <init> : (Ljava/lang/String;)V
    //   775: aload #7
    //   777: getfield b : Ldd;
    //   780: getfield a : S
    //   783: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   786: invokevirtual toString : ()Ljava/lang/String;
    //   789: invokestatic b : (Ljava/lang/String;)V
    //   792: aload #7
    //   794: getfield b : Ldd;
    //   797: getfield a : S
    //   800: sipush #194
    //   803: if_icmpne -> 841
    //   806: aload #7
    //   808: getfield h : I
    //   811: ifle -> 818
    //   814: iconst_1
    //   815: goto -> 819
    //   818: iconst_0
    //   819: dup
    //   820: putstatic p.ck : Z
    //   823: ifeq -> 841
    //   826: invokestatic a : ()Lbt;
    //   829: iconst_0
    //   830: iconst_1
    //   831: iload #6
    //   833: i2b
    //   834: iconst_m1
    //   835: invokevirtual a : (BBBS)V
    //   838: goto -> 995
    //   841: iinc #6, 1
    //   844: iload #6
    //   846: invokestatic e : ()Laf;
    //   849: getfield aF : [Lh;
    //   852: arraylength
    //   853: if_icmplt -> 751
    //   856: goto -> 995
    //   859: getstatic p.cl : Z
    //   862: ifeq -> 995
    //   865: bipush #14
    //   867: putstatic bb.cs : I
    //   870: iconst_0
    //   871: putstatic main/a.ai : Z
    //   874: aload_1
    //   875: iconst_0
    //   876: putfield aT : Z
    //   879: getstatic main/a.l : Z
    //   882: ifeq -> 995
    //   885: getstatic main/a.m : Z
    //   888: ifeq -> 995
    //   891: getstatic main/a.i : [Z
    //   894: bipush #14
    //   896: iconst_1
    //   897: bastore
    //   898: iconst_0
    //   899: dup
    //   900: putstatic main/a.m : Z
    //   903: dup
    //   904: putstatic main/a.ai : Z
    //   907: putstatic main/a.l : Z
    //   910: iconst_0
    //   911: istore #6
    //   913: goto -> 983
    //   916: invokestatic e : ()Laf;
    //   919: getfield aF : [Lh;
    //   922: iload #6
    //   924: aaload
    //   925: dup
    //   926: astore #7
    //   928: ifnull -> 980
    //   931: aload #7
    //   933: getfield b : Ldd;
    //   936: getfield a : S
    //   939: sipush #193
    //   942: if_icmpne -> 980
    //   945: aload #7
    //   947: getfield h : I
    //   950: ifle -> 957
    //   953: iconst_1
    //   954: goto -> 958
    //   957: iconst_0
    //   958: dup
    //   959: putstatic p.cl : Z
    //   962: ifeq -> 980
    //   965: invokestatic a : ()Lbt;
    //   968: iconst_0
    //   969: iconst_1
    //   970: iload #6
    //   972: i2b
    //   973: iconst_m1
    //   974: invokevirtual a : (BBBS)V
    //   977: goto -> 995
    //   980: iinc #6, 1
    //   983: iload #6
    //   985: invokestatic e : ()Laf;
    //   988: getfield aF : [Lh;
    //   991: arraylength
    //   992: if_icmplt -> 916
    //   995: aload_1
    //   996: getfield aL : Laa;
    //   999: ifnull -> 1009
    //   1002: aload_1
    //   1003: invokespecial K : ()V
    //   1006: goto -> 1373
    //   1009: getstatic p.O : Z
    //   1012: ifeq -> 1373
    //   1015: aload_1
    //   1016: invokespecial J : ()Z
    //   1019: ifne -> 1455
    //   1022: aload_1
    //   1023: iconst_m1
    //   1024: putfield eB : I
    //   1027: iconst_0
    //   1028: istore #6
    //   1030: getstatic p.aQ : [Lbf;
    //   1033: arraylength
    //   1034: iconst_5
    //   1035: if_icmple -> 1133
    //   1038: getstatic p.eV : I
    //   1041: getstatic p.eT : [I
    //   1044: iconst_0
    //   1045: iaload
    //   1046: iadd
    //   1047: getstatic p.dY : I
    //   1050: iconst_2
    //   1051: idiv
    //   1052: isub
    //   1053: bipush #12
    //   1055: iadd
    //   1056: getstatic p.eU : [I
    //   1059: iconst_0
    //   1060: iaload
    //   1061: getstatic p.dY : I
    //   1064: iconst_2
    //   1065: idiv
    //   1066: isub
    //   1067: bipush #12
    //   1069: iadd
    //   1070: iconst_5
    //   1071: getstatic p.dY : I
    //   1074: imul
    //   1075: getstatic p.dY : I
    //   1078: invokestatic a : (IIII)Z
    //   1081: ifne -> 1130
    //   1084: getstatic p.eV : I
    //   1087: getstatic p.eT : [I
    //   1090: iconst_5
    //   1091: iaload
    //   1092: iadd
    //   1093: getstatic p.dY : I
    //   1096: iconst_2
    //   1097: idiv
    //   1098: isub
    //   1099: bipush #12
    //   1101: iadd
    //   1102: getstatic p.eU : [I
    //   1105: iconst_5
    //   1106: iaload
    //   1107: getstatic p.dY : I
    //   1110: iconst_2
    //   1111: idiv
    //   1112: isub
    //   1113: bipush #12
    //   1115: iadd
    //   1116: iconst_5
    //   1117: getstatic p.dY : I
    //   1120: imul
    //   1121: getstatic p.dY : I
    //   1124: invokestatic a : (IIII)Z
    //   1127: ifeq -> 1133
    //   1130: iconst_1
    //   1131: istore #6
    //   1133: iload #6
    //   1135: ifne -> 1239
    //   1138: getstatic p.eV : I
    //   1141: getstatic p.eT : [I
    //   1144: iconst_0
    //   1145: iaload
    //   1146: iadd
    //   1147: getstatic p.dY : I
    //   1150: iconst_2
    //   1151: idiv
    //   1152: isub
    //   1153: bipush #12
    //   1155: iadd
    //   1156: getstatic p.eU : [I
    //   1159: iconst_0
    //   1160: iaload
    //   1161: getstatic p.dY : I
    //   1164: iconst_2
    //   1165: idiv
    //   1166: isub
    //   1167: bipush #12
    //   1169: iadd
    //   1170: iconst_5
    //   1171: getstatic p.dY : I
    //   1174: imul
    //   1175: getstatic p.dY : I
    //   1178: invokestatic a : (IIII)Z
    //   1181: ifne -> 1239
    //   1184: getstatic main/a.f : Z
    //   1187: ifne -> 1373
    //   1190: getstatic p.eV : I
    //   1193: getstatic p.eT : [I
    //   1196: iconst_0
    //   1197: iaload
    //   1198: iadd
    //   1199: getstatic p.dY : I
    //   1202: iconst_2
    //   1203: idiv
    //   1204: isub
    //   1205: bipush #12
    //   1207: iadd
    //   1208: getstatic p.eU : [I
    //   1211: iconst_0
    //   1212: iaload
    //   1213: getstatic p.dY : I
    //   1216: iconst_2
    //   1217: idiv
    //   1218: isub
    //   1219: bipush #12
    //   1221: iadd
    //   1222: getstatic p.dY : I
    //   1225: getstatic p.aQ : [Lbf;
    //   1228: arraylength
    //   1229: getstatic p.dY : I
    //   1232: imul
    //   1233: invokestatic a : (IIII)Z
    //   1236: ifeq -> 1373
    //   1239: iconst_0
    //   1240: putstatic main/a.ai : Z
    //   1243: aload_1
    //   1244: iconst_0
    //   1245: putfield aT : Z
    //   1248: getstatic main/a.t : I
    //   1251: getstatic p.eV : I
    //   1254: getstatic p.eT : [I
    //   1257: iconst_0
    //   1258: iaload
    //   1259: iadd
    //   1260: getstatic p.dY : I
    //   1263: iconst_2
    //   1264: idiv
    //   1265: isub
    //   1266: bipush #12
    //   1268: iadd
    //   1269: isub
    //   1270: getstatic p.dY : I
    //   1273: idiv
    //   1274: istore #7
    //   1276: iload #6
    //   1278: ifeq -> 1295
    //   1281: getstatic main/a.u : I
    //   1284: getstatic p.eU : [I
    //   1287: iconst_0
    //   1288: iaload
    //   1289: if_icmpge -> 1295
    //   1292: iinc #7, 5
    //   1295: aload_1
    //   1296: iload #7
    //   1298: putfield eB : I
    //   1301: getstatic main/a.l : Z
    //   1304: ifeq -> 1373
    //   1307: getstatic main/a.m : Z
    //   1310: ifeq -> 1373
    //   1313: iconst_0
    //   1314: dup
    //   1315: putstatic main/a.m : Z
    //   1318: dup
    //   1319: putstatic main/a.ai : Z
    //   1322: putstatic main/a.l : Z
    //   1325: aload_1
    //   1326: iload #7
    //   1328: putfield ex : I
    //   1331: aload_1
    //   1332: getfield ex : I
    //   1335: getstatic p.aQ : [Lbf;
    //   1338: arraylength
    //   1339: iconst_1
    //   1340: isub
    //   1341: if_icmple -> 1354
    //   1344: aload_1
    //   1345: getstatic p.aQ : [Lbf;
    //   1348: arraylength
    //   1349: iconst_1
    //   1350: isub
    //   1351: putfield ex : I
    //   1354: getstatic p.aQ : [Lbf;
    //   1357: aload_1
    //   1358: getfield ex : I
    //   1361: aaload
    //   1362: dup
    //   1363: astore_2
    //   1364: ifnull -> 1373
    //   1367: aload_1
    //   1368: aload_2
    //   1369: iconst_1
    //   1370: invokespecial a : (Lbf;Z)V
    //   1373: getstatic main/a.m : Z
    //   1376: ifeq -> 1455
    //   1379: getstatic main/a.j : [Z
    //   1382: iconst_1
    //   1383: baload
    //   1384: ifne -> 1420
    //   1387: getstatic main/a.j : [Z
    //   1390: iconst_2
    //   1391: baload
    //   1392: ifne -> 1420
    //   1395: getstatic main/a.j : [Z
    //   1398: iconst_3
    //   1399: baload
    //   1400: ifne -> 1420
    //   1403: getstatic main/a.j : [Z
    //   1406: iconst_4
    //   1407: baload
    //   1408: ifne -> 1420
    //   1411: getstatic main/a.j : [Z
    //   1414: bipush #6
    //   1416: baload
    //   1417: ifeq -> 1424
    //   1420: iconst_0
    //   1421: putstatic main/a.m : Z
    //   1424: getstatic main/a.j : [Z
    //   1427: iconst_1
    //   1428: iconst_0
    //   1429: bastore
    //   1430: getstatic main/a.j : [Z
    //   1433: iconst_2
    //   1434: iconst_0
    //   1435: bastore
    //   1436: getstatic main/a.j : [Z
    //   1439: iconst_3
    //   1440: iconst_0
    //   1441: bastore
    //   1442: getstatic main/a.j : [Z
    //   1445: iconst_4
    //   1446: iconst_0
    //   1447: bastore
    //   1448: getstatic main/a.j : [Z
    //   1451: bipush #6
    //   1453: iconst_0
    //   1454: bastore
    //   1455: aload_0
    //   1456: astore_1
    //   1457: invokestatic currentTimeMillis : ()J
    //   1460: lstore #6
    //   1462: getstatic main/a.i : [Z
    //   1465: iconst_2
    //   1466: baload
    //   1467: ifne -> 1503
    //   1470: getstatic main/a.i : [Z
    //   1473: iconst_4
    //   1474: baload
    //   1475: ifne -> 1503
    //   1478: getstatic main/a.i : [Z
    //   1481: bipush #6
    //   1483: baload
    //   1484: ifne -> 1503
    //   1487: getstatic main/a.i : [Z
    //   1490: iconst_1
    //   1491: baload
    //   1492: ifne -> 1503
    //   1495: getstatic main/a.i : [Z
    //   1498: iconst_3
    //   1499: baload
    //   1500: ifeq -> 1512
    //   1503: aload_1
    //   1504: iconst_0
    //   1505: putfield aX : I
    //   1508: iconst_0
    //   1509: putstatic p.bj : Z
    //   1512: getstatic main/a.i : [Z
    //   1515: iconst_5
    //   1516: baload
    //   1517: ifeq -> 1753
    //   1520: aload_1
    //   1521: getfield aX : I
    //   1524: ifne -> 1729
    //   1527: lload #6
    //   1529: aload_1
    //   1530: getfield el : J
    //   1533: lsub
    //   1534: ldc2_w 800
    //   1537: lcmp
    //   1538: ifge -> 1747
    //   1541: invokestatic e : ()Laf;
    //   1544: getfield aC : Lbf;
    //   1547: ifnull -> 1637
    //   1550: invokestatic e : ()Laf;
    //   1553: getfield aC : Lbf;
    //   1556: getfield a : Let;
    //   1559: getfield d : I
    //   1562: iconst_1
    //   1563: if_icmpeq -> 1586
    //   1566: invokestatic e : ()Laf;
    //   1569: getfield T : J
    //   1572: invokestatic e : ()Laf;
    //   1575: getfield aC : Lbf;
    //   1578: getfield i : I
    //   1581: i2l
    //   1582: lcmp
    //   1583: iflt -> 1633
    //   1586: invokestatic e : ()Laf;
    //   1589: getfield aC : Lbf;
    //   1592: getfield a : Let;
    //   1595: getfield d : I
    //   1598: iconst_1
    //   1599: if_icmpne -> 1637
    //   1602: invokestatic e : ()Laf;
    //   1605: getfield T : J
    //   1608: invokestatic e : ()Laf;
    //   1611: getfield W : J
    //   1614: invokestatic e : ()Laf;
    //   1617: getfield aC : Lbf;
    //   1620: getfield i : I
    //   1623: i2l
    //   1624: lmul
    //   1625: ldc2_w 100
    //   1628: ldiv
    //   1629: lcmp
    //   1630: ifge -> 1637
    //   1633: iconst_0
    //   1634: goto -> 1678
    //   1637: invokestatic e : ()Laf;
    //   1640: getfield aC : Lbf;
    //   1643: ifnull -> 1673
    //   1646: invokestatic e : ()Laf;
    //   1649: getfield aC : Lbf;
    //   1652: getfield a : Let;
    //   1655: getfield c : I
    //   1658: ifle -> 1677
    //   1661: invokestatic e : ()Laf;
    //   1664: getfield aC : Lbf;
    //   1667: getfield c : I
    //   1670: ifne -> 1677
    //   1673: iconst_0
    //   1674: goto -> 1678
    //   1677: iconst_1
    //   1678: ifeq -> 1747
    //   1681: invokestatic e : ()Laf;
    //   1684: getfield aQ : Laa;
    //   1687: ifnonnull -> 1714
    //   1690: invokestatic e : ()Laf;
    //   1693: getfield aU : Laf;
    //   1696: ifnull -> 1747
    //   1699: invokestatic e : ()Laf;
    //   1702: invokestatic e : ()Laf;
    //   1705: getfield aU : Laf;
    //   1708: invokevirtual c : (Laf;)Z
    //   1711: ifeq -> 1747
    //   1714: aload_1
    //   1715: bipush #10
    //   1717: putfield aX : I
    //   1720: getstatic main/a.i : [Z
    //   1723: iconst_5
    //   1724: iconst_0
    //   1725: bastore
    //   1726: goto -> 1747
    //   1729: aload_1
    //   1730: iconst_0
    //   1731: putfield aX : I
    //   1734: getstatic main/a.i : [Z
    //   1737: iconst_4
    //   1738: getstatic main/a.i : [Z
    //   1741: bipush #6
    //   1743: iconst_0
    //   1744: dup_x2
    //   1745: bastore
    //   1746: bastore
    //   1747: aload_1
    //   1748: lload #6
    //   1750: putfield el : J
    //   1753: getstatic main/a.w : I
    //   1756: iconst_5
    //   1757: irem
    //   1758: ifne -> 1901
    //   1761: aload_1
    //   1762: getfield aX : I
    //   1765: ifle -> 1901
    //   1768: invokestatic e : ()Laf;
    //   1771: getfield bP : Ldm;
    //   1774: ifnonnull -> 1901
    //   1777: invokestatic e : ()Laf;
    //   1780: getfield aC : Lbf;
    //   1783: ifnull -> 1816
    //   1786: invokestatic e : ()Laf;
    //   1789: getfield aC : Lbf;
    //   1792: getfield a : Let;
    //   1795: invokevirtual b : ()Z
    //   1798: ifne -> 1813
    //   1801: invokestatic e : ()Laf;
    //   1804: getfield aC : Lbf;
    //   1807: getfield j : Z
    //   1810: ifeq -> 1816
    //   1813: goto -> 1919
    //   1816: invokestatic e : ()Laf;
    //   1819: getfield aQ : Laa;
    //   1822: ifnull -> 1859
    //   1825: invokestatic e : ()Laf;
    //   1828: getfield aQ : Laa;
    //   1831: getfield p : I
    //   1834: iconst_1
    //   1835: if_icmpeq -> 1859
    //   1838: invokestatic e : ()Laf;
    //   1841: getfield aQ : Laa;
    //   1844: getfield p : I
    //   1847: ifeq -> 1859
    //   1850: invokestatic e : ()Laf;
    //   1853: getfield aU : Laf;
    //   1856: ifnull -> 1883
    //   1859: invokestatic e : ()Laf;
    //   1862: getfield aU : Laf;
    //   1865: ifnull -> 1901
    //   1868: invokestatic e : ()Laf;
    //   1871: invokestatic e : ()Laf;
    //   1874: getfield aU : Laf;
    //   1877: invokevirtual c : (Laf;)Z
    //   1880: ifeq -> 1901
    //   1883: invokestatic e : ()Laf;
    //   1886: getfield aC : Lbf;
    //   1889: getfield j : Z
    //   1892: ifne -> 1919
    //   1895: aload_1
    //   1896: iconst_0
    //   1897: iconst_1
    //   1898: invokespecial a : (ZZ)V
    //   1901: aload_1
    //   1902: getfield aX : I
    //   1905: iconst_1
    //   1906: if_icmple -> 1919
    //   1909: aload_1
    //   1910: dup
    //   1911: getfield aX : I
    //   1914: iconst_1
    //   1915: isub
    //   1916: putfield aX : I
    //   1919: getstatic ae.m : Lae;
    //   1922: ifnull -> 1976
    //   1925: getstatic ae.m : Lae;
    //   1928: getfield j : Lde;
    //   1931: astore_1
    //   1932: getstatic main/a.i : [Z
    //   1935: iconst_5
    //   1936: baload
    //   1937: ifne -> 1947
    //   1940: aload_1
    //   1941: invokestatic a : (Lde;)Z
    //   1944: ifeq -> 2308
    //   1947: aload_1
    //   1948: ifnull -> 2308
    //   1951: iconst_0
    //   1952: putstatic main/a.m : Z
    //   1955: getstatic main/a.i : [Z
    //   1958: iconst_5
    //   1959: iconst_0
    //   1960: bastore
    //   1961: iconst_m1
    //   1962: putstatic bb.cs : I
    //   1965: aload_1
    //   1966: ifnull -> 2308
    //   1969: aload_1
    //   1970: invokevirtual a : ()V
    //   1973: goto -> 2308
    //   1976: invokestatic b : ()Lcq;
    //   1979: getfield b : Z
    //   1982: ifne -> 2165
    //   1985: getstatic main/a.i : [Z
    //   1988: bipush #12
    //   1990: baload
    //   1991: ifne -> 2006
    //   1994: getstatic main/a.E : Lbb;
    //   1997: getfield cm : Lde;
    //   2000: invokestatic a : (Lde;)Z
    //   2003: ifeq -> 2046
    //   2006: aload_0
    //   2007: getfield cm : Lde;
    //   2010: ifnull -> 2046
    //   2013: iconst_0
    //   2014: putstatic main/a.m : Z
    //   2017: iconst_0
    //   2018: putstatic main/a.l : Z
    //   2021: getstatic main/a.i : [Z
    //   2024: bipush #12
    //   2026: iconst_0
    //   2027: bastore
    //   2028: iconst_m1
    //   2029: putstatic bb.cs : I
    //   2032: aload_0
    //   2033: getfield cm : Lde;
    //   2036: ifnull -> 2046
    //   2039: aload_0
    //   2040: getfield cm : Lde;
    //   2043: invokevirtual a : ()V
    //   2046: getstatic main/a.i : [Z
    //   2049: bipush #13
    //   2051: baload
    //   2052: ifne -> 2067
    //   2055: getstatic main/a.E : Lbb;
    //   2058: getfield co : Lde;
    //   2061: invokestatic a : (Lde;)Z
    //   2064: ifeq -> 2107
    //   2067: aload_0
    //   2068: getfield co : Lde;
    //   2071: ifnull -> 2107
    //   2074: iconst_0
    //   2075: putstatic main/a.m : Z
    //   2078: iconst_0
    //   2079: putstatic main/a.l : Z
    //   2082: getstatic main/a.i : [Z
    //   2085: bipush #13
    //   2087: iconst_0
    //   2088: bastore
    //   2089: iconst_m1
    //   2090: putstatic bb.cs : I
    //   2093: aload_0
    //   2094: getfield co : Lde;
    //   2097: ifnull -> 2107
    //   2100: aload_0
    //   2101: getfield co : Lde;
    //   2104: invokevirtual a : ()V
    //   2107: getstatic main/a.i : [Z
    //   2110: iconst_5
    //   2111: baload
    //   2112: ifne -> 2127
    //   2115: getstatic main/a.E : Lbb;
    //   2118: getfield cn : Lde;
    //   2121: invokestatic a : (Lde;)Z
    //   2124: ifeq -> 2308
    //   2127: aload_0
    //   2128: getfield cn : Lde;
    //   2131: ifnull -> 2308
    //   2134: iconst_0
    //   2135: putstatic main/a.m : Z
    //   2138: getstatic main/a.i : [Z
    //   2141: iconst_5
    //   2142: iconst_0
    //   2143: bastore
    //   2144: iconst_m1
    //   2145: putstatic bb.cs : I
    //   2148: aload_0
    //   2149: getfield cn : Lde;
    //   2152: ifnull -> 2308
    //   2155: aload_0
    //   2156: getfield cn : Lde;
    //   2159: invokevirtual a : ()V
    //   2162: goto -> 2308
    //   2165: invokestatic b : ()Lcq;
    //   2168: getfield d : Lde;
    //   2171: ifnull -> 2213
    //   2174: getstatic main/a.i : [Z
    //   2177: bipush #12
    //   2179: baload
    //   2180: ifne -> 2195
    //   2183: invokestatic b : ()Lcq;
    //   2186: getfield d : Lde;
    //   2189: invokestatic a : (Lde;)Z
    //   2192: ifeq -> 2213
    //   2195: invokestatic b : ()Lcq;
    //   2198: getfield d : Lde;
    //   2201: ifnull -> 2213
    //   2204: invokestatic b : ()Lcq;
    //   2207: getfield d : Lde;
    //   2210: invokevirtual a : ()V
    //   2213: invokestatic b : ()Lcq;
    //   2216: getfield e : Lde;
    //   2219: ifnull -> 2261
    //   2222: getstatic main/a.i : [Z
    //   2225: bipush #13
    //   2227: baload
    //   2228: ifne -> 2243
    //   2231: invokestatic b : ()Lcq;
    //   2234: getfield e : Lde;
    //   2237: invokestatic a : (Lde;)Z
    //   2240: ifeq -> 2261
    //   2243: invokestatic b : ()Lcq;
    //   2246: getfield e : Lde;
    //   2249: ifnull -> 2261
    //   2252: invokestatic b : ()Lcq;
    //   2255: getfield e : Lde;
    //   2258: invokevirtual a : ()V
    //   2261: invokestatic b : ()Lcq;
    //   2264: getfield f : Lde;
    //   2267: ifnull -> 2308
    //   2270: getstatic main/a.i : [Z
    //   2273: iconst_5
    //   2274: baload
    //   2275: ifne -> 2290
    //   2278: invokestatic b : ()Lcq;
    //   2281: getfield f : Lde;
    //   2284: invokestatic a : (Lde;)Z
    //   2287: ifeq -> 2308
    //   2290: invokestatic b : ()Lcq;
    //   2293: getfield f : Lde;
    //   2296: ifnull -> 2308
    //   2299: invokestatic b : ()Lcq;
    //   2302: getfield f : Lde;
    //   2305: invokevirtual a : ()V
    //   2308: aload_0
    //   2309: astore_1
    //   2310: invokestatic e : ()Laf;
    //   2313: getfield bP : Ldm;
    //   2316: ifnull -> 2353
    //   2319: iconst_0
    //   2320: istore_1
    //   2321: goto -> 2345
    //   2324: getstatic main/a.i : [Z
    //   2327: iload_1
    //   2328: baload
    //   2329: ifeq -> 2342
    //   2332: invokestatic e : ()Laf;
    //   2335: aconst_null
    //   2336: putfield bP : Ldm;
    //   2339: goto -> 2353
    //   2342: iinc #1, 1
    //   2345: iload_1
    //   2346: getstatic main/a.i : [Z
    //   2349: arraylength
    //   2350: if_icmplt -> 2324
    //   2353: invokestatic b : ()Lcq;
    //   2356: getfield b : Z
    //   2359: ifeq -> 2382
    //   2362: getstatic main/a.ag : I
    //   2365: ifeq -> 2382
    //   2368: invokestatic b : ()Lcq;
    //   2371: getstatic main/a.ag : I
    //   2374: invokevirtual a : (I)V
    //   2377: iconst_0
    //   2378: putstatic main/a.ag : I
    //   2381: return
    //   2382: getstatic main/a.F : Laz;
    //   2385: getfield a : Z
    //   2388: ifne -> 2397
    //   2391: getstatic af.bH : Z
    //   2394: ifeq -> 2398
    //   2397: return
    //   2398: getstatic main/a.i : [Z
    //   2401: bipush #10
    //   2403: baload
    //   2404: ifeq -> 2421
    //   2407: getstatic main/a.i : [Z
    //   2410: bipush #10
    //   2412: iconst_0
    //   2413: bastore
    //   2414: aload_0
    //   2415: invokespecial H : ()V
    //   2418: invokestatic f : ()V
    //   2421: getstatic main/a.i : [Z
    //   2424: bipush #11
    //   2426: baload
    //   2427: ifeq -> 2506
    //   2430: aload_0
    //   2431: getfield aL : Laa;
    //   2434: ifnonnull -> 2506
    //   2437: aload_0
    //   2438: getfield bQ : Ldz;
    //   2441: ifnull -> 2457
    //   2444: aload_0
    //   2445: getfield bQ : Ldz;
    //   2448: getfield a : Lde;
    //   2451: invokevirtual a : ()V
    //   2454: goto -> 2496
    //   2457: getstatic p.aE : Leo;
    //   2460: getfield b : Lej;
    //   2463: getfield b : Lr;
    //   2466: ifnull -> 2496
    //   2469: getstatic p.aE : Leo;
    //   2472: getfield b : Lej;
    //   2475: getfield b : Lr;
    //   2478: getfield c : Laf;
    //   2481: ifnull -> 2496
    //   2484: getstatic main/a.G : Lg;
    //   2487: invokevirtual l : ()V
    //   2490: getstatic main/a.G : Lg;
    //   2493: invokevirtual s : ()V
    //   2496: getstatic main/a.i : [Z
    //   2499: bipush #11
    //   2501: iconst_0
    //   2502: bastore
    //   2503: invokestatic f : ()V
    //   2506: getstatic main/a.ag : I
    //   2509: ifeq -> 2537
    //   2512: getstatic cd.g : Z
    //   2515: ifeq -> 2537
    //   2518: getstatic main/a.ag : I
    //   2521: bipush #32
    //   2523: if_icmpne -> 2537
    //   2526: aload_0
    //   2527: invokespecial H : ()V
    //   2530: iconst_0
    //   2531: putstatic main/a.ag : I
    //   2534: invokestatic f : ()V
    //   2537: getstatic main/a.ag : I
    //   2540: ifeq -> 2637
    //   2543: aload_0
    //   2544: getfield aL : Laa;
    //   2547: ifnonnull -> 2637
    //   2550: getstatic cd.g : Z
    //   2553: ifeq -> 2637
    //   2556: getstatic main/a.ag : I
    //   2559: bipush #121
    //   2561: if_icmpne -> 2637
    //   2564: aload_0
    //   2565: getfield bQ : Ldz;
    //   2568: ifnull -> 2591
    //   2571: aload_0
    //   2572: getfield bQ : Ldz;
    //   2575: getfield a : Lde;
    //   2578: invokevirtual a : ()V
    //   2581: iconst_0
    //   2582: putstatic main/a.ag : I
    //   2585: invokestatic f : ()V
    //   2588: goto -> 2637
    //   2591: getstatic p.aE : Leo;
    //   2594: getfield b : Lej;
    //   2597: getfield b : Lr;
    //   2600: ifnull -> 2637
    //   2603: getstatic p.aE : Leo;
    //   2606: getfield b : Lej;
    //   2609: getfield b : Lr;
    //   2612: getfield c : Laf;
    //   2615: ifnull -> 2637
    //   2618: getstatic main/a.G : Lg;
    //   2621: invokevirtual l : ()V
    //   2624: getstatic main/a.G : Lg;
    //   2627: invokevirtual s : ()V
    //   2630: iconst_0
    //   2631: putstatic main/a.ag : I
    //   2634: invokestatic f : ()V
    //   2637: getstatic main/a.i : [Z
    //   2640: bipush #10
    //   2642: baload
    //   2643: ifeq -> 2676
    //   2646: aload_0
    //   2647: getfield aL : Laa;
    //   2650: ifnonnull -> 2676
    //   2653: getstatic main/a.i : [Z
    //   2656: bipush #10
    //   2658: iconst_0
    //   2659: bastore
    //   2660: getstatic p.aE : Leo;
    //   2663: bipush #10
    //   2665: istore_1
    //   2666: dup
    //   2667: astore_1
    //   2668: bipush #10
    //   2670: putfield g : I
    //   2673: invokestatic f : ()V
    //   2676: aload_0
    //   2677: astore_1
    //   2678: getstatic p.dS : Lmain/b;
    //   2681: invokevirtual b : ()Z
    //   2684: ifne -> 3100
    //   2687: getstatic p.aO : I
    //   2690: iconst_1
    //   2691: if_icmpeq -> 3100
    //   2694: invokestatic e : ()Laf;
    //   2697: iconst_1
    //   2698: putfield ap : Z
    //   2701: getstatic main/a.ai : Z
    //   2704: ifeq -> 2745
    //   2707: iconst_0
    //   2708: putstatic main/a.ai : Z
    //   2711: aload_1
    //   2712: iconst_1
    //   2713: putfield aT : Z
    //   2716: aload_1
    //   2717: iconst_0
    //   2718: putfield ee : I
    //   2721: aload_1
    //   2722: aload_1
    //   2723: getstatic main/a.p : I
    //   2726: dup_x1
    //   2727: putfield ec : I
    //   2730: putfield ea : I
    //   2733: aload_1
    //   2734: aload_1
    //   2735: getstatic main/a.q : I
    //   2738: dup_x1
    //   2739: putfield ed : I
    //   2742: putfield eb : I
    //   2745: aload_1
    //   2746: getfield aT : Z
    //   2749: ifeq -> 3041
    //   2752: getstatic main/a.p : I
    //   2755: aload_1
    //   2756: getfield ea : I
    //   2759: isub
    //   2760: istore #6
    //   2762: getstatic main/a.q : I
    //   2765: aload_1
    //   2766: getfield eb : I
    //   2769: isub
    //   2770: istore #7
    //   2772: aload_1
    //   2773: getfield dZ : Z
    //   2776: ifne -> 2816
    //   2779: getstatic main/a.p : I
    //   2782: aload_1
    //   2783: getfield ec : I
    //   2786: isub
    //   2787: invokestatic g : (I)I
    //   2790: bipush #15
    //   2792: if_icmpgt -> 2811
    //   2795: getstatic main/a.q : I
    //   2798: aload_1
    //   2799: getfield ed : I
    //   2802: isub
    //   2803: invokestatic g : (I)I
    //   2806: bipush #15
    //   2808: if_icmple -> 2816
    //   2811: aload_1
    //   2812: iconst_1
    //   2813: putfield dZ : Z
    //   2816: aload_1
    //   2817: getstatic main/a.p : I
    //   2820: putfield ea : I
    //   2823: aload_1
    //   2824: getstatic main/a.q : I
    //   2827: putfield eb : I
    //   2830: aload_1
    //   2831: dup
    //   2832: getfield ee : I
    //   2835: iconst_1
    //   2836: iadd
    //   2837: putfield ee : I
    //   2840: aload_1
    //   2841: getfield dZ : Z
    //   2844: ifeq -> 3041
    //   2847: invokestatic e : ()Laf;
    //   2850: iconst_0
    //   2851: putfield ap : Z
    //   2854: getstatic p.j : I
    //   2857: iload #6
    //   2859: isub
    //   2860: putstatic p.j : I
    //   2863: getstatic p.k : I
    //   2866: iload #7
    //   2868: isub
    //   2869: putstatic p.k : I
    //   2872: getstatic p.j : I
    //   2875: bipush #24
    //   2877: if_icmpge -> 2907
    //   2880: bipush #24
    //   2882: getstatic p.j : I
    //   2885: isub
    //   2886: iconst_3
    //   2887: idiv
    //   2888: dup
    //   2889: istore_2
    //   2890: ifeq -> 2907
    //   2893: getstatic p.j : I
    //   2896: iload #6
    //   2898: iload #6
    //   2900: iload_2
    //   2901: idiv
    //   2902: isub
    //   2903: iadd
    //   2904: putstatic p.j : I
    //   2907: getstatic p.j : I
    //   2910: bipush #24
    //   2912: if_icmpge -> 2920
    //   2915: bipush #24
    //   2917: putstatic p.j : I
    //   2920: getstatic p.j : I
    //   2923: getstatic p.n : I
    //   2926: if_icmple -> 2957
    //   2929: getstatic p.j : I
    //   2932: getstatic p.n : I
    //   2935: isub
    //   2936: iconst_3
    //   2937: idiv
    //   2938: dup
    //   2939: istore_2
    //   2940: ifeq -> 2957
    //   2943: getstatic p.j : I
    //   2946: iload #6
    //   2948: iload #6
    //   2950: iload_2
    //   2951: idiv
    //   2952: isub
    //   2953: iadd
    //   2954: putstatic p.j : I
    //   2957: getstatic p.j : I
    //   2960: getstatic p.n : I
    //   2963: if_icmple -> 2972
    //   2966: getstatic p.n : I
    //   2969: putstatic p.j : I
    //   2972: getstatic p.k : I
    //   2975: ifge -> 3004
    //   2978: iconst_0
    //   2979: getstatic p.k : I
    //   2982: isub
    //   2983: iconst_3
    //   2984: idiv
    //   2985: dup
    //   2986: istore_2
    //   2987: ifeq -> 3004
    //   2990: getstatic p.k : I
    //   2993: iload #7
    //   2995: iload #7
    //   2997: iload_2
    //   2998: idiv
    //   2999: isub
    //   3000: iadd
    //   3001: putstatic p.k : I
    //   3004: getstatic p.k : I
    //   3007: ifge -> 3014
    //   3010: iconst_0
    //   3011: putstatic p.k : I
    //   3014: getstatic p.k : I
    //   3017: getstatic p.cF : I
    //   3020: if_icmple -> 3029
    //   3023: getstatic p.cF : I
    //   3026: putstatic p.k : I
    //   3029: getstatic p.j : I
    //   3032: putstatic p.l : I
    //   3035: getstatic p.k : I
    //   3038: putstatic p.m : I
    //   3041: aload_1
    //   3042: getfield aT : Z
    //   3045: ifeq -> 3100
    //   3048: getstatic main/a.m : Z
    //   3051: ifeq -> 3100
    //   3054: aload_1
    //   3055: iconst_0
    //   3056: putfield aT : Z
    //   3059: aload_1
    //   3060: iconst_0
    //   3061: putfield dZ : Z
    //   3064: getstatic main/a.p : I
    //   3067: aload_1
    //   3068: getfield ec : I
    //   3071: isub
    //   3072: invokestatic g : (I)I
    //   3075: bipush #15
    //   3077: if_icmpgt -> 3096
    //   3080: getstatic main/a.q : I
    //   3083: aload_1
    //   3084: getfield ed : I
    //   3087: isub
    //   3088: invokestatic g : (I)I
    //   3091: bipush #15
    //   3093: if_icmple -> 3100
    //   3096: iconst_0
    //   3097: putstatic main/a.m : Z
    //   3100: invokestatic e : ()Laf;
    //   3103: getfield ci : Z
    //   3106: ifne -> 3863
    //   3109: aload_0
    //   3110: dup
    //   3111: astore_1
    //   3112: invokespecial J : ()Z
    //   3115: ifne -> 3863
    //   3118: aload_1
    //   3119: getfield bQ : Ldz;
    //   3122: ifnull -> 3161
    //   3125: aload_1
    //   3126: getfield bQ : Ldz;
    //   3129: getfield a : Lde;
    //   3132: ifnull -> 3161
    //   3135: aload_1
    //   3136: getfield bQ : Ldz;
    //   3139: getfield a : Lde;
    //   3142: invokevirtual c : ()Z
    //   3145: ifeq -> 3161
    //   3148: aload_1
    //   3149: getfield bQ : Ldz;
    //   3152: getfield a : Lde;
    //   3155: invokevirtual a : ()V
    //   3158: goto -> 3863
    //   3161: aload_1
    //   3162: dup
    //   3163: astore_2
    //   3164: getfield aL : Laa;
    //   3167: ifnull -> 3219
    //   3170: getstatic main/a.A : I
    //   3173: iconst_5
    //   3174: getstatic p.eI : I
    //   3177: imul
    //   3178: isub
    //   3179: iconst_2
    //   3180: idiv
    //   3181: istore_3
    //   3182: iconst_5
    //   3183: getstatic p.eI : I
    //   3186: imul
    //   3187: istore #4
    //   3189: getstatic main/a.B : I
    //   3192: bipush #40
    //   3194: isub
    //   3195: istore #5
    //   3197: getstatic p.eI : I
    //   3200: istore #8
    //   3202: iload_3
    //   3203: iload #5
    //   3205: iload #4
    //   3207: iload #8
    //   3209: invokestatic a : (IIII)Z
    //   3212: ifeq -> 3219
    //   3215: iconst_1
    //   3216: goto -> 3220
    //   3219: iconst_0
    //   3220: ifne -> 3863
    //   3223: invokestatic currentTimeMillis : ()J
    //   3226: lstore #6
    //   3228: aload_1
    //   3229: getfield aU : J
    //   3232: lconst_0
    //   3233: lcmp
    //   3234: ifeq -> 3317
    //   3237: aload_1
    //   3238: lconst_0
    //   3239: putfield aU : J
    //   3242: iconst_0
    //   3243: putstatic main/a.ai : Z
    //   3246: aload_1
    //   3247: getfield ef : Z
    //   3250: ifne -> 3317
    //   3253: aload_1
    //   3254: astore_2
    //   3255: getstatic main/a.p : I
    //   3258: aload_2
    //   3259: getfield ej : I
    //   3262: iadd
    //   3263: istore_3
    //   3264: getstatic main/a.q : I
    //   3267: aload_2
    //   3268: getfield ek : I
    //   3271: iadd
    //   3272: istore #4
    //   3274: aload_2
    //   3275: iload_3
    //   3276: iload #4
    //   3278: invokespecial g : (II)Z
    //   3281: ifne -> 3301
    //   3284: aload_2
    //   3285: iload_3
    //   3286: iload #4
    //   3288: invokespecial f : (II)Z
    //   3291: ifne -> 3301
    //   3294: aload_2
    //   3295: iload_3
    //   3296: iload #4
    //   3298: invokespecial h : (II)V
    //   3301: iconst_0
    //   3302: putstatic main/a.m : Z
    //   3305: aload_1
    //   3306: iconst_1
    //   3307: putfield ct : Z
    //   3310: aload_1
    //   3311: invokestatic d : ()J
    //   3314: putfield cu : J
    //   3317: aload_1
    //   3318: getfield ct : Z
    //   3321: ifeq -> 3583
    //   3324: aload_1
    //   3325: invokestatic d : ()J
    //   3328: putfield cv : J
    //   3331: aload_1
    //   3332: getfield cv : J
    //   3335: aload_1
    //   3336: getfield cu : J
    //   3339: lsub
    //   3340: ldc2_w 300
    //   3343: lcmp
    //   3344: ifge -> 3583
    //   3347: getstatic main/a.m : Z
    //   3350: ifeq -> 3583
    //   3353: aload_1
    //   3354: iconst_0
    //   3355: putfield ct : Z
    //   3358: aload_1
    //   3359: astore_2
    //   3360: getstatic main/a.p : I
    //   3363: aload_2
    //   3364: getfield ej : I
    //   3367: iadd
    //   3368: istore_3
    //   3369: getstatic main/a.q : I
    //   3372: aload_2
    //   3373: getfield ek : I
    //   3376: iadd
    //   3377: istore #4
    //   3379: invokestatic e : ()Laf;
    //   3382: pop
    //   3383: aload_2
    //   3384: iload_3
    //   3385: iload #4
    //   3387: invokespecial e : (II)Lbq;
    //   3390: dup
    //   3391: astore #8
    //   3393: ifnull -> 3556
    //   3396: aload #8
    //   3398: instanceof aa
    //   3401: ifeq -> 3415
    //   3404: aload #8
    //   3406: checkcast aa
    //   3409: invokestatic a : (Laa;)Z
    //   3412: ifeq -> 3576
    //   3415: aload_2
    //   3416: aload #8
    //   3418: invokespecial a : (Lbq;)Z
    //   3421: ifne -> 3583
    //   3424: aload #8
    //   3426: invokestatic e : ()Laf;
    //   3429: getfield aT : Ldo;
    //   3432: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3435: ifne -> 3445
    //   3438: aload_2
    //   3439: getfield aL : Laa;
    //   3442: ifnonnull -> 3583
    //   3445: invokestatic e : ()Laf;
    //   3448: invokevirtual I : ()Z
    //   3451: ifeq -> 3525
    //   3454: invokestatic e : ()Laf;
    //   3457: getfield aU : Laf;
    //   3460: ifnull -> 3525
    //   3463: aload #8
    //   3465: invokestatic e : ()Laf;
    //   3468: getfield aU : Laf;
    //   3471: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3474: ifne -> 3525
    //   3477: aload #8
    //   3479: invokestatic e : ()Laf;
    //   3482: getfield aU : Laf;
    //   3485: getfield aR : Laa;
    //   3488: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3491: ifne -> 3525
    //   3494: aload #8
    //   3496: instanceof af
    //   3499: ifeq -> 3525
    //   3502: aload #8
    //   3504: checkcast af
    //   3507: dup
    //   3508: astore #5
    //   3510: getfield aN : B
    //   3513: iconst_5
    //   3514: if_icmpeq -> 3525
    //   3517: aload #5
    //   3519: invokevirtual I : ()Z
    //   3522: ifeq -> 3576
    //   3525: getstatic bv.l : I
    //   3528: bipush #51
    //   3530: if_icmpne -> 3547
    //   3533: aload #8
    //   3535: invokestatic e : ()Laf;
    //   3538: getfield aT : Ldo;
    //   3541: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3544: ifne -> 3576
    //   3547: aload_2
    //   3548: aload #8
    //   3550: invokespecial b : (Lbq;)V
    //   3553: goto -> 3583
    //   3556: aload_2
    //   3557: iload_3
    //   3558: iload #4
    //   3560: invokespecial g : (II)Z
    //   3563: ifne -> 3583
    //   3566: aload_2
    //   3567: iload_3
    //   3568: iload #4
    //   3570: invokespecial f : (II)Z
    //   3573: ifne -> 3583
    //   3576: aload_2
    //   3577: iload_3
    //   3578: iload #4
    //   3580: invokespecial h : (II)V
    //   3583: getstatic main/a.m : Z
    //   3586: ifeq -> 3863
    //   3589: aload_1
    //   3590: aload_1
    //   3591: astore_2
    //   3592: getstatic main/a.p : I
    //   3595: getstatic p.j : I
    //   3598: iadd
    //   3599: istore_3
    //   3600: getstatic main/a.q : I
    //   3603: getstatic p.k : I
    //   3606: iadd
    //   3607: istore #4
    //   3609: invokestatic e : ()Laf;
    //   3612: pop
    //   3613: aload_2
    //   3614: iload_3
    //   3615: iload #4
    //   3617: invokespecial e : (II)Lbq;
    //   3620: dup
    //   3621: astore #5
    //   3623: ifnull -> 3835
    //   3626: invokestatic e : ()Laf;
    //   3629: invokevirtual I : ()Z
    //   3632: ifeq -> 3716
    //   3635: invokestatic e : ()Laf;
    //   3638: getfield aU : Laf;
    //   3641: ifnull -> 3716
    //   3644: aload #5
    //   3646: invokestatic e : ()Laf;
    //   3649: getfield aU : Laf;
    //   3652: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3655: ifne -> 3716
    //   3658: aload #5
    //   3660: invokestatic e : ()Laf;
    //   3663: getfield aU : Laf;
    //   3666: getfield aR : Laa;
    //   3669: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3672: ifne -> 3716
    //   3675: aload #5
    //   3677: instanceof af
    //   3680: ifeq -> 3716
    //   3683: aload #5
    //   3685: checkcast af
    //   3688: dup
    //   3689: astore #8
    //   3691: getfield aN : B
    //   3694: iconst_5
    //   3695: if_icmpeq -> 3716
    //   3698: aload #8
    //   3700: invokevirtual I : ()Z
    //   3703: ifne -> 3716
    //   3706: aload_2
    //   3707: iload_3
    //   3708: iload #4
    //   3710: invokespecial h : (II)V
    //   3713: goto -> 3835
    //   3716: invokestatic e : ()Laf;
    //   3719: getfield aQ : Laa;
    //   3722: aload #5
    //   3724: if_acmpeq -> 3738
    //   3727: invokestatic e : ()Laf;
    //   3730: getfield aV : Lce;
    //   3733: aload #5
    //   3735: if_acmpne -> 3748
    //   3738: aload_2
    //   3739: aload #5
    //   3741: invokespecial b : (Lbq;)V
    //   3744: iconst_1
    //   3745: goto -> 3836
    //   3748: getstatic bv.l : I
    //   3751: bipush #51
    //   3753: if_icmpne -> 3780
    //   3756: aload #5
    //   3758: invokestatic e : ()Laf;
    //   3761: getfield aT : Ldo;
    //   3764: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3767: ifeq -> 3780
    //   3770: aload_2
    //   3771: iload_3
    //   3772: iload #4
    //   3774: invokespecial h : (II)V
    //   3777: goto -> 3835
    //   3780: invokestatic e : ()Laf;
    //   3783: getfield cf : Lci;
    //   3786: ifnonnull -> 3816
    //   3789: invokestatic e : ()Laf;
    //   3792: getfield cc : Ldq;
    //   3795: ifnonnull -> 3816
    //   3798: invokestatic e : ()Laf;
    //   3801: getfield cd : Lbj;
    //   3804: ifnonnull -> 3816
    //   3807: invokestatic e : ()Laf;
    //   3810: invokevirtual D : ()[Lf;
    //   3813: ifnull -> 3820
    //   3816: iconst_0
    //   3817: goto -> 3836
    //   3820: invokestatic e : ()Laf;
    //   3823: aload #5
    //   3825: invokevirtual a : (Ljava/lang/Object;)V
    //   3828: aload #5
    //   3830: invokeinterface p : ()V
    //   3835: iconst_0
    //   3836: putfield ef : Z
    //   3839: aload_1
    //   3840: lload #6
    //   3842: putfield aU : J
    //   3845: aload_1
    //   3846: getstatic p.j : I
    //   3849: putfield ej : I
    //   3852: aload_1
    //   3853: getstatic p.k : I
    //   3856: putfield ek : I
    //   3859: iconst_0
    //   3860: putstatic main/a.m : Z
    //   3863: invokestatic e : ()Laf;
    //   3866: getfield an : Lde;
    //   3869: ifnull -> 3893
    //   3872: invokestatic e : ()Laf;
    //   3875: getfield an : Lde;
    //   3878: invokevirtual c : ()Z
    //   3881: ifeq -> 3893
    //   3884: invokestatic e : ()Laf;
    //   3887: getfield an : Lde;
    //   3890: invokevirtual a : ()V
    //   3893: invokestatic e : ()Laf;
    //   3896: getfield cf : Lci;
    //   3899: ifnull -> 3903
    //   3902: return
    //   3903: invokestatic e : ()Laf;
    //   3906: getfield H : I
    //   3909: iconst_1
    //   3910: if_icmpne -> 4225
    //   3913: getstatic main/a.i : [Z
    //   3916: iconst_5
    //   3917: baload
    //   3918: ifeq -> 3936
    //   3921: getstatic main/a.i : [Z
    //   3924: iconst_5
    //   3925: iconst_0
    //   3926: bastore
    //   3927: aload_0
    //   3928: iconst_0
    //   3929: iconst_0
    //   3930: invokespecial a : (ZZ)V
    //   3933: goto -> 5434
    //   3936: getstatic main/a.j : [Z
    //   3939: iconst_2
    //   3940: baload
    //   3941: ifeq -> 4025
    //   3944: invokestatic e : ()Laf;
    //   3947: getfield bJ : Z
    //   3950: ifne -> 5434
    //   3953: iconst_0
    //   3954: istore_1
    //   3955: invokestatic e : ()Laf;
    //   3958: getfield B : I
    //   3961: invokestatic e : ()Laf;
    //   3964: getfield bD : I
    //   3967: isub
    //   3968: ifne -> 3987
    //   3971: invokestatic e : ()Laf;
    //   3974: getfield C : I
    //   3977: invokestatic e : ()Laf;
    //   3980: getfield bE : I
    //   3983: isub
    //   3984: ifeq -> 3993
    //   3987: invokestatic a : ()Lbt;
    //   3990: invokevirtual g : ()V
    //   3993: invokestatic e : ()Laf;
    //   3996: bipush #-10
    //   3998: putfield E : I
    //   4001: invokestatic e : ()Laf;
    //   4004: iconst_0
    //   4005: putfield D : I
    //   4008: invokestatic e : ()Laf;
    //   4011: iconst_3
    //   4012: putfield H : I
    //   4015: invokestatic e : ()Laf;
    //   4018: iconst_0
    //   4019: putfield F : I
    //   4022: goto -> 5434
    //   4025: getstatic main/a.j : [Z
    //   4028: iconst_4
    //   4029: baload
    //   4030: ifeq -> 4125
    //   4033: iconst_0
    //   4034: putstatic p.bj : Z
    //   4037: invokestatic e : ()Laf;
    //   4040: iconst_0
    //   4041: putfield ar : Z
    //   4044: invokestatic e : ()Laf;
    //   4047: getfield I : I
    //   4050: iconst_1
    //   4051: if_icmpne -> 4064
    //   4054: invokestatic e : ()Laf;
    //   4057: iconst_m1
    //   4058: putfield I : I
    //   4061: goto -> 4115
    //   4064: invokestatic e : ()Laf;
    //   4067: getfield bJ : Z
    //   4070: ifne -> 4115
    //   4073: invokestatic e : ()Laf;
    //   4076: getfield B : I
    //   4079: invokestatic e : ()Laf;
    //   4082: getfield bD : I
    //   4085: isub
    //   4086: ifeq -> 4095
    //   4089: invokestatic a : ()Lbt;
    //   4092: invokevirtual g : ()V
    //   4095: invokestatic e : ()Laf;
    //   4098: iconst_2
    //   4099: putfield H : I
    //   4102: invokestatic e : ()Laf;
    //   4105: invokestatic e : ()Laf;
    //   4108: getfield O : I
    //   4111: ineg
    //   4112: putfield D : I
    //   4115: invokestatic e : ()Laf;
    //   4118: iconst_0
    //   4119: putfield cJ : Z
    //   4122: goto -> 5434
    //   4125: getstatic main/a.j : [Z
    //   4128: bipush #6
    //   4130: baload
    //   4131: ifeq -> 5434
    //   4134: iconst_0
    //   4135: putstatic p.bj : Z
    //   4138: invokestatic e : ()Laf;
    //   4141: iconst_0
    //   4142: putfield ar : Z
    //   4145: invokestatic e : ()Laf;
    //   4148: getfield I : I
    //   4151: iconst_m1
    //   4152: if_icmpne -> 4165
    //   4155: invokestatic e : ()Laf;
    //   4158: iconst_1
    //   4159: putfield I : I
    //   4162: goto -> 4215
    //   4165: invokestatic e : ()Laf;
    //   4168: getfield bJ : Z
    //   4171: ifne -> 4215
    //   4174: invokestatic e : ()Laf;
    //   4177: getfield B : I
    //   4180: invokestatic e : ()Laf;
    //   4183: getfield bD : I
    //   4186: isub
    //   4187: ifeq -> 4196
    //   4190: invokestatic a : ()Lbt;
    //   4193: invokevirtual g : ()V
    //   4196: invokestatic e : ()Laf;
    //   4199: iconst_2
    //   4200: putfield H : I
    //   4203: invokestatic e : ()Laf;
    //   4206: invokestatic e : ()Laf;
    //   4209: getfield O : I
    //   4212: putfield D : I
    //   4215: invokestatic e : ()Laf;
    //   4218: iconst_0
    //   4219: putfield cJ : Z
    //   4222: goto -> 5434
    //   4225: invokestatic e : ()Laf;
    //   4228: getfield H : I
    //   4231: iconst_2
    //   4232: if_icmpne -> 4433
    //   4235: getstatic main/a.i : [Z
    //   4238: iconst_5
    //   4239: baload
    //   4240: ifeq -> 4258
    //   4243: getstatic main/a.i : [Z
    //   4246: iconst_5
    //   4247: iconst_0
    //   4248: bastore
    //   4249: aload_0
    //   4250: iconst_0
    //   4251: iconst_1
    //   4252: invokespecial a : (ZZ)V
    //   4255: goto -> 5434
    //   4258: getstatic main/a.j : [Z
    //   4261: iconst_2
    //   4262: baload
    //   4263: ifeq -> 4329
    //   4266: invokestatic e : ()Laf;
    //   4269: getfield B : I
    //   4272: invokestatic e : ()Laf;
    //   4275: getfield bD : I
    //   4278: isub
    //   4279: ifne -> 4298
    //   4282: invokestatic e : ()Laf;
    //   4285: getfield C : I
    //   4288: invokestatic e : ()Laf;
    //   4291: getfield bE : I
    //   4294: isub
    //   4295: ifeq -> 4304
    //   4298: invokestatic a : ()Lbt;
    //   4301: invokevirtual g : ()V
    //   4304: invokestatic e : ()Laf;
    //   4307: bipush #-10
    //   4309: putfield E : I
    //   4312: invokestatic e : ()Laf;
    //   4315: iconst_3
    //   4316: putfield H : I
    //   4319: invokestatic e : ()Laf;
    //   4322: iconst_0
    //   4323: putfield F : I
    //   4326: goto -> 5434
    //   4329: getstatic main/a.j : [Z
    //   4332: iconst_4
    //   4333: baload
    //   4334: ifeq -> 4381
    //   4337: iconst_0
    //   4338: putstatic p.bj : Z
    //   4341: invokestatic e : ()Laf;
    //   4344: getfield I : I
    //   4347: iconst_1
    //   4348: if_icmpne -> 4361
    //   4351: invokestatic e : ()Laf;
    //   4354: iconst_m1
    //   4355: putfield I : I
    //   4358: goto -> 5434
    //   4361: invokestatic e : ()Laf;
    //   4364: invokestatic e : ()Laf;
    //   4367: getfield O : I
    //   4370: ineg
    //   4371: invokestatic e : ()Laf;
    //   4374: pop
    //   4375: putfield D : I
    //   4378: goto -> 5434
    //   4381: getstatic main/a.j : [Z
    //   4384: bipush #6
    //   4386: baload
    //   4387: ifeq -> 5434
    //   4390: iconst_0
    //   4391: putstatic p.bj : Z
    //   4394: invokestatic e : ()Laf;
    //   4397: getfield I : I
    //   4400: iconst_m1
    //   4401: if_icmpne -> 4414
    //   4404: invokestatic e : ()Laf;
    //   4407: iconst_1
    //   4408: putfield I : I
    //   4411: goto -> 5434
    //   4414: invokestatic e : ()Laf;
    //   4417: invokestatic e : ()Laf;
    //   4420: getfield O : I
    //   4423: invokestatic e : ()Laf;
    //   4426: pop
    //   4427: putfield D : I
    //   4430: goto -> 5434
    //   4433: invokestatic e : ()Laf;
    //   4436: getfield H : I
    //   4439: iconst_3
    //   4440: if_icmpne -> 4678
    //   4443: iconst_0
    //   4444: putstatic p.bj : Z
    //   4447: getstatic main/a.i : [Z
    //   4450: iconst_5
    //   4451: baload
    //   4452: ifeq -> 4467
    //   4455: getstatic main/a.i : [Z
    //   4458: iconst_5
    //   4459: iconst_0
    //   4460: bastore
    //   4461: aload_0
    //   4462: iconst_0
    //   4463: iconst_1
    //   4464: invokespecial a : (ZZ)V
    //   4467: getstatic main/a.j : [Z
    //   4470: iconst_4
    //   4471: baload
    //   4472: ifne -> 4490
    //   4475: getstatic main/a.j : [Z
    //   4478: iconst_1
    //   4479: baload
    //   4480: ifeq -> 4526
    //   4483: aload_0
    //   4484: getfield aL : Laa;
    //   4487: ifnonnull -> 4526
    //   4490: invokestatic e : ()Laf;
    //   4493: getfield I : I
    //   4496: iconst_1
    //   4497: if_icmpne -> 4510
    //   4500: invokestatic e : ()Laf;
    //   4503: iconst_m1
    //   4504: putfield I : I
    //   4507: goto -> 4582
    //   4510: invokestatic e : ()Laf;
    //   4513: invokestatic e : ()Laf;
    //   4516: getfield O : I
    //   4519: ineg
    //   4520: putfield D : I
    //   4523: goto -> 4582
    //   4526: getstatic main/a.j : [Z
    //   4529: bipush #6
    //   4531: baload
    //   4532: ifne -> 4550
    //   4535: getstatic main/a.j : [Z
    //   4538: iconst_3
    //   4539: baload
    //   4540: ifeq -> 4582
    //   4543: aload_0
    //   4544: getfield aL : Laa;
    //   4547: ifnonnull -> 4582
    //   4550: invokestatic e : ()Laf;
    //   4553: getfield I : I
    //   4556: iconst_m1
    //   4557: if_icmpne -> 4570
    //   4560: invokestatic e : ()Laf;
    //   4563: iconst_1
    //   4564: putfield I : I
    //   4567: goto -> 4582
    //   4570: invokestatic e : ()Laf;
    //   4573: invokestatic e : ()Laf;
    //   4576: getfield O : I
    //   4579: putfield D : I
    //   4582: getstatic main/a.j : [Z
    //   4585: iconst_2
    //   4586: baload
    //   4587: ifne -> 4613
    //   4590: getstatic main/a.j : [Z
    //   4593: iconst_1
    //   4594: baload
    //   4595: ifne -> 4606
    //   4598: getstatic main/a.j : [Z
    //   4601: iconst_3
    //   4602: baload
    //   4603: ifeq -> 5434
    //   4606: aload_0
    //   4607: getfield aL : Laa;
    //   4610: ifnonnull -> 5434
    //   4613: invokestatic e : ()Laf;
    //   4616: getfield ao : Z
    //   4619: ifeq -> 5434
    //   4622: invokestatic e : ()Laf;
    //   4625: getfield T : J
    //   4628: lconst_0
    //   4629: lcmp
    //   4630: ifle -> 5434
    //   4633: invokestatic e : ()Laf;
    //   4636: getfield F : I
    //   4639: bipush #8
    //   4641: if_icmpge -> 5434
    //   4644: invokestatic e : ()Laf;
    //   4647: getfield E : I
    //   4650: bipush #-4
    //   4652: if_icmple -> 5434
    //   4655: invokestatic e : ()Laf;
    //   4658: dup
    //   4659: getfield F : I
    //   4662: iconst_1
    //   4663: iadd
    //   4664: putfield F : I
    //   4667: invokestatic e : ()Laf;
    //   4670: bipush #-7
    //   4672: putfield E : I
    //   4675: goto -> 5434
    //   4678: invokestatic e : ()Laf;
    //   4681: getfield H : I
    //   4684: iconst_4
    //   4685: if_icmpne -> 5048
    //   4688: getstatic main/a.i : [Z
    //   4691: iconst_5
    //   4692: baload
    //   4693: ifeq -> 4708
    //   4696: getstatic main/a.i : [Z
    //   4699: iconst_5
    //   4700: iconst_0
    //   4701: bastore
    //   4702: aload_0
    //   4703: iconst_0
    //   4704: iconst_1
    //   4705: invokespecial a : (ZZ)V
    //   4708: getstatic main/a.j : [Z
    //   4711: iconst_2
    //   4712: baload
    //   4713: ifeq -> 4842
    //   4716: invokestatic e : ()Laf;
    //   4719: getfield T : J
    //   4722: lconst_0
    //   4723: lcmp
    //   4724: ifle -> 4842
    //   4727: invokestatic e : ()Laf;
    //   4730: getfield ao : Z
    //   4733: ifeq -> 4842
    //   4736: iconst_0
    //   4737: putstatic p.bj : Z
    //   4740: invokestatic e : ()Laf;
    //   4743: getfield B : I
    //   4746: invokestatic e : ()Laf;
    //   4749: getfield bD : I
    //   4752: isub
    //   4753: ifne -> 4772
    //   4756: invokestatic e : ()Laf;
    //   4759: getfield C : I
    //   4762: invokestatic e : ()Laf;
    //   4765: getfield bE : I
    //   4768: isub
    //   4769: ifeq -> 4820
    //   4772: invokestatic e : ()Laf;
    //   4775: getfield B : I
    //   4778: invokestatic e : ()Laf;
    //   4781: getfield bD : I
    //   4784: isub
    //   4785: invokestatic g : (I)I
    //   4788: bipush #96
    //   4790: if_icmpgt -> 4814
    //   4793: invokestatic e : ()Laf;
    //   4796: getfield C : I
    //   4799: invokestatic e : ()Laf;
    //   4802: getfield bE : I
    //   4805: isub
    //   4806: invokestatic g : (I)I
    //   4809: bipush #24
    //   4811: if_icmple -> 4820
    //   4814: invokestatic a : ()Lbt;
    //   4817: invokevirtual g : ()V
    //   4820: invokestatic e : ()Laf;
    //   4823: bipush #-10
    //   4825: putfield E : I
    //   4828: invokestatic e : ()Laf;
    //   4831: iconst_3
    //   4832: putfield H : I
    //   4835: invokestatic e : ()Laf;
    //   4838: iconst_0
    //   4839: putfield F : I
    //   4842: getstatic main/a.j : [Z
    //   4845: iconst_4
    //   4846: baload
    //   4847: ifeq -> 4945
    //   4850: iconst_0
    //   4851: putstatic p.bj : Z
    //   4854: invokestatic e : ()Laf;
    //   4857: getfield I : I
    //   4860: iconst_1
    //   4861: if_icmpne -> 4874
    //   4864: invokestatic e : ()Laf;
    //   4867: iconst_m1
    //   4868: putfield I : I
    //   4871: goto -> 5434
    //   4874: invokestatic e : ()Laf;
    //   4877: dup
    //   4878: getfield F : I
    //   4881: iconst_1
    //   4882: iadd
    //   4883: putfield F : I
    //   4886: invokestatic e : ()Laf;
    //   4889: invokestatic e : ()Laf;
    //   4892: getfield O : I
    //   4895: ineg
    //   4896: putfield D : I
    //   4899: invokestatic e : ()Laf;
    //   4902: getfield F : I
    //   4905: iconst_5
    //   4906: if_icmple -> 5434
    //   4909: invokestatic e : ()Laf;
    //   4912: getfield E : I
    //   4915: bipush #6
    //   4917: if_icmple -> 5434
    //   4920: invokestatic e : ()Laf;
    //   4923: bipush #10
    //   4925: putfield H : I
    //   4928: invokestatic e : ()Laf;
    //   4931: iconst_0
    //   4932: putfield F : I
    //   4935: invokestatic e : ()Laf;
    //   4938: iconst_0
    //   4939: putfield E : I
    //   4942: goto -> 5434
    //   4945: getstatic main/a.j : [Z
    //   4948: bipush #6
    //   4950: baload
    //   4951: ifeq -> 5434
    //   4954: iconst_0
    //   4955: putstatic p.bj : Z
    //   4958: invokestatic e : ()Laf;
    //   4961: getfield I : I
    //   4964: iconst_m1
    //   4965: if_icmpne -> 4978
    //   4968: invokestatic e : ()Laf;
    //   4971: iconst_1
    //   4972: putfield I : I
    //   4975: goto -> 5434
    //   4978: invokestatic e : ()Laf;
    //   4981: dup
    //   4982: getfield F : I
    //   4985: iconst_1
    //   4986: iadd
    //   4987: putfield F : I
    //   4990: invokestatic e : ()Laf;
    //   4993: invokestatic e : ()Laf;
    //   4996: getfield O : I
    //   4999: putfield D : I
    //   5002: invokestatic e : ()Laf;
    //   5005: getfield F : I
    //   5008: iconst_5
    //   5009: if_icmple -> 5434
    //   5012: invokestatic e : ()Laf;
    //   5015: getfield E : I
    //   5018: bipush #6
    //   5020: if_icmple -> 5434
    //   5023: invokestatic e : ()Laf;
    //   5026: bipush #10
    //   5028: putfield H : I
    //   5031: invokestatic e : ()Laf;
    //   5034: iconst_0
    //   5035: putfield F : I
    //   5038: invokestatic e : ()Laf;
    //   5041: iconst_0
    //   5042: putfield E : I
    //   5045: goto -> 5434
    //   5048: invokestatic e : ()Laf;
    //   5051: getfield H : I
    //   5054: bipush #10
    //   5056: if_icmpne -> 5312
    //   5059: getstatic main/a.i : [Z
    //   5062: iconst_5
    //   5063: baload
    //   5064: ifeq -> 5079
    //   5067: getstatic main/a.i : [Z
    //   5070: iconst_5
    //   5071: iconst_0
    //   5072: bastore
    //   5073: aload_0
    //   5074: iconst_0
    //   5075: iconst_1
    //   5076: invokespecial a : (ZZ)V
    //   5079: invokestatic e : ()Laf;
    //   5082: getfield ao : Z
    //   5085: ifeq -> 5434
    //   5088: invokestatic e : ()Laf;
    //   5091: getfield T : J
    //   5094: lconst_0
    //   5095: lcmp
    //   5096: ifle -> 5434
    //   5099: getstatic main/a.j : [Z
    //   5102: iconst_2
    //   5103: baload
    //   5104: ifeq -> 5216
    //   5107: iconst_0
    //   5108: putstatic p.bj : Z
    //   5111: invokestatic e : ()Laf;
    //   5114: getfield B : I
    //   5117: invokestatic e : ()Laf;
    //   5120: getfield bD : I
    //   5123: isub
    //   5124: ifne -> 5143
    //   5127: invokestatic e : ()Laf;
    //   5130: getfield C : I
    //   5133: invokestatic e : ()Laf;
    //   5136: getfield bE : I
    //   5139: isub
    //   5140: ifeq -> 5191
    //   5143: invokestatic e : ()Laf;
    //   5146: getfield B : I
    //   5149: invokestatic e : ()Laf;
    //   5152: getfield bD : I
    //   5155: isub
    //   5156: invokestatic g : (I)I
    //   5159: bipush #96
    //   5161: if_icmpgt -> 5185
    //   5164: invokestatic e : ()Laf;
    //   5167: getfield C : I
    //   5170: invokestatic e : ()Laf;
    //   5173: getfield bE : I
    //   5176: isub
    //   5177: invokestatic g : (I)I
    //   5180: bipush #24
    //   5182: if_icmple -> 5191
    //   5185: invokestatic a : ()Lbt;
    //   5188: invokevirtual g : ()V
    //   5191: invokestatic e : ()Laf;
    //   5194: bipush #-10
    //   5196: putfield E : I
    //   5199: invokestatic e : ()Laf;
    //   5202: iconst_3
    //   5203: putfield H : I
    //   5206: invokestatic e : ()Laf;
    //   5209: iconst_0
    //   5210: putfield F : I
    //   5213: goto -> 5434
    //   5216: getstatic main/a.j : [Z
    //   5219: iconst_4
    //   5220: baload
    //   5221: ifeq -> 5266
    //   5224: iconst_0
    //   5225: putstatic p.bj : Z
    //   5228: invokestatic e : ()Laf;
    //   5231: getfield I : I
    //   5234: iconst_1
    //   5235: if_icmpne -> 5248
    //   5238: invokestatic e : ()Laf;
    //   5241: iconst_m1
    //   5242: putfield I : I
    //   5245: goto -> 5434
    //   5248: invokestatic e : ()Laf;
    //   5251: invokestatic e : ()Laf;
    //   5254: getfield O : I
    //   5257: iconst_1
    //   5258: iadd
    //   5259: ineg
    //   5260: putfield D : I
    //   5263: goto -> 5434
    //   5266: getstatic main/a.j : [Z
    //   5269: bipush #6
    //   5271: baload
    //   5272: ifeq -> 5434
    //   5275: invokestatic e : ()Laf;
    //   5278: getfield I : I
    //   5281: iconst_m1
    //   5282: if_icmpne -> 5295
    //   5285: invokestatic e : ()Laf;
    //   5288: iconst_1
    //   5289: putfield I : I
    //   5292: goto -> 5434
    //   5295: invokestatic e : ()Laf;
    //   5298: invokestatic e : ()Laf;
    //   5301: getfield O : I
    //   5304: iconst_1
    //   5305: iadd
    //   5306: putfield D : I
    //   5309: goto -> 5434
    //   5312: invokestatic e : ()Laf;
    //   5315: getfield H : I
    //   5318: bipush #7
    //   5320: if_icmpne -> 5434
    //   5323: getstatic main/a.i : [Z
    //   5326: iconst_5
    //   5327: baload
    //   5328: ifeq -> 5337
    //   5331: getstatic main/a.i : [Z
    //   5334: iconst_5
    //   5335: iconst_0
    //   5336: bastore
    //   5337: getstatic main/a.j : [Z
    //   5340: iconst_4
    //   5341: baload
    //   5342: ifeq -> 5387
    //   5345: iconst_0
    //   5346: putstatic p.bj : Z
    //   5349: invokestatic e : ()Laf;
    //   5352: getfield I : I
    //   5355: iconst_1
    //   5356: if_icmpne -> 5369
    //   5359: invokestatic e : ()Laf;
    //   5362: iconst_m1
    //   5363: putfield I : I
    //   5366: goto -> 5434
    //   5369: invokestatic e : ()Laf;
    //   5372: invokestatic e : ()Laf;
    //   5375: getfield O : I
    //   5378: ineg
    //   5379: iconst_2
    //   5380: iadd
    //   5381: putfield D : I
    //   5384: goto -> 5434
    //   5387: getstatic main/a.j : [Z
    //   5390: bipush #6
    //   5392: baload
    //   5393: ifeq -> 5434
    //   5396: iconst_0
    //   5397: putstatic p.bj : Z
    //   5400: invokestatic e : ()Laf;
    //   5403: getfield I : I
    //   5406: iconst_m1
    //   5407: if_icmpne -> 5420
    //   5410: invokestatic e : ()Laf;
    //   5413: iconst_1
    //   5414: putfield I : I
    //   5417: goto -> 5434
    //   5420: invokestatic e : ()Laf;
    //   5423: invokestatic e : ()Laf;
    //   5426: getfield O : I
    //   5429: iconst_2
    //   5430: isub
    //   5431: putfield D : I
    //   5434: getstatic main/a.i : [Z
    //   5437: bipush #8
    //   5439: baload
    //   5440: ifeq -> 5465
    //   5443: getstatic main/a.ag : I
    //   5446: bipush #56
    //   5448: if_icmpeq -> 5465
    //   5451: getstatic main/a.i : [Z
    //   5454: bipush #8
    //   5456: iconst_0
    //   5457: bastore
    //   5458: invokestatic e : ()Laf;
    //   5461: iconst_0
    //   5462: putfield bQ : I
    //   5465: getstatic main/a.i : [Z
    //   5468: bipush #10
    //   5470: baload
    //   5471: ifeq -> 5485
    //   5474: getstatic main/a.i : [Z
    //   5477: bipush #10
    //   5479: iconst_0
    //   5480: bastore
    //   5481: aload_0
    //   5482: invokespecial H : ()V
    //   5485: getstatic main/a.ag : I
    //   5488: ifeq -> 6046
    //   5491: aload_0
    //   5492: getfield aL : Laa;
    //   5495: ifnonnull -> 5865
    //   5498: getstatic cd.g : Z
    //   5501: ifeq -> 5680
    //   5504: getstatic main/a.ag : I
    //   5507: bipush #113
    //   5509: if_icmpne -> 5533
    //   5512: getstatic p.aP : [Lbf;
    //   5515: iconst_0
    //   5516: aaload
    //   5517: ifnull -> 6042
    //   5520: aload_0
    //   5521: getstatic p.aP : [Lbf;
    //   5524: iconst_0
    //   5525: aaload
    //   5526: iconst_1
    //   5527: invokespecial a : (Lbf;Z)V
    //   5530: goto -> 6042
    //   5533: getstatic main/a.ag : I
    //   5536: bipush #119
    //   5538: if_icmpne -> 5562
    //   5541: getstatic p.aP : [Lbf;
    //   5544: iconst_1
    //   5545: aaload
    //   5546: ifnull -> 6042
    //   5549: aload_0
    //   5550: getstatic p.aP : [Lbf;
    //   5553: iconst_1
    //   5554: aaload
    //   5555: iconst_1
    //   5556: invokespecial a : (Lbf;Z)V
    //   5559: goto -> 6042
    //   5562: getstatic main/a.ag : I
    //   5565: bipush #101
    //   5567: if_icmpne -> 5591
    //   5570: getstatic p.aP : [Lbf;
    //   5573: iconst_2
    //   5574: aaload
    //   5575: ifnull -> 6042
    //   5578: aload_0
    //   5579: getstatic p.aP : [Lbf;
    //   5582: iconst_2
    //   5583: aaload
    //   5584: iconst_1
    //   5585: invokespecial a : (Lbf;Z)V
    //   5588: goto -> 6042
    //   5591: getstatic main/a.ag : I
    //   5594: bipush #114
    //   5596: if_icmpne -> 5620
    //   5599: getstatic p.aP : [Lbf;
    //   5602: iconst_3
    //   5603: aaload
    //   5604: ifnull -> 6042
    //   5607: aload_0
    //   5608: getstatic p.aP : [Lbf;
    //   5611: iconst_3
    //   5612: aaload
    //   5613: iconst_1
    //   5614: invokespecial a : (Lbf;Z)V
    //   5617: goto -> 6042
    //   5620: getstatic main/a.ag : I
    //   5623: bipush #116
    //   5625: if_icmpne -> 5649
    //   5628: getstatic p.aP : [Lbf;
    //   5631: iconst_4
    //   5632: aaload
    //   5633: ifnull -> 6042
    //   5636: aload_0
    //   5637: getstatic p.aP : [Lbf;
    //   5640: iconst_4
    //   5641: aaload
    //   5642: iconst_1
    //   5643: invokespecial a : (Lbf;Z)V
    //   5646: goto -> 6042
    //   5649: getstatic main/a.ag : I
    //   5652: bipush #50
    //   5654: if_icmpeq -> 6042
    //   5657: getstatic main/a.ag : I
    //   5660: bipush #53
    //   5662: if_icmpeq -> 6042
    //   5665: invokestatic b : ()Lcq;
    //   5668: getstatic main/a.ag : I
    //   5671: aload_0
    //   5672: ldc ''
    //   5674: invokevirtual a : (ILbx;Ljava/lang/String;)V
    //   5677: goto -> 6042
    //   5680: getstatic main/a.c : Z
    //   5683: ifne -> 5701
    //   5686: invokestatic b : ()Lcq;
    //   5689: getstatic main/a.ag : I
    //   5692: aload_0
    //   5693: ldc ''
    //   5695: invokevirtual a : (ILbx;Ljava/lang/String;)V
    //   5698: goto -> 6042
    //   5701: getstatic main/a.ag : I
    //   5704: bipush #55
    //   5706: if_icmpne -> 5730
    //   5709: getstatic p.aP : [Lbf;
    //   5712: iconst_0
    //   5713: aaload
    //   5714: ifnull -> 6042
    //   5717: aload_0
    //   5718: getstatic p.aP : [Lbf;
    //   5721: iconst_0
    //   5722: aaload
    //   5723: iconst_1
    //   5724: invokespecial a : (Lbf;Z)V
    //   5727: goto -> 6042
    //   5730: getstatic main/a.ag : I
    //   5733: bipush #56
    //   5735: if_icmpne -> 5759
    //   5738: getstatic p.aP : [Lbf;
    //   5741: iconst_1
    //   5742: aaload
    //   5743: ifnull -> 6042
    //   5746: aload_0
    //   5747: getstatic p.aP : [Lbf;
    //   5750: iconst_1
    //   5751: aaload
    //   5752: iconst_1
    //   5753: invokespecial a : (Lbf;Z)V
    //   5756: goto -> 6042
    //   5759: getstatic main/a.ag : I
    //   5762: bipush #57
    //   5764: if_icmpne -> 5788
    //   5767: getstatic p.aP : [Lbf;
    //   5770: iconst_2
    //   5771: aaload
    //   5772: ifnull -> 6042
    //   5775: aload_0
    //   5776: getstatic p.aP : [Lbf;
    //   5779: iconst_2
    //   5780: aaload
    //   5781: iconst_1
    //   5782: invokespecial a : (Lbf;Z)V
    //   5785: goto -> 6042
    //   5788: getstatic main/a.ag : I
    //   5791: bipush #49
    //   5793: if_icmpne -> 5817
    //   5796: getstatic p.aP : [Lbf;
    //   5799: iconst_3
    //   5800: aaload
    //   5801: ifnull -> 6042
    //   5804: aload_0
    //   5805: getstatic p.aP : [Lbf;
    //   5808: iconst_3
    //   5809: aaload
    //   5810: iconst_1
    //   5811: invokespecial a : (Lbf;Z)V
    //   5814: goto -> 6042
    //   5817: getstatic main/a.ag : I
    //   5820: bipush #51
    //   5822: if_icmpne -> 5846
    //   5825: getstatic p.aP : [Lbf;
    //   5828: iconst_4
    //   5829: aaload
    //   5830: ifnull -> 6042
    //   5833: aload_0
    //   5834: getstatic p.aP : [Lbf;
    //   5837: iconst_4
    //   5838: aaload
    //   5839: iconst_1
    //   5840: invokespecial a : (Lbf;Z)V
    //   5843: goto -> 6042
    //   5846: getstatic main/a.ag : I
    //   5849: bipush #48
    //   5851: if_icmpne -> 6042
    //   5854: invokestatic b : ()Lcq;
    //   5857: ldc ''
    //   5859: invokevirtual a : (Ljava/lang/String;)V
    //   5862: goto -> 6042
    //   5865: aload_0
    //   5866: getfield bs : Ljava/lang/String;
    //   5869: invokevirtual toCharArray : ()[C
    //   5872: astore_1
    //   5873: new el
    //   5876: dup
    //   5877: ldc ''
    //   5879: invokespecial <init> : (Ljava/lang/String;)V
    //   5882: astore_2
    //   5883: iconst_0
    //   5884: istore_3
    //   5885: goto -> 5911
    //   5888: aload_2
    //   5889: new java/lang/StringBuffer
    //   5892: dup
    //   5893: aload_1
    //   5894: iload_3
    //   5895: caload
    //   5896: invokestatic valueOf : (C)Ljava/lang/String;
    //   5899: invokespecial <init> : (Ljava/lang/String;)V
    //   5902: invokevirtual toString : ()Ljava/lang/String;
    //   5905: invokevirtual addElement : (Ljava/lang/Object;)V
    //   5908: iinc #3, 1
    //   5911: iload_3
    //   5912: aload_1
    //   5913: arraylength
    //   5914: if_icmplt -> 5888
    //   5917: aload_2
    //   5918: iconst_0
    //   5919: invokevirtual removeElementAt : (I)V
    //   5922: new java/lang/StringBuffer
    //   5925: dup
    //   5926: getstatic main/a.ag : I
    //   5929: i2c
    //   5930: invokestatic valueOf : (C)Ljava/lang/String;
    //   5933: invokespecial <init> : (Ljava/lang/String;)V
    //   5936: invokevirtual toString : ()Ljava/lang/String;
    //   5939: dup
    //   5940: astore_3
    //   5941: ldc ''
    //   5943: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5946: ifne -> 5962
    //   5949: aload_3
    //   5950: ifnull -> 5962
    //   5953: aload_3
    //   5954: ldc '\\n'
    //   5956: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5959: ifeq -> 5965
    //   5962: ldc '-'
    //   5964: astore_3
    //   5965: aload_2
    //   5966: aload_3
    //   5967: aload_2
    //   5968: invokevirtual size : ()I
    //   5971: invokevirtual insertElementAt : (Ljava/lang/Object;I)V
    //   5974: aload_0
    //   5975: ldc ''
    //   5977: putfield bs : Ljava/lang/String;
    //   5980: iconst_0
    //   5981: istore_1
    //   5982: goto -> 6024
    //   5985: aload_0
    //   5986: dup
    //   5987: getfield bs : Ljava/lang/String;
    //   5990: new java/lang/StringBuffer
    //   5993: dup_x1
    //   5994: swap
    //   5995: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   5998: invokespecial <init> : (Ljava/lang/String;)V
    //   6001: aload_2
    //   6002: iload_1
    //   6003: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   6006: checkcast java/lang/String
    //   6009: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   6012: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   6015: invokevirtual toString : ()Ljava/lang/String;
    //   6018: putfield bs : Ljava/lang/String;
    //   6021: iinc #1, 1
    //   6024: iload_1
    //   6025: aload_2
    //   6026: invokevirtual size : ()I
    //   6029: if_icmplt -> 5985
    //   6032: invokestatic a : ()Lbt;
    //   6035: getstatic main/a.ag : I
    //   6038: i2c
    //   6039: invokevirtual a : (C)V
    //   6042: iconst_0
    //   6043: putstatic main/a.ag : I
    //   6046: invokestatic f : ()V
    //   6049: return
  }
  
  private bq e(int paramInt1, int paramInt2) {
    bq bq = null;
    int i = 0;
    el[] arrayOfEl = { F, G, E, D };
    for (byte b1 = 0; b1 < arrayOfEl.length; b1++) {
      for (byte b2 = 0; b2 < arrayOfEl[b1].size(); b2++) {
        bq bq1;
        aa aa1;
        if (!(bq1 = arrayOfEl[b1].elementAt(b2)).q() && (!(bq1 instanceof aa) || !(aa1 = (aa)bq1).J || !aa1.equals((af.e()).aR))) {
          int j = bq1.l();
          int m = bq1.m();
          int n = bq1.o();
          int i1 = bq1.n();
          if (a(paramInt1, paramInt2, j - n / 2 - 30, m - i1 - 30, n + 60, i1 + 60))
            if (bq == null) {
              bq = bq1;
              i = ds.g(paramInt1 - j) + ds.g(paramInt2 - m);
              if (b1 == 1)
                return bq; 
            } else if ((j = ds.g(paramInt1 - j) + ds.g(paramInt2 - m)) < i) {
              bq = bq1;
              i = j;
            }  
        } 
      } 
    } 
    return bq;
  }
  
  private static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    return (paramInt1 >= paramInt3 && paramInt1 <= paramInt3 + paramInt5 && paramInt2 >= paramInt4 && paramInt2 <= paramInt4 + paramInt6);
  }
  
  private boolean a(bq parambq) {
    if (parambq == null)
      return false; 
    int i = parambq.m();
    int j = (af.e()).C;
    if (i < j)
      while (i < j) {
        j -= 5;
        if (bv.a((af.e()).B, j, 8192)) {
          this.aX = 0;
          af.e();
          (af.e()).bP = null;
          return true;
        } 
      }  
    return false;
  }
  
  private void b(bq parambq) {
    if (!parambq.equals((af.e()).aT) && this.aL != null)
      return; 
    if (a(parambq))
      return; 
    boolean bool = false;
    bq bq1 = parambq;
    p p1 = this;
    if (bq1 != null && p1.eL <= 0) {
      p1.eL = 10;
      int i = bq1.l();
      if ((i = ds.g((af.e()).B - i)) <= 80) {
        i = 1;
      } else if (i > 80 && i <= 200) {
        i = 2;
      } else if (i > 200 && i <= 400) {
        i = 3;
      } else {
        i = 4;
      } 
      if (bq1.equals((af.e()).aQ) || (bq1.equals((af.e()).aU) && af.e().c((af.e()).aU))) {
        at.a(135, bq1.l(), bq1.m(), i);
      } else if (bq1.equals((af.e()).aT) || bq1.equals((af.e()).aV) || bq1.equals((af.e()).aU)) {
        at.a(136, bq1.l(), bq1.m(), i);
      } 
    } 
    af.e();
    (af.e()).bP = null;
    (af.e()).D = (af.e()).E = 0;
    parambq.p();
    this.aX = 10;
    a(false, true);
    this.eh = parambq.l();
    this.ei = parambq.m();
    this.eg = false;
    this.aV = true;
  }
  
  private boolean f(int paramInt1, int paramInt2) {
    if (equals(aE) && (j()).bQ != null)
      return false; 
    if (aE.b.b != null && aE.b.b.c != null) {
      int i = ds.g(aE.d) + aE.b.g - 40;
      int j = ds.g(aE.c) + aE.b.h;
      if (a(paramInt1 - j, paramInt2 - k, i, j, 200, aE.b.j)) {
        paramInt1 = 10;
        eo eo1;
        (eo1 = aE).g = 10;
        return true;
      } 
    } 
    return false;
  }
  
  private boolean g(int paramInt1, int paramInt2) {
    for (byte b1 = 0; b1 < bo.a.size(); b1++) {
      bo bo = bo.a.elementAt(b1);
      if (a(paramInt1, paramInt2, bo.d, bo.e, bo.f, bo.g)) {
        if (bo.e <= 24 && bv.f() && (af.e()).aN != 0)
          return false; 
        if (bo.j) {
          bo.a(10);
          return true;
        } 
      } 
    } 
    return false;
  }
  
  private void h(int paramInt1, int paramInt2) {
    if (dS.c())
      return; 
    af.e();
    if (paramInt1 < bv.c && paramInt1 > bv.c - 32) {
      (af.e()).bP = new dm(bv.c, paramInt2);
      return;
    } 
    if (paramInt1 < 32 && paramInt1 > 0) {
      (af.e()).bP = new dm(0, paramInt2);
      return;
    } 
    this.eh = paramInt1;
    this.ei = paramInt2;
    this.eg = false;
    (af.e()).bQ = 0;
    paramInt1 = ((af.e()).ao && (af.e()).T > 0L) ? 0 : 1000;
    if (this.ei > (af.e()).C && ds.g(this.eh - (af.e()).B) < 12)
      return; 
    for (paramInt2 = 0; paramInt2 < paramInt1 + 60 && this.ei + paramInt2 < bv.d - 24; paramInt2 += 24) {
      if (bv.a(this.eh, this.ei + paramInt2, 2)) {
        this.ei = bv.e(this.ei + paramInt2);
        this.eg = true;
        break;
      } 
    } 
    for (paramInt2 = 0; paramInt2 < paramInt1 + 40; paramInt2 += 24) {
      if (bv.a(this.eh, this.ei - paramInt2, 2)) {
        this.ei = bv.e(this.ei - paramInt2);
        this.eg = true;
        break;
      } 
    } 
    this.aV = true;
    (af.e()).bQ = 0;
    if (!this.eg && this.ei < (af.e()).C - 50)
      (af.e()).bQ = 20; 
    this.aX = 0;
    if ((af.e()).cJ)
      af.e().P(); 
    (af.e()).bP = new dm(this.eh, this.ei);
    (af.e()).I = ((af.e()).B - (af.e()).bP.a > 0) ? -1 : 1;
    (af.e()).ay = null;
    bj = false;
  }
  
  private void H() {
    if ((af.e()).cR)
      return; 
    if ((af.e()).cO)
      return; 
    if ((af.e()).cI > 0)
      return; 
    long l;
    if ((l = System.currentTimeMillis()) - this.em < 10000L)
      return; 
    if (!af.e().M()) {
      aD.a(aw.aT, 0);
      return;
    } 
    at.a(11, af.e(), 5);
    at.a(104, af.e(), 4);
    this.em = l;
    bu.a();
  }
  
  public final void b(int paramInt1, int paramInt2) {
    if (!this.eo) {
      bu.a();
      ds.c("ACTIVE SUPER POWER");
      this.eo = true;
      this.ep = 0;
      this.es = 0;
      this.eq = paramInt1 - j;
      this.er = paramInt2 - k;
    } 
  }
  
  public final void a(boolean paramBoolean) {
    this.bd = true;
    this.ba = true;
    this.et = true;
    if (paramBoolean) {
      ea ea;
      ei.a(ea = new ea(20, (af.e()).B, (af.e()).C - 77, 2, 8, 1));
    } 
  }
  
  public final void o() {
    this.bd = false;
    this.ba = true;
    this.et = false;
  }
  
  public final void p() {
    this.bb = true;
    this.be = en.a(0.4F, 0, a.af[a.af.length - 1]);
  }
  
  public final void c(int paramInt1, int paramInt2) {
    ds.c("VE RONG THAN O VI TRI x= " + paramInt1 + " y=" + paramInt2);
    p();
    ea ea;
    ei.a(ea = new ea(this.bc ? 25 : 17, paramInt1, paramInt2 - 77, 2, -1, 1));
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: invokestatic e : ()Laf;
    //   3: getfield aU : Laf;
    //   6: ifnull -> 73
    //   9: invokestatic e : ()Laf;
    //   12: getfield aU : Laf;
    //   15: getfield C : I
    //   18: invokestatic e : ()Laf;
    //   21: getfield C : I
    //   24: bipush #48
    //   26: iadd
    //   27: if_icmplt -> 73
    //   30: invokestatic e : ()Laf;
    //   33: getfield B : I
    //   36: invokestatic e : ()Laf;
    //   39: getfield C : I
    //   42: iconst_2
    //   43: invokestatic a : (III)Z
    //   46: ifeq -> 73
    //   49: aload_0
    //   50: iconst_0
    //   51: putfield aX : I
    //   54: invokestatic e : ()Laf;
    //   57: aconst_null
    //   58: putfield bP : Ldm;
    //   61: iconst_0
    //   62: putstatic af.bH : Z
    //   65: invokestatic e : ()Laf;
    //   68: iconst_0
    //   69: putfield bJ : Z
    //   72: return
    //   73: ldc 'do fire'
    //   75: invokestatic c : (Ljava/lang/String;)V
    //   78: getstatic p.eu : I
    //   81: iconst_1
    //   82: iadd
    //   83: putstatic p.eu : I
    //   86: invokestatic e : ()Laf;
    //   89: invokevirtual i : ()Lbw;
    //   92: astore_1
    //   93: invokestatic e : ()Laf;
    //   96: invokevirtual j : ()Lbw;
    //   99: astore_3
    //   100: iload_2
    //   101: ifne -> 149
    //   104: aload_1
    //   105: ifnull -> 149
    //   108: invokestatic e : ()Laf;
    //   111: getfield aQ : Laa;
    //   114: ifnull -> 138
    //   117: invokestatic e : ()Laf;
    //   120: getfield aQ : Laa;
    //   123: ifnull -> 149
    //   126: invokestatic e : ()Laf;
    //   129: getfield aQ : Laa;
    //   132: getfield C : I
    //   135: ifne -> 149
    //   138: aload_1
    //   139: getfield g : Lbo;
    //   142: getfield i : Lde;
    //   145: invokevirtual a : ()V
    //   148: return
    //   149: iload_2
    //   150: ifne -> 198
    //   153: aload_3
    //   154: ifnull -> 198
    //   157: invokestatic e : ()Laf;
    //   160: getfield aQ : Laa;
    //   163: ifnull -> 187
    //   166: invokestatic e : ()Laf;
    //   169: getfield aQ : Laa;
    //   172: ifnull -> 198
    //   175: invokestatic e : ()Laf;
    //   178: getfield aQ : Laa;
    //   181: getfield C : I
    //   184: ifne -> 198
    //   187: aload_3
    //   188: getfield g : Lbo;
    //   191: getfield i : Lde;
    //   194: invokevirtual a : ()V
    //   197: return
    //   198: getstatic bv.l : I
    //   201: bipush #51
    //   203: if_icmpne -> 216
    //   206: invokestatic e : ()Laf;
    //   209: getfield aT : Ldo;
    //   212: ifnull -> 216
    //   215: return
    //   216: invokestatic e : ()Laf;
    //   219: getfield H : I
    //   222: bipush #14
    //   224: if_icmpeq -> 3013
    //   227: invokestatic e : ()Laf;
    //   230: invokestatic e : ()Laf;
    //   233: iconst_0
    //   234: dup_x1
    //   235: putfield E : I
    //   238: putfield D : I
    //   241: invokestatic e : ()Laf;
    //   244: invokevirtual w : ()Z
    //   247: ifeq -> 280
    //   250: invokestatic e : ()Laf;
    //   253: invokevirtual O : ()Z
    //   256: ifeq -> 280
    //   259: aload_0
    //   260: invokespecial G : ()Z
    //   263: ifeq -> 2999
    //   266: invokestatic e : ()Laf;
    //   269: pop
    //   270: invokestatic e : ()Laf;
    //   273: pop
    //   274: invokestatic A : ()V
    //   277: goto -> 2999
    //   280: aload_0
    //   281: dup
    //   282: astore_1
    //   283: invokestatic e : ()Laf;
    //   286: getfield aU : Laf;
    //   289: invokespecial a : (Lbq;)Z
    //   292: ifeq -> 299
    //   295: iconst_0
    //   296: goto -> 2888
    //   299: aload_1
    //   300: invokestatic e : ()Laf;
    //   303: getfield aQ : Laa;
    //   306: invokespecial a : (Lbq;)Z
    //   309: ifeq -> 316
    //   312: iconst_0
    //   313: goto -> 2888
    //   316: aload_1
    //   317: invokestatic e : ()Laf;
    //   320: getfield aT : Ldo;
    //   323: invokespecial a : (Lbq;)Z
    //   326: ifeq -> 333
    //   329: iconst_0
    //   330: goto -> 2888
    //   333: invokestatic b : ()Lcq;
    //   336: getfield b : Z
    //   339: ifeq -> 346
    //   342: iconst_0
    //   343: goto -> 2888
    //   346: getstatic bp.b : Z
    //   349: ifne -> 362
    //   352: invokestatic e : ()Laf;
    //   355: pop
    //   356: getstatic af.bH : Z
    //   359: ifeq -> 366
    //   362: iconst_0
    //   363: goto -> 2888
    //   366: invokestatic e : ()Laf;
    //   369: getfield aC : Lbf;
    //   372: ifnull -> 409
    //   375: invokestatic e : ()Laf;
    //   378: getfield aC : Lbf;
    //   381: getfield a : Let;
    //   384: getfield a : B
    //   387: bipush #6
    //   389: if_icmpne -> 409
    //   392: invokestatic e : ()Laf;
    //   395: getfield aV : Lce;
    //   398: ifnull -> 409
    //   401: aload_1
    //   402: invokespecial I : ()V
    //   405: iconst_0
    //   406: goto -> 2888
    //   409: invokestatic e : ()Laf;
    //   412: getfield aC : Lbf;
    //   415: ifnull -> 475
    //   418: invokestatic e : ()Laf;
    //   421: getfield aC : Lbf;
    //   424: getfield a : Let;
    //   427: getfield e : I
    //   430: iconst_2
    //   431: if_icmpne -> 475
    //   434: invokestatic e : ()Laf;
    //   437: getfield aT : Ldo;
    //   440: ifnonnull -> 475
    //   443: invokestatic e : ()Laf;
    //   446: getfield aC : Lbf;
    //   449: getfield a : Let;
    //   452: getfield a : B
    //   455: bipush #6
    //   457: if_icmpeq -> 475
    //   460: aload_1
    //   461: invokespecial G : ()Z
    //   464: ifne -> 471
    //   467: iconst_0
    //   468: goto -> 2888
    //   471: iconst_1
    //   472: goto -> 2888
    //   475: invokestatic e : ()Laf;
    //   478: getfield cf : Lci;
    //   481: ifnonnull -> 520
    //   484: invokestatic e : ()Laf;
    //   487: getfield aQ : Laa;
    //   490: ifnonnull -> 524
    //   493: invokestatic e : ()Laf;
    //   496: getfield aT : Ldo;
    //   499: ifnonnull -> 524
    //   502: invokestatic e : ()Laf;
    //   505: getfield aU : Laf;
    //   508: ifnonnull -> 524
    //   511: invokestatic e : ()Laf;
    //   514: getfield aV : Lce;
    //   517: ifnonnull -> 524
    //   520: iconst_0
    //   521: goto -> 2888
    //   524: invokestatic e : ()Laf;
    //   527: getfield aQ : Laa;
    //   530: ifnull -> 1694
    //   533: invokestatic e : ()Laf;
    //   536: getfield aQ : Laa;
    //   539: invokevirtual u : ()Z
    //   542: ifeq -> 572
    //   545: invokestatic e : ()Laf;
    //   548: getfield aQ : Laa;
    //   551: getfield p : I
    //   554: iconst_4
    //   555: if_icmpne -> 572
    //   558: invokestatic e : ()Laf;
    //   561: aconst_null
    //   562: putfield aQ : Laa;
    //   565: invokestatic e : ()Laf;
    //   568: aconst_null
    //   569: putfield bP : Ldm;
    //   572: iconst_1
    //   573: putstatic p.bj : Z
    //   576: invokestatic e : ()Laf;
    //   579: getfield aQ : Laa;
    //   582: invokestatic a : (Laa;)Z
    //   585: ifne -> 592
    //   588: iconst_0
    //   589: goto -> 2888
    //   592: aload_1
    //   593: getfield aL : Laa;
    //   596: ifnull -> 603
    //   599: iconst_0
    //   600: goto -> 2888
    //   603: invokestatic e : ()Laf;
    //   606: getfield aC : Lbf;
    //   609: ifnonnull -> 616
    //   612: iconst_0
    //   613: goto -> 2888
    //   616: invokestatic e : ()Laf;
    //   619: invokevirtual w : ()Z
    //   622: ifeq -> 629
    //   625: iconst_0
    //   626: goto -> 2888
    //   629: iconst_m1
    //   630: istore_2
    //   631: invokestatic e : ()Laf;
    //   634: getfield B : I
    //   637: getstatic p.j : I
    //   640: isub
    //   641: invokestatic g : (I)I
    //   644: getstatic en.b : I
    //   647: imul
    //   648: istore_3
    //   649: invokestatic e : ()Laf;
    //   652: getfield aU : Laf;
    //   655: ifnull -> 685
    //   658: invokestatic e : ()Laf;
    //   661: getfield B : I
    //   664: invokestatic e : ()Laf;
    //   667: getfield aU : Laf;
    //   670: getfield B : I
    //   673: isub
    //   674: invokestatic g : (I)I
    //   677: getstatic en.b : I
    //   680: imul
    //   681: istore_2
    //   682: goto -> 718
    //   685: invokestatic e : ()Laf;
    //   688: getfield aQ : Laa;
    //   691: ifnull -> 718
    //   694: invokestatic e : ()Laf;
    //   697: getfield B : I
    //   700: invokestatic e : ()Laf;
    //   703: getfield aQ : Laa;
    //   706: getfield m : I
    //   709: isub
    //   710: invokestatic g : (I)I
    //   713: getstatic en.b : I
    //   716: imul
    //   717: istore_2
    //   718: invokestatic e : ()Laf;
    //   721: getfield aQ : Laa;
    //   724: getfield p : I
    //   727: iconst_1
    //   728: if_icmpeq -> 769
    //   731: invokestatic e : ()Laf;
    //   734: getfield aQ : Laa;
    //   737: getfield p : I
    //   740: ifeq -> 769
    //   743: invokestatic e : ()Laf;
    //   746: getfield aC : Lbf;
    //   749: getfield a : Let;
    //   752: getfield e : I
    //   755: iconst_4
    //   756: if_icmpeq -> 769
    //   759: iload_2
    //   760: iconst_m1
    //   761: if_icmpeq -> 769
    //   764: iload_2
    //   765: iload_3
    //   766: if_icmple -> 831
    //   769: invokestatic e : ()Laf;
    //   772: getfield aC : Lbf;
    //   775: getfield a : Let;
    //   778: getfield e : I
    //   781: iconst_4
    //   782: if_icmpne -> 831
    //   785: invokestatic e : ()Laf;
    //   788: getfield aQ : Laa;
    //   791: getfield m : I
    //   794: invokestatic e : ()Laf;
    //   797: getfield B : I
    //   800: if_icmpge -> 813
    //   803: invokestatic e : ()Laf;
    //   806: iconst_m1
    //   807: putfield I : I
    //   810: goto -> 820
    //   813: invokestatic e : ()Laf;
    //   816: iconst_1
    //   817: putfield I : I
    //   820: aload_1
    //   821: invokestatic e : ()Laf;
    //   824: getfield aC : Lbf;
    //   827: iconst_1
    //   828: invokespecial a : (Lbf;Z)V
    //   831: aload_1
    //   832: invokespecial G : ()Z
    //   835: ifne -> 842
    //   838: iconst_0
    //   839: goto -> 2888
    //   842: invokestatic e : ()Laf;
    //   845: getfield B : I
    //   848: invokestatic e : ()Laf;
    //   851: getfield aQ : Laa;
    //   854: invokevirtual l : ()I
    //   857: if_icmpge -> 870
    //   860: invokestatic e : ()Laf;
    //   863: iconst_1
    //   864: putfield I : I
    //   867: goto -> 877
    //   870: invokestatic e : ()Laf;
    //   873: iconst_m1
    //   874: putfield I : I
    //   877: invokestatic e : ()Laf;
    //   880: getfield B : I
    //   883: invokestatic e : ()Laf;
    //   886: getfield aQ : Laa;
    //   889: invokevirtual l : ()I
    //   892: isub
    //   893: invokestatic abs : (I)I
    //   896: istore_1
    //   897: invokestatic e : ()Laf;
    //   900: getfield C : I
    //   903: invokestatic e : ()Laf;
    //   906: getfield aQ : Laa;
    //   909: invokevirtual m : ()I
    //   912: isub
    //   913: invokestatic abs : (I)I
    //   916: istore_3
    //   917: invokestatic e : ()Laf;
    //   920: iconst_0
    //   921: putfield D : I
    //   924: iload_1
    //   925: invokestatic e : ()Laf;
    //   928: getfield aC : Lbf;
    //   931: getfield g : I
    //   934: if_icmpgt -> 1540
    //   937: iload_3
    //   938: invokestatic e : ()Laf;
    //   941: getfield aC : Lbf;
    //   944: getfield h : I
    //   947: if_icmpgt -> 1540
    //   950: invokestatic e : ()Laf;
    //   953: getfield aC : Lbf;
    //   956: getfield a : Let;
    //   959: getfield a : B
    //   962: bipush #20
    //   964: if_icmpeq -> 2887
    //   967: iload_3
    //   968: iload_1
    //   969: if_icmple -> 1076
    //   972: invokestatic e : ()Laf;
    //   975: getfield C : I
    //   978: invokestatic e : ()Laf;
    //   981: getfield aQ : Laa;
    //   984: invokevirtual m : ()I
    //   987: isub
    //   988: invokestatic g : (I)I
    //   991: bipush #30
    //   993: if_icmple -> 1076
    //   996: invokestatic e : ()Laf;
    //   999: getfield aQ : Laa;
    //   1002: invokevirtual z : ()Ldy;
    //   1005: getfield c : B
    //   1008: iconst_4
    //   1009: if_icmpne -> 1076
    //   1012: invokestatic e : ()Laf;
    //   1015: new dm
    //   1018: dup
    //   1019: invokestatic e : ()Laf;
    //   1022: getfield B : I
    //   1025: invokestatic e : ()Laf;
    //   1028: getfield I : I
    //   1031: iadd
    //   1032: invokestatic e : ()Laf;
    //   1035: getfield aQ : Laa;
    //   1038: invokevirtual m : ()I
    //   1041: invokespecial <init> : (II)V
    //   1044: putfield bP : Ldm;
    //   1047: invokestatic e : ()Laf;
    //   1050: new de
    //   1053: dup
    //   1054: aconst_null
    //   1055: aconst_null
    //   1056: sipush #8002
    //   1059: aconst_null
    //   1060: invokespecial <init> : (Ljava/lang/String;Lb;ILjava/lang/Object;)V
    //   1063: putfield ay : Lde;
    //   1066: invokestatic g : ()V
    //   1069: invokestatic f : ()V
    //   1072: iconst_0
    //   1073: goto -> 2888
    //   1076: bipush #20
    //   1078: istore #4
    //   1080: iconst_0
    //   1081: istore_2
    //   1082: invokestatic e : ()Laf;
    //   1085: getfield aQ : Laa;
    //   1088: instanceof cc
    //   1091: ifne -> 1106
    //   1094: invokestatic e : ()Laf;
    //   1097: getfield aQ : Laa;
    //   1100: instanceof d
    //   1103: ifeq -> 1108
    //   1106: iconst_1
    //   1107: istore_2
    //   1108: invokestatic e : ()Laf;
    //   1111: getfield aC : Lbf;
    //   1114: getfield g : I
    //   1117: bipush #100
    //   1119: if_icmple -> 1152
    //   1122: bipush #60
    //   1124: istore #4
    //   1126: iload_1
    //   1127: bipush #20
    //   1129: if_icmpge -> 1152
    //   1132: invokestatic e : ()Laf;
    //   1135: invokestatic e : ()Laf;
    //   1138: getfield B : I
    //   1141: invokestatic e : ()Laf;
    //   1144: getfield C : I
    //   1147: bipush #10
    //   1149: invokevirtual a : (III)V
    //   1152: new java/lang/StringBuffer
    //   1155: dup
    //   1156: ldc 'dt= '
    //   1158: invokespecial <init> : (Ljava/lang/String;)V
    //   1161: iload #4
    //   1163: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1166: invokevirtual toString : ()Ljava/lang/String;
    //   1169: invokestatic c : (Ljava/lang/String;)V
    //   1172: iconst_0
    //   1173: istore_3
    //   1174: invokestatic e : ()Laf;
    //   1177: getfield B : I
    //   1180: invokestatic e : ()Laf;
    //   1183: getfield C : I
    //   1186: iconst_3
    //   1187: iadd
    //   1188: invokestatic b : (II)I
    //   1191: iconst_2
    //   1192: iand
    //   1193: iconst_2
    //   1194: if_icmpne -> 1256
    //   1197: invokestatic e : ()Laf;
    //   1200: getfield B : I
    //   1203: invokestatic e : ()Laf;
    //   1206: getfield aQ : Laa;
    //   1209: invokevirtual l : ()I
    //   1212: if_icmple -> 1219
    //   1215: iconst_1
    //   1216: goto -> 1220
    //   1219: iconst_m1
    //   1220: istore #5
    //   1222: invokestatic e : ()Laf;
    //   1225: getfield aQ : Laa;
    //   1228: invokevirtual l : ()I
    //   1231: iload #4
    //   1233: iload #5
    //   1235: imul
    //   1236: iadd
    //   1237: invokestatic e : ()Laf;
    //   1240: getfield C : I
    //   1243: iconst_3
    //   1244: iadd
    //   1245: invokestatic b : (II)I
    //   1248: iconst_2
    //   1249: iand
    //   1250: iconst_2
    //   1251: if_icmpeq -> 1256
    //   1254: iconst_1
    //   1255: istore_3
    //   1256: iload_1
    //   1257: iload #4
    //   1259: if_icmpgt -> 1531
    //   1262: iload_3
    //   1263: ifne -> 1531
    //   1266: invokestatic e : ()Laf;
    //   1269: getfield B : I
    //   1272: invokestatic e : ()Laf;
    //   1275: getfield aQ : Laa;
    //   1278: invokevirtual l : ()I
    //   1281: if_icmple -> 1406
    //   1284: invokestatic e : ()Laf;
    //   1287: getfield aQ : Laa;
    //   1290: invokevirtual l : ()I
    //   1293: iload #4
    //   1295: iadd
    //   1296: iload_2
    //   1297: ifeq -> 1305
    //   1300: bipush #30
    //   1302: goto -> 1306
    //   1305: iconst_0
    //   1306: iadd
    //   1307: istore #5
    //   1309: invokestatic e : ()Laf;
    //   1312: getfield aQ : Laa;
    //   1315: invokevirtual l : ()I
    //   1318: istore_1
    //   1319: iconst_0
    //   1320: istore_2
    //   1321: goto -> 1365
    //   1324: iload_1
    //   1325: invokestatic e : ()Laf;
    //   1328: getfield C : I
    //   1331: iconst_3
    //   1332: iadd
    //   1333: invokestatic b : (II)I
    //   1336: bipush #8
    //   1338: if_icmpeq -> 1357
    //   1341: iload_1
    //   1342: invokestatic e : ()Laf;
    //   1345: getfield C : I
    //   1348: iconst_3
    //   1349: iadd
    //   1350: invokestatic b : (II)I
    //   1353: iconst_4
    //   1354: if_icmpne -> 1362
    //   1357: iconst_1
    //   1358: istore_2
    //   1359: goto -> 1371
    //   1362: iinc #1, 24
    //   1365: iload_1
    //   1366: iload #5
    //   1368: if_icmplt -> 1324
    //   1371: iload_2
    //   1372: ifeq -> 1388
    //   1375: invokestatic e : ()Laf;
    //   1378: iload_1
    //   1379: bipush #24
    //   1381: isub
    //   1382: putfield B : I
    //   1385: goto -> 1396
    //   1388: invokestatic e : ()Laf;
    //   1391: iload #5
    //   1393: putfield B : I
    //   1396: invokestatic e : ()Laf;
    //   1399: iconst_m1
    //   1400: putfield I : I
    //   1403: goto -> 1525
    //   1406: invokestatic e : ()Laf;
    //   1409: getfield aQ : Laa;
    //   1412: invokevirtual l : ()I
    //   1415: iload #4
    //   1417: isub
    //   1418: iload_2
    //   1419: ifeq -> 1427
    //   1422: bipush #30
    //   1424: goto -> 1428
    //   1427: iconst_0
    //   1428: isub
    //   1429: istore #5
    //   1431: invokestatic e : ()Laf;
    //   1434: getfield aQ : Laa;
    //   1437: invokevirtual l : ()I
    //   1440: istore_1
    //   1441: iconst_0
    //   1442: istore_2
    //   1443: goto -> 1487
    //   1446: iload_1
    //   1447: invokestatic e : ()Laf;
    //   1450: getfield C : I
    //   1453: iconst_3
    //   1454: iadd
    //   1455: invokestatic b : (II)I
    //   1458: bipush #8
    //   1460: if_icmpeq -> 1479
    //   1463: iload_1
    //   1464: invokestatic e : ()Laf;
    //   1467: getfield C : I
    //   1470: iconst_3
    //   1471: iadd
    //   1472: invokestatic b : (II)I
    //   1475: iconst_4
    //   1476: if_icmpne -> 1484
    //   1479: iconst_1
    //   1480: istore_2
    //   1481: goto -> 1493
    //   1484: iinc #1, -24
    //   1487: iload_1
    //   1488: iload #5
    //   1490: if_icmpgt -> 1446
    //   1493: iload_2
    //   1494: ifeq -> 1510
    //   1497: invokestatic e : ()Laf;
    //   1500: iload_1
    //   1501: bipush #24
    //   1503: iadd
    //   1504: putfield B : I
    //   1507: goto -> 1518
    //   1510: invokestatic e : ()Laf;
    //   1513: iload #5
    //   1515: putfield B : I
    //   1518: invokestatic e : ()Laf;
    //   1521: iconst_1
    //   1522: putfield I : I
    //   1525: invokestatic a : ()Lbt;
    //   1528: invokevirtual g : ()V
    //   1531: invokestatic g : ()V
    //   1534: invokestatic f : ()V
    //   1537: goto -> 2887
    //   1540: iconst_0
    //   1541: istore #4
    //   1543: invokestatic e : ()Laf;
    //   1546: getfield aQ : Laa;
    //   1549: instanceof cc
    //   1552: ifne -> 1567
    //   1555: invokestatic e : ()Laf;
    //   1558: getfield aQ : Laa;
    //   1561: instanceof d
    //   1564: ifeq -> 1570
    //   1567: iconst_1
    //   1568: istore #4
    //   1570: invokestatic e : ()Laf;
    //   1573: getfield aC : Lbf;
    //   1576: getfield g : I
    //   1579: iload #4
    //   1581: ifeq -> 1589
    //   1584: bipush #50
    //   1586: goto -> 1591
    //   1589: bipush #20
    //   1591: isub
    //   1592: invokestatic e : ()Laf;
    //   1595: getfield B : I
    //   1598: invokestatic e : ()Laf;
    //   1601: getfield aQ : Laa;
    //   1604: invokevirtual l : ()I
    //   1607: if_icmple -> 1614
    //   1610: iconst_1
    //   1611: goto -> 1615
    //   1614: iconst_m1
    //   1615: imul
    //   1616: istore_2
    //   1617: iload_1
    //   1618: invokestatic e : ()Laf;
    //   1621: getfield aC : Lbf;
    //   1624: getfield g : I
    //   1627: if_icmpgt -> 1632
    //   1630: iconst_0
    //   1631: istore_2
    //   1632: invokestatic e : ()Laf;
    //   1635: new dm
    //   1638: dup
    //   1639: invokestatic e : ()Laf;
    //   1642: getfield aQ : Laa;
    //   1645: invokevirtual l : ()I
    //   1648: iload_2
    //   1649: iadd
    //   1650: invokestatic e : ()Laf;
    //   1653: getfield aQ : Laa;
    //   1656: invokevirtual m : ()I
    //   1659: invokespecial <init> : (II)V
    //   1662: putfield bP : Ldm;
    //   1665: invokestatic e : ()Laf;
    //   1668: new de
    //   1671: dup
    //   1672: aconst_null
    //   1673: aconst_null
    //   1674: sipush #8002
    //   1677: aconst_null
    //   1678: invokespecial <init> : (Ljava/lang/String;Lb;ILjava/lang/Object;)V
    //   1681: putfield ay : Lde;
    //   1684: invokestatic g : ()V
    //   1687: invokestatic f : ()V
    //   1690: iconst_0
    //   1691: goto -> 2888
    //   1694: invokestatic e : ()Laf;
    //   1697: getfield aT : Ldo;
    //   1700: ifnull -> 2096
    //   1703: invokestatic e : ()Laf;
    //   1706: getfield aT : Ldo;
    //   1709: getfield dh : Z
    //   1712: ifeq -> 1719
    //   1715: iconst_0
    //   1716: goto -> 2888
    //   1719: invokestatic e : ()Laf;
    //   1722: getfield B : I
    //   1725: invokestatic e : ()Laf;
    //   1728: getfield aT : Ldo;
    //   1731: getfield B : I
    //   1734: if_icmpge -> 1747
    //   1737: invokestatic e : ()Laf;
    //   1740: iconst_1
    //   1741: putfield I : I
    //   1744: goto -> 1754
    //   1747: invokestatic e : ()Laf;
    //   1750: iconst_m1
    //   1751: putfield I : I
    //   1754: invokestatic e : ()Laf;
    //   1757: getfield B : I
    //   1760: invokestatic e : ()Laf;
    //   1763: getfield aT : Ldo;
    //   1766: getfield B : I
    //   1769: if_icmpge -> 1785
    //   1772: invokestatic e : ()Laf;
    //   1775: getfield aT : Ldo;
    //   1778: iconst_m1
    //   1779: putfield I : I
    //   1782: goto -> 1795
    //   1785: invokestatic e : ()Laf;
    //   1788: getfield aT : Ldo;
    //   1791: iconst_1
    //   1792: putfield I : I
    //   1795: invokestatic e : ()Laf;
    //   1798: getfield B : I
    //   1801: invokestatic e : ()Laf;
    //   1804: getfield aT : Ldo;
    //   1807: getfield B : I
    //   1810: isub
    //   1811: invokestatic abs : (I)I
    //   1814: istore_2
    //   1815: invokestatic e : ()Laf;
    //   1818: getfield C : I
    //   1821: invokestatic e : ()Laf;
    //   1824: getfield aT : Ldo;
    //   1827: getfield C : I
    //   1830: isub
    //   1831: invokestatic abs : (I)I
    //   1834: dup
    //   1835: istore_3
    //   1836: bipush #40
    //   1838: if_icmple -> 1859
    //   1841: invokestatic e : ()Laf;
    //   1844: invokestatic e : ()Laf;
    //   1847: getfield aT : Ldo;
    //   1850: getfield C : I
    //   1853: bipush #40
    //   1855: isub
    //   1856: putfield C : I
    //   1859: iload_2
    //   1860: bipush #60
    //   1862: if_icmpge -> 2001
    //   1865: invokestatic g : ()V
    //   1868: invokestatic f : ()V
    //   1871: aload_1
    //   1872: getfield dv : I
    //   1875: ifne -> 2092
    //   1878: invokestatic e : ()Laf;
    //   1881: getfield aD : Lai;
    //   1884: ifnull -> 1965
    //   1887: invokestatic e : ()Laf;
    //   1890: getfield aD : Lai;
    //   1893: getfield c : S
    //   1896: ifne -> 1965
    //   1899: invokestatic e : ()Laf;
    //   1902: getfield aD : Lai;
    //   1905: getfield a : I
    //   1908: iconst_4
    //   1909: if_icmpge -> 1932
    //   1912: invokestatic e : ()Laf;
    //   1915: getfield aT : Ldo;
    //   1918: getfield df : Lap;
    //   1921: getfield a : I
    //   1924: iconst_4
    //   1925: if_icmpne -> 1932
    //   1928: iconst_0
    //   1929: goto -> 2888
    //   1932: invokestatic e : ()Laf;
    //   1935: getfield aD : Lai;
    //   1938: getfield a : I
    //   1941: iconst_3
    //   1942: if_icmpge -> 1965
    //   1945: invokestatic e : ()Laf;
    //   1948: getfield aT : Ldo;
    //   1951: getfield df : Lap;
    //   1954: getfield a : I
    //   1957: iconst_3
    //   1958: if_icmpne -> 1965
    //   1961: iconst_0
    //   1962: goto -> 2888
    //   1965: aload_1
    //   1966: bipush #50
    //   1968: putfield dv : I
    //   1971: invokestatic a : ()V
    //   1974: invokestatic a : ()Lbt;
    //   1977: invokevirtual g : ()V
    //   1980: invokestatic a : ()Lbt;
    //   1983: invokestatic e : ()Laf;
    //   1986: getfield aT : Ldo;
    //   1989: getfield df : Lap;
    //   1992: getfield a : I
    //   1995: invokevirtual j : (I)V
    //   1998: goto -> 2092
    //   2001: bipush #20
    //   2003: getstatic ds.a : Ljava/util/Random;
    //   2006: bipush #20
    //   2008: invokevirtual nextInt : (I)I
    //   2011: iadd
    //   2012: invokestatic e : ()Laf;
    //   2015: getfield B : I
    //   2018: invokestatic e : ()Laf;
    //   2021: getfield aT : Ldo;
    //   2024: getfield B : I
    //   2027: if_icmple -> 2034
    //   2030: iconst_1
    //   2031: goto -> 2035
    //   2034: iconst_m1
    //   2035: imul
    //   2036: istore_1
    //   2037: invokestatic e : ()Laf;
    //   2040: new dm
    //   2043: dup
    //   2044: invokestatic e : ()Laf;
    //   2047: getfield aT : Ldo;
    //   2050: getfield B : I
    //   2053: iload_1
    //   2054: iadd
    //   2055: invokestatic e : ()Laf;
    //   2058: getfield C : I
    //   2061: invokespecial <init> : (II)V
    //   2064: putfield bP : Ldm;
    //   2067: invokestatic e : ()Laf;
    //   2070: new de
    //   2073: dup
    //   2074: aconst_null
    //   2075: aconst_null
    //   2076: sipush #8002
    //   2079: aconst_null
    //   2080: invokespecial <init> : (Ljava/lang/String;Lb;ILjava/lang/Object;)V
    //   2083: putfield ay : Lde;
    //   2086: invokestatic g : ()V
    //   2089: invokestatic f : ()V
    //   2092: iconst_0
    //   2093: goto -> 2888
    //   2096: invokestatic e : ()Laf;
    //   2099: getfield aU : Laf;
    //   2102: ifnull -> 2870
    //   2105: aload_1
    //   2106: getfield aL : Laa;
    //   2109: ifnull -> 2116
    //   2112: iconst_0
    //   2113: goto -> 2888
    //   2116: invokestatic e : ()Laf;
    //   2119: getfield B : I
    //   2122: invokestatic e : ()Laf;
    //   2125: getfield aU : Laf;
    //   2128: getfield B : I
    //   2131: if_icmpge -> 2144
    //   2134: invokestatic e : ()Laf;
    //   2137: iconst_1
    //   2138: putfield I : I
    //   2141: goto -> 2151
    //   2144: invokestatic e : ()Laf;
    //   2147: iconst_m1
    //   2148: putfield I : I
    //   2151: invokestatic e : ()Laf;
    //   2154: getfield B : I
    //   2157: invokestatic e : ()Laf;
    //   2160: getfield aU : Laf;
    //   2163: getfield B : I
    //   2166: isub
    //   2167: invokestatic abs : (I)I
    //   2170: istore_2
    //   2171: invokestatic e : ()Laf;
    //   2174: getfield C : I
    //   2177: invokestatic e : ()Laf;
    //   2180: getfield aU : Laf;
    //   2183: getfield C : I
    //   2186: isub
    //   2187: invokestatic abs : (I)I
    //   2190: istore_3
    //   2191: invokestatic e : ()Laf;
    //   2194: invokestatic e : ()Laf;
    //   2197: getfield aU : Laf;
    //   2200: invokevirtual c : (Laf;)Z
    //   2203: ifne -> 2215
    //   2206: invokestatic e : ()Laf;
    //   2209: invokevirtual y : ()Z
    //   2212: ifeq -> 2660
    //   2215: invokestatic e : ()Laf;
    //   2218: getfield aC : Lbf;
    //   2221: ifnonnull -> 2228
    //   2224: iconst_0
    //   2225: goto -> 2888
    //   2228: aload_1
    //   2229: invokespecial G : ()Z
    //   2232: ifne -> 2239
    //   2235: iconst_0
    //   2236: goto -> 2888
    //   2239: invokestatic e : ()Laf;
    //   2242: getfield B : I
    //   2245: invokestatic e : ()Laf;
    //   2248: getfield aU : Laf;
    //   2251: getfield B : I
    //   2254: if_icmpge -> 2267
    //   2257: invokestatic e : ()Laf;
    //   2260: iconst_1
    //   2261: putfield I : I
    //   2264: goto -> 2274
    //   2267: invokestatic e : ()Laf;
    //   2270: iconst_m1
    //   2271: putfield I : I
    //   2274: invokestatic e : ()Laf;
    //   2277: iconst_0
    //   2278: putfield D : I
    //   2281: iload_2
    //   2282: invokestatic e : ()Laf;
    //   2285: getfield aC : Lbf;
    //   2288: getfield g : I
    //   2291: if_icmpgt -> 2546
    //   2294: iload_3
    //   2295: invokestatic e : ()Laf;
    //   2298: getfield aC : Lbf;
    //   2301: getfield h : I
    //   2304: if_icmpgt -> 2546
    //   2307: invokestatic e : ()Laf;
    //   2310: getfield aC : Lbf;
    //   2313: getfield a : Let;
    //   2316: getfield a : B
    //   2319: bipush #20
    //   2321: if_icmpeq -> 2887
    //   2324: bipush #20
    //   2326: istore_1
    //   2327: invokestatic e : ()Laf;
    //   2330: getfield aC : Lbf;
    //   2333: getfield g : I
    //   2336: bipush #60
    //   2338: if_icmple -> 2370
    //   2341: bipush #60
    //   2343: istore_1
    //   2344: iload_2
    //   2345: bipush #20
    //   2347: if_icmpge -> 2370
    //   2350: invokestatic e : ()Laf;
    //   2353: invokestatic e : ()Laf;
    //   2356: getfield B : I
    //   2359: invokestatic e : ()Laf;
    //   2362: getfield C : I
    //   2365: bipush #10
    //   2367: invokevirtual a : (III)V
    //   2370: iconst_0
    //   2371: istore_3
    //   2372: invokestatic e : ()Laf;
    //   2375: getfield B : I
    //   2378: invokestatic e : ()Laf;
    //   2381: getfield C : I
    //   2384: iconst_3
    //   2385: iadd
    //   2386: invokestatic b : (II)I
    //   2389: iconst_2
    //   2390: iand
    //   2391: iconst_2
    //   2392: if_icmpne -> 2453
    //   2395: invokestatic e : ()Laf;
    //   2398: getfield B : I
    //   2401: invokestatic e : ()Laf;
    //   2404: getfield aU : Laf;
    //   2407: getfield B : I
    //   2410: if_icmple -> 2417
    //   2413: iconst_1
    //   2414: goto -> 2418
    //   2417: iconst_m1
    //   2418: istore #4
    //   2420: invokestatic e : ()Laf;
    //   2423: getfield aU : Laf;
    //   2426: getfield B : I
    //   2429: iload_1
    //   2430: iload #4
    //   2432: imul
    //   2433: iadd
    //   2434: invokestatic e : ()Laf;
    //   2437: getfield C : I
    //   2440: iconst_3
    //   2441: iadd
    //   2442: invokestatic b : (II)I
    //   2445: iconst_2
    //   2446: iand
    //   2447: iconst_2
    //   2448: if_icmpeq -> 2453
    //   2451: iconst_1
    //   2452: istore_3
    //   2453: iload_2
    //   2454: iload_1
    //   2455: if_icmpgt -> 2537
    //   2458: iload_3
    //   2459: ifne -> 2537
    //   2462: invokestatic e : ()Laf;
    //   2465: getfield B : I
    //   2468: invokestatic e : ()Laf;
    //   2471: getfield aU : Laf;
    //   2474: getfield B : I
    //   2477: if_icmple -> 2507
    //   2480: invokestatic e : ()Laf;
    //   2483: invokestatic e : ()Laf;
    //   2486: getfield aU : Laf;
    //   2489: getfield B : I
    //   2492: iload_1
    //   2493: iadd
    //   2494: putfield B : I
    //   2497: invokestatic e : ()Laf;
    //   2500: iconst_m1
    //   2501: putfield I : I
    //   2504: goto -> 2531
    //   2507: invokestatic e : ()Laf;
    //   2510: invokestatic e : ()Laf;
    //   2513: getfield aU : Laf;
    //   2516: getfield B : I
    //   2519: iload_1
    //   2520: isub
    //   2521: putfield B : I
    //   2524: invokestatic e : ()Laf;
    //   2527: iconst_1
    //   2528: putfield I : I
    //   2531: invokestatic a : ()Lbt;
    //   2534: invokevirtual g : ()V
    //   2537: invokestatic g : ()V
    //   2540: invokestatic f : ()V
    //   2543: goto -> 2887
    //   2546: invokestatic e : ()Laf;
    //   2549: getfield aC : Lbf;
    //   2552: getfield g : I
    //   2555: bipush #20
    //   2557: isub
    //   2558: invokestatic e : ()Laf;
    //   2561: getfield B : I
    //   2564: invokestatic e : ()Laf;
    //   2567: getfield aU : Laf;
    //   2570: getfield B : I
    //   2573: if_icmple -> 2580
    //   2576: iconst_1
    //   2577: goto -> 2581
    //   2580: iconst_m1
    //   2581: imul
    //   2582: istore_1
    //   2583: iload_2
    //   2584: invokestatic e : ()Laf;
    //   2587: getfield aC : Lbf;
    //   2590: getfield g : I
    //   2593: if_icmpgt -> 2598
    //   2596: iconst_0
    //   2597: istore_1
    //   2598: invokestatic e : ()Laf;
    //   2601: new dm
    //   2604: dup
    //   2605: invokestatic e : ()Laf;
    //   2608: getfield aU : Laf;
    //   2611: getfield B : I
    //   2614: iload_1
    //   2615: iadd
    //   2616: invokestatic e : ()Laf;
    //   2619: getfield aU : Laf;
    //   2622: getfield C : I
    //   2625: invokespecial <init> : (II)V
    //   2628: putfield bP : Ldm;
    //   2631: invokestatic e : ()Laf;
    //   2634: new de
    //   2637: dup
    //   2638: aconst_null
    //   2639: aconst_null
    //   2640: sipush #8002
    //   2643: aconst_null
    //   2644: invokespecial <init> : (Ljava/lang/String;Lb;ILjava/lang/Object;)V
    //   2647: putfield ay : Lde;
    //   2650: invokestatic g : ()V
    //   2653: invokestatic f : ()V
    //   2656: iconst_0
    //   2657: goto -> 2888
    //   2660: iload_2
    //   2661: bipush #60
    //   2663: if_icmpge -> 2772
    //   2666: iload_3
    //   2667: bipush #40
    //   2669: if_icmpge -> 2772
    //   2672: aload_1
    //   2673: invokestatic e : ()Laf;
    //   2676: pop
    //   2677: invokespecial F : ()V
    //   2680: getstatic main/a.e : Z
    //   2683: ifne -> 2866
    //   2686: invokestatic e : ()Laf;
    //   2689: getfield aU : Laf;
    //   2692: getfield J : I
    //   2695: iflt -> 2866
    //   2698: getstatic bv.l : I
    //   2701: bipush #51
    //   2703: if_icmpeq -> 2866
    //   2706: getstatic bv.l : I
    //   2709: bipush #52
    //   2711: if_icmpeq -> 2866
    //   2714: aload_1
    //   2715: getfield bQ : Ldz;
    //   2718: ifnonnull -> 2866
    //   2721: getstatic main/a.G : Lg;
    //   2724: invokestatic e : ()Laf;
    //   2727: getfield aU : Laf;
    //   2730: invokevirtual a : (Laf;)V
    //   2733: getstatic main/a.G : Lg;
    //   2736: invokevirtual s : ()V
    //   2739: invokestatic a : ()Lbt;
    //   2742: invokestatic e : ()Laf;
    //   2745: getfield aU : Laf;
    //   2748: getfield J : I
    //   2751: invokevirtual c : (I)V
    //   2754: invokestatic a : ()Lbt;
    //   2757: invokestatic e : ()Laf;
    //   2760: getfield aU : Laf;
    //   2763: getfield J : I
    //   2766: invokevirtual y : (I)V
    //   2769: goto -> 2866
    //   2772: bipush #20
    //   2774: getstatic ds.a : Ljava/util/Random;
    //   2777: bipush #20
    //   2779: invokevirtual nextInt : (I)I
    //   2782: iadd
    //   2783: invokestatic e : ()Laf;
    //   2786: getfield B : I
    //   2789: invokestatic e : ()Laf;
    //   2792: getfield aU : Laf;
    //   2795: getfield B : I
    //   2798: if_icmple -> 2805
    //   2801: iconst_1
    //   2802: goto -> 2806
    //   2805: iconst_m1
    //   2806: imul
    //   2807: istore_1
    //   2808: invokestatic e : ()Laf;
    //   2811: new dm
    //   2814: dup
    //   2815: invokestatic e : ()Laf;
    //   2818: getfield aU : Laf;
    //   2821: getfield B : I
    //   2824: iload_1
    //   2825: iadd
    //   2826: invokestatic e : ()Laf;
    //   2829: getfield aU : Laf;
    //   2832: getfield C : I
    //   2835: invokespecial <init> : (II)V
    //   2838: putfield bP : Ldm;
    //   2841: invokestatic e : ()Laf;
    //   2844: new de
    //   2847: dup
    //   2848: aconst_null
    //   2849: aconst_null
    //   2850: sipush #8002
    //   2853: aconst_null
    //   2854: invokespecial <init> : (Ljava/lang/String;Lb;ILjava/lang/Object;)V
    //   2857: putfield ay : Lde;
    //   2860: invokestatic g : ()V
    //   2863: invokestatic f : ()V
    //   2866: iconst_0
    //   2867: goto -> 2888
    //   2870: invokestatic e : ()Laf;
    //   2873: getfield aV : Lce;
    //   2876: ifnull -> 2887
    //   2879: aload_1
    //   2880: invokespecial I : ()V
    //   2883: iconst_0
    //   2884: goto -> 2888
    //   2887: iconst_1
    //   2888: ifeq -> 2999
    //   2891: invokestatic e : ()Laf;
    //   2894: invokevirtual z : ()Z
    //   2897: ifeq -> 2938
    //   2900: invokestatic e : ()Laf;
    //   2903: invokevirtual O : ()Z
    //   2906: ifeq -> 2938
    //   2909: aload_0
    //   2910: invokespecial G : ()Z
    //   2913: ifeq -> 2929
    //   2916: invokestatic e : ()Laf;
    //   2919: pop
    //   2920: invokestatic e : ()Laf;
    //   2923: invokevirtual B : ()V
    //   2926: goto -> 2999
    //   2929: invokestatic e : ()Laf;
    //   2932: invokevirtual C : ()V
    //   2935: goto -> 2999
    //   2938: invokestatic e : ()Laf;
    //   2941: getfield B : I
    //   2944: invokestatic e : ()Laf;
    //   2947: getfield C : I
    //   2950: iconst_2
    //   2951: invokestatic a : (III)Z
    //   2954: istore_1
    //   2955: invokestatic e : ()Laf;
    //   2958: getstatic p.u : [Lci;
    //   2961: invokestatic e : ()Laf;
    //   2964: getfield aC : Lbf;
    //   2967: getfield b : S
    //   2970: aaload
    //   2971: iload_1
    //   2972: ifeq -> 2979
    //   2975: iconst_0
    //   2976: goto -> 2980
    //   2979: iconst_1
    //   2980: invokevirtual a : (Lci;I)V
    //   2983: iload_1
    //   2984: ifeq -> 2995
    //   2987: invokestatic e : ()Laf;
    //   2990: bipush #20
    //   2992: putfield bQ : I
    //   2995: invokestatic e : ()Laf;
    //   2998: pop
    //   2999: invokestatic e : ()Laf;
    //   3002: invokevirtual y : ()Z
    //   3005: ifeq -> 3013
    //   3008: aload_0
    //   3009: iconst_0
    //   3010: putfield aX : I
    //   3013: return
  }
  
  private void I() {
    if ((af.e()).aV != null) {
      if ((af.e()).B < (af.e()).aV.a) {
        (af.e()).I = 1;
      } else {
        (af.e()).I = -1;
      } 
      int i = Math.abs((af.e()).B - (af.e()).aV.a);
      int j = Math.abs((af.e()).C - (af.e()).aV.b);
      if (i <= 40 && j < 40) {
        a.g();
        a.f();
        if ((af.e()).aV.e.a != 673) {
          bt.a().l((af.e()).aV.d);
          return;
        } 
        do do = new do(5, 0, -100, 100, 5, aD.a[(af.e()).K][2]);
        ds.c(((af.e()).aT != null) ? "!null" : "null");
        String str = aw.az;
        String[] arrayOfString = { aw.bm, aw.bn };
        ds.c(((af.e()).aT != null) ? "!null" : "null");
        do.dk = 673;
        j();
        a(arrayOfString, do);
        ae.a(str, 100000, do, 5820);
        return;
      } 
      (af.e()).bP = new dm((af.e()).aV.a, (af.e()).aV.b);
      (af.e()).ay = new de(null, null, 8002, null);
      a.g();
      a.f();
    } 
  }
  
  private boolean J() {
    return ((af.e()).ci || (af.e()).ch || (af.e()).cj || (af.e()).cG || this.eo || (af.e()).bk);
  }
  
  private void a(bf parambf, boolean paramBoolean) {
    if ((af.e()).ce)
      return; 
    if (J())
      return; 
    if ((af.e()).aD.c <= 1)
      return; 
    (af.e()).aC = parambf;
    if (this.ey != parambf && this.ey != null) {
      bt.a().i(parambf.a.a);
      n();
      this.ey = parambf;
      this.ex = -1;
      (j()).aX = 0;
      return;
    } 
    if (af.e().x()) {
      ds.c(">>>use skill spec: " + parambf.a.a);
      af.e().a(parambf.a.a);
      n();
      this.ey = parambf;
      this.ex = -1;
      (j()).aX = 0;
      return;
    } 
    if (af.e().w()) {
      ds.c("use skill not focus");
      a(parambf);
      this.ey = parambf;
      return;
    } 
    this.ex = -1;
    if (parambf != null) {
      ds.c("only select skill");
      if (this.ey != parambf) {
        bt.a().i(parambf.a.a);
        n();
      } 
      if ((af.e()).aU == null && af.e().y()) {
        ds.c("return o day");
        return;
      } 
      if (af.e().O())
        a(true, true); 
      this.ey = parambf;
    } 
  }
  
  private void b(bf parambf, boolean paramBoolean) {
    if ((bv.l == 112 || bv.l == 113) && (af.e()).aN == 0)
      return; 
    if (af.e().w()) {
      a(parambf);
      return;
    } 
    this.ex = -1;
    if (parambf != null) {
      bt.a().i(parambf.a.a);
      n();
      (af.e()).aC = parambf;
      a(paramBoolean, true);
    } 
  }
  
  private void a(bf parambf) {
    if ((bv.l == 112 || bv.l == 113) && (af.e()).aN == 0)
      return; 
    if (G()) {
      this.ex = -1;
      if (parambf != null) {
        bt.a().i(parambf.a.a);
        n();
        (af.e()).aC = parambf;
        af.e();
        af.A();
        af.e();
        this.aX = 0;
      } 
    } 
  }
  
  public static void q() {
    for (byte b1 = 0; b1 < (af.e()).aA.size() - 1; b1++) {
      bf bf1 = (af.e()).aA.elementAt(b1);
      for (int i = b1 + 1; i < (af.e()).aA.size(); i++) {
        bf bf2;
        if ((bf2 = (af.e()).aA.elementAt(i)).a.a < bf1.a.a) {
          bf bf3 = bf2;
          bf2 = bf1;
          bf1 = bf3;
          (af.e()).aA.setElementAt(bf1, b1);
          (af.e()).aA.setElementAt(bf2, i);
        } 
      } 
    } 
  }
  
  private void K() {
    if (N())
      return; 
    for (byte b1 = 0; b1 < this.bm.length(); b1++) {
      this.bq[b1] = -1;
      if (a.f) {
        int i = (a.A - this.bm.length() * eI) / 2;
        int j = this.bm.length() * eI;
        int m = a.B - 40;
        int n = eI;
        if (a.a(i, m, j, n)) {
          i = (a.p - i) / eI;
          if (b1 == i)
            this.bq[b1] = 1; 
          if (a.l && a.m && b1 == i) {
            char[] arrayOfChar = this.bs.toCharArray();
            el el1 = new el("");
            for (m = 0; m < arrayOfChar.length; m++)
              el1.addElement((new StringBuffer(String.valueOf(arrayOfChar[m]))).toString()); 
            el1.removeElementAt(0);
            el1.insertElementAt((new StringBuffer(String.valueOf(this.bm.charAt(b1)))).toString(), el1.size());
            this.bs = "";
            for (m = 0; m < el1.size(); m++)
              this.bs = String.valueOf(this.bs) + ((String)el1.elementAt(m)).toUpperCase(); 
            bt.a().a(this.bm.charAt(b1));
          } 
        } 
      } 
    } 
  }
  
  public final void c() {
    if (a.w % 100 == 0 && bv.l == 137)
      bu = 30; 
    if (bj && a.w % 20 == 0) {
      p p2;
      if ((p2 = this).ev > 0)
        p2.ev--; 
      if (bk && !bl && (af.e()).H != 14 && (af.e()).H != 5 && !(af.e()).bl && !(af.e()).ci && !af.e().z()) {
        byte b1 = 0;
        byte b2;
        for (b2 = 0; b2 < F.size(); b2++) {
          aa aa1;
          if ((aa1 = F.elementAt(b2)).p != 0 && aa1.p != 1)
            b1 = 1; 
        } 
        if (b1) {
          b2 = 0;
          byte b3;
          for (b3 = 0; b3 < (af.e()).aF.length; b3++) {
            h h;
            if ((h = (af.e()).aF[b3]) != null && h.b.b == 6) {
              b2 = 1;
              break;
            } 
          } 
          if (b2 == 0 && a.w % 150 == 0)
            bt.a().v(); 
          if ((af.e()).U <= (af.e()).V * 20L / 100L || (af.e()).T <= (af.e()).W * 20L / 100L)
            p2.H(); 
          if ((af.e()).aQ == null || ((af.e()).aQ != null && (af.e()).aQ.J)) {
            for (b3 = 0; b3 < F.size(); b3++) {
              aa aa1;
              if ((aa1 = F.elementAt(b3)).p != 0 && aa1.p != 1 && aa1.k > 0L && !aa1.J) {
                (af.e()).B = aa1.m;
                (af.e()).C = aa1.n;
                (af.e()).aQ = aa1;
                bt.a().g();
                ds.c("focus 1 con bossssssssssssssssssssssssssssssssssssssssssssssssss");
                break;
              } 
            } 
          } else if ((af.e()).aQ.k <= 0L || (af.e()).aQ.p == 1 || (af.e()).aQ.p == 0) {
            (af.e()).aQ = null;
          } 
          if ((af.e()).aQ != null && p2.ev == 0 && (af.e().D() == null || (af.e()).cb >= (af.e().D()).length || (af.e()).cd == null || (af.e()).cc == null)) {
            bf bf1 = null;
            if (a.e) {
              for (b1 = 0; b1 < aQ.length; b1++) {
                if (aQ[b1] != null && !(aQ[b1]).j && (aQ[b1]).a.a != 10 && (aQ[b1]).a.a != 11 && (aQ[b1]).a.a != 14 && (aQ[b1]).a.a != 23 && (aQ[b1]).a.a != 7 && af.e().D() == null && !(aQ[b1]).a.c()) {
                  long l;
                  if ((aQ[b1]).a.d == 2) {
                    l = 1L;
                  } else if ((aQ[b1]).a.d != 1) {
                    l = (aQ[b1]).i;
                  } else {
                    l = (aQ[b1]).i * (af.e()).W / 100L;
                  } 
                  if ((af.e()).T >= l)
                    if (bf1 == null) {
                      bf1 = aQ[b1];
                    } else if (bf1.e < (aQ[b1]).e) {
                      bf1 = aQ[b1];
                    }  
                } 
              } 
              if (bf1 != null) {
                p2.a(bf1, true);
                p2.b((af.e()).aQ);
              } 
            } else {
              for (b1 = 0; b1 < aP.length; b1++) {
                if (aP[b1] != null && !(aP[b1]).j && (aP[b1]).a.a != 10 && (aP[b1]).a.a != 11 && (aP[b1]).a.a != 14 && (aP[b1]).a.a != 23 && (aP[b1]).a.a != 7 && af.e().D() == null) {
                  long l;
                  if ((aP[b1]).a.d == 2) {
                    l = 1L;
                  } else if ((aP[b1]).a.d != 1) {
                    l = (aP[b1]).i;
                  } else {
                    l = (aP[b1]).i * (af.e()).W / 100L;
                  } 
                  if ((af.e()).T >= l)
                    if (bf1 == null) {
                      bf1 = aP[b1];
                    } else if (bf1.e < (aP[b1]).e) {
                      bf1 = aP[b1];
                    }  
                } 
              } 
              if (bf1 != null) {
                p2.a(bf1, true);
                p2.b((af.e()).aQ);
              } 
            } 
          } 
        } 
      } 
    } 
    p p1;
    if ((p1 = this).fB != 0) {
      if ((eF = System.currentTimeMillis()) - eE > 1000L) {
        eE = System.currentTimeMillis();
        eG++;
      } 
      if (eG > 20) {
        for (byte b1 = 0; b1 < p1.fu.length; b1++)
          p1.fv[b1] = p1.fu[b1]; 
        p1.fB--;
        if (p1.fB == 0) {
          p1.fF = "";
          aD.a(p1.fA, 0);
          eG = 0;
        } 
      } else if (p1.fz > p1.fu.length - 1) {
        p1.fB--;
        if (p1.fB == 0) {
          p1.fF = "";
          aD.a(p1.fA, 0);
        } 
      } else {
        if (p1.fz < p1.fv.length)
          if (p1.fw[p1.fz] == 15) {
            if (p1.fv[p1.fz] == p1.fu[p1.fz] - 1)
              p1.fy[p1.fz] = 10; 
            if (p1.fv[p1.fz] == p1.fu[p1.fz]) {
              p1.fw[p1.fz] = -1;
              p1.fz++;
            } 
          } else if (a.w % 5 == 0) {
            p1.fw[p1.fz] = p1.fw[p1.fz] + 1;
          }  
        for (byte b1 = 0; b1 < p1.fu.length; b1++) {
          if (p1.fw[b1] != -1) {
            p1.fx[b1] = p1.fx[b1] + 1;
            if (p1.fx[b1] > p1.fw[b1] + p1.fy[b1]) {
              p1.fx[b1] = 0;
              p1.fv[b1] = p1.fv[b1] + 1;
              if (p1.fv[b1] >= 10)
                p1.fv[b1] = 0; 
            } 
          } 
        } 
      } 
    } 
    bl.d();
    this.dR++;
    if (this.dR == 100)
      this.dR = 0; 
    try {
      if (x.c)
        x.c = false; 
      if (M == 1)
        eC = System.currentTimeMillis(); 
      if (M == 100) {
        M = 0;
        int n = (int)((eD = System.currentTimeMillis()) - eC) / 1000;
        bt.a().g(n);
      } 
      if (z > 0 && --z == 0)
        ac.b = false; 
      if (!a) {
        if (j != l || k != m) {
          cD = l - j << 2;
          cE = m - k << 2;
          cB += cD;
          j += cB >> 4;
          cB &= 0xF;
          cC += cE;
          k += cC >> 4;
          cC &= 0xF;
          if (j < 24)
            j = 24; 
          if (j > n)
            j = n; 
          if (k < 0)
            k = 0; 
          if (k > cF)
            k = cF; 
        } 
        if ((o = j / bv.i - 1) < 0)
          o = 0; 
        p = k / bv.i;
        q = o + cw;
        r = p + cx;
        if (p < 0)
          p = 0; 
        if (r > bv.b - 1)
          r = bv.b - 1; 
        if ((bv.B = ((af.e()).B - 2 * d) / bv.i) < 0)
          bv.B = 0; 
        if ((bv.C = bv.B + bv.F) > bv.a)
          bv.B = (bv.C = bv.a) - bv.F; 
        if ((bv.D = ((af.e()).C - 2 * e) / bv.i) < 0)
          bv.D = 0; 
        if ((bv.E = bv.D + bv.G) > bv.b)
          bv.D = (bv.E = bv.b) - bv.G; 
        cK.b();
        cJ.b();
      } 
      cq.b().c();
      int m;
      for (m = 0; m < D.size(); m++)
        ((af)D.elementAt(m)).a(); 
      for (m = 0; m < cn.a.size(); m++)
        ((cn)cn.a.elementAt(m)).a(); 
      af.e().a();
      if ((af.e()).H == 1 && a.w % 100 == 0)
        System.gc(); 
      if (this.bQ != null)
        this.bQ.a(); 
      ei.a();
      for (m = 0; m < F.size(); m++)
        ((aa)F.elementAt(m)).c(); 
      for (m = 0; m < G.size(); m++)
        ((do)G.elementAt(m)).a(); 
      this.ew = aQ.length;
      for (m = aQ.length - 1; m >= 0; m--) {
        bf bf1;
        if ((bf1 = aQ[m]) != null) {
          this.ew = m + 1;
          break;
        } 
        this.ew--;
      } 
      m();
      a.a().j();
      for (m = 0; m < 5; m++) {
        if (bI[m] != -1)
          if (bI[m] > fa[m]) {
            fd[m] = fd[m] + 1;
            if (fd[m] == 25) {
              fd[m] = 0;
              bI[m] = -1;
              fa[m] = 0;
              fb[m] = 0;
              bG[m] = 0;
            } 
          } else {
            bI[m] = bI[m] + ds.g(fc[m]);
            bG[m] = bG[m] + fb[m];
            bH[m] = bH[m] + fc[m];
          }  
      } 
      bo.b();
      for (m = 0; m < 2; m++) {
        if (fg[m] != -1) {
          fg[m] = fg[m] + 1;
          fe[m] = fe[m] + (fi[m] << 2);
          ff[m] = ff[m] - 1;
          if (fg[m] >= 6) {
            fg[m] = -1;
          } else {
            fh[m] = (fg[m] >> 1) % 3;
          } 
        } 
      } 
      if (fo != fp) {
        fr = fp - fo << 2;
        fq += fr;
        fo += fq >> 4;
        fq &= 0xF;
      } 
      if (Math.abs(fp - fo) < 15 && fo < 0)
        fp = 0; 
      if (Math.abs(fp - fo) < 15 && fo > 0)
        fp = 0; 
      p p3;
      if ((p3 = this).eL > 0)
        p3.eL--; 
      p3.aV = false;
      bq bq;
      if (p3.aV && ((bq = p3.e(p3.eh, p3.ei)) == null || (bq != null && bq.equals((af.e()).aT) && bv.l == 51)))
        at.a(134, p3.eh, p3.ei + a.ae / 2, 3); 
      int j;
      for (j = 0; j < E.size(); j++)
        ((ce)E.elementAt(j)).a(); 
      for (j = dc.y.size() - 1; j >= 0; j--) {
        dc.x.removeElement(dc.y.elementAt(j));
        dc.y.removeElementAt(j);
      } 
      for (j = 0; j < dc.x.size(); j++) {
        dc dc;
        (dc = dc.x.elementAt(j)).a();
      } 
      for (j = 0; j < dc.z.size(); j++) {
        dc dc;
        (dc = dc.z.elementAt(j)).a();
      } 
      for (j = 0; j < dc.A.size(); j++) {
        dc dc;
        (dc = dc.A.elementAt(j)).a();
      } 
      for (j = 0; j < dc.B.size(); j++) {
        dc dc;
        (dc = dc.B.elementAt(j)).a();
      } 
      for (j = 0; j < dc.w.size(); j++) {
        dc dc;
        (dc = dc.w.elementAt(j)).a();
      } 
      ed.c();
      aD.a();
      aE.a();
      if (Q != null && !Q.equals(af.e()))
        Q.a(); 
      this.eH++;
      if (this.eH > 3)
        this.eH = 0; 
      if (this.bE) {
        this.bD++;
        if (this.bD == 20L) {
          this.bD = 0L;
          this.bE = false;
        } 
      } else if (this.bC > (af.e()).U) {
        long l;
        if ((l = this.bC - (af.e()).U >> 1L) < 1L)
          l = 1L; 
        this.bC -= l;
      } else {
        this.bC = (af.e()).U;
      } 
      if (this.bB) {
        this.bA++;
        if (this.bA == 20L) {
          this.bA = 0L;
          this.bB = false;
        } 
      } else if (this.bz > (af.e()).T) {
        long l;
        if ((l = this.bz - (af.e()).T >> 1L) < 1L)
          l = 1L; 
        this.bz -= l;
      } else {
        this.bz = (af.e()).T;
      } 
      if (this.dv > 0)
        this.dv--; 
      if (r())
        while (this.bg - 100 < k)
          k--;  
      for (j = 0; j < af.br.size(); j++)
        ((cy)af.br.elementAt(j)).a(); 
      for (j = 0; j < bv.size(); j++)
        ((cy)bv.elementAt(j)).a(); 
      p p2;
      if ((p2 = this).fE) {
        p2.fC -= 2;
        if (p2.fC < -p2.fD) {
          p2.fC = a.A;
          ft.removeElementAt(0);
          if (ft.size() == 0) {
            p2.bR = false;
            p2.fE = false;
          } else {
            p2.fD = di.c.a(ft.elementAt(0));
          } 
        } 
      } 
    } catch (Exception exception) {
      (p1 = null).printStackTrace();
    } 
    int i;
    if ((i = a.w % 4000) == 1000)
      as.a(as.a, 10); 
    dh.a();
  }
  
  public final boolean r() {
    return this.et;
  }
  
  private static void d(en paramen) {
    byte b1;
    for (b1 = 0; b1 < dc.x.size(); b1++) {
      dc dc;
      if ((dc = dc.x.elementAt(b1)) != null && !(dc instanceof ae))
        dc.a(paramen); 
    } 
    if (!a.a)
      for (b1 = 0; b1 < dc.A.size(); b1++) {
        dc dc;
        (dc = dc.A.elementAt(b1)).a(paramen);
      }  
    for (b1 = 0; b1 < dc.z.size(); b1++) {
      dc dc;
      (dc = dc.z.elementAt(b1)).a(paramen);
    } 
  }
  
  public static void a(en paramen, int paramInt) {
    byte b1;
    for (b1 = 0; b1 < bv.v.size(); b1++) {
      cz cz;
      if ((cz = bv.v.elementAt(b1)).c != -1 && cz.h == paramInt)
        cz.a(paramen); 
    } 
    if (bv.l == 48 && paramInt == 3 && a.P != null && a.P[0] != 0)
      for (b1 = 0; b1 < bv.c / a.P[0] + 1; b1++)
        paramen.a(a.N[0], b1 * a.P[0], bv.d - a.Q[0] - 70, 0);  
  }
  
  public static void b(en paramen) {
    if (a.a)
      return; 
    paramen.a(en, 0, 0, a.A, a.B);
  }
  
  public final void a(en paramen) {
    aN = 0;
    if (!bt)
      return; 
    if (this.aZ || (this.ba && ae.m == null)) {
      this.aY++;
      if ((this.aY < 30 && this.aY >= 0 && a.w % 4 == 0) || (this.aY >= 30 && this.aY <= 50 && a.w % 3 == 0) || this.aY > 50) {
        paramen.a(16777215);
        paramen.d(0, 0, a.A, a.B);
        if (this.aY > 50) {
          if (this.ba) {
            this.ba = false;
            this.aY = 0;
            if (this.bd) {
              c(this.bf, this.bg);
            } else {
              p p1;
              (p1 = this).bb = false;
              ei.a(17);
              if (p1.bc) {
                p1.bc = false;
                ei.a(25);
              } 
            } 
          } 
          g(paramen);
          paramen.a(-j, -k);
          paramen.a(0, a.ae);
          af.e().a(paramen);
          l.a(paramen);
          c(paramen);
          h(paramen);
          return;
        } 
        return;
      } 
    } 
    a.c(paramen);
    en en1 = paramen;
    if (l.c == 5)
      if (fN != null) {
        en1.a(16777215);
        en1.d(0, 0, a.A, a.B);
        en1.a(fN, a.A / 2, a.B / 2, 3);
      } else {
        boolean bool = (bv.o % 2 == 0) ? true : true;
        fN = l.b("/bg/bg_ios_" + bool + ".png");
      }  
    if ((this.bb || this.bR) && bv.o != 3)
      b(paramen); 
    if (bu > 0) {
      paramen.a(-j + eJ[bu % eJ.length], -k + eK[bu % eK.length]);
      bu--;
    } else {
      paramen.a(-j, -k);
    } 
    if (this.eo) {
      boolean bool = (a.w % 3 == 0) ? true : true;
      paramen.a(bool, 0);
    } 
    ed.c(paramen);
    ei.a(paramen);
    bv.a(paramen);
    bv.b(paramen);
    byte b1;
    for (b1 = 0; b1 < D.size(); b1++) {
      af af1;
      if ((af1 = D.elementAt(b1)).ck && bv.l == 128)
        af1.b(paramen, af1.B, af1.C, 0); 
    } 
    if ((af.e()).ck && bv.l == 128)
      af.e().b(paramen, (af.e()).B, (af.e()).C, 0); 
    a(paramen, 2);
    if ((af.e()).an != null && a.e)
      if (bb.cs == 20) {
        paramen.a(dz, (af.e()).an.j + j, (af.e()).an.k + k, 3);
      } else {
        paramen.a(dy, (af.e()).an.j + j, (af.e()).an.k + k, 3);
      }  
    ed.f(paramen);
    dh.a.a(paramen);
    for (b1 = 0; b1 < dc.B.size(); b1++) {
      dc dc;
      (dc = dc.B.elementAt(b1)).a(paramen);
    } 
    for (b1 = 0; b1 < cn.a.size(); b1++)
      ((cn)cn.a.elementAt(b1)).a(paramen); 
    for (b1 = 0; b1 < G.size(); b1++) {
      do do;
      if ((do = G.elementAt(b1)).U > 0L)
        do.c(paramen); 
    } 
    for (b1 = 0; b1 < G.size(); b1++)
      ((do)G.elementAt(b1)).a(paramen); 
    paramen.a(0, a.ae);
    for (b1 = 0; b1 < D.size(); b1++) {
      af af1 = null;
      try {
        af1 = D.elementAt(b1);
      } catch (Exception exception) {}
      if (af1 != null && (!a.G.a || !a.G.F()) && af1.bd)
        af1.c(paramen); 
    } 
    af.e().c(paramen);
    ei.b(paramen);
    for (b1 = 0; b1 < F.size(); b1++)
      ((aa)F.elementAt(b1)).a(paramen); 
    for (b1 = 0; b1 < cn.a.size(); b1++)
      ((cn)cn.a.elementAt(b1)).b(paramen); 
    for (b1 = 0; b1 < D.size(); b1++) {
      af af1 = null;
      try {
        af1 = D.elementAt(b1);
      } catch (Exception exception) {}
      if (af1 != null && (!a.G.a || !a.G.F()))
        af1.a(paramen); 
    } 
    af.e().a(paramen);
    if ((af.e()).cf != null && af.e().D() != null && (af.e()).cb < (af.e().D()).length) {
      af.e().d(paramen);
      af.e().b(paramen);
    } 
    for (b1 = 0; b1 < D.size(); b1++) {
      af af1 = null;
      try {
        af1 = D.elementAt(b1);
      } catch (Exception exception) {}
      if (af1 != null && (!a.G.a || !a.G.F()) && af1.cf != null && af1.D() != null && af1.cb < (af1.D()).length) {
        af1.d(paramen);
        af1.b(paramen);
      } 
    } 
    for (b1 = 0; b1 < E.size(); b1++)
      ((ce)E.elementAt(b1)).a(paramen); 
    paramen.a(0, -a.ae);
    i(paramen);
    d(paramen);
    a(paramen, 3);
    for (b1 = 0; b1 < G.size(); b1++) {
      do do;
      (do = G.elementAt(b1)).e(paramen);
    } 
    ei.c(paramen);
    for (b1 = 0; b1 < G.size(); b1++) {
      do do;
      if ((do = G.elementAt(b1)) != null && do.z != null)
        do.z.a(paramen, do.B, do.C - do.al - a.ae, do.I); 
    } 
    for (b1 = 0; b1 < D.size(); b1++) {
      af af1 = null;
      try {
        af1 = D.elementAt(b1);
      } catch (Exception exception) {}
      if (af1 != null && af1.z != null)
        af1.z.a(paramen, af1.B, af1.C - af1.al, af1.I); 
    } 
    if ((af.e()).z != null)
      (af.e()).z.a(paramen, (af.e()).B, (af.e()).C - (af.e()).al, (af.e()).I); 
    dh.c.a(paramen);
    dh.b.a(paramen);
    ed.d(paramen);
    int i;
    for (i = 0; i < bv.v.size(); i++) {
      cz cz;
      if ((cz = bv.v.elementAt(i)).c != -1 && cz.h > 3)
        cz.a(paramen); 
    } 
    bo.a(paramen);
    if (bv.l == 120) {
      if (this.bS != 100) {
        i = this.bS * en.a(dQ) / 100;
        paramen.a(dQ, bv.c / 2 - en.a(dQ) / 2, 220, 0);
        paramen.e(bv.c / 2 - en.a(dQ) / 2, 220, i, 10);
        paramen.a(dO, bv.c / 2 - en.a(dQ) / 2, 220, 0);
        paramen.e(0, 0, a.A, a.B);
      } 
      if (this.bT) {
        this.bU++;
        if (a.w % 3 == 0) {
          ea ea;
          ei.a(ea = new ea(19, ds.b(bv.c / 2 - 50, bv.c / 2 + 50), 340, 2, 1, -1));
        } 
        if (a.w % 15 == 0) {
          ea ea;
          ei.a(ea = new ea(18, ds.b(bv.c / 2 - 5, bv.c / 2 + 5), ds.b(300, 320), 2, 1, -1));
        } 
        if (this.bU == 100)
          b(bv.c / 2, 300); 
        if (this.bU == 110) {
          this.bU = 0;
          this.bT = false;
        } 
      } 
    } 
    ed.a(paramen);
    i = 1;
    for (b1 = 0; b1 < ed.a.size(); b1++) {
      ed ed;
      if ((ed = ed.a.elementAt(b1)).b == 0) {
        i = 0;
        break;
      } 
    } 
    if (en.b <= 1)
      i = 0; 
    if (i != 0 && !this.bb) {
      int m;
      if ((m = bv.c / (en.a(bv.A) + 50)) <= 0)
        m = 1; 
      if (bv.e != 28)
        for (b1 = 0; b1 < m; b1++) {
          int n = 100 + b1 * (en.a(bv.A) + 50) - j / 2;
          i = en.a(bv.A);
          if (n + i >= j && n <= j + a.A && -20 + en.b(bv.A) >= k && -20 <= k + a.B)
            paramen.a(bv.A, 100 + b1 * (en.a(bv.A) + 50) - j / 2, -20, 0); 
        }  
    } 
    l.a(paramen);
    f(paramen);
    if (!a && bn == 1 && !a.G.a)
      g(paramen); 
    c(paramen);
    j(paramen);
    if (!a) {
      if (a.an && bv.l != 170)
        if (a.A > 250) {
          paramen.a(a.ah, 160, 6, 0);
          di.s.a(paramen, "Chơi quá 180 phút một ngày ", 180, 2, 0);
          di.s.a(paramen, "sẽ ảnh hưởng xấu đến sức khỏe.", 180, 12, 0);
        } else {
          paramen.a(a.ah, 5, a.B - 67, 0);
          di.s.a(paramen, "Chơi quá 180 phút một ngày sẽ ảnh hưởng xấu đến sức khỏe.", 25, a.B - 70, 0);
        }  
      paramen.a(-paramen.a(), -paramen.b());
      if ((bv.l == 128 || bv.l == 127) && bW != 0) {
        paramen.a(0);
        paramen.d(3, 88, 54, 8);
        paramen.a(16711680);
        paramen.e(5, 90, bW, 4);
        paramen.d(5, 90, 50, 4);
        paramen.e(0, 0, 3000, 3000);
        di.c.a(paramen, "Mabu", 30, 98, 2, di.f);
      } 
      if ((af.e()).cL) {
        (af.e()).cM++;
        if (a.w % 3 == 0) {
          paramen.a(16777215);
          paramen.d(0, 0, a.A, a.B);
        } 
        if ((af.e()).cM >= 100)
          af.e().U(); 
      } 
      for (b1 = 0; b1 < D.size(); b1++) {
        af af1 = null;
        try {
          af1 = D.elementAt(b1);
        } catch (Exception exception) {}
        if (af1 != null && af1.cL && af.a(af1)) {
          af1.cM++;
          if (a.w % 3 == 0) {
            paramen.a(16777215);
            paramen.d(0, 0, a.A, a.B);
          } 
          if (af1.cM >= 100)
            af1.U(); 
        } 
      } 
      c(paramen);
      h(paramen);
      c(paramen);
      en en2 = paramen;
      p p1;
      if (a.e && a.f && !(p1 = this).N()) {
        c(en2);
        if (!bv.d() && !p1.u())
          if (bb.cs == 15) {
            en2.a(dz, eN + 17, eO + 17, 3);
          } else {
            en2.a(dy, eN + 17, eO + 17, 3);
          }  
      } 
      c(paramen);
      en2 = paramen;
      p1 = this;
      if (ft.size() != 0 && bV) {
        en2.e(0, a.B - 13, a.A, 15);
        en2.a(0, a.B - 13, a.A, 15, 0);
        String str = ft.elementAt(0);
        di.e.a(en2, str, p1.fC, a.B - 12, 0);
      } 
      if (!a.G.a && a.K == null && ae.m == null && ae.n == null && a.E.equals(c))
        super.a(paramen); 
      c(paramen);
      int m = 100 + ((af.br.size() != 0) ? (bv.size() * 12) : 0);
      if ((af.e()).ai != null) {
        byte b2 = 0;
        byte b3 = 0;
        i = (a.B - 100 - 60) / 12;
        for (b1 = 0; b1 < D.size(); b1++) {
          af af1;
          if ((af1 = D.elementAt(b1)).ah != -1 && af1.ah == (af.e()).ai.a)
            if (af1.F() && af1.B < (af.e()).B) {
              int n = i;
              if (af.br.size() != 0)
                n -= bv.size(); 
              if (b2 <= n) {
                di.r.a(paramen, af1.ag, 20, m - 12 + b2 * 12, 0, di.o);
                af1.a(paramen, 10, m + b2 * 12 - 5);
                b2++;
              } 
            } else if (af1.F() && af1.B > (af.e()).B && b3 <= i) {
              di.r.a(paramen, af1.ag, a.A - 25, m - 12 + b3 * 12, 1, di.o);
              af1.a(paramen, a.A - 15, m + b3 * 12 - 5);
              b3++;
            }  
        } 
      } 
      cq.b().a(paramen);
      if (aW && !a.G.a && a.w % 4 == 0)
        paramen.a(ce.f, this.aR.j + 15, this.aR.k + 30, 33); 
      if (this.eo) {
        this.es += 5;
        if (this.ep >= 0)
          this.ep += this.es; 
        if (this.ep < 0) {
          this.ep--;
          if (this.ep == -20) {
            this.eo = false;
            this.ep = 0;
            this.es = 0;
          } 
        } else if ((this.eq - this.ep > 0 || this.ep < bv.c) && this.ep > 0) {
          paramen.a(16777215);
          if (!a.a && l.c != 3 && l.c != 5) {
            paramen.a(this.eq - this.ep, this.er - this.ep, 2 * this.ep, 2 * this.ep, 0, 360);
          } else {
            paramen.d(0, 0, a.A, a.B);
          } 
        } else {
          this.ep = -1;
        } 
      } 
      for (b1 = 0; b1 < af.br.size(); b1++) {
        m = 55;
        i = this.aR.j + 32 + b1 * 24;
        en2 = paramen;
        cy cy = af.br.elementAt(b1);
        bl.b(en2, cy.a, i, 55, 0, 3);
        String str = String.valueOf(cy.c) + "'";
        if (cy.c == 0)
          str = String.valueOf(cy.b) + "s"; 
        di.c.a(en2, str, i, 70, 2, di.f);
      } 
      for (b1 = 0; b1 < bv.size(); b1++)
        ((cy)bv.elementAt(b1)).a(paramen, this.aR.j + ((af.br.size() != 0) ? 5 : 25), ((af.br.size() != 0) ? 90 : 45) + b1 * 12); 
      e(paramen);
      if (aw.fA == 1) {
        long l1 = l.d() - aS;
        long l2 = l1;
        Calendar calendar;
        (calendar = Calendar.getInstance()).setTime(new Date(l2 + 25200000L));
        m = calendar.get(11);
        int n = calendar.get(12);
        di.c.a(paramen, String.valueOf(m) + "h" + n + "m", 10, a.B - 65, 0, di.f);
      } 
      if (!this.fF.equals(""))
        for (b1 = 0; b1 < this.fG.length; b1++)
          di.c.a(paramen, this.fG[b1], 5, 85 + b1 * 18, 0, di.f);  
    } 
    int j;
    if ((j = a.C) > 200)
      j = 200; 
    a(paramen, 0 + a.A / 2, 0, j);
    dh.d.a(paramen);
    if (cb > l.d() && bv.l == 170 && ce && cd / 2 > 0)
      try {
        a(paramen, 0 + a.A / 2, 0);
      } catch (Exception exception) {} 
    if (bv.l == 172) {
      String.valueOf(aw.aA) + "  " + ci + "/" + cj;
      di.f.a(paramen, String.valueOf(aw.aA) + "  " + ci + "/" + cj, a.A - 10, 40, 1);
    } 
  }
  
  private void e(en paramen) {
    if (this.fB != 0) {
      String str = "";
      for (byte b1 = 0; b1 < this.fu.length; b1++)
        str = String.valueOf(str) + this.fv[b1] + " "; 
      bo.a(paramen, 20, 45, 95, 35, 16777215, false);
      di.f.a(paramen, aw.m, 68, 50, 2);
      di.f.a(paramen, (new StringBuffer(String.valueOf(str))).toString(), 68, 65, 2);
    } 
  }
  
  public static do a(short paramShort) {
    for (byte b1 = 0; b1 < G.size(); b1++) {
      do do;
      if ((do = G.elementAt(b1)).df.a == paramShort)
        return do; 
    } 
    return null;
  }
  
  public static af b(int paramInt) {
    for (byte b1 = 0; b1 < D.size(); b1++) {
      af af1;
      if ((af1 = D.elementAt(b1)).J == paramInt)
        return af1; 
    } 
    return null;
  }
  
  public static aa c(int paramInt) {
    for (byte b1 = 0; b1 < F.size(); b1++) {
      aa aa1;
      if ((aa1 = F.elementAt(b1)).y == paramInt)
        return aa1; 
    } 
    return null;
  }
  
  public static aa a(byte paramByte) {
    return F.elementAt(paramByte);
  }
  
  public static do s() {
    for (byte b1 = 0; b1 < G.size(); b1++) {
      do do;
      if ((do = G.elementAt(b1)).df.a == x())
        return do; 
    } 
    return null;
  }
  
  private static void f(en paramen) {
    try {
      if (ae.m != null)
        return; 
      int i;
      if ((i = x()) == -1)
        return; 
      do do = null;
      int m;
      for (m = 0; m < G.size(); m++) {
        do do1;
        if ((do1 = G.elementAt(m)).df.a == i)
          if (do == null) {
            do = do1;
          } else if (ds.g(do1.B - (af.e()).B) < ds.g(do.B - (af.e()).B)) {
            do = do1;
          }  
      } 
      if (do == null || do.H == 15)
        return; 
      if (do.B > j && do.B < j + d && do.C > k && do.C < k + e)
        return; 
      if (a.w % 10 < 5)
        return; 
      m = do.B - (af.e()).B;
      int n = do.C - (af.e()).C;
      i = 0;
      int j = 0;
      byte b1 = 0;
      if (m > 0 && n >= 0) {
        if (ds.g(m) >= ds.g(n)) {
          int i1 = d - 10;
          j = e / 2 + 30;
          if (a.e)
            j = e / 2 + 10; 
          b1 = 0;
        } else {
          int i1 = d / 2;
          j = e - 10;
          b1 = 5;
        } 
      } else if (m >= 0 && n < 0) {
        if (ds.g(m) >= ds.g(n)) {
          int i1 = d - 10;
          j = e / 2 + 30;
          if (a.e)
            j = e / 2 + 10; 
          b1 = 0;
        } else {
          int i1 = d / 2;
          j = 10;
          b1 = 6;
        } 
      } 
      if (m < 0 && n >= 0) {
        if (ds.g(m) >= ds.g(n)) {
          i = 10;
          j = e / 2 + 30;
          if (a.e)
            j = e / 2 + 10; 
          b1 = 3;
        } else {
          int i1 = d / 2;
          j = e - 10;
          b1 = 5;
        } 
      } else if (m <= 0 && n < 0) {
        if (ds.g(m) >= ds.g(n)) {
          i = 10;
          j = e / 2 + 30;
          if (a.e)
            j = e / 2 + 10; 
          b1 = 3;
        } else {
          i = d / 2;
          j = 10;
          b1 = 6;
        } 
      } 
      c(paramen);
      paramen.a(bw, 0, 0, 13, 16, b1, i, j, cj.f);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static void c(en paramen) {
    paramen.a(-paramen.a(), -paramen.b());
    paramen.e(0, -200, a.A, 200 + a.B);
  }
  
  private void a(en paramen, af paramaf) {
    int j = (int)(paramaf.U * fm / paramaf.V);
    int m = (int)(paramaf.T * fl / paramaf.W);
    int n = (int)(this.bC * fm / paramaf.V);
    int i = (int)(this.bz * fl / paramaf.W);
    paramen.e(a.A / 2 + 58 - en.a(dM), 0, 95, 100);
    paramen.b(dM, 0, 0, en.a(dM), en.b(dM), 2, a.A / 2 + 60, 0, 24);
    paramen.e((int)((a.A / 2 + 60 - 83) - fm + fm - n), 5, n, 10);
    paramen.a(dQ, a.A / 2 + 60 - 83, 5, 24);
    paramen.e(0, 0, a.A, a.B);
    paramen.e((int)((a.A / 2 + 60 - 83) - fm + fm - j), 5, j, 10);
    paramen.a(dO, a.A / 2 + 60 - 83, 5, 24);
    paramen.e(0, 0, a.A, a.B);
    paramen.e((int)((a.A / 2 + 60 - 83 - fl) + fm - i), 20, i, 6);
    paramen.a(aG, a.A / 2 + 60 - 83, 20, 24);
    paramen.e(0, 0, a.A, a.B);
    paramen.e((int)((a.A / 2 + 60 - 83 - fl) + fm - m), 20, m, 6);
    paramen.a(aF, a.A / 2 + 60 - 83, 20, 24);
    paramen.e(0, 0, a.A, a.B);
  }
  
  private void a(en paramen, boolean paramBoolean, af paramaf) {
    int i;
    int j;
    int m;
    if (paramaf == null)
      return; 
    if (paramaf.J == (af.e()).J) {
      i = (int)(this.bC * fm / paramaf.V);
      j = (int)(this.bz * fl / paramaf.W);
      m = (int)(paramaf.U * fm / paramaf.V);
    } else {
      i = (int)(paramaf.cT * fm / paramaf.V);
      j = paramaf.cS * fl / 100;
      m = (int)(paramaf.U * fm / paramaf.V);
    } 
    if ((af.e()).bN > 0) {
      int n = (af.e()).bL * fk / (af.e()).bM;
      paramen.a(dN, 58, 29, 0);
      paramen.e(83, 31, n, 10);
      paramen.a(dP, 83, 31, 0);
      paramen.e(0, 0, a.A, a.B);
      di.s.a(paramen, String.valueOf((af.e()).bK) + ":" + (af.e()).bL + "/" + (af.e()).bM, 115, 29, 2);
    } 
    if (paramaf.J != (af.e()).J)
      paramen.e(en.a(dM) - 95, 0, 95, 100); 
    paramen.a(dM, 0, 0, 0);
    paramen.e(83, 5, i, 10);
    paramen.a(dQ, 83, 5, 0);
    paramen.e(0, 0, a.A, a.B);
    paramen.e(83, 5, m, 10);
    paramen.a(dO, 83, 5, 0);
    paramen.e(0, 0, a.A, a.B);
    paramen.e(83, 20, j, 6);
    paramen.a(aG, 83, 20, 0);
    paramen.e(0, 0, a.A, a.B);
    paramen.e(83, 20, j, 6);
    paramen.a(aF, 83, 20, 0);
    paramen.e(0, 0, a.A, a.B);
    if ((af.e()).T == 0L && a.w % 10 > 5) {
      paramen.e(83, 20, 2, 6);
      paramen.a(aG, 83, 20, 0);
      paramen.e(0, 0, a.A, a.B);
    } 
  }
  
  public final void t() {
    this.eX = this.eY = System.currentTimeMillis();
    this.eZ = 180;
  }
  
  private static af L() {
    for (byte b1 = 0; b1 < D.size(); b1++) {
      af af1;
      if ((af1 = D.elementAt(b1)).aN != 0)
        return af1; 
    } 
    return null;
  }
  
  private af M() {
    for (byte b1 = 0; b1 < D.size(); b1++) {
      af af1;
      if ((af1 = D.elementAt(b1)).aN != 0 && af1 != L())
        return af1; 
    } 
    return null;
  }
  
  private void g(en paramen) {
    if (af.bI)
      return; 
    c(paramen);
    if (bv.l == 130 && L() != null && M() != null) {
      paramen.a(a.A / 2 - 62, 0);
      a(paramen, true, L());
      paramen.a(-(a.A / 2 - 65), 0);
      a(paramen, M());
      L().b(paramen, 137, 25, 0);
      M().b(paramen, a.A - 15 - 122, 25, 2);
    } else if (u() && (af.e()).aU != null) {
      paramen.a(a.A / 2 - 62, 0);
      a(paramen, true, (af.e()).aU);
      paramen.a(-(a.A / 2 - 65), 0);
      a(paramen, af.e());
      af.e().b(paramen, 137, 25, 0);
      (af.e()).aU.b(paramen, a.A - 15 - 122, 25, 2);
    } else if (O() && ((a.A <= 320))) {
      af af1 = af.e();
      boolean bool = true;
      bool = true;
      en en1;
      (en1 = paramen).a(fM, 1, 1, 0);
      int j = fH.getWidth();
      int m = fH.getHeight() / 2;
      int i;
      if ((i = (int)(af1.U * j / af1.V)) <= 0) {
        i = 1;
      } else if (i > j) {
        i = j;
      } 
      en1.a(fH, 0, m, i, m, 0, 4, 20, 0);
      if ((i = (int)(af1.T * j / af1.W)) <= 0) {
        i = 1;
      } else if (i > j) {
        i = j;
      } 
      en1.a(fH, 0, 0, i, m, 0, 4, 26, 0);
      i = 1 + fM.getWidth() / 2 + 1;
      di.m.a(en1, af1.ag, i, 5, 2);
      if (af1.aQ != null) {
        if (af1.aQ.z() != null)
          di.m.a(en1, (af1.aQ.z()).e, i, 33, 2); 
      } else if (af1.aT != null) {
        di.m.a(en1, af1.aT.df.b, i, 33, 2);
      } else if (af1.aU != null) {
        di.m.a(en1, af1.aU.ag, i, 33, 2);
      } 
    } else {
      a(paramen, true, af.e());
      if (af.e().i() != null || af.e().j() != null) {
        di.m.a(paramen, aw.bw, this.fn / 2, 8, 2);
      } else if ((af.e()).aQ != null) {
        if ((af.e()).aQ.z() != null)
          di.m.a(paramen, ((af.e()).aQ.z()).e, this.fn / 2, 9, 2); 
        if ((af.e()).aQ.C != 0)
          di.m.a(paramen, (new StringBuffer(String.valueOf(ai.a((af.e()).aQ.k)))).toString(), this.fn / 2, 22, 2); 
      } else if ((af.e()).aT != null) {
        di.m.a(paramen, (af.e()).aT.df.b, this.fn / 2, 9, 2);
        if ((af.e()).aT.df.a == 4)
          di.m.a(paramen, String.valueOf((j()).aM.b) + "/" + (j()).aM.d, this.fn / 2, 22, 2); 
      } else if ((af.e()).aU != null) {
        di.m.a(paramen, (af.e()).aU.ag, this.fn / 2, 9, 2);
        di.m.a(paramen, (new StringBuffer(String.valueOf(ai.a((af.e()).aU.U)))).toString(), this.fn / 2, 22, 2);
      } else {
        di.m.a(paramen, (af.e()).ag, this.fn / 2, 9, 2);
        di.m.a(paramen, (new StringBuffer(String.valueOf(ai.a((af.e()).y)))).toString(), this.fn / 2, 22, 2);
      } 
    } 
    paramen.a(-paramen.a(), -paramen.b());
    if (u() && this.eZ > 0) {
      this.eX = System.currentTimeMillis();
      if (this.eX - this.eY >= 1000L) {
        this.eY = System.currentTimeMillis();
        this.eZ--;
      } 
      di.c.a(paramen, (new StringBuffer(String.valueOf(this.eZ))).toString(), a.A / 2, 13, 2, di.f);
    } 
    if (this.ez) {
      paramen.a(ce.f, 40, 35, 33);
      this.eA--;
      if (this.eA < 0) {
        this.eA = 0;
        this.ez = false;
      } 
    } 
  }
  
  public final boolean u() {
    return (bv.a() && ((af.e()).aN != 0 || (bv.l == 130 && L() != null && M() != null)));
  }
  
  private void h(en paramen) {
    if (this.aL != null) {
      en en2 = paramen;
      p p1 = this;
      es.a(en2, (af.e()).B, (af.e()).C);
      en2.a(-en2.a(), -en2.b());
      if (!a.F.a && !a.G.a && ae.m == null && a.e)
        for (byte b1 = 0; b1 < p1.bm.length(); b1++) {
          int j = (a.A - p1.bm.length() * eI) / 2 + b1 * eI + eI / 2;
          if (p1.bq[b1] == -1) {
            en2.a(bo, j, a.B - 25, 3);
            di.f.a(en2, (new StringBuffer(String.valueOf(p1.bm.charAt(b1)))).toString(), j, a.B - 30, 2);
          } else {
            en2.a(bp, j, a.B - 25, 3);
            di.g.a(en2, (new StringBuffer(String.valueOf(p1.bm.charAt(b1)))).toString(), j, a.B - 30, 2);
          } 
        }  
      return;
    } 
    if (a.K != null || ae.m != null || a.F.a || a.G.a || (af.e()).aD.c == 0 || (cq.b()).b || a.E == a.a)
      return; 
    long l1;
    long l2 = (l1 = l.d()) - this.em;
    int i = 0;
    if (l2 < 10000L)
      i = (int)(l2 * 20L / 10000L); 
    if (!a.e) {
      paramen.a((bb.cs == 10) ? av : au, eV + bx - 1, by - 1, 0);
      bl.b(paramen, 542, eV + bx + 3, by + 3, 0, 0);
      di.u.a(paramen, t, eV + bx + 22, by + 15, 1);
      if (l2 < 10000L) {
        paramen.a(2721889);
        i = (int)(l2 * 20L / 10000L);
        paramen.d(eV + bx + 3, by + 3 + i, 20, 20 - i);
      } 
    } else if ((af.e()).H != 14) {
      if (dS.b) {
        if (aO != 1) {
          paramen.a(9670800);
          paramen.d(bx + 9, by + 10 + 10, 22, 20);
          paramen.a(16777215);
          paramen.d(bx + 9, by + 10 + ((i != 0) ? (20 - i) : 0) + 10, 22, (i != 0) ? i : 20);
          paramen.a((bb.cs == 10) ? dD : dC, bx, by + 10, 0);
          di.p.a(paramen, t, bx + 20, by + 15 + 10, 2);
          if (ch) {
            paramen.a((bb.cs == 14) ? dJ : dI, bx + 5, by - 6 - 40 + 10, 0);
          } else if (ck) {
            paramen.a((bb.cs == 14) ? bo : bp, bx + 5, by - 6 - 40 + 10, 0);
            bl.b(paramen, 1088, bx - 7 + 5, by - 6 - 40 - 7 + 10, 0, 0);
          } else if (cl) {
            paramen.a((bb.cs == 14) ? bo : bp, bx + 5, by - 6 - 40 + 10, 0);
            bl.b(paramen, 1087, bx - 7 + 5, by - 6 - 40 - 7 + 10, 0, 0);
          } 
        } else if (aO == 1) {
          paramen.a((bb.cs == 10) ? av : au, eV + bx - 1, by - 1 + 10, 0);
          bl.b(paramen, 542, eV + bx + 3, by + 3 + 10, 0, 0);
          di.u.a(paramen, t, eV + bx + 22, by + 13 + 10, 1);
          if (l2 < 10000L) {
            paramen.a(2721889);
            i = (int)(l2 * 20L / 10000L);
            paramen.d(eV + bx + 3, by + 3 + i + 10, 20, 20 - i);
          } 
          if (ch) {
            paramen.a((bb.cs == 14) ? dL : dK, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
          } else if (ck) {
            paramen.a((bb.cs == 14) ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
            bl.b(paramen, 1088, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
          } else if (cl) {
            paramen.a((bb.cs == 14) ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
            bl.b(paramen, 1087, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
          } 
        } 
      } else if (aO != 1) {
        paramen.a(9670800);
        paramen.d(bx + 9, by + 10 - 6, 22, 20);
        paramen.a(16777215);
        paramen.d(bx + 9, by + 10 + ((i != 0) ? (20 - i) : 0) - 6, 22, (i != 0) ? i : 20);
        paramen.a((bb.cs == 10) ? dD : dC, bx, by - 6, 0);
        di.p.a(paramen, t, bx + 20, by + 15 - 6, 2);
        if (ch) {
          paramen.a((bb.cs == 14) ? dJ : dI, bx, by - 6 - 40, 0);
        } else if (ck) {
          paramen.a((bb.cs == 14) ? bp : bo, bx + 20, by + 20 - 6 - 40, 3);
          bl.b(paramen, 1088, bx + 20 - 7, by + 20 - 6 - 40 - 7, 0, 0);
        } else if (cl) {
          paramen.a((bb.cs == 14) ? bp : bo, bx + 20, by + 20 - 6 - 40, 3);
          bl.b(paramen, 1087, bx + 20 - 7, by + 20 - 6 - 40 - 7, 0, 0);
        } 
      } else {
        paramen.a(9670800);
        paramen.d(bx + 10, by + 10 - 6 + 10, 20, 18);
        paramen.a(16777215);
        paramen.d(bx + 10, by + 10 + ((i != 0) ? (20 - i) : 0) - 6 + 10, 20, (i != 0) ? i : 18);
        paramen.a((bb.cs == 10) ? dF : dE, bx + 20, by + 20 - 6 + 10, 3);
        di.p.a(paramen, t, bx + 20, by + 15 - 6 + 10, 2);
        if (ch) {
          paramen.a((bb.cs == 14) ? dL : dK, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
        } else if (ck) {
          paramen.a((bb.cs == 14) ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
          bl.b(paramen, 1088, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
        } else if (cl) {
          paramen.a((bb.cs == 14) ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
          bl.b(paramen, 1087, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
        } 
      } 
    } 
    if (O) {
      bf[] arrayOfBf = a.e ? aQ : aP;
      if (!a.e) {
        paramen.a(11152401);
        paramen.d(eV + bx + 2, by - 10 + 6, 20, 10);
        di.s.a(paramen, "*", eV + bx + 12, by - 8 + 6, 2);
      } 
      int j = a.e ? this.ew : arrayOfBf.length;
      for (byte b1 = 0; b1 < j; b1++) {
        if (!a.e) {
          (new String[5])[0] = "Q";
          (new String[5])[1] = "W";
          (new String[5])[2] = "E";
          (new String[5])[3] = "R";
          (new String[5])[4] = "T";
          (new String[5])[0] = "7";
          (new String[5])[1] = "8";
          (new String[5])[2] = "9";
          (new String[5])[3] = "1";
          (new String[5])[4] = "3";
          String[] arrayOfString = cd.g ? new String[5] : new String[5];
          paramen.a(11152401);
          paramen.d(eV + eT[b1] + 2, eU[b1] - 10 + 8, 20, 10);
          di.s.a(paramen, arrayOfString[b1], eV + eT[b1] + 12, eU[b1] - 10 + 6, 2);
        } 
        bf bf1;
        if ((bf1 = arrayOfBf[b1]) != (af.e()).aC)
          paramen.a(au, eV + eT[b1] - 1, eU[b1] - 1, 0); 
        if (bf1 != null) {
          int m;
          if (bf1 == (af.e()).aC) {
            paramen.a(av, eV + eT[b1] - 1, eU[b1] - 1, 0);
            if (a.e)
              paramen.a(aa.R, 0, 12, 9, 6, 0, eV + eT[b1] + 8, eU[b1] - 7, 0); 
          } 
          en en2 = paramen;
          int i1 = eU[b1] + 13;
          int n = eV + eT[b1] + 13;
          bf1 = bf1;
          bl.b(en2, bf1.a.f, n, i1, 0, cj.f);
          long l3;
          long l4;
          if ((l4 = (l3 = System.currentTimeMillis()) - bf1.f) < bf1.e) {
            en2.a(2721889);
            if (bf1.j && a.w % 6 > 2)
              en2.a(876862); 
            m = (int)(l4 * 20L / bf1.e);
            en2.d(n - 10, i1 - 10 + m, 20, 20 - m);
          } else {
            m.j = false;
          } 
          if ((b1 == this.ex && a.w % 10 > 5) || b1 == this.eB)
            paramen.a(ce.f, eV + eT[b1] + 13, eU[b1] + 14, 3); 
        } 
      } 
    } 
    en en1 = paramen;
    if (aO != 0 && (af.e()).H != 14) {
      en1.a((bb.cs == 5) ? dH : dG, eP + 20, eQ + 20, 3);
      dS.a(en1);
      en1.a((bb.cs == 13) ? dB : dA, eR + 20, eS + 20, 3);
    } 
  }
  
  public static final void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt3 = -1;
    byte b1;
    for (b1 = 0; b1 < 5; b1++) {
      if (bI[b1] == -1) {
        paramInt3 = b1;
        break;
      } 
    } 
    if (paramInt3 == -1)
      return; 
    bJ[paramInt3] = paramInt5;
    bF[paramInt3] = paramString;
    bG[paramInt3] = paramInt1;
    bH[paramInt3] = paramInt2;
    fb[paramInt3] = 0;
    fc[paramInt3] = (paramInt4 < 0) ? -5 : 5;
    bI[paramInt3] = 0;
    fd[paramInt3] = 0;
    fa[paramInt3] = 10;
    for (b1 = 0; b1 < 5; b1++) {
      if (bI[b1] != -1 && paramInt3 != b1 && fc[paramInt3] < 0 && ds.g(bG[paramInt3] - bG[b1]) <= 20 && fa[paramInt3] == fa[b1])
        fa[paramInt3] = fa[paramInt3] + 10; 
    } 
  }
  
  public static final boolean a(int paramInt1, int paramInt2, int paramInt3) {
    boolean bool = (fg[0] == -1) ? false : true;
    if (fg[bool] != -1)
      return false; 
    fg[bool] = 0;
    fi[bool] = paramInt3;
    fe[bool] = paramInt1;
    ff[bool] = paramInt2;
    return true;
  }
  
  private static void i(en paramen) {
    for (byte b1 = 0; b1 < 2; b1++) {
      if (fg[b1] != -1)
        if (fi[b1] == 1) {
          paramen.a(fj[fh[b1]], fe[b1], ff[b1], 3);
        } else {
          paramen.a(fj[fh[b1]], 0, 0, en.a(fj[fh[b1]]), en.b(fj[fh[b1]]), 2, fe[b1], ff[b1], 3);
        }  
    } 
  }
  
  private boolean N() {
    return (!a.f && a.E == j()) ? true : (!a.e ? true : ((cq.b()).b ? true : (bp.a ? true : (!(a.K == null && ae.m == null && !a.F.a && !a.G.a)))));
  }
  
  public static void d(int paramInt1, int paramInt2) {
    if (a.A == 128 || a.B <= 208) {
      paramInt1 = 126;
      paramInt2 = 160;
    } 
    bM = paramInt1;
    bN = paramInt2;
    bL = f - paramInt1 / 2;
    bK = cz - paramInt2 / 2;
    if (a.e) {
      if (a.B <= 240)
        bK -= 10; 
      if (a.e && !a.g && a.E instanceof p) {
        bM = 310;
        bL = d / 2 - bM / 2;
      } 
    } 
    if (bK < -10)
      bK = -10; 
    if (a.B > 208 && bK < 0)
      bK = 0; 
    if (a.B == 208 && bK < 10)
      bK = 10; 
  }
  
  public static void v() {
    bv.e();
  }
  
  public static int w() {
    int i;
    if ((af.e()).aD == null) {
      i = -1;
    } else {
      i = ad[(af.e()).aD.a];
    } 
    return i;
  }
  
  public static byte x() {
    byte b1 = 0;
    if ((af.e()).aD == null) {
      b1 = -1;
    } else if ((af.e()).aD.a <= ac.length - 1) {
      b1 = (byte)ac[(af.e()).aD.a];
    } 
    return b1;
  }
  
  public final void a(String paramString1, String paramString2) {
    (cq.b()).b = false;
    if (paramString2.equals(aw.cP)) {
      if (aE.h == (af.e()).J)
        return; 
      bt.a().a(paramString1, aE.h);
      return;
    } 
    if (paramString1.equals(""))
      return; 
    if (paramString1.equals("pingABCD")) {
      bt.a().d();
      bt.a().e();
      bP = !bP;
    } 
    if (paramString1.equals("icon"))
      ds.b = !ds.b; 
    if (paramString1.equals("big"))
      ds.c = !ds.c; 
    bt.a().b(paramString1);
  }
  
  public final void D() {}
  
  public final void a(y paramy) {
    bp.c();
    try {
      this.S = new int[paramy.c().readByte()];
      this.T = new int[this.S.length];
      this.U = new int[this.S.length];
      this.V = new int[this.S.length];
      this.W = new int[this.S.length];
      this.Y = new String[this.S.length];
      this.X = new int[this.S.length];
      this.Z = new String[this.S.length];
      for (byte b1 = 0; b1 < this.S.length; b1++) {
        this.S[b1] = paramy.c().readByte();
        this.T[b1] = paramy.c().readByte();
        this.U[b1] = paramy.c().readByte();
        this.V[b1] = paramy.c().readByte();
        byte b2;
        if ((b2 = paramy.c().readByte()) == 1) {
          this.Y[b1] = paramy.c().readUTF();
          this.W[b1] = paramy.c().readInt();
          this.Z[b1] = paramy.c().readUTF();
          this.X[b1] = paramy.c().readInt();
        } 
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    a.G.r();
    a.G.s();
  }
  
  private void a(String paramString, de paramde1, de paramde2) {
    this.bQ = new dz();
    this.bQ.a(paramString, paramde1, paramde2);
  }
  
  public final void a(int paramInt, String paramString, byte paramByte) {
    af af1;
    if ((af1 = b(paramInt)) != null) {
      if (paramByte == 3)
        a(paramString, new de(aw.br, 2000, af1), new de(aw.bi, 2009, af1)); 
      if (paramByte == 4)
        a(paramString, new de(aw.br, 2005, af1), new de(aw.bi, 2009, af1)); 
    } 
  }
  
  public final void d(int paramInt) {
    af af1;
    if ((af1 = b(paramInt)) != null)
      a(String.valueOf(af1.ag) + aw.eB, new de(aw.bm, 11114, af1), new de(aw.bn, 2009, af1)); 
  }
  
  public static void a(int paramInt, byte paramByte) {
    if (H.size() == 0) {
      bt.a().b((byte)2, paramByte);
      ds.c("getFlag1");
      return;
    } 
    if (paramInt == (af.e()).J) {
      ds.c("my cflag: isme");
      af.e();
      if (af.a(paramByte)) {
        ds.c("my cflag: true");
        for (byte b1 = 0; b1 < H.size(); b1++) {
          ep ep;
          if ((ep = H.elementAt(b1)) != null && ep.a == paramByte) {
            ds.c("my cflag: cflag==");
            (af.e()).bz = ep.b;
          } 
        } 
        return;
      } 
      af.e();
      if (!af.a(paramByte)) {
        ds.c("my cflag: false");
        bt.a().b((byte)2, paramByte);
        return;
      } 
    } else {
      ds.c("my cflag: not me");
      if (b(paramInt) != null) {
        b(paramInt);
        if (af.a(paramByte)) {
          ds.c("my cflag: true");
          for (byte b1 = 0; b1 < H.size(); b1++) {
            ep ep;
            if ((ep = H.elementAt(b1)) != null && ep.a == paramByte) {
              ds.c("my cflag: cflag==");
              (b(paramInt)).bz = ep.b;
            } 
          } 
          return;
        } 
        b(paramInt);
        if (!af.a(paramByte)) {
          ds.c("my cflag: false");
          bt.a().b((byte)2, paramByte);
        } 
      } 
    } 
  }
  
  public final void a(int paramInt, Object paramObject) {
    af af1;
    el el1;
    do do;
    Object[] arrayOfObject1;
    int j;
    bf bf2;
    i i;
    bf bf1;
    int m;
    byte b2;
    Object[] arrayOfObject2;
    byte b1;
    bf bf3;
    ds.c("PERFORM WITH ID = " + paramInt);
    switch (paramInt) {
      case 888351:
        bt.a().g((byte)5);
        a.h();
        return;
      case 11112:
        af1 = (af)paramObject;
        bt.a().a((byte)1, af1.J);
        return;
      case 11113:
        if ((af1 = (af)paramObject) != null) {
          bt.a().a((byte)0, af1.J, (byte)-1, -1);
          return;
        } 
        break;
      case 11114:
        this.bQ = null;
        if ((af1 = (af)paramObject) == null)
          return; 
        bt.a().a((byte)1, af1.J, (byte)-1, -1);
        return;
      case 11111:
        if ((af.e()).aU == null)
          return; 
        bp.a();
        if (a.G.S.size() <= 0) {
          af.e();
          F();
        } 
        a.G.a((af.e()).aU);
        a.G.s();
        bt.a().c((af.e()).aU.J);
        bt.a().y((af.e()).aU.J);
        return;
      case 11115:
        if ((af.e()).aU == null)
          return; 
        bp.a();
        bt.a().a((af.e()).aU.J, (short)(af.e()).aU.M);
        return;
      case 2000:
        this.bQ = null;
        if ((af)paramObject == null) {
          bt.a().a((byte)1, (byte)3, -1);
          return;
        } 
        bt.a().a((byte)1, (byte)3, ((af)paramObject).J);
        bt.a().g();
        return;
      case 2001:
        a.h();
        return;
      case 2003:
        a.h();
        bp.a();
        bt.a().a((byte)0, (byte)3, (af.e()).aU.J);
        return;
      case 2004:
        a.h();
        bt.a().a((byte)0, (byte)4, (af.e()).aU.J);
        return;
      case 2005:
        a.h();
        this.bQ = null;
        if ((af)paramObject == null) {
          bt.a().a((byte)1, (byte)4, -1);
          return;
        } 
        bt.a().a((byte)1, (byte)4, ((af)paramObject).J);
        return;
      case 2009:
        this.bQ = null;
        return;
      case 2006:
        a.h();
        bt.a().a((byte)2, (byte)4, (af.e()).aU.J);
        return;
      case 2007:
        a.h();
      case 11038:
        (el1 = new el("")).addElement(new de(aw.aW[1], 110381));
        el1.addElement(new de(aw.aW[2], 110382));
        el1.addElement(new de(aw.aW[3], 110383));
        a.F.a(el1);
        return;
      case 110382:
        bt.a().j();
        return;
      case 110383:
        bt.a().k();
        return;
      case 1:
        a.h();
        return;
      case 2:
        a.F.a = false;
        return;
      case 8002:
        a(false, true);
        a.g();
        a.f();
        return;
      case 11057:
        dc.z.removeAllElements();
        dc.x.removeAllElements();
        if ((do = (do)paramObject).dk == 0) {
          bt.a().a((short)do.df.a, (byte)a.F.b);
          return;
        } 
        if (a.F.b == 0) {
          bt.a().l(do.dk);
          return;
        } 
        break;
      case 11000:
        a.G.q();
        a.G.s();
        return;
      case 11001:
        af.e().J();
        return;
      case 11002:
        a.G.A();
        return;
      case 11120:
        paramObject = (arrayOfObject1 = (Object[])paramObject)[0];
        j = Integer.parseInt((String)arrayOfObject1[1]);
        for (b2 = 0; b2 < aQ.length; b2++) {
          if (aQ[b2] == paramObject)
            aQ[b2] = null; 
        } 
        aQ[j] = (bf)paramObject;
        y();
        return;
      case 11121:
        bf2 = (bf)(arrayOfObject2 = (Object[])paramObject)[0];
        m = Integer.parseInt((String)arrayOfObject2[1]);
        for (b1 = 0; b1 < aP.length; b1++) {
          if (aP[b1] == bf2)
            aP[b1] = null; 
        } 
        aP[m] = bf2;
        z();
        return;
      case 110001:
        a.G.q();
        a.G.s();
        return;
      case 110004:
        a.F.a = false;
        return;
      case 11067:
        if (bv.n != 0) {
          bt.a().f(0);
          bp.a();
          return;
        } 
        aD.a(aw.aU, 0);
        return;
      case 11059:
        bf3 = aQ[this.ex];
        b(bf3, false);
        this.cn = null;
        return;
      case 12000:
        bt.a().a((byte)1, -1, (String)null);
        return;
      case 12001:
        a.h();
        return;
      case 12002:
        a.h();
        i = (i)m;
        bt.a().a((byte)1, -1, i.a, i.b);
        this.bQ = null;
        return;
      case 12003:
        i = (i)m;
        a.h();
        bt.a().a((byte)2, -1, i.a, i.b);
        this.bQ = null;
        return;
      case 12004:
        bf1 = (bf)m;
        b(bf1, true);
        af.e();
        return;
      case 110391:
        bt.a().a((byte)0, (af.e()).aU.J, -1, -1);
        return;
      case 12005:
        if (a.al == null)
          a.al = new eu(); 
        a.al.b();
        a.h();
        return;
      case 12006:
        GameMidlet.f.a();
        break;
    } 
  }
  
  public final void b(String paramString1, String paramString2) {
    paramString1 = paramString1;
    this.fu = new int[paramString1.length()];
    this.fv = new int[paramString1.length()];
    this.fw = new int[paramString1.length()];
    this.fx = new int[paramString1.length()];
    this.fy = new int[paramString1.length()];
    for (byte b1 = 0; b1 < paramString1.length(); b1++) {
      this.fu[b1] = Short.parseShort(paramString1.substring(b1, b1 + 1));
      this.fv[b1] = ds.b(0, 11);
      this.fw[b1] = 1;
      this.fy[b1] = 0;
    } 
    this.fB = 100;
    this.fz = 0;
    this.fA = paramString2;
    eE = eF = l.d();
  }
  
  public final void a(String paramString) {
    if (!this.fE) {
      this.fD = di.e.a(paramString);
      this.fC = a.A;
      this.fE = true;
    } 
    if (paramString.startsWith("!")) {
      paramString = paramString.substring(1, paramString.length());
      this.bR = true;
    } 
    ft.addElement(paramString);
  }
  
  public final void b(String paramString) {
    this.fF = paramString;
    this.fG = di.k.a(this.fF, 500);
  }
  
  private static boolean O() {
    return (bv.c() && bY.a == 0);
  }
  
  private static void a(en paramen, int paramInt1, int paramInt2, int paramInt3) {
    if (bY == null)
      return; 
    if (!a && bn == 1 && !a.G.a && O()) {
      if (paramInt3 < fJ.a + (fI.a << 2))
        paramInt3 = fJ.a + (fI.a << 2); 
      if (paramInt1 > a.A - paramInt3 / 2)
        paramInt1 = a.A - paramInt3 / 2; 
      if (paramInt1 < en.a(fM) + paramInt3 / 2 + 10)
        paramInt1 = en.a(fM) + paramInt3 / 2 + 10; 
      paramInt2 = fI.b;
      int i = paramInt2 + 0 + en.b(fL) / 2 + 2;
      int j = fJ.a;
      int m = paramInt3 / 2 - j / 2;
      paramInt3 = paramInt1 - paramInt3 / 2;
      int n = paramInt1 + j / 2;
      int i1;
      int i2 = (i1 = m - fI.a) / fI.a;
      if (i1 % fI.a > 0)
        i2++; 
      byte b1;
      for (b1 = 0; b1 < i2; b1++) {
        if (b1 < i2 - 1) {
          fI.a(1, paramInt3 + fI.a + b1 * fI.a, 3, 0, 0, paramen);
        } else {
          fI.a(1, paramInt3 + i1, 3, 0, 0, paramen);
        } 
        if (b1 < i2 - 1) {
          fI.a(1, n + b1 * fI.a, 3, 0, 0, paramen);
        } else {
          fI.a(1, n + i1 - fI.a, 3, 0, 0, paramen);
        } 
      } 
      fI.a(0, paramInt3, 3, 2, 0, paramen);
      fI.a(0, n + i1, 3, 0, 0, paramen);
      if (bY.c > 0) {
        b1 = 2;
        byte b2 = 3;
        if (bY.e == 4) {
          b1 = 4;
          b2 = 5;
        } 
        int i3;
        if ((i3 = bY.c * m / bY.b) < 0)
          i3 = 0; 
        if (i3 > m)
          i3 = m; 
        paramen.e(paramInt3 + m - i3, 3, i3, paramInt2);
        for (i3 = 0; i3 < i2; i3++) {
          if (i3 < i2 - 1) {
            fI.a(b2, paramInt3 + fI.a + i3 * fI.a, 3, 0, 0, paramen);
          } else {
            fI.a(b2, paramInt3 + i1, 3, 0, 0, paramen);
          } 
        } 
        fI.a(b1, paramInt3, 3, 2, 0, paramen);
        a.a(paramen);
      } 
      if (bY.d > 0) {
        b1 = 2;
        byte b2 = 3;
        if (bY.f == 4) {
          b1 = 4;
          b2 = 5;
        } 
        int i3;
        if ((i3 = bY.d * m / bY.b) < 0)
          i3 = 0; 
        if (i3 > m)
          i3 = m; 
        paramen.e(n, 3, i3, paramInt2);
        for (i3 = 0; i3 < i2; i3++) {
          if (i3 < i2 - 1) {
            fI.a(b2, n + i3 * fI.a, 3, 0, 0, paramen);
          } else {
            fI.a(b2, n + i1 - fI.a, 3, 0, 0, paramen);
          } 
        } 
        fI.a(b1, n + i1, 3, 0, 0, paramen);
        a.a(paramen);
      } 
      fJ.a(0, paramInt1 - j / 2, 0, 0, 0, paramen);
      String str = l.a(bY.n, bY.m, true, false);
      di.d.a(paramen, str, paramInt1 + 1, 0 + fJ.b / 2 - di.g.a() / 2, 2);
      g.b(bY.e, 1).b(paramen, bY.j, paramInt1 - 5, i + 5, 1, di.f);
      g.b(bY.f, 1).b(paramen, bY.k, paramInt1 + 5, i + 5, 0, di.f);
      if (bY.a != 0) {
        int i3 = 0 + paramInt2 / 2 - 2;
        di.w.a(paramen, bY.c, paramInt3 + m / 2, i3, 2);
        di.w.a(paramen, bY.d, n + m / 2, i3, 2);
      } 
      paramen.a(fK, paramInt1, 0 + fJ.b + 2, 3);
      if (bY.a == 0)
        a(paramen, bY.g, bY.h, paramInt1 - 13, bY.i, paramInt1 + 13, i); 
    } 
  }
  
  private static void a(en paramen, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (fL != null) {
      int i = en.b(fL) / 2;
      byte b1;
      for (b1 = 0; b1 < paramInt1; b1++) {
        byte b2 = 0;
        if (b1 < paramInt2)
          b2 = 1; 
        paramen.a(fL, 0, b2 * i, en.a(fL), i, 0, paramInt3 - b1 * (i + 1), paramInt6, 3);
      } 
      for (b1 = 0; b1 < paramInt1; b1++) {
        byte b2 = 0;
        if (b1 < paramInt4)
          b2 = 1; 
        paramen.a(fL, 0, b2 * i, en.a(fL), i, 0, paramInt5 + b1 * (i + 1), paramInt6, 3);
      } 
    } 
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, short paramShort, bk[] paramArrayOfbk) {
    ch ch;
    a(ch = new ch(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramShort, paramArrayOfbk));
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, af paramaf, bk parambk, int paramInt4, short paramShort1, short paramShort2) {
    ch ch;
    a(ch = new ch(paramInt1, paramInt2, paramInt3, paramaf.Z(), parambk, paramInt4, paramShort1, paramShort2));
  }
  
  private static void a(ch paramch) {
    if (paramch.a == 0) {
      dh.a(paramch);
      return;
    } 
    if (paramch.a == 1) {
      dh.b(paramch);
      return;
    } 
    if (paramch.a == 2) {
      dh.c(paramch);
      return;
    } 
    dh.d(paramch);
  }
  
  private static void j(en paramen) {
    paramen.a(8421504);
    paramen.d(0, a.B - 2, a.A, 2);
    int i = (int)((af.e()).Z * a.A / 10000L);
    paramen.a(16777215);
    paramen.d(0, a.B - 2, i, 2);
    paramen.a(0);
    i = a.A / 10;
    for (byte b1 = 1; b1 < 10; b1++)
      paramen.d(b1 * i, a.B - 2, 1, 2); 
  }
  
  private void a(en paramen, int paramInt1, int paramInt2) {
    if (paramInt1 > a.A - 85)
      paramInt1 = a.A - 85; 
    if (paramInt1 < en.a(fM) + 85 + 10)
      paramInt1 = en.a(fM) + 85 + 10; 
    en.b(fL);
    paramInt2 = fJ.a;
    int i = 85 - paramInt2 / 2;
    int j = paramInt1 - 85 + 3;
    int m = paramInt1 + paramInt2 / 2;
    int n = (i -= fI.a) / fI.a;
    if (i % fI.a > 0)
      n++; 
    int i1;
    for (i1 = 0; i1 < n; i1++) {
      if (i1 < n - 1) {
        paramen.b(dT, 0, 15, en.a(dT), 15, 2, j + fI.a + i1 * fI.a, 3, 20);
      } else {
        paramen.b(dT, 0, 15, en.a(dT), 15, 2, j + i, 3, 20);
      } 
      if (i1 < n - 1) {
        paramen.b(dT, 0, 15, en.a(dT), 15, 2, m + i1 * fI.a, 3, 20);
      } else {
        paramen.b(dT, 0, 15, en.a(dT), 15, 2, m + i - fI.a, 3, 20);
      } 
    } 
    fI.a(0, j, 3, 2, 0, paramen);
    fI.a(0, m + i, 3, 0, 0, paramen);
    if ((i1 = ca * 100 / cd / 2 * 66 / 100) > 0) {
      if (i1 < 6)
        i1 = 6; 
      paramen.e(j, 3, i1, 15);
    } 
    if (ca > 0)
      for (n = 0; n < 11; n++) {
        if (n == 0) {
          paramen.b(dT, 0, 60, en.a(dT), 15, 2, j, 3, 20);
        } else {
          paramen.b(dT, 0, 75, en.a(dT), 15, 2, j + n * 6, 3, 20);
        } 
      }  
    a.a(paramen);
    n = bZ * 100 / cd / 2 * 66 / 100;
    if (66 - 66 - n > 0) {
      if (n < 6)
        n = 6; 
      paramen.e(m + 66 - n, 3, 66 - 66 - n, 15);
    } 
    if (bZ > 0)
      for (n = 0; n < 11; n++) {
        if (n == 0) {
          paramen.b(dT, 0, 30, en.a(dT), 15, 0, m + i, 3, 20);
        } else {
          paramen.b(dT, 0, 45, en.a(dT), 15, 0, m + i - n * 6, 3, 20);
        } 
      }  
    a.a(paramen);
    fJ.a(0, paramInt1 - paramInt2 / 2 + 1, 0, 0, 0, paramen);
    String str = (new StringBuffer(String.valueOf(ai.b((int)((cb - l.d()) / 1000L))))).toString();
    di.d.a(paramen, str, j + 85 - 2, 5, 2);
    di.o.a(paramen, "Tầng " + cf, j + 85 - 3, 0 + fJ.b, 2);
    i = di.a.a((new StringBuffer(String.valueOf(ca))).toString());
    di.b.a(paramen, (new StringBuffer(String.valueOf(ca))).toString(), paramInt1 - paramInt2 / 2 - i, 3 + fJ.b, 0);
    bl.b(paramen, 2325, paramInt1 - paramInt2 / 2 - i - 15, 3 + fJ.b, 2, 20);
    i = di.a.a((new StringBuffer(String.valueOf(bZ))).toString());
    di.a.a(paramen, (new StringBuffer(String.valueOf(bZ))).toString(), paramInt1 + paramInt2 / 2, 3 + fJ.b, 0);
    bl.b(paramen, 2323, paramInt1 + paramInt2 / 2 + i + 3, 3 + fJ.b, 0, 20);
    di.f.a("#01 AAAAAAAAAA");
    b(paramen, 40);
    a.a(paramen);
  }
  
  private static void b(en paramen, int paramInt) {
    String str = "#01 nnnnnnnnnnnn";
    int i = di.k.a(str);
    i = a.A - i - 20;
    for (byte b1 = 0; b1 < fO; b1++) {
      di di = di.s;
      if (b1 == 0) {
        di = di.p;
      } else if (b1 == 1) {
        di = di.n;
      } else if (b1 == 2) {
        di = di.q;
      } 
      if (b1 == fO - 1)
        di = di.r; 
      String[] arrayOfString = ds.a(cg.elementAt(b1), "|", 0);
      int[] arrayOfInt = { 0, 18 };
      for (byte b2 = 0; b2 < 2; b2++)
        di.a(paramen, arrayOfString[b2], i + arrayOfInt[b2], 40 + b1 * di.k.a(), 0, di.k); 
    } 
    a.a(paramen);
    a.a(paramen);
  }
  
  static {
    l.b("/mainImage/i_pve_bar_1.png");
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\p.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */