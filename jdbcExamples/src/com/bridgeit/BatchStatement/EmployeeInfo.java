package com.bridgeit.BatchStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeInfo {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("\n1.select \n2.insert  \n3.delete \n4.update \n5.exit");
		int choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			select();
			break;
			
		case 2:
			insertData();
			break;
			
		case 3:
			deleteData();
			break;
			
		case 4:
			updateData();
			break;
			
		case 5:
			break;
		}
	}

	private static void updateData() {
		
		
	}

	private static void deleteData() {
		Connection connection=null;
		Statement statement=null;
		System.out.println("Enter id ");
		int id=scanner.nextInt();
		System.out.println("Enter 2nd id ");
		int id1=scanner.nextInt();
		String deleteQuery="delete id from employee where id="+id;
		String deleteQuery1="delete id from employee where id="+id1;
       try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
		    statement=connection.createStatement();
			statement.addBatch(deleteQuery);
			statement.addBatch(deleteQuery1);
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

	private static void insertData() {
		Connection connection=null;
		Statement statement=null;
		System.out.println("Enter how many record insert in table");
		int number=scanner.nextInt();
		try {
		for(int i=0;i<number;i++)
		{
		System.out.println("Enter id ");
		int id=scanner.nextInt();
		System.out.println("Enter name");
		String name=scanner.next();
		System.out.println("enter salary");
		String salary=scanner.next();
		String insertQuery = "insert into employee(id,name,salary)values('" + id + "','"
				+ name + "','" + salary  + "')";
		
		/*System.out.println("Enter 2nd id ");
		int id1=scanner.nextInt();
		System.out.println("Enter 2nd name");
		String name1=scanner.next();
		System.out.println("enter 2nd salary");
		String salary1=scanner.next();
		String insertQuery1 = "insert into employee(id,name,salary)values('" + id1 + "','"
				+ name1 + "','" + salary1  + "')";*/
		
		
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
		    statement=connection.createStatement();
			statement.addBatch(insertQuery);
			//statement.addBatch(insertQuery1);
			statement.executeBatch();
		}
			
			
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

	private static void select() {
		
		
	}

}
