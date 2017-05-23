package output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Dr.Wen on 2017/5/22.
 */
public class OutputTest {
    public static void main(String[] args) throws IOException{
        File file = new File(File.separator+"Users"+File.separator+"Dr.Wen"+File.separator+"Desktop"+File.separator+"helloworld.txt");
        if (!file.getParentFile().exists()) file.mkdirs();
        if (!file.exists()) file.createNewFile();

        OutputStream output = new FileOutputStream(file,true);
        String str = "温泊语";
        byte[] bytes = str.getBytes();
        output.write(bytes);
//        for (int i=0;i<bytes.length;i++){
//            output.write(bytes[i]);
//        }
        output.close();
    }
}
