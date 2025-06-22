public class casting {

    public static void main(String[] args) {

        // --- WIDENING CASTING (Automatic) ---
        // int to double (small to big)
        int myInt = 10;
        double myDouble = myInt;  // Java does it automatically

        System.out.println("Widening Casting:");
        System.out.println("int value: " + myInt);
        System.out.println("Converted to double: " + myDouble);


        // --- NARROWING CASTING (Manual) ---
        // double to int (big to small)
        double price = 99.99;
        int roundedPrice = (int) price;  // manual casting, cuts off decimals

        System.out.println("\nNarrowing Casting:");
        System.out.println("double value: " + price);
        System.out.println("Converted to int: " + roundedPrice);


        // --- CHAR to int ---
        char letter = 'A';
        int asciiValue = letter;  // automatic casting from char to int

        System.out.println("\nChar to Int Casting:");
        System.out.println("Char: " + letter);
        System.out.println("ASCII value of char: " + asciiValue);


        // --- int to char ---
        int number = 66;
        char character = (char) number;  // manual casting from int to char

        System.out.println("\nInt to Char Casting:");
        System.out.println("Int: " + number);
        System.out.println("Converted to Char: " + character);
    }
}
