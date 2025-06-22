public class constants {
    public static void main(String[] args) {
        // Constants in Java
        // Constants are variables whose values cannot be changed once assigned.
        // They are declared using the 'final' keyword.

        final String COUNTRY = "USA";  // Constant string
        final int MAX_AGE = 100;       // Constant integer
        final double PI = 3.14159;     // Constant double

        // Print constants
        System.out.println("Country: " + COUNTRY);
        System.out.println("Max Age: " + MAX_AGE);
        System.out.println("Value of PI: " + PI);

        // Attempting to change a constant will result in a compilation error
        //String COUNTRY = "Canada";  // Error: cannot assign a value to final variable COUNTRY
    }
}
