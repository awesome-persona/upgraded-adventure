package lesson11;

import java.math.BigDecimal;

public class AccountMain {

    public static void main(String[] args) {

        Account acc1 = new Account(10000, 123456, "Vasya");
        Account acc2 = new Account(5000, 23456, "Petya");
        Account acc3 = new Account(25000, 65432, "Lesha");

        acc1.addAmount(4444);
        acc1.addAmount(-444);

        Account[] accounts = {acc1, acc2, acc3};

        DoubleAccount maxim = new DoubleAccount(333.3, 2132312, "Maxim");


        GenericAccount<Object, Integer> gAcc1 = new GenericAccount<>();
        Integer amount = gAcc1.getAmount();

        GenericAccount<Integer, Integer> vasyanya =
                new GenericAccount<>("Vasyanya", 1234560, 100000);
        Integer amount1 = vasyanya.getAmount();


        GenericAccount<Long, Double> vasyanya1 =
                new GenericAccount<>("Vasyanya", 1234560L, 100000d);


        GenericAccount<String, Double> account =
                new GenericAccount<>("Vasyanya", "asdklhjasdkj213", 100000d);


        GenericAccount<String, BigDecimal> account2 =
                new GenericAccount<>("Vasyanya", "asdklhjasdkj213", BigDecimal.TEN);


    }
}
