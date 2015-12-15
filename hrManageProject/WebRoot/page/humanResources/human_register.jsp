<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html public "-//w3c//dtd html 4.01 transitional//en"
"http://www.w3.org/tr/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="/hrManageProject/css/table.css" type="text/css">
		<link rel="stylesheet"
			href="/hrManageProject/css/cwcalendar.css" type="text/css">
		<script type="text/javascript"
			src="/hrManageProject/javascript/jquery-1.7.2.js">
		</script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/jquery.messager.js">
		</script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/comm/comm.js">
		</script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/comm/select.js">
		</script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/calendar-ch.js">
		</script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/time.js">
		</script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/human_register.js">
		</script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/human_input_check.js">
		</script>
	</head>

	<body>
		<form method="post" action="humanFile!doSevaRegiste">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案登记 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="提交" class="BUTTON_STYLE1"/>
						<input type="reset" value="清除" class="BUTTON_STYLE1"/>
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=3 cellspacing=1
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
				
						<input type="hidden" name="humanFile.firstKindName"/>
					</td>
					<td width="11%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE2">
						<select name="secondKindId" class="SELECT_STYLE1" id="secondKind">
							<option value="0">请选择</option>
						</select>
						<input type="hidden" name="secondKindName"/>
					</td>
					<td width="11%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2" colspan="2">
						<select name="thirdKindId" class="SELECT_STYLE1" id="thirdKind">
							<option value="0">请选择</option>
							
						</select>
						<input type="hidden" name="thirdKindName"/>
					</td>
					<td rowspan="5" style="text-align: center;">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
						<s:select list="configMajorKinds" 
					 listKey="majorKindId" listValue="majorKindName"         
					headerKey="0" headerValue="请你选择" 	 name="humanMajorKindId"
					id="majorKind" cssClass="SELECT_STYLE1"
					/>	
						<!--<select name="humanFile.humanMajorKindId" class="SELECT_STYLE1" id="majorKind">
							<option>销售</option>
							<option>软件开发</option>
						</select>
						-->
						<input type="hidden" name="humanFile.humanMajorKindName"/>
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanMajorId" class="SELECT_STYLE1" id="majorName">
							<option value="0">请您选择</option>
						</select>
						<input type="hidden" name="humanFile.hunmaMajorName"/>
					</td>
					<td class="TD_STYLE1">
						职称
					</td>
					<td colspan="2" class="TD_STYLE2">
						<s:select list="configMajorDesignations" 
					 listKey="cmdName" listValue="cmdName"         
					headerKey="0" headerValue="请你选择" 	 name="humanProDesignation"
					 cssClass="SELECT_STYLE1"
					/>	
					
					<!--
						<select name="humanFile.humanProDesignation" class="SELECT_STYLE1">
							<option>工程师</option>
							<option>助理</option>
							<option>经理</option>
						</select>
					--></td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					
					<td class="TD_STYLE2">
					<input type="text" name="humanName"
							class="INPUT_STYLE2">
					</td>
					
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanSex" class="SELECT_STYLE1">
							<option value="男" selected="selected">
								男
							</option>
							<option value="女">
								女
							</option>
						</select>
						
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanFile.humanEmail" id="humanEmail"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanTelephone" id="humanTelephone"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						QQ
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanQq" id="humanQq"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanFile.humanMobilephone" id="humanMobilephone"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<input type="text" name="humanFile.humanAddress"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanFile.humanPostcode"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
					
				<s:select list="configPublicCharByNationalitys" 
					 listKey="attributeName" listValue="attributeName"         
					headerKey="0" headerValue="请你选择" 	 name="humanNationality"
					 cssClass="SELECT_STYLE1"
					/>	
						<!--<select name="humanFile.humanNationality" class="SELECT_STYLE1">
							<option>中国</option>
							<option>美国</option>
						</select>
					-->
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanBirthplace"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" class="TD_STYLE2">
						<input type="text" name="humanFile.humanBirthday" readonly="readonly"
							class="INPUT_STYLE2" id="birthday">
					</td>
					<td width="11%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2" width="14%">
					<s:select list="configPublicCharByRaces" 
					 listKey="attributeName" listValue="attributeName"         
					headerKey="0" headerValue="请你选择" 	 name="humanRace"
					 cssClass="SELECT_STYLE1"
					 />
						<!--<select name="humanFile.humanRace" class="SELECT_STYLE1">
							<option>汉族</option>
							<option>回族</option>
						</select>
					--></td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						宗教信仰
					</td>
					<td class="TD_STYLE2">
					
					
					<s:select list="configPublicCharByReligions" 
					 listKey="attributeName" listValue="attributeName"         
					headerKey="0" headerValue="请你选择" 	 name="humanReligion"
					 cssClass="SELECT_STYLE1"
					 />
						<!--<select name="humanFile.humanReligion" class="SELECT_STYLE1">
							<option>无</option>
							<option>佛教</option>
						</select>
					--></td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2">
					<s:select list="configPublicCharByPartys" 
					 listKey="attributeName" listValue="attributeName"         
					headerKey="0" headerValue="请你选择" 	 name="humanParty"
					 cssClass="SELECT_STYLE1"
					 />
						<!--<select name="humanFile.humanParty" class="SELECT_STYLE1">
							<option>群众</option>
							<option>党员</option>
						</select>
					-->
					
					</td>
					<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanIdCard" id="humanIdCard"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						社会保障号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanSocietySecurityId"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanAge" id="humanAge"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
					<s:select list="configPublicCharByEducatedDegrees" 
					 listKey="attributeName" listValue="attributeName"         
					headerKey="0" headerValue="请你选择" 	 name="humanEducatedDegree"
					 cssClass="SELECT_STYLE1"
					 />
						<!--<select name="humanFile.humanEducatedDegree" class="SELECT_STYLE1">
							<option>高中</option>
							<option>本科</option>
							<option>大专</option>
						</select>
					-->
					</td>
					<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
					
						<s:select list="configPublicCharByEducatedYearss" 
					 listKey="attributeName" listValue="attributeName"         
					headerKey="0" headerValue="请你选择" 	 name="humanEducatedYears"
					 cssClass="SELECT_STYLE1"
					 />
					
						<!--<select name="humanFile.humanEducatedYears" class="SELECT_STYLE1">
							<option>12</option>
							<option>16</option>
						</select>
					-->
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
					
						<s:select list="configPublicCharByEducatedMajors" 
					 listKey="attributeName" listValue="attributeName"         
					headerKey="0" headerValue="请你选择" 	 name="humanEducatedMajor"
					 cssClass="SELECT_STYLE1"
					 />
						<!--<select name="humanFile.humanEducatedMajor" class="SELECT_STYLE1">
							<option>生物工程</option>
							<option>计算机</option>
						</select>
					--></td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						薪酬标准
					</td>
					<td class="TD_STYLE2">
					
					
						<s:select list="salaryStandards" 
					 listKey="standardId" listValue="standardName"         
					headerKey="0" headerValue="请你选择" 	 name="salaryStandardId"
					 cssClass="SELECT_STYLE1"
					 />
						<!--<select name="humanFile.salaryStandardId" class="SELECT_STYLE1">
							<option>薪酬标准1</option>
							<option>薪酬标准2</option>
						</select>
					--></td>
					<td class="TD_STYLE1">
						开户行
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanBank"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						帐号
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanAccount"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						登记人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="register" value="${UsersLogin.userTrueName}"
							readonly="readonly" class="INPUT_STYLE2">
							
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						建档时间
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="registTime" id="create_time" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
					<s:select list="configPublicCharBySpecialitys" 
					 listKey="attributeName" listValue="attributeName"         
					headerKey="0" headerValue="请你选择" 	 name="humanSpeciality"
					 cssClass="SELECT_STYLE1"
					 />
					<!--
						<select name="humanFile.humanSpeciality" class="SELECT_STYLE1">
							<option>java</option>
							<option>数据库</option>
						</select>
					--></td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2">
					<s:select list="configPublicCharByHobbys" 
					 listKey="attributeName" listValue="attributeName"         
					headerKey="0" headerValue="请你选择" 	 name="humanHobby"
					 cssClass="SELECT_STYLE1"
					 />
						<!--<select name="humanFile.humanHobby" class="SELECT_STYLE1">
							<option>篮球</option>
							<option>跳舞</option>
						</select>
					--></td>
					<td class="TD_STYLE1">
						&nbsp;
					</td>
					<td class="TD_STYLE2">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						个人履历
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanHistroyRecords" rows="4"
							class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						家庭关系信息
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanFamilyMembership" rows="4"
							class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="remark" rows="4" class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>

