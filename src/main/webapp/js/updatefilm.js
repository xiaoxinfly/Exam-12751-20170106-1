$(function(){
	initForm();
	initLanguage();
	$('#film-submit').click(function(){
		$.ajax({
			type:'post',
			url:'film/update',
			data:$('#film-add-form').serialize(),
			success:function(data){
				var r = confirm("修改成功！是否返回电影列表？");
				if(r==true){
					location.href = "film.html";
				}
			},
			error:function(){
				alert("发生未知错误，修改失败！");
			}
		}); 
	});
});

function initForm() {
	var url = location.search;
	var reg = new RegExp("%20","g");//g,表示全部替换。
	url = url.replace(reg," ");
	var array  = url.substring(1, url.length).split("&");
	$('#filmId').val(array[0].split("=")[1]);
	$('#title').val(array[1].split("=")[1]);
	$('#description').text(array[2].split("=")[1]);
}

function initLanguage(){
	$.ajax({
		type:'post',
		url:'language/all',
		success:function(data){
			$.each(data,function(index,item){
				$('#page-rows').append(
						'<option value="' + item.languageId+
						'">' +item.name +'</option>'
				);
			});
		},
		error:function(){
			alert("发生未知错误，初始化失败！");
		}
	}); 
}
