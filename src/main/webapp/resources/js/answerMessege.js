$(function() {
	$('#tablecont').html('')
	$.ajax({
		url : "answerMessege/getNotAnswerStudent",
		type : 'GET',
		success : function(data) {

			for ( var index in data) {

				var tr = $('<tr>');
				var tdName = $('<td>').text(data[index].name);
				var tdSname = $('<td>').text(data[index].sname);
				var button = $('<button>').attr("data-toggle", "modal").attr(
						"data-target", "#myModalEdit").attr("class",
						"btn btn-info getChat").attr('id', data[index].id)
						.attr('value', data[index].id).text("Відкрити Чат");
				var tdButton = $('<td>').append(button);
				button.click(getChat);
				tr.append(tdName).append(tdSname).append(tdButton);
				$('#tablecont').append(tr);
			}
		}
	});
})


function getChat() {
	$('#getIdfuck').attr("value",$(this).val());
	var json = {
		'id' : $(this).val()
	}
	$('#messegeCont').html('');
	
	$.ajax({
		data : JSON.stringify(json),
		contentType : "application/json",
		url : "answerMessege/getStudentMessege",
		type : 'POST',
		success : function(data) {
			var content = $('<div>').attr("class", "messegeConteiner");
			for ( var i in data) {
				var li = $('<li>');
				var div = $('<div>').attr("class", "chat-body clearfix ");
				var p = $('<p>');
				if (data[i].ansver) {
					li.attr("class", "right clearfix")
				} else {
					li.attr("class", "left clearfix")
				}
				p.text(data[i].textMes);
				div.append(p);
				li.append(div);
				content.append(li);
			}
			$('#messegeCont').append(content);
		}
	});

}
$('#btn-chat').click(newMessege);
function newMessege(){
	var json = {	
			'id' : $('#getIdfuck').val(),
			'textMes' : $("#btn-input").val()
		}
	
		$.ajax({
			url : "answerMessege/add",
			type : 'POST',
			data : JSON.stringify(json),
			contentType : "application/json",
			success : function() {
				console.log("OK");
				location.reload(true);
			}
		});
}