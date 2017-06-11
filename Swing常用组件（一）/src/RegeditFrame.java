import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dr.Wen on 2017/6/10.
 */
public class RegeditFrame extends JFrame{
    private JComponent container = new jpComponent();
    private ButtonGroup group = new ButtonGroup();

    private JLabel user; //显示用户名
    private JTextField fuser;  //接收用户输入的用户名
    private JLabel password; //显示密码
    private JPasswordField fpassword; //接收用户输入的密码
    private JLabel pdsure; // 确认密码
    private JPasswordField fpdsure; //接收用户输入的确认密码
    private JLabel sex;
    private JRadioButton sex1;
    private JRadioButton sex2;
    private JLabel hobby;
    private Checkbox hobby1;
    private Checkbox hobby2;
    private Checkbox hobby3;
//    private JLabel course;
//    private JComboBox<String> course1;
    private JLabel remark; //显示备注
    private JTextArea fremark; //接收用户输入的信息
    private JLabel result;
    private JButton insert1;
    private JButton insert2;

    public  RegeditFrame (){
        this.add(container);
        container.setLayout(null);

        user = new JLabel("用户名");
        fuser = new JTextField();
        password = new JLabel("密码");
        fpassword = new JPasswordField();
        pdsure = new JLabel("确认密码");
        fpdsure = new JPasswordField();

        remark = new JLabel("个人简介");
        fremark = new JTextArea(4,25);
        result = new JLabel("");
        insert1 = new JButton("注册");
        insert2 = new JButton("重置");

        fpassword.setEchoChar('*');
        fpdsure.setEchoChar('*');

        user.setBounds(20,20,70,20);
        password.setBounds(20,60,70,20);
        pdsure.setBounds(20,100,70,30);
        fuser.setBounds(100,20,100,20);
        fpassword.setBounds(100,60,100,20);
        fpdsure.setBounds(100,100,100,20);
        remark.setBounds(20,140,70,20);
        fremark.setLineWrap(true);
        result.setBounds(20,350,400,100);
        result.setBorder(BorderFactory.createLineBorder(Color.blue,2));
        insert1.setBounds(40,290,100,20);
        insert2.setBounds(200,290,100,20);

        JScrollPane jsp = new JScrollPane(fremark);
        jsp.setBounds(20,180,200,100);
        container.add(jsp);

        insert1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String strs = "";
                if(! strs.equals("")){
                    strs += "\n";
                }
                String str1 = fuser.getText().toString();
                String str2 = fpassword.toString();
                String str3 = fpdsure.toString();
                if (str1.equals("") || str2.equals("") || str3.equals("")){
                    strs += "请将信息填写完整";
                }else if(!str2.equals(str3)){
                    strs += "两次密码不一致！";
                }else{
                    strs += "注册成功";
                }
                result.setText(strs);
            }
        });
        insert2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fpassword.setText("");
                fpdsure.setText("");
                fuser.setText("");
                fremark.setText("");
                result.setText("");
            }
        });

        container.add(user);
        container.add(fuser);
        container.add(password);
        container.add(fpassword);
        container.add(pdsure);
        container.add(fpdsure);
        container.add(remark);
        container.add(result);
        container.add(insert1);
        container.add(insert2);

        this.setBounds(500,200,500,500);
        this.setVisible(true);
        this.setResizable(false);
        //this.add(container);
        this.setDefaultCloseOperation(3);
    }
}
