import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ViewProduct extends JFrame {
    public ViewProduct() {

        setTitle("Profile");
        setSize(600, 1050);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        //try {
        ImageIcon bg = new ImageIcon(getClass().getResource("/images/profile/bg.png"));
        JLabel imageLabel = new JLabel();
        JLabel imgBg = new JLabel(bg);
        imgBg.setBounds(0, 0, bg.getIconWidth(), bg.getIconHeight());

        add(imgBg);



        setLayout(null);

        //} catch (IOException e) {
        //e.printStackTrace();
        // }

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ViewProduct viewproduct = new ViewProduct();
            viewproduct.setVisible(true);
        });
    }
}