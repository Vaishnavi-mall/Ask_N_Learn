package com.AskNLearn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AskNLearn.model.user;
import com.AskNLearn.Dao.SignUpDao;
import com.AskNLearn.Sql_Connection.*;

@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String first_name=request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email_id= request.getParameter("email_id");
		String pass_word= request.getParameter("pass_word");

		user u=new user();
		u.setFirst_name(first_name);
		u.setLast_name(last_name);
		u.setEmail_id(email_id);
		u.setPass_word(pass_word);
		

	   SignUpDao dao= new SignUpDao(Sql_Connection.getConnection());
	   
	   if(dao.insert_user(u))
		   response.sendRedirect("Login.jsp");
	   else
		   response.sendRedirect("SignUp.jsp");
	   
		
		
		
		
		
	}

}
