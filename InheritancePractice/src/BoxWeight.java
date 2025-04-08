public class BoxWeight extends Box {
    double weight;

    BoxWeight(double length, double width, double height, double weight) {
//        System.out.println("BoxWeight constructor started"); // Not possible becuase first statement is to call the parent constructor

        super(length, width, height);
        this.weight = weight;
    }
}
