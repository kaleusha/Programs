package com.bridgeit.callableStmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {

	public void updateData() {
		Scanner scanner=new Scanner(System.in);
		String updateQuery="{call crudOperation(?,?,?,?,?,?)}";
		Connection connection=null;
		System.out.println("Enter id to update");
		int id=scanner.nextInt();
		System.out.println("Enter new firstname to update in table");
		String newname=scanner.next();
		CallableStatement callableStatement=null;
		try {
			//step 1.load driver
			Class.forName("com.mysql.jdbc.Driver");
			//establish connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
			//step 3. create statement
		    callableStatement=connection.prepareCall(updateQuery);
		    callableStatement.setInt(2, id);
		    callableStatement.setInt(1, 3);
		    callableStatement.setString(3,newname);
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
		}scanner.close();
		
	}

}
