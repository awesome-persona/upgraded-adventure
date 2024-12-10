package lesson20;

public class SomeThread extends Thread {

    @Override
    public void run() {
        System.out.println("hello");
        ThreadUtil.getThreadInfo();
    }
}
