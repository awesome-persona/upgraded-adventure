package lesson15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        String fileName = "test.txt";
        String text = "Hello Students!!!";
//        writeToFile(fileName, text);
        readFromFile(fileName);
    }


    private static String readFromFile(String fileName) throws Exception {
        try (var fis = new FileInputStream(fileName)){
            for (int read = fis.read(); read != -1; read = fis.read()) {
                System.out.print((char) read);
            }
        }
        return null;
    }

    private static void writeToFileNewVersion(String fileName, String text) {

        try (FileOutputStream gg = new FileOutputStream("gg")){
            try (FileOutputStream fos = new FileOutputStream(fileName)) {
                byte[] bytes = text.getBytes();
                fos.write(bytes);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("FINISHED");
            }


        } catch (Exception ignored) {}

    }

    private static void writeToFile(String fileName, String text) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fileName);
            byte[] bytes = text.getBytes();
            fos.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
