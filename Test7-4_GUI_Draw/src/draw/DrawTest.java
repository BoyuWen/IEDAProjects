package draw;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dr.Wen on 2017/5/17.
 */
public class DrawTest {
    public static void main (String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DrawFrame frame = new DrawFrame();
                frame.setTitle("绘图");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
