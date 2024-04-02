//WAP to display even numbers upto ‘n’ using a static function.

import java.io.*;
 class EvenNumber {
 static void displayEvenNumbers(int n) {
 System.out.println("Even numbers up to " + n + ":");
 for (int i = 2; i <= n; i += 2) {
 System.out.print(i + " ");
 }
 System.out.println();
 }
 public static void main(String args[]) {
 try {
 DataInputStream dis = new DataInputStream(System.in);
 System.out.print("Enter a number 'n': ");
 int inputNumber = Integer.parseInt(dis.readLine());
 displayEvenNumbers(inputNumber);
 } catch (Exception e) {
 System.out.println(e);
 }
 }
}