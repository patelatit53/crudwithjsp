<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.includehelp.*, java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>CRUD</title>
                <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	
	<body>
		<%
		String value = request.getParameter("userid");
		String split[] =value.split("~");
		String userid = split[0];

		Operations opObject = new Operations();
		String message = opObject.deleteUser(userid);
		if(message!=null){%>
		<div class="clearfix"></div>
		<jsp:include page="index.jsp"></jsp:include>
		<span class="alert alert-success col-md-4"><%=message%></span>
		<%}

		%>
	</body>
</html>
