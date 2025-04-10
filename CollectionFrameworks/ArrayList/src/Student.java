public class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Student s = (Student) o;
        return this.id == s.id && this.name.equals(s.name);
    }

    public String toString() {
        return id + ": " + name;
    }
}