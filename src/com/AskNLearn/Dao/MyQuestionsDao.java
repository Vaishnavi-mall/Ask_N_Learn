package com.AskNLearn.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.AskNLearn.model.answer;
import com.AskNLearn.model.question;
import com.AskNLearn.model.user;

public class MyQuestionsDao {
	
	
	private Connection con;
    private int my_questions;
	public MyQuestionsDao(Connection con) {
		super();
		this.con = con;
	}
	
	
	public List<question> myques(user u)
	{
	
		List<question> queslist = new ArrayList<>();
		
		try {
			String query="Select ques from asknlearn.questions where q_u_id=(?)";
			String query2="Select count(ques) from asknlearn.questions where q_u_id =(?)";
			PreparedStatement ps = this.con.prepareStatement(query);
			PreparedStatement ps1=this.con.prepareStatement(query2);
			ps.setInt(1,u.getUser_id());
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				question newq = new question();
				newq.setQues(rs.getString("ques"));
				queslist.add(newq);
			
			}
			 ps1.setInt(1,u.getUser_id());
			 ResultSet rs1=ps1.executeQuery();
			 while(rs1.next())
			 {
				 my_questions=rs1.getInt("count(ques)"); 
			 }
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return queslist;
		
	}
	
	public int getMy_questions() {
		return my_questions;
	}


	public void setMy_questions(int my_questions) {
		this.my_questions = my_questions;
	}


}
