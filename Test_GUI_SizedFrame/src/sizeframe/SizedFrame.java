package sizeframe;

import javax.swing.*;
import java.awt.*;
/**
 * Created by Dr.Wen on 2017/5/17.
 */
public class SizedFrame extends JFrame {
    public SizedFrame(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        setSize(width/2,height/2);
        setLocationByPlatform(true);
    }
}
