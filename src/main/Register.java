import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame {
    public Register() {

        setTitle("Register");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        try {
            // Load the background image
            Image backgroundImage = ImageIO.read(getClass().getResource("/images/login_bg.png"));

            // Create a JLabel with the background image
            JLabel backgroundLabel = new JLabel(new ImageIcon(backgroundImage));

            // Set layout manager to null for absolute positioning
            backgroundLabel.setLayout(null);

            // Set bounds for the background label to cover the entire frame
            backgroundLabel.setBounds(0, 0, getWidth(), getHeight());

            // Create labels
            JLabel startForFreeLabel = new JLabel("START FOR FREE");
            JLabel createAccountLabel = new JLabel("Create new account");
            JLabel alreadyMemberLabel = new JLabel("Already A Member?");
            JLabel logInLabel = new JLabel("Log In");

            // Set font and color for all labels
            Font segoeUIFont = new Font("Segoe UI", Font.PLAIN, 25);
            Font boldFont = new Font("Segoe UI", Font.BOLD, 50); // Bold font for "Create new account"

            startForFreeLabel.setFont(segoeUIFont);
            createAccountLabel.setFont(boldFont);  // Set bold font for "Create new account"
            alreadyMemberLabel.setFont(segoeUIFont);
            logInLabel.setFont(segoeUIFont);

            startForFreeLabel.setForeground(Color.decode("#ECEFF4"));
            createAccountLabel.setForeground(Color.decode("#D8DEE9"));
            alreadyMemberLabel.setForeground(Color.decode("#ECEFF4"));
            logInLabel.setForeground(Color.decode("#88C0D0"));

            // Set bounds for all labels
            startForFreeLabel.setBounds(150, 175, 300, 30);
            createAccountLabel.setBounds(150, 208, 500, 50);
            alreadyMemberLabel.setBounds(150, 275, 300, 30);
            logInLabel.setBounds(374, 275, 100, 30);

            // Add labels to the background label
            backgroundLabel.add(startForFreeLabel);
            backgroundLabel.add(createAccountLabel);
            backgroundLabel.add(alreadyMemberLabel);
            backgroundLabel.add(logInLabel);

            JTextField txtFirstName = new JTextField();
            txtFirstName.setBounds(160, 324, 208, 51);
            txtFirstName.setBackground(Color.decode("#3B4252"));
            txtFirstName.setForeground(Color.WHITE);
            txtFirstName.setBorder(BorderFactory.createLineBorder(Color.decode("#3B4252")));

            JTextField txtLastName = new JTextField();
            txtLastName.setBounds(404, 324, 208, 51);
            txtLastName.setBackground(Color.decode("#3B4252"));
            txtLastName.setForeground(Color.WHITE);
            txtLastName.setBorder(BorderFactory.createLineBorder(Color.decode("#3B4252")));


            JTextField txtEmail = new JTextField();
            txtEmail.setBounds(160, 391, 452, 51);
            txtEmail.setBackground(Color.decode("#3B4252"));
            txtEmail.setForeground(Color.WHITE);
            txtEmail.setBorder(BorderFactory.createLineBorder(Color.decode("#3B4252")));

            JPasswordField txtPassword = new JPasswordField();
            txtPassword.setBounds(160, 458, 452, 51);
            txtPassword.setBackground(Color.decode("#3B4252"));
            txtPassword.setForeground(Color.WHITE);
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.decode("#3B4252")));
            txtPassword.setEchoChar('*');

            JButton btnLogin = new JButton("Back to Login");
            btnLogin.setBounds(160, 541, 208, 51);
            btnLogin.setBackground(Color.decode("#434C5E"));
            btnLogin.setForeground(Color.WHITE);
            btnLogin.setBorder(BorderFactory.createLineBorder(Color.decode("#434C5E")));
            btnLogin.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {


                }
            });

            JButton btnRegister = new JButton("Register");
            btnRegister.setBounds(404, 541, 208, 51);
            btnRegister.setBackground(Color.decode("#88C0D0"));
            btnRegister.setForeground(Color.WHITE);
            btnRegister.setBorder(BorderFactory.createLineBorder(Color.decode("#88C0D0")));




            backgroundLabel.add(txtFirstName);
            backgroundLabel.add(txtLastName);
            backgroundLabel.add(txtEmail);
            backgroundLabel.add(txtPassword);
            backgroundLabel.add(btnRegister);
            backgroundLabel.add(btnLogin);
            add(backgroundLabel);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Register register = new Register();
            register.setVisible(true);
        });
    }
}
