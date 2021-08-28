package com.AskNLearn.Sql_Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Sql_Connection 
{
	private static Connection con;
	public static Connection getConnection()
	{
		String url="jdbc:mysql://localhost:3306/asknlearn";
		String username="root";
		String password="root";
		try
		{
			if(con==null)
		    	{	
			//Driver Class load
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create a connection
			con=DriverManager.getConnection(url,username,password);
		    	}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
		
	}
}
