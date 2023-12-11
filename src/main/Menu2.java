import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menu2 extends JFrame {
    public Menu2() {
        setTitle("Menu");
        setSize(600, 1050);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        ImageIcon bg = new ImageIcon(getClass().getResource("/images/profile/bg.png"));
        ImageIcon back = new ImageIcon(getClass().getResource("/images/navigator/back.png"));
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/navigator/logo.png"));
        ImageIcon product7 = new ImageIcon(getClass().getResource("/images/menu/product7.png"));
        ImageIcon product8 = new ImageIcon(getClass().getResource("/images/menu/product8.png"));
        ImageIcon product9 = new ImageIcon(getClass().getResource("/images/menu/product9.png"));
        ImageIcon product10 = new ImageIcon(getClass().getResource("/images/menu/product10.png"));
        ImageIcon product11 = new ImageIcon(getClass().getResource("/images/menu/product11.png"));
        ImageIcon product12 = new ImageIcon(getClass().getResource("/images/menu/product12.png"));
        ImageIcon product13 = new ImageIcon(getClass().getResource("/images/menu/product13.png"));
        ImageIcon product14 = new ImageIcon(getClass().getResource("/images/menu/product14.png"));
        ImageIcon product15 = new ImageIcon(getClass().getResource("/images/menu/product15.png"));

        JLabel imgProduct7 = new JLabel(product7);
        imgProduct7.setBounds(27, 168, 166, 166);

        JLabel imgProduct8 = new JLabel(product8);
        imgProduct8.setBounds(217, 168, 166, 166);

        JLabel imgProduct9 = new JLabel(product9);
        imgProduct9.setBounds(407, 168, 166, 166);

        JLabel imgProduct10 = new JLabel(product10);
        imgProduct10.setBounds(27, 396, 166, 166);

        JLabel imgProduct11 = new JLabel(product11);
        imgProduct11.setBounds(217, 396, 166, 166);

        JLabel imgProduct12 = new JLabel(product12);
        imgProduct12.setBounds(407, 396, 166, 166);

        JLabel imgProduct13 = new JLabel(product13);
        imgProduct13.setBounds(27, 620, 166, 166);

        JLabel imgProduct14 = new JLabel(product14);
        imgProduct14.setBounds(217, 620, 166, 166);

        JLabel imgProduct15 = new JLabel(product15);
        imgProduct15.setBounds(407, 620, 166, 166);

        JLabel imgBg = new JLabel(bg);
        imgBg.setBounds(0, 0, 600, 1050);

        JLabel imgLogo = new JLabel(logo);
        imgLogo.setBounds(27, 88, 135, 45);

        JLabel imgBack = new JLabel(back);
        imgBack.setBounds(27, 34, 211, 37);


        JButton btn1 = new JButton("1");
        btn1.setBounds(153, 959, 50, 50);

        JButton btn2 = new JButton("2");
        btn2.setBounds(218, 959, 50, 50);

        JButton btn3 = new JButton("3");
        btn3.setBounds(283, 959, 50, 50);

        JButton btn4 = new JButton("4");
        btn4.setBounds(348, 959, 50, 50);

        JButton btn5 = new JButton("5");
        btn5.setBounds(413, 959, 50, 50);

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);

        add(imgProduct7);
        add(imgProduct8);
        add(imgProduct9);
        add(imgProduct10);
        add(imgProduct11);
        add(imgProduct12);
        add(imgProduct13);
        add(imgProduct14);
        add(imgProduct15);

        add(imgLogo);
        add(imgBack);
        add(imgBg);

        setLayout(null);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Menu1 menu1 = new Menu1();
                menu1.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Menu2 menu2 = new Menu2();
            menu2.setVisible(true);
        });
    }
}
