package reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Dr.Wen on 2017/5/22.
 */
public class ReaderTest {
    public static void main(String[] args) throws IOException{
        File file = new File(File.separator+"Users"+File.separator+"Dr.Wen"+File.separator+"Desktop"+File.separator+"helloworld.txt");

        if (file.exists()){
            char[] chars = new char[100];
            Reader read = new FileReader(file);
            int len = read.read(chars);
            System.out.println(new String(chars,0,len));

            read.close();
        }
    }
}
