package com.bridgeit.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentInfo 
{
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter your choice: ");
		do {
			System.out.println("\n1.select \n2.insert  \n3.delete \n4.update \n5.exit");
			int choice = scanner.nextInt();
			switch (choice) {
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
		} while (true);
	}

	/**
	 * Purpose: Update Student detail from table
	 * 
	 */
	static Connection connection = null;
	static Statement statement = null;

	private static void updateData() {

		System.out.println("Enter id to update");
		int id = scanner.nextInt();
		System.out.println("Enter new firstname to update in table");
		String newname = scanner.next();
		String updateQuery = "update student set firstname='" + newname + "'where id=" + id;
		try {
			// Step 1.load driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			// step 2.establish connection with database
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "root");
			System.out.println("establish connection successfully");
			// step 3.create statement
			statement = connection.createStatement();
			System.out.println("create statemant successfully");
			// step 4.Execute query
			int i = statement.executeUpdate(updateQuery);
			System.out.println("update successful");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(statement!=null)
			{

				try {
					statement.close();
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
	 * Purpose: Delete Student from table
	 * 
	 */
	private static void deleteData() {
		System.out.println("Enter id to delete student details");
		int id = scanner.nextInt();
		String deleteQuery = "delete from student where id=" + id;
		try {
			// Step 1.load driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			// step 2.establish connection with database
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "root");
			System.out.println("establish connection successfully");
			// step 3.create statement
			statement = connection.createStatement();
			System.out.println("create statemant successfully");
			// step 4.Execute query
			int i = statement.executeUpdate(deleteQuery);
			System.out.println("delete successful");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(statement!=null)
			{

				try {
					statement.close();
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
	 * Purpose: Insert Student detail in table
	 * 
	 */
	private static void insertData() {
		System.out.println("Enter how many student insert in database");
		int number=scanner.nextInt();
		for(int i=0;i<number;i++)
		{
		System.out.println("enter id");
		int id = scanner.nextInt();
		System.out.println("Enter firstname");
		String firstname = scanner.next();
		System.out.println("Enter lastname");
		String lastname = scanner.next();
		System.out.println("Enter address");
		String address = scanner.next();
		System.out.println("Enter mobile number");
		String mobileno = scanner.next();
		String insertQuery = "insert into student(id,firstname,lastname,address,mobileno)values('" + id + "','"
				+ firstname + "','" + lastname + "','" + address + "','" + mobileno + "')";
		try {
			// Step 1.load driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			// step 2.establish connection with database
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "root");
			System.out.println("establish connection successfully");
			// step 3.create statement
			statement = connection.createStatement();
			System.out.println("create statemant successfully");
			// step 4.Execute query
			int j = statement.executeUpdate(insertQuery);
			System.out.println("insert successful");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(statement!=null)
			{

				try {
					statement.close();
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

	/**
	 * Purpose: display all information from table
	 * 
	 */
	private static void select() {
		String selectQuery = "select firstname, lastname from student";
		try {
			// Step 1.load driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			// step 2.establish connection with database
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "root");
			System.out.println("establish connection successfully");
			// step 3.create statement
			statement = connection.createStatement();
			System.out.println("create statemant successfully");
			// step 4.Execute query
			ResultSet resultSet = statement.executeQuery(selectQuery);
			while (resultSet.next()) {
				/*System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3)
						+ " " + resultSet.getString(4) + " " + resultSet.getString(5));*/
				System.out.println(resultSet.getString(1) +""+ resultSet.getString(2));

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(statement!=null)
			{

				try {
					statement.close();
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
