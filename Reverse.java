//WAP to reverse a number (functions with argument and no return type.)

 import java.io.*;
 class ReverseNumber{
    public static void main(String args[]){
        int n;
        DataInputStream din = new DataInputStream(System.in);
        try{
            System.out.println("Enter a number :");
            n = Integer.parseInt(din.readLine());
            reverse(n);
        }
        catch(Exception e){
            System.out.println("Error :"+e);
        }
    }
 public  static void reverse(int num){
        int rev = 0,digit;
        while(num != 0){
           digit = num % 10;
           rev = rev * 10 + digit; 
           num/=10;
        }
       System.out.println("Reversed number: " + rev); 
    }
 }


        