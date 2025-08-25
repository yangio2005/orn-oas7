import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDlet;
import main.GameMidlet;
import main.a;

public final class cd implements b {
  public int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public boolean e;
  
  private boolean l = false;
  
  private static int m = 2;
  
  private static final int[] n = new int[] { 18, 14, 11, 9, 6, 4, 2 };
  
  private static int o = 0;
  
  private static String[] p = new String[] { 
      " 0", ".,@?!_1\"/$-():*+<=>;%&~#%^&*{}[];'/1", "abc2áàảãạâấầẩẫậăắằẳẵặ2", "def3đéèẻẽẹêếềểễệ3", "ghi4íìỉĩị4", "jkl5", "mno6óòỏõọôốồổỗộơớờởỡợ6", "pqrs7", "tuv8úùủũụưứừửữự8", "wxyz9ýỳỷỹỵ9", 
      "*", "#" };
  
  private static String[] q = new String[] { 
      "0", "1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", 
      "0", "0" };
  
  public String f = "";
  
  private String r = "";
  
  private String s = "";
  
  private String t = "";
  
  private int u = 0;
  
  private int v = 0;
  
  private int w = 500;
  
  private int x = 0;
  
  private int y = -1984;
  
  private int z = 0;
  
  private int A = 0;
  
  private int B = 10;
  
  private int C = 0;
  
  public static boolean g;
  
  private static int D;
  
  private int E = 0;
  
  private static int F = 11;
  
  public boolean h;
  
  public String i = "";
  
  public de j;
  
  private static Image G = l.b("/mainImage/myTexture2der.png");
  
  private boolean H = true;
  
  public boolean k = true;
  
  private static Image I = l.b("/mainImage/myTexture2dtf.png");
  
  static {
    (new int[2])[0] = 32;
    (new int[2])[1] = 48;
    (new int[17][])[0] = new int[2];
    (new int[2])[0] = 49;
    (new int[2])[1] = 69;
    (new int[17][])[1] = new int[2];
    (new int[2])[0] = 50;
    (new int[2])[1] = 84;
    (new int[17][])[2] = new int[2];
    (new int[2])[0] = 51;
    (new int[2])[1] = 85;
    (new int[17][])[3] = new int[2];
    (new int[2])[0] = 52;
    (new int[2])[1] = 68;
    (new int[17][])[4] = new int[2];
    (new int[2])[0] = 53;
    (new int[2])[1] = 71;
    (new int[17][])[5] = new int[2];
    (new int[2])[0] = 54;
    (new int[2])[1] = 74;
    (new int[17][])[6] = new int[2];
    (new int[2])[0] = 55;
    (new int[2])[1] = 67;
    (new int[17][])[7] = new int[2];
    (new int[2])[0] = 56;
    (new int[2])[1] = 66;
    (new int[17][])[8] = new int[2];
    (new int[2])[0] = 57;
    (new int[2])[1] = 77;
    (new int[17][])[9] = new int[2];
    (new int[2])[0] = 42;
    (new int[2])[1] = 128;
    (new int[17][])[10] = new int[2];
    (new int[2])[0] = 35;
    (new int[2])[1] = 137;
    (new int[17][])[11] = new int[2];
    (new int[2])[0] = 33;
    (new int[2])[1] = 113;
    (new int[17][])[12] = new int[2];
    (new int[2])[0] = 63;
    (new int[2])[1] = 97;
    (new int[17][])[13] = new int[2];
    (new int[3])[0] = 64;
    (new int[3])[1] = 121;
    (new int[3])[2] = 122;
    (new int[17][])[14] = new int[3];
    (new int[2])[0] = 46;
    (new int[2])[1] = 111;
    (new int[17][])[15] = new int[2];
    (new int[2])[0] = 44;
    (new int[2])[1] = 108;
    (new int[17][])[16] = new int[2];
  }
  
  public final void a() {
    TextBox textBox;
    (textBox = new TextBox(this.i, "", this.w, 0)).addCommand(new Command(aw.br, 4, 0));
    textBox.addCommand(new Command(aw.bu, 3, 0));
    textBox.setCommandListener(new m(this, textBox));
    try {
      if (this.C == 2) {
        textBox.setConstraints(65536);
      } else if (this.C == 1) {
        textBox.setConstraints(2);
      } else {
        textBox.setConstraints(0);
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    cd cd1;
    textBox.setString((cd1 = this).r);
    textBox.setMaxSize(this.w);
    Display.getDisplay((MIDlet)GameMidlet.f).setCurrent((Displayable)textBox);
  }
  
  public cd() {
    this.r = "";
    cd cd1 = this;
    o = di.t.a() + 1;
    cd1.j = new de(aw.bj, cd1, 1000, null);
    D = 0;
    if (av.d("qwerty") == 1)
      g = true; 
  }
  
  public final void b() {
    if (this.u > 0 && this.r.length() > 0) {
      this.r = String.valueOf(this.r.substring(0, this.u - 1)) + this.r.substring(this.u, this.r.length());
      this.u--;
      e();
      f();
    } 
  }
  
  private void e() {
    if (this.C == 2) {
      this.t = this.s;
    } else {
      this.t = this.r;
    } 
    if (this.x < 0 && di.t.a(this.t) + this.x < this.c - 6 - 13)
      this.x = this.c - 10 - di.t.a(this.t); 
    if (this.x + di.t.a(this.t.substring(0, this.u)) <= 0) {
      this.x = -di.t.a(this.t.substring(0, this.u));
      this.x += 40;
    } else if (this.x + di.t.a(this.t.substring(0, this.u)) >= this.c - 22) {
      this.x = this.c - 10 - di.t.a(this.t.substring(0, this.u)) - 12;
    } 
    if (this.x > 0)
      this.x = 0; 
  }
  
  private void d(int paramInt) {
    if (paramInt == 432)
      paramInt = 119; 
    if ((this.C == 2 || this.C == 3) && (paramInt < 48 || paramInt > 57) && (paramInt < 65 || paramInt > 90) && (paramInt < 97 || paramInt > 122))
      return; 
    if (this.r.length() < this.w) {
      String str = String.valueOf(this.r.substring(0, this.u)) + (char)paramInt;
      if (this.u < this.r.length())
        str = String.valueOf(str) + this.r.substring(this.u, this.r.length()); 
      this.r = str;
      this.u++;
      f();
      e();
    } 
  }
  
  public final boolean a(int paramInt) {
    cd cd1;
    if (paramInt == 8 || paramInt == -8 || paramInt == 204) {
      b();
      return true;
    } 
    if (paramInt >= 65 && paramInt <= 122 && !g) {
      g = true;
      D = 0;
      av.a("qwerty", 1);
    } 
    if (g) {
      if (paramInt == 45) {
        if (paramInt == this.y && this.z < n[m]) {
          this.r = String.valueOf(this.r.substring(0, this.u - 1)) + '_';
          this.t = this.r;
          f();
          e();
          this.y = -1984;
          return false;
        } 
        this.y = 45;
      } 
      if (paramInt >= 32) {
        d(paramInt);
        return false;
      } 
    } 
    if (paramInt == F) {
      this.E++;
      if (this.E > 3)
        this.E = 0; 
      this.z = 1;
      this.y = paramInt;
      return false;
    } 
    if (paramInt == 42)
      paramInt = 58; 
    if (paramInt == 35)
      paramInt = 59; 
    if (paramInt >= 48 && paramInt <= 59) {
      if (this.C == 0 || this.C == 2 || this.C == 3) {
        String[] arrayOfString;
        String str;
        int i = paramInt;
        if ((cd1 = this).C == 2 || cd1.C == 3) {
          arrayOfString = q;
        } else {
          arrayOfString = p;
        } 
        if (i == cd1.y) {
          cd1.A = (cd1.A + 1) % arrayOfString[i - 48].length();
          char c = arrayOfString[i - 48].charAt(cd1.A);
          if (cd1.E == 0) {
            c = Character.toLowerCase(c);
          } else if (cd1.E == 1) {
            c = Character.toUpperCase(c);
          } else if (cd1.E == 2) {
            c = Character.toUpperCase(c);
          } else {
            c = arrayOfString[i - 48].charAt(arrayOfString[i - 48].length() - 1);
          } 
          str = String.valueOf(cd1.r.substring(0, cd1.u - 1)) + c;
          if (cd1.u < cd1.r.length())
            str = String.valueOf(str) + cd1.r.substring(cd1.u, cd1.r.length()); 
          cd1.r = str;
          cd1.z = n[m];
          cd1.f();
        } else if (cd1.r.length() < cd1.w) {
          if (cd1.E == 1 && cd1.y != -1984)
            cd1.E = 0; 
          cd1.A = 0;
          char c = str[i - 48].charAt(cd1.A);
          if (cd1.E == 0) {
            c = Character.toLowerCase(c);
          } else if (cd1.E == 1) {
            c = Character.toUpperCase(c);
          } else if (cd1.E == 2) {
            c = Character.toUpperCase(c);
          } else {
            c = str[i - 48].charAt(str[i - 48].length() - 1);
          } 
          str = String.valueOf(cd1.r.substring(0, cd1.u)) + c;
          if (cd1.u < cd1.r.length())
            str = String.valueOf(str) + cd1.r.substring(cd1.u, cd1.r.length()); 
          cd1.r = str;
          cd1.z = n[m];
          cd1.u++;
          cd1.f();
          cd1.e();
        } 
        cd1.y = i;
      } else if (this.C == 1) {
        d(cd1);
        this.z = 1;
      } 
    } else {
      this.A = 0;
      this.y = -1984;
      if (cd1 == 14) {
        if (this.u > 0) {
          this.u--;
          e();
          this.B = 10;
          return false;
        } 
      } else if (cd1 == 15) {
        if (this.u < this.r.length()) {
          this.u++;
          e();
          this.B = 10;
          return false;
        } 
      } else {
        if (cd1 == 19) {
          b();
          return false;
        } 
        this.y = cd1;
      } 
    } 
    return true;
  }
  
  public final void a(en paramen) {
    if (this.H)
      paramen.e(0, 0, a.A, a.B); 
    cd cd2;
    boolean bool1 = (cd2 = this).e;
    if (this.C == 2) {
      this.t = this.s;
    } else {
      this.t = this.r;
    } 
    String str2 = this.i;
    String str1 = this.t;
    int i1 = this.b + (this.d - di.t.a()) / 2;
    int n = 6 + this.x + this.a;
    int m = this.d;
    int k = this.c;
    int j = this.b - 1;
    int i = this.a;
    boolean bool2 = bool1;
    en en1;
    (en1 = paramen).a(0);
    if (bool2) {
      en1.a(I, 0, 81, 29, 27, 0, i, j, 0);
      en1.a(I, 0, 135, 29, 27, 0, i + k - 29, j, 0);
      en1.a(I, 0, 108, 29, 27, 0, i + k - 58, j, 0);
      for (byte b1 = 0; b1 < (k - 58) / 29; b1++)
        en1.a(I, 0, 108, 29, 27, 0, i + 29 + b1 * 29, j, 0); 
    } else {
      en1.a(I, 0, 0, 29, 27, 0, i, j, 0);
      en1.a(I, 0, 54, 29, 27, 0, i + k - 29, j, 0);
      en1.a(I, 0, 27, 29, 27, 0, i + k - 58, j, 0);
      for (byte b1 = 0; b1 < (k - 58) / 29; b1++)
        en1.a(I, 0, 27, 29, 27, 0, i + 29 + b1 * 29, j, 0); 
    } 
    en1.e(i + 3, j + 1, k - 4, m);
    if (str1 != null && !str1.equals("")) {
      di.t.a(en1, str1, n, i1, 0);
    } else if (str2 != null) {
      if (bool2) {
        di.i.a(en1, str2, n, i1 + 2, 0);
      } else {
        di.j.a(en1, str2, n, i1 + 2, 0);
      } 
    } 
    paramen.a(0);
    cd cd1;
    if ((cd1 = this).e && this.k) {
      if (this.z == 0 && (this.B > 0 || this.v / 5 % 2 == 0)) {
        paramen.a(7999781);
        paramen.d(7 + this.x + this.a + di.t.a(this.t.substring(0, this.u)) - 1, this.b + (this.d - o) / 2 + 1, 1, o);
      } 
      a.a(paramen);
      if (this.r != null && this.r.length() > 0 && a.e && bool1)
        paramen.a(G, this.a + this.c - 13, this.b + this.d / 2 + 1, 3); 
    } 
  }
  
  private void f() {
    if (this.C == 2) {
      this.s = "";
      for (byte b1 = 0; b1 < this.r.length(); b1++)
        this.s = String.valueOf(this.s) + "*"; 
      if (this.z > 0 && this.u > 0)
        this.s = String.valueOf(this.s.substring(0, this.u - 1)) + this.r.charAt(this.u - 1) + this.s.substring(this.u, this.s.length()); 
    } 
  }
  
  public final void c() {
    this.k = true;
    this.v++;
    if (this.z > 0) {
      this.z--;
      if (this.z == 0) {
        this.A = 0;
        if (this.E == 1 && this.y != F)
          this.E = 0; 
        this.y = -1984;
        f();
      } 
    } 
    if (this.B > 0)
      this.B--; 
    if (a.m) {
      cd cd1;
      if (a.a((cd1 = this).a + cd1.c - 20, cd1.b, 40, cd1.d)) {
        cd cd2;
        (cd2 = cd1).r = "";
        cd2.u = 0;
        cd2.e();
        cd2.f();
        cd1.e = true;
        return;
      } 
      if (a.a(cd1.a, cd1.b, cd1.c, cd1.d)) {
        cd1.a();
        return;
      } 
      cd1.e = false;
    } 
  }
  
  public final String d() {
    return this.r;
  }
  
  public final void a(String paramString) {
    if (paramString == null)
      return; 
    this.y = -1984;
    this.z = 0;
    this.A = 0;
    this.r = paramString;
    this.t = paramString;
    f();
    this.u = paramString.length();
    e();
  }
  
  public final void b(int paramInt) {
    this.w = paramInt;
  }
  
  public final void c(int paramInt) {
    this.C = paramInt;
    char c = 'Ǵ';
    cd cd1;
    (cd1 = this).w = c;
  }
  
  public final void a(int paramInt, Object paramObject) {
    switch (paramInt) {
      case 1000:
        b();
        break;
    } 
  }
  
  static {
    (new String[4])[0] = "abc";
    (new String[4])[1] = "Abc";
    (new String[4])[2] = "ABC";
    (new String[4])[3] = "123";
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\cd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */