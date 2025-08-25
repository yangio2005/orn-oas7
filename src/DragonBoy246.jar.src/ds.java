import java.util.Random;

public final class ds {
  private static short[] d = new short[] { 
      0, 18, 36, 54, 71, 89, 107, 125, 143, 160, 
      178, 195, 213, 230, 248, 265, 282, 299, 316, 333, 
      350, 367, 384, 400, 416, 433, 449, 465, 481, 496, 
      512, 527, 543, 558, 573, 587, 602, 616, 630, 644, 
      658, 672, 685, 698, 711, 724, 737, 749, 761, 773, 
      784, 796, 807, 818, 828, 839, 849, 859, 868, 878, 
      887, 896, 904, 912, 920, 928, 935, 943, 949, 956, 
      962, 968, 974, 979, 984, 989, 994, 998, 1002, 1005, 
      1008, 1011, 1014, 1016, 1018, 1020, 1022, 1023, 1023, 1024, 
      1024 };
  
  private static short[] e;
  
  private static int[] f;
  
  public static Random a = new Random();
  
  public static boolean b;
  
  public static boolean c;
  
  public static void a() {
    e = new short[91];
    f = new int[91];
    for (byte b = 0; b <= 90; b++) {
      e[b] = d[90 - b];
      if (e[b] == 0) {
        f[b] = Integer.MAX_VALUE;
      } else {
        f[b] = (d[b] << 10) / e[b];
      } 
    } 
  }
  
  public static final int a(int paramInt) {
    return ((paramInt = c(paramInt)) >= 0 && paramInt < 90) ? d[paramInt] : ((paramInt >= 90 && paramInt < 180) ? d[180 - paramInt] : ((paramInt >= 180 && paramInt < 270) ? -d[paramInt - 180] : -d[360 - paramInt]));
  }
  
  public static final int b(int paramInt) {
    return ((paramInt = c(paramInt)) >= 0 && paramInt < 90) ? e[paramInt] : ((paramInt >= 90 && paramInt < 180) ? -e[180 - paramInt] : ((paramInt >= 180 && paramInt < 270) ? -e[paramInt - 180] : e[360 - paramInt]));
  }
  
  public static final int a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_0
    //   1: ifeq -> 89
    //   4: iload_1
    //   5: bipush #10
    //   7: ishl
    //   8: iload_0
    //   9: idiv
    //   10: invokestatic abs : (I)I
    //   13: dup
    //   14: istore_2
    //   15: istore_2
    //   16: iconst_0
    //   17: istore_3
    //   18: goto -> 37
    //   21: getstatic ds.f : [I
    //   24: iload_3
    //   25: iaload
    //   26: iload_2
    //   27: if_icmplt -> 34
    //   30: iload_3
    //   31: goto -> 44
    //   34: iinc #3, 1
    //   37: iload_3
    //   38: bipush #90
    //   40: if_icmple -> 21
    //   43: iconst_0
    //   44: istore_2
    //   45: iload_1
    //   46: iflt -> 59
    //   49: iload_0
    //   50: ifge -> 59
    //   53: sipush #180
    //   56: iload_2
    //   57: isub
    //   58: istore_2
    //   59: iload_1
    //   60: ifge -> 73
    //   63: iload_0
    //   64: ifge -> 73
    //   67: wide iinc #2 180
    //   73: iload_1
    //   74: ifge -> 102
    //   77: iload_0
    //   78: iflt -> 102
    //   81: sipush #360
    //   84: iload_2
    //   85: isub
    //   86: goto -> 101
    //   89: iload_1
    //   90: ifle -> 98
    //   93: bipush #90
    //   95: goto -> 101
    //   98: sipush #270
    //   101: istore_2
    //   102: iload_2
    //   103: ireturn
  }
  
  public static final int c(int paramInt) {
    if (paramInt >= 360)
      paramInt -= 360; 
    if (paramInt < 0)
      paramInt += 360; 
    return paramInt;
  }
  
  public static void a(en paramen) {
    di.f.a(paramen, "check Controller= " + bt.d, 3, 55, 0);
    di.f.a(paramen, "check Map= " + bt.e, 3, 75, 0);
  }
  
  public static void b() {
    long l = l.d();
    if (bt.b - l > 5000L)
      bt.a().d(); 
    if (bt.c - l > 5000L)
      bt.a().e(); 
  }
  
  public static String a(String paramString) {
    if (l.c != 7)
      return paramString; 
    if (af.e() != null && (af.e()).aD != null && (af.e()).aD.c >= 10)
      return paramString; 
    if (paramString.indexOf("Gohan") != -1)
      paramString = a(paramString, "Gohan", "Hango"); 
    if (paramString.indexOf("Gôhan") != -1)
      paramString = a(paramString, "Gôhan", "Hango"); 
    if (paramString.indexOf("Bunma") != -1)
      paramString = a(paramString, "Bunma", "Mabun"); 
    if (paramString.indexOf("Bunman") != -1)
      paramString = a(paramString, "Bunman", "Mabun"); 
    if (paramString.indexOf("Bun ma") != -1)
      paramString = a(paramString, "Bun ma", "Mabun"); 
    if (paramString.indexOf("Đậu thần") != -1)
      paramString = a(paramString, "Đậu thần", "Cây thần"); 
    if (paramString.indexOf("Mabu") != -1)
      paramString = a(paramString, "Mabu", "Buma"); 
    if (paramString.indexOf("Ma bư") != -1)
      paramString = a(paramString, "Ma bư", "Buma"); 
    if (paramString.indexOf("Xayda") != -1)
      paramString = a(paramString, "Xayda", "Dasay"); 
    if (paramString.indexOf("Xay da") != -1)
      paramString = a(paramString, "Xay da", "Dasay"); 
    if (paramString.indexOf("Namếc") != -1)
      paramString = a(paramString, "Namếc", "Mecda"); 
    if (paramString.indexOf("Na mếc") != -1)
      paramString = a(paramString, "Na mếc", "Mecda"); 
    if (paramString.indexOf("Namek") != -1)
      paramString = a(paramString, "Namek", "Mecda"); 
    if (paramString.indexOf("Rồng thần") != -1)
      paramString = a(paramString, "Rồng thần", "Rồng đất"); 
    if (paramString.indexOf("Kame") != -1)
      paramString = a(paramString, "Kame", "Meka"); 
    if (paramString.indexOf("Vegeta") != -1)
      paramString = a(paramString, "Vegeta", "Tageve"); 
    if (paramString.indexOf("Kakalot") != -1)
      paramString = a(paramString, "Kakalot", "Lotkaka"); 
    if (paramString.indexOf("Broly") != -1)
      paramString = a(paramString, "Broly", "Lybro"); 
    if (paramString.indexOf("Ngọc rồng") != -1)
      paramString = a(paramString, "Ngọc rồng", "Ngọc thần"); 
    if (paramString.indexOf("ngọc rồng") != -1)
      paramString = a(paramString, "ngọc rồng", "Ngọc thần"); 
    if (paramString.indexOf("Radic") != -1)
      paramString = a(paramString, "Radic", "Dicra"); 
    if (paramString.indexOf("Ra dic") != -1)
      paramString = a(paramString, "Ra dic", "Dicra"); 
    if (paramString.indexOf("Ra đíc") != -1)
      paramString = a(paramString, "Ra đíc", "Dicra"); 
    if (paramString.indexOf("Cadic") != -1)
      paramString = a(paramString, "Cadic", "Dicca"); 
    if (paramString.indexOf("Ca dic") != -1)
      paramString = a(paramString, "Ca dic", "Dicca"); 
    if (paramString.indexOf("Ca đíc") != -1)
      paramString = a(paramString, "Ca đíc", "Dicca"); 
    if (paramString.indexOf("Quy lão") != -1)
      paramString = a(paramString, "Quy lão", "Lão"); 
    if (paramString.indexOf("quy lão") != -1)
      paramString = a(paramString, "quy lão", "lão"); 
    if (paramString.indexOf("QuyLão") != -1)
      paramString = a(paramString, "Quy Lão", "Lão"); 
    if (paramString.indexOf("Santa") != -1)
      paramString = a(paramString, "Santa", "Tasan"); 
    if (paramString.indexOf("Hạt Mít") != -1)
      paramString = a(paramString, "Hạt Mít", "Hạt Dẻ"); 
    if (paramString.indexOf("Hạt mít") != -1)
      paramString = a(paramString, "Hạt mít", "Hạt dẻ"); 
    if (paramString.indexOf("Tàu bảy bảy") != -1)
      paramString = a(paramString, "Tàu bảy bảy", "Tàu tàu"); 
    if (paramString.indexOf("Uron") != -1)
      paramString = a(paramString, "Uron", "Onru"); 
    if (paramString.indexOf("U ron") != -1)
      paramString = a(paramString, "U ron", "Onru"); 
    if (paramString.indexOf("Urôn") != -1)
      paramString = a(paramString, "Urôn", "Onru"); 
    if (paramString.indexOf("Ngọc Rồng") != -1)
      paramString = a(paramString, "Ngọc Rồng", "Ngọc thần"); 
    if (paramString.indexOf("Ngọc rồng") != -1)
      paramString = a(paramString, "Ngọc rồng", "Ngọc thần"); 
    if (paramString.indexOf("Fide") != -1)
      paramString = a(paramString, "Fide", "Defi"); 
    if (paramString.indexOf("Vegeta") != -1)
      paramString = a(paramString, "Vegeta", "Tageve"); 
    if (paramString.indexOf("Moori") != -1)
      paramString = a(paramString, "Moori", "Rimoo"); 
    if (paramString.indexOf("Aru") != -1)
      paramString = a(paramString, "Aru", "Ura"); 
    if (paramString.indexOf("Kamejoko") != -1)
      paramString = a(paramString, "Kamejoko", "Kojomeka"); 
    if (paramString.indexOf("kamejoko") != -1)
      paramString = a(paramString, "kamejoko", "kojomeka"); 
    if (paramString.indexOf("Kame") != -1)
      paramString = a(paramString, "Kame", "Meka"); 
    if (paramString.indexOf("kame") != -1)
      paramString = a(paramString, "kame", "meka"); 
    if (paramString.indexOf("Masenko") != -1)
      paramString = a(paramString, "Masenko", "Kosenma"); 
    if (paramString.indexOf("Thái Dương Hạ San") != -1)
      paramString = a(paramString, "Thái Dương Hạ San", "Hạ Dương"); 
    if (paramString.indexOf("Solar flare") != -1)
      paramString = a(paramString, "Solar flare", "Solar"); 
    if (paramString.indexOf("Quả cầu kênh khi") != -1)
      paramString = a(paramString, "Quả cầu kênh khi", "Quả cầu"); 
    if (paramString.indexOf("Genki-Dama") != -1)
      paramString = a(paramString, "Genki-Dama", "Dama"); 
    if (paramString.indexOf("Genki-Dama") != -1)
      paramString = a(paramString, "Genki-Dama", "Dama"); 
    if (paramString.indexOf("Makankosappo") != -1)
      paramString = a(paramString, "Makankosappo", "Oppasoknakam"); 
    return paramString;
  }
  
  public static String a(String paramString1, String paramString2, String paramString3) {
    StringBuffer stringBuffer = new StringBuffer();
    int i = paramString1.indexOf(paramString2);
    int j = 0;
    int k = paramString2.length();
    while (i != -1) {
      stringBuffer.append(paramString1.substring(j, i)).append(paramString3);
      j = i + k;
      i = paramString1.indexOf(paramString2, j);
    } 
    stringBuffer.append(paramString1.substring(j, paramString1.length()));
    return stringBuffer.toString();
  }
  
  public static int d(int paramInt) {
    return a.nextInt(paramInt);
  }
  
  public static int b(int paramInt1, int paramInt2) {
    return (paramInt1 == paramInt2) ? paramInt1 : (paramInt1 + a.nextInt(paramInt2 - paramInt1));
  }
  
  public static int e(int paramInt) {
    for (int i = 0; !i; i = a.nextInt() % paramInt);
    return i;
  }
  
  public static int c(int paramInt1, int paramInt2) {
    paramInt1 += a.nextInt(paramInt2 - paramInt1);
    paramInt2 = 2;
    if (a.nextInt(paramInt2) == 0)
      paramInt1 = -paramInt1; 
    return paramInt1;
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return f((paramInt1 - paramInt3) * (paramInt1 - paramInt3) + (paramInt2 - paramInt4) * (paramInt2 - paramInt4));
  }
  
  public static int d(int paramInt1, int paramInt2) {
    return f(paramInt1 * paramInt1 + paramInt2 * paramInt2);
  }
  
  public static int f(int paramInt) {
    if (paramInt <= 0)
      return 0; 
    int i = (paramInt + 1) / 2;
    while (true) {
      int j = i;
      i = i / 2 + paramInt / i * 2;
      if (Math.abs(j - i) <= 1)
        return i; 
    } 
  }
  
  public static int e(int paramInt1, int paramInt2) {
    paramInt2 = 1;
    for (byte b = 0; b < 2; b++)
      paramInt2 *= paramInt1; 
    return paramInt2;
  }
  
  public static int g(int paramInt) {
    return (paramInt > 0) ? paramInt : -paramInt;
  }
  
  public static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    return (paramInt5 >= paramInt1 && paramInt5 <= paramInt1 + paramInt3 && paramInt6 >= paramInt2 && paramInt6 <= paramInt2 + paramInt4);
  }
  
  public static void b(String paramString) {}
  
  public static void c(String paramString) {}
  
  public static String[] a(String paramString1, String paramString2, int paramInt) {
    String[] arrayOfString;
    int i;
    if ((i = paramString1.indexOf(paramString2)) >= 0) {
      arrayOfString = a(paramString1.substring(i + paramString2.length()), paramString2, paramInt + 1);
    } else {
      arrayOfString = new String[paramInt + 1];
      i = paramString1.length();
    } 
    arrayOfString[paramInt] = paramString1.substring(0, i);
    return arrayOfString;
  }
  
  public static String a(long paramLong) {
    String str;
    if (paramLong >= 1000000000L) {
      String str1 = aw.bf;
      long l = paramLong % 1000000000L / 100000000L;
      paramLong /= 1000000000L;
      str = (new StringBuffer(String.valueOf(paramLong))).toString();
      if (l > 0L) {
        str = String.valueOf(str) + "," + l + str1;
      } else {
        str = String.valueOf(str) + str1;
      } 
    } else if (str >= 1000000L) {
      String str1 = aw.bg;
      long l2 = str % 1000000L / 100000L;
      long l1 = str / 1000000L;
      str = (new StringBuffer(String.valueOf(l1))).toString();
      if (l2 > 0L) {
        str = String.valueOf(str) + "," + l2 + str1;
      } else {
        str = String.valueOf(str) + str1;
      } 
    } else {
      str = (new StringBuffer(String.valueOf(str))).toString();
    } 
    return str;
  }
  
  public static String b(long paramLong) {
    String str;
    if (paramLong >= 1000000000L) {
      String str1 = aw.bf;
      long l = paramLong % 1000000000L / 10000000L;
      paramLong /= 1000000000L;
      str = (new StringBuffer(String.valueOf(paramLong))).toString();
      if (l >= 10L) {
        if (l % 10L == 0L)
          l /= 10L; 
        str = String.valueOf(str) + "," + l + str1;
      } else if (l > 0L) {
        str = String.valueOf(str) + ",0" + l + str1;
      } else {
        str = String.valueOf(str) + str1;
      } 
    } else {
      String str1;
      if (str >= 1000000L) {
        String str2 = aw.bg;
        long l2 = str % 1000000L / 10000L;
        long l1 = str / 1000000L;
        str1 = (new StringBuffer(String.valueOf(l1))).toString();
        if (l2 >= 10L) {
          if (l2 % 10L == 0L)
            l2 /= 10L; 
          str1 = String.valueOf(str1) + "," + l2 + str2;
        } else if (l2 > 0L) {
          str1 = String.valueOf(str1) + ",0" + l2 + str2;
        } else {
          str1 = String.valueOf(str1) + str2;
        } 
      } else if (str1 >= 10000L) {
        String str2 = "k";
        long l2 = str1 % 1000L / 10L;
        long l1 = str1 / 1000L;
        str = (new StringBuffer(String.valueOf(l1))).toString();
        if (l2 >= 10L) {
          if (l2 % 10L == 0L)
            l2 /= 10L; 
          str = String.valueOf(str) + "," + l2 + str2;
        } else if (l2 > 0L) {
          str = String.valueOf(str) + ",0" + l2 + str2;
        } else {
          str = String.valueOf(str) + str2;
        } 
      } else {
        str = (new StringBuffer(String.valueOf(str))).toString();
      } 
    } 
    return str;
  }
  
  static {
    (new String[5])[0] = "<color=#ff0000ff>[  LOG_CAT  ]</color>";
    (new String[5])[1] = "<color=#ff0000ff>[LOG_SESSION]</color>";
    (new String[5])[2] = "<color=#ffff00ff>[LOG_SESSION]</color>";
    (new String[5])[3] = "<color=#ff0000ff>[LOG_MOBILE ]</color>";
    (new String[5])[4] = "";
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ds.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */