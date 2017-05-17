package image;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dr.Wen on 2017/5/17.
 */
public class ImageTest {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ImageFrame frame = new ImageFrame();
                frame.setTitle("平铺图片");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
