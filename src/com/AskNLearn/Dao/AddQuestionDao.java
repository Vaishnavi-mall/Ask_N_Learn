package com.AskNLearn.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.AskNLearn.model.question;

public class AddQuestionDao 
{
	private Connection con;

	public AddQuestionDao(Connection con) {
		super();
		this.con = con;
	}
		
		public boolean insert_ques(question q)
		{
			boolean var=false;
			
			try
			{
				String query="Insert into asknlearn.questions(q_u_id,ques,department) values (?,?,?)";
				PreparedStatement ps=this.con.prepareStatement(query);
				ps.setInt(1,q.getQ_u_id());
				ps.setString(2,q.getQues());
				ps.setString(3,q.getDepartment());

				ps.executeUpdate();
				var=true;
							
			}catch(Exception e)
			{
	          e.printStackTrace();
			}
			
			
			
			return var;
		}
}
