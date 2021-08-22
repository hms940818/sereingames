<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
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
<link rel="stylesheet" type="text/css" href="/sereingames/resource/regist/css/regist.css">
<script type="text/javascript" src="/sereingames/resource/regist/js/regist.js"></script>
<title>Regist</title>
</head>
	<body>
		<form action="" method="post">
		已经成功注册！<br/>
		ID:${webdto.email}<br/>
		姓名:${webdto.name}<br/>
		性别:${webdto.sex}<br/>
		密码:${webdto.password}<br/>
		生日:${webdto.birthday}<br/>
		
		</form>
	</body>
</html>