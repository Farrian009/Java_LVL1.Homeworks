import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    MyWindow() {
        setVisible(true);
        setLocation(300, 300);
        setSize(500, 500);
        setTitle("My perfect window!");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(1,2));
        JButton btn1 = new JButton("Exit");
        //add(btn1, BorderLayout.NORTH);
        panel.add(btn1);
        ActionListener actionListener = new CloseActionListener();
        btn1.addActionListener(actionListener);
        JButton btn2 = new JButton("Button");
        //add(btn2, BorderLayout.SOUTH);
        panel.add(btn2);
        add(panel, BorderLayout.NORTH);
    }
}
