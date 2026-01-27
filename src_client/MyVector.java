/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public class MyVector
extends Vector {
    private String LoginScreen;

    public MyVector(String string) {
        this.LoginScreen = string;
    }

    private MyVector() {
    }

    public synchronized void removeAllElements() {
        super.removeAllElements();
    }

    public synchronized boolean removeElement(Object object) {
        return super.removeElement(object);
    }

    public synchronized void removeElementAt(int n2) {
        super.removeElementAt(n2);
    }

    public synchronized void addElement(Object object) {
        if (this.size() > 1000) {
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||" + this.LoginScreen + " num= " + this.size());
        }
        super.addElement(object);
    }

    public synchronized void insertElementAt(Object object, int n2) {
        if (this.size() > 1000) {
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||" + this.LoginScreen + " num= " + this.size());
        }
        super.insertElementAt(object, n2);
    }
}

