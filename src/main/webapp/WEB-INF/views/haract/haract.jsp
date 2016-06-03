<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" contentType="text/html; charset=UTF8" pageEncoding="UTF8"%>
<script
	src="<c:url value="https://code.jquery.com/jquery-1.10.2.js" />"></script>
	<link href="<c:url value="/resources/css/group.css"/>" rel="stylesheet">

<table id="users_table" class="table default_table">
<thead>
			<tr>
				<th>Id</th>
				<th>IQ</th>
				<th>Темперамент</th>
				<th>Соціум</th>
				<th>Увага</th>
				<th>Домінуюча півкуля</th>
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
       				<h3>IQ</h3>
		<input class="form-control" type="text" name="textID">
       		<h3>Темперамент</h3>
		<input class="form-control" type="text" name="textID">
       		<h3>Соціум</h3>
		<input class="form-control" type="text" name="textID">
       		<h3>Увага</h3>
		<input class="form-control" type="text" name="textID">
       	<h3>Домінуюча півкуля</h3>
		<input class="form-control" type="text" name="textID">
     
       	
      </div>
      <div class="modal-footer">
       <a class="btn btn-primary col-xs-5" href="">OK</a>
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
       				<h3>IQ</h3>
		<input class="form-control" type="text" name="textID">
       		<h3>Темперамент</h3>
		<input class="form-control" type="text" name="textID">
       		<h3>Соціум</h3>
		<input class="form-control" type="text" name="textID">
       		<h3>Увага</h3>
		<input class="form-control" type="text" name="textID">
       	<h3>Домінуюча півкуля</h3>
		<input class="form-control" type="text" name="textID">
     
      </div>
      <div class="modal-footer">
       <a class="btn btn-primary col-xs-5" href="">OK</a>
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
<a class="btn btn-success col-xs-5" href=""data-toggle="modal" data-target="#myModalAdd">Додати характеристику</a>
<a class="btn btn-primary col-xs-5" href="${context}/admin">Назад</a>
<script src="resources/js/haract.js"></script>