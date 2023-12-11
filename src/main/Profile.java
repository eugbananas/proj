import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Profile extends JFrame{
    public Profile() {

        setTitle("Profile");
        setSize(600, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        //try {
            ImageIcon header1 = new ImageIcon(getClass().getResource("/images/profile/header2.png"));
            ImageIcon header2 = new ImageIcon(getClass().getResource("/images/profile/header1.png"));

            ImageIcon bg = new ImageIcon(getClass().getResource("/images/profile/bg.png"));

            ImageIcon contact = new ImageIcon(getClass().getResource("/images/profile/contact.png"));
            ImageIcon help = new ImageIcon(getClass().getResource("/images/profile/help.png"));
            ImageIcon logout = new ImageIcon(getClass().getResource("/images/profile/logout.png"));
            ImageIcon settings = new ImageIcon(getClass().getResource("/images/profile/settings.png"));
            ImageIcon user = new ImageIcon(getClass().getResource("/images/profile/user.png"));
            ImageIcon user_icon = new ImageIcon(getClass().getResource("/images/profile/users/user1.png"));


            JLabel lblUser = new JLabel("First Name Last Name");
            lblUser.setBounds(120, 256, 500, 50); // X=120, Y=256
            lblUser.setFont(new Font("Arial", Font.PLAIN, 36));
            lblUser.setForeground(Color.decode("#FFFFFF")); // FFFFFF

            // Create the email label
            JLabel lblEmail = new JLabel("emailemail@email.com");
            lblEmail.setBounds(193, 312, 400, 50);
            lblEmail.setFont(new Font("Arial", Font.PLAIN, 20));
            lblEmail.setForeground(Color.decode("#FFFFFF"));


            JLabel imgHeader1 = new JLabel(header1);
            imgHeader1.setBounds(100, 370, 400, 434);

            JLabel imgHeader2 = new JLabel(header2);
            imgHeader2.setBounds(0, 0, 600, 429);


            JLabel imgBg = new JLabel(bg);
            imgBg.setBounds(0, 0, 600, 1000);

            JLabel imgIcon = new JLabel(resizeImage(user_icon.getImage(), 195, 195));
            imgIcon.setBounds(203, 51, 195, 195);

            add(lblUser);
            add(lblEmail);
            add(imgIcon);
            add(imgHeader1);
            add(imgHeader2);
            add(imgBg);
            setLayout(null);



        //} catch (IOException e) {
            //e.printStackTrace();
       // }

    }

    private ImageIcon resizeImage(Image image, int width, int height) {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();
        return new ImageIcon(bufferedImage);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Profile profile = new Profile();
            profile.setVisible(true);
        });
    }
}