package com.bridgeit.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMeta {
	public static void main(String[] args) {
		Connection connection = null;
	    Statement statement = null;
	    ResultSet resultset=null;
	    String query="select * from employee";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "root");
			
			PreparedStatement preparedStatement=connection.prepareStatement(query);  
		    resultset=preparedStatement.executeQuery();  
			ResultSetMetaData rsmetadata=resultset.getMetaData();
			  
			System.out.println("Total columns: "+rsmetadata.getColumnCount());  
			System.out.println("1st column name: "+rsmetadata.getColumnName(1)); 
			System.out.println("2nd column Name: "+rsmetadata.getColumnName(2));
			System.out.println("3rd column Name: "+rsmetadata.getColumnName(3));
			System.out.println("1st column type: "+rsmetadata.getColumnTypeName(1)); 
			System.out.println("2nd column type: "+rsmetadata.getColumnTypeName(2)); 
			System.out.println("3rd column type: "+rsmetadata.getColumnTypeName(3)); 
			System.out.println("get table name: "+rsmetadata.getTableName(2));
			System.out.println("get table name: "+rsmetadata.getTableName(1));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(resultset!=null)
			{

				try {
					resultset.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
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
