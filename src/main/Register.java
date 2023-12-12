import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Register extends JFrame {
    String DATABASE_URL = "jdbc:sqlite:src/main/resources/database/database.db";

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

            ImageIcon imageUser = new ImageIcon(getClass().getResource("/images/login_user.png"));
            ImageIcon imagePass = new ImageIcon(getClass().getResource("/images/login_pass.png"));

            JTextField txtEmail = new JTextField();
            txtEmail.setBounds(210, 347, 402, 51);
            txtEmail.setBackground(Color.decode("#3B4252"));
            txtEmail.setForeground(Color.WHITE);
            txtEmail.setBorder(BorderFactory.createLineBorder(Color.decode("#3B4252")));

            JPasswordField txtPassword = new JPasswordField();
            txtPassword.setBounds(210, 421, 402, 51);
            txtPassword.setBackground(Color.decode("#3B4252"));
            txtPassword.setForeground(Color.WHITE);
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.decode("#3B4252")));
            txtPassword.setEchoChar('*');

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



            JButton btnLogin = new JButton("Back to Login");
            btnLogin.setBounds(160, 541, 208, 51);
            btnLogin.setBackground(Color.decode("#434C5E"));
            btnLogin.setForeground(Color.WHITE);
            btnLogin.setBorder(BorderFactory.createLineBorder(Color.decode("#434C5E")));
            btnLogin.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Login login = new Login();
                login.setVisible(true);
                }
            });

            JButton btnRegister = new JButton("Register");
            btnRegister.setBounds(404, 541, 208, 51);
            btnRegister.setBackground(Color.decode("#88C0D0"));
            btnRegister.setForeground(Color.WHITE);
            btnRegister.setBorder(BorderFactory.createLineBorder(Color.decode("#88C0D0")));

            btnRegister.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String email = txtEmail.getText();
                    String password = new String(txtPassword.getPassword());

                    if (registerUser(email, password)) {
                        JOptionPane.showMessageDialog(Register.this, "Registration successful!");
                    } else {
                        JOptionPane.showMessageDialog(Register.this, "Registration failed!");
                    }
                }
            });


            JLabel userIcon = new JLabel(imageUser);
            JLabel userPass = new JLabel(imagePass);

            userIcon.setBounds(160, 347, 50, 51);
            userPass.setBounds(160, 421, 50, 51);

            backgroundLabel.add(userIcon);
            backgroundLabel.add(userPass);
            backgroundLabel.add(txtEmail);
            backgroundLabel.add(txtPassword);
            backgroundLabel.add(btnRegister);
            backgroundLabel.add(btnLogin);
            add(backgroundLabel);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private boolean registerUser(String email, String password) {
        try (Connection connection = DriverManager.getConnection(DATABASE_URL)) {
            String query = "INSERT INTO users (email, password) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, password);

                int affectedRows = preparedStatement.executeUpdate();
                return affectedRows > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Register register = new Register();
            register.setVisible(true);
        });
    }
}
