public class Main {
    public static void main(String[] args) {

//        Shape circle = new Circle(3.0);
//        circle.displayInfo();

        Shape[] shapes = {
                new Circle(3.0),
                new Rectangle(4.0, 5.0),
                new Triangle(6.0, 4.0)
        };

        for (Shape shape : shapes) {
            shape.displayInfo();
        }
    }
}