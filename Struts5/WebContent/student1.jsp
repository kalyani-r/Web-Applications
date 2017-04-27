<%--  this page is used to display the information of the student retrieved from the data base. --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body 
{
    background-color: #d3d3d3;
}
h1
{
	color: blue;
	text-shadow: 2px 2px #ffff00;
}
img
{
	height: 150px;
	width:150px;
}
</style>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<table align="center" width="800" cellpadding="0" cellspacing="0">
<tr>
<td><a href="http://www.gmu.edu"><img src="GMU.jpg" width="200" height="100"/></a></td>
<td  align="right">Kalyani Rachakonda</td>
</tr>
</table>
<table cellpadding="10" cellspacing="10" align="center" border="5">
<tr>
	<td><strong>First Name:</strong> ${ student1.getfname()}</td>
	<td><strong>Last Name:</strong> ${ student1.getlname()}</td>
	<td><strong>Student_Id:</strong> ${ student1.getstudentid()}</td>
	
</tr>

<tr>
	<td><strong>City:</strong> ${ student1.getcity() }</td>
	<td><strong>State:</strong> ${ student1.getstate()}</td>
	<td><strong>Pincode:</strong> ${ student1.getpincode() }</td>
</tr>

<tr>
	<td><strong>Telephone: </strong>${ student1.getphoneno()}</td>
	<td><strong>E-mail:</strong> ${ student1.getemail()}</td>
	<td><strong>URL:</strong> ${ student1.geturl()}</td>
</tr>

<tr>
	<td><strong>Date Of Survey:</strong> ${ student1.getdate()}</td>
	<td><strong>What Did You Like The Most In Campus=:</strong> ${student1.getcampus()}</td>
	<td><strong>How Made You Interested In the university? :</strong> ${student1.getinterested()}</td>
</tr>
	

<tr>
	<td><strong>Comments:</strong> ${student1.getcomments()}</td>
	<td><strong>Month Of Graduation: </strong>${student1.getmonth()}</td>
	<td><strong>Year Of Graduation:</strong> ${student1.getyear()}</td>
</tr>

<tr rowspan="3"><td><strong>How Likely Would You Recommend the university:</strong> ${student1.getlikeness()}</td></tr>
</table>
<table align="center" width="800" cellpadding="0" cellspacing="0">
	<tr>
    	<td align="right"><a href="http://www.gmu.edu" class="Tooltip" title="Please visit http://www.gmu.edu for more information."><img src="GMU.jpg" width="200px" height="100px" /></a>
        </td>
    </tr>
</table>

</body>
</html>