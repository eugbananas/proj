import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cart extends JFrame {
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

        JLabel lblBillDetails = new JLabel("Billing Details");
        lblBillDetails.setBounds(39, 598, 138, 27);
        lblBillDetails.setFont(new Font("Arial", Font.BOLD, 18));
        lblBillDetails.setForeground(Color.decode("#303733"));

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

        add(lblBillDetails);
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
