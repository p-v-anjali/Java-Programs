import java.util.*;
import java.io.*;

public class Copyfile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter the name of the source file 1: ");
            String sourceFileName1 = sc.nextLine();
            
            System.out.println("Enter the name of the source file 2: ");
            String sourceFileName2 = sc.nextLine();
            
            System.out.println("Enter the name of the destination file: ");
            String destinationFileName = sc.nextLine();
            
            FileInputStream fin1 = new FileInputStream(sourceFileName1);
            FileInputStream fin2 = new FileInputStream(sourceFileName2);
            FileOutputStream destinationStream = new FileOutputStream(destinationFileName);

            int n;
            while ((n = fin1.read()) != -1) {
                destinationStream.write(n);
            }
          

            while ((n = fin2.read()) != -1) {
                destinationStream.write(n);
            }
            



            System.out.println("Files merged successfully.");
            
            fin1.close();
            fin2.close();
            destinationStream.close();
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }  
}
