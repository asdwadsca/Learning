package Swing.Dialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyDialog extends JDialog {
    public MyDialog(MyFrame frame){
        super(frame, "第一个JDialog窗体", true);
        Container container = getContentPane();
        container.add(new JLabel("这是一个对话框"));
        setBounds(120,120,100,100);
    }

}

public class MyFrame extends JFrame{
    public MyFrame(){
        Container container = getContentPane();
        container.setLayout(null);
        JButton button = new JButton("弹出对话窗");
        button.setBounds(10, 10, 100, 21);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDialog dialog = new MyDialog(MyFrame.this);
                dialog.setVisible(true);
            }
        });
        container.add(button);
        setSize(200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[]args){
        new MyFrame();
    }
}