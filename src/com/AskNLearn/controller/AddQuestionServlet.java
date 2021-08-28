package com.AskNLearn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.AskNLearn.model.question; 
import com.AskNLearn.Sql_Connection.*;
import com.AskNLearn.Dao.AddQuestionDao;


@WebServlet("/AddQuestionServlet")
public class AddQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session =request.getSession();
		
		 int q_u_id=(int)session.getAttribute("user_id");	
	     String ques=request.getParameter("question");
	     String department=request.getParameter("department");
	     
	     
	     question q=new question();
	     q.setQ_u_id(q_u_id);
		 q.setQues(ques);
		 q.setDepartment(department);
			
		 AddQuestionDao dao=new AddQuestionDao(Sql_Connection.getConnection());
		if(dao.insert_ques(q))
			{
			response.sendRedirect("LetsGo.jsp");
			}
		else
		{
			response.sendRedirect("AskQuestion.jsp");
		}
		
		 
		}
		
	}
