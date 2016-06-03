$(function(){

	$.ajax({
			url : "group/getAll",
			type : 'GET',
			success : function(data) {
				
				for ( var index in data) {
						var tr = $('<tr>');
						var tdId = $('<td>').text(data[index].id);
						var tdName = $('<td>').text(data[index].groupName);
						var tdGroupId = $('<td>').text(data[index].groupID);
						var tdFacult = $('<td>').text(data[index].facult);
						var tdKilkistStud = $('<td>').text(data[index].kilkistStud);
						var button = $('<button>').attr("class","btn btn-info transfed")
						.attr("data-toggle","modal")
						.attr("data-target","#myModalDel")
						.attr('id', data[index].id).text("Видалити");
						var button1 = $('<button>').attr("class","btn btn- transfed")
						.attr("data-toggle","modal")
						.attr("data-target","#myModalEdit")
						.attr('id', data[index].id).text("Редагувати");
						var tdButton=$('<td>').append(button);
						var tdButton1=$('<td>').append(button1);
						tr.append(tdId).append(tdName).append(tdFacult).append(tdGroupId).append(tdKilkistStud).append(tdButton).append(tdButton1);
						$('#tablecont').append(tr);
				}
			}
		});
	
})