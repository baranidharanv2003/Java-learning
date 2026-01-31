package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class preparedStatement {
   // Database connection details
   private static final String URL = "jdbc:mysql://localhost:3306/vsbkarur";
   private static final String USER = "root";
   private static final String PASSWORD = "132003";

   public static Connection getConnection() throws SQLException {
       return DriverManager.getConnection(URL, USER, PASSWORD);
   }

   // Create
   public static void createRecord() {
       String sql = "INSERT INTO seg (name, Rack, shelf,products,quantity) VALUES (?, ?, ? ,? ,?)";
       try (Connection connection = getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

           preparedStatement.setString(1, "B");  // Set value for name
           preparedStatement.setString(2, "B-2"); // Set value for rack
           preparedStatement.setString(3, "B-2-Juice");   // Set value for shelf
           preparedStatement.setString(4, "Paper-Boat"); //set value for products
           preparedStatement.setInt(5, 25); // set value for quantity
           int rowsAffected = preparedStatement.executeUpdate();
           System.out.println("Record inserted successfully. Rows affected: " + rowsAffected);

       } catch (SQLException e) {
           e.printStackTrace();
       }
   }

   // Read
   public static void readRecords() {
       String sql = "SELECT * FROM sec";

       try (Connection connection = getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery()) {

           while (resultSet.next()) {
               String name = resultSet.getString("name");
               String Rack = resultSet.getString("Rack");
               String shelf = resultSet.getString("shelf");
               String products = resultSet.getString("products");
               int quantity = resultSet.getInt("quantity");

               System.out.println("name " + name + ", Rack: " + Rack + ", Shelf: " + shelf + ", products: " + products + ", quantity: " + quantity);
           }

       } catch (SQLException e) {
           e.printStackTrace();
       }
   }

   // Update
   public static void updateRecord() {
       String sql = "UPDATE section SET quantity = ? WHERE name = ?";
       try (Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

           preparedStatement.setInt(1, 30);  // Set new quantity
           preparedStatement.setString(2, "A"); // Set name for the record to update

           int rowsAffected = preparedStatement.executeUpdate();
           System.out.println("Record updated successfully. Rows affected: " + rowsAffected);

       } catch (SQLException e) {
           e.printStackTrace();
       }
   }

   // Delete
   public static void deleteRecord() {
       String sql = 
       
       
       
       
       "DELETE FROM section WHERE name = ?";
       try (Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

           preparedStatement.setString(1, "B");  // Set name of the record to delete

           int rowsAffected = preparedStatement.executeUpdate();
           System.out.println("Record deleted successfully. Rows affected: " + rowsAffected);

       } catch (SQLException e) {
           e.printStackTrace();
       }
   }

   public static void main(String[] args) {
    // Calling CRUD operations
       createRecord();  // Insert a record
    //   readRecords();   // Retrieve and display records
    //    updateRecord();  // Update a record
    //    deleteRecord();  // Delete a record
   }


}
