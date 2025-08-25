import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

public class av {
  public w[] a;
  
  public av(int paramInt) {
    if (paramInt == 0)
      this.a = new w[3]; 
    if (paramInt == 1)
      this.a = new w[17]; 
    if (paramInt == 2)
      this.a = new w[14]; 
    if (paramInt == 3)
      this.a = new w[2]; 
  }
  
  public av() {}
  
  public static void a(String paramString, byte[] paramArrayOfbyte) {
    try {
      RecordStore recordStore;
      if ((recordStore = RecordStore.openRecordStore("vj" + paramString, true)).getNumRecords() > 0) {
        recordStore.setRecord(1, paramArrayOfbyte, 0, paramArrayOfbyte.length);
      } else {
        recordStore.addRecord(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      } 
      recordStore.closeRecordStore();
      return;
    } catch (Exception exception) {
      ds.c("bi loi save -------------------------" + paramString);
      return;
    } 
  }
  
  public static void a(String paramString) {
    for (byte b = 0; b < (RecordStore.listRecordStores()).length; b++) {
      if (RecordStore.listRecordStores().equals(paramString))
        try {
          RecordStore.deleteRecordStore(paramString);
        } catch (RecordStoreNotFoundException recordStoreNotFoundException2) {
          RecordStoreNotFoundException recordStoreNotFoundException1;
          (recordStoreNotFoundException1 = null).printStackTrace();
        } catch (RecordStoreException recordStoreException2) {
          RecordStoreException recordStoreException1;
          (recordStoreException1 = null).printStackTrace();
        }  
    } 
  }
  
  public static void a() {
    ds.c("CLEAR ALL");
    try {
      String[] arrayOfString;
      if ((arrayOfString = RecordStore.listRecordStores()) == null)
        return; 
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (arrayOfString[b] != null) {
          ds.c("name = " + arrayOfString[b]);
          RecordStore.deleteRecordStore(arrayOfString[b]);
        } 
      } 
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public static byte[] b(String paramString) {
    byte[] arrayOfByte;
    try {
      RecordStore recordStore;
      arrayOfByte = (recordStore = RecordStore.openRecordStore("vj" + paramString, false)).getRecord(1);
      recordStore.closeRecordStore();
    } catch (Exception exception) {
      return null;
    } 
    return arrayOfByte;
  }
  
  public static void a(String paramString, int paramInt) {
    try {
      a(paramString, new byte[] { (byte)paramInt });
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static void a(String paramString1, String paramString2) {
    try {
      a(paramString1, paramString2.getBytes("UTF-8"));
      return;
    } catch (Exception exception) {
      (paramString1 = null).printStackTrace();
      return;
    } 
  }
  
  public static String c(String paramString) {
    byte[] arrayOfByte;
    if ((arrayOfByte = b(paramString)) == null)
      return null; 
    try {
      String str;
      return str = new String(arrayOfByte, "UTF-8");
    } catch (Exception exception) {
      return new String(arrayOfByte);
    } 
  }
  
  public static int d(String paramString) {
    byte[] arrayOfByte;
    return ((arrayOfByte = b(paramString)) == null) ? -1 : arrayOfByte[0];
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\av.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */