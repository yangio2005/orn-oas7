import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class ay {
  SocketConnection a;
  
  public ay(String paramString, int paramInt) {
    try {
      this.a = (SocketConnection)Connector.open("socket://" + paramString + ":" + paramInt);
      return;
    } catch (IOException iOException) {
      (paramString = null).printStackTrace();
      return;
    } 
  }
  
  public final void a() {
    try {
      this.a.close();
      return;
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return;
    } 
  }
  
  public final DataOutputStream b() {
    try {
      return this.a.openDataOutputStream();
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return null;
    } 
  }
  
  public final DataInputStream c() {
    try {
      return this.a.openDataInputStream();
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return null;
    } 
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\ay.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */