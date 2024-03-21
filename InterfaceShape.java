import java.io.*;

interface ishape {
    public void draw();
    public void move();
}

class line implements ishape {
    public void draw() {
        System.out.println("Line is drwan");
    }

    public void move() {
        System.out.println("Line is moved");
    }
}


class circle implements ishape{
    public void draw(){
	System.out.println("Circle is drwan");
    }

    public void move() {
        System.out.println("Circle is moved");
    }
}	
	
public class InterfacesShape {
    public static void main(String[] args) {
        ishape obj = new line();
        obj.draw();
        obj.move();
	obj = new circle();
        obj.draw(); 
	obj.move();
    }
}