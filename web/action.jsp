<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.includehelp.*, java.util.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>CRUD</title>
		<link rel="stylesheet" href="css/bootstrap.css">
                <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	
	<body>
		<%
		String userid = request.getParameter("UserID");
		String email = request.getParameter("email");
		String tel = request.getParameter("phone");
		String department = request.getParameter("department");
		long phone = Long.parseLong(tel);


		UserPOJO uObject = new UserPOJO();
		uObject.setUserid(userid);
		uObject.setEmail(email);
		uObject.setDepartment(department);
		uObject.setPhone(phone);


		Operations opObject = new Operations();
		String message = opObject.save(uObject);%>


		<%if(message!=null){%>
		<jsp:include page="index.jsp"></jsp:include>
		<% }
			%>
	</body>
</html>