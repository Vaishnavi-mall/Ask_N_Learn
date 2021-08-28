<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<title>Ask N Learn</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0, user-scalable=no"> 
<link rel="stylesheet" type="text/css" href="view/css_pages/ShowDepartment.css">
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
<form  action="SearchQuestionServlet" method="post">
<input class="inbox" type="search" placeholder="Search your query here"> 
</form>	
</div>
<a class="butsty" href="AboutUs.jsp"><span class="fa fa-group"> About Us</span></a>
<a class="butsty" href="AskQuestion.jsp"><span class="fa fa-question"> Ask Question</span></a>
<a class="butsty" href="Profile.jsp"><span class="fa fa-user-circle-o"> My Profile</span></a>
</div>
<div class="query">Department</div>
<form action="ShowQuestionServlet" method="post">
<div class="container1">
<input type="submit" value="B.A(hons)Psychology" name="department"
style="border:2px solid #2ecc71; color:#2ecc71;width:350px;
height:40px; font-size:20px;
background-color:black;border-radius:10px; ">
<br>
<br>
<input type="submit" value="B.Sc(hons) Statistics" name="department"
style="border:2px solid #2ecc71; color:#2ecc71;width:350px;
height:40px; font-size:20px;
background-color:black;border-radius:10px; ">
<br><br>
<input type="submit" value="B.Sc(hons) Biomedical Science" name="department" 
style="border:2px solid #2ecc71; color:#2ecc71;width:350px;
height:40px; font-size:20px;
background-color:black;border-radius:10px; ">
<br><br>
<input type="submit" value="B.Sc(hons) Chemistry" name="department"
style="border:2px solid #2ecc71; color:#2ecc71;width:350px;
height:40px; font-size:20px;
background-color:black;border-radius:10px; ">
<br><br>
<input type="submit" value="B.Sc(hons) Computer Science" name="department"
style="border:2px solid #2ecc71; color:#2ecc71;width:350px;
height:40px; font-size:20px;
background-color:black;border-radius:10px; ">
</div>
<div class="container2">
<input type="submit" value="B.Sc(hons) Electronics" name="department"
style="border:2px solid #2ecc71; color:#2ecc71;width:350px;
height:40px; font-size:20px;
background-color:black;border-radius:10px; ">
<br><br>
<input type="submit" value="B.Sc(hons) Food Technology" name="department"
style="border:2px solid #2ecc71; color:#2ecc71;width:350px;
height:40px; font-size:20px;
background-color:black;border-radius:10px; ">
<br><br>
<input type="submit" value="B.Sc(hons) Instrumentation" name="department"
style="border:2px solid #2ecc71; color:#2ecc71;width:350px;
height:40px; font-size:20px;
background-color:black;border-radius:10px; ">
<br><br>
<input type="submit" value="B.Sc(hons) Mathematics" name="department"
style="border:2px solid #2ecc71; color:#2ecc71;width:350px;
height:40px; font-size:20px;
background-color:black;border-radius:10px; ">
</div>
<div class="container3">
<input type="submit" value="B.Sc(hons) Microbiology" name="department"
style="border:2px solid #2ecc71; color:#2ecc71;width:350px;
height:40px; font-size:20px;
background-color:black;border-radius:10px; ">
<br><br>
<input type="submit" value="B.Sc(hons) Physics" name="department"
style="border:2px solid #2ecc71; color:#2ecc71;width:350px;
height:40px; font-size:20px;
background-color:black;border-radius:10px; ">
<br><br>
<input type="submit" value="B.Sc(hons) Biochemistry" name="department"
style="border:2px solid #2ecc71; color:#2ecc71;width:350px;
height:40px; font-size:20px;
background-color:black;border-radius:10px; ">
<br><br>
<input type="submit" value="Bachelor Of Business Administration" name="department" 
style="border:2px solid #2ecc71; color:#2ecc71;width:350px;
height:40px; font-size:20px;
background-color:black;border-radius:10px; ">
<br><br>
<input type="submit" value="Bachelor Of Management Studies" name="department"
style="border:2px solid #2ecc71; color:#2ecc71;width:350px;
height:40px; font-size:20px;
background-color:black;border-radius:10px; ">
<br><br>
</div>
</form>
<div class="footer">
<p>For more detail contact us at:codestarts@gmail.com</p>
</div>
</body>
</html>