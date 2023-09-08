package com.coforge.cookies;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userReadCookies")
public class userReadCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter res = response.getWriter();
		Cookie[] cookies = request.getCookies();
		
			Stream.of(cookies).forEach((c) -> res.print("\n"+c.getName()+":\t"+c.getValue()));
		
	}

}
