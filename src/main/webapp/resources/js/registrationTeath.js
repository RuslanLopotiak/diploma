
function registrationTeath() {
	var json = {
		'email' : $('#email').val(),
		'password' : $('#password').val(),
		'name' : $('#name').val(),
		'sname' : $('#sname').val(),
		'age' : $('#age').val()
	}
	$.ajax({
		url : "registrationTeath/save",
		type : 'POST',
		data : JSON.stringify(json),
		contentType : "application/json",
		success : function() {
			location.reload(true);
			console.log("OK");
		}
	});
};