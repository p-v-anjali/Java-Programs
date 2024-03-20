import java.io.*;
class Cread
{
	public static void main(String args[])
	{
		DataInputStream din = new DataInputStream(System.in);
		try
		{
			String name;
			int age;
			System.out.println("Enter Your name and age");
			name=din.readLine();
			age=Integer.parseInt(din.readLine());
			System.out.println("name="+name);
			System.out.println("age="+age);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}