import java.awt.*;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(double length, double width, double height, double weight) {
//        System.out.println("BoxWeight constructor started"); // Not possible becuase first statement is to call the parent constructor

//        super(length, width, height);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    BoxWeight(double length, double width, double height, double weight, String color) {
        this.weight = weight;
    }

    BoxWeight(BoxWeight box) {
        super(box);
    }
}
