package com.bridgeit.ServletLifeCycle;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletLife implements Servlet {
	ServletConfig config=null;  
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;  
		System.out.println("servlet is initialized");  
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		  
		PrintWriter out=response.getWriter();  
		out.print("hii");  
		out.print("hello simple servlet");  
		out.print("close");  
	}
	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		
		return null;
	}

	@Override
	public void destroy() {
		System.out.println("servlet Destroy");
		
	}

}
