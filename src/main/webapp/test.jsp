
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>红包测试</title>
<script type="text/javascript" src="js/jquery-2.1.0.js"></script>
<script type="text/javascript" >
		$(function() {
			alert(1);
			var max = 30000;
			$("input").click(function () {
				alert(2);
				for (var i = 1; i < max ; i++){
					//
					$.ajax({
						url:"userRedPacket/grabRedPacket.do?userId="+i+"&redPacketId=1",
						data:{},
						type:"post",
						dataType:"json",
						success:function(data){
							$("span").html(i);
						},
						error:function(){
							$("span").html("请求数据失败!");
						}
					});
					//
				}
			});
			
		});
</script>
</head>
<body>
	<div align="center">
		<input type="button" value="开始测试"/>
		<h2>正在处理第<span></span>次请求</h2>
	</div>
</body>
</html>