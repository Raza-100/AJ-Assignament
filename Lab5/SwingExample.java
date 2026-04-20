package Basic5;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwingExample {

    public SwingExample() {

        JFrame frame = new JFrame("Swing Hello Program");

        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming");

        label.setFont(new Font("Verdana", Font.PLAIN, 32));
        label.setForeground(Color.BLUE);
        label.setBounds(20, 40, 800, 50);

        frame.add(label);

        frame.setSize(800, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new SwingExample());
    }
}