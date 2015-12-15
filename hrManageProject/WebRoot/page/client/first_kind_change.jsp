<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
﻿<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="/hrManageProject/css/table.css" type="text/css"/>
		<script type="text/javascript"
			src="/hrManageProject/javascript/comm/comm.js">
		</script>
	</head>
	<body>
		<s:debug></s:debug>
		<form name="configfilefirstkindForm" method="post"
			action="configFileFirstKind!doFirstKindChange.action">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--I级机构设置--I级机构变更
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="提交" class="BUTTON_STYLE1" />
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="window.location.href='/hrManageProject//configFileFirstKind!toFirsKindList.action'">
					</td>
				</tr>
			</table>

			
			
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="19%" class="TD_STYLE1">
						I级机构编号2
					</td>
					<td width="81%" class="TD_STYLE2">
					<s:textfield name="configFileFirstKind.firstKindId" cssClass="INPUT_STYLE1" readonly="true">
							
					</s:textfield>
					<s:hidden name="configFileFirstKind.ffkId"></s:hidden>
							
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						I级机构名称
					</td>
					<td class="TD_STYLE2">
							<s:textfield name="configFileFirstKind.firstKindName" cssClass="INPUT_STYLE1">
							
							</s:textfield>
							
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						薪酬发放责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）
					</td>
					<td class="TD_STYLE2">
							<s:textarea name="configFileFirstKind.firstKindSalaryId" rows="4"
							cssClass="TEXTAREA_STYLE1">
							
							</s:textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						销售责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）
					</td>
					<td class="TD_STYLE2">
						
								<s:textarea name="configFileFirstKind.firstKindSaleId" rows="4"
							cssClass="TEXTAREA_STYLE1">
							
							</s:textarea>
					</td>
				</tr>
			</table>
		
		</form>
	</body>
</html>
