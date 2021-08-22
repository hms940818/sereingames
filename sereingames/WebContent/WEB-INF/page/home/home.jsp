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
<title><spring:message code="header.title" /></title>
<c:choose>
	<c:when test="${webDto.spFlg}">
		<!-- 手机版 -->
		<link rel="stylesheet" type="text/css" href="/sereingames/resource/sp/home/css/home.css">
		<script type="text/javascript" src="/sereingames/resource/sp/home/js/home.js"></script>
	</c:when>
	<c:otherwise>
		<!-- 电脑版 -->
		
		<link rel="stylesheet" type="text/css" href="/sereingames/resource/home/css/home.css">
		<link rel="stylesheet" type="text/css" href="/sereingames/resource/common/css/bootstrap.min.css">
		
		<script type="text/javascript" src="/sereingames/resource/common/js/jquery-1.11.3.min.js"></script>
		<script type="text/javascript" src="/sereingames/resource/common/js/bootstrap.min.js"></script>
		
		<script type="text/javascript" src="/sereingames/resource/home/js/home.js"></script>
	</c:otherwise>
</c:choose>
</head>



<body>
<spring:message code="language.message"/>:
   <a href="?lang=zh_CN"><spring:message code="language.cn"/></a> &nbsp;&nbsp;&nbsp;
   <a href="?lang=en_EN"><spring:message code="language.en"/></a>


<%@ include file="../common/commomHeader.jsp"%>

<!-- 滚动显示图片 START -->
<div id="myCarousel" class="carousel slide">
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
	</ol>
	<div class="carousel-inner">
		<div class="item active" align="center">
			<img alt="秦时明月" src="/sereingames/resource/home/img/Poster-7.jpg">
		</div>
		<div class="item " align="center">
			<img alt="时空·觉醒" src="/sereingames/resource/home/img/SpaceAwakening_1.JPG">
		</div>
		<div class="item " align="center">
			<img alt="阿巳与小铃铛" src="/sereingames/resource/home/img/set-1.JPG">
		</div>
	</div>
	<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev"> 
		<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
		<span class="sr-only">Previous</span>
	</a> 
	<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next" style="width: 15%;">
		<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
		<span class="sr-only">Next</span>
	</a>
</div>
<!-- 滚动显示图片 END -->

<!-- 底部 -->
<%@ include file="../common/commomFooter.jsp"%>

<!-- 留言 commomContact.jsp -->

</body>
</html>