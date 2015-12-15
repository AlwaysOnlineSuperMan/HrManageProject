<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html public "-//w3c//dtd html 4.01 transitional//en"
"http://www.w3.org/tr/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="/hrManageProject/css/table.css" type="text/css" />
		<script type="text/javascript"
			src="/hrManageProject/avascript/comm/comm.js">
		</script>

		
		
		<link rel="stylesheet" href="css/table.css" type="text/css" />
	<link rel="stylesheet"
			href="javascript/easyui/themes/default/easyui.css" />
		<link rel="stylesheet" href="javascript/easyui/themes/icon.css" />
		<script type="text/javascript" src="javascript/jquery-1.7.2.js"></script>
		<script type="text/javascript" src="javascript/jquery.easyui.min.js"></script>
		<script type="text/javascript">
			$(function(){
				 
				
				$('#btn').toggle(function(){
					$(this).val("添加图片");
					$("#dvp").hide();
					$("#dva").show();
				},
				function(){
					$(this).val("添加附件");
					$("#dvp").show();
					$("#dva").hide();
				}
				)
				
				$(":button[value='显示照片']").click(function(){
					alert($(this).next(":hidden").val());
					$("img").attr("src",$(this).next(":hidden").val());
				})
			})
		</script>
	</head>
	<body>
	
			<table width="100%">
				<tr>
					<td colspan="2">
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--附件上传</font>
					</td>
				</tr>
				<tr>
					
					
						<form action="uploadFile.action" method="post" enctype="multipart/form-data">
							<div id="dvp">photo:<input type="file" name="photo"/></div>
							<div id="dva" style="display: none">attachment:<input type="file" name="attachment"/></div>
							
							<input type="button" value="添加附件" id="btn"><input type="submit" value="提交"/>
						</form>
				</tr>
			</table>
	
	</body>
</html>
