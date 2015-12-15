<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
﻿﻿<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="/hrManageProject/css/table.css" type="text/css">
		<script type="text/javascript"
			src="/hrManageProject/javascript/comm/comm.js">
		</script>
	</head>
	
<script type="text/javascript">
		function check(){
			if (document.getElementById("firstKindId").value==0){
				alert("请选择I级机构名称!!!");
				return false;
			}
			if (document.getElementById("secondKindName").value==""){
				alert("II级机构名称不能为空!!!");
				return false;
			}
			if (document.getElementById("secondSalaryId").value==""){
				alert("薪酬发放责任人编号不能为空!!!");
				return false;
			}
			if (document.getElementById("secondSaleId").value==""){
				alert("销售责任人编号不能为空!!!");
				return false;
			}
			return true;
		}	
		function change(){
		var se=document.getElementById("firstKindId");
		document.getElementById("firstKindName").value=se.options[se.selectedIndex].innerHTML;
		}	
</script>
	<body>
		<form action="configFileSecondKind!doSecondKindRegister.action" method="post" onsubmit="return check()">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--II级机构设置--II级机构添加
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
					<td width="19%" class="TD_STYLE1">
						I级机构名称
					</td>
					<td width="81%" class="TD_STYLE2">
					<!--<select name="cfsk.firstKindId" id="firstKindId" onchange="change()">
						<option>请选择I级机构名称...</option>
						
						<option value="1353318953319">Ⅰ级结构</option>
						
						<option value="1353318929919">集团</option>
						
						<option value="1353318937391">总部</option>
						
					</select>
					
					--><s:select list="configFileFirstKindList"
					 listKey="firstKindId" listValue="firstKindName"  
					headerKey="0" headerValue="请你选择" 	
					 name="configFileSecondKindWithBLOBs.firstKindId"  onchange="change()"
					id="firstKindId" 
					>
					
					</s:select>
					<s:hidden   name="configFileSecondKindWithBLOBs.firstKindName"></s:hidden>
					</td>
				</tr>
				<tr>
					<td width="19%" class="TD_STYLE1">
						II级机构编号
					</td>
					<td width="81%" class="TD_STYLE2">
					<s:textfield name="configFileSecondKindWithBLOBs.secondKindId" readonly="true"></s:textfield>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						II级机构名称
					</td>
					<td class="TD_STYLE2">
							<s:textfield name="configFileSecondKindWithBLOBs.secondKindName" id="secondKindName"  cssClass="INPUT_STYLE1"></s:textfield>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						薪酬发放责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）
					</td>
					<td class="TD_STYLE2">
					<s:textarea rows="4" cols="" cssClass="TEXTAREA_STYLE1" id="secondSalaryId" name="configFileSecondKindWithBLOBs.secondSalaryId"></s:textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						销售责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）
					</td>
					<td class="TD_STYLE2">
					<s:textarea  rows="4" cols="" cssClass="TEXTAREA_STYLE1" id="secondSaleId" name="configFileSecondKindWithBLOBs.secondSaleId"></s:textarea>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>

