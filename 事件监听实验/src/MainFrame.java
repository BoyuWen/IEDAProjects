import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Dr.Wen on 2017/6/11.
 */
public class MainFrame extends JFrame {
    private JPanel panel = new JPanel();
    private JButton button = new JButton("更改颜色");
    Color color[] = new Color[]{Color.red,Color.black,Color.blue,Color.yellow,Color.white};

    public MainFrame (){
        this.add(panel);
        panel.add(button);
        button.addActionListener(new BtnListener(this));

        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(3);
    }

    public void changeColor (){
        panel.setBackground(color[new Random().nextInt(5)]);
    }
    public static void main(String[] args){
        new MainFrame();
    }
}
