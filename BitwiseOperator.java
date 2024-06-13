import java.util.Scanner;
public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = s.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = s.nextInt();
        // Bitwise AND (&) operator
        int resultAND = num1 & num2;
        System.out.println("Bitwise AND: " + resultAND);
        // Bitwise OR (|) operator
        int resultOR = num1 | num2;
        System.out.println("Bitwise OR: " + resultOR);
        // Bitwise XOR (^) operator
        int resultXOR = num1 ^ num2;
        System.out.println("Bitwise XOR: " + resultXOR);
        // Left shift (<<) operator
        int leftShifted = num1 << 2;
        System.out.println("Left Shift: " + leftShifted);
        // Right shift (>>) operator
        int rightShifted = num1 >> 2;
        System.out.println("Right Shift: " + rightShifted);
    }
}
