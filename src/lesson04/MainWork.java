package lesson04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainWork {

    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min = " + min);


        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max && i % 2 == 0) {
//                max = arr[i];
//            }
//        }

        for (int i = 0; i < arr.length; i+=2) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);


//        int l = new Scanner(System.in).nextInt();
//        int k = 567; // -> 18

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
            int sumOfNumber = 0;
            while (k > 0) {
                sumOfNumber += k % 10;
                k = k / 10;
            }

            sum += sumOfNumber;
        }

        System.out.println("sum = " + sum);

        int[] a = {1, 3, 4, 5, 6, 7, 8, 9};
        // 2 4 6 8 7 11 15 - > false

        // 2 4 6 9 8 7 11 15 - > true
        // 2 4 6 7 11 15 - > true


        // ->  1 5 9 11 16
        // ->  3 14 19
        // ->  44 55 66

        // -> 1 3 5 9 11 14 16 19 44 55 66

        int[] a1 = new int[5];
        int[] a2 = new int[3];
        int[] a3 = new int[3];

        int newLength = a1.length + a2.length + a3.length;
        int[] ints = new int[newLength];
        ints = new int[5];

        Arrays.fill(ints, 8);
        Arrays.sort(ints);
        Arrays.equals(ints, a1);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
