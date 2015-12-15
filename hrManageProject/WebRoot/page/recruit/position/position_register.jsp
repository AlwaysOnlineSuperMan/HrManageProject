<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
  <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
    <title>My JSP 'index.jsp' starting page</title>
	 
		 
		<script type="text/javascript"
			src="/hrManageProject/javascript/comm/comm.js">
		</script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/comm/list.js">
		</script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/calendar-ch.js">
		</script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/jquery-1.7.2.js">
		</script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/locate.js">
		</script><!--
	 <script type="text/javascript"
			src="/hrManageProject/javascript/select.js">
		</script>
	 --><script type="text/javascript"
			src="/hrManageProject/javascript/position_register.js">
		</script>
 		<script type="text/javascript">
 			window.onload=check;
		function tick() {
			var now = new Date();
			var hours, minutes, seconds, noon;
			var intHours, intMinutes, intSeconds;
			intHours = now.getHours();
			intMinutes = now.getMinutes();
			intSeconds = now.getSeconds();
			if (intHours < 24) {
				hours = intHours+":";
				noon = "A.M.";
			} else {
				intHours = intHours - 24;
				hours = intHours + ":";
				noon = "P.M.";
			}
			if (intMinutes < 10) {
				minutes = "0"+intMinutes+":";
			} else {
				minutes = intMinutes+":";
			}
			if (intSeconds < 10) {
				seconds = "0"+intSeconds+" ";
			} else {
				seconds = intSeconds+" ";
			}
			timeString = hours+minutes+seconds;
			var now = new Date();
		  	document.getElementById("nowTime").value=now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate()+" "+timeString;
			window.setTimeout("tick();", 1000);
		}
		
		//load事件
		function check(){
			//获得系统当前时间的方法
		  	tick();					
		}
 		</script>
 	<script type="text/javascript">
 	   function mysubmit(){  
 	   	document.getElementById('deadline').value = document
				.getElementById('date_start').value;
				
 	    if(document.getElementById("firstKindId").value==""){
 	       alert("请选择一级机构");
 	       return ;
 	       }
 	  if(document.getElementById("engageType").value==""){
 	       alert("请选择招聘类型");
 	       return ;
 	       } 
 	  if(document.getElementById("majorKindId").value==""){
 	       alert("请选择职位分类");
 	       return ;
 	       }    
 	   if(document.getElementById("majorId").value==""){
 	       alert("请选择职位名称");
 	       return ;
 	       }    
 	  if(document.getElementById("humanAmount").value==""){
 	   alert("请填写招聘人数");
 	       return ; 
 	  }    
 	  if(document.getElementById("date_start").value==""){
 	   alert("请选择截止日期");
 	       return ; 
 	  }   
  
		  	document.humanfileForm.submit();
	}
	
	 
</script> 
<link rel="stylesheet" href="/hrManageProject/css/table.css" type="text/css"></link>
		<link rel="stylesheet" href="/hrManageProject/css/cwcalendar.css" type="text/css"></link>
 	</head>
	<body>
		<form  method="post" action="engageMajorRelease!saveEngageMajorRelease" >
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--职位发布管理--职位发布登记 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<!--<input type="button" value="提交" class="BUTTON_STYLE1" 
						  onclick="mysubmit();"/>
						<input type="reset" value="清除" class="BUTTON_STYLE1"/>
						-->
						<input type="submit" value="提交" class="BUTTON_STYLE1" />
						<input type="reset" value="清除" class="BUTTON_STYLE1"/>
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="11%">
						I级机构
					</td>
					<td width="14%" class="TD_STYLE2">
						
					<s:select list="configFileFirstKinds" label="province" 
					 listKey="ffkId" listValue="firstKindName"  
					headerKey="0" headerValue="请你选择" 	 name="firstKindId"
					id="firstKind" cssClass="SELECT_STYLE1"
					/>																																									
				
						<input type="hidden" name="firstKindName"/>
					</td>
					<td width="11%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE2">
						<select name="engageMajorRelease.secondKindId" id="secondKind" class="SELECT_STYLE1"> 
						<option value="">请选择</option>
						
						</select>
						<input type="hidden" name="secondKindName"/>
					</td>
					<td width="11%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2"  >
						<select name="engageMajorRelease.thirdKindId" id="thirdKind" class="SELECT_STYLE1">
							<option value="">请选择</option>
						</select>
						<input type="hidden" name="thirdKindName"/>
					</td>
					<td width="11%" class="TD_STYLE1">
						招聘类型
					</td>
					<td class="TD_STYLE2" colspan="2">
					<select name="engageType" id="engageType" class="SELECT_STYLE1"> 
							<option value="">请选择</option> 
							
							<option value="校园招聘">校园招聘</option> 
							
							<option value="社会招聘">社会招聘</option> 
							
				   </select>
					</td>
				</tr>
				<tr>
					
					
					
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
						<s:select list="configMajorKinds" 
					 listKey="majorKindId" listValue="majorKindName"         
					headerKey="0" headerValue="请你选择" 	 name="majorKindId"
					id="majorKind" cssClass="SELECT_STYLE1"
					/>	
						<!--<select name="humanFile.humanMajorKindId" class="SELECT_STYLE1" id="majorKind">
							<option>销售</option>
							<option>软件开发</option>
						</select>
						-->
						<input type="hidden" name="majorKindName"/>
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
						<select name="majorId" class="SELECT_STYLE1" id="majorName">
							<option value="0">请您选择</option>
						</select>
						<input type="hidden" name="majorName"/>
					</td>
					<td class="TD_STYLE1">
						招聘人数
					</td>
					<td   class="TD_STYLE2">
						 <input type="text" name="humanAmount" id="humanAmount"  class="INPUT_STYLE2"/>
					</td>
					<td class="TD_STYLE1">
						截止日期
					</td>
					<td   class="TD_STYLE2">
						<input type="text" name="engageMajorRelease.deadline" class="INPUT_STYLE2" id="engageMajorRelease.deadline"/>
					</td>
				</tr>
				<tr>
				<td class="TD_STYLE1">
						登记人
					</td>
					<td  class="TD_STYLE2">
						 <input type="text" name="register" value="${UsersLogin.userTrueName}" class="INPUT_STYLE2"/>
					</td>
					<td class="TD_STYLE1">
						登记时间
					</td>
					<td   class="TD_STYLE2">
					
							<input type="text" name="registTime"
							  id="nowTime"
							class="INPUT_STYLE2"/>
					</td>
					
					<td>&nbsp; </td>
					<td>&nbsp; </td>
					<td>&nbsp; </td>
					<td>&nbsp; </td>
					
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位描述
					</td>
					<td class="TD_STYLE2" colspan="8">
						<textarea name="majorDescribe" rows="4" cols="80" class="TEXTAREA_STYLE1"></textarea>
					</td>
					 
				</tr>
					<tr>
					<td class="TD_STYLE1">
						招聘要求
					</td>
					<td class="TD_STYLE2" colspan="8">
						<textarea name="engageRequired" rows="4"  cols="80" class="TEXTAREA_STYLE1"></textarea>
					</td>
					 
				</tr>
			</table>
		</form>
	</body>
 
</html>


