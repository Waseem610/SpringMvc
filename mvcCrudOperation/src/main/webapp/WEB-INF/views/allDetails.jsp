<%@page import="org.springframework.context.event.EventListenerMethodProcessor"%>
<%@page import="com.te.crud.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Employee> emp=(List<Employee>)request.getAttribute("all"); 

%>
<h1>Employee Details </h1>
<%for(Employee empl:emp){ %>
<h1><%=empl %></h2>
<br>

<%} %>

</body>
</html>