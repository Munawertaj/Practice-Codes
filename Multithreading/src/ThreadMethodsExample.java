public class ThreadMethodsExample extends Thread {
    public void run() {
        System.out.println("RUNNING ThreadMethodsExample run method");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted :" + e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("RUNNING ThreadMethodsExample main method");
        ThreadMethodsExample example1 = new ThreadMethodsExample();
        example1.start();
        example1.interrupt();

        ThreadMethodsExample example2 = new ThreadMethodsExample();
        example2.start();
        example2.join();

        System.out.println("Finished");
    }
}
