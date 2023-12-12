import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AccountInfo extends JFrame {
    private String userId = Login.id;
    private String selectedGender;

    String DATABASE_URL = "jdbc:sqlite:src/main/resources/database/database.db";
    public AccountInfo() {

        setTitle("Profile");
        setSize(600, 1050);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        //try {
        ImageIcon bg = new ImageIcon(getClass().getResource("/images/profile/bg.png"));
        ImageIcon header1 = new ImageIcon(getClass().getResource("/images/userinfo/header.png"));

        JLabel imgHeader1 = new JLabel(header1);
        imgHeader1.setBounds(27, 45, header1.getIconWidth(), header1.getIconHeight());

        JLabel imgBg = new JLabel(bg);
        imgBg.setBounds(0, 0, bg.getIconWidth(), bg.getIconHeight());

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(227, 538, 146, 47);

        JTextField txtUsername = new JTextField();
        txtUsername.setBounds(189, 175, 288, 24);

        JTextField txtName = new JTextField();
        txtName.setBounds(189, 224, 288, 24);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(189, 273, 288, 24);

        JTextField txtPhone = new JTextField();
        txtPhone.setBounds(189, 322, 288, 24);

        String[] yearItems = new String[73]; // Adjust the size as needed
        int currentYear = 1950;
        for (int i = 0; i < yearItems.length; i++) {
            yearItems[i] = String.valueOf(currentYear + i);
        }

        String[] dayItems = new String[31];
        for (int i = 0; i < dayItems.length; i++) {
            dayItems[i] = String.valueOf(i + 1);
        }

        String[] monthItems = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


        JComboBox<String> cmbMonth = createComboBox(monthItems, 200, 421);
        JComboBox<String> cmbYear = createComboBox(yearItems, 432, 421);
        JComboBox<String> cmbDay = createComboBox(dayItems, 316, 421);

        JRadioButton radioMale = new JRadioButton("Male");
        radioMale.setBounds(208, 372, 60, 25);

        JRadioButton radioFemale = new JRadioButton("Female");
        radioFemale.setBounds(369, 372, 80, 25);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radioMale);
        genderGroup.add(radioFemale);

        // ActionListener for radio buttons (if needed)
        // ActionListener for radio buttons
        ActionListener genderListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedGender = ((JRadioButton) e.getSource()).getText();
            }
        };

        btnSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedMonth = (String) cmbMonth.getSelectedItem();
                String selectedYear = (String) cmbYear.getSelectedItem();
                String selectedDay = (String) cmbDay.getSelectedItem();

                // Combine into a single string
                String combinedDate = selectedMonth + " " + selectedDay + ", " + selectedYear;
                String username = txtUsername.getText();
                String name = txtName.getText();
                String email = txtEmail.getText();
                String phone = txtPhone.getText();


                updateUserInfo(username,name,email,phone,combinedDate);


            }
        });


        radioMale.addActionListener(genderListener);
        radioFemale.addActionListener(genderListener);


        add(cmbMonth);
        add(cmbYear);
        add(cmbDay);
        add(radioMale);
        add(radioFemale);
        add(btnSave);

        add(imgHeader1);
        add(imgBg);



        add(txtName);
        add(txtEmail);
        add(txtPhone);
        add(txtUsername);


        setLayout(null);



        //} catch (IOException e) {
        //e.printStackTrace();
        // }

    }

    private static JComboBox<String> createComboBox(String[] items, int x, int y) {
        // Create a DefaultComboBoxModel with the array of items
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(items);

        // Create a JComboBox with the DefaultComboBoxModel
        JComboBox<String> comboBox = new JComboBox<>(comboBoxModel);

        // Set the bounds (location and size) of the JComboBox
        comboBox.setBounds(x, y, 95, 25);

        return comboBox;
    }


    private void updateUserInfo(String username, String name, String email, String phone, String birthday) {
        try (Connection connection = DriverManager.getConnection(DATABASE_URL)) {
            String updateQuery = "UPDATE users SET username=?, name=?, email=?, phonenumber=?, birthday=? WHERE id=?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, email);
                preparedStatement.setString(4, phone);
                preparedStatement.setString(5, birthday);
                preparedStatement.setString(6, userId);

                int affectedRows = preparedStatement.executeUpdate();
                if (affectedRows > 0) {
                    JOptionPane.showMessageDialog(null, "User information updated successfully!");

                } else {
                    JOptionPane.showMessageDialog(null, "Failed to update user information!");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private String getUserIdFromDatabase() {
        // Use the userId from the Login class
        return userId;
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AccountInfo accountInfo = new AccountInfo();
            accountInfo.setVisible(true);
        });
    }
}