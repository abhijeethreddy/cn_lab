
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class clientSocket {
    public static void main(String[] args)throws UnknownHostException,IOException {
        try (Scanner sc = new Scanner(System.in)) {
            Socket s=new Socket("localhost", 6666);
            DataOutputStream st=new DataOutputStream(s.getOutputStream());
            System.out.print("enter a String :");
            String srr=sc.next();
            st.writeUTF(srr);
            st.flush();
            DataInputStream dst=new DataInputStream(s.getInputStream());
            String rs=dst.readUTF();
            System.out.println("Reversed String is :"+rs);
            dst.close();
            st.close();
            s.close();
        }
        
    }
}
