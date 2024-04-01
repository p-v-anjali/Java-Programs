//WAP with nested functions to find the maximum of three numbers. Function1 should take in two arguments and find the maximum. Function2 should take in the third number and the maximum from function1 to find the maximum.)

import java.io.*;
class MaxOfThreeNumbers {
    static int findMax(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }
    static int findMaxOfThree(int num1, int num2, int num3) {
        int maxOfFirstTwo = findMax(num1, num2);
        return findMax(maxOfFirstTwo, num3);
    }
 public static void main(String[] args) {
    try {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter the first number: ");
        int num1 = Integer.parseInt(dis.readLine());
        System.out.print("Enter the second number: ");
        int num2 = Integer.parseInt(dis.readLine());
        System.out.print("Enter the third number: ");
        int num3 = Integer.parseInt(dis.readLine());
        int max = findMaxOfThree(num1, num2, num3);
        System.out.println("Maximum of the three numbers: " + max);
    } 
    catch (Exception e) {
        System.out.println(e);
    }
 }
}