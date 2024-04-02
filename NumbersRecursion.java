//WAP to display numbers from n to 1 and vice versa, using recursion.

import java.io.*;
 class NumbersRecursion {
 static void displayDescending(int n) {
 if (n >= 1) {
 System.out.print(n + " ");
 displayDescending(n - 1);
 }
 }
 static void displayAscending(int n) {
 if (n >= 1) {
 displayAscending(n - 1);
 System.out.print(n + " ");
 }
 }
 public static void main(String[] args) {
 try {
 DataInputStream dis = new DataInputStream(System.in);
 System.out.print("Enter a number: ");
 int inputNumber = Integer.parseInt(dis.readLine());
 System.out.print("Descending Order: ");
 displayDescending(inputNumber);
 System.out.println(); // Move to the next line
 System.out.print("Ascending Order: ");
 displayAscending(inputNumber);
 System.out.println(); // Move to the next line
 } catch (Exception e) {
 System.out.println(e);
 }
 }
}