package server;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 * Created by Dr.Wen on 2017/5/20.
 */
public class EchoServer {
    public static void main(String[] args) throws IOException{
        ServerSocket s = new ServerSocket(8189);
        Socket incoming = s.accept();

        InputStream inStream = incoming.getInputStream();
        OutputStream outStream = incoming.getOutputStream();

        Scanner in = new Scanner(inStream);
        PrintWriter out = new PrintWriter(outStream,true);

        out.println("Enter BYE to exit.");
        boolean done = true;
        while (done && in.hasNextLine()){
            String line = in.nextLine();
            out.println("Echo:"+line);
            if (line.trim().equals("BYE")) done = false;
        }
    }
}
