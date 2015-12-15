<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
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

		<form method="post" action="humanFile!doRecoveryInformationList.action">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案恢复 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="恢复" class="BUTTON_STYLE1"/>
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
					<s:property  value="humanFile.humanId"></s:property > 
					<s:hidden name="humanFile.humanId"></s:hidden>
					</td>
					<td rowspan="6" width="13%" style="text-align: center;">
						<img src="/hrManageProject/images/regular.jpg"  style="width:120px;height:150px;"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1" width="10%">
						I级机构
					</td>
					<td width="13%" class="TD_STYLE2">
						<s:property  value="humanFile.firstKindName"></s:property  >
					</td>
					<td width="10%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="13%" class="TD_STYLE2">
						<s:property  value="humanFile.secondKindName"></s:property >
					</td>
					<td width="10%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2" colspan="2" width="2%">
						<s:property  value="humanFile.thirdKindName"></s:property >
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
					<s:property  value="humanFile.humanMajorKindName"></s:property >
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.hunmaMajorName"></s:property >
					</td>
					<td class="TD_STYLE1">
						职称
					</td>
					<td colspan="2" class="TD_STYLE2">
						<s:property  value="humanFile.humanProDesignation"></s:property >
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanName"></s:property >
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanSex"></s:property >
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<s:property  value="humanFile.humanEmail"></s:property >
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						电话
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanTelephone"></s:property >
					</td>
					<td class="TD_STYLE1">
						QQ
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanQq"></s:property >
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<s:property  value="humanFile.humanMobilephone"></s:property >
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<s:property  value="humanFile.humanAddress"></s:property >
					</td>
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<s:property  value="humanFile.humanPostcode"></s:property >
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanNationality"></s:property >
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanBirthplace"></s:property >
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" class="TD_STYLE2">
						<s:property  value="humanFile.humanBirthday"></s:property >
					</td>
					<td width="10%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanRace"></s:property >
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						宗教信仰
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanReligion"></s:property >
					</td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanParty"></s:property >
					</td>
					<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanIdCard"></s:property >
					</td>
					<td class="TD_STYLE1">
						社会保障号码
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanSocietySecurityId"></s:property >
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanAge"></s:property >
					</td>
					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanEducatedDegree"></s:property >
					</td>
					<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanEducatedYears"></s:property >
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
							<s:property  value="humanFile.humanEducatedDegree"></s:property >
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						薪酬标准
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.salaryStandardId"></s:property >
					</td>
					<td class="TD_STYLE1">
						开户行
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanBank"></s:property >
					</td>
					<td class="TD_STYLE1">
						帐号
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanAccount"></s:property >
					</td>
					<td class="TD_STYLE1">
						复核人
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.register"></s:property >
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						复核时间
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.registTime"></s:property >
					</td>
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanSpeciality"></s:property >
					</td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2">
						<s:property  value="humanFile.humanHobby"></s:property >
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
						<a href="javascript:winopenm('query.jsp?filename=')">a.doc</a>
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
		</form>
	</body>
</html>
