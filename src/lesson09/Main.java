package lesson09;

import lesson07.Point;

public class Main {

    public static void saveToSomeFile(String[] args) {
        Point point = new Point(1, 0);
        Point point1 = new Point(1, 0);


        /*
*
*
*
*
*
*
*
*
* */
        Point point2 = point;
        Object test = "dasdasdas";

        /*
        *
        *
        *
        *
        *
        *
        *
        * */


        System.out.println(point.equals(point2));
        System.out.println(point.equals(test));

        System.out.println(point == point1);

        System.out.println(point.equals(point1));

        System.out.println(point.getX() == point1.getX() && point.getY() == point1.getY());

        System.out.println(point.getX() == point1.getX() & point.getY() == point1.getY());

        System.out.println("-------------------------------------------");

        String hello = "Hello";
        String helloFromArray = new String(new char[]{'H', 'e', 'l', 'l', 'o'});
        String helloWorld = "Hello World";
        System.out.println(hello == helloFromArray);
        System.out.println(hello == helloWorld);

        helloFromArray = helloFromArray.intern();
        System.out.println(hello == helloFromArray);
        System.out.println(hello == helloWorld);

        System.out.println(hello.equals(helloFromArray));
        System.out.println(hello.equals(helloWorld));



    }
}
