package com.bridgeit.loginPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginValidation {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		int choice;
		do
		{
			System.out.println("Enter your Choice");
			System.out.println("\n1.Sign Up \n2.Sign In");
			choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				signUp();
				break;
			case 2:
				signIn();
				break;
						}
		}
		while(choice!=2);
		scanner.close();
	}
	private static void signIn() {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		String query="select * from user where username=? and password=?";
		System.out.println("Enter user Name");
		String username=scanner.next();
		System.out.println("Enter Password");
		String password=scanner.next();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "root");
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				System.out.println("Welcome "+resultSet.getString(2));
			}
			else
			{
				System.out.println("Login Failed");
			}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
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
				catch(SQLException e)
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
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
		
	}
	private static void signUp() {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		String query="insert into user(username,password)values(?,?)";
		System.out.println("Enter user Name");
		String username=scanner.next();
		System.out.println("Enter Password");
		String password=scanner.next();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "root");
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			int result=preparedStatement.executeUpdate();
			if(result>0)
			{
				System.out.println("Signed Up");
			}
			else
			{
				System.out.println("UserName already Present");
			}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
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
				catch(SQLException e)
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
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

}
