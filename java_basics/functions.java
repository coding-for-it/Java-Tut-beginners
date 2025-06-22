public class functions {

    // 1. Function without parameters and without return value
    // This method prints a message. It's called in main without any arguments.
    public static void printJava() {
        System.out.println("Java is fun!");
    }

    // 2. Function with parameter and no return value
    // Takes a name and prints it
    public static void printName(String name) {
        System.out.println("Name: " + name);
    }

    // 3. Function with parameters and no return value
    // Takes two numbers and prints their sum
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // 4. Function with parameters and return value
    // Returns the square of a number
    public static int square(int number) {
        return number * number;
    }

    // 5. Function with no parameters and a return value
    // Returns a constant number
    public static int getFixedNumber() {
        return 42;
    }

    // 6. Function that returns nothing and takes no parameters
    public static void showMessage() {
        System.out.println("This is a void method. It returns nothing.");
    }

    public static void main(String[] args) {
        // What is a method?
        // A method (or function) is a block of code that performs a specific task.
        // It helps in organizing code, improving readability, and reusing logic.

        // Calling method with no parameters
        printJava();

        // Calling method with a parameter
        printName("Nimisha");
        printName("Swara");

        // Calling method with two parameters
        printSum(1, 6);
        printSum(10, 15);

        // Using a method that returns a value
        int result = square(5);
        System.out.println("Square of 5 is: " + result);

        // Calling method with no parameters that returns a value
        int value = getFixedNumber();
        System.out.println("Fixed number is: " + value);

        // Calling method with no parameters and no return
        showMessage();
    }
}
