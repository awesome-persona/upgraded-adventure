package lesson08;

public class StringMain {

    public static void main(String[] args) {
        String hello = "Hello";

        String s = new String("Hello");

        char[] chars = {'H','o','l','a'};

        String s1 = new String(chars);

        System.out.println(hello);
        System.out.println(s);
        System.out.println(s1);

        int length = s1.length();

        String cc = "cc".concat("cc");
        String s2 = "cc" + "cc";

        String s3 = String.valueOf(55L);


        String s4 = "dasfkgdsgjahksjdht yu yjghadsjgfdsfydsghfdasfjdhasgfjhdgs";
        int i = s4.indexOf("hello");
        int i1 = s4.lastIndexOf("jg");

        s4.substring(5, 8);

        String s5 = "  asd  asd  ";


    }
}
