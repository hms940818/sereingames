/**
 * 
 */

function submitContact(){
	var form = document.forms[0];
	form.action="/sereingames/submitContact"
	form.submit();
}