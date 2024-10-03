package lesson02;

public class Main {
    public static void main(String[] args) {
        int a = 25;
        int b = 3;
        int c = a / b;
        System.out.println(c); // 8
        int d = a % b;
        System.out.println(d); // 1

        // c * b + d  = a

        // x % 13 ? 0-12

        int k = 10;


        System.out.println(k); // 10


        System.out.println(k++); // 10
        k = k + 1;
        System.out.println(k);


        k = k + 1;
        System.out.println(++k); // 12


        int f = 55;
        f = f + 20; // 75
        f += 20; //95

        f *= 3; // 285
        f /= 2; // 142

        //256
        //250 - read - edit
        //234 - read - edit - share

        int p = 31;

        int read = 1;
        int write = 2;
        int edit = 4;
        int remove = 8;
        int share = 16;


        boolean b11111 = (p & read) == read;


        int a1 = 5;
        int b1 = 7;
        int c1 = 3;

        boolean condition1 = a1 + b1 > c1;
        boolean condition2 = a1 + c1 > b1;
        boolean condition3 = b1 + c1 > a1;
        boolean exist = condition1 && condition2 && condition3;

        System.out.println(exist);
    }
}
