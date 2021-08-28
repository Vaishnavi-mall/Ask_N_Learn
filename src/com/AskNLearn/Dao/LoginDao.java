package com.AskNLearn.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.AskNLearn.model.user;

public class LoginDao {
	
	private Connection con;
	 private  int user_id=0;
	 private String first_name;
	private String last_name;
     private int my_questions;
     private int my_answers;

	public LoginDao(Connection con) {
		super();
		this.con = con;
	}
	 
	public boolean search_user(user  u)
	{
		boolean var=false;
		try
		{
			String query=" Select u_id,first_name,last_name from asknlearn.users where email_id=? and pass_word=?";
			PreparedStatement ps=this.con.prepareStatement(query);
			ps.setString(1,u.getEmail_id());
			ps.setString(2,u.getPass_word());
			ResultSet rs= ps.executeQuery();
			 while(rs.next())
			 {  
				 user_id=rs.getInt("u_id");
				 first_name=rs.getString("first_name");
				 last_name=rs.getString("last_name");
				 var=true;
			 } 
			 
			 
			 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return var;
		
		
	}
	public int getUser_id() {
		System.out.println(user_id);
		return user_id;
		
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	 public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
	 

}
