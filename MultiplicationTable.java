import java.util.*;
public class MultiplicationTable {
 
   
    
   public static void main(String[] args){
    try{
        Scanner c = new Scanner(System.in);
        System.out.println("Enter number");
        int num= c.nextInt();
        for(int i=1; i<11;i++){
            int mul=num*i;
            System.out.println(num+"x"+i+"="+mul);
        }
    }
    catch(Exception e){
        System.out.println("Error :"+e);  
    }
}
}
