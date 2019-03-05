package com.firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XMLServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("Text/html");
		PrintWriter p=response.getWriter();
		String username=request.getParameter("name");
		p.println("<h1>hello</h1>" + username);
		
	}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String firstname=request.getParameter("firstname");
			String lastname=request.getParameter("lastname");
			String profession=request.getParameter("prof");
			String[] location=request.getParameterValues("location");
			PrintWriter p=response.getWriter();
			p.println("hello!" + firstname +" "+ lastname +"\t" + "you are a "+ profession);
			p.println(" you are at"+location.length + "places");
			for(int i=0;i<location.length;i++) {
				p.println(location[i]);
			}
		}
}
