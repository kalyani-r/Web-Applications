<%-- This jsp file is used to display a message to a user.!! --%>
<%-- If the mean of the data entered by the user is less than 90 then this jsp page is invoked.! --%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import=" java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SimpleAcknowledgement</title>
</head>
<body>
 <table  align="center" width="800" cellpadding="0" cellspacing="0">
<tr>
<td><a href="http://www.gmu.edu"><img src="GMU.jpg" width="200" height="100"/></a></td>
<td  align="right">Kalyani Rachakonda</td>
</tr>
</table>
<div align="center" >
<h3><p><strong>Thank You For Filling The Form.!!!</strong></p></h3>
<div align="center">
	<table class="surveyform" cellpadding="5" border="5">
	<tr> 
	<td>
		<strong>Mean: </strong>${data_bean1.getMean() } </td> </tr>
		<tr> <td><strong>Standard Deviation: </strong>${data_bean1.getStandardDeviation() } </td> </tr>
		<tr> <td><strong>Your Data Is Saved !! </strong> </td> </tr>
</table>
</div>
<center>
<h4>Please select an ID among the following to view the information of a Student</h4><br>
</center>
<table border="5" cellpadding="10" cellspacing="10">
		<%
		String[] idstring = (String[])request.getAttribute("id_jsp");
		
			for (int i=0;i<idstring.length;i++) {
			String stuid = idstring[i];
		%>		
		<li><a href="/Struts5/ShowValues?id=<%=stuid%>"><%=stuid%></a></li>		
		<%
			}
		%>
	</table>
</div>

</body>
</html>