package com.bridgeit.Registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationPage
 */
// @WebServlet("/RegistrationPage")
public class RegistrationPage extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationPage() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		// Statement statement=null;
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		String mobileno = request.getParameter("mobileno");
   
      		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo", "root", "root");
			

				 preparedStatement = connection.prepareStatement("insert into registration values(?,?,?,?,?)");
				 // int rs=statement.executeUpdate("insert into registration values(?,?,?,?,?)");
				 preparedStatement.setString(1, fname);
				 preparedStatement.setString(2, lname);
				 preparedStatement.setString(3, uname);
				 preparedStatement.setString(4, pass);
				 preparedStatement.setString(5, mobileno);
				 preparedStatement.executeUpdate();
				 System.out.println("insert successfuly");
		       
				RequestDispatcher dispatcher=request.getRequestDispatcher("Login.html");
			    dispatcher.forward(request, response); 
			preparedStatement.close();
			connection.close();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
       
       

	}

}
