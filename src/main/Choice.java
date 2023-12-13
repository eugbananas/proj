import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.sql.*;

public class Choice extends JFrame {

    public Choice() {

        setTitle("Profile");
        setSize(420, 306);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        ImageIcon text = new ImageIcon(getClass().getResource("/images/menu/text.png"));

        JLabel imgText = new JLabel(text);
        imgText.setBounds(75, 28, 239, 87);

        JButton btn1 = new JButton("Shop");
        btn1.setBounds(75, 184, 100, 35);

        JButton btn2 = new JButton("Orders");
        btn2.setBounds(250, 184, 100, 35);


        add(imgText);
        add(btn1);
        add(btn2);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Profile profile = new Profile();
                profile.setVisible(true);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new main.OrderPage().setVisible(true);

            }
        });

    }

    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.setVisible(true);
    }

}