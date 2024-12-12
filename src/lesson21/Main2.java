package lesson21;

import java.util.concurrent.*;

public class Main2 {

    public static void main(String[] args) {
        Runnable r = () -> {};
        r.run();
        System.out.println("старт");
        Callable<Integer> callable = () -> {
            String s = "sdafjsldgfjlagjkldfjgkldfhwjdhffjhgshfjdgasdhjf";
            Thread.sleep(3000);
            return s.indexOf("w");
        };

        System.out.println("инструкция готова");
        try (ExecutorService service = Executors.newFixedThreadPool(2)){
            Future<Integer> future = service.submit(callable);
            System.out.println("делегирование выполнено");

            boolean done = future.isDone();

            System.out.println("инструкция " + (done? "" : "ne") + " выполненa");

            try {
                Integer i = future.get(15, TimeUnit.SECONDS);
                System.out.println("индекс " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (TimeoutException e) {
                System.out.println("мы здесь");
                throw new RuntimeException(e);
            }

        }


    }
}
