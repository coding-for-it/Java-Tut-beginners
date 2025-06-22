public class mathclass {

    public static void main(String[] args) {

        // Math methods
        System.out.println("Minimum of 5 and 6: " + Math.min(5, 6));
        System.out.println("Maximum of 5 and 6: " + Math.max(5, 6));
        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("Power (2^3): " + Math.pow(2, 3));
        System.out.println("Absolute value of -10: " + Math.abs(-10));//Returns the absolute (positive) value of x
        System.out.println("Ceiling of 4.3: " + Math.ceil(4.3));//Rounds x up to the nearest whole number
        System.out.println("Floor of 4.7: " + Math.floor(4.7));//Rounds x down to the nearest whole number
        System.out.println("Round of 4.6: " + Math.round(4.6));//Rounds x to the nearest whole number
        System.out.println();

        // Generating a random number between 0 and 99
        int randomNum = (int)(Math.random() * 100);
        System.out.println("Random number (0–99): " + randomNum);
    }
}
