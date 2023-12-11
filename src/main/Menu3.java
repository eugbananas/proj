import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menu3 extends JFrame {
    public Menu3() {
        setTitle("Menu");
        setSize(600, 1050);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        ImageIcon bg = new ImageIcon(getClass().getResource("/images/profile/bg.png"));
        ImageIcon back = new ImageIcon(getClass().getResource("/images/navigator/back.png"));
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/navigator/logo.png"));
        ImageIcon product16 = new ImageIcon(getClass().getResource("/images/menu/product16.png"));
        ImageIcon product17 = new ImageIcon(getClass().getResource("/images/menu/product17.png"));
        ImageIcon product18 = new ImageIcon(getClass().getResource("/images/menu/product18.png"));
        ImageIcon product19 = new ImageIcon(getClass().getResource("/images/menu/product19.png"));
        ImageIcon product20 = new ImageIcon(getClass().getResource("/images/menu/product20.png"));
        ImageIcon product21 = new ImageIcon(getClass().getResource("/images/menu/product21.png"));
        ImageIcon product22 = new ImageIcon(getClass().getResource("/images/menu/product22.png"));
        ImageIcon product23 = new ImageIcon(getClass().getResource("/images/menu/product23.png"));
        ImageIcon product24 = new ImageIcon(getClass().getResource("/images/menu/product24.png"));

        JLabel imgProduct16 = new JLabel(product16);
        imgProduct16.setBounds(27, 168, 166, 166);

        JLabel imgProduct17 = new JLabel(product17);
        imgProduct17.setBounds(217, 168, 166, 166);

        JLabel imgProduct18 = new JLabel(product18);
        imgProduct18.setBounds(407, 168, 166, 166);

        JLabel imgProduct19 = new JLabel(product19);
        imgProduct19.setBounds(27, 396, 166, 166);

        JLabel imgProduct20 = new JLabel(product20);
        imgProduct20.setBounds(217, 396, 166, 166);

        JLabel imgProduct21 = new JLabel(product21);
        imgProduct21.setBounds(407, 396, 166, 166);

        JLabel imgProduct22 = new JLabel(product22);
        imgProduct22.setBounds(27, 620, 166, 166);

        JLabel imgProduct23 = new JLabel(product23);
        imgProduct23.setBounds(217, 620, 166, 166);

        JLabel imgProduct24 = new JLabel(product24);
        imgProduct24.setBounds(407, 620, 166, 166);

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

        add(imgProduct16);
        add(imgProduct17);
        add(imgProduct18);
        add(imgProduct19);
        add(imgProduct20);
        add(imgProduct21);
        add(imgProduct22);
        add(imgProduct23);
        add(imgProduct24);

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
            Menu3 menu3 = new Menu3();
            menu3.setVisible(true);
        });
    }
}
