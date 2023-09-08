package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/LoginServlet", initParams = {
		@WebInitParam(name="age", value = "22"),
		@WebInitParam(name="name", value = "Bhuvan Balushaiwala")
})

public class LoginServlet extends HttpServlet {
	String userName; 
	String userAge;
	String userCountry;
	ServletContext context ;
	
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		context = config.getServletContext();
		userName = config.getInitParameter("name");
		userAge = config.getInitParameter("age");
		userCountry = context.getInitParameter("country");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter res = response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("pass");
		String[] hobbies = request.getParameterValues("hb");
		
		response.setContentType("text/html");
		
		res.print("<br>The country name is : "+userCountry);
		
		if((id.isBlank() || id == null) && password.isBlank()) {
			res.print("Id and password is blank.");
		} else if(password.isBlank()) {
			res.print("Password is blank.");
		} else if(id.isBlank()){
			res.print("Id is blank.");
		} else  if(hobbies == null) {
			res.print("Select at least one hobby.");
		} else {
			res.print("<br>Welcome <br> Your id  = "+id);
		}
		
		String qString = request.getQueryString();
		res.print("<br>Password = "+qString);
	}

}
