package lesson21;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        //10  -> +2  = 12

        //12 (10)  -> +3  = 15

        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + " started");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) { }
            System.out.println(Thread.currentThread().getName() + " ended");
        };


//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            executorService.submit(r);
        }
        executorService.shutdown();
        try (ScheduledExecutorService service =
                Executors.newScheduledThreadPool(3)) {
            service.schedule(r, 1, TimeUnit.SECONDS);
        }
    }


}
