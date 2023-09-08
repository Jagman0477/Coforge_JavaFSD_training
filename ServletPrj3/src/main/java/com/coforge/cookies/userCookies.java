package com.coforge.cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userCookies")
public class userCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Cookie c1;
	Cookie c2;
	Cookie c3;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		c1 = new Cookie("empId", "111001");
		c2 = new Cookie("loginTime", "9:15");
		c3 = new Cookie("logoutTime", "16:45");
		
//		c1.setMaxAge(10);
		c1.setMaxAge(24*60*60*365); // Will persist browser closing
		
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		response.setContentType("text/html");
		response.getWriter().print("<h1>All 3 cookies added</h1>");
		
	}


}
