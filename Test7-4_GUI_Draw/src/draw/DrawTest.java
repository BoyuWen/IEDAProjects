package draw;

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
            }
        });
    }
}
