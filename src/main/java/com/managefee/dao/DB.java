package com.managefee.dao;
import java.sql.*;
public class DB 
	{
		static Connection con;
	
	public static Connection getCon() throws ClassNotFoundException, SQLException 
		
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/project";
		String user = "root";
		String password = "saurah";
				
			con  =	DriverManager.getConnection(url,user,password);
		
		
		return con;		
	}

}