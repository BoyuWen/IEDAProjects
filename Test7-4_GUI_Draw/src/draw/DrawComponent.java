package draw;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 * Created by Dr.Wen on 2017/5/17.
 */
public class DrawComponent extends JComponent {
    private static final int CWIDTH = 400;
    private static final int CHEIGHT = 400;

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        double leftX = 100;
        double topY = 100;
        double width = 200;
        double height = 150;
        Rectangle2D rectangle = new Rectangle2D.Double(leftX,topY,width,height);
        g2.setPaint(Color.RED);
        g2.fill(rectangle);
        Ellipse2D ellipse = new Ellipse2D.Double(leftX,topY,width,height);
        g2.setPaint(Color.BLUE);
        g2.draw(ellipse);
        Line2D line1 = new Line2D.Double(leftX,topY,leftX+width,topY+height);
        Line2D line2 = new Line2D.Double(leftX,topY+height,leftX+width,topY);
        g2.setPaint(Color.YELLOW);
        g2.draw(line1);
        g2.setPaint(Color.YELLOW);
        g2.draw(line2);

        double centerX = rectangle.getCenterX();
        double centerY = rectangle.getCenterY();
        double radius = 125;
        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX,centerY,centerX+radius,centerY+radius);
        g2.setPaint(Color.GREEN);
        g2.draw(circle);
    }
    public Dimension getPreferredSize(){
        return (new Dimension(CWIDTH,CHEIGHT));
    }
}
