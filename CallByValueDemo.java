    //WAP to implement a function using call by value to swap two float numbers.

import java.io.*;
import java.util.*;

class CallbyVal {
	public void swap(float a, float b){
		float temp;
		System.out.println("Before Swapping a ="+a+", b ="+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping a ="+a+", b ="+b);
	}
}

class CallByValueDemo{
	public static void main(String args[]){
		CallbyVal obj = new CallbyVal();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter values for a and b");
		float a = s.nextFloat();
		float b = s.nextFloat();
		obj.swap(a, b);
	}
}