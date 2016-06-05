<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<script src="<c:url value="https://code.jquery.com/jquery-1.10.2.js" />"></script>
<link href="<c:url value="/resources/css/group.css"/>" rel="stylesheet">
<table id="users_table " class="table default_table">
	<thead>
		<tr>
			<th>Назва групи</th>
			<th>Факультет</th>
			<th>Кількість студентів</th>
			<th>Видалити</th>
			<th>Редагувати</th>

		</tr>
	<tbody id="tablecont"></tbody>
	</thead>
</table>

<a class="btn btn-success col-xs-5" href="" data-toggle="modal"
	data-target="#myModalAdd">Добавити групу</a>
<!-- Modal -->
<div id="myModalEdit" class="modal fade" role="dialog">
	<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Edit</h4>
			</div>
			<div class="modal-body">
				<h3>Id</h3>
				<input class="form-control" type="text" name="textID">
				<h3>Назва групи</h3>
				<input class="form-control" type="text" name="textID">
				<h3>Факультет</h3>
				<input class="form-control" type="text" name="textID">
				<h3>Номер групи</h3>
				<input class="form-control" type="text" name="textID">
				<h3>Кількість студентів</h3>
				<input class="form-control" type="text" name="textID"> <a
					class="btn btn-primary col-xs-5" href="">OK</a>

			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>

	</div>
</div>
<!-- АДД -->
<div id="myModalAdd" class="modal fade" role="dialog">
	<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Добавити групу</h4>
			</div>
			<div class="modal-body">
				<form class="registration" id=" formx" method="POST"
					action="javascript:void(null);" onsubmit="addGroup()">
					<h4>Назва групи</h4>
					<input class="form-control" type="text" id="groupName"
						name="groupName" />
					<h4>Факультет</h4>
					<input class="form-control" type="text" id="facult" name="facult" />
					<button class="btn btn-success " type="submit">OK</button>

				</form>


			</div>
			<div class="modal-footer"></div>
		</div>

	</div>
</div>
<script src="resources/js/group.js"></script>