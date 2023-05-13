package Swing.Ready;

import javax.swing.*;

public class Demo {
    public static void main(String[]args){
        Object[] o = { new JButton("是的"), new JButton("在想想")};
        Icon icon = new ImageIcon("src/u_exclamation_triangle.png");
        JOptionPane.showOptionDialog(null,
                "你做好准备了吗？",
                "注意了！",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                icon, o, null);
    }
}
