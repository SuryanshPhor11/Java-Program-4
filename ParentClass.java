class ParentClass {
    public static void main(String[] args) {
        System.out.println("This is the Parent Class");
    }
    protected String message = "Hello from Parent";

    protected void showMessage() {
        System.out.println(message);
    }
}

class ChildClass extends ParentClass {
    void display() {
        // Accessing protected member from parent
        showMessage();
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.display();
    }
}
