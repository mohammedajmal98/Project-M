<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>
	<div class="container">
		<h1>Enter Todo Details</h1>

		<!-- path(like 'id' in html) = " " should be match with the exact name of the field in bean todo -->

		<!-- Map this form to 'todo' using modelAttribute -->
		<form:form method="post" modelAttribute="todo">
			<!-- Fieldset - groups all fields related to one element -->
			<fieldset class="mb-3">
				<!-- mb-3 is margin bottom -->
				<form:label path="description">Description</form:label>
				<form:input type="text" path="description" required="required" />
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>
			<!-- To display the error message we set for the description -->
			<!-- cssClass is offered by "Bootstrap". can't use html class as it is using Spring Tags -->

			<fieldset class="mb-3">
				<!-- mb-3 is margin bottom -->
				<form:label path="targetDate">Target Date</form:label>
				<form:input type="text" path="targetDate" required="required" />
				<form:errors path="targetDate" cssClass="text-warning" />
			</fieldset>

			<form:input type="hidden" path="id" />
			<form:input type="hidden" path="done" />
			<input type="submit" class="btn btn-success" />

		</form:form>

	</div>

	<%@ include file="common/footer.jspf" %>

	<!-- Below configuration copied from Bootstrap datepicker website -->
	<script type="text/javascript">
		$('#targetDate').datepicker({ <!-- id/path mentioned with # -->
		    format: 'yyyy-mm-dd'
		});
	</script>
