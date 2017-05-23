package input;

import java.io.*;

/**
 * Created by Dr.Wen on 2017/5/22.
 */
public class InputTest {
    public static void main(String[] args){
        try{
            File file = new File(File.separator+"Users"+File.separator+"Dr.Wen"+File.separator+"Desktop"+File.separator+"helloworld.txt");
            if (file.getParentFile().exists() && file.exists()) {
                InputStream input = new FileInputStream(file);
                byte[] bytes = new byte[1024];
                //int len = input.read(bytes);

//            int foot = 0;

//            int date = 0;
//            do{
//                date = input.read();
//                if (date != -1){
//                    bytes[foot++] = (byte)date;
//                }
//            }while (date != -1);

                int foot = 0;
                int date = 0;
                while ((date = input.read()) != -1){
                    bytes[foot++] = (byte)date;
                }
                input.close();
                System.out.println("【" + new String(bytes,0,foot) + "】");
            }
        }catch (Exception e){}
        catch (NoClassDefFoundError e){}
    }
}
