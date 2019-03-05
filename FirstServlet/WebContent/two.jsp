<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
 String uname=request.getParameter("username");
 if(uname !="" && uname != null) {
 session.setAttribute("sessionusername", uname);
 application.setAttribute("applicationname", uname);
 pageContext.setAttribute("applicationusername", uname, pageContext.APPLICATION_SCOPE);
 pageContext.setAttribute("sessionusername", uname, pageContext.SESSION_SCOPE);
 }
 %>
 <%=uname %>
 <br>
 <%=session.getAttribute("sessionusername")%>
 <br>
 <%=application.getAttribute("applicationusername")%>
 <br>
 name in application context object is: <%=application.getAttribute("applicationusername")%>
 <br>
 name in session object is: <%=session.getAttribute("sessionusername")%>
</body>
</html>