import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import javax.microedition.lcdui.Image;
import main.a;

public final class as {
  public static t a = new t("h ImgByName");
  
  public static void a(String paramString, Image paramImage, byte paramByte) {
    a.put(paramString, new bm(paramImage, paramByte));
  }
  
  public static bm a(String paramString, t paramt) {
    bm bm;
    if ((bm = (bm)paramt.get(paramString)) == null) {
      bm = new bm();
      bm bm1;
      if ((bm1 = a(paramString)) != null) {
        bm.a = bm1.a;
        bm.d = bm1.d;
      } 
      paramt.put(paramString, bm);
    } 
    bm.b = a.b / 1000L;
    if (bm.a == null) {
      bm.c--;
      if (bm.c <= 0) {
        bt.a().g(paramString);
        bm.c = 200;
      } 
    } 
    return bm;
  }
  
  private static bm a(String paramString) {
    bm bm;
    byte[] arrayOfByte;
    if ((arrayOfByte = av.b(paramString = String.valueOf(en.b) + "ImgByName_" + paramString)) == null)
      return null; 
    try {
      (bm = new bm()).d = arrayOfByte[0];
      bm.a = Image.createImage(arrayOfByte, 1, arrayOfByte.length - 1);
    } catch (Exception exception) {
      return null;
    } 
    return bm;
  }
  
  public static void a(String paramString, byte paramByte, byte[] paramArrayOfbyte) {
    paramString = String.valueOf(en.b) + "ImgByName_" + paramString;
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeByte(paramByte);
      for (paramByte = 0; paramByte < paramArrayOfbyte.length; paramByte++)
        dataOutputStream.writeByte(paramArrayOfbyte[paramByte]); 
      av.a(paramString, byteArrayOutputStream.toByteArray());
      dataOutputStream.close();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public static void a(t paramt, int paramInt) {
    el el = new el("checkDelHash");
    Enumeration enumeration = paramt.keys();
    while (enumeration.hasMoreElements()) {
      String str = enumeration.nextElement();
      bm bm = (bm)paramt.get(str);
      if (a.b / 1000L - bm.b > 600L)
        el.addElement(str); 
    } 
    for (byte b = 0; b < el.size(); b++)
      paramt.remove(el.elementAt(b)); 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\as.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */