package UI;

// import com.example.service.UserService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    public static void main(String[] args) {
        JFrame frame = new JFrame("User Registration");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 30, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 30, 180, 25);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 70, 100, 25);
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 70, 180, 25);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(50, 110, 100, 25);
        JTextField ageField = new JTextField();
        ageField.setBounds(150, 110, 180, 25);

        JButton submitBtn = new JButton("Register");
        submitBtn.setBounds(150, 160, 100, 30);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(50, 200, 300, 25);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(submitBtn);
        frame.add(resultLabel);

        // UserService userService = new UserService();

        // submitBtn.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         String message = userService.registerUser(
        //                 nameField.getText(),
        //                 emailField.getText(),
        //                 ageField.getText()
        //         );
        //         resultLabel.setText(message);
        //     }
        // });

        frame.setVisible(true);
    }
}
