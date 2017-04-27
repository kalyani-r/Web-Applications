<%--This jsp file is used to display a message to a user.!! --%> 
<%--If the mean of the data entered by the user is greater than 90 then this jsp page is invoked.! --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="java.util.HashMap"%>
    <%@page import=" java.util.Iterator"%>
    <%@page import=" java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WinnerAknowledgement</title>
</head>
<body>
<table  align="center" width="800" cellpadding="0" cellspacing="0">
<tr>
<td  align=" right"><p class="Struts5"  >Kalyani Rachakonda</p></td>
</tr>
</table>
<center>
<p><strong>Thanks for filling out the form!!</strong></p><br>
	<p>
		<b>Congratulations!!!</b> <br> <br> <br>
		<b> You won two movie tickets!</b>
	</p>
	</center>
	<center>
	<table cellpadding="10" cellspacing="10" border="5">
		<tr> <td><strong>Mean : </strong>${data_bean1.getMean() }</td></tr><br>
		<tr> <td><strong>Standard Deviation :</strong>${data_bean1.getStandardDeviation() }</td> </tr>
		<tr> <td> <strong> Data is stored successfully.!!</strong></td> </tr>
	</table>
	<br>
	<br>
	</center>
	<center> <strong> Please select a student Id to view his details.!!</strong></center><br>
	<br>
	<center>
	<table>
		<%
		String[] idstring = (String[])request.getAttribute("id_jsp");
		
			for (int i=0;i<idstring.length;i++) {
			String stuid = idstring[i];
		%>
		<a href="/Struts5/ShowValues?id=<%=stuid%>"><%=stuid%></a>
		<br>
		<br />
		<%
			}
		%>


	</table>
	</center>
	<table align="center" width="800" cellpadding="0" cellspacing="0">
	<tr>
    	<td align="right">
        <a href="http://www.gmu.edu" class="Tooltip" title="Please visit http://www.gmu.edu for more information."><img src="logo.jpg" width="50px" height="50px" /></a>
        </td>
    </tr>
</table>
<table align="center" width="800" cellpadding="0" cellspacing="0">
    <tr>
        <td width="800" height="10" colspan="2">
        	<p><img src="green.jpg" width="800" height="10"/></p>
        </td>
    </tr>
    
</table>

</body>
</html>