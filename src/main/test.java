import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class test {



    public static void main(String[] args) {

        String DATABASE_URL = "jdbc:sqlite:src/main/resources/database/database.db";

        Connection conn = null;


        String directory = null;
        int review =2;
        String price = "150";
        String description = ("Description Description Description Description Description Description Description Description Description Description Description Description ");




        try {
            conn = DriverManager.getConnection(DATABASE_URL);

            // Assuming 'id' is the product ID you want to retrieve
            int productId = 5; // Replace with the actual product ID

            String selectQuery = "SELECT directory, rating, price, description FROM products WHERE product_id = ?";

            try (PreparedStatement preparedStatement = conn.prepareStatement(selectQuery)) {
                preparedStatement.setInt(1, productId);
                ResultSet resultSet = preparedStatement.executeQuery();

                // Process the result set
                if (resultSet.next()) {
                    directory = resultSet.getString("directory");
                    review = resultSet.getInt("rating");
                    price = resultSet.getString("price");
                    description = resultSet.getString("description");
                }
            }

            // Close the connection
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        System.out.println(directory + "\n" + review  +"\n"+ price + "\n" + description);





    }
}
