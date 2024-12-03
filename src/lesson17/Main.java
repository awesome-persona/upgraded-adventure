package lesson17;

import lesson13.Point;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Operation sum = new SumOperation();
        int proceed = sum.proceed(55, 55);
        Operation sumOp = new Operation() {
            @Override
            public int proceed(int a, int b) {
                return a + b;
            }
        };
        int proceed1 = sumOp.proceed(33, 66);

        Operation afkldasjfkldas = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
            return x + y;
        };
        Operation sumOp2 = (x, y) -> x + y;
        Operation sumOp3 = Integer::sum;
        Operation multiOp = (x, y) -> x * y;
        Operation subtractOp2 = (x, y) -> Math.abs(x - y);
        Operation powerOp2 = (x, y) -> (int) Math.pow(x,y);

        Operation maxOp = Integer::max;
        Operation minOp = Integer::min;

        BiFunction<Integer, Integer, Integer> op = Integer::max;
        BinaryOperator<Integer> binaryOperator = (BinaryOperator<Integer>) op;
        BinaryOperator<Integer> binaryOperator1 = Integer::max;
        BiFunction<Integer, Integer, Integer> op2 = binaryOperator1;

        int a = 55;
        int b = 56;

        Integer k = 6;

        Operation operation = TestClass::staticProceed;
        TestClass testClass = new TestClass();
        Operation operation1 = testClass::proceed;
        Operation operation3 = TestClass::staticProceed;


        int proceed2 = afkldasjfkldas.proceed(66, 4);

//        Pointer pointer = (x, y) -> {
//            return new Point(x, y);
//        };



        Pointer pointer1 = Point::new;


        Function<String, Integer> func = str -> str.length();
    }
}
