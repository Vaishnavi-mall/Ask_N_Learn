<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Ask N Learn</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0, user-scalable=no"> 
<link rel="stylesheet" type="text/css" href="view/css_pages/Profile.css">
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
<a class="butsty" href=" Profile.jsp"><span class="fa fa-user-circle-o"> My Profile</span></a>
</div>
<div id="full">
 <div id="half">
 <img src="view/images/user.png" style=" width:160px;
 margin-left:110px;margin-top:-10px;">
 </div>
 <div id="semihalf">
 <p style="text-align:center;">
 <%
 out.print("Hello !!! ");
 out.print(session.getAttribute("first_name"));
 out.print(" ");
 out.print(session.getAttribute("last_name"));
 %>
 </p>
 <p><br><a href="MyQuestionsServlet">&nbspMy Questions : &nbsp</a> 
 <%
 out.print(session.getAttribute("my_questions"));
 %>
 </p>
 <p><a href="MyAnswerServlet">&nbspMy Answers  &nbsp  : &nbsp &nbsp</a> 
 <%
 out.print(session.getAttribute("my_answers"));
 %>
 </p>
 </div>
 </div>
<div class="footer">
<p>For more detail contact us at:codestarts@gmail.com</p>
</div>
</head>
</body>
</html>