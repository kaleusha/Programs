package com.bridgelabz.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLifeCycle
 */
//@WebServlet("login")
public class LoginController extends HttpServlet 
{
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter out=response.getWriter();  
		response.setContentType("text/html");
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		int s=request.getContentLength();
		int s1=request.getLocalPort();
		System.out.println(s1);
		System.out.println(s);
		System.out.println(uname + " " + pass);
		if(uname.equals("usha") && pass.equals("kale"))
		{
			/*RequestDispatcher dispatcher=request.getRequestDispatcher("Success.html");
			dispatcher.forward(request, response);*/
			response.sendRedirect("Success.html");
			//out.println("login successful");
	    }
		
		else
	    {
			response.sendRedirect("Error.html");
			/*RequestDispatcher dispatcher=request.getRequestDispatcher("Error.html");
			dispatcher.forward(request, response);*/

	    }
	}

//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		PrintWriter out=response.getWriter(); 
//		out.print("welcome hi.................................");
//		String un=request.getParameter("username");
//		String pw=request.getParameter("password");
//		
//		if(un.equals("admin") && pw.equals("admin"))
//		{
//			
//			out.println("welcome");
//		}
//		else
//		{
//			out.println("invalid username and password");
//		}
//	}

}
