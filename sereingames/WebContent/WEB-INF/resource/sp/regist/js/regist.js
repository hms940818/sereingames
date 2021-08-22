/**
 * 
 */

function regist(){
	var form = document.forms[0];
	form.action="/sereingames/registAccount"
	form.submit();
}

function deleteUser(){

	var form = document.forms[0];
	form.action="/sereingames/deleteUser"
	form.submit();
}