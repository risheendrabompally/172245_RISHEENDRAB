package com.firstservlet;

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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(description = "basic servlet", urlPatterns = { "/Simple_Servlet" }, 
	initParams= {@WebInitParam(name="defaultUser", value="rish")})
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*System.out.println("hi");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter p=response.getWriter();
		p.println("<h5>Do another program</h5>");*/
		
		response.setContentType("Text/html");
		PrintWriter writer=response.getWriter();  
		String userName=request.getParameter("userName");
		HttpSession session=request.getSession();
		ServletContext context= request.getServletContext();
		if(userName !="" && userName != null) {
		session.setAttribute("savedUserName", userName);
		context.setAttribute("savedUserName", userName);
		}
		writer.println("request parameter name"+ userName);
		writer.println("session parameter name"+ (String) session.getAttribute("savedUserName"));
		writer.println("context parameter name"+ (String) context.getAttribute("savedUserName"));
		writer.println("init parametres are" + this.getServletConfig().getInitParameter("defaultUser"));
	}
	/** 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/

}
