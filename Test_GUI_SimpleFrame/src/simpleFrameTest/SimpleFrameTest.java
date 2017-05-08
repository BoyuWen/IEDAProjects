package simpleFrameTest;

import  java.awt.*;
import  javax.swing.*;

/**
 * Created by Dr.Wen on 2017/5/8.
 */
public class SimpleFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                SimpleFrame frame = new SimpleFrame();
                NotHelloWorldComponent a = new NotHelloWorldComponent();
                frame.add(new NotHelloWorldComponent());
                frame.setTitle("Not Hello World Component");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
