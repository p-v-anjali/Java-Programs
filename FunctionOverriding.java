import java.io.*;

class person {
    int age;
    String name;

    public void read() {
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

    public void disp() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

class teacher extends person {

    String sub;

    public void read() {
        // to fix super.read();
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.println("Enter Sub: ");
            sub = din.readLine();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    public void disp() {
        // to fix super.disp();
        System.out.println("Subject: " + sub);
    }
}

public class FuncOverRiding {
    public static void main(String[] args) {
        person p = new person();
        teacher t = new teacher();
        p.read();
        t.read();
        p.disp();
        t.disp();

    }
}