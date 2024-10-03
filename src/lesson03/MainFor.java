package lesson03;

import java.util.Random;

public class MainFor {

    public static void main(String[] args) {
        for (;;) {
            System.out.println("Hi");
            int i = new Random().nextInt(100);
            if (i < 10) {
                break;
            }
        }

        int[] a = { 1,213,2,213,21321,3,423423 };
        for (int ints : a) {
            System.out.println(ints);
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            if (ints > 100) {
                continue;
            }
            System.out.println(4);
            System.out.println(5);
        }
    }
}


