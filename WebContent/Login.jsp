<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Ask N Learn</title>
<link rel="stylesheet" type="text/css" href="view/css_pages/Login.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>
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
<body>
<form  class="box" action="LoginServlet" method="post">
<h1>Login</h1>
<input type="text" name="email_id" placeholder="Email Id" required>
<input type="password" name="pass_word" placeholder="Password" required>
<input type="submit" value="Login">
<label  for="Signup.jsp" style="color:white;" >New User ???</label>
<a href="Signup.jsp">Signup</a>
</form>
</body>
</head>
</html>

