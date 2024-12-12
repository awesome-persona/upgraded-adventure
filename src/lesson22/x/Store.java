package lesson22.x;

public class Store {

    public static final int DEFAULT_MAX_SIZE = 10;

    private int count;
    private int maxCount = DEFAULT_MAX_SIZE;

    public Store() {
    }

    public Store(int count, int maxCount) {
        this.count = count;
        this.maxCount = maxCount;
    }

    public synchronized void increment() {
        while (count >= maxCount) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.printf("Added 1 item. %d items left in store.\n", count);
        notifyAll();
    }

    public synchronized void decrement() {
        while (count < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        count--;

        System.out.printf("Sold 1 item. %d items left in store.\n", count);
        notifyAll();
    }
}
