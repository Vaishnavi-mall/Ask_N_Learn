package com.AskNLearn.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.AskNLearn.model.question;

public class ShowQuestionDao {

	
	private Connection con;

	public ShowQuestionDao(Connection con) {
		super();
		this.con = con;
	}
	
	public List<question> search_dep(question q)
	{
		List<question> list=new ArrayList<>();
		
		try {
			
			String query="Select ques,q_id from asknlearn.questions where department =(?) and q_id not in(Select distinct a_q_id from asknlearn.answers)";
			PreparedStatement ps=this.con.prepareStatement(query);
			ps.setString(1,q.getDepartment());
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				question newq =new question();
				newq.setQues(rs.getString("ques"));
				newq.setQ_id(rs.getInt("q_id"));
				list.add(newq);
				
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return list;
	}
	
}
