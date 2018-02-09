<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.includehelp.*, java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Updating.......</title>
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
		String message = opObject.Update(uObject);
                message = opObject.save(uObject);
		//opObject.save(uObject);
                //opObject.save(uObject);
		if(message!=null){%>
			<div class="clearfix"></div>
                        <jsp:include page="index.jsp"></jsp:include>
			<div class="alert alert-success col-md-4">
			<%=message%></div>

		<%}
		%>
                
	</body>
</html>