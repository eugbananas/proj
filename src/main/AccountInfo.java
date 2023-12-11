import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
public class AccountInfo extends JFrame {
    public AccountInfo() {

        setTitle("Profile");
        setSize(600, 1050);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        //try {
        ImageIcon bg = new ImageIcon(getClass().getResource("/images/profile/bg.png"));
        ImageIcon header1 = new ImageIcon(getClass().getResource("/images/userinfo/header.png"));

        JLabel imgHeader1 = new JLabel(header1);
        imgHeader1.setBounds(27, 45, header1.getIconWidth(), header1.getIconHeight());

        JLabel imgBg = new JLabel(bg);
        imgBg.setBounds(0, 0, bg.getIconWidth(), bg.getIconHeight());

        JButton customButton = new JButton("Click Me");
        customButton.setBounds(227, 538, 146, 47);


        add(imgHeader1);
        add(imgBg);
        
        setLayout(null);

        //} catch (IOException e) {
        //e.printStackTrace();
        // }

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AccountInfo accountInfo = new AccountInfo();
            accountInfo.setVisible(true);
        });
    }
}