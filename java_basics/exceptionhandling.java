//import java.util.InputMismatchException;
//import java.util.Scanner;

public class exceptionhandling {
    public static void main(String[] args) {

        /*
         * What is Exception Handling?
           Exception = an unexpected error during program execution.
           Exception Handling = writing code to catch and handle those errors instead of crashing the program.
         */

        //try-catch
        int[] marks = {97,98,95};//array of 3 elements[idx-0,1,2]
        try{
            //code that might throw an exception
            /*This is the protected block where we put code that might cause an error.
            Java tries to run this block, but if an error happens, it jumps to catch.*/

            System.out.println(marks[5]);//invalid index, will throw an exception
        }
        catch(Exception exception){
            //do something after catching the exception
            /*This block catches the error, so the program doesn't crash.
            You can print or handle the error here. */
            
            System.out.println("Oops! Something went wrong.");
            System.out.println("Error: " + exception);

        }
        System.out.println("the student name is nimisha");
/*
        // 1. ArithmeticException: Divide by zero
        System.out.println("ArithmeticException Example:");
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        System.out.println();

        // 2. ArrayIndexOutOfBoundsException
        System.out.println("ArrayIndexOutOfBoundsException Example:");
        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of range!");
        }

        System.out.println();

        // 3. Finally block demonstration
        System.out.println("Finally Block Example:");
        try {
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an error.");
        } finally {
            System.out.println("Finally block always runs.");
        }

        System.out.println();

        // 4. InputMismatchException with Scanner
        System.out.println("InputMismatchException Example:");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = sc.nextInt(); // Will throw exception if input is not an int
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number!");
        }

        sc.close();

        System.out.println();
        System.out.println("Program ended successfully.");
*/
    }
}
