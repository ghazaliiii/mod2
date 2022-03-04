package LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {
    private JTextField username;
    private JPanel panel1;
    private JButton loginButton;
    private JTextField textField1;
    private  JFrame frame;
    public LoginPage(){


        frame= new JFrame("Login Frame");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,200));
        frame.setResizable(false);

        frame.add(panel1);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String us = username.getText();
                textField1.setText("Hallo " +us);

            }
        });
    }
}
