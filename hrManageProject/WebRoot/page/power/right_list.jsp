<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>角色管理</title>
		<link rel="stylesheet"
			href="/hrManageProject/css/table.css" type="text/css"/>
		<script type="text/javascript">
			function doDelete(id) {
				if (confirm("确定删除此角色吗？")) {
					location.href = "success.jsp?sysRole.roleId=" + id;
				}
			}
		</script>
	</head>
	<body>
		<table width="100%">
			<tr>
				<td>
					<font color="black">您正在做的业务是：人力资源--权限管理--角色管理 </font>
				</td>
			</tr>
			<tr>
				<td>
					当前角色总数：8例
				</td>
			</tr>
			<tr>
				<td align="right">
					<input type="button" value="添加角色" class="BUTTON_STYLE1" onclick="location.href='right_add.jsp'">
				</td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=5 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
			<tr class="TR_STYLE1">
				<td class="TD_STYLE1">
					角色编号
				</td>
				<td class="TD_STYLE1">
					角色名称
				</td>
				<td class="TD_STYLE1">
					角色说明
				</td>
				<td class="TD_STYLE1">
					是否可用
				</td>
				<td class="TD_STYLE1">
					操作
				</td>
			</tr>
			<s:if test="rolelist.isEmpty==false"> 
			<s:iterator var="role" value="rolelist" status="vs">
				<tr class="TR_STYLE2">
					<td class="TD_STYLE2">
						<s:property value="roleId"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="roleName"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="roleDesc"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="roleFlag"/>
					</td>
					<td class="TD_STYLE2">
						<img src="/hrManageProject/images/bt_edit.gif" title="编辑" style="cursor:pointer;" onclick="location.href='right_list_information.jsp'"/>
						<img src="/hrManageProject/images/bt_del.gif" title="删除" style="cursor:pointer;" onclick="doDelete(7)"/>
					</td>
				</tr>
				</s:iterator>
				</s:if>
			
		</table>
		<p style="text-align:center;">
			
				<a href="right_list.jsp" style="color:black;">首页</a>
				
				
					 
						 
						    <font color="red">1</font> 
						 
						 
					 
				
					 
						 
						 
							<a href="right_list.jsp" style="color:black;">2</a> 
						 
					 
				
				<a href="right_list.jsp" style="color:black;">下一页</a> 
	     		<a href="right_list.jsp" style="color:black;">尾页</a> 
	     	
		</p>
	</body>
	
</html>
