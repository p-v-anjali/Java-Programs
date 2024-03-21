import java.io.*;
class Cthread extends Thread{
    int n;
    public Cthread(int a)
    {
        n=a;

    }
    public void run()
    {
        int i;
        for(i=1;i<=n;i++)
        {
            System.out.print("\ti="+i);
        }
    }
}
class MThread{
    public static void main(String args[]){
        Cthread t1,t2;
        t1=new Cthread(100);
        t2=new Cthread(150);
        System.out.println("B4 thread");import java.io.*;

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
        t1.start();
        System.out.println("between thread");
        t2.start();
        System.out.println("after thread");
    }
}