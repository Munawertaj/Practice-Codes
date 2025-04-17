package threading;

public class YieldExample extends Thread {
    public YieldExample(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running...");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YieldExample t1 = new YieldExample("Thread1");
        YieldExample t2 = new YieldExample("Thread2");

        t1.start();
        t2.start();
    }
}
