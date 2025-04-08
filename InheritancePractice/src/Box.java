public class Box {
    double length;
    double width;
    double height;
    private String color;

    Box() {
        System.out.println("Box default constructor called");
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
        this.color = null;
    }

    Box(double length, double width, double height) {
        System.out.println("Box constructor with length, height and width called");
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(double length, double width, double height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    Box(Box box) {
        System.out.println("Box constructor with box type object is called");
        this.length = box.length;
        this.width = box.width;
        this.height = box.height;
    }
}
