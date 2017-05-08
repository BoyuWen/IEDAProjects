package simpleFrameTest;

import java.awt.*;
import javax.swing.*;

/**
 * Created by Dr.Wen on 2017/5/8.
 */
public class SimpleFrame extends JFrame{
    public SimpleFrame(){
        //得到屏幕大小
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int Width = screenSize.width;
        int Height = screenSize.height;
        //设置框架大小和定位
        setSize(Width/2,Height/2);
        setLocationByPlatform(true);
        //设置框架图片
        Image img = new ImageIcon("icon.gif").getImage();
        setIconImage(img);
    }
}
