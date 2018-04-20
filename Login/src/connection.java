import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {
	public static void main(String[] args) {
		 Connection connection = null;
		 Statement statement = null;
		try {
			// Step 1.load driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			// step 2.establish connection with database
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "root");
			System.out.println("establish connection successfully");
			// step 3.create statement
			statement = connection.createStatement();
			System.out.println("create statemant successfully");
			// step 4.Execute query
			int i = statement.executeUpdate(updateQuery);
			System.out.println("update successful");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(statement!=null)
			{

				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
