import java.net.*;
import java.io.*;
public class serverDatagram {
    public static void main(String[] args) throws IOException {
        DatagramSocket ss=new DatagramSocket(6666);
        byte a[]=new byte[1024];
        DatagramPacket msg=new DatagramPacket(a, 1024);
        ss.receive(msg);
        StringBuilder rs=new StringBuilder(new String(a,0,1024));
        rs.reverse();
        byte[] b=rs.toString().getBytes();
        msg=new DatagramPacket(b, b.length,msg.getAddress(),msg.getPort());
        ss.send(msg);
        ss.close();


    }
}
