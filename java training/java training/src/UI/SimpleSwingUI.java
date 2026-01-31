package UI;

    import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleSwingUI {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("My App");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create components
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Greet");
        JLabel greetingLabel = new JLabel("");

        // Panel for input
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(label);
        inputPanel.add(textField);

        // Panel for button
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button);

        // Panel for output
        JPanel outputPanel = new JPanel();
        outputPanel.add(greetingLabel);

        // Add panels to frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(outputPanel, BorderLayout.SOUTH);

        // Button action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                greetingLabel.setText("Hello, " + name + "!");
            }
        });

        // Make it visible
        frame.setVisible(true);
    }
}

    
