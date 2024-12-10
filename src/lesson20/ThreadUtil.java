package lesson20;

public class ThreadUtil {


    public static void getThreadInfo() {
        Thread thread = Thread.currentThread();
        System.out.printf(
                """
                ---------------------------------
                name: %s; priority: %s; state: %s
                ---------------------------------
                """, thread.getName(), thread.getPriority(), thread.getState());
    }
}
