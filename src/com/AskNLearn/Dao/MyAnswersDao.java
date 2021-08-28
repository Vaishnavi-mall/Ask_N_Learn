package com.AskNLearn.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.AskNLearn.model.answer;
import com.AskNLearn.model.question;
import com.AskNLearn.model.user;

public class MyAnswersDao {

	private Connection con;
	private int my_answers;

	public MyAnswersDao(Connection con) {
		super();
		this.con = con;
	}
	
	
	public List<List> myans(user u)
	{
		List<List> mainlist=new ArrayList<>();
		List<question> queslist = new ArrayList<>();
		List<answer> anslist=new ArrayList<>();
		
		try {
			String query="Select q.ques,a.ans from asknlearn.questions q, asknlearn.answers a where a_u_id=(?) and q_id=a_q_id";
			String query3="Select count(ans) from asknlearn.answers where a_u_id =(?)";
			PreparedStatement ps = this.con.prepareStatement(query);
			PreparedStatement ps2=this.con.prepareStatement(query3);
			ps.setInt(1,u.getUser_id());
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				question newq = new question();
				newq.setQues(rs.getString("q.ques"));
				queslist.add(newq);
				answer newa=new answer();
				newa.setAns(rs.getString("a.ans"));
				anslist.add(newa);
			}
			 ps2.setInt(1,u.getUser_id());
			 ResultSet rs2=ps2.executeQuery();
			 while(rs2.next())
			 {
				 my_answers=rs2.getInt("count(ans)"); 
			 }
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		mainlist.add(queslist);
		mainlist.add(anslist);
		return mainlist;
		
	}


	public int getMy_answers() {
		return my_answers;
	}


	public void setMy_answers(int my_answers) {
		this.my_answers = my_answers;
	}
	
	

	
}
