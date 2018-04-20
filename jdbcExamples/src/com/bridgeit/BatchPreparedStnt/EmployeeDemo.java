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
    String insertQuery = "insert into employee(id,name,salary)values(?,?,?)";
	String deleteQuery="delete from employee where id=?";
	String udateQuery="update employee set name=? where id=?";
    try {
		
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
		connection.setAutoCommit(false);
		preparedStatement=connection.prepareStatement(insertQuery);
		preparedStatement.setInt(1,id);
		preparedStatement.setString(2,name);
		preparedStatement.setString(3, salary);
		preparedStatement.addBatch();
		System.out.println("insert successfully");
	
		//delete record
		System.out.println("Enter id to delete record");
		int deleteid=scanner.nextInt();
	
		preparedStatement=connection.prepareStatement(deleteQuery);
		preparedStatement.setInt(1, deleteid);
		preparedStatement.addBatch();
		System.out.println("delete successfully");
	
        //update record
		System.out.println("enter id to update record ");
		int updateid=scanner.nextInt();
		System.out.println("enter new name ");
		String newname=scanner.next();
		
		preparedStatement=connection.prepareStatement(udateQuery);
		preparedStatement.setInt(2, updateid);
		preparedStatement.setString(1, newname);
		preparedStatement.addBatch();
		System.out.println("update successfully");
		preparedStatement.executeBatch();
		connection.commit();
		
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	finally {
		if(preparedStatement!=null)
		{
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(connection!=null)
		{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}
}
