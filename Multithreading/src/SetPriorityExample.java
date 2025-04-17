public class SetPriorityExample extends Thread {
    public SetPriorityExample(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread is Running...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        SetPriorityExample lower = new SetPriorityExample("Low Priority Thread");
        SetPriorityExample medium = new SetPriorityExample("Medium Priority Thread");
        SetPriorityExample higher = new SetPriorityExample("High Priority Thread");

        lower.setPriority(Thread.MIN_PRIORITY);
        medium.setPriority(Thread.NORM_PRIORITY);
        higher.setPriority(Thread.MAX_PRIORITY);
        lower.start();
        medium.start();
        higher.start();

    }
}
