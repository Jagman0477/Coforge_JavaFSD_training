package com.coforge.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserSession2")
public class UserSession2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter res = response.getWriter();
		response.setContentType("text/html");
		
		Object product1 = request.getSession().getAttribute("prd1");
		Object product2 = request.getSession().getAttribute("prd2");
		
		HttpSession session1 = request.getSession();
		if(session1.isNew()) {
			res.print("<br><h1>Your session has expired</h1>");
			res.print("New session ID: "+request.getSession().getId());
		} else {
			res.print("<br>Session ID: "+session1.getId().toString());
			res.print("<br>Buyer's name: "+request.getSession().getAttribute("name"));
			res.print("<br>Buyer's product 1: "+product1);
			res.print("<br>Buyer's product 2: "+product2);
		}
		

		
	}

}
