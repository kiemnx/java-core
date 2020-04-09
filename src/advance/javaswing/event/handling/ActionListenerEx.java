package advance.javaswing.event.handling;


import javax.swing.*;

public class ActionListenerEx {
    JButton button;

    public static void main(String[] args){
        ActionListenerEx object = new ActionListenerEx();

        object.createFrame();
        object.handlerActionEvent();
    }

    private void createFrame(){
        JFrame f = new JFrame("Frame");
        JPanel p = new JPanel();
        button = new JButton("Click me");
        p.add(button);

        f.add(p);
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    private void handlerActionEvent(){
        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createDialog();
            }
        });*/

        button.addActionListener(e -> {
            createDialog();
        });
    }

    private void createDialog(){
        JDialog d = new JDialog(new JFrame(), "Dialog Example");
        JLabel l = new JLabel("This is a dialog frame");
        l.setBounds(10, 10, 100, 20);
        d.add(l);
        d.setBounds(200, 200, 200, 200);
        d.setVisible(true);
    }
}
