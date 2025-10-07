// Program 7: Static Block Initialization

class StaticBlockExample {
    static int value;

    // static block executes once when class loads
    static {
        value = 100;
        System.out.println("Static block executed! Value initialized to " + value);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
        System.out.println("Value = " + value);
    }
}

