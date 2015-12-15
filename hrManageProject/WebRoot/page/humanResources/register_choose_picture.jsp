<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html public "-//w3c//dtd html 4.01 transitional//en"
"http://www.w3.org/tr/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
		<link rel="stylesheet" href="/hrManageProject/css/table.css" type="text/css" >
		<script type="text/javascript" src="/hrManageProject/javascript/comm/comm.js"></script>
	<link rel="stylesheet"
			href="/hrManageProject/javascript/easyui/themes/default/easyui.css" />
		<link rel="stylesheet" href="/hrManageProject/javascript/easyui/themes/icon.css" />
		<script type="text/javascript" src="/hrManageProject/javascript/jquery-1.7.2.js"></script>
		<script type="text/javascript" src="/hrManageProject/javascript/jquery.easyui.min.js"></script>
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
				
				
			})
		</script>
	</head>
	<body>
				<form method="post" action="humanFile!doSevaRegisteByImage.action" enctype="multipart/form-data">
			<table width="100%">
				<tr>
					<td colspan="2">
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--图片上传</font>
					</td>
				</tr>
				<tr>
					<td width="59%">
				
							
							<div id="dvp">
							如有照片，请选择上传照片(.jpg、.gif文件)<br>
							photo:<input type="file" name="photo"/></div>
							<div id="dva" style="display: none">
							附件上传<br>
							attachment:<input type="file" name="attachment"/></div>
							
							<input type="button" value="添加附件" id="btn">
					
					</td>
					<td width="41%" align="right">
					<s:textfield name="humanId"></s:textfield><br>
						<input type="submit" value="提交"/>
					</td>
				</tr>
			</table>
				</form>
		
		
	</body>
</html>
