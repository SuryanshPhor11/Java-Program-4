// Program 15: Varargs Example with Strings

class VarargsExample {
    // Method that accepts any number of string arguments
    static void printStrings(String... words) {
        System.out.println("You entered " + words.length + " strings:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        // Calling with different numbers of arguments
        printStrings("Java", "Python", "C++");
        System.out.println();
        printStrings("Hello", "World");
        System.out.println();
        printStrings("SingleArgument");
    }
}

