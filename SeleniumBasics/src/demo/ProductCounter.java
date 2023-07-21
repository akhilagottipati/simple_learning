package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductCounter {
	 public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/ecommerce"; // Replace with your DB URL
	        String user = "root"; // Replace with your DB username
	        String password = "Akhila@546"; // Replace with your DB password

	        String productType = "Type B"; // The product type you want to count (e.g., "Type 1")

	        try (Connection connection = DriverManager.getConnection(url, user, password)) {
	            String query = "SELECT COUNT(*) AS productCount FROM products WHERE Product_Type = ?";
	            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	                preparedStatement.setString(1, productType);

	                try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                    if (resultSet.next()) {
	                        int count = resultSet.getInt("productCount");
	                        System.out.println("Number of products with type '" + productType + "': " + count);
	                    } else {
	                        System.out.println("No products found with type '" + productType + "'.");
	                    }
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	 }
}

