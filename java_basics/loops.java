import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // for - Repeats code a specific number of times
        /*
        for (initialization; condition; update) {
        // code to repeat
        }
        */
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello " + i);
        }
        
        /* 
        //while -  Repeats as long as the condition is true
        while (condition) {
        // code to repeat
        }
        */
        int j = 1;
        while (j <= 5) {
            System.out.println("Number: " + j);
            j++;
        }
        
        /* 
        // do while - Runs the code block at least once, even if the condition is false.
        do {
        // code to repeat
        } while (condition);
        */
        int k = 1;
        do {
            System.out.println("Hi " + k);
            k++;
        } while (k <= 5);
        

        //excercise
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt(); // ✅ update num inside loop
            System.out.println("Here is your number: " + num);
        } while (num >= 0);

        System.out.println("The end.");
        sc.close();
    }
         
    
}
