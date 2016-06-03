$(function(){

	$.ajax({
			url : "student/getAll",
			type : 'GET',
			success : function(data) {
				
				for ( var index in data) {
						var tr = $('<tr>');
						var tdId = $('<td>').text(data[index].id);
						var tdTemper = $('<td>').text(data[index].name);
						var tdSocium = $('<td>').text(data[index].sname);
						var tdUvaga = $('<td>').text(data[index].age);
						var tdMozok = $('<td>').text(data[index].passport);
						var tdIq = $('<td>').text(data[index].group_ID);
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
						tr.append(tdId).append(tdIq).append(tdTemper).append(tdSocium).append(tdMozok).append(tdUvaga).append(tdButton).append(tdButton1);
						$('#tablecont').append(tr);
				}
			}
		});
	
})