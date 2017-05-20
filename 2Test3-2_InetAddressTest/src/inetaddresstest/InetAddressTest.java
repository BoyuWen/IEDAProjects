package inetaddresstest;

import java.net.*;

/**
 * Created by Dr.Wen on 2017/5/20.
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException{
        if (args.length > 0){
            String host = args[0];
            InetAddress[] addresses = InetAddress.getAllByName(host);
            for (InetAddress a:addresses){
                System.out.println(a);
            }
        }else {
            InetAddress localaddress = InetAddress.getLocalHost();
            System.out.println(localaddress);
        }
    }
}
