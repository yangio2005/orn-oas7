import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class bn {
  private static byte[] a = new byte[] { -22, 2, 12, 4, 5, 2, -10 };
  
  private int b = 0;
  
  public static Image a(String paramString) {
    Image image = null;
    paramString = "/x" + en.b + paramString;
    try {
      DataInputStream dataInputStream;
      int i;
      byte[] arrayOfByte = new byte[i = (dataInputStream = new DataInputStream("".getClass().getResourceAsStream(paramString))).available()];
      dataInputStream.read(arrayOfByte, 0, i);
      bn bn1;
      (bn1 = new bn()).b = 0;
      for (byte b = 0; b < arrayOfByte.length; b++) {
        byte b1 = arrayOfByte[b];
        bn bn2 = bn1;
        b1 = (byte)(a[bn2.b++] & 0xFF ^ b1 & 0xFF);
        if (bn2.b >= a.length)
          bn2.b %= a.length; 
        arrayOfByte[b] = b1;
      } 
      image = Image.createImage(arrayOfByte, 0, i);
    } catch (IOException iOException) {
    
    } catch (IllegalArgumentException illegalArgumentException) {
    
    } catch (NullPointerException nullPointerException) {}
    if (image == null)
      try {
        image = Image.createImage(paramString);
      } catch (IOException iOException) {
        return null;
      }  
    return image;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\bn.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */