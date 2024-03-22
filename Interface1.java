import java.io.*;

interface i1 {
    public void disp();
    public void print();
}

class c1 implements i1 {
    public void disp() {
        System.out.println("Interface disp");
    }

    public void print() {
        System.out.println("Interface print");
    }

    public void draw() {
        System.out.println("Not Interface Draw");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        c1 obj = new c1();
        obj.disp();
        obj.print();
        obj.draw();
    }
}