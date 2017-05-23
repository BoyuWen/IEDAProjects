package wirter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Dr.Wen on 2017/5/22.
 */
public class WriterTest {
    public static void main(String[] args) throws IOException{
        File file = new File(File.separator+"Users"+File.separator+"Dr.Wen"+File.separator+"Desktop"+File.separator+"helloworld.txt");
        if (file.exists()){
            Writer write = new FileWriter(file,true);
            String str= "一个天才";
            write.write(str);

            write.close();
        }
    }
}
