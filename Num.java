import java.util.*;
public class Num {
   public static void main(String[] args)
   {
    int num;
    Scanner sc = new Scanner(System.in);
    try{
        System.out.println("Enter a number");
        num=sc.nextInt();
        if(num == 0)
        {
            System.out.println("Number is zero");  
        }
        else if(num > 0){
            System.out.println("Number is Positive");  
        }
        else{
            System.out.println("Number is Negative"); 
        }
    }
    catch(Exception e){
        System.out.println("Error :"+e);  
    }

   } 
}
