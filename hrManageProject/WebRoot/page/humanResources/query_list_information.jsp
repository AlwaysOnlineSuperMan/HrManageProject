<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
﻿<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html public "-//w3c//dtd html 4.01 transitional//en"
"http://www.w3.org/tr/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="/hrManageProject/css/table.css" type="text/css">
		<script type="text/javascript"
			src="/hrManageProject/javascript/comm/comm.js">
		</script>
		<script language="javascript"
			src="/hrManageProject/javascript/winopen/winopenm.js">
		</script>
	</head>
	<body>

		<form name="humanfileForm" method="post" action="/hr/humanfile.do">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案查看 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back()">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=3 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="10%">
						档案编号
					</td>
					<td colspan="6" class="TD_STYLE2">
					
					<s:label name="humanFile.humanId"></s:label>
					</td>
					<td rowspan="6" width="13%" style="text-align: center;">
						<s:if test="humanFile.humanPicture!= null">
							<img src="${humanFile.humanPicture}"  style="width:120px;height:150px;"/>
						</s:if>
						<s:else>
						没有上传图片
						</s:else>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1" width="10%">
						I级机构
					</td>
					<td width="13%" class="TD_STYLE2">
						<s:label name="humanFile.firstKindName"></s:label>
					</td>
					<td width="10%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="13%" class="TD_STYLE2">
						<s:label name="humanFile.secondKindName"></s:label>
					</td>
					<td width="10%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2" colspan="2" width="2%">
						<s:label name="humanFile.thirdKindName"></s:label>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
					<s:label name="humanFile.humanMajorKindName"></s:label>
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.hunmaMajorName"></s:label>
					</td>
					<td class="TD_STYLE1">
						职称
					</td>
					<td colspan="2" class="TD_STYLE2">
						<s:label name="humanFile.humanProDesignation"></s:label>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanName"></s:label>
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanSex"></s:label>
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<s:label name="humanFile.humanEmail"></s:label>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						电话
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanTelephone"></s:label>
					</td>
					<td class="TD_STYLE1">
						QQ
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanQq"></s:label>
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<s:label name="humanFile.humanMobilephone"></s:label>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<s:label name="humanFile.humanAddress"></s:label>
					</td>
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<s:label name="humanFile.humanPostcode"></s:label>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanNationality"></s:label>
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanBirthplace"></s:label>
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" class="TD_STYLE2">
						<s:label name="humanFile.humanBirthday"></s:label>
					</td>
					<td width="10%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanRace"></s:label>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						宗教信仰
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanReligion"></s:label>
					</td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanParty"></s:label>
					</td>
					<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanIdCard"></s:label>
					</td>
					<td class="TD_STYLE1">
						社会保障号码
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanSocietySecurityId"></s:label>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanAge"></s:label>
					</td>
					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanEducatedDegree"></s:label>
					</td>
					<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanEducatedYears"></s:label>
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
							<s:label name="humanFile.humanEducatedDegree"></s:label>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						薪酬标准
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.salaryStandardId"></s:label>
					</td>
					<td class="TD_STYLE1">
						开户行
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanBank"></s:label>
					</td>
					<td class="TD_STYLE1">
						帐号
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanAccount"></s:label>
					</td>
					<td class="TD_STYLE1">
						复核人
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.register"></s:label>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						复核时间
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.registTime"></s:label>
					</td>
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanSpeciality"></s:label>
					</td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2">
						<s:label name="humanFile.humanHobby"></s:label>
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
						档案附件
					</td>
					<td colspan="7" class="TD_STYLE2">
						<!--<a href="javascript:winopenm('query.jsp?filename=')">a.doc</a>
					-->
					<s:a href="/hrManageProject/%{humanFile.attachmentName}">预览附件</s:a>
					<s:a href="%{'downLoad.action?fileName='+humanFile.attachmentName}">下载附件</s:a>
					</td> 
				</tr>
				<tr>
					<td class="TD_STYLE1">
						个人履历
					</td>
					<td colspan="7" class="TD_STYLE2">
							<s:textarea name="humanFile.humanHistroyRecords" rows="4"  cssClass="TEXTAREA_STYLE1" readonly="true"></s:textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						家庭关系信息
					</td>
					<td colspan="7" class="TD_STYLE2">
					
							<s:textarea name="humanFile.humanFamilyMembership" rows="4"  cssClass="TEXTAREA_STYLE1" readonly="true"></s:textarea>
							
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<s:textarea name="humanFile.remark" rows="4"  cssClass="TEXTAREA_STYLE1" readonly="true"></s:textarea>
					</td>
				</tr>
			</table>
			<s:debug></s:debug>
		</form>
	</body>
</html>
