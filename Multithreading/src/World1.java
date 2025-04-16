public class World1 extends Thread {
    @Override
    public void run() {
        System.out.println("Inside World1 Class");
        System.out.println(Thread.currentThread().getName());

//        for (; ;) {
//            System.out.println("World1");
//        }
    }
}
