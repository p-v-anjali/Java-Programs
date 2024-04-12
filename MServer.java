import java.io.*;
import java.net.*;

class AClient extends Thread
{
	Socket s;
	DataOutputStream sout;
	DataInputStream sin;		
	public AClient(Socket as)
	{
		try
		{
			s = as;
			sin = new DataInputStream(s.getInputStream());
			sout = new DataOutputStream(s.getOutputStream());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void run()
	{
		try
		{
			String str = "Welcome...";
			for(;;)
			{
				sout.writeUTF("SER:" + str);
				str = sin.readUTF();
				if(str.equals("quit"))
					break;
				System.out.println("Client Says :" + str);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class MServer
{
	public static void main(String args[])
	{
		ServerSocket ss;
		try
		{
			ss = new ServerSocket(1234);
			for(;;)
			{
			System.out.println("Server : Listening...");
			Socket as = ss.accept();
			AClient obj = new AClient(as);
			obj.start();
			System.out.println("Server : Client Connected...");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}