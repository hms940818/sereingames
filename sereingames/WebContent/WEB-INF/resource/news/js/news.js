/**
 * 
 */

function toLogin(){
	var form = document.forms[0];
	form.action="/sereingames/login"
	form.submit();
}
function toRegist(){
	var form = document.forms[0];
	form.action="/sereingames/regist"
	form.submit();
}

function addLiBg(li){
	li.style.background="red";//背景色
	li.children[0].style.color="white";//文字色
}
function removeLiBg(li){
	li.style.background="";	
	li.children[0].style.color="black";//文字色
}