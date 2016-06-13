$(function() {
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
$('#get')
		.click(
				function() {
					var json = {
						'id' : $('#group').val(),
					}
					$('#tablecont').html('');
					$('#tablehead').html('');
					$
							.ajax({
								url : "student/getByGroup",
								type : 'POST',
								data : JSON.stringify(json),
								contentType : "application/json",
								success : function(data) {
									var tablehead = "";
									tablehead += "<tr><th>Id</th><th>Ім`я</th><th>Фамілія</th><th>Вік</th><th>Результати тестів</th><th>Видалити</th></tr>"
									$('#tablehead').append(tablehead);
										for ( var index in data) {
										var tr = $('<tr>');
										var tdId = $('<td>').text(
												data[index].id);
										var tdName = $('<td>').text(
												data[index].name);
										var tdSname = $('<td>').text(
												data[index].sname);
										var tdAge = $('<td>').text(
												data[index].age);
										/* var tdMozok = $('<td>').text(data[index].passport); */
										var button = $('<button>').attr(
												"class",
												"btn btn-info transfed").attr(
												"data-toggle", "modal").attr(
												"data-target", "#myModalDel")
												.attr('id', data[index].id)
												.attr('value', data[index].id)
												.text("Результати Тестів");
										var button1 = $('<button>').attr(
												"class", "btn btn- transfed")
												.attr('value', data[index].id)
												.attr("data-toggle", "modal")
												.attr("data-target",
														"#myModalEdit").attr(
														'id', data[index].id)
												.text("Видалити");
										var tdButton = $('<td>').append(button);
										button.click(getHaractRes);
										var tdButton1 = $('<td>').append(
												button1);
										button1.click(deleteStudent);
										tr.append(tdId).append(tdName).append(
												tdSname).append(tdAge).append(
												tdButton).append(tdButton1);
										$('#tablecont').append(tr);
									}
								}
							});
				});

function deleteStudent() {
	var json = {
		'id' : $(this).val()
	}
	$.ajax({
		url : "student/delete",
		type : 'POST',
		data : JSON.stringify(json),
		contentType : "application/json",
		success : function() {
			console.log("OK");
			location.reload(true);
		}
	});
}

function getHaractRes() {
	var json = {
		'id' : $(this).val(),
	}
	$('#haractRes').html('')
	$.ajax({
		url : "student/getHaractRes",
		type : 'POST',
		data : JSON.stringify(json),
		contentType : "application/json",
		success : function(data) {
			var content = $('<div>');
			var komun = "<h4>Комунікативність</h4>";
			var inputKomun = $('<input>').attr("type", "text").attr("class",
					"form-control").attr("readonly", "");
			if (data.komun == null) {
				inputKomun.attr("value", "Тест не пройдено")
			} else {
				inputKomun.attr("value", data.komun)
			}
			var naviv = "<h4>Навіювання</h4>";
			var inputNaviv = $('<input>').attr("class", "form-control").attr(
					"readonly", "");
			if (data.naviv == null) {
				inputNaviv.attr("value", "Тест не пройдено")
			} else {
				inputNaviv.attr("value", data.naviv)
			}
			var stres = "<h4>Стресостійкість</h4>";
			var inputStres = $('<input>').attr("class", "form-control").attr(
					"readonly", "");
			if (data.stres == null) {
				inputStres.attr("value", "Тест не пройдено")
			} else {
				inputStres.attr("value", data.stres)
			}
			var temper = "<h4>Темперамент</h4>";
			var inputTemper = $('<input>').attr("class", "form-control").attr(
					"readonly", "");
			if (data.temper == null) {
				inputTemper.attr("value", "Тест не пройдено")
			} else {
				inputTemper.attr("value", data.temper)
			}
			content.append(komun).append(inputKomun).append(naviv).append(
					inputNaviv).append(stres).append(inputStres).append(temper)
					.append(inputTemper);
			$('#haractRes').append(content);

		}
	});

}
/*
 * $(function() {
 * 
 * $.ajax({ url : "student/getAll", type : 'GET', success : function(data) {
 * 
 * for ( var index in data) { var tr = $('<tr>'); var tdId = $('<td>').text(data[index].id);
 * var tdName = $('<td>').text(data[index].name); var tdSname = $('<td>').text(data[index].sname);
 * var tdAge = $('<td>').text(data[index].age); var tdMozok = $('<td>').text(data[index].passport);
 * var button = $('<button>').attr("class", "btn btn-info
 * transfed").attr("data-toggle", "modal") .attr("data-target",
 * "#myModalDel").attr('id', data[index].id).text("Результати Тестів"); var
 * button1 = $('<button>').attr("class", "btn btn- transfed")
 * .attr("data-toggle", "modal").attr("data-target", "#myModalEdit").attr('id',
 * data[index].id) .text("Видалити"); var tdButton = $('<td>').append(button);
 * var tdButton1 = $('<td>').append(button1);
 * tr.append(tdId).append(tdName).append(tdSname).append(tdAge)
 * .append(tdButton).append(tdButton1); $('#tablecont').append(tr); } } }); })
 */