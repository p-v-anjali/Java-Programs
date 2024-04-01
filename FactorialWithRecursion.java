//WAP to find the factorial of n, using recursion.

import java.io.*;
class FactorialWithRecursion {
 static int factorial(int n) {
 if (n == 0 || n == 1) {
    return 1;
 } 
 else {
    return n * factorial(n - 1);
    }
 }
 public static void main(String[] args) {
    try {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter a number : ");
        int inputNumber = Integer.parseInt(dis.readLine());
        int result = factorial(inputNumber);
        System.out.println("Factorial of " + inputNumber + " is: " + result);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}