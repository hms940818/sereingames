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
		
		<input name="name" type="text" placeholder="姓名"/><br/><br/>
		<input name="sex" type="text" placeholder="性别"/><br/><br/>
		<input name="email" type="text" placeholder="Email"/><br/><br/>
		<input name="password" type="password" placeholder="密码"/><br/><br/>
		<input name="birthday" type="tel" placeholder="生日"/><br/><br/>
		
		<input name="registButton" type="button" value="注册" onclick="regist();"/><br/><br/>
		<input name="deleteButton" type="button" value="删除用户" onclick="deleteUser();"/><br/><br/>
		
		</form>
	</body>
</html>