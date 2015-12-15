<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html public "-//w3c//dtd html 4.01 transitional//en"
"http://www.w3.org/tr/html4/loose.dtd"><html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>用户管理</title>
		<link rel="stylesheet"
			href="/hrManageProject/css/table.css" type="text/css"/>
		<script type="text/javascript">
			function doDelete(id) {
				if (confirm("确定删除此用户吗？")) {
					location.href = "success.jsp?users.userId=" + id;
				}
			}
		</script>
	</head>
	<body>
		<table width="100%">
			<tr>
				<td>
					<font color="black">您正在做的业务是：人力资源--权限管理--用户管理 </font>
				</td>
			</tr>
			<tr>
				<td>
					当前角色总数：6例
				</td>
			</tr>
			<tr>
				<td align="right">
					<input type="button" value="添加用户" class="BUTTON_STYLE1" onclick="location.href='user_add.jsp'">
				</td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=5 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
			<tr class="TR_STYLE1">
				<td class="TD_STYLE1">
					用户编号
				</td>
				<td class="TD_STYLE1">
					用户名称
				</td>
				<td class="TD_STYLE1">
					真实姓名
				</td>
				<td class="TD_STYLE1">
					用户密码
				</td>
				<td class="TD_STYLE1">
					用户身份
				</td>
				<td class="TD_STYLE1">
					操作
				</td>
			</tr>
			
				<s:if test="usersList.isEmpty==false">
					<s:iterator var="user" value="usersList" status="vs">
				<tr class="TR_STYLE2">
					<td class="TD_STYLE2">
						<s:property value="userId"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="userName"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="userTrueName"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="userPassword"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="role.roleName"/>
					</td>
					<td class="TD_STYLE2">
						<img src="/hrManageProject/images/bt_edit.gif" title="编辑" style="cursor:pointer;" onclick="location.href='user_edit.jsp'"/>
						<img src="/hrManageProject/images/bt_del.gif" title="删除" style="cursor:pointer;" onclick="doDelete(1177)"/>
					</td>
				</tr>
					</s:iterator>
				</s:if>
			
				
			
		</table>
		<p style="text-align:center;">
			
				<a href="user_list.jsp" style="color:black;">首页</a>
				
				
					 
						 
						    <font color="red">1</font> 
						 
						 
					 
				
				 
	     		<a href="user_list.jsp" style="color:black;">尾页</a> 
	     	
		</p>
	</body>
</html>
