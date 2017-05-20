package socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Dr.Wen on 2017/5/20.
 */
public class SocketTest {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost",8189);
        InputStream inStream = s.getInputStream();
        Scanner in = new Scanner(inStream);
        System.out.println(in.nextLine());
    }
}
