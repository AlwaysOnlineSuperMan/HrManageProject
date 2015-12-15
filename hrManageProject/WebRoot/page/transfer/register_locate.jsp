<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
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
		
	    <script type="text/javascript" src="/hrManageProject/javascript/jquery-1.7.2.js"></script>
	    <script type="text/javascript" src="/hrManageProject/javascript/check.js"></script>
	</head>

	<body>
		<s:form name="humanfileForm" method="post" action="sysmajorc!getSelectIII3.action">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--调动管理--调动登记查询 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="查询"
							class="BUTTON_STYLE1"  />
					</td>
				</tr>
			</table>
			<!--
			<input type="hidden" name="page.startPage" value="0"/>
			-->
			<table width="101%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr class="TR_STYLE1">
					<td width="13%" class="TD_STYLE1">
						请选择员工所在I级机构					</td>
				  <td width="29%" class="TD_STYLE2">
						<!--
   <select style="width:160px" name="configThird.firstKindId" id="firstKindId" size="1" class="SELECT_STYLE2">						
								<option value="0">-----请选择-----</option>					
					  			
					  				<option  value="1353318953319">Ⅰ级结构</option>	
					  			
					  				<option  value="1353318929919">集团</option>	
					  			
					  				<option  value="1353318937391">总部</option>	
					  			
					  </select>  
				  -->
				  	<s:select list="configfirstlist" label="province" 
									    listKey="firstKindId" listValue="firstKindName"  
										headerKey="0" headerValue="请选择" 	 name="majorchange.firstKindId"
									    id="firstKind" cssClass="SELECT_STYLE2"    
									/>	
						
		           <!--<input type="hidden" name="majorChange.newFirstKindName"  id="newFirstKindName"/>
				  -->
				  </td>
					<td width="13%" class="TD_STYLE1">
						请选择员工所在II级机构					</td>
				  <td width="45%" class="TD_STYLE2">
					
  					 <!--<select style="width:160px" name="configThird.secondKindId" id="secondKindId" size="1" class="SELECT_STYLE2">						
								<option value="0">-----请选择-----</option>						
					 		
					  </select>majorchange.firstKindId
				  -->
				  	<select style="width:160px" name="majorchange.secondKindId" id="secondKind" size="1" class="SELECT_STYLE2">						
								<option value="0">请选择</option>
					 		 </select>
					 		 <!--
					  <input type="hidden" name="majorChange.newSecondKindName" value="" id="newSecondKindName">
				  			-->
				  </td>
					<td width="0%"></td>
				</tr>
				<tr class="TR_STYLE1">
					<td width="13%" class="TD_STYLE1">
						请选择员工所在III级机构					</td>
					<td width="29%" class="TD_STYLE2">
					 <!--<select style="width:160px" name="configThird.thirdKindId" id="thirdKindId" size="1" class="SELECT_STYLE2">		
								<option value="0">-----请选择-----</option>						
					   </select>
					    -->
					    <select style="width:160px" name="majorchange.thirdKindId" id="thirdKind" size="1" class="SELECT_STYLE2">		
								<option value="0">请选择</option>	
													
					   </select>
					   <!--<input type="hidden" name="majorChange.newThirdKindName" value="" id="newThirdKindName">
				  -->
				  </td>
					<td height="18" class="TD_STYLE1">
						请输入建档时间					</td>
					<td width="45%" class="TD_STYLE2">
						<input name="utilbean.startDate" onclick="aa('utilbean.startDate')" type="text" class="INPUT_STYLE2" id="date_start" style="width:24% " value="" size="30">
						至<input type="text" name="utilbean.endDate" onclick="aa('utilbean.endDate')" value="" style="width:24% " class="INPUT_STYLE2" id="date_end">
						（YYYY-MM-DD）
				  </td>
				</tr>
		  </table>
		</s:form>
	</body>
</html>
		
