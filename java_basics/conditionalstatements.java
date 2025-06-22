import java.util.Scanner;

public class conditionalstatements {
    public static void main(String[] args) {
        /*boolean isRaining = true;
        if(isRaining) {
            System.out.println("It's raining, take an umbrella.");
        } else {
            System.out.println("It's not raining, no umbrella needed.");
        }*/

        /*int age = 20;
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age < 65) { //&& is used for logical AND(logical operator)
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }*/

        //logical operators
        // && (AND), || (OR), ! (NOT)
        /*int a = 30;
        int b = 70;
        if(a < 50 || b < 50) {//atleast one is less than 50
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }*/

        /*boolean isWeekend = false;
        if (!isWeekend) {
            System.out.println("It's a weekday, back to work.");
        } else {
            System.out.println("It's the weekend, time to relax!");
        }*/

        /*Scanner sc = new Scanner(System.in);

        // Prices: pen = ₹10, notebook = ₹40
        System.out.print("Enter your cash amount: ");
        int cash = sc.nextInt();

        if (cash < 10) {
            System.out.println("You don't have enough cash to buy a pen.");
        } else if (cash >= 10 && cash < 40) {
            System.out.println("You can buy a pen but not a notebook.");
        } else if (cash >= 40 && cash < 50) {
            System.out.println("You can buy a notebook and a pen.");
        } else {
            System.out.println("You can buy both a pen and a notebook.");
        }

        sc.close(); // Always close the scanner*/

        //switch statement
        //int day=3;
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
        int day = sc.nextInt();  // ✅ Reading user input

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }

        sc.close();  // ✅ Good practice to close Scanner
    }
}
