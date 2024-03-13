 //WAP to find the sum of the series 1+(1+2)+(1+2+3)+............ +(1+2+3+…+n) using a single while loop.

import java.io.*;
public class SumOfSeries{
	public static void main(String Args[]){
		int n,i = 1,sum = 0,tempsum = 0;
		DataInputStream din = new DataInputStream(System.in);
		try{
			System.out.println("Enter value for n");
			n=Integer.parseInt(din.readLine());
			while(i<=n){
				tempsum=tempsum + i;
				sum = sum + tempsum;
				i++;
			}
			System.out.println("Sum  of Series=  "+sum);
		}
		catch(Exception e){
			System.out.println("Error : "+e);
		}
	}
}