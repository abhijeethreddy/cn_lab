import java.net.*;
import java.io.*;
import java.util.Scanner;
public class clientDatagram{
    
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        DatagramSocket s =new DatagramSocket();
        InetAddress add=InetAddress.getByName("localhost");
        System.out.println("enter String:");
        String rs=sc.nextLine();
        byte[] b=rs.getBytes();
        DatagramPacket msg=new DatagramPacket(b, b.length, add, 6666);
        s.send(msg);
        byte[] a=new byte[1024];
        msg=new DatagramPacket(a, 1024);
        s.receive(msg);
        String rss=new String(a,0,1024);
        System.out.println(rss);
        s.close();
        sc.close();
    }
}
