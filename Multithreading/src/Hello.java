public class Hello {
    public static void main(String[] args) {

        World1 w1 = new World1();
        w1.start();

        World2 w2 = new World2();
        Thread t1 = new Thread(w2);
        t1.start();

        for (; ;) {
            System.out.println("Hello");
        }
    }
}
