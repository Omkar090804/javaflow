import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main{
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/siulibrary";  //jdbc:<database_type>://<host>:<port>/<database_name>
                                                                    //databasetype is mysql,host for local databse is localhost,port for mysql is 3306
        String username = "root";
        String password = "Shraddha13*";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //to establish connection with database  ,this is default driver class for mysql

            // Create a connection
            try (Connection con = DriverManager.getConnection(jdbcUrl, username, password); //This method attempts to establish a connection to the database using the provided URL, username, and password.
                 Statement stm = con.createStatement();  //Creates a Statement object for sending SQL statements to the database.
                 ResultSet rs = stm.executeQuery("SELECT * FROM ibooks"))  //can also use executeUpdate for DML commands
                { 

                // Process the result set
                while (rs.next()) { // Moves the cursor to the next row in the result set. Returns false when there are no more rows.
                    System.out.print(rs.getString("Bname") + " ");
                    System.out.print(rs.getInt("Bid") + " ");
                    System.out.println(); // Print a new line for each row
                }

            } catch (SQLException e) {
                e.printStackTrace(); // method prints the stack trace of the exception to help with debugging.
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();   //is thrown if the JDBC driver class cannot be found.
        }
    }
}
