import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JFrame {
    public Menu() {

        setTitle("Menu");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        try {
            // Load the background image
            Image backgroundImage = ImageIO.read(getClass().getResource("/images/whiter.jpg"));
            ImageIcon product1 = new ImageIcon(getClass().getResource("/images/prod1.png"));
            ImageIcon product2 = new ImageIcon(getClass().getResource("/images/prod2.png"));
            ImageIcon product3 = new ImageIcon(getClass().getResource("/images/prod3.png"));
            ImageIcon product4 = new ImageIcon(getClass().getResource("/images/prod4.png"));
            ImageIcon product5 = new ImageIcon(getClass().getResource("/images/prod5.png"));
            ImageIcon product6 = new ImageIcon(getClass().getResource("/images/prod6.png"));
            ImageIcon product7 = new ImageIcon(getClass().getResource("/images/prod7.png"));
            ImageIcon product8= new ImageIcon(getClass().getResource("/images/prod8.png"));


            JLabel userproduct1 = new JLabel(product1);
            JLabel userproduct2 = new JLabel(product2);
            JLabel userproduct3 = new JLabel(product3);
            JLabel userproduct4 = new JLabel(product4);
            JLabel userproduct5 = new JLabel(product5);
            JLabel userproduct6 = new JLabel(product6);
            JLabel userproduct7 = new JLabel(product7);
            JLabel userproduct8 = new JLabel(product8);


            userproduct1.setBounds(321, 157, 129, 151);
            userproduct2.setBounds(573, 159, 126, 149);
            userproduct3.setBounds(825, 157, 118, 146);
            userproduct4.setBounds(1077, 157, 124, 141);
            userproduct5.setBounds(321, 400, 126, 163);
            userproduct6.setBounds(573,400, 134, 162);
            userproduct7.setBounds(825, 400, 128, 163);
            userproduct8.setBounds(1077, 400, 125, 163);

            // Set font and color for all labels
            Font ubuntu = new Font("UBUNTU", Font.PLAIN, 25);
            Font newubuntu = new Font("UBUNTU", Font.PLAIN, 10);
            Font boldFont = new Font("Segoe UI", Font.BOLD, 50); // Bold font for "Create new account"

            //create jlabel for the name of the products
            JLabel lblprod1 = new JLabel("3-pack Regular Fit Polo Shirts");
            JLabel lblprice1= new JLabel("PHP 1,190");
            lblprod1.setFont(newubuntu);
            lblprod1.setForeground(Color.decode("#88C0D0"));
            lblprod1.setBounds(321, 180, 129, 151);

            JLabel lblprod2 = new JLabel("Low-waist Wide Legged Jeans");
            JLabel lblprice2 = new JLabel("PHP 1,699");

            JLabel lblprod3 = new JLabel("Black DENIM JACKET");
            JLabel lblprice3 = new JLabel("2,995.00 PHP");

            JLabel lblprod4 = new JLabel("3-pack Regular Fit Polo Shirts");
            JLabel lblprice4 = new JLabel("PHP 2,250");

            JLabel lblprod5 = new JLabel("Polyamide Top with Wide Straps");
            JLabel lblprice5 = new JLabel("PHP 550");

            JLabel lblprod6 = new JLabel("Black Cotton Hoodie");
            JLabel lblprice6 = new JLabel("PHP 1,899");

            JLabel lblprod7 = new JLabel("WIDE-LEG MID-FULL LENGTH JEANS");
            JLabel lblprice7 = new JLabel("PHP 1,490");

            JLabel lblprod8 = new JLabel("Canvas Painted Dress");
            JLabel lblprice8 = new JLabel("PHP 1,900");


            // Create a JLabel with the background image
            JLabel backgroundLabel = new JLabel(new ImageIcon(backgroundImage));

            // Set layout manager to null for absolute positioning
            backgroundLabel.setLayout(null);

            // Set bounds for the background label to cover the entire frame
            backgroundLabel.setBounds(0, 0, getWidth(), getHeight());

            // Create labels
            JLabel lblShopco = new JLabel("SHOP.CO");

            // shop.co deets
            lblShopco.setFont(ubuntu);
            lblShopco.setForeground(Color.decode("#88C0D0"));
            lblShopco.setBounds(72, 14, 325, 40);


            backgroundLabel.add(lblShopco);

            // edit the color for background !!
            JTextField txtSearch = new JTextField();
            txtSearch.setBounds(300, 14, 500, 40);
            txtSearch.setBackground(Color.decode("#000000"));
            txtSearch.setForeground(Color.WHITE);
            txtSearch.setBorder(BorderFactory.createLineBorder(Color.decode("#FFFFFF")));


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


            backgroundLabel.add(userproduct1);
            backgroundLabel.add(userproduct2);
            backgroundLabel.add(userproduct3);
            backgroundLabel.add(userproduct4);
            backgroundLabel.add(userproduct5);
            backgroundLabel.add(userproduct6);
            backgroundLabel.add(userproduct7);
            backgroundLabel.add(userproduct8);

            backgroundLabel.add(lblprod1);
            backgroundLabel.add(txtSearch);



            add(backgroundLabel);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Menu menu = new Menu();
            menu.setVisible(true);
        });
    }

}
