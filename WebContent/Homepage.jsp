<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<title>Ask N Learn</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0, user-scalable=no"> 
<link rel="stylesheet" type="text/css" href="view/css_pages/NewHomepage.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>
<div class="navbar">
<img src="view/images/logo.png" float="left" width="95px" height="95px">
	<div class="search">
<form  action="SearchQuestionServlet" method="post">
<input class="inbox" type="search" name="question" placeholder="Search your query here"> 
</form>	

</div>
<a class="butsty" href="AboutUs.jsp"><span class="fa fa-group"> About Us</span></a>
<a class="butsty" href="AskQuestion.jsp"><span class="fa fa-question"> Ask Question</span></a>
<a class="butsty" href="Profile.jsp"><span class="fa fa-user-circle-o"> My Profile</span></a>
</div>
<div class="main-content">
<p>
You will never follow your inner voice<br>
until you clean up the doubts in your mind
</p>
</div>
<section>
<div class="search-box">
<form action="SearchQuestionServlet" method="post">
<input class="inbox-box" type="search" name="question" placeholder="Search your query here"> 
</form>
</div>
<div class="quotes">
<p>
I can explain it to you<br>
But I can't understand it for you
</p>
</div>
<div class="book">
<p>
<center>Give Answers to our questions</center>
<p>
</div>
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
</section>
</head>
</body>
</html>

