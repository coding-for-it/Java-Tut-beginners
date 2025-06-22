public class file1 {

    public static void main(String[] args) {

        // Basics
        System.out.println("Hello from file1!");

        // Variables
        String name = "John";
        int age = 30;
        String city = "New York";
        String friend = name;

        // Print variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Friend: " + friend);

        // Types

        // Primitive - simple values are stored directly in memory
        // byte (1 byte) [-128 to 127], short (2 bytes), int (4 bytes), long (8 bytes)
        // float (4 bytes), double (8 bytes), char (2 bytes), boolean (1 byte)

        byte b = 100;                           // 1 byte
        int phone = 1234567890;                // 4 bytes
        long phone2 = 1234567890123456789L;    // 8 bytes
        float pi = 3.14F;                      // 4 bytes
        char initial = 'N';                    // 2 bytes
        boolean isAdult = true;                // 1 byte

        // Print primitive variables
        System.out.println("Byte value: " + b);
        System.out.println("Phone (int): " + phone);
        System.out.println("Phone2 (long): " + phone2);
        System.out.println("Pi (float): " + pi);
        System.out.println("Initial: " + initial);
        System.out.println("Is Adult: " + isAdult);

        // Non-Primitive - objects are stored as references
        String country = "USA";                // reference type

        System.out.println("Country: " + country);
        System.out.println("Country name length: " + country.length());

        //new string
        String newCountry = new String("Canada");
        System.out.println("New Country: " + newCountry);
    }
}
