package lesson04;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            for (int j = 0; j < 10; j++) {
                if (j % 2 == 0) {
                    continue;
                }
                System.out.print("" + j + i + " ");
            }
            System.out.println();
        }

        int n = 13;
        int[] arr = new int[n + 4];
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        arr[10] = -5;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i] + " ");
        }


    }
}
