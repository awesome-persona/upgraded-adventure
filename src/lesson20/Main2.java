package lesson20;

public class Main2 {

    public static void main(String[] args) {
        ThreadUtil.getThreadInfo();
        System.out.println("---");

        Runnable r = () -> {
            ThreadUtil.getThreadInfo();
        };
        Thread thread1 = new Thread(r);


        Thread thread2 = new Thread(r);
        thread1.start();
        thread2.start();

        Thread thread3 = new Thread(r);
        thread3.run();


    }
}
