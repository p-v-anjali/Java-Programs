//     WAP to implement a function using call by reference to find the square root of a given number.

import java.io.*;
import java.util.*;
import java.lang.Math;

class Num{
	double number;
}

class CallbyRef {
	public void squareroot(Num obj){
		obj.number = Math.sqrt(obj.number);
	}
}

class SquareRoot{
	public static void main(String args[]){
		Num obj1 = new Num();
		CallbyRef obj2 = new CallbyRef();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		obj1.number = s.nextDouble();
		System.out.print("Square root of "+obj1.number+" = ");
		obj2.squareroot(obj1);
		System.out.print(obj1.number);
	}
}