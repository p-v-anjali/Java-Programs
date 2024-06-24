import java.net.*;
import java.io.*;

class ClientU {
    public static void main(String args[]) {
        DatagramSocket ds = null;
        InetAddress shost = null;
        DatagramPacket dp = null, reply = null;
        try {
            ds = new DatagramSocket();
            byte m[] = "Bye".getBytes();
            shost = InetAddress.getByName("localhost");
            dp = new DatagramPacket(m, 3, shost, 1234);
            ds.send(dp);
            byte b[] = new byte[1000];
            reply = new DatagramPacket(b, b.length);
            ds.receive(reply);
            System.out.println("Reply: " + (new String(reply.getData())));
        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        } finally {
            if (ds != null)
                ds.close();
        }
    }
}
