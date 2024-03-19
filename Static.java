class c1 {
    public static void disp() {
        System.out.println("In disp c1 ");
    }
}

class c2 {
    public static void disp() {
        System.out.println("In  disp c2");
    }
}

public class Static {
    public static void disp() {
        System.out.println("In Main disp");
    }

    public static void main(String[] args) {
        disp();
        c1.disp();
        c2.disp();
        
    }
}