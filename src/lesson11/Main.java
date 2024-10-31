package lesson11;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    static int a = 0;
    static boolean a1 = false;


    static Integer b = null;

    public static void main(String[] args) {

        Integer i = b + b;

        todoInteger(a); // int -> Integer
        todoInteger(b);

        todoInt(a);
        todoInt(b); //  Integer -> int

        Integer i1 = Integer.valueOf(55);


        BigInteger bigInteger = new BigInteger("122178927892972197786686786864219747");

        BigInteger one = BigInteger.ONE;

        BigInteger add = one.add(one);
        BigInteger sqrt = one.sqrt();
        BigInteger subtract = sqrt.subtract(BigInteger.TEN);
        BigInteger multiply = subtract.multiply(add);
        BigInteger divide = multiply.divide(add);

        BigDecimal bigDecimal = BigDecimal.TEN;
        int i2 = bigDecimal.compareTo(BigDecimal.ONE);  // -1 0 1
        boolean equals = bigDecimal.equals(bigDecimal);

        BigInteger bigInteger1 = BigDecimal.ONE.toBigInteger();
        BigInteger bigInteger2 = new BigInteger(bigInteger1.toString());

        long l = bigInteger2.longValue();
    }


    public static void todoInt(int a) {
        System.out.println(a);
    }

    public static void todoInteger(Integer a) {
        System.out.println(a);
    }



}
