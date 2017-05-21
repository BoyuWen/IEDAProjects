package image;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dr.Wen on 2017/5/17.
 */
public class ImageComponent extends JComponent { ////一定是JComponent!!!!!!!!
    private static final int D_WIDTH = 600;
    private static final int D_HEIGHT = 400;

    private Image image;

    ImageComponent(){
        image = new ImageIcon("/Users/Dr.Wen/IdeaProjects/TestProjects/Test7-6_GUI_Image/src/image/444.png").getImage();
    }

    public void paintComponent(Graphics g){
        if (image == null) return;

        int imageWidth = image.getWidth(this);
        int imageHeight = image.getHeight(this);
        System.out.println(imageWidth);
        //System.out.println(imageHeight);

        g.drawImage(image,0,0,null);

        for (int i=0;i*imageWidth <= getWidth();i++) {
            for (int j = 0; j * imageHeight <= getHeight(); j++) {
                if (i + j > 0) {
                    g.copyArea(0, 0, imageWidth, imageHeight, i * imageWidth, j * imageHeight);
                }
            }
        }
    }

    public Dimension getPreferredSize(){
        return (new Dimension(D_WIDTH,D_HEIGHT));
    }
}
