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

public class FoodOrDelivery extends JFrame {
    String DATABASE_URL = "jdbc:sqlite:src/main/resources/database/database.db";



    public FoodOrDelivery() {

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


            public static void main(String[] args) {
                SwingUtilities.invokeLater(() -> {
                    FoodOrDelivery fod = new FoodOrDelivery();
                    fod.setVisible(true);
                });
            }
        });
    }}