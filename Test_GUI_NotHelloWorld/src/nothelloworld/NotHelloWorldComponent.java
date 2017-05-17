package nothelloworld;

import javax.swing.*;
import java.awt.*;
/**
 * Created by Dr.Wen on 2017/5/17.
 */
public class NotHelloWorldComponent extends JComponent{
    public void paintComponent(Graphics g){
        g.drawString("NOT HELLOE WORLD!",75,100);
    }

    public Dimension getPreferredSize(){
        return (new Dimension(300,200));
    }
}
