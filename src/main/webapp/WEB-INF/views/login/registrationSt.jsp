<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>


</select>
<form class="registration col-xs-5" id=" formx" method="POST" action="javascript:void(null);" onsubmit="registrationSt()">
	<h4>Ім'я</h4>
	<input class="form-control" type="text" id="name" name="name" />
	<h4>Прізвище</h4>
	<input class="form-control" type="text" id="sname"  name="sname" />
	<h4>Email</h4>
	<input class="form-control" type="email" id="email" name="email">
	<h4>Пароль</h4>
	<input class="form-control" type="password" id="password" name="password">
	<h4>Вік</h4>
	<input class="form-control" type="number" id="age" name="age">
	<div>
	<h4>Група<h4>
	<select	class="form-control" id="group" ></select>
	</div>
			
			
	<button class="btn btn-sample" type="submit">Ввести</button>
	
</form>

<script src="resources/js/registration.js" ></script>