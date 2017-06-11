import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dr.Wen on 2017/6/11.
 */
public class BtnListener implements ActionListener {
    MainFrame frame = null;
    public BtnListener(MainFrame frame){
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e){
        frame.changeColor();
    }
}
