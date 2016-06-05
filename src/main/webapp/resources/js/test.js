$(function(){

	$.ajax({
			url : "teast/getAll",
			type : 'GET',
			success : function(data) {
				
				for ( var index in data) {
					var kilkistStud = 0;
					for (var int = 0; int < data[index].students.length; int++) {
						kilkistStud ++;
					}
						var tr = $('<tr>');
						var tdName = $('<td>').text(data[index].groupName);
						var tdFacult = $('<td>').text(data[index].facult);
						var tdKilkistStud = $('<td>').text(kilkistStud);
						var button = $('<button>').attr("class","delete btn btn-info transfed")
						.attr('id', data[index].id).attr('value', data[index].id).text("Видалити");
						var button1 = $('<button>').attr("class","btn btn- transfed")
						.attr("data-toggle","modal")
						.attr("data-target","#myModalEdit")
						.attr('id', data[index].id).text("Редагувати");
						var tdButton=$('<td>').append(button);
						button.click(deleteGroup);
						var tdButton1=$('<td>').append(button1);
						tr.append(tdName).append(tdFacult).append(tdKilkistStud).append(tdButton).append(tdButton1);
						$('#tablecont').append(tr);
				}
			}
		});
	
})
