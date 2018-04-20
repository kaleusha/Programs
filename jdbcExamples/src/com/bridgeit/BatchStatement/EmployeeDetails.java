package com.bridgeit.BatchStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter id ");
	    int id=scanner.nextInt();
	    System.out.println("Enter name");
	    String name=scanner.next();
	    System.out.println("enter salary");
	    String salary=scanner.next();
	    String insertQuery = "insert into employee(id,name,salary)values('" + id + "','"
			+ name + "','" + salary  + "')";
	    
	
	 try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
		    statement=connection.createStatement();
			statement.addBatch(insertQuery);
			System.out.println("insert successfully");
			//delete record
			System.out.println("Enter id to delete record");
			int deleteid=scanner.nextInt();
			String deleteQuery="delete from employee where id="+deleteid;
			statement.addBatch(deleteQuery);
			System.out.println("delete successfully");
            //update record
			System.out.println("enter id toupdate record ");
			int updateid=scanner.nextInt();
			System.out.println("enter new name ");
			String newname=scanner.next();
			String udateQuery="update employee set name='"+newname+"' where id="+updateid;
			statement.addBatch(udateQuery);
			System.out.println("update successfully");
			statement.executeBatch();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(statement!=null)
			{
				try {
					statement.close();
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
