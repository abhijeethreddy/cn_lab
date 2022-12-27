import java.io.*;
import java.net.*;
public class serverSocket {
    public static void main(String[] args)throws IOException {
        ServerSocket ss=new ServerSocket(6666);
        System.out.println("Establishing Connection..");
        Socket s=ss.accept();
        DataInputStream rst=new DataInputStream(s.getInputStream());
        String rs=rst.readUTF();
        StringBuilder rss=new StringBuilder(rs);
        System.out.println("Established Connection");
        System.out.println("Reversing String..");
        rss.reverse();
        System.out.println("Sending Reversed String...");
        DataOutputStream dst=new DataOutputStream(s.getOutputStream());
        dst.writeUTF(rss.toString());
        dst.flush();
        dst.close();
        rst.close();
        ss.close();
    }
}
