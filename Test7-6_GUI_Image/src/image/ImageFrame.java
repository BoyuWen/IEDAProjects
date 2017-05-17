package image;

import javax.swing.*;

/**
 * Created by Dr.Wen on 2017/5/17.
 */
public class ImageFrame extends JFrame {
    public ImageFrame(){
        add(new ImageComponent());
        pack();
    }
}
