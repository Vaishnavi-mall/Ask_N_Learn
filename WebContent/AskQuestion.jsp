<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Ask N Learn</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0"> 
<link rel="stylesheet" type="text/css" href="view/css_pages/AskQuestion.css">
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
<div class="main-content">
<p><br>Ask Your Question<br></p>
</div>
<center>
<form action="AddQuestionServlet" method="post">
<div class="main-content2">
<textarea name="question" rows="15" cols="80" wrap="hard" maxlength="20000" placeholder="Write Your Question here" style="border:3.5px solid #2ecc71;
	border-radius:10px; background:#faffdd "></textarea>
</div>
<br>
<div class="main-content1">
Choose Department :
<select name="department" style="border:2px solid #2ecc71;
	border-radius:3px; background:#faffdd ">
  <option value="B.A(hons)Psychology">B.A(hons)Psychology</option>
  <option value="B.Sc(hons) Statistics">B.Sc(hons) Statistics</option>
  <option value="B.Sc(hons) Biomedical Science">B.Sc(hons) Biomedical Science</option>
  <option value="B.Sc(hons) Chemistry">B.Sc(hons) Chemistry</option>
  <option value="B.Sc(hons) Computer Science">B.Sc(hons) Computer Science</option>
  <option value="B.Sc(hons) Electronics">B.Sc(hons) Electronics</option>
  <option value="B.Sc(hons) Food Technology">B.Sc(hons) Food Technology</option>
  <option value="B.Sc(hons) Instrumentation">B.Sc(hons) Instrumentation</option>
  <option value="B.Sc(hons) Mathematics">B.Sc(hons) Mathematics</option>
  <option value="B.Sc(hons) Microbiology">B.Sc(hons) Microbiology</option>
  <option value="B.Sc(hons) Physics">B.Sc(hons) Physics</option>
  <option value="B.Sc(hons) Biochemistry">B.Sc(hons) Biochemistry</option>
  <option value="Bachelor Of Business Administration">Bachelor Of Business Administration</option>
  <option value="Bachelor Of Management Studies">Bachelor Of Management Studies</option>
</select>
</div>
<br><br><br>
<div class="main-content3">
<input type="submit" value="Submit" 
style="border:2px solid #2ecc71; color:#2ecc71;width:100px;
height:40px; font-size:20px;
background-color:black;border-radius:10px;">
</div>
</form>
</center>
</body>
</html>