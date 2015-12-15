<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
	<head>
		<base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="/hrManageProject/css/table.css" type="text/css">
		<script type="text/javascript"
			src="/hrManageProject/javascript/comm/comm.js">
		</script>
	</head>
	<body>
		<form method="post" action="configfilefirstkind.do">
			<table width="100%">
				<tr>
					<td colspan="2">
						<font color="black">您正在做的业务是：
						人力资源--客户化设置--人力资源档案管理设置--公共属性添加
						</font>
					</td>
				</tr>
				<tr>
					<td width="49%">
						录入成功。
					</td>
					<td width="51%" align="right">
						<input type="button" value="继续录入" class="BUTTON_STYLE1"
							onclick="window.location.href='configPublicChar!toPublicCharAdd.action'">
						<input type="button" value="返回首页" class="BUTTON_STYLE1"
							onclick="window.location.href='configPublicChar!toPublicChar.action'">
					</td>
				</tr>
			</table>

		</form>
	</body>
</html>
