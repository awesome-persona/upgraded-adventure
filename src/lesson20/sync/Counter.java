package lesson20.sync;

public class Counter {

    private volatile int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }

    public synchronized int getCount() {
        return count;
    }
}
