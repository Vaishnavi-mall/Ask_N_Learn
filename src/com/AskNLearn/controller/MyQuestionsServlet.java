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

import com.AskNLearn.Dao.MyQuestionsDao;
import com.AskNLearn.Sql_Connection.Sql_Connection;
import com.AskNLearn.model.answer;
import com.AskNLearn.model.question;
import com.AskNLearn.model.user;

@WebServlet("/MyQuestionsServlet")
public class MyQuestionsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		HttpSession session=request.getSession();
		int user_id=(int)session.getAttribute("user_id");
		
		user u =new user();
		u.setUser_id(user_id);
		MyQuestionsDao dao= new MyQuestionsDao(Sql_Connection.getConnection());
		@SuppressWarnings("rawtypes")
		List<question> queslist=new ArrayList<>();
		queslist=dao.myques(u);		
        session.setAttribute("myques", queslist);
    	session.setAttribute("my_questions",dao.getMy_questions());
		
		response.sendRedirect("MyQuestions.jsp");
		
		
		
	}

}
