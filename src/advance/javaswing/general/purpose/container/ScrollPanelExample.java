package advance.javaswing.general.purpose.container;

import javax.swing.*;
import java.awt.*;

public class ScrollPanelExample {
    public static void main(String[] args) {
        ScrollPanelExample scroll = new ScrollPanelExample();
        scroll.createAndShowGUI();
    }


    private void createAndShowGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("Scroll Panel Example");

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set flow layout for the frame
        frame.getContentPane().setLayout(new FlowLayout());

        JTextArea textArea = new JTextArea(10, 20);
        JScrollPane scrollableTextArea = new JScrollPane(textArea);

        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.getContentPane().add(scrollableTextArea);
        frame.setVisible(true);
    }
}
