package lesson02;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int result = (int)(Math.random() * 100) + 1; // [1;101) -> [1 ; 100]
        // [-100; 100]  r * 201 - 100
        guess(result);
    }

    public static void guess(int r) {
        System.out.println("vvedite chislo ot 1 do 100:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("x= " + x);

//        if (x == r) {
//            System.out.println("win");
//        } else if (x > r) {
//            System.out.println("vvedite menshe");
//            guess(r);
//        } else {
//            System.out.println("vvedite bolshe");
//            guess(r);
//        }

//        System.out.println( (x == r) ? "win" : (x > r ? "menshe" : "bolshe"));
//        if (x != r) {
//            guess(r);
//        }


        if (x == r) {
            System.out.println("win");
        } else {
            System.out.println("vvedite " + (x > r ? "menshe" : "bolshe"));
            guess(r);
        }

    }
}
