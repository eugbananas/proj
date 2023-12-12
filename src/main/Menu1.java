import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menu1 extends JFrame {
    public Menu1() {
        setTitle("Menu");
        setSize(600, 1050);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        ImageIcon bg = new ImageIcon(getClass().getResource("/images/profile/bg.png"));
        ImageIcon large = new ImageIcon(getClass().getResource("/images/menu/large.png"));
        ImageIcon small1 = new ImageIcon(getClass().getResource("/images/menu/small1.png"));
        ImageIcon small2 = new ImageIcon(getClass().getResource("/images/menu/small2.png"));
        ImageIcon back = new ImageIcon(getClass().getResource("/images/navigator/back.png"));
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/navigator/logo.png"));
        ImageIcon product1 = new ImageIcon(getClass().getResource("/images/menu/product1.png"));
        ImageIcon product2 = new ImageIcon(getClass().getResource("/images/menu/product2.png"));
        ImageIcon product3 = new ImageIcon(getClass().getResource("/images/menu/product3.png"));
        ImageIcon product4 = new ImageIcon(getClass().getResource("/images/menu/product4.png"));
        ImageIcon product5 = new ImageIcon(getClass().getResource("/images/menu/product5.png"));
        ImageIcon product6 = new ImageIcon(getClass().getResource("/images/menu/product6.png"));
        ImageIcon page1 = new ImageIcon(getClass().getResource("/images/products/page1.png"));

        large = new ImageIcon(getClass().getResource("/images/products/large.png"));
        small1 = new ImageIcon(getClass().getResource("/images/products/small.png"));
        small2 = new ImageIcon(getClass().getResource("/images/products/small2.png"));

        product1 = new ImageIcon(getClass().getResource("/images/products/tops/top1.png"));
        product2 = new ImageIcon(getClass().getResource("/images/products/tops/top2.png"));
        product3 = new ImageIcon(getClass().getResource("/images/products/tops/top3.png"));

        product4 = new ImageIcon(getClass().getResource("/images/products/bottoms/bottoms1.png"));
        product5 = new ImageIcon(getClass().getResource("/images/products/bottoms/bottoms2.png"));
        product6 = new ImageIcon(getClass().getResource("/images/products/bottoms/bottoms3.png"));



        JLabel imgProduct1 = new JLabel(product1);
        imgProduct1.setBounds(27, 396, 166, 166);

        JLabel imgText = new JLabel(page1);
        imgText.setBounds(6, 241,page1.getIconWidth(), page1.getIconHeight());

        JLabel imgProduct2 = new JLabel(product2);
        imgProduct2.setBounds(217, 396, 166, 166);

        JLabel imgProduct3 = new JLabel(product3);
        imgProduct3.setBounds(407, 396, 166, 166);

        JLabel imgProduct4 = new JLabel(product4);
        imgProduct4.setBounds(27, 620, 166, 166);

        JLabel imgProduct5 = new JLabel(product5);
        imgProduct5.setBounds(217, 620, 166, 166);

        JLabel imgProduct6 = new JLabel(product6);
        imgProduct6.setBounds(407, 620, 166, 166);



        JLabel imgBg = new JLabel(bg);
        imgBg.setBounds(0, 0, 600, 1050);

        JLabel imgLogo = new JLabel(logo);
        imgLogo.setBounds(27, 88, 135, 45);

        JLabel imgLarge = new JLabel(large);
        imgLarge.setBounds(193, 156, 356, 182);

        JLabel imgBack = new JLabel(back);
        imgBack.setBounds(27, 34, 211, 37);


        JLabel imgSmall2 = new JLabel(small2);
        imgSmall2.setBounds(27, 263, 134, 75);

        JLabel imgSmall1 = new JLabel(small1);
        imgSmall1.setBounds(27, 163, 134, 75);


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

        add(imgText);
        add(imgProduct1);
        add(imgProduct2);
        add(imgProduct3);
        add(imgProduct4);
        add(imgProduct5);
        add(imgProduct6);

        add(imgLogo);
        add(imgBack);
        add(imgLarge);
        add(imgSmall1);
        add(imgSmall2);
        add(imgBg);

        setLayout(null);

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Menu2 menu2 = new Menu2();
                menu2.setVisible(true);
            }
        });
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Menu1 menu1 = new Menu1();
            menu1.setVisible(true);
        });
    }
}
