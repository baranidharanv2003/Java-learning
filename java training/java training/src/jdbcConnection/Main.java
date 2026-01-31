package jdbcConnection;
import java.sql.*;

public class Main {


        // Database connection URL
         final String URL = "jdbc:mysql://localhost:3306/store";
         final String USER = "root";
         final String PASSWORD = "132003";
    public static void main(String[] args) {
        try {
            // Step 1: Load and register the JDBC driver
            // Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the connection
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database");

            // Step 3: Create a statement
            Statement statement = connection.createStatement();

            // Step 4: Execute a query (Example: Create a table)
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Sectionone (id INT PRIMARY KEY, name VARCHAR(100), age INT)";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully");

            // Step 5: Insert a record
            String insertSQL = "INSERT INTO Employees (id, name, age) VALUES (1, 'John Doe', 30)";
            statement.executeUpdate(insertSQL);

            // Step 6: Select data
            String selectSQL = "SELECT * FROM Employees";
            ResultSet resultSet = statement.executeQuery(selectSQL);

            // Step 7: Process the ResultSet
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Step 8: Update a record
            String updateSQL = "UPDATE Employees SET age = 31 WHERE id = 1";
            statement.executeUpdate(updateSQL);

            // Step 9: Delete a record
            String deleteSQL = "DELETE FROM Employees WHERE id = 1";
            statement.executeUpdate(deleteSQL);

            // Step 10: Close the connection
            connection.close();
            System.out.println("Database connection closed");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
