package com.AskNLearn.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.AskNLearn.model.question;
import com.AskNLearn.model.answer;
public class SearchQuestionDao
{

	private Connection con;

	public SearchQuestionDao(Connection con) {
		super();
		this.con = con;
	}
	
	public List<List> SearchQues(question q)
	{
		List<List> mainlist=new ArrayList<>();
		List<question> queslist = new ArrayList<>();
		List<answer> anslist=new ArrayList<>();
		
		try {
			String query="Select q.ques,a.ans from asknlearn.questions q,asknlearn.answers a where match(ques) against(?) and q_id=a_q_id";
			PreparedStatement ps = this.con.prepareStatement(query);
			ps.setString(1,q.getQues());
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
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		mainlist.add(queslist);
		mainlist.add(anslist);
		return mainlist;
		
	}
}
