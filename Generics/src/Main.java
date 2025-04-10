public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();

        box.setValue(1);
        System.out.println(box.getValue());

        Pair<String, String> pair = new Pair<>("Name", "Taj");
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());

        Pair<String, Integer> pair2 = new Pair<>("Id", 1);
        System.out.println("Key: " + pair2.getKey());
        System.out.println("Value: " + pair2.getValue());

        Test<Integer> test = new Test<>(1);
        Test<Integer> test2 = new Test<>(2.0);
        Test<Integer> test3 = new Test<>(2.0f);
        Test<Integer> test4 = new Test<>("String");
    }
}
