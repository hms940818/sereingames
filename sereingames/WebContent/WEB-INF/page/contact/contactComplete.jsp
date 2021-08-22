<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<c:choose>
	<c:when test="${webDto.spFlg}">
<!DOCTYPE html PUBLIC "-//WAPFORUM//DTD XHTML Mobile 1.0//EN" "http://www.wapforum.org/DTD/xhtml-mobile10.dtd">
	</c:when>
	<c:otherwise>
<!DOCTYPE >
	</c:otherwise>
</c:choose>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css"
	href="/sereingames/resource/contact/css/contact.css">
<script type="text/javascript"
	src="/sereingames/resource/contact/js/contact.js"></script>
<title><spring:message code="home.title" /></title>
</head>
<body>
	<form method="post">
		<%@ include file="../common/commomHeader.jsp"%>
		<br><br>
		<div class="contact-title">
			<spring:message code="contact。complete.message" />
		</div>
	</form>
	<%@ include file="../common/commomFooter.jsp"%>
</body>
</html>