package advance.javaswing.layout.management;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx {
    public static void main(String[] args){
        JFrame frame = new JFrame("Flow Layout");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JTextArea area = new JTextArea("text area");
        area.setPreferredSize(new Dimension(100, 100));

        JButton button = new JButton("button");
        panel.add(button);

        JTree tree = new JTree();
        panel.add(tree);

        panel.add(area);

        frame.add(panel);
        frame.setVisible(true);
    }

}
