package lesson03;

public class Main {

    public static void main(String[] args) {
        String binaryString = Integer.toBinaryString(-(int) Math.pow(2, 32) - 1);
        System.out.println(binaryString);

//        int x = 642423;
//        int i = x % 7; //[0;6]

//        if (i == 0) {
//            System.out.println("четверг");
//        } else if (i == 1) {
//            System.out.println("Пятница");
//        } else if (i == 2) {
//            System.out.println("Сб");
//        } else if (i == 3) {
//            System.out.println("Вск");
//        } else if (i == 4) {
//            System.out.println("Пн");
//        } else if (i == 5) {
//            System.out.println("Вт");
//        } else if (i == 6) {
//            System.out.println("Среда");
//        }

        int x = -234534;
//        int i = (x % 7 + 7) % 7; //[-6;6] - [1; 13] -> [0;6]
        int i = x < 0 ? x % 7 + 7 : x % 7;
        switch (i) {
            case 0:
                System.out.println("четверг");
                break;
            case 1:
            case -6:
                System.out.println("Пятница");
                break;
            case 2:
            case -5:
                System.out.println("Сб");
                break;
            case 3:
            case -4:
                System.out.println("Вск");
                break;
            case 4:
            case -3:
                System.out.println("Пн");
                break;
            case 5:
            case -2:
                System.out.println("Вт");
                break;
            case 6:
            case -1:
                System.out.println("Среда");
                break;
            default:
                if (i < 0) {
                    break;
                }
                System.out.println("not found");
        }
        System.out.println();
    }
}
