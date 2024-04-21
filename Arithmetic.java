import java.util.*;
public class Arithmetic {
    public static void main(String[] args) {
        int a,b,sum=0,diff=0,mult=0,div=0;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter 1st number");
            a=sc.nextInt();
            System.out.println("Enter 2nd number");
            b=sc.nextInt();
            sum=a+b;
            diff=a-b;
            mult=a*b;
            div=a/b;
            System.out.println("Sum :"+sum);
            System.out.println("Difference :"+diff);
            System.out.println("Multiplication:"+mult);
            System.out.println("Division :"+div);
        }
        catch(Exception e){
            System.out.println("Error :"+e);  
        }
    }
}  

