<%@page import="com.AskNLearn.model.question"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head></head>
<title>Ask N Learn</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0, user-scalable=no"> 
<link rel="stylesheet" type="text/css" href="view/css_pages/GiveAns.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>
<%
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
if(session.getAttribute("user_id")==null)
{
	response.sendRedirect("JoinUs.jsp");
}
%>
<div class="navbar">
<img src="view/images/logo.png" float="left" width="95px" height="95px">
	<div class="search">
<form  method="post">
<input class="inbox" type="search" placeholder="Search your query here"> 
</form>	
</div>
<a class="butsty" href="AboutUs.jsp"><span class="fa fa-group"> About Us</span></a>
<a class="butsty" href="AskQuestion.jsp"><span class="fa fa-question"> Ask Question</span></a>
<a class="butsty" href="Profile.jsp"><span class="fa fa-user-circle-o"> My Profile</span></a>
</div>
<form action="AddAnswerServlet" method="post"> 
<div class="ans">
<textarea name="answer" rows="20" cols="80" placeholder="Write Your Answer here" style="border:3.5px solid #2ecc71;
	border-radius:10px; background:#faffdd " class="texty"></textarea>
</div>
<br>
<div class="main-content2">
<input type="submit" value="Submit" 
style="border:2px solid #2ecc71; color:#2ecc71;width:100px;
height:40px; font-size:20px;
background-color:black;border-radius:10px;">
</div>
</form>
<div class="query">Question :</div>
<%
question q=new question();
q=(question)session.getAttribute("q");
out.print("<div class=\"center\">");
out.print(q.getQues());
out.print("</div");
%>


</body>
</html>