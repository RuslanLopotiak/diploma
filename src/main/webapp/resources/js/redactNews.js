$(function() {

	$.ajax({
		url : "redactNews/getAll",
		type : 'GET',
		success : function(data) {

			for ( var index in data) {
				var time = data[index].time;
				var timeString = time.toString();
				var tr = $('<tr>');
				var tdTitle = $('<td>').text(data[index].title);
				var tdTextNews = $('<td>').text(data[index].textNews);
				var tdTime = $('<td>').text(timeString);
				var button = $('<button>').attr("class",
						"delete btn btn-info transfed").attr('id',
						data[index].id).attr('value', data[index].id).text(
						"Видалити");
				var button1 = $('<button>').attr("class", "btn btn- transfed")
						.attr("data-toggle", "modal").attr('value',
								data[index].id).attr("data-target",
								"#myModalEdit").attr('id', data[index].id)
						.text("Редагувати");
				var tdButton = $('<td>').append(button);
				button.click(deleteNews);
				var tdButton1 = $('<td>').append(button1);
				button1.click(NewsInModal);
				tr.append(tdTitle).append(tdTextNews).append(tdTime).append(
						tdButton).append(tdButton1);
				$('#tablecont').append(tr);
			}
		}
	});

})
function NewsInModal() {
	var json = {
		'id' : $(this).val()
	}
	$('#newsRes').html('');
	$.ajax({
		url : "redactNews/newsInModal",
		type : 'POST',
		data : JSON.stringify(json),
		contentType : "application/json",
		success : function(data) {
			var content = $('<div>');
			var id=$('<input>').attr("id", "redactId").attr("type", "number").attr("type",
			"hidden").attr("value", data.id);
			var title = "<h4>Заголовок</h4>";
			var inputTitle = $('<input>').attr("id", "redactTitle").attr("type", "text").attr("class",
					"form-control").attr("value", data.title);
			var textNews = "<h4>Новина</h4>";
			var inputTextNews = $('<textarea>').attr("id", "redactTextNews").attr("rows", "6").attr("class", "form-control").text(data.textNews);
			content.append(id).append(title).append(inputTitle).append(textNews).append(
					inputTextNews);
			$('#newsRes').append(content);

		}
	});
}
function updateNews() {
	var json = {
			'id' : $('#redactId').val(),
			'title' : $('#redactTitle').val(),
			'textNews':$('#redactTextNews').val()
		}
	$.ajax({
		url : "redactNews/update",
		type : 'POST',
		data : JSON.stringify(json),
		contentType : "application/json",
		success : function() {
			console.log("OK");
			location.reload(true);
		}
	});
}

function deleteNews() {
	var json = {
		'id' : $(this).val()
	}
	$.ajax({
		url : "redactNews/delete",
		type : 'POST',
		data : JSON.stringify(json),
		contentType : "application/json",
		success : function() {
			console.log("OK");
			location.reload(true);
		}
	});
}

function addNews(){
	var json = {	
			'title' : $('#newsName').val(),
			'textNews':$('#newsText').val()
		}
		$.ajax({
			url : "redactNews/add",
			type : 'POST',
			data : JSON.stringify(json),
			contentType : "application/json",
			success : function() {
				console.log("OK");
				location.reload(true);
			}
		});
}
