<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ page session="false"%>


<sec:authorize access="isAnonymous()">
<div class="containerAdmin">
	<form class="form-signin" action="${context}/login_admin" method="post">
		<h2 class="form-signin-heading">Please sign in</h2>
			<p class="lead"> ${fail}</p>
		<label for="inputEmail" class="sr-only">User name</label> <input
			type="text" class="form-control" name="email" placeholder="email"
			required autofocus> <label for="inputPassword"
			class="sr-only">Password</label> <input type="password"
			class="form-control" name="password" placeholder="password" required>
		<div class="checkbox"></div>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
			in</button>
	</form>

</div>
<!-- /container -->
</sec:authorize>



