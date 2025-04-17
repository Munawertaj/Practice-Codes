public class DaemonExample extends Thread {
    public DaemonExample(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello World");
//            System.out.println(Thread.currentThread().getName() + " is running...");
        }
    }

    public static void main(String[] args) {
        DaemonExample daemonThread = new DaemonExample("DaemonThread");
        DaemonExample userThread = new DaemonExample("UserThread");

        daemonThread.setDaemon(true); // It is a daemon thread ( like Garbage collector - won't run infinitely) now

        daemonThread.start();
//        userThread.start(); // It is a user thread and will run infinitely

        System.out.println("Main Done");
    }
}