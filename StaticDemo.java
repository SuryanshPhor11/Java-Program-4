class StaticDemo {
    private static int count = 0;

    public static void increment() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        StaticDemo.increment();
        StaticDemo.increment();
        StaticDemo.displayCount();  // Output: 2
    }
}

