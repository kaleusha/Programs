package com.bridgeit.callableStmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {

	public void insertData() 
	{
		Scanner scanner=new Scanner(System.in);
	
		System.out.println("Enter how many student insert in database");
		int number=scanner.nextInt();
		for(int i=0;i<number;i++)
		{
		String insertQuery="{call insertdata(?,?,?,?,?,?)}";
		Connection connection=null;
		CallableStatement callableStatement=null;
		System.out.println("enter id");
		int id=scanner.nextInt();
		System.out.println("Enter firstname");
		String firstname=scanner.next();
		System.out.println("Enter lastname");
		String lastname=scanner.next();
		System.out.println("Enter address");
		String address=scanner.next();
		System.out.println("Enter mobile number");
		String mobileno=scanner.next();
		try {
			//step 1.load driver
			Class.forName("com.mysql.jdbc.Driver");
			//establish connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
			//step 3. create statement
		    callableStatement=connection.prepareCall(insertQuery);
		    callableStatement.setInt(1, 1);
		    callableStatement.setInt(2, id);
		    callableStatement.setString(3,firstname);
		    callableStatement.setString(4,lastname);
		    callableStatement.setString(5,address);
		    callableStatement.setString(6,mobileno);
	
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

}
