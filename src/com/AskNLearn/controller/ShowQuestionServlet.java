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
import com.AskNLearn.Dao.ShowQuestionDao;
import com.AskNLearn.Sql_Connection.*;

@WebServlet("/ShowQuestionServlet")
public class ShowQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String department=request.getParameter("department");
	question q=new question();
	q.setDepartment(department);
	
	ShowQuestionDao dao=new ShowQuestionDao(Sql_Connection.getConnection());
	List<question> list=new ArrayList<>();
	list=dao.search_dep(q);

	
	HttpSession session= request.getSession();
	session.setAttribute("list", list);
	response.sendRedirect("ShowQuestions.jsp");
	
		
		
		
		
		
	}

}
