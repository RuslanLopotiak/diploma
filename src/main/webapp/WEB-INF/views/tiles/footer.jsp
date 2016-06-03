<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="<c:url value="/resources/css/footer.css" />"
	rel="stylesheet">
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>

<footer class="footer" role="contentinfo">
	<div class="container">
		<ul class="bs-docs-footer-links">
			<li><img alt="" src="${context}/resources/images/icons/v.png"></li>
				<li><img alt="" src="${context}/resources/images/icons/f.png"></li>
				<li><img alt="" src="${context}/resources/images/icons/i.png"></li>
				<li><img alt="" src="${context}/resources/images/icons/t.png"></li>

		</ul>
		<span class="footer-text">© 2016 Excursion. All rights reserved.</span>
	</div>
</footer>