package Basic5;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonExample {

    JLabel l1;

    public ButtonExample() {

        JFrame f = new JFrame("Button Example");

        // Label
        l1 = new JLabel();
        l1.setBounds(50, 50, 300, 50);
        l1.setFont(new Font("Arial", Font.BOLD, 18));

        // Buttons
        JButton b1 = new JButton("India");
        JButton b2 = new JButton("Srilanka");

        b1.setBounds(50, 120, 120, 50);
        b2.setBounds(200, 120, 120, 50);

        // Event handling using ActionListener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("India is pressed");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Srilanka is pressed");
            }
        });

        // Add components
        f.add(l1);
        f.add(b1);
        f.add(b2);

        // Frame settings
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ButtonExample();
    }
}