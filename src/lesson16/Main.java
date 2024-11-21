package lesson16;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "text.txt";

        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Andrey");
            bw.write(",");
            bw.write("address");
            bw.write(",");
            bw.write("375333333333");
            bw.write(",");
            bw.write("василий.теркин@gmail.com");
            bw.newLine();
        }


        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)){
//            Stream<String> lines = br.lines();
            String str = br.readLine();
            while (str != null) {
                System.out.println(str);
                str = br.readLine();
            }
        }
//        finally {
//            br.close();
//        }

        System.out.println("hello");
    }
}
