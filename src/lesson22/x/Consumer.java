package lesson22.x;

public class Consumer implements Runnable {

    private Store store;
    private int count;

    public Consumer(Store store, int count) {
        this.store = store;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            store.decrement();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
