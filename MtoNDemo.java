//WAP to display numbers from m to n using single while loop.

import java.io.*;
public class MtoNDemo{
	public static void main(String Args[]){
		int m,n;
		DataInputStream din = new DataInputStream(System.in);
		try{
			System.out.println("Enter value for m");
			m=Integer.parseInt(din.readLine());
			
			System.out.println("Enter value for n");
			n=Integer.parseInt(din.readLine());
			
			System.out.println("Numbers from "+m+" to "+n );
			while(m<=n){
				System.out.println(m);
				m++;
			}
		}
		catch(Exception e){
			System.out.println("Error :"+e);
		}
	}
}