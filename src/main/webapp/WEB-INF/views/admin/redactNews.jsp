
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>
<table id="users_table " class="table default_table">
	<thead>
		<tr>
			<th>Заголовок новини</th>
			<th>Текст новини</th>
			<th>Час створення</th>
			<th>Видалити</th>
			<th>Редагувати</th>
		</tr>
	</thead>
	<tbody id="tablecont"></tbody>
</table>

<a class="btn btn-success col-xs-5" href="" data-toggle="modal"
	data-target="#myModalAdd">Добавити новину</a>
<!-- Modal -->
<div id="myModalEdit" class="modal fade" role="dialog">
	<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Редагувати новину</h4>
			</div>
			<div class="modal-body">
				<form class="registration" id=" formx" method="POST"
					action="javascript:void(null);" onsubmit="updateNews()">
					<div id="newsRes"></div>
					<button class="btn btn-success " type="submit">OK</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">Відміна</button>
				</form>
			</div>
			<div class="modal-footer">
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
				<h4 class="modal-title">Добавити новину</h4>
			</div>
			<div class="modal-body">
				<div class="newsRes"></div>
				<form class="registration" id=" formx" method="POST"
					action="javascript:void(null);" onsubmit="addNews()">
					<h4>Заголовок</h4>
					<input class="form-control" type="text" id="newsName"
						name="newsName" />
					<h4>Текст новини</h4>
					<textarea rows="6" id="newsText" name="facult" class="form-control" required></textarea>
					<button class="btn btn-success " type="submit">OK</button>

				</form>


			</div>
			<div class="modal-footer"></div>
		</div>

	</div>
</div>
<script src="resources/js/redactNews.js"></script>