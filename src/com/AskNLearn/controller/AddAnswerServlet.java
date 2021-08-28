package com.AskNLearn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.AskNLearn.Dao.AddAnswerDao;
import com.AskNLearn.Sql_Connection.Sql_Connection;
import com.AskNLearn.model.answer;
import com.AskNLearn.model.question;

@WebServlet("/AddAnswerServlet")
public class AddAnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		question q=new question();
		q=(question)session.getAttribute("q");

		String ans=request.getParameter("answer");
		int a_q_id=q.getQ_id();
		int a_u_id=(int)session.getAttribute("user_id");
		answer a=new answer();
		a.setA_q_id(a_q_id);
		a.setA_u_id(a_u_id);
		a.setAns(ans);
		AddAnswerDao dao=new AddAnswerDao(Sql_Connection.getConnection());
		if(dao.insert_ans(a))
		{
		response.sendRedirect("Homepage.jsp");
	     }
		else
		{
			response.sendRedirect("ShowQuestions.jsp");
		}
	
	}
	

}
