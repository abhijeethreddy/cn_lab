import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class tcpfileclint {
    public static void main(String[] args) throws Exception {
       Socket s=new Socket("localhost",8085);
       byte arr[]=new byte[2000];
       InputStream is=s.getInputStream();
       is.read(arr,0,10);
       FileOutputStream fis=new FileOutputStream("C:\\Users\\sri ranga\\OneDrive\\Desktop\\test\\op.txt");
       fis.write(arr,0,10);

    }
}
