<!-- It is a JSP page that is displayed when mean of the entered data is less than 90 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="kalyani.*"%>
    <%@page import=" java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SimpleAcknowledgement</title>
<link type="text/css"  rel="stylesheet" href="depstyle.css" />
</head>
<body >
 <div class="header"><img src="logo.jpg" width="150" height="100" alt="gmu logo" /><!-- end .header -->></div>

<h3><p>Thanks for taking interest and filling out the form!!</p></h3>
		Mean: ${data_bean1.getMean() }<br/>
		Standard Deviation:${data_bean1.getStandardDeviation() }<br/>
		Data entered by you is successfully saved<br/>
<h4>Select Id's from the following list:</h4>
</div>
<table align="center">	
	
	<ul>
		<%
		String[] idstring = (String[])request.getAttribute("id_jsp");
		
		
			for (int i=0;i<idstring.length;i++) {
			String stuid = idstring[i];
		%>		
		<tr><td><li><a href="/kalyani/MainServlet?id=<%=stuid%>"><%=stuid%></a></li></td></tr>		
		<%
			}
		%>
	</ul>
		</table>
		 </div>		
</body>
</html>