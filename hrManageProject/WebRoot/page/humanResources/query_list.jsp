<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
		
			<SCRIPT type="text/javascript" src="/hrManageProject/javascript/jquery-1.7.2.js"></SCRIPT>
			<SCRIPT type="text/javascript" src="/hrManageProject/javascript/locate.js"></SCRIPT>
			<script type="text/javascript" src="/hrManageProject/js/pageModel.js"></script>
		
	</head>
	

	<body>
		<form action="humanFile!toQueryList.action" method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案查询 </font>
					</td>
				</tr>
				<tr>
					<td>
						符合条件的人力资源档案总数：14例
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
					headerKey="" headerValue="全部" 	 name="humanFile.firstKindId"
					id="firstKind" cssClass="SELECT_STYLE1"
					/>																																									
				
					</td>
					<td width="11%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE2">
					
					<s:select list="configFileSecondKinds" label="province" 
					 listKey="secondKindId" listValue="secondKindName"  
					headerKey="" headerValue="全部" 	 name="humanFile.secondKindId"
					id="secondKind" cssClass="SELECT_STYLE1"
					/>																																									
				
						
						
						
					</td>
					<td width="11%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2" colspan="2">
					
					<s:select list="configFileThirdKinds" label="province" 
					 listKey="thirdKindId" listValue="thirdKindName"  
					headerKey="" headerValue="全部" 	 name="humanFile.thirdKindId"
					id="thirdKind" cssClass="SELECT_STYLE1"
					/>	
					
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
					headerKey="" headerValue="全部" 	 name="humanMajorKindId"
					id="majorKind" cssClass="SELECT_STYLE1"
					/>	
						
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
						
						
						<s:select list="configMajors" 
					 listKey="majorId" listValue="majorName"         
					headerKey="" headerValue="全部" 	 name="humanFile.humanMajorId"
					id="majorName" cssClass="SELECT_STYLE1"
					/>
					</td>
					<td class="TD_STYLE1">
						请输入建档时间
					</td>
					<td width="84%" class="TD_STYLE2">
						
							<s:textfield  name="utilBean.startDate" 
							cssStyle="width: 14%" cssClass="INPUT_STYLE2" id="date_start" ></s:textfield>
						至
						<s:textfield  name="utilBean.endDate" 
							cssStyle="width: 14%" cssClass="INPUT_STYLE2" id="date_end" ></s:textfield>
					
						<!--<input type="hidden" name="utilBean.datePropertyName" value="registTime"/>
						--><s:submit value="查询"></s:submit>
					</td>
				</tr>
				</table>
				
				
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			<table width="100%" border="1" cellpadding=5 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">
						档案编号
					</td>
					<td width="13%" class="TD_STYLE1">
						姓名
					</td>
					<td width="8%" class="TD_STYLE1">
						性别
					</td>
					<td width="14%" class="TD_STYLE1">
						I级机构
					</td>
					<td width="14%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE1">
						III级机构
					</td>
					<td width="14%" class="TD_STYLE1">
						职位分类
					</td>
					<td width="7%" class="TD_STYLE1">
						职位名称
					</td>
				</tr>
				
				
				<s:if test="pageModel.resultList.isEmpty==false">
   							
				<s:iterator var="user" value="pageModel.resultList" status="vs">
				
   					
   						   			
						
				
				
				
				
					<tr class="TR_STYLE2">
						<td width="16%" class="TD_STYLE2">
							<a href="humanFile!toQueryListInformation.action?humanFile.humanId=${humanId }">
							<s:property value="humanId"/></a>
						</td>
						<td width="13%" class="TD_STYLE2">
							<s:property value="humanName"/>
						</td>
						<td width="8%" class="TD_STYLE2">
							<s:property value="humanSex"/>
						</td>
						<td width="14%" class="TD_STYLE2">
							<s:property value="firstKindName"/>
						</td>
						<td width="14%" class="TD_STYLE2">
							<s:property value="secondKindName"/>
						</td>
						<td width="14%" class="TD_STYLE2">
							<s:property value="thirdKindName"/>
						</td>
						<td width="14%" class="TD_STYLE2">
							<s:property value="humanMajorKindName"/>
						</td>
						<td width="7%" class="TD_STYLE2">
							<s:property value="humanMajorName"/>
						</td>
					</tr>
				
				
				
				
				
				</s:iterator>
				</s:if>
				
				
				
				
			</table>
					  <div align="center">
	共${pageModel.allRecord}条记录 
	每页
	<s:textfield name="pageModel.maxRecord" size="2" onchange="change()"> </s:textfield>条
	第${pageModel.currPage}页/共${pageModel.allPage}页
						<c:if test="${pageModel.currPage<=1}">
							<input type="button" value="已是首页" disabled="disabled"/>
							<input type="button" value=" 上一页 " disabled="disabled"/>
						</c:if>
						<c:if test="${pageModel.currPage >1 }">
							<input type="button" value=" 首页  " onclick="pageMode(${pageModel.fristPageNo})"/>
							<input type="button" value="上一页" onclick="pageMode(${pageModel.previosPageNo})"/>
						</c:if>
						<c:if test="${pageModel.currPage >= pageModel.allPage}">
							<input type="button" value="下一页" disabled="disabled"/>
							<input type="button" value=" 已是尾页  " disabled="disabled"/>
						</c:if>
						<c:if test="${pageModel.currPage < pageModel.allPage}"  >
							<input type="button" value="下一页" onclick="pageMode(${pageModel.nextPageNo})" />
							<input type="button" value=" 尾页    " onclick="pageMode(${pageModel.bottomPageNo})" />
						</c:if>
	转到
		<s:textfield name="pageModel.currPage"  size="2" id="currPage"> </s:textfield>页
	<button width="20" onclick="submit()">GO</button>
	
</div>
</form>
	</body>
</html>
