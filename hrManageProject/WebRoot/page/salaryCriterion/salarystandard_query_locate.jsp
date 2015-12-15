<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="/hrManageProject/css/table.css" type="text/css">
		<link rel="stylesheet" type="text/css" media="all"
			href="/hrManageProject/javascript/calendar/calendar-win2k-cold-1.css">
		<script type="text/javascript" src="/hrManageProject/javascript/calendar/cal.js"></script>
		<script type="text/javascript" src="/hrManageProject/javascript/comm/comm.js"></script>
		<script type="text/javascript" src="/hrManageProject/javascript/comm/list.js"></script>
		<script type="text/javascript" src="/hrManageProject/javascript/jquery-1.7.2.js"></script>	
		<script type="text/javascript" src="/hrManageProject/javascript/calendar-ch.js"></script>
		<script type="text/javascript" src="/hrManageProject/javascript/comm/time.js"></script>
		<link rel="stylesheet" href="/hrManageProject/css/cwcalendar.css" type="text/css"></link> 
	 
		<title>无标题文档</title>
		 
	</head>

	<body>
		<s:form method="post" action="SalaryStandard!getBycondition.action">
			<input type="hidden" name="startPage" value="0">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是:人力资源管理--薪酬标准管理--薪酬标准查询</font>
					</td>
				</tr>
				<tr>
					<td>
						<div align="right">
							<input type="submit" value="查询" class="BUTTON_STYLE1"/>
						</div>
					</td>
				</tr>
			</table>
			<table width="100%"  border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE2">
				<tr>
					<td width="20%"  class="TD_STYLE1">
						请输入薪酬标准编号
					</td>
					<td class="TD_STYLE2">
						<s:textfield name="Id" class="INPUT_STYLE1" style="width:24% " value="" size="30"></s:textfield>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请输入关键字
					</td>
					<td class="TD_STYLE2">
						<s:textfield name="Name" class="INPUT_STYLE1" style="width:24% " value="" size="30"></s:textfield>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请输入建档时间
					</td>
					<td width="84%" class="TD_STYLE2">
						<%--<input name="startDate" onclick="aa('startDate')" type="text" class="INPUT_STYLE2" id="date_start" style="width:24% " value="" size="30">
						至 <input type="text" name="utilbean.endDate" onclick="aa('utilbean.endDate')" value="" style="width:24% " class="INPUT_STYLE2" id="date_end">
						（YYYY-MM-DD）
						--%><s:textfield name="startDate" onclick="aa('startDate')" class="INPUT_STYLE2" id="date_start" style="width:24% " value="" size="30"/>至
						<s:textfield name="endDate" onclick="aa('endDate')" class="INPUT_STYLE2" id="date_start" style="width:24% " value="" size="30"/>	（YYYY-MM-DD）
					</td>
				</tr>
			</table>
		</s:form>
	</body>
	 
</html>
