import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

import javax.xml.crypto.Data;

import java.io.*;

public class udpfileclint {
    public static void main(String[] args) throws Exception  {
        DatagramSocket s=new DatagramSocket(8089);
        byte arr[]=new byte[200];

        DatagramPacket p=new DatagramPacket(arr, 20);

        s.receive(p);
        arr=p.getData();
        String str=new String(p.getData(),0,p.getLength());
        String str2 = new String(arr, StandardCharsets.UTF_8); 
         System.out.println(str2);

        FileOutputStream fis=new FileOutputStream("C:\\Users\\sri ranga\\OneDrive\\Desktop\\test\\opu.txt");
        fis.write(arr,0,20);

    }
}