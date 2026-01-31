package jdbcConnection;
import java.sql.*;
public class MySqlConnection {
    public static void main(String[] args) {

         final String URL = "jdbc:mysql://localhost:3306/vsbkarur";
         final String USER = "root";
        final String PASSWORD = "132003";

        try {
            
         Connection connection = DriverManager.getConnection(URL,USER, PASSWORD);
         PreparedStatement preparedStatement = connection.prepareStatement("create table seg(name varchar(100),Rack varchar(100),shelf varchar(100),products varchar(100),quantity int)");
         preparedStatement.executeUpdate();
         System.out.println("sucessfull");
         connection.close();

        
        //  preparedStatement.setString(1, "rathinam");
        //  ResultSet resultSet = preparedStatement.executeQuery();
        //  while (resultSet.next()) {
        //     int id = resultSet.getInt("id");
        //     String name = resultSet.getString("name");
        //     int age = resultSet.getInt("age");

        //     System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
        // }
        

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}
