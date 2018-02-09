<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Edit</title>
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
	String values = request.getParameter("values");
	String split[] =values.split("~");
	String userid = split[0];
	String email =split[1];
	String department = split[2];
	String phone = split[3];
	%>
	<div class="container">
		<div class="panel-primary">
			<div class="panel-heading">
				<h3 class="panel-title">Edit</h3>
			</div>
			<div class="panel-body">
				<form action="update.jsp" class="form-horizontal" method="post">
				<div class="form-group col-md-6">
					<label class="control-label" for=UserID>USER ID</label>
					USER NAME CANNOT BE MODIFIED
					<input type="text" id="UserID" class="form-control" name="UserID" placeholder="ENTER YOUR USERID" readonly required="required" value="<%=userid%>">
				</div>
				<div class="clearfix"></div>
				<div class="form-group col-md-6">
					<label for="email" class="control-label">EMAIL ID</label>
					<input type="email" id="email" value ="<%=email%>"class="form-control" name="email" placeholder="ENTER YOUR EMAIL" required="required">
				</div>
				<div class="clearfix"></div>
				<div class="form-group col-md-6">
					<label for="department" class="control-label">DEPARTMENT</label>
					<select id="department" required="required" class="form-control" name="department">
						<option value="">Select</option>
						<option value="MARKETING">MARKETING</option>
						<option value="TESTING">TESTING</option>
						<option value="DEVELOPMENT">DEVELOPMENT</option>
						<option value="TRAINING">TRAINING</option>
					</select>
				</div>
				<div class="clearfix"></div>
				<div class="form-group col-md-6">
					<label for="phone" class="control-label">PHONE</label>
					<input type="tel" id="phone" class="form-control" name="phone" placeholder="ENTER YOUR PHONE" value ="<%=phone %>" required="required">
				</div>
				<div class="clearfix"></div>
				<div class="form-group col-md-6">
					<button class="btn btn-success">UPDATE</button>
				</div>
				</form>
			</div>
		</div>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.js"></script>
	</body>
</html>