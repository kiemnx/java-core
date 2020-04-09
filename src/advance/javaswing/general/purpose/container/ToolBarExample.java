package advance.javaswing.general.purpose.container;

import javax.swing.*;
import java.awt.*;

public class ToolBarExample {
    public static void main(String[] args){
        JFrame myframe = new JFrame("JToolBar Example");
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JToolBar toolbar = new JToolBar();
        toolbar.setRollover(true);

        toolbar.add(new JButton("File"));
        toolbar.addSeparator();
        toolbar.add(new JButton("Edit"));
        toolbar.addSeparator();
        toolbar.add(new JComboBox(new String[] { "Opt-1", "Opt-2", "Opt-3", "Opt-4" }));

        myframe.add(toolbar, BorderLayout.SOUTH);
        myframe.setSize(450, 250);
        myframe.setVisible(true);
    }
}
