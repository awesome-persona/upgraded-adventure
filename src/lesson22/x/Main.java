package lesson22.x;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{
        Store store = new Store(3, 10);

        List<Runnable> runnables = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Producer producer = new Producer(store, 10);
            runnables.add(producer);
        }

        for (int i = 0; i < 4; i++) {
            Consumer consumer = new Consumer(store, 8);
            runnables.add(consumer);
        }

        runnables.forEach(r -> {
            new Thread(r).start();
        });
    }
}
