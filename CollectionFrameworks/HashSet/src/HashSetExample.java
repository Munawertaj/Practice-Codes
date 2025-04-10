import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate
        set.add(null);  // Null value allows

        System.out.println(set); // Order is not guaranteed

        System.out.println("Contains 'Banana'? " + set.contains("Banana"));

        set.remove("Orange");
        System.out.println("After removal: " + set);

        for (String s : set) {
            System.out.println(s);
        }

        // OR using Iterator
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Student s1 = new Student(1, "Mamun");
        Student s2 = new Student(1, "Mamun");
        Student s3 = new Student(2, "Taj");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        HashSet<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        try {
            students.add(s1);   // Trying to add duplicates
        } catch (Exception e) {
            System.out.println("Not allowed");
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
