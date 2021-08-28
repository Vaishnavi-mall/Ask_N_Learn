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

import com.AskNLearn.Dao.MyAnswersDao;
import com.AskNLearn.Sql_Connection.Sql_Connection;
import com.AskNLearn.model.answer;
import com.AskNLearn.model.question;
import com.AskNLearn.model.user;

@WebServlet("/MyAnswerServlet")
public class MyAnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session=request.getSession();
		int user_id=(int)session.getAttribute("user_id");
		
		user u =new user();
		u.setUser_id(user_id);
		MyAnswersDao dao= new MyAnswersDao(Sql_Connection.getConnection());
		@SuppressWarnings("rawtypes")
		List<List> mainlist=new ArrayList<>();
		mainlist=dao.myans(u);
        List<question> queslist=new ArrayList<>();
        queslist=mainlist.get(0);
        List<answer> anslist=new ArrayList<>();
        anslist=mainlist.get(1);
        session.setAttribute("myques1", queslist);
        session.setAttribute("myans1", anslist);
        session.setAttribute("my_answers",dao.getMy_answers());
		response.sendRedirect("MyAnswers.jsp");
		
		
	}

}
