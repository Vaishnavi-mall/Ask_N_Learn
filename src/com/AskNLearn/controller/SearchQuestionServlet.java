package com.AskNLearn.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.AskNLearn.model.question;
import com.AskNLearn.model.answer;
import com.AskNLearn.Sql_Connection.*;
import com.AskNLearn.Dao.SearchQuestionDao;



@WebServlet("/SearchQuestionServlet")
public class SearchQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
		
		@SuppressWarnings("unchecked")
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String ques=request.getParameter("question");
			question q= new question();
			q.setQues(ques);
			SearchQuestionDao dao= new SearchQuestionDao(Sql_Connection.getConnection());
			@SuppressWarnings("rawtypes")
			List<List> mainlist=new ArrayList<>();
			mainlist=dao.SearchQues(q);
	        List<question> queslist=new ArrayList<>();
	        queslist=mainlist.get(0);
	        List<answer> anslist=new ArrayList<>();
	        anslist=mainlist.get(1);
	        HttpSession session = request.getSession();
	        session.setAttribute("queslist", queslist);
	        session.setAttribute("anslist", anslist);
			response.sendRedirect("Answer.jsp");
			
		
		}	
}