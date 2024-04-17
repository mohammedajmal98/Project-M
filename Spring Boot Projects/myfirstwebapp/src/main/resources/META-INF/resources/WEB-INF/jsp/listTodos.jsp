<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>
	<div class="container">
		<h1>Your Todos</h1>
		
		<table class="table">
			<thead>
				<tr>
				<!--  <th>id</th>-->
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
					<th></th> <!-- For Delete Button -->
					<th></th> <!--  For Update Button -->
				</tr>
			</thead>
			<tbody>
				<!-- forEach loop to iterate/collect all list items. -->
				<!--var - variable which should be same name as how we save "model name"-->
				<c:forEach items="${todos}" var="todo">
					<tr>
					<!--<td>${todo.id}</td>-->
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>  
						<td>${todo.done}</td>
						<!-- pass id as query parameter -->
						<td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
						<td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<!--  Add Todo Button. success-Green button -->
		<a href="add-todo" class="btn btn-success">Add Todo</a>
		
	</div>
		
<%@ include file="common/footer.jspf" %>
	