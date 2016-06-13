
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
</sec:authorize>

	<sec:authorize access="hasRole('ROLE_ADMIN')">
	<li><a href="${context}/group">Групи</a></li>
<li><a href="${context}/student">Студенти</a></li>
	 <li><a href="${context}/teathers">Викладачі</a></li>
		<li><a href="${context}/redactNews">Новини</a></li>
		<li><a href="${context}/answerMessege">Повідомлення</a></li>
</sec:authorize>
	<sec:authorize access="hasRole('ROLE_USER')">
	<li><a href="${context}/test">Тести</a></li>
 <li><a href="${context}/messege">Діалог з психологом</a></li> 
</sec:authorize>
<sec:authorize access="isAuthenticated()">
	<li><a href="<c:url value="/j_spring_security_logout"/>">Вихід</a></li>
</sec:authorize>


<a id="login"><i class="fa fa-sign-in fa-2x" aria-hidden="true"></i></a>


</ul>
</div>
<div class="login-body" >
<sec:authorize access="isAnonymous()">
<a href="${context}/login" class="btn btn-primary row">Вхід</a>
<a href="" class="btn btn-primary row" data-toggle="modal" data-target="#myModal">Регістрація</a>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
<a href="<c:url value="/j_spring_security_logout"/>" class="btn btn-primary row">Вихід</a>
</sec:authorize>
</div>

<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content" style="height:102.22222px;">
    <a href="${context }/registrationSt"><button class="btn btn-primary col-xs-4" >Студент</button></a>

<a href="${context }/registrationTeath"><button class="btn btn-primary col-xs-4" >Вчитель</button></a>
    
    </div>

  </div>
</div>



</ul>
</div>

<script src="resources/js/header.js"></script>

