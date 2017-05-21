package threaded;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Dr.Wen on 2017/5/20.
 */
public class ThreadedEchoServer{ //多客户端服务如何停止？
    public static void main(String[] args){
        try{
            ServerSocket s = new ServerSocket(8191);
            int i = 0;
            while (true){
                Socket incoming = s.accept();
                System.out.println("Spawing "+i);
                Runnable r = new ThreadedEchoHandler(incoming);
                new Thread(r).start();
                i++;
            }
        }catch (IOException e){}

    }
}
