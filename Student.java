// Program 10: Static vs Instance Variables

class Student {
    static String college = "ABC University";  // shared among all students
    String name;  // unique for each student

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name + ", College: " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.display();
        s2.display();

        // Changing static variable affects all objects
        Student.college = "XYZ Institute";

        s1.display();
        s2.display();
    }
}

