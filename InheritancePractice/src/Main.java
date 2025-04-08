public class Main {
    public static void main(String[] args) {

        BoxWeight box = new BoxWeight(3.0, 4.0, 5.0, 20.0);

//        System.out.println("Box length is: " + box.length);
//        System.out.println("Box width is: " + box.width);
//        System.out.println("Box height is: " + box.height);
//        System.out.println("Box weight is: " + box.weight);

//        Box box1 = new BoxWeight(3.0, 4.0, 5.0, 20.0);
//        System.out.println("Box1 length is: " + box1.length);
//        System.out.println("Box1 width is: " + box1.width);
//        System.out.println("Box1 height is: " + box1.height);
//        System.out.println("Box1 weight is: " + box1.weight); // Not possible because which one to access it depends on reference variable not on which type of object created

//        Box box2 = new Box(3.0, 4.0, 5.0);
//        System.out.println("Box2 weight is: " + box2.weight); // Not possible becuase parent don't know anything about child class properties

        Box boxWithColor = new BoxWeight(3.0, 4.0, 5.0, 20, "White");
    }
}
