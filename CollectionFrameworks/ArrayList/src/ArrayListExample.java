import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // Allows duplicates

        System.out.println(fruits); // [Apple, Banana, Mango, Apple]

        System.out.println("First fruit: " + fruits.get(0)); // Apple

        fruits.set(1, "Orange"); // Replace at index
        fruits.remove("Mango");  // Remove by value

        System.out.println(fruits); // [Apple, Orange, Apple]

        System.out.println("Size: " + fruits.size());
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));

        // Using for-each loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Using Iterator
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // -------- Custom ArrayList -------
        System.out.println("CUSTOM ArrayList: ");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Mamun"));
        students.add(new Student(2, "Taj"));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
