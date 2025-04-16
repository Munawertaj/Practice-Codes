public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Custom RUNNING"); // RUNNING There is not Any RUNNING State implementation
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState()); // NEW

        t1.start();
        System.out.println(t1.getState()); // RUNNABLE

        Thread.sleep(2000);
        System.out.println(t1.getState()); // TIMED_WAITING
        t1.join();

        System.out.println(t1.getState()); // TERMINATED
    }
}