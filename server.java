import java.io.*;
import java.util.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        ServerSocket ss;
        Socket as;
        DataInputStream sin;
        DataOutputStream sout;
        Scanner s = new Scanner(System.in);
        try {
            ss = new ServerSocket(1234);
            as = ss.accept();
            System.out.println("welcome client ..");
            sin = new DataInputStream(as.getInputStream());
            sout = new DataOutputStream(as.getOutputStream());
            String recevied;
            String send;
            while (true) {
                recevied = sin.readUTF();
                System.out.println("client says " + recevied);
                if (recevied == ("quit")) {
                    System.out.println("client is closing");
                    break;
                }
                System.out.println("Server ");
                send = s.nextLine();
                sout.writeUTF(send);
                if (send == ("quit")) {
                    System.out.println("server is stopping");
                    break;
                }
            }
            sin.close();
            sout.close();
            s.close();
            as.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
