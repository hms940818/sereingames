<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test="${webDto.spFlg}">
		<!DOCTYPE html PUBLIC "-//WAPFORUM//DTD XHTML Mobile 1.0//EN" "http://www.wapforum.org/DTD/xhtml-mobile10.dtd">
	</c:when>
	<c:otherwise>
		<!DOCTYPE  html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	</c:otherwise>
</c:choose>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title><spring:message code="header.customer" />-<spring:message code="header.title" /></title>
<c:choose>
	<c:when test="${webDto.spFlg}">
		<!-- 手机版 -->
		<link rel="stylesheet" type="text/css" href="/sereingames/resource/sp/customer/css/customer.css">
		<script type="text/javascript" src="/sereingames/resource/sp/customer/js/customer.js"></script>
	</c:when>
	<c:otherwise>
		<!-- 电脑版 -->
		<!-- css -->
		<link rel="stylesheet" type="text/css" href="/sereingames/resource/customer/css/customer.css">
		<link rel="stylesheet" type="text/css" href="/sereingames/resource/common/css/bootstrap.min.css">
		
		<!-- js -->
		<script type="text/javascript" src="/sereingames/resource/common/js/jquery-1.11.3.min.js"></script>
		<script type="text/javascript" src="/sereingames/resource/common/js/bootstrap.min.js"></script>
		
		<script type="text/javascript" src="/sereingames/resource/customer/js/customer.js"></script>
	</c:otherwise>
</c:choose>
</head>



<body>
<spring:message code="language.message"/>:
   <a href="?lang=zh_CN"><spring:message code="language.cn"/></a> &nbsp;&nbsp;&nbsp;
   <a href="?lang=en_EN"><spring:message code="language.en"/></a>


<%@ include file="../common/commomHeader.jsp"%>

<!-- 大图片显示区域 START -->
<div class="ny_banner" style="background:url(/sereingames/resource/common/img/hengfu.jpg) no-repeat center;width: 100%; height: 250px;overflow: hidden;">
	<div class="container">
		<!-- 页面大标题 -->
		<h1>
			<spring:message code="header.customer" />
	     </h1>
	</div>
</div>
<!-- 大图片显示区域END -->

<!-- 自定义介绍内容  /includeJsp/customerInclude1.jsp -->
<%@ include file="./includeJsp/customerInclude1.jsp"%>


<!-- 底部 -->
<%@ include file="../common/commomFooter.jsp"%>


</body>
</html>