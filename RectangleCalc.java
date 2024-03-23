import java.util.*;

class Rectangle {
    double length, width, perimeter, area;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return area = length * width;
    }

    public double perimeter() {
        return perimeter = 2 * (length + width);
    }

    public int sameArea(Rectangle q) {
        if (area == q.area) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class RectangleCalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double l, b;
        try {
            System.out.println("Enter the length and breadth of the 1st rectangle : ");
            l = s.nextDouble();
            b = s.nextDouble();
            Rectangle p = new Rectangle(l, b);
            System.out.println("For 1st rectangle :   Area = " + p.area() + " Perimeter = " + p.perimeter());
            System.out.println("Enter the length and breadth of the 2nd rectangle : ");
            l = s.nextDouble();
            b = s.nextDouble();
            Rectangle q = new Rectangle(l, b);
            System.out.println("For 2nd rectangle :   Area = " + q.area() + " Perimeter = " + q.perimeter());
            int similar = p.sameArea(q);
            if (similar == 1) {
                System.out.println("The area of both the rectangles are the same.");
            } else {
                System.out.println("The area of both the rectangles are not the same.");
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
