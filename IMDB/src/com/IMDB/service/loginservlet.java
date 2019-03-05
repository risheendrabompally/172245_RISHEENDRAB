package com.IMDB.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.IMDB.dao.Infouser;
import com.IMDB.dao.Login_DAO;

@WebServlet(urlPatterns = {"/loginservlet"})
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public loginservlet() {
        super();  
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		session.setAttribute("sessionsername", username);
		Infouser user=new Infouser(username,password);
		try {
			if(Login_DAO.validate(user)) {
				response.sendRedirect("Home.html");
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("register.html");
				rd.include(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		p.close();
	}
}