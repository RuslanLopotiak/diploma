$(function(){

	$.ajax({
			url : "haract/getAll",
			type : 'GET',
			success : function(data) {
				
				for ( var index in data) {
						var tr = $('<tr>');
						var tdId = $('<td>').text(data[index].id);
						var tdTemper = $('<td>').text(data[index].temper);
						var tdSocium = $('<td>').text(data[index].socium);
						var tdUvaga = $('<td>').text(data[index].uvaga);
						var tdMozok = $('<td>').text(data[index].mozok);
						var tdIq = $('<td>').text(data[index].iq);
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
						tr.append(tdId).append(tdIq).append(tdTemper).append(tdSocium).append(tdUvaga).append(tdMozok).append(tdButton).append(tdButton1);
						$('#tablecont').append(tr);
				}
			}
		});
	
})