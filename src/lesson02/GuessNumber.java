package lesson02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int result = (int) (Math.random() * 100) + 1; // [1;101) -> [1 ; 100]
        // [-100; 100]  r * 201 - 100
        guess(result);
    }

    public static void guess(int r) {
        System.out.println("vvedite chislo ot 1 do 100:");
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();

            if (x > 100) {
//                throw new RuntimeException("число больше 100");
                System.out.println("что-то пошло не так! число больше 100");
                guess(r);
            }
            if (x < 1) {
                throw new RuntimeException("число меньше 1");
            }
            System.out.println("x= " + x);

            if (x == r) {
                System.out.println("win");
            } else {
                System.out.println("vvedite " + (x > r ? "menshe" : "bolshe"));
                guess(r);
            }
        } catch (InputMismatchException e) {
            System.out.println("некоректный ввод");
            guess(r);
        } catch (Exception e) {
            System.out.println("что-то пошло не так! " + e.getMessage());
            guess(r);
        }
    }
}
