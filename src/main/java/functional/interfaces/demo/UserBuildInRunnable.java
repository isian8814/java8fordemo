package functional.interfaces.demo;

/**
 * Created by minchanglong on 12/17/16.
 */
public class UserBuildInRunnable {

    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running Thread 1");
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running Thread 2");
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();

        Runnable r3 = () -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Running Thread 3");
        };
        Runnable r4 = () -> System.out.println("Running Thread 4");

        new Thread(r3).start();
        new Thread(r4).start();
    }
}
