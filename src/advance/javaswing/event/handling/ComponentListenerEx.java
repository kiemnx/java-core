package advance.javaswing.event.handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class ComponentListenerEx {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JButton button;

    public static void main(String[] args){
        ComponentListenerEx  component = new ComponentListenerEx();
        component.prepareGUI();
    }

    private void prepareGUI(){
        mainFrame = new JFrame("Vi du Java Swing");
        mainFrame.setSize(400,400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        statusLabel = new JLabel("", JLabel.CENTER);

        JPanel panel = new JPanel();
        panel.setBounds(100, 100, 100, 40);
        panel.setBackground(Color.magenta);
        JLabel msglabel =new JLabel("TEXT",JLabel.CENTER);
        panel.add(msglabel);
        msglabel.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                statusLabel.setText("Component resize");
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                statusLabel.setText("Component moved");
            }

            @Override
            public void componentShown(ComponentEvent e) {
                statusLabel.setText("Component show");
            }

            @Override
            public void componentHidden(ComponentEvent e) {
                statusLabel.setText("Component hidden");
            }
        });


        button = new JButton("CLICK");
        button.setBounds(100, 50, 80, 40);
        final boolean[] show = {true};
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(show[0]){
                    msglabel.setVisible(false);
                    show[0] = false;
                } else {
                    msglabel.setVisible(true);
                    show[0] = true;
                }
            }
        });

        mainFrame.add(button);
        mainFrame.add(panel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

}
