import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class Cart extends JFrame {
    String DATABASE_URL = "jdbc:sqlite:src/main/resources/database/database.db";



    public Cart() {

        setTitle("Cart");
        setSize(600, 1050);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ImageIcon back = new ImageIcon(getClass().getResource("/images/checkout/ShoppingBack.png"));
        ImageIcon checkout = new ImageIcon(getClass().getResource("/images/checkout/Checkout.png"));


        JLabel imgBack = new JLabel(back);
        imgBack.setBounds(27, 36, 260, 53);



        JLabel imgCheckout = new JLabel(checkout);
        imgCheckout.setBounds(70, 908, 446, 60);


        JButton btnBack = new JButton("");
        btnBack.setBounds(27, 45, 40, 40);

        btnBack.setOpaque(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setBorderPainted(false);

        JButton btnCheckout = new JButton("");
        btnCheckout.setBounds(70, 908, 446, 60);

        btnCheckout.setOpaque(false);
        btnCheckout.setContentAreaFilled(false);
        btnCheckout.setBorderPainted(false);

        add(imgBack);
        add(btnBack);
        add(imgCheckout);
        add(btnCheckout);


        setLayout(null);

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Profile profile = new Profile();
                profile.setVisible(true);

            }
        });

        btnCheckout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Establish a connection to the database
                    Connection conn = DriverManager.getConnection(DATABASE_URL);

                    // Prepare the SQL query to fetch all data from the "cart" table
                    String selectAllCartItemsQuery = "SELECT * FROM cart";

                    try (PreparedStatement cartItemsStatement = conn.prepareStatement(selectAllCartItemsQuery)) {
                        // Execute the query to get all cart items
                        ResultSet cartItemsResultSet = cartItemsStatement.executeQuery();

                        // Process the result set and create a StringBuilder
                        StringBuilder checkoutBuilder = new StringBuilder();
                        int TotalOrder = 0;
                        while (cartItemsResultSet.next()) {
                            int qty = cartItemsResultSet.getInt("quantity");
                            String product = cartItemsResultSet.getString("product");
                            String price = cartItemsResultSet.getString("price");

                            int intPrice = Integer.parseInt(price);

                            checkoutBuilder.append("Product:  ").append(product).append("\n");
                            checkoutBuilder.append("Quantity: ").append(qty).append("\n");
                            checkoutBuilder.append("Price:    ").append(price).append("\n");
                            int total = (int) (intPrice * qty);
                            checkoutBuilder.append("Total Price = ").append(total).append("\n");
                            checkoutBuilder.append("\n");



                            TotalOrder += total;
                        }

                        checkoutBuilder.append("Total Order: " + TotalOrder);

                        // Display the receipt
                        JOptionPane.showMessageDialog(null, checkoutBuilder.toString(), "Receipt", JOptionPane.INFORMATION_MESSAGE);

                        // After displaying the receipt, delete all items from the cart
                        String deleteAllCartItemsQuery = "DELETE FROM cart";
                        try (PreparedStatement deleteStatement = conn.prepareStatement(deleteAllCartItemsQuery)) {
                            // Execute the delete query
                            deleteStatement.executeUpdate();
                        }
                    }

                    // Close the connection
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });



    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Cart cart = new Cart();
            cart.setVisible(true);
        });
    }
}
