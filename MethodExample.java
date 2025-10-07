// Program 9: Static and Non-static Method Calls (Updated)

class MethodExample {
    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Non-static (instance) method
    void instanceMethod() {
        System.out.println("This is a non-static (instance) method.");
    }

    public static void main(String[] args) {
        // Calling static method directly using class name
        MethodExample.staticMethod();

        // Creating an object to call the non-static method
        MethodExample obj = new MethodExample();
        obj.instanceMethod();
    }
}

