
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>
<div class="contennt">
<ul>	
<li><a href="${context}/home">Головна</a></li>
<sec:authorize access="isAnonymous()">
<li><a href="${context}/login">Вхід</a></li>
<li><a href="${context}/registration">Регістація</a></li>
</sec:authorize>

	<sec:authorize access="hasRole('ROLE_ADMIN')">
	<li><a href="${context}/group">Групи</a></li>
<li><a href="${context}/student">Студенти</a></li>
	 <li><a href="${context}/teathers">Викладачі</a></li>
		<li><a href="${context}/redactNews">Новини</a></li>
</sec:authorize>
	<sec:authorize access="hasRole('ROLE_USER')">
	<li><a href="${context}/test">Тести</a></li>
<%-- <li><a href="${context}/messege">Повідомлення</a></li>  --%>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
	<li><a href="<c:url value="/j_spring_security_logout"/>">Вихід</a></li>
</sec:authorize>


<input type="text" class="rounded" placeholder="Пошук..." >

</ul>
</div>

