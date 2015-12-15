<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
		<link rel="stylesheet" href="/hrManageProject/css/table.css" type="text/css"/>
		<script type="text/javascript" src="/hrManageProject/js/pageModel.js"></script>
	</head>
	<body>
		<form method="post" action="humanFile!toCheckList.action">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案登记复核 </font>
					</td>
				</tr>
				<tr>
					<td>
						当前等待复核的人力资源档案总数： 2 例
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=5 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr class="TR_STYLE1" bgColor="#ffff80"   >														
					<td width="13%" class="TD_STYLE1">
						档案编号
					</td>
					<td width="13%" class="TD_STYLE1">
						姓名
					</td>
					<td width="11%" class="TD_STYLE1">
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
						职称
					</td>
					<td width="7%" class="TD_STYLE1">
						复核
					</td>
				</tr>
				
				

				
				
				
		
				<s:if test="pageModel.resultList.isEmpty==false">
   							
				<s:iterator var="user" value="pageModel.resultList" status="vs">
				
					<s:if test="#vs.odd==true">																																				
   					
   						   			
				<tr>
					<td class="TD_STYLE2">
						<s:property value="humanId"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="humanName"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="humanSex"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="firstKindName"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="secondKindName"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="thirdKindName"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="hunmaMajorName"/>
					</td>
					<td class="TD_STYLE2">
						<a href="humanFile!toHumanCheck.action?humanFile.humanId=${humanId }">复核</a>
					</td>
				</tr>
   					
   					
   																																							
   				</s:if>	
   				<s:else>	
   				
   				
   																																							
				   			
				<tr>
					<td class="TD_STYLE2">
						<s:property value="humanId"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="humanName"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="humanSex"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="firstKindName"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="secondKindName"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="thirdKindName"/>
					</td>
					<td class="TD_STYLE2">
						<s:property value="hunmaMajorName"/>
					</td>
					<td class="TD_STYLE2">
						<a href="humanFile!toHumanCheck.action?humanFile.humanId=${humanId }">复核</a>
					</td>
				</tr>
				
				
				   		
				   		
				   																																				
				   	</s:else>	
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
