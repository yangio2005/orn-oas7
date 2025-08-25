import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class u {
  private byte c;
  
  public String a;
  
  public static el b = new el("");
  
  private static el d = new el("");
  
  public u(String paramString, byte paramByte) {
    this.a = paramString;
    this.c = paramByte;
  }
  
  public static void a() {
    el el1 = new el("");
    byte[] arrayOfByte;
    if ((arrayOfByte = av.b("ImageSource")) == null) {
      bt.a().a(el1);
      return;
    } 
    d = new el("");
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
    try {
      short s;
      String[] arrayOfString = new String[s = dataInputStream.readShort()];
      byte[] arrayOfByte1 = new byte[s];
      for (byte b = 0; b < s; b++) {
        arrayOfString[b] = dataInputStream.readUTF();
        arrayOfByte1[b] = dataInputStream.readByte();
        d.addElement(new u(arrayOfString[b], arrayOfByte1[b]));
      } 
      dataInputStream.close();
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
    } 
    ds.c("vS size= " + b.size() + " vRMS size= " + d.size());
    bt.a().a(el1);
  }
  
  public static void b() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeShort(b.size());
      for (byte b = 0; b < b.size(); b++) {
        dataOutputStream.writeUTF(((u)b.elementAt(b)).a);
        dataOutputStream.writeByte(((u)b.elementAt(b)).c);
      } 
      av.a("ImageSource", byteArrayOutputStream.toByteArray());
      dataOutputStream.close();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar\\u.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */