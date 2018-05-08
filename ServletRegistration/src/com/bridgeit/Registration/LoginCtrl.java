package com.bridgeit.Registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class LoginCtrl
 */
//@WebServlet("/LoginCtrl")
public class LoginCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter=response.getWriter();
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		if(DbConnection.validate(uname, pass))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("Success.html");
			dispatcher.forward(request, response);
		}else
		{
			 printWriter.print("<font color=red> please register first</font>");
			// printWriter.print("\n");
			RequestDispatcher dispatcher=request.getRequestDispatcher("Reg.html");
		    dispatcher.include(request, response);
		  
			
		}
	}

}
