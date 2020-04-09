package advance.javaswing.event.handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerEx {

    private JFrame mainFrame;
    private JFrame aboutFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public static void main(String[] args){
        WindowListenerEx  object = new WindowListenerEx();
        object.prepareGUI();
        object.showWindowListenerDemo();
    }

    private void showWindowListenerDemo(){
        headerLabel.setText("Listener in action: WindowListener");
        aboutFrame = new JFrame();
        aboutFrame.setSize(300,200);;
        aboutFrame.setTitle("WindowListener Demo");
        aboutFrame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Deiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Deactivated");
            }
        });

        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        JLabel msglabel = new JLabel("Welcome to TutorialsPoint SWING Tutorial."
                ,JLabel.CENTER);
        panel.add(msglabel);
        aboutFrame.add(panel);
        aboutFrame.setVisible(true);
    }

    private void prepareGUI(){
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));

        headerLabel = new JLabel("",JLabel.CENTER );
        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
}
