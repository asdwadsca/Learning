package Swing.first;

import javax.swing.*;
import java.awt.*;

public class JFrameTest {
    public static void main(String[]args){
        JFrame jFrame = new JFrame();
        jFrame.setTitle("创建一个JFrame窗口");
        Container container = jFrame.getContentPane();
        JLabel jLabel = new JLabel("这是一个JFrame窗体");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jLabel);
        jFrame.setSize(300, 150);
        jFrame.setLocation(320,240);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
