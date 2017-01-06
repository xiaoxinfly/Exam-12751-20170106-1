$(function(){
	initLanguage();
	$('#film-submit').click(function(){
		$.ajax({
			type:'post',
			url:'film/add',
			data:$('#film-add-form').serialize(),
			success:function(data){
				var r = confirm("添加成功！是否返回电影列表？");
				if(r==true){
					location.href = "film.html";
				}
			},
			error:function(){
				alert("发生未知错误，添加失败！");
			}
		}); 
	});
});

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
