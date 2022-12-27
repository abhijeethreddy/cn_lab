import java.net.*;
import java.io.*;

public class udpfileserver {
   
    public static void main(String[] args) throws Exception {
    DatagramSocket s=new DatagramSocket(8083);
    InetAddress recivAddress=InetAddress.getByName("localhost");
    byte arr[]=new byte[20];
    FileInputStream fis=new FileInputStream("C:\\Users\\sri ranga\\OneDrive\\Desktop\\test\\ip.txt");
    fis.read(arr,0,20);

    DatagramPacket p=new DatagramPacket(arr, 20, recivAddress, 8089);
    String str=new String(p.getData());

    System.out.println(str);
    s.send(p);
    }
}