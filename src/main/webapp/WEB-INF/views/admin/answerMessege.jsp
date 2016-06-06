<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="<c:url value="/resources/css/messege.css" />"
	rel="stylesheet">
<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>
<h2>Повідомлення що очікують відповіді</h2>
<table id="users_table " class="table default_table">
	<thead>
		<tr>
			<th>Ім'я</th>
			<th>Прізвище</th>
			<th>Відповісти</th>
		</tr>
	<tbody id="tablecont"></tbody>
	</thead>
</table>





<div id="myModalEdit" class="modal fade" role="dialog">
	<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			
			<div class="modal-body">
				<div class="container">
					<div class="row">
						<div class="col-md-5">
							<div class="panel panel-primary">
								<div class="panel-heading">
									<span class="glyphicon glyphicon-comment"></span> Чат
									<div class="btn-group pull-right"></div>
								</div>
								<div class="panel-body" >
								<input id="getIdfuck" hidden="true">
									<ul id="messegeCont" class="chat">



									</ul>
								</div>
								<div class="panel-footer">
									<div class="input-group">
										<input id="btn-input" type="text"
											class="form-control input-sm" /> <span
											class="input-group-btn">
											<button class="btn btn-warning btn-sm" id="btn-chat">
												Надіслати</button>
										</span>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>

	</div>
</div>

<script src="resources/js/answerMessege.js"></script>