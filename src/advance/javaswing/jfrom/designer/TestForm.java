package advance.javaswing.jfrom.designer;

import javax.swing.*;
import java.awt.*;

public class TestForm {
    private JTextField name;
    private JPanel panel1;
    private JButton buttonYes;
    private JButton buttonNo;
    private JTable table1;
    private JTextField textField1;
    private JButton button1;
    private JTextPane textPane1;
    private JTable table2;

    public static void main(String[] args){

        JFrame f = new JFrame("Component");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBounds(20, 20, 200, 200);
        panel.setBackground(Color.BLUE);

        f.setLayout(null);

        JLabel label = new JLabel("Email");
        label.setBounds(10, 25, 50, 20);

        JTextField textField = new JTextField();
        textField.setBounds(80, 25, 100, 20);

        JButton button = new JButton("Login");
        button.setBounds(80, 55, 100, 30);

        JComboBox comboBox = new JComboBox(new String[] { "Opt-1", "Opt-2", "Opt-3", "Opt-4" });
        comboBox.setBounds(40, 100, 100, 30);

        panel.setLayout(null);
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(comboBox);


        f.add(panel);
        f.setVisible(true);

    }
}
