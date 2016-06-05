<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>

<script src="<c:url value="https://code.jquery.com/jquery-1.10.2.js" />"></script>
<table id="users_table" class="table default_table">
	<thead>
		<tr>
			<th>Id</th>
			<th>Ім'я</th>
			<th>Фамілія</th>
			<th>Вік</th>
			<th>Результати тестів</th>
			<th>Видалити</th>
		</tr>
	</thead>
	<tbody id="tablecont"></tbody>

</table>
</table>
		<!-- Modal -->
		<div id="myModalDel" class="modal fade" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Результати тестів</h4>
					</div>
					<div class="modal-body">
						<div id="haractRes">
							
						</div>

					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>

			</div>
		</div>


		<script src="resources/js/teathers.js"></script>