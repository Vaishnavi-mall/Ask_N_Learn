package com.AskNLearn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.AskNLearn.model.user;
import com.AskNLearn.Dao.LoginDao;
import com.AskNLearn.Sql_Connection.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String email_id=request.getParameter("email_id");
		String pass_word=request.getParameter("pass_word");
		
		
		user u=new user();
		u.setEmail_id(email_id);
		u.setPass_word(pass_word);
  
		LoginDao dao= new LoginDao(Sql_Connection.getConnection());
		if(dao.search_user(u));
		{
			HttpSession session=request.getSession();
			session.setAttribute("user_id",dao.getUser_id());
			session.setAttribute("first_name",dao.getFirst_name());
			session.setAttribute("last_name", dao.getLast_name());
			response.sendRedirect("Homepage.jsp");
			
		}
		
		
		
	}

}
