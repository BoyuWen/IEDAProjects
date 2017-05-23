package list;

import java.io.File;
import java.io.IOException;

/**
 * Created by Dr.Wen on 2017/5/22.
 */
public class ListTest {
    public static void main(String[] args) throws IOException{
        File file = new File(File.separator+"Users"+File.separator+"Dr.Wen"+File.separator+"Desktop");
        if (!file.getParentFile().exists()){
            file.mkdirs();
        }
        if (!file.exists()){
            file.createNewFile();
        }
        print(file);
    }

    public static void print(File file){
        if (!file.exists()) return;
        if (file.isDirectory()){
            File[] files = file.listFiles();
            if (files != null) {       //此句一定要在for循环体外，因为files指的是对一文件目录下所有文件构成的列表的引用
                for (int i = 0; i < files.length; i++) {
                    print(files[i]);
                }
            }
        }else{
            System.out.println(file);
        }
    }
}
