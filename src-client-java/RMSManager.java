/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 *  javax.microedition.rms.RecordStoreNotFoundException
 */
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

public class RMSManager {
    public w[] a;

    public RMSManager(int n2) {
        if (n2 == 0) {
            this.a = new w[3];
        }
        if (n2 == 1) {
            this.a = new w[17];
        }
        if (n2 == 2) {
            this.a = new w[14];
        }
        if (n2 == 3) {
            this.a = new w[2];
        }
    }

    public RMSManager() {
    }

    public static void a(String string, byte[] byArray) {
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)("vj" + string), (boolean)true);
            if (recordStore.getNumRecords() > 0) {
                recordStore.setRecord(1, byArray, 0, byArray.length);
            } else {
                recordStore.addRecord(byArray, 0, byArray.length);
            }
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            MathUtil.c("bi loi save -------------------------" + string);
            return;
        }
    }

    public static void a(String string) {
        int n2 = 0;
        while (n2 < RecordStore.listRecordStores().length) {
            if (RecordStore.listRecordStores().equals(string)) {
                Throwable throwable;
                try {
                    RecordStore.deleteRecordStore((String)string);
                }
                catch (RecordStoreNotFoundException recordStoreNotFoundException) {
                    throwable = recordStoreNotFoundException;
                    recordStoreNotFoundException.printStackTrace();
                }
                catch (RecordStoreException recordStoreException) {
                    throwable = recordStoreException;
                    recordStoreException.printStackTrace();
                }
            }
            ++n2;
        }
    }

    public static void a() {
        MathUtil.c("CLEAR ALL");
        try {
            String[] stringArray = RecordStore.listRecordStores();
            if (stringArray == null) {
                return;
            }
            int n2 = 0;
            while (n2 < stringArray.length) {
                if (stringArray[n2] != null) {
                    MathUtil.c("name = " + stringArray[n2]);
                    RecordStore.deleteRecordStore((String)stringArray[n2]);
                }
                ++n2;
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static byte[] IActionListener(String string) {
        byte[] byArray;
        try {
            string = RecordStore.openRecordStore((String)("vj" + string), (boolean)false);
            byArray = string.getRecord(1);
            string.closeRecordStore();
        }
        catch (Exception exception) {
            return null;
        }
        return byArray;
    }

    public static void a(String string, int n2) {
        try {
            RMSManager.a(string, new byte[]{(byte)n2});
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void a(String object, String string) {
        try {
            RMSManager.a((String)object, string.getBytes("UTF-8"));
            return;
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static String c(String object) {
        byte[] byArray = RMSManager.IActionListener((String)object);
        object = byArray;
        if (byArray == null) {
            return null;
        }
        try {
            String string = new String((byte[])object, "UTF-8");
            return string;
        }
        catch (Exception exception) {
            return new String((byte[])object);
        }
    }

    public static int d(String object) {
        byte[] byArray = RMSManager.IActionListener((String)object);
        object = byArray;
        if (byArray == null) {
            return -1;
        }
        return (int)object[0];
    }
}

