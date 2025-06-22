public class operators {

    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 15, b = 4;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b)); // Integer division
        System.out.println("Modulus (a % b): " + (a % b));
        System.out.println();

        // 2. Assignment Operators
        int c = 10;
        System.out.println("Assignment Operators:");
        c += 5;  // c = c + 5
        System.out.println("c += 5 : " + c);
        c -= 3;  // c = c - 3
        System.out.println("c -= 3 : " + c);
        c *= 2;  // c = c * 2
        System.out.println("c *= 2 : " + c);
        c /= 4;  // c = c / 4
        System.out.println("c /= 4 : " + c);
        c %= 3;  // c = c % 3
        System.out.println("c %= 3 : " + c);
        System.out.println();

        // 3. Unary Operators
        int d = 5;
        System.out.println("Unary Operators:");
        System.out.println("Initial value: " + d);
        System.out.println("Post-increment (d++): " + (d++)); // prints 5, then d becomes 6
        System.out.println("After post-increment: " + d);
        System.out.println("Pre-increment (++d): " + (++d)); // d becomes 7, then prints 7
        System.out.println("Post-decrement (d--): " + (d--)); // prints 7, then d becomes 6
        System.out.println("After post-decrement: " + d);
        System.out.println("Pre-decrement (--d): " + (--d)); // d becomes 5, then prints 5
        System.out.println("Unary minus (-d): " + (-d));
        System.out.println();

        // 4. Relational (Comparison) Operators
        int x = 10, y = 20;
        System.out.println("Relational Operators:");
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println();

        // 5. Logical Operators
        boolean p = true, q = false;
        System.out.println("Logical Operators:");
        System.out.println("p && q: " + (p && q)); // AND
        System.out.println("p || q: " + (p || q)); // OR
        System.out.println("!p: " + (!p));         // NOT
        System.out.println();

        // 6. Bitwise Operators
        int m = 5, n = 3; // 5 = 0101, 3 = 0011
        System.out.println("Bitwise Operators:");
        System.out.println("m & n: " + (m & n));  // AND
        System.out.println("m | n: " + (m | n));  // OR
        System.out.println("m ^ n: " + (m ^ n));  // XOR
        System.out.println("~m: " + (~m));        // NOT
        System.out.println("m << 1: " + (m << 1)); // Left shift
        System.out.println("m >> 1: " + (m >> 1)); // Right shift
        System.out.println();

        // 7. Ternary Operator
        int age = 18;
        String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Ternary Operator:");
        System.out.println("Result: " + result);
    }
}
