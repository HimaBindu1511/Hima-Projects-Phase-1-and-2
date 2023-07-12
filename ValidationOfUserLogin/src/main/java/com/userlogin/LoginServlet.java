package com.userlogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		// Set the content type
		response.setContentType("text/html"); 
		// Get the writer
		PrintWriter out = response.getWriter(); 
		// Get the userName from the request
		String uName = request.getParameter("userName"); 
		String uPassword = request.getParameter("userPassword"); 
		// Get a reference to the HttpSession object
		HttpSession theSession = request.getSession(); 
		// Validate the username
		if(uName.trim().equals("teju") && 
		uPassword.trim().equals("reddy11")) { 
		// Save the username in the session
		theSession.setAttribute("userName", uName); 
		theSession.setAttribute("userPassword", uPassword); 
		// Redirect to the Dashboard
		response.sendRedirect("dashboard"); 
		} 
		else { 
		 out.println("<font color='red'>Invalid username or Password...</font>"); 
		 RequestDispatcher dispatcher = request.getRequestDispatcher("index.html"); 
		 dispatcher.include(request, response); 
		}
		
	}

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
