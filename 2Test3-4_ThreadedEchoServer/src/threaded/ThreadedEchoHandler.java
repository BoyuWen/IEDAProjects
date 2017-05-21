package threaded;

import java.io.*;
import java.net.Socket;
import java.util.*;

/**
 * Created by Dr.Wen on 2017/5/20.
 */
public class ThreadedEchoHandler implements Runnable {
    private Socket incoming;

    public ThreadedEchoHandler(Socket i){
        incoming = i;
    }
    @Override
    public void run() {
        try{
            try{
                InputStream inStream = incoming.getInputStream();
                OutputStream outStream = incoming.getOutputStream();

                Scanner in = new Scanner(inStream);
                PrintWriter out = new PrintWriter(outStream,true);

                boolean done = true;
                while (done && in.hasNextLine()){
                    String line = in.nextLine();
                    System.out.println("Echo:"+line);
                    if (line.trim().equals("BYE")) done = false;
                }
            }
            finally{
                incoming.close();
            }
        }catch(IOException e){}
    }
}
