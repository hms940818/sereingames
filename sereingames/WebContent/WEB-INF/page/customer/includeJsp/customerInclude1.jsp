<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>


<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<section class="container nr-section clearfix">

	<div class="left">
		<div class="left_top">
			<spring:message code="header.customer" />
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
				href="" rel="nofollow"><spring:message code="header.customer" /></a></span>
		</div>


		<c:forEach items="${webDto.detailDtoList }" var="item">
<!-- 			<div class="col-xs-4 col-sm-3 col-md-2 text-center w200"> -->
<!-- 				<div class="bk04 text-center link"> -->
<%-- 					<img src="/sereingames/resource/upload/img/${item.imgName }" class="img_fd" style="margin: auto; max-height: 96px;"> --%>
<!-- 				</div> -->
<%-- 				<spring:message code="${item.title }" /> --%>
<!-- 			</div> -->
		</c:forEach>
		

	</div>




	<div class="row text-center">
		<div class="digg"></div>
	</div>

</section>