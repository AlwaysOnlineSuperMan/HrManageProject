package com.hr.action;


import com.hr.biz.imp.IConfigPublicCharService;
import com.hr.biz.imp.ISalaryStandardService;

import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import com.hr.entity.ConfigPublicChar;
import com.hr.entity.SalaryStandard;
import com.hr.entity.SalaryStandardDetails;
import com.hr.entity.SalaryStandardWithBLOBs;
import com.hr.entity.Users;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class SalaryStandardAction extends ActionSupport implements ModelDriven<Users>{
	private Users users;
	private IConfigPublicCharService charService;
	private ISalaryStandardService iSalaryStandardService; 
	private long Mytime;
	private SalaryStandardWithBLOBs salaryStandardWithBLOBs;
	private List<SalaryStandardWithBLOBs> salaryStandardWithBLOBlists;
	private List<ConfigPublicChar> configPublicChars;
	private List<SalaryStandardDetails> salaryStandardDetails;
	private List<SalaryStandard> salaryStandards;
	private SalaryStandard salaryStandard;
	
	
	
	
	public SalaryStandard getSalaryStandard() {
		return salaryStandard;
	}

	public void setSalaryStandard(SalaryStandard salaryStandard) {
		this.salaryStandard = salaryStandard;
	}

	public List<SalaryStandard> getSalaryStandards() {
		return salaryStandards;
	}

	public void setSalaryStandards(List<SalaryStandard> salaryStandards) {
		this.salaryStandards = salaryStandards;
	}

	public List<SalaryStandardWithBLOBs> getSalaryStandardWithBLOBlists() {
		return salaryStandardWithBLOBlists;
	}

	public void setSalaryStandardWithBLOBlists(
			List<SalaryStandardWithBLOBs> salaryStandardWithBLOBlists) {
		this.salaryStandardWithBLOBlists = salaryStandardWithBLOBlists;
	}

	public SalaryStandardWithBLOBs getSalaryStandardWithBLOBs() {
		return salaryStandardWithBLOBs;
	}

	public void setSalaryStandardWithBLOBs(
			SalaryStandardWithBLOBs salaryStandardWithBLOBs) {
		this.salaryStandardWithBLOBs = salaryStandardWithBLOBs;
	}
	
	public List<SalaryStandardDetails> getSalaryStandardDetails() {
		return salaryStandardDetails;
	}

	public void setSalaryStandardDetails(
			List<SalaryStandardDetails> salaryStandardDetails) {
		this.salaryStandardDetails = salaryStandardDetails;
	}

	public long getMytime() {
		return Mytime;
	}

	public void setMytime(long mytime) {
		Mytime = mytime;
	}
	
	public IConfigPublicCharService getCharService() {
		return charService;
	}

	public void setCharService(IConfigPublicCharService charService) {
		this.charService = charService;
	}

	public Users getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public List<ConfigPublicChar> getConfigPublicChars() {
		return configPublicChars;
	}

	public void setConfigPublicChars(List<ConfigPublicChar> configPublicChars) {
		this.configPublicChars = configPublicChars;
	} 
	
	

	public ISalaryStandardService getiSalaryStandardService() {
		return iSalaryStandardService;
	}

	public void setiSalaryStandardService(
			ISalaryStandardService iSalaryStandardService) {
		this.iSalaryStandardService = iSalaryStandardService;
	}
	//点击薪酬标准登记时，自动生成标准编号 在公共字段表中查找出薪酬设置的数据
	public  String  getIntoStandardRegister() throws Exception{
	
		configPublicChars = charService.getConfigPublicCharByAttributeKind("薪酬设置");
	
		Mytime = System.currentTimeMillis();
		return "doSalarystandard_register";
	}
	//在 薪酬标准登记界面中 点击提交 将数据添加至数据库中 
	public  String  addStandard() throws Exception{
		//设置复核状态为1
		Short check = 1;
		salaryStandardWithBLOBs.setCheckStatus(check);
		//把详细信息从页面接收
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
		List<ConfigPublicChar> listss=charService.getConfigPublicCharByAttributeKind("薪酬设置");
		
		List<SalaryStandardDetails> list = new ArrayList<SalaryStandardDetails>();
		for (int i = 1; i <= listss.size(); i++) {
			SalaryStandardDetails details = new SalaryStandardDetails();
			String detailname = request.getParameter("detail"+i);
			
			Float  detailsalary = Float.parseFloat( request.getParameter("salary"+i));
			
			Short detailId = Short.parseShort(request.getParameter("pbcId"+i)) ;
			details.setItemId(detailId);
			details.setItemName(detailname);
			details.setSalary(detailsalary);
			details.setStandardId(salaryStandardWithBLOBs.getStandardId());
			details.setStandardName(salaryStandardWithBLOBs.getStandardName());
			list.add(details);
		}
		iSalaryStandardService.addIntoStandardRegister(salaryStandardWithBLOBs,list);
		return "addSalarystandard_register";		
	}
	//查询复核状态为未通过（checkstatus=1）的标准信息
	public String getStandardBycheckstatus() throws Exception{
			Short check = 1;
			salaryStandardWithBLOBlists = iSalaryStandardService.getStandardBycheckstatus(check);
		return "getStandardBycheckstatus";
	}
	//通过ssid查询标准信息
	public String getStandardByssdId() throws Exception{
		Short sid = salaryStandardWithBLOBs.getSsdId();
		salaryStandardWithBLOBs = iSalaryStandardService.getStandardByssdId(sid);
		salaryStandardDetails = iSalaryStandardService.getStandardBystandardId(salaryStandardWithBLOBs.getStandardId());
		return "getStandardByssdId";
	}
	//在复核界面点击
	public String updateStandard() throws Exception{
		
		
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
		salaryStandardDetails = iSalaryStandardService.getStandardBystandardId(salaryStandardWithBLOBs.getStandardId());
		
		List<SalaryStandardDetails> list = new ArrayList<SalaryStandardDetails>();
		for (int i = 1; i <= salaryStandardDetails.size(); i++) {
			SalaryStandardDetails details = new SalaryStandardDetails();
			String detailname = request.getParameter("itemName"+i);
			Float  detailsalary = Float.parseFloat( request.getParameter("salary"+i));
			
			Short detailId = Short.parseShort(request.getParameter("itemId"+i)) ;
			details.setItemId(detailId);
			details.setItemName(detailname);
			details.setSalary(detailsalary);
			details.setStandardId(salaryStandardWithBLOBs.getStandardId());
			details.setStandardName(salaryStandardWithBLOBs.getStandardName());
			list.add(details);
		}
			Short check = 2;
			salaryStandardWithBLOBs.setCheckStatus(check);
			iSalaryStandardService.updateStandard(salaryStandardWithBLOBs,list);
		return "updateStandard";
	}
	//点击薪酬标准查询界面中的查询    根据查询条件进行数据查找
	public String getBycondition()throws Exception{
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
		String Id = request.getParameter("Id");
		String Name = request.getParameter("Name");
		String startTime = request.getParameter("startDate");
		System.out.println(Name);
		String endTime =  request.getParameter("endDate");
		if(Id == "" && Name == "" && startTime =="" && endTime == ""){
			salaryStandards = iSalaryStandardService.getSalartStandardBycheckList();
		}
		if(Id != "" && Name == "" && startTime =="" && endTime == ""){
			salaryStandards = iSalaryStandardService.getBystandardId(Id);
		}
		if(Id == "" && Name != "" && startTime !="" || endTime != ""){
			salaryStandards = iSalaryStandardService.getBystandardName(Name);
		}
		if(Id == "" && Name == "" && startTime !="" || endTime != ""){
			salaryStandards = iSalaryStandardService.getSalaryStandardList();
		}
		return "getBycondition";
	}
	//在薪酬标准登记查询中 点击标准单号 查询单条详细信息ss
	public String getStandardByStandardId() throws Exception{
		String standardId = salaryStandard.getStandardId();
		
		salaryStandardDetails = iSalaryStandardService.getStandardBystandardId(standardId);
		salaryStandardWithBLOBs = iSalaryStandardService.getBystandardId2(standardId);
		System.out.println(salaryStandardWithBLOBs.getStandardName());
		System.out.println(salaryStandardDetails.size());
		return "getStandardByStandardId";		
	}
}
