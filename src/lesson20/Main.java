package lesson20;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();

        String name = thread.getName();
        ThreadGroup threadGroup = thread.getThreadGroup();
        ThreadGroup parent = threadGroup.getParent();

        int priority = thread.getPriority();
        Thread.State state = thread.getState();
        boolean alive = thread.isAlive();
        boolean daemon = thread.isDaemon();
        boolean virtual = thread.isVirtual();
        boolean interrupted = thread.isInterrupted();

        thread.join(1);
        thread.run();
//        thread.start();
        thread.interrupt();
        System.out.println();
    }
}
