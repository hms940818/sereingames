<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>


<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<section class="container clearfix">
	<div class="row nr">
		<div class="col-xs-12 col-sm-5 col-md-5 ">
			<div class="dtp bk04 text-center">
				<img src="/sereingames/resource/product/img/2021126215750.jpg" class="dpic">
			</div>
		</div>
		<div class="col-xs-12 col-sm-6 col-md-6 col-offset-6">
			<h2 class="zi1"><spring:message code="product.detail.title${webDto.id }" /></h2><!-- 标题 -->
			<div></div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-12 col-sm-9 col-md-9 ">
			<div class="bk04" style="padding-left: 20px; margin-top: 20px;">
				<h4 class="zi1"><spring:message code="product.view.subTitle1" /></h4><!-- 产品详情 -->
			</div>
			<div class="bk04"
				style="padding: 20px; margin-top: 20px; min-height: 300px;">
				<p>
					<img src="<spring:message code="/sereingames/resource/product/img/${webDto.detailDto.detailImgName1 }" />" title="<spring:message code="imgTitle1" />.png" alt="<spring:message code="imgTitle1" />.png">
					<img src="/sereingames/resource/product/img/${webDto.detailDto.detailImgName2 }" title="<spring:message code="imgTitle2" />.png" alt="<spring:message code="imgTitle2" />.png">
                    <img src="/sereingames/resource/product/img/${webDto.detailDto.detailImgName3 }" title="<spring:message code="imgTitle3" />.png" alt="<spring:message code="imgTitle3" />.png">
					<img src="/sereingames/resource/product/img/${webDto.detailDto.detailImgName4 }" title="<spring:message code="imgTitle4" />.png" alt="<spring:message code="imgTitle4" />.png">
				</p>
			</div>
		</div>
		<div class="col-xs-12 col-sm-3 col-md-3">
			<div class=" bk04" style="padding-left: 20px; margin-top: 20px;">
				<h4 class="zi1"><spring:message code="product.view.subTitle2" /></h4><!-- 相关产品 -->
			</div>

		</div>
	</div>
</section>