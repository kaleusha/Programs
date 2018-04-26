import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.Scanner;

public class TransactionMgmt {
	public static void main(String[] args) 
	{
		Scanner scanner=new  Scanner(System.in);
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Savepoint savepoint=null;
		String query="insert into student(id,firstname,lastname,address,mobileno)values(?,?,?,?,?)";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		    System.out.println("driver loaded");
		    // step 2.establish connection with database
		    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "root");
			connection.setAutoCommit(false);
			
			preparedStatement=connection.prepareStatement(query);
			System.out.println("enter how many student record insert in table");
			int number=scanner.nextInt();
			for(int i=0;i<number;i++)
			{
				savepoint=connection.setSavepoint();
				System.out.println("Enter id");
				int id=scanner.nextInt();
				System.out.println("Enter firstName");
				String firstname=scanner.next();
				System.out.println("Enter lastName");
				String lastname=scanner.next();
				System.out.println("Enter address");
				String address=scanner.next();
				System.out.println("Enter mobileno");
				String mobileno=scanner.next();
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2,firstname);
				preparedStatement.setString(3,lastname);
				preparedStatement.setString(4, address);
				preparedStatement.setString(5,mobileno);
				preparedStatement.executeUpdate();
			}
			connection.rollback(savepoint);
			connection.commit();
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(preparedStatement!=null)
			{
				try 
				{
					preparedStatement.close();
				} 
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
			if(connection!=null)
			{
				try 
				{
					connection.close();
				} 
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
		scanner.close();
	}

}
