<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
		<title>Todo's for ${name}</title>
		<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>
<div class="container">
       
		<table class="table table-striped" >
		 
			<caption>Your todo's are</caption>
			<thead>
				<tr>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is it Done?</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.desc}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
						<td><a type="button" class="btn btn-success">update</a></td>
						<td><a type="button" href="/delete-todos?id=${todo.id}" class="btn btn-warning">Delete </a></td>
				
	               </tr>
				</c:forEach>
			</tbody>
		</table>
      <div> <a class="button" href="/add-todos">Add a todo</a></div>
       

		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	    </div>
</body>
</html>