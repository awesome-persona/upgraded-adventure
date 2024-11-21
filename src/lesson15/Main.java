package lesson15;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String fileName = "test.txt";
        String text = "Hello Students!!!";
//        writeToFile(fileName, text);
        readFromFile(fileName);
    }


    private static String readFromFile(String fileName) throws Exception {
        try (var fis = new FileInputStream(fileName);
             var bis = new BufferedInputStream(fis, 3)){
//            byte[] bytes = bis.readAllBytes();
//            String s = new String(bytes);
            for (int read = bis.read(); read != -1; read = bis.read()) {
                System.out.print((char) read);
            }
        }
        return null;
    }

    private static void writeToFileNewVersion(String fileName, String text) {

        try (FileOutputStream gg = new FileOutputStream("gg")){
            try (FileOutputStream fos = new FileOutputStream(fileName);
            var bos = new BufferedOutputStream(fos)) {
                byte[] bytes = text.getBytes();
                bos.write(bytes);
                bos.write(bytes);
                bos.write(bytes);
                bos.write(bytes);
                bos.write(bytes);
                bos.write(bytes);

                ///
                bos.flush();
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
