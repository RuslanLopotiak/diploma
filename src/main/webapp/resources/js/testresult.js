function testtemper() {

	$.ajax({
		success : function() {
			var testresult;
			var result = new Array();
			var summ1 = 0;
			var summ2 = 0;
			var summ3 = 0;
			var summ4 = 0;
			for (var i = 0; i <= 55; i++) {
				var c = document.getElementsByName('r[' + i + ']');
				if (c[0].checked) {
					result[i] = 1;
				} else {
					result[i] = 0;
				}
			}
			for (var i = 0; i <= 13; i++) {
				summ1 += result[i];
			}
			for (var i = 14; i <= 27; i++) {
				summ2 += result[i];
			}
			for (var i = 28; i <= 41; i++) {
				summ3 += result[i];
			}
			for (var i = 42; i <= 55; i++) {
				summ4 += result[i];
			}
			if (summ1 > summ2) {
				if (summ1 > summ3) {
					if (summ1 > summ4) {
						testresult = "Холерик";
					} else {
						testresult = "Меланхолік";
					}
				} else {
					if (summ3 > summ4) {
						testresult = "Флегматик";
					} else {
						testresult = "Меланхолік";
					}
				}
			} else {
				if (summ2 > summ3) {
					if (summ2 > summ4) {
						testresult = "Сангвінік";
					} else {
						testresult = "4";
					}
				} else {
					if (summ3 > summ4) {
						testresult = "Флегматик";
					} else {
						testresult = "Меланхолік";
					}
				}
			}
			
			$(function() {
				resulttemper(testresult);
			});
		}
	})
}

function resulttemper(data) {
	var json = {
		'temper' : data,

	}
	$.ajax({
		url : "testtemper/save",
		type : 'POST',
		data : JSON.stringify(json),
		contentType : "application/json",
		success : function() {
			location.reload(true);
			console.log("OK");
		}
	});

}

function teststres() {

	$.ajax({
		success : function() {
			var testresult;
			var result = new Array();
			var summ = 0;			
			for (var i = 0; i <= 15; i++) {
				var c = document.getElementsByName('e[' + i + ']');
				if (c[0].checked) {
					result[i] = 3;
				} else {if (c[1].checked){
					result[i] = 1;
				}else{
					result[i] = 0;
				}
				}
			}
			for (var i = 0; i <= 15; i++) {
				summ += result[i];
				
			}
			if (summ>36 ) {
				testresult="Низька"
			}
			if (summ<=36 && summ>18) {
				testresult="Середня"
			}
			if (summ<=18) {
				testresult="Висока"
			}
			
			$(function() {
				resultstres(testresult);
			});
		}
	})
}

function resultstres(data) {
	var json = {
		'stres' : data,

	}
	$.ajax({
		url : "teststres/save",
		type : 'POST',
		data : JSON.stringify(json),
		contentType : "application/json",
		success : function() {
			location.reload(true);
			console.log("OK");
		}
	});

}


function testnaviv() {

	$.ajax({
		success : function() {
			var testresult;
			var result = new Array();
			var summ = 0;			
			for (var i = 0; i <= 9; i++) {
				var c = document.getElementsByName('w[' + i + ']');
				if (c[0].checked) {
					result[i] = 1;
				} else {if (c[1].checked){
					result[i] = 1;
				}else{
					result[i] = 0;
				}
				}
			}
			for (var i = 0; i <= 9; i++) {
				summ += result[i];
				
			}
			if (summ>4 ) {
				testresult="Навіювання присутнє"
			}else{
				testresult="Навіювання відсутнє"
			}
			
			
			$(function() {
				resultnaviv(testresult);
			});
		}
	})
}

function resultnaviv(data) {
	var json = {
		'naviv' : data,

	}
	$.ajax({
		url : "testnaviv/save",
		type : 'POST',
		data : JSON.stringify(json),
		contentType : "application/json",
		success : function() {
			location.reload(true);
			console.log("OK");
		}
	});

}

function testkomun() {

	$.ajax({
		success : function() {
			var testresult;
			var result = new Array();
			var summ = 0;			
			for (var i = 0; i <= 15; i++) {
				var c = document.getElementsByName('q[' + i + ']');
				if (c[0].checked) {
					result[i] = 2;
				} else {if (c[1].checked){
					result[i] = 1;
				}else{
					result[i] = 0;
				}
				}
			}
			for (var i = 0; i <= 15; i++) {
				summ += result[i];
				
			}
			if (summ<=30 && summ>=32 ) {
				testresult="Навіювання присутнє"
			}else if (summ<=25 && summ>=29 ){
				testresult="Абсолютно замкнутий"
			}else if (summ<=19 && summ>=24){
				testresult="Замкнутий"
			}else if (summ<=14 && summ>=18 ){
				testresult="Товариський"
			}else if (summ<=9 && summ>=13 ){
				testresult="Комунікабельний"
			}else if (summ<=4 && summ>=8 ){
				testresult="Балакучий"
			}else {
				testresult="Занадто балакучий"
			}
			
			
			
			$(function() {
				resultkomun(testresult);
			});
		}
	})
}

function resultkomun(data) {
	var json = {
		'komun' : data,

	}
	$.ajax({
		url : "testkomun/save",
		type : 'POST',
		data : JSON.stringify(json),
		contentType : "application/json",
		success : function() {
			location.reload(true);
			console.log("OK");
		}
	});

}

function registrationTeath() {
	var json = {
		'email' : $('#email').val(),
		'password' : $('#password').val(),
		'name' : $('#name').val(),
		'sname' : $('#sname').val(),
		'age' : $('#age').val()
	}
	$.ajax({
		url : "registrationTeath/save",
		type : 'POST',
		data : JSON.stringify(json),
		contentType : "application/json",
		success : function() {
			location.reload(true);
			console.log("OK");
		}
	});
};