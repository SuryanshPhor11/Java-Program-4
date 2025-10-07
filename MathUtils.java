// Program 8: MathUtils Utility Class

class MathUtils {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + MathUtils.add(5, 3));
        System.out.println("Subtraction: " + MathUtils.subtract(10, 4));
        System.out.println("Multiplication: " + MathUtils.multiply(6, 7));
        System.out.println("Division: " + MathUtils.divide(20, 5));
    }
}

