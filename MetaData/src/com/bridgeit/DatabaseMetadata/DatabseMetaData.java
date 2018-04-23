package com.bridgeit.DatabaseMetadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabseMetaData {
	public static void main(String[] args) {
		Connection connection = null;
	    Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "root");
			DatabaseMetaData dbmetadata=connection.getMetaData();    
			System.out.println("Driver Name: "+dbmetadata.getDriverName());  
			System.out.println("Driver Version: "+dbmetadata.getDriverVersion());  
			System.out.println("UserName: "+dbmetadata.getUserName());  
			System.out.println("Database Product Name: "+dbmetadata.getDatabaseProductName());  
			System.out.println("Database Product Version: "+dbmetadata.getDatabaseProductVersion());  
			
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
