$(function()  {
	$('#group').html("");
	$.ajax({
		url : "registrationSt/getGroup",

		type : 'GET',
		success : function(data) {
			for ( var index in data) {
				var option = $('<option>').text(data[index].groupName).attr(
						"value", data[index].id);
				$('#group').append(option);
			}
			
		}
	});
});


function registrationSt() {
	var json = {
		'email' : $('#email').val(),
		'password' : $('#password').val(),
		'name' : $('#name').val(),
		'sname' : $('#sname').val(),
		'age' : $('#age').val(),
		'groupId' : $('#group').val()
	}
	$.ajax({
		url : "registrationSt/save",
		type : 'POST',
		data : JSON.stringify(json),
		contentType : "application/json",
		success : function() {
			location.reload(true);
			console.log("OK");
		}
	});
};
