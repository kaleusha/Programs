package com.bridgeit.callableStmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {

	public void deleteData() {
		Scanner scanner=new Scanner(System.in);
		String deleteQuery="{call insertdata(?,?,?,?,?,?)}";
		Connection connection=null;
		System.out.println("enter id to delete");
		int id=scanner.nextInt();
		CallableStatement callableStatement=null;
		try {
			//step 1.load driver
			Class.forName("com.mysql.jdbc.Driver");
			//establish connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
			//step 3. create statement
		    callableStatement=connection.prepareCall(deleteQuery);
		    callableStatement.setInt(2, id);
		    callableStatement.setInt(1, 2);
		    callableStatement.setString(3,null);
		    callableStatement.setString(4,null);
		    callableStatement.setString(5,null);
		    callableStatement.setString(6,null);
	
		    //step 4.execute query
		    callableStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(callableStatement!=null)
			{

				try {
					callableStatement.close();
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
