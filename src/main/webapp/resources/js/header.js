$("#login").click(showReg);
$(document).ready(newsFill)
function showReg(){
if($(".login-body").css('display') == 'none') 
$(".login-body").show();
else 
	$(".login-body").hide();	
}
function newsFill(){
	$(".cont").html("");
	$.ajax({
		url : "redactNews/getAll",
		type : 'GET',
		success : function(data) {
			for ( var index in data) {			
			var branch =$('<div>');
				branch.attr("class",'branch');
				var title=$('<h2>');
				title.text(data[index].title);
				var ttext=$('<h5>');
				ttext.text(data[index].textNews);
			branch.append(title).append(ttext);
			$(".cont").append(branch);
		
			};
		}
	});
	
}