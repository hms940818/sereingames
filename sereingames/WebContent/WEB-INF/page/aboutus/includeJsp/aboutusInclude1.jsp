<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>


<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<section class="container nr-section clearfix">

	<div class="left">
		<div class="left_top">
			<spring:message code="header.aboutUs" />
		</div>
		<div class="list">
			<ul class="yiji">
				<li class="lb1">
				<a href="/sereingames/aboutus/?para=profile" class="dir1 <c:if test="${webDto.currentTab eq 'profile'}">cur</c:if>">
					<spring:message code="header.aboutUs.subtitle1" />
				</a>
				</li>
				<li class="lb1">
					<a href="/sereingames/aboutus/?para=philosophy" class="dir1 <c:if test="${webDto.currentTab eq 'philosophy'}">cur</c:if>">
						<spring:message code="header.aboutUs.subtitle2" />
					</a>
				</li>
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
			<strong><spring:message code="header.aboutUs.subtitle1" /></strong> 
			<span><spring:message code="header.subtitle.currentPosition" />
			<a href="/sereingames/home/" rel="nofollow">
			<spring:message code="header.top" /></a> &gt; <a href="" rel="nofollow"><spring:message code="header.aboutUs.subtitle1" /></a>
			</span>
		</div>

		<c:choose>
			<c:when test="${webDto.currentTab eq 'profile'}">
			<!-- 公司介绍-->公司介绍
<!-- 				<div class="col-xs-12 col-sm-6 col-md-6  wow fadeInLeft animated" style="visibility: visible; animation-name: fadeInLeft;"> -->
<!-- 					<div class="about-nr clearfix"> -->
<!-- 						<p style="text-indent: 2em; line-height: 3em; margin-bottom: 10px;"> -->
<%-- 							<span style="font-family: 宋体, SimSun; font-size: 20px;"><spring:message code="aboutus.profile.detail1" /></span> --%>
<!-- 						</p> -->
<!-- 						<p style="text-indent: 2em; line-height: 3em; margin-bottom: 10px;"> -->
<!-- 							<strong> -->
<%-- 								<span style="font-family: 宋体, SimSun; font-size: 20px; text-indent: 2em;"><spring:message code="aboutus.profile.detail2" /></span> --%>
<!-- 							</strong> -->
<%-- 							<span style="font-family: 宋体, SimSun; font-size: 20px; text-indent: 2em;"><spring:message code="aboutus.profile.detail3" /></span> --%>
<!-- 						</p> -->
<!-- 						<p style="text-indent: 2em; line-height: 3em; margin-bottom: 10px;"> -->
<!-- 							<strong> -->
<%-- 								<span style="font-family: 宋体, SimSun; font-size: 20px;"><spring:message code="aboutus.profile.detail4" /></span> --%>
<!-- 							</strong> -->
<%-- 							<span style="font-family: 宋体, SimSun; font-size: 20px;"><spring:message code="aboutus.profile.detail5" /></span> --%>
<!-- 						</p> -->
<!-- 						<p style="text-indent: 2em; line-height: 3em; margin-bottom: 10px;"> -->
<!-- 							<span style="font-family: 宋体, SimSun; font-size: 20px;"> -->
<%-- 								<spring:message code="aboutus.profile.detail6" /> --%>
<!-- 							</span> -->
<!-- 						</p> -->
<!-- 						<p> -->
<!-- 							<br> -->
<!-- 						</p> -->
<!-- 					</div> -->
<!-- 				</div> -->
			</c:when>
			<c:otherwise>
			<!-- 公司理念 -->公司理念
<!-- 				<div class="col-xs-12 col-sm-6 col-md-6  wow fadeInLeft animated" style="visibility: visible; animation-name: fadeInLeft;"> -->
<!-- 					<div class="about-nr clearfix"> -->
<!-- 						<p style="line-height: 2em;"> -->
<!-- 							<span style="font-family: 宋体, SimSun; font-size: 18px;"><br></span> -->
<!-- 						</p> -->
<!-- 						<p style="line-height: 2em;"> -->
<!-- 							<strong><span -->
<%-- 								style="font-family: 宋体, SimSun; font-size: 18px;"><spring:message code="aboutus.philosophy.detail1" /></span></strong><span --%>
<%-- 								style="font-family: 宋体, SimSun; font-size: 18px;"><spring:message code="aboutus.philosophy.detail2" /></span> --%>
<!-- 						</p> -->
<!-- 						<p style="line-height: 2em;"> -->
<%-- 							<span style="font-family: 宋体, SimSun; font-size: 18px;"><spring:message code="aboutus.philosophy.detail3" /></span> --%>
<!-- 						</p> -->
<!-- 						<p style="line-height: 2em;"> -->
<!-- 							<span style="font-family: 宋体, SimSun; font-size: 18px;"><br></span> -->
<!-- 						</p> -->
<!-- 						<p style="line-height: 2em;"> -->
<!-- 							<strong><span -->
<%-- 								style="font-family: 宋体, SimSun; font-size: 18px;"><spring:message code="aboutus.philosophy.detail4" /></span></strong><span --%>
<%-- 								style="font-family: 宋体, SimSun; font-size: 18px;"><spring:message code="aboutus.philosophy.detail5" /></span> --%>
<!-- 						</p> -->
<!-- 						<p style="line-height: 2em;"> -->
<!-- 							<span style="font-family: 宋体, SimSun; font-size: 18px;"><br></span> -->
<!-- 						</p> -->
<!-- 						<p style="line-height: 2em;"> -->
<!-- 							<strong><span -->
<%-- 								style="font-family: 宋体, SimSun; font-size: 18px;"><spring:message code="aboutus.philosophy.detail6" /></span></strong><span --%>
<%-- 								style="font-family: 宋体, SimSun; font-size: 18px;"><spring:message code="aboutus.philosophy.detail7" /></span> --%>
<!-- 						</p> -->
<!-- 						<p style="line-height: 2em;"> -->
<!-- 							<span style="font-family: 宋体, SimSun; font-size: 18px;"><br></span> -->
<!-- 						</p> -->
<!-- 						<p style="line-height: 2em;"> -->
<!-- 							<strong><span -->
<%-- 								style="font-family: 宋体, SimSun; font-size: 18px;"><spring:message code="aboutus.philosophy.detail8" /></span></strong><span --%>
<%-- 								style="font-family: 宋体, SimSun; font-size: 18px;"><spring:message code="aboutus.philosophy.detail9" /></span> --%>
<!-- 						</p> -->
<!-- 						<p> -->
<!-- 							<br> -->
<!-- 						</p> -->
<!-- 					</div> -->
<!-- 				</div> -->
			</c:otherwise>
		</c:choose> 
		<div class="col-xs-12 col-sm-6 col-md-6  wow fadeInRight animated" style="visibility: visible; animation-name: fadeInRight;">
			<div class="about-pic clearfix">
<!-- 				<img class="img-responsive center-block" src="/sereingames/resource/home/img/company.jpg"> -->
			</div>
		</div>
	
	</div>
	<div class="row text-center">
		<div class="digg"></div>
	</div>

</section>