<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0, user-scalable=no"> 
<link rel="stylesheet" type="text/css" href="view/css_pages/NewLetsGo.css">
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
	<form action="SearchQuestionServlet" method="post">
<input class="inbox" type="search" placeholder="Search your query here"> 
</form>
</div>
<a class="butsty" href="AboutUs.jsp"><span class="fa fa-group"> About Us</span></a>
<a class="butsty" href="AskQuestion.jsp"><span class="fa fa-question"> Ask Question</span></a>
<a class="butsty" href="Profile.jsp"><span class="fa fa-user-circle-o"> My Profile</span></a>
</div>
<div id="myon">
<p>"A candle loses nothing by lighting another candles"</p>
</div>
<br>
<div id="main">
<p>Answer a question while you wait for yours</p>
</div>
<div id="ut">
<a  class="uty" href="ShowDepartment.jsp">Let's go</a>
<div class="footer">
<p>For more detail contact us at:codestarts@gmail.com</p>
</div>
</head>
</body>
</html>	