<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>


<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<section class="container nr-section clearfix">

	<div class="left">
		<div class="left_top">
			<spring:message code="header.product" />
		</div>
		<!-- 左边副标题区域 -->
		<div class="list">
			<ul class="yiji">
				<c:forEach items="${webDto.productTitleMap }" var="item">
					<li class="lb1">
					<a href="/sereingames/product/?para=${item.value }" class="dir1 <c:if test="${webDto.subTitle eq item.key}">cur</c:if>">
						<spring:message code="${item.key }" />
					</a>
					</li>
				</c:forEach>
			</ul>
		</div>
		<!-- 全国统一热点电话 -->
		<div class="cent">
			<p>
				<spring:message code="landline.title" />
			</p>
			<b><spring:message code="landline.lineNo" /></b>
		</div>
	</div>

	<div class="right">
		<div class="right_top">
			<!-- 当前位置 -->
			<strong><spring:message code="header.product" /></strong> <span><spring:message
					code="header.subtitle.currentPosition" /><a href="index.asp"
				rel="nofollow"><spring:message code="header.top" /></a> &gt; <a
				href="" rel="nofollow"><spring:message code="header.product" /></a></span>
		</div>


		<c:forEach items="${webDto.detailDtoList }" var="item">
<!-- 			<div class="col-xs-6 col-sm-4 col-md-3 w100"> -->
<%-- 				<a href="/sereingames/product-view/?ID=${fn:replace(item.title, 'product.detail.title', '')}" title="<spring:message code="${item.title }" />"> --%>
<!-- 					<div class="cp2"> -->
<!-- 						<div class="pic"> -->
<%-- 							<img src="/sereingames/resource/upload/img/${item.imgName }" style="width: 100%; height: 160px;" class="img_fd"> --%>
<!-- 						</div> -->
<!-- 						<div class="wz2 text-center"> -->
<%-- 							<spring:message code="${item.title }" /> --%>
<!-- 						</div> -->
<!-- 					</div> -->
<!-- 				</a> -->
<!-- 			</div> -->
		</c:forEach>
		
<%-- 		<c:if test="${fn:length(webDto.detailDtoList) >= 16 }"> --%>
<!-- 		<div style="clear: both"></div> -->

<!-- 		<p style="width: 1000px; text-align: center; margin: 30px 0;"> -->
<!-- 			【<span class="curr">1</span>/3页】 总共【36】条 【 -->
<!-- 			<a href="/pro.asp?mypage=1&amp;stype=y&amp;ColID=40" style="text-decoration: none;">首页</a>】 【 -->
<!-- 			<a href="/pro.asp?mypage=2&amp;stype=y&amp;ColID=40">下一页</a>】 【 -->
<!-- 			<a href="/pro.asp?mypage=3&amp;stype=y&amp;ColID=40" style="text-decoration: none;">末页</a>】 跳转  -->
<!-- 			<select name="select" onchange="javascript:location=this.options[this.selectedIndex].value;"> -->

<!-- 				<option value="pro.asp?mypage=1&amp;stype=y&amp;ColID=40" selected="selected">1</option> -->

<!-- 				<option value="pro.asp?mypage=2&amp;stype=y&amp;ColID=40">2</option> -->

<!-- 				<option value="pro.asp?mypage=3&amp;stype=y&amp;ColID=40">3</option> -->

<!-- 			</select> -->
<!-- 		</p> -->
<%-- 		</c:if> --%>
	</div>


	<div class="row text-center">
		<div class="digg"></div>
	</div>

</section>