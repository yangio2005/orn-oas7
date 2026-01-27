/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.SocketConnection
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class ay {
    SocketConnection LoginScreen;

    public ay(String object, int n2) {
        try {
            this.LoginScreen = (SocketConnection)Connector.open((String)("socket://" + (String)object + ":" + n2));
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void methodLoginScreen() {
        try {
            this.LoginScreen.close();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final DataOutputStream b() {
        try {
            return this.LoginScreen.openDataOutputStream();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public final DataInputStream c() {
        try {
            return this.LoginScreen.openDataInputStream();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }
}

