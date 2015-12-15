<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
﻿﻿<%@ taglib prefix="s" uri="/struts-tags" %>
﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="/hrManageProject/css/table.css" type="text/css">
		<script type="text/javascript"
			src="/hrManageProject/javascript/comm/comm.js">
		</script>
	</head>

<script type="text/javascript">
		function check(){
			if (document.getElementById("majorKind.majorKindName").value==""){
				alert("职位分类名称不能为空!!!");
				return false;
			}
			return true;
		}	
</script>	
	
	
	
	<body>
		<form action="configMajorKind!doMajorKindAdd.action" method="post" onsubmit="return check()">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--职位分类设置--职位分类添加
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="提交" class="BUTTON_STYLE1">
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back();">
					</td>
				</tr>
			</table>

			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="19%">
						职位分类编号
					</td>
					<td class="TD_STYLE2" width="81%">
					<s:hidden name="configMajorKind.majorKindId" cssClass="INPUT_STYLE1" readonly="true"></s:hidden>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类名称
					</td>
					<td class="TD_STYLE2">
					<s:textfield name="configMajorKind.majorKindName" cssClass="INPUT_STYLE1" id="majorKind.majorKindName"></s:textfield>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>

