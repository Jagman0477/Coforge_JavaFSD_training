package com.coforge.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String id, pass, actType;

	
    public AccountController() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		id = request.getParameter("id");
		pass = request.getParameter("pass");
		actType = request.getParameter("account");
		response.setContentType("text/html");
		
		RequestDispatcher dispatcher;
		if(actType.equals("savings")) {
			request.setAttribute("location", "Greater Noida");
			request.setAttribute("money", "50000");
			dispatcher = request.getRequestDispatcher("SavingsAccountPage");
			dispatcher.forward(request, response);
		} 
		
		if(actType.equals("current")) {
			request.setAttribute("location", "Greater Noida");
			request.setAttribute("money", "30000");
			dispatcher = request.getRequestDispatcher("CurrentAccountPage");
			dispatcher.forward(request, response);
//			dispatcher.include(request, response);
		}
		
	}

}
