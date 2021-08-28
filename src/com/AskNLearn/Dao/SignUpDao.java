package com.AskNLearn.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.AskNLearn.model.user;

public class SignUpDao {
	
	
	Connection con;

	public SignUpDao(Connection con) {
		super();
		this.con = con;
	}
	
	public boolean insert_user(user u)
	{
		boolean var=false;
		
		try 
		{
			String query="Insert into asknlearn.users (first_name,last_name,email_id,pass_word) values(?,?,?,?)";
			PreparedStatement ps=this.con.prepareStatement(query);
			ps.setString(1,u.getFirst_name());
			ps.setString(2,u.getLast_name());
			ps.setString(3,u.getEmail_id());
			ps.setString(4,u.getPass_word());
			ps.executeUpdate();
			var=true;		
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return var;
		
	}
}
