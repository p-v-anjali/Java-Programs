
import java.io.*;
public class Array
{
	public static void main(String[] args) {
    	int a[][],r,c,i,j;
    	DataInputStream din = new DataInputStream(System.in);
    	try {
    	    System.out.println("Ente the no of rows and columns");
    	    r = Integer.parseInt(din.readLine());
    	    c = Integer.parseInt(din.readLine());
    	    a = new int[r][c];
    	    for(i = 0;i < r;i++)
    	    {
    	        for(j = 0;j < c;j++)
    	        {
    	            System.out.println("Enter a[" + i + "][" + j + "]");
    	            a[i][j] = Integer.parseInt(din.readLine());
    	        }
    	    }
    	    for(i=0;i < r;i++)
    	    {
    	        for(j = 0;j < c;j++)
    	        {
    	            System.out.print(a[i][j] + "\t");
    	        }
    	        System.out.println("");
    	    }
    	} catch(Exception e) {
    	}
	}
}