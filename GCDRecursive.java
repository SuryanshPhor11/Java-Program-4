// Program 14: Recursive GCD Finder

import java.util.Scanner;

class GCDRecursive {
    // Recursive method to find GCD
    static int gcd(int a, int b) {
        if (b == 0)
            return a;  // Base case
        return gcd(b, a % b);  // Recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);

        sc.close();
    }
}

