package lesson20.sync;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                synchronized (Counter.class) {
                    counter.increment();
                    System.out.println(
                            Thread.currentThread().getName() + " current count:" + counter.getCount());
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                }
            }
        };
        for (int i = 0; i < 3; i++) {
            new Thread(r).start();
        }
    }
}
