$(function() {
	$('#login-btn')
			.click(
					function() {
						var firstName = $('#firstname').val();
						$
								.ajax({
									type : 'post',
									url : 'customer/login',
									data : {
										'firstName' : firstName
									},
									success : function(data) {
										if (data != '') {
											location.href = "film.html?fristname=" + data.firstName;
										} else {
											$('.container')
													.append(
															'<div class="alert alert-danger col-md-2" rel="alert">'
																	+ '<button type="button" class="close" data-dismiss="alert">'
																	+ '<span aria-disabled="true">&times;</span>'
																	+ '</button><strong>登录失败</strong></div>')
										}

									},
									error : function() {
										alert("登录失败！");
									}
								});
					});
});