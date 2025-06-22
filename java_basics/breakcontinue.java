public class breakcontinue {
    public static void main(String[] args) {
        // break - Exits the loop immediately
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Exit the loop when i is 6
            }
            System.out.println("Current number: " + i);
        }

        // continue - Skips the current iteration and continues with the next one
        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("Odd number: " + j);
        }
    }
}
