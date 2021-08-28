package com.AskNLearn.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.AskNLearn.Dao.GetQuestionDao;
import com.AskNLearn.Sql_Connection.Sql_Connection;
import com.AskNLearn.model.question;

@WebServlet("/GetQuestionServlet")
public class GetQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
        int q_id =Integer.parseInt(request.getParameter("q_id"));
        System.out.println(q_id);
		question q=new question();
		q.setQ_id(q_id);
		GetQuestionDao dao= new GetQuestionDao(Sql_Connection.getConnection());
		q=dao.GetQuestion(q);
		HttpSession session = request.getSession();
		session.setAttribute("q",q);
		response.sendRedirect("GiveAns.jsp");
	}

}
