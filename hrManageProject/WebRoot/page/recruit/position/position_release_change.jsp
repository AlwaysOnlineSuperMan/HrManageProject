<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
  <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My JSP 'position-change.jsp' starting page</title>
    
	 <link rel="stylesheet"
			href="/hrManageProject/css/table.css" type="text/css">
		<link rel="stylesheet"
			href="/hrManageProject/css/cwcalendar.css" type="text/css">
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
		</script>
	   <script type="text/javascript"
			src="/hrManageProject/javascript/select.js">
		</script>
			<script type="text/javascript"
			src="/hrManageProject/javascript/comm/time.js">
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
 	   function mySubmit(){  
  	document.humanfileForm.submit();
 	}
  
 	
 	</script>
</head>
	<body>
		<form id="recruitAction!applyPosition" name="humanfileForm" action="/HR_Fist/recruit/recruitAction!applyPosition" method="post">
		
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--职位发布管理--职位发布变更 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="提交" class="BUTTON_STYLE1"
							onclick="mySubmit()">
						<input type="reset" value="清除" class="BUTTON_STYLE1">
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
					<input type="hidden" name ="emajorRelease.firstKindName" value="&#38598;&#22242;"/>
					<input type="hidden" name="emajorRelease.firstKindId" value="01"/>
					&#38598;&#22242;
					
					</td>
					<td width="11%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE2">
					<input type="hidden" name="emajorRelease.secondKindName" value="&#29983;&#29289;&#31185;&#25216;&#26377;&#38480;&#20844;&#21496;"/>
					<input type="hidden" name="emajorRelease.secondKindId" value="02"/>
					&#29983;&#29289;&#31185;&#25216;&#26377;&#38480;&#20844;&#21496;
					</td>
					<td width="11%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2"  >
					<input type="hidden" name="emajorRelease.thirdKindName" value="&#33647;&#24215;"/>
					<input type="hidden" name="emajorRelease.thirdKindId" value="01"/>
						&#33647;&#24215;
					</td>
					<td width="11%" class="TD_STYLE1">
						招聘类型
					</td>
					<td class="TD_STYLE2" colspan="2">
					 
				 	<select name="emajorRelease.engageType" id="engageType" class="SELECT_STYLE1">  
							 
							<option value="校园招聘" selected>校园招聘</option>  
							 
							<option value="社会招聘" selected>社会招聘</option>  
							
					 </select>
				 	</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
					<input type="hidden" name="emajorRelease.majorKindName" value="&#38144;&#21806;"/>
					<input type="hidden" name="emajorRelease.majorKindId" value="01"/>
						&#38144;&#21806;
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
					<input type="hidden" name="emajorRelease.majorName" value="&#24635;&#32463;&#29702;"/> 
					<input type="hidden" name="emajorRelease.majorId" value="02"/>
						&#24635;&#32463;&#29702;
					</td>
					<td class="TD_STYLE1">
						招聘人数
					</td>
					<td   class="TD_STYLE2">
						 <input type="text" name="emajorRelease.humanAmount" value="2" class="INPUT_STYLE2">
						</td>
					<td class="TD_STYLE1">
						截止日期
					</td>
					<td   class="TD_STYLE2"> 
						<input type="text" name="emajorRelease.deadline" 
							  class="INPUT_STYLE2"  onclick="aa('emajorRelease.deadline')" value="2012-11-15">
						   </td>
				</tr>
				<tr>
				<td class="TD_STYLE1">
						变更人
					</td>
					<td  class="TD_STYLE2">
						 <input type="text" name="emajorRelease.changer" value="zhangsan" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						变更时间
					</td>
					<td   class="TD_STYLE2">
						 <input type="text" name="emajorRelease.changeTime"
							value="12-11-18 19:26:58.000" id="nowTime"  
							class="INPUT_STYLE2">
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
						<textarea name="emajorRelease.majorDescribe" rows="4" cols="100%" class="TEXTAREA_STYLE1"  >&#19982;&#26102;&#20465;&#36827;</textarea>
					</td>
					 
				</tr>
					<tr>
					<td class="TD_STYLE1">
						招聘要求
					</td>
					<td class="TD_STYLE2" colspan="8">
						<textarea name="emajorRelease.engageRequired" rows="4"  cols="100%" class="TEXTAREA_STYLE1"   >&#20570;&#20107;&#32454;&#24515;</textarea>
					</td>
					 
				</tr>
			</table>
		</form>




	</body>
 
</html>


