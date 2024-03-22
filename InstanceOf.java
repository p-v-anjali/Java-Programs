import java.io.*;
interface Ishape {
    public void disp();
}

class C1 implements Ishape{
  public void disp() {
        System.out.println("In c1");
    }
}

class C2 implements Ishape{
public void disp() {
        System.out.println("In c1");
    }
}

public class InstanceOf{
	public static void main(String[] args) {
		Ishape obj[] = new Ishape[3];
		obj[0] = new C1();
        	obj[1] = new C2();
        	obj[2] = new C1();
		
		for (int i = 0; i < 3; i++) {
			if (obj[i] instanceof C1) {
                		C1 p = (C1) obj[i];
                		p.disp();
			}
			
			else if (obj[i] instanceof C2) {
                		C2 q = (C2) obj[i];
                		q.disp();
           		 }
		}
	}
}