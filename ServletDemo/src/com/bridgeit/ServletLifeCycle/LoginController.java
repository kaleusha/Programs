package com.bridgeit.ServletLifeCycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLifeCycle
 */
@WebServlet("/login")
public class LoginController extends HttpServlet 
{
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter out=response.getWriter();  
		out.print("hii");  
		out.print("hello simple servlet");  
		String s=request.getParameter("username");
		String s1=request.getParameter("password");
		if(s=="usha" && s1=="usha")
		{
			out.print("login successful");
	    }else
			out.println("invalid login");	
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
