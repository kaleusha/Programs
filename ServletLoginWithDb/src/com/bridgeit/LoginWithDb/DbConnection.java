package com.bridgeit.LoginWithDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection {
	
	public static boolean validate(String name,String pass){ 
		DbConnection t=null;
		boolean status=false;  
		
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "root");  
			      
			PreparedStatement ps=con.prepareStatement("select * from login where username=? and password=?");  
			ps.setString(1,name);  
			ps.setString(2,pass);  
			      
			ResultSet rs=ps.executeQuery();  
			status=rs.next();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;  
	}	
}
