package com.bridgeit.BatchPreparedStnt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDemo {
	public static void main(String[] args)
	{
	Connection connection=null;
	PreparedStatement preparedStatement=null;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter id ");
    int id=scanner.nextInt();
    System.out.println("Enter name");
    String name=scanner.next();
    System.out.println("enter salary");
    String salary=scanner.next();
    //String insertQuery = "insert into employee(id,name,salary)values(?,?,?)";
    System.out.println("Enter 2nd id ");
    int id1=scanner.nextInt();
    System.out.println("Enter 2nd name");
    String name1=scanner.next();
    System.out.println("enter salary");
    String salary1=scanner.next();
    String insertQuery = "insert into employee(id,name,salary)values(?,?,?)";
	
    try {
		
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
		preparedStatement=connection.prepareStatement(insertQuery);
		preparedStatement.setInt(1,id);
		preparedStatement.setString(2,name);
		preparedStatement.setString(3, salary);
		preparedStatement.addBatch();
		//preparedStatement=connection.prepareStatement(insertQuery);
		preparedStatement.setInt(1,id1);
		preparedStatement.setString(2,name1);
		preparedStatement.setString(3, salary1);
		preparedStatement.addBatch();
		preparedStatement.executeBatch();
		System.out.println("insert successfully");
		
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	finally {
		if(preparedStatement!=null)
		{
			try {
				preparedStatement.close();
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
