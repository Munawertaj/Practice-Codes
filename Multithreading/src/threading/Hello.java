package threading;

public class Hello {
    public static void main(String[] args) {

        System.out.println("Inside Hello Class");
        System.out.println(Thread.currentThread().getName());

        World1 w1 = new World1();
        w1.start();

        System.out.println(Thread.currentThread().getName());

        World2 w2 = new World2();
        Thread t1 = new Thread(w2);
        t1.start();

        System.out.println(Thread.currentThread().getName());

//        for (; ;) {
//            System.out.println("Hello");
//        }
    }
}
