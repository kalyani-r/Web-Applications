<!-- It is a JSP page which is displayed when the mean of the enetered data is greater than 90 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="kalyani.*"%>
    <%@page import=" java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WinnerAknowledgement</title>
<link type="text/css"  rel="stylesheet" href="depstyle.css" />
</head>
<body>
 <div class="header"><img src="logo.jpg" width="150" height="100" alt="gmu logo" /><!-- end .header -->></div>

<h3>Thank you. Your Survey has been successfully submitted.</h3>
<h4>Congratulations. You have won two movie tickets.</h4>
<br />
<h4>Mean: ${data_bean1.getMean() }<br/>
Standard Deviation: ${data_bean1.getStandardDeviation() }<br/>
</h4>
	
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

  <div class="footer">
	

</body>
</html>


<body>


