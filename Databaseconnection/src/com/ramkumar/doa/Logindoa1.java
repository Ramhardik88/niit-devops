package com.ramkumar.doa;

import java.sql.*;

public class Logindoa1
{ 
	String query="select * from login where uname=? and pass=?";
	
	String url="jdbc:mysql://localhost:3306/tusk";
String username="root";
String password="Ramkumar@123";
	public boolean check(String uname, String pass) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, username, password);
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs= st.executeQuery();
			
			if(rs.next()) {
				return true;
			}
			} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		
		return false;
		
		
	}
	

}
