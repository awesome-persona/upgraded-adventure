package lesson22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
        /*
        1734019700988
        1734019712673
        1734019727530
        */

        long i = (long) (Math.pow(2, 62) - 1);
        Date date = new Date(l);
        Date date1 = new Date(l);
        System.out.println(date);

        int i1 = date.compareTo(date1);

        Date date2 = new Date();

        Calendar instance = Calendar.getInstance();
        instance.setTime(date2);
        instance.set(Calendar.YEAR, 2030);
        instance.set(2024, 12, 12, 20, 4, 55);

        //is 12 Dec 2024
        //1734020117293 ?
        //1734020177293 ?
        //1734020197293 ?

        // 12 dec 2024 00 00 00
        // 13 dec 2024 00 00 00  -1

        // 1000 * 60 * 60 * 24


        String s = "h:mm a";

        SimpleDateFormat format = new SimpleDateFormat(s);
        String format1 = format.format(date);
        System.out.println(format1);

        //+0530

        String s1 = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(s1);
        String format2 = simpleDateFormat.format(date);
        System.out.println(format2);

        try {
            Date parse = simpleDateFormat.parse("2004.03.05 н. э. at 13:37:03 MSK");
            System.out.println(parse.toString());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
