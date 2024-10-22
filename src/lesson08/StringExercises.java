package lesson08;

public class StringExercises {

    public static void main(String[] args) {
        String str = "asda";
        char c = str.charAt(0);
        System.out.println( c );
        int length = str.length();
        char c1 = str.charAt(length - 1);
        System.out.println(c1);
        if( length % 2 != 0){
            int i = length / 2;
            char i1 =str.charAt(i);
            System.out.println(i1);
        } else
            System.out.println(" no result");


        String s6 = "   А роза упала на лапу азора    ";
        System.out.println(s6);
        String lowerCase = s6.toLowerCase();
        System.out.println(lowerCase);
//        String trim = lowerCase.trim();
//        System.out.println(trim);
        String replace = lowerCase.replace(" ", "");
        System.out.println(replace);

        boolean isPalindrom = true;
        int lastIndex = replace.length() - 1;
        for (int i = 0; i < replace.length() / 2; i++) {
            if (replace.charAt(i) != replace.charAt(lastIndex - i)) {
                isPalindrom = false;
            }
        }

        System.out.println(isPalindrom ? "da" : "net");
    }
}
