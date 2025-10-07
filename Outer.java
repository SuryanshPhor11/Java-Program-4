// Program 11: Static Nested Class Example

class Outer {
    // Static nested class
    static class Inner {
        void display() {
            System.out.println("Inside the static nested class Inner.");
        }
    }

    public static void main(String[] args) {
        // Instantiate the static nested class
        Outer.Inner innerObject = new Outer.Inner();
        innerObject.display();
    }
}

