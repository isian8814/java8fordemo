package a.Interview.Thread;

/**
 * Created by minchanglong on 2/2/17.
 */

class ExtendedThread1 extends Thread {
    int count = 0;

    @Override
    public void run() {
        System.out.println("Extended Thread: " + count);
        count++;
    }
}

class ImplementRunnable1 implements Runnable {
    String threadName;

    public ImplementRunnable1(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
    }
}

public class ThreadVsRunnable1 {

    public static void main(String[] args) throws Exception {
        ExtendedThread1 extendedThread = new ExtendedThread1();
        //extendedThread.start();
        //Thread.sleep(1000); // Waiting for 1 second before starting next thread
        //ExtendedThread1 extendedThread1 = new ExtendedThread1();
        //extendedThread1.start();

        /**
         * If you extend thread, each thread have to new the extendedThread every time
         */
        Thread thread01 = new Thread(extendedThread);
        thread01.start();
        Thread thread02 = new Thread(extendedThread);
        thread02.start();

        /**
         * If you implement runnable interface, multiple thread and share the same runnable
         */
//        ImplementRunnable1 runnable = new ImplementRunnable1("Thread - 1");
//        Thread thread1 = new Thread(runnable, "Thread - 1");
//        thread1.start();
//        Thread thread2 = new Thread(runnable, "Thread - 1");
//        thread2.start();
//        ImplementRunnable1 runnable2 = new ImplementRunnable1("Thread - 2");
//        Thread thread3 = new Thread(runnable2, "Thread - 2");
//        thread3.start();
    }
}
