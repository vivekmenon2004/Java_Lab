class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Worker: " + i);
        }
    }
}

public class RunVsStartDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();

        System.out.println("Main before run()");
        thread1.run();
        System.out.println("Main after run()");

        MyThread thread2 = new MyThread();

        System.out.println("Main before start()");
        thread2.start();
        thread2.join();
        System.out.println("Main after start()");
    }
}