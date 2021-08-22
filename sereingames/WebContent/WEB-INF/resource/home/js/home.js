/**
 * 作者：何茂森
 * @param url
 * @returns
 */

function pageSubmit(url){
	pform.action = url;
	pform.submit();
}
$(document).ready(function(){
	//new WOW().init();
	$(window).scroll(function() {
		if (($("#mainNav").length > 0)) {
			if(($(this).scrollTop() > 0)) {
				$("#mainNav").addClass("navbar-fixed-top animated fadeInDown navover");
				$(".head-top").css("display","none");
			} else {	
				$("#mainNav").removeClass("navbar-fixed-top animated fadeInDown navover");
				$(".head-top").css("display","block");
			}
		};
	});
	
	$(window).load(function() {
		if (($("#mainNav").length > 0)) { 
			if(($(this).scrollTop() > 0) && ($(window).width() > 767)) {
				$("#mainNav").addClass("navbar-fixed-top animated fadeInDown");
			}
		};
	});
	
    $('.navbar-collapse ul li a').click(function() {
        $('.navbar-toggle:visible').click();
    });
	
	
});

function alert(message){
	layer.alert(message,{shade:.5,title:false,closeBtn:0,skin:'yuan1'});
}
function alertUrl(msg,url){
	layer.alert(msg, {shade:.5,title:false,closeBtn:0,skin:'yuan1',btn:['确定']}, function(){
		location.href=url;
  });
}
function openWin(msg){
	layer.open({
	  type: 1,
	  title: false,
	  closeBtn: 0,
	  shadeClose: false,
	  content: msg
	});
}

