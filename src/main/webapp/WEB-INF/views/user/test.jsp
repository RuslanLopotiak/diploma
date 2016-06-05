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
			<th>Тест 1</th>
			<th>Тест 2 </th>
			<th>Тест 3</th>
			<th>Тест 4</th>
		</tr>
	</thead>
	<tbody id="tablecont"></tbody>
</table>
<script src="resources/js/test.js"></script>