import java.util.*;
import java.io.*;
import java.net.*;

class tcpfileserver{
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(8085);
        Socket s=ss.accept();
        byte arr[]=new byte[2000];
        FileInputStream fis =new FileInputStream("C:\\Users\\sri ranga\\OneDrive\\Desktop\\test\\ip.txt");
        fis.read(arr,0,10);
        OutputStream os=s.getOutputStream();
        os.write(arr,0,10);
        os.flush();
    }
}