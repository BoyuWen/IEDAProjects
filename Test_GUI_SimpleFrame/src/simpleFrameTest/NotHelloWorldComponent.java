package simpleFrameTest;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dr.Wen on 2017/5/8.
 */
public class NotHelloWorldComponent extends JComponent {
    public void paintComponent(Graphics g){
        g.drawString("Not a Hello,World program",75,100);
    }
}
