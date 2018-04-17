package com.bridgeit.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentInfo {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter your choice: ");
		do {
		System.out.println("\n1.select \n2.insert  \n3.delete \n4.update \n5.exit");
		int choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			select();
			break;
			
		case 2:
			insert();
			break;
			
		case 3:
			delete();
			break;
			
		case 4:
			update();
			break;
			
		case 5:
			break;
		}
		}while(true);
		
		
	}

	/**
	 * Purpose: Update Student detail from table
	 * 
	 */
	private static void update() {
		System.out.println("Enter id to update");
		int id=scanner.nextInt();
		System.out.println("Enter new firstname to update in table");
		String newname=scanner.next();
		try {
			Statement statement=sqlConnection();
			int i=statement.executeUpdate("update student set firstname='"+newname+"'where id="+id);
			System.out.println("update successful");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 *  Purpose: Delete Student  from table
	 *  
	 */
	private static void delete() {
		System.out.println("Enter id to delete student details");
		int id=scanner.nextInt();
		try {
			Statement statement=sqlConnection();
			int i=statement.executeUpdate("delete from student where id="+id);
			System.out.println("delete successful");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 *  Purpose: Insert Student detail in table
	 *  
	 */
	private static void insert() {
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
			Statement statement=sqlConnection();
			int i=statement.executeUpdate("insert into student(id,firstname,lastname,address,mobileno)values('"+id+"','"+firstname+"','"+lastname+"','"+address+"','"+mobileno+"')");
			System.out.println("insert successful");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 *  Purpose: display all information from table
	 *  
	 */
	private static void select() {
		try {
			Statement statement=sqlConnection();
			ResultSet resultSet=statement.executeQuery("select * from student");
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getString(5));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	/**
	 * Purpose: connectivity to database
	 * 
	 * @return
	 */
	private static Statement sqlConnection()
	{
		Statement statement = null;
      try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
		 statement=connection.createStatement();
			
			//connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return statement;
	}

}
