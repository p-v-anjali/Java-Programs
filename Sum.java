//WAP to find the sum of 1+2/2!+3/3!+4/4!++n/n! using a single for loop.

  import java.io.*;
  public class FactorialSum{
    public static void main(String args[]){
      
      int n;
      double sum=0,fact = 1;
      
      DataInputStream din = new DataInputStream(System.in);
      
      try{
        System.out.println("Enter value for n :");
        n=Integer.parseInt(din.readLine());

        for(int i=1;i<=n;++i){
          fact = fact * i;
          sum = sum + i/fact;
        }

        System.out.println("Sum = "+sum);
      }
      catch(Exception e)
      {
        System.out.println("Error :"+e);
      }
    }
  }