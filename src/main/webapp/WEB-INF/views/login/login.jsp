
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>

<sec:authorize access="isAnonymous()"> 
	<form action="login_user" method="post">
	<div class="row">
		<div class="col-xs-6  " >
			<input type="text" class=" form-control" name="email" placeholder="email" required> 
			<input type="password" class=" form-control " name="password" placeholder="password" required>
		</div>
		</div>
		<div>
			<button class="btn btn-defoult col-xs-2" float="left" type="submit">Sign In</button>
		</div>
	</form>
</sec:authorize>