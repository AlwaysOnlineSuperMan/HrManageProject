<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html public "-//w3c//dtd html 4.01 transitional//en"
"http://www.w3.org/tr/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="/hrManageProject/css/table.css" type="text/css" />
		<link rel="stylesheet"
			href="/hrManageProject/css/cwcalendar.css" type="text/css">
		<script type="text/javascript" src="/hrManageProject/javascript/comm/comm.js">
		</script>
		<script language="javascript"
			src="/hrManageProject/javascript/winopen/winopenm.js">
		</script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/calendar-ch.js">
		</script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/jquery-1.7.2.js">
		</script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/jquery.messager.js">
		</script>
		<script src="/hrManageProject/javascript/time.js"></script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/human_check.js">
		</script>
		<script type="text/javascript"
			src="/hrManageProject/javascript/human_input_check.js">
		</script>
	</head>
	<body>

		<form action="humanFile!doChangeListIformation.action" method="post" enctype="multipart/form-data">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案变更 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="确认变更" class="BUTTON_STYLE1"/>
						<input type="reset" value="清除" class="BUTTON_STYLE1">
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
						
							<s:textfield name="humanFile.humanId" readonly="true" ></s:textfield>
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
					<td class="TD_STYLE1" width="11%">
						I级机构
					</td>
					<td width="14%" class="TD_STYLE2">
					<!--<s:label name="humanFile.firstKindName"></s:label>
					--><s:hidden name="humanFile.firstKindId"></s:hidden>
					<s:textfield name="humanFile.firstKindName" readonly="true"></s:textfield>
					
					</td>
					<td width="11%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE2"><!--
					<s:label name="humanFile.secondKindName"></s:label>
					--><s:textfield name="humanFile.secondKindName" readonly="true"></s:textfield>
					<s:hidden name="humanFile.secondKindId"></s:hidden>
					
					</td>
					<td width="11%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2" colspan="2">
						<!--<s:label name="humanFile.thirdKindName"></s:label>
											--><s:textfield name="humanFile.thirdKindName" readonly="true"></s:textfield>
						
					<s:hidden name="humanFile.thirdKindId"></s:hidden>
				
					</td>
					<td rowspan="5" style="text-align: center;">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
					
						<!--<s:label name="humanFile.humanMajorKindName"></s:label>
						
						--><s:textfield name="humanFile.humanMajorKindName" readonly="true"></s:textfield>
					<s:hidden name="humanFile.humanMajorKindId"></s:hidden>
					
					
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2"><!--
						<s:label name="humanFile.hunmaMajorName"></s:label>
						--><s:textfield name="humanFile.hunmaMajorName" readonly="true"></s:textfield>
					<s:hidden name="humanFile.humanMajorId"></s:hidden>
					
					</td>
					
					
					
					
					
					<td class="TD_STYLE1">
						职称
					</td>
					<td colspan="2" class="TD_STYLE2">
						<s:select list="configMajorDesignations" 
					 listKey="cmdName" listValue="cmdName"         
					headerKey="0" headerValue="请你选择" 	 name="humanFile.humanProDesignation"
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
						<s:textfield name="humanFile.humanName" cssClass="INPUT_STYLE2"></s:textfield>
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
						<!--<input type="text" name="humanFile.humanEmail" id="humanEmail"
							class="INPUT_STYLE2">
							-->
							<s:textfield name="humanFile.humanEmail" cssClass="INPUT_STYLE2" id="humanEmail" ></s:textfield>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						电话
					</td>
					<td class="TD_STYLE2">
						<!--<input type="text" name="humanFile.humanTelephone" id="humanTelephone"
							class="INPUT_STYLE2">
							--><s:textfield name="humanFile.humanTelephone" cssClass="INPUT_STYLE2" id="humanTelephone" ></s:textfield>
					</td>
					<td class="TD_STYLE1">
						QQ
					</td>
					<td class="TD_STYLE2">
						<!--<input type="text" name="humanFile.humanQq" id="humanQq"
							class="INPUT_STYLE2">
					-->
					
					<s:textfield name="humanFile.humanQq" cssClass="INPUT_STYLE2" id="humanQq" ></s:textfield>
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<!--<input type="text" name="humanFile.humanMobilephone" id="humanMobilephone"
							class="INPUT_STYLE2">
					-->
					<s:textfield name="humanFile.humanMobilephone" cssClass="INPUT_STYLE2" id="humanMobilephone" ></s:textfield>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<!--<input type="text" name="humanFile.humanAddress"
							class="INPUT_STYLE2">
							-->
							<s:textfield name="humanFile.humanAddress" cssClass="INPUT_STYLE2"  ></s:textfield>
					</td>
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<!--<input type="text" name="humanFile.humanPostcode"
							class="INPUT_STYLE2">
								-->
						<s:textfield name="humanFile.humanPostcode" cssClass="INPUT_STYLE2"  ></s:textfield>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
					
				<s:select list="configPublicCharByNationalitys" 
					 listKey="attributeName" listValue="attributeName"         
					headerKey="0" headerValue="请你选择" 	 name="humanFile.humanNationality"
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
					<td class="TD_STYLE2"><!--
						<input type="text" name="humanFile.humanBirthplace"
							class="INPUT_STYLE2">
							--><s:textfield name="humanFile.humanBirthplace" cssClass="INPUT_STYLE2"  ></s:textfield>
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" class="TD_STYLE2">
						<!--<input type="text" name="humanFile.humanBirthday" readonly="readonly"
							class="INPUT_STYLE2" id="birthday">
							-->
							<s:textfield name="humanFile.humanBirthday" cssClass="INPUT_STYLE2" id="birthday" readonly="readonly"></s:textfield>
					</td>
					<td width="11%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2" width="14%">
					<s:select list="configPublicCharByRaces" 
					 listKey="attributeName" listValue="attributeName"         
					headerKey="0" headerValue="请你选择" 	 name="humanFile.humanRace"
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
					headerKey="0" headerValue="请你选择" 	 name="humanFile.humanReligion"
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
					headerKey="0" headerValue="请你选择" 	 name="humanFile.humanParty"
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
						<!--<input type="text" name="humanFile.humanIdCard" id="humanIdCard"
							class="INPUT_STYLE2">
							-->
							<s:textfield name="humanFile.humanIdCard" cssClass="INPUT_STYLE2" ></s:textfield>
					</td>
					<td class="TD_STYLE1">
						社会保障号码
					</td>
					<td class="TD_STYLE2">
						<!--<input type="text" name="humanFile.humanSocietySecurityId"
							class="INPUT_STYLE2">
							--><s:textfield name="humanFile.humanSocietySecurityId" cssClass="INPUT_STYLE2" ></s:textfield>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<!--<input type="text" name="humanFile.humanAge" id="humanAge"
							class="INPUT_STYLE2">
					-->
					<s:textfield name="humanFile.humanAge" cssClass="INPUT_STYLE2" id="humanAge" ></s:textfield>
					</td>
					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
					<s:select list="configPublicCharByEducatedDegrees" 
					 listKey="attributeName" listValue="attributeName"         
					headerKey="0" headerValue="请你选择" 	 name="humanFile.humanEducatedDegree"
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
					headerKey="0" headerValue="请你选择" 	 name="humanFile.humanEducatedYears"
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
					headerKey="0" headerValue="请你选择" 	 name="humanFile.humanEducatedMajor"
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
					headerKey="0" headerValue="请你选择" 	 name="humanFile.salaryStandardId"
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
						<!--<input type="text" name="humanBank"
							class="INPUT_STYLE2">
					-->
					<s:textfield name="humanFile.humanBank" cssClass="INPUT_STYLE2"  ></s:textfield>
					</td>
					<td class="TD_STYLE1">
						帐号
					</td>
					<td class="TD_STYLE2"><!--
						<input type="text" name="humanAccount"
							class="INPUT_STYLE2">
					-->
					<s:textfield name="humanFile.humanAccount" cssClass="INPUT_STYLE2"  ></s:textfield>
					</td>
					
					
					<td class="TD_STYLE1">
						复核人
					</td>
					<td class="TD_STYLE2">
						<s:textfield name="humanFile.checker"  value="%{#session.UsersLogin.userTrueName}" cssClass="INPUT_STYLE2" readonly="true" ></s:textfield>
						<s:hidden name="register"  value="%{#session.UsersLogin.userTrueName}" cssClass="INPUT_STYLE2"  ></s:hidden>
					</td>
				</tr>
				<tr>
				<td class="TD_STYLE1">
						变更时间
					</td>
					<td class="TD_STYLE2">
					
							<s:textfield name="humanFile.checkTime" cssClass="INPUT_STYLE2"  readonly="true" id="create_time" ></s:textfield>
							<s:hidden name="humanFile.registTime" cssClass="INPUT_STYLE2"    ></s:hidden>
					</td>
					
					
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
					<s:select list="configPublicCharBySpecialitys" 
					 listKey="attributeName" listValue="attributeName"         
					headerKey="0" headerValue="请你选择" 	 name="humanFile.humanSpeciality"
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
					headerKey="0" headerValue="请你选择" 	 name="humanFile.humanHobby"
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
						<s:textarea  name="humanFile.humanHistroyRecords" rows="4"
							cssClass="TEXTAREA_STYLE1"></s:textarea>
						<!--<textarea name="humanFile.humanHistroyRecords" rows="4"
							class="TEXTAREA_STYLE1"></textarea>
					--></td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						家庭关系信息
					</td>
					<td colspan="7" class="TD_STYLE2">
					<s:textarea  name="humanFile.humanFamilyMembership" rows="4"
							cssClass="TEXTAREA_STYLE1"></s:textarea>
						<!--<textarea name="humanFile.humanFamilyMembership" rows="4"
							class="TEXTAREA_STYLE1"></textarea>
					--></td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
					<s:textarea  name="humanFile.remark" rows="4"
							cssClass="TEXTAREA_STYLE1"></s:textarea>
						<!--<textarea name="remark" rows="4" class="TEXTAREA_STYLE1"></textarea>
					--></td>
				</tr>
			</table>
					<!--<td class="TD_STYLE1">
						职称
					</td>
					<td colspan="2" class="TD_STYLE2">
						<select class="SELECT_STYLE1">
							<option>经理</option>
							<option>经理</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						<input type="text" id="humanName" name="humanFile.humanName" value="谢鹏"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<select class="SELECT_STYLE1">
							<option>男</option>
							<option>女</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanFile.humanEmail" value="569065574@qq.com"
							class="INPUT_STYLE2" id="humanEmail">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanTelephone" value="0731-1111111"
							class="INPUT_STYLE2" id="humanTelephone">
					</td>
					<td class="TD_STYLE1">
						QQ
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanQq" value="569065574"
							class="INPUT_STYLE2" id="humanQq">
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanFile.humanMobilephone" id="humanMobilephone"
							value="13838383838" class="INPUT_STYLE2">
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
						<select name="humanFile.humanNationality" class="SELECT_STYLE1">
							<option>中国</option>
							<option>美国</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanBirthplace" value="湖南"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" class="TD_STYLE2">
						<input type="text" name="humanFile.humanBirthday" readonly="readonly"
							value="1993-12-08" class="INPUT_STYLE2" id="birthday">
					</td>
					<td width="10%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanRace" class="SELECT_STYLE1">
							<option>汉族</option>
							<option>回族</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						宗教信仰
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanReligion" class="SELECT_STYLE1">
							<option>无</option>
							<option>佛教</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanParty" class="SELECT_STYLE1">
							<option>群众</option>
							<option>党员</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanIdCard" id="humanIdCard"
							value="111111111111111111" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						社会保障号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanSocietySecurityId" value="4353423"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanAge" value="19"
							class="INPUT_STYLE2" id="humanAge">
					</td>
					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanEducatedDegree" class="SELECT_STYLE1">
							<option>高中</option>
							<option>本科</option>
							<option>大专</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanEducatedYears" class="SELECT_STYLE1">
							<option>12</option>
							<option>16</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanEducatedMajor" class="SELECT_STYLE1">
							<option>生物工程</option>
							<option>计算机</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						薪酬标准
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.salaryStandardId" class="SELECT_STYLE1">
							<option>薪酬标准1</option>
							<option>薪酬标准2</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						开户行
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanBank" value="建设银行"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						帐号
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanAccount"
							value="6227002951240189402" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						复核人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.checker" value="谢鹏"
							readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						复核时间
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.checkTime"
							id="create_time" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanSpeciality" class="SELECT_STYLE1">
							<option>java</option>
							<option>数据库</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanHobby" class="SELECT_STYLE1">
							<option>篮球</option>
							<option>跳舞</option>
						</select>
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
						<textarea name="humanFile.humanHistroyRecords" rows="4"
							class="TEXTAREA_STYLE1">上岛咖啡</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						家庭关系信息
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanFile.humanFamilyMembership" rows="4"
							class="TEXTAREA_STYLE1">你猜</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanFile.remark" rows="4" class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
			</table>
		--></form>
	</body>
</html>
