<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>addition</h3>

<%

int a=1;
int b=4;
int c=a+b;
%>
result is <%=c %>
<%!
public int add(int a, int b){
return a+b;	
}
%>
<%
int k=add(77,88);
%>

<br>

<%=k %>


</body>
</html>