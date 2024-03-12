//super

import java.io.*;
import java.io.*;
class Person
{
	int age;
	String name;
	public void read() {
		DataInputStream din = new DataInputStream(System.in);
		try {
			System.out.println("Enter name and age");
			name = din.readLine();
			age =Integer.parseInt(din.readLine());
		}
	
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public void disp(){
		System.out.println("Name :"+name+"Age:"+age);
	}
	
}
class Teacher extends Person{
	String sub;
	public void read(){
		super.read();
		DataInputStream din = DataInputStream(System.in);
		try{
			System.out.println("Enter subj");
			sub=din.readLine();
		}
		catch(Exception e){
		System.out.println(e);
		}
	public void disp(){
		System.out.println("Name :"+name+ "Age:"+age+ "sub :"+sub);
	}
	}
}
	
public class Super
	{
	public static void main(String args[])
	{
		Person p;
		Teacher t;
		p=new Person();
		t= new Teacher();
		p.read();
		p.disp();
		t.read();
		t.read();
		t.disp();
	
	}
}