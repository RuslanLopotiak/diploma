<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>
<nav class="navbar navbar-inverse navbar-fixed-top sidebar">
	<div class="container-fluid ">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<!-- <a class="navbar-brand" href="#">Project name</a> -->
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav " id="navigation">
				<li><a href="${context}/home">Головна</a></li>
				<li><a href="${context}/excursion">Екскурсії містом</a></li>
				<li><a href="${context}/excursionReg">Екскурсії областю</a></li>
				<li><a href="${context}/orders">Замовлення</a></li>
				<li><a href="${context}/aboutas">Про нас</a></li>
				<sec:authorize access="hasRole('ROLE_ADMIN')">
					<li><a href="${context}/administration">Адмініструваня</a></li>
				</sec:authorize>
				<sec:authorize access="isAuthenticated()">
					<li><a href="<c:url value="/j_spring_security_logout"/>">Вихід</a></li>
				</sec:authorize>
			</ul>


		</div>
	</div>
</nav>