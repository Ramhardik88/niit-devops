package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String pass=request.getParameter("pass");
		if(username.equals("ramhardik")&& pass.equals("ramkumar@123")) {
			
			HttpSession session=request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
			response.sendRedirect("Login.jsp");
		}
	}

	

}
