public class World2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside World2 Class");
        System.out.println(Thread.currentThread().getName());

//        while (true) {
//            System.out.println("World2");
//        }
    }
}
