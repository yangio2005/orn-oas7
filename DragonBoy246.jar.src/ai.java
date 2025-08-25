import java.io.DataInputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ai {
  public int a;
  
  public short[] b;
  
  public short c;
  
  public String[] d;
  
  public String[] e;
  
  public String[] f;
  
  public String[] g;
  
  public short h;
  
  public ai(short paramShort1, byte paramByte, String paramString1, String paramString2, String[] paramArrayOfString1, short[] paramArrayOfshort, short paramShort2, String[] paramArrayOfString2) {
    this.c = paramShort1;
    this.a = paramByte;
    this.d = di.g.a(paramString1, g.ab - 20);
    this.e = di.k.a(paramString2, g.ab - 20);
    this.f = paramArrayOfString1;
    this.b = paramArrayOfshort;
    this.h = paramShort2;
    this.g = paramArrayOfString2;
  }
  
  public ai() {}
  
  public static byte[] a(y paramy) {
    try {
      int i;
      if ((i = paramy.c().readInt()) > 1) {
        byte[] arrayOfByte = new byte[i];
        paramy.c().read(arrayOfByte);
        return arrayOfByte;
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    return null;
  }
  
  public static byte[] a(DataInputStream paramDataInputStream) {
    try {
      int i;
      byte[] arrayOfByte = new byte[i = paramDataInputStream.readInt()];
      paramDataInputStream.read(arrayOfByte);
      return arrayOfByte;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return null;
    } 
  }
  
  public static String a(String paramString1, String paramString2, String paramString3) {
    StringBuffer stringBuffer = new StringBuffer();
    int i;
    while ((i = paramString1.indexOf(paramString2)) != -1) {
      stringBuffer.append(String.valueOf(paramString1.substring(0, i)) + paramString3);
      paramString1 = paramString1.substring(i + paramString2.length());
    } 
    stringBuffer.append(paramString1);
    return stringBuffer.toString();
  }
  
  public static String a(int paramInt) {
    long l = paramInt * 1000L;
    Calendar calendar;
    (calendar = Calendar.getInstance()).setTimeZone(TimeZone.getTimeZone("GMT+7"));
    calendar.setTime(new Date(l));
    int j = calendar.get(11);
    calendar.get(12);
    int k = calendar.get(5);
    int m = calendar.get(2) + 1;
    int i = calendar.get(1);
    return String.valueOf(k) + "/" + m + "/" + i + " " + j + "h";
  }
  
  public static String b(int paramInt) {
    int i = 0;
    if (paramInt > 60) {
      i = paramInt / 60;
      paramInt %= 60;
    } 
    int j = 0;
    if (i > 60) {
      j = i / 60;
      i %= 60;
    } 
    int k = 0;
    if (j > 24) {
      k = j / 24;
      j %= 24;
    } 
    String str = "";
    if (k > 0) {
      str = String.valueOf(str) + k;
      str = String.valueOf(str) + "d";
      str = String.valueOf(str) + j + "h";
    } else if (j > 0) {
      str = String.valueOf(str) + j;
      str = String.valueOf(str) + "h";
      str = String.valueOf(str) + i + "'";
    } else {
      if (i > 9) {
        str = String.valueOf(str) + i;
      } else {
        str = String.valueOf(str) + "0" + i;
      } 
      str = String.valueOf(str) + ":";
      if (paramInt > 9) {
        str = String.valueOf(str) + paramInt;
      } else {
        str = String.valueOf(str) + "0" + paramInt;
      } 
    } 
    return str;
  }
  
  public static String a(long paramLong) {
    String str = "";
    long l = paramLong / 1000L + 1L;
    for (byte b = 0; b < l; b++) {
      if (paramLong >= 1000L) {
        long l1;
        if ((l1 = paramLong % 1000L) == 0L) {
          str = ".000" + str;
        } else if (l1 < 10L) {
          str = ".00" + l1 + str;
        } else if (l1 < 100L) {
          str = ".0" + l1 + str;
        } else {
          str = "." + l1 + str;
        } 
        paramLong /= 1000L;
      } else {
        str = String.valueOf(paramLong) + str;
        break;
      } 
    } 
    return str;
  }
  
  public static String c(int paramInt) {
    int i = 0;
    if (paramInt > 60)
      i = paramInt / 60; 
    paramInt = 0;
    if (i > 60) {
      paramInt = i / 60;
      i %= 60;
    } 
    int j = 0;
    if (paramInt > 24) {
      j = paramInt / 24;
      paramInt %= 24;
    } 
    String str = "";
    if (j > 0) {
      str = String.valueOf(str) + j;
      str = String.valueOf(str) + "d";
      str = String.valueOf(str) + paramInt + "h";
    } else if (paramInt > 0) {
      str = String.valueOf(str) + paramInt;
      str = String.valueOf(str) + "h";
      str = String.valueOf(str) + i + "'";
    } else {
      if (i == 0)
        i = 1; 
      str = String.valueOf(str) + i;
      str = String.valueOf(str) + "ph";
    } 
    return str;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ai.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */