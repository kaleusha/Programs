package com.bridgeit.callableStmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

	public void select() {
		
		String selectQuery="{call insertdata(?,?,?,?,?,?)}";
		Connection connection=null;
		CallableStatement callableStatement=null;
		
		try {
			//step 1.load driver
			Class.forName("com.mysql.jdbc.Driver");
			//establish connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
			//step 3. create statement
		    callableStatement=connection.prepareCall(selectQuery);
		    callableStatement.setInt(1, 4);
		    callableStatement.setString(2,null);
		    callableStatement.setString(3,null);
		    callableStatement.setString(4,null);
		    callableStatement.setString(5,null);
		    callableStatement.setString(6,null);
		    //step 4.execute query
		    boolean resultSet=callableStatement.execute();  
		   
		    if(resultSet)
		    {
		    	 ResultSet rs = callableStatement.getResultSet();
		    
		    	 while (rs.next()) {
		    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		    }
		    }
		    callableStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection!=null)
			{
				try {
					callableStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
