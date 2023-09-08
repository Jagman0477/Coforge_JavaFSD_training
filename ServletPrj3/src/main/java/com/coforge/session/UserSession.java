package com.coforge.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserSession")
public class UserSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter res = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session1 = request.getSession();
		
		session1.setMaxInactiveInterval(10);
		session1.setAttribute("name", "Shamma");
		session1.setAttribute("prd1", "Apple");
		session1.setAttribute("prd2", "Curry");
		res.print("<br>Session Id is: "+session1.getId());
		res.print("<br>Session creation time: "+ new Date(session1.getCreationTime()));
		res.print("<br>Session last access time: "+ new Date(session1.getLastAccessedTime()));
		res.print("<br>Session max inactive interval: "+session1.getMaxInactiveInterval());
		
	}

}
