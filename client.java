import java.io.*;
import java.util.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        Socket cs;
        DataInputStream sin;
        DataOutputStream sout;
        Scanner s = new Scanner(System.in);
        try {
            cs = new Socket("localhost", 1234);
            System.out.println("Connected to the server ");
            sin = new DataInputStream(cs.getInputStream());
            sout = new DataOutputStream(cs.getOutputStream());
            String send;
            String received;
            while (true) {
                System.out.println("client ");
                send = s.nextLine();
                sout.writeUTF(send);
                if (send == ("quit")) {
                    System.out.println("Client is closing");
                    break;
                }
                received = sin.readUTF();
                if (received == ("quit")) {
                    System.out.println("server is stopping");
                    break;
                }

            }
            cs.close();
            sin.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

