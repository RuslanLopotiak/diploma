$(function() {
	$('#content').html("");
	$
			.ajax({
				url : "administration/showOrders",
				type : 'GET',
				success : function(data) {
					for ( var index in data) {
						var tr = $('<tr>');
						var tdId = $('<td>').text(data[index].id);
						var tdOrderTime = $('<td>').text(data[index].orderTime);
						var tdExcursionName = $('<td>').text(
								data[index].excursionName);
						var tdExcursionTime = $('<td>').text(
								data[index].excursionTime);
						var tdMambers = $('<td>').text(data[index].mambers);
						var tdUserName = $('<td>').text(data[index].userName);
						var tdEmail = $('<td>').text(data[index].email);
						var tdPhoneNum = $('<td>').text(data[index].phoneNum);
						var button = $('<button>').attr("class",
								"btn btn-info transfed ").attr("data-toggle",
								"modal").attr("data-target", "#myModal").attr(
								'id', data[index].id).attr("value",data[index].id).text("Підтвердити");
						if (data[index].confirm) {
							var tdButton = $('<td>').text("підтверджено");
						}else {
							var tdButton = $('<td>').append(button);
							button.click(activate);
						}
						tr.append(tdId).append(tdOrderTime).append(
								tdExcursionName).append(tdExcursionTime)
								.append(tdMambers).append(tdUserName).append(
										tdEmail).append(tdPhoneNum).append(
										tdButton);
						$('#content').append(tr);
					}
				}
			});
});

function activate(){
	var json = {
			'idString' : $(this).val(),
	}
	$.ajax({
		url : "administration/activate",
		type : 'POST',
		data : JSON.stringify(json),
		contentType : "application/json",
		success : function() {
			location.reload(true);
			console.log("OK");
		}
	});
}