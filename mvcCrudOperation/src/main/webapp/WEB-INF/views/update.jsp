<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Enter the employee details to update</h1> 
<form action="./update" method="post">
Enter Employee Id <input type="number" name="empId"> <br>
Enter Firstname <input type="text" name="firstName">
<br>
Enter lastname <input type="text" name="lastName"><br>
Enter Email <input type="email" name="email"><br>
Enter Date of Joining <input type="date" name="doj"><br>
Enter the salary <input type="number" name="salary"><br>
<input type="submit" name="Update">
</form>
</body>
</html>