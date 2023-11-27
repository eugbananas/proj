import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    public Login() {

        setTitle("Login");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        try {
            // Load the background image
            Image backgroundImage = ImageIO.read(getClass().getResource("/images/login_bg.png"));
            ImageIcon imageUser = new ImageIcon(getClass().getResource("/images/login_user.png"));
            ImageIcon imagePass = new ImageIcon(getClass().getResource("/images/login_pass.png"));


            JLabel userIcon = new JLabel(imageUser);
            JLabel userPass = new JLabel(imagePass);

            userIcon.setBounds(160, 347, 50, 51);
            userPass.setBounds(160, 421, 50, 51);

            // Create a JLabel with the background image
            JLabel backgroundLabel = new JLabel(new ImageIcon(backgroundImage));

            // Set layout manager to null for absolute positioning
            backgroundLabel.setLayout(null);

            // Set bounds for the background label to cover the entire frame
            backgroundLabel.setBounds(0, 0, getWidth(), getHeight());

            // Create labels
            JLabel lblWelcomeBack = new JLabel("Welcome Back");
            JLabel lblLoginToExploreMoreAbout = new JLabel("Login to explore more about ");
            JLabel lblShopco = new JLabel("shop.co");


            // Set font and color for all labels
            Font segoeUIFont = new Font("Segoe UI", Font.PLAIN, 25);
            Font boldFont = new Font("Segoe UI", Font.BOLD, 50); // Bold font for "Create new account"

            lblWelcomeBack.setFont(boldFont);
            lblLoginToExploreMoreAbout.setFont(segoeUIFont);
            lblShopco.setFont(segoeUIFont);

            lblLoginToExploreMoreAbout.setForeground(Color.decode("#ECEFF4"));
            lblWelcomeBack.setForeground(Color.decode("#D8DEE9"));
            lblShopco.setForeground(Color.decode("#88C0D0"));

            lblWelcomeBack.setBounds(160, 203, 500, 50);
            lblLoginToExploreMoreAbout.setBounds(160, 275, 500, 25);
            lblShopco.setBounds(483, 275, 500, 25);


            backgroundLabel.add(lblShopco);
            backgroundLabel.add(lblLoginToExploreMoreAbout);
            backgroundLabel.add(lblWelcomeBack);



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



            JButton btnRegister = new JButton("Register");
            btnRegister.setBounds(160, 541, 208, 51);
            btnRegister.setBackground(Color.decode("#434C5E"));
            btnRegister.setForeground(Color.WHITE);
            btnRegister.setBorder(BorderFactory.createLineBorder(Color.decode("#434C5E")));
            btnRegister.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        // Create an instance of the Register class
                        Register register = new Register();
                        register.setVisible(true);

                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }

            });

            JButton btnLogin = new JButton("Login");
            btnLogin.setBounds(404, 541, 208, 51);
            btnLogin.setBackground(Color.decode("#88C0D0"));
            btnLogin.setForeground(Color.WHITE);
            btnLogin.setBorder(BorderFactory.createLineBorder(Color.decode("#88C0D0")));
            btnLogin.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {


                }
            });

            backgroundLabel.add(userPass);
            backgroundLabel.add(userIcon);
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
            Login login = new Login();
            login.setVisible(true);
        });
    }

}

