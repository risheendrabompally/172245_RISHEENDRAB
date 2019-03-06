package com.IMDB.service;

import java.io.IOException;

@WebServlet("/Comment")
public class Commentservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public Commentservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
