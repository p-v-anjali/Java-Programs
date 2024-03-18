//WAP to calculate area of a circle (functions with no argument and no return type.)

import java.io.*;

public class CircleArea {
   public static void main(String args[]){
      int r;
      double area;
      DataInputStream din = new DataInputStream(System.in);
      try{
         System.out.println("Enter Radius of Circle");
         r=Integer.parseInt(din.readLine());
         area= 3.14 * r* r;
         System.out.println("Area of Circle = "+area);
      }
      catch(Exception e){
        System.out.println("Error :"+e);
      }
      }
}