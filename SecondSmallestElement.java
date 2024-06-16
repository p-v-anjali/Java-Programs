import java.util.*;
public class SecondElement{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]){
        System.out.println("Enter size of string");
        int n=sc.nextInt();
        System.out.println("Enter "+n+"elements");;
        int array[]=new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        for(int i = 0; i<n; i++ ){
            for(int j = i+1; j<n; j++){
               if(array[i]>array[j]){
                  int 
                  temp = array[i];
                  array[i] = array[j];
                  array[j] = temp;
               }
            }
         }
  
    System.out.println("Second Smallest Element"+array[1]);
    }
}

