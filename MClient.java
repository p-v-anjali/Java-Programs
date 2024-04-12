import java.io.*;
import java.net.*;
class MClient
{
	public static void main(String args[])
	{
		Socket cs;
		DataOutputStream sout;
		DataInputStream sin,din;

		try
		{
			din = new DataInputStream(System.in);
			cs = new Socket("localhost",1234);
			sin = new DataInputStream(cs.getInputStream());
			sout = new DataOutputStream(cs.getOutputStream());
			String str = "";
			for(;;)
			{
				str = sin.readUTF();
				System.out.println(str);
				System.out.println("Enter data/quit to terminate");
				str = din.readLine();	
				sout.writeUTF(str);
				if(str.equals("quit"))
					break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}