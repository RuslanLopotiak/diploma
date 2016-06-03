<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" contentType="text/html; charset=UTF8" pageEncoding="UTF8"%>
<script
	src="<c:url value="https://code.jquery.com/jquery-1.10.2.js" />"></script>
	<link href="<c:url value="/resources/css/group.css"/>" rel="stylesheet">
	<h3>Search by</h3>
	<select class="form-control col-xs-3"  >
        <option>1 ID</option>
        <option>2 Назвою групи</option>
        <option>3 Факультетом</option>
        <option>4 Номером групи</option>
        <option>5 Кількістю студентів</option>
      </select>
<table id="users_table " class="table default_table">
<thead>
			<tr>
				<th>Id</th>
				<th>Назва групи</th>
				<th>Факультет</th>
				<th>Номер групи</th>
				<th>Кількість студентів</th>
				<th>Видалити</th>
				<th>Редагувати</th>
		
			</tr>
			<tbody id="tablecont"></tbody>
</thead>
</table>

<!-- Modal -->
<div id="myModalDel" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Видалення</h4>
      </div>
      <div class="modal-body">
       <a class="btn btn-primary col-xs-5" href="">OK</a>
       <a class="btn btn-primary col-xs-5" href="">Відміна</a>
       
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
<!-- делейт -->
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
		<input class="form-control" type="text" name="textID">
       <a class="btn btn-primary col-xs-5" href="">OK</a>
       	
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
        <h4 class="modal-title">Add</h4>
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
		<input class="form-control" type="text" name="textID">
       <a class="btn btn-primary col-xs-5" href="">OK</a>
       	
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
<a class="btn btn-success col-xs-5" href=""data-toggle="modal" data-target="#myModalAdd">Добавити групу</a>
<a class="btn btn-primary col-xs-5" href="${context}/admin">Назад</a>
<script src="resources/js/group.js"></script>