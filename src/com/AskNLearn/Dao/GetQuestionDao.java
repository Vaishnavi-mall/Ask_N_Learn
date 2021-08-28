package com.AskNLearn.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.AskNLearn.model.question;

public class GetQuestionDao 
{

	private Connection con;

	public GetQuestionDao(Connection con) {
		super();
		this.con = con;
	}
	
	public question GetQuestion(question q)
	{
		question q1=new question();
		try
		{
		String query="Select q_id,ques from asknlearn.questions where q_id=(?)";
		PreparedStatement ps=this.con.prepareStatement(query);
		ps.setInt(1,q.getQ_id());
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{

			q1.setQues(rs.getString("ques"));	
			q1.setQ_id(rs.getInt("q_id"));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return q1;
	}
	
	
}
