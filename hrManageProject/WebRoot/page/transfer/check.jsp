<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
	<head>		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="/hrManageProject/css/table.css"
			type="text/css"></link>
		 
	<script type="text/javascript" src="../../javascript/jquery-1.7.2.js"></script>
	</head>
<body>
		<form method="post" action="check_success.jsp">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是:人力资源--调动管理--调动审核</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="radio" name="majorChange.checkStatus" value="true">通过
						<input type="radio" name="majorChange.checkStatus" value="false">不通过
						<input type="button" value="确认" class="BUTTON_STYLE1" onclick="check()">
						<input type="button" class="BUTTON_STYLE1" onclick="javascript:window.history.back();" value="返回">
					<SCRIPT type="text/javascript">
					function check(){
						var rs=document.getElementsByName("majorChange.checkStatus");
						 if(rs[0].checked==false&&rs[1].checked==false){
						 alert("请选择通过或者不通过！");
						 }else{
						 function mySubmit(){
						if(document.getElementById("firstKindId").value=='0'){
							alert("请选择新一级结构！");
								return ;
						}
						if(document.getElementById("newMajorKindId").value=='0'){
							alert("请选择新职位分类！");
								return ;
						}
						if(document.getElementById("newMajorId").value=='0'){
							alert("请选择新职位名称！");
								return ;
						}
						if(document.getElementById("newSalaryStandardId").value=='0'){
							alert("请选择新薪酬标准！");
								return ;
						}
						
						document.forms[0].submit();
			
						}
						 	document.forms[0].submit();
						 }
					}
					</SCRIPT>
					</td>
				</tr>
			</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr height="21">
					<td class="TD_STYLE1" width="8%">
						档案编号
					</td>
					<td class="TD_STYLE2" width="10%">
						<input type="text" name="majorChange.humanId" readonly="readonly"
							value="${majorchange.humanId}" class="INPUT_STYLE2">
							
					</td>
					<td class="TD_STYLE1" width="8%">
						姓名
					</td>
					<td class="TD_STYLE2" width="10%">
						<input type="text" name="majorChange.humanName"
							value="${majorchange.humanName}" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1" width="8%">
					</td>
					<td class="TD_STYLE2" width="10%">
					</td>
					<td class="TD_STYLE1" width="8%">
					</td>
					<td class="TD_STYLE2" width="10%">
					</td>
				</tr>
				<tr>
				
					<td class="TD_STYLE1" width="8%">
						原一级机构
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorChange.firstKindName"
							value="${majorchange.firstKindName}" readonly="readonly" value=""
							class="INPUT_STYLE2">
					<input type="hidden" name="majorChange.firstKindId" value="1353318953319">
					</td>
					<td class="TD_STYLE1" width="8%">
						原二级机构
					</td>
					<td class="TD_STYLE2" width="10%">
						<input type="text" name="majorChange.secondKindName"
							value="${majorchange.secondKindName}" readonly="readonly" value=""
							class="INPUT_STYLE2">
							<input type="hidden" name="majorChange.secondKindId" value="1353318979558">
					</td>
					<td class="TD_STYLE1" width="8%">
						原三级机构
					</td>
					<td class="TD_STYLE2" width="10%">
						<input type="text" name="majorChange.thirdKindName"
							value="${majorchange.thirdKindName}" readonly="readonly" value=""
							class="INPUT_STYLE2">
							<input type="hidden" name="majorChange.thirdKindId" value="1353319077370">
					</td>
					<td class="TD_STYLE1" width="8%">
					</td>
					<td class="TD_STYLE2" width="10%">
					</td>
				</tr>

				<tr>
					<td class="TD_STYLE1">
						原职位分类
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorChange.majorKindName"
							value="${majorchange.majorName}" readonly="readonly"
							value="" class="INPUT_STYLE2">
						<input type="hidden" name="majorChange.majorKindId" value="02">
					</td>
					<td class="TD_STYLE1" width="12%">
						原职位名称
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorChange.majorName"
							value="${majorchange.majorKindName}" readonly="readonly" 
							class="INPUT_STYLE2">
						<input type="hidden" name="majorChange.majorId" value="02">
					</td>
					<td class="TD_STYLE1">
						原薪酬标准
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorChange.salaryStandardName"
							value="${majorchange.salaryStandardName}"
							readonly="readonly"   class="INPUT_STYLE2">
							<input type="hidden" name="majorChange.salaryStandardId" value="1353320082662">
					</td>
					<td class="TD_STYLE1">
						原薪酬总额
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorChange.salarySum"
							value="${majorchange.salarySum}" readonly="readonly"
							  class="INPUT_STYLE2">
					</td>
					 
				</tr>
				<tr>
					<td class="TD_STYLE1">
						新一级机构名称
					</td>
					<td class="TD_STYLE2">
						
   
   			<input type="text" name="majorChange.majorKindName"
							value="${majorchange.newFirstKindName}" readonly="readonly"
							value="" class="INPUT_STYLE2">
		<input type="hidden" name="majorchange.newFirstKindId" value="${majorchange.newFirstKindId}" id="newFirstKindName">
					</td>
					<td class="TD_STYLE1" width="12%">
						新二级机构名称
					</td>
					<td class="TD_STYLE2">
				<input type="text" name="majorChange.majorKindName"
							value="${majorchange.newSecondKindName}" readonly="readonly"
							value="" class="INPUT_STYLE2">		
  
					  <input type="hidden" name="majorChange.newSecondKindName" value="${majorchange.newSecondKindId}" id="newSecondKindName">
					</td>
					<td class="TD_STYLE1" width="12%">
						新三级机构名称
					</td>
					<td class="TD_STYLE2">
						 <input type="text" name="majorChange.majorKindName"
							value="${majorchange.newThirdKindName}" readonly="readonly"
							value="" class="INPUT_STYLE2">		
  
					   <input type="hidden" name="majorChange.newThirdKindName" value="${majorchange.newThirdKindId}" id="newThirdKindName">
					</td>
					<td class="TD_STYLE1" width="8%">
					</td>
					<td class="TD_STYLE2" width="10%">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						新职位分类
					</td>
					<td class="TD_STYLE2">
						 <input type="text" name="majorChange.majorKindName"
							value="${majorchange.newMajorKindName}" readonly="readonly"
							value="" class="INPUT_STYLE2">	
					  <input type="hidden" name="majorChange.newMajorKindName"  value="${majorchange.newMajorKindId}" id="newMajorKindName">
					</td>
					<td class="TD_STYLE1" width="12%">
						新职位名称
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorChange.majorKindName"
							value="${majorchange.newMajorName}" readonly="readonly"
							value="" class="INPUT_STYLE2">	
						 <input type="hidden" name="majorChange.newMajorName" value="${majorchange.newMajorId}"  id="newMajorName">
					</td>
					<td class="TD_STYLE1">
						新薪酬标准
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorChange.majorKindName"
							value="${majorchange.newSalaryStandardName}" readonly="readonly"
							value="" class="INPUT_STYLE2">	
					  <input type="hidden" name="majorChange.newSalaryStandardName" value="${majorchange.newSalaryStandardId}"  id="newSalaryStandardName">
					  
					</td>
					<td class="TD_STYLE1">
						新薪酬总额
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorChange.newSalarySum" id="newSalarySum" readonly="readonly"
							value="${majorchange.newSalarySum}" class="INPUT_STYLE2">
					</td>
				</tr>

				<tr>
 
					<td class="TD_STYLE1">
						登记人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorChange.register" readonly="readonly" value="${majorchange.register}" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						登记时间
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorChange.registTime" readonly="readonly" value="${majorchange.registTime}" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						复核人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="majorChange.checker" readonly="readonly" value="${majorchange.checker}" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						复核时间
					</td>
					<td class="TD_STYLE2">	
						<input type="text" name="checkTime" id="Tdate" value="${majorchange.checkTime}" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						调动原因
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="majorChange.changeReason" rows="6" readonly="readonly" class="TEXTAREA_STYLE1">
						${majorchange.changeReason}
						</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						复合通过意见
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="majorChange.checkReason" rows="6" class="TEXTAREA_STYLE1">
							${majorchange.checkReason}
						</textarea>
					</td>
				</tr>

					<SCRIPT type="text/javascript">
					function time(){
 					var tdate=document.getElementById("Tdate");					 
 					var d=new Date();
 					var y=d.getFullYear();
 					var moth=d.getMonth()+1;
 					var date=d.getDate();
 					var h=d.getHours();
 					var m=d.getMinutes();
 					var s=d.getSeconds();
					var hh=20-1-h;
					var mm=60-1-m;
					var ss=60-s;
					if(hh>0){
							mm=mm+60*hh;
					}
 					if(moth<10){
 							moth="0"+moth;
 					}
 					if(date<10){
 							date="0"+date;
 					}
 					if(h<10){
 							h="0"+h;
 					}
 					if(m<10){
 							m="0"+m;
 					}
 					if(s<10){
 							s="0"+s;
 					}
 					if(mm<10){
 							mm="0"+mm;
 					}
 					if(ss<10){
 							ss="0"+ss;
 					}	
 					 
 					tdate.value=y+"-"+moth+"-"+date+" "+h+":"+m+":"+s;
					  
 				}
 				 function load(){
 				 
 				  document.getElementById("firstKindId").value='1353318953319';
 				  document.getElementById("newMajorKindId").value='02';
 				  document.getElementById("secondKindId").value='0';
 				  document.getElementById("thirdKindId").value='0';
 				  document.getElementById("newMajorId").value='01';
 				  document.getElementById("newSalaryStandardId").value='1353320082662';
 				 time();
 				 }
				window.onload=load;
 				var out=window.setInterval(time, 1000);
 			 
					</SCRIPT>
			</table>
		</form>
	</body>
</html>


