<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!-- 首页的请您留言 START -->
<script src="https://ada.baidu.com/phone-tracker/getjs_bdtj?sid=15981813"></script>
<script charset="utf-8" src="https://goutong.baidu.com/site/32/5067c3366f64ddf59af7e98f996ec8bd/b.js?siteId=15981813"></script>
<script charset="utf-8" src="http://ada.baidu.com/phone-tracker/insert_bdtj?sid=15981813"></script>
<script src="https://hm.baidu.com/hm.js?5067c3366f64ddf59af7e98f996ec8bd"></script>
<script type="text/javascript">
	var system = {
		win : false,
		mac : false,
		xll : false
	};
	var p = navigator.platform;
	system.win = p.indexOf("Win") == 0;
	system.mac = p.indexOf("Mac") == 0;
	system.x11 = (p == "X11") || (p.indexOf("Linux") == 0);
	if (system.win || system.mac || system.xll) {
	} else {
		window.location.href = "m/Index.asp";
	}
</script>

<!-- 首页的请您留言 END -->

 
<ins id="newBridge">
	<!-- target: nodeBoard -->
	<ins
		class="nb-nodeboard-base nb-nodeboard-position-base nb-nodeboard-left-bottom nb-show"
		id="nb_nodeboard"
		style="inset: auto auto 1px 1px; margin-left: 0px; margin-top: 0px; height: auto;">
		<ins class="nb-nodeboard-contain-base nb-nodeboard-contain">
			<ins class="nb-nodeboard-top nb-nodeboard-top-0"
				style="background-color: transparent;">
				<ins class="nb-head-title">请您留言</ins>
				<ins class="nb-nodeboard-close nb-nodeboard-max"
					id="nb_nodeboard_close" data-type="min"></ins>
			</ins>
			<form id="nb_nodeboard_form" autocomplete="off"
				class="nb-board-form"
				action="https://p.qiao.baidu.com/cps3//bookmanage/saveBook.action?userId=31519342"
				method="post" accept-charset="utf-8">
				<ins id="nb_nodeboard_set" class="nb-nodeboard-set"
					style="display: none;">
					<ins class="nb-nodeboard-content">
						<textarea id="nb-nodeboard-set-content-js" name="content"
							data-ph="请在此输入留言内容，我们会尽快与您联系。（必填）"
							placeholder="请在此输入留言内容，我们会尽快与您联系。（必填）"
							class="nb-nodeboard-set-content nb-nodeboard-param"></textarea>
					</ins>
					<ins class="nb-nodeboard-name" style="z-index: 4;">
						<ins class="nb-nodeboard-icon nodeName"></ins>
						<input id="nb_nodeboard_set_name" data-write="0"
							name="visitorName" maxlength="30"
							class="nb-nodeboard-input nb-nodeboard-param" type="text"
							data-ph="姓名" placeholder="姓名">
					</ins>
					<ins class="nb-nodeboard-name" id="nb_nodeboard_phone"
						style="z-index: 3;">
						<ins class="nb-nodeboard-icon nodePhone"></ins>
						<input id="nb_nodeboard_set_phone" name="visitorPhone"
							maxlength="30" class="nb-nodeboard-input nb-nodeboard-param"
							data-write="1" type="text" data-ph="电话（必填）" placeholder="电话（必填）">
					</ins>
					<ins class="nb-nodeboard-name" id="nb_nodeboard_mail"
						style="z-index: 2;">
						<ins class="nb-nodeboard-icon nodeMail"></ins>
						<input id="nb_nodeboard_set_email" name="visitorEmail"
							maxlength="50" class="nb-nodeboard-input nb-nodeboard-param"
							type="text" data-write="0" data-ph="邮箱" placeholder="邮箱">
					</ins>
					<ins class="nb-nodeboard-name" style="z-index: 1;">
						<ins class="nb-nodeboard-icon nodeAddress"></ins>
						<input id="nb_nodeboard_set_address" name="visitorAddress"
							class="nb-nodeboard-input nb-nodeboard-param" maxlength="50"
							type="text" data-write="0" data-ph="地址" placeholder="地址">
					</ins>
				</ins>
			</form>
			<ins class="nb-nodeboard-success" id="nb_nodeboard_success"
				style="display: none;">
				<ins class="nb-success-box">
					<ins class="nb-success-icon"></ins>
					<ins class="nb-success-title" id="nb_node_messagetitle">感谢留言</ins>
					<ins class="nb-success-content" id="nb_node_messagecontent">我们会尽快与您联系</ins>
					<ins id="nb_nodeboard_return" needverifycode="1"
						class="nb-sucess-close">关闭</ins>
				</ins>
			</ins>
			<ins class="nb-nodeboard-send" id="nb_node_contain"
				style="display: none;">
				<ins id="nb_nodeboard_send" needverifycode="1"
					class="nb-nodeboard-send-btn nb-nodeboard-send-btn-0">发送</ins>
			</ins>
		</ins>
	</ins>
	<!-- end -->
	<!-- target: iconIcon -->
	<ins
		class="nb-icon-wrap nb-icon-base icon-right-center nb-icon-skin-0 nb-icon-icon"
		id="nb_icon_wrap" style="margin-top: -26px; width: 144px;">
		<ins class="nb-icon-inner-wrap" style="height: 52px; width: 144px;">
			<ins class="nb-icon-bridge0 nb-icon-bridge-base"
				data-type="iconInvite"></ins>
		</ins>
	</ins>
	<!-- end -->
	<!-- target: invite -->
	<ins
		class="nb-invite-wrap nb-invite-wrap-base nb-position-base nb-middle  "
		id="nb_invite_wrap"
		style="width: 400px; display: block; margin-left: -200px; margin-top: -88px;">
		<ins class="nb-invite-body nb-invite-skin-0" style="height: 175px;">
			<ins class="nb-invite-tool nb-invite-tool-base" id="nb_invite_tool"
				style=""></ins>
			<ins class="nb-invite-text nb-invite-text-base">
				<ins class="nb-invite-welcome nb-invite-welcome-base nb-show"
					id="nb_invite_welcome">
					<p style="color: #fff">欢迎来到本网站，请问有什么可以帮您？</p>
				</ins>
			</ins>
			<ins class="nb-invite-btn-base nb-invte-btns-0">
				<ins class="nb-invite-cancel nb-invite-cancel-base"
					id="nb_invite_cancel">稍后再说</ins>
				<ins class="nb-invite-ok nb-invite-ok-base" id="nb_invite_ok">现在咨询</ins>
			</ins>
		</ins>
	</ins>
	<!-- end -->
</ins>

