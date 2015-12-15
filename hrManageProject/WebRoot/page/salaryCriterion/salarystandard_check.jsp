<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="/hrManageProject/css/table.css" type="text/css" />
		<title>无标题文档</title>
	 
	</head>

	<body>
		 
		<s:form method="post" action="SalaryStandard!updateStandard.action" > 
		
		<input type="hidden" name="ssdId" value="1259">
		
			<table width="100%">
				<tr>
					<td>
						<font color="#0000CC">您正在做的业务是:人力资源管理--薪酬标准管理--薪酬标准登记复核</font>
					</td>
				</tr>
				<tr>
					<td>
						<div align="right">
							<input type="button" value="复核通过" class="BUTTON_STYLE1" onclick="check();">
							<input type="button" value="返回" onclick="history.back();" class="BUTTON_STYLE1">
						</div>
					</td>
				</tr>
			</table> 
			 
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight='#848284' bordercolordark='#eeeeee'
				class="TABLE_STYLE1">
				<tr>
					<td width="12%" class="TD_STYLE1">
						薪酬编号
					</td>
					<td width="15%" class="TD_STYLE2">
							<s:property value="salaryStandardWithBLOBs.standardId" />
							<s:hidden name="salaryStandardWithBLOBs.standardId" value="%{salaryStandardWithBLOBs.standardId}"></s:hidden>
					</td>
				
					<td width="12%" class="TD_STYLE1">
						薪酬标准名称
					</td>
					<td width="11%" class="TD_STYLE2">
						<s:textfield name="salaryStandardWithBLOBs.standardName" id="standardName"  cssClass="INPUT_STYLE2"></s:textfield>
					 
					</td>
					<td width="11%" class="TD_STYLE1">
						薪酬总额
					</td>
					<td width="17%" class="TD_STYLE2">
						<s:textfield name="salaryStandardWithBLOBs.salarySum" id="sumSalary"  cssClass="INPUT_STYLE2"></s:textfield> 
					 </td>
					<td width="12%" class="TD_STYLE1">
						&nbsp;
					</td>
					<td width="10%" class="TD_STYLE2">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						制定人
					</td>
					<td class="TD_STYLE2">
							<s:textfield name="salaryStandardWithBLOBs.designer" id="designer"  cssClass="INPUT_STYLE2"></s:textfield>
					</td>
					<td class="TD_STYLE1">
						复核人
					</td>
					<td class="TD_STYLE2">
						<s:textfield name="salaryStandardWithBLOBs.checker" value="%{#session.UsersLogin.userTrueName}"  id="checker"  cssClass="INPUT_STYLE2"></s:textfield>
					</td>
					<td class="TD_STYLE1">
						复核时间
					</td>
					<td class="TD_STYLE2">
						<s:textfield name="salaryStandardWithBLOBs.checkTime" id="Tdate"  cssClass="INPUT_STYLE2"></s:textfield>
					</td>
					<td class="TD_STYLE1">
						&nbsp;
					</td>
					<td class="TD_STYLE2">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						复核意见 
					</td>
					<td colspan="7" class="TD_STYLE2">
					<s:textarea name="salaryStandardWithBLOBs.checkComment" id="checkComment"  cssClass="INPUT_STYLE2"></s:textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						序号
					</td>
					<td colspan="3" class="TD_STYLE1">
						薪酬项目名称
					</td>
					<td colspan="4" class="TD_STYLE1">
						金额
					</td>
				</tr>
			<s:iterator var="salaryStandard" value="salaryStandardDetails" status="vs">
				<tr class="TD_STYLE2">
						<td align="center">
							<s:property value="itemId"/>
							<s:hidden  name="%{'itemId'+#vs.count}" value="%{itemId}"></s:hidden>
						</td>
						
						<td colspan="3">
							<s:property value="itemName"/>
							<s:hidden  name="%{'itemName'+#vs.count}" value="%{itemName}"></s:hidden>
						</td>
						
						<td>
							<s:textfield id="%{'salary'+#vs.count}" value="%{salary}" name="%{'salary'+#vs.count}" 
								onkeyup="countMoney('%{salaryStandardDetails.size()}' ,'%{'salary'+#vs.count}')" class="INPUT_STYLE2">
							</s:textfield>
						</td> 
						<td colspan="3">
							&nbsp;
						</td>
					</tr>
		</s:iterator>
			</table>
		</s:form>
		<script type="text/javascript">
		function check(){
				
				var designer=document.getElementById("designer");
				var standardName=document.getElementById("standardName");
				if(designer.value.length<=0){
				alert("制定人不可为空!!!");
						return ;
				}
				if(standardName.value.length<=0){
				alert("薪酬标准名称不可为空!!!");
					return ;
				}
			document.forms[0].submit();
		}
		function countMoney(obj,o) {
		
		if (isNaN(document.getElementById(o).value) || document.getElementById(o).value < 0) {
		alert("金额填写错误!");
		document.getElementById(o).value="0.00";
		return;
	}
		var sum=0;
	 	for(var i=1;i<=obj;i++){
	 		var salary=document.getElementById("salary"+i).value;
	 		if(salary==""){
	 		salary="0.00";
	 		}
	 		sum=Number(sum)+Number(salary);
	 		 
	 }
	 document.getElementById("sumSalary").value=sum;
	 
}
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
 				window.onload=time;
 				var out=window.setInterval(time, 1000);
		</script>
	</body>
</html>

