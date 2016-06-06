$(function(){
	$('#messegeCont').html('');
	$.ajax({
			url : "messege/getAll",
			type : 'GET',
			success : function(data) {
				var content=$('<div>').attr("class","messegeConteiner");
				for ( var i in data) {
						var li = $('<li>');
						var div = $('<div>').attr("class","chat-body clearfix ");
						var p = $('<p>');
						if (data[i].ansver) {
							li.attr("class","right clearfix")
						}else{
							li.attr("class","left clearfix")
						}
						p.text(data[i].textMes);
						div.append(p);
						li.append(div);
						content.append(li);
				}
				$('#messegeCont').append(content);
			}
		});
	
})

$('#btn-chat').click(newMessege);

function newMessege(){
	var json = {	
			'textMes' : $("#btn-input").val()
		}
		$.ajax({
			url : "messege/add",
			type : 'POST',
			data : JSON.stringify(json),
			contentType : "application/json",
			success : function() {
				console.log("OK");
				location.reload(true);
			}
		});
}
	
