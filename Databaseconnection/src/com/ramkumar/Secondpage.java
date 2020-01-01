package com.ramkumar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java .sql.*;

/**
 * Servlet implementation class Secondpage
 */
@WebServlet("/Secondpage")
public class Secondpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Secondpage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query="insert into detail(NAME,Password,email,Country) values(?,?,?,?)";   
		String url="jdbc:mysql://localhost:3306/tusk";
           String username="root";
           String password="Ramkumar@123";
           String n=request.getParameter("userName");  
           String p=request.getParameter("userPass");  
           String e=request.getParameter("userEmail");  
           String c=request.getParameter("userCountry"); 
		
		
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(url, username, password);
				PreparedStatement st=con.prepareStatement(query);
				st.setString(1,n);
				st.setString(2,p);
				st.setString(3,e);
				st.setString(4,c);
				int i=st.executeUpdate();
				if(i>0) {
					PrintWriter out=response.getWriter();
					out.print("succesfully  updated");
				}
			} catch (Exception e2) {
				
				e2.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
