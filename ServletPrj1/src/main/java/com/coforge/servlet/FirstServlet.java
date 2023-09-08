package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int count;
	public void init(ServletConfig config) throws ServletException {
		count = 1;
		System.out.println("Init call");
	}

	public void destroy() {
		System.out.println("Destroy call");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DoGet call");
		System.out.println("Count = "+count++);
		PrintWriter res =  response.getWriter(); 
		String id = request.getParameter("userId");
		String name = request.getParameter("name");
		
		res.print("<br>Id is: "+id);
		res.print("<br>Name is: "+name);
	}

}
