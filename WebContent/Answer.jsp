<%@page import="com.AskNLearn.model.answer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.AskNLearn.model.question"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<title>Ask N Learn</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0, user-scalable=no"> 
<link rel="stylesheet" type="text/css" href="view/css_pages/Answer2.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>
<div class="navbar">
<img src="view/images/logo.png" float="left" width="95px" height="95px">
	<div class="search">
<form  action="SearchQuestionServlet" method="post">
<input class="inbox" type="search" name=" question" placeholder="Search your query here"> 
</form>	
</div>
<a class="butsty" href="AboutUs.jsp"><span class="fa fa-group"> About Us</span></a>
<a class="butsty" href="AskQuestion.jsp"><span class="fa fa-question"> Ask Question</span></a>
<a class="butsty" href="Profile.jsp"><span class="fa fa-user-circle-o"> My Profile</span></a>
</div>
<%
List<question> queslist=new ArrayList<>();
queslist=(List<question>)session.getAttribute("queslist");
List<answer> anslist=new ArrayList<>();
anslist=(List<answer>)session.getAttribute("anslist");
for(int i=0;i<queslist.size();i++)
{
	out.print("<div class=\"center\">");
	out.write("<p>");
	out.print("Q.)");
	out.println(queslist.get(i).getQues());
	out.write("</p>");
	out.write("<p>");
	out.print("A.)");
	out.println(anslist.get(i).getAns());
	out.write("</p>");
	 out.print("</div>");
	  out.print("<br>");
}


%>
<center>
<div class="center1">
NOT ABLE TO FIND WHAT YOU'RE LOOKING FOR
<br>ASK YOUR QUESTION HERE
<div class='button'>
<a href="AskQuestion.jsp">AskQuestion</a></div>
</div>

</center>

<div class="footer">
<p>For more details contact us at:codestarts@gmail.com</p>
</div>
</section>
</head>
</body>
</html>