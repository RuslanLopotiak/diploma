$(function() {
	$('#tablecont').html('')
	$
			.ajax({
				url : "test/get",
				type : 'GET',
				success : function(data) {
					var tr = $('<tr>');
					var tdkomun = $('<td>');
					var button1 = $('<a>').attr("class"," btn btn-info").attr("role","button").text("Пройти тест");
					var button2 = $('<a>').attr("class"," btn btn-info").attr("role","button").text("Пройти тест");
					var button3 = $('<a>').attr("class"," btn btn-info").attr("role","button").text("Пройти тест");
					var button4 = $('<a>').attr("class"," btn btn-info").attr("role","button").text("Пройти тест");
					if (data.komun == null) {
						button1.attr("href","testkomun")
						tdkomun.append(button1)
					} else {
						tdkomun.text(data.komun)
					}
					var tdnaviv = $('<td>');
					if (data.naviv == null) {
						button2.attr("href","testnaviv")
						tdnaviv.append(button2)
					} else {
						tdnaviv.text(data.naviv)
					}
					var tdstres = $('<td>');
					if (data.stres == null) {
						button3.attr("href","teststres")
						tdstres.append(button3)
					} else {
						tdstres.text(data.stres)
					}
					var tdtemper = $('<td>');
					if (data.temper == null) {
						button4.attr("href","testtemper")
						tdtemper.append(button4)

					} else {
						tdtemper.text(data.temper)
					}
					/*
					 * var button = $('<button>').attr("class","delete btn
					 * btn-info transfed") .attr('id',
					 * data[index].id).attr('value',
					 * data[index].id).text("Видалити"); var button1 = $('<button>').attr("class","btn
					 * btn- transfed") .attr("data-toggle","modal")
					 * .attr("data-target","#myModalEdit") .attr('id',
					 * data[index].id).text("Редагувати"); var tdButton=$('<td>').append(button);
					 * button.click(deleteGroup); var tdButton1=$('<td>').append(button1);
					 */
					tr.append(tdkomun).append(tdnaviv).append(tdstres).append(
							tdtemper);
					$('#tablecont').append(tr);

				}
			});

})
