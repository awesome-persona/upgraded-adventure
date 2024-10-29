package lesson09;

public class Main2 {

    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        StringBuilder haha = new StringBuilder();
        for (int i = 0; i < 100000000; i++) {
            haha.append(i);
        }
        System.out.println(haha.toString());
        long finish1 = System.currentTimeMillis();
        System.out.println(finish1 - start1);




//        stringBuilder.
        StringBuffer buffer = new StringBuffer();
//        buffer.
        long start = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < 1000000; i++) {
            s = s + i;
        }

        System.out.println(s);
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
}
