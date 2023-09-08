package com.coforge.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SavingsAccountPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String id;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		id = request.getParameter("id");
		Object location = request.getAttribute("location");
		Object money = request.getAttribute("money");
		
		response.setContentType("text/html");
		
		response.getWriter().print("Id = "+id);
		response.getWriter().print("<br>Location = "+location);
		response.getWriter().print("<br>Money = "+money);
		response.getWriter().print("<br><h1>Welcome to the savings account page.");
	}


}
