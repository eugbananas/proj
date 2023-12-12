import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.sql.*;


public class Profile extends JFrame{

    String DATABASE_URL = "jdbc:sqlite:src/main/resources/database/database.db";

    private String userId = Login.id;

    private JLabel lblUser;
    private JLabel lblEmail;

        public Profile() {
            System.out.println(userId);
            setTitle("Profile");
            setSize(600, 1050);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(null);

            fetchDataFromDatabase();




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
            ImageIcon nav = new ImageIcon(getClass().getResource("/images/navigator/nav.png"));

            lblUser = new JLabel();
            lblUser.setBounds(120, 256, lblUser.getWidth(), lblUser.getHeight());
            lblUser.setFont(new Font("Arial", Font.PLAIN, 36));
            lblUser.setForeground(Color.decode("#FFFFFF"));

            lblEmail = new JLabel();
            lblEmail.setBounds(193, 312, lblEmail.getWidth(), lblEmail.getHeight());
            lblEmail.setFont(new Font("Arial", Font.PLAIN, 20));
            lblEmail.setForeground(Color.decode("#FFFFFF"));


            JLabel imgHeader1 = new JLabel(header1);
            imgHeader1.setBounds(100, 370, 400, 434);



        JLabel imgHeader2 = new JLabel(header2);
            imgHeader2.setBounds(0, 0, 600, 429);

            JLabel imgNav = new JLabel(nav);
            imgNav.setBounds(73, 894, 453, 99);

            JLabel imgBg = new JLabel(bg);
            imgBg.setBounds(0, 0, 600, 1000);

            JLabel imgIcon = new JLabel(resizeImage(user_icon.getImage(), 195, 195));
            imgIcon.setBounds(203, 51, 195, 195);

            JButton btnShop = new JButton("");
            btnShop.setBounds(88, 914, 33, 33);

            btnShop.setOpaque(false);
            btnShop.setContentAreaFilled(false);
            btnShop.setBorderPainted(false);

            JButton btnCategory = new JButton("");
            btnCategory.setBounds(188, 914, 33, 33);

            btnCategory.setOpaque(false);
            btnCategory.setContentAreaFilled(false);
            btnCategory.setBorderPainted(false);

            JButton btnFavorite = new JButton("");
            btnFavorite.setBounds(302, 914, 33, 33);

            btnFavorite.setOpaque(false);
            btnFavorite.setContentAreaFilled(false);
            btnFavorite.setBorderPainted(false);

            JButton btnCart = new JButton("");
            btnCart.setBounds(393, 914, 33, 33);

            btnCart.setOpaque(false);
            btnCart.setContentAreaFilled(false);
            btnCart.setBorderPainted(false);

            JButton btnProfile = new JButton("");
            btnProfile.setBounds(480, 914, 33, 33);

            btnProfile.setOpaque(false);
            btnProfile.setContentAreaFilled(false);
            btnProfile.setBorderPainted(false);

            JButton btnInfo = new JButton("");
            btnInfo.setBounds(155, 406, 300, 33);

            btnInfo.setOpaque(false);
            btnInfo.setContentAreaFilled(false);
            btnInfo.setBorderPainted(false);

            JButton btnLogOut = new JButton("");
            btnLogOut.setBounds(159, 675, 294, 33);

            btnInfo.setOpaque(false);
            btnInfo.setContentAreaFilled(false);
            btnInfo.setBorderPainted(false);

            btnLogOut.setOpaque(false);
            btnLogOut.setContentAreaFilled(false);
            btnLogOut.setBorderPainted(false);

            btnInfo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    AccountInfo accountInfo = new AccountInfo();
                    accountInfo.setVisible(true);
                    System.out.println(userId);
                }
            });

            btnLogOut.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    Login login = new Login();
                    login.setVisible(true);

                }
            });



            btnShop.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    Menu1 menu1 = new Menu1();
                    menu1.setVisible(true);

                }
            });

            btnProfile.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

            btnCategory.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "cat");

                }
            });

            btnFavorite.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "fav");

                }
            });

            btnCart.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    Cart cart = new Cart();
                    cart.setVisible(true);

                }
            });

            add(lblUser);
            add(lblEmail);
            add(btnLogOut);
            add(imgIcon);
            add(imgHeader1);
            add(imgHeader2);
            add(imgNav);
            add(btnShop);
            add(btnInfo);
            add(btnProfile);
            add(btnFavorite);
            add(btnCategory);
            add(btnCart);
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


    private void fetchDataFromDatabase() {
        try (Connection connection = DriverManager.getConnection(DATABASE_URL);
             Statement statement = connection.createStatement()) {
            String query = "SELECT name, email FROM users WHERE id = '" + userId + "'";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                final String username = resultSet.getString("name");
                final String email = resultSet.getString("email");

                // Add logging to check values
                System.out.println("Username from database: " + username);
                System.out.println("Email from database: " + email);

                SwingUtilities.invokeLater(() -> {
                    lblUser.setText("Username: " + username);
                    lblEmail.setText("Email: " + email);
                });
            } else {
                System.out.println("No data found for userId: " + userId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Profile profile = new Profile();
            profile.setVisible(true);
        });
    }
}