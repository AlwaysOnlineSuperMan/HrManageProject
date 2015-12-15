<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
﻿﻿﻿<%@ taglib prefix="s" uri="/struts-tags" %>
﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="/hrManageProject/css/table.css" type="text/css">
		<script type="text/javascript"
			src="/hrManageProject/javascript/comm/comm.js">
		</script>
		
		<script type="text/javascript" src="/hrManageProject/javascript/jquery-1.7.2.js"></script>
		
		<script type="text/javascript">
			function deletePublicChar(id){
				$.ajax({
						url:"http://127.0.0.1:8080/HR_Fist/customiz/customizAction!doDeletePublicChar",
						data:"cpc.pbcId="+id,
						dataType:"text",
						success:function (){
							alert("删除成功！");
							location.reload();
						},
						type:"post"
					});
			}
		</script>
	</head>
	<body>
		<form method="post" action="../customiz/customizAction!findPublicChar">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--公共属性设置
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="添加" class="BUTTON_STYLE1"
							onclick="window.location.href='configPublicChar!toPublicCharAdd.action';">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				
				
				<tr>
					<td width="49%" class="TD_STYLE1">
						属性种类
					</td>
					<td width="44%" class="TD_STYLE1">
						属性名称
					</td>
					<td width="7%" class="TD_STYLE1" align="center">
						删除
					</td>
				</tr>
				
				<s:iterator value="configPublicChars">
				<tr>
					<td class="TD_STYLE2">
						<s:property value="attributeKind"/>
					</td>
					<td class="TD_STYLE2">
							<s:property value="attributeName"/>
					</td>
					<td class="TD_STYLE2" align="center">
						<a href="#">删除</a>
					</td>
				</tr>
				</s:iterator>
				
				

			</table>
			<p>
				 
		</form>
	</body>
</html>
