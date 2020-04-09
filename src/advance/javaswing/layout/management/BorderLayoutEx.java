package advance.javaswing.layout.management;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx {

    public static void main(String[] args){
        JFrame f=  new JFrame();

        JButton b1=new JButton("NORTH");
        JButton b2=new JButton("SOUTH");
        JButton b3=new JButton("EAST");
        JButton b4=new JButton("WEST");
        JButton b5=new JButton("CENTER");
        JButton b6=new JButton("NORTH 2");

        f.add(b1, BorderLayout.NORTH);
        f.add(b6, BorderLayout.NORTH);

        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);
        f.add(b5, BorderLayout.CENTER);

        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
