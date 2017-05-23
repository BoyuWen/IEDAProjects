package file;

import java.io.File;
import java.io.IOException;

/**
 * Created by Dr.Wen on 2017/5/22.
 */
public class FileTest {
    public static void main(String[] args) throws IOException{
        File file = new File(File.separator+"Users"+File.separator+"Dr.Wen"+File.separator+"Desktop"+File.separator+"helloworld.txt");
        if (file.exists()){
            System.out.println("ure");
            file.delete();
        }else{
            System.out.println(file.createNewFile());
        }

    }
}

