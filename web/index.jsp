<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.includehelp.*, java.util.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>CRUD</title>
		<link rel="stylesheet" href="bootstrap.min.css">
              
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
		<div class="panel-primary">
		<div class="panel-heading">
		<h3 class="panel-title">Atit databse</h3>
		</div>
		<div class="panel-body">
		<form action="action.jsp" class="form-horizontal" method="post">
		<div class="form-group col-md-6">
			<label class="control-label" for="UserID">USER ID </label>
			<input type="text" id="UserID" class="form-control" name="UserID" placeholder="ENTER YOUR UserID" required="required">
		</div>
		<div class="clearfix"></div>
		<div class="form-group col-md-6">
			<label for="email" class="control-label">EMAIL ID</label>
			<input type="email" id="email" class="form-control" name="email" placeholder="ENTER YOUR EMAIL" required="required">
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
			<input type="tel" id="phone" class="form-control" name="phone" placeholder="ENTER YOUR PHONE" required="required">
		</div>
		<div class="clearfix"></div>
		<div class="form-group col-md-6">
			<button class="btn btn-success">REGISTER</button>
		</div>
		</form>
		</div>
		</div>
		</div>

		<% 
		Operations opObject = new Operations();
	
		List<UserPOJO> list = new ArrayList();
		
		list = opObject.getListUsers();
		System.out.println(list.size());
		if(!(list.isEmpty())){
		%>
		<table class="table bordered">
		<thead><tr><th></th><th>USER ID</th><th>EMAIL</th><th>PHONE</th><th>DEPARTMENT</th></tr></thead>
		<% for(UserPOJO p : list){%>
		<tr><td><input type="radio" name="rdValues" id="rdId" value="<%=p.getUserid()+"~"+p.getEmail()+"~"+p.getDepartment()+"~"+p.getPhone()%>"></td><td><%=p.getUserid()%></td><td><%=p.getEmail()%></td><td><%=p.getPhone()%></td><td><%=p.getDepartment()%></td></tr>
		<% }%>
		</table>
		
		<button class="btn btn-primary" name="edit" value="edit" onclick="editThis()">EDIT</button>
		<button class ="btn btn-primary" name="delete" value="delete" onclick="deleteThis()">DELETE</button>
	
	<%}
	%>
	<script>
	function editThis(){
		var edit;
		edit = document.getElementsByName("rdValues");
		
		var selVal="";
		for(var c=0;c<edit.length;c++){
			if(edit[c].checked === true){
				selVal+=edit[c].value;
			break;		
			}
		}
		
		window.location.href="edit.jsp?values="+selVal;
	}
	function deleteThis(){
		
		var values;
		values = document.getElementsByName("rdValues");
		var selVal="";
		for(var c=0;c<values.length;c++){
			if(values[c].checked ===true){
				selVal+=values[c].value;
			break;		
			}
		}
		window.location.href="delete.jsp?userid="+selVal;
		
	}
	</script>

		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.js"></script>
	</body>
</html>