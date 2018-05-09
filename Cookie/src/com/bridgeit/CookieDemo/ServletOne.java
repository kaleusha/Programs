package com.bridgeit.CookieDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
//@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
        super();
        
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
		String name=request.getParameter("userName");
		
		//create cookie object
		Cookie ck=new Cookie("uname", name);
		//adding cookie in response
		response.addCookie(ck);
		
		printWriter.print("<form action='servlet2' method='post'>");  
		printWriter.print("<input type='hidden' name='uname' value='"+name+"'>");  
		printWriter.print("<input type='submit' value='go'>");  
		printWriter.print("</form>");
		printWriter.print("welcome" +" "+name);
		printWriter.close();
	}

}
