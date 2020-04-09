package advance.javaswing.layout.management;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx {

    public static void main(String[] args){
        JFrame f=  new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
                "Cls", "Bck", "", "Close",
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (int i = 0; i < buttons.length; i++) {

            if (i == 2)
                panel.add(new JLabel(buttons[i]));
            else
                panel.add(new JButton(buttons[i]));
        }

        f.add(panel);

        f.setTitle("Layout Example");
        f.setSize(350, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
