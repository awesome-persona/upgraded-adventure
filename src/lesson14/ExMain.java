package lesson14;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExMain {

    public static void main(String[] args) throws FileNotFoundException {
        try {

            boolean equals = "".equals("");
            extracted();
        } catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
//            throw e;
        } finally {
            System.out.println("final");
        }


        try {

        } catch (RuntimeException e) {

        } catch (Exception e) {

        } finally {

        }

//        try {
//            FileReader fileReader1 = new FileReader("test1.txt");
//            System.out.println("Hello");
//            FileReader fileReader2 = new FileReader("test2.txt");
//            FileReader fileReader3 = new FileReader("test3.txt");
//            FileReader fileReader4 = new FileReader("test4.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("ERROR:" + e.getMessage());
//        }
    }

    private static void extracted() throws FileNotFoundException {
        int x = 1;
        int y = 10;
        int z = y / x;

        FileReader fileReader1 = new FileReader("test1.txt");
    }
}
