package lesson22.x;

public class Producer implements Runnable {

    private Store store;
    private int count;

    public Producer(Store store, int count) {
        this.store = store;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            store.increment();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
