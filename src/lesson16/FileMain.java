package lesson16;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class FileMain {

    public static void main(String[] args) {
        File file = new File("text.txt");
        boolean isFile = file.isFile();
        boolean directory = file.isDirectory();
        boolean exists = file.exists();
        boolean hidden = file.isHidden();
        File dir = new File("someDir/part2");
        if (!dir.exists()) {
            boolean mkdir = dir.mkdir();
            System.out.println(mkdir);
//            dir.mkdirs();
        }
        try {
            boolean newFile = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File absoluteFile = file.getAbsoluteFile();
        System.out.println(file);
        System.out.println(absoluteFile);
        System.out.println(file.getAbsolutePath());
        long l = file.lastModified();

        long l1 = System.currentTimeMillis();
        Date date = new Date(l1);
        System.out.println(date);


        Properties properties = System.getProperties();
        properties.forEach((p,v) -> System.out.println(p + "  =  " + v));

        String property = System.getProperty("line.separator");
    }
}
