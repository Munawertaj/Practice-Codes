public class Main {
    public static void main(String[] args) {

        BoxWeight box = new BoxWeight(3.0, 4.0, 5.0, 20.0);

        System.out.println("Box length is: " + box.length);
        System.out.println("Box width is: " + box.width);
        System.out.println("Box height is: " + box.height);
        System.out.println("Box weight is: " + box.weight);
    }
}
