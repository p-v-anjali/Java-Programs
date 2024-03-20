//inheritence
import java.io.*;

class person {
    int age;
    String name;

    public void readp() {
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.println("Enter Name: ");
            name = din.readLine();
            System.out.println("Enter Age: ");
            age = Integer.parseInt(din.readLine());
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    public void dispp() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

class teacher extends person {

    String sub;

    public void readt() {
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.println("Enter Sub: ");
            sub = din.readLine();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    public void dispt() {
        System.out.println("Subject: " + sub);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        person p = new person();
        teacher t = new teacher();
        p.readp();
        t.readp();
        t.readt();
        p.dispp();
        t.dispp();
        t.dispt();

    }

}