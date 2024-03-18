//WAP with two functions to check for an integer palindrome. (Function1 should reverse the integer. Function2 should return 1,if it is a palindrome or else 0.)

import java.io.*;
class PalindromeDemo{
    public static void main(String args[]){
        int num;
        try{
            DataInputStream din = new DataInputStream(System.in);
            System.out.println("Enter number");
            num=Integer.parseInt(din.readLine());
            
            if(isPalindrome(num)){
                System.out.println("The number "+num+" is Palindrome");
            }
            else{
                System.out.println("The number "+num+" is not Palindrome");
            }
        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }
    }

public static int reverseNumber(int num){
    int reverse = 0,digit;
    while(num != 0){
        digit = num%10;
        reverse = reverse * 10 + digit;
        num/=10;
    }
    return reverse;
}

public static boolean isPalindrome(int num){
    int reverse;
    reverse =reverseNumber(num);
    return num == reverse;
}
}