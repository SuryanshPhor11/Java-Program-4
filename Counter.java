// Program 6: Counter using Static Variable

class Counter {
    static int count = 0;  // static variable shared among all objects

    Counter() {
        count++;  // increment when an object is created
        System.out.println("Object created. Total count: " + count);
    }

    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
    }
}

