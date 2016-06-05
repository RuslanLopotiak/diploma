<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>

<script src="<c:url value="https://code.jquery.com/jquery-1.10.2.js" />"></script>
<link href="<c:url value="/resources/css/group.css"/>" rel="stylesheet">

<h4>Виберіть групу</h4>
		<select class="form-control" id="group"></select>
		<button id="get" class="btn">Показати</button>
		<table id="users_table" class="table default_table">
			<thead id="tablehead">
				</thead>
			<tbody id="tablecont"></tbody>
			
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
							<div>
								<h4>Комунікативнісь</h4>
								<input value="ZBS" type="text" class="form-control"
									readonly="readonly">
								<h4>Навіювання</h4>
								<input value="ZBS" class="form-control" readonly="readonly">
								<h4>Стесостійкість</h4>
								<input value="ZBS" class="form-control" readonly="readonly">
								<h4>Темперамент</h4>
								<input value="ZBS" class="form-control" readonly="readonly">
							</div>
						</div>

					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>

			</div>
		</div>


		<script src="resources/js/student.js"></script>