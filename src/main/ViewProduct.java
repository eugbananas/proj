import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import java.sql.*;


public class ViewProduct extends JFrame {

    String DATABASE_URL = "jdbc:sqlite:src/main/resources/database/database.db";


    private String product_name;
    private String directory;
    private int review =2;
    private String price = "150";
    private String description = ("Description Description Description Description Description Description Description Description Description Description Description Description ");

    private int productId = Menu1.id;
    Connection conn = null;



    public ViewProduct() {

        setTitle("Profile");
        setSize(600, 1050);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);


        try {
            conn = DriverManager.getConnection(DATABASE_URL);

            String selectQuery = "SELECT product_name, directory, rating, price, description FROM products WHERE product_id = ?";

            try (PreparedStatement preparedStatement = conn.prepareStatement(selectQuery)) {
                preparedStatement.setInt(1, productId);
                ResultSet resultSet = preparedStatement.executeQuery();

                // Process the result set
                if (resultSet.next()) {
                    directory = resultSet.getString("directory");
                    review = resultSet.getInt("rating");
                    price = resultSet.getString("price");
                    description = resultSet.getString("description");
                    product_name = resultSet.getString("product_name");

                }
            }

            // Close the connection
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        //try {
        ImageIcon bg = new ImageIcon(getClass().getResource("/images/profile/bg.png"));
        ImageIcon back = new ImageIcon(getClass().getResource("/images/navigator/back.png"));
        ImageIcon productImage = new ImageIcon(getClass().getResource("/images/products/viewproduct/view.png"));

        if (directory != null) {
            productImage = new ImageIcon(getClass().getResource(directory));



        } else {
            // Handle the case where directory is null
        }


        JLabel imageLabel = new JLabel();
        JLabel imgBg = new JLabel(bg);
        imgBg.setBounds(0, 0, bg.getIconWidth(), bg.getIconHeight());
        JLabel imgProduct = new JLabel(productImage);
        imgProduct.setBounds(27, 91, 240,356);


        JLabel imgBack = new JLabel(back);
        imgBack.setBounds(27, 34, 211, 37);

        JLabel imgReview = new JLabel();
        imgReview.setBounds(276, 133, 92, 16);
        imgReview.setIcon(getReviewImage(review));


        JButton btnBack = new JButton("");
        btnBack.setBounds(23, 34, 37, 37);

        btnBack.setOpaque(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setBorderPainted(false);

        JButton btnAdd = new JButton("Add to Cart");
        btnAdd.setBounds(440, 419, 140, 35);

        JButton btnPlus = new JButton("+");
        btnPlus.setBounds(384, 419, 40, 35);

        JButton btnMinus = new JButton("-");
        btnMinus.setBounds(289, 419, 40, 35);

        btnPlus.setFont(new Font("Arial", Font.PLAIN, 10));

        btnMinus.setFont(new Font("Arial", Font.PLAIN, 10));

        JLabel lblQty = new JLabel("1");
        lblQty.setBounds(350,430,20, 15);
        lblQty.setFont(new Font("Arial", Font.PLAIN, 15));

        JLabel lblReview = new JLabel(String.valueOf(review));
        lblReview.setBounds(372,135,42, 16);
        lblReview.setFont(new Font("Arial", Font.PLAIN, 16));

        JLabel lblReview2 = new JLabel(String.valueOf("/5"));
        lblReview2.setBounds(381,135,42, 16);
        lblReview2.setFont(new Font("Arial", Font.PLAIN, 16));


        JLabel lblPeso = new JLabel("₱");
        lblPeso.setBounds(276,163,15, 23);
        lblPeso.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel lblPrice = new JLabel(String.valueOf(price));
        lblPrice.setBounds(294,163,130, 23);
        lblPrice.setFont(new Font("Arial", Font.BOLD, 20));


        JTextArea lblDescription = new JTextArea(description);
        lblDescription.setBounds(276,191,315,152);
        lblDescription.setLineWrap(true);
        lblDescription.setWrapStyleWord(true);
        lblDescription.setEditable(false);



        JLabel lblProductName = new JLabel("PRODUCT NAME");
        lblProductName.setBounds(276,91,315, 29);
        lblProductName.setFont(new Font("Arial", Font.BOLD, 30));

        lblProductName.setText(product_name);

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the current text, convert to integer, increment, and set the new text
                int currentValue = Integer.parseInt(lblQty.getText());
                lblQty.setText(String.valueOf(currentValue + 1));
            }
        });

        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the current text, convert to integer, increment, and set the new text
                int currentValue = Integer.parseInt(lblQty.getText());
                lblQty.setText(String.valueOf(currentValue + -1));
            }
        });


        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Menu1 menu1 = new Menu1();
                menu1.setVisible(true);
            }
        });




        add(btnBack);
        add(imgBack);
        add(lblReview);
        add(lblReview2);
        add(lblDescription);
        add(imgReview);
        add(lblProductName);
        add(lblQty);
        add(btnPlus);
        add(btnMinus);
        add(imgProduct);
        add(btnAdd);

        add(lblPeso);
        add(lblPrice);
        add(imgBg);




        setLayout(null);

        //} catch (IOException e) {
        //e.printStackTrace();
        // }

    }

    private static ImageIcon getReviewImage(int reviewRating) {
        ImageIcon fiveStar = new ImageIcon(ReviewImageSetter.class.getResource("/images/products/review/5star.png"));
        ImageIcon fourStar = new ImageIcon(ReviewImageSetter.class.getResource("/images/products/review/4star.png"));
        ImageIcon threeStar = new ImageIcon(ReviewImageSetter.class.getResource("/images/products/review/3star.png"));
        ImageIcon twoStar = new ImageIcon(ReviewImageSetter.class.getResource("/images/products/review/2star.png"));
        ImageIcon oneStar = new ImageIcon(ReviewImageSetter.class.getResource("/images/products/review/1star.png"));
        ImageIcon zeroStar = new ImageIcon(ReviewImageSetter.class.getResource("/images/products/review/0star.png"));

        switch (reviewRating) {
            case 5:
                return fiveStar;
            case 4:
                return fourStar;
            case 3:
                return threeStar;
            case 2:
                return twoStar;
            case 1:
                return oneStar;
            case 0:
                return zeroStar;
            default:
                // Handle other cases if needed
                return null;
        }
    }

    public class ReviewImageSetter {

        public static void setReviewImage(int reviewRating, JLabel imgReview) {
            ImageIcon fiveStar = new ImageIcon(ReviewImageSetter.class.getResource("/images/products/review/5star.png"));
            ImageIcon fourStar = new ImageIcon(ReviewImageSetter.class.getResource("/images/products/review/4star.png"));
            ImageIcon threeStar = new ImageIcon(ReviewImageSetter.class.getResource("/images/products/review/3star.png"));
            ImageIcon twoStar = new ImageIcon(ReviewImageSetter.class.getResource("/images/products/review/2star.png"));
            ImageIcon oneStar = new ImageIcon(ReviewImageSetter.class.getResource("/images/products/review/1star.png"));
            ImageIcon zeroStar = new ImageIcon(ReviewImageSetter.class.getResource("/images/products/review/0star.png"));

            switch (reviewRating) {
                case 5:
                    imgReview.setIcon(fiveStar);
                    break;
                case 4:
                    imgReview.setIcon(fourStar);
                    break;
                case 3:
                    imgReview.setIcon(threeStar);
                    break;
                case 2:
                    imgReview.setIcon(twoStar);
                    break;
                case 1:
                    imgReview.setIcon(oneStar);
                    break;
                case 0:
                    imgReview.setIcon(zeroStar);
                    break;
                default:
                    // Handle other cases if needed
                    break;
            }
        }
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ViewProduct viewproduct = new ViewProduct();
            viewproduct.setVisible(true);
        });
    }
}