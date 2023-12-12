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
        ImageIcon page2 = new ImageIcon(getClass().getResource("/images/products/page2.png"));

        product7 = new ImageIcon(getClass().getResource("/images/products/phone/phone1.png"));
        product8 = new ImageIcon(getClass().getResource("/images/products/phone/phone2.png"));
        product9 = new ImageIcon(getClass().getResource("/images/products/phone/phone3.png"));

        product10 = new ImageIcon(getClass().getResource("/images/products/earphones/earphones1.png"));
        product11 = new ImageIcon(getClass().getResource("/images/products/earphones/earphones2.png"));
        product12 = new ImageIcon(getClass().getResource("/images/products/earphones/earphones3.png"));

        product13 = new ImageIcon(getClass().getResource("/images/products/laptop/laptop1.png"));
        product14 = new ImageIcon(getClass().getResource("/images/products/laptop/laptop2.png"));
        product15 = new ImageIcon(getClass().getResource("/images/products/laptop/laptop3.png"));

        JButton btnBack = new JButton("");
        btnBack.setBounds(23, 34, 37, 37);

        btnBack.setOpaque(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setBorderPainted(false);


        JLabel ImgText2 = new JLabel(page2);
        ImgText2.setBounds(55, 343,page2.getIconWidth(), page2.getIconHeight());

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
        btn1.setBounds(218, 897, 50, 50);

        JButton btn2 = new JButton("2");
        btn2.setBounds(283, 897, 50, 50);

        JButton btn3 = new JButton("3");
        btn3.setBounds(348, 897, 50, 50);


        JButton btnProduct7 = new JButton("");
        btnProduct7.setBounds(27, 168, 166, 166);
        btnProduct7.setOpaque(false);
        btnProduct7.setContentAreaFilled(false);
        btnProduct7.setBorderPainted(false);

        JButton btnProduct8 = new JButton("");
        btnProduct8.setBounds(217, 168, 166, 166);
        btnProduct8.setOpaque(false);
        btnProduct8.setContentAreaFilled(false);
        btnProduct8.setBorderPainted(false);

        JButton btnProduct9 = new JButton("");
        btnProduct9.setBounds(407, 168, 166, 166);
        btnProduct9.setOpaque(false);
        btnProduct9.setContentAreaFilled(false);
        btnProduct9.setBorderPainted(false);

        JButton btnProduct10 = new JButton("");
        btnProduct10.setBounds(27, 396, 166, 166);
        btnProduct10.setOpaque(false);
        btnProduct10.setContentAreaFilled(false);
        btnProduct10.setBorderPainted(false);

        JButton btnProduct11 = new JButton("");
        btnProduct11.setBounds(217, 396, 166, 166);
        btnProduct11.setOpaque(false);
        btnProduct11.setContentAreaFilled(false);
        btnProduct11.setBorderPainted(false);

        JButton btnProduct12 = new JButton("");
        btnProduct12.setBounds(407, 396, 166, 166);
        btnProduct12.setOpaque(false);
        btnProduct12.setContentAreaFilled(false);
        btnProduct12.setBorderPainted(false);

        JButton btnProduct13 = new JButton("");
        btnProduct13.setBounds(27, 620, 166, 166);
        btnProduct13.setOpaque(false);
        btnProduct13.setContentAreaFilled(false);
        btnProduct13.setBorderPainted(false);

        JButton btnProduct14 = new JButton("");
        btnProduct14.setBounds(217, 620, 166, 166);
        btnProduct14.setOpaque(false);
        btnProduct14.setContentAreaFilled(false);
        btnProduct14.setBorderPainted(false);

        JButton btnProduct15 = new JButton("");
        btnProduct15.setBounds(407, 620, 166, 166);
        btnProduct15.setOpaque(false);
        btnProduct15.setContentAreaFilled(false);
        btnProduct15.setBorderPainted(false);



        add(btn1);
        add(btn2);
        add(btn3);
        add(btnBack);
        add(btnProduct7);
        add(btnProduct8);
        add(btnProduct9);
        add(btnProduct10);
        add(btnProduct11);
        add(btnProduct12);
        add(btnProduct13);
        add(btnProduct14);
        add(btnProduct15);

        add(ImgText2);
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


        btnProduct7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu1.id=7;
                setVisible(false);
                ViewProduct viewproduct = new ViewProduct();
                viewproduct.setVisible(true);
            }
        });

        btnProduct8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu1.id=8;
                setVisible(false);
                ViewProduct viewproduct = new ViewProduct();
                viewproduct.setVisible(true);

            }
        });

        btnProduct9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu1.id=9;
                setVisible(false);
                ViewProduct viewproduct = new ViewProduct();
                viewproduct.setVisible(true);

            }
        });

        btnProduct10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu1.id=10;
                setVisible(false);
                ViewProduct viewproduct = new ViewProduct();
                viewproduct.setVisible(true);

            }
        });

        btnProduct11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu1.id=11;

                setVisible(false);
                ViewProduct viewproduct = new ViewProduct();
                viewproduct.setVisible(true);

            }
        });

        btnProduct12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu1.id=12;

                setVisible(false);
                ViewProduct viewproduct = new ViewProduct();
                viewproduct.setVisible(true);

            }
        });

        btnProduct13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu1.id=13;
                setVisible(false);
                ViewProduct viewproduct = new ViewProduct();
                viewproduct.setVisible(true);

            }
        });

        btnProduct14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu1.id=14;
                setVisible(false);

                ViewProduct viewproduct = new ViewProduct();
                viewproduct.setVisible(true);

            }
        });

        btnProduct15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu1.id=15;

                setVisible(false);
                ViewProduct viewproduct = new ViewProduct();
                viewproduct.setVisible(true);

            }
        });



        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Profile profile = new Profile();
                profile.setVisible(true);

            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Menu1 menu1 = new Menu1();
                menu1.setVisible(true);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Menu2 menu2 = new Menu2();
                menu2.setVisible(true);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Menu3 menu3 = new Menu3();
                menu3.setVisible(true);
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
