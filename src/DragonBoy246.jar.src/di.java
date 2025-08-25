import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;
import main.a;

public final class di {
  private int K;
  
  private int L;
  
  private Image M;
  
  private String N;
  
  private int[][] O;
  
  private static String P = " 0123456789+-*='_?.,<>/[]{}!@#$%^&*():aáàảãạâấầẩẫậăắằẳẵặbcdđeéèẻẽẹêếềểễệfghiíìỉĩịjklmnoóòỏõọôốồổỗộơớờởỡợpqrstuúùủũụưứừửữựvxyýỳỷỹỵzwAÁÀẢÃẠĂẰẮẲẴẶÂẤẦẨẪẬBCDĐEÉÈẺẼẸÊẾỀỂỄỆFGHIÍÌỈĨỊJKLMNOÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢPQRSTUÚÙỦŨỤƯỨỪỬỮỰVXYÝỲỶỸỴZW";
  
  public static di a = new di(P, "/myfont/tahoma_7b_red.png", "/myfont/tahoma_7b", 0);
  
  public static di b = new di(P, "/myfont/tahoma_7b_blue.png", "/myfont/tahoma_7b", 0);
  
  public static di c = new di(P, "/myfont/tahoma_7b_white.png", "/myfont/tahoma_7b", 0);
  
  public static di d = new di(P, "/myfont/tahoma_7b_yellow.png", "/myfont/tahoma_7b", 0);
  
  public static di e = new di(P, "/myfont/tahoma_7b_yellow.png", "/myfont/tahoma_7b", 0);
  
  public static di f = new di(P, "/myfont/tahoma_7b_brown.png", "/myfont/tahoma_7b", 0);
  
  public static di g = new di(P, "/myfont/tahoma_7b_green2.png", "/myfont/tahoma_7b", 0);
  
  public static di h = new di(P, "/myfont/tahoma_7b_green.png", "/myfont/tahoma_7b", 0);
  
  public static di i = new di(P, "/myfont/tahoma_7b_focus.png", "/myfont/tahoma_7b", 0);
  
  public static di j = new di(P, "/myfont/tahoma_7b_unfocus.png", "/myfont/tahoma_7b", 0);
  
  public static di k = new di(P, "/myfont/tahoma_7.png", "/myfont/tahoma_7", 0);
  
  public static di l = new di(P, "/myfont/tahoma_7_blue1.png", "/myfont/tahoma_7", 0);
  
  public static di m = new di(P, "/myfont/tahoma_7_green2.png", "/myfont/tahoma_7", 0);
  
  public static di n = new di(P, "/myfont/tahoma_7_yellow.png", "/myfont/tahoma_7", 0);
  
  public static di o = new di(P, "/myfont/tahoma_7_grey.png", "/myfont/tahoma_7", 0);
  
  public static di p = new di(P, "/myfont/tahoma_7_red.png", "/myfont/tahoma_7", 0);
  
  public static di q = new di(P, "/myfont/tahoma_7_blue.png", "/myfont/tahoma_7", 0);
  
  public static di r = new di(P, "/myfont/tahoma_7_green.png", "/myfont/tahoma_7", 0);
  
  public static di s = new di(P, "/myfont/tahoma_7_white.png", "/myfont/tahoma_7", 0);
  
  public static di t = new di(P, "/myfont/tahoma_8b.png", "/myfont/tahoma_8b", -1);
  
  private static di Q = new di(" 0123456789+-", "/myfont/number_yellow.png", "/myfont/number", 0);
  
  private static di R = new di(" 0123456789+-", "/myfont/number_red.png", "/myfont/number", 0);
  
  private static di S = new di(" 0123456789+-", "/myfont/number_green.png", "/myfont/number", 0);
  
  public static di u = new di(" 0123456789+-", "/myfont/number_gray.png", "/myfont/number", 0);
  
  private static di T = new di(" 0123456789+-", "/myfont/number_orange.png", "/myfont/number", 0);
  
  public static di v = R;
  
  public static di w = c;
  
  public static di x = Q;
  
  public static di y = S;
  
  public static di z = T;
  
  public static di A = l;
  
  public static di B = p;
  
  public static di C = n;
  
  public static di D = r;
  
  public static di E = o;
  
  public static di F = n;
  
  public static di G = g;
  
  public static di H = s;
  
  public static di I = h;
  
  public static di J = l;
  
  private String U;
  
  private di(String paramString1, String paramString2, String paramString3, int paramInt) {
    try {
      DataInputStream dataInputStream;
      this.N = paramString1;
      this.K = paramInt;
      this.U = paramString2;
      paramString1 = null;
      di di1;
      (di1 = this).M = l.b(di1.U);
      try {
        dataInputStream = new DataInputStream(ad.a(paramString3));
        this.O = new int[dataInputStream.readShort()][];
        for (byte b = 0; b < this.O.length; b++) {
          this.O[b] = new int[4];
          this.O[b][0] = dataInputStream.readShort();
          this.O[b][1] = dataInputStream.readShort();
          this.O[b][2] = dataInputStream.readShort();
          this.O[b][3] = dataInputStream.readShort();
          int i = this.O[b][3];
          (di1 = this).L = i;
        } 
        return;
      } catch (Exception exception) {
        try {
          dataInputStream.close();
          return;
        } catch (IOException iOException) {
          (dataInputStream = null).printStackTrace();
          return;
        } 
      } 
    } catch (Exception exception) {
      (paramString1 = null).printStackTrace();
      System.out.println("paht data:" + paramString2);
      return;
    } 
  }
  
  public final int a() {
    return this.L;
  }
  
  public final int a(String paramString) {
    int i = 0;
    for (byte b = 0; b < paramString.length(); b++) {
      int j;
      if ((j = this.N.indexOf(paramString.charAt(b))) == -1)
        j = 0; 
      i += this.O[j][2] + this.K;
    } 
    return i;
  }
  
  public final void a(en paramen, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramString.length();
    if (paramInt3 == 0) {
      paramInt3 = paramInt1;
    } else if (paramInt3 == 1) {
      paramInt3 = paramInt1 - a(paramString);
    } else {
      paramInt3 = paramInt1 - (a(paramString) >> 1);
    } 
    for (byte b = 0; b < i; b++) {
      if ((paramInt1 = this.N.indexOf(paramString.charAt(b))) == -1)
        paramInt1 = 0; 
      if (paramInt1 >= 0)
        paramen.a(this.M, this.O[paramInt1][0], this.O[paramInt1][1], this.O[paramInt1][2], this.O[paramInt1][3], 0, paramInt3, paramInt2, 20); 
      paramInt3 += this.O[paramInt1][2] + this.K;
    } 
  }
  
  public final void a(en paramen, String paramString, int paramInt1, int paramInt2, int paramInt3, di paramdi) {
    int i = paramString.length();
    if (paramInt3 == 0) {
      paramInt3 = paramInt1;
    } else if (paramInt3 == 1) {
      paramInt3 = paramInt1 - a(paramString);
    } else {
      paramInt3 = paramInt1 - (a(paramString) >> 1);
    } 
    for (byte b = 0; b < i; b++) {
      if ((paramInt1 = this.N.indexOf(paramString.charAt(b))) == -1)
        paramInt1 = 0; 
      if (paramInt1 >= 0) {
        if (!a.a) {
          paramen.a(paramdi.M, this.O[paramInt1][0], this.O[paramInt1][1], this.O[paramInt1][2], this.O[paramInt1][3], 0, paramInt3 + 1, paramInt2, 20);
          paramen.a(paramdi.M, this.O[paramInt1][0], this.O[paramInt1][1], this.O[paramInt1][2], this.O[paramInt1][3], 0, paramInt3, paramInt2 + 1, 20);
        } 
        paramen.a(this.M, this.O[paramInt1][0], this.O[paramInt1][1], this.O[paramInt1][2], this.O[paramInt1][3], 0, paramInt3, paramInt2, 20);
      } 
      paramInt3 += this.O[paramInt1][2] + this.K;
    } 
  }
  
  public final String[] a(String paramString, int paramInt) {
    int i = paramInt;
    String str1 = paramString;
    di di1 = this;
    el el2 = new el("vLine");
    String str2 = "";
    for (int j = 0; j < str1.length(); j++) {
      if (str1.charAt(j) == '\n' || str1.charAt(j) == '\b') {
        el2.addElement(str2);
        str2 = "";
      } else {
        str2 = String.valueOf(str2) + str1.charAt(j);
        if (di1.a(str2) > i) {
          int k;
          for (k = str2.length() - 1; k >= 0 && str2.charAt(k) != ' '; k--);
          if (k < 0)
            k = str2.length() - 1; 
          el2.addElement(str2.substring(0, k));
          j = j - str2.length() - k + 1;
          str2 = "";
        } 
        if (j == str1.length() - 1 && !str2.trim().equals(""))
          el2.addElement(str2); 
      } 
    } 
    el el1;
    String[] arrayOfString = new String[(el1 = el2).size()];
    for (i = 0; i < el1.size(); i++)
      arrayOfString[i] = el1.elementAt(i).toString(); 
    return arrayOfString;
  }
  
  public final void b(en paramen, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    a(paramen, paramString, paramInt1, paramInt2, 2);
  }
  
  public final void b(en paramen, String paramString, int paramInt1, int paramInt2, int paramInt3, di paramdi) {
    a(paramen, paramString, paramInt1, paramInt2, paramInt3, paramdi);
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\di.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */