package com.bridgeit.preparedStmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class studentDemo 
{
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
		}while(true);
	}
	
	/**
	 * Purpose:Display Table Data
	 * 
	 */
	private static void select() 
	{
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		String selectQuery="select * from student";
		try {
			//step 1.load driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("---Driver loaded successfully---");
			//step 2.establish connection with database
		    connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
			System.out.println("---connection established successfully---");
			//step 3.create statement
		    preparedStatement=connection.prepareStatement(selectQuery);
		    System.out.println("---create statemant successfully---");
		    //step 4.execute query
		    ResultSet resultSet=preparedStatement.executeQuery("select * from student");
		    System.out.println("---execute query successfully---");
		    //step 5.return result
		    while(resultSet.next())
		    {
		    	System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getString(5));
		    }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
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
		}
		
		
	}
	/**
	 * Purpose:Insert Data into table
	 * 
	 */
	private static void insertData() 
	{
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		String insertQuery="insert into student(id,firstname,lastname,address,mobileno)"+"values(?,?,?,?,?)";
		System.out.println("Enter how many student insert in database");
		int number=scanner.nextInt();
		
		//step 1.load driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("---Driver loaded successfully---");
			//step 2.establish connection with database
		    connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
			System.out.println("---connection established successfully---");
			//step 3.create statement
		  
		    preparedStatement=connection.prepareStatement(insertQuery);
		    for(int i=0;i<number;i++)
			{
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
			preparedStatement.setInt(1, id );
			preparedStatement.setString(2, firstname);
			preparedStatement.setString(3, lastname);
			preparedStatement.setString(4, address);
			preparedStatement.setString(5, mobileno);
			}
		    System.out.println("---create statemant successfully---");
		    //step 4.execute query
		    int result=preparedStatement.executeUpdate();
		    System.out.println("inserted");
		    //step 5.return result
		    
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
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
		}
		
	}
	/**
	 * Purpose:Delete data from table
	 * 
	 */
	private static void deleteData()
	{
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		String deleteQuery="delete from student where id=?";
		System.out.println("Enter id to delete student details");
		int id=scanner.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("---Driver loaded successfully---");
			//step 2.establish connection with database
		    connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
			System.out.println("---connection established successfully---");
			//step 3.create statement
		    preparedStatement=connection.prepareStatement(deleteQuery);
		    preparedStatement.setInt(1, id);
		    //step 4.execute query
		    int result=preparedStatement.executeUpdate();
		    System.out.println("deleted");
		   		    
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
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
		}
		
	}
	/**
	 * Purpose:Update data from table
	 * 
	 */
	private static void updateData() 
	{
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		String updateQuery="update student set firstname=? where id=?";
		System.out.println("Enter id to update");
		int id=scanner.nextInt();
		System.out.println("Enter new firstname to update in table");
		String newname=scanner.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("---Driver loaded successfully---");
			//step 2.establish connection with database
		    connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
			System.out.println("---connection established successfully---");
			//step 3.create statement
		    preparedStatement=connection.prepareStatement(updateQuery);
		    preparedStatement.setInt(2, id);
			preparedStatement.setString(1, newname);
		    //step 4.execute query
		    int result=preparedStatement.executeUpdate();
			
			System.out.println("updated");
		   
		   		    
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
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
		}
		
	}
}
