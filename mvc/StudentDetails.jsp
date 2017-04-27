<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="kalyani.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
<link type="text/css"  rel="stylesheet" href="depstyle.css" />
<style type="text/css">


</style>
</head>
<body>
 <div class="header"><img src="logo.jpg" width="150" height="100" alt="gmu logo" /></div>
<div align="center">
<h4> STUDENT DETAILS: </h4><br/></div>
<ul>
<table align="center">
<tr><td><li><b>Name</b>:</td> <td> ${ studentdetails.getName()}</li></td> </tr>
<tr><td><li><b>Student_Id</b>:</td> <td> ${ studentdetails.getStudent_ID()}</li></td></tr>
<tr><td><li><b>Street Address</b>:</td> <td> ${ studentdetails.getAddress()}</li></td></tr>

<tr><td><li><b>City</b>:</td> <td> ${ studentdetails.getCity() }</li></td></tr>
<tr><td><li><b>State</b>:</td> <td>${ studentdetails.getState()}</li></td></tr>
<tr><td><li><b>Zip Code</b>:</td> <td> ${ studentdetails.getZip_Code() }</li></td></tr>

<tr><td><li><b>Telephone</b>:</td> <td>${ studentdetails.getPhone()}</li></td></tr>
<tr><td><li><b>E-mail</b>:</td> <td>${ studentdetails.getEmail_ID()}</li></td></tr>
<tr><td><li><b>URL</b>:</td> <td> ${ studentdetails.getURL()}</li></td></tr>

<tr><td><li><b>Date Of Survey</b>:</td> <td> ${ studentdetails.getDate1()}</li></td></tr>
<!--  <tr><td><b>What Did You Like The Most in this university</b>: ${studentdetails.getThings()}</td></tr>
<tr><td><b>How Did You Know About this university</b>: ${studentdetails.getKnowAbout()}</td></tr> -->

<tr><td><li><b>Comments</b>:</td> <td> ${studentdetails.getComments()}</li></td></tr>

<tr><td><li><b>Graduation year</b>:</td> <td> ${studentdetails.getYear()}</li></td></tr>

<tr><td><li><b>How Likely Would You Recommend this university</b>:</td> <td> ${studentdetails.getLikely()}</li></td></tr>
</table>
</ul>
</body>
</html>