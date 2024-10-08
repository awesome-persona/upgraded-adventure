package lesson04;

import java.util.Scanner;

public class MainHome {

    public static void main(String[] args) {
        System.out.println("Vvedite n:");
        int n = new Scanner(System.in).nextInt();

        for (int i = 0; i < n * 2 - 1; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                boolean fill = n % 2 != (j + i % 2) % 2;
                boolean leftTop = i + j >= n - 1;
                boolean rightBot = i + j <= 3 * n - 2;
                boolean leftBot = i - j < n;
                boolean rightTop = n + i - j > 0;
                if (fill && leftTop && rightBot && leftBot && rightTop) {
                     System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
