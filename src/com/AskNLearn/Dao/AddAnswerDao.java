package com.AskNLearn.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.AskNLearn.model.answer;

public class AddAnswerDao {

	
	private Connection con;

	public AddAnswerDao(Connection con) {
		super();
		this.con = con;
	}
	
	public boolean insert_ans(answer a)
	{
		boolean var=false;
		
		try
		{
			String query="Insert into asknlearn.answers(ans,a_u_id,a_q_id) values(?,?,?)";
			PreparedStatement ps= this.con.prepareStatement(query);
			ps.setString(1,a.getAns());
			ps.setInt(2,a.getA_u_id());
			ps.setInt(3,a.getA_q_id());
			ps.executeUpdate();
			var=true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return var;
	}
	
	
}
