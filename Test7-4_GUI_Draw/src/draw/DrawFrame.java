package draw;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dr.Wen on 2017/5/17.
 */
public class DrawFrame extends JFrame {
    public DrawFrame(){
        //getContentPane().setBackground(Color.PINK);
        //getContentPane().setBackground(SystemColor.window);
        add(new DrawComponent());
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension s = kit.getScreenSize();
        int width = s.width;
        int height = s.height;
        setLocation(1*width/3,1*height/4);
        pack();
    }
}
