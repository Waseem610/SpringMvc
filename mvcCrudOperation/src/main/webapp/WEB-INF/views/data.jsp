<%@page import="com.te.crud.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Object obj= request.getAttribute("Employee"); %>
<h1 style="color: red"> This is the details of the Employee </h1>
<h1><%=obj %></h1>
</body>
</html>