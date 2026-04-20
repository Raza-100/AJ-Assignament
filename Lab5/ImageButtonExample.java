package Basic5;

import javax.swing.*;
import java.awt.event.*;

public class ImageButtonExample {

    JLabel label;

    public ImageButtonExample() {

        JFrame frame = new JFrame("Image Button Example");

        label = new JLabel("Click a button", JLabel.CENTER);
        label.setBounds(50, 20, 300, 30);

        // Correct images
        ImageIcon clockIcon = new ImageIcon(getClass().getResource("clock.png"));
        ImageIcon hourIcon = new ImageIcon(getClass().getResource("hourglass.png"));

        // Correct mapping
        JButton clockBtn = new JButton(clockIcon);   // CLOCK image
        JButton hourBtn = new JButton(hourIcon);     // HOURGLASS image

        clockBtn.setBounds(50, 80, 120, 120);
        hourBtn.setBounds(200, 80, 120, 120);

        // Correct event logic
        clockBtn.addActionListener(e -> label.setText("Digital Clock is pressed"));
        hourBtn.addActionListener(e -> label.setText("Hour Glass is pressed"));

        frame.add(label);
        frame.add(clockBtn);
        frame.add(hourBtn);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}