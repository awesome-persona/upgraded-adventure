package lesson06;

import java.util.Random;

public class AccessModifierExample {

    private     static int a;
                static int b;  // package private
    protected   static int c;
    public      static int d;

    public static void main(String[] args) {
        final int a1 = a;
        final int b1 = b;
        final int c1 = c;
        var d1 = d;

        Random random = new Random();
        final byte g = 5; // (byte) random.nextInt(100);
//        g++;
        byte h = 6 + g;
    }


    class Constant {


    }
}
