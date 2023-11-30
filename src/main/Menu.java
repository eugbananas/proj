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
            ImageIcon smallCart= new ImageIcon(getClass().getResource("images/cart2.png"));


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
            Font newubuntu = new Font("UBUNTU", Font.PLAIN, 12);
            Font boldFont = new Font("Segoe UI", Font.BOLD, 50); // Bold font for "Create new account"

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
            lblShopco.setForeground(Color.decode("#000000"));
            lblShopco.setBounds(72, 14, 325, 40);
            backgroundLabel.add(lblShopco);

            //create jlabel for the name of the products
            JLabel lblprod1 = new JLabel("Regular Fit Polo Shirt");
            JLabel lblprice1 = new JLabel("PHP 1,190");
            lblprod1.setFont(newubuntu);
            lblprod1.setForeground(Color.decode("#000000"));
            lblprod1.setBounds(321, 305, 144, 36);
            lblprice1.setFont(newubuntu);
            lblprice1.setForeground(Color.decode("#000000"));
            lblprice1.setBounds(321, 320, 144, 36);
            backgroundLabel.add(lblprod1);
            backgroundLabel.add(lblprice1);

            JLabel lblprod2 = new JLabel("Low-waist Wide Legged Jeans");
            JLabel lblprice2 = new JLabel("PHP 1,699");
            lblprod2.setFont(newubuntu);
            lblprod2.setForeground(Color.decode("#000000"));
            lblprod2.setBounds(579, 305, 200, 36);
            lblprice2.setFont(newubuntu);
            lblprice2.setForeground(Color.decode("#000000"));
            lblprice2.setBounds(579, 320, 144, 36);
            backgroundLabel.add(lblprod2);
            backgroundLabel.add(lblprice2);

            JLabel lblprod3 = new JLabel("Black DENIM JACKET");
            JLabel lblprice3 = new JLabel("2,995.00 PHP");
            lblprod3.setFont(newubuntu);
            lblprod3.setForeground(Color.decode("#000000"));
            lblprod3.setBounds(825, 300, 141, 36);
            lblprice3.setFont(newubuntu);
            lblprice3.setForeground(Color.decode("#000000"));
            lblprice3.setBounds(825, 315, 144, 36);
            backgroundLabel.add(lblprod3);
            backgroundLabel.add(lblprice3);

            JLabel lblprod4 = new JLabel("Striked Button Blazer");
            JLabel lblprice4 = new JLabel("PHP 2,250");
            lblprod4.setFont(newubuntu);
            lblprod4.setForeground(Color.decode("#000000"));
            lblprod4.setBounds(1075, 295, 141, 36);
            lblprice4.setFont(newubuntu);
            lblprice4.setForeground(Color.decode("#000000"));
            lblprice4.setBounds(1075, 310, 144, 36);
            backgroundLabel.add(lblprod4);
            backgroundLabel.add(lblprice4);

            JLabel lblprod5 = new JLabel("Polyamide Top Wide Straps");
            JLabel lblprice5 = new JLabel("PHP 550");
            lblprod5.setFont(newubuntu);
            lblprod5.setForeground(Color.decode("#000000"));
            lblprod5.setBounds(313, 555, 153, 36);
            lblprice5.setFont(newubuntu);
            lblprice5.setForeground(Color.decode("#000000"));
            lblprice5.setBounds(313, 570, 144, 36);
            backgroundLabel.add(lblprod5);
            backgroundLabel.add(lblprice5);

            JLabel lblprod6 = new JLabel("Black Cotton Hoodie");
            JLabel lblprice6 = new JLabel("PHP 1,899");
            lblprod6.setFont(newubuntu);
            lblprod6.setForeground(Color.decode("#000000"));
            lblprod6.setBounds(573,490, 134, 162);
            lblprice6.setFont(newubuntu);
            lblprice6.setForeground(Color.decode("#000000"));
            lblprice6.setBounds(573, 570, 144, 36);
            backgroundLabel.add(lblprod6);
            backgroundLabel.add(lblprice6);

            JLabel lblprod7 = new JLabel("WIDE-LEG MID-LENGTH JEANS");
            JLabel lblprice7 = new JLabel("PHP 1,490");
            lblprod7.setFont(newubuntu);
            lblprod7.setForeground(Color.decode("#000000"));
            lblprod7.setBounds(825, 495, 173, 163);
            lblprice7.setFont(newubuntu);
            lblprice7.setForeground(Color.decode("#000000"));
            lblprice7.setBounds(825, 575, 144, 36);
            backgroundLabel.add(lblprod7);
            backgroundLabel.add(lblprice7);

            JLabel lblprod8 = new JLabel("Canvas Painted Dress");
            JLabel lblprice8 = new JLabel("PHP 1,900");
            lblprod8.setFont(newubuntu);
            lblprod8.setForeground(Color.decode("#000000"));
            lblprod8.setBounds(1077, 495, 125, 163);
            lblprice8.setFont(newubuntu);
            lblprice8.setForeground(Color.decode("#000000"));
            lblprice8.setBounds(1077, 575, 144, 36);
            backgroundLabel.add(lblprod8);
            backgroundLabel.add(lblprice8);

            // edit the color for background !!
            JTextField txtSearch = new JTextField();
            txtSearch.setBounds(300, 14, 500, 40);
            txtSearch.setBackground(Color.decode("#000000"));
            txtSearch.setForeground(Color.WHITE);
            txtSearch.setBorder(BorderFactory.createLineBorder(Color.decode("#FFFFFF")));

            // Start with the cart buttons

            // 1st product
            JButton bttnCart = new JButton(smallCart);
            bttnCart.setBounds(435, 330, 21, 18);
            bttnCart.setBackground(Color.decode("#FFFFFF"));
            bttnCart.setForeground(Color.WHITE);
            bttnCart.setBorder(BorderFactory.createLineBorder(Color.decode("#FFFFFF")));
            bttnCart.addActionListener(new ActionListener() {
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

            //// 2nd product
            JButton bttnCart1 = new JButton(smallCart);
            bttnCart.setBounds(931, 330, 21, 18);
            bttnCart.setBackground(Color.decode("#FFFFFF"));
            bttnCart.setForeground(Color.WHITE);
            bttnCart.setBorder(BorderFactory.createLineBorder(Color.decode("#FFFFFF")));
            bttnCart.addActionListener(new ActionListener() {
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

            //3rd Product
            JButton bttnCart2 = new JButton(smallCart);
            bttnCart.setBounds(931, 330, 21, 18);
            bttnCart.setBackground(Color.decode("#FFFFFF"));
            bttnCart.setForeground(Color.WHITE);
            bttnCart.setBorder(BorderFactory.createLineBorder(Color.decode("#FFFFFF")));
            bttnCart.addActionListener(new ActionListener() {
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

            // 4th product
            JButton bttnCart3 = new JButton(smallCart);
            bttnCart.setBounds(1192, 330, 21, 18);
            bttnCart.setBackground(Color.decode("#FFFFFF"));
            bttnCart.setForeground(Color.WHITE);
            bttnCart.setBorder(BorderFactory.createLineBorder(Color.decode("#FFFFFF")));
            bttnCart.addActionListener(new ActionListener() {
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

            // 5th product
            JButton bttnCart4 = new JButton(smallCart);
            bttnCart.setBounds(425, 555, 21, 18);
            bttnCart.setBackground(Color.decode("#FFFFFF"));
            bttnCart.setForeground(Color.WHITE);
            bttnCart.setBorder(BorderFactory.createLineBorder(Color.decode("#FFFFFF")));
            bttnCart.addActionListener(new ActionListener() {
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

            // 6th product
            JButton bttnCart5 = new JButton(smallCart);
            bttnCart.setBounds(678, 555, 21, 18);
            bttnCart.setBackground(Color.decode("#FFFFFF"));
            bttnCart.setForeground(Color.WHITE);
            bttnCart.setBorder(BorderFactory.createLineBorder(Color.decode("#FFFFFF")));
            bttnCart.addActionListener(new ActionListener() {
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

            // 7th product
            JButton bttnCart6 = new JButton(smallCart);
            bttnCart.setBounds(931, 556, 21, 18);
            bttnCart.setBackground(Color.decode("#FFFFFF"));
            bttnCart.setForeground(Color.WHITE);
            bttnCart.setBorder(BorderFactory.createLineBorder(Color.decode("#FFFFFF")));
            bttnCart.addActionListener(new ActionListener() {
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

            // 8th product
            JButton bttnCart7 = new JButton(smallCart);
            bttnCart.setBounds(1177, 555, 21, 18);
            bttnCart.setBackground(Color.decode("#FFFFFF"));
            bttnCart.setForeground(Color.WHITE);
            bttnCart.setBorder(BorderFactory.createLineBorder(Color.decode("#FFFFFF")));
            bttnCart.addActionListener(new ActionListener() {
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
            backgroundLabel.add(txtSearch);
            backgroundLabel.add(bttnCart);
            backgroundLabel.add(bttnCart1);
            backgroundLabel.add(bttnCart2);
            backgroundLabel.add(bttnCart3);
            backgroundLabel.add(bttnCart4);
            backgroundLabel.add(bttnCart5);
            backgroundLabel.add(bttnCart6);
            backgroundLabel.add(bttnCart7);

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
