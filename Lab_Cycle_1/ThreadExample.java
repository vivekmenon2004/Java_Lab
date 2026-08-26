class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
                Thread.currentThread().interrupt();
                break;
            }
        }

        System.out.println(threadName + " finished!");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread-A");
        MyThread thread2 = new MyThread("Thread-B");

        thread1.start();
        thread2.start();

        System.out.println("Main thread continues...");
    }
}