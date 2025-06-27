import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchStudent {
    public static void main(String[] args) {
        String url = "jdbc.mysql://localhost:3306/spark3";
        String username = "root";
        String password = "root";

        String query = "select * from students ";

        try {
            // load krenge
            Class.forName("com.mysql.cj.jdbc.Driver");

            // connection banana
            Connection con = DriverManager.getConnection(url, username, password);

            // create statement
            Statement stmt = con.createStatement();

            // execute
            ResultSet rs = stmt.executeQuery(query);

            // get result
            System.out.println("Id | name | age | course");
            System.out.println("------------------------");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getInt("age") + " | " +
                        rs.getString("course") + " | ");
            }
        }
        catch (Exception e)
         {
             e.printStackTrace();
         }
    }
}