import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{

    public Menu(){

        setTitle("Menu");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextField txtSearch = new JTextField();
        txtSearch.setBounds(210, 347, 402, 51);
        txtSearch.setBackground(Color.decode("#3B4252"));
        txtSearch.setForeground(Color.WHITE);
        txtSearch.setBorder(BorderFactory.createLineBorder(Color.decode("#3B4252")));


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Menu menu = new Menu();
            menu.setVisible(true);
        });
    }

}