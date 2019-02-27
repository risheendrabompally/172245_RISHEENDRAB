package com.IMDB.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.IMDB.dao.User_DAO;

@WebServlet("/registration")
public class registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public registerservlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String mobile=request.getParameter("mobile");
		String country=request.getParameter("country");
		boolean status=false;
		User_DAO r=new User_DAO();
		try {
			status=r.insert(firstname,lastname,username,email,password,mobile,country);
		}
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		if(status==true) {
			response.sendRedirect("login.html");
		}	
	}
}