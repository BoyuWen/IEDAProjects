package parent;

import java.io.File;
import java.io.IOException;

/**
 * Created by Dr.Wen on 2017/5/22.
 */
public class ParentTest {
    public static void main(String[] args) throws IOException{
        File file = new File(File.separator+"Users"+File.separator+"Dr.Wen"+File.separator+"Desktop"+File.separator+"hello"+File.separator+"hello.txt");
        if (!file.getParentFile().exists()){
            file.mkdirs();
            file.createNewFile();
        }
        if(!file.exists()){
            file.createNewFile();
        }else{
            file.delete();
        }
    }
}
